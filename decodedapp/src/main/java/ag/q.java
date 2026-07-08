package ag;

/* JADX INFO: loaded from: classes3.dex */
public final class q implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final he.o0 f578a;

    public q(he.o0 o0Var) {
        rd.m.e(o0Var, "packageFragmentProvider");
        this.f578a = o0Var;
    }

    @Override // ag.j
    public i a(mf.b bVar) {
        i iVarA;
        rd.m.e(bVar, "classId");
        for (he.n0 n0Var : he.s0.c(this.f578a, bVar.f())) {
            if ((n0Var instanceof r) && (iVarA = ((r) n0Var).G0().a(bVar)) != null) {
                return iVarA;
            }
        }
        return null;
    }
}
