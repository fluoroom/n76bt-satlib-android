package ze;

import eg.c2;
import eg.h2;
import eg.m2;
import eg.q1;
import eg.u1;
import he.e1;
import he.j1;
import he.l1;
import he.m0;
import he.p1;
import he.w1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class n extends ke.j implements xe.c {
    public static final a H = new a(null);
    private static final Set I = ed.r0.g("equals", "hashCode", "getClass", "wait", "notify", "notifyAll", "toString");
    private final b A;
    private final z B;
    private final e1 C;
    private final xf.g D;
    private final z0 E;
    private final ie.h F;
    private final dg.i G;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final ye.k f33184r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final cf.g f33185s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final he.e f33186t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final ye.k f33187u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final dd.j f33188v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final he.f f33189w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final he.e0 f33190x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final w1 f33191y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final boolean f33192z;

    public static final class a {
        public /* synthetic */ a(rd.h hVar) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    final class b extends eg.b {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final dg.i f33193d;

        public b() {
            super(n.this.f33187u.e());
            this.f33193d = n.this.f33187u.e().d(new o(n.this));
        }

        private final eg.r0 K() {
            mf.c cVarB;
            ArrayList arrayList;
            mf.c cVarL = L();
            if (cVarL == null || cVarL.c() || !cVarL.h(ee.o.A)) {
                cVarL = null;
            }
            if (cVarL == null) {
                cVarB = ve.r.f30667a.b(uf.e.o(n.this));
                if (cVarB == null) {
                    return null;
                }
            } else {
                cVarB = cVarL;
            }
            he.e eVarB = uf.e.B(n.this.f33187u.d(), cVarB, pe.d.B);
            if (eVarB == null) {
                return null;
            }
            int size = eVarB.k().getParameters().size();
            List parameters = n.this.k().getParameters();
            rd.m.d(parameters, "getParameters(...)");
            int size2 = parameters.size();
            if (size2 == size) {
                arrayList = new ArrayList(ed.q.v(parameters, 10));
                Iterator it = parameters.iterator();
                while (it.hasNext()) {
                    arrayList.add(new c2(m2.f12140e, ((l1) it.next()).s()));
                }
            } else {
                if (size2 != 1 || size <= 1 || cVarL != null) {
                    return null;
                }
                c2 c2Var = new c2(m2.f12140e, ((l1) ed.q.w0(parameters)).s());
                xd.c cVar = new xd.c(1, size);
                ArrayList arrayList2 = new ArrayList(ed.q.v(cVar, 10));
                Iterator it2 = cVar.iterator();
                while (it2.hasNext()) {
                    ((ed.j0) it2).nextInt();
                    arrayList2.add(c2Var);
                }
                arrayList = arrayList2;
            }
            return eg.u0.h(q1.f12167b.k(), eVarB, arrayList);
        }

        private final mf.c L() {
            String str;
            ie.h annotations = n.this.getAnnotations();
            mf.c cVar = ve.j0.f30616r;
            rd.m.d(cVar, "PURELY_IMPLEMENTS_ANNOTATION");
            ie.c cVarA = annotations.a(cVar);
            if (cVarA == null) {
                return null;
            }
            Object objX0 = ed.q.x0(cVarA.a().values());
            sf.x xVar = objX0 instanceof sf.x ? (sf.x) objX0 : null;
            if (xVar == null || (str = (String) xVar.b()) == null || !mf.e.e(str)) {
                return null;
            }
            return new mf.c(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final List M(n nVar) {
            return p1.g(nVar);
        }

        @Override // eg.v, eg.u1
        /* JADX INFO: renamed from: I */
        public he.e q() {
            return n.this;
        }

        @Override // eg.u1
        public List getParameters() {
            return (List) this.f33193d.a();
        }

        @Override // eg.p
        protected Collection m() {
            Collection collectionE = n.this.S0().e();
            ArrayList arrayList = new ArrayList(collectionE.size());
            ArrayList<cf.x> arrayList2 = new ArrayList(0);
            eg.r0 r0VarK = K();
            Iterator it = collectionE.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                cf.j jVar = (cf.j) it.next();
                eg.r0 r0VarQ = n.this.f33187u.a().r().q(n.this.f33187u.g().p(jVar, af.b.b(h2.f12103a, false, false, null, 7, null)), n.this.f33187u);
                if (r0VarQ.N0().q() instanceof m0.b) {
                    arrayList2.add(jVar);
                }
                if (!rd.m.a(r0VarQ.N0(), r0VarK != null ? r0VarK.N0() : null) && !ee.i.c0(r0VarQ)) {
                    arrayList.add(r0VarQ);
                }
            }
            he.e eVar = n.this.f33186t;
            og.a.a(arrayList, eVar != null ? ge.y.a(eVar, n.this).c().p(eVar.s(), m2.f12140e) : null);
            og.a.a(arrayList, r0VarK);
            if (!arrayList2.isEmpty()) {
                ag.w wVarC = n.this.f33187u.a().c();
                he.e eVarQ = q();
                ArrayList arrayList3 = new ArrayList(ed.q.v(arrayList2, 10));
                for (cf.x xVar : arrayList2) {
                    rd.m.c(xVar, "null cannot be cast to non-null type org.jetbrains.kotlin.load.java.structure.JavaClassifierType");
                    arrayList3.add(((cf.j) xVar).p());
                }
                wVarC.b(eVarQ, arrayList3);
            }
            return !arrayList.isEmpty() ? ed.q.H0(arrayList) : ed.q.e(n.this.f33187u.d().o().i());
        }

        @Override // eg.u1
        public boolean r() {
            return true;
        }

        public String toString() {
            String strD = n.this.getName().d();
            rd.m.d(strD, "asString(...)");
            return strD;
        }

        @Override // eg.p
        protected j1 v() {
            return n.this.f33187u.a().v();
        }
    }

    public /* synthetic */ n(ye.k kVar, he.m mVar, cf.g gVar, he.e eVar, int i10, rd.h hVar) {
        this(kVar, mVar, gVar, (i10 & 8) != 0 ? null : eVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List Q0(n nVar) {
        List<cf.y> typeParameters = nVar.f33185s.getTypeParameters();
        ArrayList arrayList = new ArrayList(ed.q.v(typeParameters, 10));
        for (cf.y yVar : typeParameters) {
            l1 l1VarA = nVar.f33187u.f().a(yVar);
            if (l1VarA == null) {
                throw new AssertionError("Parameter " + yVar + " surely belongs to class " + nVar.f33185s + ", so it must be resolved");
            }
            arrayList.add(l1VarA);
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List W0(n nVar) {
        mf.b bVarN = uf.e.n(nVar);
        if (bVarN != null) {
            return nVar.f33184r.a().f().a(bVarN);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final z X0(n nVar, fg.g gVar) {
        rd.m.e(gVar, "it");
        return new z(nVar.f33187u, nVar, nVar.f33185s, nVar.f33186t != null, nVar.B);
    }

    @Override // he.e
    public boolean B() {
        return false;
    }

    @Override // he.d0
    public boolean F0() {
        return false;
    }

    @Override // he.e
    public boolean G() {
        return false;
    }

    @Override // he.d0
    public boolean M() {
        return false;
    }

    @Override // he.i
    public boolean N() {
        return this.f33192z;
    }

    public final n P0(we.j jVar, he.e eVar) {
        rd.m.e(jVar, "javaResolverCache");
        ye.k kVar = this.f33187u;
        ye.k kVarM = ye.c.m(kVar, kVar.a().x(jVar));
        he.m mVarB = b();
        rd.m.d(mVarB, "getContainingDeclaration(...)");
        return new n(kVarM, mVarB, this.f33185s, eVar);
    }

    @Override // he.e
    /* JADX INFO: renamed from: R0, reason: merged with bridge method [inline-methods] */
    public List getConstructors() {
        return (List) this.B.a1().a();
    }

    public final cf.g S0() {
        return this.f33185s;
    }

    @Override // he.e
    public he.d T() {
        return null;
    }

    public final List T0() {
        return (List) this.f33188v.getValue();
    }

    @Override // he.e
    public xf.k U() {
        return this.E;
    }

    @Override // ke.a, he.e
    /* JADX INFO: renamed from: U0, reason: merged with bridge method [inline-methods] */
    public z E0() {
        xf.k kVarE0 = super.E0();
        rd.m.c(kVarE0, "null cannot be cast to non-null type org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope");
        return (z) kVarE0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ke.z
    /* JADX INFO: renamed from: V0, reason: merged with bridge method [inline-methods] */
    public z f0(fg.g gVar) {
        rd.m.e(gVar, "kotlinTypeRefiner");
        return (z) this.C.c(gVar);
    }

    @Override // he.e
    public he.e W() {
        return null;
    }

    @Override // ie.a
    public ie.h getAnnotations() {
        return this.F;
    }

    @Override // he.e, he.d0, he.q
    public he.u getVisibility() {
        if (!rd.m.a(this.f33191y, he.t.f15305a) || this.f33185s.k() != null) {
            return ve.v0.d(this.f33191y);
        }
        he.u uVar = ve.y.f30717a;
        rd.m.b(uVar);
        return uVar;
    }

    @Override // he.e
    public boolean isData() {
        return false;
    }

    @Override // he.e
    public boolean isInline() {
        return false;
    }

    @Override // he.e
    public he.f j() {
        return this.f33189w;
    }

    @Override // he.h
    public u1 k() {
        return this.A;
    }

    @Override // he.e, he.d0
    public he.e0 l() {
        return this.f33190x;
    }

    @Override // he.e
    public boolean m() {
        return false;
    }

    public String toString() {
        return "Lazy Java class " + uf.e.p(this);
    }

    @Override // he.e, he.i
    public List v() {
        return (List) this.G.a();
    }

    @Override // ke.a, he.e
    public xf.k y0() {
        return this.D;
    }

    @Override // he.e
    public he.q1 z0() {
        return null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(ye.k kVar, he.m mVar, cf.g gVar, he.e eVar) {
        he.e0 e0VarA;
        super(kVar.e(), mVar, gVar.getName(), kVar.a().t().a(gVar), false);
        rd.m.e(kVar, "outerContext");
        rd.m.e(mVar, "containingDeclaration");
        rd.m.e(gVar, "jClass");
        this.f33184r = kVar;
        this.f33185s = gVar;
        this.f33186t = eVar;
        ye.k kVarF = ye.c.f(kVar, this, gVar, 0, 4, null);
        this.f33187u = kVarF;
        kVarF.a().h().c(gVar, this);
        gVar.I();
        this.f33188v = dd.k.b(new k(this));
        this.f33189w = gVar.q() ? he.f.f15275f : gVar.G() ? he.f.f15272c : gVar.B() ? he.f.f15273d : he.f.f15271b;
        if (gVar.q() || gVar.B()) {
            e0VarA = he.e0.f15259b;
        } else {
            e0VarA = he.e0.f15258a.a(gVar.D(), gVar.D() || gVar.H() || gVar.G(), !gVar.o());
        }
        this.f33190x = e0VarA;
        this.f33191y = gVar.getVisibility();
        this.f33192z = (gVar.k() == null || gVar.O()) ? false : true;
        this.A = new b();
        z zVar = new z(kVarF, this, gVar, eVar != null, null, 16, null);
        this.B = zVar;
        this.C = e1.f15265e.a(this, kVarF.e(), kVarF.a().k().d(), new l(this));
        this.D = new xf.g(zVar);
        this.E = new z0(kVarF, gVar, this);
        this.F = ye.h.a(kVarF, gVar);
        this.G = kVarF.e().d(new m(this));
    }
}
