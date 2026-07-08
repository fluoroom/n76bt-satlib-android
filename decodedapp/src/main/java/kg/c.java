package kg;

import dd.o;
import dd.q;
import ee.i;
import eg.a2;
import eg.c1;
import eg.c2;
import eg.e2;
import eg.f2;
import eg.i2;
import eg.k2;
import eg.l0;
import eg.l2;
import eg.m2;
import eg.r0;
import eg.u0;
import eg.u1;
import eg.v1;
import he.l1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import rd.m;
import rf.e;

/* JADX INFO: loaded from: classes3.dex */
public abstract class c {

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f19927a;

        static {
            int[] iArr = new int[m2.values().length];
            try {
                iArr[m2.f12140e.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[m2.f12141f.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[m2.f12142g.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f19927a = iArr;
        }
    }

    public static final class b extends v1 {
        b() {
        }

        @Override // eg.v1
        public a2 k(u1 u1Var) {
            m.e(u1Var, "key");
            rf.b bVar = u1Var instanceof rf.b ? (rf.b) u1Var : null;
            if (bVar == null) {
                return null;
            }
            return bVar.s().b() ? new c2(m2.f12142g, bVar.s().getType()) : bVar.s();
        }
    }

    public static final kg.a b(r0 r0Var) {
        Object objG;
        m.e(r0Var, "type");
        if (l0.b(r0Var)) {
            kg.a aVarB = b(l0.c(r0Var));
            kg.a aVarB2 = b(l0.d(r0Var));
            return new kg.a(k2.b(u0.e(l0.c((r0) aVarB.c()), l0.d((r0) aVarB2.c())), r0Var), k2.b(u0.e(l0.c((r0) aVarB.d()), l0.d((r0) aVarB2.d())), r0Var));
        }
        u1 u1VarN0 = r0Var.N0();
        if (e.f(r0Var)) {
            m.c(u1VarN0, "null cannot be cast to non-null type org.jetbrains.kotlin.resolve.calls.inference.CapturedTypeConstructor");
            a2 a2VarS = ((rf.b) u1VarN0).s();
            r0 type = a2VarS.getType();
            m.d(type, "getType(...)");
            r0 r0VarC = c(type, r0Var);
            int i10 = a.f19927a[a2VarS.a().ordinal()];
            if (i10 == 2) {
                return new kg.a(r0VarC, jg.d.n(r0Var).J());
            }
            if (i10 == 3) {
                c1 c1VarI = jg.d.n(r0Var).I();
                m.d(c1VarI, "getNothingType(...)");
                return new kg.a(c(c1VarI, r0Var), r0VarC);
            }
            throw new AssertionError("Only nontrivial projections should have been captured, not: " + a2VarS);
        }
        if (r0Var.L0().isEmpty() || r0Var.L0().size() != u1VarN0.getParameters().size()) {
            return new kg.a(r0Var, r0Var);
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        List listL0 = r0Var.L0();
        List parameters = u1VarN0.getParameters();
        m.d(parameters, "getParameters(...)");
        for (q qVar : ed.q.Q0(listL0, parameters)) {
            a2 a2Var = (a2) qVar.a();
            l1 l1Var = (l1) qVar.b();
            m.b(l1Var);
            d dVarI = i(a2Var, l1Var);
            if (a2Var.b()) {
                arrayList.add(dVarI);
                arrayList2.add(dVarI);
            } else {
                kg.a aVarF = f(dVarI);
                d dVar = (d) aVarF.a();
                d dVar2 = (d) aVarF.b();
                arrayList.add(dVar);
                arrayList2.add(dVar2);
            }
        }
        boolean z10 = false;
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (!((d) it.next()).d()) {
                    z10 = true;
                    break;
                }
            }
        }
        if (z10) {
            objG = jg.d.n(r0Var).I();
            m.d(objG, "getNothingType(...)");
        } else {
            objG = g(r0Var, arrayList);
        }
        return new kg.a(objG, g(r0Var, arrayList2));
    }

    private static final r0 c(r0 r0Var, r0 r0Var2) {
        r0 r0VarQ = i2.q(r0Var, r0Var2.O0());
        m.d(r0VarQ, "makeNullableIfNeeded(...)");
        return r0VarQ;
    }

    public static final a2 d(a2 a2Var, boolean z10) {
        if (a2Var == null) {
            return null;
        }
        if (!a2Var.b()) {
            r0 type = a2Var.getType();
            m.d(type, "getType(...)");
            if (i2.c(type, kg.b.f19926a)) {
                m2 m2VarA = a2Var.a();
                m.d(m2VarA, "getProjectionKind(...)");
                return m2VarA == m2.f12142g ? new c2(m2VarA, (r0) b(type).d()) : z10 ? new c2(m2VarA, (r0) b(type).c()) : h(a2Var);
            }
        }
        return a2Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Boolean e(l2 l2Var) {
        m.b(l2Var);
        return Boolean.valueOf(e.f(l2Var));
    }

    private static final kg.a f(d dVar) {
        kg.a aVarB = b(dVar.a());
        r0 r0Var = (r0) aVarB.a();
        r0 r0Var2 = (r0) aVarB.b();
        kg.a aVarB2 = b(dVar.b());
        return new kg.a(new d(dVar.c(), r0Var2, (r0) aVarB2.a()), new d(dVar.c(), r0Var, (r0) aVarB2.b()));
    }

    private static final r0 g(r0 r0Var, List list) {
        r0Var.L0().size();
        list.size();
        ArrayList arrayList = new ArrayList(ed.q.v(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(j((d) it.next()));
        }
        return e2.e(r0Var, arrayList, null, null, 6, null);
    }

    private static final a2 h(a2 a2Var) {
        f2 f2VarG = f2.g(new b());
        m.d(f2VarG, "create(...)");
        return f2VarG.t(a2Var);
    }

    private static final d i(a2 a2Var, l1 l1Var) {
        int i10 = a.f19927a[f2.c(l1Var.n(), a2Var).ordinal()];
        if (i10 == 1) {
            r0 type = a2Var.getType();
            m.d(type, "getType(...)");
            r0 type2 = a2Var.getType();
            m.d(type2, "getType(...)");
            return new d(l1Var, type, type2);
        }
        if (i10 == 2) {
            r0 type3 = a2Var.getType();
            m.d(type3, "getType(...)");
            c1 c1VarJ = uf.e.m(l1Var).J();
            m.d(c1VarJ, "getNullableAnyType(...)");
            return new d(l1Var, type3, c1VarJ);
        }
        if (i10 != 3) {
            throw new o();
        }
        c1 c1VarI = uf.e.m(l1Var).I();
        m.d(c1VarI, "getNothingType(...)");
        r0 type4 = a2Var.getType();
        m.d(type4, "getType(...)");
        return new d(l1Var, c1VarI, type4);
    }

    private static final a2 j(d dVar) {
        dVar.d();
        if (!m.a(dVar.a(), dVar.b())) {
            m2 m2VarN = dVar.c().n();
            m2 m2Var = m2.f12141f;
            if (m2VarN != m2Var) {
                return (!i.o0(dVar.a()) || dVar.c().n() == m2Var) ? i.q0(dVar.b()) ? new c2(k(dVar, m2Var), dVar.a()) : new c2(k(dVar, m2.f12142g), dVar.b()) : new c2(k(dVar, m2.f12142g), dVar.b());
            }
        }
        return new c2(dVar.a());
    }

    private static final m2 k(d dVar, m2 m2Var) {
        return m2Var == dVar.c().n() ? m2.f12140e : m2Var;
    }
}
