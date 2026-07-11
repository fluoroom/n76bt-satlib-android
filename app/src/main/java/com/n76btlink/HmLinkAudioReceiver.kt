package com.n76btlink

import android.bluetooth.BluetoothAdapter
import android.bluetooth.BluetoothSocket
import android.media.AudioAttributes
import android.media.AudioFormat
import android.media.AudioTrack
import android.os.Build
import com.dw.sbc.SbcDecoder
import java.io.IOException
import java.io.InputStream
import java.util.UUID
import kotlin.concurrent.thread

/**
 * Connects to the N76's dedicated audio RFCOMM channel (UUID 00004315-…),
 * receives HDLC-framed SBC audio, decodes it, and plays through the phone speaker.
 *
 * Frame wire format (HDLC-lite):
 *   7E  [payload bytes, with 7D-stuffing]  7E
 *   If first payload byte < 0x80: type = byte & 0x7F, audio data starts at byte 1.
 *   Type 9 (0x09) = SBC audio frame.
 *   Stuffing: 0x7D followed by (next_byte XOR 0x20) represents the original byte.
 */
class HmLinkAudioReceiver(private val mac: String) {

    var onLog: ((String) -> Unit)? = null
    /** Called with every decoded PCM block (32 kHz, mono, little-endian shorts) for recording. */
    var onPcmShorts: ((ShortArray, Int) -> Unit)? = null

    @Volatile private var running = false
    private var socket: BluetoothSocket? = null
    @Volatile private var currentTrack: AudioTrack? = null

    /** Toggle speaker output at runtime; false (silent) by default. */
    @Volatile var monitorEnabled: Boolean = false
        set(value) {
            field = value
            currentTrack?.setVolume(if (value) 1f else 0f)
        }

    companion object {
        private val AUDIO_UUID = UUID.fromString("39144315-32fa-40db-85ed-fbfeba2d86e6")
        private const val SAMPLE_RATE = 32000
        private const val TYPE_SBC_AUDIO = 9
    }

    fun start() {
        if (running) return
        running = true
        thread(name = "hmlink-audio", isDaemon = true) {
            runLoop()
        }
    }

    fun stop() {
        running = false
        closeSocket()
    }

    private fun closeSocket() {
        try { socket?.close() } catch (_: Exception) {}
        socket = null
    }

    @Suppress("DEPRECATION")
    private fun runLoop() {
        val adapter = BluetoothAdapter.getDefaultAdapter() ?: run {
            log("audio: no BT adapter")
            return
        }
        val device = try { adapter.getRemoteDevice(mac) } catch (e: Exception) {
            log("audio: bad MAC $mac")
            return
        }

        while (running) {
            try {
                val sock = device.createRfcommSocketToServiceRecord(AUDIO_UUID)
                socket = sock
                adapter.cancelDiscovery()
                sock.connect()
                log("audio: HMLink audio channel connected")
                val track = buildAudioTrack()
                currentTrack = track
                track.play()
                track.setVolume(if (monitorEnabled) 1f else 0f)
                try {
                    receiveLoop(sock.inputStream, track)
                } finally {
                    currentTrack = null
                    track.stop()
                    track.release()
                }
            } catch (e: Exception) {
                if (running) {
                    log("audio: HMLink error — ${e.javaClass.simpleName}: ${e.message}")
                    Thread.sleep(3000)
                }
            } finally {
                closeSocket()
            }
        }
        log("audio: HMLink audio stopped")
    }

