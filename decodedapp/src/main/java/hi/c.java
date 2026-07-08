package hi;

import com.facebook.stetho.common.Utf8Charset;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes3.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected static final Charset f15427a = Charset.forName(Utf8Charset.NAME);

    public static boolean a(byte[] bArr, byte[] bArr2, int i10) {
        for (int i11 = 0; i11 < bArr.length; i11++) {
            if (bArr[i11] != bArr2[i11 + i10]) {
                return false;
            }
        }
        return true;
    }

    public static byte b(int i10) {
        if (i10 <= 256) {
            return i10 > 127 ? (byte) (i10 - 256) : (byte) i10;
        }
        throw new IllegalArgumentException("Number " + i10 + " too big");
    }

    public static int c(int i10, int i11) {
        return (i11 << 8) + i10;
    }

    public static long d(int i10, int i11, int i12, int i13) {
        return (i13 << 24) + (i12 << 16) + (i11 << 8) + i10;
    }

    public static long e(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        if (i10 == 255 && i11 == 255 && i13 == 255 && i14 == 255 && i15 == 255 && i16 == 255 && i17 == 255) {
            return -1L;
        }
        return ((long) (i17 << 56)) + ((long) (i16 << 48)) + ((long) (i15 << 40)) + ((long) (i14 << 32)) + ((long) (i13 << 24)) + ((long) (i12 << 16)) + ((long) (i11 << 8)) + ((long) i10);
    }

    public static int f(byte[] bArr, int i10) {
        return c(bArr[i10] & MessagePack.Code.EXT_TIMESTAMP, bArr[i10 + 1] & MessagePack.Code.EXT_TIMESTAMP);
    }

    public static long g(byte[] bArr, int i10) {
        return d(bArr[i10] & MessagePack.Code.EXT_TIMESTAMP, bArr[i10 + 1] & MessagePack.Code.EXT_TIMESTAMP, bArr[i10 + 2] & MessagePack.Code.EXT_TIMESTAMP, bArr[i10 + 3] & MessagePack.Code.EXT_TIMESTAMP);
    }

    public static String h(byte[] bArr, int i10, int i11) {
        return new String(bArr, i10, i11, f15427a);
    }

    public static void i(byte[] bArr, int i10, int i11) {
        bArr[i10] = (byte) (i11 & 255);
        bArr[i10 + 1] = (byte) ((i11 >>> 8) & 255);
    }

    public static void j(byte[] bArr, int i10, long j10) {
        bArr[i10] = (byte) (j10 & 255);
        bArr[i10 + 1] = (byte) ((j10 >>> 8) & 255);
        bArr[i10 + 2] = (byte) ((j10 >>> 16) & 255);
        bArr[i10 + 3] = (byte) ((j10 >>> 24) & 255);
    }

    public static void k(byte[] bArr, int i10, long j10) {
        bArr[i10] = (byte) (j10 & 255);
        bArr[i10 + 1] = (byte) ((j10 >>> 8) & 255);
        bArr[i10 + 2] = (byte) ((j10 >>> 16) & 255);
        bArr[i10 + 3] = (byte) ((j10 >>> 24) & 255);
        bArr[i10 + 4] = (byte) ((j10 >>> 32) & 255);
        bArr[i10 + 5] = (byte) ((j10 >>> 40) & 255);
        bArr[i10 + 6] = (byte) ((j10 >>> 48) & 255);
        bArr[i10 + 7] = (byte) ((j10 >>> 56) & 255);
    }

    public static void l(InputStream inputStream, byte[] bArr) throws IOException {
        m(inputStream, bArr, 0, bArr.length);
    }

    public static void m(InputStream inputStream, byte[] bArr, int i10, int i11) throws IOException {
        int i12 = 0;
        while (i12 < i11) {
            int i13 = inputStream.read(bArr, i10 + i12, i11 - i12);
            if (i13 == -1) {
                throw new EOFException("Asked to read " + i11 + " bytes from " + i10 + " but hit EoF at " + i12);
            }
            i12 += i13;
        }
    }

    public static int n(InputStream inputStream) throws IOException {
        int i10 = inputStream.read();
        if (i10 != -1) {
            return i10;
        }
        throw new EOFException("No data remains");
    }

    public static int o(byte b10) {
        return b10 < 0 ? b10 & MessagePack.Code.EXT_TIMESTAMP : b10;
    }

    public static byte[] p(String str) {
        return str.getBytes(f15427a);
    }

    public static void q(OutputStream outputStream, long j10) throws IOException {
        byte[] bArr = new byte[4];
        j(bArr, 0, j10);
        outputStream.write(bArr);
    }

    public static void r(OutputStream outputStream, String str) throws IOException {
        byte[] bytes = str.getBytes(f15427a);
        q(outputStream, bytes.length);
        outputStream.write(bytes);
    }
}
