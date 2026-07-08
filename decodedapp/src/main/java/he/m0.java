package he;

import eg.m2;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import xf.k;

/* JADX INFO: loaded from: classes3.dex */
public final class m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final dg.n f15289a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final h0 f15290b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final dg.g f15291c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final dg.g f15292d;

    /* JADX INFO: Access modifiers changed from: private */
    static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final mf.b f15293a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final List f15294b;

        public a(mf.b bVar, List list) {
            rd.m.e(bVar, "classId");
            rd.m.e(list, "typeParametersCount");
            this.f15293a = bVar;
            this.f15294b = list;
        }

        public final mf.b a() {
            return this.f15293a;
        }

        public final List b() {
            return this.f15294b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return rd.m.a(this.f15293a, aVar.f15293a) && rd.m.a(this.f15294b, aVar.f15294b);
        }

        public int hashCode() {
            return (this.f15293a.hashCode() * 31) + this.f15294b.hashCode();
        }

        public String toString() {
            return "ClassRequest(classId=" + this.f15293a + ", typeParametersCount=" + this.f15294b + ')';
        }
    }

    public static final class b extends ke.j {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private final boolean f15295r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private final List f15296s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final eg.u f15297t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(dg.n nVar, m mVar, mf.f fVar, boolean z10, int i10) {
            super(nVar, mVar, fVar, g1.f15281a, false);
            rd.m.e(nVar, "storageManager");
            rd.m.e(mVar, "container");
            rd.m.e(fVar, "name");
            this.f15295r = z10;
            xd.c cVarI = xd.d.i(0, i10);
            ArrayList arrayList = new ArrayList(ed.q.v(cVarI, 10));
            Iterator it = cVarI.iterator();
            while (it.hasNext()) {
                int iNextInt = ((ed.j0) it).nextInt();
                ie.h hVarB = ie.h.f16054l.b();
                m2 m2Var = m2.f12140e;
                StringBuilder sb2 = new StringBuilder();
                sb2.append('T');
                sb2.append(iNextInt);
                arrayList.add(ke.t0.R0(this, hVarB, false, m2Var, mf.f.h(sb2.toString()), iNextInt, nVar));
            }
            this.f15296s = arrayList;
            this.f15297t = new eg.u(this, p1.g(this), ed.r0.c(uf.e.s(this).o().i()), nVar);
        }

        @Override // ke.j, he.d0
        public boolean A() {
            return false;
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

        @Override // he.e
        /* JADX INFO: renamed from: K0, reason: merged with bridge method [inline-methods] */
        public k.b U() {
            return k.b.f32079b;
        }

        @Override // he.h
        /* JADX INFO: renamed from: L0, reason: merged with bridge method [inline-methods] */
        public eg.u k() {
            return this.f15297t;
        }

        @Override // he.d0
        public boolean M() {
            return false;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // ke.z
        /* JADX INFO: renamed from: M0, reason: merged with bridge method [inline-methods] */
        public k.b f0(fg.g gVar) {
            rd.m.e(gVar, "kotlinTypeRefiner");
            return k.b.f32079b;
        }

        @Override // he.i
        public boolean N() {
            return this.f15295r;
        }

        @Override // he.e
        public d T() {
            return null;
        }

        @Override // he.e
        public e W() {
            return null;
        }

        @Override // ie.a
        public ie.h getAnnotations() {
            return ie.h.f16054l.b();
        }

        @Override // he.e
        public Collection getConstructors() {
            return ed.r0.d();
        }

        @Override // he.e, he.d0, he.q
        public u getVisibility() {
            u uVar = t.f15309e;
            rd.m.d(uVar, "PUBLIC");
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
        public f j() {
            return f.f15271b;
        }

        @Override // he.e, he.d0
        public e0 l() {
            return e0.f15259b;
        }

        @Override // he.e
        public boolean m() {
            return false;
        }

        public String toString() {
            return "class " + getName() + " (not found)";
        }

        @Override // he.e, he.i
        public List v() {
            return this.f15296s;
        }

        @Override // he.e
        public q1 z0() {
            return null;
        }
    }

    public m0(dg.n nVar, h0 h0Var) {
        rd.m.e(nVar, "storageManager");
        rd.m.e(h0Var, "module");
        this.f15289a = nVar;
        this.f15290b = h0Var;
        this.f15291c = nVar.f(new k0(this));
        this.f15292d = nVar.f(new l0(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final e c(m0 m0Var, a aVar) {
        m mVarD;
        rd.m.e(aVar, "<destruct>");
        mf.b bVarA = aVar.a();
        List listB = aVar.b();
        if (bVarA.i()) {
            throw new UnsupportedOperationException("Unresolved local class: " + bVarA);
        }
        mf.b bVarE = bVarA.e();
        if (bVarE == null || (mVarD = m0Var.d(bVarE, ed.q.V(listB, 1))) == null) {
            mVarD = (g) m0Var.f15291c.l(bVarA.f());
        }
        m mVar = mVarD;
        boolean zJ = bVarA.j();
        dg.n nVar = m0Var.f15289a;
        mf.f fVarH = bVarA.h();
        Integer num = (Integer) ed.q.b0(listB);
        return new b(nVar, mVar, fVarH, zJ, num != null ? num.intValue() : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final n0 e(m0 m0Var, mf.c cVar) {
        rd.m.e(cVar, "fqName");
        return new ke.p(m0Var.f15290b, cVar);
    }

    public final e d(mf.b bVar, List list) {
        rd.m.e(bVar, "classId");
        rd.m.e(list, "typeParametersCount");
        return (e) this.f15292d.l(new a(bVar, list));
    }
}
