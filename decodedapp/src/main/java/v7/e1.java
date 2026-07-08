package v7;

import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public final class e1 extends r0 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final /* synthetic */ c f30377g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(c cVar, int i10, Bundle bundle) {
        super(cVar, i10, bundle);
        this.f30377g = cVar;
    }

    @Override // v7.r0
    protected final void f(s7.a aVar) {
        if (this.f30377g.s() && c.f0(this.f30377g)) {
            c.b0(this.f30377g, 16);
        } else {
            this.f30377g.f30348y.a(aVar);
            this.f30377g.K(aVar);
        }
    }

    @Override // v7.r0
    protected final boolean g() {
        this.f30377g.f30348y.a(s7.a.f26977e);
        return true;
    }
}
