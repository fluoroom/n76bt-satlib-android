package eg;

import eg.t1;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f12061a = new c();

    private c() {
    }

    private final boolean c(t1 t1Var, ig.j jVar, ig.p pVar) {
        ig.r rVarJ = t1Var.j();
        if (rVarJ.v(jVar)) {
            return true;
        }
        if (rVarJ.T(jVar)) {
            return false;
        }
        if (t1Var.o() && rVarJ.y0(jVar)) {
            return true;
        }
        return rVarJ.q(rVarJ.f(jVar), pVar);
    }

    private final boolean e(t1 t1Var, ig.j jVar, ig.j jVar2) {
        ig.r rVarJ = t1Var.j();
        if (g.f12095b) {
            if (!rVarJ.a(jVar) && !rVarJ.E(rVarJ.f(jVar))) {
                t1Var.l(jVar);
            }
            if (!rVarJ.a(jVar2)) {
                t1Var.l(jVar2);
            }
        }
        if (rVarJ.T(jVar2) || rVarJ.I0(jVar) || rVarJ.s(jVar)) {
            return true;
        }
        if ((jVar instanceof ig.d) && rVarJ.V((ig.d) jVar)) {
            return true;
        }
        c cVar = f12061a;
        if (cVar.a(t1Var, jVar, t1.c.b.f12199a)) {
            return true;
        }
        if (rVarJ.I0(jVar2) || cVar.a(t1Var, jVar2, t1.c.d.f12201a) || rVarJ.r0(jVar)) {
            return false;
        }
        return cVar.b(t1Var, jVar, rVarJ.f(jVar2));
    }

    public final boolean a(t1 t1Var, ig.j jVar, t1.c cVar) {
        rd.m.e(t1Var, "<this>");
        rd.m.e(jVar, "type");
        rd.m.e(cVar, "supertypesPolicy");
        ig.r rVarJ = t1Var.j();
        if ((rVarJ.r0(jVar) && !rVarJ.T(jVar)) || rVarJ.I0(jVar)) {
            return true;
        }
        t1Var.k();
        ArrayDeque arrayDequeH = t1Var.h();
        rd.m.b(arrayDequeH);
        Set setI = t1Var.i();
        rd.m.b(setI);
        arrayDequeH.push(jVar);
        while (!arrayDequeH.isEmpty()) {
            ig.j jVar2 = (ig.j) arrayDequeH.pop();
            rd.m.b(jVar2);
            if (setI.add(jVar2)) {
                t1.c cVar2 = rVarJ.T(jVar2) ? t1.c.C0166c.f12200a : cVar;
                if (rd.m.a(cVar2, t1.c.C0166c.f12200a)) {
                    cVar2 = null;
                }
                if (cVar2 == null) {
                    continue;
                } else {
                    ig.r rVarJ2 = t1Var.j();
                    Iterator it = rVarJ2.u0(rVarJ2.f(jVar2)).iterator();
                    while (it.hasNext()) {
                        ig.j jVarA = cVar2.a(t1Var, (ig.i) it.next());
                        if ((rVarJ.r0(jVarA) && !rVarJ.T(jVarA)) || rVarJ.I0(jVarA)) {
                            t1Var.e();
                            return true;
                        }
                        arrayDequeH.add(jVarA);
                    }
                }
            }
        }
        t1Var.e();
        return false;
    }

    public final boolean b(t1 t1Var, ig.j jVar, ig.p pVar) {
        rd.m.e(t1Var, "state");
        rd.m.e(jVar, "start");
        rd.m.e(pVar, "end");
        ig.r rVarJ = t1Var.j();
        if (f12061a.c(t1Var, jVar, pVar)) {
            return true;
        }
        t1Var.k();
        ArrayDeque arrayDequeH = t1Var.h();
        rd.m.b(arrayDequeH);
        Set setI = t1Var.i();
        rd.m.b(setI);
        arrayDequeH.push(jVar);
        while (!arrayDequeH.isEmpty()) {
            ig.j jVar2 = (ig.j) arrayDequeH.pop();
            rd.m.b(jVar2);
            if (setI.add(jVar2)) {
                t1.c cVar = rVarJ.T(jVar2) ? t1.c.C0166c.f12200a : t1.c.b.f12199a;
                if (rd.m.a(cVar, t1.c.C0166c.f12200a)) {
                    cVar = null;
                }
                if (cVar == null) {
                    continue;
                } else {
                    ig.r rVarJ2 = t1Var.j();
                    Iterator it = rVarJ2.u0(rVarJ2.f(jVar2)).iterator();
                    while (it.hasNext()) {
                        ig.j jVarA = cVar.a(t1Var, (ig.i) it.next());
                        if (f12061a.c(t1Var, jVarA, pVar)) {
                            t1Var.e();
                            return true;
                        }
                        arrayDequeH.add(jVarA);
                    }
                }
            }
        }
        t1Var.e();
        return false;
    }

    public final boolean d(t1 t1Var, ig.j jVar, ig.j jVar2) {
        rd.m.e(t1Var, "state");
        rd.m.e(jVar, "subType");
        rd.m.e(jVar2, "superType");
        return e(t1Var, jVar, jVar2);
    }
}
