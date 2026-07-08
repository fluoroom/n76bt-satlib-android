package ge;

import ed.r0;
import java.util.Collection;

/* JADX INFO: loaded from: classes3.dex */
public final class d {

    /* JADX INFO: renamed from: a */
    public static final d f13816a = new d();

    private d() {
    }

    public static /* synthetic */ he.e f(d dVar, mf.c cVar, ee.i iVar, Integer num, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            num = null;
        }
        return dVar.e(cVar, iVar, num);
    }

    public final he.e a(he.e eVar) {
        rd.m.e(eVar, "mutable");
        mf.c cVarO = c.f13796a.o(qf.i.m(eVar));
        if (cVarO != null) {
            he.e eVarP = uf.e.m(eVar).p(cVarO);
            rd.m.d(eVarP, "getBuiltInClassByFqName(...)");
            return eVarP;
        }
        throw new IllegalArgumentException("Given class " + eVar + " is not a mutable collection");
    }

    public final he.e b(he.e eVar) {
        rd.m.e(eVar, "readOnly");
        mf.c cVarP = c.f13796a.p(qf.i.m(eVar));
        if (cVarP != null) {
            he.e eVarP = uf.e.m(eVar).p(cVarP);
            rd.m.d(eVarP, "getBuiltInClassByFqName(...)");
            return eVarP;
        }
        throw new IllegalArgumentException("Given class " + eVar + " is not a read-only collection");
    }

    public final boolean c(he.e eVar) {
        rd.m.e(eVar, "mutable");
        return c.f13796a.k(qf.i.m(eVar));
    }

    public final boolean d(he.e eVar) {
        rd.m.e(eVar, "readOnly");
        return c.f13796a.l(qf.i.m(eVar));
    }

    public final he.e e(mf.c cVar, ee.i iVar, Integer num) {
        rd.m.e(cVar, "fqName");
        rd.m.e(iVar, "builtIns");
        mf.b bVarM = (num == null || !rd.m.a(cVar, c.f13796a.h())) ? c.f13796a.m(cVar) : ee.o.a(num.intValue());
        if (bVarM != null) {
            return iVar.p(bVarM.a());
        }
        return null;
    }

    public final Collection g(mf.c cVar, ee.i iVar) {
        rd.m.e(cVar, "fqName");
        rd.m.e(iVar, "builtIns");
        he.e eVarF = f(this, cVar, iVar, null, 4, null);
        if (eVarF == null) {
            return r0.d();
        }
        mf.c cVarP = c.f13796a.p(uf.e.p(eVarF));
        return cVarP == null ? r0.c(eVarF) : ed.q.n(eVarF, iVar.p(cVarP));
    }
}
