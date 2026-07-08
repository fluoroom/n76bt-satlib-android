package k6;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f19460a = 15;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final byte[] f19461b = new byte[15];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f19462c;

    private b() {
    }

    private void a(int i10) {
        byte[] bArr = this.f19461b;
        int i11 = this.f19462c + 1;
        this.f19462c = i11;
        bArr[i11] = (byte) i10;
    }

    private void b(int i10) {
        int iP = p(i10);
        for (int i11 = 0; i11 < 8; i11++) {
            int i12 = iP * 10;
            c(i12 >>> 28);
            iP = i12 & 268435455;
        }
    }

    private void c(int i10) {
        byte[] bArr = this.f19461b;
        int i11 = this.f19462c + 1;
        this.f19462c = i11;
        bArr[i11] = (byte) (i10 + 48);
    }

    private String d() {
        return new String(this.f19461b, 0, 0, this.f19462c + 1);
    }

    private void e(int i10) {
        a(69);
        if (i10 < 0) {
            a(45);
            i10 = -i10;
        }
        if (i10 < 10) {
            c(i10);
            return;
        }
        int i11 = (i10 * 103) >>> 10;
        c(i11);
        c(i10 - (i11 * 10));
    }

    private void f() {
        int i10;
        byte b10;
        while (true) {
            byte[] bArr = this.f19461b;
            i10 = this.f19462c;
            b10 = bArr[i10];
            if (b10 != 48) {
                break;
            } else {
                this.f19462c = i10 - 1;
            }
        }
        if (b10 == 46) {
            this.f19462c = i10 + 1;
        }
    }

    private static int g(long j10, long j11) {
        long jF = c.f(j10, j11);
        return (int) ((((jF & 4294967295L) + 4294967295L) >>> 32) | (jF >>> 31));
    }

    private int h(int i10, int i11) {
        int iA = c.a(32 - Integer.numberOfLeadingZeros(i10));
        long j10 = i10;
        if (j10 >= c.g(iA)) {
            iA++;
        }
        int iG = (int) (j10 * c.g(9 - iA));
        int i12 = i11 + iA;
        int i13 = (int) ((((long) iG) * 1441151881) >>> 57);
        int i14 = iG - (100000000 * i13);
        return (i12 <= 0 || i12 > 7) ? (-3 >= i12 || i12 > 0) ? k(i13, i14, i12) : j(i13, i14, i12) : i(i13, i14, i12);
    }

    private int i(int i10, int i11, int i12) {
        c(i10);
        int iP = p(i11);
        int i13 = 1;
        while (i13 < i12) {
            int i14 = iP * 10;
            c(i14 >>> 28);
            iP = i14 & 268435455;
            i13++;
        }
        a(46);
        while (i13 <= 8) {
            int i15 = iP * 10;
            c(i15 >>> 28);
            iP = i15 & 268435455;
            i13++;
        }
        f();
        return 0;
    }

    private int j(int i10, int i11, int i12) {
        c(0);
        a(46);
        while (i12 < 0) {
            c(0);
            i12++;
        }
        c(i10);
        b(i11);
        f();
        return 0;
    }

    private int k(int i10, int i11, int i12) {
        c(i10);
        a(46);
        b(i11);
        f();
        e(i12 - 1);
        return 0;
    }

    private int l(float f10) {
        int iFloatToRawIntBits = Float.floatToRawIntBits(f10);
        int i10 = 8388607 & iFloatToRawIntBits;
        int i11 = (iFloatToRawIntBits >>> 23) & 255;
        if (i11 >= 255) {
            if (i10 != 0) {
                return 5;
            }
            return iFloatToRawIntBits > 0 ? 3 : 4;
        }
        this.f19462c = -1;
        if (iFloatToRawIntBits < 0) {
            a(45);
        }
        if (i11 == 0) {
            return i10 != 0 ? i10 < 8 ? m(-149, i10 * 10, -1) : m(-149, i10, 0) : iFloatToRawIntBits == 0 ? 1 : 2;
        }
        int i12 = 150 - i11;
        int i13 = i10 | 8388608;
        if ((i12 > 0) & (i12 < 24)) {
            int i14 = i13 >> i12;
            if ((i14 << i12) == i13) {
                return h(i14, 0);
            }
        }
        return m(-i12, i13, 0);
    }

    private int m(int i10, int i11, int i12) {
        long j10;
        int iB;
        int i13 = i11 & 1;
        long j11 = i11 << 2;
        long j12 = j11 + 2;
        if ((i11 != 8388608) || (i10 == -149)) {
            j10 = j11 - 2;
            iB = c.a(i10);
        } else {
            j10 = j11 - 1;
            iB = c.b(i10);
        }
        int iC = i10 + c.c(-iB) + 33;
        long jE = 1 + c.e(iB);
        int iG = g(jE, j11 << iC);
        int iG2 = g(jE, j10 << iC);
        int iG3 = g(jE, j12 << iC);
        int i14 = iG >> 2;
        if (i14 >= 100) {
            int i15 = ((int) ((((long) i14) * 1717986919) >>> 34)) * 10;
            int i16 = i15 + 10;
            boolean z10 = iG2 + i13 <= (i15 << 2);
            if (z10 != ((i16 << 2) + i13 <= iG3)) {
                if (!z10) {
                    i15 = i16;
                }
                return h(i15, iB);
            }
        }
        int i17 = i14 + 1;
        boolean z11 = iG2 + i13 <= (i14 << 2);
        if (z11 != ((i17 << 2) + i13 <= iG3)) {
            if (!z11) {
                i14 = i17;
            }
            return h(i14, iB + i12);
        }
        int i18 = iG - ((i14 + i17) << 1);
        if (i18 >= 0 && (i18 != 0 || (i14 & 1) != 0)) {
            i14 = i17;
        }
        return h(i14, iB + i12);
    }

    private String n(float f10) {
        int iL = l(f10);
        return iL != 0 ? iL != 1 ? iL != 2 ? iL != 3 ? iL != 4 ? "NaN" : "-Infinity" : "Infinity" : "-0.0" : "0.0" : d();
    }

    public static String o(float f10) {
        return new b().n(f10);
    }

    private int p(int i10) {
        return ((int) (c.f(((long) (i10 + 1)) << 28, 193428131138340668L) >>> 20)) - 1;
    }
}
