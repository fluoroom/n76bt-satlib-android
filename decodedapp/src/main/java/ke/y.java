package ke;

import eg.c1;
import eg.d2;
import eg.f2;
import eg.i2;
import eg.m2;
import eg.u1;
import he.b1;
import he.g1;
import he.l1;
import he.q1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class y extends z {

    /* JADX INFO: renamed from: b */
    private final z f19824b;

    /* JADX INFO: renamed from: c */
    private final f2 f19825c;

    /* JADX INFO: renamed from: d */
    private f2 f19826d;

    /* JADX INFO: renamed from: e */
    private List f19827e;

    /* JADX INFO: renamed from: f */
    private List f19828f;

    /* JADX INFO: renamed from: g */
    private u1 f19829g;

    class a implements qd.l {
        a() {
        }

        @Override // qd.l
        /* JADX INFO: renamed from: b */
        public Boolean l(l1 l1Var) {
            return Boolean.valueOf(!l1Var.n0());
        }
    }

    class b implements qd.l {
        b() {
        }

        @Override // qd.l
        /* JADX INFO: renamed from: b */
        public c1 l(c1 c1Var) {
            return y.this.M0(c1Var);
        }
    }

    public y(z zVar, f2 f2Var) {
        this.f19824b = zVar;
        this.f19825c = f2Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static /* synthetic */ void B0(int r15) {
        /*
            Method dump skipped, instruction units count: 318
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ke.y.B0(int):void");
    }

    private f2 K0() {
        if (this.f19826d == null) {
            if (this.f19825c.k()) {
                this.f19826d = this.f19825c;
            } else {
                List parameters = this.f19824b.k().getParameters();
                this.f19827e = new ArrayList(parameters.size());
                this.f19826d = eg.c0.b(parameters, this.f19825c.j(), this, this.f19827e);
                this.f19828f = ed.q.X(this.f19827e, new a());
            }
        }
        return this.f19826d;
    }

    public c1 M0(c1 c1Var) {
        return (c1Var == null || this.f19825c.k()) ? c1Var : (c1) K0().p(c1Var, m2.f12140e);
    }

    @Override // he.d0
    public boolean A() {
        return this.f19824b.A();
    }

    @Override // he.e
    public boolean B() {
        return this.f19824b.B();
    }

    @Override // he.e
    public xf.k E0() {
        xf.k kVarF0 = f0(uf.e.r(qf.i.g(this.f19824b)));
        if (kVarF0 == null) {
            B0(12);
        }
        return kVarF0;
    }

    @Override // he.d0
    public boolean F0() {
        return this.f19824b.F0();
    }

    @Override // he.e
    public boolean G() {
        return this.f19824b.G();
    }

    @Override // he.e
    public List H0() {
        List list = Collections.EMPTY_LIST;
        if (list == null) {
            B0(17);
        }
        return list;
    }

    @Override // he.e
    public b1 J0() {
        throw new UnsupportedOperationException();
    }

    @Override // ke.z
    public xf.k K(d2 d2Var, fg.g gVar) {
        if (d2Var == null) {
            B0(5);
        }
        if (gVar == null) {
            B0(6);
        }
        xf.k kVarK = this.f19824b.K(d2Var, gVar);
        if (!this.f19825c.k()) {
            return new xf.t(kVarK, K0());
        }
        if (kVarK == null) {
            B0(7);
        }
        return kVarK;
    }

    @Override // he.i1
    /* JADX INFO: renamed from: L0 */
    public he.e c(f2 f2Var) {
        if (f2Var == null) {
            B0(23);
        }
        return f2Var.k() ? this : new y(this, f2.h(f2Var.j(), K0().j()));
    }

    @Override // he.d0
    public boolean M() {
        return this.f19824b.M();
    }

    @Override // he.i
    public boolean N() {
        return this.f19824b.N();
    }

    @Override // he.e
    public xf.k O(d2 d2Var) {
        if (d2Var == null) {
            B0(10);
        }
        xf.k kVarK = K(d2Var, uf.e.r(qf.i.g(this)));
        if (kVarK == null) {
            B0(11);
        }
        return kVarK;
    }

    @Override // he.e
    public he.d T() {
        return this.f19824b.T();
    }

    @Override // he.e
    public xf.k U() {
        xf.k kVarU = this.f19824b.U();
        if (kVarU == null) {
            B0(15);
        }
        return kVarU;
    }

    @Override // he.e
    public he.e W() {
        return this.f19824b.W();
    }

    @Override // he.e, he.n, he.m
    public he.m b() {
        he.m mVarB = this.f19824b.b();
        if (mVarB == null) {
            B0(22);
        }
        return mVarB;
    }

    @Override // ke.z
    public xf.k f0(fg.g gVar) {
        if (gVar == null) {
            B0(13);
        }
        xf.k kVarF0 = this.f19824b.f0(gVar);
        if (!this.f19825c.k()) {
            return new xf.t(kVarF0, K0());
        }
        if (kVarF0 == null) {
            B0(14);
        }
        return kVarF0;
    }

    @Override // ie.a
    public ie.h getAnnotations() {
        ie.h annotations = this.f19824b.getAnnotations();
        if (annotations == null) {
            B0(19);
        }
        return annotations;
    }

    @Override // he.e
    public Collection getConstructors() {
        Collection<he.d> constructors = this.f19824b.getConstructors();
        ArrayList arrayList = new ArrayList(constructors.size());
        for (he.d dVar : constructors) {
            arrayList.add(((he.d) dVar.u().b(dVar.a()).e(dVar.l()).h(dVar.getVisibility()).s(dVar.j()).l(false).build()).c(K0()));
        }
        return arrayList;
    }

    @Override // he.j0
    public mf.f getName() {
        mf.f name = this.f19824b.getName();
        if (name == null) {
            B0(20);
        }
        return name;
    }

    @Override // he.p
    public g1 getSource() {
        g1 g1Var = g1.f15281a;
        if (g1Var == null) {
            B0(29);
        }
        return g1Var;
    }

    @Override // he.e, he.d0, he.q
    public he.u getVisibility() {
        he.u visibility = this.f19824b.getVisibility();
        if (visibility == null) {
            B0(27);
        }
        return visibility;
    }

    @Override // he.e
    public boolean isData() {
        return this.f19824b.isData();
    }

    @Override // he.e
    public boolean isInline() {
        return this.f19824b.isInline();
    }

    @Override // he.e
    public he.f j() {
        he.f fVarJ = this.f19824b.j();
        if (fVarJ == null) {
            B0(25);
        }
        return fVarJ;
    }

    @Override // he.h
    public u1 k() {
        u1 u1VarK = this.f19824b.k();
        if (this.f19825c.k()) {
            if (u1VarK == null) {
                B0(0);
            }
            return u1VarK;
        }
        if (this.f19829g == null) {
            f2 f2VarK0 = K0();
            Collection collectionE = u1VarK.e();
            ArrayList arrayList = new ArrayList(collectionE.size());
            Iterator it = collectionE.iterator();
            while (it.hasNext()) {
                arrayList.add(f2VarK0.p((eg.r0) it.next(), m2.f12140e));
            }
            this.f19829g = new eg.u(this, this.f19827e, arrayList, dg.f.f11065e);
        }
        u1 u1Var = this.f19829g;
        if (u1Var == null) {
            B0(1);
        }
        return u1Var;
    }

    @Override // he.e, he.d0
    public he.e0 l() {
        he.e0 e0VarL = this.f19824b.l();
        if (e0VarL == null) {
            B0(26);
        }
        return e0VarL;
    }

    @Override // he.e
    public boolean m() {
        return this.f19824b.m();
    }

    @Override // he.e, he.h
    public c1 s() {
        c1 c1VarM = eg.u0.m(eg.x.f12218a.a(getAnnotations(), null, null), k(), i2.g(k().getParameters()), false, E0());
        if (c1VarM == null) {
            B0(16);
        }
        return c1VarM;
    }

    @Override // he.m
    public Object t0(he.o oVar, Object obj) {
        return oVar.h(this, obj);
    }

    @Override // he.e, he.i
    public List v() {
        K0();
        List list = this.f19828f;
        if (list == null) {
            B0(30);
        }
        return list;
    }

    @Override // he.e
    public xf.k y0() {
        xf.k kVarY0 = this.f19824b.y0();
        if (kVarY0 == null) {
            B0(28);
        }
        return kVarY0;
    }

    @Override // he.e
    public q1 z0() {
        q1 q1VarZ0 = this.f19824b.z0();
        if (q1VarZ0 == null) {
            return null;
        }
        return q1VarZ0.b(new b());
    }

    @Override // he.m
    public he.e a() {
        he.e eVarA = this.f19824b.a();
        if (eVarA == null) {
            B0(21);
        }
        return eVarA;
    }
}
