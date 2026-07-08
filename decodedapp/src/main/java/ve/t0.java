package ve;

import eg.c1;
import he.f1;
import he.x0;
import he.y0;

/* JADX INFO: loaded from: classes3.dex */
public abstract class t0 {
    public static final boolean d(he.b bVar) {
        rd.m.e(bVar, "<this>");
        return g(bVar) != null;
    }

    public static final String e(he.b bVar) {
        he.b bVarW;
        mf.f fVarJ;
        rd.m.e(bVar, "callableMemberDescriptor");
        he.b bVarF = f(bVar);
        if (bVarF != null && (bVarW = uf.e.w(bVarF)) != null) {
            if (bVarW instanceof y0) {
                return m.f30651a.b(bVarW);
            }
            if ((bVarW instanceof f1) && (fVarJ = f.f30577o.j((f1) bVarW)) != null) {
                return fVarJ.d();
            }
        }
        return null;
    }

    private static final he.b f(he.b bVar) {
        if (ee.i.h0(bVar)) {
            return g(bVar);
        }
        return null;
    }

    public static final he.b g(he.b bVar) {
        rd.m.e(bVar, "<this>");
        if (!u0.f30675a.g().contains(bVar.getName()) && !j.f30593a.d().contains(uf.e.w(bVar).getName())) {
            return null;
        }
        if ((bVar instanceof y0) || (bVar instanceof x0)) {
            return uf.e.i(bVar, false, q0.f30666a, 1, null);
        }
        if (bVar instanceof f1) {
            return uf.e.i(bVar, false, r0.f30670a, 1, null);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean h(he.b bVar) {
        rd.m.e(bVar, "it");
        return m.f30651a.d(uf.e.w(bVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean i(he.b bVar) {
        rd.m.e(bVar, "it");
        return f.f30577o.k((f1) bVar);
    }

    public static final he.b j(he.b bVar) {
        rd.m.e(bVar, "<this>");
        he.b bVarG = g(bVar);
        if (bVarG != null) {
            return bVarG;
        }
        i iVar = i.f30587o;
        mf.f name = bVar.getName();
        rd.m.d(name, "getName(...)");
        if (iVar.n(name)) {
            return uf.e.i(bVar, false, s0.f30671a, 1, null);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean k(he.b bVar) {
        rd.m.e(bVar, "it");
        return ee.i.h0(bVar) && i.o(bVar) != null;
    }

    public static final boolean l(he.e eVar, he.a aVar) {
        rd.m.e(eVar, "<this>");
        rd.m.e(aVar, "specialCallableDescriptor");
        he.m mVarB = aVar.b();
        rd.m.c(mVarB, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
        c1 c1VarS = ((he.e) mVarB).s();
        rd.m.d(c1VarS, "getDefaultType(...)");
        for (he.e eVarS = qf.i.s(eVar); eVarS != null; eVarS = qf.i.s(eVarS)) {
            if (!(eVarS instanceof xe.c) && fg.w.b(eVarS.s(), c1VarS) != null) {
                return !ee.i.h0(eVarS);
            }
        }
        return false;
    }

    public static final boolean m(he.b bVar) {
        rd.m.e(bVar, "<this>");
        return uf.e.w(bVar).b() instanceof xe.c;
    }

    public static final boolean n(he.b bVar) {
        rd.m.e(bVar, "<this>");
        return m(bVar) || ee.i.h0(bVar);
    }
}
