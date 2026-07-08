package ze;

import eg.h2;
import eg.i2;
import he.f1;
import he.l1;
import he.t1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import xf.c;

/* JADX INFO: loaded from: classes3.dex */
public abstract class t0 extends xf.l {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    static final /* synthetic */ yd.j[] f33210m = {rd.c0.f(new rd.w(t0.class, "functionNamesLazy", "getFunctionNamesLazy()Ljava/util/Set;", 0)), rd.c0.f(new rd.w(t0.class, "propertyNamesLazy", "getPropertyNamesLazy()Ljava/util/Set;", 0)), rd.c0.f(new rd.w(t0.class, "classNamesLazy", "getClassNamesLazy()Ljava/util/Set;", 0))};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ye.k f33211b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final t0 f33212c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final dg.i f33213d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final dg.i f33214e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final dg.g f33215f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final dg.h f33216g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final dg.g f33217h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final dg.i f33218i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final dg.i f33219j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final dg.i f33220k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final dg.g f33221l;

    protected static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final eg.r0 f33222a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final eg.r0 f33223b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final List f33224c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final List f33225d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final boolean f33226e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final List f33227f;

        public a(eg.r0 r0Var, eg.r0 r0Var2, List list, List list2, boolean z10, List list3) {
            rd.m.e(r0Var, "returnType");
            rd.m.e(list, "valueParameters");
            rd.m.e(list2, "typeParameters");
            rd.m.e(list3, "errors");
            this.f33222a = r0Var;
            this.f33223b = r0Var2;
            this.f33224c = list;
            this.f33225d = list2;
            this.f33226e = z10;
            this.f33227f = list3;
        }

        public final List a() {
            return this.f33227f;
        }

        public final boolean b() {
            return this.f33226e;
        }

        public final eg.r0 c() {
            return this.f33223b;
        }

        public final eg.r0 d() {
            return this.f33222a;
        }

        public final List e() {
            return this.f33225d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return rd.m.a(this.f33222a, aVar.f33222a) && rd.m.a(this.f33223b, aVar.f33223b) && rd.m.a(this.f33224c, aVar.f33224c) && rd.m.a(this.f33225d, aVar.f33225d) && this.f33226e == aVar.f33226e && rd.m.a(this.f33227f, aVar.f33227f);
        }

        public final List f() {
            return this.f33224c;
        }

        public int hashCode() {
            int iHashCode = this.f33222a.hashCode() * 31;
            eg.r0 r0Var = this.f33223b;
            return ((((((((iHashCode + (r0Var == null ? 0 : r0Var.hashCode())) * 31) + this.f33224c.hashCode()) * 31) + this.f33225d.hashCode()) * 31) + o4.b.a(this.f33226e)) * 31) + this.f33227f.hashCode();
        }

