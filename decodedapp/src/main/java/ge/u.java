package ge;

import ag.l0;
import dd.d0;
import ef.f0;
import eg.c1;
import eg.f2;
import eg.r0;
import eg.x0;
import ge.k;
import he.b;
import he.e0;
import he.f1;
import he.g1;
import he.h0;
import he.m0;
import he.s1;
import he.z;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import og.b;
import og.k;
import qf.o;
import rd.b0;
import rd.c0;
import xf.k;

/* JADX INFO: loaded from: classes3.dex */
public final class u implements je.a, je.c {

    /* JADX INFO: renamed from: i */
    static final /* synthetic */ yd.j[] f13856i = {c0.f(new rd.w(u.class, "settings", "getSettings()Lorg/jetbrains/kotlin/builtins/jvm/JvmBuiltIns$Settings;", 0)), c0.f(new rd.w(u.class, "cloneableType", "getCloneableType()Lorg/jetbrains/kotlin/types/SimpleType;", 0)), c0.f(new rd.w(u.class, "notConsideredDeprecation", "getNotConsideredDeprecation()Lorg/jetbrains/kotlin/descriptors/annotations/Annotations;", 0))};

    /* JADX INFO: renamed from: a */
    private final h0 f13857a;

    /* JADX INFO: renamed from: b */
    private final ge.d f13858b;

    /* JADX INFO: renamed from: c */
    private final dg.i f13859c;

    /* JADX INFO: renamed from: d */
    private final r0 f13860d;

    /* JADX INFO: renamed from: e */
    private final dg.i f13861e;

    /* JADX INFO: renamed from: f */
    private final dg.a f13862f;

    /* JADX INFO: renamed from: g */
    private final dg.i f13863g;

    /* JADX INFO: renamed from: h */
    private final dg.g f13864h;

    private static final class a extends Enum {

        /* JADX INFO: renamed from: a */
        public static final a f13865a = new a("HIDDEN", 0);

        /* JADX INFO: renamed from: b */
        public static final a f13866b = new a("VISIBLE", 1);

        /* JADX INFO: renamed from: c */
        public static final a f13867c = new a("DEPRECATED_LIST_METHODS", 2);

        /* JADX INFO: renamed from: d */
        public static final a f13868d = new a("NOT_CONSIDERED", 3);

        /* JADX INFO: renamed from: e */
        public static final a f13869e = new a("DROP", 4);

        /* JADX INFO: renamed from: f */
        private static final /* synthetic */ a[] f13870f;

        /* JADX INFO: renamed from: g */
        private static final /* synthetic */ kd.a f13871g;

        static {
            a[] aVarArrA = a();
            f13870f = aVarArrA;
            f13871g = kd.b.a(aVarArrA);
        }

        private a(String str, int i10) {
            super(str, i10);
        }

        private static final /* synthetic */ a[] a() {
            return new a[]{f13865a, f13866b, f13867c, f13868d, f13869e};
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f13870f.clone();
        }
    }

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f13872a;

