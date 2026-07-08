package eg;

/* JADX INFO: loaded from: classes3.dex */
final class a1 extends b0 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(c1 c1Var) {
        super(c1Var);
        rd.m.e(c1Var, "delegate");
    }

    @Override // eg.a0, eg.r0
    public boolean O0() {
        return true;
    }

    @Override // eg.a0
    /* JADX INFO: renamed from: Z0, reason: merged with bridge method [inline-methods] */
    public a1 Y0(c1 c1Var) {
        rd.m.e(c1Var, "delegate");
        return new a1(c1Var);
    }
}
