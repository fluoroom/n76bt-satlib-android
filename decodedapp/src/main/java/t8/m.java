package t8;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
final class m implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Executor f27616a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f27617b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private c f27618c;

    public m(Executor executor, c cVar) {
        this.f27616a = executor;
        this.f27618c = cVar;
    }

    @Override // t8.r
    public final void a(g gVar) {
        synchronized (this.f27617b) {
            try {
                if (this.f27618c == null) {
                    return;
                }
                this.f27616a.execute(new l(this, gVar));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // t8.r
    public final void i() {
        synchronized (this.f27617b) {
            this.f27618c = null;
        }
    }
}
