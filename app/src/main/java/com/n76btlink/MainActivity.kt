package com.n76btlink

import android.Manifest
import android.bluetooth.BluetoothAdapter
import android.bluetooth.BluetoothDevice
import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import android.content.pm.PackageManager
import android.media.AudioDeviceInfo
import android.media.AudioManager
import android.net.Uri
import android.os.Build
import android.os.Bundle
import android.view.MotionEvent
import android.view.View
import android.widget.*
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat

class MainActivity : AppCompatActivity() {

    private lateinit var spinnerDevices:     Spinner
    private lateinit var editHost:           EditText
    private lateinit var editPort:           EditText
    private lateinit var spinnerInterval:    Spinner
    private lateinit var checkSendSatInfo:   CheckBox
    private lateinit var checkForceRx:       CheckBox
    private lateinit var spinnerForceRxTone: Spinner
    private lateinit var checkForceTx:       CheckBox
    private lateinit var spinnerForceTxTone: Spinner
    private lateinit var checkAudioSco:      CheckBox
    private lateinit var btnMonitor:         Button
    private lateinit var spinnerAudioInput:  Spinner
    private lateinit var checkRecordHt:      CheckBox
    private lateinit var checkRecordInput:   CheckBox
    private lateinit var checkRecordSatOnly: CheckBox
    private lateinit var tvOutputFolder:     TextView
    private lateinit var btnPickFolder:      Button
    private lateinit var btnRecord:          Button
    private lateinit var btnPtt:             Button
    private lateinit var btnToggle:          Button
    private lateinit var tvLog:              TextView

    private var pairedDevices: List<BluetoothDevice> = emptyList()
    private var audioInputDevices: List<AudioDeviceInfo> = emptyList()
    private var serviceRunning = false
    private var monitorOn = false
    private var recording = false
    private var outputFolderUri: Uri? = null

    private val pollStepsMs = (1..12).map { it * 250L }

    private val prefs by lazy { getSharedPreferences("n76btlink", MODE_PRIVATE) }

    private val folderPickerLauncher = registerForActivityResult(
        ActivityResultContracts.OpenDocumentTree()
    ) { uri: Uri? ->
        if (uri != null) {
            contentResolver.takePersistableUriPermission(
                uri,
                Intent.FLAG_GRANT_READ_URI_PERMISSION or Intent.FLAG_GRANT_WRITE_URI_PERMISSION
            )
            outputFolderUri = uri
            tvOutputFolder.text = uri.lastPathSegment ?: uri.toString()
            prefs.edit().putString("output_folder_uri", uri.toString()).apply()
        }
    }

    private val logReceiver = object : BroadcastReceiver() {
        override fun onReceive(context: Context, intent: Intent) {
            val msg = intent.getStringExtra(BridgeService.EXTRA_LOG_MSG) ?: return
            runOnUiThread { tvLog.append("$msg\n") }
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        spinnerDevices     = findViewById(R.id.spinnerDevices)
        editHost           = findViewById(R.id.editHost)
        editPort           = findViewById(R.id.editPort)
        spinnerInterval    = findViewById(R.id.spinnerInterval)
        checkSendSatInfo   = findViewById(R.id.checkSendSatInfo)
        checkForceRx       = findViewById(R.id.checkForceRx)
        spinnerForceRxTone = findViewById(R.id.spinnerForceRxTone)
        checkForceTx       = findViewById(R.id.checkForceTx)
        spinnerForceTxTone = findViewById(R.id.spinnerForceTxTone)
        checkAudioSco      = findViewById(R.id.checkAudioSco)
        btnMonitor         = findViewById(R.id.btnMonitor)
        spinnerAudioInput  = findViewById(R.id.spinnerAudioInput)
        checkRecordHt      = findViewById(R.id.checkRecordHt)
        checkRecordInput   = findViewById(R.id.checkRecordInput)
        checkRecordSatOnly = findViewById(R.id.checkRecordSatOnly)
        tvOutputFolder     = findViewById(R.id.tvOutputFolder)
        btnPickFolder      = findViewById(R.id.btnPickFolder)
        btnRecord          = findViewById(R.id.btnRecord)
        btnPtt             = findViewById(R.id.btnPtt)
        btnToggle          = findViewById(R.id.btnToggle)
        tvLog              = findViewById(R.id.tvLog)

        spinnerInterval.adapter = ArrayAdapter(
            this,
            android.R.layout.simple_spinner_item,
            pollStepsMs.map { "${it} ms" }
        ).also { it.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item) }
        spinnerInterval.setSelection(1) // default 500 ms

        val ctcssLabels = listOf("none") + CTCSS_SUBTONES.drop(1).map { "%.1f Hz".format(it / 100.0) }
        fun ctcssAdapter() = ArrayAdapter(this, android.R.layout.simple_spinner_item, ctcssLabels)
            .also { it.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item) }
        spinnerForceRxTone.adapter = ctcssAdapter()
        spinnerForceTxTone.adapter = ctcssAdapter()

