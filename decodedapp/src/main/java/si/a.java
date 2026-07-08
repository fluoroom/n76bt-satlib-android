package si;

import aj.b;
import aj.j;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import ui.d;
import ui.e;

/* JADX INFO: loaded from: classes3.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f27382a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f27383b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List f27384c = new ArrayList();

    private void b() {
        if (this.f27382a.isEmpty()) {
            throw new e(d.EMPTY_INTERPOLATION_SAMPLE, new Object[0]);
        }
    }

    public void a(double d10, double[]... dArr) {
        for (int i10 = 0; i10 < dArr.length; i10++) {
            double[] dArr2 = (double[]) dArr[i10].clone();
            if (i10 > 1) {
                double dA = 1.0d / b.a(i10);
                for (int i11 = 0; i11 < dArr2.length; i11++) {
                    dArr2[i11] = dArr2[i11] * dA;
                }
            }
            int size = this.f27382a.size();
            this.f27384c.add(size - i10, dArr2);
            int i12 = i10;
            double[] dArr3 = dArr2;
            while (i12 < size) {
                i12++;
                int i13 = size - i12;
                double[] dArr4 = (double[]) this.f27384c.get(i13);
                double dDoubleValue = 1.0d / (d10 - ((Double) this.f27382a.get(i13)).doubleValue());
                if (Double.isInfinite(dDoubleValue)) {
                    throw new e(d.DUPLICATED_ABSCISSA_DIVISION_BY_ZERO, Double.valueOf(d10));
                }
                for (int i14 = 0; i14 < dArr2.length; i14++) {
                    dArr4[i14] = (dArr3[i14] - dArr4[i14]) * dDoubleValue;
                }
                dArr3 = dArr4;
            }
            this.f27383b.add((double[]) dArr3.clone());
            this.f27382a.add(Double.valueOf(d10));
        }
    }

    public double[][] c(double d10, int i10) {
        j.b(Double.valueOf(d10));
        if (this.f27382a.isEmpty()) {
            throw new e(d.EMPTY_INTERPOLATION_SAMPLE, new Object[0]);
        }
        int i11 = i10 + 1;
        double[] dArr = new double[i11];
        dArr[0] = 0.0d;
        int i12 = 0;
        while (i12 < i10) {
            int i13 = i12 + 1;
            dArr[i13] = dArr[i12] + 1.0d;
            i12 = i13;
        }
        double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, i11, ((double[]) this.f27383b.get(0)).length);
        double[] dArr3 = new double[i11];
        dArr3[0] = 1.0d;
        for (int i14 = 0; i14 < this.f27383b.size(); i14++) {
            double[] dArr4 = (double[]) this.f27383b.get(i14);
            double dDoubleValue = d10 - ((Double) this.f27382a.get(i14)).doubleValue();
            for (int i15 = i10; i15 >= 0; i15--) {
                int i16 = 0;
                while (true) {
                    double[] dArr5 = dArr2[i15];
                    if (i16 >= dArr5.length) {
                        break;
                    }
                    dArr5[i16] = dArr5[i16] + (dArr4[i16] * dArr3[i15]);
                    i16++;
                }
                double d11 = dArr3[i15] * dDoubleValue;
                dArr3[i15] = d11;
                if (i15 > 0) {
                    dArr3[i15] = d11 + (dArr[i15] * dArr3[i15 - 1]);
                }
            }
        }
        return dArr2;
    }

    public double[] d(double d10) {
        b();
        int length = ((double[]) this.f27383b.get(0)).length;
        double[] dArr = new double[length];
        double dDoubleValue = 1.0d;
        for (int i10 = 0; i10 < this.f27383b.size(); i10++) {
            double[] dArr2 = (double[]) this.f27383b.get(i10);
            for (int i11 = 0; i11 < length; i11++) {
                dArr[i11] = dArr[i11] + (dArr2[i11] * dDoubleValue);
            }
            dDoubleValue *= d10 - ((Double) this.f27382a.get(i10)).doubleValue();
        }
        return dArr;
    }
}
