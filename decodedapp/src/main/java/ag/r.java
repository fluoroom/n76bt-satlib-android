package ag;

/* JADX INFO: loaded from: classes3.dex */
public abstract class r extends ke.h0 {

    /* JADX INFO: renamed from: g */
    private final dg.n f581g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(mf.c cVar, dg.n nVar, he.h0 h0Var) {
        super(h0Var, cVar);
        rd.m.e(cVar, "fqName");
        rd.m.e(nVar, "storageManager");
        rd.m.e(h0Var, "module");
        this.f581g = nVar;
    }

    public abstract j G0();

    public boolean K0(mf.f fVar) {
        rd.m.e(fVar, "name");
        xf.k kVarP = p();
        return (kVarP instanceof cg.w) && ((cg.w) kVarP).t().contains(fVar);
    }

    public abstract void L0(n nVar);
}
