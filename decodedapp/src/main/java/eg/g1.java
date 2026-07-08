package eg;

import eg.y;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public abstract class g1 {
    public static final a a(r0 r0Var) {
        rd.m.e(r0Var, "<this>");
        l2 l2VarQ0 = r0Var.Q0();
        if (l2VarQ0 instanceof a) {
            return (a) l2VarQ0;
        }
        return null;
    }

    public static final c1 b(r0 r0Var) {
        rd.m.e(r0Var, "<this>");
        a aVarA = a(r0Var);
        if (aVarA != null) {
            return aVarA.Z0();
        }
        return null;
    }

    public static final boolean c(r0 r0Var) {
        rd.m.e(r0Var, "<this>");
        return r0Var.Q0() instanceof y;
    }

    private static final q0 d(q0 q0Var) {
        r0 r0Var;
        Collection collectionE = q0Var.e();
        ArrayList arrayList = new ArrayList(ed.q.v(collectionE, 10));
        Iterator it = collectionE.iterator();
        boolean z10 = false;
        while (true) {
            r0Var = null;
            if (!it.hasNext()) {
                break;
            }
            r0 r0VarF = (r0) it.next();
            if (i2.l(r0VarF)) {
                r0VarF = f(r0VarF.Q0(), false, 1, null);
                z10 = true;
            }
            arrayList.add(r0VarF);
        }
        if (!z10) {
            return null;
        }
        r0 r0VarH = q0Var.h();
        if (r0VarH != null) {
            if (i2.l(r0VarH)) {
                r0VarH = f(r0VarH.Q0(), false, 1, null);
            }
            r0Var = r0VarH;
        }
        return new q0(arrayList).n(r0Var);
    }

    public static final l2 e(l2 l2Var, boolean z10) {
        rd.m.e(l2Var, "<this>");
        y yVarC = y.a.c(y.f12223d, l2Var, z10, false, 4, null);
        if (yVarC != null) {
            return yVarC;
        }
        c1 c1VarG = g(l2Var);
        return c1VarG != null ? c1VarG : l2Var.R0(false);
    }

    public static /* synthetic */ l2 f(l2 l2Var, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return e(l2Var, z10);
    }

    private static final c1 g(r0 r0Var) {
        q0 q0VarD;
        u1 u1VarN0 = r0Var.N0();
        q0 q0Var = u1VarN0 instanceof q0 ? (q0) u1VarN0 : null;
        if (q0Var == null || (q0VarD = d(q0Var)) == null) {
            return null;
        }
        return q0VarD.f();
    }

    public static final c1 h(c1 c1Var, boolean z10) {
        rd.m.e(c1Var, "<this>");
        y yVarC = y.a.c(y.f12223d, c1Var, z10, false, 4, null);
        if (yVarC != null) {
            return yVarC;
        }
        c1 c1VarG = g(c1Var);
        return c1VarG == null ? c1Var.R0(false) : c1VarG;
    }

    public static /* synthetic */ c1 i(c1 c1Var, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return h(c1Var, z10);
    }

    public static final c1 j(c1 c1Var, c1 c1Var2) {
        rd.m.e(c1Var, "<this>");
        rd.m.e(c1Var2, "abbreviatedType");
        return v0.a(c1Var) ? c1Var : new a(c1Var, c1Var2);
    }

    public static final fg.i k(fg.i iVar) {
        rd.m.e(iVar, "<this>");
        return new fg.i(iVar.W0(), iVar.N0(), iVar.Y0(), iVar.M0(), iVar.O0(), true);
    }
}
