package yi;

import java.io.Serializable;
import java.lang.reflect.Array;

/* JADX INFO: loaded from: classes3.dex */
public class e extends a implements Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final double[][] f32612b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f32613c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f32614d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f32615e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f32616f;

    public e(int i10, int i11) {
        super(i10, i11);
        this.f32613c = i10;
        this.f32614d = i11;
        this.f32615e = (i10 + 51) / 52;
        this.f32616f = (i11 + 51) / 52;
        this.f32612b = l(i10, i11);
    }

    private int j(int i10) {
        if (i10 == this.f32615e - 1) {
            return this.f32613c - (i10 * 52);
        }
        return 52;
    }

    private int k(int i10) {
        if (i10 == this.f32616f - 1) {
            return this.f32614d - (i10 * 52);
        }
        return 52;
    }

    public static double[][] l(int i10, int i11) {
        int i12 = (i10 + 51) / 52;
        int i13 = (i11 + 51) / 52;
        double[][] dArr = new double[i12 * i13][];
        int i14 = 0;
        for (int i15 = 0; i15 < i12; i15++) {
            int i16 = i15 * 52;
            int iE = aj.d.E(i16 + 52, i10) - i16;
            for (int i17 = 0; i17 < i13; i17++) {
                int i18 = i17 * 52;
                dArr[i14] = new double[(aj.d.E(i18 + 52, i11) - i18) * iE];
                i14++;
            }
        }
        return dArr;
    }

    public static double[][] o(double[][] dArr) {
        int length = dArr.length;
        int length2 = dArr[0].length;
        int i10 = (length + 51) / 52;
        int i11 = (length2 + 51) / 52;
        for (double[] dArr2 : dArr) {
            int length3 = dArr2.length;
            if (length3 != length2) {
                throw new ui.e(ui.d.DIMENSIONS_MISMATCH, Integer.valueOf(length2), Integer.valueOf(length3));
            }
        }
        double[][] dArr3 = new double[i10 * i11][];
        int i12 = 0;
        for (int i13 = 0; i13 < i10; i13++) {
            int i14 = i13 * 52;
            int iE = aj.d.E(i14 + 52, length);
            int i15 = iE - i14;
            for (int i16 = 0; i16 < i11; i16++) {
                int i17 = i16 * 52;
                int iE2 = aj.d.E(i17 + 52, length2) - i17;
                double[] dArr4 = new double[i15 * iE2];
                dArr3[i12] = dArr4;
                int i18 = i14;
                int i19 = 0;
                while (i18 < iE) {
                    System.arraycopy(dArr[i18], i17, dArr4, i19, iE2);
                    i19 += iE2;
                    i18++;
                    length = length;
                }
                i12++;
            }
        }
        return dArr3;
    }

    @Override // yi.a, yi.b
    public int a() {
        return this.f32614d;
    }

    @Override // yi.a, yi.b
    public int b() {
        return this.f32613c;
    }

    @Override // yi.a, yi.j
    public double c(int i10, int i11) {
        h.b(this, i10, i11);
        int i12 = i10 / 52;
        int i13 = i11 / 52;
        return this.f32612b[(i12 * this.f32616f) + i13][((i10 - (i12 * 52)) * k(i13)) + (i11 - (i13 * 52))];
    }

    @Override // yi.a, yi.j
    public void d(int i10, int i11, double d10) {
        h.b(this, i10, i11);
        int i12 = i10 / 52;
        int i13 = i11 / 52;
        this.f32612b[(i12 * this.f32616f) + i13][((i10 - (i12 * 52)) * k(i13)) + (i11 - (i13 * 52))] = d10;
    }

    @Override // yi.j
    public double[][] getData() {
        double[][] dArr = (double[][]) Array.newInstance((Class<?>) Double.TYPE, b(), a());
        int i10 = this.f32614d - ((this.f32616f - 1) * 52);
        for (int i11 = 0; i11 < this.f32615e; i11++) {
            int i12 = i11 * 52;
            int iE = aj.d.E(i12 + 52, this.f32613c);
            int i13 = 0;
            int i14 = 0;
            while (i12 < iE) {
                double[] dArr2 = dArr[i12];
                int i15 = this.f32616f * i11;
                int i16 = 0;
                int i17 = 0;
                while (i16 < this.f32616f - 1) {
                    System.arraycopy(this.f32612b[i15], i13, dArr2, i17, 52);
                    i17 += 52;
                    i16++;
                    i15++;
                }
                System.arraycopy(this.f32612b[i15], i14, dArr2, i17, i10);
                i13 += 52;
                i14 += i10;
                i12++;
            }
        }
        return dArr;
    }

    @Override // yi.a
    public double h(l lVar) {
        int i10 = this.f32613c;
        int i11 = this.f32614d;
        lVar.b(i10, i11, 0, i10 - 1, 0, i11 - 1);
        int i12 = 0;
        for (int i13 = 0; i13 < this.f32615e; i13++) {
            int i14 = i13 * 52;
            int iE = aj.d.E(i14 + 52, this.f32613c);
            for (int i15 = 0; i15 < this.f32616f; i15++) {
                int i16 = i15 * 52;
                int iE2 = aj.d.E(i16 + 52, this.f32614d);
                double[] dArr = this.f32612b[i12];
                int i17 = 0;
                for (int i18 = i14; i18 < iE; i18++) {
                    for (int i19 = i16; i19 < iE2; i19++) {
                        lVar.a(i18, i19, dArr[i17]);
                        i17++;
                    }
                }
                i12++;
            }
        }
        return lVar.end();
    }

    @Override // yi.a
    public double i(l lVar) {
        int i10 = this.f32613c;
        int i11 = this.f32614d;
        lVar.b(i10, i11, 0, i10 - 1, 0, i11 - 1);
        for (int i12 = 0; i12 < this.f32615e; i12++) {
            int i13 = i12 * 52;
            int iE = aj.d.E(i13 + 52, this.f32613c);
            for (int i14 = i13; i14 < iE; i14++) {
                for (int i15 = 0; i15 < this.f32616f; i15++) {
                    int iK = k(i15);
                    int i16 = i15 * 52;
                    int iE2 = aj.d.E(i16 + 52, this.f32614d);
                    double[] dArr = this.f32612b[(this.f32616f * i12) + i15];
                    int i17 = (i14 - i13) * iK;
                    while (i16 < iE2) {
                        lVar.a(i14, i16, dArr[i17]);
                        i17++;
                        i16++;
                    }
                }
            }
        }
        return lVar.end();
    }

    @Override // yi.a
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public e f(int i10, int i11) {
        return new e(i10, i11);
    }

    @Override // yi.a, yi.j
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public e e() {
        e eVar = new e(a(), b());
        int i10 = 0;
        for (int i11 = 0; i11 < this.f32616f; i11++) {
            int i12 = i11 * 52;
            int iE = aj.d.E(i12 + 52, this.f32614d);
            for (int i13 = 0; i13 < this.f32615e; i13++) {
                double[] dArr = eVar.f32612b[i10];
                double[] dArr2 = this.f32612b[(this.f32616f * i13) + i11];
                int i14 = i13 * 52;
                int iE2 = aj.d.E(i14 + 52, this.f32613c);
                int i15 = 0;
                for (int i16 = i12; i16 < iE; i16++) {
                    int i17 = iE - i12;
                    int i18 = i16 - i12;
                    for (int i19 = i14; i19 < iE2; i19++) {
                        dArr[i15] = dArr2[i18];
                        i15++;
                        i18 += i17;
                    }
                }
                i10++;
            }
        }
        return eVar;
    }

    public e(double[][] dArr) {
        this(dArr.length, dArr[0].length, o(dArr), false);
    }

    public e(int i10, int i11, double[][] dArr, boolean z10) {
        super(i10, i11);
        this.f32613c = i10;
        this.f32614d = i11;
        int i12 = (i10 + 51) / 52;
        this.f32615e = i12;
        int i13 = (i11 + 51) / 52;
        this.f32616f = i13;
        if (z10) {
            this.f32612b = new double[i12 * i13][];
        } else {
            this.f32612b = dArr;
        }
        int i14 = 0;
        for (int i15 = 0; i15 < this.f32615e; i15++) {
            int iJ = j(i15);
            int i16 = 0;
            while (i16 < this.f32616f) {
                if (dArr[i14].length != k(i16) * iJ) {
                    throw new ui.e(ui.d.DIMENSIONS_MISMATCH, Integer.valueOf(dArr[i14].length), Integer.valueOf(iJ * k(i16)));
                }
                if (z10) {
                    this.f32612b[i14] = (double[]) dArr[i14].clone();
                }
                i16++;
                i14++;
            }
        }
    }
}
