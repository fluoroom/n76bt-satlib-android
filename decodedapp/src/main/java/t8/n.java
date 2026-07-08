package t8;

/* JADX INFO: loaded from: classes.dex */
final class n implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ g f27619a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ o f27620b;

    n(o oVar, g gVar) {
        this.f27620b = oVar;
        this.f27619a = gVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f27620b.f27622b) {
            try {
                o oVar = this.f27620b;
                if (oVar.f27623c != null) {
                    oVar.f27623c.a((Exception) v7.q.i(this.f27619a.f()));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
