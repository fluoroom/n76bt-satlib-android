package uc;

import hc.j;
import java.util.concurrent.Callable;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public class e extends j.b implements kc.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ScheduledExecutorService f29073a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    volatile boolean f29074b;

    public e(ThreadFactory threadFactory) {
        this.f29073a = j.a(threadFactory);
    }

    @Override // hc.j.b
    public kc.b b(Runnable runnable) {
        return c(runnable, 0L, null);
    }

    @Override // hc.j.b
    public kc.b c(Runnable runnable, long j10, TimeUnit timeUnit) {
        return this.f29074b ? nc.c.INSTANCE : e(runnable, j10, timeUnit, null);
    }

    @Override // kc.b
    public boolean d() {
        return this.f29074b;
    }

    @Override // kc.b
    public void dispose() {
        if (this.f29074b) {
            return;
        }
        this.f29074b = true;
        this.f29073a.shutdownNow();
    }

    public i e(Runnable runnable, long j10, TimeUnit timeUnit, nc.a aVar) {
        i iVar = new i(yc.a.p(runnable), aVar);
        if (aVar != null && !aVar.c(iVar)) {
            return iVar;
        }
        try {
            iVar.a(j10 <= 0 ? this.f29073a.submit((Callable) iVar) : this.f29073a.schedule((Callable) iVar, j10, timeUnit));
            return iVar;
        } catch (RejectedExecutionException e10) {
            if (aVar != null) {
                aVar.b(iVar);
            }
            yc.a.n(e10);
            return iVar;
        }
    }

    public kc.b f(Runnable runnable, long j10, TimeUnit timeUnit) {
        h hVar = new h(yc.a.p(runnable));
        try {
            hVar.a(j10 <= 0 ? this.f29073a.submit(hVar) : this.f29073a.schedule(hVar, j10, timeUnit));
            return hVar;
        } catch (RejectedExecutionException e10) {
            yc.a.n(e10);
            return nc.c.INSTANCE;
        }
    }

    public void g() {
        if (this.f29074b) {
            return;
        }
        this.f29074b = true;
        this.f29073a.shutdown();
    }
}
