package t8;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
final class o implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Executor f27621a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f27622b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private d f27623c;

    public o(Executor executor, d dVar) {
        this.f27621a = executor;
        this.f27623c = dVar;
    }

    @Override // t8.r
    public final void a(g gVar) {
        if (gVar.j() || gVar.h()) {
            return;
        }
        synchronized (this.f27622b) {
            try {
                if (this.f27623c == null) {
                    return;
                }
                this.f27621a.execute(new n(this, gVar));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // t8.r
    public final void i() {
        synchronized (this.f27622b) {
            this.f27623c = null;
        }
    }
}
