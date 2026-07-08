package u7;

import u7.j;

/* JADX INFO: loaded from: classes.dex */
public final class i1 extends g1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u0 f28444c;

    public i1(u0 u0Var, t8.h hVar) {
        super(3, hVar);
        this.f28444c = u0Var;
    }

    @Override // u7.p0
    public final boolean f(h0 h0Var) {
        return this.f28444c.f28523a.f();
    }

    @Override // u7.p0
    public final s7.c[] g(h0 h0Var) {
        return this.f28444c.f28523a.c();
    }

    @Override // u7.g1
    public final void h(h0 h0Var) {
        this.f28444c.f28523a.d(h0Var.u(), this.f28428b);
        j.a aVarB = this.f28444c.f28523a.b();
        if (aVarB != null) {
            h0Var.w().put(aVarB, this.f28444c);
        }
    }

    @Override // u7.l1
    public final /* bridge */ /* synthetic */ void d(y yVar, boolean z10) {
    }
}
