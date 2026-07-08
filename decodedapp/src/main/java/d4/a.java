package d4;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static void a(byte[] bArr, int i10, byte[] bArr2, int i11, int i12) {
        System.arraycopy(bArr2, i11, bArr, i10, i12);
    }

    public static void b(short[] sArr, int i10, short[] sArr2, int i11, int i12) {
        System.arraycopy(sArr2, i11, sArr, i10, i12);
    }

    public static void c(short[] sArr, int i10, int i11, short s10) {
        Arrays.fill(sArr, i10, i11 + i10, s10);
    }

    public static void d(short[] sArr, short s10) {
        Arrays.fill(sArr, s10);
    }

    public static long[] e(Long[] lArr) {
        long[] jArr = new long[lArr.length];
        for (int i10 = 0; i10 < lArr.length; i10++) {
            jArr[i10] = lArr[i10].longValue();
        }
        return jArr;
    }
}
