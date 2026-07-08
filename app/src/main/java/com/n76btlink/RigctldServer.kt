package com.n76btlink

import java.io.BufferedReader
import java.io.InputStreamReader
import java.io.PrintWriter
import java.net.ServerSocket
import java.net.Socket
import java.util.concurrent.atomic.AtomicBoolean
import java.util.concurrent.atomic.AtomicInteger
import java.util.concurrent.atomic.AtomicLong
import kotlin.concurrent.thread

/**
 * Minimal hamlib rigctld TCP server (port 4532).
 * Look4Sat acts as the rigctld *client* — it connects here and sends F/I commands.
 *
 * Supported commands (short and long form):
 *   F <hz>  / \set_freq <hz>       → update rxFreqHz, reply RPRT 0
 *   I <hz>  / \set_split_freq <hz> → update txFreqHz, reply RPRT 0
 *   f       / \get_freq            → reply <hz>\nRPRT 0
 *   i       / \get_split_freq      → reply <hz>\nRPRT 0
 *   q       / \quit                → close connection
 *   *       / everything else      → reply RPRT 0 (ignored)
 */
class RigctldServer(private val port: Int = 4532) {

    val rxFreqHz    = AtomicLong(145_800_000L)
    val txFreqHz    = AtomicLong(145_800_000L)
    val azimuthDeg  = AtomicInteger(0)
    val elevationDeg = AtomicInteger(0)

    private val running = AtomicBoolean(false)
    private var serverSocket: ServerSocket? = null

    var onLog: ((String) -> Unit)? = null

    fun start() {
        if (running.getAndSet(true)) return
        thread(name = "rigctld-accept", isDaemon = true) {
            try {
                val ss = ServerSocket(port).also { serverSocket = it }
                onLog?.invoke("rigctld listening on :$port")
                while (running.get()) {
                    val client = try {
                        ss.accept()
                    } catch (_: Exception) {
                        break
                    }
                    thread(name = "rigctld-client", isDaemon = true) { handleClient(client) }
                }
            } catch (e: Exception) {
                if (running.get()) onLog?.invoke("rigctld error: ${e.message}")
            }
        }
    }

    fun stop() {
        running.set(false)
        try { serverSocket?.close() } catch (_: Exception) {}
    }

    private fun handleClient(socket: Socket) {
        try {
            socket.use { s ->
                val reader = BufferedReader(InputStreamReader(s.inputStream))
                val writer = PrintWriter(s.outputStream, false)
                var line: String?
                while (reader.readLine().also { line = it } != null) {
                    val cmd = line!!.trim()
                    if (cmd.isEmpty()) continue
                    onLog?.invoke("cmd: $cmd")
                    when {
                        cmd == "q" || cmd == "\\quit" -> {
                            break
                        }
                        cmd.startsWith("F ") || cmd.startsWith("\\set_freq ") -> {
                            cmd.substringAfterLast(' ').trim().toLongOrNull()
                                ?.let { rxFreqHz.set(it) }
                            writer.print("RPRT 0\n")
                            writer.flush()
                        }
                        cmd.startsWith("I ") || cmd.startsWith("\\set_split_freq ") -> {
                            cmd.substringAfterLast(' ').trim().toLongOrNull()
                                ?.let { txFreqHz.set(it) }
                            writer.print("RPRT 0\n")
                            writer.flush()
                        }
                        cmd == "f" || cmd == "\\get_freq" -> {
                            writer.print("${rxFreqHz.get()}\nRPRT 0\n")
                            writer.flush()
                        }
                        cmd == "i" || cmd == "\\get_split_freq" -> {
                            writer.print("${txFreqHz.get()}\nRPRT 0\n")
                            writer.flush()
                        }
                        cmd.startsWith("P ") || cmd.startsWith("\\set_pos ") -> {
                            val parts = cmd.substringAfter(' ').trim().split(Regex("\\s+"))
                            parts.getOrNull(0)?.toDoubleOrNull()?.toInt()?.let { azimuthDeg.set(it) }
                            parts.getOrNull(1)?.toDoubleOrNull()?.toInt()?.let { elevationDeg.set(it) }
                            writer.print("RPRT 0\n")
                            writer.flush()
                        }
                        cmd == "p" || cmd == "\\get_pos" -> {
                            writer.print("${azimuthDeg.get()}\n${elevationDeg.get()}\nRPRT 0\n")
                            writer.flush()
                        }
                        cmd.startsWith("dump_caps") || cmd.startsWith("\\dump_caps") -> {
                            writer.print(DUMP_CAPS)
                            writer.flush()
                        }
                        else -> {
                            writer.print("RPRT 0\n")
                            writer.flush()
                        }
                    }
                }
            }
        } catch (_: Exception) {}
    }

    companion object {
        private val DUMP_CAPS = buildString {
            append("Rig model = 1\n")
            append("Model name = N76BTLink\n")
            append("Mfg name = N76BTLink\n")
            append("Version = 1.0\n")
            append("Can set Freq: Y\n")
            append("Can get Freq: Y\n")
            append("Can set Split: Y\n")
            append("Can get Split: Y\n")
            append("RPRT 0\n")
        }
    }
}
