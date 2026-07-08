package u7;

/* JADX INFO: loaded from: classes.dex */
final class e0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ int f28422a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ h0 f28423b;

    e0(h0 h0Var, int i10) {
        this.f28423b = h0Var;
        this.f28422a = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f28423b.i(this.f28422a);
    }
}
