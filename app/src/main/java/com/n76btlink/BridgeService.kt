package com.n76btlink

import android.app.NotificationChannel
import android.app.NotificationManager
import android.app.PendingIntent
import android.app.Service
import android.content.Intent
import android.os.Build
import android.os.IBinder
import android.util.Log
import androidx.core.app.NotificationCompat
import java.util.concurrent.Executors
import java.util.concurrent.ScheduledExecutorService
import java.util.concurrent.TimeUnit
import kotlin.math.roundToInt

private const val TAG = "N76BT"

class BridgeService : Service() {

    private val bt = N76Bluetooth()
    private var satlibClient: SatlibClient? = null
    private var executor: ScheduledExecutorService? = null

    private var pollIntervalMs  = 1000L
    private var satFirmware     = true
    private var sendSatInfo     = true
    private var forceRxToneNull = false
    private var forceTxToneNull = false

    @Volatile private var satelliteActive = false

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
                pollIntervalMs  = intent.getLongExtra(EXTRA_POLL_MS, 1000L)
                satFirmware     = intent.getBooleanExtra(EXTRA_SAT_FW, true)
                sendSatInfo     = intent.getBooleanExtra(EXTRA_SEND_SAT_INFO, true)
                forceRxToneNull = intent.getBooleanExtra(EXTRA_FORCE_RX_NULL, false)
                forceTxToneNull = intent.getBooleanExtra(EXTRA_FORCE_TX_NULL, false)

                startForeground(NOTIF_ID, buildNotification(host, port))
                stopLoop()
                satelliteActive = false
                satlibClient = SatlibClient(host, port)
                bt.connect(mac)
                startLoop()
                broadcastLog("Polling satlib $host:$port every ${pollIntervalMs}ms")
            }
            ACTION_STOP -> stopSelf()
        }
        return START_NOT_STICKY
    }

    override fun onDestroy() {
        stopLoop()
        bt.disconnect()
        satlibClient = null
        super.onDestroy()
    }

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

        val rxSub = if (forceRxToneNull) 0 else ctcssToSubtone(data.ctcssRxToneHz)
        val txSub = if (forceTxToneNull) 0 else ctcssToSubtone(data.ctcssTxToneHz)

        broadcastLog("→ rx=${rxHz/1_000_000.0}MHz tx=${txHz/1_000_000.0}MHz rxTone=$rxSub txTone=$txSub")

        satelliteActive = true

        if (sendSatInfo) {
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
        }

        bt.send(N76Protocol.freqModePacket(rxHz, txHz, rxSub, txSub, satFirmware))
    }

    private fun isValidSatFreq(hz: Long) = hz == 0L || hz in 136_000_000L..520_000_000L

    private fun exitSatModeIfActive() {
        if (satelliteActive) {
            broadcastLog("bt: exiting satellite mode")
            bt.send(N76Protocol.exitSatModePacket())
            satelliteActive = false
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
        const val ACTION_START        = "com.n76btlink.START"
        const val ACTION_STOP         = "com.n76btlink.STOP"
        const val ACTION_LOG          = "com.n76btlink.LOG"
        const val EXTRA_MAC           = "mac"
        const val EXTRA_HOST          = "host"
        const val EXTRA_PORT          = "port"
        const val EXTRA_POLL_MS       = "poll_ms"
        const val EXTRA_SAT_FW        = "sat_fw"
        const val EXTRA_SEND_SAT_INFO = "send_sat_info"
        const val EXTRA_FORCE_RX_NULL = "force_rx_null"
        const val EXTRA_FORCE_TX_NULL = "force_tx_null"
        const val EXTRA_LOG_MSG       = "log_msg"
        const val CHANNEL_ID          = "n76btlink"
        const val NOTIF_ID            = 1
    }
}
