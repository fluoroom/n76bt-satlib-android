package hi;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int[] f15424a = new int[256];

    static {
        for (int i10 = 0; i10 < 256; i10++) {
            int i11 = i10 << 24;
            for (int i12 = 0; i12 < 8; i12++) {
                i11 = (Integer.MIN_VALUE & i11) != 0 ? (i11 << 1) ^ 79764919 : i11 << 1;
            }
            f15424a[i10] = i11;
        }
    }

    public static int a(byte[] bArr) {
        return b(bArr, 0);
    }

    public static int b(byte[] bArr, int i10) {
        for (int i11 : bArr) {
            i10 = f15424a[((i10 >>> 24) & 255) ^ (i11 & 255)] ^ (i10 << 8);
        }
        return i10;
    }
}
