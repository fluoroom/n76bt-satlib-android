package f7;

import p6.d0;

/* JADX INFO: loaded from: classes.dex */
public final class p extends p6.p implements e7.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final a7.h f12883a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final p6.p f12884b;

    public p(a7.h hVar, p6.p pVar) {
        this.f12883a = hVar;
        this.f12884b = pVar;
    }

    @Override // e7.i
    public p6.p a(d0 d0Var, p6.d dVar) {
        p6.p pVarU0 = this.f12884b;
        if (pVarU0 instanceof e7.i) {
            pVarU0 = d0Var.u0(pVarU0, dVar);
        }
        return pVarU0 == this.f12884b ? this : new p(this.f12883a, pVarU0);
    }

    @Override // p6.p
    public Class c() {
        return Object.class;
    }

    @Override // p6.p
    public void f(Object obj, e6.g gVar, d0 d0Var) {
        this.f12884b.g(obj, gVar, d0Var, this.f12883a);
    }

    @Override // p6.p
    public void g(Object obj, e6.g gVar, d0 d0Var, a7.h hVar) {
        this.f12884b.g(obj, gVar, d0Var, hVar);
    }
}
