package com.n76btlink

import android.bluetooth.BluetoothAdapter
import android.bluetooth.BluetoothHeadset
import android.bluetooth.BluetoothProfile
import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import android.media.AudioManager
import android.os.Build

class AudioScoManager(private val context: Context, private val targetMac: String) {

    private val am = context.getSystemService(Context.AUDIO_SERVICE) as AudioManager
    @Suppress("DEPRECATION")
    private val adapter = BluetoothAdapter.getDefaultAdapter()

    private var scoReceiver: BroadcastReceiver? = null
    private var headsetProxy: BluetoothHeadset? = null

    var onStateChange: ((connected: Boolean, msg: String) -> Unit)? = null

    fun start() {
        // Step 1 — inspect HEADSET profile (phone as AG, N76 as HF)
        adapter?.getProfileProxy(context, object : BluetoothProfile.ServiceListener {
            override fun onServiceConnected(profile: Int, proxy: BluetoothProfile) {
                headsetProxy = proxy as BluetoothHeadset
                evaluateAndStart(headsetProxy)
            }
            override fun onServiceDisconnected(profile: Int) {
                headsetProxy = null
            }
        }, BluetoothProfile.HEADSET)
    }

    @Suppress("DEPRECATION")
    private fun evaluateAndStart(headset: BluetoothHeadset?) {
        if (headset == null) {
            report(false, "audio: could not get HEADSET profile proxy")
            return
        }

        val connected = headset.connectedDevices
        report(false, "audio: HEADSET profile has ${connected.size} connected device(s): " +
                connected.joinToString { "${it.name}(${it.address})" }.ifEmpty { "(none)" })

        val n76InHeadset = connected.any { it.address.equals(targetMac, ignoreCase = true) }

        if (!n76InHeadset) {
            report(false,
                "audio: VR-N76 not connected via HEADSET profile — " +
                "open Bluetooth settings → VR-N76 → enable \"Phone calls\" / \"Phone audio\", " +
                "then restart bridge")
            return
        }

        // N76 is acting as HF headset in Android's HEADSET profile — start SCO
        report(false, "audio: VR-N76 found in HEADSET profile, " +
                "isAudioConnected=${headset.isAudioConnected(connected.first { it.address.equals(targetMac, ignoreCase = true) })}")

        if (!am.isBluetoothScoAvailableOffCall) {
            report(false, "audio: isBluetoothScoAvailableOffCall=false — trying anyway")
        }

        val rcv = object : BroadcastReceiver() {
            override fun onReceive(ctx: Context, intent: Intent) {
                val state = intent.getIntExtra(
                    AudioManager.EXTRA_SCO_AUDIO_STATE, AudioManager.SCO_AUDIO_STATE_ERROR
                )
                val connected = state == AudioManager.SCO_AUDIO_STATE_CONNECTED
                val msg = when (state) {
                    AudioManager.SCO_AUDIO_STATE_CONNECTED    ->
                        "SCO connected — radio RX audio is now the BT mic input (AudioSource.MIC)"
                    AudioManager.SCO_AUDIO_STATE_DISCONNECTED -> "SCO disconnected"
                    AudioManager.SCO_AUDIO_STATE_CONNECTING   -> "SCO connecting…"
                    else -> "SCO error (state=$state)"
                }
                report(connected, msg)
            }
        }
        context.registerReceiver(rcv, IntentFilter(AudioManager.ACTION_SCO_AUDIO_STATE_UPDATED))
        scoReceiver = rcv

        // On Android ≥ 12 with scoManagedByAudio=false the BT stack manages SCO; we still
        // call startBluetoothSco() so AudioManager knows to route to BT when SCO is up.
        am.startBluetoothSco()

        // Android 12+: set communication device to BT_SCO so mic routing follows SCO
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.S) {
            am.availableCommunicationDevices
                .firstOrNull { it.type == android.media.AudioDeviceInfo.TYPE_BLUETOOTH_SCO }
                ?.let { am.setCommunicationDevice(it) }
        }

        report(false, "audio: startBluetoothSco() called")
    }

    fun stop() {
        scoReceiver?.let {
            try { context.unregisterReceiver(it) } catch (_: Exception) {}
            scoReceiver = null
        }
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.S) {
            am.clearCommunicationDevice()
        }
        am.stopBluetoothSco()
        headsetProxy?.let {
            adapter?.closeProfileProxy(BluetoothProfile.HEADSET, it)
            headsetProxy = null
        }
    }

    private fun report(connected: Boolean, msg: String) {
        onStateChange?.invoke(connected, msg)
    }
}
