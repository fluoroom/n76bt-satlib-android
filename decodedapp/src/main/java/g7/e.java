package g7;

import d6.k;

/* JADX INFO: loaded from: classes.dex */
public final class e extends h0 implements e7.i {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final boolean f13595c;

    static final class a extends h0 implements e7.i {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        protected final boolean f13596c;

        public a(boolean z10) {
            super(z10 ? Boolean.TYPE : Boolean.class, false);
            this.f13596c = z10;
        }

        @Override // e7.i
        public p6.p a(p6.d0 d0Var, p6.d dVar) {
            k.d dVarQ = q(d0Var, dVar, Boolean.class);
            return (dVarQ == null || dVarQ.i().a()) ? this : new e(this.f13596c);
        }

        @Override // g7.i0, p6.p
        public void f(Object obj, e6.g gVar, p6.d0 d0Var) {
            gVar.H0(!Boolean.FALSE.equals(obj) ? 1 : 0);
        }

        @Override // g7.h0, p6.p
        public final void g(Object obj, e6.g gVar, p6.d0 d0Var, a7.h hVar) {
            gVar.y0(Boolean.TRUE.equals(obj));
        }
    }

    public e(boolean z10) {
        super(z10 ? Boolean.TYPE : Boolean.class, false);
        this.f13595c = z10;
    }

    @Override // e7.i
    public p6.p a(p6.d0 d0Var, p6.d dVar) {
        k.d dVarQ = q(d0Var, dVar, c());
        if (dVarQ != null) {
            k.c cVarI = dVarQ.i();
            if (cVarI.a()) {
                return new a(this.f13595c);
            }
            if (cVarI == k.c.STRING) {
                return new m0(this.f13605a);
            }
        }
        return this;
    }

    @Override // g7.i0, p6.p
    public void f(Object obj, e6.g gVar, p6.d0 d0Var) {
        gVar.y0(Boolean.TRUE.equals(obj));
    }

    @Override // g7.h0, p6.p
    public final void g(Object obj, e6.g gVar, p6.d0 d0Var, a7.h hVar) {
        gVar.y0(Boolean.TRUE.equals(obj));
    }
}
