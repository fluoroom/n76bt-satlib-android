package eg;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class e2 {
    public static final c1 a(r0 r0Var) {
        rd.m.e(r0Var, "<this>");
        l2 l2VarQ0 = r0Var.Q0();
        c1 c1Var = l2VarQ0 instanceof c1 ? (c1) l2VarQ0 : null;
        if (c1Var != null) {
            return c1Var;
        }
        throw new IllegalStateException(("This is should be simple type: " + r0Var).toString());
    }

    public static final r0 b(r0 r0Var, List list, ie.h hVar) {
        rd.m.e(r0Var, "<this>");
        rd.m.e(list, "newArguments");
        rd.m.e(hVar, "newAnnotations");
        return e(r0Var, list, hVar, null, 4, null);
    }

    public static final r0 c(r0 r0Var, List list, ie.h hVar, List list2) {
        rd.m.e(r0Var, "<this>");
        rd.m.e(list, "newArguments");
        rd.m.e(hVar, "newAnnotations");
        rd.m.e(list2, "newArgumentsForUpperBound");
        if ((list.isEmpty() || list == r0Var.L0()) && hVar == r0Var.getAnnotations()) {
            return r0Var;
        }
        q1 q1VarM0 = r0Var.M0();
        if ((hVar instanceof ie.p) && ((ie.p) hVar).isEmpty()) {
            hVar = ie.h.f16054l.b();
        }
        q1 q1VarA = r1.a(q1VarM0, hVar);
        l2 l2VarQ0 = r0Var.Q0();
        if (l2VarQ0 instanceof i0) {
            i0 i0Var = (i0) l2VarQ0;
            return u0.e(d(i0Var.V0(), list, q1VarA), d(i0Var.W0(), list2, q1VarA));
        }
        if (l2VarQ0 instanceof c1) {
            return d((c1) l2VarQ0, list, q1VarA);
        }
        throw new dd.o();
    }

    public static final c1 d(c1 c1Var, List list, q1 q1Var) {
        rd.m.e(c1Var, "<this>");
        rd.m.e(list, "newArguments");
        rd.m.e(q1Var, "newAttributes");
        return (list.isEmpty() && q1Var == c1Var.M0()) ? c1Var : list.isEmpty() ? c1Var.T0(q1Var) : c1Var instanceof gg.i ? ((gg.i) c1Var).Z0(list) : u0.k(q1Var, c1Var.N0(), list, c1Var.O0(), null, 16, null);
    }

    public static /* synthetic */ r0 e(r0 r0Var, List list, ie.h hVar, List list2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = r0Var.L0();
        }
        if ((i10 & 2) != 0) {
            hVar = r0Var.getAnnotations();
        }
        if ((i10 & 4) != 0) {
            list2 = list;
        }
        return c(r0Var, list, hVar, list2);
    }

    public static /* synthetic */ c1 f(c1 c1Var, List list, q1 q1Var, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = c1Var.L0();
        }
        if ((i10 & 2) != 0) {
            q1Var = c1Var.M0();
        }
        return d(c1Var, list, q1Var);
    }
}
