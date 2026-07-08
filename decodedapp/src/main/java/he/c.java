package he;

import eg.m2;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
final class c implements l1 {

    /* JADX INFO: renamed from: a */
    private final l1 f15251a;

    /* JADX INFO: renamed from: b */
    private final m f15252b;

    /* JADX INFO: renamed from: c */
    private final int f15253c;

    public c(l1 l1Var, m mVar, int i10) {
        rd.m.e(l1Var, "originalDescriptor");
        rd.m.e(mVar, "declarationDescriptor");
        this.f15251a = l1Var;
        this.f15252b = mVar;
        this.f15253c = i10;
    }

    @Override // he.l1
    public boolean I() {
        return this.f15251a.I();
    }

    @Override // he.n, he.m
    public m b() {
        return this.f15252b;
    }

    @Override // ie.a
    public ie.h getAnnotations() {
        return this.f15251a.getAnnotations();
    }

    @Override // he.l1
    public int getIndex() {
        return this.f15253c + this.f15251a.getIndex();
    }

    @Override // he.j0
    public mf.f getName() {
        mf.f name = this.f15251a.getName();
        rd.m.d(name, "getName(...)");
        return name;
    }

    @Override // he.p
    public g1 getSource() {
        g1 source = this.f15251a.getSource();
        rd.m.d(source, "getSource(...)");
        return source;
    }

    @Override // he.l1
    public List getUpperBounds() {
        List upperBounds = this.f15251a.getUpperBounds();
        rd.m.d(upperBounds, "getUpperBounds(...)");
        return upperBounds;
    }

    @Override // he.l1
    public dg.n i0() {
        dg.n nVarI0 = this.f15251a.i0();
        rd.m.d(nVarI0, "getStorageManager(...)");
        return nVarI0;
    }

    @Override // he.l1, he.h
    public eg.u1 k() {
        eg.u1 u1VarK = this.f15251a.k();
        rd.m.d(u1VarK, "getTypeConstructor(...)");
        return u1VarK;
    }

    @Override // he.l1
    public m2 n() {
        m2 m2VarN = this.f15251a.n();
        rd.m.d(m2VarN, "getVariance(...)");
        return m2VarN;
    }

    @Override // he.l1
    public boolean n0() {
        return true;
    }

    @Override // he.h
    public eg.c1 s() {
        eg.c1 c1VarS = this.f15251a.s();
        rd.m.d(c1VarS, "getDefaultType(...)");
        return c1VarS;
    }

    @Override // he.m
    public Object t0(o oVar, Object obj) {
        return this.f15251a.t0(oVar, obj);
    }

    public String toString() {
        return this.f15251a + "[inner-copy]";
    }

    @Override // he.m
    public l1 a() {
        l1 l1VarA = this.f15251a.a();
        rd.m.d(l1VarA, "getOriginal(...)");
        return l1VarA;
    }
}
