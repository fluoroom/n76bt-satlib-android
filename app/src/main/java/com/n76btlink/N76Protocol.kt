package com.n76btlink

import java.nio.charset.Charset

object N76Protocol {
    private const val VENDOR = 0x0002
    const val CMD_FREQ_MODE_SET_PAR = 0x0023
    const val CMD_SET_SATELLITE_INFO = 0x004D

    /**
     * Wraps a payload in a GAIA framing header.
     * Wire format: FF 01 [flags=00] [len] [vendor_hi=00] [vendor_lo=02] [cmd_hi] [cmd_lo] [payload]
     */
    fun buildPacket(cmd: Int, payload: ByteArray): ByteArray {
        val out = ByteArray(8 + payload.size)
        out[0] = 0xFF.toByte()
        out[1] = 0x01
        out[2] = 0x00                      // flags: no checksum
        out[3] = payload.size.toByte()
        out[4] = (VENDOR shr 8).toByte()   // 0x00
        out[5] = VENDOR.toByte()           // 0x02
        out[6] = (cmd shr 8).toByte()
        out[7] = cmd.toByte()
        payload.copyInto(out, 8)
        return out
    }

    /**
     * Builds a FREQ_MODE_SET_PAR payload (cmd 0x0023).
     *
     * Big-endian bit layout, position 0 = bit 7 of byte 0 (MSB-first):
     *   bits   0- 1  rxModulation (2-bit, 0=FM)
     *   bits   2-31  rxFreqHz     (30-bit)
     *   bits  32-33  txModulation (2-bit, 0=FM)
     *   bits  34-63  txFreqHz     (30-bit)
     *   bits  64-79  rxSubtone    (16-bit CTCSS/DCS code, 0=none)
     *   bits  80-95  txSubtone    (16-bit)
     *   bit   96     enableFreqMode (false when mode=SATELLITE)
     *   bits  97-99  step         (3-bit, 0)
     *   bits 100-103 mode         (4-bit: 0=OFF, 3=EXACT, 10=SATELLITE)
     *   bits 104-109 padding      (6-bit, zero)
     *   bits 110-111 txPowerLevel (2-bit: 0=NO_CHANGE)
     *   bits 112-127 extraCtcss   (fw≥137 only, 16-bit)
     *
     * satFirmware=true → fw≥137, 16-byte payload, mode=SATELLITE (10)
     * satFirmware=false → fw<137, 14-byte payload, mode=EXACT (3) + enableFreqMode=true
     */
    fun buildFreqModeParam(
        rxFreqHz: Long,
        txFreqHz: Long,
        rxSubtone: Int = 0,
        txSubtone: Int = 0,
        satFirmware: Boolean = true
    ): ByteArray {
        val w = BigEndianBitWriter(if (satFirmware) 16 else 14)
        w.write(0, 2, 0)
        w.write(rxFreqHz.toInt(), 30, 2)
        w.write(0, 2, 32)
        w.write(txFreqHz.toInt(), 30, 34)
        w.write(rxSubtone, 16, 64)
        w.write(txSubtone, 16, 80)
        if (satFirmware) {
            w.writeBool(false, 96)
            w.write(0, 3, 97)
            w.write(10, 4, 100)             // SATELLITE mode
        } else {
            w.writeBool(true, 96)           // enableFreqMode
            w.write(0, 3, 97)
            w.write(3, 4, 100)              // EXACT mode
        }
        w.write(0, 6, 104)
        w.write(0, 2, 110)
        return w.bytes
    }

    /**
     * Builds a SET_SATELLITE_INFO payload (cmd 0x004D), 30 bytes.
     *
     * bytes  0-19  satellite name in GBK (null-padded to 20 bytes)
     * bits 160-168 azimuth   (9-bit, degrees 0-360)
     * bits 169-175 padding   (7-bit, zero)
     * bits 176-183 elevation (8-bit, degrees 0-90)
     * bits 184-191 padding   (8-bit, zero)
     * bits 192-207 distance  (16-bit, km, capped at 65535)
     * bits 208-223 altitude  (16-bit, km, capped at 65535)
     * bits 224-239 AOS secs  (16-bit, 65535 = no AOS known)
     */
    fun buildSatelliteInfo(
        name: String,
        azimuthDeg: Int = 0,
        elevationDeg: Int = 0,
        distanceKm: Int = 0,
        altitudeKm: Int = 400,
        aosSeconds: Int = 65535
    ): ByteArray {
        val w = BigEndianBitWriter(30)
        val nameBytes = try {
            name.toByteArray(Charset.forName("GBK"))
        } catch (_: Exception) {
            name.toByteArray(Charsets.UTF_8)
        }
        nameBytes.copyInto(w.bytes, 0, 0, minOf(nameBytes.size, 20))
        w.write(azimuthDeg.coerceIn(0, 511), 9, 160)
        w.write(0, 7, 169)
        w.write(elevationDeg.coerceIn(0, 255), 8, 176)
        w.write(0, 8, 184)
        w.write(distanceKm.coerceIn(0, 65535), 16, 192)
        w.write(altitudeKm.coerceIn(0, 65535), 16, 208)
        w.write(aosSeconds.coerceIn(0, 65535), 16, 224)
        return w.bytes
    }

    fun freqModePacket(rxHz: Long, txHz: Long, rxSub: Int, txSub: Int, satFw: Boolean) =
        buildPacket(CMD_FREQ_MODE_SET_PAR, buildFreqModeParam(rxHz, txHz, rxSub, txSub, satFw))

    fun satInfoPacket(name: String, az: Int, el: Int, dist: Int, alt: Int, aos: Int) =
        buildPacket(CMD_SET_SATELLITE_INFO, buildSatelliteInfo(name, az, el, dist, alt, aos))
}

/**
 * Writes integer values MSB-first into a byte array.
 * Bit position 0 maps to bit 7 of byte 0 (same convention as the N76 GAIA payloads).
 */
class BigEndianBitWriter(val size: Int) {
    val bytes = ByteArray(size)

    fun write(value: Int, numBits: Int, startPos: Int) {
        for (i in 0 until numBits) {
            val bit = (value ushr (numBits - 1 - i)) and 1
            val bitPos = startPos + i
            val byteIdx = bitPos ushr 3
            val bitShift = 7 - (bitPos and 7)
            if (bit == 1) bytes[byteIdx] = (bytes[byteIdx].toInt() or (1 shl bitShift)).toByte()
        }
    }

    fun writeBool(v: Boolean, pos: Int) = write(if (v) 1 else 0, 1, pos)
}
