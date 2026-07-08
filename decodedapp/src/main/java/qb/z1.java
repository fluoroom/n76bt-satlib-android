package qb;

import java.lang.Thread;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class z1 implements Executor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Thread.UncaughtExceptionHandler f24848a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Queue f24849b = new ConcurrentLinkedQueue();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AtomicReference f24850c = new AtomicReference();

    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ c f24851a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Runnable f24852b;

        a(c cVar, Runnable runnable) {
            this.f24851a = cVar;
            this.f24852b = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            z1.this.execute(this.f24851a);
        }

        public String toString() {
            return this.f24852b.toString() + "(scheduled in SynchronizationContext)";
        }
    }

    class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ c f24854a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Runnable f24855b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f24856c;

        b(c cVar, Runnable runnable, long j10) {
            this.f24854a = cVar;
            this.f24855b = runnable;
            this.f24856c = j10;
        }

        @Override // java.lang.Runnable
        public void run() {
            z1.this.execute(this.f24854a);
        }

        public String toString() {
            return this.f24855b.toString() + "(scheduled in SynchronizationContext with delay of " + this.f24856c + ")";
        }
    }

    private static class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Runnable f24858a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        boolean f24859b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        boolean f24860c;

        c(Runnable runnable) {
            this.f24858a = (Runnable) r9.l.o(runnable, "task");
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f24859b) {
                return;
            }
            this.f24860c = true;
            this.f24858a.run();
        }
    }

    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final c f24861a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final ScheduledFuture f24862b;

        /* synthetic */ d(c cVar, ScheduledFuture scheduledFuture, a aVar) {
            this(cVar, scheduledFuture);
        }

        public void a() {
            this.f24861a.f24859b = true;
            this.f24862b.cancel(false);
        }

        public boolean b() {
            c cVar = this.f24861a;
            return (cVar.f24860c || cVar.f24859b) ? false : true;
        }

        private d(c cVar, ScheduledFuture scheduledFuture) {
            this.f24861a = (c) r9.l.o(cVar, "runnable");
            this.f24862b = (ScheduledFuture) r9.l.o(scheduledFuture, "future");
        }
    }

    public z1(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.f24848a = (Thread.UncaughtExceptionHandler) r9.l.o(uncaughtExceptionHandler, "uncaughtExceptionHandler");
    }

    public final void a() {
        while (androidx.lifecycle.b.a(this.f24850c, null, Thread.currentThread())) {
            while (true) {
                try {
                    Runnable runnable = (Runnable) this.f24849b.poll();
                    if (runnable == null) {
                        break;
                    }
                    try {
                        runnable.run();
                    } catch (Throwable th2) {
                        this.f24848a.uncaughtException(Thread.currentThread(), th2);
                    }
                } catch (Throwable th3) {
                    this.f24850c.set(null);
                    throw th3;
                }
            }
            this.f24850c.set(null);
            if (this.f24849b.isEmpty()) {
                return;
            }
        }
    }

    public final void b(Runnable runnable) {
        this.f24849b.add((Runnable) r9.l.o(runnable, "runnable is null"));
    }

    public final d c(Runnable runnable, long j10, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        c cVar = new c(runnable);
        return new d(cVar, scheduledExecutorService.schedule(new a(cVar, runnable), j10, timeUnit), null);
    }

    public final d d(Runnable runnable, long j10, long j11, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        c cVar = new c(runnable);
        return new d(cVar, scheduledExecutorService.scheduleWithFixedDelay(new b(cVar, runnable, j11), j10, j11, timeUnit), null);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        b(runnable);
        a();
    }

    public void f() {
        r9.l.u(Thread.currentThread() == this.f24850c.get(), "Not called from the SynchronizationContext");
    }
}
