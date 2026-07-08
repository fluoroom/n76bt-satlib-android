package la;

import rd.m;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f20523a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double f20524b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final double f20525c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final double f20526d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final double f20527e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final double f20528f;

    public a(double d10, double d11, double d12, double d13) {
        this.f20523a = d10;
        this.f20524b = d11;
        this.f20525c = d12;
        this.f20526d = d13;
        double d14 = d10 + d11;
        double d15 = 2;
        this.f20527e = d14 / d15;
        this.f20528f = (d12 + d13) / d15;
    }

    public final boolean a(double d10, double d11) {
        return this.f20523a <= d10 && d10 <= this.f20524b && this.f20525c <= d11 && d11 <= this.f20526d;
    }

    public final boolean b(a aVar) {
        m.e(aVar, "bounds");
        return aVar.f20523a >= this.f20523a && aVar.f20524b <= this.f20524b && aVar.f20525c >= this.f20525c && aVar.f20526d <= this.f20526d;
    }

    public final boolean c(b bVar) {
        m.e(bVar, "point");
        return a(bVar.f20529a, bVar.f20530b);
    }

    public final boolean d(double d10, double d11, double d12, double d13) {
        return d10 < this.f20524b && this.f20523a < d11 && d12 < this.f20526d && this.f20525c < d13;
    }

    public final boolean e(a aVar) {
        m.e(aVar, "bounds");
        return d(aVar.f20523a, aVar.f20524b, aVar.f20525c, aVar.f20526d);
    }
}
