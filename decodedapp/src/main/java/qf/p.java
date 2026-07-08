package qf;

import eg.c1;
import eg.r0;
import eg.t1;
import eg.u1;
import fg.b;
import fg.e;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import rd.c0;

/* JADX INFO: loaded from: classes3.dex */
public final class p implements fg.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f25163a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e.a f25164b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final fg.g f25165c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final fg.f f25166d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final qd.p f25167e;

    public static final class a extends t1 {

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final /* synthetic */ p f25168l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(boolean z10, boolean z11, boolean z12, p pVar, fg.f fVar, fg.g gVar) {
            super(z10, z11, z12, true, pVar, fVar, gVar);
            this.f25168l = pVar;
        }

        @Override // eg.t1
        public boolean f(ig.i iVar, ig.i iVar2) {
            rd.m.e(iVar, "subType");
            rd.m.e(iVar2, "superType");
            if (!(iVar instanceof r0)) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            if (iVar2 instanceof r0) {
                return ((Boolean) this.f25168l.f25167e.s(iVar, iVar2)).booleanValue();
            }
            throw new IllegalArgumentException("Failed requirement.");
        }
    }

    public p(Map map, e.a aVar, fg.g gVar, fg.f fVar, qd.p pVar) {
        rd.m.e(aVar, "equalityAxioms");
        rd.m.e(gVar, "kotlinTypeRefiner");
        rd.m.e(fVar, "kotlinTypePreparator");
        this.f25163a = map;
        this.f25164b = aVar;
        this.f25165c = gVar;
        this.f25166d = fVar;
        this.f25167e = pVar;
    }

    private final boolean M0(u1 u1Var, u1 u1Var2) {
        if (this.f25164b.a(u1Var, u1Var2)) {
            return true;
        }
        Map map = this.f25163a;
        if (map == null) {
            return false;
        }
        u1 u1Var3 = (u1) map.get(u1Var);
        u1 u1Var4 = (u1) this.f25163a.get(u1Var2);
        return (u1Var3 != null && rd.m.a(u1Var3, u1Var2)) || (u1Var4 != null && rd.m.a(u1Var4, u1Var));
    }

    @Override // ig.r
    public ig.p A(ig.i iVar) {
        return h1(iVar);
    }

    @Override // ig.o
    public t1 A0(boolean z10, boolean z11, boolean z12) {
        if (this.f25167e != null) {
            return new a(z10, z11, z12, this, this.f25166d, this.f25165c);
        }
        return fg.a.a(z10, z11, this, this.f25166d, this.f25165c);
    }

    @Override // ig.r
    public ig.d B(ig.j jVar) {
        return O0(jVar);
    }

    @Override // eg.g2
    public ee.l B0(ig.p pVar) {
        return b.a.r(this, pVar);
    }

    @Override // ig.r
    public ig.j C(ig.i iVar) {
        return c1(iVar);
    }

    @Override // ig.r
    public ig.c C0(ig.d dVar) {
        return b.a.m0(this, dVar);
    }

    @Override // ig.r
    public ig.i D(ig.d dVar) {
        return b.a.d0(this, dVar);
    }

    @Override // ig.r
    public Collection D0(ig.j jVar) {
        return b.a.i0(this, jVar);
    }

    @Override // ig.r
    public boolean E(ig.p pVar) {
        return b.a.L(this, pVar);
    }

    @Override // ig.r
    public boolean E0(ig.i iVar) {
        return S0(iVar);
    }

    @Override // ig.r
    public ig.m F(ig.c cVar) {
        return b.a.j0(this, cVar);
    }

    @Override // ig.r
    public boolean F0(ig.p pVar) {
        return b.a.H(this, pVar);
    }

    @Override // ig.r
    public boolean G(ig.i iVar) {
        return b.a.I(this, iVar);
    }

    @Override // ig.r
    public boolean H(ig.p pVar) {
        return b.a.E(this, pVar);
    }

    @Override // eg.g2
    public boolean H0(ig.p pVar) {
        return b.a.b0(this, pVar);
    }

    @Override // eg.g2
    public ig.i I(ig.i iVar) {
        return e1(iVar);
    }

    @Override // ig.r
    public boolean I0(ig.j jVar) {
        return W0(jVar);
    }

    @Override // ig.r
    public ig.i J(ig.i iVar, boolean z10) {
        return b.a.e0(this, iVar, z10);
    }

    @Override // ig.r
    public List J0(ig.q qVar) {
        return b.a.x(this, qVar);
    }

    @Override // ig.u
    public boolean K(ig.j jVar, ig.j jVar2) {
        return b.a.C(this, jVar, jVar2);
    }

    @Override // ig.r
    public boolean K0(ig.i iVar) {
        return b.a.U(this, iVar);
    }

    @Override // ig.r
    public ig.k L(ig.j jVar) {
        return f1(jVar);
    }

    @Override // ig.r
    public int M(ig.i iVar) {
        return b.a.b(this, iVar);
    }

    @Override // ig.r
    public ig.j N(ig.i iVar) {
        return i1(iVar);
    }

    @Override // ig.r
    /* JADX INFO: renamed from: N0, reason: merged with bridge method [inline-methods] */
    public c1 G0(ig.j jVar, ig.b bVar) {
        return b.a.j(this, jVar, bVar);
    }

    @Override // ig.r
    public boolean O(ig.q qVar, ig.p pVar) {
        return b.a.B(this, qVar, pVar);
    }

    public ig.d O0(ig.j jVar) {
        rd.m.e(jVar, "<this>");
        return d(L(jVar));
    }

    @Override // ig.r
    public ig.i P(ig.i iVar) {
        return d1(iVar);
    }

    public List P0(ig.j jVar, ig.p pVar) {
        rd.m.e(jVar, "<this>");
        rd.m.e(pVar, "constructor");
        return null;
    }

    @Override // ig.r
    public boolean Q(ig.p pVar) {
        return b.a.G(this, pVar);
    }

    public ig.m Q0(ig.l lVar, int i10) {
        rd.m.e(lVar, "<this>");
        if (lVar instanceof ig.k) {
            return m((ig.i) lVar, i10);
        }
        if (lVar instanceof ig.a) {
            E e10 = ((ig.a) lVar).get(i10);
            rd.m.d(e10, "get(...)");
            return (ig.m) e10;
        }
        throw new IllegalStateException(("unknown type argument list type: " + lVar + ", " + c0.b(lVar.getClass())).toString());
    }

    @Override // eg.g2
    public ee.l R(ig.p pVar) {
        return b.a.s(this, pVar);
    }

    public ig.m R0(ig.j jVar, int i10) {
        rd.m.e(jVar, "<this>");
        if (i10 < 0 || i10 >= M(jVar)) {
            return null;
        }
        return m(jVar, i10);
    }

    @Override // ig.r
    public boolean S(ig.p pVar) {
        return b.a.K(this, pVar);
    }

    public boolean S0(ig.i iVar) {
        rd.m.e(iVar, "<this>");
        return T(C(iVar)) != T(N(iVar));
    }

    @Override // ig.r
    public boolean T(ig.i iVar) {
        return b.a.N(this, iVar);
    }

    public boolean T0(ig.i iVar) {
        rd.m.e(iVar, "<this>");
        ig.j jVarE = e(iVar);
        return (jVarE != null ? B(jVarE) : null) != null;
    }

    @Override // ig.r
    public boolean U(ig.i iVar) {
        return b.a.Q(this, iVar);
    }

    public boolean U0(ig.j jVar) {
        rd.m.e(jVar, "<this>");
        return t(f(jVar));
    }

    @Override // ig.r
    public boolean V(ig.d dVar) {
        return b.a.T(this, dVar);
    }

    public boolean V0(ig.i iVar) {
        rd.m.e(iVar, "<this>");
        ig.j jVarE = e(iVar);
        return (jVarE != null ? n(jVarE) : null) != null;
    }

    @Override // ig.r
    public boolean W(ig.i iVar) {
        return b.a.a0(this, iVar);
    }

    public boolean W0(ig.j jVar) {
        rd.m.e(jVar, "<this>");
        return n(jVar) != null;
    }

    @Override // ig.r
    public ig.l X(ig.j jVar) {
        return b.a.c(this, jVar);
    }

    public boolean X0(ig.i iVar) {
        rd.m.e(iVar, "<this>");
        ig.g gVarJ0 = j0(iVar);
        if (gVarJ0 == null) {
            return false;
        }
        p(gVarJ0);
        return false;
    }

    @Override // ig.r
    public int Y(ig.l lVar) {
        return g1(lVar);
    }

    public boolean Y0(ig.i iVar) {
        rd.m.e(iVar, "<this>");
        return j0(iVar) != null;
    }

    @Override // ig.r
    public boolean Z(ig.k kVar) {
        return b.a.S(this, kVar);
    }

    public boolean Z0(ig.i iVar) {
        rd.m.e(iVar, "<this>");
        return !rd.m.a(f(C(iVar)), f(N(iVar)));
    }

    @Override // fg.b, ig.r
    public boolean a(ig.j jVar) {
        return b.a.V(this, jVar);
    }

    @Override // ig.r
    public ig.q a0(ig.p pVar, int i10) {
        return b.a.p(this, pVar, i10);
    }

    public boolean a1(ig.j jVar) {
        rd.m.e(jVar, "<this>");
        return S(f(jVar));
    }

    @Override // ig.r
    public boolean b0(ig.i iVar) {
        return Y0(iVar);
    }

    public boolean b1(ig.i iVar) {
        rd.m.e(iVar, "<this>");
        return q0(A(iVar)) && !U(iVar);
    }

    @Override // ig.r
    public boolean c0(ig.i iVar) {
        return V0(iVar);
    }

    public ig.j c1(ig.i iVar) {
        ig.j jVarC;
        rd.m.e(iVar, "<this>");
        ig.g gVarJ0 = j0(iVar);
        if (gVarJ0 != null && (jVarC = c(gVarJ0)) != null) {
            return jVarC;
        }
        ig.j jVarE = e(iVar);
        rd.m.b(jVarE);
        return jVarE;
    }

    @Override // fg.b, ig.r
    public ig.d d(ig.k kVar) {
        return b.a.d(this, kVar);
    }

    @Override // ig.r
    public boolean d0(ig.j jVar) {
        return a1(jVar);
    }

    public ig.i d1(ig.i iVar) {
        rd.m.e(iVar, "<this>");
        return J(iVar, false);
    }

    @Override // eg.g2
    public ig.i e0(ig.q qVar) {
        return b.a.t(this, qVar);
    }

    public ig.i e1(ig.i iVar) {
        ig.j jVarB;
        rd.m.e(iVar, "<this>");
        ig.j jVarE = e(iVar);
        return (jVarE == null || (jVarB = b(jVarE, true)) == null) ? iVar : jVarB;
    }

    @Override // fg.b, ig.r
    public ig.p f(ig.j jVar) {
        return b.a.n0(this, jVar);
    }

    @Override // ig.r
    public ig.i f0(ig.m mVar) {
        return b.a.u(this, mVar);
    }

    public ig.k f1(ig.j jVar) {
        ig.k kVarL;
        rd.m.e(jVar, "<this>");
        ig.e eVarN = n(jVar);
        return (eVarN == null || (kVarL = l(eVarN)) == null) ? (ig.k) jVar : kVarL;
    }

    @Override // ig.r
    public int g0(ig.p pVar) {
        return b.a.h0(this, pVar);
    }

    public int g1(ig.l lVar) {
        rd.m.e(lVar, "<this>");
        if (lVar instanceof ig.j) {
            return M((ig.i) lVar);
        }
        if (lVar instanceof ig.a) {
            return ((ig.a) lVar).size();
        }
        throw new IllegalStateException(("unknown type argument list type: " + lVar + ", " + c0.b(lVar.getClass())).toString());
    }

    @Override // fg.b, ig.r
    public boolean h(ig.m mVar) {
        return b.a.X(this, mVar);
    }

    @Override // ig.r
    public ig.i h0(Collection collection) {
        return b.a.D(this, collection);
    }

    public ig.p h1(ig.i iVar) {
        rd.m.e(iVar, "<this>");
        ig.j jVarE = e(iVar);
        if (jVarE == null) {
            jVarE = C(iVar);
        }
        return f(jVarE);
    }

    @Override // ig.r
    public boolean i(ig.i iVar) {
        return T0(iVar);
    }

    @Override // ig.r
    public boolean i0(ig.d dVar) {
        return b.a.R(this, dVar);
    }

    public ig.j i1(ig.i iVar) {
        ig.j jVarG;
        rd.m.e(iVar, "<this>");
        ig.g gVarJ0 = j0(iVar);
        if (gVarJ0 != null && (jVarG = g(gVarJ0)) != null) {
            return jVarG;
        }
        ig.j jVarE = e(iVar);
        rd.m.b(jVarE);
        return jVarE;
    }

    @Override // eg.g2
    public boolean j(ig.i iVar, mf.c cVar) {
        return b.a.A(this, iVar, cVar);
    }

    @Override // ig.r
    public ig.g j0(ig.i iVar) {
        return b.a.g(this, iVar);
    }

    @Override // ig.r
    public ig.v k(ig.q qVar) {
        return b.a.z(this, qVar);
    }

    @Override // ig.r
    public ig.i k0(ig.i iVar, boolean z10) {
        return b.a.p0(this, iVar, z10);
    }

    @Override // ig.r
    public ig.k l(ig.e eVar) {
        return b.a.g0(this, eVar);
    }

    @Override // ig.t
    public boolean l0() {
        return b.a.M(this);
    }

    @Override // ig.r
    public ig.m m(ig.i iVar, int i10) {
        return b.a.m(this, iVar, i10);
    }

    @Override // ig.r
    public ig.v m0(ig.m mVar) {
        return b.a.y(this, mVar);
    }

    @Override // ig.r
    public ig.e n(ig.j jVar) {
        return b.a.e(this, jVar);
    }

    @Override // ig.r
    public boolean n0(ig.i iVar) {
        return Z0(iVar);
    }

    @Override // ig.r
    public boolean o(ig.j jVar) {
        return b.a.Z(this, jVar);
    }

    @Override // ig.r
    public ig.m o0(ig.i iVar) {
        return b.a.i(this, iVar);
    }

    @Override // ig.r
    public ig.f p(ig.g gVar) {
        b.a.f(this, gVar);
        return null;
    }

    @Override // eg.g2
    public ig.i p0(ig.i iVar) {
        return b.a.w(this, iVar);
    }

    @Override // ig.r
    public boolean q(ig.p pVar, ig.p pVar2) {
        rd.m.e(pVar, "c1");
        rd.m.e(pVar2, "c2");
        if (!(pVar instanceof u1)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (pVar2 instanceof u1) {
            return b.a.a(this, pVar, pVar2) || M0((u1) pVar, (u1) pVar2);
        }
        throw new IllegalArgumentException("Failed requirement.");
    }

    @Override // ig.r
    public boolean q0(ig.p pVar) {
        return b.a.P(this, pVar);
    }

    @Override // ig.r
    public t1.c r(ig.j jVar) {
        return b.a.k0(this, jVar);
    }

    @Override // ig.r
    public boolean r0(ig.j jVar) {
        return U0(jVar);
    }

    @Override // ig.r
    public boolean s(ig.i iVar) {
        return b.a.O(this, iVar);
    }

    @Override // ig.r
    public ig.m s0(ig.l lVar, int i10) {
        return Q0(lVar, i10);
    }

    @Override // ig.r
    public boolean t(ig.p pVar) {
        return b.a.F(this, pVar);
    }

    @Override // ig.r
    public List t0(ig.i iVar) {
        return b.a.n(this, iVar);
    }

    @Override // ig.r
    public List u(ig.j jVar, ig.p pVar) {
        return P0(jVar, pVar);
    }

    @Override // ig.r
    public Collection u0(ig.p pVar) {
        return b.a.l0(this, pVar);
    }

    @Override // ig.r
    public boolean v(ig.i iVar) {
        return b1(iVar);
    }

    @Override // fg.b
    public ig.i v0(ig.j jVar, ig.j jVar2) {
        return b.a.l(this, jVar, jVar2);
    }

    @Override // ig.r
    public ig.m w(ig.j jVar, int i10) {
        return R0(jVar, i10);
    }

    @Override // ig.r
    public ig.q w0(ig.p pVar) {
        return b.a.v(this, pVar);
    }

    @Override // ig.r
    public boolean x(ig.i iVar) {
        return X0(iVar);
    }

    @Override // ig.r
    public ig.b x0(ig.d dVar) {
        return b.a.k(this, dVar);
    }

    @Override // ig.r
    public List y(ig.p pVar) {
        return b.a.q(this, pVar);
    }

    @Override // ig.r
    public boolean y0(ig.j jVar) {
        return b.a.Y(this, jVar);
    }

    @Override // eg.g2
    public boolean z(ig.p pVar) {
        return b.a.J(this, pVar);
    }

    @Override // eg.g2
    public mf.d z0(ig.p pVar) {
        return b.a.o(this, pVar);
    }

    @Override // ig.r
    public ig.k b(ig.j jVar, boolean z10) {
        return b.a.q0(this, jVar, z10);
    }

    @Override // ig.r
    public ig.k c(ig.g gVar) {
        return b.a.c0(this, gVar);
    }

    @Override // ig.r
    public ig.k e(ig.i iVar) {
        return b.a.h(this, iVar);
    }

    @Override // ig.r
    public ig.k g(ig.g gVar) {
        return b.a.o0(this, gVar);
    }
}
