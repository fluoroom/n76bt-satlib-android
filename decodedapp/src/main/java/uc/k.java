package uc;

import hc.j;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class k extends hc.j {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final g f29089d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final ScheduledExecutorService f29090e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final ThreadFactory f29091b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final AtomicReference f29092c;

    static final class a extends j.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final ScheduledExecutorService f29093a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final kc.a f29094b = new kc.a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        volatile boolean f29095c;

        a(ScheduledExecutorService scheduledExecutorService) {
            this.f29093a = scheduledExecutorService;
        }

        @Override // hc.j.b
        public kc.b c(Runnable runnable, long j10, TimeUnit timeUnit) {
            if (this.f29095c) {
                return nc.c.INSTANCE;
            }
            i iVar = new i(yc.a.p(runnable), this.f29094b);
            this.f29094b.c(iVar);
            try {
                iVar.a(j10 <= 0 ? this.f29093a.submit((Callable) iVar) : this.f29093a.schedule((Callable) iVar, j10, timeUnit));
                return iVar;
            } catch (RejectedExecutionException e10) {
                dispose();
                yc.a.n(e10);
                return nc.c.INSTANCE;
            }
        }

        @Override // kc.b
        public boolean d() {
            return this.f29095c;
        }

        @Override // kc.b
        public void dispose() {
            if (this.f29095c) {
                return;
            }
            this.f29095c = true;
            this.f29094b.dispose();
        }
    }

    static {
        ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(0);
        f29090e = scheduledExecutorServiceNewScheduledThreadPool;
        scheduledExecutorServiceNewScheduledThreadPool.shutdown();
        f29089d = new g("RxSingleScheduler", Math.max(1, Math.min(10, Integer.getInteger("rx2.single-priority", 5).intValue())), true);
    }

    public k() {
        this(f29089d);
    }

    static ScheduledExecutorService d(ThreadFactory threadFactory) {
        return j.a(threadFactory);
    }

    @Override // hc.j
    public j.b a() {
        return new a((ScheduledExecutorService) this.f29092c.get());
    }

    @Override // hc.j
    public kc.b c(Runnable runnable, long j10, TimeUnit timeUnit) {
        h hVar = new h(yc.a.p(runnable));
        try {
            hVar.a(j10 <= 0 ? ((ScheduledExecutorService) this.f29092c.get()).submit(hVar) : ((ScheduledExecutorService) this.f29092c.get()).schedule(hVar, j10, timeUnit));
            return hVar;
        } catch (RejectedExecutionException e10) {
            yc.a.n(e10);
            return nc.c.INSTANCE;
        }
    }

    public k(ThreadFactory threadFactory) {
        AtomicReference atomicReference = new AtomicReference();
        this.f29092c = atomicReference;
        this.f29091b = threadFactory;
        atomicReference.lazySet(d(threadFactory));
    }
}
