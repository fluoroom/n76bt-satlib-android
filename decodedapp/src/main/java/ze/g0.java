package ze;

import ef.v;
import ff.a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import ve.u;
import xf.d;
import ze.c;

/* JADX INFO: loaded from: classes3.dex */
public final class g0 extends a1 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final cf.u f33151n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final d0 f33152o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final dg.j f33153p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final dg.h f33154q;

    /* JADX INFO: Access modifiers changed from: private */
    static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final mf.f f33155a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final cf.g f33156b;

        public a(mf.f fVar, cf.g gVar) {
            rd.m.e(fVar, "name");
            this.f33155a = fVar;
            this.f33156b = gVar;
        }

        public final cf.g a() {
            return this.f33156b;
        }

        public final mf.f b() {
            return this.f33155a;
        }

        public boolean equals(Object obj) {
            return (obj instanceof a) && rd.m.a(this.f33155a, ((a) obj).f33155a);
        }

        public int hashCode() {
            return this.f33155a.hashCode();
        }
    }

    private static abstract class b {

        public static final class a extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final he.e f33157a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(he.e eVar) {
                super(null);
                rd.m.e(eVar, "descriptor");
                this.f33157a = eVar;
            }

            public final he.e a() {
                return this.f33157a;
            }
        }

        /* JADX INFO: renamed from: ze.g0$b$b, reason: collision with other inner class name */
        public static final class C0449b extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0449b f33158a = new C0449b();

            private C0449b() {
                super(null);
            }
        }

        public static final class c extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final c f33159a = new c();

            private c() {
                super(null);
            }
        }

        public /* synthetic */ b(rd.h hVar) {
            this();
        }

        private b() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(ye.k kVar, cf.u uVar, d0 d0Var) {
        super(kVar);
        rd.m.e(kVar, "c");
        rd.m.e(uVar, "jPackage");
        rd.m.e(d0Var, "ownerDescriptor");
        this.f33151n = uVar;
        this.f33152o = d0Var;
        this.f33153p = kVar.e().a(new e0(kVar, this));
        this.f33154q = kVar.e().h(new f0(this, kVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final he.e i0(g0 g0Var, ye.k kVar, a aVar) {
        rd.m.e(aVar, "request");
        mf.b bVar = new mf.b(g0Var.R().d(), aVar.b());
        v.a aVarA = aVar.a() != null ? kVar.a().j().a(aVar.a(), g0Var.m0()) : kVar.a().j().b(bVar, g0Var.m0());
        ef.x xVarA = aVarA != null ? aVarA.a() : null;
        mf.b bVarH = xVarA != null ? xVarA.h() : null;
        if (bVarH != null && (bVarH.j() || bVarH.i())) {
            return null;
        }
        b bVarP0 = g0Var.p0(xVarA);
        if (bVarP0 instanceof b.a) {
            return ((b.a) bVarP0).a();
        }
        if (bVarP0 instanceof b.c) {
            return null;
        }
        if (!(bVarP0 instanceof b.C0449b)) {
            throw new dd.o();
        }
        cf.g gVarA = aVar.a();
        if (gVarA == null) {
            gVarA = kVar.a().d().a(new u.a(bVar, null, null, 4, null));
        }
        cf.g gVar = gVarA;
        if ((gVar != null ? gVar.I() : null) != cf.d0.f4771b) {
            mf.c cVarD = gVar != null ? gVar.d() : null;
            if (cVarD == null || cVarD.c() || !rd.m.a(cVarD.d(), g0Var.R().d())) {
                return null;
            }
            n nVar = new n(kVar, g0Var.R(), gVar, null, 8, null);
            kVar.a().e().a(nVar);
            return nVar;
        }
        throw new IllegalStateException("Couldn't find kotlin binary class for light class created by kotlin binary file\nJavaClass: " + gVar + "\nClassId: " + bVar + "\nfindKotlinClass(JavaClass) = " + ef.w.a(kVar.a().j(), gVar, g0Var.m0()) + "\nfindKotlinClass(ClassId) = " + ef.w.b(kVar.a().j(), bVar, g0Var.m0()) + '\n');
    }

    private final he.e j0(mf.f fVar, cf.g gVar) {
        if (!mf.h.f22010a.a(fVar)) {
            return null;
        }
        Set set = (Set) this.f33153p.a();
        if (gVar != null || set == null || set.contains(fVar.d())) {
            return (he.e) this.f33154q.l(new a(fVar, gVar));
        }
        return null;
    }

    private final jf.c m0() {
        return L().a().b().f().g().g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Set o0(ye.k kVar, g0 g0Var) {
        return kVar.a().d().c(g0Var.R().d());
    }

    private final b p0(ef.x xVar) {
        if (xVar == null) {
            return b.C0449b.f33158a;
        }
        if (xVar.a().c() != a.EnumC0182a.f13027e) {
            return b.c.f33159a;
        }
        he.e eVarN = L().a().b().n(xVar);
        return eVarN != null ? new b.a(eVarN) : b.C0449b.f33158a;
    }

    @Override // ze.t0
    protected void B(Collection collection, mf.f fVar) {
        rd.m.e(collection, "result");
        rd.m.e(fVar, "name");
    }

    @Override // ze.t0
    protected Set D(xf.d dVar, qd.l lVar) {
        rd.m.e(dVar, "kindFilter");
        return ed.r0.d();
    }

    @Override // ze.t0, xf.l, xf.k
    public Collection c(mf.f fVar, pe.b bVar) {
        rd.m.e(fVar, "name");
        rd.m.e(bVar, "location");
        return ed.q.k();
    }

    @Override // ze.t0, xf.l, xf.n
    public Collection e(xf.d dVar, qd.l lVar) {
        rd.m.e(dVar, "kindFilter");
        rd.m.e(lVar, "nameFilter");
        d.a aVar = xf.d.f32038c;
        if (!dVar.a(aVar.e() | aVar.c())) {
            return ed.q.k();
        }
        Iterable iterable = (Iterable) K().a();
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            he.m mVar = (he.m) obj;
            if (mVar instanceof he.e) {
                mf.f name = ((he.e) mVar).getName();
                rd.m.d(name, "getName(...)");
                if (((Boolean) lVar.l(name)).booleanValue()) {
                    arrayList.add(obj);
                }
            }
        }
        return arrayList;
    }

    public final he.e k0(cf.g gVar) {
        rd.m.e(gVar, "javaClass");
        return j0(gVar.getName(), gVar);
    }

    @Override // xf.l, xf.n
    /* JADX INFO: renamed from: l0, reason: merged with bridge method [inline-methods] */
    public he.e g(mf.f fVar, pe.b bVar) {
        rd.m.e(fVar, "name");
        rd.m.e(bVar, "location");
        return j0(fVar, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ze.t0
    /* JADX INFO: renamed from: n0, reason: merged with bridge method [inline-methods] */
    public d0 R() {
        return this.f33152o;
    }

    @Override // ze.t0
    protected Set v(xf.d dVar, qd.l lVar) {
        rd.m.e(dVar, "kindFilter");
        if (!dVar.a(xf.d.f32038c.e())) {
            return ed.r0.d();
        }
        Set set = (Set) this.f33153p.a();
        if (set != null) {
            HashSet hashSet = new HashSet();
            Iterator it = set.iterator();
            while (it.hasNext()) {
                hashSet.add(mf.f.h((String) it.next()));
            }
            return hashSet;
        }
        cf.u uVar = this.f33151n;
        if (lVar == null) {
            lVar = og.i.k();
        }
        Collection<cf.g> collectionT = uVar.t(lVar);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (cf.g gVar : collectionT) {
            mf.f name = gVar.I() == cf.d0.f4770a ? null : gVar.getName();
            if (name != null) {
                linkedHashSet.add(name);
            }
        }
        return linkedHashSet;
    }

    @Override // ze.t0
    protected Set x(xf.d dVar, qd.l lVar) {
        rd.m.e(dVar, "kindFilter");
        return ed.r0.d();
    }

    @Override // ze.t0
    protected c z() {
        return c.a.f33128a;
    }
}
