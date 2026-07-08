package eg;

import eg.n1;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import xf.k;

/* JADX INFO: loaded from: classes3.dex */
public final class l1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f12127c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final l1 f12128d = new l1(n1.a.f12151a, false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final n1 f12129a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f12130b;

    public static final class a {
        public /* synthetic */ a(rd.h hVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void b(int i10, he.k1 k1Var) {
            if (i10 <= 100) {
                return;
            }
            throw new AssertionError("Too deep recursion while expanding type alias " + k1Var.getName());
        }

        private a() {
        }
    }

    public l1(n1 n1Var, boolean z10) {
        rd.m.e(n1Var, "reportStrategy");
        this.f12129a = n1Var;
        this.f12130b = z10;
    }

    private final void a(ie.h hVar, ie.h hVar2) {
        HashSet hashSet = new HashSet();
        Iterator it = hVar.iterator();
        while (it.hasNext()) {
            hashSet.add(((ie.c) it.next()).d());
        }
        Iterator it2 = hVar2.iterator();
        while (it2.hasNext()) {
            ie.c cVar = (ie.c) it2.next();
            if (hashSet.contains(cVar.d())) {
                this.f12129a.a(cVar);
            }
        }
    }

    private final void b(r0 r0Var, r0 r0Var2) {
        f2 f2VarF = f2.f(r0Var2);
        rd.m.d(f2VarF, "create(...)");
        int i10 = 0;
        for (Object obj : r0Var2.L0()) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                ed.q.u();
            }
            a2 a2Var = (a2) obj;
            if (!a2Var.b()) {
                r0 type = a2Var.getType();
                rd.m.d(type, "getType(...)");
                if (!jg.d.g(type)) {
                    a2 a2Var2 = (a2) r0Var.L0().get(i10);
                    he.l1 l1Var = (he.l1) r0Var.N0().getParameters().get(i10);
                    if (this.f12130b) {
                        n1 n1Var = this.f12129a;
                        r0 type2 = a2Var2.getType();
                        rd.m.d(type2, "getType(...)");
                        r0 type3 = a2Var.getType();
                        rd.m.d(type3, "getType(...)");
                        rd.m.b(l1Var);
                        n1Var.d(f2VarF, type2, type3, l1Var);
                    }
                }
            }
            i10 = i11;
        }
    }

    private final c1 c(c1 c1Var, q1 q1Var) {
        return v0.a(c1Var) ? c1Var : e2.f(c1Var, null, g(c1Var, q1Var), 1, null);
    }

    private final c1 d(c1 c1Var, r0 r0Var) {
        c1 c1VarR = i2.r(c1Var, r0Var.O0());
        rd.m.d(c1VarR, "makeNullableIfNeeded(...)");
        return c1VarR;
    }

    private final c1 e(c1 c1Var, r0 r0Var) {
        return c(d(c1Var, r0Var), r0Var.M0());
    }

    private final c1 f(m1 m1Var, q1 q1Var, boolean z10) {
        u1 u1VarK = m1Var.b().k();
        rd.m.d(u1VarK, "getTypeConstructor(...)");
        return u0.m(q1Var, u1VarK, m1Var.a(), z10, k.b.f32079b);
    }

    private final q1 g(r0 r0Var, q1 q1Var) {
        return v0.a(r0Var) ? r0Var.M0() : q1Var.h(r0Var.M0());
    }

    private final a2 i(a2 a2Var, m1 m1Var, int i10) {
        l2 l2VarQ0 = a2Var.getType().Q0();
        if (!e0.a(l2VarQ0)) {
            c1 c1VarA = e2.a(l2VarQ0);
            if (!v0.a(c1VarA) && jg.d.E(c1VarA)) {
                u1 u1VarN0 = c1VarA.N0();
                he.h hVarQ = u1VarN0.q();
                u1VarN0.getParameters().size();
                c1VarA.L0().size();
                if (!(hVarQ instanceof he.l1)) {
                    if (!(hVarQ instanceof he.k1)) {
                        c1 c1VarL = l(c1VarA, m1Var, i10);
                        b(c1VarA, c1VarL);
                        return new c2(a2Var.a(), c1VarL);
                    }
                    he.k1 k1Var = (he.k1) hVarQ;
                    if (m1Var.d(k1Var)) {
                        this.f12129a.b(k1Var);
                        return new c2(m2.f12140e, gg.l.d(gg.k.B, k1Var.getName().toString()));
                    }
                    List listL0 = c1VarA.L0();
                    ArrayList arrayList = new ArrayList(ed.q.v(listL0, 10));
                    int i11 = 0;
                    for (Object obj : listL0) {
                        int i12 = i11 + 1;
                        if (i11 < 0) {
                            ed.q.u();
                        }
                        arrayList.add(k((a2) obj, m1Var, (he.l1) u1VarN0.getParameters().get(i11), i10 + 1));
                        i11 = i12;
                    }
                    c1 c1VarJ = j(m1.f12135e.a(m1Var, k1Var, arrayList), c1VarA.M0(), c1VarA.O0(), i10 + 1, false);
                    c1 c1VarL2 = l(c1VarA, m1Var, i10);
                    if (!e0.a(c1VarJ)) {
                        c1VarJ = g1.j(c1VarJ, c1VarL2);
                    }
                    return new c2(a2Var.a(), c1VarJ);
                }
            }
        }
        return a2Var;
    }

    private final c1 j(m1 m1Var, q1 q1Var, boolean z10, int i10, boolean z11) {
        a2 a2VarK = k(new c2(m2.f12140e, m1Var.b().h0()), m1Var, null, i10);
        r0 type = a2VarK.getType();
        rd.m.d(type, "getType(...)");
        c1 c1VarA = e2.a(type);
        if (v0.a(c1VarA)) {
            return c1VarA;
        }
        a2VarK.a();
        a(c1VarA.getAnnotations(), t.a(q1Var));
        c1 c1VarR = i2.r(c(c1VarA, q1Var), z10);
        rd.m.d(c1VarR, "let(...)");
        return z11 ? g1.j(c1VarR, f(m1Var, q1Var, z10)) : c1VarR;
    }

    private final a2 k(a2 a2Var, m1 m1Var, he.l1 l1Var, int i10) {
        m2 m2VarN;
        m2 m2Var;
        m2 m2Var2;
        f12127c.b(i10, m1Var.b());
        if (a2Var.b()) {
            rd.m.b(l1Var);
            a2 a2VarS = i2.s(l1Var);
            rd.m.d(a2VarS, "makeStarProjection(...)");
            return a2VarS;
        }
        r0 type = a2Var.getType();
        rd.m.d(type, "getType(...)");
        a2 a2VarC = m1Var.c(type.N0());
        if (a2VarC == null) {
            return i(a2Var, m1Var, i10);
        }
        if (a2VarC.b()) {
            rd.m.b(l1Var);
            a2 a2VarS2 = i2.s(l1Var);
            rd.m.d(a2VarS2, "makeStarProjection(...)");
            return a2VarS2;
        }
        l2 l2VarQ0 = a2VarC.getType().Q0();
        m2 m2VarA = a2VarC.a();
        rd.m.d(m2VarA, "getProjectionKind(...)");
        m2 m2VarA2 = a2Var.a();
        rd.m.d(m2VarA2, "getProjectionKind(...)");
        if (m2VarA2 != m2VarA && m2VarA2 != (m2Var2 = m2.f12140e)) {
            if (m2VarA == m2Var2) {
                m2VarA = m2VarA2;
            } else {
                this.f12129a.c(m1Var.b(), l1Var, l2VarQ0);
            }
        }
        if (l1Var == null || (m2VarN = l1Var.n()) == null) {
            m2VarN = m2.f12140e;
        }
        if (m2VarN != m2VarA && m2VarN != (m2Var = m2.f12140e)) {
            if (m2VarA == m2Var) {
                m2VarA = m2Var;
            } else {
                this.f12129a.c(m1Var.b(), l1Var, l2VarQ0);
            }
        }
        a(type.getAnnotations(), l2VarQ0.getAnnotations());
        return new c2(m2VarA, e(e2.a(l2VarQ0), type));
    }

    private final c1 l(c1 c1Var, m1 m1Var, int i10) {
        u1 u1VarN0 = c1Var.N0();
        List listL0 = c1Var.L0();
        ArrayList arrayList = new ArrayList(ed.q.v(listL0, 10));
        int i11 = 0;
        for (Object obj : listL0) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                ed.q.u();
            }
            a2 a2Var = (a2) obj;
            a2 a2VarK = k(a2Var, m1Var, (he.l1) u1VarN0.getParameters().get(i11), i10 + 1);
            if (!a2VarK.b()) {
                a2VarK = new c2(a2VarK.a(), i2.q(a2VarK.getType(), a2Var.getType().O0()));
            }
            arrayList.add(a2VarK);
            i11 = i12;
        }
        return e2.f(c1Var, arrayList, null, 2, null);
    }

    public final c1 h(m1 m1Var, q1 q1Var) {
        rd.m.e(m1Var, "typeAliasExpansion");
        rd.m.e(q1Var, "attributes");
        return j(m1Var, q1Var, false, 0, true);
    }
}
