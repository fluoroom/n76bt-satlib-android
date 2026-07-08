package be;

import be.c3;
import be.d1;
import ff.a;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import of.i;

/* JADX INFO: loaded from: classes3.dex */
public final class c0 extends d1 implements yd.c, y0, y2 {

    /* JADX INFO: renamed from: f */
    public static final a f3804f = new a(null);

    /* JADX INFO: renamed from: g */
    private static final Set f3805g;

    /* JADX INFO: renamed from: d */
    private final Class f3806d;

    /* JADX INFO: renamed from: e */
    private final dd.j f3807e;

    public static final class a {
        public /* synthetic */ a(rd.h hVar) {
            this();
        }

        private a() {
        }
    }

    public final class b extends d1.b {

        /* JADX INFO: renamed from: x */
        static final /* synthetic */ yd.j[] f3808x = {rd.c0.f(new rd.w(b.class, "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;", 0)), rd.c0.f(new rd.w(b.class, "annotations", "getAnnotations()Ljava/util/List;", 0)), rd.c0.f(new rd.w(b.class, "simpleName", "getSimpleName()Ljava/lang/String;", 0)), rd.c0.f(new rd.w(b.class, "qualifiedName", "getQualifiedName()Ljava/lang/String;", 0)), rd.c0.f(new rd.w(b.class, "constructors", "getConstructors()Ljava/util/Collection;", 0)), rd.c0.f(new rd.w(b.class, "nestedClasses", "getNestedClasses()Ljava/util/Collection;", 0)), rd.c0.f(new rd.w(b.class, "typeParameters", "getTypeParameters()Ljava/util/List;", 0)), rd.c0.f(new rd.w(b.class, "supertypes", "getSupertypes()Ljava/util/List;", 0)), rd.c0.f(new rd.w(b.class, "sealedSubclasses", "getSealedSubclasses()Ljava/util/List;", 0)), rd.c0.f(new rd.w(b.class, "declaredNonStaticMembers", "getDeclaredNonStaticMembers()Ljava/util/Collection;", 0)), rd.c0.f(new rd.w(b.class, "declaredStaticMembers", "getDeclaredStaticMembers()Ljava/util/Collection;", 0)), rd.c0.f(new rd.w(b.class, "inheritedNonStaticMembers", "getInheritedNonStaticMembers()Ljava/util/Collection;", 0)), rd.c0.f(new rd.w(b.class, "inheritedStaticMembers", "getInheritedStaticMembers()Ljava/util/Collection;", 0)), rd.c0.f(new rd.w(b.class, "allNonStaticMembers", "getAllNonStaticMembers()Ljava/util/Collection;", 0)), rd.c0.f(new rd.w(b.class, "allStaticMembers", "getAllStaticMembers()Ljava/util/Collection;", 0)), rd.c0.f(new rd.w(b.class, "declaredMembers", "getDeclaredMembers()Ljava/util/Collection;", 0)), rd.c0.f(new rd.w(b.class, "allMembers", "getAllMembers()Ljava/util/Collection;", 0))};

        /* JADX INFO: renamed from: d */
        private final dd.j f3809d;

        /* JADX INFO: renamed from: e */
        private final c3.a f3810e;

        /* JADX INFO: renamed from: f */
        private final c3.a f3811f;

        /* JADX INFO: renamed from: g */
        private final c3.a f3812g;

        /* JADX INFO: renamed from: h */
        private final c3.a f3813h;

        /* JADX INFO: renamed from: i */
        private final c3.a f3814i;

        /* JADX INFO: renamed from: j */
        private final c3.a f3815j;

        /* JADX INFO: renamed from: k */
        private final dd.j f3816k;

        /* JADX INFO: renamed from: l */
        private final c3.a f3817l;

        /* JADX INFO: renamed from: m */
        private final c3.a f3818m;

        /* JADX INFO: renamed from: n */
        private final c3.a f3819n;

        /* JADX INFO: renamed from: o */
        private final c3.a f3820o;

        /* JADX INFO: renamed from: p */
        private final c3.a f3821p;

