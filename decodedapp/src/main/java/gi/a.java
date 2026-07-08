package gi;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final double f14510a = StrictMath.log(Double.MAX_VALUE);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final double[][] f14511b = {new double[]{1.0d, 5.669184079525E-24d}, new double[]{-0.25d, -0.25d}, new double[]{0.3333333134651184d, 1.986821492305628E-8d}, new double[]{-0.25d, -6.663542893624021E-14d}, new double[]{0.19999998807907104d, 1.1921056801463227E-8d}, new double[]{-0.1666666567325592d, -7.800414592973399E-9d}, new double[]{0.1428571343421936d, 5.650007086920087E-9d}, new double[]{-0.12502530217170715d, -7.44321345601866E-11d}, new double[]{0.11113807559013367d, 9.219544613762692E-9d}};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final double[][] f14512c = {new double[]{1.0d, -6.032174644509064E-23d}, new double[]{-0.25d, -0.25d}, new double[]{0.3333333134651184d, 1.9868161777724352E-8d}, new double[]{-0.2499999701976776d, -2.957007209750105E-8d}, new double[]{0.19999954104423523d, 1.5830993332061267E-10d}, new double[]{-0.16624879837036133d, -2.6033824355191673E-8d}};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final double[] f14513d = {0.0d, 0.1246747374534607d, 0.24740394949913025d, 0.366272509098053d, 0.4794255495071411d, 0.5850973129272461d, 0.6816387176513672d, 0.7675435543060303d, 0.8414709568023682d, 0.902267575263977d, 0.9489846229553223d, 0.9808930158615112d, 0.9974949359893799d, 0.9985313415527344d};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final double[] f14514e = {0.0d, -4.068233003401932E-9d, 9.755392680573412E-9d, 1.9987994582857286E-8d, -1.0902938113007961E-8d, -3.9986783938944604E-8d, 4.23719669792332E-8d, -5.207000323380292E-8d, 2.800552834259E-8d, 1.883511811213715E-8d, -3.5997360512765566E-9d, 4.116164446561962E-8d, 5.0614674548127384E-8d, -1.0129027912496858E-9d};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final double[] f14515f = {1.0d, 0.9921976327896118d, 0.9689123630523682d, 0.9305076599121094d, 0.8775825500488281d, 0.8109631538391113d, 0.7316888570785522d, 0.6409968137741089d, 0.5403022766113281d, 0.4311765432357788d, 0.3153223395347595d, 0.19454771280288696d, 0.07073719799518585d, -0.05417713522911072d};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final double[] f14516g = {0.0d, 3.4439717236742845E-8d, 5.865827662008209E-8d, -3.7999795083850525E-8d, 1.184154459111628E-8d, -3.43338934259355E-8d, 1.1795268640216787E-8d, 4.438921624363781E-8d, 2.925681159240093E-8d, -2.6437112632041807E-8d, 2.2860509143963117E-8d, -4.813899778443457E-9d, 3.6725170580355583E-9d, 2.0217439756338078E-10d};

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final double[] f14517h = {0.0d, 0.1256551444530487d, 0.25534194707870483d, 0.3936265707015991d, 0.5463024377822876d, 0.7214844226837158d, 0.9315965175628662d, 1.1974215507507324d, 1.5574076175689697d, 2.092571258544922d, 3.0095696449279785d, 5.041914939880371d, 14.101419448852539d, -18.430862426757812d};

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final double[] f14518i = {0.0d, -7.877917738262007E-9d, -2.5857668567479893E-8d, 5.2240336371356666E-9d, 5.206150291559893E-8d, 1.8307188599677033E-8d, -5.7618793749770706E-8d, 7.848361555046424E-8d, 1.0708593250394448E-7d, 1.7827257129423813E-8d, 2.893485277253286E-8d, 3.1660099222737955E-7d, 4.983191803254889E-7d, -3.356118100840571E-7d};

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final long[] f14519j = {2935890503282001226L, 9154082963658192752L, 3952090531849364496L, 9193070505571053912L, 7910884519577875640L, 113236205062349959L, 4577762542105553359L, -5034868814120038111L, 4208363204685324176L, 5648769086999809661L, 2819561105158720014L, -4035746434778044925L, -302932621132653753L, -2644281811660520851L, -3183605296591799669L, 6722166367014452318L, -3512299194304650054L, -7278142539171889152L};

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final long[] f14520k = {-3958705157555305932L, -4267615245585081135L};

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final double[] f14521l = {0.0d, 0.125d, 0.25d, 0.375d, 0.5d, 0.625d, 0.75d, 0.875d, 1.0d, 1.125d, 1.25d, 1.375d, 1.5d, 1.625d};

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final double[] f14522m = {0.6299605249474366d, 0.7937005259840998d, 1.0d, 1.2599210498948732d, 1.5874010519681994d};

    /* JADX INFO: renamed from: gi.a$a, reason: collision with other inner class name */
    private static class C0205a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f14523a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final double f14524b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final double f14525c;

        C0205a(double d10) {
            int i10 = (int) (0.6366197723675814d * d10);
            while (true) {
                double d11 = -i10;
                double d12 = 1.570796251296997d * d11;
                double d13 = d10 + d12;
                double d14 = 7.549789948768648E-8d * d11;
                double d15 = d14 + d13;
                double d16 = (-((d13 - d10) - d12)) + (-((d15 - d13) - d14));
                double d17 = d11 * 6.123233995736766E-17d;
                double d18 = d17 + d15;
                double d19 = d16 + (-((d18 - d15) - d17));
                if (d18 > 0.0d) {
                    this.f14523a = i10;
                    this.f14524b = d18;
                    this.f14525c = d19;
                    return;
                }
                i10--;
            }
        }

        int a() {
            return this.f14523a;
        }

        double b() {
            return this.f14524b;
        }

        double c() {
            return this.f14525c;
        }
    }

    public static double a(double d10) {
        return Double.longBitsToDouble(Double.doubleToRawLongBits(d10) & Long.MAX_VALUE);
    }

    public static double b(double d10) {
        double dH;
        double dC = 0.0d;
        if (d10 < 0.0d) {
            d10 = -d10;
        }
        if (d10 != d10 || d10 == Double.POSITIVE_INFINITY) {
            return Double.NaN;
        }
        int iA = 0;
        if (d10 > 3294198.0d) {
            double[] dArr = new double[3];
            f(d10, dArr);
            iA = ((int) dArr[0]) & 3;
            d10 = dArr[1];
            dC = dArr[2];
        } else if (d10 > 1.5707963267948966d) {
            C0205a c0205a = new C0205a(d10);
            iA = c0205a.a() & 3;
            d10 = c0205a.b();
            dC = c0205a.c();
        }
        if (iA == 0) {
            return c(d10, dC);
        }
        if (iA == 1) {
            dH = h(d10, dC);
        } else {
            if (iA != 2) {
                if (iA != 3) {
                    return Double.NaN;
                }
                return h(d10, dC);
            }
            dH = c(d10, dC);
        }
        return -dH;
    }

    private static double c(double d10, double d11) {
        double d12 = 1.5707963267948966d - d10;
        return h(d12, (-((d12 - 1.5707963267948966d) + d10)) + (6.123233995736766E-17d - d11));
    }

    private static double d(double d10) {
        return ((((((2.479773539153719E-5d * r4) - 0.0013888888689039883d) * r4) + 0.041666666666621166d) * r4) - 0.49999999999999994d) * d10 * d10;
    }

    private static double e(double d10) {
        return ((((((2.7553817452272217E-6d * r0) - 1.9841269659586505E-4d) * r0) + 0.008333333333329196d) * r0) - 0.16666666666666666d) * d10 * d10 * d10;
    }

    private static void f(double d10, double[] dArr) {
        long j10;
        long j11;
        long j12;
        long jDoubleToRawLongBits = Double.doubleToRawLongBits(d10);
        int i10 = ((int) ((jDoubleToRawLongBits >> 52) & 2047)) - 1022;
        long j13 = ((jDoubleToRawLongBits & 4503599627370495L) | 4503599627370496L) << 11;
        int i11 = i10 >> 6;
        int i12 = i10 - (i11 << 6);
        if (i12 != 0) {
            long j14 = i11 == 0 ? 0L : f14519j[i11 - 1] << i12;
            long[] jArr = f14519j;
            long j15 = jArr[i11];
            int i13 = 64 - i12;
            j10 = j14 | (j15 >>> i13);
            long j16 = jArr[i11 + 1];
            j11 = (j15 << i12) | (j16 >>> i13);
            j12 = (jArr[i11 + 2] >>> i13) | (j16 << i12);
        } else {
            j10 = i11 == 0 ? 0L : f14519j[i11 - 1];
            long[] jArr2 = f14519j;
            j11 = jArr2[i11];
            j12 = jArr2[i11 + 1];
        }
        long j17 = j13 >>> 32;
        long j18 = j13 & 4294967295L;
        long j19 = j11 >>> 32;
        long j20 = j11 & 4294967295L;
        long j21 = j17 * j19;
        long j22 = j18 * j20;
        long j23 = j19 * j18;
        long j24 = j20 * j17;
        long j25 = j22 + (j24 << 32);
        long j26 = j21 + (j24 >>> 32);
        boolean z10 = (j22 & Long.MIN_VALUE) != 0;
        boolean z11 = (j24 & 2147483648L) != 0;
        long j27 = j25 & Long.MIN_VALUE;
        boolean z12 = j27 != 0;
        if ((z10 && z11) || ((z10 || z11) && !z12)) {
            j26++;
        }
        boolean z13 = j27 != 0;
        boolean z14 = (j23 & 2147483648L) != 0;
        long j28 = j25 + (j23 << 32);
        long j29 = j26 + (j23 >>> 32);
        long j30 = j28 & Long.MIN_VALUE;
        boolean z15 = j30 != 0;
        if ((z13 && z14) || ((z13 || z14) && !z15)) {
            j29++;
        }
        long j31 = j12 >>> 32;
        long j32 = (j17 * j31) + (((j31 * j18) + ((j12 & 4294967295L) * j17)) >>> 32);
        boolean z16 = j30 != 0;
        boolean z17 = (j32 & Long.MIN_VALUE) != 0;
        long j33 = j28 + j32;
        boolean z18 = (j33 & Long.MIN_VALUE) != 0;
        if ((z16 && z17) || ((z16 || z17) && !z18)) {
            j29++;
        }
        long j34 = j10 >>> 32;
        long j35 = j10 & 4294967295L;
        long j36 = j29 + (j18 * j35) + (((j18 * j34) + (j17 * j35)) << 32);
        int i14 = (int) (j36 >>> 62);
        long j37 = (j33 >>> 62) | (j36 << 2);
        long j38 = j33 << 2;
        long j39 = j37 >>> 32;
        long j40 = j37 & 4294967295L;
        long[] jArr3 = f14520k;
        long j41 = jArr3[0];
        long j42 = j41 >>> 32;
        long j43 = j41 & 4294967295L;
        long j44 = j39 * j42;
        long j45 = j40 * j43;
        long j46 = j42 * j40;
        long j47 = j43 * j39;
        long j48 = j45 + (j47 << 32);
        long j49 = j44 + (j47 >>> 32);
        boolean z19 = (j45 & Long.MIN_VALUE) != 0;
        boolean z20 = (j47 & 2147483648L) != 0;
        long j50 = j48 & Long.MIN_VALUE;
        boolean z21 = j50 != 0;
        if ((z19 && z20) || ((z19 || z20) && !z21)) {
            j49++;
        }
        boolean z22 = j50 != 0;
        boolean z23 = (j46 & 2147483648L) != 0;
        long j51 = j48 + (j46 << 32);
        long j52 = j49 + (j46 >>> 32);
        long j53 = j51 & Long.MIN_VALUE;
        boolean z24 = j53 != 0;
        if ((z22 && z23) || ((z22 || z23) && !z24)) {
            j52++;
        }
        long j54 = jArr3[1];
        long j55 = j54 >>> 32;
        long j56 = (j39 * j55) + (((j40 * j55) + (j39 * (j54 & 4294967295L))) >>> 32);
        boolean z25 = j53 != 0;
        boolean z26 = (j56 & Long.MIN_VALUE) != 0;
        long j57 = j51 + j56;
        long j58 = j57 & Long.MIN_VALUE;
        boolean z27 = j58 != 0;
        if ((z25 && z26) || ((z25 || z26) && !z27)) {
            j52++;
        }
        long j59 = j38 >>> 32;
        long j60 = j41 >>> 32;
        long j61 = (j59 * j60) + ((((j38 & 4294967295L) * j60) + (j59 * (j41 & 4294967295L))) >>> 32);
        boolean z28 = j58 != 0;
        boolean z29 = (j61 & Long.MIN_VALUE) != 0;
        boolean z30 = ((j57 + j61) & Long.MIN_VALUE) != 0;
        if ((z28 && z29) || ((z28 || z29) && !z30)) {
            j52++;
        }
        double d11 = (j52 >>> 12) / 4.503599627370496E15d;
        double d12 = ((((j52 & 4095) << 40) + (r32 >>> 24)) / 4.503599627370496E15d) / 4.503599627370496E15d;
        double d13 = d11 + d12;
        dArr[0] = i14;
        dArr[1] = d13 * 2.0d;
        dArr[2] = (-((d13 - d11) - d12)) * 2.0d;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0080  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static double g(double r12) {
        /*
            r0 = 1
            r1 = 0
            r2 = 0
            int r4 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r4 >= 0) goto Lb
            double r4 = -r12
            r6 = 1
            goto Ld
        Lb:
            r6 = 0
            r4 = r12
        Ld:
            int r7 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r7 != 0) goto L1f
            long r12 = java.lang.Double.doubleToRawLongBits(r12)
            r0 = 0
            int r4 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r4 >= 0) goto L1e
            r12 = -9223372036854775808
            return r12
        L1e:
            return r2
        L1f:
            r12 = 9221120237041090560(0x7ff8000000000000, double:NaN)
            int r7 = (r4 > r4 ? 1 : (r4 == r4 ? 0 : -1))
            if (r7 != 0) goto L84
            r7 = 9218868437227405312(0x7ff0000000000000, double:Infinity)
            int r9 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r9 != 0) goto L2c
            goto L84
        L2c:
            r7 = 4704328647685701632(0x414921fb00000000, double:3294198.0)
            r9 = 2
            r10 = 3
            int r11 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r11 <= 0) goto L46
            double[] r2 = new double[r10]
            f(r4, r2)
            r3 = r2[r1]
            int r1 = (int) r3
            r1 = r1 & r10
            r4 = r2[r0]
            r7 = r2[r9]
        L44:
            r2 = r7
            goto L63
        L46:
            r7 = 4609753056924675352(0x3ff921fb54442d18, double:1.5707963267948966)
            int r11 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r11 <= 0) goto L63
            gi.a$a r1 = new gi.a$a
            r1.<init>(r4)
            int r2 = r1.a()
            r2 = r2 & r10
            double r4 = r1.b()
            double r7 = r1.c()
            r1 = r2
            goto L44
        L63:
            if (r6 == 0) goto L67
            r1 = r1 ^ 2
        L67:
            if (r1 == 0) goto L80
            if (r1 == r0) goto L7b
            if (r1 == r9) goto L76
            if (r1 == r10) goto L70
            return r12
        L70:
            double r12 = c(r4, r2)
        L74:
            double r12 = -r12
            return r12
        L76:
            double r12 = h(r4, r2)
            goto L74
        L7b:
            double r12 = c(r4, r2)
            return r12
        L80:
            double r12 = h(r4, r2)
        L84:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: gi.a.g(double):double");
    }

    private static double h(double d10, double d11) {
        int i10 = (int) ((8.0d * d10) + 0.5d);
        double d12 = d10 - f14521l[i10];
        double d13 = f14513d[i10];
        double d14 = f14514e[i10];
        double d15 = f14515f[i10];
        double d16 = f14516g[i10];
        double dE = e(d12);
        double d17 = d(d12);
        double d18 = 1.073741824E9d * d12;
        double d19 = (d12 + d18) - d18;
        double d20 = dE + (d12 - d19);
        double d21 = d13 + 0.0d;
        double d22 = d15 * d19;
        double d23 = d21 + d22;
        double d24 = (-((d21 - 0.0d) - d13)) + 0.0d + (-((d23 - d21) - d22)) + (d13 * d17) + (d15 * d20) + d14 + (d16 * d19) + (d14 * d17) + (d16 * d20);
        if (d11 != 0.0d) {
            double d25 = (((d15 + d16) * (d17 + 1.0d)) - ((d13 + d14) * (d19 + d20))) * d11;
            double d26 = d23 + d25;
            d24 += -((d26 - d23) - d25);
            d23 = d26;
        }
        return d23 + d24;
    }

    public static double i(double d10) {
        return Math.sqrt(d10);
    }
}