    private fun buildAudioTrack(): AudioTrack {
        val minBuf = AudioTrack.getMinBufferSize(
            SAMPLE_RATE, AudioFormat.CHANNEL_OUT_MONO, AudioFormat.ENCODING_PCM_16BIT
        )
        val attrs = AudioAttributes.Builder()
            .setUsage(AudioAttributes.USAGE_MEDIA)
            .setContentType(AudioAttributes.CONTENT_TYPE_MUSIC)
            .also {
                // Allow other apps to capture this stream via AudioPlaybackCapture API (Android 10+)
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
                    it.setAllowedCapturePolicy(AudioAttributes.ALLOW_CAPTURE_BY_ALL)
                }
            }
            .build()
        return AudioTrack.Builder()
            .setAudioAttributes(attrs)
            .setAudioFormat(
                AudioFormat.Builder()
                    .setSampleRate(SAMPLE_RATE)
                    .setChannelMask(AudioFormat.CHANNEL_OUT_MONO)
                    .setEncoding(AudioFormat.ENCODING_PCM_16BIT)
                    .build()
            )
            .setBufferSizeInBytes(minBuf * 4)
            .setTransferMode(AudioTrack.MODE_STREAM)
            .build()
    }

    private fun receiveLoop(stream: InputStream, track: AudioTrack) {
        val decoder = SbcDecoder(true)   // big-endian PCM output
        val readBuf = ByteArray(4096)
        var accum = ByteArray(0)
        val pcmBytes = ByteArray(2048)   // SBC frame → PCM bytes
        val pcmShorts = ShortArray(1024) // PCM bytes → shorts for AudioTrack
        var totalBytesRead = 0
        var framesReceived = 0
        var audioFrames = 0
        var pcmFrames = 0
        var nextDiagAt = 500

        try {
            while (running) {
                val n = try { stream.read(readBuf) } catch (_: IOException) { -1 }
                if (n <= 0) break
                totalBytesRead += n
                accum += readBuf.copyOf(n)

                // Parse as many complete frames as possible
                var pos = 0
                while (true) {
                    val result = parseFrame(accum, pos) ?: break
                    pos = result.nextPos
                    framesReceived++
                    if (framesReceived <= 8) {
                        val preview = result.data.take(4).joinToString(" ") { "%02X".format(it) }
                        log("audio: frame#$framesReceived type=${result.type} len=${result.data.size} data=[$preview]")
                    }
                    if ((result.type == TYPE_SBC_AUDIO || result.type == 0) && result.data.isNotEmpty()) {
                        audioFrames++
                        val pcmLen = decoder.b(result.data, 0, result.data.size, pcmBytes)
                        if (pcmLen > 0) {
                            pcmFrames++
                            val samples = pcmLen / 2
                            // Big-endian PCM bytes → little-endian shorts
                            for (i in 0 until samples) {
                                val hi = pcmBytes[i * 2].toInt() and 0xFF
                                val lo = pcmBytes[i * 2 + 1].toInt() and 0xFF
                                pcmShorts[i] = ((hi shl 8) or lo).toShort()
                            }
                            track.write(pcmShorts, 0, samples)
                            onPcmShorts?.invoke(pcmShorts, samples)
                        }
                    }
                }
                accum = if (pos < accum.size) accum.copyOfRange(pos, accum.size) else ByteArray(0)

                if (totalBytesRead >= nextDiagAt) {
                    log("audio: rx=${totalBytesRead}B frames=$framesReceived audio=$audioFrames pcm=$pcmFrames")
                    nextDiagAt = totalBytesRead + 5000
                }
            }
        } finally {
            log("audio: stream ended — rx=${totalBytesRead}B frames=$framesReceived audio=$audioFrames pcm=$pcmFrames")
            decoder.e()
        }
    }

    /**
     * Attempt to parse one HDLC frame starting at [startPos] in [buf].
     * Returns null if no complete frame is available yet.
     */
    private data class FrameResult(val type: Int, val data: ByteArray, val nextPos: Int)

    private fun parseFrame(buf: ByteArray, startPos: Int): FrameResult? {
        // Find opening 0x7E
        var i = startPos
        while (i < buf.size && buf[i] != 0x7E.toByte()) i++
        if (i >= buf.size) return null
        i++ // skip opening 0x7E

        // Unescape bytes until closing 0x7E
        val payload = ByteArray(buf.size)
        var pLen = 0
        var escaped = false
        var found = false
        var endPos = i

        while (endPos < buf.size) {
            val b = buf[endPos++]
            when {
                b == 0x7E.toByte() -> { found = true; break }
                escaped -> {
                    payload[pLen++] = (b.toInt() xor 0x20).toByte()
                    escaped = false
                }
                b == 0x7D.toByte() -> escaped = true
                else -> payload[pLen++] = b
            }
        }

        if (!found || pLen == 0) return null

        // Parse type and data from unescaped payload
        val first = payload[0].toInt() and 0xFF
        val (type, dataOffset, dataLen) = when {
            first == 0xFF && pLen >= 6 -> {
                val t = ((payload[2].toInt() and 0xFF) shl 8) or (payload[3].toInt() and 0xFF)
                Triple(t, 4, pLen - 6)
            }
            (first and 0x80) != 0 && pLen >= 2 -> {
                val t = ((first and 0x3F) shl 8) or (payload[1].toInt() and 0xFF)
                val overhead = if ((first and 0xC0) == 0xC0) 4 else 2
                Triple(t, overhead, pLen - overhead)
            }
            else -> {
                Triple(first and 0x7F, 1, pLen - 1)
            }
        }

        if (dataLen < 0) return null
        val data = payload.copyOfRange(dataOffset, dataOffset + dataLen)
        return FrameResult(type, data, endPos)
    }

    private fun log(msg: String) { onLog?.invoke(msg) }
}
