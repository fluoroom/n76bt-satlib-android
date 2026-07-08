package he;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class p1 {
    public static final w0 d(eg.r0 r0Var) {
        rd.m.e(r0Var, "<this>");
        h hVarQ = r0Var.N0().q();
        return e(r0Var, hVarQ instanceof i ? (i) hVarQ : null, 0);
    }

    private static final w0 e(eg.r0 r0Var, i iVar, int i10) {
        if (iVar == null || gg.l.m(iVar)) {
            return null;
        }
        int size = iVar.v().size() + i10;
        if (iVar.N()) {
            List listSubList = r0Var.L0().subList(i10, size);
            m mVarB = iVar.b();
            return new w0(iVar, listSubList, e(r0Var, mVarB instanceof i ? (i) mVarB : null, size));
        }
        if (size != r0Var.L0().size()) {
            qf.i.E(iVar);
        }
        return new w0(iVar, r0Var.L0().subList(i10, r0Var.L0().size()), null);
    }

    private static final c f(l1 l1Var, m mVar, int i10) {
        return new c(l1Var, mVar, i10);
    }

    public static final List g(i iVar) {
        List listK;
        Object next;
        eg.u1 u1VarK;
        rd.m.e(iVar, "<this>");
        List listV = iVar.v();
        rd.m.d(listV, "getDeclaredTypeParameters(...)");
        if (!iVar.N() && !(iVar.b() instanceof a)) {
            return listV;
        }
        List listO = qg.k.O(qg.k.C(qg.k.x(qg.k.M(uf.e.u(iVar), m1.f15298a), n1.f15299a), o1.f15300a));
        Iterator it = uf.e.u(iVar).iterator();
        while (true) {
            listK = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (next instanceof e) {
                break;
            }
        }
        e eVar = (e) next;
        if (eVar != null && (u1VarK = eVar.k()) != null) {
            listK = u1VarK.getParameters();
        }
        if (listK == null) {
            listK = ed.q.k();
        }
        if (listO.isEmpty() && listK.isEmpty()) {
            List listV2 = iVar.v();
            rd.m.d(listV2, "getDeclaredTypeParameters(...)");
            return listV2;
        }
        List<l1> listS0 = ed.q.s0(listO, listK);
        ArrayList arrayList = new ArrayList(ed.q.v(listS0, 10));
        for (l1 l1Var : listS0) {
            rd.m.b(l1Var);
            arrayList.add(f(l1Var, iVar, listV.size()));
        }
        return ed.q.s0(listV, arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean h(m mVar) {
        rd.m.e(mVar, "it");
        return mVar instanceof a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean i(m mVar) {
        rd.m.e(mVar, "it");
        return !(mVar instanceof l);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final qg.h j(m mVar) {
        rd.m.e(mVar, "it");
        List typeParameters = ((a) mVar).getTypeParameters();
        rd.m.d(typeParameters, "getTypeParameters(...)");
        return ed.q.S(typeParameters);
    }
}
