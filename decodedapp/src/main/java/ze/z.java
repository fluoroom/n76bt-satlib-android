package ze;

import df.l1;
import eg.h2;
import eg.i2;
import he.f1;
import he.s1;
import he.z;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import og.k;
import qf.o;
import ve.u;
import ve.u0;
import we.o;
import ze.t0;

/* JADX INFO: loaded from: classes3.dex */
public final class z extends t0 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final he.e f33241n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final cf.g f33242o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final boolean f33243p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final dg.i f33244q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final dg.i f33245r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final dg.i f33246s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final dg.i f33247t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final dg.h f33248u;

    static final /* synthetic */ class a extends rd.l implements qd.l {
        a(Object obj) {
            super(1, obj, z.class, "searchMethodsByNameWithoutBuiltinMagic", "searchMethodsByNameWithoutBuiltinMagic(Lorg/jetbrains/kotlin/name/Name;)Ljava/util/Collection;", 0);
        }

        @Override // qd.l
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public final Collection l(mf.f fVar) {
            rd.m.e(fVar, "p0");
            return ((z) this.f25940b).q1(fVar);
        }
    }

    static final /* synthetic */ class b extends rd.l implements qd.l {
        b(Object obj) {
            super(1, obj, z.class, "searchMethodsInSupertypesWithoutBuiltinMagic", "searchMethodsInSupertypesWithoutBuiltinMagic(Lorg/jetbrains/kotlin/name/Name;)Ljava/util/Collection;", 0);
        }

        @Override // qd.l
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public final Collection l(mf.f fVar) {
            rd.m.e(fVar, "p0");
            return ((z) this.f25940b).r1(fVar);
        }
    }

    public /* synthetic */ z(ye.k kVar, he.e eVar, cf.g gVar, boolean z10, z zVar, int i10, rd.h hVar) {
        this(kVar, eVar, gVar, z10, (i10 & 16) != 0 ? null : zVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Collection A0(z zVar, mf.f fVar) {
        rd.m.e(fVar, "it");
        return zVar.q1(fVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Collection B0(z zVar, mf.f fVar) {
        rd.m.e(fVar, "it");
        return zVar.r1(fVar);
    }

    private final Collection C0() {
        if (!this.f33243p) {
            return L().a().k().d().g(R());
        }
        Collection collectionE = R().k().e();
        rd.m.d(collectionE, "getSupertypes(...)");
        return collectionE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List D0(z zVar, ye.k kVar) {
        Collection constructors = zVar.f33242o.getConstructors();
        ArrayList arrayList = new ArrayList(constructors.size());
        Iterator it = constructors.iterator();
        while (it.hasNext()) {
            arrayList.add(zVar.o1((cf.k) it.next()));
        }
        if (zVar.f33242o.s()) {
            he.d dVarG0 = zVar.G0();
            String strC = ef.c0.c(dVarG0, false, false, 2, null);
            if (arrayList.isEmpty()) {
                arrayList.add(dVarG0);
                kVar.a().h().a(zVar.f33242o, dVarG0);
            } else {
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    if (rd.m.a(ef.c0.c((he.d) it2.next(), false, false, 2, null), strC)) {
                        break;
                    }
                }
                arrayList.add(dVarG0);
                kVar.a().h().a(zVar.f33242o, dVarG0);
            }
        }
        kVar.a().w().d(zVar.R(), arrayList, kVar);
        l1 l1VarR = kVar.a().r();
        boolean zIsEmpty = arrayList.isEmpty();
        List listO = arrayList;
        if (zIsEmpty) {
            listO = ed.q.o(zVar.F0());
        }
        return ed.q.H0(l1VarR.p(kVar, listO));
    }

    private final List E0(ke.i iVar) {
        ke.i iVar2;
        dd.q qVar;
        Collection methods = this.f33242o.getMethods();
        ArrayList arrayList = new ArrayList(methods.size());
        af.a aVarB = af.b.b(h2.f12104b, true, false, null, 6, null);
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (Object obj : methods) {
            if (rd.m.a(((cf.r) obj).getName(), ve.j0.f30601c)) {
                arrayList2.add(obj);
            } else {
                arrayList3.add(obj);
            }
        }
        dd.q qVar2 = new dd.q(arrayList2, arrayList3);
        List list = (List) qVar2.a();
        List<cf.r> list2 = (List) qVar2.b();
        list.size();
        cf.r rVar = (cf.r) ed.q.b0(list);
        if (rVar != null) {
            cf.x xVarG = rVar.g();
            if (xVarG instanceof cf.f) {
                cf.f fVar = (cf.f) xVarG;
                qVar = new dd.q(L().g().l(fVar, aVarB, true), L().g().p(fVar.n(), aVarB));
            } else {
                qVar = new dd.q(L().g().p(xVarG, aVarB), null);
            }
            eg.r0 r0Var = (eg.r0) qVar.a();
            eg.r0 r0Var2 = (eg.r0) qVar.b();
            iVar2 = iVar;
            s0(arrayList, iVar2, 0, rVar, r0Var, r0Var2);
        } else {
            iVar2 = iVar;
        }
        int i10 = 0;
        int i11 = rVar == null ? 0 : 1;
        for (cf.r rVar2 : list2) {
            s0(arrayList, iVar2, i10 + i11, rVar2, L().g().p(rVar2.g(), aVarB), null);
            i10++;
        }
        return arrayList;
    }

    private final he.d F0() {
        boolean zQ = this.f33242o.q();
        if ((this.f33242o.G() || !this.f33242o.u()) && !zQ) {
            return null;
        }
        he.e eVarR = R();
        xe.b bVarT1 = xe.b.t1(eVarR, ie.h.f16054l.b(), true, L().a().t().a(this.f33242o));
        rd.m.d(bVarT1, "createJavaConstructor(...)");
        List listE0 = zQ ? E0(bVarT1) : Collections.EMPTY_LIST;
        bVarT1.Z0(false);
        bVarT1.q1(listE0, Z0(eVarR));
        bVarT1.Y0(true);
        bVarT1.g1(eVarR.s());
        L().a().h().a(this.f33242o, bVarT1);
        return bVarT1;
    }

    private final he.d G0() {
        he.e eVarR = R();
        xe.b bVarT1 = xe.b.t1(eVarR, ie.h.f16054l.b(), true, L().a().t().a(this.f33242o));
        rd.m.d(bVarT1, "createJavaConstructor(...)");
        List listM0 = M0(bVarT1);
        bVarT1.Z0(false);
        bVarT1.q1(listM0, Z0(eVarR));
        bVarT1.Y0(false);
        bVarT1.g1(eVarR.s());
        return bVarT1;
    }

    private final f1 H0(f1 f1Var, he.a aVar, Collection collection) {
        if (d.h0.a(collection) && collection.isEmpty()) {
            return f1Var;
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            f1 f1Var2 = (f1) it.next();
            if (!rd.m.a(f1Var, f1Var2) && f1Var2.e0() == null && Q0(f1Var2, aVar)) {
                he.z zVarBuild = f1Var.u().q().build();
                rd.m.b(zVarBuild);
                return (f1) zVarBuild;
            }
        }
        return f1Var;
    }

    private final f1 I0(he.z zVar, qd.l lVar) {
        Object next;
        mf.f name = zVar.getName();
        rd.m.d(name, "getName(...)");
        Iterator it = ((Iterable) lVar.l(name)).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (e1((f1) next, zVar)) {
                break;
            }
        }
        f1 f1Var = (f1) next;
        if (f1Var == null) {
            return null;
        }
        z.a aVarU = f1Var.u();
        List listI = zVar.i();
        rd.m.d(listI, "getValueParameters(...)");
        ArrayList arrayList = new ArrayList(ed.q.v(listI, 10));
        Iterator it2 = listI.iterator();
        while (it2.hasNext()) {
            arrayList.add(((s1) it2.next()).getType());
        }
        List listI2 = f1Var.i();
        rd.m.d(listI2, "getValueParameters(...)");
        aVarU.c(xe.h.a(arrayList, listI2, zVar));
        aVarU.t();
        aVarU.g();
        aVarU.m(xe.e.Q, Boolean.TRUE);
        return (f1) aVarU.build();
    }

    private final xe.f J0(he.y0 y0Var, qd.l lVar) {
        f1 f1VarX0;
        ke.m0 m0VarM = null;
        if (!P0(y0Var, lVar)) {
            return null;
        }
        f1 f1VarW0 = W0(y0Var, lVar);
        rd.m.b(f1VarW0);
        if (y0Var.j0()) {
            f1VarX0 = X0(y0Var, lVar);
            rd.m.b(f1VarX0);
        } else {
            f1VarX0 = null;
        }
        if (f1VarX0 != null) {
            f1VarX0.l();
            f1VarW0.l();
        }
        xe.d dVar = new xe.d(R(), f1VarW0, f1VarX0, y0Var);
        eg.r0 r0VarG = f1VarW0.g();
        rd.m.b(r0VarG);
        dVar.b1(r0VarG, ed.q.k(), O(), null, ed.q.k());
        ke.l0 l0VarK = qf.h.k(dVar, f1VarW0.getAnnotations(), false, false, false, f1VarW0.getSource());
        l0VarK.M0(f1VarW0);
        l0VarK.P0(dVar.getType());
        rd.m.d(l0VarK, "apply(...)");
        if (f1VarX0 != null) {
            List listI = f1VarX0.i();
            rd.m.d(listI, "getValueParameters(...)");
            s1 s1Var = (s1) ed.q.b0(listI);
            if (s1Var == null) {
                throw new AssertionError("No parameter found for " + f1VarX0);
            }
            m0VarM = qf.h.m(dVar, f1VarX0.getAnnotations(), s1Var.getAnnotations(), false, false, false, f1VarX0.getVisibility(), f1VarX0.getSource());
            m0VarM.M0(f1VarX0);
        }
        dVar.U0(l0VarK, m0VarM);
        return dVar;
    }

    private final xe.f K0(cf.r rVar, eg.r0 r0Var, he.e0 e0Var) {
        xe.f fVar;
        z zVar;
        eg.r0 r0VarA;
        xe.f fVarF1 = xe.f.f1(R(), ye.h.a(L(), rVar), e0Var, ve.v0.d(rVar.getVisibility()), false, rVar.getName(), L().a().t().a(rVar), false);
        rd.m.d(fVarF1, "create(...)");
        ke.l0 l0VarD = qf.h.d(fVarF1, ie.h.f16054l.b());
        rd.m.d(l0VarD, "createDefaultGetter(...)");
        fVarF1.U0(l0VarD, null);
        if (r0Var == null) {
            ye.k kVarI = ye.c.i(L(), fVarF1, rVar, 0, 4, null);
            fVar = fVarF1;
            zVar = this;
            r0VarA = zVar.A(rVar, kVarI);
        } else {
            fVar = fVarF1;
            zVar = this;
            r0VarA = r0Var;
        }
        fVar.b1(r0VarA, ed.q.k(), zVar.O(), null, ed.q.k());
        l0VarD.P0(r0VarA);
        return fVar;
    }

    static /* synthetic */ xe.f L0(z zVar, cf.r rVar, eg.r0 r0Var, he.e0 e0Var, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            r0Var = null;
        }
        return zVar.K0(rVar, r0Var, e0Var);
    }

    private final List M0(ke.i iVar) {
        Collection<cf.w> collectionL = this.f33242o.l();
        ArrayList arrayList = new ArrayList(collectionL.size());
        af.a aVarB = af.b.b(h2.f12104b, false, false, null, 6, null);
        int i10 = 0;
        for (cf.w wVar : collectionL) {
            int i11 = i10 + 1;
            eg.r0 r0VarP = L().g().p(wVar.getType(), aVarB);
            arrayList.add(new ke.u0(iVar, null, i10, ie.h.f16054l.b(), wVar.getName(), r0VarP, false, false, false, wVar.b() ? L().a().m().o().k(r0VarP) : null, L().a().t().a(wVar)));
            i10 = i11;
        }
        return arrayList;
    }

    private final f1 N0(f1 f1Var, mf.f fVar) {
        z.a aVarU = f1Var.u();
        aVarU.r(fVar);
        aVarU.t();
        aVarU.g();
        he.z zVarBuild = aVarU.build();
        rd.m.b(zVarBuild);
        return (f1) zVarBuild;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final he.f1 O0(he.f1 r6) {
        /*
            r5 = this;
            java.util.List r0 = r6.i()
            java.lang.String r1 = "getValueParameters(...)"
            rd.m.d(r0, r1)
            java.lang.Object r0 = ed.q.m0(r0)
            he.s1 r0 = (he.s1) r0
            r2 = 0
            if (r0 == 0) goto L7d
            eg.r0 r3 = r0.getType()
            eg.u1 r3 = r3.N0()
            he.h r3 = r3.q()
            if (r3 == 0) goto L35
            mf.d r3 = uf.e.p(r3)
            if (r3 == 0) goto L35
            boolean r4 = r3.f()
            if (r4 == 0) goto L2d
            goto L2e
        L2d:
            r3 = r2
        L2e:
            if (r3 == 0) goto L35
            mf.c r3 = r3.m()
            goto L36
        L35:
            r3 = r2
        L36:
            mf.c r4 = ee.o.f11857w
            boolean r3 = rd.m.a(r3, r4)
            if (r3 == 0) goto L3f
            goto L40
        L3f:
            r0 = r2
        L40:
            if (r0 != 0) goto L43
            goto L7d
        L43:
            he.z$a r2 = r6.u()
            java.util.List r6 = r6.i()
            rd.m.d(r6, r1)
            r1 = 1
            java.util.List r6 = ed.q.W(r6, r1)
            he.z$a r6 = r2.c(r6)
            eg.r0 r0 = r0.getType()
            java.util.List r0 = r0.L0()
            r2 = 0
            java.lang.Object r0 = r0.get(r2)
            eg.a2 r0 = (eg.a2) r0
            eg.r0 r0 = r0.getType()
            he.z$a r6 = r6.i(r0)
            he.z r6 = r6.build()
            he.f1 r6 = (he.f1) r6
            r0 = r6
            ke.o0 r0 = (ke.o0) r0
            if (r0 == 0) goto L7c
            r0.h1(r1)
        L7c:
            return r6
        L7d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: ze.z.O0(he.f1):he.f1");
    }

    private final boolean P0(he.y0 y0Var, qd.l lVar) {
        if (d.a(y0Var)) {
            return false;
        }
        f1 f1VarW0 = W0(y0Var, lVar);
        f1 f1VarX0 = X0(y0Var, lVar);
        if (f1VarW0 == null) {
            return false;
        }
        if (y0Var.j0()) {
            return f1VarX0 != null && f1VarX0.l() == f1VarW0.l();
        }
        return true;
    }

    private final boolean Q0(he.a aVar, he.a aVar2) {
        o.i.a aVarC = qf.o.f25143f.F(aVar2, aVar, true).c();
        rd.m.d(aVarC, "getResult(...)");
        return aVarC == o.i.a.OVERRIDABLE && !ve.z.f30721a.a(aVar2, aVar);
    }

    private final boolean R0(f1 f1Var) {
        u0.a aVar = ve.u0.f30675a;
        mf.f name = f1Var.getName();
        rd.m.d(name, "getName(...)");
        mf.f fVarB = aVar.b(name);
        if (fVarB == null) {
            return false;
        }
        Set setB1 = b1(fVarB);
        ArrayList arrayList = new ArrayList();
        for (Object obj : setB1) {
            if (ve.t0.d((f1) obj)) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            return false;
        }
        f1 f1VarN0 = N0(f1Var, fVarB);
        if (arrayList.isEmpty()) {
            return false;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (S0((f1) it.next(), f1VarN0)) {
                return true;
            }
        }
        return false;
    }

    private final boolean S0(f1 f1Var, he.z zVar) {
        if (ve.f.f30577o.m(f1Var)) {
            zVar = zVar.a();
        }
        rd.m.b(zVar);
        return Q0(zVar, f1Var);
    }

    private final boolean T0(f1 f1Var) {
        f1 f1VarO0 = O0(f1Var);
        if (f1VarO0 == null) {
            return false;
        }
        mf.f name = f1Var.getName();
        rd.m.d(name, "getName(...)");
        Set<f1> setB1 = b1(name);
        if (d.h0.a(setB1) && setB1.isEmpty()) {
            return false;
        }
        for (f1 f1Var2 : setB1) {
            if (f1Var2.t() && Q0(f1VarO0, f1Var2)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map U0(z zVar) {
        Collection fields = zVar.f33242o.getFields();
        ArrayList arrayList = new ArrayList();
        for (Object obj : fields) {
            if (((cf.n) obj).F()) {
                arrayList.add(obj);
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(xd.d.b(ed.k0.e(ed.q.v(arrayList, 10)), 16));
        for (Object obj2 : arrayList) {
            linkedHashMap.put(((cf.n) obj2).getName(), obj2);
        }
        return linkedHashMap;
    }

    private final f1 V0(he.y0 y0Var, String str, qd.l lVar) {
        f1 f1Var;
        mf.f fVarH = mf.f.h(str);
        rd.m.d(fVarH, "identifier(...)");
        Iterator it = ((Iterable) lVar.l(fVarH)).iterator();
        do {
            f1Var = null;
            if (!it.hasNext()) {
                break;
            }
            f1 f1Var2 = (f1) it.next();
            if (f1Var2.i().size() == 0) {
                fg.e eVar = fg.e.f13057a;
                eg.r0 r0VarG = f1Var2.g();
                if (r0VarG == null ? false : eVar.a(r0VarG, y0Var.getType())) {
                    f1Var = f1Var2;
                }
            }
        } while (f1Var == null);
        return f1Var;
    }

    private final f1 W0(he.y0 y0Var, qd.l lVar) {
        he.z0 z0VarF = y0Var.f();
        he.z0 z0Var = z0VarF != null ? (he.z0) ve.t0.g(z0VarF) : null;
        String strB = z0Var != null ? ve.m.f30651a.b(z0Var) : null;
        if (strB != null && !ve.t0.l(R(), z0Var)) {
            return V0(y0Var, strB, lVar);
        }
        String strD = y0Var.getName().d();
        rd.m.d(strD, "asString(...)");
        return V0(y0Var, ve.i0.b(strD), lVar);
    }

    private final f1 X0(he.y0 y0Var, qd.l lVar) {
        f1 f1Var;
        eg.r0 r0VarG;
        String strD = y0Var.getName().d();
        rd.m.d(strD, "asString(...)");
        mf.f fVarH = mf.f.h(ve.i0.e(strD));
        rd.m.d(fVarH, "identifier(...)");
        Iterator it = ((Iterable) lVar.l(fVarH)).iterator();
        do {
            f1Var = null;
            if (!it.hasNext()) {
                break;
            }
            f1 f1Var2 = (f1) it.next();
            if (f1Var2.i().size() == 1 && (r0VarG = f1Var2.g()) != null && ee.i.D0(r0VarG)) {
                fg.e eVar = fg.e.f13057a;
                List listI = f1Var2.i();
                rd.m.d(listI, "getValueParameters(...)");
                if (eVar.c(((s1) ed.q.w0(listI)).getType(), y0Var.getType())) {
                    f1Var = f1Var2;
                }
            }
        } while (f1Var == null);
        return f1Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Set Y0(ye.k kVar, z zVar) {
        return ed.q.M0(kVar.a().w().h(zVar.R(), kVar));
    }

    private final he.u Z0(he.e eVar) {
        he.u visibility = eVar.getVisibility();
        rd.m.d(visibility, "getVisibility(...)");
        if (!rd.m.a(visibility, ve.y.f30718b)) {
            return visibility;
        }
        he.u uVar = ve.y.f30719c;
        rd.m.d(uVar, "PROTECTED_AND_PACKAGE");
        return uVar;
    }

    private final Set b1(mf.f fVar) {
        Collection collectionC0 = C0();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = collectionC0.iterator();
        while (it.hasNext()) {
            ed.q.A(linkedHashSet, ((eg.r0) it.next()).p().a(fVar, pe.d.f24127x));
        }
        return linkedHashSet;
    }

    private final Set d1(mf.f fVar) {
        Collection collectionC0 = C0();
        ArrayList arrayList = new ArrayList();
        Iterator it = collectionC0.iterator();
        while (it.hasNext()) {
            Collection collectionC = ((eg.r0) it.next()).p().c(fVar, pe.d.f24127x);
            ArrayList arrayList2 = new ArrayList(ed.q.v(collectionC, 10));
            Iterator it2 = collectionC.iterator();
            while (it2.hasNext()) {
                arrayList2.add((he.y0) it2.next());
            }
            ed.q.A(arrayList, arrayList2);
        }
        return ed.q.M0(arrayList);
    }

    private final boolean e1(f1 f1Var, he.z zVar) {
        String strC = ef.c0.c(f1Var, false, false, 2, null);
        he.z zVarA = zVar.a();
        rd.m.d(zVarA, "getOriginal(...)");
        return rd.m.a(strC, ef.c0.c(zVarA, false, false, 2, null)) && !Q0(f1Var, zVar);
    }

    private final boolean f1(f1 f1Var) {
        mf.f name = f1Var.getName();
        rd.m.d(name, "getName(...)");
        List listA = ve.o0.a(name);
        if (!d.h0.a(listA) || !listA.isEmpty()) {
            Iterator it = listA.iterator();
            while (it.hasNext()) {
                Set<he.y0> setD1 = d1((mf.f) it.next());
                if (!d.h0.a(setD1) || !setD1.isEmpty()) {
                    for (he.y0 y0Var : setD1) {
                        if (P0(y0Var, new v(f1Var, this))) {
                            if (!y0Var.j0()) {
                                String strD = f1Var.getName().d();
                                rd.m.d(strD, "asString(...)");
                                if (!ve.i0.d(strD)) {
                                }
                            }
                            return false;
                        }
                    }
                }
            }
        }
        return (R0(f1Var) || s1(f1Var) || T0(f1Var)) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Collection g1(f1 f1Var, z zVar, mf.f fVar) {
        rd.m.e(fVar, "accessorName");
        return rd.m.a(f1Var.getName(), fVar) ? ed.q.e(f1Var) : ed.q.s0(zVar.q1(fVar), zVar.r1(fVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Set h1(z zVar) {
        return ed.q.M0(zVar.f33242o.K());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final he.e i1(z zVar, ye.k kVar, mf.f fVar) {
        rd.m.e(fVar, "name");
        if (((Set) zVar.f33245r.a()).contains(fVar)) {
            ve.u uVarD = kVar.a().d();
            mf.b bVarN = uf.e.n(zVar.R());
            rd.m.b(bVarN);
            cf.g gVarA = uVarD.a(new u.a(bVarN.d(fVar), null, zVar.f33242o, 2, null));
            if (gVarA == null) {
                return null;
            }
            n nVar = new n(kVar, zVar.R(), gVarA, null, 8, null);
            kVar.a().e().a(nVar);
            return nVar;
        }
        if (!((Set) zVar.f33246s.a()).contains(fVar)) {
            cf.n nVar2 = (cf.n) ((Map) zVar.f33247t.a()).get(fVar);
            if (nVar2 == null) {
                return null;
            }
            return ke.q.L0(kVar.e(), zVar.R(), fVar, kVar.e().d(new y(zVar)), ye.h.a(kVar, nVar2), kVar.a().t().a(nVar2));
        }
        List listC = ed.q.c();
        kVar.a().w().b(zVar.R(), fVar, listC, kVar);
        List listA = ed.q.a(listC);
        int size = listA.size();
        if (size == 0) {
            return null;
        }
        if (size == 1) {
            return (he.e) ed.q.w0(listA);
        }
        throw new IllegalStateException(("Multiple classes with same name are generated: " + listA).toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Set j1(z zVar) {
        return ed.r0.j(zVar.b(), zVar.d());
    }

    private final f1 k1(f1 f1Var, qd.l lVar, Collection collection) {
        f1 f1VarI0;
        he.z zVarL = ve.i.l(f1Var);
        if (zVarL != null && (f1VarI0 = I0(zVarL, lVar)) != null) {
            if (!f1(f1VarI0)) {
                f1VarI0 = null;
            }
            if (f1VarI0 != null) {
                return H0(f1VarI0, zVarL, collection);
            }
        }
        return null;
    }

    private final f1 l1(f1 f1Var, qd.l lVar, mf.f fVar, Collection collection) {
        f1 f1Var2 = (f1) ve.t0.g(f1Var);
        if (f1Var2 == null) {
            return null;
        }
        String strE = ve.t0.e(f1Var2);
        rd.m.b(strE);
        mf.f fVarH = mf.f.h(strE);
        rd.m.d(fVarH, "identifier(...)");
        Iterator it = ((Collection) lVar.l(fVarH)).iterator();
        while (it.hasNext()) {
            f1 f1VarN0 = N0((f1) it.next(), fVar);
            if (S0(f1Var2, f1VarN0)) {
                return H0(f1VarN0, f1Var2, collection);
            }
        }
        return null;
    }

    private final f1 m1(f1 f1Var, qd.l lVar) {
        if (!f1Var.t()) {
            return null;
        }
        mf.f name = f1Var.getName();
        rd.m.d(name, "getName(...)");
        Iterator it = ((Iterable) lVar.l(name)).iterator();
        while (it.hasNext()) {
            f1 f1VarO0 = O0((f1) it.next());
            if (f1VarO0 == null || !Q0(f1VarO0, f1Var)) {
                f1VarO0 = null;
            }
            if (f1VarO0 != null) {
                return f1VarO0;
            }
        }
        return null;
    }

    private final xe.b o1(cf.k kVar) {
        he.e eVarR = R();
        xe.b bVarT1 = xe.b.t1(eVarR, ye.h.a(L(), kVar), false, L().a().t().a(kVar));
        rd.m.d(bVarT1, "createJavaConstructor(...)");
        ye.k kVarH = ye.c.h(L(), bVarT1, kVar, eVarR.v().size());
        t0.b bVarD0 = d0(kVarH, bVarT1, kVar.i());
        List listV = eVarR.v();
        rd.m.d(listV, "getDeclaredTypeParameters(...)");
        List typeParameters = kVar.getTypeParameters();
        ArrayList arrayList = new ArrayList(ed.q.v(typeParameters, 10));
        Iterator it = typeParameters.iterator();
        while (it.hasNext()) {
            he.l1 l1VarA = kVarH.f().a((cf.y) it.next());
            rd.m.b(l1VarA);
            arrayList.add(l1VarA);
        }
        bVarT1.r1(bVarD0.a(), ve.v0.d(kVar.getVisibility()), ed.q.s0(listV, arrayList));
        bVarT1.Y0(false);
        bVarT1.Z0(bVarD0.b());
        bVarT1.g1(eVarR.s());
        kVarH.a().h().a(kVar, bVarT1);
        return bVarT1;
    }

    private final xe.e p1(cf.w wVar) {
        xe.e eVarP1 = xe.e.p1(R(), ye.h.a(L(), wVar), wVar.getName(), L().a().t().a(wVar), true);
        rd.m.d(eVarP1, "createJavaMethod(...)");
        eVarP1.o1(null, O(), ed.q.k(), ed.q.k(), ed.q.k(), L().g().p(wVar.getType(), af.b.b(h2.f12104b, false, false, null, 6, null)), he.e0.f15258a.a(false, false, true), he.t.f15309e, null);
        eVarP1.s1(false, false);
        L().a().h().d(wVar, eVarP1);
        return eVarP1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Collection q1(mf.f fVar) {
        Collection collectionF = ((c) N().a()).f(fVar);
        ArrayList arrayList = new ArrayList(ed.q.v(collectionF, 10));
        Iterator it = collectionF.iterator();
        while (it.hasNext()) {
            arrayList.add(Z((cf.r) it.next()));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Collection r1(mf.f fVar) {
        Set setB1 = b1(fVar);
        ArrayList arrayList = new ArrayList();
        for (Object obj : setB1) {
            f1 f1Var = (f1) obj;
            if (!ve.t0.d(f1Var) && ve.i.l(f1Var) == null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    private final void s0(List list, he.l lVar, int i10, cf.r rVar, eg.r0 r0Var, eg.r0 r0Var2) {
        ie.h hVarB = ie.h.f16054l.b();
        mf.f name = rVar.getName();
        eg.r0 r0VarN = i2.n(r0Var);
        rd.m.d(r0VarN, "makeNotNullable(...)");
        list.add(new ke.u0(lVar, null, i10, hVarB, name, r0VarN, rVar.L(), false, false, r0Var2 != null ? i2.n(r0Var2) : null, L().a().t().a(rVar)));
    }

    private final boolean s1(f1 f1Var) {
        ve.i iVar = ve.i.f30587o;
        mf.f name = f1Var.getName();
        rd.m.d(name, "getName(...)");
        if (!iVar.n(name)) {
            return false;
        }
        mf.f name2 = f1Var.getName();
        rd.m.d(name2, "getName(...)");
        Set setB1 = b1(name2);
        ArrayList arrayList = new ArrayList();
        Iterator it = setB1.iterator();
        while (it.hasNext()) {
            he.z zVarL = ve.i.l((f1) it.next());
            if (zVarL != null) {
                arrayList.add(zVarL);
            }
        }
        if (arrayList.isEmpty()) {
            return false;
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            if (e1(f1Var, (he.z) it2.next())) {
                return true;
            }
        }
        return false;
    }

    private final void t0(Collection collection, mf.f fVar, Collection collection2, boolean z10) {
        Collection<f1> collectionD = we.a.d(fVar, collection2, collection, R(), L().a().c(), L().a().k().b());
        rd.m.d(collectionD, "resolveOverridesForNonStaticMembers(...)");
        if (!z10) {
            collection.addAll(collectionD);
            return;
        }
        List listS0 = ed.q.s0(collection, collectionD);
        ArrayList arrayList = new ArrayList(ed.q.v(collectionD, 10));
        for (f1 f1VarH0 : collectionD) {
            f1 f1Var = (f1) ve.t0.j(f1VarH0);
            if (f1Var == null) {
                rd.m.b(f1VarH0);
            } else {
                rd.m.b(f1VarH0);
                f1VarH0 = H0(f1VarH0, f1Var, listS0);
            }
            arrayList.add(f1VarH0);
        }
        collection.addAll(arrayList);
    }

    private final void u0(mf.f fVar, Collection collection, Collection collection2, Collection collection3, qd.l lVar) {
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            f1 f1Var = (f1) it.next();
            og.a.a(collection3, l1(f1Var, lVar, fVar, collection));
            og.a.a(collection3, k1(f1Var, lVar, collection));
            og.a.a(collection3, m1(f1Var, lVar));
        }
    }

    private final void v0(Set set, Collection collection, Set set2, qd.l lVar) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            he.y0 y0Var = (he.y0) it.next();
            xe.f fVarJ0 = J0(y0Var, lVar);
            if (fVarJ0 != null) {
                collection.add(fVarJ0);
                if (set2 != null) {
                    set2.add(y0Var);
                    return;
                }
                return;
            }
        }
    }

    private final void w0(mf.f fVar, Collection collection) {
        cf.r rVar = (cf.r) ed.q.x0(((c) N().a()).f(fVar));
        if (rVar == null) {
            return;
        }
        collection.add(L0(this, rVar, null, he.e0.f15259b, 2, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean z0(cf.q qVar) {
        rd.m.e(qVar, "it");
        return !qVar.O();
    }

    @Override // ze.t0
    protected void B(Collection collection, mf.f fVar) {
        rd.m.e(collection, "result");
        rd.m.e(fVar, "name");
        Set setB1 = b1(fVar);
        if (!ve.u0.f30675a.k(fVar) && !ve.i.f30587o.n(fVar)) {
            if (!d.h0.a(setB1) || !setB1.isEmpty()) {
                Iterator it = setB1.iterator();
                while (it.hasNext()) {
                    if (((he.z) it.next()).t()) {
                    }
                }
            }
            ArrayList arrayList = new ArrayList();
            for (Object obj : setB1) {
                if (f1((f1) obj)) {
                    arrayList.add(obj);
                }
            }
            t0(collection, fVar, arrayList, false);
            return;
        }
        og.k kVarA = og.k.f23578c.a();
        Collection collectionD = we.a.d(fVar, setB1, ed.q.k(), R(), ag.w.f597a, L().a().k().b());
        rd.m.d(collectionD, "resolveOverridesForNonStaticMembers(...)");
        u0(fVar, collection, collectionD, collection, new a(this));
        u0(fVar, collection, collectionD, kVarA, new b(this));
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : setB1) {
            if (f1((f1) obj2)) {
                arrayList2.add(obj2);
            }
        }
        t0(collection, fVar, ed.q.s0(arrayList2, kVarA), true);
    }

    @Override // ze.t0
    protected void C(mf.f fVar, Collection collection) {
        rd.m.e(fVar, "name");
        rd.m.e(collection, "result");
        if (this.f33242o.q()) {
            w0(fVar, collection);
        }
        Set setD1 = d1(fVar);
        if (setD1.isEmpty()) {
            return;
        }
        k.b bVar = og.k.f23578c;
        og.k kVarA = bVar.a();
        og.k kVarA2 = bVar.a();
        v0(setD1, collection, kVarA, new w(this));
        v0(ed.r0.h(setD1, kVarA), kVarA2, null, new x(this));
        Collection collectionD = we.a.d(fVar, ed.r0.j(setD1, kVarA2), collection, R(), L().a().c(), L().a().k().b());
        rd.m.d(collectionD, "resolveOverridesForNonStaticMembers(...)");
        collection.addAll(collectionD);
    }

    @Override // ze.t0
    protected Set D(xf.d dVar, qd.l lVar) {
        rd.m.e(dVar, "kindFilter");
        if (this.f33242o.q()) {
            return b();
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(((c) N().a()).e());
        Collection collectionE = R().k().e();
        rd.m.d(collectionE, "getSupertypes(...)");
        Iterator it = collectionE.iterator();
        while (it.hasNext()) {
            ed.q.A(linkedHashSet, ((eg.r0) it.next()).p().d());
        }
        return linkedHashSet;
    }

    @Override // ze.t0
    protected he.b1 O() {
        return qf.i.l(R());
    }

    @Override // ze.t0
    protected boolean V(xe.e eVar) {
        rd.m.e(eVar, "<this>");
        if (this.f33242o.q()) {
            return false;
        }
        return f1(eVar);
    }

    @Override // ze.t0
    protected t0.a Y(cf.r rVar, List list, eg.r0 r0Var, List list2) {
        rd.m.e(rVar, "method");
        rd.m.e(list, "methodTypeParameters");
        rd.m.e(r0Var, "returnType");
        rd.m.e(list2, "valueParameters");
        o.b bVarB = L().a().s().b(rVar, R(), r0Var, null, list2, list);
        rd.m.d(bVarB, "resolvePropagatedSignature(...)");
        eg.r0 r0VarD = bVarB.d();
        rd.m.d(r0VarD, "getReturnType(...)");
        eg.r0 r0VarC = bVarB.c();
        List listF = bVarB.f();
        rd.m.d(listF, "getValueParameters(...)");
        List listE = bVarB.e();
        rd.m.d(listE, "getTypeParameters(...)");
        boolean zG = bVarB.g();
        List listB = bVarB.b();
        rd.m.d(listB, "getErrors(...)");
        return new t0.a(r0VarD, r0VarC, listF, listE, zG, listB);
    }

    @Override // ze.t0, xf.l, xf.k
    public Collection a(mf.f fVar, pe.b bVar) {
        rd.m.e(fVar, "name");
        rd.m.e(bVar, "location");
        n1(fVar, bVar);
        return super.a(fVar, bVar);
    }

    public final dg.i a1() {
        return this.f33244q;
    }

    @Override // ze.t0, xf.l, xf.k
    public Collection c(mf.f fVar, pe.b bVar) {
        rd.m.e(fVar, "name");
        rd.m.e(bVar, "location");
        n1(fVar, bVar);
        return super.c(fVar, bVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ze.t0
    /* JADX INFO: renamed from: c1, reason: merged with bridge method [inline-methods] */
    public he.e R() {
        return this.f33241n;
    }

    @Override // xf.l, xf.n
    public he.h g(mf.f fVar, pe.b bVar) {
        dg.h hVar;
        he.e eVar;
        rd.m.e(fVar, "name");
        rd.m.e(bVar, "location");
        n1(fVar, bVar);
        z zVar = (z) Q();
        return (zVar == null || (hVar = zVar.f33248u) == null || (eVar = (he.e) hVar.l(fVar)) == null) ? (he.h) this.f33248u.l(fVar) : eVar;
    }

    public void n1(mf.f fVar, pe.b bVar) {
        rd.m.e(fVar, "name");
        rd.m.e(bVar, "location");
        oe.a.a(L().a().l(), bVar, R(), fVar);
    }

    @Override // ze.t0
    public String toString() {
        return "Lazy Java member scope for " + this.f33242o.d();
    }

    @Override // ze.t0
    protected Set v(xf.d dVar, qd.l lVar) {
        rd.m.e(dVar, "kindFilter");
        return ed.r0.j((Set) this.f33245r.a(), ((Map) this.f33247t.a()).keySet());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ze.t0
    /* JADX INFO: renamed from: x0, reason: merged with bridge method [inline-methods] */
    public LinkedHashSet x(xf.d dVar, qd.l lVar) {
        rd.m.e(dVar, "kindFilter");
        Collection collectionE = R().k().e();
        rd.m.d(collectionE, "getSupertypes(...)");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = collectionE.iterator();
        while (it.hasNext()) {
            ed.q.A(linkedHashSet, ((eg.r0) it.next()).p().b());
        }
        linkedHashSet.addAll(((c) N().a()).a());
        linkedHashSet.addAll(((c) N().a()).d());
        linkedHashSet.addAll(v(dVar, lVar));
        linkedHashSet.addAll(L().a().w().f(R(), L()));
        return linkedHashSet;
    }

    @Override // ze.t0
    protected void y(Collection collection, mf.f fVar) {
        rd.m.e(collection, "result");
        rd.m.e(fVar, "name");
        if (this.f33242o.s() && ((c) N().a()).c(fVar) != null) {
            if (collection.isEmpty()) {
                cf.w wVarC = ((c) N().a()).c(fVar);
                rd.m.b(wVarC);
                collection.add(p1(wVarC));
            } else {
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    if (((f1) it.next()).i().isEmpty()) {
                        break;
                    }
                }
                cf.w wVarC2 = ((c) N().a()).c(fVar);
                rd.m.b(wVarC2);
                collection.add(p1(wVarC2));
            }
        }
        L().a().w().c(R(), fVar, collection, L());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ze.t0
    /* JADX INFO: renamed from: y0, reason: merged with bridge method [inline-methods] */
    public ze.b z() {
        return new ze.b(this.f33242o, u.f33230a);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(ye.k kVar, he.e eVar, cf.g gVar, boolean z10, z zVar) {
        super(kVar, zVar);
        rd.m.e(kVar, "c");
        rd.m.e(eVar, "ownerDescriptor");
        rd.m.e(gVar, "jClass");
        this.f33241n = eVar;
        this.f33242o = gVar;
        this.f33243p = z10;
        this.f33244q = kVar.e().d(new p(this, kVar));
        this.f33245r = kVar.e().d(new q(this));
        this.f33246s = kVar.e().d(new r(kVar, this));
        this.f33247t = kVar.e().d(new s(this));
        this.f33248u = kVar.e().h(new t(this, kVar));
    }
}
