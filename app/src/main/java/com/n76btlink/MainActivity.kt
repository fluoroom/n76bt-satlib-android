package com.n76btlink

import android.Manifest
import android.bluetooth.BluetoothAdapter
import android.bluetooth.BluetoothDevice
import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import android.content.pm.PackageManager
import android.os.Build
import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat

class MainActivity : AppCompatActivity() {

    private lateinit var spinnerDevices:  Spinner
    private lateinit var editHost:        EditText
    private lateinit var editPort:        EditText
    private lateinit var spinnerInterval: Spinner
    private lateinit var checkSatFw:      CheckBox
    private lateinit var checkSatInfo:    CheckBox
    private lateinit var checkForceRxNull: CheckBox
    private lateinit var checkForceTxNull: CheckBox
    private lateinit var btnToggle:       Button
    private lateinit var tvLog:           TextView

    private var pairedDevices: List<BluetoothDevice> = emptyList()
    private var serviceRunning = false

    private val pollStepsMs = (1..12).map { it * 250L }

    private val logReceiver = object : BroadcastReceiver() {
        override fun onReceive(context: Context, intent: Intent) {
            val msg = intent.getStringExtra(BridgeService.EXTRA_LOG_MSG) ?: return
            runOnUiThread { tvLog.append("$msg\n") }
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        spinnerDevices   = findViewById(R.id.spinnerDevices)
        editHost         = findViewById(R.id.editHost)
        editPort         = findViewById(R.id.editPort)
        spinnerInterval  = findViewById(R.id.spinnerInterval)
        checkSatFw       = findViewById(R.id.checkSatFw)
        checkSatInfo     = findViewById(R.id.checkSatInfo)
        checkForceRxNull = findViewById(R.id.checkForceRxNull)
        checkForceTxNull = findViewById(R.id.checkForceTxNull)
        btnToggle        = findViewById(R.id.btnToggle)
        tvLog            = findViewById(R.id.tvLog)

        spinnerInterval.adapter = ArrayAdapter(
            this,
            android.R.layout.simple_spinner_item,
            pollStepsMs.map { "${it} ms" }
        ).also { it.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item) }
        spinnerInterval.setSelection(3) // default 1000 ms

        requestPermissions()
        loadPairedDevices()

        btnToggle.setOnClickListener {
            if (serviceRunning) stopBridge() else startBridge()
        }
    }

    override fun onResume() {
        super.onResume()
        ContextCompat.registerReceiver(
            this, logReceiver, IntentFilter(BridgeService.ACTION_LOG),
            ContextCompat.RECEIVER_NOT_EXPORTED
        )
    }

    override fun onPause() {
        super.onPause()
        unregisterReceiver(logReceiver)
    }

    private fun loadPairedDevices() {
        if (!hasBluetoothPermission()) return
        @Suppress("DEPRECATION")
        val adapter = BluetoothAdapter.getDefaultAdapter() ?: run {
            toast("No Bluetooth adapter")
            return
        }
        pairedDevices = adapter.bondedDevices.toList()
        if (pairedDevices.isEmpty()) {
            toast("No paired devices — pair the N76 first")
            return
        }
        spinnerDevices.adapter = ArrayAdapter(
            this,
            android.R.layout.simple_spinner_item,
            pairedDevices.map { "${it.name}  (${it.address})" }
        ).also { it.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item) }
        val n76idx = pairedDevices.indexOfFirst { it.name?.contains("N76", ignoreCase = true) == true }
        if (n76idx >= 0) spinnerDevices.setSelection(n76idx)
    }

    private fun startBridge() {
        val idx = spinnerDevices.selectedItemPosition
        if (idx < 0 || idx >= pairedDevices.size) { toast("Select a Bluetooth device"); return }

        val host    = editHost.text.toString().trim().ifBlank { "127.0.0.1" }
        val port    = editPort.text.toString().trim().toIntOrNull() ?: 4534
        val pollMs  = pollStepsMs.getOrElse(spinnerInterval.selectedItemPosition) { 1000L }

        val svcIntent = Intent(this, BridgeService::class.java).apply {
            action = BridgeService.ACTION_START
            putExtra(BridgeService.EXTRA_MAC,           pairedDevices[idx].address)
            putExtra(BridgeService.EXTRA_HOST,          host)
            putExtra(BridgeService.EXTRA_PORT,          port)
            putExtra(BridgeService.EXTRA_POLL_MS,       pollMs)
            putExtra(BridgeService.EXTRA_SAT_FW,        checkSatFw.isChecked)
            putExtra(BridgeService.EXTRA_SEND_SAT_INFO, checkSatInfo.isChecked)
            putExtra(BridgeService.EXTRA_FORCE_RX_NULL, checkForceRxNull.isChecked)
            putExtra(BridgeService.EXTRA_FORCE_TX_NULL, checkForceTxNull.isChecked)
        }
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) startForegroundService(svcIntent)
        else startService(svcIntent)

        serviceRunning = true
        btnToggle.text = getString(R.string.btn_stop)
        tvLog.append("Starting bridge…\n")
    }

    private fun stopBridge() {
        startService(Intent(this, BridgeService::class.java).setAction(BridgeService.ACTION_STOP))
        serviceRunning = false
        btnToggle.text = getString(R.string.btn_start)
        tvLog.append("Bridge stopped.\n")
    }

    private fun requestPermissions() {
        val perms = mutableListOf<String>()
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.S) {
            perms += Manifest.permission.BLUETOOTH_CONNECT
            perms += Manifest.permission.BLUETOOTH_SCAN
        }
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
            perms += Manifest.permission.POST_NOTIFICATIONS
        }
        val needed = perms.filter {
            ActivityCompat.checkSelfPermission(this, it) != PackageManager.PERMISSION_GRANTED
        }
        if (needed.isNotEmpty()) ActivityCompat.requestPermissions(this, needed.toTypedArray(), 1)
    }

    override fun onRequestPermissionsResult(
        requestCode: Int, permissions: Array<String>, grantResults: IntArray
    ) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        if (requestCode == 1) loadPairedDevices()
    }

    private fun hasBluetoothPermission(): Boolean =
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.S)
            ActivityCompat.checkSelfPermission(this, Manifest.permission.BLUETOOTH_CONNECT) ==
                    PackageManager.PERMISSION_GRANTED
        else true

    private fun toast(msg: String) = Toast.makeText(this, msg, Toast.LENGTH_SHORT).show()
}