        public String toString() {
            return "MethodSignatureData(returnType=" + this.f33222a + ", receiverType=" + this.f33223b + ", valueParameters=" + this.f33224c + ", typeParameters=" + this.f33225d + ", hasStableParameterNames=" + this.f33226e + ", errors=" + this.f33227f + ')';
        }
    }

    protected static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List f33228a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f33229b;

        public b(List list, boolean z10) {
            rd.m.e(list, "descriptors");
            this.f33228a = list;
            this.f33229b = z10;
        }

        public final List a() {
            return this.f33228a;
        }

        public final boolean b() {
            return this.f33229b;
        }
    }

    public /* synthetic */ t0(ye.k kVar, t0 t0Var, int i10, rd.h hVar) {
        this(kVar, (i10 & 2) != 0 ? null : t0Var);
    }

    private final ke.k0 E(cf.n nVar) {
        xe.f fVarF1 = xe.f.f1(R(), ye.h.a(this.f33211b, nVar), he.e0.f15259b, ve.v0.d(nVar.getVisibility()), !nVar.o(), nVar.getName(), this.f33211b.a().t().a(nVar), U(nVar));
        rd.m.d(fVarF1, "create(...)");
        return fVarF1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final he.y0 F(t0 t0Var, mf.f fVar) {
        rd.m.e(fVar, "name");
        t0 t0Var2 = t0Var.f33212c;
        if (t0Var2 != null) {
            return (he.y0) t0Var2.f33216g.l(fVar);
        }
        cf.n nVarB = ((c) t0Var.f33214e.a()).b(fVar);
        if (nVarB == null || nVarB.F()) {
            return null;
        }
        return t0Var.a0(nVarB);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Collection G(t0 t0Var, mf.f fVar) {
        rd.m.e(fVar, "name");
        t0 t0Var2 = t0Var.f33212c;
        if (t0Var2 != null) {
            return (Collection) t0Var2.f33215f.l(fVar);
        }
        ArrayList arrayList = new ArrayList();
        for (cf.r rVar : ((c) t0Var.f33214e.a()).f(fVar)) {
            xe.e eVarZ = t0Var.Z(rVar);
            if (t0Var.V(eVarZ)) {
                t0Var.f33211b.a().h().d(rVar, eVarZ);
                arrayList.add(eVarZ);
            }
        }
        t0Var.y(arrayList, fVar);
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final c H(t0 t0Var) {
        return t0Var.z();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Set I(t0 t0Var) {
        return t0Var.x(xf.d.f32057v, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Collection J(t0 t0Var, mf.f fVar) {
        rd.m.e(fVar, "name");
        LinkedHashSet linkedHashSet = new LinkedHashSet((Collection) t0Var.f33215f.l(fVar));
        t0Var.e0(linkedHashSet);
        t0Var.B(linkedHashSet, fVar);
        return ed.q.H0(t0Var.f33211b.a().r().p(t0Var.f33211b, linkedHashSet));
    }

    private final Set M() {
        return (Set) dg.m.a(this.f33220k, this, f33210m[2]);
    }

    private final Set P() {
        return (Set) dg.m.a(this.f33218i, this, f33210m[0]);
    }

    private final Set S() {
        return (Set) dg.m.a(this.f33219j, this, f33210m[1]);
    }

    private final eg.r0 T(cf.n nVar) {
        eg.r0 r0VarP = this.f33211b.g().p(nVar.getType(), af.b.b(h2.f12104b, false, false, null, 7, null));
        if ((!ee.i.t0(r0VarP) && !ee.i.w0(r0VarP)) || !U(nVar) || !nVar.M()) {
            return r0VarP;
        }
        eg.r0 r0VarN = i2.n(r0VarP);
        rd.m.d(r0VarN, "makeNotNullable(...)");
        return r0VarN;
    }

    private final boolean U(cf.n nVar) {
        return nVar.o() && nVar.O();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List W(t0 t0Var, mf.f fVar) {
        rd.m.e(fVar, "name");
        ArrayList arrayList = new ArrayList();
        og.a.a(arrayList, t0Var.f33216g.l(fVar));
        t0Var.C(fVar, arrayList);
        return qf.i.t(t0Var.R()) ? ed.q.H0(arrayList) : ed.q.H0(t0Var.f33211b.a().r().p(t0Var.f33211b, arrayList));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Set X(t0 t0Var) {
        return t0Var.D(xf.d.f32058w, null);
    }

    private final he.y0 a0(cf.n nVar) {
        rd.b0 b0Var = new rd.b0();
        ke.k0 k0VarE = E(nVar);
        b0Var.f25935a = k0VarE;
        k0VarE.V0(null, null, null, null);
        ((ke.k0) b0Var.f25935a).b1(T(nVar), ed.q.k(), O(), null, ed.q.k());
        he.m mVarR = R();
        he.e eVar = mVarR instanceof he.e ? (he.e) mVarR : null;
        if (eVar != null) {
            b0Var.f25935a = this.f33211b.a().w().e(eVar, (ke.k0) b0Var.f25935a, this.f33211b);
        }
        Object obj = b0Var.f25935a;
        if (qf.i.K((t1) obj, ((ke.k0) obj).getType())) {
            ((ke.k0) b0Var.f25935a).L0(new i0(this, nVar, b0Var));
        }
        this.f33211b.a().h().b(nVar, (he.y0) b0Var.f25935a);
        return (he.y0) b0Var.f25935a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final dg.j b0(t0 t0Var, cf.n nVar, rd.b0 b0Var) {
        return t0Var.f33211b.e().a(new j0(t0Var, nVar, b0Var));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final sf.g c0(t0 t0Var, cf.n nVar, rd.b0 b0Var) {
        return t0Var.f33211b.a().g().a(nVar, (he.y0) b0Var.f25935a);
    }

    private final void e0(Set set) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : set) {
            String strC = ef.c0.c((f1) obj, false, false, 2, null);
            Object arrayList = linkedHashMap.get(strC);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(strC, arrayList);
            }
            ((List) arrayList).add(obj);
        }
        for (List list : linkedHashMap.values()) {
            if (list.size() != 1) {
                Collection collectionB = qf.r.b(list, s0.f33207a);
                set.removeAll(list);
                set.addAll(collectionB);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final he.a f0(f1 f1Var) {
        rd.m.e(f1Var, "$this$selectMostSpecificInEachOverridableGroup");
        return f1Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Collection t(t0 t0Var) {
        return t0Var.w(xf.d.f32050o, xf.k.f32076a.c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Set u(t0 t0Var) {
        return t0Var.v(xf.d.f32055t, null);
    }

    protected final eg.r0 A(cf.r rVar, ye.k kVar) {
        rd.m.e(rVar, "method");
        rd.m.e(kVar, "c");
        return kVar.g().p(rVar.g(), af.b.b(h2.f12104b, rVar.N().q(), false, null, 6, null));
    }

    protected abstract void B(Collection collection, mf.f fVar);

    protected abstract void C(mf.f fVar, Collection collection);

    protected abstract Set D(xf.d dVar, qd.l lVar);

    protected final dg.i K() {
        return this.f33213d;
    }

    protected final ye.k L() {
        return this.f33211b;
    }

    protected final dg.i N() {
        return this.f33214e;
    }

    protected abstract he.b1 O();

    protected final t0 Q() {
        return this.f33212c;
    }

    protected abstract he.m R();

    protected boolean V(xe.e eVar) {
        rd.m.e(eVar, "<this>");
        return true;
    }

    protected abstract a Y(cf.r rVar, List list, eg.r0 r0Var, List list2);

    protected final xe.e Z(cf.r rVar) {
        rd.m.e(rVar, "method");
        xe.e eVarP1 = xe.e.p1(R(), ye.h.a(this.f33211b, rVar), rVar.getName(), this.f33211b.a().t().a(rVar), ((c) this.f33214e.a()).c(rVar.getName()) != null && rVar.i().isEmpty());
        rd.m.d(eVarP1, "createJavaMethod(...)");
        ye.k kVarI = ye.c.i(this.f33211b, eVarP1, rVar, 0, 4, null);
        List typeParameters = rVar.getTypeParameters();
        List arrayList = new ArrayList(ed.q.v(typeParameters, 10));
        Iterator it = typeParameters.iterator();
        while (it.hasNext()) {
            l1 l1VarA = kVarI.f().a((cf.y) it.next());
            rd.m.b(l1VarA);
            arrayList.add(l1VarA);
        }
        b bVarD0 = d0(kVarI, eVarP1, rVar.i());
        a aVarY = Y(rVar, arrayList, A(rVar, kVarI), bVarD0.a());
        eg.r0 r0VarC = aVarY.c();
        eVarP1.o1(r0VarC != null ? qf.h.i(eVarP1, r0VarC, ie.h.f16054l.b()) : null, O(), ed.q.k(), aVarY.e(), aVarY.f(), aVarY.d(), he.e0.f15258a.a(false, rVar.H(), !rVar.o()), ve.v0.d(rVar.getVisibility()), aVarY.c() != null ? ed.k0.f(dd.w.a(xe.e.P, ed.q.Z(bVarD0.a()))) : ed.k0.i());
        eVarP1.s1(aVarY.b(), bVarD0.b());
        if (!aVarY.a().isEmpty()) {
            kVarI.a().s().a(eVarP1, aVarY.a());
        }
        return eVarP1;
    }

    @Override // xf.l, xf.k
    public Collection a(mf.f fVar, pe.b bVar) {
        rd.m.e(fVar, "name");
        rd.m.e(bVar, "location");
        return !b().contains(fVar) ? ed.q.k() : (Collection) this.f33217h.l(fVar);
    }

    @Override // xf.l, xf.k
    public Set b() {
        return P();
    }

    @Override // xf.l, xf.k
    public Collection c(mf.f fVar, pe.b bVar) {
        rd.m.e(fVar, "name");
        rd.m.e(bVar, "location");
        return !d().contains(fVar) ? ed.q.k() : (Collection) this.f33221l.l(fVar);
    }

    @Override // xf.l, xf.k
    public Set d() {
        return S();
    }

    protected final b d0(ye.k kVar, he.z zVar, List list) {
        dd.q qVarA;
        mf.f name;
        rd.m.e(kVar, "c");
        he.z zVar2 = zVar;
        rd.m.e(zVar2, "function");
        rd.m.e(list, "jValueParameters");
        Iterable<ed.g0> iterableO0 = ed.q.O0(list);
        ArrayList arrayList = new ArrayList(ed.q.v(iterableO0, 10));
        boolean z10 = false;
        for (ed.g0 g0Var : iterableO0) {
            int iA = g0Var.a();
            cf.b0 b0Var = (cf.b0) g0Var.b();
            ie.h hVarA = ye.h.a(kVar, b0Var);
            af.a aVarB = af.b.b(h2.f12104b, false, false, null, 7, null);
            if (b0Var.b()) {
                cf.x type = b0Var.getType();
                cf.f fVar = type instanceof cf.f ? (cf.f) type : null;
                if (fVar == null) {
                    throw new AssertionError("Vararg parameter should be an array: " + b0Var);
                }
                eg.r0 r0VarL = kVar.g().l(fVar, aVarB, true);
                qVarA = dd.w.a(r0VarL, kVar.d().o().k(r0VarL));
            } else {
                qVarA = dd.w.a(kVar.g().p(b0Var.getType(), aVarB), null);
            }
            eg.r0 r0Var = (eg.r0) qVarA.a();
            eg.r0 r0Var2 = (eg.r0) qVarA.b();
            if (rd.m.a(zVar2.getName().d(), "equals") && list.size() == 1 && rd.m.a(kVar.d().o().J(), r0Var)) {
                name = mf.f.h("other");
            } else {
                name = b0Var.getName();
                if (name == null) {
                    z10 = true;
                }
                if (name == null) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append('p');
                    sb2.append(iA);
                    name = mf.f.h(sb2.toString());
                    rd.m.d(name, "identifier(...)");
                }
            }
            boolean z11 = z10;
            rd.m.b(name);
            arrayList.add(new ke.u0(zVar2, null, iA, hVarA, name, r0Var, false, false, false, r0Var2, kVar.a().t().a(b0Var)));
            zVar2 = zVar;
            z10 = z11;
        }
        return new b(ed.q.H0(arrayList), z10);
    }

    @Override // xf.l, xf.n
    public Collection e(xf.d dVar, qd.l lVar) {
        rd.m.e(dVar, "kindFilter");
        rd.m.e(lVar, "nameFilter");
        return (Collection) this.f33213d.a();
    }

    @Override // xf.l, xf.k
    public Set f() {
        return M();
    }

    public String toString() {
        return "Lazy scope for " + R();
    }

    protected abstract Set v(xf.d dVar, qd.l lVar);

    protected final List w(xf.d dVar, qd.l lVar) {
        rd.m.e(dVar, "kindFilter");
        rd.m.e(lVar, "nameFilter");
        pe.d dVar2 = pe.d.f24125v;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (dVar.a(xf.d.f32038c.c())) {
            for (mf.f fVar : v(dVar, lVar)) {
                if (((Boolean) lVar.l(fVar)).booleanValue()) {
                    og.a.a(linkedHashSet, g(fVar, dVar2));
                }
            }
        }
        if (dVar.a(xf.d.f32038c.d()) && !dVar.l().contains(c.a.f32035a)) {
            for (mf.f fVar2 : x(dVar, lVar)) {
                if (((Boolean) lVar.l(fVar2)).booleanValue()) {
                    linkedHashSet.addAll(a(fVar2, dVar2));
                }
            }
        }
        if (dVar.a(xf.d.f32038c.i()) && !dVar.l().contains(c.a.f32035a)) {
            for (mf.f fVar3 : D(dVar, lVar)) {
                if (((Boolean) lVar.l(fVar3)).booleanValue()) {
                    linkedHashSet.addAll(c(fVar3, dVar2));
                }
            }
        }
        return ed.q.H0(linkedHashSet);
    }

    protected abstract Set x(xf.d dVar, qd.l lVar);

    protected void y(Collection collection, mf.f fVar) {
        rd.m.e(collection, "result");
        rd.m.e(fVar, "name");
    }

    protected abstract c z();

    public t0(ye.k kVar, t0 t0Var) {
        rd.m.e(kVar, "c");
        this.f33211b = kVar;
        this.f33212c = t0Var;
        this.f33213d = kVar.e().e(new h0(this), ed.q.k());
        this.f33214e = kVar.e().d(new k0(this));
        this.f33215f = kVar.e().f(new l0(this));
        this.f33216g = kVar.e().h(new m0(this));
        this.f33217h = kVar.e().f(new n0(this));
        this.f33218i = kVar.e().d(new o0(this));
        this.f33219j = kVar.e().d(new p0(this));
        this.f33220k = kVar.e().d(new q0(this));
        this.f33221l = kVar.e().f(new r0(this));
    }
}
