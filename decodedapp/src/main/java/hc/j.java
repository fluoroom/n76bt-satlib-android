package hc;

import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public abstract class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final long f15232a = TimeUnit.MINUTES.toNanos(Long.getLong("rx2.scheduler.drift-tolerance", 15).longValue());

    static final class a implements kc.b, Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Runnable f15233a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final b f15234b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Thread f15235c;

        a(Runnable runnable, b bVar) {
            this.f15233a = runnable;
            this.f15234b = bVar;
        }

        @Override // kc.b
        public boolean d() {
            return this.f15234b.d();
        }

        @Override // kc.b
        public void dispose() {
            if (this.f15235c == Thread.currentThread()) {
                b bVar = this.f15234b;
                if (bVar instanceof uc.e) {
                    ((uc.e) bVar).g();
                    return;
                }
            }
            this.f15234b.dispose();
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f15235c = Thread.currentThread();
            try {
                this.f15233a.run();
            } finally {
                dispose();
                this.f15235c = null;
            }
        }
    }

    public static abstract class b implements kc.b {
        public long a(TimeUnit timeUnit) {
            return timeUnit.convert(System.currentTimeMillis(), TimeUnit.MILLISECONDS);
        }

        public kc.b b(Runnable runnable) {
            return c(runnable, 0L, TimeUnit.NANOSECONDS);
        }

        public abstract kc.b c(Runnable runnable, long j10, TimeUnit timeUnit);
    }

    public abstract b a();

    public kc.b b(Runnable runnable) {
        return c(runnable, 0L, TimeUnit.NANOSECONDS);
    }

    public kc.b c(Runnable runnable, long j10, TimeUnit timeUnit) {
        b bVarA = a();
        a aVar = new a(yc.a.p(runnable), bVarA);
        bVarA.c(aVar, j10, timeUnit);
        return aVar;
    }
}
