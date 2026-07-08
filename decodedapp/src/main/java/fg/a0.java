package fg;

import d.h0;
import eg.a2;
import eg.i2;
import eg.m2;
import eg.r0;
import eg.u1;
import eg.v1;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a0 {
    private static final r0 a(r0 r0Var) {
        return (r0) kg.c.b(r0Var).d();
    }

    private static final String b(u1 u1Var) {
        StringBuilder sb2 = new StringBuilder();
        c("type: " + u1Var, sb2);
        c("hashCode: " + u1Var.hashCode(), sb2);
        c("javaClass: " + u1Var.getClass().getCanonicalName(), sb2);
        for (he.m mVarQ = u1Var.q(); mVarQ != null; mVarQ = mVarQ.b()) {
            c("fqName: " + pf.n.f24180h.M(mVarQ), sb2);
            c("javaClass: " + mVarQ.getClass().getCanonicalName(), sb2);
        }
        return sb2.toString();
    }

    private static final StringBuilder c(String str, StringBuilder sb2) {
        rd.m.e(str, "<this>");
        sb2.append(str);
        sb2.append('\n');
        return sb2;
    }

    public static final r0 d(r0 r0Var, r0 r0Var2, x xVar) {
        rd.m.e(r0Var, "subtype");
        rd.m.e(r0Var2, "supertype");
        rd.m.e(xVar, "typeCheckingProcedureCallbacks");
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.add(new u(r0Var, null));
        u1 u1VarN0 = r0Var2.N0();
        while (!arrayDeque.isEmpty()) {
            u uVar = (u) arrayDeque.poll();
            r0 r0VarB = uVar.b();
            u1 u1VarN02 = r0VarB.N0();
            if (xVar.a(u1VarN02, u1VarN0)) {
                boolean zO0 = r0VarB.O0();
                for (u uVarA = uVar.a(); uVarA != null; uVarA = uVarA.a()) {
                    r0 r0VarB2 = uVarA.b();
                    List listL0 = r0VarB2.L0();
                    if (h0.a(listL0) && listL0.isEmpty()) {
                        r0VarB = v1.f12211c.a(r0VarB2).c().n(r0VarB, m2.f12140e);
                        rd.m.b(r0VarB);
                    } else {
                        Iterator it = listL0.iterator();
                        while (it.hasNext()) {
                            m2 m2VarA = ((a2) it.next()).a();
                            m2 m2Var = m2.f12140e;
                            if (m2VarA != m2Var) {
                                r0 r0VarN = rf.e.h(v1.f12211c.a(r0VarB2), false, 1, null).c().n(r0VarB, m2Var);
                                rd.m.d(r0VarN, "safeSubstitute(...)");
                                r0VarB = a(r0VarN);
                                break;
                            }
                        }
                        r0VarB = v1.f12211c.a(r0VarB2).c().n(r0VarB, m2.f12140e);
                        rd.m.b(r0VarB);
                    }
                    zO0 = zO0 || r0VarB2.O0();
                }
                u1 u1VarN03 = r0VarB.N0();
                if (xVar.a(u1VarN03, u1VarN0)) {
                    return i2.p(r0VarB, zO0);
                }
                throw new AssertionError("Type constructors should be equals!\nsubstitutedSuperType: " + b(u1VarN03) + ", \n\nsupertype: " + b(u1VarN0) + " \n" + xVar.a(u1VarN03, u1VarN0));
            }
            for (r0 r0Var3 : u1VarN02.e()) {
                rd.m.b(r0Var3);
                arrayDeque.add(new u(r0Var3, uVar));
            }
        }
        return null;
    }
}
