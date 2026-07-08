package he;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class y {

    static final /* synthetic */ class a extends rd.w {

        /* JADX INFO: renamed from: r */
        public static final a f15341r = ;

        a() {
        }

        @Override // rd.w, yd.l
        public Object get(Object obj) {
            return ((mf.b) obj).e();
        }
    }

    public static final e b(h0 h0Var, mf.b bVar) {
        rd.m.e(h0Var, "<this>");
        rd.m.e(bVar, "classId");
        h hVarC = c(h0Var, bVar);
        if (hVarC instanceof e) {
            return (e) hVarC;
        }
        return null;
    }

    public static final h c(h0 h0Var, mf.b bVar) {
        rd.m.e(h0Var, "<this>");
        rd.m.e(bVar, "classId");
        h0 h0VarA = qf.s.a(h0Var);
        if (h0VarA == null) {
            u0 u0VarY = h0Var.y(bVar.f());
            List listE = bVar.g().e();
            h hVarG = u0VarY.p().g((mf.f) ed.q.Z(listE), pe.d.A);
            if (hVarG == null) {
                return null;
            }
            for (mf.f fVar : listE.subList(1, listE.size())) {
                if (!(hVarG instanceof e)) {
                    return null;
                }
                h hVarG2 = ((e) hVarG).y0().g(fVar, pe.d.A);
                hVarG = hVarG2 instanceof e ? (e) hVarG2 : null;
                if (hVarG == null) {
                    return null;
                }
            }
            return hVarG;
        }
        u0 u0VarY2 = h0VarA.y(bVar.f());
        List listE2 = bVar.g().e();
        h hVarG3 = u0VarY2.p().g((mf.f) ed.q.Z(listE2), pe.d.A);
        if (hVarG3 == null) {
            hVarG3 = null;
            break;
        }
        for (mf.f fVar2 : listE2.subList(1, listE2.size())) {
            if (hVarG3 instanceof e) {
                h hVarG4 = ((e) hVarG3).y0().g(fVar2, pe.d.A);
                hVarG3 = hVarG4 instanceof e ? (e) hVarG4 : null;
                if (hVarG3 != null) {
                }
            }
            hVarG3 = null;
        }
        if (hVarG3 != null) {
            return hVarG3;
        }
        u0 u0VarY3 = h0Var.y(bVar.f());
        List listE3 = bVar.g().e();
        h hVarG5 = u0VarY3.p().g((mf.f) ed.q.Z(listE3), pe.d.A);
        if (hVarG5 == null) {
            return null;
        }
        for (mf.f fVar3 : listE3.subList(1, listE3.size())) {
            if (!(hVarG5 instanceof e)) {
                return null;
            }
            h hVarG6 = ((e) hVarG5).y0().g(fVar3, pe.d.A);
            hVarG5 = hVarG6 instanceof e ? (e) hVarG6 : null;
            if (hVarG5 == null) {
                return null;
            }
        }
        return hVarG5;
    }

    public static final e d(h0 h0Var, mf.b bVar, m0 m0Var) {
        rd.m.e(h0Var, "<this>");
        rd.m.e(bVar, "classId");
        rd.m.e(m0Var, "notFoundClasses");
        e eVarB = b(h0Var, bVar);
        return eVarB != null ? eVarB : m0Var.d(bVar, qg.k.O(qg.k.H(qg.k.n(bVar, a.f15341r), x.f15340a)));
    }

    public static final int e(mf.b bVar) {
        rd.m.e(bVar, "it");
        return 0;
    }

    public static final k1 f(h0 h0Var, mf.b bVar) {
        rd.m.e(h0Var, "<this>");
        rd.m.e(bVar, "classId");
        h hVarC = c(h0Var, bVar);
        if (hVarC instanceof k1) {
            return (k1) hVarC;
        }
        return null;
    }
}
