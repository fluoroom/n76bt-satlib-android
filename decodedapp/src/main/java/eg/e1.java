package eg;

/* JADX INFO: loaded from: classes3.dex */
final class e1 extends b0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final q1 f12080c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(c1 c1Var, q1 q1Var) {
        super(c1Var);
        rd.m.e(c1Var, "delegate");
        rd.m.e(q1Var, "attributes");
        this.f12080c = q1Var;
    }

    @Override // eg.a0, eg.r0
    public q1 M0() {
        return this.f12080c;
    }

    @Override // eg.a0
    /* JADX INFO: renamed from: Z0, reason: merged with bridge method [inline-methods] */
    public e1 Y0(c1 c1Var) {
        rd.m.e(c1Var, "delegate");
        return new e1(c1Var, M0());
    }
}
