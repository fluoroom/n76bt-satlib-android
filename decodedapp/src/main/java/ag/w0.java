package ag;

import eg.a2;
import eg.c1;
import eg.c2;
import eg.g1;
import eg.h1;
import eg.j1;
import eg.m2;
import eg.p1;
import eg.q1;
import eg.u1;
import eg.y;
import gf.r;
import he.k1;
import he.l1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p f598a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final w0 f599b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f600c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f601d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final qd.l f602e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final qd.l f603f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Map f604g;

    public w0(p pVar, w0 w0Var, List list, String str, String str2) {
        Map linkedHashMap;
        rd.m.e(pVar, "c");
        rd.m.e(list, "typeParameterProtos");
        rd.m.e(str, "debugName");
        rd.m.e(str2, "containerPresentableName");
        this.f598a = pVar;
        this.f599b = w0Var;
        this.f600c = str;
        this.f601d = str2;
        this.f602e = pVar.h().h(new r0(this));
        this.f603f = pVar.h().h(new s0(this));
        if (list.isEmpty()) {
            linkedHashMap = ed.k0.i();
        } else {
            linkedHashMap = new LinkedHashMap();
            Iterator it = list.iterator();
            int i10 = 0;
            while (it.hasNext()) {
                gf.t tVar = (gf.t) it.next();
                linkedHashMap.put(Integer.valueOf(tVar.Q()), new cg.r0(this.f598a, tVar, i10));
                i10++;
            }
        }
        this.f604g = linkedHashMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int A(gf.r rVar) {
        rd.m.e(rVar, "it");
        return rVar.b0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final he.h f(w0 w0Var, int i10) {
        return w0Var.g(i10);
    }

    private final he.h g(int i10) {
        mf.b bVarA = l0.a(this.f598a.g(), i10);
        return bVarA.i() ? this.f598a.c().b(bVarA) : he.y.c(this.f598a.c().q(), bVarA);
    }

    private final c1 h(int i10) {
        if (l0.a(this.f598a.g(), i10).i()) {
            return this.f598a.c().o().a();
        }
        return null;
    }

    private final he.h i(int i10) {
        mf.b bVarA = l0.a(this.f598a.g(), i10);
        if (bVarA.i()) {
            return null;
        }
        return he.y.f(this.f598a.c().q(), bVarA);
    }

    private final c1 j(eg.r0 r0Var, eg.r0 r0Var2) {
        ee.i iVarN = jg.d.n(r0Var);
        ie.h annotations = r0Var.getAnnotations();
        eg.r0 r0VarK = ee.h.k(r0Var);
        List listE = ee.h.e(r0Var);
        List listW = ed.q.W(ee.h.m(r0Var), 1);
        ArrayList arrayList = new ArrayList(ed.q.v(listW, 10));
        Iterator it = listW.iterator();
        while (it.hasNext()) {
            arrayList.add(((a2) it.next()).getType());
        }
        return ee.h.b(iVarN, annotations, r0VarK, listE, arrayList, null, r0Var2, true).R0(r0Var.O0());
    }

    private final c1 k(q1 q1Var, u1 u1Var, List list, boolean z10) {
        List list2;
        c1 c1VarL;
        int size;
        int size2 = u1Var.getParameters().size() - list.size();
        if (size2 != 0) {
            c1VarL = null;
            if (size2 == 1 && (size = list.size() - 1) >= 0) {
                u1 u1VarK = u1Var.o().Y(size).k();
                rd.m.d(u1VarK, "getTypeConstructor(...)");
                list2 = list;
                c1VarL = eg.u0.k(q1Var, u1VarK, list2, z10, null, 16, null);
            } else {
                list2 = list;
            }
        } else {
            list2 = list;
            c1VarL = l(q1Var, u1Var, list2, z10);
        }
        return c1VarL == null ? gg.l.f14501a.f(gg.k.X, list2, u1Var, new String[0]) : c1VarL;
    }

    private final c1 l(q1 q1Var, u1 u1Var, List list, boolean z10) {
        c1 c1VarK = eg.u0.k(q1Var, u1Var, list, z10, null, 16, null);
        if (ee.h.q(c1VarK)) {
            return t(c1VarK);
        }
        return null;
    }

    private final l1 n(int i10) {
        l1 l1Var = (l1) this.f604g.get(Integer.valueOf(i10));
        if (l1Var != null) {
            return l1Var;
        }
        w0 w0Var = this.f599b;
        if (w0Var != null) {
            return w0Var.n(i10);
        }
        return null;
    }

    private static final List p(gf.r rVar, w0 w0Var) {
        List listC0 = rVar.c0();
        rd.m.d(listC0, "getArgumentList(...)");
        gf.r rVarK = jf.g.k(rVar, w0Var.f598a.j());
        List listP = rVarK != null ? p(rVarK, w0Var) : null;
        if (listP == null) {
            listP = ed.q.k();
        }
        return ed.q.s0(listC0, listP);
    }

    public static /* synthetic */ c1 q(w0 w0Var, gf.r rVar, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        return w0Var.o(rVar, z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List r(w0 w0Var, gf.r rVar) {
        return w0Var.f598a.c().d().b(rVar, w0Var.f598a.g());
    }

    private final q1 s(List list, ie.h hVar, u1 u1Var, he.m mVar) {
        ArrayList arrayList = new ArrayList(ed.q.v(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((p1) it.next()).a(hVar, u1Var, mVar));
        }
        return q1.f12167b.j(ed.q.x(arrayList));
    }

    private final c1 t(eg.r0 r0Var) {
        eg.r0 type;
        a2 a2Var = (a2) ed.q.m0(ee.h.m(r0Var));
        if (a2Var == null || (type = a2Var.getType()) == null) {
            return null;
        }
        he.h hVarQ = type.N0().q();
        mf.c cVarO = hVarQ != null ? uf.e.o(hVarQ) : null;
        if (type.L0().size() != 1 || (!rd.m.a(cVarO, ee.o.f11857w) && !rd.m.a(cVarO, x0.f607a))) {
            return (c1) r0Var;
        }
        eg.r0 type2 = ((a2) ed.q.w0(type.L0())).getType();
        rd.m.d(type2, "getType(...)");
        he.m mVarE = this.f598a.e();
        he.a aVar = mVarE instanceof he.a ? (he.a) mVarE : null;
        return rd.m.a(aVar != null ? uf.e.k(aVar) : null, q0.f579a) ? j(r0Var, type2) : j(r0Var, type2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final he.h v(w0 w0Var, int i10) {
        return w0Var.i(i10);
    }

    private final a2 w(l1 l1Var, r.b bVar) {
        if (bVar.s() == r.b.c.STAR) {
            return l1Var == null ? new h1(this.f598a.c().q().o()) : new j1(l1Var);
        }
        o0 o0Var = o0.f557a;
        r.b.c cVarS = bVar.s();
        rd.m.d(cVarS, "getProjection(...)");
        m2 m2VarC = o0Var.c(cVarS);
        gf.r rVarQ = jf.g.q(bVar, this.f598a.j());
        return rVarQ == null ? new c2(gg.l.d(gg.k.H0, bVar.toString())) : new c2(m2VarC, u(rVarQ));
    }

    private final u1 x(gf.r rVar) {
        he.h hVarY;
        Object next;
        if (rVar.s0()) {
            hVarY = (he.h) this.f602e.l(Integer.valueOf(rVar.d0()));
            if (hVarY == null) {
                hVarY = y(this, rVar, rVar.d0());
            }
        } else if (rVar.B0()) {
            hVarY = n(rVar.o0());
            if (hVarY == null) {
                return gg.l.f14501a.e(gg.k.V, String.valueOf(rVar.o0()), this.f601d);
            }
        } else if (rVar.C0()) {
            String string = this.f598a.g().getString(rVar.p0());
            Iterator it = m().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (rd.m.a(((l1) next).getName().d(), string)) {
                    break;
                }
            }
            hVarY = (l1) next;
            if (hVarY == null) {
                return gg.l.f14501a.e(gg.k.W, string, this.f598a.e().toString());
            }
        } else {
            if (!rVar.A0()) {
                return gg.l.f14501a.e(gg.k.Z, new String[0]);
            }
            hVarY = (he.h) this.f603f.l(Integer.valueOf(rVar.n0()));
            if (hVarY == null) {
                hVarY = y(this, rVar, rVar.n0());
            }
        }
        u1 u1VarK = hVarY.k();
        rd.m.d(u1VarK, "getTypeConstructor(...)");
        return u1VarK;
    }

    private static final he.e y(w0 w0Var, gf.r rVar, int i10) {
        mf.b bVarA = l0.a(w0Var.f598a.g(), i10);
        List listP = qg.k.P(qg.k.H(qg.k.n(rVar, new u0(w0Var)), v0.f596a));
        int iV = qg.k.v(qg.k.n(bVarA, new rd.w() { // from class: ag.w0.a
            @Override // rd.w, yd.l
            public Object get(Object obj) {
                return ((mf.b) obj).e();
            }
        }));
        while (listP.size() < iV) {
            listP.add(0);
        }
        return w0Var.f598a.c().r().d(bVarA, listP);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gf.r z(w0 w0Var, gf.r rVar) {
        rd.m.e(rVar, "it");
        return jf.g.k(rVar, w0Var.f598a.j());
    }

    public final List m() {
        return ed.q.H0(this.f604g.values());
    }

    public final c1 o(gf.r rVar, boolean z10) {
        c1 c1VarC;
        c1 c1VarJ;
        rd.m.e(rVar, "proto");
        c1 c1VarH = rVar.s0() ? h(rVar.d0()) : rVar.A0() ? h(rVar.n0()) : null;
        if (c1VarH != null) {
            return c1VarH;
        }
        u1 u1VarX = x(rVar);
        if (gg.l.m(u1VarX.q())) {
            return gg.l.f14501a.c(gg.k.C0, u1VarX, u1VarX.toString());
        }
        cg.a aVar = new cg.a(this.f598a.h(), new t0(this, rVar));
        q1 q1VarS = s(this.f598a.c().v(), aVar, u1VarX, this.f598a.e());
        List listP = p(rVar, this);
        ArrayList arrayList = new ArrayList(ed.q.v(listP, 10));
        int i10 = 0;
        for (Object obj : listP) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                ed.q.u();
            }
            List parameters = u1VarX.getParameters();
            rd.m.d(parameters, "getParameters(...)");
            arrayList.add(w((l1) ed.q.c0(parameters, i10), (r.b) obj));
            i10 = i11;
        }
        List listH0 = ed.q.H0(arrayList);
        he.h hVarQ = u1VarX.q();
        if (z10 && (hVarQ instanceof k1)) {
            c1 c1VarC2 = eg.u0.c((k1) hVarQ, listH0);
            c1VarC = c1VarC2.R0(eg.v0.b(c1VarC2) || rVar.k0()).T0(s(this.f598a.c().v(), ie.h.f16054l.a(ed.q.q0(aVar, c1VarC2.getAnnotations())), u1VarX, this.f598a.e()));
        } else if (jf.b.f18660a.d(rVar.g0()).booleanValue()) {
            c1VarC = k(q1VarS, u1VarX, listH0, rVar.k0());
        } else {
            c1 c1VarK = eg.u0.k(q1VarS, u1VarX, listH0, rVar.k0(), null, 16, null);
            if (jf.b.f18661b.d(rVar.g0()).booleanValue()) {
                c1VarC = y.a.c(eg.y.f12223d, c1VarK, true, false, 4, null);
                if (c1VarC == null) {
                    throw new IllegalStateException(("null DefinitelyNotNullType for '" + c1VarK + '\'').toString());
                }
            } else {
                c1VarC = c1VarK;
            }
        }
        gf.r rVarA = jf.g.a(rVar, this.f598a.j());
        return (rVarA == null || (c1VarJ = g1.j(c1VarC, o(rVarA, false))) == null) ? c1VarC : c1VarJ;
    }

    public String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f600c);
        if (this.f599b == null) {
            str = "";
        } else {
            str = ". Child of " + this.f599b.f600c;
        }
        sb2.append(str);
        return sb2.toString();
    }

    public final eg.r0 u(gf.r rVar) {
        rd.m.e(rVar, "proto");
        if (!rVar.u0()) {
            return o(rVar, true);
        }
        String string = this.f598a.g().getString(rVar.h0());
        c1 c1VarQ = q(this, rVar, false, 2, null);
        gf.r rVarF = jf.g.f(rVar, this.f598a.j());
        rd.m.b(rVarF);
        return this.f598a.c().m().a(rVar, string, c1VarQ, q(this, rVarF, false, 2, null));
    }
}
