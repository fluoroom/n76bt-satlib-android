package df;

import eg.i2;
import eg.l2;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class l1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g f11008a;

    public l1(g gVar) {
        rd.m.e(gVar, "typeEnhancement");
        this.f11008a = gVar;
    }

    private final boolean f(eg.r0 r0Var) {
        return i2.c(r0Var, k1.f11003a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Boolean g(l2 l2Var) {
        he.h hVarQ = l2Var.N0().q();
        if (hVarQ == null) {
            return Boolean.FALSE;
        }
        mf.f name = hVarQ.getName();
        ge.c cVar = ge.c.f13796a;
        return Boolean.valueOf(rd.m.a(name, cVar.h().f()) && rd.m.a(uf.e.k(hVarQ), cVar.h()));
    }

    private final eg.r0 h(n1 n1Var, eg.r0 r0Var, List list, q1 q1Var, boolean z10) {
        return this.f11008a.a(r0Var, n1Var.d(r0Var, list, q1Var, z10), n1Var.z());
    }

    private final eg.r0 i(he.b bVar, ie.a aVar, boolean z10, ye.k kVar, ve.c cVar, q1 q1Var, boolean z11, qd.l lVar) {
        n1 n1Var = new n1(aVar, z10, kVar, cVar, false, 16, null);
        eg.r0 r0Var = (eg.r0) lVar.l(bVar);
        Collection<he.b> collectionE = bVar.e();
        rd.m.d(collectionE, "getOverriddenDescriptors(...)");
        ArrayList arrayList = new ArrayList(ed.q.v(collectionE, 10));
        for (he.b bVar2 : collectionE) {
            rd.m.b(bVar2);
            arrayList.add((eg.r0) lVar.l(bVar2));
        }
        return h(n1Var, r0Var, arrayList, q1Var, z11);
    }

    static /* synthetic */ eg.r0 j(l1 l1Var, n1 n1Var, eg.r0 r0Var, List list, q1 q1Var, boolean z10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            q1Var = null;
        }
        return l1Var.h(n1Var, r0Var, list, q1Var, (i10 & 8) != 0 ? false : z10);
    }

    static /* synthetic */ eg.r0 k(l1 l1Var, he.b bVar, ie.a aVar, boolean z10, ye.k kVar, ve.c cVar, q1 q1Var, boolean z11, qd.l lVar, int i10, Object obj) {
        return l1Var.i(bVar, aVar, z10, kVar, cVar, q1Var, (i10 & 32) != 0 ? false : z11, lVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:131:0x0220, code lost:
    
        if (r3 == null) goto L133;
     */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01fa A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00d0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final he.b l(he.b r18, ye.k r19) {
        /*
            Method dump skipped, instruction units count: 642
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: df.l1.l(he.b, ye.k):he.b");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final eg.r0 m(he.b bVar) {
        rd.m.e(bVar, "it");
        eg.r0 r0VarG = bVar.g();
        rd.m.b(r0VarG);
        return r0VarG;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final eg.r0 n(he.b bVar) {
        rd.m.e(bVar, "it");
        he.b1 b1VarL0 = bVar.l0();
        rd.m.b(b1VarL0);
        eg.r0 type = b1VarL0.getType();
        rd.m.d(type, "getType(...)");
        return type;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final eg.r0 o(he.s1 s1Var, he.b bVar) {
        rd.m.e(bVar, "it");
        eg.r0 type = ((he.s1) bVar.i().get(s1Var.getIndex())).getType();
        rd.m.d(type, "getType(...)");
        return type;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean s(l2 l2Var) {
        rd.m.e(l2Var, "it");
        return l2Var instanceof eg.b1;
    }

    private final eg.r0 t(he.b bVar, he.s1 s1Var, ye.k kVar, q1 q1Var, boolean z10, qd.l lVar) {
        ye.k kVarK;
        return i(bVar, s1Var, false, (s1Var == null || (kVarK = ye.c.k(kVar, s1Var.getAnnotations())) == null) ? kVar : kVarK, ve.c.f30558c, q1Var, z10, lVar);
    }

    private final ie.h u(he.b bVar, ye.k kVar) {
        he.h hVarA = he.s.a(bVar);
        if (hVarA == null) {
            return bVar.getAnnotations();
        }
        ze.n nVar = hVarA instanceof ze.n ? (ze.n) hVarA : null;
        List listT0 = nVar != null ? nVar.T0() : null;
        if (listT0 == null || listT0.isEmpty()) {
            return bVar.getAnnotations();
        }
        ArrayList arrayList = new ArrayList(ed.q.v(listT0, 10));
        Iterator it = listT0.iterator();
        while (it.hasNext()) {
            arrayList.add(new ze.j(kVar, (cf.a) it.next(), true));
        }
        return ie.h.f16054l.a(ed.q.q0(bVar.getAnnotations(), arrayList));
    }

    public final Collection p(ye.k kVar, Collection collection) {
        rd.m.e(kVar, "c");
        rd.m.e(collection, "platformSignatures");
        ArrayList arrayList = new ArrayList(ed.q.v(collection, 10));
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(l((he.b) it.next(), kVar));
        }
        return arrayList;
    }

    public final eg.r0 q(eg.r0 r0Var, ye.k kVar) {
        rd.m.e(r0Var, "type");
        rd.m.e(kVar, "context");
        eg.r0 r0VarJ = j(this, new n1(null, false, kVar, ve.c.f30560e, true), r0Var, ed.q.k(), null, false, 12, null);
        return r0VarJ == null ? r0Var : r0VarJ;
    }

    public final List r(he.l1 l1Var, List list, ye.k kVar) {
        eg.r0 r0Var;
        eg.r0 r0VarJ;
        rd.m.e(l1Var, "typeParameter");
        rd.m.e(list, "bounds");
        rd.m.e(kVar, "context");
        ArrayList arrayList = new ArrayList(ed.q.v(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            eg.r0 r0Var2 = (eg.r0) it.next();
            if (jg.d.e(r0Var2, j1.f10996a)) {
                r0Var = r0Var2;
            } else {
                r0Var = r0Var2;
                r0VarJ = j(this, new n1(l1Var, false, kVar, ve.c.f30561f, false, 16, null), r0Var, ed.q.k(), null, false, 12, null);
                if (r0VarJ == null) {
                }
                arrayList.add(r0VarJ);
            }
            r0VarJ = r0Var;
            arrayList.add(r0VarJ);
        }
        return arrayList;
    }
}
