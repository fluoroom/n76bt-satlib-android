package io.grpc.internal;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
final class l2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ScheduledExecutorService f16679a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Executor f16680b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Runnable f16681c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final r9.o f16682d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f16683e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f16684f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private ScheduledFuture f16685g;

    private final class b implements Runnable {
        private b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!l2.this.f16684f) {
                l2.this.f16685g = null;
                return;
            }
            long j10 = l2.this.j();
            if (l2.this.f16683e - j10 > 0) {
                l2 l2Var = l2.this;
                l2Var.f16685g = l2Var.f16679a.schedule(new c(), l2.this.f16683e - j10, TimeUnit.NANOSECONDS);
            } else {
                l2.this.f16684f = false;
                l2.this.f16685g = null;
                l2.this.f16681c.run();
            }
        }
    }

    private final class c implements Runnable {
        private c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            l2.this.f16680b.execute(new b());
        }
    }

    l2(Runnable runnable, Executor executor, ScheduledExecutorService scheduledExecutorService, r9.o oVar) {
        this.f16681c = runnable;
        this.f16680b = executor;
        this.f16679a = scheduledExecutorService;
        this.f16682d = oVar;
        oVar.g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long j() {
        return this.f16682d.d(TimeUnit.NANOSECONDS);
    }

    void i(boolean z10) {
        ScheduledFuture scheduledFuture;
        this.f16684f = false;
        if (!z10 || (scheduledFuture = this.f16685g) == null) {
            return;
        }
        scheduledFuture.cancel(false);
        this.f16685g = null;
    }

    void k(long j10, TimeUnit timeUnit) {
        long nanos = timeUnit.toNanos(j10);
        long j11 = j() + nanos;
        this.f16684f = true;
        if (j11 - this.f16683e < 0 || this.f16685g == null) {
            ScheduledFuture scheduledFuture = this.f16685g;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
            }
            this.f16685g = this.f16679a.schedule(new c(), nanos, TimeUnit.NANOSECONDS);
        }
        this.f16683e = j11;
    }
}