        /* JADX INFO: renamed from: q */
        private final c3.a f3822q;

        /* JADX INFO: renamed from: r */
        private final c3.a f3823r;

        /* JADX INFO: renamed from: s */
        private final c3.a f3824s;

        /* JADX INFO: renamed from: t */
        private final c3.a f3825t;

        /* JADX INFO: renamed from: u */
        private final c3.a f3826u;

        /* JADX INFO: renamed from: v */
        private final c3.a f3827v;

        public b() {
            super();
            dd.n nVar = dd.n.f10910b;
            this.f3809d = dd.k.a(nVar, new d0(this));
            this.f3810e = c3.c(new o0(c0.this));
            this.f3811f = c3.c(new q0(c0.this));
            this.f3812g = c3.c(new r0(c0.this, this));
            this.f3813h = c3.c(new s0(c0.this));
            this.f3814i = c3.c(new t0(c0.this));
            this.f3815j = c3.c(new u0(this, c0.this));
            this.f3816k = dd.k.a(nVar, new v0(this, c0.this));
            this.f3817l = c3.c(new w0(this, c0.this));
            this.f3818m = c3.c(new x0(this, c0.this));
            this.f3819n = c3.c(new e0(c0.this, this));
            this.f3820o = c3.c(new f0(c0.this));
            this.f3821p = c3.c(new g0(c0.this));
            this.f3822q = c3.c(new h0(c0.this));
            this.f3823r = c3.c(new i0(c0.this));
            this.f3824s = c3.c(new j0(this));
            this.f3825t = c3.c(new k0(this));
            this.f3826u = c3.c(new l0(this));
            this.f3827v = c3.c(new m0(this));
        }

        public static final List A(b bVar) {
            return ed.q.s0(bVar.L(), bVar.O());
        }

        public static final List B(c0 c0Var) {
            Annotation[] annotations = c0Var.d().getAnnotations();
            rd.m.d(annotations, "getAnnotations(...)");
            ArrayList arrayList = new ArrayList();
            for (Annotation annotation : annotations) {
                if (!c0.f3805g.contains(pd.a.b(pd.a.a(annotation)).getName())) {
                    arrayList.add(annotation);
                }
            }
            return l3.s(arrayList);
        }

        private final String C(Class cls) {
            String simpleName = cls.getSimpleName();
            Method enclosingMethod = cls.getEnclosingMethod();
            if (enclosingMethod != null) {
                rd.m.b(simpleName);
                return rg.q.L0(simpleName, enclosingMethod.getName() + '$', null, 2, null);
            }
            Constructor<?> enclosingConstructor = cls.getEnclosingConstructor();
            if (enclosingConstructor == null) {
                rd.m.b(simpleName);
                return rg.q.K0(simpleName, '$', null, 2, null);
            }
            rd.m.b(simpleName);
            return rg.q.L0(simpleName, enclosingConstructor.getName() + '$', null, 2, null);
        }

        public static final List D(c0 c0Var) {
            Collection collectionX = c0Var.x();
            ArrayList arrayList = new ArrayList(ed.q.v(collectionX, 10));
            Iterator it = collectionX.iterator();
            while (it.hasNext()) {
                arrayList.add(new i1(c0Var, (he.l) it.next()));
            }
            return arrayList;
        }

        public static final List E(b bVar) {
            return ed.q.s0(bVar.K(), bVar.L());
        }

        public static final Collection F(c0 c0Var) {
            return c0Var.A(c0Var.V(), d1.d.f3847a);
        }

        public static final Collection G(c0 c0Var) {
            return c0Var.A(c0Var.W(), d1.d.f3847a);
        }

        public static final he.e H(c0 c0Var) {
            mf.b bVarQ = c0Var.Q();
            me.k kVarB = ((b) c0Var.R().getValue()).b();
            he.e eVarB = (bVarQ.i() && c0Var.d().isAnnotationPresent(Metadata.class)) ? kVarB.a().b(bVarQ) : he.y.b(kVarB.b(), bVarQ);
            return eVarB == null ? c0Var.O(bVarQ, kVarB) : eVarB;
        }

