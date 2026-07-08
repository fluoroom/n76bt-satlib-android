package uc;

import hc.j;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes3.dex */
public final class l extends hc.j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final l f29096b = new l();

    static final class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Runnable f29097a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final c f29098b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final long f29099c;

        a(Runnable runnable, c cVar, long j10) {
            this.f29097a = runnable;
            this.f29098b = cVar;
            this.f29099c = j10;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f29098b.f29107d) {
                return;
            }
            long jA = this.f29098b.a(TimeUnit.MILLISECONDS);
            long j10 = this.f29099c;
            if (j10 > jA) {
                try {
                    Thread.sleep(j10 - jA);
                } catch (InterruptedException e10) {
                    Thread.currentThread().interrupt();
                    yc.a.n(e10);
                    return;
                }
            }
            if (this.f29098b.f29107d) {
                return;
            }
            this.f29097a.run();
        }
    }

    static final class b implements Comparable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Runnable f29100a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final long f29101b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final int f29102c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        volatile boolean f29103d;

        b(Runnable runnable, Long l10, int i10) {
            this.f29100a = runnable;
            this.f29101b = l10.longValue();
            this.f29102c = i10;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(b bVar) {
            int iB = oc.b.b(this.f29101b, bVar.f29101b);
            return iB == 0 ? oc.b.a(this.f29102c, bVar.f29102c) : iB;
        }
    }

    static final class c extends j.b implements kc.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final PriorityBlockingQueue f29104a = new PriorityBlockingQueue();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final AtomicInteger f29105b = new AtomicInteger();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final AtomicInteger f29106c = new AtomicInteger();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        volatile boolean f29107d;

        final class a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final b f29108a;

            a(b bVar) {
                this.f29108a = bVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f29108a.f29103d = true;
                c.this.f29104a.remove(this.f29108a);
            }
        }

        c() {
        }

        @Override // hc.j.b
        public kc.b b(Runnable runnable) {
            return e(runnable, a(TimeUnit.MILLISECONDS));
        }

        @Override // hc.j.b
        public kc.b c(Runnable runnable, long j10, TimeUnit timeUnit) {
            long jA = a(TimeUnit.MILLISECONDS) + timeUnit.toMillis(j10);
            return e(new a(runnable, this, jA), jA);
        }

        @Override // kc.b
        public boolean d() {
            return this.f29107d;
        }

        @Override // kc.b
        public void dispose() {
            this.f29107d = true;
        }

        kc.b e(Runnable runnable, long j10) {
            if (this.f29107d) {
                return nc.c.INSTANCE;
            }
            b bVar = new b(runnable, Long.valueOf(j10), this.f29106c.incrementAndGet());
            this.f29104a.add(bVar);
            if (this.f29105b.getAndIncrement() != 0) {
                return kc.c.b(new a(bVar));
            }
            int iAddAndGet = 1;
            while (!this.f29107d) {
                b bVar2 = (b) this.f29104a.poll();
                if (bVar2 == null) {
                    iAddAndGet = this.f29105b.addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return nc.c.INSTANCE;
                    }
                } else if (!bVar2.f29103d) {
                    bVar2.f29100a.run();
                }
            }
            this.f29104a.clear();
            return nc.c.INSTANCE;
        }
    }

    l() {
    }

    public static l d() {
        return f29096b;
    }

    @Override // hc.j
    public j.b a() {
        return new c();
    }

    @Override // hc.j
    public kc.b b(Runnable runnable) {
        yc.a.p(runnable).run();
        return nc.c.INSTANCE;
    }

    @Override // hc.j
    public kc.b c(Runnable runnable, long j10, TimeUnit timeUnit) {
        try {
            timeUnit.sleep(j10);
            yc.a.p(runnable).run();
        } catch (InterruptedException e10) {
            Thread.currentThread().interrupt();
            yc.a.n(e10);
        }
        return nc.c.INSTANCE;
    }
}
