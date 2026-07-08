package uc;

import hc.j;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends hc.j {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final g f29052d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final g f29053e;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    static final C0399c f29056h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    static final a f29057i;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final ThreadFactory f29058b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final AtomicReference f29059c;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final TimeUnit f29055g = TimeUnit.SECONDS;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final long f29054f = Long.getLong("rx2.io-keep-alive-time", 60).longValue();

    static final class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final long f29060a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final ConcurrentLinkedQueue f29061b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final kc.a f29062c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final ScheduledExecutorService f29063d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final Future f29064e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final ThreadFactory f29065f;

        a(long j10, TimeUnit timeUnit, ThreadFactory threadFactory) {
            a aVar;
            ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool;
            ScheduledFuture<?> scheduledFutureScheduleWithFixedDelay;
            long nanos = timeUnit != null ? timeUnit.toNanos(j10) : 0L;
            this.f29060a = nanos;
            this.f29061b = new ConcurrentLinkedQueue();
            this.f29062c = new kc.a();
            this.f29065f = threadFactory;
            if (timeUnit != null) {
                scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1, c.f29053e);
                aVar = this;
                scheduledFutureScheduleWithFixedDelay = scheduledExecutorServiceNewScheduledThreadPool.scheduleWithFixedDelay(aVar, nanos, nanos, TimeUnit.NANOSECONDS);
            } else {
                aVar = this;
                scheduledExecutorServiceNewScheduledThreadPool = null;
                scheduledFutureScheduleWithFixedDelay = null;
            }
            aVar.f29063d = scheduledExecutorServiceNewScheduledThreadPool;
            aVar.f29064e = scheduledFutureScheduleWithFixedDelay;
        }

        void a() {
            if (this.f29061b.isEmpty()) {
                return;
            }
            long jC = c();
            for (C0399c c0399c : this.f29061b) {
                if (c0399c.h() > jC) {
                    return;
                }
                if (this.f29061b.remove(c0399c)) {
                    this.f29062c.b(c0399c);
                }
            }
        }

        C0399c b() {
            if (this.f29062c.d()) {
                return c.f29056h;
            }
            while (!this.f29061b.isEmpty()) {
                C0399c c0399c = (C0399c) this.f29061b.poll();
                if (c0399c != null) {
                    return c0399c;
                }
            }
            C0399c c0399c2 = new C0399c(this.f29065f);
            this.f29062c.c(c0399c2);
            return c0399c2;
        }

        long c() {
            return System.nanoTime();
        }

        void d(C0399c c0399c) {
            c0399c.i(c() + this.f29060a);
            this.f29061b.offer(c0399c);
        }

        void e() {
            this.f29062c.dispose();
            Future future = this.f29064e;
            if (future != null) {
                future.cancel(true);
            }
            ScheduledExecutorService scheduledExecutorService = this.f29063d;
            if (scheduledExecutorService != null) {
                scheduledExecutorService.shutdownNow();
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            a();
        }
    }

    static final class b extends j.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final a f29067b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final C0399c f29068c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final AtomicBoolean f29069d = new AtomicBoolean();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final kc.a f29066a = new kc.a();

        b(a aVar) {
            this.f29067b = aVar;
            this.f29068c = aVar.b();
        }

        @Override // hc.j.b
        public kc.b c(Runnable runnable, long j10, TimeUnit timeUnit) {
            return this.f29066a.d() ? nc.c.INSTANCE : this.f29068c.e(runnable, j10, timeUnit, this.f29066a);
        }

        @Override // kc.b
        public boolean d() {
            return this.f29069d.get();
        }

        @Override // kc.b
        public void dispose() {
            if (this.f29069d.compareAndSet(false, true)) {
                this.f29066a.dispose();
                this.f29067b.d(this.f29068c);
            }
        }
    }

    /* JADX INFO: renamed from: uc.c$c, reason: collision with other inner class name */
    static final class C0399c extends e {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private long f29070c;

        C0399c(ThreadFactory threadFactory) {
            super(threadFactory);
            this.f29070c = 0L;
        }

        public long h() {
            return this.f29070c;
        }

        public void i(long j10) {
            this.f29070c = j10;
        }
    }

    static {
        C0399c c0399c = new C0399c(new g("RxCachedThreadSchedulerShutdown"));
        f29056h = c0399c;
        c0399c.dispose();
        int iMax = Math.max(1, Math.min(10, Integer.getInteger("rx2.io-priority", 5).intValue()));
        g gVar = new g("RxCachedThreadScheduler", iMax);
        f29052d = gVar;
        f29053e = new g("RxCachedWorkerPoolEvictor", iMax);
        a aVar = new a(0L, null, gVar);
        f29057i = aVar;
        aVar.e();
    }

    public c() {
        this(f29052d);
    }

    @Override // hc.j
    public j.b a() {
        return new b((a) this.f29059c.get());
    }

    public void d() {
        a aVar = new a(f29054f, f29055g, this.f29058b);
        if (androidx.lifecycle.b.a(this.f29059c, f29057i, aVar)) {
            return;
        }
        aVar.e();
    }

    public c(ThreadFactory threadFactory) {
        this.f29058b = threadFactory;
        this.f29059c = new AtomicReference(f29057i);
        d();
    }
}
