package yi;

import java.io.Serializable;
import java.lang.reflect.Array;

/* JADX INFO: loaded from: classes3.dex */
public class c extends a implements Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private double[][] f32609b;

    public c(int i10, int i11) {
        super(i10, i11);
        this.f32609b = (double[][]) Array.newInstance((Class<?>) Double.TYPE, i10, i11);
    }

    private void j(double[][] dArr) {
        g(dArr, 0, 0);
    }

    private double[][] k() {
        int iB = b();
        double[][] dArr = (double[][]) Array.newInstance((Class<?>) Double.TYPE, iB, a());
        for (int i10 = 0; i10 < iB; i10++) {
            double[] dArr2 = this.f32609b[i10];
            System.arraycopy(dArr2, 0, dArr[i10], 0, dArr2.length);
        }
        return dArr;
    }

    @Override // yi.a, yi.b
    public int a() {
        double[] dArr;
        double[][] dArr2 = this.f32609b;
        if (dArr2 == null || (dArr = dArr2[0]) == null) {
            return 0;
        }
        return dArr.length;
    }

    @Override // yi.a, yi.b
    public int b() {
        double[][] dArr = this.f32609b;
        if (dArr == null) {
            return 0;
        }
        return dArr.length;
    }

    @Override // yi.a, yi.j
    public double c(int i10, int i11) {
        try {
            return this.f32609b[i10][i11];
        } catch (IndexOutOfBoundsException e10) {
            h.b(this, i10, i11);
            throw e10;
        }
    }

    @Override // yi.a, yi.j
    public void d(int i10, int i11, double d10) {
        h.b(this, i10, i11);
        this.f32609b[i10][i11] = d10;
    }

    @Override // yi.a
    public j f(int i10, int i11) {
        return new c(i10, i11);
    }

    @Override // yi.a
    public void g(double[][] dArr, int i10, int i11) {
        if (this.f32609b != null) {
            super.g(dArr, i10, i11);
            return;
        }
        if (i10 > 0) {
            throw new ui.f(ui.d.FIRST_ROWS_NOT_INITIALIZED_YET, Integer.valueOf(i10));
        }
        if (i11 > 0) {
            throw new ui.f(ui.d.FIRST_COLUMNS_NOT_INITIALIZED_YET, Integer.valueOf(i11));
        }
        aj.j.b(dArr);
        if (dArr.length == 0) {
            throw new ui.e(ui.d.AT_LEAST_ONE_ROW, new Object[0]);
        }
        int length = dArr[0].length;
        if (length == 0) {
            throw new ui.e(ui.d.AT_LEAST_ONE_COLUMN, new Object[0]);
        }
        this.f32609b = (double[][]) Array.newInstance((Class<?>) Double.TYPE, dArr.length, length);
        int i12 = 0;
        while (true) {
            double[][] dArr2 = this.f32609b;
            if (i12 >= dArr2.length) {
                return;
            }
            double[] dArr3 = dArr[i12];
            if (dArr3.length != length) {
                throw new ui.e(ui.d.DIMENSIONS_MISMATCH, Integer.valueOf(dArr[i12].length), Integer.valueOf(length));
            }
            System.arraycopy(dArr3, 0, dArr2[i12 + i10], i11, length);
            i12++;
        }
    }

    @Override // yi.j
    public double[][] getData() {
        return k();
    }

    @Override // yi.a
    public double i(l lVar) {
        int iB = b();
        int iA = a();
        lVar.b(iB, iA, 0, iB - 1, 0, iA - 1);
        for (int i10 = 0; i10 < iB; i10++) {
            double[] dArr = this.f32609b[i10];
            for (int i11 = 0; i11 < iA; i11++) {
                lVar.a(i10, i11, dArr[i11]);
            }
        }
        return lVar.end();
    }

    public c(double[][] dArr) {
        j(dArr);
    }
}