        private final Collection L() {
            Object objD = this.f3821p.d(this, f3808x[10]);
            rd.m.d(objD, "getValue(...)");
            return (Collection) objD;
        }

        private final Collection N() {
            Object objD = this.f3822q.d(this, f3808x[11]);
            rd.m.d(objD, "getValue(...)");
            return (Collection) objD;
        }

        private final Collection O() {
            Object objD = this.f3823r.d(this, f3808x[12]);
            rd.m.d(objD, "getValue(...)");
            return (Collection) objD;
        }

        public static final Collection S(c0 c0Var) {
            return c0Var.A(c0Var.V(), d1.d.f3848b);
        }

        public static final Collection T(c0 c0Var) {
            return c0Var.A(c0Var.W(), d1.d.f3848b);
        }

        public static final qe.g U(b bVar) {
            he.e eVarM = bVar.M();
            cg.m mVar = eVarM instanceof cg.m ? (cg.m) eVarM : null;
            if (mVar != null) {
                return re.g.i(mVar.e1(), mVar.d1().g(), false, null, 6, null);
            }
            return null;
        }

        public static final List V(b bVar, c0 c0Var) {
            qe.g gVarP = bVar.P();
            if (gVarP == null) {
                Class<?>[] declaredClasses = c0Var.d().getDeclaredClasses();
                rd.m.d(declaredClasses, "getDeclaredClasses(...)");
                ArrayList arrayList = new ArrayList();
                for (Class<?> cls : declaredClasses) {
                    rd.m.b(cls);
                    yd.c cVarE = pd.a.e(cls);
                    if (cVarE != null) {
                        arrayList.add(cVarE);
                    }
                }
                return arrayList;
            }
            mf.b bVarB = a3.b(gVarP.k());
            ClassLoader classLoaderJ = ne.f.j(c0Var.d());
            List listL = gVarP.l();
            ArrayList arrayList2 = new ArrayList();
            Iterator it = listL.iterator();
            while (it.hasNext()) {
                mf.f fVarH = mf.f.h((String) it.next());
                rd.m.d(fVarH, "identifier(...)");
                Class clsO = l3.o(classLoaderJ, bVarB.d(fVarH), 0, 2, null);
                yd.c cVarE2 = clsO != null ? pd.a.e(clsO) : null;
                if (cVarE2 != null) {
                    arrayList2.add(cVarE2);
                }
            }
            return arrayList2;
        }

        public static final Object W(b bVar, c0 c0Var) throws IllegalAccessException {
            qe.g gVarP = bVar.P();
            if (gVarP == null || !(qe.a.a(gVarP) == qe.b.f24929g || qe.a.a(gVarP) == qe.b.f24930h)) {
                return null;
            }
            Object obj = ((qe.a.a(gVarP) != qe.b.f24930h || ed.q.T(ee.d.f11783a.b(), a3.b(gVarP.k()).e())) ? c0Var.d().getDeclaredField("INSTANCE") : c0Var.d().getEnclosingClass().getDeclaredField(a3.c(gVarP.k()))).get(null);
            rd.m.c(obj, "null cannot be cast to non-null type T of kotlin.reflect.jvm.internal.KClassImpl");
            return obj;
        }

        public static final String X(c0 c0Var) {
            if (c0Var.d().isAnonymousClass()) {
                return null;
            }
            mf.b bVarQ = c0Var.Q();
            if (bVarQ.i()) {
                return null;
            }
            return bVarQ.a().a();
        }

