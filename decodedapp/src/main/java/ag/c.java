package ag;

import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class c implements he.t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final dg.n f464a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a0 f465b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final he.h0 f466c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected n f467d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final dg.h f468e;

    public c(dg.n nVar, a0 a0Var, he.h0 h0Var) {
        rd.m.e(nVar, "storageManager");
        rd.m.e(a0Var, "finder");
        rd.m.e(h0Var, "moduleDescriptor");
        this.f464a = nVar;
        this.f465b = a0Var;
        this.f466c = h0Var;
        this.f468e = nVar.h(new b(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final he.n0 f(c cVar, mf.c cVar2) {
        rd.m.e(cVar2, "fqName");
        r rVarE = cVar.e(cVar2);
        if (rVarE == null) {
            return null;
        }
        rVarE.L0(cVar.g());
        return rVarE;
    }

    @Override // he.o0
    public List a(mf.c cVar) {
        rd.m.e(cVar, "fqName");
        return ed.q.o(this.f468e.l(cVar));
    }

    @Override // he.t0
    public void b(mf.c cVar, Collection collection) {
        rd.m.e(cVar, "fqName");
        rd.m.e(collection, "packageFragments");
        og.a.a(collection, this.f468e.l(cVar));
    }

    @Override // he.t0
    public boolean c(mf.c cVar) {
        rd.m.e(cVar, "fqName");
        return (this.f468e.r(cVar) ? (he.n0) this.f468e.l(cVar) : e(cVar)) == null;
    }

    protected abstract r e(mf.c cVar);

    protected final n g() {
        n nVar = this.f467d;
        if (nVar != null) {
            return nVar;
        }
        rd.m.o("components");
        return null;
    }

    protected final a0 h() {
        return this.f465b;
    }

    protected final he.h0 i() {
        return this.f466c;
    }

    protected final dg.n j() {
        return this.f464a;
    }

    protected final void k(n nVar) {
        rd.m.e(nVar, "<set-?>");
        this.f467d = nVar;
    }

    @Override // he.o0
    public Collection q(mf.c cVar, qd.l lVar) {
        rd.m.e(cVar, "fqName");
        rd.m.e(lVar, "nameFilter");
        return ed.r0.d();
    }
}
