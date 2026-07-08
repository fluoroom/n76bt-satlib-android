package ag;

import ag.n0;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import he.a;
import he.b;
import he.b1;
import he.f1;
import he.g1;
import he.k1;
import he.s1;
import ie.h;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import jf.b;

/* JADX INFO: loaded from: classes3.dex */
public final class k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p f510a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final g f511b;

    public k0(p pVar) {
        rd.m.e(pVar, "c");
        this.f510a = pVar;
        this.f511b = new g(pVar.c().q(), pVar.c().r());
    }

    private final b1 B(gf.r rVar, p pVar, he.a aVar, int i10) {
        return qf.h.b(aVar, pVar.i().u(rVar), null, ie.h.f16054l.b(), i10);
    }

    private final List C(List list, of.p pVar, d dVar) {
        he.m mVarE = this.f510a.e();
        rd.m.c(mVarE, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.CallableDescriptor");
        he.a aVar = (he.a) mVarE;
        he.m mVarB = aVar.b();
        rd.m.d(mVarB, "getContainingDeclaration(...)");
        n0 n0VarI = i(mVarB);
        ArrayList arrayList = new ArrayList(ed.q.v(list, 10));
        int i10 = 0;
        for (Object obj : list) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                ed.q.u();
            }
            gf.v vVar = (gf.v) obj;
            int iY = vVar.f0() ? vVar.Y() : 0;
            ie.h hVarB = (n0VarI == null || !jf.b.f18662c.d(iY).booleanValue()) ? ie.h.f16054l.b() : new cg.s0(this.f510a.h(), new h0(this, n0VarI, pVar, dVar, i10, vVar));
            mf.f fVarB = l0.b(this.f510a.g(), vVar.Z());
            eg.r0 r0VarU = this.f510a.i().u(jf.g.r(vVar, this.f510a.j()));
            Boolean boolD = jf.b.H.d(iY);
            rd.m.d(boolD, "get(...)");
            boolean zBooleanValue = boolD.booleanValue();
            Boolean boolD2 = jf.b.I.d(iY);
            rd.m.d(boolD2, "get(...)");
            boolean zBooleanValue2 = boolD2.booleanValue();
            Boolean boolD3 = jf.b.J.d(iY);
            rd.m.d(boolD3, "get(...)");
            boolean zBooleanValue3 = boolD3.booleanValue();
            gf.r rVarU = jf.g.u(vVar, this.f510a.j());
            eg.r0 r0VarU2 = rVarU != null ? this.f510a.i().u(rVarU) : null;
            g1 g1Var = g1.f15281a;
            rd.m.d(g1Var, "NO_SOURCE");
            he.a aVar2 = aVar;
            arrayList.add(new ke.u0(aVar2, null, i10, hVarB, fVarB, r0VarU, zBooleanValue, zBooleanValue2, zBooleanValue3, r0VarU2, g1Var));
            aVar = aVar2;
            i10 = i11;
        }
        return ed.q.H0(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List D(k0 k0Var, n0 n0Var, of.p pVar, d dVar, int i10, gf.v vVar) {
        return ed.q.H0(k0Var.f510a.c().d().l(n0Var, pVar, dVar, i10, vVar));
    }

    private final n0 i(he.m mVar) {
        if (mVar instanceof he.n0) {
            return new n0.b(((he.n0) mVar).d(), this.f510a.g(), this.f510a.j(), this.f510a.d());
        }
        if (mVar instanceof cg.m) {
            return ((cg.m) mVar).i1();
        }
        return null;
    }

    private final ie.h j(of.p pVar, int i10, d dVar) {
        return !jf.b.f18662c.d(i10).booleanValue() ? ie.h.f16054l.b() : new cg.s0(this.f510a.h(), new e0(this, pVar, dVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List k(k0 k0Var, of.p pVar, d dVar) {
        n0 n0VarI = k0Var.i(k0Var.f510a.e());
        List listH0 = n0VarI != null ? ed.q.H0(k0Var.f510a.c().d().j(n0VarI, pVar, dVar)) : null;
        return listH0 == null ? ed.q.k() : listH0;
    }

    private final b1 l() {
        he.m mVarE = this.f510a.e();
        he.e eVar = mVarE instanceof he.e ? (he.e) mVarE : null;
        if (eVar != null) {
            return eVar.J0();
        }
        return null;
    }

    private final ie.h m(gf.o oVar, boolean z10) {
        return !jf.b.f18662c.d(oVar.N0()).booleanValue() ? ie.h.f16054l.b() : new cg.s0(this.f510a.h(), new f0(this, z10, oVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List n(k0 k0Var, boolean z10, gf.o oVar) {
        n0 n0VarI = k0Var.i(k0Var.f510a.e());
        List listH0 = n0VarI != null ? z10 ? ed.q.H0(k0Var.f510a.c().d().f(n0VarI, oVar)) : ed.q.H0(k0Var.f510a.c().d().c(n0VarI, oVar)) : null;
        return listH0 == null ? ed.q.k() : listH0;
    }

    private final ie.h o(of.p pVar, d dVar) {
        return new cg.a(this.f510a.h(), new g0(this, pVar, dVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List p(k0 k0Var, of.p pVar, d dVar) {
        n0 n0VarI = k0Var.i(k0Var.f510a.e());
        List listG = n0VarI != null ? k0Var.f510a.c().d().g(n0VarI, pVar, dVar) : null;
        return listG == null ? ed.q.k() : listG;
    }

    private final void q(cg.o0 o0Var, b1 b1Var, b1 b1Var2, List list, List list2, List list3, eg.r0 r0Var, he.e0 e0Var, he.u uVar, Map map) {
        o0Var.o1(b1Var, b1Var2, list, list2, list3, r0Var, e0Var, uVar, map);
    }

    private final int t(int i10) {
        return (i10 & 63) + ((i10 >> 8) << 6);
    }

    public static /* synthetic */ he.y0 v(k0 k0Var, gf.o oVar, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return k0Var.u(oVar, z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final dg.j w(k0 k0Var, gf.o oVar, cg.n0 n0Var) {
        return k0Var.f510a.h().a(new i0(k0Var, oVar, n0Var));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final sf.g x(k0 k0Var, gf.o oVar, cg.n0 n0Var) {
        n0 n0VarI = k0Var.i(k0Var.f510a.e());
        rd.m.b(n0VarI);
        e eVarD = k0Var.f510a.c().d();
        eg.r0 r0VarG = n0Var.g();
        rd.m.d(r0VarG, "getReturnType(...)");
        return (sf.g) eVarD.k(n0VarI, oVar, r0VarG);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final dg.j y(k0 k0Var, gf.o oVar, cg.n0 n0Var) {
        return k0Var.f510a.h().a(new j0(k0Var, oVar, n0Var));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final sf.g z(k0 k0Var, gf.o oVar, cg.n0 n0Var) {
        n0 n0VarI = k0Var.i(k0Var.f510a.e());
        rd.m.b(n0VarI);
        e eVarD = k0Var.f510a.c().d();
        eg.r0 r0VarG = n0Var.g();
        rd.m.d(r0VarG, "getReturnType(...)");
        return (sf.g) eVarD.a(n0VarI, oVar, r0VarG);
    }

    public final k1 A(gf.s sVar) {
        rd.m.e(sVar, "proto");
        h.a aVar = ie.h.f16054l;
        List<gf.b> listZ = sVar.Z();
        rd.m.d(listZ, "getAnnotationList(...)");
        ArrayList arrayList = new ArrayList(ed.q.v(listZ, 10));
        for (gf.b bVar : listZ) {
            g gVar = this.f511b;
            rd.m.b(bVar);
            arrayList.add(gVar.a(bVar, this.f510a.g()));
        }
        cg.p0 p0Var = new cg.p0(this.f510a.h(), this.f510a.e(), aVar.a(arrayList), l0.b(this.f510a.g(), sVar.h0()), p0.a(o0.f557a, (gf.y) jf.b.f18663d.d(sVar.g0())), sVar, this.f510a.g(), this.f510a.j(), this.f510a.k(), this.f510a.d());
        p pVar = this.f510a;
        List listK0 = sVar.k0();
        rd.m.d(listK0, "getTypeParameterList(...)");
        p pVarB = p.b(pVar, p0Var, listK0, null, null, null, null, 60, null);
        p0Var.W0(pVarB.i().m(), pVarB.i().o(jf.g.s(sVar, this.f510a.j()), false), pVarB.i().o(jf.g.e(sVar, this.f510a.j()), false));
        return p0Var;
    }

    public final he.d r(gf.e eVar, boolean z10) {
        rd.m.e(eVar, "proto");
        he.m mVarE = this.f510a.e();
        rd.m.c(mVarE, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
        he.e eVar2 = (he.e) mVarE;
        int iZ = eVar.Z();
        d dVar = d.FUNCTION;
        cg.c cVar = new cg.c(eVar2, null, j(eVar, iZ, dVar), z10, b.a.DECLARATION, eVar, this.f510a.g(), this.f510a.j(), this.f510a.k(), this.f510a.d(), null, WXMediaMessage.DESCRIPTION_LENGTH_LIMIT, null);
        k0 k0VarF = p.b(this.f510a, cVar, ed.q.k(), null, null, null, null, 60, null).f();
        List listC0 = eVar.c0();
        rd.m.d(listC0, "getValueParameterList(...)");
        cVar.q1(k0VarF.C(listC0, eVar, dVar), p0.a(o0.f557a, (gf.y) jf.b.f18663d.d(eVar.Z())));
        cVar.g1(eVar2.s());
        cVar.W0(eVar2.M());
        cVar.Y0(!jf.b.f18674o.d(eVar.Z()).booleanValue());
        return cVar;
    }

    public final f1 s(gf.j jVar) {
        eg.r0 r0VarU;
        rd.m.e(jVar, "proto");
        int iB0 = jVar.R0() ? jVar.B0() : t(jVar.D0());
        d dVar = d.FUNCTION;
        ie.h hVarJ = j(jVar, iB0, dVar);
        ie.h hVarO = jf.g.g(jVar) ? o(jVar, dVar) : ie.h.f16054l.b();
        cg.o0 o0Var = new cg.o0(this.f510a.e(), null, hVarJ, l0.b(this.f510a.g(), jVar.C0()), p0.b(o0.f557a, (gf.k) jf.b.f18675p.d(iB0)), jVar, this.f510a.g(), this.f510a.j(), rd.m.a(uf.e.o(this.f510a.e()).b(l0.b(this.f510a.g(), jVar.C0())), q0.f579a) ? jf.j.f18710b.b() : this.f510a.k(), this.f510a.d(), null, WXMediaMessage.DESCRIPTION_LENGTH_LIMIT, null);
        p pVar = this.f510a;
        List listK0 = jVar.K0();
        rd.m.d(listK0, "getTypeParameterList(...)");
        p pVarB = p.b(pVar, o0Var, listK0, null, null, null, null, 60, null);
        gf.r rVarL = jf.g.l(jVar, this.f510a.j());
        b1 b1VarI = (rVarL == null || (r0VarU = pVarB.i().u(rVarL)) == null) ? null : qf.h.i(o0Var, r0VarU, hVarO);
        b1 b1VarL = l();
        List listC = jf.g.c(jVar, this.f510a.j());
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        for (Object obj : listC) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                ed.q.u();
            }
            b1 b1VarB = B((gf.r) obj, pVarB, o0Var, i10);
            if (b1VarB != null) {
                arrayList.add(b1VarB);
            }
            i10 = i11;
        }
        List listM = pVarB.i().m();
        k0 k0VarF = pVarB.f();
        List listO0 = jVar.O0();
        rd.m.d(listO0, "getValueParameterList(...)");
        List listC2 = k0VarF.C(listO0, jVar, d.FUNCTION);
        eg.r0 r0VarU2 = pVarB.i().u(jf.g.n(jVar, this.f510a.j()));
        o0 o0Var2 = o0.f557a;
        q(o0Var, b1VarI, b1VarL, arrayList, listM, listC2, r0VarU2, o0Var2.b((gf.l) jf.b.f18664e.d(iB0)), p0.a(o0Var2, (gf.y) jf.b.f18663d.d(iB0)), ed.k0.i());
        Boolean boolD = jf.b.f18676q.d(iB0);
        rd.m.d(boolD, "get(...)");
        o0Var.f1(boolD.booleanValue());
        Boolean boolD2 = jf.b.f18677r.d(iB0);
        rd.m.d(boolD2, "get(...)");
        o0Var.c1(boolD2.booleanValue());
        Boolean boolD3 = jf.b.f18680u.d(iB0);
        rd.m.d(boolD3, "get(...)");
        o0Var.X0(boolD3.booleanValue());
        Boolean boolD4 = jf.b.f18678s.d(iB0);
        rd.m.d(boolD4, "get(...)");
        o0Var.e1(boolD4.booleanValue());
        Boolean boolD5 = jf.b.f18679t.d(iB0);
        rd.m.d(boolD5, "get(...)");
        o0Var.i1(boolD5.booleanValue());
        Boolean boolD6 = jf.b.f18681v.d(iB0);
        rd.m.d(boolD6, "get(...)");
        o0Var.h1(boolD6.booleanValue());
        Boolean boolD7 = jf.b.f18682w.d(iB0);
        rd.m.d(boolD7, "get(...)");
        o0Var.W0(boolD7.booleanValue());
        o0Var.Y0(!jf.b.f18683x.d(iB0).booleanValue());
        dd.q qVarA = this.f510a.c().h().a(jVar, o0Var, this.f510a.j(), pVarB.i());
        if (qVarA != null) {
            o0Var.U0((a.InterfaceC0214a) qVarA.c(), qVarA.d());
        }
        return o0Var;
    }

    public final he.y0 u(gf.o oVar, boolean z10) {
        ie.h hVarJ;
        p pVar;
        b.d dVar;
        b.d dVar2;
        String str;
        ke.l0 l0VarD;
        ke.l0 l0Var;
        boolean z11;
        ke.m0 m0Var;
        eg.r0 r0VarU;
        rd.m.e(oVar, "proto");
        int iN0 = oVar.h1() ? oVar.N0() : t(oVar.T0());
        if (z10) {
            h.a aVar = ie.h.f16054l;
            List<gf.b> listT0 = oVar.t0();
            rd.m.d(listT0, "getAnnotationList(...)");
            ArrayList arrayList = new ArrayList(ed.q.v(listT0, 10));
            for (gf.b bVar : listT0) {
                g gVar = this.f511b;
                rd.m.b(bVar);
                arrayList.add(gVar.a(bVar, this.f510a.g()));
            }
            hVarJ = aVar.a(arrayList);
        } else {
            hVarJ = null;
        }
        he.m mVarE = this.f510a.e();
        if (hVarJ == null) {
            hVarJ = j(oVar, iN0, d.PROPERTY);
        }
        o0 o0Var = o0.f557a;
        he.e0 e0VarB = o0Var.b((gf.l) jf.b.f18664e.d(iN0));
        he.u uVarA = p0.a(o0Var, (gf.y) jf.b.f18663d.d(iN0));
        Boolean boolD = jf.b.f18684y.d(iN0);
        rd.m.d(boolD, "get(...)");
        boolean zBooleanValue = boolD.booleanValue();
        mf.f fVarB = l0.b(this.f510a.g(), oVar.S0());
        b.a aVarB = p0.b(o0Var, (gf.k) jf.b.f18675p.d(iN0));
        Boolean boolD2 = jf.b.C.d(iN0);
        rd.m.d(boolD2, "get(...)");
        boolean zBooleanValue2 = boolD2.booleanValue();
        Boolean boolD3 = jf.b.B.d(iN0);
        rd.m.d(boolD3, "get(...)");
        boolean zBooleanValue3 = boolD3.booleanValue();
        Boolean boolD4 = jf.b.E.d(iN0);
        rd.m.d(boolD4, "get(...)");
        boolean zBooleanValue4 = boolD4.booleanValue();
        Boolean boolD5 = jf.b.F.d(iN0);
        rd.m.d(boolD5, "get(...)");
        boolean zBooleanValue5 = boolD5.booleanValue();
        Boolean boolD6 = jf.b.G.d(iN0);
        rd.m.d(boolD6, "get(...)");
        int i10 = iN0;
        cg.n0 n0Var = new cg.n0(mVarE, null, hVarJ, e0VarB, uVarA, zBooleanValue, fVarB, aVarB, zBooleanValue2, zBooleanValue3, zBooleanValue4, zBooleanValue5, boolD6.booleanValue(), oVar, this.f510a.g(), this.f510a.j(), this.f510a.k(), this.f510a.d());
        p pVar2 = this.f510a;
        List listF1 = oVar.f1();
        rd.m.d(listF1, "getTypeParameterList(...)");
        p pVarB = p.b(pVar2, n0Var, listF1, null, null, null, null, 60, null);
        Boolean boolD7 = jf.b.f18685z.d(i10);
        rd.m.d(boolD7, "get(...)");
        boolean zBooleanValue6 = boolD7.booleanValue();
        ie.h hVarO = (zBooleanValue6 && jf.g.h(oVar)) ? o(oVar, d.PROPERTY_GETTER) : ie.h.f16054l.b();
        eg.r0 r0VarU2 = pVarB.i().u(jf.g.o(oVar, this.f510a.j()));
        List listM = pVarB.i().m();
        b1 b1VarL = l();
        gf.r rVarM = jf.g.m(oVar, this.f510a.j());
        b1 b1VarI = (rVarM == null || (r0VarU = pVarB.i().u(rVarM)) == null) ? null : qf.h.i(n0Var, r0VarU, hVarO);
        List listD = jf.g.d(oVar, this.f510a.j());
        ArrayList arrayList2 = new ArrayList(ed.q.v(listD, 10));
        int i11 = 0;
        for (Object obj : listD) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                ed.q.u();
            }
            arrayList2.add(B((gf.r) obj, pVarB, n0Var, i11));
            i11 = i12;
        }
        n0Var.b1(r0VarU2, listM, b1VarL, b1VarI, arrayList2);
        Boolean boolD8 = jf.b.f18662c.d(i10);
        rd.m.d(boolD8, "get(...)");
        boolean zBooleanValue7 = boolD8.booleanValue();
        b.d dVar3 = jf.b.f18663d;
        gf.y yVar = (gf.y) dVar3.d(i10);
        b.d dVar4 = jf.b.f18664e;
        int iB = jf.b.b(zBooleanValue7, yVar, (gf.l) dVar4.d(i10), false, false, false);
        if (zBooleanValue6) {
            int iR0 = oVar.i1() ? oVar.R0() : iB;
            Boolean boolD9 = jf.b.K.d(iR0);
            rd.m.d(boolD9, "get(...)");
            boolean zBooleanValue8 = boolD9.booleanValue();
            Boolean boolD10 = jf.b.L.d(iR0);
            rd.m.d(boolD10, "get(...)");
            boolean zBooleanValue9 = boolD10.booleanValue();
            Boolean boolD11 = jf.b.M.d(iR0);
            rd.m.d(boolD11, "get(...)");
            boolean zBooleanValue10 = boolD11.booleanValue();
            ie.h hVarJ2 = j(oVar, iR0, d.PROPERTY_GETTER);
            if (zBooleanValue8) {
                o0 o0Var2 = o0.f557a;
                dVar = dVar3;
                pVar = pVarB;
                dVar2 = dVar4;
                str = "get(...)";
                l0VarD = new ke.l0(n0Var, hVarJ2, o0Var2.b((gf.l) dVar4.d(iR0)), p0.a(o0Var2, (gf.y) dVar3.d(iR0)), !zBooleanValue8, zBooleanValue9, zBooleanValue10, n0Var.j(), null, g1.f15281a);
            } else {
                pVar = pVarB;
                dVar = dVar3;
                dVar2 = dVar4;
                str = "get(...)";
                l0VarD = qf.h.d(n0Var, hVarJ2);
                rd.m.b(l0VarD);
            }
            l0VarD.P0(n0Var.g());
        } else {
            pVar = pVarB;
            dVar = dVar3;
            dVar2 = dVar4;
            str = "get(...)";
            l0VarD = null;
        }
        if (jf.b.A.d(i10).booleanValue()) {
            if (oVar.p1()) {
                iB = oVar.b1();
            }
            int i13 = iB;
            Boolean boolD12 = jf.b.K.d(i13);
            rd.m.d(boolD12, str);
            boolean zBooleanValue11 = boolD12.booleanValue();
            Boolean boolD13 = jf.b.L.d(i13);
            rd.m.d(boolD13, str);
            boolean zBooleanValue12 = boolD13.booleanValue();
            Boolean boolD14 = jf.b.M.d(i13);
            rd.m.d(boolD14, str);
            boolean zBooleanValue13 = boolD14.booleanValue();
            d dVar5 = d.PROPERTY_SETTER;
            ie.h hVarJ3 = j(oVar, i13, dVar5);
            if (zBooleanValue11) {
                o0 o0Var3 = o0.f557a;
                l0Var = l0VarD;
                z11 = true;
                ke.m0 m0Var2 = new ke.m0(n0Var, hVarJ3, o0Var3.b((gf.l) dVar2.d(i13)), p0.a(o0Var3, (gf.y) dVar.d(i13)), !zBooleanValue11, zBooleanValue12, zBooleanValue13, n0Var.j(), null, g1.f15281a);
                m0Var = m0Var2;
                m0Var.Q0((s1) ed.q.w0(p.b(pVar, m0Var2, ed.q.k(), null, null, null, null, 60, null).f().C(ed.q.e(oVar.c1()), oVar, dVar5)));
            } else {
                l0Var = l0VarD;
                z11 = true;
                ke.m0 m0VarE = qf.h.e(n0Var, hVarJ3, ie.h.f16054l.b());
                rd.m.b(m0VarE);
                m0Var = m0VarE;
            }
        } else {
            l0Var = l0VarD;
            z11 = true;
            m0Var = null;
        }
        if (jf.b.D.d(i10).booleanValue()) {
            n0Var.L0(new c0(this, oVar, n0Var));
        }
        he.m mVarE2 = this.f510a.e();
        he.e eVar = mVarE2 instanceof he.e ? (he.e) mVarE2 : null;
        if ((eVar != null ? eVar.j() : null) == he.f.f15275f) {
            n0Var.L0(new d0(this, oVar, n0Var));
        }
        n0Var.V0(l0Var, m0Var, new ke.r(m(oVar, false), n0Var), new ke.r(m(oVar, z11), n0Var));
        return n0Var;
    }
}