        public static final List Y(c0 c0Var, b bVar) throws IllegalAccessException, InvocationTargetException {
            List listK;
            ClassLoader classLoaderJ = ne.f.j(c0Var.d());
            qe.g gVarP = bVar.P();
            if (gVarP != null) {
                List listM = gVarP.m();
                listK = new ArrayList();
                Iterator it = listM.iterator();
                while (it.hasNext()) {
                    yd.c cVarA = a3.a(classLoaderJ, (String) it.next());
                    if (cVarA != null) {
                        listK.add(cVarA);
                    }
                }
            } else {
                ne.b bVar2 = ne.b.f22671a;
                if (rd.m.a(bVar2.f(c0Var.d()), Boolean.TRUE)) {
                    Class[] clsArrC = bVar2.c(c0Var.d());
                    if (clsArrC != null) {
                        listK = new ArrayList(clsArrC.length);
                        for (Class cls : clsArrC) {
                            listK.add(pd.a.e(cls));
                        }
                    } else {
                        listK = null;
                    }
                    if (listK == null) {
                        listK = ed.q.k();
                    }
                } else {
                    listK = ed.q.k();
                }
            }
            rd.m.c(listK, "null cannot be cast to non-null type kotlin.collections.List<kotlin.reflect.KClass<out T of kotlin.reflect.jvm.internal.KClassImpl>>");
            return listK;
        }

        public static final String Z(c0 c0Var, b bVar) {
            if (c0Var.d().isAnonymousClass()) {
                return null;
            }
            mf.b bVarQ = c0Var.Q();
            if (bVarQ.i()) {
                return bVar.C(c0Var.d());
            }
            String strD = bVarQ.h().d();
            rd.m.d(strD, "asString(...)");
            return strD;
        }

        public static final List a0(b bVar, c0 c0Var) {
            Collection<eg.r0> collectionE = bVar.M().k().e();
            rd.m.d(collectionE, "getSupertypes(...)");
            ArrayList arrayList = new ArrayList(collectionE.size());
            for (eg.r0 r0Var : collectionE) {
                rd.m.b(r0Var);
                arrayList.add(new v2(r0Var, new n0(r0Var, bVar, c0Var)));
            }
            if (!ee.i.v0(bVar.M())) {
                if (arrayList.isEmpty()) {
                    eg.c1 c1VarI = uf.e.m(bVar.M()).i();
                    rd.m.d(c1VarI, "getAnyType(...)");
                    arrayList.add(new v2(c1VarI, p0.f3962a));
                } else {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        he.f fVarJ = qf.i.e(((v2) it.next()).n()).j();
                        rd.m.d(fVarJ, "getKind(...)");
                        if (fVarJ != he.f.f15272c && fVarJ != he.f.f15275f) {
                            break;
                        }
                    }
                    eg.c1 c1VarI2 = uf.e.m(bVar.M()).i();
                    rd.m.d(c1VarI2, "getAnyType(...)");
                    arrayList.add(new v2(c1VarI2, p0.f3962a));
                }
            }
            return og.a.c(arrayList);
        }

        public static final Type b0(eg.r0 r0Var, b bVar, c0 c0Var) {
            he.h hVarQ = r0Var.N0().q();
            if (!(hVarQ instanceof he.e)) {
                throw new z2("Supertype not a class: " + hVarQ);
            }
            Class clsQ = l3.q((he.e) hVarQ);
            if (clsQ == null) {
                throw new z2("Unsupported superclass of " + bVar + ": " + hVarQ);
            }
            if (rd.m.a(c0Var.d().getSuperclass(), clsQ)) {
                Type genericSuperclass = c0Var.d().getGenericSuperclass();
                rd.m.b(genericSuperclass);
                return genericSuperclass;
            }
            Class<?>[] interfaces = c0Var.d().getInterfaces();
            rd.m.d(interfaces, "getInterfaces(...)");
            int iL = ed.j.L(interfaces, clsQ);
            if (iL >= 0) {
                Type type = c0Var.d().getGenericInterfaces()[iL];
                rd.m.b(type);
                return type;
            }
            throw new z2("No superclass of " + bVar + " in Java reflection for " + hVarQ);
        }

        public static final Type c0() {
            return Object.class;
        }

        public static final List d0(b bVar, c0 c0Var) {
            List<he.l1> listV = bVar.M().v();
            rd.m.d(listV, "getDeclaredTypeParameters(...)");
            ArrayList arrayList = new ArrayList(ed.q.v(listV, 10));
            for (he.l1 l1Var : listV) {
                rd.m.b(l1Var);
                arrayList.add(new x2(c0Var, l1Var));
            }
            return arrayList;
        }

