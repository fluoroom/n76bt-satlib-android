package ri;

import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public abstract class l implements f, Serializable, Comparable {
    protected l() {
    }

    @Override // pi.b
    public /* synthetic */ pi.e Q() {
        return pi.a.b(this);
    }

    @Override // ri.f, pi.b
    public /* synthetic */ pi.b add(double d10) {
        return c.a(this, d10);
    }

    @Override // pi.e
    public /* synthetic */ boolean isZero() {
        return pi.d.a(this);
    }

    @Override // ri.f, pi.b
    public /* synthetic */ pi.b j(double d10) {
        return c.d(this, d10);
    }

    @Override // pi.e
    public /* synthetic */ double s() {
        return c.c(this);
    }

    @Override // pi.b
    public /* bridge */ /* synthetic */ pi.e add(double d10) {
        return add(d10);
    }

    @Override // pi.b
    public /* bridge */ /* synthetic */ pi.e j(double d10) {
        return j(d10);
    }
}
