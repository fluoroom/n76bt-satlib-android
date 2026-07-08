package oj;

/* JADX INFO: loaded from: classes3.dex */
public abstract class b {

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f23597a;

        static {
            int[] iArr = new int[n.values().length];
            f23597a = iArr;
            try {
                iArr[n.ECCENTRIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f23597a[n.MEAN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f23597a[n.TRUE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static double a(n nVar, double d10, double d11, double d12, n nVar2) {
        if (nVar == nVar2) {
            return d10;
        }
        int i10 = a.f23597a[nVar2.ordinal()];
        if (i10 == 1) {
            return nVar == n.MEAN ? f(d11, d12, d10) : h(d11, d12, d10);
        }
        if (i10 == 2) {
            return nVar == n.TRUE ? i(d11, d12, d10) : d(d11, d12, d10);
        }
        if (i10 == 3) {
            return nVar == n.MEAN ? g(d11, d12, d10) : e(d11, d12, d10);
        }
        throw new hj.e(null);
    }

    private static double b(double d10, double d11) {
        return aj.d.h(d10 / d11) * 2.0d;
    }

    private static double c(double d10, double d11) {
        return aj.d.U((1.0d - (d10 * d10)) - (d11 * d11));
    }

    public static double d(double d10, double d11, double d12) {
        aj.m mVarR = aj.d.R(d12);
        return d12 + ((d11 * mVarR.a()) - (d10 * mVarR.b()));
    }

    public static double e(double d10, double d11, double d12) {
        double dC = c(d10, d11);
        aj.m mVarR = aj.d.R(d12);
        return d12 + b((mVarR.b() * d10) - (mVarR.a() * d11), ((dC + 1.0d) - (d10 * mVarR.a())) - (d11 * mVarR.b()));
    }

    public static double f(double d10, double d11, double d12) {
        boolean z10;
        double d13 = 0.0d;
        double d14 = d12;
        int i10 = 0;
        do {
            aj.m mVarR = aj.d.R(d14);
            double dB = (mVarR.b() * d10) - (mVarR.a() * d11);
            double dA = (1.0d - (mVarR.a() * d10)) - (mVarR.b() * d11);
            double d15 = d13 - dB;
            double d16 = 2.0d * dA;
            double d17 = (d15 * d16) / ((dA * d16) - (d15 * dB));
            d13 -= d17;
            d14 = d12 + d13;
            z10 = aj.d.b(d17) <= 1.0E-11d;
            i10++;
            if (i10 >= 50) {
                break;
            }
        } while (!z10);
        if (z10) {
            return d14;
        }
        throw new hj.a(hj.f.UNABLE_TO_COMPUTE_ECCENTRIC_LATITUDE_ARGUMENT, Integer.valueOf(i10));
    }

    public static double g(double d10, double d11, double d12) {
        return e(d10, d11, f(d10, d11, d12));
    }

    public static double h(double d10, double d11, double d12) {
        double dC = c(d10, d11);
        aj.m mVarR = aj.d.R(d12);
        return d12 + b((mVarR.a() * d11) - (mVarR.b() * d10), dC + 1.0d + (d10 * mVarR.a()) + (d11 * mVarR.b()));
    }

    public static double i(double d10, double d11, double d12) {
        return d(d10, d11, h(d10, d11, d12));
    }
}
