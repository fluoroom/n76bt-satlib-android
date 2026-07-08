package eg;

/* JADX INFO: loaded from: classes3.dex */
public final class f1 extends a0 implements j2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final c1 f12085b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final r0 f12086c;

    public f1(c1 c1Var, r0 r0Var) {
        rd.m.e(c1Var, "delegate");
        rd.m.e(r0Var, "enhancement");
        this.f12085b = c1Var;
        this.f12086c = r0Var;
    }

    @Override // eg.j2
    public r0 K() {
        return this.f12086c;
    }

    @Override // eg.l2
    /* JADX INFO: renamed from: U0 */
    public c1 R0(boolean z10) {
        l2 l2VarD = k2.d(G0().R0(z10), K().Q0().R0(z10));
        rd.m.c(l2VarD, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        return (c1) l2VarD;
    }

    @Override // eg.l2
    /* JADX INFO: renamed from: V0 */
    public c1 T0(q1 q1Var) {
        rd.m.e(q1Var, "newAttributes");
        l2 l2VarD = k2.d(G0().T0(q1Var), K());
        rd.m.c(l2VarD, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        return (c1) l2VarD;
    }

    @Override // eg.a0
    protected c1 W0() {
        return this.f12085b;
    }

    @Override // eg.j2
    /* JADX INFO: renamed from: Z0, reason: merged with bridge method [inline-methods] */
    public c1 G0() {
        return W0();
    }

    @Override // eg.a0
    /* JADX INFO: renamed from: a1, reason: merged with bridge method [inline-methods] */
    public f1 X0(fg.g gVar) {
        rd.m.e(gVar, "kotlinTypeRefiner");
        r0 r0VarA = gVar.a(W0());
        rd.m.c(r0VarA, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        return new f1((c1) r0VarA, gVar.a(K()));
    }

    @Override // eg.a0
    /* JADX INFO: renamed from: b1, reason: merged with bridge method [inline-methods] */
    public f1 Y0(c1 c1Var) {
        rd.m.e(c1Var, "delegate");
        return new f1(c1Var, K());
    }

    @Override // eg.c1
    public String toString() {
        return "[@EnhancedForWarnings(" + K() + ")] " + G0();
    }
}
