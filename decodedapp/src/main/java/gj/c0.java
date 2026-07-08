package gj;

import java.lang.reflect.Array;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
abstract class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private double[][] f14553a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private double[][] f14554b;

    protected c0() {
        Class cls = Double.TYPE;
        this.f14553a = (double[][]) Array.newInstance((Class<?>) cls, 0, 0);
        this.f14554b = (double[][]) Array.newInstance((Class<?>) cls, 0, 0);
    }

    public static c0 d(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, int i21, int i22, int i23, int i24) {
        if (i10 == 0 && i11 == 0 && i12 == 0 && i13 == 0 && i14 == 0 && i15 == 0) {
            return new x(i16, i17, i18, i19, i20, i21, i22, i23, i24);
        }
        if (i10 == 0 && i16 == 0 && i17 == 0 && i18 == 0 && i19 == 0 && i20 == 0 && i21 == 0 && i22 == 0 && i23 == 0 && i24 == 0) {
            return new u(i11, i12, i13, i14, i15);
        }
        if (i10 != 0 && i16 == 0 && i17 == 0 && i18 == 0 && i19 == 0 && i20 == 0 && i21 == 0 && i22 == 0 && i23 == 0 && i24 == 0) {
            return new d0(i10, i11, i12, i13, i14, i15);
        }
        if (i10 == 0 && i12 == 0 && i22 == 0 && i23 == 0 && i24 == 0) {
            return new v(i11, i13, i14, i15, i16, i17, i18, i19, i20, i21);
        }
        if (i10 == 0) {
            return new p(i11, i12, i13, i14, i15, i16, i17, i18, i19, i20, i21, i22, i23, i24);
        }
        throw new hj.e(null);
    }

    private static double[] f(int i10, double[] dArr) {
        if (dArr.length > i10) {
            return dArr;
        }
        double[] dArr2 = new double[i10 + 1];
        System.arraycopy(dArr, 0, dArr2, 0, dArr.length);
        return dArr2;
    }

    private static double[][] g(int i10, int i11, double[][] dArr) {
        if (dArr.length <= i10) {
            int i12 = i10 + 1;
            double[][] dArr2 = new double[i12][];
            System.arraycopy(dArr, 0, dArr2, 0, dArr.length);
            Arrays.fill(dArr2, dArr.length, i12, new double[0]);
            dArr = dArr2;
        }
        dArr[i10] = f(i11, dArr[i10]);
        return dArr;
    }

    public void a(int i10, int i11, double d10, double d11) {
        this.f14553a = g(i10, i11, this.f14553a);
        double[][] dArrG = g(i10, i11, this.f14554b);
        this.f14554b = dArrG;
        if (i11 >= 0) {
            double[] dArr = this.f14553a[i10];
            dArr[i11] = dArr[i11] + d10;
            double[] dArr2 = dArrG[i10];
            dArr2[i11] = dArr2[i11] + d11;
        }
    }

    protected abstract double b(b bVar);

    protected abstract double c(b bVar);

    public double[] e(b bVar) {
        int i10;
        double d10;
        double d11;
        double d12;
        double dU = bVar.u();
        double dB = b(bVar);
        double dC = c(bVar);
        aj.m mVarR = aj.d.R(dB);
        int length = this.f14553a.length;
        double[] dArr = new double[length];
        int i11 = 0;
        while (i11 < length) {
            double[] dArr2 = this.f14553a[i11];
            double d13 = 0.0d;
            if (dArr2.length > 0) {
                int length2 = dArr2.length - 1;
                double d14 = 0.0d;
                double d15 = 0.0d;
                double d16 = 0.0d;
                while (length2 > 0) {
                    double d17 = this.f14553a[i11][length2];
                    d13 = (d13 * dU) + d17;
                    double d18 = this.f14554b[i11][length2];
                    d14 = (d14 * dU) + d18;
                    double d19 = length2;
                    d15 = (d15 * dU) + (d17 * d19);
                    d16 = (d16 * dU) + (d19 * d18);
                    length2--;
                    i11 = i11;
                }
                i10 = i11;
                double d20 = (d13 * dU) + this.f14553a[i10][0];
                d10 = (d14 * dU) + this.f14554b[i10][0];
                double d21 = d15 / 3.15576E9d;
                d11 = d16 / 3.15576E9d;
                d12 = d20;
                d13 = d21;
            } else {
                i10 = i11;
                d10 = 0.0d;
                d11 = 0.0d;
                d12 = 0.0d;
            }
            dArr[i10] = ((d13 - (d10 * dC)) * mVarR.b()) + ((d11 + (d12 * dC)) * mVarR.a());
            i11 = i10 + 1;
        }
        return dArr;
    }

    public double h(int i10, int i11) {
        return this.f14554b[i10][i11];
    }

    public int i(int i10) {
        return this.f14553a[i10].length - 1;
    }

    public double j(int i10, int i11) {
        return this.f14553a[i10][i11];
    }

    public double[] k(b bVar) {
        double dU = bVar.u();
        aj.m mVarR = aj.d.R(b(bVar));
        int length = this.f14553a.length;
        double[] dArr = new double[length];
        for (int i10 = 0; i10 < length; i10++) {
            double d10 = 0.0d;
            double d11 = 0.0d;
            for (int length2 = this.f14553a[i10].length - 1; length2 >= 0; length2--) {
                d10 = (d10 * dU) + this.f14553a[i10][length2];
                d11 = (d11 * dU) + this.f14554b[i10][length2];
            }
            dArr[i10] = (d10 * mVarR.b()) + (d11 * mVarR.a());
        }
        return dArr;
    }
}
