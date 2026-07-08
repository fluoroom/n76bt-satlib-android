package ef;

import cg.m0;
import cg.t0;
import ed.r0;
import ff.a;
import he.n0;
import java.util.Collection;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f12020b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Set f12021c = r0.c(a.EnumC0182a.f13027e);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Set f12022d = r0.g(a.EnumC0182a.f13028f, a.EnumC0182a.f13031r);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final jf.c f12023e = new jf.c(1, 1, 2);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final jf.c f12024f = new jf.c(1, 1, 11);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final jf.c f12025g = new jf.c(1, 1, 13);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ag.n f12026a;

    public static final class a {
        public /* synthetic */ a(rd.h hVar) {
            this();
        }

        public final jf.c a() {
            return n.f12025g;
        }

        private a() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Collection d() {
        return ed.q.k();
    }

    private final cg.r e(x xVar) {
        return f().g().b() ? cg.r.f4841a : xVar.a().j() ? cg.r.f4842b : cg.r.f4841a;
    }

    private final ag.y g(x xVar) {
        if (i() || xVar.a().d().h(h())) {
            return null;
        }
        return new ag.y(xVar.a().d(), jf.c.f18690i, h(), h().k(xVar.a().d().j()), xVar.getLocation());
    }

    private final jf.c h() {
        return f().g().g();
    }

    private final boolean i() {
        return f().g().d();
    }

    private final boolean j(x xVar) {
        return !f().g().c() && xVar.a().i() && rd.m.a(xVar.a().d(), f12024f);
    }

    private final boolean k(x xVar) {
        return (f().g().e() && (xVar.a().i() || rd.m.a(xVar.a().d(), f12023e))) || j(xVar);
    }

    private final String[] m(x xVar, Set set) {
        ff.a aVarA = xVar.a();
        String[] strArrA = aVarA.a();
        if (strArrA == null) {
            strArrA = aVarA.b();
        }
        if (strArrA == null || !set.contains(aVarA.c())) {
            return null;
        }
        return strArrA;
    }

    public final xf.k c(n0 n0Var, x xVar) {
        dd.q qVarM;
        rd.m.e(n0Var, "descriptor");
        rd.m.e(xVar, "kotlinClass");
        String[] strArrM = m(xVar, f12022d);
        if (strArrM == null) {
            return null;
        }
        String[] strArrG = xVar.a().g();
        try {
            if (strArrG == null) {
                return null;
            }
            try {
                qVarM = lf.h.m(strArrM, strArrG);
            } catch (of.k e10) {
                throw new IllegalStateException("Could not read data from " + xVar.getLocation(), e10);
            }
        } catch (Throwable th2) {
            if (i() || xVar.a().d().h(h())) {
                throw th2;
            }
            qVarM = null;
        }
        if (qVarM == null) {
            return null;
        }
        lf.e eVar = (lf.e) qVarM.a();
        gf.m mVar = (gf.m) qVarM.b();
        r rVar = new r(xVar, mVar, eVar, g(xVar), k(xVar), e(xVar));
        return new m0(n0Var, mVar, eVar, xVar.a().d(), rVar, f(), "scope for " + rVar + " in " + n0Var, m.f12019a);
    }

    public final ag.n f() {
        ag.n nVar = this.f12026a;
        if (nVar != null) {
            return nVar;
        }
        rd.m.o("components");
        return null;
    }

    public final ag.i l(x xVar) {
        String[] strArrG;
        dd.q qVarI;
        rd.m.e(xVar, "kotlinClass");
        String[] strArrM = m(xVar, f12021c);
        if (strArrM == null || (strArrG = xVar.a().g()) == null) {
            return null;
        }
        try {
            try {
                qVarI = lf.h.i(strArrM, strArrG);
            } catch (of.k e10) {
                throw new IllegalStateException("Could not read data from " + xVar.getLocation(), e10);
            }
        } catch (Throwable th2) {
            if (i() || xVar.a().d().h(h())) {
                throw th2;
            }
            qVarI = null;
        }
        if (qVarI == null) {
            return null;
        }
        return new ag.i((lf.e) qVarI.a(), (gf.c) qVarI.b(), xVar.a().d(), new z(xVar, g(xVar), new t0(k(xVar), null, 2, null), e(xVar)));
    }

    public final he.e n(x xVar) {
        rd.m.e(xVar, "kotlinClass");
        ag.i iVarL = l(xVar);
        if (iVarL == null) {
            return null;
        }
        return f().f().e(xVar.h(), iVarL);
    }

    public final void o(ag.n nVar) {
        rd.m.e(nVar, "<set-?>");
        this.f12026a = nVar;
    }

    public final void p(k kVar) {
        rd.m.e(kVar, "components");
        o(kVar.a());
    }
}
