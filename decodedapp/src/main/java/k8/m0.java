package k8;

/* JADX INFO: loaded from: classes.dex */
final class m0 extends k0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final o0 f19508c;

    m0(o0 o0Var, int i10) {
        super(o0Var.size(), i10);
        this.f19508c = o0Var;
    }

    @Override // k8.k0
    protected final Object a(int i10) {
        return this.f19508c.get(i10);
    }
}
