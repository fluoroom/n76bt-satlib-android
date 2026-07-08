package ke;

import he.g1;

/* JADX INFO: loaded from: classes3.dex */
public abstract class h0 extends n implements he.n0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final mf.c f19680e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f19681f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(he.h0 h0Var, mf.c cVar) {
        super(h0Var, ie.h.f16054l.b(), cVar.g(), g1.f15281a);
        rd.m.e(h0Var, "module");
        rd.m.e(cVar, "fqName");
        this.f19680e = cVar;
        this.f19681f = "package " + cVar + " of " + h0Var;
    }

    @Override // he.n0
    public final mf.c d() {
        return this.f19680e;
    }

    @Override // ke.n, he.p
    public g1 getSource() {
        g1 g1Var = g1.f15281a;
        rd.m.d(g1Var, "NO_SOURCE");
        return g1Var;
    }

    @Override // he.m
    public Object t0(he.o oVar, Object obj) {
        rd.m.e(oVar, "visitor");
        return oVar.i(this, obj);
    }

    @Override // ke.m
    public String toString() {
        return this.f19681f;
    }

    @Override // ke.n, he.m
    public he.h0 b() {
        he.m mVarB = super.b();
        rd.m.c(mVarB, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ModuleDescriptor");
        return (he.h0) mVarB;
    }
}
