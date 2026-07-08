package j8;

import java.math.RoundingMode;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f18535a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final char[] f18536b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final int f18537c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final int f18538d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final int f18539e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final int f18540f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final byte[] f18541g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f18542h;

    /* JADX WARN: Illegal instructions before constructor call */
    j(String str, char[] cArr) {
        byte[] bArr = new byte[128];
        Arrays.fill(bArr, (byte) -1);
        for (int i10 = 0; i10 < cArr.length; i10++) {
            char c10 = cArr[i10];
            boolean z10 = true;
            h.b(c10 < 128, "Non-ASCII character: %s", c10);
            if (bArr[c10] != -1) {
                z10 = false;
            }
            h.b(z10, "Duplicate character: %s", c10);
            bArr[c10] = (byte) i10;
        }
        this(str, cArr, bArr, false);
    }

    final char a(int i10) {
        return this.f18536b[i10];
    }

    public final boolean b(char c10) {
        return this.f18541g[61] != -1;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof j) && Arrays.equals(this.f18536b, ((j) obj).f18536b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f18536b) + 1237;
    }

    public final String toString() {
        return this.f18535a;
    }

    private j(String str, char[] cArr, byte[] bArr, boolean z10) {
        this.f18535a = str;
        cArr.getClass();
        this.f18536b = cArr;
        try {
            int length = cArr.length;
            int iB = p.b(length, RoundingMode.UNNECESSARY);
            this.f18538d = iB;
            int iNumberOfTrailingZeros = Integer.numberOfTrailingZeros(iB);
            int i10 = 1 << (3 - iNumberOfTrailingZeros);
            this.f18539e = i10;
            this.f18540f = iB >> iNumberOfTrailingZeros;
            this.f18537c = length - 1;
            this.f18541g = bArr;
            boolean[] zArr = new boolean[i10];
            for (int i11 = 0; i11 < this.f18540f; i11++) {
                zArr[p.a(i11 * 8, this.f18538d, RoundingMode.CEILING)] = true;
            }
            this.f18542h = false;
        } catch (ArithmeticException e10) {
            throw new IllegalArgumentException("Illegal alphabet length " + cArr.length, e10);
        }
    }
}
