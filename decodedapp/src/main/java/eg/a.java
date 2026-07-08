package eg;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends a0 {

    /* JADX INFO: renamed from: b */
    private final c1 f12058b;

    /* JADX INFO: renamed from: c */
    private final c1 f12059c;

    public a(c1 c1Var, c1 c1Var2) {
        rd.m.e(c1Var, "delegate");
        rd.m.e(c1Var2, "abbreviation");
        this.f12058b = c1Var;
        this.f12059c = c1Var2;
    }

    @Override // eg.l2
    /* JADX INFO: renamed from: V0 */
    public c1 T0(q1 q1Var) {
        rd.m.e(q1Var, "newAttributes");
        return new a(W0().T0(q1Var), this.f12059c);
    }

    @Override // eg.a0
    protected c1 W0() {
        return this.f12058b;
    }

    public final c1 X() {
        return W0();
    }

    public final c1 Z0() {
        return this.f12059c;
    }

    @Override // eg.c1
    /* JADX INFO: renamed from: a1 */
    public a R0(boolean z10) {
        return new a(W0().R0(z10), this.f12059c.R0(z10));
    }

    @Override // eg.a0
    /* JADX INFO: renamed from: b1, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public a X0(fg.g gVar) {
        rd.m.e(gVar, "kotlinTypeRefiner");
        r0 r0VarA = gVar.a(W0());
        rd.m.c(r0VarA, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        r0 r0VarA2 = gVar.a(this.f12059c);
        rd.m.c(r0VarA2, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        return new a((c1) r0VarA, (c1) r0VarA2);
    }

    @Override // eg.a0
    /* JADX INFO: renamed from: c1 */
    public a Y0(c1 c1Var) {
        rd.m.e(c1Var, "delegate");
        return new a(c1Var, this.f12059c);
    }
}
