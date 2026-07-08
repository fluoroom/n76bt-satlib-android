package u7;

/* JADX INFO: loaded from: classes.dex */
final class f0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ g0 f28425a;

    f0(g0 g0Var) {
        this.f28425a = g0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        h0 h0Var = this.f28425a.f28427a;
        h0Var.f28431d.f(h0Var.f28431d.getClass().getName().concat(" disconnecting because it was signed out."));
    }
}
