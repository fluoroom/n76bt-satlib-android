package t8;

/* JADX INFO: loaded from: classes.dex */
final class j implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ g f27609a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ k f27610b;

    j(k kVar, g gVar) {
        this.f27610b = kVar;
        this.f27609a = gVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f27609a.h()) {
            this.f27610b.f27613c.m();
            return;
        }
        try {
            this.f27610b.f27613c.l(this.f27610b.f27612b.a(this.f27609a));
        } catch (f e10) {
            if (e10.getCause() instanceof Exception) {
                this.f27610b.f27613c.k((Exception) e10.getCause());
            } else {
                this.f27610b.f27613c.k(e10);
            }
        } catch (Exception e11) {
            this.f27610b.f27613c.k(e11);
        }
    }
}
