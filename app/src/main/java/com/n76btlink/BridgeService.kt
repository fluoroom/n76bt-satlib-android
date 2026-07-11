package com.n76btlink

import android.app.NotificationChannel
import android.app.NotificationManager
import android.app.PendingIntent
import android.app.Service
import android.content.Intent
import android.net.Uri
import android.os.Build
import android.os.Handler
import android.os.IBinder
import android.os.Looper
import android.util.Log
import androidx.core.app.NotificationCompat
import java.io.File
import java.util.concurrent.Executors
import java.util.concurrent.ScheduledExecutorService
import java.util.concurrent.TimeUnit
import kotlin.math.roundToInt

private const val TAG = "N76BT"

class BridgeService : Service() {

    private val bt = N76Bluetooth()
    private val mainHandler = Handler(Looper.getMainLooper())
    private var satlibClient: SatlibClient? = null
    private var executor: ScheduledExecutorService? = null

    private var pollIntervalMs = 1000L
    private var sendSatInfo    = true
    private var forceRxTone    = -1  // -1=use satlib; 0=none; >0=subtone value (Hz×100)
    private var forceTxTone    = -1
    private var audioRfcomm    = false

    @Volatile private var satelliteActive = false
    @Volatile private var currentSatName  = ""

    // Audio state
    private var n76Mac = ""
    private var hmLinkAudio: HmLinkAudioReceiver? = null
    @Volatile private var bssWritten = false
    @Volatile private var originalBssBlob: ByteArray? = null
    @Volatile private var audioRecorder: AudioRecorder? = null    // mic-only or HT-only
    @Volatile private var audioRecorderHt: AudioRecorder? = null  // HT track when recording both
    @Volatile private var audioMonitorOn = false

    // Auto-record state (for recordSatOnly mode)
    private var recordSatOnly  = false
    private var recordSatHt    = false
    private var recordSatInput = false
    private var recordSatDevId = 0
    private var outputFolderUri: Uri? = null

    override fun onBind(intent: Intent?): IBinder? = null

    override fun onCreate() {
        super.onCreate()
        createNotificationChannel()
        bt.onLog = { broadcastLog("bt: $it") }
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        when (intent?.action) {
            ACTION_START -> {
                val mac  = intent.getStringExtra(EXTRA_MAC) ?: return START_NOT_STICKY
                val host = intent.getStringExtra(EXTRA_HOST) ?: "127.0.0.1"
                val port = intent.getIntExtra(EXTRA_PORT, 4534)
                pollIntervalMs = intent.getLongExtra(EXTRA_POLL_MS, 1000L)
                sendSatInfo    = intent.getBooleanExtra(EXTRA_SEND_SAT_INFO, true)
                forceRxTone    = intent.getIntExtra(EXTRA_FORCE_RX_TONE, -1)
                forceTxTone    = intent.getIntExtra(EXTRA_FORCE_TX_TONE, -1)
                audioRfcomm    = intent.getBooleanExtra(EXTRA_AUDIO_SCO, false)
                recordSatOnly   = intent.getBooleanExtra(EXTRA_RECORD_SAT_ONLY, false)
                recordSatHt     = intent.getBooleanExtra(EXTRA_RECORD_HT, false)
                recordSatInput  = intent.getBooleanExtra(EXTRA_RECORD_INPUT, false)
                recordSatDevId  = intent.getIntExtra(EXTRA_INPUT_DEVICE_ID, 0)
                outputFolderUri = intent.getStringExtra(EXTRA_OUTPUT_FOLDER)?.let { Uri.parse(it) }

                startForeground(NOTIF_ID, buildNotification(host, port))
                stopLoop()
                teardownAudio()
                satelliteActive = false
                currentSatName  = ""
                n76Mac          = mac

                satlibClient = SatlibClient(host, port)

                bt.onConnected = { onBtConnected() }
                bt.onPacket    = { pkt -> handleGaiaPacket(pkt) }
                bt.connect(mac)
                startLoop()
                broadcastLog("Polling satlib $host:$port every ${pollIntervalMs}ms")
            }
            ACTION_STOP -> stopSelf()
            ACTION_RECORD_START -> {
                val recHt  = intent.getBooleanExtra(EXTRA_RECORD_HT, false)
                val recIn  = intent.getBooleanExtra(EXTRA_RECORD_INPUT, false)
                val devId  = intent.getIntExtra(EXTRA_INPUT_DEVICE_ID, 0)
                val folderUri = intent.getStringExtra(EXTRA_OUTPUT_FOLDER)?.let { Uri.parse(it) }
                broadcastLog("rec: recording started")
                startRecording(recHt, recIn, devId, currentSatName, folderUri)
            }
            ACTION_RECORD_STOP -> stopRecording()
            ACTION_PTT_DOWN -> {
                if (bt.isConnected) bt.send(N76Protocol.pttAssert())
                else broadcastLog("ptt: BT not connected")
            }
            ACTION_PTT_UP -> {
                if (bt.isConnected) bt.send(N76Protocol.pttRelease())
            }
            ACTION_AUDIO_MONITOR -> {
                val on = intent.getBooleanExtra(EXTRA_MONITOR_ON, false)
                audioMonitorOn = on
                hmLinkAudio?.monitorEnabled = on
                broadcastLog("audio: speaker monitor ${if (on) "ON" else "OFF"}")
            }
        }
        return START_NOT_STICKY
    }

