package j6;

import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes.dex */
abstract class k {
    public static double a(double d10, double d11, double d12) {
        return (d10 * d11) + d12;
    }

    protected static boolean b(char c10) {
        return ((char) (c10 + 65488)) < '\n';
    }

    public static boolean c(CharSequence charSequence, int i10) {
        boolean zB = true;
        for (int i11 = 0; i11 < 8; i11++) {
            zB &= b(charSequence.charAt(i11 + i10));
        }
        return zB;
    }

    public static boolean d(CharSequence charSequence, int i10) {
        boolean z10 = true;
        for (int i11 = 0; i11 < 8; i11++) {
            z10 &= '0' == charSequence.charAt(i11 + i10);
        }
        return z10;
    }

    public static int e(byte[] bArr, int i10) {
        return (bArr[i10 + 3] & MessagePack.Code.EXT_TIMESTAMP) | ((bArr[i10] & MessagePack.Code.EXT_TIMESTAMP) << 24) | ((bArr[i10 + 1] & MessagePack.Code.EXT_TIMESTAMP) << 16) | ((bArr[i10 + 2] & MessagePack.Code.EXT_TIMESTAMP) << 8);
    }

    public static int f(CharSequence charSequence, int i10) {
        return g(((long) charSequence.charAt(i10)) | (((long) charSequence.charAt(i10 + 1)) << 16) | (((long) charSequence.charAt(i10 + 2)) << 32) | (((long) charSequence.charAt(i10 + 3)) << 48), (((long) charSequence.charAt(i10 + 7)) << 48) | ((long) charSequence.charAt(i10 + 4)) | (((long) charSequence.charAt(i10 + 5)) << 16) | (((long) charSequence.charAt(i10 + 6)) << 32));
    }

    public static int g(long j10, long j11) {
        long j12 = j10 - 13511005043687472L;
        long j13 = j11 - 13511005043687472L;
        if ((((j10 + 19703549022044230L) | j12 | (j11 + 19703549022044230L) | j13) & (-35747867511423104L)) != 0) {
            return -1;
        }
        return ((int) ((j13 * 281475406208040961L) >>> 48)) + (((int) ((j12 * 281475406208040961L) >>> 48)) * 10000);
    }

    public static long h(CharSequence charSequence, int i10) {
        return i((((long) charSequence.charAt(i10)) << 48) | (((long) charSequence.charAt(i10 + 1)) << 32) | (((long) charSequence.charAt(i10 + 2)) << 16) | ((long) charSequence.charAt(i10 + 3)), ((long) charSequence.charAt(i10 + 7)) | (((long) charSequence.charAt(i10 + 4)) << 48) | (((long) charSequence.charAt(i10 + 5)) << 32) | (((long) charSequence.charAt(i10 + 6)) << 16));
    }

    public static long i(long j10, long j11) {
        if (((j10 | j11) & (-71777214294589696L)) != 0) {
            return -1L;
        }
        long j12 = j10 * 65792;
        long j13 = j11 * 65792;
        return j(((j12 & 4294901760L) << 16) | (j12 & (-281474976710656L)) | (((-281474976710656L) & j13) >>> 32) | ((j13 & 4294901760L) >>> 16));
    }

    public static long j(long j10) {
        long j11 = 5787213827046133840L + j10;
        long j12 = (j10 ^ 9187201950435737471L) + 4195730024608447034L;
        long j13 = j10 | 2314885530818453536L;
        long j14 = (2242545357980376863L + j13) & (-9187201950435737472L);
        if ((((j11 & j12) ^ (((9187201950435737471L ^ j13) + 7451037802321897319L) & j14)) & (-9187201950435737472L)) != -9187201950435737472L) {
            return -1L;
        }
        long j15 = (j14 >>> 7) * 255;
        long j16 = j13 - 3472328296227680304L;
        long j17 = (j16 - (j15 & 2821266740684990247L)) | ((~j15) & j16);
        long j18 = (j17 | (j17 >>> 4)) & 71777214294589695L;
        long j19 = j18 | (j18 >>> 8);
        return (j19 & 65535) | ((j19 >>> 16) & 4294901760L);
    }

    public static int k(CharSequence charSequence, int i10) {
        return l((((long) charSequence.charAt(i10 + 3)) << 48) | ((long) charSequence.charAt(i10)) | (((long) charSequence.charAt(i10 + 1)) << 16) | (((long) charSequence.charAt(i10 + 2)) << 32));
    }

    public static int l(long j10) {
        long j11 = j10 - 13511005043687472L;
        if ((((j10 + 19703549022044230L) | j11) & (-35747867511423104L)) != 0) {
            return -1;
        }
        return (int) ((j11 * 281475406208040961L) >>> 48);
    }

    public static int m(CharSequence charSequence, int i10, int i11) {
        int i12 = 0;
        boolean zB = true;
        while (i10 < i11) {
            char cCharAt = charSequence.charAt(i10);
            zB &= b(cCharAt);
            i12 = ((i12 * 10) + cCharAt) - 48;
            i10++;
        }
        if (zB) {
            return i12;
        }
        return -1;
    }

    public static void n(byte[] bArr, int i10, int i11) {
        bArr[i10] = (byte) (i11 >>> 24);
        bArr[i10 + 1] = (byte) (i11 >>> 16);
        bArr[i10 + 2] = (byte) (i11 >>> 8);
        bArr[i10 + 3] = (byte) i11;
    }
}
