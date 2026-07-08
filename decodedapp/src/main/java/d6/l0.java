package d6;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes.dex */
public abstract class l0 extends k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final Class f10765a;

    protected l0(Class cls) {
        this.f10765a = cls;
    }

    @Override // d6.k0
    public boolean a(k0 k0Var) {
        return k0Var.getClass() == getClass() && k0Var.d() == this.f10765a;
    }

    @Override // d6.k0
    public Class d() {
        return this.f10765a;
    }
}
