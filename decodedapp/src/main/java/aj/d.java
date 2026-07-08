package aj;

/* JADX INFO: loaded from: classes3.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final double f639a = StrictMath.log(Double.MAX_VALUE);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final double[][] f640b = {new double[]{1.0d, 5.669184079525E-24d}, new double[]{-0.25d, -0.25d}, new double[]{0.3333333134651184d, 1.986821492305628E-8d}, new double[]{-0.25d, -6.663542893624021E-14d}, new double[]{0.19999998807907104d, 1.1921056801463227E-8d}, new double[]{-0.1666666567325592d, -7.800414592973399E-9d}, new double[]{0.1428571343421936d, 5.650007086920087E-9d}, new double[]{-0.12502530217170715d, -7.44321345601866E-11d}, new double[]{0.11113807559013367d, 9.219544613762692E-9d}};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final double[][] f641c = {new double[]{1.0d, -6.032174644509064E-23d}, new double[]{-0.25d, -0.25d}, new double[]{0.3333333134651184d, 1.9868161777724352E-8d}, new double[]{-0.2499999701976776d, -2.957007209750105E-8d}, new double[]{0.19999954104423523d, 1.5830993332061267E-10d}, new double[]{-0.16624879837036133d, -2.6033824355191673E-8d}};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final double[] f642d = {0.0d, 0.1246747374534607d, 0.24740394949913025d, 0.366272509098053d, 0.4794255495071411d, 0.5850973129272461d, 0.6816387176513672d, 0.7675435543060303d, 0.8414709568023682d, 0.902267575263977d, 0.9489846229553223d, 0.9808930158615112d, 0.9974949359893799d, 0.9985313415527344d};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final double[] f643e = {0.0d, -4.068233003401932E-9d, 9.755392680573412E-9d, 1.9987994582857286E-8d, -1.0902938113007961E-8d, -3.9986783938944604E-8d, 4.23719669792332E-8d, -5.207000323380292E-8d, 2.800552834259E-8d, 1.883511811213715E-8d, -3.5997360512765566E-9d, 4.116164446561962E-8d, 5.0614674548127384E-8d, -1.0129027912496858E-9d};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final double[] f644f = {1.0d, 0.9921976327896118d, 0.9689123630523682d, 0.9305076599121094d, 0.8775825500488281d, 0.8109631538391113d, 0.7316888570785522d, 0.6409968137741089d, 0.5403022766113281d, 0.4311765432357788d, 0.3153223395347595d, 0.19454771280288696d, 0.07073719799518585d, -0.05417713522911072d};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final double[] f645g = {0.0d, 3.4439717236742845E-8d, 5.865827662008209E-8d, -3.7999795083850525E-8d, 1.184154459111628E-8d, -3.43338934259355E-8d, 1.1795268640216787E-8d, 4.438921624363781E-8d, 2.925681159240093E-8d, -2.6437112632041807E-8d, 2.2860509143963117E-8d, -4.813899778443457E-9d, 3.6725170580355583E-9d, 2.0217439756338078E-10d};

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final double[] f646h = {0.0d, 0.1256551444530487d, 0.25534194707870483d, 0.3936265707015991d, 0.5463024377822876d, 0.7214844226837158d, 0.9315965175628662d, 1.1974215507507324d, 1.5574076175689697d, 2.092571258544922d, 3.0095696449279785d, 5.041914939880371d, 14.101419448852539d, -18.430862426757812d};

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final double[] f647i = {0.0d, -7.877917738262007E-9d, -2.5857668567479893E-8d, 5.2240336371356666E-9d, 5.206150291559893E-8d, 1.8307188599677033E-8d, -5.7618793749770706E-8d, 7.848361555046424E-8d, 1.0708593250394448E-7d, 1.7827257129423813E-8d, 2.893485277253286E-8d, 3.1660099222737955E-7d, 4.983191803254889E-7d, -3.356118100840571E-7d};

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final long[] f648j = {2935890503282001226L, 9154082963658192752L, 3952090531849364496L, 9193070505571053912L, 7910884519577875640L, 113236205062349959L, 4577762542105553359L, -5034868814120038111L, 4208363204685324176L, 5648769086999809661L, 2819561105158720014L, -4035746434778044925L, -302932621132653753L, -2644281811660520851L, -3183605296591799669L, 6722166367014452318L, -3512299194304650054L, -7278142539171889152L};

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final long[] f649k = {-3958705157555305932L, -4267615245585081135L};

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final double[] f650l = {0.0d, 0.125d, 0.25d, 0.375d, 0.5d, 0.625d, 0.75d, 0.875d, 1.0d, 1.125d, 1.25d, 1.375d, 1.5d, 1.625d};

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final double[] f651m = {0.6299605249474366d, 0.7937005259840998d, 1.0d, 1.2599210498948732d, 1.5874010519681994d};

    private static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f652a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final double f653b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final double f654c;

        a(double d10) {
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
                    this.f652a = i10;
                    this.f653b = d18;
                    this.f654c = d19;
                    return;
                }
                i10--;
            }
        }

        int a() {
            return this.f652a;
        }

        double b() {
            return this.f653b;
        }

        double c() {
            return this.f654c;
        }
    }

    private static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final double[] f655a = aj.e.a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final double[] f656b = aj.e.b();
    }

    private static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final double[] f657a = aj.e.c();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final double[] f658b = aj.e.d();
    }

    private static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final double[][] f665a = aj.e.e();
    }

    public static double A(double d10) {
        double[] dArr = new double[2];
        double dZ = z(d10, dArr);
        if (Double.isInfinite(dZ)) {
            return dZ;
        }
        double d11 = dArr[0];
        double d12 = 1.073741824E9d * d11;
        double d13 = (d11 + d12) - d12;
        double d14 = (d11 - d13) + dArr[1];
        return (d14 * 1.9699272335463627E-8d) + (1.9699272335463627E-8d * d13) + (d14 * 0.4342944622039795d) + (d13 * 0.4342944622039795d);
    }

    public static double B(double d10, double d11) {
        if (d10 <= d11) {
            if (d10 >= d11) {
                if (d10 != d11) {
                    return Double.NaN;
                }
                if (Double.doubleToRawLongBits(d10) == Long.MIN_VALUE) {
                }
            }
            return d11;
        }
        return d10;
    }

    public static int C(int i10, int i11) {
        return i10 <= i11 ? i11 : i10;
    }

    public static double D(double d10, double d11) {
        if (d10 <= d11) {
            if (d10 >= d11) {
                if (d10 != d11) {
                    return Double.NaN;
                }
                if (Double.doubleToRawLongBits(d10) == Long.MIN_VALUE) {
                }
            }
            return d10;
        }
        return d11;
    }

    public static int E(int i10, int i11) {
        return i10 <= i11 ? i10 : i11;
    }

    public static long F(long j10, long j11) {
        return j10 <= j11 ? j10 : j11;
    }

    private static double G(double d10) {
        return ((((((2.479773539153719E-5d * r4) - 0.0013888888689039883d) * r4) + 0.041666666666621166d) * r4) - 0.49999999999999994d) * d10 * d10;
    }

    private static double H(double d10) {
        return ((((((2.7553817452272217E-6d * r0) - 1.9841269659586505E-4d) * r0) + 0.008333333333329196d) * r0) - 0.16666666666666666d) * d10 * d10 * d10;
    }

    public static double I(double d10, double d11) {
        if (d11 == 0.0d) {
            return 1.0d;
        }
        long jDoubleToRawLongBits = Double.doubleToRawLongBits(d11);
        int i10 = (int) ((jDoubleToRawLongBits & 9218868437227405312L) >> 52);
        long j10 = jDoubleToRawLongBits & 4503599627370495L;
        long jDoubleToRawLongBits2 = Double.doubleToRawLongBits(d10);
        int i11 = (int) ((jDoubleToRawLongBits2 & 9218868437227405312L) >> 52);
        long j11 = jDoubleToRawLongBits2 & 4503599627370495L;
        if (i10 > 1085) {
            if ((i10 == 2047 && j10 != 0) || (i11 == 2047 && j11 != 0)) {
                return Double.NaN;
            }
            if (i11 == 1023 && j11 == 0) {
                return i10 == 2047 ? Double.NaN : 1.0d;
            }
            return ((d11 > 0.0d ? 1 : (d11 == 0.0d ? 0 : -1)) > 0) ^ (i11 < 1023) ? Double.POSITIVE_INFINITY : 0.0d;
        }
        if (i10 >= 1023) {
            long j12 = j10 | 4503599627370496L;
            if (i10 >= 1075) {
                long j13 = j12 << (i10 - 1075);
                if (d11 < 0.0d) {
                    j13 = -j13;
                }
                return K(d10, j13);
            }
            int i12 = 1075 - i10;
            if ((j12 & ((-1) << i12)) == j12) {
                long j14 = j12 >> i12;
                if (d11 < 0.0d) {
                    j14 = -j14;
                }
                return K(d10, j14);
            }
        }
        if (d10 == 0.0d) {
            return d11 < 0.0d ? Double.POSITIVE_INFINITY : 0.0d;
        }
        if (i11 == 2047) {
            if (j11 == 0) {
                return d11 < 0.0d ? 0.0d : Double.POSITIVE_INFINITY;
            }
            return Double.NaN;
        }
        if (d10 < 0.0d) {
            return Double.NaN;
        }
        double d12 = d11 * 1.073741824E9d;
        double d13 = (d11 + d12) - d12;
        double d14 = d11 - d13;
        double[] dArr = new double[2];
        double dZ = z(d10, dArr);
        if (Double.isInfinite(dZ)) {
            return dZ;
        }
        double d15 = dArr[0];
        double d16 = 1.073741824E9d * d15;
        double d17 = (d15 + d16) - d16;
        double d18 = dArr[1] + (d15 - d17);
        double d19 = d17 * d13;
        double d20 = (d17 * d14) + (d13 * d18) + (d18 * d14);
        double d21 = d19 + d20;
        double d22 = -((d21 - d19) - d20);
        return s(d21, ((((((((0.008333333333333333d * d22) + 0.041666666666666664d) * d22) + 0.16666666666666666d) * d22) + 0.5d) * d22) + 1.0d) * d22, null);
    }

    public static double J(double d10, int i10) {
        return K(d10, i10);
    }

    public static double K(double d10, long j10) {
        if (j10 == 0) {
            return 1.0d;
        }
        return j10 > 0 ? new C0013d(d10).d(j10).f662a : new C0013d(d10).e().d(-j10).f662a;
    }

    private static void L(double d10, double[] dArr) {
        long j10;
        long j11;
        long j12;
        long jDoubleToRawLongBits = Double.doubleToRawLongBits(d10);
        int i10 = ((int) ((jDoubleToRawLongBits >> 52) & 2047)) - 1022;
        long j13 = ((jDoubleToRawLongBits & 4503599627370495L) | 4503599627370496L) << 11;
        int i11 = i10 >> 6;
        int i12 = i10 - (i11 << 6);
        if (i12 != 0) {
            long j14 = i11 == 0 ? 0L : f648j[i11 - 1] << i12;
            long[] jArr = f648j;
            long j15 = jArr[i11];
            int i13 = 64 - i12;
            j10 = j14 | (j15 >>> i13);
            long j16 = jArr[i11 + 1];
            j11 = (j15 << i12) | (j16 >>> i13);
            j12 = (jArr[i11 + 2] >>> i13) | (j16 << i12);
        } else {
            j10 = i11 == 0 ? 0L : f648j[i11 - 1];
            long[] jArr2 = f648j;
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
        long[] jArr3 = f649k;
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

    public static double M(double d10) {
        double dU = u(d10);
        double d11 = d10 - dU;
        if (d11 <= 0.5d) {
            return (d11 >= 0.5d && (((long) dU) & 1) != 0) ? dU + 1.0d : dU;
        }
        if (dU == -1.0d) {
            return -0.0d;
        }
        return dU + 1.0d;
    }

    public static long N(double d10) {
        long jDoubleToRawLongBits = Double.doubleToRawLongBits(d10);
        int i10 = 1074 - (((int) (jDoubleToRawLongBits >> 52)) & 2047);
        if ((i10 & (-64)) != 0) {
            return (long) d10;
        }
        long j10 = (4503599627370495L & jDoubleToRawLongBits) | 4503599627370496L;
        if (jDoubleToRawLongBits < 0) {
            j10 = -j10;
        }
        return ((j10 >> i10) + 1) >> 1;
    }

    public static double O(double d10, int i10) {
        if (i10 > -1023 && i10 < 1024) {
            return Double.longBitsToDouble(((long) (i10 + 1023)) << 52) * d10;
        }
        if (Double.isNaN(d10) || Double.isInfinite(d10) || d10 == 0.0d) {
            return d10;
        }
        if (i10 < -2098) {
            return d10 > 0.0d ? 0.0d : -0.0d;
        }
        if (i10 > 2097) {
            return d10 > 0.0d ? Double.POSITIVE_INFINITY : Double.NEGATIVE_INFINITY;
        }
        long jDoubleToRawLongBits = Double.doubleToRawLongBits(d10);
        long j10 = Long.MIN_VALUE & jDoubleToRawLongBits;
        int i11 = ((int) (jDoubleToRawLongBits >>> 52)) & 2047;
        long j11 = jDoubleToRawLongBits & 4503599627370495L;
        int i12 = i11 + i10;
        if (i10 >= 0) {
            if (i11 != 0) {
                return i12 < 2047 ? Double.longBitsToDouble((((long) i12) << 52) | j10 | j11) : j10 == 0 ? Double.POSITIVE_INFINITY : Double.NEGATIVE_INFINITY;
            }
            while ((j11 >>> 52) != 1) {
                j11 <<= 1;
                i12--;
            }
            int i13 = i12 + 1;
            return i13 < 2047 ? Double.longBitsToDouble((((long) i13) << 52) | j10 | (4503599627370495L & j11)) : j10 == 0 ? Double.POSITIVE_INFINITY : Double.NEGATIVE_INFINITY;
        }
        if (i12 > 0) {
            return Double.longBitsToDouble((((long) i12) << 52) | j10 | j11);
        }
        if (i12 <= -53) {
            return j10 == 0 ? 0.0d : -0.0d;
        }
        long j12 = 4503599627370496L | j11;
        long j13 = j12 >>> (1 - i12);
        if (((1 << (-i12)) & j12) != 0) {
            j13++;
        }
        return Double.longBitsToDouble(j13 | j10);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0080  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static double P(double r12) {
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
            L(r4, r2)
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
            aj.d$a r1 = new aj.d$a
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
            double r12 = o(r4, r2)
        L74:
            double r12 = -r12
            return r12
        L76:
            double r12 = S(r4, r2)
            goto L74
        L7b:
            double r12 = o(r4, r2)
            return r12
        L80:
            double r12 = S(r4, r2)
        L84:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: aj.d.P(double):double");
    }

    public static f Q(pi.b bVar) {
        return bVar.S();
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00b5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static aj.m R(double r12) {
        /*
            Method dump skipped, instruction units count: 204
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: aj.d.R(double):aj.m");
    }

    private static double S(double d10, double d11) {
        int i10 = (int) ((8.0d * d10) + 0.5d);
        double d12 = d10 - f650l[i10];
        double d13 = f642d[i10];
        double d14 = f643e[i10];
        double d15 = f644f[i10];
        double d16 = f645g[i10];
        double dH = H(d12);
        double dG = G(d12);
        double d17 = 1.073741824E9d * d12;
        double d18 = (d12 + d17) - d17;
        double d19 = dH + (d12 - d18);
        double d20 = d13 + 0.0d;
        double d21 = d15 * d18;
        double d22 = d20 + d21;
        double d23 = (-((d20 - 0.0d) - d13)) + 0.0d + (-((d22 - d20) - d21)) + (d13 * dG) + (d15 * d19) + d14 + (d16 * d18) + (d14 * dG) + (d16 * d19);
        if (d11 != 0.0d) {
            double d24 = (((d15 + d16) * (dG + 1.0d)) - ((d13 + d14) * (d18 + d19))) * d11;
            double d25 = d22 + d24;
            d23 += -((d25 - d22) - d24);
            d22 = d25;
        }
        return d22 + d23;
    }

    public static double T(double d10) {
        boolean z10;
        double d11;
        double d12;
        double d13;
        double dR;
        double dR2;
        double d14 = d10;
        if (!Double.isNaN(d14)) {
            double d15 = 0.5d;
            if (d14 > 20.0d) {
                if (d14 >= f639a) {
                    dR2 = r(d14 * 0.5d);
                    return d15 * dR2 * dR2;
                }
                dR = r(d14);
                return dR * d15;
            }
            if (d14 < -20.0d) {
                d15 = -0.5d;
                if (d14 <= (-f639a)) {
                    dR2 = r(d14 * (-0.5d));
                    return d15 * dR2 * dR2;
                }
                dR = r(-d14);
                return dR * d15;
            }
            if (d14 != 0.0d) {
                if (d14 < 0.0d) {
                    d14 = -d14;
                    z10 = true;
                } else {
                    z10 = false;
                }
                double[] dArr = new double[2];
                if (d14 > 0.25d) {
                    s(d14, 0.0d, dArr);
                    double d16 = dArr[0];
                    double d17 = dArr[1];
                    double d18 = d16 + d17;
                    double d19 = -((d18 - d16) - d17);
                    double d20 = d18 * 1.073741824E9d;
                    double d21 = (d18 + d20) - d20;
                    double d22 = d18 - d21;
                    double d23 = 1.0d / d18;
                    double d24 = 1.073741824E9d * d23;
                    double d25 = (d23 + d24) - d24;
                    double d26 = d23 - d25;
                    double d27 = d26 + (((((1.0d - (d21 * d25)) - (d21 * d26)) - (d22 * d25)) - (d22 * d26)) * d23) + ((-d19) * d23 * d23);
                    double d28 = -d25;
                    double d29 = -d27;
                    double d30 = d18 + d28;
                    d11 = d19 + (-((d30 - d18) - d28));
                    d12 = d30 + d29;
                    d13 = -((d12 - d30) - d29);
                } else {
                    t(d14, dArr);
                    double d31 = dArr[0];
                    double d32 = dArr[1];
                    double d33 = d31 + d32;
                    double d34 = -((d33 - d31) - d32);
                    double d35 = d33 + 1.0d;
                    double d36 = 1.0d / d35;
                    double d37 = (-((d35 - 1.0d) - d33)) + d34;
                    double d38 = d33 * d36;
                    double d39 = d38 * 1.073741824E9d;
                    double d40 = (d38 + d39) - d39;
                    double d41 = d38 - d40;
                    double d42 = 1.073741824E9d * d35;
                    double d43 = (d35 + d42) - d42;
                    double d44 = d35 - d43;
                    double d45 = d41 + (((((d33 - (d43 * d40)) - (d43 * d41)) - (d44 * d40)) - (d44 * d41)) * d36) + (d34 * d36) + ((-d33) * d37 * d36 * d36);
                    double d46 = d33 + d40;
                    d11 = d34 + (-((d46 - d33) - d40));
                    d12 = d46 + d45;
                    d13 = -((d12 - d46) - d45);
                }
                double d47 = (d12 + d11 + d13) * 0.5d;
                return z10 ? -d47 : d47;
            }
        }
        return d14;
    }

    public static double U(double d10) {
        return Math.sqrt(d10);
    }

    public static double V(double d10) {
        boolean z10;
        double dB;
        int iA;
        double dC = 0.0d;
        if (d10 < 0.0d) {
            dB = -d10;
            z10 = true;
        } else {
            z10 = false;
            dB = d10;
        }
        if (dB == 0.0d) {
            return Double.doubleToRawLongBits(d10) < 0 ? -0.0d : 0.0d;
        }
        if (dB != dB || dB == Double.POSITIVE_INFINITY) {
            return Double.NaN;
        }
        if (dB > 3294198.0d) {
            double[] dArr = new double[3];
            L(dB, dArr);
            iA = ((int) dArr[0]) & 3;
            dB = dArr[1];
            dC = dArr[2];
        } else if (dB > 1.5707963267948966d) {
            a aVar = new a(dB);
            iA = aVar.a() & 3;
            dB = aVar.b();
            dC = aVar.c();
        } else {
            iA = 0;
        }
        if (dB > 1.5d) {
            double d11 = 1.5707963267948966d - dB;
            double d12 = (-((d11 - 1.5707963267948966d) + dB)) + (6.123233995736766E-17d - dC);
            double d13 = d11 + d12;
            double d14 = -((d13 - d11) - d12);
            iA ^= 1;
            z10 = !z10;
            dB = d13;
            dC = d14;
        }
        double dW = (iA & 1) == 0 ? W(dB, dC, false) : -W(dB, dC, true);
        return z10 ? -dW : dW;
    }

    private static double W(double d10, double d11, boolean z10) {
        int i10 = (int) ((8.0d * d10) + 0.5d);
        double d12 = d10 - f650l[i10];
        double d13 = f642d[i10];
        double d14 = f643e[i10];
        double d15 = f644f[i10];
        double d16 = f645g[i10];
        double dH = H(d12);
        double dG = G(d12);
        double d17 = d12 * 1.073741824E9d;
        double d18 = (d12 + d17) - d17;
        double d19 = dH + (d12 - d18);
        double d20 = d13 + 0.0d;
        double d21 = d15 * d18;
        double d22 = d20 + d21;
        double d23 = (-((d20 - 0.0d) - d13)) + 0.0d + (-((d22 - d20) - d21)) + (d13 * dG) + (d15 * d19) + (d16 * d18) + d14 + (d14 * dG) + (d16 * d19);
        double d24 = d22 + d23;
        double d25 = -((d24 - d22) - d23);
        double d26 = d15 * 1.0d;
        double d27 = d26 + 0.0d;
        double d28 = d25;
        double d29 = (-d13) * d18;
        double d30 = d27 + d29;
        double d31 = ((((-((d27 - 0.0d) - d26)) + 0.0d) + (-((d30 - d27) - d29))) + (((1.0d * d16) + (d15 * dG)) + (d16 * dG))) - (((d18 * d14) + (d13 * d19)) + (d14 * d19));
        double d32 = d30 + d31;
        double d33 = -((d32 - d30) - d31);
        if (z10) {
            d32 = d24;
            d24 = d32;
        } else {
            d28 = d33;
            d33 = d28;
        }
        double d34 = d24 / d32;
        double d35 = d34 * 1.073741824E9d;
        double d36 = (d34 + d35) - d35;
        double d37 = d34 - d36;
        double d38 = 1.073741824E9d * d32;
        double d39 = (d32 + d38) - d38;
        double d40 = d32 - d39;
        double d41 = (((((d24 - (d36 * d39)) - (d36 * d40)) - (d39 * d37)) - (d37 * d40)) / d32) + (d33 / d32) + ((((-d24) * d28) / d32) / d32);
        if (d11 != 0.0d) {
            double d42 = d11 + (d34 * d34 * d11);
            if (z10) {
                d42 = -d42;
            }
            d41 += d42;
        }
        return d34 + d41;
    }

    public static double X(double d10) {
        boolean z10;
        double d11;
        double d12 = d10;
        if (!Double.isNaN(d12)) {
            if (d12 > 20.0d) {
                return 1.0d;
            }
            if (d12 < -20.0d) {
                return -1.0d;
            }
            if (d12 != 0.0d) {
                if (d12 < 0.0d) {
                    d12 = -d12;
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (d12 >= 0.5d) {
                    double[] dArr = new double[2];
                    s(d12 * 2.0d, 0.0d, dArr);
                    double d13 = dArr[0];
                    double d14 = dArr[1];
                    double d15 = d13 + d14;
                    double d16 = -((d15 - d13) - d14);
                    double d17 = (-1.0d) + d15;
                    double d18 = d17 + d16;
                    double d19 = (-((d17 + 1.0d) - d15)) + (-((d18 - d17) - d16));
                    double d20 = d15 + 1.0d;
                    double d21 = -((d20 - 1.0d) - d15);
                    double d22 = d20 + d16;
                    double d23 = d21 + (-((d22 - d20) - d16));
                    double d24 = d22 * 1.073741824E9d;
                    double d25 = (d22 + d24) - d24;
                    double d26 = d22 - d25;
                    double d27 = d18 / d22;
                    double d28 = 1.073741824E9d * d27;
                    double d29 = (d27 + d28) - d28;
                    double d30 = d27 - d29;
                    d11 = d29 + d30 + (((((d18 - (d25 * d29)) - (d25 * d30)) - (d26 * d29)) - (d26 * d30)) / d22) + (d19 / d22) + ((((-d23) * d18) / d22) / d22);
                } else {
                    double[] dArr2 = new double[2];
                    t(d12 * 2.0d, dArr2);
                    double d31 = dArr2[0];
                    double d32 = dArr2[1];
                    double d33 = d31 + d32;
                    double d34 = -((d33 - d31) - d32);
                    double d35 = d33 + 2.0d;
                    double d36 = d35 + d34;
                    double d37 = (-((d35 - 2.0d) - d33)) + (-((d36 - d35) - d34));
                    double d38 = d36 * 1.073741824E9d;
                    double d39 = (d36 + d38) - d38;
                    double d40 = d36 - d39;
                    double d41 = d33 / d36;
                    double d42 = 1.073741824E9d * d41;
                    double d43 = (d41 + d42) - d42;
                    double d44 = d41 - d43;
                    d11 = d43 + d44 + (((((d33 - (d39 * d43)) - (d39 * d44)) - (d40 * d43)) - (d40 * d44)) / d36) + (d34 / d36) + ((((-d37) * d33) / d36) / d36);
                }
                double d45 = d11;
                return z10 ? -d45 : d45;
            }
        }
        return d12;
    }

    public static double Y(double d10) {
        if (Double.isInfinite(d10) || d10 == 0.0d) {
            return d10;
        }
        double dQ = q(d10);
        double d11 = d10 - dQ;
        return (d11 * 3.145894820876798E-6d) + (d11 * 57.2957763671875d) + (3.145894820876798E-6d * dQ) + (dQ * 57.2957763671875d);
    }

    public static double Z(double d10) {
        if (Double.isInfinite(d10) || d10 == 0.0d) {
            return d10;
        }
        double dQ = q(d10);
        double d11 = d10 - dQ;
        double d12 = (d11 * 1.997844754509471E-9d) + (d11 * 0.01745329052209854d) + (1.997844754509471E-9d * dQ) + (dQ * 0.01745329052209854d);
        return d12 == 0.0d ? d12 * d10 : d12;
    }

    public static double a(double d10, double d11) {
        if (w(d10) != 1024 && w(d11) != 1024 && d11 != 0.0d) {
            double dM = M(d10 / d11);
            double d12 = Double.isInfinite(dM) ? 0.0d : d10 - (d11 * dM);
            return d12 == 0.0d ? m(d12, d10) : d12;
        }
        if (!Double.isInfinite(d11) || Double.isInfinite(d10)) {
            return Double.NaN;
        }
        return d10;
    }

    public static double b(double d10) {
        return Double.longBitsToDouble(Double.doubleToRawLongBits(d10) & Long.MAX_VALUE);
    }

    public static int c(int i10) {
        int i11 = i10 >>> 31;
        return (i10 ^ ((~i11) + 1)) + i11;
    }

    public static long d(long j10) {
        long j11 = j10 >>> 63;
        return (j10 ^ ((~j11) + 1)) + j11;
    }

    public static double e(double d10) {
        if (Double.isNaN(d10) || d10 > 1.0d || d10 < -1.0d) {
            return Double.NaN;
        }
        if (d10 == -1.0d) {
            return 3.141592653589793d;
        }
        if (d10 == 1.0d) {
            return 0.0d;
        }
        if (d10 == 0.0d) {
            return 1.5707963267948966d;
        }
        double d11 = d10 * 1.073741824E9d;
        double d12 = (d10 + d11) - d11;
        double d13 = d10 - d12;
        double d14 = -(d12 * d12);
        double d15 = -((d12 * d13 * 2.0d) + (d13 * d13));
        double d16 = d14 + 1.0d;
        double d17 = -((d16 - 1.0d) - d14);
        double d18 = d16 + d15;
        double d19 = d17 + (-((d18 - d16) - d15));
        double dU = U(d18);
        double d20 = 1.073741824E9d * dU;
        double d21 = (dU + d20) - d20;
        double d22 = dU - d21;
        double d23 = dU * 2.0d;
        double d24 = d22 + ((((d18 - (d21 * d21)) - ((d21 * 2.0d) * d22)) - (d22 * d22)) / d23) + (d19 / d23);
        double d25 = d21 + d24;
        double d26 = -((d25 - d21) - d24);
        double d27 = d25 / d10;
        if (Double.isInfinite(d27)) {
            return 1.5707963267948966d;
        }
        double dQ = q(d27);
        double d28 = d27 - dQ;
        double d29 = d28 + (((((d25 - (dQ * d12)) - (dQ * d13)) - (d12 * d28)) - (d13 * d28)) / d10) + (d26 / d10);
        double d30 = dQ + d29;
        return i(d30, -((d30 - dQ) - d29), d10 < 0.0d);
    }

    public static double f(double d10) {
        if (Double.isNaN(d10) || d10 > 1.0d || d10 < -1.0d) {
            return Double.NaN;
        }
        if (d10 == 1.0d) {
            return 1.5707963267948966d;
        }
        if (d10 == -1.0d) {
            return -1.5707963267948966d;
        }
        if (d10 == 0.0d) {
            return d10;
        }
        double d11 = d10 * 1.073741824E9d;
        double d12 = (d10 + d11) - d11;
        double d13 = d10 - d12;
        double d14 = d12 * d12;
        double d15 = (d12 * d13 * 2.0d) + (d13 * d13);
        double d16 = -d14;
        double d17 = -d15;
        double d18 = d16 + 1.0d;
        double d19 = d18 + d17;
        double d20 = (-((d18 - 1.0d) - d16)) + (-((d19 - d18) - d17));
        double dU = U(d19);
        double d21 = dU * 1.073741824E9d;
        double d22 = (dU + d21) - d21;
        double d23 = dU - d22;
        double d24 = 2.0d * dU;
        double d25 = d23 + ((((d19 - (d22 * d22)) - ((d22 * 2.0d) * d23)) - (d23 * d23)) / d24);
        double d26 = d10 / dU;
        double d27 = 1.073741824E9d * d26;
        double d28 = (d26 + d27) - d27;
        double d29 = d26 - d28;
        double d30 = d29 + (((((d10 - (d28 * d22)) - (d28 * d25)) - (d22 * d29)) - (d25 * d29)) / dU) + ((((-d10) * (d20 / d24)) / dU) / dU);
        double d31 = d28 + d30;
        return i(d31, -((d31 - d28) - d30), false);
    }

    public static double g(double d10) {
        boolean z10;
        double dY;
        double d11 = d10;
        if (d11 < 0.0d) {
            d11 = -d11;
            z10 = true;
        } else {
            z10 = false;
        }
        if (d11 > 0.167d) {
            dY = y(U((d11 * d11) + 1.0d) + d11);
        } else {
            double d12 = d11 * d11;
            double d13 = 0.07692307692307693d;
            double d14 = 0.1111111111111111d;
            double d15 = 0.2d;
            if (d11 > 0.097d) {
                d13 = 0.07692307692307693d - (((0.06666666666666667d - ((0.058823529411764705d * d12) * 0.9375d)) * d12) * 0.9285714285714286d);
            } else {
                if (d11 <= 0.036d) {
                    if (d11 > 0.0036d) {
                    }
                    dY = d11 * (1.0d - ((d12 * (0.3333333333333333d - ((d15 * d12) * 0.75d))) * 0.5d));
                }
                d15 = 0.2d - (((0.14285714285714285d - ((d14 * d12) * 0.875d)) * d12) * 0.8333333333333334d);
                dY = d11 * (1.0d - ((d12 * (0.3333333333333333d - ((d15 * d12) * 0.75d))) * 0.5d));
            }
            d14 = 0.1111111111111111d - (((0.09090909090909091d - ((d13 * d12) * 0.9166666666666666d)) * d12) * 0.9d);
            d15 = 0.2d - (((0.14285714285714285d - ((d14 * d12) * 0.875d)) * d12) * 0.8333333333333334d);
            dY = d11 * (1.0d - ((d12 * (0.3333333333333333d - ((d15 * d12) * 0.75d))) * 0.5d));
        }
        return z10 ? -dY : dY;
    }

    public static double h(double d10) {
        return i(d10, 0.0d, false);
    }

    private static double i(double d10, double d11, boolean z10) {
        double d12;
        boolean z11;
        int i10;
        double d13;
        double d14;
        double d15 = d10;
        if (d15 == 0.0d) {
            return z10 ? m(3.141592653589793d, d15) : d15;
        }
        if (d15 < 0.0d) {
            d15 = -d15;
            d12 = -d11;
            z11 = true;
        } else {
            d12 = d11;
            z11 = false;
        }
        if (d15 > 1.633123935319537E16d) {
            return z11 ^ z10 ? -1.5707963267948966d : 1.5707963267948966d;
        }
        if (d15 < 1.0d) {
            i10 = (int) (((((-1.7168146928204135d) * d15 * d15) + 8.0d) * d15) + 0.5d);
        } else {
            double d16 = 1.0d / d15;
            i10 = (int) ((-((((-1.7168146928204135d) * d16 * d16) + 8.0d) * d16)) + 13.07d);
        }
        double d17 = f646h[i10];
        double d18 = f647i[i10];
        double d19 = d15 - d17;
        double d20 = (-((d19 - d15) + d17)) + (d12 - d18);
        double d21 = d19 + d20;
        double d22 = -((d21 - d19) - d20);
        double d23 = d15 * 1.073741824E9d;
        double d24 = (d15 + d23) - d23;
        double d25 = d12 + ((d15 + d12) - d24);
        if (i10 == 0) {
            double d26 = 1.0d / (((d24 + d25) * (d17 + d18)) + 1.0d);
            d14 = d21 * d26;
            d13 = d22 * d26;
        } else {
            double d27 = d24 * d17;
            double d28 = d27 + 1.0d;
            double d29 = (d17 * d25) + (d24 * d18);
            double d30 = d28 + d29;
            double d31 = (-((d28 - 1.0d) - d27)) + (-((d30 - d28) - d29)) + (d25 * d18);
            double d32 = d21 / d30;
            double d33 = d32 * 1.073741824E9d;
            double d34 = (d32 + d33) - d33;
            double d35 = d32 - d34;
            double d36 = 1.073741824E9d * d30;
            double d37 = (d30 + d36) - d36;
            double d38 = d30 - d37;
            d13 = (((((d21 - (d34 * d37)) - (d34 * d38)) - (d37 * d35)) - (d35 * d38)) / d30) + ((((-d21) * d31) / d30) / d30) + (d22 / d30);
            d14 = d32;
        }
        double d39 = d14 * d14;
        double d40 = ((((((((((0.07490822288864472d * d39) - 0.09088450866185192d) * d39) + 0.11111095942313305d) * d39) - 0.1428571423679182d) * d39) + 0.19999999999923582d) * d39) - 0.33333333333333287d) * d39 * d14;
        double d41 = d14 + d40;
        double d42 = (-((d41 - d14) - d40)) + (d13 / (d39 + 1.0d));
        double d43 = f650l[i10];
        double d44 = d43 + d41;
        double d45 = d44 + d42;
        double d46 = (-((d44 - d43) - d41)) + (-((d45 - d44) - d42));
        double d47 = d45 + d46;
        if (z10) {
            double d48 = -((d47 - d45) - d46);
            double d49 = 3.141592653589793d - d47;
            d47 = (-((d49 - 3.141592653589793d) + d47)) + (1.2246467991473532E-16d - d48) + d49;
        }
        return z11 ^ z10 ? -d47 : d47;
    }

    public static double j(double d10, double d11) {
        if (Double.isNaN(d11) || Double.isNaN(d10)) {
            return Double.NaN;
        }
        if (d10 == 0.0d) {
            double d12 = 1.0d / d11;
            return d12 == 0.0d ? d11 > 0.0d ? d10 : m(3.141592653589793d, d10) : (d11 < 0.0d || d12 < 0.0d) ? m(3.141592653589793d, d10) : d11 * d10;
        }
        if (d10 == Double.POSITIVE_INFINITY) {
            if (d11 == Double.POSITIVE_INFINITY) {
                return 0.7853981633974483d;
            }
            return d11 == Double.NEGATIVE_INFINITY ? 2.356194490192345d : 1.5707963267948966d;
        }
        if (d10 == Double.NEGATIVE_INFINITY) {
            if (d11 == Double.POSITIVE_INFINITY) {
                return -0.7853981633974483d;
            }
            return d11 == Double.NEGATIVE_INFINITY ? -2.356194490192345d : -1.5707963267948966d;
        }
        if (d11 == Double.POSITIVE_INFINITY) {
            return m(0.0d, d10);
        }
        if (d11 == Double.NEGATIVE_INFINITY) {
            return m(3.141592653589793d, d10);
        }
        if (d11 == 0.0d) {
            return m(1.5707963267948966d, d10);
        }
        double d13 = d10 / d11;
        if (Double.isInfinite(d13)) {
            return i(d13, 0.0d, d11 < 0.0d);
        }
        double dQ = q(d13);
        double d14 = d13 - dQ;
        double dQ2 = q(d11);
        double d15 = d11 - dQ2;
        double d16 = d14 + (((((d10 - (dQ * dQ2)) - (dQ * d15)) - (dQ2 * d14)) - (d15 * d14)) / d11);
        double dM = dQ + d16;
        double d17 = -((dM - dQ) - d16);
        if (dM == 0.0d) {
            dM = m(0.0d, d10);
        }
        return i(dM, d17, d11 < 0.0d);
    }

    public static double k(double d10) {
        boolean z10;
        int i10;
        long jDoubleToRawLongBits;
        double d11;
        long jDoubleToRawLongBits2 = Double.doubleToRawLongBits(d10);
        int i11 = ((int) ((jDoubleToRawLongBits2 >> 52) & 2047)) - 1023;
        if (i11 != -1023) {
            z10 = false;
            i10 = i11;
            jDoubleToRawLongBits = jDoubleToRawLongBits2;
            d11 = d10;
        } else {
            if (d10 == 0.0d) {
                return d10;
            }
            d11 = 1.8014398509481984E16d * d10;
            jDoubleToRawLongBits = Double.doubleToRawLongBits(d11);
            i10 = ((int) (2047 & (jDoubleToRawLongBits >> 52))) - 1023;
            z10 = true;
        }
        if (i10 == 1024) {
            return d11;
        }
        double dLongBitsToDouble = Double.longBitsToDouble((Long.MIN_VALUE & jDoubleToRawLongBits) | (((long) (((i10 / 3) + 1023) & 2047)) << 52));
        double dLongBitsToDouble2 = Double.longBitsToDouble((jDoubleToRawLongBits & 4503599627370495L) | 4607182418800017408L);
        double d12 = (((((((((-0.010714690733195933d) * dLongBitsToDouble2) + 0.0875862700108075d) * dLongBitsToDouble2) - 0.3058015757857271d) * dLongBitsToDouble2) + 0.7249995199969751d) * dLongBitsToDouble2) + 0.5039018405998233d) * f651m[(i10 % 3) + 2];
        double d13 = d11 / ((dLongBitsToDouble * dLongBitsToDouble) * dLongBitsToDouble);
        double d14 = d12 + ((d13 - ((d12 * d12) * d12)) / ((d12 * 3.0d) * d12));
        double d15 = d14 + ((d13 - ((d14 * d14) * d14)) / ((d14 * 3.0d) * d14));
        double d16 = d15 * 1.073741824E9d;
        double d17 = (d15 + d16) - d16;
        double d18 = d15 - d17;
        double d19 = d17 * d17;
        double d20 = 1.073741824E9d * d19;
        double d21 = (d19 + d20) - d20;
        double d22 = (d17 * d18 * 2.0d) + (d18 * d18) + (d19 - d21);
        double d23 = (d21 * d18) + (d17 * d22) + (d22 * d18);
        double d24 = d21 * d17;
        double d25 = d13 - d24;
        double d26 = (d15 + ((d25 + ((-((d25 - d13) + d24)) - d23)) / ((3.0d * d15) * d15))) * dLongBitsToDouble;
        return z10 ? d26 * 3.814697265625E-6d : d26;
    }

    public static double l(double d10) {
        if (Double.isNaN(d10)) {
            return d10;
        }
        double dU = u(d10);
        if (dU == d10) {
            return dU;
        }
        double d11 = dU + 1.0d;
        return d11 == 0.0d ? d10 * d11 : d11;
    }

    public static double m(double d10, double d11) {
        return (Double.doubleToRawLongBits(d11) ^ Double.doubleToRawLongBits(d10)) >= 0 ? d10 : -d10;
    }

    public static double n(double d10) {
        double dS;
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
            L(d10, dArr);
            iA = ((int) dArr[0]) & 3;
            d10 = dArr[1];
            dC = dArr[2];
        } else if (d10 > 1.5707963267948966d) {
            a aVar = new a(d10);
            iA = aVar.a() & 3;
            d10 = aVar.b();
            dC = aVar.c();
        }
        if (iA == 0) {
            return o(d10, dC);
        }
        if (iA == 1) {
            dS = S(d10, dC);
        } else {
            if (iA != 2) {
                if (iA != 3) {
                    return Double.NaN;
                }
                return S(d10, dC);
            }
            dS = o(d10, dC);
        }
        return -dS;
    }

    private static double o(double d10, double d11) {
        double d12 = 1.5707963267948966d - d10;
        return S(d12, (-((d12 - 1.5707963267948966d) + d10)) + (6.123233995736766E-17d - d11));
    }

    public static double p(double d10) {
        double dR;
        double dR2;
        double d11 = d10;
        if (Double.isNaN(d11)) {
            return d11;
        }
        if (d11 > 20.0d) {
            if (d11 >= f639a) {
                dR2 = r(d11 * 0.5d);
                return 0.5d * dR2 * dR2;
            }
            dR = r(d11);
            return dR * 0.5d;
        }
        if (d11 < -20.0d) {
            if (d11 <= (-f639a)) {
                dR2 = r(d11 * (-0.5d));
                return 0.5d * dR2 * dR2;
            }
            dR = r(-d11);
            return dR * 0.5d;
        }
        double[] dArr = new double[2];
        if (d11 < 0.0d) {
            d11 = -d11;
        }
        s(d11, 0.0d, dArr);
        double d12 = dArr[0];
        double d13 = dArr[1];
        double d14 = d12 + d13;
        double d15 = -((d14 - d12) - d13);
        double d16 = d14 * 1.073741824E9d;
        double d17 = (d14 + d16) - d16;
        double d18 = d14 - d17;
        double d19 = 1.0d / d14;
        double d20 = 1.073741824E9d * d19;
        double d21 = (d19 + d20) - d20;
        double d22 = d19 - d21;
        double d23 = d22 + (((((1.0d - (d17 * d21)) - (d17 * d22)) - (d18 * d21)) - (d18 * d22)) * d19) + ((-d15) * d19 * d19);
        double d24 = d14 + d21;
        double d25 = d15 + (-((d24 - d14) - d21));
        double d26 = d24 + d23;
        return (d26 + d25 + (-((d26 - d24) - d23))) * 0.5d;
    }

    private static double q(double d10) {
        double d11 = l.f682b;
        return (d10 <= (-d11) || d10 >= d11) ? Double.longBitsToDouble(Double.doubleToRawLongBits(d10) & (-1073741824)) : d10;
    }

    public static double r(double d10) {
        return s(d10, 0.0d, null);
    }

    private static double s(double d10, double d11, double[] dArr) {
        double d12;
        int i10 = (int) d10;
        if (d10 < 0.0d) {
            if (d10 < -746.0d) {
                if (dArr != null) {
                    dArr[0] = 0.0d;
                    dArr[1] = 0.0d;
                }
                return 0.0d;
            }
            if (i10 < -709) {
                double dS = s(d10 + 40.19140625d, d11, dArr) / 2.85040095144011776E17d;
                if (dArr != null) {
                    dArr[0] = dArr[0] / 2.85040095144011776E17d;
                    dArr[1] = dArr[1] / 2.85040095144011776E17d;
                }
                return dS;
            }
            if (i10 == -709) {
                double dS2 = s(d10 + 1.494140625d, d11, dArr) / 4.455505956692757d;
                if (dArr != null) {
                    dArr[0] = dArr[0] / 4.455505956692757d;
                    dArr[1] = dArr[1] / 4.455505956692757d;
                }
                return dS2;
            }
            i10--;
        } else if (i10 > 709) {
            if (dArr != null) {
                dArr[0] = Double.POSITIVE_INFINITY;
                dArr[1] = 0.0d;
            }
            return Double.POSITIVE_INFINITY;
        }
        int i11 = i10 + 750;
        double d13 = c.f657a[i11];
        double d14 = c.f658b[i11];
        double d15 = i10;
        int i12 = (int) ((d10 - d15) * 1024.0d);
        double d16 = b.f655a[i12];
        double d17 = b.f656b[i12];
        double d18 = d10 - (d15 + (((double) i12) / 1024.0d));
        double d19 = (((((((0.04168701738764507d * d18) + 0.1666666505023083d) * d18) + 0.5000000000042687d) * d18) + 1.0d) * d18) - 3.940510424527919E-20d;
        double d20 = d13 * d16;
        double d21 = (d13 * d17) + (d16 * d14) + (d14 * d17);
        double d22 = d21 + d20;
        if (d22 == Double.POSITIVE_INFINITY) {
            if (dArr != null) {
                dArr[0] = Double.POSITIVE_INFINITY;
                dArr[1] = 0.0d;
            }
            return Double.POSITIVE_INFINITY;
        }
        if (d11 != 0.0d) {
            double d23 = d22 * d11;
            d12 = (d23 * d19) + d23 + (d22 * d19) + d21 + d20;
        } else {
            d12 = (d22 * d19) + d21 + d20;
        }
        if (dArr != null) {
            dArr[0] = d20;
            double d24 = d22 * d11;
            dArr[1] = (d24 * d19) + d24 + (d22 * d19) + d21;
        }
        return d12;
    }

    private static double t(double d10, double[] dArr) {
        boolean z10;
        double d11 = d10;
        if (Double.isNaN(d11) || d11 == 0.0d) {
            return d11;
        }
        if (d11 <= -1.0d || d11 >= 1.0d) {
            double[] dArr2 = new double[2];
            s(d11, 0.0d, dArr2);
            if (d11 > 0.0d) {
                return (dArr2[0] - 1.0d) + dArr2[1];
            }
            double d12 = dArr2[0];
            double d13 = (-1.0d) + d12;
            return d13 + (-((1.0d + d13) - d12)) + dArr2[1];
        }
        if (d11 < 0.0d) {
            d11 = -d11;
            z10 = true;
        } else {
            z10 = false;
        }
        int i10 = (int) (d11 * 1024.0d);
        double d14 = b.f655a[i10] - 1.0d;
        double d15 = b.f656b[i10];
        double d16 = d14 + d15;
        double d17 = d16 * 1.073741824E9d;
        double d18 = (d16 + d17) - d17;
        double d19 = (-((d16 - d14) - d15)) + (d16 - d18);
        double d20 = d11 - (((double) i10) / 1024.0d);
        double d21 = ((((((0.008336750013465571d * d20) + 0.041666663879186654d) * d20) + 0.16666666666745392d) * d20) + 0.49999999999999994d) * d20 * d20;
        double d22 = d20 + d21;
        double d23 = -((d22 - d20) - d21);
        double d24 = d22 * 1.073741824E9d;
        double d25 = (d22 + d24) - d24;
        double d26 = d23 + (d22 - d25);
        double d27 = d25 * d18;
        double d28 = d25 * d19;
        double d29 = d27 + d28;
        double d30 = -((d29 - d27) - d28);
        double d31 = d26 * d18;
        double d32 = d29 + d31;
        double d33 = d30 + (-((d32 - d29) - d31));
        double d34 = d26 * d19;
        double d35 = d32 + d34;
        double d36 = d33 + (-((d35 - d32) - d34));
        double d37 = d35 + d18;
        double d38 = d37 + d25;
        double d39 = d36 + (-((d37 - d18) - d35)) + (-((d38 - d37) - d25));
        double d40 = d38 + d19;
        double d41 = d39 + (-((d40 - d38) - d19));
        double d42 = d40 + d26;
        double d43 = d41 + (-((d42 - d40) - d26));
        if (z10) {
            double d44 = d42 + 1.0d;
            double d45 = 1.0d / d44;
            double d46 = (-((d44 - 1.0d) - d42)) + d43;
            double d47 = d42 * d45;
            double d48 = d47 * 1.073741824E9d;
            double d49 = (d47 + d48) - d48;
            double d50 = d47 - d49;
            double d51 = d44 * 1.073741824E9d;
            double d52 = (d44 + d51) - d51;
            double d53 = d44 - d52;
            double d54 = d50 + (((((d42 - (d52 * d49)) - (d52 * d50)) - (d53 * d49)) - (d53 * d50)) * d45) + (d43 * d45) + ((-d42) * d46 * d45 * d45);
            d42 = -d49;
            d43 = -d54;
        }
        if (dArr != null) {
            dArr[0] = d42;
            dArr[1] = d43;
        }
        return d42 + d43;
    }

    public static double u(double d10) {
        if (Double.isNaN(d10) || d10 >= 4.503599627370496E15d || d10 <= -4.503599627370496E15d) {
            return d10;
        }
        long j10 = (long) d10;
        if (d10 < 0.0d && j10 != d10) {
            j10--;
        }
        return j10 == 0 ? d10 * j10 : j10;
    }

    public static pi.b v(pi.b bVar) {
        return (pi.b) bVar.Q();
    }

    public static int w(double d10) {
        return ((int) ((Double.doubleToRawLongBits(d10) >>> 52) & 2047)) - 1023;
    }

    public static double x(double d10, double d11) {
        if (Double.isInfinite(d10) || Double.isInfinite(d11)) {
            return Double.POSITIVE_INFINITY;
        }
        if (Double.isNaN(d10) || Double.isNaN(d11)) {
            return Double.NaN;
        }
        int iW = w(d10);
        int iW2 = w(d11);
        if (iW > iW2 + 27) {
            return b(d10);
        }
        if (iW2 > iW + 27) {
            return b(d11);
        }
        int i10 = (iW + iW2) / 2;
        int i11 = -i10;
        double dO = O(d10, i11);
        double dO2 = O(d11, i11);
        return O(U((dO * dO) + (dO2 * dO2)), i10);
    }

    public static double y(double d10) {
        return z(d10, null);
    }

    private static double z(double d10, double[] dArr) {
        double d11;
        double d12;
        if (d10 == 0.0d) {
            return Double.NEGATIVE_INFINITY;
        }
        long jDoubleToRawLongBits = Double.doubleToRawLongBits(d10);
        if (((Long.MIN_VALUE & jDoubleToRawLongBits) != 0 || Double.isNaN(d10)) && d10 != 0.0d) {
            if (dArr != null) {
                dArr[0] = Double.NaN;
            }
            return Double.NaN;
        }
        if (d10 == Double.POSITIVE_INFINITY) {
            if (dArr != null) {
                dArr[0] = Double.POSITIVE_INFINITY;
            }
            return Double.POSITIVE_INFINITY;
        }
        int i10 = ((int) (jDoubleToRawLongBits >> 52)) - 1023;
        if ((9218868437227405312L & jDoubleToRawLongBits) == 0) {
            if (d10 == 0.0d) {
                if (dArr != null) {
                    dArr[0] = Double.NEGATIVE_INFINITY;
                }
                return Double.NEGATIVE_INFINITY;
            }
            jDoubleToRawLongBits <<= 1;
            while ((4503599627370496L & jDoubleToRawLongBits) == 0) {
                i10--;
                jDoubleToRawLongBits <<= 1;
            }
        }
        if ((i10 == -1 || i10 == 0) && d10 < 1.01d && d10 > 0.99d && dArr == null) {
            double d13 = d10 - 1.0d;
            double d14 = d13 * 1.073741824E9d;
            double d15 = (d13 + d14) - d14;
            double d16 = d13 - d15;
            double[][] dArr2 = f640b;
            double[] dArr3 = dArr2[dArr2.length - 1];
            double d17 = dArr3[0];
            double d18 = dArr3[1];
            for (int length = dArr2.length - 2; length >= 0; length--) {
                double d19 = d17 * d15;
                double d20 = (d17 * d16) + (d18 * d15) + (d18 * d16);
                double d21 = d19 * 1.073741824E9d;
                double d22 = (d19 + d21) - d21;
                double d23 = (d19 - d22) + d20;
                double[] dArr4 = f640b[length];
                double d24 = d22 + dArr4[0];
                double d25 = d24 * 1.073741824E9d;
                d17 = (d24 + d25) - d25;
                d18 = (d24 - d17) + d23 + dArr4[1];
            }
            double d26 = d17 * d15;
            double d27 = (d17 * d16) + (d15 * d18) + (d18 * d16);
            double d28 = 1.073741824E9d * d26;
            double d29 = (d26 + d28) - d28;
            return d29 + (d26 - d29) + d27;
        }
        long j10 = 4499201580859392L & jDoubleToRawLongBits;
        double[] dArr5 = e.f665a[(int) (j10 >> 42)];
        double d30 = jDoubleToRawLongBits & 4398046511103L;
        double d31 = j10 + 4.503599627370496E15d;
        double d32 = d30 / d31;
        if (dArr != null) {
            double d33 = d32 * 1.073741824E9d;
            double d34 = (d32 + d33) - d33;
            double d35 = d32 - d34;
            double d36 = d35 + (((d30 - (d34 * d31)) - (d35 * d31)) / d31);
            double[][] dArr6 = f641c;
            double[] dArr7 = dArr6[dArr6.length - 1];
            double d37 = dArr7[0];
            double d38 = dArr7[1];
            for (int length2 = dArr6.length - 2; length2 >= 0; length2--) {
                double d39 = d37 * d34;
                double d40 = (d37 * d36) + (d38 * d34) + (d38 * d36);
                double d41 = d39 * 1.073741824E9d;
                double d42 = (d39 + d41) - d41;
                double d43 = (d39 - d42) + d40;
                double[] dArr8 = f641c[length2];
                double d44 = d42 + dArr8[0];
                double d45 = d44 * 1.073741824E9d;
                d37 = (d44 + d45) - d45;
                d38 = (d44 - d37) + d43 + dArr8[1];
            }
            double d46 = d37 * d34;
            double d47 = (d37 * d36) + (d34 * d38) + (d38 * d36);
            d11 = d46 + d47;
            d12 = -((d11 - d46) - d47);
        } else {
            d11 = (((((((((((-0.16624882440418567d) * d32) + 0.19999954120254515d) * d32) - 0.2499999997677497d) * d32) + 0.3333333333332802d) * d32) - 0.5d) * d32) + 1.0d) * d32;
            d12 = 0.0d;
        }
        double d48 = i10;
        double d49 = 0.6931470632553101d * d48;
        double d50 = dArr5[0];
        double d51 = d49 + d50;
        double d52 = d51 + d11;
        double d53 = d48 * 1.1730463525082348E-7d;
        double d54 = d52 + d53;
        double d55 = (-((d51 - d49) - d50)) + 0.0d + (-((d52 - d51) - d11)) + (-((d54 - d52) - d53));
        double d56 = dArr5[1];
        double d57 = d54 + d56;
        double d58 = d55 + (-((d57 - d54) - d56));
        double d59 = d57 + d12;
        double d60 = d58 + (-((d59 - d57) - d12));
        if (dArr != null) {
            dArr[0] = d59;
            dArr[1] = d60;
        }
        return d59 + d60;
    }

    /* JADX INFO: renamed from: aj.d$d, reason: collision with other inner class name */
    private static class C0013d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final C0013d f659d = new C0013d(Double.NaN, 0.0d);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final C0013d f660e = new C0013d(Double.POSITIVE_INFINITY, 0.0d);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final C0013d f661f = new C0013d(Double.NEGATIVE_INFINITY, 0.0d);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final double f662a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final double f663b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final double f664c;

        C0013d(double d10) {
            this.f662a = d10;
            double dLongBitsToDouble = Double.longBitsToDouble(Double.doubleToRawLongBits(d10) & (-134217728));
            this.f663b = dLongBitsToDouble;
            this.f664c = d10 - dLongBitsToDouble;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public C0013d d(long j10) {
            C0013d c0013d = new C0013d(1.0d);
            C0013d c0013d2 = new C0013d(this.f662a, this.f663b, this.f664c);
            for (long j11 = j10; j11 != 0; j11 >>>= 1) {
                if ((1 & j11) != 0) {
                    c0013d = c0013d.c(c0013d2);
                }
                c0013d2 = c0013d2.c(c0013d2);
            }
            return Double.isNaN(c0013d.f662a) ? Double.isNaN(this.f662a) ? f659d : d.b(this.f662a) < 1.0d ? new C0013d(d.m(0.0d, this.f662a), 0.0d) : (this.f662a >= 0.0d || (j10 & 1) != 1) ? f660e : f661f : c0013d;
        }

        public C0013d c(C0013d c0013d) {
            C0013d c0013d2 = new C0013d(this.f662a * c0013d.f662a);
            double d10 = this.f664c;
            double d11 = c0013d.f664c;
            double d12 = c0013d2.f662a;
            double d13 = this.f663b;
            double d14 = c0013d.f663b;
            return new C0013d(c0013d2.f663b, c0013d2.f664c + ((d10 * d11) - (((d12 - (d13 * d14)) - (d10 * d14)) - (d13 * d11))));
        }

        public C0013d e() {
            C0013d c0013d = new C0013d(1.0d / this.f662a);
            C0013d c0013dC = c(c0013d);
            double d10 = (c0013dC.f663b - 1.0d) + c0013dC.f664c;
            return Double.isNaN(d10) ? c0013d : new C0013d(c0013d.f663b, c0013d.f664c - (d10 / this.f662a));
        }

        /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
            java.lang.NullPointerException
            	at jadx.core.dex.visitors.InitCodeVariables.collectConnectedVars(InitCodeVariables.java:119)
            	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:82)
            	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
            	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
            	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
            */
        C0013d(double r10, double r12) {
            /*
                r9 = this;
                r0 = 0
                int r2 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
                if (r2 != 0) goto L20
                int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
                if (r2 != 0) goto L1b
                long r0 = java.lang.Double.doubleToRawLongBits(r10)
                r2 = -9223372036854775808
                int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r4 != 0) goto L1b
                r0 = -9223372036854775808
            L16:
                r2 = r9
                r5 = r10
                r7 = r12
                r3 = r0
                goto L23
            L1b:
                r2 = r9
                r5 = r10
                r3 = r12
                r7 = r3
                goto L23
            L20:
                double r0 = r10 + r12
                goto L16
            L23:
                r2.<init>(r3, r5, r7)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: aj.d.C0013d.<init>(double, double):void");
        }

        C0013d(double d10, double d11, double d12) {
            this.f662a = d10;
            this.f663b = d11;
            this.f664c = d12;
        }
    }
}
