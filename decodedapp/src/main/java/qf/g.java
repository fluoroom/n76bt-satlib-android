package qf;

import eg.u1;
import fg.g;
import he.b;
import he.d0;
import he.g1;
import he.l1;
import he.n0;
import java.util.Collection;
import qf.o;

/* JADX INFO: loaded from: classes3.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g f25128a = new g();

    private g() {
    }

    public static /* synthetic */ boolean f(g gVar, he.a aVar, he.a aVar2, boolean z10, boolean z11, boolean z12, fg.g gVar2, int i10, Object obj) {
        return gVar.e(aVar, aVar2, z10, (i10 & 8) != 0 ? true : z11, (i10 & 16) != 0 ? false : z12, gVar2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean g(he.m mVar, he.m mVar2) {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean h(boolean z10, he.a aVar, he.a aVar2, u1 u1Var, u1 u1Var2) {
        rd.m.e(u1Var, "c1");
        rd.m.e(u1Var2, "c2");
        if (rd.m.a(u1Var, u1Var2)) {
            return true;
        }
        he.h hVarQ = u1Var.q();
        he.h hVarQ2 = u1Var2.q();
        if ((hVarQ instanceof l1) && (hVarQ2 instanceof l1)) {
            return f25128a.n((l1) hVarQ, (l1) hVarQ2, z10, new f(aVar, aVar2));
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean i(he.a aVar, he.a aVar2, he.m mVar, he.m mVar2) {
        return rd.m.a(mVar, aVar) && rd.m.a(mVar2, aVar2);
    }

    private final boolean j(he.e eVar, he.e eVar2) {
        return rd.m.a(eVar.k(), eVar2.k());
    }

    public static /* synthetic */ boolean l(g gVar, he.m mVar, he.m mVar2, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            z11 = true;
        }
        return gVar.k(mVar, mVar2, z10, z11);
    }

    public static /* synthetic */ boolean o(g gVar, l1 l1Var, l1 l1Var2, boolean z10, qd.p pVar, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            pVar = c.f25121a;
        }
        return gVar.n(l1Var, l1Var2, z10, pVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean p(he.m mVar, he.m mVar2) {
        return false;
    }

    private final boolean q(he.m mVar, he.m mVar2, qd.p pVar, boolean z10) {
        he.m mVarB = mVar.b();
        he.m mVarB2 = mVar2.b();
        return ((mVarB instanceof he.b) || (mVarB2 instanceof he.b)) ? ((Boolean) pVar.s(mVarB, mVarB2)).booleanValue() : l(this, mVarB, mVarB2, z10, false, 8, null);
    }

    private final g1 r(he.a aVar) {
        while (aVar instanceof he.b) {
            he.b bVar = (he.b) aVar;
            if (bVar.j() != b.a.FAKE_OVERRIDE) {
                break;
            }
            Collection collectionE = bVar.e();
            rd.m.d(collectionE, "getOverriddenDescriptors(...)");
            aVar = (he.b) ed.q.x0(collectionE);
            if (aVar == null) {
                return null;
            }
        }
        return aVar.getSource();
    }

    public final boolean e(he.a aVar, he.a aVar2, boolean z10, boolean z11, boolean z12, fg.g gVar) {
        rd.m.e(aVar, "a");
        rd.m.e(aVar2, "b");
        rd.m.e(gVar, "kotlinTypeRefiner");
        if (rd.m.a(aVar, aVar2)) {
            return true;
        }
        if (!rd.m.a(aVar.getName(), aVar2.getName())) {
            return false;
        }
        if (z11 && (aVar instanceof d0) && (aVar2 instanceof d0) && ((d0) aVar).M() != ((d0) aVar2).M()) {
            return false;
        }
        if ((rd.m.a(aVar.b(), aVar2.b()) && (!z10 || !rd.m.a(r(aVar), r(aVar2)))) || i.E(aVar) || i.E(aVar2) || !q(aVar, aVar2, d.f25122a, z10)) {
            return false;
        }
        o oVarI = o.i(gVar, new e(z10, aVar, aVar2));
        rd.m.d(oVarI, "create(...)");
        o.i.a aVarC = oVarI.E(aVar, aVar2, null, !z12).c();
        o.i.a aVar3 = o.i.a.OVERRIDABLE;
        return aVarC == aVar3 && oVarI.E(aVar2, aVar, null, z12 ^ true).c() == aVar3;
    }

    public final boolean k(he.m mVar, he.m mVar2, boolean z10, boolean z11) {
        return ((mVar instanceof he.e) && (mVar2 instanceof he.e)) ? j((he.e) mVar, (he.e) mVar2) : ((mVar instanceof l1) && (mVar2 instanceof l1)) ? o(this, (l1) mVar, (l1) mVar2, z10, null, 8, null) : ((mVar instanceof he.a) && (mVar2 instanceof he.a)) ? f(this, (he.a) mVar, (he.a) mVar2, z10, z11, false, g.a.f13059a, 16, null) : ((mVar instanceof n0) && (mVar2 instanceof n0)) ? rd.m.a(((n0) mVar).d(), ((n0) mVar2).d()) : rd.m.a(mVar, mVar2);
    }

    public final boolean m(l1 l1Var, l1 l1Var2, boolean z10) {
        rd.m.e(l1Var, "a");
        rd.m.e(l1Var2, "b");
        return o(this, l1Var, l1Var2, z10, null, 8, null);
    }

    public final boolean n(l1 l1Var, l1 l1Var2, boolean z10, qd.p pVar) {
        rd.m.e(l1Var, "a");
        rd.m.e(l1Var2, "b");
        rd.m.e(pVar, "equivalentCallables");
        if (rd.m.a(l1Var, l1Var2)) {
            return true;
        }
        return !rd.m.a(l1Var.b(), l1Var2.b()) && q(l1Var, l1Var2, pVar, z10) && l1Var.getIndex() == l1Var2.getIndex();
    }
}
