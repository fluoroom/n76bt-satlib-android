package uc;

import hc.j;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends hc.j {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final C0398b f29038d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final g f29039e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final int f29040f = d(Runtime.getRuntime().availableProcessors(), Integer.getInteger("rx2.computation-threads", 0).intValue());

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static final c f29041g;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final ThreadFactory f29042b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final AtomicReference f29043c;

    static final class a extends j.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final nc.d f29044a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final kc.a f29045b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final nc.d f29046c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final c f29047d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        volatile boolean f29048e;

        a(c cVar) {
            this.f29047d = cVar;
            nc.d dVar = new nc.d();
            this.f29044a = dVar;
            kc.a aVar = new kc.a();
            this.f29045b = aVar;
            nc.d dVar2 = new nc.d();
            this.f29046c = dVar2;
            dVar2.c(dVar);
            dVar2.c(aVar);
        }

        @Override // hc.j.b
        public kc.b b(Runnable runnable) {
            return this.f29048e ? nc.c.INSTANCE : this.f29047d.e(runnable, 0L, TimeUnit.MILLISECONDS, this.f29044a);
        }

        @Override // hc.j.b
        public kc.b c(Runnable runnable, long j10, TimeUnit timeUnit) {
            return this.f29048e ? nc.c.INSTANCE : this.f29047d.e(runnable, j10, timeUnit, this.f29045b);
        }

        @Override // kc.b
        public boolean d() {
            return this.f29048e;
        }

        @Override // kc.b
        public void dispose() {
            if (this.f29048e) {
                return;
            }
            this.f29048e = true;
            this.f29046c.dispose();
        }
    }

    /* JADX INFO: renamed from: uc.b$b, reason: collision with other inner class name */
    static final class C0398b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final int f29049a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final c[] f29050b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        long f29051c;

        C0398b(int i10, ThreadFactory threadFactory) {
            this.f29049a = i10;
            this.f29050b = new c[i10];
            for (int i11 = 0; i11 < i10; i11++) {
                this.f29050b[i11] = new c(threadFactory);
            }
        }

        public c a() {
            int i10 = this.f29049a;
            if (i10 == 0) {
                return b.f29041g;
            }
            c[] cVarArr = this.f29050b;
            long j10 = this.f29051c;
            this.f29051c = 1 + j10;
            return cVarArr[(int) (j10 % ((long) i10))];
        }

        public void b() {
            for (c cVar : this.f29050b) {
                cVar.dispose();
            }
        }
    }

    static final class c extends e {
        c(ThreadFactory threadFactory) {
            super(threadFactory);
        }
    }

    static {
        c cVar = new c(new g("RxComputationShutdown"));
        f29041g = cVar;
        cVar.dispose();
        g gVar = new g("RxComputationThreadPool", Math.max(1, Math.min(10, Integer.getInteger("rx2.computation-priority", 5).intValue())), true);
        f29039e = gVar;
        C0398b c0398b = new C0398b(0, gVar);
        f29038d = c0398b;
        c0398b.b();
    }

    public b() {
        this(f29039e);
    }

    static int d(int i10, int i11) {
        return (i11 <= 0 || i11 > i10) ? i10 : i11;
    }

    @Override // hc.j
    public j.b a() {
        return new a(((C0398b) this.f29043c.get()).a());
    }

    @Override // hc.j
    public kc.b c(Runnable runnable, long j10, TimeUnit timeUnit) {
        return ((C0398b) this.f29043c.get()).a().f(runnable, j10, timeUnit);
    }

    public void e() {
        C0398b c0398b = new C0398b(f29040f, this.f29042b);
        if (androidx.lifecycle.b.a(this.f29043c, f29038d, c0398b)) {
            return;
        }
        c0398b.b();
    }

    public b(ThreadFactory threadFactory) {
        this.f29042b = threadFactory;
        this.f29043c = new AtomicReference(f29038d);
        e();
    }
}