    override fun onDestroy() {
        stopLoop()
        teardownAudio()
        bt.disconnect()
        satlibClient = null
        super.onDestroy()
    }

    // ── BT connection event ───────────────────────────────────────────────────

    private fun onBtConnected() {
        if (!audioRfcomm) return
        bt.send(N76Protocol.buildPacket(N76Protocol.CMD_READ_BSS_SETTINGS, byteArrayOf()))
        broadcastLog("audio: requesting BSS to enable audio_relay_en…")
        startHmLinkAudio()
        mainHandler.postDelayed({
            if (!bssWritten) broadcastLog("audio: BSS ACK not received within 5 s")
        }, 5000L)
    }

    // ── GAIA packet handler — only used for BSS ACK ──────────────────────────

    private fun handleGaiaPacket(pkt: ByteArray) {
        if (pkt.size < 9) return
        val cmdWord = ((pkt[6].toInt() and 0xFF) shl 8) or (pkt[7].toInt() and 0xFF)
        val isAck   = (cmdWord and 0x8000) != 0
        val baseCmd = cmdWord and 0x7FFF
        val plen    = pkt[3].toInt() and 0xFF

        if (isAck && baseCmd == N76Protocol.CMD_READ_BSS_SETTINGS && !bssWritten) {
            if (plen < 2 || pkt.size < 9 + plen - 1) return
            val blob = pkt.copyOfRange(9, 8 + plen)
            mainHandler.removeCallbacksAndMessages(null)
            enableAudioRelay(blob)
        }
    }

    // ── BSS: set audio_relay_en (bit 17 = byte 2, bit 1) ────────────────────

    private fun enableAudioRelay(blob: ByteArray) {
        if (blob.isEmpty()) {
            broadcastLog("audio: BSS blob empty, cannot set audio_relay_en")
            return
        }
        val relayAlreadyOn = (blob[2].toInt() ushr 1) and 1
        if (relayAlreadyOn == 1) {
            broadcastLog("audio: audio_relay_en already set — no BSS write needed")
            bssWritten = true
            return
        }
        originalBssBlob = blob.copyOf()
        val mod = blob.copyOf()
        mod[2] = (mod[2].toInt() or 0x02).toByte()
        bt.send(N76Protocol.buildPacket(N76Protocol.CMD_WRITE_BSS_SETTINGS, mod))
        bssWritten = true
        broadcastLog("audio: BSS written — audio_relay_en=1 (was 0)")
    }

    private fun startRecording(recordHt: Boolean, recordInput: Boolean, deviceId: Int,
                               satName: String = "", safDirUri: Uri? = null) {
        if (recordHt && hmLinkAudio == null)
            broadcastLog("rec: WARNING — HT audio channel not active (enable Receive RX audio first)")
        audioRecorder?.stop(); audioRecorder = null
        audioRecorderHt?.stop(); audioRecorderHt = null
        hmLinkAudio?.onPcmShorts = null

        when {
            recordHt && recordInput -> {
                val htRec  = AudioRecorder(this).apply { onLog = { broadcastLog(it) } }
                val micRec = AudioRecorder(this).apply { onLog = { broadcastLog(it) } }
                audioRecorderHt = htRec
                audioRecorder = micRec
                hmLinkAudio?.onPcmShorts = { shorts, n -> htRec.feedHtShorts(shorts, n) }
                htRec.start(recordHt = true, recordInput = false, inputDeviceId = 0,
                    satName = satName, safDirUri = safDirUri, fileSuffix = "ht")
                micRec.start(recordHt = false, recordInput = true, inputDeviceId = deviceId,
                    satName = satName, safDirUri = safDirUri, fileSuffix = "mic")
                broadcastLog("rec: two tracks — HT + phone mic")
            }
            recordHt -> {
                val rec = AudioRecorder(this).apply { onLog = { broadcastLog(it) } }
                audioRecorder = rec
                hmLinkAudio?.onPcmShorts = { shorts, n -> rec.feedHtShorts(shorts, n) }
                rec.start(recordHt = true, recordInput = false, inputDeviceId = 0,
                    satName = satName, safDirUri = safDirUri, fileSuffix = "ht")
                broadcastLog("rec: HT audio track")
            }
            recordInput -> {
                val rec = AudioRecorder(this).apply { onLog = { broadcastLog(it) } }
                audioRecorder = rec
                rec.start(recordHt = false, recordInput = true, inputDeviceId = deviceId,
                    satName = satName, safDirUri = safDirUri, fileSuffix = "mic")
                broadcastLog("rec: phone mic track")
            }
        }
    }

