package ee;

import eg.a2;
import eg.c1;
import eg.m2;
import eg.q1;
import eg.r0;
import eg.u0;
import eg.u1;
import he.e0;
import he.g1;
import he.t;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ke.g0;
import ke.t0;

/* JADX INFO: loaded from: classes3.dex */
public abstract class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final g0 f11913a;

    static {
        ke.p pVar = new ke.p(gg.l.f14501a.i(), o.f11853s);
        he.f fVar = he.f.f15272c;
        mf.f fVarF = o.f11857w.f();
        g1 g1Var = g1.f15281a;
        dg.n nVar = dg.f.f11065e;
        g0 g0Var = new g0(pVar, fVar, false, false, fVarF, g1Var, nVar);
        g0Var.M0(e0.f15262e);
        g0Var.O0(t.f15309e);
        g0Var.N0(ed.q.e(t0.R0(g0Var, ie.h.f16054l.b(), false, m2.f12141f, mf.f.h("T"), 0, nVar)));
        g0Var.K0();
        f11913a = g0Var;
    }

    public static final c1 a(r0 r0Var) {
        rd.m.e(r0Var, "suspendFunType");
        h.r(r0Var);
        i iVarN = jg.d.n(r0Var);
        ie.h annotations = r0Var.getAnnotations();
        r0 r0VarK = h.k(r0Var);
        List listE = h.e(r0Var);
        List listM = h.m(r0Var);
        ArrayList arrayList = new ArrayList(ed.q.v(listM, 10));
        Iterator it = listM.iterator();
        while (it.hasNext()) {
            arrayList.add(((a2) it.next()).getType());
        }
        q1 q1VarK = q1.f12167b.k();
        u1 u1VarK = f11913a.k();
        rd.m.d(u1VarK, "getTypeConstructor(...)");
        List listT0 = ed.q.t0(arrayList, u0.k(q1VarK, u1VarK, ed.q.e(jg.d.d(h.l(r0Var))), false, null, 16, null));
        c1 c1VarJ = jg.d.n(r0Var).J();
        rd.m.d(c1VarJ, "getNullableAnyType(...)");
        return h.b(iVarN, annotations, r0VarK, listE, listT0, null, c1VarJ, (128 & 128) != 0 ? false : false).R0(r0Var.O0());
    }
}
