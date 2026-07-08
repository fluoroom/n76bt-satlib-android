package ye;

import cf.u;
import ed.q;
import he.t0;
import java.util.Collection;
import java.util.List;
import ve.t;
import ye.p;
import ze.d0;

/* JADX INFO: loaded from: classes3.dex */
public final class j implements t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final k f32582a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final dg.a f32583b;

    public j(d dVar) {
        rd.m.e(dVar, "components");
        k kVar = new k(dVar, p.a.f32595a, dd.k.c(null));
        this.f32582a = kVar;
        this.f32583b = kVar.e().c();
    }

    private final d0 e(mf.c cVar) {
        u uVarA = t.a(this.f32582a.a().d(), cVar, false, 2, null);
        if (uVarA == null) {
            return null;
        }
        return (d0) this.f32583b.b(cVar, new i(this, uVarA));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final d0 f(j jVar, u uVar) {
        return new d0(jVar.f32582a, uVar);
    }

    @Override // he.o0
    public List a(mf.c cVar) {
        rd.m.e(cVar, "fqName");
        return q.o(e(cVar));
    }

    @Override // he.t0
    public void b(mf.c cVar, Collection collection) {
        rd.m.e(cVar, "fqName");
        rd.m.e(collection, "packageFragments");
        og.a.a(collection, e(cVar));
    }

    @Override // he.t0
    public boolean c(mf.c cVar) {
        rd.m.e(cVar, "fqName");
        return t.a(this.f32582a.a().d(), cVar, false, 2, null) == null;
    }

    @Override // he.o0
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public List q(mf.c cVar, qd.l lVar) {
        rd.m.e(cVar, "fqName");
        rd.m.e(lVar, "nameFilter");
        d0 d0VarE = e(cVar);
        List listQ0 = d0VarE != null ? d0VarE.Q0() : null;
        return listQ0 == null ? q.k() : listQ0;
    }

    public String toString() {
        return "LazyJavaPackageFragmentProvider of module " + this.f32582a.a().m();
    }
}