        // Restart bridge when a forced tone value changes (only matters when checkbox is checked)
        val toneSpinnerListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(p: AdapterView<*>?, v: View?, pos: Int, id: Long) {
                if (serviceRunning) { tvLog.append("Force tone changed — restarting bridge…\n"); stopBridge(); startBridge() }
            }
            override fun onNothingSelected(p: AdapterView<*>?) {}
        }
        spinnerForceRxTone.onItemSelectedListener = toneSpinnerListener
        spinnerForceTxTone.onItemSelectedListener = toneSpinnerListener

        // Restore saved output folder
        prefs.getString("output_folder_uri", null)?.let { uriStr ->
            val uri = Uri.parse(uriStr)
            outputFolderUri = uri
            tvOutputFolder.text = uri.lastPathSegment ?: uriStr
        }

        checkRecordHt.setOnCheckedChangeListener { _, checked ->
            if (checked) checkAudioSco.isChecked = true
        }

        checkRecordSatOnly.setOnCheckedChangeListener { _, checked ->
            btnRecord.visibility = if (checked) View.GONE else View.VISIBLE
        }

        val radioOptionListener = { _: android.widget.CompoundButton, _: Boolean ->
            btnMonitor.visibility = if (checkAudioSco.isChecked) View.VISIBLE else View.GONE
            if (!checkAudioSco.isChecked) resetMonitor()
            if (serviceRunning) {
                tvLog.append("Radio option changed — restarting bridge…\n")
                stopBridge()
                startBridge()
            }
            Unit
        }
        checkAudioSco.setOnCheckedChangeListener(radioOptionListener)
        checkSendSatInfo.setOnCheckedChangeListener(radioOptionListener)
        checkForceRx.setOnCheckedChangeListener(radioOptionListener)
        checkForceTx.setOnCheckedChangeListener(radioOptionListener)

        btnMonitor.setOnClickListener {
            monitorOn = !monitorOn
            btnMonitor.text = getString(
                if (monitorOn) R.string.btn_monitor_on else R.string.btn_monitor_off
            )
            startService(Intent(this, BridgeService::class.java).apply {
                action = BridgeService.ACTION_AUDIO_MONITOR
                putExtra(BridgeService.EXTRA_MONITOR_ON, monitorOn)
            })
        }

        btnPickFolder.setOnClickListener {
            folderPickerLauncher.launch(outputFolderUri)
        }

        btnRecord.setOnClickListener { toggleRecording() }

        btnPtt.setOnTouchListener { _, ev ->
            when (ev.action) {
                MotionEvent.ACTION_DOWN -> {
                    if (!serviceRunning) { toast("Start bridge first"); false }
                    else {
                        startService(Intent(this, BridgeService::class.java)
                            .setAction(BridgeService.ACTION_PTT_DOWN))
                        true
                    }
                }
                MotionEvent.ACTION_UP, MotionEvent.ACTION_CANCEL -> {
                    startService(Intent(this, BridgeService::class.java)
                        .setAction(BridgeService.ACTION_PTT_UP))
                    true
                }
                else -> false
            }
        }

        btnToggle.setOnClickListener {
            if (serviceRunning) stopBridge() else startBridge()
        }

        requestPermissions()
        loadPairedDevices()
    }

    override fun onResume() {
        super.onResume()
        ContextCompat.registerReceiver(
            this, logReceiver, IntentFilter(BridgeService.ACTION_LOG),
            ContextCompat.RECEIVER_NOT_EXPORTED
        )
        loadAudioInputDevices()
    }

    override fun onPause() {
        super.onPause()
        unregisterReceiver(logReceiver)
    }

    // ── Bluetooth devices ─────────────────────────────────────────────────────

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

    // ── Audio input devices ───────────────────────────────────────────────────

    private fun loadAudioInputDevices() {
        val am = getSystemService(Context.AUDIO_SERVICE) as AudioManager
        audioInputDevices = am.getDevices(AudioManager.GET_DEVICES_INPUTS).toList()
        val names = mutableListOf(getString(R.string.audio_input_default))
        names += audioInputDevices.map { inputDeviceLabel(it) }
        spinnerAudioInput.adapter = ArrayAdapter(
            this, android.R.layout.simple_spinner_item, names
        ).also { it.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item) }
    }

    private fun inputDeviceLabel(d: AudioDeviceInfo): String {
        val type = when (d.type) {
            AudioDeviceInfo.TYPE_BUILTIN_MIC    -> getString(R.string.audio_type_phone_mic)
            AudioDeviceInfo.TYPE_WIRED_HEADSET  -> getString(R.string.audio_type_wired)
            AudioDeviceInfo.TYPE_USB_HEADSET    -> getString(R.string.audio_type_usb)
            AudioDeviceInfo.TYPE_BLUETOOTH_SCO  -> getString(R.string.audio_type_bt_sco)
            else -> "Input #${d.id}"
        }
        val name = d.productName?.toString()?.takeIf { it.isNotBlank() }
        return if (name != null) "$name ($type)" else type
    }

    private fun selectedInputDeviceId(): Int {
        val pos = spinnerAudioInput.selectedItemPosition
        return if (pos <= 0) 0 else audioInputDevices.getOrNull(pos - 1)?.id ?: 0
    }

    // ── Recording ─────────────────────────────────────────────────────────────

    private fun toggleRecording() {
        if (!recording) {
            if (!checkRecordHt.isChecked && !checkRecordInput.isChecked) {
                toast("Select at least one recording source"); return
            }
            if (checkRecordInput.isChecked && !hasRecordPermission()) {
                toast("Microphone permission required"); return
            }
            startService(Intent(this, BridgeService::class.java).apply {
                action = BridgeService.ACTION_RECORD_START
                putExtra(BridgeService.EXTRA_RECORD_HT,        checkRecordHt.isChecked)
                putExtra(BridgeService.EXTRA_RECORD_INPUT,     checkRecordInput.isChecked)
                putExtra(BridgeService.EXTRA_INPUT_DEVICE_ID,  selectedInputDeviceId())
                outputFolderUri?.let { putExtra(BridgeService.EXTRA_OUTPUT_FOLDER, it.toString()) }
            })
            recording = true
            btnRecord.text = getString(R.string.btn_record_stop)
        } else {
            startService(Intent(this, BridgeService::class.java)
                .setAction(BridgeService.ACTION_RECORD_STOP))
            recording = false
            btnRecord.text = getString(R.string.btn_record_start)
        }
    }

    // ── Bridge start / stop ───────────────────────────────────────────────────

    private fun startBridge() {
        val idx = spinnerDevices.selectedItemPosition
        if (idx < 0 || idx >= pairedDevices.size) { toast("Select a Bluetooth device"); return }

        val host   = editHost.text.toString().trim().ifBlank { "127.0.0.1" }
        val port   = editPort.text.toString().trim().toIntOrNull() ?: 4534
        val pollMs = pollStepsMs.getOrElse(spinnerInterval.selectedItemPosition) { 500L }
        val forceRxTone = if (checkForceRx.isChecked) CTCSS_SUBTONES[spinnerForceRxTone.selectedItemPosition] else -1
        val forceTxTone = if (checkForceTx.isChecked) CTCSS_SUBTONES[spinnerForceTxTone.selectedItemPosition] else -1

        val svcIntent = Intent(this, BridgeService::class.java).apply {
            action = BridgeService.ACTION_START
            putExtra(BridgeService.EXTRA_MAC,              pairedDevices[idx].address)
            putExtra(BridgeService.EXTRA_HOST,             host)
            putExtra(BridgeService.EXTRA_PORT,             port)
            putExtra(BridgeService.EXTRA_POLL_MS,          pollMs)
            putExtra(BridgeService.EXTRA_SEND_SAT_INFO,    checkSendSatInfo.isChecked)
            putExtra(BridgeService.EXTRA_FORCE_RX_TONE,    forceRxTone)
            putExtra(BridgeService.EXTRA_FORCE_TX_TONE,    forceTxTone)
            putExtra(BridgeService.EXTRA_AUDIO_SCO,        checkAudioSco.isChecked)
            putExtra(BridgeService.EXTRA_RECORD_SAT_ONLY,  checkRecordSatOnly.isChecked)
            putExtra(BridgeService.EXTRA_RECORD_HT,        checkRecordHt.isChecked)
            putExtra(BridgeService.EXTRA_RECORD_INPUT,     checkRecordInput.isChecked)
            putExtra(BridgeService.EXTRA_INPUT_DEVICE_ID,  selectedInputDeviceId())
            outputFolderUri?.let { putExtra(BridgeService.EXTRA_OUTPUT_FOLDER, it.toString()) }
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
        recording = false
        btnToggle.text = getString(R.string.btn_start)
        btnRecord.text = getString(R.string.btn_record_start)
        resetMonitor()
        tvLog.append("Bridge stopped.\n")
    }

    private fun resetMonitor() {
        monitorOn = false
        btnMonitor.text = getString(R.string.btn_monitor_off)
    }

    // ── Permissions ───────────────────────────────────────────────────────────

    private fun requestPermissions() {
        val perms = mutableListOf<String>()
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.S) {
            perms += Manifest.permission.BLUETOOTH_CONNECT
            perms += Manifest.permission.BLUETOOTH_SCAN
        }
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
            perms += Manifest.permission.POST_NOTIFICATIONS
        }
        perms += Manifest.permission.RECORD_AUDIO
        val needed = perms.filter {
            ActivityCompat.checkSelfPermission(this, it) != PackageManager.PERMISSION_GRANTED
        }
        if (needed.isNotEmpty()) ActivityCompat.requestPermissions(this, needed.toTypedArray(), 1)
    }

    override fun onRequestPermissionsResult(
        requestCode: Int, permissions: Array<String>, grantResults: IntArray
    ) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        if (requestCode == 1) {
            loadPairedDevices()
            loadAudioInputDevices()
        }
    }

    private fun hasBluetoothPermission(): Boolean =
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.S)
            ActivityCompat.checkSelfPermission(this, Manifest.permission.BLUETOOTH_CONNECT) ==
                    PackageManager.PERMISSION_GRANTED
        else true

    private fun hasRecordPermission(): Boolean =
        ActivityCompat.checkSelfPermission(this, Manifest.permission.RECORD_AUDIO) ==
                PackageManager.PERMISSION_GRANTED

    private fun toast(msg: String) = Toast.makeText(this, msg, Toast.LENGTH_SHORT).show()

    companion object {
        // Standard CTCSS subtone values (Hz × 100); index 0 = none (0)
        val CTCSS_SUBTONES = intArrayOf(
            0,
            6700, 7190, 7440, 7700, 7970, 8250, 8540, 8850,
            9150, 9480, 9740, 10000, 10350, 10720, 11090, 11480,
            11880, 12300, 12730, 13180, 13650, 14130, 14620, 15140,
            15670, 16220, 16790, 17380, 17990, 18620, 19280,
            20350, 21070, 21810, 22570, 23360, 24180, 25030
        )
    }
}
