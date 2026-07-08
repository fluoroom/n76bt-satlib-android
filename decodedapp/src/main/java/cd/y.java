package cd;

import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes3.dex */
public abstract class y {
    public static int a(byte[] bArr, int i10) {
        int i11 = 0;
        int i12 = 1;
        for (int i13 = 0; i13 < 16; i13 += 8) {
            i11 = (int) (((long) i11) | (((long) (bArr[i10 + i12] & MessagePack.Code.EXT_TIMESTAMP)) << i13));
            i12--;
        }
        return i11;
    }

    public static long b(byte[] bArr, int i10) {
        long j10 = 0;
        int i11 = 3;
        for (int i12 = 0; i12 < 32; i12 += 8) {
            j10 |= ((long) (bArr[i10 + i11] & MessagePack.Code.EXT_TIMESTAMP)) << i12;
            i11--;
        }
        return j10;
    }

    public static int c(byte[] bArr, int i10) {
        int i11 = 0;
        int i12 = 3;
        for (int i13 = 0; i13 < 32; i13 += 8) {
            i11 = (int) (((long) i11) | (((long) (bArr[i10 + i12] & MessagePack.Code.EXT_TIMESTAMP)) << i13));
            i12--;
        }
        return i11;
    }

    public static byte[] d(int i10) {
        return new byte[]{(byte) ((i10 >> 8) & 255), (byte) (i10 & 255)};
    }

    public static byte[] e(long j10) {
        int i10 = (int) j10;
        return new byte[]{(byte) ((i10 >>> 24) & 255), (byte) ((i10 >> 16) & 255), (byte) ((i10 >> 8) & 255), (byte) (i10 & 255)};
    }

    public static long f(long j10, long j11) {
        return ((j10 - 2208988800L) * 1000) + ((long) ((j11 * 1000.0d) / 4.294967295E9d));
    }

    public static void g(byte[] bArr, int i10, int i11) {
        bArr[i10] = (byte) ((i11 >> 8) & 255);
        bArr[i10 + 1] = (byte) (i11 & 255);
    }

    public static void h(byte[] bArr, int i10, int i11) {
        bArr[i10] = (byte) ((i11 >>> 24) & 255);
        bArr[i10 + 1] = (byte) ((i11 >> 16) & 255);
        bArr[i10 + 2] = (byte) ((i11 >> 8) & 255);
        bArr[i10 + 3] = (byte) (i11 & 255);
    }
}
