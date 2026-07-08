package vf;

import d.h0;
import ee.o;
import eg.r0;
import he.h;
import he.l1;
import he.s1;
import he.t;
import java.util.Iterator;
import java.util.List;
import qf.i;
import qf.k;
import rd.m;

/* JADX INFO: loaded from: classes3.dex */
public abstract class b {
    private static final boolean a(he.e eVar) {
        return m.a(uf.e.o(eVar), o.f11858x);
    }

    private static final boolean b(r0 r0Var, boolean z10) {
        h hVarQ = r0Var.N0().q();
        l1 l1Var = hVarQ instanceof l1 ? (l1) hVarQ : null;
        if (l1Var == null) {
            return false;
        }
        return (z10 || !k.d(l1Var)) && e(jg.d.o(l1Var));
    }

    public static final boolean c(r0 r0Var) {
        m.e(r0Var, "<this>");
        h hVarQ = r0Var.N0().q();
        return hVarQ != null && ((k.b(hVarQ) && d(hVarQ)) || k.i(r0Var));
    }

    public static final boolean d(he.m mVar) {
        m.e(mVar, "<this>");
        return k.g(mVar) && !a((he.e) mVar);
    }

    private static final boolean e(r0 r0Var) {
        return c(r0Var) || b(r0Var, true);
    }

    public static final boolean f(he.b bVar) {
        m.e(bVar, "descriptor");
        he.d dVar = bVar instanceof he.d ? (he.d) bVar : null;
        if (dVar == null || t.g(dVar.getVisibility())) {
            return false;
        }
        he.e eVarE = dVar.E();
        m.d(eVarE, "getConstructedClass(...)");
        if (k.g(eVarE) || i.G(dVar.E())) {
            return false;
        }
        List listI = dVar.i();
        m.d(listI, "getValueParameters(...)");
        if (h0.a(listI) && listI.isEmpty()) {
            return false;
        }
        Iterator it = listI.iterator();
        while (it.hasNext()) {
            r0 type = ((s1) it.next()).getType();
            m.d(type, "getType(...)");
            if (e(type)) {
                return true;
            }
        }
        return false;
    }
}
