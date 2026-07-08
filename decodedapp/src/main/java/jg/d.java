package jg;

import d.h0;
import dd.o;
import ed.g0;
import ed.q;
import eg.a2;
import eg.c1;
import eg.c2;
import eg.e2;
import eg.i0;
import eg.i2;
import eg.j1;
import eg.k2;
import eg.l2;
import eg.m2;
import eg.r0;
import eg.r1;
import eg.u0;
import eg.u1;
import eg.y;
import he.e;
import he.f;
import he.i;
import he.k1;
import he.l1;
import ie.h;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import qd.l;
import rd.m;

/* JADX INFO: loaded from: classes3.dex */
public abstract class d {
    public static final r0 A(r0 r0Var) {
        m.e(r0Var, "<this>");
        r0 r0VarN = i2.n(r0Var);
        m.d(r0VarN, "makeNotNullable(...)");
        return r0VarN;
    }

    public static final r0 B(r0 r0Var) {
        m.e(r0Var, "<this>");
        r0 r0VarO = i2.o(r0Var);
        m.d(r0VarO, "makeNullable(...)");
        return r0VarO;
    }

    public static final r0 C(r0 r0Var, h hVar) {
        m.e(r0Var, "<this>");
        m.e(hVar, "newAnnotations");
        return (r0Var.getAnnotations().isEmpty() && hVar.isEmpty()) ? r0Var : r0Var.Q0().T0(r1.a(r0Var.M0(), hVar));
    }

