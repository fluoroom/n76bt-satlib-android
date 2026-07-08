package di;

import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public class a implements Serializable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f11098e = new a(0.0d, 1.0d);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f11099f = new a(Double.NaN, Double.NaN);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f11100g = new a(Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a f11101h = new a(1.0d, 0.0d);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final a f11102r = new a(0.0d, 0.0d);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final double f11103a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final double f11104b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final transient boolean f11105c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final transient boolean f11106d;

    public a(double d10) {
        this(d10, 0.0d);
    }

    public double a() {
        if (this.f11105c) {
            return Double.NaN;
        }
        if (h()) {
            return Double.POSITIVE_INFINITY;
        }
        if (gi.a.a(this.f11104b) < gi.a.a(this.f11103a)) {
            double d10 = this.f11103a;
            if (d10 == 0.0d) {
                return gi.a.a(this.f11104b);
            }
            double d11 = this.f11104b / d10;
            return gi.a.a(d10) * gi.a.i((d11 * d11) + 1.0d);
        }
        double d12 = this.f11104b;
        if (d12 == 0.0d) {
            return gi.a.a(this.f11103a);
        }
        double d13 = this.f11103a / d12;
        return gi.a.a(d12) * gi.a.i((d13 * d13) + 1.0d);
    }

    public a b(a aVar) {
        gi.b.a(aVar);
        return (this.f11105c || aVar.f11105c) ? f11099f : d(this.f11104b + aVar.g(), this.f11103a + aVar.f());
    }

    public a c() {
        return this.f11105c ? f11099f : d(this.f11104b, -this.f11103a);
    }

    protected a d(double d10, double d11) {
        return new a(d10, d11);
    }

    public a e(a aVar) {
        gi.b.a(aVar);
        if (this.f11105c || aVar.f11105c) {
            return f11099f;
        }
        double dG = aVar.g();
        double dF = aVar.f();
        if (dG == 0.0d && dF == 0.0d) {
            return f11099f;
        }
        if (aVar.h() && !h()) {
            return f11102r;
        }
        if (gi.a.a(dG) < gi.a.a(dF)) {
            double d10 = dG / dF;
            double d11 = (dG * d10) + dF;
            double d12 = this.f11104b;
            double d13 = this.f11103a;
            return d(((d12 * d10) + d13) / d11, ((d13 * d10) - d12) / d11);
        }
        double d14 = dF / dG;
        double d15 = (dF * d14) + dG;
        double d16 = this.f11103a;
        double d17 = this.f11104b;
        return d(((d16 * d14) + d17) / d15, (d16 - (d17 * d14)) / d15);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (aVar.f11105c) {
                return this.f11105c;
            }
            if (gi.b.b(this.f11104b, aVar.f11104b) && gi.b.b(this.f11103a, aVar.f11103a)) {
                return true;
            }
        }
        return false;
    }

    public double f() {
        return this.f11103a;
    }

    public double g() {
        return this.f11104b;
    }

    public boolean h() {
        return this.f11106d;
    }

    public int hashCode() {
        if (this.f11105c) {
            return 7;
        }
        return ((gi.b.c(this.f11103a) * 17) + gi.b.c(this.f11104b)) * 37;
    }

    public a i(double d10) {
        return (this.f11105c || Double.isNaN(d10)) ? f11099f : (Double.isInfinite(this.f11104b) || Double.isInfinite(this.f11103a) || Double.isInfinite(d10)) ? f11100g : d(this.f11104b * d10, this.f11103a * d10);
    }

    public a j(a aVar) {
        gi.b.a(aVar);
        if (this.f11105c || aVar.f11105c) {
            return f11099f;
        }
        if (Double.isInfinite(this.f11104b) || Double.isInfinite(this.f11103a) || Double.isInfinite(aVar.f11104b) || Double.isInfinite(aVar.f11103a)) {
            return f11100g;
        }
        double d10 = this.f11104b;
        double d11 = aVar.f11104b;
        double d12 = this.f11103a;
        double d13 = aVar.f11103a;
        return d((d10 * d11) - (d12 * d13), (d10 * d13) + (d12 * d11));
    }

    public a k(a aVar) {
        gi.b.a(aVar);
        return (this.f11105c || aVar.f11105c) ? f11099f : d(this.f11104b - aVar.g(), this.f11103a - aVar.f());
    }

    public String toString() {
        return "(" + this.f11104b + ", " + this.f11103a + ")";
    }

    public a(double d10, double d11) {
        this.f11104b = d10;
        this.f11103a = d11;
        boolean z10 = true;
        boolean z11 = Double.isNaN(d10) || Double.isNaN(d11);
        this.f11105c = z11;
        if (z11 || (!Double.isInfinite(d10) && !Double.isInfinite(d11))) {
            z10 = false;
        }
        this.f11106d = z10;
    }
}
