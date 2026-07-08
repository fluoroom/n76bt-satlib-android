package ej;

import java.io.Serializable;
import java.text.NumberFormat;

/* JADX INFO: loaded from: classes3.dex */
public class f implements Serializable {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final f f12644f = new f(1.5707963267948966d, 0.0d, 0.0d);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final f f12645g = new f(-1.5707963267948966d, 0.0d, 0.0d);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final double f12646a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final double f12647b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final double f12648c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private transient xi.f f12649d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private transient xi.f f12650e;

    public f(double d10, double d11, double d12) {
        double dF = aj.j.f(d10, 1.5707963267948966d);
        double dF2 = aj.j.f(d11, 0.0d);
        if (dF > 1.5707963267948966d) {
            dF = 3.141592653589793d - dF;
            dF2 = aj.j.f(d11 + 3.141592653589793d, 0.0d);
        }
        this.f12646a = dF;
        this.f12647b = dF2;
        this.f12648c = d12;
    }

    public double a() {
        return this.f12648c;
    }

    public xi.f b() {
        if (this.f12650e == null) {
            aj.m mVarR = aj.d.R(this.f12647b);
            this.f12650e = new xi.f(-mVarR.b(), mVarR.a(), 0.0d);
        }
        return this.f12650e;
    }

    public double c() {
        return this.f12646a;
    }

    public double d() {
        return this.f12647b;
    }

    public xi.f e() {
        if (this.f12649d == null) {
            aj.m mVarR = aj.d.R(this.f12646a);
            aj.m mVarR2 = aj.d.R(this.f12647b);
            this.f12649d = new xi.f(mVarR2.a() * mVarR.a(), mVarR2.b() * mVarR.a(), mVarR.b());
        }
        return this.f12649d;
    }

    public boolean equals(Object obj) {
        if (obj instanceof f) {
            f fVar = (f) obj;
            if (c() == fVar.c() && d() == fVar.d() && a() == fVar.a()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (Double.valueOf(c()).hashCode() ^ Double.valueOf(d()).hashCode()) ^ Double.valueOf(a()).hashCode();
    }

    public String toString() {
        NumberFormat numberFormatB = aj.c.b();
        return "{lat: " + numberFormatB.format(aj.d.Y(c())) + " deg, lon: " + numberFormatB.format(aj.d.Y(d())) + " deg, alt: " + numberFormatB.format(a()) + "}";
    }
}