        public static final List y(b bVar) {
            return ed.q.s0(bVar.I(), bVar.J());
        }

        public static final List z(b bVar) {
            return ed.q.s0(bVar.K(), bVar.N());
        }

        public final Collection I() {
            Object objD = this.f3824s.d(this, f3808x[13]);
            rd.m.d(objD, "getValue(...)");
            return (Collection) objD;
        }

        public final Collection J() {
            Object objD = this.f3825t.d(this, f3808x[14]);
            rd.m.d(objD, "getValue(...)");
            return (Collection) objD;
        }

        public final Collection K() {
            Object objD = this.f3820o.d(this, f3808x[9]);
            rd.m.d(objD, "getValue(...)");
            return (Collection) objD;
        }

        public final he.e M() {
            Object objD = this.f3810e.d(this, f3808x[0]);
            rd.m.d(objD, "getValue(...)");
            return (he.e) objD;
        }

        public final qe.g P() {
            return (qe.g) this.f3809d.getValue();
        }

        public final String Q() {
            return (String) this.f3813h.d(this, f3808x[3]);
        }

        public final String R() {
            return (String) this.f3812g.d(this, f3808x[2]);
        }
    }

    public static final /* synthetic */ class c {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f3829a;

        static {
            int[] iArr = new int[a.EnumC0182a.values().length];
            try {
                iArr[a.EnumC0182a.f13028f.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.EnumC0182a.f13030h.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[a.EnumC0182a.f13031r.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[a.EnumC0182a.f13029g.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[a.EnumC0182a.f13026d.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[a.EnumC0182a.f13027e.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f3829a = iArr;
        }
    }

    public static final class d extends xf.f {
        d(ke.k kVar, dg.n nVar) {
            super(nVar, kVar);
        }

        @Override // xf.f
        protected List j() {
            return ed.q.k();
        }
    }

    static {
        Set setB = de.a.f10935a.b();
        HashSet hashSet = new HashSet();
        Iterator it = setB.iterator();
        while (it.hasNext()) {
            hashSet.add(((mf.b) it.next()).a().toString());
        }
        f3805g = hashSet;
    }

    public c0(Class cls) {
        rd.m.e(cls, "jClass");
        this.f3806d = cls;
        this.f3807e = dd.k.a(dd.n.f10910b, new a0(this));
    }

    private final he.e N(mf.b bVar, me.k kVar) {
        ke.k kVar2 = new ke.k(new ke.p(kVar.b(), bVar.f()), bVar.h(), he.e0.f15259b, he.f.f15271b, ed.q.e(kVar.b().o().h().s()), he.g1.f15281a, false, kVar.a().u());
        kVar2.K0(new d(kVar2, kVar.a().u()), ed.r0.d(), null);
        return kVar2;
    }

    public final he.e O(mf.b bVar, me.k kVar) {
        ff.a aVarA;
        if (d().isSynthetic()) {
            return N(bVar, kVar);
        }
        me.f fVarA = me.f.f21968c.a(d());
        a.EnumC0182a enumC0182aC = (fVarA == null || (aVarA = fVarA.a()) == null) ? null : aVarA.c();
        switch (enumC0182aC == null ? -1 : c.f3829a[enumC0182aC.ordinal()]) {
            case -1:
            case 6:
                throw new z2("Unresolved class: " + d() + " (kind = " + enumC0182aC + ')');
            case 0:
            default:
                throw new dd.o();
            case 1:
            case 2:
            case 3:
            case 4:
                return N(bVar, kVar);
            case 5:
                throw new z2("Unknown class: " + d() + " (kind = " + enumC0182aC + ')');
        }
    }

    public static final b P(c0 c0Var) {
        return c0Var.new b();
    }

    public final mf.b Q() {
        return h3.f3881a.c(d());
    }

    private final qe.g T() {
        return ((b) this.f3807e.getValue()).P();
    }

    public static final he.y0 U(ag.k0 k0Var, gf.o oVar) {
        rd.m.e(k0Var, "$this$deserializeToDescriptor");
        rd.m.e(oVar, "proto");
        return k0Var.u(oVar, true);
    }

    @Override // be.d1
    public Collection C(mf.f fVar) {
        rd.m.e(fVar, "name");
        xf.k kVarV = V();
        pe.d dVar = pe.d.f24120h;
        return ed.q.s0(kVarV.c(fVar, dVar), W().c(fVar, dVar));
    }

    public final dd.j R() {
        return this.f3807e;
    }

    @Override // be.y0
    /* JADX INFO: renamed from: S */
    public he.e e() {
        return ((b) this.f3807e.getValue()).M();
    }

    public final xf.k V() {
        return e().s().p();
    }

    public final xf.k W() {
        xf.k kVarU = e().U();
        rd.m.d(kVarU, "getStaticScope(...)");
        return kVarU;
    }

    @Override // yd.c
    public String a() {
        return ((b) this.f3807e.getValue()).Q();
    }

    @Override // yd.c
    public String b() {
        return ((b) this.f3807e.getValue()).R();
    }

    @Override // yd.c
    public boolean c(Object obj) {
        Integer numG = ne.f.g(d());
        if (numG != null) {
            return rd.h0.g(obj, numG.intValue());
        }
        Class clsK = ne.f.k(d());
        if (clsK == null) {
            clsK = d();
        }
        return clsK.isInstance(obj);
    }

    @Override // rd.e
    public Class d() {
        return this.f3806d;
    }

    public boolean equals(Object obj) {
        return (obj instanceof c0) && rd.m.a(pd.a.c(this), pd.a.c((yd.c) obj));
    }

    @Override // yd.c
    public int hashCode() {
        return pd.a.c(this).hashCode();
    }

    @Override // yd.c
    public boolean m() {
        qe.g gVarT = T();
        return gVarT != null && qe.a.b(gVarT);
    }

    public String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("class ");
        mf.b bVarQ = Q();
        mf.c cVarF = bVarQ.f();
        if (cVarF.c()) {
            str = "";
        } else {
            str = cVarF.a() + '.';
        }
        sb2.append(str + rg.q.E(bVarQ.g().a(), '.', '$', false, 4, null));
        return sb2.toString();
    }

    @Override // be.d1
    public Collection x() {
        he.e eVarE = e();
        if (eVarE.j() == he.f.f15272c || eVarE.j() == he.f.f15276g) {
            return ed.q.k();
        }
        Collection constructors = eVarE.getConstructors();
        rd.m.d(constructors, "getConstructors(...)");
        return constructors;
    }

    @Override // be.d1
    public Collection y(mf.f fVar) {
        rd.m.e(fVar, "name");
        xf.k kVarV = V();
        pe.d dVar = pe.d.f24120h;
        return ed.q.s0(kVarV.a(fVar, dVar), W().a(fVar, dVar));
    }

    @Override // be.d1
    public he.y0 z(int i10) {
        Class<?> declaringClass;
        if (rd.m.a(d().getSimpleName(), "DefaultImpls") && (declaringClass = d().getDeclaringClass()) != null && declaringClass.isInterface()) {
            yd.c cVarE = pd.a.e(declaringClass);
            rd.m.c(cVarE, "null cannot be cast to non-null type kotlin.reflect.jvm.internal.KClassImpl<*>");
            return ((c0) cVarE).z(i10);
        }
        he.e eVarE = e();
        cg.m mVar = eVarE instanceof cg.m ? (cg.m) eVarE : null;
        if (mVar != null) {
            gf.c cVarE1 = mVar.e1();
            i.f fVar = kf.a.f19842j;
            rd.m.d(fVar, "classLocalVariable");
            gf.o oVar = (gf.o) jf.f.b(cVarE1, fVar, i10);
            if (oVar != null) {
                return (he.y0) l3.h(d(), oVar, mVar.d1().g(), mVar.d1().j(), mVar.g1(), b0.f3799a);
            }
        }
        return null;
    }
}
