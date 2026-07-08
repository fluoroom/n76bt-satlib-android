package t8;

/* JADX INFO: loaded from: classes.dex */
final class l implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ g f27614a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ m f27615b;

    l(m mVar, g gVar) {
        this.f27615b = mVar;
        this.f27614a = gVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f27615b.f27617b) {
            try {
                m mVar = this.f27615b;
                if (mVar.f27618c != null) {
                    mVar.f27618c.a(this.f27614a);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