    public static final r0 D(r0 r0Var) {
        l2 l2VarF;
        m.e(r0Var, "<this>");
        l2 l2VarQ0 = r0Var.Q0();
        if (l2VarQ0 instanceof i0) {
            i0 i0Var = (i0) l2VarQ0;
            c1 c1VarV0 = i0Var.V0();
            if (!c1VarV0.N0().getParameters().isEmpty() && c1VarV0.N0().q() != null) {
                List parameters = c1VarV0.N0().getParameters();
                m.d(parameters, "getParameters(...)");
                ArrayList arrayList = new ArrayList(q.v(parameters, 10));
                Iterator it = parameters.iterator();
                while (it.hasNext()) {
                    arrayList.add(new j1((l1) it.next()));
                }
                c1VarV0 = e2.f(c1VarV0, arrayList, null, 2, null);
            }
            c1 c1VarW0 = i0Var.W0();
            if (!c1VarW0.N0().getParameters().isEmpty() && c1VarW0.N0().q() != null) {
                List parameters2 = c1VarW0.N0().getParameters();
                m.d(parameters2, "getParameters(...)");
                ArrayList arrayList2 = new ArrayList(q.v(parameters2, 10));
                Iterator it2 = parameters2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(new j1((l1) it2.next()));
                }
                c1VarW0 = e2.f(c1VarW0, arrayList2, null, 2, null);
            }
            l2VarF = u0.e(c1VarV0, c1VarW0);
        } else {
            if (!(l2VarQ0 instanceof c1)) {
                throw new o();
            }
            c1 c1Var = (c1) l2VarQ0;
            boolean zIsEmpty = c1Var.N0().getParameters().isEmpty();
            l2VarF = c1Var;
            if (!zIsEmpty) {
                he.h hVarQ = c1Var.N0().q();
                l2VarF = c1Var;
                if (hVarQ != null) {
                    List parameters3 = c1Var.N0().getParameters();
                    m.d(parameters3, "getParameters(...)");
                    ArrayList arrayList3 = new ArrayList(q.v(parameters3, 10));
                    Iterator it3 = parameters3.iterator();
                    while (it3.hasNext()) {
                        arrayList3.add(new j1((l1) it3.next()));
                    }
                    l2VarF = e2.f(c1Var, arrayList3, null, 2, null);
                }
            }
        }
        return k2.b(l2VarF, l2VarQ0);
    }

    public static final boolean E(r0 r0Var) {
        m.e(r0Var, "<this>");
        return e(r0Var, c.f18715a);
    }

    public static final boolean F(l2 l2Var) {
        m.e(l2Var, "it");
        he.h hVarQ = l2Var.N0().q();
        if (hVarQ != null) {
            return (hVarQ instanceof k1) || (hVarQ instanceof l1);
        }
        return false;
    }

    public static final a2 d(r0 r0Var) {
        m.e(r0Var, "<this>");
        return new c2(r0Var);
    }

    public static final boolean e(r0 r0Var, l lVar) {
        m.e(r0Var, "<this>");
        m.e(lVar, "predicate");
        return i2.c(r0Var, lVar);
    }

    private static final boolean f(r0 r0Var, u1 u1Var, Set set) {
        boolean zF;
        if (m.a(r0Var.N0(), u1Var)) {
            return true;
        }
        he.h hVarQ = r0Var.N0().q();
        i iVar = hVarQ instanceof i ? (i) hVarQ : null;
        List listV = iVar != null ? iVar.v() : null;
        Iterable<g0> iterableO0 = q.O0(r0Var.L0());
        if ((iterableO0 instanceof Collection) && ((Collection) iterableO0).isEmpty()) {
            return false;
        }
        for (g0 g0Var : iterableO0) {
            int iA = g0Var.a();
            a2 a2Var = (a2) g0Var.b();
            l1 l1Var = listV != null ? (l1) q.c0(listV, iA) : null;
            if ((l1Var == null || set == null || !set.contains(l1Var)) && !a2Var.b()) {
                r0 type = a2Var.getType();
                m.d(type, "getType(...)");
                zF = f(type, u1Var, set);
            } else {
                zF = false;
            }
            if (zF) {
                return true;
            }
        }
        return false;
    }

    public static final boolean g(r0 r0Var) {
        m.e(r0Var, "<this>");
        return e(r0Var, b.f18714a);
    }

    public static final boolean h(l2 l2Var) {
        m.e(l2Var, "it");
        he.h hVarQ = l2Var.N0().q();
        if (hVarQ != null) {
            return x(hVarQ);
        }
        return false;
    }

    public static final boolean i(r0 r0Var) {
        m.e(r0Var, "<this>");
        return i2.c(r0Var, a.f18713a);
    }

    public static final Boolean j(l2 l2Var) {
        return Boolean.valueOf(i2.m(l2Var));
    }

    public static final a2 k(r0 r0Var, m2 m2Var, l1 l1Var) {
        m.e(r0Var, "type");
        m.e(m2Var, "projectionKind");
        if ((l1Var != null ? l1Var.n() : null) == m2Var) {
            m2Var = m2.f12140e;
        }
        return new c2(m2Var, r0Var);
    }

    public static final Set l(r0 r0Var, Set set) {
        m.e(r0Var, "<this>");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        m(r0Var, r0Var, linkedHashSet, set);
        return linkedHashSet;
    }

    private static final void m(r0 r0Var, r0 r0Var2, Set set, Set set2) {
        he.h hVarQ = r0Var.N0().q();
        if (hVarQ instanceof l1) {
            if (!m.a(r0Var.N0(), r0Var2.N0())) {
                set.add(hVarQ);
                return;
            }
            for (r0 r0Var3 : ((l1) hVarQ).getUpperBounds()) {
                m.b(r0Var3);
                m(r0Var3, r0Var2, set, set2);
            }
            return;
        }
        he.h hVarQ2 = r0Var.N0().q();
        i iVar = hVarQ2 instanceof i ? (i) hVarQ2 : null;
        List listV = iVar != null ? iVar.v() : null;
        int i10 = 0;
        for (a2 a2Var : r0Var.L0()) {
            int i11 = i10 + 1;
            l1 l1Var = listV != null ? (l1) q.c0(listV, i10) : null;
            if ((l1Var == null || set2 == null || !set2.contains(l1Var)) && !a2Var.b() && !q.T(set, a2Var.getType().N0().q()) && !m.a(a2Var.getType().N0(), r0Var2.N0())) {
                r0 type = a2Var.getType();
                m.d(type, "getType(...)");
                m(type, r0Var2, set, set2);
            }
            i10 = i11;
        }
    }

    public static final ee.i n(r0 r0Var) {
        m.e(r0Var, "<this>");
        ee.i iVarO = r0Var.N0().o();
        m.d(iVarO, "getBuiltIns(...)");
        return iVarO;
    }

    public static final r0 o(l1 l1Var) {
        Object obj;
        m.e(l1Var, "<this>");
        List upperBounds = l1Var.getUpperBounds();
        m.d(upperBounds, "getUpperBounds(...)");
        upperBounds.isEmpty();
        List upperBounds2 = l1Var.getUpperBounds();
        m.d(upperBounds2, "getUpperBounds(...)");
        Iterator it = upperBounds2.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            he.h hVarQ = ((r0) next).N0().q();
            e eVar = hVarQ instanceof e ? (e) hVarQ : null;
            if (eVar != null && eVar.j() != f.f15272c && eVar.j() != f.f15275f) {
                obj = next;
                break;
            }
        }
        r0 r0Var = (r0) obj;
        if (r0Var != null) {
            return r0Var;
        }
        List upperBounds3 = l1Var.getUpperBounds();
        m.d(upperBounds3, "getUpperBounds(...)");
        Object objZ = q.Z(upperBounds3);
        m.d(objZ, "first(...)");
        return (r0) objZ;
    }

    public static final boolean p(l1 l1Var) {
        m.e(l1Var, "typeParameter");
        return r(l1Var, null, null, 6, null);
    }

    public static final boolean q(l1 l1Var, u1 u1Var, Set set) {
        m.e(l1Var, "typeParameter");
        List<r0> upperBounds = l1Var.getUpperBounds();
        m.d(upperBounds, "getUpperBounds(...)");
        if (h0.a(upperBounds) && upperBounds.isEmpty()) {
            return false;
        }
        for (r0 r0Var : upperBounds) {
            m.b(r0Var);
            if (f(r0Var, l1Var.s().N0(), set) && (u1Var == null || m.a(r0Var.N0(), u1Var))) {
                return true;
            }
        }
        return false;
    }

    public static /* synthetic */ boolean r(l1 l1Var, u1 u1Var, Set set, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            u1Var = null;
        }
        if ((i10 & 4) != 0) {
            set = null;
        }
        return q(l1Var, u1Var, set);
    }

    public static final boolean s(r0 r0Var) {
        m.e(r0Var, "<this>");
        return ee.i.g0(r0Var);
    }

    public static final boolean t(r0 r0Var) {
        m.e(r0Var, "<this>");
        return ee.i.o0(r0Var);
    }

    public static final boolean u(r0 r0Var) {
        m.e(r0Var, "<this>");
        if (!(r0Var instanceof y)) {
            return false;
        }
        ((y) r0Var).Z0();
        return false;
    }

    public static final boolean v(r0 r0Var) {
        m.e(r0Var, "<this>");
        if (!(r0Var instanceof y)) {
            return false;
        }
        ((y) r0Var).Z0();
        return false;
    }

    public static final boolean w(r0 r0Var, r0 r0Var2) {
        m.e(r0Var, "<this>");
        m.e(r0Var2, "superType");
        return fg.e.f13057a.a(r0Var, r0Var2);
    }

    public static final boolean x(he.h hVar) {
        m.e(hVar, "<this>");
        return (hVar instanceof l1) && (((l1) hVar).b() instanceof k1);
    }

    public static final boolean y(r0 r0Var) {
        m.e(r0Var, "<this>");
        return i2.m(r0Var);
    }

    public static final boolean z(r0 r0Var) {
        m.e(r0Var, "type");
        return (r0Var instanceof gg.i) && ((gg.i) r0Var).X0().e();
    }
}
