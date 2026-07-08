package k6;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f19457a = 24;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final byte[] f19458b = new byte[24];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f19459c;

    private a() {
    }

    private void a(int i10) {
        byte[] bArr = this.f19458b;
        int i11 = this.f19459c + 1;
        this.f19459c = i11;
        bArr[i11] = (byte) i10;
    }

    private void b(int i10) {
        int iQ = q(i10);
        for (int i11 = 0; i11 < 8; i11++) {
            int i12 = iQ * 10;
            c(i12 >>> 28);
            iQ = i12 & 268435455;
        }
    }

    private void c(int i10) {
        byte[] bArr = this.f19458b;
        int i11 = this.f19459c + 1;
        this.f19459c = i11;
        bArr[i11] = (byte) (i10 + 48);
    }

    private String d() {
        return new String(this.f19458b, 0, 0, this.f19459c + 1);
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
        if (i10 >= 100) {
            int i11 = (i10 * 1311) >>> 17;
            c(i11);
            i10 -= i11 * 100;
        }
        int i12 = (i10 * 103) >>> 10;
        c(i12);
        c(i10 - (i12 * 10));
    }

    private void f(int i10) {
        if (i10 != 0) {
            b(i10);
        }
        g();
    }

    private void g() {
        int i10;
        byte b10;
        while (true) {
            byte[] bArr = this.f19458b;
            i10 = this.f19459c;
            b10 = bArr[i10];
            if (b10 != 48) {
                break;
            } else {
                this.f19459c = i10 - 1;
            }
        }
        if (b10 == 46) {
            this.f19459c = i10 + 1;
        }
    }

    private static long h(long j10, long j11, long j12) {
        long jF = c.f(j11, j12);
        long j13 = j10 * j12;
        long jF2 = c.f(j10, j12);
        long j14 = (j13 >>> 1) + jF;
        return (jF2 + (j14 >>> 63)) | (((j14 & Long.MAX_VALUE) + Long.MAX_VALUE) >>> 63);
    }

    private int i(long j10, int i10) {
        int iA = c.a(64 - Long.numberOfLeadingZeros(j10));
        if (j10 >= c.g(iA)) {
            iA++;
        }
        long jG = j10 * c.g(17 - iA);
        int i11 = i10 + iA;
        long jF = c.f(jG, 193428131138340668L) >>> 20;
        int i12 = (int) (jG - (100000000 * jF));
        int i13 = (int) ((1441151881 * jF) >>> 57);
        int i14 = (int) (jF - ((long) (100000000 * i13)));
        return (i11 <= 0 || i11 > 7) ? (-3 >= i11 || i11 > 0) ? l(i13, i14, i12, i11) : k(i13, i14, i12, i11) : j(i13, i14, i12, i11);
    }

    private int j(int i10, int i11, int i12, int i13) {
        c(i10);
        int iQ = q(i11);
        int i14 = 1;
        while (i14 < i13) {
            int i15 = iQ * 10;
            c(i15 >>> 28);
            iQ = i15 & 268435455;
            i14++;
        }
        a(46);
        while (i14 <= 8) {
            int i16 = iQ * 10;
            c(i16 >>> 28);
            iQ = i16 & 268435455;
            i14++;
        }
        f(i12);
        return 0;
    }

    private int k(int i10, int i11, int i12, int i13) {
        c(0);
        a(46);
        while (i13 < 0) {
            c(0);
            i13++;
        }
        c(i10);
        b(i11);
        f(i12);
        return 0;
    }

    private int l(int i10, int i11, int i12, int i13) {
        c(i10);
        a(46);
        b(i11);
        f(i12);
        e(i13 - 1);
        return 0;
    }

    private int m(double d10) {
        long jDoubleToRawLongBits = Double.doubleToRawLongBits(d10);
        long j10 = 4503599627370495L & jDoubleToRawLongBits;
        int i10 = ((int) (jDoubleToRawLongBits >>> 52)) & 2047;
        if (i10 >= 2047) {
            if (j10 != 0) {
                return 5;
            }
            return jDoubleToRawLongBits > 0 ? 3 : 4;
        }
        this.f19459c = -1;
        if (jDoubleToRawLongBits < 0) {
            a(45);
        }
        if (i10 == 0) {
            return j10 != 0 ? j10 < 3 ? n(-1074, j10 * 10, -1) : n(-1074, j10, 0) : jDoubleToRawLongBits == 0 ? 1 : 2;
        }
        int i11 = 1075 - i10;
        long j11 = j10 | 4503599627370496L;
        if ((i11 < 53) & (i11 > 0)) {
            long j12 = j11 >> i11;
            if ((j12 << i11) == j11) {
                return i(j12, 0);
            }
        }
        return n(-i11, j11, 0);
    }

    private int n(int i10, long j10, int i11) {
        long j11;
        int iB;
        long j12;
        char c10;
        char c11;
        int i12 = ((int) j10) & 1;
        long j13 = j10 << 2;
        long j14 = j13 + 2;
        if ((j10 != 4503599627370496L) || (i10 == -1074)) {
            j11 = j13 - 2;
            iB = c.a(i10);
        } else {
            j11 = j13 - 1;
            iB = c.b(i10);
        }
        int iC = i10 + c.c(-iB) + 2;
        long jE = c.e(iB);
        long jD = c.d(iB);
        long jH = h(jE, jD, j13 << iC);
        long jH2 = h(jE, jD, j11 << iC);
        long jH3 = h(jE, jD, j14 << iC);
        long j15 = jH >> 2;
        if (j15 >= 100) {
            c10 = 1;
            long jF = c.f(j15, 1844674407370955168L) * 10;
            long j16 = jF + 10;
            j12 = 1;
            c11 = 2;
            long j17 = i12;
            boolean z10 = jH2 + j17 <= (jF << 2);
            if (z10 != ((j16 << 2) + j17 <= jH3)) {
                if (!z10) {
                    jF = j16;
                }
                return i(jF, iB);
            }
        } else {
            j12 = 1;
            c10 = 1;
            c11 = 2;
        }
        long j18 = j15 + j12;
        long j19 = i12;
        boolean z11 = jH2 + j19 <= (j15 << c11);
        if (z11 != ((j18 << c11) + j19 <= jH3)) {
            if (!z11) {
                j15 = j18;
            }
            return i(j15, iB + i11);
        }
        long j20 = jH - ((j15 + j18) << c10);
        if (j20 >= 0 && (j20 != 0 || (j15 & j12) != 0)) {
            j15 = j18;
        }
        return i(j15, iB + i11);
    }

    private String o(double d10) {
        int iM = m(d10);
        return iM != 0 ? iM != 1 ? iM != 2 ? iM != 3 ? iM != 4 ? "NaN" : "-Infinity" : "Infinity" : "-0.0" : "0.0" : d();
    }

    public static String p(double d10) {
        return new a().o(d10);
    }

    private int q(int i10) {
        return ((int) (c.f(((long) (i10 + 1)) << 28, 193428131138340668L) >>> 20)) - 1;
    }
}
