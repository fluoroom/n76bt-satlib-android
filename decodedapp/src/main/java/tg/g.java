package tg;

import hd.f;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class g {
    public static final f1 a(d0 d0Var, hd.i iVar, f0 f0Var, qd.p pVar) {
        hd.i iVarK = y.k(d0Var, iVar);
        u1 n1Var = f0Var.e() ? new n1(iVarK, pVar) : new u1(iVarK, true);
        n1Var.y0(f0Var, n1Var, pVar);
        return n1Var;
    }

    public static /* synthetic */ f1 b(d0 d0Var, hd.i iVar, f0 f0Var, qd.p pVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            iVar = hd.j.f15243a;
        }
        if ((i10 & 2) != 0) {
            f0Var = f0.f27809a;
        }
        return f.a(d0Var, iVar, f0Var, pVar);
    }

    public static final Object c(hd.i iVar, qd.p pVar, hd.e eVar) {
        Object objA0;
        hd.i context = eVar.getContext();
        hd.i iVarJ = y.j(context, iVar);
        i1.e(iVarJ);
        if (iVarJ == context) {
            xg.v vVar = new xg.v(iVarJ, eVar);
            objA0 = yg.b.d(vVar, vVar, pVar);
        } else {
            f.b bVar = hd.f.f15241k;
            if (rd.m.a(iVarJ.a(bVar), context.a(bVar))) {
                a2 a2Var = new a2(iVarJ, eVar);
                hd.i context2 = a2Var.getContext();
                Object objI = xg.e0.i(context2, null);
                try {
                    Object objD = yg.b.d(a2Var, a2Var, pVar);
                    xg.e0.f(context2, objI);
                    objA0 = objD;
                } catch (Throwable th2) {
                    xg.e0.f(context2, objI);
                    throw th2;
                }
            } else {
                m0 m0Var = new m0(iVarJ, eVar);
                yg.a.c(pVar, m0Var, m0Var);
                objA0 = m0Var.A0();
            }
        }
        if (objA0 == id.b.e()) {
            jd.h.c(eVar);
        }
        return objA0;
    }
}
