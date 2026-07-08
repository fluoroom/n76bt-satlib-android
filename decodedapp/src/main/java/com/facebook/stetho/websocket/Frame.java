package com.facebook.stetho.websocket;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes.dex */
class Frame {
    public static final byte OPCODE_BINARY_FRAME = 2;
    public static final byte OPCODE_CONNECTION_CLOSE = 8;
    public static final byte OPCODE_CONNECTION_PING = 9;
    public static final byte OPCODE_CONNECTION_PONG = 10;
    public static final byte OPCODE_TEXT_FRAME = 1;
    public boolean fin;
    public boolean hasMask;
    public byte[] maskingKey;
    public byte opcode;
    public byte[] payloadData;
    public long payloadLen;
    public boolean rsv1;
    public boolean rsv2;
    public boolean rsv3;

    Frame() {
    }

    private void decodeFirstByte(byte b10) {
        this.fin = (b10 & 128) != 0;
        this.rsv1 = (b10 & 64) != 0;
        this.rsv2 = (b10 & 32) != 0;
        this.rsv3 = (b10 & 16) != 0;
        this.opcode = (byte) (b10 & 15);
    }

    private long decodeLength(byte b10, InputStream inputStream) throws IOException {
        if (b10 <= 125) {
            return b10;
        }
        if (b10 == 126) {
            return ((readByteOrThrow(inputStream) & MessagePack.Code.EXT_TIMESTAMP) << 8) | (readByteOrThrow(inputStream) & MessagePack.Code.EXT_TIMESTAMP);
        }
        if (b10 != 127) {
            throw new IOException("Unexpected length byte: " + ((int) b10));
        }
        long byteOrThrow = 0;
        for (int i10 = 0; i10 < 8; i10++) {
            byteOrThrow = (byteOrThrow << 8) | ((long) (readByteOrThrow(inputStream) & MessagePack.Code.EXT_TIMESTAMP));
        }
        return byteOrThrow;
    }

    private static byte[] decodeMaskingKey(InputStream inputStream) throws IOException {
        byte[] bArr = new byte[4];
        readBytesOrThrow(inputStream, bArr, 0, 4);
        return bArr;
    }

    private byte encodeFirstByte() {
        byte b10 = this.fin ? (byte) 128 : (byte) 0;
        if (this.rsv1) {
            b10 = (byte) (b10 | 64);
        }
        if (this.rsv2) {
            b10 = (byte) (b10 | 32);
        }
        if (this.rsv3) {
            b10 = (byte) (b10 | 16);
        }
        return (byte) (b10 | (this.opcode & 15));
    }

    private static byte[] encodeLength(long j10) {
        return j10 <= 125 ? new byte[]{(byte) j10} : j10 <= 65535 ? new byte[]{126, (byte) ((j10 >> 8) & 255), (byte) (j10 & 255)} : new byte[]{127, (byte) ((j10 >> 56) & 255), (byte) ((j10 >> 48) & 255), (byte) ((j10 >> 40) & 255), (byte) ((j10 >> 32) & 255), (byte) ((j10 >> 24) & 255), (byte) ((j10 >> 16) & 255), (byte) ((j10 >> 8) & 255), (byte) (j10 & 255)};
    }

    private static byte readByteOrThrow(InputStream inputStream) throws IOException {
        int i10 = inputStream.read();
        if (i10 != -1) {
            return (byte) i10;
        }
        throw new EOFException();
    }

    private static void readBytesOrThrow(InputStream inputStream, byte[] bArr, int i10, int i11) throws IOException {
        while (i11 > 0) {
            int i12 = inputStream.read(bArr, i10, i11);
            if (i12 == -1) {
                throw new EOFException();
            }
            i11 -= i12;
            i10 += i12;
        }
    }

    public void readFrom(BufferedInputStream bufferedInputStream) throws IOException {
        decodeFirstByte(readByteOrThrow(bufferedInputStream));
        byte byteOrThrow = readByteOrThrow(bufferedInputStream);
        this.hasMask = (byteOrThrow & 128) != 0;
        this.payloadLen = decodeLength((byte) (byteOrThrow & (-129)), bufferedInputStream);
        this.maskingKey = this.hasMask ? decodeMaskingKey(bufferedInputStream) : null;
        long j10 = this.payloadLen;
        byte[] bArr = new byte[(int) j10];
        this.payloadData = bArr;
        readBytesOrThrow(bufferedInputStream, bArr, 0, (int) j10);
        MaskingHelper.unmask(this.maskingKey, this.payloadData, 0, (int) this.payloadLen);
    }

    public void writeTo(BufferedOutputStream bufferedOutputStream) throws IOException {
        bufferedOutputStream.write(encodeFirstByte());
        byte[] bArrEncodeLength = encodeLength(this.payloadLen);
        if (this.hasMask) {
            bArrEncodeLength[0] = (byte) (bArrEncodeLength[0] | 128);
        }
        bufferedOutputStream.write(bArrEncodeLength, 0, bArrEncodeLength.length);
        if (this.hasMask) {
            throw new UnsupportedOperationException("Writing masked data not implemented");
        }
        bufferedOutputStream.write(this.payloadData, 0, (int) this.payloadLen);
    }
}
