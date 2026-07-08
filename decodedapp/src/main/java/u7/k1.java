package u7;

import u7.j;

/* JADX INFO: loaded from: classes.dex */
public final class k1 extends g1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j.a f28457c;

    public k1(j.a aVar, t8.h hVar) {
        super(4, hVar);
        this.f28457c = aVar;
    }

    @Override // u7.p0
    public final boolean f(h0 h0Var) {
        u0 u0Var = (u0) h0Var.w().get(this.f28457c);
        return u0Var != null && u0Var.f28523a.f();
    }

    @Override // u7.p0
    public final s7.c[] g(h0 h0Var) {
        u0 u0Var = (u0) h0Var.w().get(this.f28457c);
        if (u0Var == null) {
            return null;
        }
        return u0Var.f28523a.c();
    }

    @Override // u7.g1
    public final void h(h0 h0Var) {
        u0 u0Var = (u0) h0Var.w().remove(this.f28457c);
        if (u0Var == null) {
            this.f28428b.e(Boolean.FALSE);
            return;
        }
        u0Var.f28524b.b(h0Var.u(), this.f28428b);
        u0Var.f28523a.a();
    }

    @Override // u7.l1
    public final /* bridge */ /* synthetic */ void d(y yVar, boolean z10) {
    }
}
