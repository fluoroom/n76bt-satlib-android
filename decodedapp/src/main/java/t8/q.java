package t8;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
final class q implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Executor f27626a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f27627b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private e f27628c;

    public q(Executor executor, e eVar) {
        this.f27626a = executor;
        this.f27628c = eVar;
    }

    @Override // t8.r
    public final void a(g gVar) {
        if (gVar.j()) {
            synchronized (this.f27627b) {
                try {
                    if (this.f27628c == null) {
                        return;
                    }
                    this.f27626a.execute(new p(this, gVar));
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    @Override // t8.r
    public final void i() {
        synchronized (this.f27627b) {
            this.f27628c = null;
        }
    }
}
