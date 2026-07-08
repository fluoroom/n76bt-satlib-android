package re;

import ed.q;
import gf.b;
import gf.g;
import gf.i;
import gf.l;
import gf.o;
import gf.r;
import gf.t;
import gf.u;
import gf.v;
import gf.w;
import gf.x;
import gf.y;
import java.util.Iterator;
import java.util.List;
import jf.h;
import jf.i;
import jf.j;
import qe.a0;
import qe.b0;
import qe.c0;
import qe.d0;
import qe.e0;
import qe.h;
import qe.k;
import qe.p;
import qe.s;
import qe.z;
import rd.m;
import se.n;

/* JADX INFO: loaded from: classes3.dex */
public abstract class g {

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f25989a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f25990b;

        /* JADX INFO: renamed from: c */
        public static final /* synthetic */ int[] f25991c;

        /* JADX INFO: renamed from: d */
        public static final /* synthetic */ int[] f25992d;

        /* JADX INFO: renamed from: e */
        public static final /* synthetic */ int[] f25993e;

        /* JADX INFO: renamed from: f */
        public static final /* synthetic */ int[] f25994f;

        /* JADX INFO: renamed from: g */
        public static final /* synthetic */ int[] f25995g;

        static {
            int[] iArr = new int[t.c.values().length];
            try {
                iArr[t.c.IN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[t.c.OUT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[t.c.INV.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f25989a = iArr;
            int[] iArr2 = new int[r.b.c.values().length];
            try {
                iArr2[r.b.c.IN.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[r.b.c.OUT.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[r.b.c.INV.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[r.b.c.STAR.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            f25990b = iArr2;
            int[] iArr3 = new int[w.d.values().length];
            try {
                iArr3[w.d.LANGUAGE_VERSION.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr3[w.d.COMPILER_VERSION.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[w.d.API_VERSION.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
            f25991c = iArr3;
            int[] iArr4 = new int[dd.a.values().length];
            try {
                iArr4[dd.a.f10889a.ordinal()] = 1;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr4[dd.a.f10890b.ordinal()] = 2;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr4[dd.a.f10891c.ordinal()] = 3;
            } catch (NoSuchFieldError unused13) {
            }
            f25992d = iArr4;
            int[] iArr5 = new int[g.c.values().length];
            try {
                iArr5[g.c.RETURNS_CONSTANT.ordinal()] = 1;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr5[g.c.CALLS.ordinal()] = 2;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr5[g.c.RETURNS_NOT_NULL.ordinal()] = 3;
            } catch (NoSuchFieldError unused16) {
            }
            f25993e = iArr5;
            int[] iArr6 = new int[g.d.values().length];
            try {
                iArr6[g.d.AT_MOST_ONCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr6[g.d.EXACTLY_ONCE.ordinal()] = 2;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr6[g.d.AT_LEAST_ONCE.ordinal()] = 3;
            } catch (NoSuchFieldError unused19) {
            }
            f25994f = iArr6;
            int[] iArr7 = new int[i.c.values().length];
            try {
                iArr7[i.c.TRUE.ordinal()] = 1;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr7[i.c.FALSE.ordinal()] = 2;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr7[i.c.NULL.ordinal()] = 3;
            } catch (NoSuchFieldError unused22) {
            }
            f25995g = iArr7;
        }
    }

    public static final int a(int i10) {
        Boolean boolD = jf.b.f18662c.d(i10);
        m.d(boolD, "get(...)");
        return jf.b.b(boolD.booleanValue(), (y) jf.b.f18663d.d(i10), (l) jf.b.f18664e.d(i10), false, false, false);
    }

    public static final int b(o oVar) {
        m.e(oVar, "<this>");
        return oVar.i1() ? oVar.R0() : a(oVar.N0());
    }

    public static final int c(o oVar) {
        m.e(oVar, "<this>");
        return oVar.p1() ? oVar.b1() : a(oVar.N0());
    }

    private static final int d(r rVar) {
        boolean zK0 = rVar.k0();
        return (zK0 ? 1 : 0) + (rVar.g0() << 1);
    }

    private static final int e(t tVar) {
        return tVar.T() ? 1 : 0;
    }

    private static final r f(gf.c cVar, e eVar) {
        r rVarI = jf.g.i(cVar, eVar.g());
        if (rVarI != null) {
            return rVarI;
        }
        if (!cVar.D1()) {
            return null;
        }
        List listL1 = cVar.l1();
        m.d(listL1, "getPropertyList(...)");
        Iterator it = listL1.iterator();
        boolean z10 = false;
        Object obj = null;
        while (true) {
            if (!it.hasNext()) {
                if (!z10) {
                    break;
                }
            } else {
                Object next = it.next();
                o oVar = (o) next;
                m.b(oVar);
                if (jf.g.m(oVar, eVar.g()) == null && m.a(eVar.b(oVar.S0()), eVar.b(cVar.Y0()))) {
                    if (z10) {
                        break;
                    }
                    z10 = true;
                    obj = next;
                }
            }
        }
        obj = null;
        o oVar2 = (o) obj;
        if (oVar2 != null) {
            return jf.g.o(oVar2, eVar.g());
        }
        return null;
    }

    private static final c0 g(int i10, e eVar) {
        e0 e0Var;
        d0 d0Var;
        i.b bVarE;
        c0 c0Var = new c0();
        jf.i iVarA = jf.i.f18698f.a(i10, eVar.e(), eVar.h());
        if (iVarA == null && !eVar.d()) {
            throw new qe.c("No VersionRequirement with the given id in the table", null, 2, null);
        }
        w.d dVarB = iVarA != null ? iVarA.b() : null;
        int i11 = dVarB == null ? -1 : a.f25991c[dVarB.ordinal()];
        if (i11 == -1) {
            e0Var = e0.f24953d;
        } else if (i11 == 1) {
            e0Var = e0.f24950a;
        } else if (i11 == 2) {
            e0Var = e0.f24951b;
        } else {
            if (i11 != 3) {
                throw new dd.o();
            }
            e0Var = e0.f24952c;
        }
        dd.a aVarC = iVarA != null ? iVarA.c() : null;
        int i12 = aVarC == null ? -1 : a.f25992d[aVarC.ordinal()];
        if (i12 == -1) {
            d0Var = d0.f24945c;
        } else if (i12 == 1) {
            d0Var = d0.f24943a;
        } else if (i12 != 2) {
            if (i12 != 3) {
                throw new dd.o();
            }
            d0Var = d0.f24945c;
        } else {
            d0Var = d0.f24944b;
        }
        c0Var.e(e0Var);
        c0Var.f(d0Var);
        c0Var.d(iVarA != null ? iVarA.a() : null);
        c0Var.g(iVarA != null ? iVarA.d() : null);
        if (iVarA == null || (bVarE = iVarA.e()) == null) {
            bVarE = i.b.f18706e;
        }
        c0Var.h(new b0(bVarE.b(), bVarE.c(), bVarE.d()));
        return c0Var;
    }

    public static final qe.g h(gf.c cVar, jf.d dVar, boolean z10, List list) {
        m.e(cVar, "<this>");
        m.e(dVar, "strings");
        m.e(list, "contextExtensions");
        qe.g gVar = new qe.g();
        u uVarX1 = cVar.x1();
        m.d(uVarX1, "getTypeTable(...)");
        h hVar = new h(uVarX1);
        j.a aVar = j.f18710b;
        x xVarZ1 = cVar.z1();
        m.d(xVarZ1, "getVersionRequirementTable(...)");
        e eVar = new e(dVar, hVar, aVar.a(xVarZ1), z10, null, list, 16, null);
        List listW1 = cVar.w1();
        m.d(listW1, "getTypeParameterList(...)");
        e eVarI = eVar.i(listW1);
        gVar.r(cVar.T0());
        gVar.u(eVarI.a(cVar.U0()));
        List<t> listW12 = cVar.w1();
        m.d(listW12, "getTypeParameterList(...)");
        List listO = gVar.o();
        for (t tVar : listW12) {
            m.b(tVar);
            listO.add(s(tVar, eVarI));
        }
        List listP = jf.g.p(cVar, eVarI.g());
        List listN = gVar.n();
        Iterator it = listP.iterator();
        while (it.hasNext()) {
            listN.add(q((r) it.next(), eVarI));
        }
        List<gf.e> listJ0 = cVar.J0();
        m.d(listJ0, "getConstructorList(...)");
        List listE = gVar.e();
        for (gf.e eVar2 : listJ0) {
            m.b(eVar2);
            listE.add(j(eVar2, eVarI));
        }
        List listX0 = cVar.X0();
        m.d(listX0, "getFunctionList(...)");
        List listL1 = cVar.l1();
        m.d(listL1, "getPropertyList(...)");
        List listT1 = cVar.t1();
        m.d(listT1, "getTypeAliasList(...)");
        u(gVar, listX0, listL1, listT1, eVarI);
        if (cVar.A1()) {
            gVar.q(eVarI.b(cVar.E0()));
        }
        List<Integer> listI1 = cVar.i1();
        m.d(listI1, "getNestedClassNameList(...)");
        List listL = gVar.l();
        for (Integer num : listI1) {
            m.b(num);
            listL.add(eVarI.b(num.intValue()));
        }
        Iterator it2 = cVar.S0().iterator();
        while (true) {
            if (!it2.hasNext()) {
                List<Integer> listM1 = cVar.m1();
                m.d(listM1, "getSealedSubclassFqNameList(...)");
                List listM = gVar.m();
                for (Integer num2 : listM1) {
                    m.b(num2);
                    listM.add(eVarI.a(num2.intValue()));
                }
                if (cVar.D1()) {
                    gVar.s(eVarI.b(cVar.Y0()));
                }
                r rVarF = f(cVar, eVarI);
                gVar.t(rVarF != null ? q(rVarF, eVarI) : null);
                List listB = jf.g.b(cVar, eVarI.g());
                List listF = gVar.f();
                Iterator it3 = listB.iterator();
                while (it3.hasNext()) {
                    listF.add(q((r) it3.next(), eVarI));
                }
                List<Integer> listY1 = cVar.y1();
                m.d(listY1, "getVersionRequirementList(...)");
                List listP2 = gVar.p();
                for (Integer num3 : listY1) {
                    m.b(num3);
                    listP2.add(g(num3.intValue(), eVarI));
                }
                Iterator it4 = eVarI.c().iterator();
                while (it4.hasNext()) {
                    ((n) it4.next()).r(gVar, cVar, eVarI);
                }
                return gVar;
            }
            gf.h hVar2 = (gf.h) it2.next();
            if (!hVar2.O()) {
                throw new qe.c("No name for EnumEntry", null, 2, null);
            }
            gVar.g().add(eVarI.b(hVar2.N()));
            List listJ = gVar.j();
            m.b(hVar2);
            listJ.add(n(hVar2, eVarI));
        }
    }

    public static /* synthetic */ qe.g i(gf.c cVar, jf.d dVar, boolean z10, List list, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        if ((i10 & 4) != 0) {
            list = q.k();
        }
        return h(cVar, dVar, z10, list);
    }

    private static final qe.j j(gf.e eVar, e eVar2) {
        qe.j jVar = new qe.j(eVar.Z());
        List<v> listC0 = eVar.c0();
        m.d(listC0, "getValueParameterList(...)");
        List listD = jVar.d();
        for (v vVar : listC0) {
            m.b(vVar);
            listD.add(t(vVar, eVar2));
        }
        List<Integer> listD0 = eVar.d0();
        m.d(listD0, "getVersionRequirementList(...)");
        List listE = jVar.e();
        for (Integer num : listD0) {
            m.b(num);
            listE.add(g(num.intValue(), eVar2));
        }
        Iterator it = eVar2.c().iterator();
        while (it.hasNext()) {
            ((n) it.next()).q(jVar, eVar, eVar2);
        }
        return jVar;
    }

    private static final k k(gf.f fVar, e eVar) {
        p pVar;
        qe.o oVar;
        k kVar = new k();
        for (gf.g gVar : fVar.s()) {
            if (gVar.G()) {
                g.c cVarA = gVar.A();
                if (cVarA == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                int i10 = a.f25993e[cVarA.ordinal()];
                if (i10 == 1) {
                    pVar = p.f25044a;
                } else if (i10 == 2) {
                    pVar = p.f25045b;
                } else {
                    if (i10 != 3) {
                        throw new dd.o();
                    }
                    pVar = p.f25046c;
                }
                if (gVar.H()) {
                    g.d dVarC = gVar.C();
                    if (dVarC == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    int i11 = a.f25994f[dVarC.ordinal()];
                    if (i11 == 1) {
                        oVar = qe.o.f25039a;
                    } else if (i11 == 2) {
                        oVar = qe.o.f25040b;
                    } else {
                        if (i11 != 3) {
                            throw new dd.o();
                        }
                        oVar = qe.o.f25041c;
                    }
                } else {
                    oVar = null;
                }
                List listA = kVar.a();
                m.b(gVar);
                listA.add(l(gVar, pVar, oVar, eVar));
            }
        }
        return kVar;
    }

    private static final qe.m l(gf.g gVar, p pVar, qe.o oVar, e eVar) {
        qe.m mVar = new qe.m(pVar, oVar);
        List<gf.i> listZ = gVar.z();
        m.d(listZ, "getEffectConstructorArgumentList(...)");
        List listA = mVar.a();
        for (gf.i iVar : listZ) {
            m.b(iVar);
            listA.add(m(iVar, eVar));
        }
        if (gVar.D()) {
            gf.i iVarT = gVar.t();
            m.d(iVarT, "getConclusionOfConditionalEffect(...)");
            mVar.b(m(iVarT, eVar));
        }
        return mVar;
    }

    private static final qe.n m(gf.i iVar, e eVar) {
        Boolean bool;
        qe.n nVar = new qe.n();
        nVar.e(iVar.H());
        nVar.g(iVar.Z() ? Integer.valueOf(iVar.R()) : null);
        if (iVar.T()) {
            i.c cVarD = iVar.D();
            if (cVarD == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            int i10 = a.f25995g[cVarD.ordinal()];
            if (i10 == 1) {
                bool = Boolean.TRUE;
            } else if (i10 == 2) {
                bool = Boolean.FALSE;
            } else {
                if (i10 != 3) {
                    throw new dd.o();
                }
                bool = null;
            }
            nVar.d(new qe.i(bool));
        }
        r rVarJ = jf.g.j(iVar, eVar.g());
        nVar.f(rVarJ != null ? q(rVarJ, eVar) : null);
        List<gf.i> listC = iVar.C();
        m.d(listC, "getAndArgumentList(...)");
        List listA = nVar.a();
        for (gf.i iVar2 : listC) {
            m.b(iVar2);
            listA.add(m(iVar2, eVar));
        }
        List<gf.i> listQ = iVar.Q();
        m.d(listQ, "getOrArgumentList(...)");
        List listC2 = nVar.c();
        for (gf.i iVar3 : listQ) {
            m.b(iVar3);
            listC2.add(m(iVar3, eVar));
        }
        return nVar;
    }

    private static final qe.q n(gf.h hVar, e eVar) {
        qe.q qVar = new qe.q(eVar.b(hVar.N()));
        Iterator it = eVar.c().iterator();
        while (it.hasNext()) {
            ((n) it.next()).c(qVar, hVar, eVar);
        }
        return qVar;
    }

    private static final s o(gf.j jVar, e eVar) {
        s sVar = new s(jVar.B0(), eVar.b(jVar.C0()));
        List listK0 = jVar.K0();
        m.d(listK0, "getTypeParameterList(...)");
        e eVarI = eVar.i(listK0);
        List<t> listK02 = jVar.K0();
        m.d(listK02, "getTypeParameterList(...)");
        List listF = sVar.f();
        for (t tVar : listK02) {
            m.b(tVar);
            listF.add(s(tVar, eVarI));
        }
        r rVarL = jf.g.l(jVar, eVarI.g());
        sVar.k(rVarL != null ? q(rVarL, eVarI) : null);
        List listC = jf.g.c(jVar, eVarI.g());
        List listB = sVar.b();
        Iterator it = listC.iterator();
        while (it.hasNext()) {
            listB.add(q((r) it.next(), eVarI));
        }
        List<v> listO0 = jVar.O0();
        m.d(listO0, "getValueParameterList(...)");
        List listG = sVar.g();
        for (v vVar : listO0) {
            m.b(vVar);
            listG.add(t(vVar, eVarI));
        }
        sVar.l(q(jf.g.n(jVar, eVarI.g()), eVarI));
        if (jVar.Q0()) {
            gf.f fVarV0 = jVar.v0();
            m.d(fVarV0, "getContract(...)");
            sVar.i(k(fVarV0, eVarI));
        }
        List<Integer> listP0 = jVar.P0();
        m.d(listP0, "getVersionRequirementList(...)");
        List listH = sVar.h();
        for (Integer num : listP0) {
            m.b(num);
            listH.add(g(num.intValue(), eVarI));
        }
        Iterator it2 = eVarI.c().iterator();
        while (it2.hasNext()) {
            ((n) it2.next()).g(sVar, jVar, eVarI);
        }
        return sVar;
    }

    public static final qe.t p(o oVar, e eVar) {
        m.e(oVar, "<this>");
        m.e(eVar, "outer");
        qe.t tVar = new qe.t(oVar.N0(), eVar.b(oVar.S0()), b(oVar), c(oVar));
        List listF1 = oVar.f1();
        m.d(listF1, "getTypeParameterList(...)");
        e eVarI = eVar.i(listF1);
        List<t> listF12 = oVar.f1();
        m.d(listF12, "getTypeParameterList(...)");
        List listJ = tVar.j();
        for (t tVar2 : listF12) {
            m.b(tVar2);
            listJ.add(s(tVar2, eVarI));
        }
        r rVarM = jf.g.m(oVar, eVarI.g());
        tVar.n(rVarM != null ? q(rVarM, eVarI) : null);
        List listD = jf.g.d(oVar, eVarI.g());
        List listC = tVar.c();
        Iterator it = listD.iterator();
        while (it.hasNext()) {
            listC.add(q((r) it.next(), eVarI));
        }
        if (oVar.q1()) {
            v vVarC1 = oVar.c1();
            m.d(vVarC1, "getSetterValueParameter(...)");
            tVar.p(t(vVarC1, eVarI));
        }
        tVar.o(q(jf.g.o(oVar, eVarI.g()), eVarI));
        List<Integer> listG1 = oVar.g1();
        m.d(listG1, "getVersionRequirementList(...)");
        List listK = tVar.k();
        for (Integer num : listG1) {
            m.b(num);
            listK.add(g(num.intValue(), eVarI));
        }
        Iterator it2 = eVarI.c().iterator();
        while (it2.hasNext()) {
            ((n) it2.next()).f(tVar, oVar, eVarI);
        }
        return tVar;
    }

    private static final qe.v q(r rVar, e eVar) {
        qe.h cVar;
        qe.v vVarQ;
        a0 a0Var;
        qe.v vVar = new qe.v(d(rVar));
        qe.r rVar2 = null;
        rVar2 = null;
        if (rVar.s0()) {
            cVar = new h.a(eVar.a(rVar.d0()));
        } else if (rVar.A0()) {
            cVar = new h.b(eVar.a(rVar.n0()));
        } else if (rVar.B0()) {
            cVar = new h.c(rVar.o0());
        } else {
            if (!rVar.C0()) {
                throw new qe.c("No classifier (class, type alias or type parameter) recorded for Type", null, 2, null);
            }
            Integer numF = eVar.f(rVar.p0());
            if (numF == null) {
                throw new qe.c("No type parameter id for " + eVar.b(rVar.p0()), null, 2, null);
            }
            cVar = new h.c(numF.intValue());
        }
        vVar.f(cVar);
        for (r.b bVar : rVar.c0()) {
            r.b.c cVarS = bVar.s();
            if (cVarS == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            int i10 = a.f25990b[cVarS.ordinal()];
            if (i10 == 1) {
                a0Var = a0.f24920b;
            } else if (i10 == 2) {
                a0Var = a0.f24921c;
            } else if (i10 == 3) {
                a0Var = a0.f24919a;
            } else {
                if (i10 != 4) {
                    throw new dd.o();
                }
                a0Var = null;
            }
            if (a0Var != null) {
                m.b(bVar);
                r rVarQ = jf.g.q(bVar, eVar.g());
                if (rVarQ == null) {
                    throw new qe.c("No type argument for non-STAR projection in Type", null, 2, null);
                }
                vVar.a().add(new qe.y(a0Var, q(rVarQ, eVar)));
            } else {
                vVar.a().add(qe.y.f25109d);
            }
        }
        r rVarA = jf.g.a(rVar, eVar.g());
        vVar.e(rVarA != null ? q(rVarA, eVar) : null);
        r rVarK = jf.g.k(rVar, eVar.g());
        vVar.i(rVarK != null ? q(rVarK, eVar) : null);
        r rVarF = jf.g.f(rVar, eVar.g());
        if (rVarF != null && (vVarQ = q(rVarF, eVar)) != null) {
            rVar2 = new qe.r(vVarQ, rVar.u0() ? eVar.b(rVar.h0()) : null);
        }
        vVar.h(rVar2);
        Iterator it = eVar.c().iterator();
        while (it.hasNext()) {
            ((n) it.next()).n(vVar, rVar, eVar);
        }
        return vVar;
    }

    private static final qe.w r(gf.s sVar, e eVar) {
        qe.w wVar = new qe.w(sVar.g0(), eVar.b(sVar.h0()));
        List listK0 = sVar.k0();
        m.d(listK0, "getTypeParameterList(...)");
        e eVarI = eVar.i(listK0);
        List<t> listK02 = sVar.k0();
        m.d(listK02, "getTypeParameterList(...)");
        List listC = wVar.c();
        for (t tVar : listK02) {
            m.b(tVar);
            listC.add(s(tVar, eVarI));
        }
        wVar.g(q(jf.g.s(sVar, eVarI.g()), eVarI));
        wVar.e(q(jf.g.e(sVar, eVarI.g()), eVarI));
        List<gf.b> listZ = sVar.Z();
        m.d(listZ, "getAnnotationList(...)");
        List listA = wVar.a();
        for (gf.b bVar : listZ) {
            m.b(bVar);
            listA.add(f.b(bVar, eVarI.e()));
        }
        List<Integer> listN0 = sVar.n0();
        m.d(listN0, "getVersionRequirementList(...)");
        List listD = wVar.d();
        for (Integer num : listN0) {
            m.b(num);
            listD.add(g(num.intValue(), eVarI));
        }
        Iterator it = eVarI.c().iterator();
        while (it.hasNext()) {
            ((n) it.next()).k(wVar, sVar, eVarI);
        }
        return wVar;
    }

    private static final qe.x s(t tVar, e eVar) {
        a0 a0Var;
        t.c cVarA0 = tVar.a0();
        if (cVarA0 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        int i10 = a.f25989a[cVarA0.ordinal()];
        if (i10 == 1) {
            a0Var = a0.f24920b;
        } else if (i10 == 2) {
            a0Var = a0.f24921c;
        } else {
            if (i10 != 3) {
                throw new dd.o();
            }
            a0Var = a0.f24919a;
        }
        qe.x xVar = new qe.x(e(tVar), eVar.b(tVar.R()), tVar.Q(), a0Var);
        List listT = jf.g.t(tVar, eVar.g());
        List listC = xVar.c();
        Iterator it = listT.iterator();
        while (it.hasNext()) {
            listC.add(q((r) it.next(), eVar));
        }
        Iterator it2 = eVar.c().iterator();
        while (it2.hasNext()) {
            ((n) it2.next()).m(xVar, tVar, eVar);
        }
        return xVar;
    }

    private static final z t(v vVar, e eVar) {
        z zVar = new z(vVar.Y(), eVar.b(vVar.Z()));
        zVar.e(q(jf.g.r(vVar, eVar.g()), eVar));
        r rVarU = jf.g.u(vVar, eVar.g());
        zVar.f(rVarU != null ? q(rVarU, eVar) : null);
        if (vVar.e0()) {
            b.C0197b.c cVarT = vVar.T();
            m.d(cVarT, "getAnnotationParameterDefaultValue(...)");
            zVar.c(f.c(cVarT, eVar.e()));
        }
        Iterator it = eVar.c().iterator();
        while (it.hasNext()) {
            ((n) it.next()).j(zVar, vVar, eVar);
        }
        return zVar;
    }

    private static final void u(qe.l lVar, List list, List list2, List list3, e eVar) {
        List listB = lVar.b();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            listB.add(o((gf.j) it.next(), eVar));
        }
        List listA = lVar.a();
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            listA.add(p((o) it2.next(), eVar));
        }
        List listC = lVar.c();
        Iterator it3 = list3.iterator();
        while (it3.hasNext()) {
            listC.add(r((gf.s) it3.next(), eVar));
        }
    }
}
