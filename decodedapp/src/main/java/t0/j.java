package t0;

import t0.e;

/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    double f27440a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    double f27441b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f27442c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private double f27443d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private double f27444e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private double f27445f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private double f27446g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private double f27447h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private double f27448i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final e.p f27449j;

    public j() {
        this.f27440a = Math.sqrt(1500.0d);
        this.f27441b = 0.5d;
        this.f27442c = false;
        this.f27448i = Double.MAX_VALUE;
        this.f27449j = new e.p();
    }

    private void d() {
        if (this.f27442c) {
            return;
        }
        if (this.f27448i == Double.MAX_VALUE) {
            throw new IllegalStateException("Error: Final position of the spring must be set before the animation starts");
        }
        double d10 = this.f27441b;
        if (d10 > 1.0d) {
            double d11 = this.f27440a;
            this.f27445f = ((-d10) * d11) + (d11 * Math.sqrt((d10 * d10) - 1.0d));
            double d12 = this.f27441b;
            double d13 = this.f27440a;
            this.f27446g = ((-d12) * d13) - (d13 * Math.sqrt((d12 * d12) - 1.0d));
        } else if (d10 >= 0.0d && d10 < 1.0d) {
            this.f27447h = this.f27440a * Math.sqrt(1.0d - (d10 * d10));
        }
        this.f27442c = true;
    }

    public float a() {
        return (float) this.f27441b;
    }

    public float b() {
        return (float) this.f27448i;
    }

    public float c() {
        double d10 = this.f27440a;
        return (float) (d10 * d10);
    }

    public boolean e(float f10, float f11) {
        return ((double) Math.abs(f11)) < this.f27444e && ((double) Math.abs(f10 - b())) < this.f27443d;
    }

    public j f(float f10) {
        if (f10 < 0.0f) {
            throw new IllegalArgumentException("Damping ratio must be non-negative");
        }
        this.f27441b = f10;
        this.f27442c = false;
        return this;
    }

    public j g(float f10) {
        this.f27448i = f10;
        return this;
    }

    public j h(float f10) {
        if (f10 <= 0.0f) {
            throw new IllegalArgumentException("Spring stiffness constant must be positive.");
        }
        this.f27440a = Math.sqrt(f10);
        this.f27442c = false;
        return this;
    }

    void i(double d10) {
        double dAbs = Math.abs(d10);
        this.f27443d = dAbs;
        this.f27444e = dAbs * 62.5d;
    }

    e.p j(double d10, double d11, long j10) {
        double dPow;
        double dCos;
        d();
        double d12 = j10 / 1000.0d;
        double d13 = d10 - this.f27448i;
        double d14 = this.f27441b;
        if (d14 > 1.0d) {
            double d15 = this.f27446g;
            double d16 = this.f27445f;
            double d17 = d13 - (((d15 * d13) - d11) / (d15 - d16));
            double d18 = ((d13 * d15) - d11) / (d15 - d16);
            dPow = (Math.pow(2.718281828459045d, d15 * d12) * d17) + (Math.pow(2.718281828459045d, this.f27445f * d12) * d18);
            double d19 = this.f27446g;
            double dPow2 = d17 * d19 * Math.pow(2.718281828459045d, d19 * d12);
            double d20 = this.f27445f;
            dCos = dPow2 + (d18 * d20 * Math.pow(2.718281828459045d, d20 * d12));
        } else if (d14 == 1.0d) {
            double d21 = this.f27440a;
            double d22 = d11 + (d21 * d13);
            double d23 = d13 + (d22 * d12);
            dPow = Math.pow(2.718281828459045d, (-d21) * d12) * d23;
            double dPow3 = d23 * Math.pow(2.718281828459045d, (-this.f27440a) * d12);
            double d24 = this.f27440a;
            dCos = (d22 * Math.pow(2.718281828459045d, (-d24) * d12)) + (dPow3 * (-d24));
        } else {
            double d25 = 1.0d / this.f27447h;
            double d26 = this.f27440a;
            double d27 = d25 * ((d14 * d26 * d13) + d11);
            dPow = Math.pow(2.718281828459045d, (-d14) * d26 * d12) * ((Math.cos(this.f27447h * d12) * d13) + (Math.sin(this.f27447h * d12) * d27));
            double d28 = this.f27440a;
            double d29 = this.f27441b;
            double d30 = (-d28) * dPow * d29;
            double dPow4 = Math.pow(2.718281828459045d, (-d29) * d28 * d12);
            double d31 = this.f27447h;
            double dSin = (-d31) * d13 * Math.sin(d31 * d12);
            double d32 = this.f27447h;
            dCos = d30 + (dPow4 * (dSin + (d27 * d32 * Math.cos(d32 * d12))));
        }
        e.p pVar = this.f27449j;
        pVar.f27436a = (float) (dPow + this.f27448i);
        pVar.f27437b = (float) dCos;
        return pVar;
    }

    public j(float f10) {
        this.f27440a = Math.sqrt(1500.0d);
        this.f27441b = 0.5d;
        this.f27442c = false;
        this.f27448i = Double.MAX_VALUE;
        this.f27449j = new e.p();
        this.f27448i = f10;
    }
}
