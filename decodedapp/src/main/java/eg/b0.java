package eg;

/* JADX INFO: loaded from: classes3.dex */
public abstract class b0 extends a0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final c1 f12060b;

    public b0(c1 c1Var) {
        rd.m.e(c1Var, "delegate");
        this.f12060b = c1Var;
    }

    @Override // eg.l2
    /* JADX INFO: renamed from: U0 */
    public c1 R0(boolean z10) {
        return z10 == O0() ? this : W0().R0(z10).T0(M0());
    }

    @Override // eg.l2
    /* JADX INFO: renamed from: V0 */
    public c1 T0(q1 q1Var) {
        rd.m.e(q1Var, "newAttributes");
        return q1Var != M0() ? new e1(this, q1Var) : this;
    }

    @Override // eg.a0
    protected c1 W0() {
        return this.f12060b;
    }
}
