package t8;

/* JADX INFO: loaded from: classes.dex */
final class p implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ g f27624a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ q f27625b;

    p(q qVar, g gVar) {
        this.f27625b = qVar;
        this.f27624a = gVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f27625b.f27627b) {
            try {
                q qVar = this.f27625b;
                if (qVar.f27628c != null) {
                    qVar.f27628c.a(this.f27624a.g());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
