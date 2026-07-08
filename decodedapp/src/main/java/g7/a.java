package g7;

import d6.k;
import j$.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public abstract class a extends e7.h implements e7.i {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final p6.d f13563c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected final Boolean f13564d;

    protected a(Class cls) {
        super(cls);
        this.f13563c = null;
        this.f13564d = null;
    }

    protected final boolean A(p6.d0 d0Var) {
        Boolean bool = this.f13564d;
        return bool == null ? d0Var.y0(p6.c0.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED) : bool.booleanValue();
    }

    public abstract p6.p C(p6.d dVar, Boolean bool);

    protected abstract void D(Object obj, e6.g gVar, p6.d0 d0Var);

    public p6.p a(p6.d0 d0Var, p6.d dVar) {
        k.d dVarQ;
        if (dVar != null && (dVarQ = q(d0Var, dVar, c())) != null) {
            Boolean boolE = dVarQ.e(k.a.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED);
            if (!Objects.equals(boolE, this.f13564d)) {
                return C(dVar, boolE);
            }
        }
        return this;
    }

    @Override // p6.p
    public final void g(Object obj, e6.g gVar, p6.d0 d0Var, a7.h hVar) {
        n6.c cVarG = hVar.g(gVar, hVar.d(obj, e6.m.START_ARRAY));
        gVar.H(obj);
        D(obj, gVar, d0Var);
        hVar.h(gVar, cVarG);
    }

    protected a(a aVar, p6.d dVar, Boolean bool) {
        super(aVar.f13605a, false);
        this.f13563c = dVar;
        this.f13564d = bool;
    }
}
