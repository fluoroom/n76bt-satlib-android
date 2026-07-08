package af;

import cf.a0;
import cf.c0;
import cf.v;
import cf.x;
import cf.y;
import ed.q;
import eg.a2;
import eg.c1;
import eg.c2;
import eg.h2;
import eg.i2;
import eg.m2;
import eg.q1;
import eg.r0;
import eg.r1;
import eg.u0;
import eg.u1;
import eg.x0;
import eg.z1;
import gg.l;
import he.l1;
import ie.o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import rd.m;
import ve.v0;
import ye.p;

/* JADX INFO: loaded from: classes3.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ye.k f444a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p f445b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final g f446c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final z1 f447d;

    public e(ye.k kVar, p pVar) {
        m.e(kVar, "c");
        m.e(pVar, "typeParameterResolver");
        this.f444a = kVar;
        this.f445b = pVar;
        g gVar = new g();
        this.f446c = gVar;
        this.f447d = new z1(gVar, null, 2, 0 == true ? 1 : 0);
    }

    private final boolean b(cf.j jVar, he.e eVar) {
        m2 m2VarN;
        if (!a0.a((x) q.m0(jVar.E()))) {
            return false;
        }
        List parameters = ge.d.f13816a.b(eVar).k().getParameters();
        m.d(parameters, "getParameters(...)");
        l1 l1Var = (l1) q.m0(parameters);
        return (l1Var == null || (m2VarN = l1Var.n()) == null || m2VarN == m2.f12142g) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.util.List c(cf.j r10, af.a r11, eg.u1 r12) {
        /*
            Method dump skipped, instruction units count: 201
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: af.e.c(cf.j, af.a, eg.u1):java.util.List");
    }

    private final List d(cf.j jVar, List list, u1 u1Var, a aVar) {
        cf.j jVar2;
        u1 u1Var2;
        a aVar2;
        a2 a2VarA;
        ArrayList arrayList = new ArrayList(q.v(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            l1 l1Var = (l1) it.next();
            if (jg.d.q(l1Var, null, aVar.c())) {
                a2VarA = i2.t(l1Var, aVar);
                jVar2 = jVar;
                u1Var2 = u1Var;
                aVar2 = aVar;
            } else {
                jVar2 = jVar;
                u1Var2 = u1Var;
                aVar2 = aVar;
                a2VarA = this.f446c.a(l1Var, aVar2.j(jVar2.x()), this.f447d, new x0(this.f444a.e(), new d(this, l1Var, aVar2, u1Var2, jVar2)));
            }
            arrayList.add(a2VarA);
            aVar = aVar2;
            u1Var = u1Var2;
            jVar = jVar2;
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r0 e(e eVar, l1 l1Var, a aVar, u1 u1Var, cf.j jVar) {
        z1 z1Var = eVar.f447d;
        he.h hVarQ = u1Var.q();
        return z1Var.e(l1Var, aVar.k(hVarQ != null ? hVarQ.s() : null).j(jVar.x()));
    }

    private final c1 f(cf.j jVar, a aVar, c1 c1Var) {
        cf.j jVar2;
        q1 q1VarB;
        if (c1Var == null || (q1VarB = c1Var.M0()) == null) {
            jVar2 = jVar;
            q1VarB = r1.b(new ye.g(this.f444a, jVar2, false, 4, null));
        } else {
            jVar2 = jVar;
        }
        q1 q1Var = q1VarB;
        u1 u1VarG = g(jVar2, aVar);
        if (u1VarG == null) {
            return null;
        }
        boolean zJ = j(aVar);
        return (m.a(c1Var != null ? c1Var.N0() : null, u1VarG) && !jVar2.x() && zJ) ? c1Var.R0(true) : u0.k(q1Var, u1VarG, c(jVar2, aVar, u1VarG), zJ, null, 16, null);
    }

    private final u1 g(cf.j jVar, a aVar) {
        u1 u1VarK;
        cf.i iVarF = jVar.f();
        if (iVarF == null) {
            return h(jVar);
        }
        if (!(iVarF instanceof cf.g)) {
            if (iVarF instanceof y) {
                l1 l1VarA = this.f445b.a((y) iVarF);
                if (l1VarA != null) {
                    return l1VarA.k();
                }
                return null;
            }
            throw new IllegalStateException("Unknown classifier kind: " + iVarF);
        }
        cf.g gVar = (cf.g) iVarF;
        mf.c cVarD = gVar.d();
        if (cVarD != null) {
            he.e eVarK = k(jVar, aVar, cVarD);
            if (eVarK == null) {
                eVarK = this.f444a.a().n().a(gVar);
            }
            return (eVarK == null || (u1VarK = eVarK.k()) == null) ? h(jVar) : u1VarK;
        }
        throw new AssertionError("Class type should have a FQ name: " + iVarF);
    }

    private final u1 h(cf.j jVar) {
        u1 u1VarK = this.f444a.a().b().f().r().d(mf.b.f21989d.c(new mf.c(jVar.y())), q.e(0)).k();
        m.d(u1VarK, "getTypeConstructor(...)");
        return u1VarK;
    }

    private final boolean i(m2 m2Var, l1 l1Var) {
        return (l1Var.n() == m2.f12140e || m2Var == l1Var.n()) ? false : true;
    }

    private final boolean j(a aVar) {
        return (aVar.g() == c.f436c || aVar.h() || aVar.b() == h2.f12103a) ? false : true;
    }

    private final he.e k(cf.j jVar, a aVar, mf.c cVar) {
        if (aVar.h() && m.a(cVar, f.f448a)) {
            return this.f444a.a().p().d();
        }
        ge.d dVar = ge.d.f13816a;
        he.e eVarF = ge.d.f(dVar, cVar, this.f444a.d().o(), null, 4, null);
        if (eVarF == null) {
            return null;
        }
        return (dVar.d(eVarF) && (aVar.g() == c.f436c || aVar.b() == h2.f12103a || b(jVar, eVarF))) ? dVar.b(eVarF) : eVarF;
    }

    public static /* synthetic */ r0 m(e eVar, cf.f fVar, a aVar, boolean z10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        return eVar.l(fVar, aVar, z10);
    }

    private final r0 n(cf.j jVar, a aVar) {
        boolean z10 = (aVar.h() || aVar.b() == h2.f12103a) ? false : true;
        boolean zX = jVar.x();
        if (!zX && !z10) {
            c1 c1VarF = f(jVar, aVar, null);
            return c1VarF != null ? c1VarF : o(jVar);
        }
        c1 c1VarF2 = f(jVar, aVar.l(c.f436c), null);
        if (c1VarF2 == null) {
            return o(jVar);
        }
        c1 c1VarF3 = f(jVar, aVar.l(c.f435b), c1VarF2);
        return c1VarF3 == null ? o(jVar) : zX ? new k(c1VarF2, c1VarF3) : u0.e(c1VarF2, c1VarF3);
    }

    private static final gg.i o(cf.j jVar) {
        return l.d(gg.k.f14466f, jVar.p());
    }

    private final a2 q(x xVar, a aVar, l1 l1Var) {
        if (!(xVar instanceof c0)) {
            return new c2(m2.f12140e, p(xVar, aVar));
        }
        c0 c0Var = (c0) xVar;
        x xVarC = c0Var.C();
        m2 m2Var = c0Var.J() ? m2.f12142g : m2.f12141f;
        if (xVarC == null || i(m2Var, l1Var)) {
            a2 a2VarT = i2.t(l1Var, aVar);
            m.d(a2VarT, "makeStarProjection(...)");
            return a2VarT;
        }
        ie.c cVarA = v0.a(this.f444a, c0Var);
        r0 r0VarP = p(xVarC, b.b(h2.f12104b, false, false, null, 7, null));
        if (cVarA != null) {
            r0VarP = jg.d.C(r0VarP, ie.h.f16054l.a(q.r0(r0VarP.getAnnotations(), cVarA)));
        }
        return jg.d.k(r0VarP, m2Var, l1Var);
    }

    public final r0 l(cf.f fVar, a aVar, boolean z10) {
        m.e(fVar, "arrayType");
        m.e(aVar, "attr");
        x xVarN = fVar.n();
        v vVar = xVarN instanceof v ? (v) xVarN : null;
        ee.l type = vVar != null ? vVar.getType() : null;
        ye.g gVar = new ye.g(this.f444a, fVar, true);
        if (type != null) {
            c1 c1VarP = this.f444a.d().o().P(type);
            m.b(c1VarP);
            r0 r0VarC = jg.d.C(c1VarP, new o(c1VarP.getAnnotations(), gVar));
            m.c(r0VarC, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
            c1 c1Var = (c1) r0VarC;
            return aVar.h() ? c1Var : u0.e(c1Var, c1Var.R0(true));
        }
        r0 r0VarP = p(xVarN, b.b(h2.f12104b, aVar.h(), false, null, 6, null));
        if (aVar.h()) {
            c1 c1VarN = this.f444a.d().o().n(z10 ? m2.f12142g : m2.f12140e, r0VarP, gVar);
            m.d(c1VarN, "getArrayType(...)");
            return c1VarN;
        }
        c1 c1VarN2 = this.f444a.d().o().n(m2.f12140e, r0VarP, gVar);
        m.d(c1VarN2, "getArrayType(...)");
        return u0.e(c1VarN2, this.f444a.d().o().n(m2.f12142g, r0VarP, gVar).R0(true));
    }

    public final r0 p(x xVar, a aVar) {
        r0 r0VarP;
        m.e(aVar, "attr");
        if (xVar instanceof v) {
            ee.l type = ((v) xVar).getType();
            c1 c1VarS = type != null ? this.f444a.d().o().S(type) : this.f444a.d().o().a0();
            m.b(c1VarS);
            return c1VarS;
        }
        if (xVar instanceof cf.j) {
            return n((cf.j) xVar, aVar);
        }
        if (xVar instanceof cf.f) {
            return m(this, (cf.f) xVar, aVar, false, 4, null);
        }
        if (xVar instanceof c0) {
            x xVarC = ((c0) xVar).C();
            if (xVarC != null && (r0VarP = p(xVarC, aVar)) != null) {
                return r0VarP;
            }
            c1 c1VarZ = this.f444a.d().o().z();
            m.d(c1VarZ, "getDefaultBound(...)");
            return c1VarZ;
        }
        if (xVar == null) {
            c1 c1VarZ2 = this.f444a.d().o().z();
            m.d(c1VarZ2, "getDefaultBound(...)");
            return c1VarZ2;
        }
        throw new UnsupportedOperationException("Unsupported type: " + xVar);
    }
}
