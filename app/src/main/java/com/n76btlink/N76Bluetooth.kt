package com.n76btlink

import android.bluetooth.BluetoothAdapter
import android.bluetooth.BluetoothDevice
import android.bluetooth.BluetoothSocket
import java.io.OutputStream
import java.util.UUID
import java.util.concurrent.atomic.AtomicBoolean
import kotlin.concurrent.thread

/**
 * Manages a Classic BT RFCOMM connection to the N76 radio.
 *
 * Connection strategy (mirrors the original app):
 *   1. Try SPP UUID (standard Serial Port Profile)
 *   2. Try GAIA UUID (Qualcomm GAIA, used by some N76 firmware)
 *   3. Fallback: createInsecureRfcommSocket on channel 1 via reflection
 *
 * send() is thread-safe; on error it disconnects and retries on the next send().
 */
class N76Bluetooth {

    private var socket: BluetoothSocket? = null
    private var outputStream: OutputStream? = null
    private val _connected = AtomicBoolean(false)
    private var device: BluetoothDevice? = null
    private var connecting = AtomicBoolean(false)

    var onLog: ((String) -> Unit)? = null
    var onConnected: (() -> Unit)? = null
    var onPacket: ((ByteArray) -> Unit)? = null
    val isConnected get() = _connected.get()

    fun connect(mac: String) {
        @Suppress("DEPRECATION")
        device = BluetoothAdapter.getDefaultAdapter()?.getRemoteDevice(mac)
        tryConnect()
    }

    private fun tryConnect() {
        if (connecting.getAndSet(true)) return
        val dev = device ?: run { connecting.set(false); return }
        thread(name = "n76bt-connect", isDaemon = true) {
            try {
                disconnectInternal()
                attemptConnect(dev)
            } finally {
                connecting.set(false)
            }
        }
    }

    private fun attemptConnect(dev: BluetoothDevice) {
        // Try SPP first
        try {
            val sock = dev.createRfcommSocketToServiceRecord(SPP_UUID)
            sock.connect()
            setConnected(sock, "SPP", dev.name)
            return
        } catch (e: Exception) {
            onLog?.invoke("SPP failed: ${e.message}")
        }
        // Try GAIA UUID
        try {
            val sock = dev.createRfcommSocketToServiceRecord(GAIA_UUID)
            sock.connect()
            setConnected(sock, "GAIA", dev.name)
            return
        } catch (e: Exception) {
            onLog?.invoke("GAIA failed: ${e.message}")
        }
        // Reflection fallback (insecure RFCOMM ch 1)
        try {
            val method = dev.javaClass.getMethod("createInsecureRfcommSocket", Int::class.java)
            val sock = method.invoke(dev, 1) as BluetoothSocket
            sock.connect()
            setConnected(sock, "insecure ch1", dev.name)
        } catch (e: Exception) {
            onLog?.invoke("BT connect failed: ${e.message}")
            _connected.set(false)
        }
    }

    private fun setConnected(sock: BluetoothSocket, via: String, name: String?) {
        socket = sock
        outputStream = sock.outputStream
        _connected.set(true)
        onLog?.invoke("BT connected ($via) to ${name ?: "unknown"}")
        startReader(sock)
        onConnected?.invoke()
    }

    private fun startReader(sock: BluetoothSocket) {
        thread(name = "n76bt-reader", isDaemon = true) {
            val stream = try { sock.inputStream } catch (_: Exception) {
                disconnectInternal(); return@thread
            }
            val chunk = ByteArray(512)
            var buf = ByteArray(0)
            try {
                while (true) {
                    val n = stream.read(chunk)
                    if (n <= 0) break
                    buf += chunk.copyOf(n)
                    var i = 0
                    while (i < buf.size) {
                        if (buf[i] != 0xFF.toByte()) { i++; continue }
                        if (buf.size - i < 8) break
                        val plen  = buf[i + 3].toInt() and 0xFF
                        val flags = buf[i + 2].toInt() and 0xFF
                        val total = 8 + plen + (flags and 1)
                        if (buf.size - i < total) break
                        try { onPacket?.invoke(buf.copyOfRange(i, i + total)) }
                        catch (_: Exception) {}
                        i += total
                    }
                    buf = if (i < buf.size) buf.copyOfRange(i, buf.size) else ByteArray(0)
                }
            } catch (_: Exception) {}
            onLog?.invoke("BT reader ended")
            disconnectInternal()
        }
    }

    private fun disconnectInternal() {
        _connected.set(false)
        try { socket?.close() } catch (_: Exception) {}
        socket = null
        outputStream = null
    }

    @Synchronized
    fun send(bytes: ByteArray): Boolean {
        if (!_connected.get()) {
            tryConnect()
            return false
        }
        return try {
            outputStream?.write(bytes)
            outputStream?.flush()
            true
        } catch (e: Exception) {
            onLog?.invoke("BT write error: ${e.message}, reconnecting…")
            disconnectInternal()
            tryConnect()
            false
        }
    }

    fun disconnect() {
        disconnectInternal()
    }

    companion object {
        val SPP_UUID: UUID  = UUID.fromString("00001101-0000-1000-8000-00805F9B34FB")
        val GAIA_UUID: UUID = UUID.fromString("00001107-D102-11E1-9B23-00025B00A5A5")
    }
}
