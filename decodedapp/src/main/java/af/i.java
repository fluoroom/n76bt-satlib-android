package af;

import dd.q;
import dd.w;
import eg.a2;
import eg.c1;
import eg.c2;
import eg.d2;
import eg.f0;
import eg.h2;
import eg.l0;
import eg.m2;
import eg.q1;
import eg.r0;
import eg.u0;
import eg.u1;
import eg.v0;
import eg.z1;
import gg.l;
import he.l1;
import java.util.ArrayList;
import java.util.List;
import rd.m;

/* JADX INFO: loaded from: classes3.dex */
public final class i extends d2 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f454e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final af.a f455f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final af.a f456g;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final g f457c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final z1 f458d;

    public static final class a {
        public /* synthetic */ a(rd.h hVar) {
            this();
        }

        private a() {
        }
    }

    static {
        h2 h2Var = h2.f12104b;
        f455f = b.b(h2Var, false, true, null, 5, null).l(c.f436c);
        f456g = b.b(h2Var, false, true, null, 5, null).l(c.f435b);
    }

    public i(z1 z1Var) {
        g gVar = new g();
        this.f457c = gVar;
        if (z1Var == null) {
            z1Var = new z1(gVar, null, 2, 0 == true ? 1 : 0);
        }
        this.f458d = z1Var;
    }

    private final q j(c1 c1Var, he.e eVar, af.a aVar) {
        if (c1Var.N0().getParameters().isEmpty()) {
            return w.a(c1Var, Boolean.FALSE);
        }
        if (ee.i.d0(c1Var)) {
            a2 a2Var = (a2) c1Var.L0().get(0);
            m2 m2VarA = a2Var.a();
            r0 type = a2Var.getType();
            m.d(type, "getType(...)");
            return w.a(u0.k(c1Var.M0(), c1Var.N0(), ed.q.e(new c2(m2VarA, l(type, aVar))), c1Var.O0(), null, 16, null), Boolean.FALSE);
        }
        if (v0.a(c1Var)) {
            return w.a(l.d(gg.k.S, c1Var.N0().toString()), Boolean.FALSE);
        }
        xf.k kVarO = eVar.O(this);
        m.d(kVarO, "getMemberScope(...)");
        q1 q1VarM0 = c1Var.M0();
        u1 u1VarK = eVar.k();
        m.d(u1VarK, "getTypeConstructor(...)");
        List<l1> parameters = eVar.k().getParameters();
        m.d(parameters, "getParameters(...)");
        ArrayList arrayList = new ArrayList(ed.q.v(parameters, 10));
        for (l1 l1Var : parameters) {
            g gVar = this.f457c;
            m.b(l1Var);
            arrayList.add(f0.b(gVar, l1Var, aVar, this.f458d, null, 8, null));
        }
        return w.a(u0.n(q1VarM0, u1VarK, arrayList, c1Var.O0(), kVarO, new h(eVar, this, c1Var, aVar)), Boolean.TRUE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final c1 k(he.e eVar, i iVar, c1 c1Var, af.a aVar, fg.g gVar) {
        he.e eVarB;
        m.e(gVar, "kotlinTypeRefiner");
        mf.b bVarN = uf.e.n(eVar);
        if (bVarN == null || (eVarB = gVar.b(bVarN)) == null || m.a(eVarB, eVar)) {
            return null;
        }
        return (c1) iVar.j(c1Var, eVarB, aVar).c();
    }

    private final r0 l(r0 r0Var, af.a aVar) {
        he.h hVarQ = r0Var.N0().q();
        if (hVarQ instanceof l1) {
            return l(this.f458d.e((l1) hVarQ, aVar.j(true)), aVar);
        }
        if (!(hVarQ instanceof he.e)) {
            throw new IllegalStateException(("Unexpected declaration kind: " + hVarQ).toString());
        }
        he.h hVarQ2 = l0.d(r0Var).N0().q();
        if (hVarQ2 instanceof he.e) {
            q qVarJ = j(l0.c(r0Var), (he.e) hVarQ, f455f);
            c1 c1Var = (c1) qVarJ.a();
            boolean zBooleanValue = ((Boolean) qVarJ.b()).booleanValue();
            q qVarJ2 = j(l0.d(r0Var), (he.e) hVarQ2, f456g);
            c1 c1Var2 = (c1) qVarJ2.a();
            return (zBooleanValue || ((Boolean) qVarJ2.b()).booleanValue()) ? new k(c1Var, c1Var2) : u0.e(c1Var, c1Var2);
        }
        throw new IllegalStateException(("For some reason declaration for upper bound is not a class but \"" + hVarQ2 + "\" while for lower it's \"" + hVarQ + '\"').toString());
    }

    static /* synthetic */ r0 m(i iVar, r0 r0Var, af.a aVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            aVar = new af.a(h2.f12104b, null, false, false, null, null, 62, null);
        }
        return iVar.l(r0Var, aVar);
    }

    @Override // eg.d2
    public boolean f() {
        return false;
    }

    @Override // eg.d2
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public c2 e(r0 r0Var) {
        m.e(r0Var, "key");
        return new c2(m(this, r0Var, null, 2, null));
    }

    public /* synthetic */ i(z1 z1Var, int i10, rd.h hVar) {
        this((i10 & 1) != 0 ? null : z1Var);
    }
}
