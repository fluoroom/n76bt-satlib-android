package com.n76btlink

import android.app.NotificationChannel
import android.app.NotificationManager
import android.app.PendingIntent
import android.app.Service
import android.content.Intent
import android.os.Build
import android.os.IBinder
import androidx.core.app.NotificationCompat
import java.util.Timer
import java.util.TimerTask

/**
 * Foreground service that bridges Look4Sat rigctld → N76 Bluetooth.
 *
 * Lifecycle:
 *   Start: ACTION_START with EXTRA_MAC and config extras
 *   Stop:  ACTION_STOP  (or stopSelf via notification)
 *
 * Every 500ms it reads the latest RX/TX frequencies from the rigctld server
 * and sends two GAIA packets to the N76: FREQ_MODE_SET_PAR and (optionally)
 * SET_SATELLITE_INFO — matching the timing and packet sequence of the original app.
 */
class BridgeService : Service() {

    private val rigctld = RigctldServer()
    private val bt = N76Bluetooth()
    private var timer: Timer? = null

    private var satName = "SAT"
    private var altitudeKm = 400
    private var rxSubtone = 0
    private var txSubtone = 0
    private var satFirmware = true
    private var sendSatInfo = true

    override fun onBind(intent: Intent?): IBinder? = null

    override fun onCreate() {
        super.onCreate()
        createNotificationChannel()
        rigctld.onLog = { broadcastLog("rigctld: $it") }
        bt.onLog     = { broadcastLog("bt: $it") }
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        when (intent?.action) {
            ACTION_START -> {
                val mac = intent.getStringExtra(EXTRA_MAC) ?: return START_NOT_STICKY
                satName     = intent.getStringExtra(EXTRA_SAT_NAME) ?: "SAT"
                altitudeKm  = intent.getIntExtra(EXTRA_ALTITUDE, 400)
                rxSubtone   = intent.getIntExtra(EXTRA_RX_SUBTONE, 0)
                txSubtone   = intent.getIntExtra(EXTRA_TX_SUBTONE, 0)
                satFirmware = intent.getBooleanExtra(EXTRA_SAT_FW, true)
                sendSatInfo = intent.getBooleanExtra(EXTRA_SEND_SAT_INFO, true)

                startForeground(NOTIF_ID, buildNotification())
                stopLoop()
                rigctld.start()
                bt.connect(mac)
                startLoop()
                broadcastLog("Bridge started (sat fw=$satFirmware, satInfo=$sendSatInfo)")
            }
            ACTION_STOP -> stopSelf()
        }
        return START_NOT_STICKY
    }

    override fun onDestroy() {
        stopLoop()
        rigctld.stop()
        bt.disconnect()
        super.onDestroy()
    }

    private fun startLoop() {
        val t = Timer("bt-loop", true)
        timer = t
        t.scheduleAtFixedRate(object : TimerTask() {
            override fun run() { sendBtPackets() }
        }, 500L, 500L)
    }

    private fun stopLoop() {
        timer?.cancel()
        timer = null
    }

    private fun sendBtPackets() {
        if (!bt.isConnected) return
        val rx = rigctld.rxFreqHz.get()
        val tx = rigctld.txFreqHz.get()
        bt.send(N76Protocol.freqModePacket(rx, tx, rxSubtone, txSubtone, satFirmware))
        if (sendSatInfo) {
            bt.send(N76Protocol.satInfoPacket(
                satName,
                rigctld.azimuthDeg.get(),
                rigctld.elevationDeg.get(),
                0, altitudeKm, 65535
            ))
        }
    }

    private fun broadcastLog(msg: String) {
        sendBroadcast(Intent(ACTION_LOG).putExtra(EXTRA_LOG_MSG, msg))
    }

    private fun createNotificationChannel() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            val ch = NotificationChannel(
                CHANNEL_ID, "N76 BT Link", NotificationManager.IMPORTANCE_LOW
            )
            getSystemService(NotificationManager::class.java)?.createNotificationChannel(ch)
        }
    }

    private fun buildNotification() = NotificationCompat.Builder(this, CHANNEL_ID)
        .setContentTitle("N76 BT Link")
        .setContentText("Bridging Look4Sat → N76 (500 ms)")
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
        const val ACTION_START          = "com.n76btlink.START"
        const val ACTION_STOP           = "com.n76btlink.STOP"
        const val ACTION_LOG            = "com.n76btlink.LOG"
        const val EXTRA_MAC             = "mac"
        const val EXTRA_SAT_NAME        = "sat_name"
        const val EXTRA_ALTITUDE        = "altitude"
        const val EXTRA_RX_SUBTONE      = "rx_sub"
        const val EXTRA_TX_SUBTONE      = "tx_sub"
        const val EXTRA_SAT_FW          = "sat_fw"
        const val EXTRA_SEND_SAT_INFO   = "send_sat_info"
        const val EXTRA_LOG_MSG         = "log_msg"
        const val CHANNEL_ID            = "n76btlink"
        const val NOTIF_ID              = 1
    }
}
