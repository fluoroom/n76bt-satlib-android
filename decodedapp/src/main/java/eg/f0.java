package eg;

/* JADX INFO: loaded from: classes3.dex */
public abstract class f0 {
    public static /* synthetic */ a2 b(f0 f0Var, he.l1 l1Var, g0 g0Var, z1 z1Var, r0 r0Var, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: computeProjection");
        }
        if ((i10 & 8) != 0) {
            r0Var = z1Var.e(l1Var, g0Var);
        }
        return f0Var.a(l1Var, g0Var, z1Var, r0Var);
    }

    public a2 a(he.l1 l1Var, g0 g0Var, z1 z1Var, r0 r0Var) {
        rd.m.e(l1Var, "parameter");
        rd.m.e(g0Var, "typeAttr");
        rd.m.e(z1Var, "typeParameterUpperBoundEraser");
        rd.m.e(r0Var, "erasedUpperBound");
        return new c2(m2.f12142g, r0Var);
    }
}
