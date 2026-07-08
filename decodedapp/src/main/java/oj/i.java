package oj;

/* JADX INFO: loaded from: classes3.dex */
public abstract class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final double f23615a = 1.2043347651023166d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final double f23616b = 4.64788969626918d;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f23617a;

        static {
            int[] iArr = new int[n.values().length];
            f23617a = iArr;
            try {
                iArr[n.MEAN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f23617a[n.ECCENTRIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f23617a[n.TRUE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static double a(n nVar, double d10, double d11, n nVar2) {
        if (nVar2 == nVar) {
            return d10;
        }
        if (d11 > 1.0d) {
            int i10 = a.f23617a[nVar2.ordinal()];
            if (i10 == 1) {
                return nVar == n.ECCENTRIC ? i(d11, d10) : n(d11, d10);
            }
            if (i10 == 2) {
                return nVar == n.MEAN ? k(d11, d10) : m(d11, d10);
            }
            if (i10 == 3) {
                return nVar == n.ECCENTRIC ? j(d11, d10) : l(d11, d10);
            }
        } else {
            int i11 = a.f23617a[nVar2.ordinal()];
            if (i11 == 1) {
                return nVar == n.ECCENTRIC ? c(d11, d10) : h(d11, d10);
            }
            if (i11 == 2) {
                return nVar == n.MEAN ? e(d11, d10) : g(d11, d10);
            }
            if (i11 == 3) {
                return nVar == n.ECCENTRIC ? d(d11, d10) : f(d11, d10);
            }
        }
        throw new hj.e(null);
    }

    private static double b(double d10, double d11) {
        double dP = (1.0d - d10) * aj.d.P(d11);
        double d12 = (-d11) * d11;
        double d13 = 0.0d;
        double d14 = Double.NaN;
        while (!Double.valueOf(dP).equals(Double.valueOf(d14))) {
            d13 += 2.0d;
            d11 *= d12 / ((d13 + 1.0d) * d13);
            d14 = dP;
            dP -= d11;
        }
        return dP;
    }

    public static double c(double d10, double d11) {
        return d11 - (d10 * aj.d.P(d11));
    }

    public static double d(double d10, double d11) {
        double dU = d10 / (aj.d.U((1.0d - d10) * (d10 + 1.0d)) + 1.0d);
        aj.m mVarR = aj.d.R(d11);
        return d11 + (aj.d.h((mVarR.b() * dU) / (1.0d - (dU * mVarR.a()))) * 2.0d);
    }

    public static double e(double d10, double d11) {
        double dK;
        double dB;
        double d12;
        double dF = aj.j.f(d11, 0.0d);
        if (aj.d.b(dF) < 0.16666666666666666d) {
            dK = (aj.d.k(dF * 6.0d) - dF) * d10;
        } else if (dF < 0.0d) {
            double d13 = dF + 3.141592653589793d;
            dK = d10 * ((((f23615a * d13) / (f23616b - d13)) - 3.141592653589793d) - dF);
        } else {
            double d14 = 3.141592653589793d - dF;
            dK = d10 * ((3.141592653589793d - ((f23615a * d14) / (f23616b - d14))) - dF);
        }
        double d15 = dK + dF;
        double d16 = 1.0d - d10;
        boolean z10 = ((d15 * d15) / 6.0d) + d16 >= 0.1d;
        for (int i10 = 0; i10 < 2; i10++) {
            aj.m mVarR = aj.d.R(d15);
            double dB2 = mVarR.b() * d10;
            double dA = mVarR.a() * d10;
            if (z10) {
                dB = (d15 - dB2) - dF;
                d12 = 1.0d - dA;
            } else {
                dB = b(d10, d15) - dF;
                double dP = aj.d.P(d15 * 0.5d);
                d12 = d16 + (2.0d * d10 * dP * dP);
            }
            double d17 = (dB * d12) / (((dB * 0.5d) * dB2) - (d12 * d12));
            double d18 = 0.5d * d17;
            double d19 = d12 + ((dB2 + ((d17 * dA) / 3.0d)) * d18);
            double d20 = d12 + ((dB2 + (d18 * dA)) * d17);
            d15 -= (dB - (d17 * (d20 - d19))) / d20;
        }
        return d15 + (d11 - dF);
    }

    public static double f(double d10, double d11) {
        return d(d10, e(d10, d11));
    }

    public static double g(double d10, double d11) {
        double dU = d10 / (aj.d.U(1.0d - (d10 * d10)) + 1.0d);
        aj.m mVarR = aj.d.R(d11);
        return d11 - (aj.d.h((mVarR.b() * dU) / ((dU * mVarR.a()) + 1.0d)) * 2.0d);
    }

    public static double h(double d10, double d11) {
        return c(d10, g(d10, d11));
    }

    public static double i(double d10, double d11) {
        return (d10 * aj.d.T(d11)) - d11;
    }

    public static double j(double d10, double d11) {
        return aj.d.h(aj.d.U((d10 + 1.0d) / (d10 - 1.0d)) * aj.d.X(d11 * 0.5d)) * 2.0d;
    }

    public static double k(double d10, double d11) {
        double d12;
        double d13;
        double dG;
        double d14 = d11 / d10;
        double d15 = 1.0d;
        double d16 = 1.0d / d10;
        double d17 = 1.0d - d16;
        if (d14 == 0.0d) {
            return 0.0d;
        }
        double dU = aj.d.U((d14 * d14) + 1.0d);
        double dG2 = aj.d.g(d14);
        double d18 = ((d16 * d16) * dG2) / ((dU * dU) * dU);
        double d19 = 1.0d - (d16 / dU);
        double dK = ((dG2 * d16) / aj.d.k(((d19 * d19) * d19) + ((d18 * d14) * (1.5d - (1.3333333333333333d * d16))))) + d14;
        int i10 = 0;
        while (i10 < 2) {
            double d20 = dK * dK;
            double d21 = d20 + d15;
            double dU2 = aj.d.U(d21);
            double d22 = d21 * dU2;
            double d23 = (d16 * dK) / d22;
            double d24 = ((d15 - (d20 * 2.0d)) * d16) / (d22 * d21);
            if ((d20 / 6.0d) + d17 >= 0.5d) {
                dG = (dK - (aj.d.g(dK) * d16)) - d14;
                d13 = d15 - (d16 / dU2);
                d12 = d15;
            } else {
                double dU3 = dK / (aj.d.U(d21) + d15);
                double d25 = dU3 * dU3;
                double d26 = (d17 + (d16 * d25)) * dK;
                double d27 = d16 * 2.0d * dU3;
                double d28 = d15;
                int i11 = 0;
                while (true) {
                    i11++;
                    d12 = d15;
                    if (i11 == 1000000) {
                        throw new ui.f(hj.f.UNABLE_TO_COMPUTE_HYPERBOLIC_ECCENTRIC_ANOMALY, Integer.valueOf(i11));
                    }
                    d28 += 2.0d;
                    d27 *= d25;
                    double d29 = d26 - (d27 / d28);
                    if (d29 == d26) {
                        d13 = ((d20 / (dU2 + d12)) + d17) / dU2;
                        dG = d29 - d14;
                        break;
                    }
                    d26 = d29;
                    d15 = d12;
                }
            }
            double d30 = (dG * d13) / (((dG * 0.5d) * d23) - (d13 * d13));
            double d31 = dK + d30;
            if (dK == d31) {
                break;
            }
            double d32 = 0.5d * d30;
            dK = d31 - ((dG + ((((d23 + ((d30 / 3.0d) * d24)) * d32) + d13) * d30)) / (d13 + (d30 * (d23 + (d32 * d24)))));
            i10++;
            d15 = d12;
        }
        return aj.d.g(dK);
    }

    public static double l(double d10, double d11) {
        return j(d10, k(d10, d11));
    }

    public static double m(double d10, double d11) {
        aj.m mVarR = aj.d.R(d11);
        return aj.d.g((aj.d.U((d10 * d10) - 1.0d) * mVarR.b()) / ((d10 * mVarR.a()) + 1.0d));
    }

    public static double n(double d10, double d11) {
        return i(d10, m(d10, d11));
    }
}