    private fun stopRecording() {
        audioRecorder?.stop(); audioRecorder = null
        audioRecorderHt?.stop(); audioRecorderHt = null
        hmLinkAudio?.onPcmShorts = null
    }

    private fun startHmLinkAudio() {
        hmLinkAudio?.stop()
        hmLinkAudio = HmLinkAudioReceiver(n76Mac).apply {
            onLog = { broadcastLog(it) }
            monitorEnabled = audioMonitorOn
            onPcmShorts = { shorts, n ->
                // Feed to dedicated HT recorder if present, otherwise to the single recorder
                (audioRecorderHt ?: audioRecorder)?.feedHtShorts(shorts, n)
            }
            start()
        }
    }

    private fun teardownAudio() {
        mainHandler.removeCallbacksAndMessages(null)
        hmLinkAudio?.stop()
        hmLinkAudio = null
        audioRecorder?.stop(); audioRecorder = null
        audioRecorderHt?.stop(); audioRecorderHt = null
        val orig = originalBssBlob
        if (orig != null && bt.isConnected) {
            broadcastLog("audio: restoring original BSS audio_relay_en")
            bt.send(N76Protocol.buildPacket(N76Protocol.CMD_WRITE_BSS_SETTINGS, orig))
        }
        originalBssBlob = null
        bssWritten = false
    }

    // ── Satellite polling loop ────────────────────────────────────────────────

    private fun startLoop() {
        executor = Executors.newSingleThreadScheduledExecutor()
        executor!!.scheduleWithFixedDelay(
            { sendBtPackets() }, 0L, pollIntervalMs, TimeUnit.MILLISECONDS
        )
    }

    private fun stopLoop() {
        executor?.shutdownNow()
        executor = null
    }

    private fun sendBtPackets() {
        if (!bt.isConnected) {
            broadcastLog("bt: not connected")
            return
        }

        // When satellite info sending is disabled, skip polling entirely (audio-only mode)
        if (!sendSatInfo) return

        val client = satlibClient ?: return

        val data = try {
            client.poll()
        } catch (e: Exception) {
            broadcastLog("satlib error: ${e.javaClass.simpleName}: ${e.message}")
            exitSatModeIfActive()
            return
        }

        broadcastLog("satlib json: ${data.rawJson.take(300)}")

        if (data.isIdle) {
            broadcastLog("satlib: idle")
            exitSatModeIfActive()
            return
        }

        val rxHz = data.rxFrequencyHz ?: 0L
        val txHz = data.txFrequencyHz ?: 0L

        if (!isValidSatFreq(rxHz) || !isValidSatFreq(txHz)) {
            broadcastLog("satlib: freq out of range rx=${rxHz/1_000_000.0} tx=${txHz/1_000_000.0} MHz, ignoring")
            exitSatModeIfActive()
            return
        }

        val rxSub = if (forceRxTone >= 0) forceRxTone else ctcssToSubtone(data.ctcssRxToneHz)
        val txSub = if (forceTxTone >= 0) forceTxTone else ctcssToSubtone(data.ctcssTxToneHz)

        broadcastLog("→ rx=${rxHz/1_000_000.0}MHz tx=${txHz/1_000_000.0}MHz rxTone=$rxSub txTone=$txSub")

        val wasActive = satelliteActive
        currentSatName = data.satName
        satelliteActive = true

        if (!wasActive) {
            broadcastLog("sat: mode ON — ${data.satName}")
            if (recordSatOnly) {
                broadcastLog("rec: auto-start — satellite track began")
                startRecording(recordSatHt, recordSatInput, recordSatDevId, currentSatName, outputFolderUri)
            }
        }

        val nowMs = System.currentTimeMillis()
        val aosSec = if (data.aosTime > 0)
            ((data.aosTime - nowMs) / 1000L).toInt().coerceIn(0, 65534)
        else 65535
        bt.send(N76Protocol.satInfoPacket(
            name = data.satName,
            az   = data.azimuthDeg.toInt(),
            el   = data.elevationDeg.toInt(),
            dist = data.distanceKm.toInt(),
            alt  = data.altitudeKm.toInt(),
            aos  = aosSec
        ))

        bt.send(N76Protocol.freqModePacket(rxHz, txHz, rxSub, txSub, satFw = true))
    }

