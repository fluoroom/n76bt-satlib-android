package ti;

import aj.h;
import aj.j;

/* JADX INFO: loaded from: classes3.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final double f27894a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final double f27895b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final double f27896c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private h f27897d = new h();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private double f27898e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private double f27899f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private double f27900g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private qi.a f27901h;

    protected c(double d10, double d11, double d12) {
        this.f27895b = d11;
        this.f27896c = d10;
        this.f27894a = d12;
    }

    protected double c(double d10) {
        j();
        return this.f27901h.a(d10);
    }

    public double d() {
        return this.f27895b;
    }

    public double e() {
        return this.f27894a;
    }

    public double f() {
        return this.f27899f;
    }

    public double g() {
        return this.f27898e;
    }

    public double h() {
        return this.f27896c;
    }

    public double i() {
        return this.f27900g;
    }

    protected void j() {
        this.f27897d.b();
    }

    protected void k(int i10, qi.a aVar, double d10, double d11, double d12) {
        j.b(aVar);
        this.f27898e = d10;
        this.f27899f = d11;
        this.f27900g = d12;
        this.f27901h = aVar;
        this.f27897d = this.f27897d.c(i10);
    }

    protected void l(double d10, double d11) {
        g.a(d10, d11);
    }
}
