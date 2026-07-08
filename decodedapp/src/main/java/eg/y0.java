package eg;

/* JADX INFO: loaded from: classes3.dex */
final class y0 extends b0 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(c1 c1Var) {
        super(c1Var);
        rd.m.e(c1Var, "delegate");
    }

    @Override // eg.a0, eg.r0
    public boolean O0() {
        return false;
    }

    @Override // eg.a0
    /* JADX INFO: renamed from: Z0, reason: merged with bridge method [inline-methods] */
    public y0 Y0(c1 c1Var) {
        rd.m.e(c1Var, "delegate");
        return new y0(c1Var);
    }
}
