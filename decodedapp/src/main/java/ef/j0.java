package ef;

import df.s1;
import eg.g2;
import ge.c;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class j0 {
    public static final Object a(t tVar, Object obj, boolean z10) {
        rd.m.e(tVar, "<this>");
        rd.m.e(obj, "possiblyPrimitiveType");
        return z10 ? tVar.e(obj) : obj;
    }

    public static final Object b(g2 g2Var, ig.i iVar, t tVar, i0 i0Var) {
        rd.m.e(g2Var, "<this>");
        rd.m.e(iVar, "type");
        rd.m.e(tVar, "typeFactory");
        rd.m.e(i0Var, "mode");
        ig.p pVarA = g2Var.A(iVar);
        if (!g2Var.t(pVarA)) {
            return null;
        }
        ee.l lVarR = g2Var.R(pVarA);
        if (lVarR != null) {
            return a(tVar, tVar.b(lVarR), g2Var.U(iVar) || s1.c(g2Var, iVar));
        }
        ee.l lVarB0 = g2Var.B0(pVarA);
        if (lVarB0 != null) {
            return tVar.c('[' + vf.e.d(lVarB0).f());
        }
        if (g2Var.H0(pVarA)) {
            mf.d dVarZ0 = g2Var.z0(pVarA);
            mf.b bVarN = dVarZ0 != null ? ge.c.f13796a.n(dVarZ0) : null;
            if (bVarN != null) {
                if (!i0Var.a()) {
                    List listI = ge.c.f13796a.i();
                    if (!d.h0.a(listI) || !listI.isEmpty()) {
                        Iterator it = listI.iterator();
                        while (it.hasNext()) {
                            if (rd.m.a(((c.a) it.next()).d(), bVarN)) {
                                return null;
                            }
                        }
                    }
                }
                String strH = vf.d.h(bVarN);
                rd.m.d(strH, "internalNameByClassId(...)");
                return tVar.d(strH);
            }
        }
        return null;
    }
}
