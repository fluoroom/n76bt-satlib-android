package fg;

import d.h0;
import eg.a2;
import eg.c1;
import eg.f2;
import eg.l2;
import eg.m2;
import eg.r0;
import eg.u0;
import eg.v1;
import fg.f;
import he.l1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class o {
    private static final List a(l2 l2Var, ig.b bVar) {
        if (l2Var.L0().size() != l2Var.N0().getParameters().size()) {
            return null;
        }
        List listL0 = l2Var.L0();
        if (!h0.a(listL0) || !listL0.isEmpty()) {
            Iterator it = listL0.iterator();
            while (it.hasNext()) {
                if (((a2) it.next()).a() != m2.f12140e) {
                    List parameters = l2Var.N0().getParameters();
                    rd.m.d(parameters, "getParameters(...)");
                    List<dd.q> listQ0 = ed.q.Q0(listL0, parameters);
                    ArrayList arrayList = new ArrayList(ed.q.v(listQ0, 10));
                    for (dd.q qVar : listQ0) {
                        a2 a2VarD = (a2) qVar.a();
                        l1 l1Var = (l1) qVar.b();
                        if (a2VarD.a() != m2.f12140e) {
                            l2 l2VarQ0 = (a2VarD.b() || a2VarD.a() != m2.f12141f) ? null : a2VarD.getType().Q0();
                            rd.m.b(l1Var);
                            a2VarD = jg.d.d(new i(bVar, l2VarQ0, a2VarD, l1Var));
                        }
                        arrayList.add(a2VarD);
                    }
                    f2 f2VarC = v1.f12211c.b(l2Var.N0(), arrayList).c();
                    int size = listL0.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        a2 a2Var = (a2) listL0.get(i10);
                        a2 a2Var2 = (a2) arrayList.get(i10);
                        if (a2Var.a() != m2.f12140e) {
                            List upperBounds = ((l1) l2Var.N0().getParameters().get(i10)).getUpperBounds();
                            rd.m.d(upperBounds, "getUpperBounds(...)");
                            ArrayList arrayList2 = new ArrayList();
                            Iterator it2 = upperBounds.iterator();
                            while (it2.hasNext()) {
                                arrayList2.add(f.a.f13058a.a(f2VarC.n((r0) it2.next(), m2.f12140e).Q0()));
                            }
                            if (!a2Var.b() && a2Var.a() == m2.f12142g) {
                                arrayList2.add(f.a.f13058a.a(a2Var.getType().Q0()));
                            }
                            r0 type = a2Var2.getType();
                            rd.m.c(type, "null cannot be cast to non-null type org.jetbrains.kotlin.types.checker.NewCapturedType");
                            ((i) type).N0().j(arrayList2);
                        }
                    }
                    return arrayList;
                }
            }
        }
        return null;
    }

    public static final c1 b(c1 c1Var, ig.b bVar) {
        rd.m.e(c1Var, "type");
        rd.m.e(bVar, "status");
        List listA = a(c1Var, bVar);
        if (listA != null) {
            return c(c1Var, listA);
        }
        return null;
    }

    private static final c1 c(l2 l2Var, List list) {
        return u0.k(l2Var.M0(), l2Var.N0(), list, l2Var.O0(), null, 16, null);
    }
}
