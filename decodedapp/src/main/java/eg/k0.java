package eg;

/* JADX INFO: loaded from: classes3.dex */
public final class k0 extends i0 implements j2 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final i0 f12123d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final r0 f12124e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(i0 i0Var, r0 r0Var) {
        super(i0Var.V0(), i0Var.W0());
        rd.m.e(i0Var, "origin");
        rd.m.e(r0Var, "enhancement");
        this.f12123d = i0Var;
        this.f12124e = r0Var;
    }

    @Override // eg.j2
    public r0 K() {
        return this.f12124e;
    }

    @Override // eg.l2
    public l2 R0(boolean z10) {
        return k2.d(G0().R0(z10), K().Q0().R0(z10));
    }

    @Override // eg.l2
    public l2 T0(q1 q1Var) {
        rd.m.e(q1Var, "newAttributes");
        return k2.d(G0().T0(q1Var), K());
    }

    @Override // eg.i0
    public c1 U0() {
        return G0().U0();
    }

    @Override // eg.i0
    public String X0(pf.n nVar, pf.w wVar) {
        rd.m.e(nVar, "renderer");
        rd.m.e(wVar, "options");
        return wVar.e() ? nVar.S(K()) : G0().X0(nVar, wVar);
    }

    @Override // eg.j2
    /* JADX INFO: renamed from: Y0, reason: merged with bridge method [inline-methods] */
    public i0 G0() {
        return this.f12123d;
    }

    @Override // eg.l2
    /* JADX INFO: renamed from: Z0, reason: merged with bridge method [inline-methods] */
    public k0 X0(fg.g gVar) {
        rd.m.e(gVar, "kotlinTypeRefiner");
        r0 r0VarA = gVar.a(G0());
        rd.m.c(r0VarA, "null cannot be cast to non-null type org.jetbrains.kotlin.types.FlexibleType");
        return new k0((i0) r0VarA, gVar.a(K()));
    }

    @Override // eg.i0
    public String toString() {
        return "[@EnhancedForWarnings(" + K() + ")] " + G0();
    }
}
