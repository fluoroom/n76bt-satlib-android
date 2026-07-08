package cg;

import ag.n0;
import ag.w0;
import eg.c1;
import eg.u1;
import gf.c;
import he.e1;
import he.f1;
import he.g1;
import he.j1;
import he.m0;
import he.p1;
import he.q1;
import he.s1;
import he.y0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import jf.j;
import xf.k;
import xf.n;

/* JADX INFO: loaded from: classes3.dex */
public final class m extends ke.a implements he.m {
    private final c A;
    private final he.m B;
    private final dg.j C;
    private final dg.i D;
    private final dg.j E;
    private final dg.i F;
    private final dg.j G;
    private final n0.a H;
    private final ie.h I;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final gf.c f4801f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final jf.a f4802g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final g1 f4803h;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final mf.b f4804r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final he.e0 f4805s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final he.u f4806t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final he.f f4807u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final ag.p f4808v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final boolean f4809w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final xf.l f4810x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final b f4811y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final e1 f4812z;

    /* JADX INFO: Access modifiers changed from: private */
    final class b extends eg.b {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final dg.i f4818d;

        public b() {
            super(m.this.d1().h());
            this.f4818d = m.this.d1().h().d(new n(m.this));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final List L(m mVar) {
            return p1.g(mVar);
        }

        @Override // eg.v, eg.u1
        /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public m q() {
            return m.this;
        }

        @Override // eg.u1
        public List getParameters() {
            return (List) this.f4818d.a();
        }

        @Override // eg.p
        protected Collection m() {
            String strD;
            mf.c cVarA;
            List listP = jf.g.p(m.this.e1(), m.this.d1().j());
            m mVar = m.this;
            ArrayList arrayList = new ArrayList(ed.q.v(listP, 10));
            Iterator it = listP.iterator();
            while (it.hasNext()) {
                arrayList.add(mVar.d1().i().u((gf.r) it.next()));
            }
            List listS0 = ed.q.s0(arrayList, m.this.d1().c().c().c(m.this));
            ArrayList<m0.b> arrayList2 = new ArrayList();
            Iterator it2 = listS0.iterator();
            while (it2.hasNext()) {
                he.h hVarQ = ((eg.r0) it2.next()).N0().q();
                m0.b bVar = hVarQ instanceof m0.b ? (m0.b) hVarQ : null;
                if (bVar != null) {
                    arrayList2.add(bVar);
                }
            }
            if (!arrayList2.isEmpty()) {
                ag.w wVarJ = m.this.d1().c().j();
                m mVar2 = m.this;
                ArrayList arrayList3 = new ArrayList(ed.q.v(arrayList2, 10));
                for (m0.b bVar2 : arrayList2) {
                    mf.b bVarN = uf.e.n(bVar2);
                    if (bVarN == null || (cVarA = bVarN.a()) == null || (strD = cVarA.a()) == null) {
                        strD = bVar2.getName().d();
                        rd.m.d(strD, "asString(...)");
                    }
                    arrayList3.add(strD);
                }
                wVarJ.b(mVar2, arrayList3);
            }
            return ed.q.H0(listS0);
        }

        @Override // eg.u1
        public boolean r() {
            return true;
        }

        public String toString() {
            String string = m.this.getName().toString();
            rd.m.d(string, "toString(...)");
            return string;
        }

        @Override // eg.p
        protected j1 v() {
            return j1.a.f15286a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Map f4820a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final dg.h f4821b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final dg.i f4822c;

        public c() {
            List listS0 = m.this.e1().S0();
            rd.m.d(listS0, "getEnumEntryList(...)");
            LinkedHashMap linkedHashMap = new LinkedHashMap(xd.d.b(ed.k0.e(ed.q.v(listS0, 10)), 16));
            for (Object obj : listS0) {
                linkedHashMap.put(ag.l0.b(m.this.d1().g(), ((gf.h) obj).N()), obj);
            }
            this.f4820a = linkedHashMap;
            this.f4821b = m.this.d1().h().h(new o(this, m.this));
            this.f4822c = m.this.d1().h().d(new p(this));
        }

        private final Set e() {
            HashSet hashSet = new HashSet();
            Iterator it = m.this.k().e().iterator();
            while (it.hasNext()) {
                for (he.m mVar : n.a.a(((eg.r0) it.next()).p(), null, null, 3, null)) {
                    if ((mVar instanceof f1) || (mVar instanceof y0)) {
                        hashSet.add(((he.b) mVar).getName());
                    }
                }
            }
            List listX0 = m.this.e1().X0();
            rd.m.d(listX0, "getFunctionList(...)");
            m mVar2 = m.this;
            Iterator it2 = listX0.iterator();
            while (it2.hasNext()) {
                hashSet.add(ag.l0.b(mVar2.d1().g(), ((gf.j) it2.next()).C0()));
            }
            List listL1 = m.this.e1().l1();
            rd.m.d(listL1, "getPropertyList(...)");
            m mVar3 = m.this;
            Iterator it3 = listL1.iterator();
            while (it3.hasNext()) {
                hashSet.add(ag.l0.b(mVar3.d1().g(), ((gf.o) it3.next()).S0()));
            }
            return ed.r0.j(hashSet, hashSet);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final he.e f(c cVar, m mVar, mf.f fVar) {
            rd.m.e(fVar, "name");
            gf.h hVar = (gf.h) cVar.f4820a.get(fVar);
            if (hVar != null) {
                return ke.q.L0(mVar.d1().h(), mVar, fVar, cVar.f4822c, new cg.a(mVar.d1().h(), new q(mVar, hVar)), g1.f15281a);
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final List g(m mVar, gf.h hVar) {
            return ed.q.H0(mVar.d1().c().d().i(mVar.i1(), hVar));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Set h(c cVar) {
            return cVar.e();
        }

        public final Collection d() {
            Set setKeySet = this.f4820a.keySet();
            ArrayList arrayList = new ArrayList();
            Iterator it = setKeySet.iterator();
            while (it.hasNext()) {
                he.e eVarI = i((mf.f) it.next());
                if (eVarI != null) {
                    arrayList.add(eVarI);
                }
            }
            return arrayList;
        }

        public final he.e i(mf.f fVar) {
            rd.m.e(fVar, "name");
            return (he.e) this.f4821b.l(fVar);
        }
    }

    static final /* synthetic */ class d extends rd.a implements qd.l {
        d(Object obj) {
            super(1, obj, w0.class, "simpleType", "simpleType(Lorg/jetbrains/kotlin/metadata/ProtoBuf$Type;Z)Lorg/jetbrains/kotlin/types/SimpleType;", 0);
        }

        @Override // qd.l
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final c1 l(gf.r rVar) {
            rd.m.e(rVar, "p0");
            return w0.q((w0) this.f25925a, rVar, false, 2, null);
        }
    }

    static final /* synthetic */ class e extends rd.l implements qd.l {
        e(Object obj) {
            super(1, obj, m.class, "getValueClassPropertyType", "getValueClassPropertyType(Lorg/jetbrains/kotlin/name/Name;)Lorg/jetbrains/kotlin/types/SimpleType;", 0);
        }

        @Override // qd.l
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public final c1 l(mf.f fVar) {
            rd.m.e(fVar, "p0");
            return ((m) this.f25940b).j1(fVar);
        }
    }

    static final /* synthetic */ class f extends rd.l implements qd.l {
        f(Object obj) {
            super(1, obj, a.class, "<init>", "<init>(Lorg/jetbrains/kotlin/serialization/deserialization/descriptors/DeserializedClassDescriptor;Lorg/jetbrains/kotlin/types/checker/KotlinTypeRefiner;)V", 0);
        }

        @Override // qd.l
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public final a l(fg.g gVar) {
            rd.m.e(gVar, "p0");
            return new a((m) this.f25940b, gVar);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(ag.p pVar, gf.c cVar, jf.d dVar, jf.a aVar, g1 g1Var) {
        xf.l qVar;
        super(pVar.h(), ag.l0.a(dVar, cVar.U0()).h());
        rd.m.e(pVar, "outerContext");
        rd.m.e(cVar, "classProto");
        rd.m.e(dVar, "nameResolver");
        rd.m.e(aVar, "metadataVersion");
        rd.m.e(g1Var, "sourceElement");
        this.f4801f = cVar;
        this.f4802g = aVar;
        this.f4803h = g1Var;
        this.f4804r = ag.l0.a(dVar, cVar.U0());
        ag.o0 o0Var = ag.o0.f557a;
        this.f4805s = o0Var.b((gf.l) jf.b.f18664e.d(cVar.T0()));
        this.f4806t = ag.p0.a(o0Var, (gf.y) jf.b.f18663d.d(cVar.T0()));
        he.f fVarA = o0Var.a((c.EnumC0201c) jf.b.f18665f.d(cVar.T0()));
        this.f4807u = fVarA;
        List listW1 = cVar.w1();
        rd.m.d(listW1, "getTypeParameterList(...)");
        gf.u uVarX1 = cVar.x1();
        rd.m.d(uVarX1, "getTypeTable(...)");
        jf.h hVar = new jf.h(uVarX1);
        j.a aVar2 = jf.j.f18710b;
        gf.x xVarZ1 = cVar.z1();
        rd.m.d(xVarZ1, "getVersionRequirementTable(...)");
        ag.p pVarA = pVar.a(this, listW1, dVar, hVar, aVar2.a(xVarZ1), aVar);
        this.f4808v = pVarA;
        Boolean boolD = jf.b.f18672m.d(cVar.T0());
        rd.m.d(boolD, "get(...)");
        boolean zBooleanValue = boolD.booleanValue();
        this.f4809w = zBooleanValue;
        he.f fVar = he.f.f15273d;
        if (fVarA == fVar) {
            qVar = new xf.q(pVarA.h(), this, zBooleanValue || rd.m.a(pVarA.c().i().a(), Boolean.TRUE));
        } else {
            qVar = k.b.f32079b;
        }
        this.f4810x = qVar;
        this.f4811y = new b();
        this.f4812z = e1.f15265e.a(this, pVarA.h(), pVarA.c().n().d(), new f(this));
        this.A = fVarA == fVar ? new c() : null;
        he.m mVarE = pVar.e();
        this.B = mVarE;
        this.C = pVarA.h().a(new cg.d(this));
        this.D = pVarA.h().d(new cg.e(this));
        this.E = pVarA.h().a(new cg.f(this));
        this.F = pVarA.h().d(new g(this));
        this.G = pVarA.h().a(new h(this));
        jf.d dVarG = pVarA.g();
        jf.h hVarJ = pVarA.j();
        m mVar = mVarE instanceof m ? (m) mVarE : null;
        this.H = new n0.a(cVar, dVarG, hVarJ, g1Var, mVar != null ? mVar.H : null);
        this.I = !jf.b.f18662c.d(cVar.T0()).booleanValue() ? ie.h.f16054l.b() : new s0(pVarA.h(), new i(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List U0(m mVar) {
        return ed.q.H0(mVar.f4808v.c().d().e(mVar.H));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final he.e V0(m mVar) {
        return mVar.W0();
    }

    private final he.e W0() {
        if (!this.f4801f.A1()) {
            return null;
        }
        he.h hVarG = f1().g(ag.l0.b(this.f4808v.g(), this.f4801f.E0()), pe.d.A);
        if (hVarG instanceof he.e) {
            return (he.e) hVarG;
        }
        return null;
    }

    private final Collection X0() {
        return ed.q.s0(ed.q.s0(Z0(), ed.q.o(T())), this.f4808v.c().c().e(this));
    }

    private final he.d Y0() {
        Object next;
        if (this.f4807u.d()) {
            ke.i iVarL = qf.h.l(this, g1.f15281a);
            iVarL.g1(s());
            return iVarL;
        }
        List listJ0 = this.f4801f.J0();
        rd.m.d(listJ0, "getConstructorList(...)");
        Iterator it = listJ0.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (!jf.b.f18673n.d(((gf.e) next).Z()).booleanValue()) {
                break;
            }
        }
        gf.e eVar = (gf.e) next;
        if (eVar != null) {
            return this.f4808v.f().r(eVar, true);
        }
        return null;
    }

    private final List Z0() {
        List listJ0 = this.f4801f.J0();
        rd.m.d(listJ0, "getConstructorList(...)");
        ArrayList<gf.e> arrayList = new ArrayList();
        for (Object obj : listJ0) {
            Boolean boolD = jf.b.f18673n.d(((gf.e) obj).Z());
            rd.m.d(boolD, "get(...)");
            if (boolD.booleanValue()) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(ed.q.v(arrayList, 10));
        for (gf.e eVar : arrayList) {
            ag.k0 k0VarF = this.f4808v.f();
            rd.m.b(eVar);
            arrayList2.add(k0VarF.r(eVar, false));
        }
        return arrayList2;
    }

    private final Collection a1() {
        if (this.f4805s != he.e0.f15260c) {
            return ed.q.k();
        }
        List<Integer> listM1 = this.f4801f.m1();
        rd.m.b(listM1);
        if (listM1.isEmpty()) {
            return qf.a.f25119a.a(this, false);
        }
        ArrayList arrayList = new ArrayList();
        for (Integer num : listM1) {
            ag.n nVarC = this.f4808v.c();
            jf.d dVarG = this.f4808v.g();
            rd.m.b(num);
            he.e eVarB = nVarC.b(ag.l0.a(dVarG, num.intValue()));
            if (eVarB != null) {
                arrayList.add(eVarB);
            }
        }
        return arrayList;
    }

    private final q1 b1() {
        if (!isInline() && !m()) {
            return null;
        }
        q1 q1VarB = ag.y0.b(this.f4801f, this.f4808v.g(), this.f4808v.j(), new d(this.f4808v.i()), new e(this));
        if (q1VarB != null) {
            return q1VarB;
        }
        if (this.f4802g.c(1, 5, 1)) {
            return null;
        }
        he.d dVarT = T();
        if (dVarT == null) {
            throw new IllegalStateException(("Inline class has no primary constructor: " + this).toString());
        }
        List listI = dVarT.i();
        rd.m.d(listI, "getValueParameters(...)");
        mf.f name = ((s1) ed.q.Z(listI)).getName();
        rd.m.d(name, "getName(...)");
        c1 c1VarJ1 = j1(name);
        if (c1VarJ1 != null) {
            return new he.a0(name, c1VarJ1);
        }
        throw new IllegalStateException(("Value class has no underlying property: " + this).toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Collection c1(m mVar) {
        return mVar.X0();
    }

    private final a f1() {
        return (a) this.f4812z.c(this.f4808v.c().n().d());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final c1 j1(mf.f fVar) {
        Iterator it = f1().c(fVar, pe.d.A).iterator();
        boolean z10 = false;
        Object obj = null;
        while (true) {
            if (!it.hasNext()) {
                if (!z10) {
                    break;
                }
            } else {
                Object next = it.next();
                if (((y0) next).l0() == null) {
                    if (z10) {
                        break;
                    }
                    z10 = true;
                    obj = next;
                }
            }
        }
        obj = null;
        y0 y0Var = (y0) obj;
        return (c1) (y0Var != null ? y0Var.getType() : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final he.d l1(m mVar) {
        return mVar.Y0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Collection m1(m mVar) {
        return mVar.a1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final q1 n1(m mVar) {
        return mVar.b1();
    }

    @Override // he.d0
    public boolean A() {
        Boolean boolD = jf.b.f18668i.d(this.f4801f.T0());
        rd.m.d(boolD, "get(...)");
        return boolD.booleanValue();
    }

    @Override // he.e
    public boolean B() {
        return jf.b.f18665f.d(this.f4801f.T0()) == c.EnumC0201c.COMPANION_OBJECT;
    }

    @Override // he.d0
    public boolean F0() {
        return false;
    }

    @Override // he.e
    public boolean G() {
        Boolean boolD = jf.b.f18671l.d(this.f4801f.T0());
        rd.m.d(boolD, "get(...)");
        return boolD.booleanValue();
    }

    @Override // ke.a, he.e
    public List H0() {
        List listB = jf.g.b(this.f4801f, this.f4808v.j());
        ArrayList arrayList = new ArrayList(ed.q.v(listB, 10));
        Iterator it = listB.iterator();
        while (it.hasNext()) {
            arrayList.add(new ke.n0(J0(), new yf.b(this, this.f4808v.i().u((gf.r) it.next()), null, null), ie.h.f16054l.b()));
        }
        return arrayList;
    }

    @Override // he.d0
    public boolean M() {
        Boolean boolD = jf.b.f18669j.d(this.f4801f.T0());
        rd.m.d(boolD, "get(...)");
        return boolD.booleanValue();
    }

    @Override // he.i
    public boolean N() {
        Boolean boolD = jf.b.f18666g.d(this.f4801f.T0());
        rd.m.d(boolD, "get(...)");
        return boolD.booleanValue();
    }

    @Override // he.e
    public he.d T() {
        return (he.d) this.C.a();
    }

    @Override // he.e
    public he.e W() {
        return (he.e) this.E.a();
    }

    @Override // he.e, he.n, he.m
    public he.m b() {
        return this.B;
    }

    public final ag.p d1() {
        return this.f4808v;
    }

    public final gf.c e1() {
        return this.f4801f;
    }

    @Override // ke.z
    protected xf.k f0(fg.g gVar) {
        rd.m.e(gVar, "kotlinTypeRefiner");
        return this.f4812z.c(gVar);
    }

    public final jf.a g1() {
        return this.f4802g;
    }

    @Override // ie.a
    public ie.h getAnnotations() {
        return this.I;
    }

    @Override // he.e
    public Collection getConstructors() {
        return (Collection) this.D.a();
    }

    @Override // he.p
    public g1 getSource() {
        return this.f4803h;
    }

    @Override // he.e, he.d0, he.q
    public he.u getVisibility() {
        return this.f4806t;
    }

    @Override // he.e
    /* JADX INFO: renamed from: h1, reason: merged with bridge method [inline-methods] */
    public xf.l U() {
        return this.f4810x;
    }

    public final n0.a i1() {
        return this.H;
    }

    @Override // he.e
    public boolean isData() {
        Boolean boolD = jf.b.f18667h.d(this.f4801f.T0());
        rd.m.d(boolD, "get(...)");
        return boolD.booleanValue();
    }

    @Override // he.e
    public boolean isInline() {
        return jf.b.f18670k.d(this.f4801f.T0()).booleanValue() && this.f4802g.e(1, 4, 1);
    }

    @Override // he.e
    public he.f j() {
        return this.f4807u;
    }

    @Override // he.h
    public u1 k() {
        return this.f4811y;
    }

    public final boolean k1(mf.f fVar) {
        rd.m.e(fVar, "name");
        return f1().t().contains(fVar);
    }

    @Override // he.e, he.d0
    public he.e0 l() {
        return this.f4805s;
    }

    @Override // he.e
    public boolean m() {
        return jf.b.f18670k.d(this.f4801f.T0()).booleanValue() && this.f4802g.c(1, 4, 2);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("deserialized ");
        sb2.append(M() ? "expect " : "");
        sb2.append("class ");
        sb2.append(getName());
        return sb2.toString();
    }

    @Override // he.e, he.i
    public List v() {
        return this.f4808v.i().m();
    }

    @Override // he.e
    public q1 z0() {
        return (q1) this.G.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    final class a extends w {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final fg.g f4813g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final dg.i f4814h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final dg.i f4815i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ m f4816j;

        /* JADX INFO: renamed from: cg.m$a$a, reason: collision with other inner class name */
        public static final class C0071a extends qf.m {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ List f4817a;

            C0071a(List list) {
                this.f4817a = list;
            }

            @Override // qf.n
            public void a(he.b bVar) {
                rd.m.e(bVar, "fakeOverride");
                qf.o.K(bVar, null);
                this.f4817a.add(bVar);
            }

            @Override // qf.m
            protected void e(he.b bVar, he.b bVar2) {
                rd.m.e(bVar, "fromSuper");
                rd.m.e(bVar2, "fromCurrent");
                if (bVar2 instanceof ke.s) {
                    ((ke.s) bVar2).U0(he.v.f15322a, bVar);
                }
            }
        }

        public a(m mVar, fg.g gVar) {
            rd.m.e(gVar, "kotlinTypeRefiner");
            this.f4816j = mVar;
            ag.p pVarD1 = mVar.d1();
            List listX0 = mVar.e1().X0();
            rd.m.d(listX0, "getFunctionList(...)");
            List listL1 = mVar.e1().l1();
            rd.m.d(listL1, "getPropertyList(...)");
            List listT1 = mVar.e1().t1();
            rd.m.d(listT1, "getTypeAliasList(...)");
            List listI1 = mVar.e1().i1();
            rd.m.d(listI1, "getNestedClassNameList(...)");
            jf.d dVarG = mVar.d1().g();
            ArrayList arrayList = new ArrayList(ed.q.v(listI1, 10));
            Iterator it = listI1.iterator();
            while (it.hasNext()) {
                arrayList.add(ag.l0.b(dVarG, ((Number) it.next()).intValue()));
            }
            super(pVarD1, listX0, listL1, listT1, new j(arrayList));
            this.f4813g = gVar;
            this.f4814h = s().h().d(new k(this));
            this.f4815i = s().h().d(new l(this));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Collection F(a aVar) {
            return aVar.m(xf.d.f32050o, xf.k.f32076a.c(), pe.d.f24125v);
        }

        private final void G(mf.f fVar, Collection collection, List list) {
            s().c().n().b().v(fVar, collection, new ArrayList(list), H(), new C0071a(list));
        }

        private final m H() {
            return this.f4816j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Collection J(a aVar) {
            return aVar.f4813g.g(aVar.H());
        }

        @Override // cg.w
        protected boolean A(f1 f1Var) {
            rd.m.e(f1Var, "function");
            return s().c().t().a(this.f4816j, f1Var);
        }

        public void I(mf.f fVar, pe.b bVar) {
            rd.m.e(fVar, "name");
            rd.m.e(bVar, "location");
            oe.a.a(s().c().p(), bVar, H(), fVar);
        }

        @Override // cg.w, xf.l, xf.k
        public Collection a(mf.f fVar, pe.b bVar) {
            rd.m.e(fVar, "name");
            rd.m.e(bVar, "location");
            I(fVar, bVar);
            return super.a(fVar, bVar);
        }

        @Override // cg.w, xf.l, xf.k
        public Collection c(mf.f fVar, pe.b bVar) {
            rd.m.e(fVar, "name");
            rd.m.e(bVar, "location");
            I(fVar, bVar);
            return super.c(fVar, bVar);
        }

        @Override // xf.l, xf.n
        public Collection e(xf.d dVar, qd.l lVar) {
            rd.m.e(dVar, "kindFilter");
            rd.m.e(lVar, "nameFilter");
            return (Collection) this.f4814h.a();
        }

        @Override // cg.w, xf.l, xf.n
        public he.h g(mf.f fVar, pe.b bVar) {
            he.e eVarI;
            rd.m.e(fVar, "name");
            rd.m.e(bVar, "location");
            I(fVar, bVar);
            c cVar = H().A;
            return (cVar == null || (eVarI = cVar.i(fVar)) == null) ? super.g(fVar, bVar) : eVarI;
        }

        @Override // cg.w
        protected void j(Collection collection, qd.l lVar) {
            rd.m.e(collection, "result");
            rd.m.e(lVar, "nameFilter");
            c cVar = H().A;
            Collection collectionD = cVar != null ? cVar.d() : null;
            if (collectionD == null) {
                collectionD = ed.q.k();
            }
            collection.addAll(collectionD);
        }

        @Override // cg.w
        protected void n(mf.f fVar, List list) {
            rd.m.e(fVar, "name");
            rd.m.e(list, "functions");
            ArrayList arrayList = new ArrayList();
            Iterator it = ((Collection) this.f4815i.a()).iterator();
            while (it.hasNext()) {
                arrayList.addAll(((eg.r0) it.next()).p().a(fVar, pe.d.f24124u));
            }
            list.addAll(s().c().c().b(fVar, this.f4816j));
            G(fVar, arrayList, list);
        }

        @Override // cg.w
        protected void o(mf.f fVar, List list) {
            rd.m.e(fVar, "name");
            rd.m.e(list, "descriptors");
            ArrayList arrayList = new ArrayList();
            Iterator it = ((Collection) this.f4815i.a()).iterator();
            while (it.hasNext()) {
                arrayList.addAll(((eg.r0) it.next()).p().c(fVar, pe.d.f24124u));
            }
            G(fVar, arrayList, list);
        }

        @Override // cg.w
        protected mf.b p(mf.f fVar) {
            rd.m.e(fVar, "name");
            return this.f4816j.f4804r.d(fVar);
        }

        @Override // cg.w
        protected Set v() {
            List listE = H().f4811y.e();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator it = listE.iterator();
            while (it.hasNext()) {
                Set setF = ((eg.r0) it.next()).p().f();
                if (setF == null) {
                    return null;
                }
                ed.q.A(linkedHashSet, setF);
            }
            return linkedHashSet;
        }

        @Override // cg.w
        protected Set w() {
            List listE = H().f4811y.e();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator it = listE.iterator();
            while (it.hasNext()) {
                ed.q.A(linkedHashSet, ((eg.r0) it.next()).p().b());
            }
            linkedHashSet.addAll(s().c().c().d(this.f4816j));
            return linkedHashSet;
        }

        @Override // cg.w
        protected Set x() {
            List listE = H().f4811y.e();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator it = listE.iterator();
            while (it.hasNext()) {
                ed.q.A(linkedHashSet, ((eg.r0) it.next()).p().d());
            }
            return linkedHashSet;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final List B(List list) {
            return list;
        }
    }
}
