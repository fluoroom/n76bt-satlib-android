package eg;

import eg.n1;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class u0 {

    /* JADX INFO: renamed from: a */
    public static final u0 f12205a = new u0();

    /* JADX INFO: renamed from: b */
    private static final qd.l f12206b = a.f12207a;

    static final class a implements qd.l {

        /* JADX INFO: renamed from: a */
        public static final a f12207a = new a();

        a() {
        }

        @Override // qd.l
        /* JADX INFO: renamed from: b */
        public final Void l(fg.g gVar) {
            rd.m.e(gVar, "<unused var>");
            return null;
        }
    }

    private static final class b {

        /* JADX INFO: renamed from: a */
        private final c1 f12208a;

        /* JADX INFO: renamed from: b */
        private final u1 f12209b;

        public b(c1 c1Var, u1 u1Var) {
            this.f12208a = c1Var;
            this.f12209b = u1Var;
        }

        public final c1 a() {
            return this.f12208a;
        }

        public final u1 b() {
            return this.f12209b;
        }
    }

    private u0() {
    }

    public static final c1 c(he.k1 k1Var, List list) {
        rd.m.e(k1Var, "<this>");
        rd.m.e(list, "arguments");
        return new l1(n1.a.f12151a, false).h(m1.f12135e.a(null, k1Var, list), q1.f12167b.k());
    }

    private final xf.k d(u1 u1Var, List list, fg.g gVar) {
        he.h hVarQ = u1Var.q();
        if (hVarQ instanceof he.l1) {
            return ((he.l1) hVarQ).s().p();
        }
        if (hVarQ instanceof he.e) {
            if (gVar == null) {
                gVar = uf.e.r(uf.e.s(hVarQ));
            }
            return list.isEmpty() ? ke.a0.b((he.e) hVarQ, gVar) : ke.a0.a((he.e) hVarQ, v1.f12211c.b(u1Var, list), gVar);
        }
        if (hVarQ instanceof he.k1) {
            return gg.l.a(gg.h.f14438e, true, ((he.k1) hVarQ).getName().toString());
        }
        if (u1Var instanceof q0) {
            return ((q0) u1Var).d();
        }
        throw new IllegalStateException("Unsupported classifier: " + hVarQ + " for constructor: " + u1Var);
    }

    public static final l2 e(c1 c1Var, c1 c1Var2) {
        rd.m.e(c1Var, "lowerBound");
        rd.m.e(c1Var2, "upperBound");
        return rd.m.a(c1Var, c1Var2) ? c1Var : new j0(c1Var, c1Var2);
    }

    public static final c1 f(q1 q1Var, sf.q qVar, boolean z10) {
        rd.m.e(q1Var, "attributes");
        rd.m.e(qVar, "constructor");
        return m(q1Var, qVar, ed.q.k(), z10, gg.l.a(gg.h.f14436c, true, "unknown integer literal type"));
    }

    private final b g(u1 u1Var, fg.g gVar, List list) {
        he.h hVarF;
        he.h hVarQ = u1Var.q();
        if (hVarQ == null || (hVarF = gVar.f(hVarQ)) == null) {
            return null;
        }
        if (hVarF instanceof he.k1) {
            return new b(c((he.k1) hVarF, list), null);
        }
        u1 u1VarP = hVarF.k().p(gVar);
        rd.m.d(u1VarP, "refine(...)");
        return new b(null, u1VarP);
    }

    public static final c1 h(q1 q1Var, he.e eVar, List list) {
        rd.m.e(q1Var, "attributes");
        rd.m.e(eVar, "descriptor");
        rd.m.e(list, "arguments");
        u1 u1VarK = eVar.k();
        rd.m.d(u1VarK, "getTypeConstructor(...)");
        return k(q1Var, u1VarK, list, false, null, 16, null);
    }

    public static final c1 i(q1 q1Var, u1 u1Var, List list, boolean z10) {
        rd.m.e(q1Var, "attributes");
        rd.m.e(u1Var, "constructor");
        rd.m.e(list, "arguments");
        return k(q1Var, u1Var, list, z10, null, 16, null);
    }

    public static final c1 j(q1 q1Var, u1 u1Var, List list, boolean z10, fg.g gVar) {
        rd.m.e(q1Var, "attributes");
        rd.m.e(u1Var, "constructor");
        rd.m.e(list, "arguments");
        if (!q1Var.isEmpty() || !list.isEmpty() || z10 || u1Var.q() == null) {
            return n(q1Var, u1Var, list, z10, f12205a.d(u1Var, list, gVar), new s0(u1Var, list, q1Var, z10));
        }
        he.h hVarQ = u1Var.q();
        rd.m.b(hVarQ);
        c1 c1VarS = hVarQ.s();
        rd.m.d(c1VarS, "getDefaultType(...)");
        return c1VarS;
    }

    public static /* synthetic */ c1 k(q1 q1Var, u1 u1Var, List list, boolean z10, fg.g gVar, int i10, Object obj) {
        if ((i10 & 16) != 0) {
            gVar = null;
        }
        return j(q1Var, u1Var, list, z10, gVar);
    }

    public static final c1 l(u1 u1Var, List list, q1 q1Var, boolean z10, fg.g gVar) {
        rd.m.e(gVar, "refiner");
        b bVarG = f12205a.g(u1Var, gVar, list);
        if (bVarG == null) {
            return null;
        }
        c1 c1VarA = bVarG.a();
        if (c1VarA != null) {
            return c1VarA;
        }
        u1 u1VarB = bVarG.b();
        rd.m.b(u1VarB);
        return j(q1Var, u1VarB, list, z10, gVar);
    }

    public static final c1 m(q1 q1Var, u1 u1Var, List list, boolean z10, xf.k kVar) {
        rd.m.e(q1Var, "attributes");
        rd.m.e(u1Var, "constructor");
        rd.m.e(list, "arguments");
        rd.m.e(kVar, "memberScope");
        d1 d1Var = new d1(u1Var, list, z10, kVar, new t0(u1Var, list, q1Var, z10, kVar));
        return q1Var.isEmpty() ? d1Var : new e1(d1Var, q1Var);
    }

    public static final c1 n(q1 q1Var, u1 u1Var, List list, boolean z10, xf.k kVar, qd.l lVar) {
        rd.m.e(q1Var, "attributes");
        rd.m.e(u1Var, "constructor");
        rd.m.e(list, "arguments");
        rd.m.e(kVar, "memberScope");
        rd.m.e(lVar, "refinedTypeFactory");
        d1 d1Var = new d1(u1Var, list, z10, kVar, lVar);
        return q1Var.isEmpty() ? d1Var : new e1(d1Var, q1Var);
    }

    public static final c1 o(u1 u1Var, List list, q1 q1Var, boolean z10, xf.k kVar, fg.g gVar) {
        rd.m.e(gVar, "kotlinTypeRefiner");
        b bVarG = f12205a.g(u1Var, gVar, list);
        if (bVarG == null) {
            return null;
        }
        c1 c1VarA = bVarG.a();
        if (c1VarA != null) {
            return c1VarA;
        }
        u1 u1VarB = bVarG.b();
        rd.m.b(u1VarB);
        return m(q1Var, u1VarB, list, z10, kVar);
    }
}
