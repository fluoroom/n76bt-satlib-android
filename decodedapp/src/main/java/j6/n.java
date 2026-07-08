package j6;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes.dex */
abstract class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final double f18453a = Math.cos(0.7853981633974483d);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final double f18454b = Math.sin(0.7853981633974483d);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile a[] f18455c = new a[20];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static volatile a[] f18456d = new a[20];

    static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        double f18460a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        double f18461b;

        b() {
        }

        void a(a aVar, int i10) {
            this.f18460a += aVar.s(i10);
            this.f18461b += aVar.h(i10);
        }

        void b(b bVar) {
            this.f18460a += bVar.f18460a;
            this.f18461b += bVar.f18461b;
        }

        void c(b bVar, b bVar2) {
            bVar2.f18460a = this.f18460a + bVar.f18460a;
            bVar2.f18461b = this.f18461b + bVar.f18461b;
        }

        void d(a aVar, int i10) {
            this.f18460a -= aVar.h(i10);
            this.f18461b += aVar.s(i10);
        }

        void e(b bVar) {
            this.f18460a -= bVar.f18461b;
            this.f18461b += bVar.f18460a;
        }

        void f(b bVar, b bVar2) {
            bVar2.f18460a = this.f18460a - bVar.f18461b;
            bVar2.f18461b = this.f18461b + bVar.f18460a;
        }

        void g(a aVar, int i10) {
            aVar.t(i10, this.f18460a);
            aVar.i(i10, this.f18461b);
        }

        void h(b bVar) {
            double d10 = this.f18460a;
            this.f18460a = k.a(d10, bVar.f18460a, (-this.f18461b) * bVar.f18461b);
            this.f18461b = k.a(d10, bVar.f18461b, this.f18461b * bVar.f18460a);
        }

        void i(b bVar) {
            double d10 = this.f18460a;
            this.f18460a = k.a(d10, bVar.f18460a, this.f18461b * bVar.f18461b);
            this.f18461b = k.a(-d10, bVar.f18461b, this.f18461b * bVar.f18460a);
        }

        void j(a aVar, int i10) {
            this.f18460a = aVar.s(i10);
            this.f18461b = aVar.h(i10);
        }

        void k(b bVar) {
            double d10 = this.f18460a;
            double d11 = this.f18461b;
            bVar.f18460a = k.a(d10, d10, (-d11) * d11);
            bVar.f18461b = this.f18460a * 2.0d * this.f18461b;
        }

        void l(a aVar, int i10) {
            this.f18460a -= aVar.s(i10);
            this.f18461b -= aVar.h(i10);
        }

        void m(b bVar) {
            this.f18460a -= bVar.f18460a;
            this.f18461b -= bVar.f18461b;
        }

        void n(b bVar, a aVar, int i10) {
            aVar.t(i10, this.f18460a - bVar.f18460a);
            aVar.i(i10, this.f18461b - bVar.f18461b);
        }

        void o(b bVar, b bVar2) {
            bVar2.f18460a = this.f18460a - bVar.f18460a;
            bVar2.f18461b = this.f18461b - bVar.f18461b;
        }

        void p(a aVar, int i10) {
            this.f18460a += aVar.h(i10);
            this.f18461b -= aVar.s(i10);
        }

        void q(b bVar) {
            this.f18460a += bVar.f18461b;
            this.f18461b -= bVar.f18460a;
        }

        void r(b bVar, b bVar2) {
            bVar2.f18460a = this.f18460a + bVar.f18461b;
            bVar2.f18461b = this.f18461b - bVar.f18460a;
        }
    }

    static int a(int i10) {
        if (i10 <= 9728) {
            return 19;
        }
        if (i10 <= 18432) {
            return 18;
        }
        if (i10 <= 69632) {
            return 17;
        }
        if (i10 <= 262144) {
            return 16;
        }
        if (i10 <= 983040) {
            return 15;
        }
        if (i10 <= 3670016) {
            return 14;
        }
        if (i10 <= 13631488) {
            return 13;
        }
        if (i10 <= 25165824) {
            return 12;
        }
        if (i10 <= 92274688) {
            return 11;
        }
        if (i10 <= 335544320) {
            return 10;
        }
        return i10 <= 1207959552 ? 9 : 8;
    }

    private static a b(int i10) {
        if (i10 == 1) {
            a aVar = new a(1);
            aVar.t(0, 1.0d);
            aVar.i(0, 0.0d);
            return aVar;
        }
        a aVar2 = new a(i10);
        aVar2.v(0, 1.0d, 0.0d);
        int i11 = i10 / 2;
        aVar2.v(i11, f18453a, f18454b);
        double d10 = 1.5707963267948966d / ((double) i10);
        int i12 = 1;
        while (i12 < i11) {
            double d11 = ((double) i12) * d10;
            double dCos = Math.cos(d11);
            double dSin = Math.sin(d11);
            aVar2.v(i12, dCos, dSin);
            int i13 = i12;
            aVar2.v(i10 - i13, dSin, dCos);
            i12 = i13 + 1;
        }
        return aVar2;
    }

    private static void c(a aVar, a[] aVarArr) {
        int i10 = aVar.f18458b;
        int iNumberOfLeadingZeros = 31 - Integer.numberOfLeadingZeros(i10);
        b bVar = new b();
        b bVar2 = new b();
        b bVar3 = new b();
        b bVar4 = new b();
        b bVar5 = new b();
        b bVar6 = new b();
        while (iNumberOfLeadingZeros >= 2) {
            a aVar2 = aVarArr[iNumberOfLeadingZeros - 2];
            int i11 = 1 << iNumberOfLeadingZeros;
            for (int i12 = 0; i12 < i10; i12 += i11) {
                int i13 = 0;
                while (true) {
                    int i14 = i11 / 4;
                    if (i13 < i14) {
                        bVar5.j(aVar2, i13);
                        bVar5.k(bVar6);
                        int i15 = i12 + i13;
                        int i16 = i14 + i15;
                        int i17 = i15 + (i11 / 2);
                        int i18 = iNumberOfLeadingZeros;
                        int i19 = i15 + ((i11 * 3) / 4);
                        aVar.c(i15, aVar, i16, bVar);
                        bVar.a(aVar, i17);
                        bVar.a(aVar, i19);
                        aVar.y(i15, aVar, i16, bVar2);
                        bVar2.l(aVar, i17);
                        bVar2.d(aVar, i19);
                        bVar2.i(bVar5);
                        aVar.x(i15, aVar, i16, bVar3);
                        bVar3.a(aVar, i17);
                        bVar3.l(aVar, i19);
                        bVar3.i(bVar6);
                        aVar.d(i15, aVar, i16, bVar4);
                        bVar4.l(aVar, i17);
                        bVar4.p(aVar, i19);
                        bVar4.h(bVar5);
                        bVar.g(aVar, i15);
                        bVar2.g(aVar, i16);
                        bVar3.g(aVar, i17);
                        bVar4.g(aVar, i19);
                        i13++;
                        iNumberOfLeadingZeros = i18;
                    }
                }
            }
            iNumberOfLeadingZeros -= 2;
        }
        if (iNumberOfLeadingZeros > 0) {
            for (int i20 = 0; i20 < i10; i20 += 2) {
                aVar.g(i20, bVar);
                int i21 = i20 + 1;
                aVar.g(i21, bVar2);
                aVar.b(i20, bVar2);
                bVar.n(bVar2, aVar, i21);
            }
        }
    }

    private static void d(a aVar, a aVar2, a aVar3, int i10, double d10) {
        double dSqrt = ((double) i10) * (-0.5d) * Math.sqrt(3.0d);
        for (int i11 = 0; i11 < aVar.f18458b; i11++) {
            double dS = aVar.s(i11) + aVar2.s(i11) + aVar3.s(i11);
            double dH = aVar.h(i11) + aVar2.h(i11) + aVar3.h(i11);
            double dH2 = (aVar3.h(i11) - aVar2.h(i11)) * dSqrt;
            double dS2 = (aVar2.s(i11) - aVar3.s(i11)) * dSqrt;
            double dS3 = (aVar2.s(i11) + aVar3.s(i11)) * 0.5d;
            double dH3 = (aVar2.h(i11) + aVar3.h(i11)) * 0.5d;
            double dS4 = (aVar.s(i11) - dS3) + dH2;
            double dH4 = (aVar.h(i11) + dS2) - dH3;
            double dS5 = (aVar.s(i11) - dS3) - dH2;
            double dH5 = (aVar.h(i11) - dS2) - dH3;
            aVar.t(i11, dS * d10);
            aVar.i(i11, dH * d10);
            aVar2.t(i11, dS4 * d10);
            aVar2.i(i11, dH4 * d10);
            aVar3.t(i11, dS5 * d10);
            aVar3.i(i11, dH5 * d10);
        }
    }

    private static void e(a aVar, a[] aVarArr, a aVar2) {
        int i10 = aVar.f18458b / 3;
        a aVar3 = new a(aVar, 0, i10);
        int i11 = i10 * 2;
        a aVar4 = new a(aVar, i10, i11);
        a aVar5 = new a(aVar, i11, aVar.f18458b);
        d(aVar3, aVar4, aVar5, 1, 1.0d);
        b bVar = new b();
        for (int i12 = 0; i12 < aVar.f18458b / 4; i12++) {
            bVar.j(aVar2, i12);
            aVar4.m(i12, bVar);
            aVar5.m(i12, bVar);
            aVar5.m(i12, bVar);
        }
        for (int i13 = aVar.f18458b / 4; i13 < i10; i13++) {
            bVar.j(aVar2, i13 - (aVar.f18458b / 4));
            aVar4.o(i13, bVar);
            aVar5.o(i13, bVar);
            aVar5.o(i13, bVar);
        }
        c(aVar3, aVarArr);
        c(aVar4, aVarArr);
        c(aVar5, aVarArr);
    }

    static BigInteger f(a aVar, int i10, int i11) {
        int i12 = i11;
        long j10 = i12;
        int iMin = (int) Math.min(aVar.f18458b, (2147483648L / j10) + 1);
        int i13 = (int) ((((((long) iMin) * j10) + 31) * 8) / 32);
        byte[] bArr = new byte[i13];
        int i14 = 1;
        int i15 = (1 << i12) - 1;
        int i16 = 32 - i12;
        int i17 = (i13 * 8) - i12;
        int i18 = 0;
        int i19 = i13 - 4;
        int iMin2 = Math.min(Math.max(0, i17 >> 3), i19);
        long j11 = 0;
        int i20 = 0;
        int i21 = 0;
        while (i20 <= i14) {
            int i22 = 0;
            while (i22 < iMin) {
                long jRound = Math.round(aVar.r(i22, i20)) + j11;
                long j12 = jRound >> i12;
                int iMin3 = Math.min(Math.max(i18, i17 >> 3), i19);
                i21 = (int) (((jRound & ((long) i15)) << ((i16 - i17) + (iMin3 << 3))) | ((long) (i21 >>> ((iMin2 - iMin3) << 3))));
                k.n(bArr, iMin3, i21);
                i17 -= i11;
                i22++;
                i12 = i11;
                iMin2 = iMin3;
                j11 = j12;
                i19 = i19;
                i18 = 0;
            }
            i20++;
            i12 = i11;
            i14 = 1;
            i18 = 0;
        }
        return new BigInteger(i10, bArr);
    }

    private static a[] g(int i10) {
        a[] aVarArr = new a[i10 + 1];
        while (i10 >= 0) {
            if (i10 < 20) {
                if (f18455c[i10] == null) {
                    f18455c[i10] = b(1 << i10);
                }
                aVarArr[i10] = f18455c[i10];
            } else {
                aVarArr[i10] = b(1 << i10);
            }
            i10 -= 2;
        }
        return aVarArr;
    }

    private static a h(int i10) {
        if (i10 >= 20) {
            return b(3 << i10);
        }
        if (f18456d[i10] == null) {
            f18456d[i10] = b(3 << i10);
        }
        return f18456d[i10];
    }

    private static void i(a aVar, a[] aVarArr) {
        int i10;
        int i11;
        int i12 = aVar.f18458b;
        int iNumberOfLeadingZeros = 31 - Integer.numberOfLeadingZeros(i12);
        b bVar = new b();
        b bVar2 = new b();
        b bVar3 = new b();
        b bVar4 = new b();
        b bVar5 = new b();
        b bVar6 = new b();
        b bVar7 = new b();
        b bVar8 = new b();
        int i13 = 1;
        if (iNumberOfLeadingZeros % 2 != 0) {
            for (int i14 = 0; i14 < i12; i14 += 2) {
                int i15 = i14 + 1;
                aVar.g(i15, bVar3);
                aVar.g(i14, bVar);
                aVar.b(i14, bVar3);
                bVar.n(bVar3, aVar, i15);
            }
            i10 = 2;
        } else {
            i10 = 1;
        }
        b bVar9 = new b();
        b bVar10 = new b();
        while (i10 <= iNumberOfLeadingZeros) {
            a aVar2 = aVarArr[i10 - 1];
            int i16 = i13 << (i10 + 1);
            int i17 = 0;
            while (i17 < i12) {
                int i18 = i10;
                int i19 = 0;
                while (true) {
                    i11 = i17;
                    int i20 = i16 / 4;
                    if (i19 < i20) {
                        bVar9.j(aVar2, i19);
                        bVar9.k(bVar10);
                        int i21 = i19;
                        int i22 = i11 + i21;
                        int i23 = i20 + i22;
                        a aVar3 = aVar2;
                        int i24 = i22 + (i16 / 2);
                        int i25 = iNumberOfLeadingZeros;
                        int i26 = i22 + ((i16 * 3) / 4);
                        aVar.g(i22, bVar);
                        aVar.p(i23, bVar9, bVar2);
                        aVar.p(i24, bVar10, bVar3);
                        aVar.n(i26, bVar9, bVar4);
                        bVar.c(bVar2, bVar5);
                        bVar5.b(bVar3);
                        bVar5.b(bVar4);
                        bVar.f(bVar2, bVar6);
                        bVar6.m(bVar3);
                        bVar6.q(bVar4);
                        bVar.o(bVar2, bVar7);
                        bVar7.b(bVar3);
                        bVar7.m(bVar4);
                        bVar.r(bVar2, bVar8);
                        bVar8.m(bVar3);
                        bVar8.e(bVar4);
                        bVar5.g(aVar, i22);
                        bVar6.g(aVar, i23);
                        bVar7.g(aVar, i24);
                        bVar8.g(aVar, i26);
                        i19 = i21 + 1;
                        i17 = i11;
                        aVar2 = aVar3;
                        iNumberOfLeadingZeros = i25;
                    }
                }
                i17 = i11 + i16;
                i10 = i18;
            }
            i10 += 2;
            i13 = 1;
        }
        int i27 = iNumberOfLeadingZeros;
        for (int i28 = 0; i28 < i12; i28++) {
            aVar.z(i28, -i27);
        }
    }

    private static void j(a aVar, a[] aVarArr, a aVar2) {
        int i10 = aVar.f18458b / 3;
        a aVar3 = new a(aVar, 0, i10);
        int i11 = i10 * 2;
        a aVar4 = new a(aVar, i10, i11);
        a aVar5 = new a(aVar, i11, aVar.f18458b);
        i(aVar3, aVarArr);
        i(aVar4, aVarArr);
        i(aVar5, aVarArr);
        b bVar = new b();
        for (int i12 = 0; i12 < aVar.f18458b / 4; i12++) {
            bVar.j(aVar2, i12);
            aVar4.k(i12, bVar);
            aVar5.k(i12, bVar);
            aVar5.k(i12, bVar);
        }
        for (int i13 = aVar.f18458b / 4; i13 < i10; i13++) {
            bVar.j(aVar2, i13 - (aVar.f18458b / 4));
            aVar4.l(i13, bVar);
            aVar5.l(i13, bVar);
            aVar5.l(i13, bVar);
        }
        d(aVar3, aVar4, aVar5, -1, 0.3333333333333333d);
    }

    static BigInteger k(BigInteger bigInteger, BigInteger bigInteger2) {
        if (bigInteger2.signum() == 0 || bigInteger.signum() == 0) {
            return BigInteger.ZERO;
        }
        if (bigInteger2 == bigInteger) {
            return m(bigInteger2);
        }
        int iBitLength = bigInteger.bitLength();
        int iBitLength2 = bigInteger2.bitLength();
        if (((long) iBitLength) + ((long) iBitLength2) <= 2147483648L) {
            return (iBitLength <= 1920 || iBitLength2 <= 1920 || (iBitLength <= 33220 && iBitLength2 <= 33220)) ? bigInteger.multiply(bigInteger2) : l(bigInteger, bigInteger2);
        }
        throw new ArithmeticException("BigInteger would overflow supported range");
    }

    static BigInteger l(BigInteger bigInteger, BigInteger bigInteger2) {
        int iSignum = bigInteger.signum() * bigInteger2.signum();
        if (bigInteger.signum() < 0) {
            bigInteger = bigInteger.negate();
        }
        byte[] byteArray = bigInteger.toByteArray();
        if (bigInteger2.signum() < 0) {
            bigInteger2 = bigInteger2.negate();
        }
        byte[] byteArray2 = bigInteger2.toByteArray();
        int iMax = Math.max(byteArray.length, byteArray2.length) * 8;
        int iA = a(iMax);
        int i10 = ((iMax + iA) - 1) / iA;
        int i11 = i10 + 1;
        int iNumberOfLeadingZeros = Integer.numberOfLeadingZeros(i10);
        int i12 = 32 - iNumberOfLeadingZeros;
        int i13 = 1 << i12;
        int i14 = (i13 * 3) / 4;
        if (i11 >= i14 || i12 <= 3) {
            a[] aVarArrG = g(i12);
            a aVarO = o(byteArray, i13, iA);
            aVarO.f(aVarArrG[i12]);
            c(aVarO, aVarArrG);
            a aVarO2 = o(byteArray2, i13, iA);
            aVarO2.f(aVarArrG[i12]);
            c(aVarO2, aVarArrG);
            aVarO.q(aVarO2);
            i(aVarO, aVarArrG);
            aVarO.e(aVarArrG[i12]);
            return f(aVarO, iSignum, iA);
        }
        int i15 = 30 - iNumberOfLeadingZeros;
        a[] aVarArrG2 = g(i15);
        a aVarH = h(i15);
        a aVarH2 = h(28 - iNumberOfLeadingZeros);
        a aVarO3 = o(byteArray, i14, iA);
        aVarO3.f(aVarH);
        e(aVarO3, aVarArrG2, aVarH2);
        a aVarO4 = o(byteArray2, i14, iA);
        aVarO4.f(aVarH);
        e(aVarO4, aVarArrG2, aVarH2);
        aVarO3.q(aVarO4);
        j(aVarO3, aVarArrG2, aVarH2);
        aVarO3.e(aVarH);
        return f(aVarO3, iSignum, iA);
    }

    static BigInteger m(BigInteger bigInteger) {
        return bigInteger.signum() == 0 ? BigInteger.ZERO : bigInteger.bitLength() < 33220 ? bigInteger.multiply(bigInteger) : n(bigInteger);
    }

    static BigInteger n(BigInteger bigInteger) {
        byte[] byteArray = bigInteger.toByteArray();
        int length = byteArray.length * 8;
        int iA = a(length);
        int i10 = ((length + iA) - 1) / iA;
        int i11 = i10 + 1;
        int iNumberOfLeadingZeros = Integer.numberOfLeadingZeros(i10);
        int i12 = 32 - iNumberOfLeadingZeros;
        int i13 = 1 << i12;
        int i14 = (i13 * 3) / 4;
        if (i11 >= i14) {
            a aVarO = o(byteArray, i13, iA);
            a[] aVarArrG = g(i12);
            aVarO.f(aVarArrG[i12]);
            c(aVarO, aVarArrG);
            aVarO.w();
            i(aVarO, aVarArrG);
            aVarO.e(aVarArrG[i12]);
            return f(aVarO, 1, iA);
        }
        a aVarO2 = o(byteArray, i14, iA);
        int i15 = 30 - iNumberOfLeadingZeros;
        a[] aVarArrG2 = g(i15);
        a aVarH = h(i15);
        a aVarH2 = h(28 - iNumberOfLeadingZeros);
        aVarO2.f(aVarH);
        e(aVarO2, aVarArrG2, aVarH2);
        aVarO2.w();
        j(aVarO2, aVarArrG2, aVarH2);
        aVarO2.e(aVarH);
        return f(aVarO2, 1, iA);
    }

    static a o(byte[] bArr, int i10, int i11) {
        a aVar = new a(i10);
        if (bArr.length < 4) {
            byte[] bArr2 = new byte[4];
            System.arraycopy(bArr, 0, bArr2, 4 - bArr.length, bArr.length);
            bArr = bArr2;
        }
        int i12 = 1 << i11;
        int i13 = i12 / 2;
        int i14 = i12 - 1;
        int i15 = 32 - i11;
        int length = (bArr.length * 8) - i11;
        int iE = 0;
        int i16 = 0;
        while (length > (-i11)) {
            int iMin = Math.min(Math.max(0, length >> 3), bArr.length - 4);
            iE = (i13 - (((k.e(bArr, iMin) >>> ((i15 - length) + (iMin << 3))) & i14) + iE)) >>> 31;
            aVar.t(i16, r9 - ((-iE) & i12));
            i16++;
            length -= i11;
        }
        if (iE > 0) {
            aVar.t(i16, iE);
        }
        return aVar;
    }

    static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final double[] f18457a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f18458b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f18459c;

        a(int i10) {
            this.f18457a = new double[i10 << 1];
            this.f18458b = i10;
            this.f18459c = 0;
        }

        private int j(int i10) {
            return (i10 << 1) + this.f18459c + 1;
        }

        private int u(int i10) {
            return (i10 << 1) + this.f18459c;
        }

        void b(int i10, b bVar) {
            double[] dArr = this.f18457a;
            int iU = u(i10);
            dArr[iU] = dArr[iU] + bVar.f18460a;
            double[] dArr2 = this.f18457a;
            int iJ = j(i10);
            dArr2[iJ] = dArr2[iJ] + bVar.f18461b;
        }

        void c(int i10, a aVar, int i11, b bVar) {
            bVar.f18460a = this.f18457a[u(i10)] + aVar.s(i11);
            bVar.f18461b = this.f18457a[j(i10)] + aVar.h(i11);
        }

        void d(int i10, a aVar, int i11, b bVar) {
            bVar.f18460a = this.f18457a[u(i10)] - aVar.h(i11);
            bVar.f18461b = this.f18457a[j(i10)] + aVar.s(i11);
        }

        void e(a aVar) {
            int i10 = aVar.f18459c;
            double[] dArr = aVar.f18457a;
            int i11 = this.f18459c;
            int i12 = (this.f18458b + i11) << 1;
            while (i11 < i12) {
                double[] dArr2 = this.f18457a;
                double d10 = dArr2[i11];
                int i13 = i11 + 1;
                double d11 = dArr2[i13];
                int i14 = i10 + 1;
                dArr2[i11] = k.a(d10, dArr[i10], dArr[i14] * d11);
                this.f18457a[i13] = k.a(-d10, dArr[i14], d11 * dArr[i10]);
                i10 += 2;
                i11 += 2;
            }
        }

        void f(a aVar) {
            int i10 = aVar.f18459c;
            double[] dArr = aVar.f18457a;
            int i11 = this.f18459c;
            int i12 = (this.f18458b + i11) << 1;
            while (i11 < i12) {
                double[] dArr2 = this.f18457a;
                double d10 = dArr2[i11];
                dArr2[i11] = dArr[i10] * d10;
                dArr2[i11 + 1] = d10 * dArr[i10 + 1];
                i10 += 2;
                i11 += 2;
            }
        }

        void g(int i10, b bVar) {
            bVar.f18460a = this.f18457a[u(i10)];
            bVar.f18461b = this.f18457a[j(i10)];
        }

        double h(int i10) {
            return this.f18457a[(i10 << 1) + this.f18459c + 1];
        }

        void i(int i10, double d10) {
            this.f18457a[(i10 << 1) + this.f18459c + 1] = d10;
        }

        void k(int i10, b bVar) {
            int iU = u(i10);
            int iJ = j(i10);
            double[] dArr = this.f18457a;
            double d10 = dArr[iU];
            double d11 = dArr[iJ];
            dArr[iU] = k.a(d10, bVar.f18460a, (-d11) * bVar.f18461b);
            this.f18457a[iJ] = k.a(d10, bVar.f18461b, bVar.f18460a * d11);
        }

        void l(int i10, b bVar) {
            int iU = u(i10);
            int iJ = j(i10);
            double[] dArr = this.f18457a;
            double d10 = dArr[iU];
            double d11 = -dArr[iJ];
            dArr[iU] = k.a(-d10, bVar.f18461b, bVar.f18460a * d11);
            this.f18457a[iJ] = k.a(d10, bVar.f18460a, d11 * bVar.f18461b);
        }

        void m(int i10, b bVar) {
            int iU = u(i10);
            int iJ = j(i10);
            double[] dArr = this.f18457a;
            double d10 = dArr[iU];
            double d11 = dArr[iJ];
            dArr[iU] = k.a(d10, bVar.f18460a, bVar.f18461b * d11);
            this.f18457a[iJ] = k.a(-d10, bVar.f18461b, d11 * bVar.f18460a);
        }

        void n(int i10, b bVar, b bVar2) {
            double d10 = this.f18457a[u(i10)];
            double d11 = this.f18457a[j(i10)];
            bVar2.f18460a = k.a(d10, bVar.f18460a, d11 * bVar.f18461b);
            bVar2.f18461b = k.a(-d10, bVar.f18461b, d11 * bVar.f18460a);
        }

        void o(int i10, b bVar) {
            int iU = u(i10);
            int iJ = j(i10);
            double[] dArr = this.f18457a;
            double d10 = dArr[iU];
            double d11 = dArr[iJ];
            double d12 = -d10;
            dArr[iU] = k.a(d12, bVar.f18461b, d11 * bVar.f18460a);
            this.f18457a[iJ] = k.a(d12, bVar.f18460a, (-d11) * bVar.f18461b);
        }

        void p(int i10, b bVar, b bVar2) {
            double d10 = this.f18457a[u(i10)];
            double d11 = this.f18457a[j(i10)];
            bVar2.f18460a = k.a(d10, bVar.f18460a, bVar.f18461b * (-d11));
            bVar2.f18461b = k.a(d10, bVar.f18461b, d11 * bVar.f18460a);
        }

        void q(a aVar) {
            int i10 = aVar.f18459c;
            double[] dArr = aVar.f18457a;
            int i11 = this.f18459c;
            int i12 = (this.f18458b + i11) << 1;
            while (i11 < i12) {
                double[] dArr2 = this.f18457a;
                double d10 = dArr2[i11];
                int i13 = i11 + 1;
                double d11 = dArr2[i13];
                double d12 = dArr[i10];
                double d13 = dArr[i10 + 1];
                dArr2[i11] = k.a(d10, d12, (-d11) * d13);
                this.f18457a[i13] = k.a(d10, d13, d11 * d12);
                i10 += 2;
                i11 += 2;
            }
        }

        double r(int i10, int i11) {
            return this.f18457a[(i10 << 1) + i11];
        }

        double s(int i10) {
            return this.f18457a[(i10 << 1) + this.f18459c];
        }

        void t(int i10, double d10) {
            this.f18457a[(i10 << 1) + this.f18459c] = d10;
        }

        void v(int i10, double d10, double d11) {
            int iU = u(i10);
            double[] dArr = this.f18457a;
            dArr[iU] = d10;
            dArr[iU + 1] = d11;
        }

        void w() {
            int i10 = this.f18459c;
            int i11 = (this.f18458b + i10) << 1;
            while (i10 < i11) {
                double[] dArr = this.f18457a;
                double d10 = dArr[i10];
                int i12 = i10 + 1;
                double d11 = dArr[i12];
                dArr[i10] = k.a(d10, d10, (-d11) * d11);
                this.f18457a[i12] = d10 * 2.0d * d11;
                i10 += 2;
            }
        }

        void x(int i10, a aVar, int i11, b bVar) {
            bVar.f18460a = this.f18457a[u(i10)] - aVar.s(i11);
            bVar.f18461b = this.f18457a[j(i10)] - aVar.h(i11);
        }

        void y(int i10, a aVar, int i11, b bVar) {
            bVar.f18460a = this.f18457a[u(i10)] + aVar.h(i11);
            bVar.f18461b = this.f18457a[j(i10)] - aVar.s(i11);
        }

        void z(int i10, int i11) {
            int iU = u(i10);
            int iJ = j(i10);
            double[] dArr = this.f18457a;
            double d10 = dArr[iU];
            double d11 = dArr[iJ];
            long j10 = i11;
            dArr[iU] = j.a(d10, j10);
            this.f18457a[iJ] = j.a(d11, j10);
        }

        a(a aVar, int i10, int i11) {
            this.f18458b = i11 - i10;
            this.f18457a = aVar.f18457a;
            this.f18459c = i10 << 1;
        }
    }
}
