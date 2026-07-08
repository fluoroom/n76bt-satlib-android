package a2;

import cd.y;
import com.benshikj.ii.NBSS;

/* JADX INFO: loaded from: classes.dex */
abstract class b {
    public static byte[] a(int i10, byte[] bArr) {
        int length = (bArr.length + 3) / 4;
        byte[] bArr2 = new byte[(length * 4) + 4];
        y.g(bArr2, 0, i10);
        y.g(bArr2, 2, length);
        System.arraycopy(bArr, 0, bArr2, 4, bArr.length);
        return bArr2;
    }

    public static byte[] b(NBSS nbss) {
        return a(4, nbss.pack());
    }

    public static byte[] c(int i10) {
        byte[] bArr = new byte[8];
        y.g(bArr, 0, 3);
        y.g(bArr, 2, 1);
        y.h(bArr, 4, i10);
        return bArr;
    }

    public static byte[] d(NBSS nbss) {
        return a(4, c.f165a.b(nbss));
    }

    public static int e(byte[] bArr) {
        if (bArr == null || bArr.length != 8) {
            return 0;
        }
        return y.c(bArr, 4);
    }

    public static int f(byte[] bArr) {
        if (bArr == null || bArr.length < 2) {
            return 0;
        }
        return y.a(bArr, 0);
    }
}
