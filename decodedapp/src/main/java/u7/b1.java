package u7;

/* JADX INFO: loaded from: classes.dex */
final class b1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ s8.l f28388a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ d1 f28389b;

    b1(d1 d1Var, s8.l lVar) {
        this.f28389b = d1Var;
        this.f28388a = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        d1.x1(this.f28389b, this.f28388a);
    }
}