        static {
            int[] iArr = new int[a.values().length];
            try {
                iArr[a.f13865a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.f13867c.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[a.f13868d.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[a.f13869e.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[a.f13866b.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f13872a = iArr;
        }
    }

    public static final class c extends ke.h0 {
        c(h0 h0Var, mf.c cVar) {
            super(h0Var, cVar);
        }

        @Override // he.n0
        /* JADX INFO: renamed from: G0 */
        public k.b p() {
            return k.b.f32079b;
        }
    }

    public static final class d extends b.AbstractC0321b {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ String f13873a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ b0 f13874b;

        d(String str, b0 b0Var) {
            this.f13873a = str;
            this.f13874b = b0Var;
        }

        @Override // og.b.d
        /* JADX INFO: renamed from: d */
        public boolean c(he.e eVar) {
            rd.m.e(eVar, "javaClassDescriptor");
            String strA = ef.b0.a(f0.f11965a, eVar, this.f13873a);
            x xVar = x.f13878a;
            if (xVar.f().contains(strA)) {
                this.f13874b.f25935a = a.f13865a;
            } else if (xVar.i().contains(strA)) {
                this.f13874b.f25935a = a.f13866b;
            } else if (xVar.c().contains(strA)) {
                this.f13874b.f25935a = a.f13867c;
            } else if (xVar.d().contains(strA)) {
                this.f13874b.f25935a = a.f13869e;
            }
            return this.f13874b.f25935a == null;
        }

        @Override // og.b.d
        /* JADX INFO: renamed from: e */
        public a a() {
            a aVar = (a) this.f13874b.f25935a;
            return aVar == null ? a.f13868d : aVar;
        }
    }

    public u(h0 h0Var, dg.n nVar, qd.a aVar) {
        rd.m.e(h0Var, "moduleDescriptor");
        rd.m.e(nVar, "storageManager");
        rd.m.e(aVar, "settingsComputation");
        this.f13857a = h0Var;
        this.f13858b = ge.d.f13816a;
        this.f13859c = nVar.d(aVar);
        this.f13860d = q(nVar);
        this.f13861e = nVar.d(new l(this, nVar));
        this.f13862f = nVar.c();
        this.f13863g = nVar.d(new m(this));
        this.f13864h = nVar.f(new n(this));
    }

    private final a A(z zVar) {
        he.m mVarB = zVar.b();
        rd.m.c(mVarB, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
        Object objB = og.b.b(ed.q.e((he.e) mVarB), new t(this), new d(ef.c0.c(zVar, false, false, 3, null), new b0()));
        rd.m.d(objB, "dfs(...)");
        return (a) objB;
    }

    public static final Iterable B(u uVar, he.e eVar) {
        Collection collectionE = eVar.k().e();
        rd.m.d(collectionE, "getSupertypes(...)");
        ArrayList arrayList = new ArrayList();
        Iterator it = collectionE.iterator();
        while (it.hasNext()) {
            he.h hVarQ = ((r0) it.next()).N0().q();
            he.e eVarZ = null;
            he.h hVarA = hVarQ != null ? hVarQ.a() : null;
            he.e eVar2 = hVarA instanceof he.e ? (he.e) hVarA : null;
            if (eVar2 != null && (eVarZ = uVar.z(eVar2)) == null) {
                eVarZ = eVar2;
            }
            if (eVarZ != null) {
                arrayList.add(eVarZ);
            }
        }
        return arrayList;
    }

    private final ie.h C() {
        return (ie.h) dg.m.a(this.f13863g, this, f13856i[2]);
    }

    private final k.b D() {
        return (k.b) dg.m.a(this.f13859c, this, f13856i[0]);
    }

    private final boolean E(f1 f1Var, boolean z10) {
        he.m mVarB = f1Var.b();
        rd.m.c(mVarB, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
        String strC = ef.c0.c(f1Var, false, false, 3, null);
        if (z10 ^ x.f13878a.g().contains(ef.b0.a(f0.f11965a, (he.e) mVarB, strC))) {
            return true;
        }
        Boolean boolE = og.b.e(ed.q.e(f1Var), r.f13853a, new s(this));
        rd.m.d(boolE, "ifAny(...)");
        return boolE.booleanValue();
    }

    public static final Iterable F(he.b bVar) {
        return bVar.a().e();
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Boolean G(ge.u r2, he.b r3) {
        /*
            he.b$a r0 = r3.j()
            he.b$a r1 = he.b.a.DECLARATION
            if (r0 != r1) goto L1d
            ge.d r2 = r2.f13858b
            he.m r3 = r3.b()
            java.lang.String r0 = "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor"
            rd.m.c(r3, r0)
            he.e r3 = (he.e) r3
            boolean r2 = r2.c(r3)
            if (r2 == 0) goto L1d
            r2 = 1
            goto L1e
        L1d:
            r2 = 0
        L1e:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: ge.u.G(ge.u, he.b):java.lang.Boolean");
    }

    private final boolean H(he.l lVar, he.e eVar) {
        if (lVar.i().size() != 1) {
            return false;
        }
        List listI = lVar.i();
        rd.m.d(listI, "getValueParameters(...)");
        he.h hVarQ = ((s1) ed.q.w0(listI)).getType().N0().q();
        return rd.m.a(hVarQ != null ? uf.e.p(hVarQ) : null, uf.e.p(eVar));
    }

    public static final ie.h I(u uVar) {
        return ie.h.f16054l.a(ed.q.e(ie.g.c(uVar.f13857a.o(), "This member is not fully supported by Kotlin compiler, so it may be absent or have different signature in next major version", null, null, true, 6, null)));
    }

    public static final c1 o(u uVar, dg.n nVar) {
        return he.y.d(uVar.D().a(), g.f13820d.a(), new m0(nVar, uVar.D().a())).s();
    }

    private final f1 p(cg.m mVar, f1 f1Var) {
        z.a aVarU = f1Var.u();
        aVarU.j(mVar);
        aVarU.h(he.t.f15309e);
        aVarU.i(mVar.s());
        aVarU.d(mVar.J0());
        z zVarBuild = aVarU.build();
        rd.m.b(zVarBuild);
        return (f1) zVarBuild;
    }

    private final r0 q(dg.n nVar) {
        ke.k kVar = new ke.k(new c(this.f13857a, new mf.c("java.io")), mf.f.h("Serializable"), e0.f15262e, he.f.f15272c, ed.q.e(new x0(nVar, new o(this))), g1.f15281a, false, nVar);
        kVar.K0(k.b.f32079b, ed.r0.d(), null);
        c1 c1VarS = kVar.s();
        rd.m.d(c1VarS, "getDefaultType(...)");
        return c1VarS;
    }

    public static final r0 r(u uVar) {
        c1 c1VarI = uVar.f13857a.o().i();
        rd.m.d(c1VarI, "getAnyType(...)");
        return c1VarI;
    }

    public static final ie.h s(u uVar, dd.q qVar) {
        rd.m.e(qVar, "<destruct>");
        String str = (String) qVar.a();
        String str2 = (String) qVar.b();
        return ie.h.f16054l.a(ed.q.e(ie.g.b(uVar.f13857a.o(), '\'' + str + "()' member of List is redundant in Kotlin and might be removed soon. Please use '" + str2 + "()' stdlib extension instead", str2 + "()", "HIDDEN", false)));
    }

    private final Collection t(he.e eVar, qd.l lVar) {
        ze.n nVarZ = z(eVar);
        if (nVarZ == null) {
            return ed.q.k();
        }
        Collection collectionG = this.f13858b.g(uf.e.o(nVarZ), ge.b.f13794h.a());
        he.e eVar2 = (he.e) ed.q.l0(collectionG);
        if (eVar2 == null) {
            return ed.q.k();
        }
        k.b bVar = og.k.f23578c;
        ArrayList arrayList = new ArrayList(ed.q.v(collectionG, 10));
        Iterator it = collectionG.iterator();
        while (it.hasNext()) {
            arrayList.add(uf.e.o((he.e) it.next()));
        }
        og.k kVarB = bVar.b(arrayList);
        boolean zC = this.f13858b.c(eVar);
        xf.k kVarE0 = ((he.e) this.f13862f.b(uf.e.o(nVarZ), new q(nVarZ, eVar2))).E0();
        rd.m.d(kVarE0, "getUnsubstitutedMemberScope(...)");
        Iterable iterable = (Iterable) lVar.l(kVarE0);
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : iterable) {
            f1 f1Var = (f1) obj;
            if (f1Var.j() == b.a.DECLARATION && f1Var.getVisibility().d() && !ee.i.l0(f1Var)) {
                Collection collectionE = f1Var.e();
                rd.m.d(collectionE, "getOverriddenDescriptors(...)");
                if (!d.h0.a(collectionE) || !collectionE.isEmpty()) {
                    Iterator it2 = collectionE.iterator();
                    while (it2.hasNext()) {
                        he.m mVarB = ((z) it2.next()).b();
                        rd.m.d(mVarB, "getContainingDeclaration(...)");
                        if (kVarB.contains(uf.e.o(mVarB))) {
                            break;
                        }
                    }
                }
                if (!E(f1Var, zC)) {
                    arrayList2.add(obj);
                }
            }
        }
        return arrayList2;
    }

    public static final he.e u(ze.n nVar, he.e eVar) {
        we.j jVar = we.j.f31416a;
        rd.m.d(jVar, "EMPTY");
        return nVar.P0(jVar, eVar);
    }

    private final c1 v() {
        return (c1) dg.m.a(this.f13861e, this, f13856i[1]);
    }

    private static final boolean w(he.l lVar, f2 f2Var, he.l lVar2) {
        return qf.o.x(lVar, lVar2.c(f2Var)) == o.i.a.OVERRIDABLE;
    }

    public static final Collection x(mf.f fVar, xf.k kVar) {
        rd.m.e(kVar, "it");
        return kVar.a(fVar, pe.d.f24116d);
    }

    private final ze.n z(he.e eVar) {
        mf.b bVarN;
        mf.c cVarA;
        if (ee.i.b0(eVar) || !ee.i.C0(eVar)) {
            return null;
        }
        mf.d dVarP = uf.e.p(eVar);
        if (dVarP.f() && (bVarN = ge.c.f13796a.n(dVarP)) != null && (cVarA = bVarN.a()) != null) {
            he.e eVarD = he.s.d(D().a(), cVarA, pe.d.f24116d);
            if (eVarD instanceof ze.n) {
                return (ze.n) eVarD;
            }
        }
        return null;
    }

    @Override // je.c
    public boolean a(he.e eVar, f1 f1Var) {
        rd.m.e(eVar, "classDescriptor");
        rd.m.e(f1Var, "functionDescriptor");
        ze.n nVarZ = z(eVar);
        if (nVarZ == null || !f1Var.getAnnotations().H(je.d.a())) {
            return true;
        }
        if (!D().b()) {
            return false;
        }
        String strC = ef.c0.c(f1Var, false, false, 3, null);
        ze.z zVarE0 = nVarZ.E0();
        mf.f name = f1Var.getName();
        rd.m.d(name, "getName(...)");
        Collection collectionA = zVarE0.a(name, pe.d.f24116d);
        if (d.h0.a(collectionA) && collectionA.isEmpty()) {
            return false;
        }
        Iterator it = collectionA.iterator();
        while (it.hasNext()) {
            if (rd.m.a(ef.c0.c((f1) it.next(), false, false, 3, null), strC)) {
                return true;
            }
        }
        return false;
    }

    @Override // je.a
    public Collection b(mf.f fVar, he.e eVar) {
        ie.h hVar;
        rd.m.e(fVar, "name");
        rd.m.e(eVar, "classDescriptor");
        if (rd.m.a(fVar, ge.a.f13792e.a()) && (eVar instanceof cg.m) && ee.i.f0(eVar)) {
            cg.m mVar = (cg.m) eVar;
            List listX0 = mVar.e1().X0();
            rd.m.d(listX0, "getFunctionList(...)");
            if (!d.h0.a(listX0) || !listX0.isEmpty()) {
                Iterator it = listX0.iterator();
                while (it.hasNext()) {
                    if (rd.m.a(l0.b(mVar.d1().g(), ((gf.j) it.next()).C0()), ge.a.f13792e.a())) {
                        return ed.q.k();
                    }
                }
            }
            return ed.q.e(p(mVar, (f1) ed.q.v0(v().p().a(fVar, pe.d.f24116d))));
        }
        if (!D().b()) {
            return ed.q.k();
        }
        Collection<f1> collectionT = t(eVar, new p(fVar));
        ArrayList arrayList = new ArrayList();
        for (f1 f1Var : collectionT) {
            he.m mVarB = f1Var.b();
            rd.m.c(mVarB, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
            z zVarC = f1Var.c(y.a((he.e) mVarB, eVar).c());
            rd.m.c(zVarC, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.SimpleFunctionDescriptor");
            z.a aVarU = ((f1) zVarC).u();
            aVarU.j(eVar);
            aVarU.d(eVar.J0());
            aVarU.g();
            int i10 = b.f13872a[A(f1Var).ordinal()];
            f1 f1Var2 = null;
            if (i10 != 1) {
                if (i10 == 2) {
                    mf.f name = f1Var.getName();
                    if (rd.m.a(name, v.f13875a)) {
                        hVar = (ie.h) this.f13864h.l(dd.w.a(f1Var.getName().d(), "first"));
                    } else {
                        if (!rd.m.a(name, v.f13876b)) {
                            throw new IllegalStateException(("Unexpected name: " + f1Var.getName()).toString());
                        }
                        hVar = (ie.h) this.f13864h.l(dd.w.a(f1Var.getName().d(), "last"));
                    }
                    aVarU.n(hVar);
                } else if (i10 == 3) {
                    aVarU.n(C());
                } else if (i10 != 4) {
                    if (i10 != 5) {
                        throw new dd.o();
                    }
                    d0 d0Var = d0.f10897a;
                }
                z zVarBuild = aVarU.build();
                rd.m.b(zVarBuild);
                f1Var2 = (f1) zVarBuild;
            } else if (!he.f0.a(eVar)) {
                aVarU.k();
                z zVarBuild2 = aVarU.build();
                rd.m.b(zVarBuild2);
                f1Var2 = (f1) zVarBuild2;
            }
            if (f1Var2 != null) {
                arrayList.add(f1Var2);
            }
        }
        return arrayList;
    }

    @Override // je.a
    public Collection c(he.e eVar) {
        rd.m.e(eVar, "classDescriptor");
        mf.d dVarP = uf.e.p(eVar);
        x xVar = x.f13878a;
        return xVar.j(dVarP) ? ed.q.n(v(), this.f13860d) : xVar.k(dVarP) ? ed.q.e(this.f13860d) : ed.q.k();
    }

    @Override // je.a
    public Collection e(he.e eVar) {
        rd.m.e(eVar, "classDescriptor");
        if (eVar.j() != he.f.f15271b || !D().b()) {
            return ed.q.k();
        }
        ze.n nVarZ = z(eVar);
        if (nVarZ == null) {
            return ed.q.k();
        }
        he.e eVarF = ge.d.f(this.f13858b, uf.e.o(nVarZ), ge.b.f13794h.a(), null, 4, null);
        if (eVarF == null) {
            return ed.q.k();
        }
        f2 f2VarC = y.a(eVarF, nVarZ).c();
        List constructors = nVarZ.getConstructors();
        ArrayList<he.d> arrayList = new ArrayList();
        for (Object obj : constructors) {
            he.d dVar = (he.d) obj;
            if (dVar.getVisibility().d()) {
                Collection<he.d> constructors2 = eVarF.getConstructors();
                rd.m.d(constructors2, "getConstructors(...)");
                if (!d.h0.a(constructors2) || !constructors2.isEmpty()) {
                    for (he.d dVar2 : constructors2) {
                        rd.m.b(dVar2);
                        if (w(dVar2, f2VarC, dVar)) {
                            break;
                        }
                    }
                }
                if (!H(dVar, eVar) && !ee.i.l0(dVar) && !x.f13878a.e().contains(ef.b0.a(f0.f11965a, nVarZ, ef.c0.c(dVar, false, false, 3, null)))) {
                    arrayList.add(obj);
                }
            }
        }
        ArrayList arrayList2 = new ArrayList(ed.q.v(arrayList, 10));
        for (he.d dVar3 : arrayList) {
            z.a aVarU = dVar3.u();
            aVarU.j(eVar);
            aVarU.i(eVar.s());
            aVarU.g();
            aVarU.f(f2VarC.j());
            if (!x.f13878a.h().contains(ef.b0.a(f0.f11965a, nVarZ, ef.c0.c(dVar3, false, false, 3, null)))) {
                aVarU.n(C());
            }
            z zVarBuild = aVarU.build();
            rd.m.c(zVarBuild, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassConstructorDescriptor");
            arrayList2.add((he.d) zVarBuild);
        }
        return arrayList2;
    }

    @Override // je.a
    /* JADX INFO: renamed from: y */
    public Set d(he.e eVar) {
        ze.z zVarE0;
        Set setB;
        rd.m.e(eVar, "classDescriptor");
        if (!D().b()) {
            return ed.r0.d();
        }
        ze.n nVarZ = z(eVar);
        return (nVarZ == null || (zVarE0 = nVarZ.E0()) == null || (setB = zVarE0.b()) == null) ? ed.r0.d() : setB;
    }
}
