package fg;

import eg.c1;
import eg.t1;
import fg.b;
import java.util.Collection;
import java.util.List;
import rd.c0;

/* JADX INFO: loaded from: classes3.dex */
public final class s implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final s f13084a = new s();

    private s() {
    }

    @Override // ig.r
    public ig.p A(ig.i iVar) {
        return f1(iVar);
    }

    @Override // ig.o
    public t1 A0(boolean z10, boolean z11, boolean z12) {
        return b.a.f0(this, z10, z11, z12);
    }

    @Override // ig.r
    public ig.d B(ig.j jVar) {
        return M0(jVar);
    }

    @Override // eg.g2
    public ee.l B0(ig.p pVar) {
        return b.a.r(this, pVar);
    }

    @Override // ig.r
    public ig.j C(ig.i iVar) {
        return a1(iVar);
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
        return Q0(iVar);
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
        return c1(iVar);
    }

    @Override // ig.r
    public boolean I0(ig.j jVar) {
        return U0(jVar);
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
        return d1(jVar);
    }

    @Override // ig.r
    /* JADX INFO: renamed from: L0, reason: merged with bridge method [inline-methods] */
    public c1 G0(ig.j jVar, ig.b bVar) {
        return b.a.j(this, jVar, bVar);
    }

    @Override // ig.r
    public int M(ig.i iVar) {
        return b.a.b(this, iVar);
    }

    public ig.d M0(ig.j jVar) {
        rd.m.e(jVar, "<this>");
        return d(L(jVar));
    }

    @Override // ig.r
    public ig.j N(ig.i iVar) {
        return g1(iVar);
    }

    public List N0(ig.j jVar, ig.p pVar) {
        rd.m.e(jVar, "<this>");
        rd.m.e(pVar, "constructor");
        return null;
    }

    @Override // ig.r
    public boolean O(ig.q qVar, ig.p pVar) {
        return b.a.B(this, qVar, pVar);
    }

    public ig.m O0(ig.l lVar, int i10) {
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

    @Override // ig.r
    public ig.i P(ig.i iVar) {
        return b1(iVar);
    }

    public ig.m P0(ig.j jVar, int i10) {
        rd.m.e(jVar, "<this>");
        if (i10 < 0 || i10 >= M(jVar)) {
            return null;
        }
        return m(jVar, i10);
    }

    @Override // ig.r
    public boolean Q(ig.p pVar) {
        return b.a.G(this, pVar);
    }

    public boolean Q0(ig.i iVar) {
        rd.m.e(iVar, "<this>");
        return T(C(iVar)) != T(N(iVar));
    }

    @Override // eg.g2
    public ee.l R(ig.p pVar) {
        return b.a.s(this, pVar);
    }

    public boolean R0(ig.i iVar) {
        rd.m.e(iVar, "<this>");
        ig.j jVarE = e(iVar);
        return (jVarE != null ? B(jVarE) : null) != null;
    }

    @Override // ig.r
    public boolean S(ig.p pVar) {
        return b.a.K(this, pVar);
    }

    public boolean S0(ig.j jVar) {
        rd.m.e(jVar, "<this>");
        return t(f(jVar));
    }

    @Override // ig.r
    public boolean T(ig.i iVar) {
        return b.a.N(this, iVar);
    }

    public boolean T0(ig.i iVar) {
        rd.m.e(iVar, "<this>");
        ig.j jVarE = e(iVar);
        return (jVarE != null ? n(jVarE) : null) != null;
    }

    @Override // ig.r
    public boolean U(ig.i iVar) {
        return b.a.Q(this, iVar);
    }

    public boolean U0(ig.j jVar) {
        rd.m.e(jVar, "<this>");
        return n(jVar) != null;
    }

    @Override // ig.r
    public boolean V(ig.d dVar) {
        return b.a.T(this, dVar);
    }

    public boolean V0(ig.i iVar) {
        rd.m.e(iVar, "<this>");
        ig.g gVarJ0 = j0(iVar);
        if (gVarJ0 == null) {
            return false;
        }
        p(gVarJ0);
        return false;
    }

    @Override // ig.r
    public boolean W(ig.i iVar) {
        return b.a.a0(this, iVar);
    }

    public boolean W0(ig.i iVar) {
        rd.m.e(iVar, "<this>");
        return j0(iVar) != null;
    }

    @Override // ig.r
    public ig.l X(ig.j jVar) {
        return b.a.c(this, jVar);
    }

    public boolean X0(ig.i iVar) {
        rd.m.e(iVar, "<this>");
        return !rd.m.a(f(C(iVar)), f(N(iVar)));
    }

    @Override // ig.r
    public int Y(ig.l lVar) {
        return e1(lVar);
    }

    public boolean Y0(ig.j jVar) {
        rd.m.e(jVar, "<this>");
        return S(f(jVar));
    }

    @Override // ig.r
    public boolean Z(ig.k kVar) {
        return b.a.S(this, kVar);
    }

    public boolean Z0(ig.i iVar) {
        rd.m.e(iVar, "<this>");
        return q0(A(iVar)) && !U(iVar);
    }

    @Override // fg.b, ig.r
    public boolean a(ig.j jVar) {
        return b.a.V(this, jVar);
    }

    @Override // ig.r
    public ig.q a0(ig.p pVar, int i10) {
        return b.a.p(this, pVar, i10);
    }

    public ig.j a1(ig.i iVar) {
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

    @Override // ig.r
    public boolean b0(ig.i iVar) {
        return W0(iVar);
    }

    public ig.i b1(ig.i iVar) {
        rd.m.e(iVar, "<this>");
        return J(iVar, false);
    }

    @Override // ig.r
    public boolean c0(ig.i iVar) {
        return T0(iVar);
    }

    public ig.i c1(ig.i iVar) {
        ig.j jVarB;
        rd.m.e(iVar, "<this>");
        ig.j jVarE = e(iVar);
        return (jVarE == null || (jVarB = b(jVarE, true)) == null) ? iVar : jVarB;
    }

    @Override // fg.b, ig.r
    public ig.d d(ig.k kVar) {
        return b.a.d(this, kVar);
    }

    @Override // ig.r
    public boolean d0(ig.j jVar) {
        return Y0(jVar);
    }

    public ig.k d1(ig.j jVar) {
        ig.k kVarL;
        rd.m.e(jVar, "<this>");
        ig.e eVarN = n(jVar);
        return (eVarN == null || (kVarL = l(eVarN)) == null) ? (ig.k) jVar : kVarL;
    }

    @Override // eg.g2
    public ig.i e0(ig.q qVar) {
        return b.a.t(this, qVar);
    }

    public int e1(ig.l lVar) {
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
    public ig.p f(ig.j jVar) {
        return b.a.n0(this, jVar);
    }

    @Override // ig.r
    public ig.i f0(ig.m mVar) {
        return b.a.u(this, mVar);
    }

    public ig.p f1(ig.i iVar) {
        rd.m.e(iVar, "<this>");
        ig.j jVarE = e(iVar);
        if (jVarE == null) {
            jVarE = C(iVar);
        }
        return f(jVarE);
    }

    @Override // ig.r
    public int g0(ig.p pVar) {
        return b.a.h0(this, pVar);
    }

    public ig.j g1(ig.i iVar) {
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

    @Override // fg.b, ig.r
    public boolean h(ig.m mVar) {
        return b.a.X(this, mVar);
    }

    @Override // ig.r
    public ig.i h0(Collection collection) {
        return b.a.D(this, collection);
    }

    @Override // ig.r
    public boolean i(ig.i iVar) {
        return R0(iVar);
    }

    @Override // ig.r
    public boolean i0(ig.d dVar) {
        return b.a.R(this, dVar);
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
        return X0(iVar);
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
        return b.a.a(this, pVar, pVar2);
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
        return S0(jVar);
    }

    @Override // ig.r
    public boolean s(ig.i iVar) {
        return b.a.O(this, iVar);
    }

    @Override // ig.r
    public ig.m s0(ig.l lVar, int i10) {
        return O0(lVar, i10);
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
        return N0(jVar, pVar);
    }

    @Override // ig.r
    public Collection u0(ig.p pVar) {
        return b.a.l0(this, pVar);
    }

    @Override // ig.r
    public boolean v(ig.i iVar) {
        return Z0(iVar);
    }

    @Override // fg.b
    public ig.i v0(ig.j jVar, ig.j jVar2) {
        return b.a.l(this, jVar, jVar2);
    }

    @Override // ig.r
    public ig.m w(ig.j jVar, int i10) {
        return P0(jVar, i10);
    }

    @Override // ig.r
    public ig.q w0(ig.p pVar) {
        return b.a.v(this, pVar);
    }

    @Override // ig.r
    public boolean x(ig.i iVar) {
        return V0(iVar);
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