    private fun isValidSatFreq(hz: Long) = hz == 0L || hz in 136_000_000L..520_000_000L

    private fun exitSatModeIfActive() {
        if (satelliteActive) {
            broadcastLog("sat: mode OFF")
            bt.send(N76Protocol.exitSatModePacket())
            satelliteActive = false
            currentSatName = ""
            if (recordSatOnly) stopRecording()
        }
    }

    private fun ctcssToSubtone(hz: Float?): Int {
        if (hz == null || hz <= 0f) return 0
        return (hz * 100).roundToInt()
    }

    private fun broadcastLog(msg: String) {
        Log.d(TAG, msg)
        sendBroadcast(Intent(ACTION_LOG).putExtra(EXTRA_LOG_MSG, msg))
    }

    private fun createNotificationChannel() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            getSystemService(NotificationManager::class.java)?.createNotificationChannel(
                NotificationChannel(CHANNEL_ID, "N76 BT Link", NotificationManager.IMPORTANCE_LOW)
            )
        }
    }

    private fun buildNotification(host: String, port: Int) =
        NotificationCompat.Builder(this, CHANNEL_ID)
            .setContentTitle("N76 BT Link")
            .setContentText("satlib $host:$port → N76 (${pollIntervalMs}ms)")
            .setSmallIcon(android.R.drawable.stat_sys_data_bluetooth)
            .setOngoing(true)
            .setContentIntent(
                PendingIntent.getActivity(
                    this, 0, Intent(this, MainActivity::class.java),
                    PendingIntent.FLAG_IMMUTABLE
                )
            )
            .addAction(
                android.R.drawable.ic_delete, "Stop",
                PendingIntent.getService(
                    this, 1,
                    Intent(this, BridgeService::class.java).setAction(ACTION_STOP),
                    PendingIntent.FLAG_IMMUTABLE
                )
            )
            .build()

    companion object {
        const val ACTION_START         = "com.n76btlink.START"
        const val ACTION_STOP          = "com.n76btlink.STOP"
        const val ACTION_LOG           = "com.n76btlink.LOG"
        const val ACTION_AUDIO_MONITOR = "com.n76btlink.AUDIO_MONITOR"
        const val ACTION_RECORD_START  = "com.n76btlink.RECORD_START"
        const val ACTION_RECORD_STOP   = "com.n76btlink.RECORD_STOP"
        const val ACTION_PTT_DOWN      = "com.n76btlink.PTT_DOWN"
        const val ACTION_PTT_UP        = "com.n76btlink.PTT_UP"
        const val EXTRA_MONITOR_ON     = "monitor_on"
        const val EXTRA_MAC            = "mac"
        const val EXTRA_HOST           = "host"
        const val EXTRA_PORT           = "port"
        const val EXTRA_POLL_MS        = "poll_ms"
        const val EXTRA_SEND_SAT_INFO  = "send_sat_info"
        const val EXTRA_FORCE_RX_TONE  = "force_rx_tone"   // Int: -1=no override, 0=none, >0=subtone
        const val EXTRA_FORCE_TX_TONE  = "force_tx_tone"
        const val EXTRA_AUDIO_SCO      = "audio_sco"
        const val EXTRA_LOG_MSG        = "log_msg"
        const val EXTRA_RECORD_HT      = "record_ht"
        const val EXTRA_RECORD_INPUT   = "record_input"
        const val EXTRA_INPUT_DEVICE_ID = "input_device_id"
        const val EXTRA_RECORD_SAT_ONLY = "record_sat_only"
        const val EXTRA_OUTPUT_FOLDER  = "output_folder"
        const val CHANNEL_ID           = "n76btlink"
        const val NOTIF_ID             = 1
    }
}
