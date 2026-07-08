package ej;

import yj.b0;
import yj.f0;
import yj.g0;
import zj.y0;

/* JADX INFO: loaded from: classes3.dex */
class o implements g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b0 f12717a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final yj.b f12718b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final double f12719c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final double[] f12720d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final double[] f12721e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final double[] f12722f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final double f12723g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final double f12724h;

    o(yj.b bVar, b0 b0Var, double d10, double[] dArr, double[] dArr2, double[] dArr3) {
        this.f12718b = bVar;
        this.f12717a = b0Var;
        this.f12719c = d10;
        this.f12720d = dArr;
        this.f12721e = dArr2;
        this.f12722f = dArr3;
        double d11 = 2.0d / d10;
        this.f12723g = d11;
        this.f12724h = d11 * d11;
    }

    private double a(yj.b bVar) {
        double dD0 = bVar.d0(this.f12718b, this.f12717a) * 2.0d;
        double d10 = this.f12719c;
        return (dD0 - d10) / d10;
    }

    xi.f b(yj.b bVar) {
        double dA = a(bVar);
        double d10 = 2.0d * dA;
        double d11 = this.f12720d[0];
        double d12 = this.f12721e[0];
        double d13 = 1.0d;
        double d14 = this.f12722f[0];
        double d15 = d12;
        double d16 = d11;
        int i10 = 1;
        while (true) {
            double[] dArr = this.f12720d;
            if (i10 >= dArr.length) {
                return new xi.f(d16, d15, d14);
            }
            d16 += dArr[i10] * dA;
            d15 += this.f12721e[i10] * dA;
            d14 += this.f12722f[i10] * dA;
            double d17 = (d10 * dA) - d13;
            i10++;
            d13 = dA;
            dA = d17;
        }
    }

    y0 c(yj.b bVar) {
        double dA = a(bVar);
        double d10 = dA * 2.0d;
        double d11 = this.f12720d[0];
        double d12 = this.f12721e[0];
        double d13 = 1.0d;
        double d14 = 0.0d;
        double d15 = 0.0d;
        double d16 = 0.0d;
        double d17 = 0.0d;
        double d18 = 0.0d;
        double d19 = 0.0d;
        double d20 = 0.0d;
        double d21 = 0.0d;
        double d22 = 0.0d;
        double d23 = this.f12722f[0];
        double d24 = d12;
        int i10 = 1;
        double d25 = d11;
        double d26 = 1.0d;
        while (true) {
            double[] dArr = this.f12720d;
            if (i10 >= dArr.length) {
                xi.f fVar = new xi.f(d25, d24, d23);
                double d27 = this.f12723g;
                xi.f fVar2 = new xi.f(d14 * d27, d15 * d27, d16 * d27);
                double d28 = this.f12724h;
                return new y0(fVar, fVar2, new xi.f(d17 * d28, d18 * d28, d19 * d28));
            }
            double d29 = dArr[i10];
            d25 += d29 * dA;
            double d30 = this.f12721e[i10];
            d24 += d30 * dA;
            double d31 = this.f12722f[i10];
            d23 += d31 * dA;
            d14 += d29 * d13;
            d15 += d30 * d13;
            d16 += d31 * d13;
            d17 += d29 * d20;
            d18 += d30 * d20;
            d19 += d31 * d20;
            double d32 = (d10 * dA) - d26;
            double d33 = ((d10 * d13) + (dA * 2.0d)) - d21;
            double d34 = ((d10 * d20) + (4.0d * d13)) - d22;
            i10++;
            d22 = d20;
            d20 = d34;
            d21 = d13;
            d13 = d33;
            d26 = dA;
            dA = d32;
        }
    }

    @Override // yj.g0
    public /* synthetic */ double e(g0 g0Var) {
        return f0.a(this, g0Var);
    }

    @Override // yj.g0
    public yj.b getDate() {
        return this.f12718b;
    }

    public boolean h(yj.b bVar) {
        double dD0 = bVar.d0(this.f12718b, this.f12717a);
        return dD0 >= -0.001d && dD0 <= this.f12719c + 0.001d;
    }
}
