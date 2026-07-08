package sc;

import hc.h;
import hc.i;
import hc.j;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class g extends sc.a {

    /* JADX INFO: renamed from: b */
    final long f27303b;

    /* JADX INFO: renamed from: c */
    final TimeUnit f27304c;

    /* JADX INFO: renamed from: d */
    final j f27305d;

    /* JADX INFO: renamed from: e */
    final h f27306e;

    static final class a implements i {

        /* JADX INFO: renamed from: a */
        final i f27307a;

        /* JADX INFO: renamed from: b */
        final AtomicReference f27308b;

        a(i iVar, AtomicReference atomicReference) {
            this.f27307a = iVar;
            this.f27308b = atomicReference;
        }

        @Override // hc.i
        public void a(kc.b bVar) {
            nc.b.f(this.f27308b, bVar);
        }

        @Override // hc.i
        public void onComplete() {
            this.f27307a.onComplete();
        }

        @Override // hc.i
        public void onError(Throwable th2) {
            this.f27307a.onError(th2);
        }

        @Override // hc.i
        public void onNext(Object obj) {
            this.f27307a.onNext(obj);
        }
    }

    static final class b extends AtomicReference implements i, kc.b, d {

        /* JADX INFO: renamed from: a */
        final i f27309a;

        /* JADX INFO: renamed from: b */
        final long f27310b;

        /* JADX INFO: renamed from: c */
        final TimeUnit f27311c;

        /* JADX INFO: renamed from: d */
        final j.b f27312d;

        /* JADX INFO: renamed from: e */
        final nc.e f27313e = new nc.e();

        /* JADX INFO: renamed from: f */
        final AtomicLong f27314f = new AtomicLong();

        /* JADX INFO: renamed from: g */
        final AtomicReference f27315g = new AtomicReference();

        /* JADX INFO: renamed from: h */
        h f27316h;

        b(i iVar, long j10, TimeUnit timeUnit, j.b bVar, h hVar) {
            this.f27309a = iVar;
            this.f27310b = j10;
            this.f27311c = timeUnit;
            this.f27312d = bVar;
            this.f27316h = hVar;
        }

        @Override // hc.i
        public void a(kc.b bVar) {
            nc.b.h(this.f27315g, bVar);
        }

        @Override // sc.g.d
        public void b(long j10) {
            if (this.f27314f.compareAndSet(j10, Long.MAX_VALUE)) {
                nc.b.a(this.f27315g);
                h hVar = this.f27316h;
                this.f27316h = null;
                hVar.a(new a(this.f27309a, this));
                this.f27312d.dispose();
            }
        }

        void c(long j10) {
            this.f27313e.a(this.f27312d.c(new e(j10, this), this.f27310b, this.f27311c));
        }

        @Override // kc.b
        public boolean d() {
            return nc.b.e((kc.b) get());
        }

        @Override // kc.b
        public void dispose() {
            nc.b.a(this.f27315g);
            nc.b.a(this);
            this.f27312d.dispose();
        }

        @Override // hc.i
        public void onComplete() {
            if (this.f27314f.getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                this.f27313e.dispose();
                this.f27309a.onComplete();
                this.f27312d.dispose();
            }
        }

        @Override // hc.i
        public void onError(Throwable th2) {
            if (this.f27314f.getAndSet(Long.MAX_VALUE) == Long.MAX_VALUE) {
                yc.a.n(th2);
                return;
            }
            this.f27313e.dispose();
            this.f27309a.onError(th2);
            this.f27312d.dispose();
        }

        @Override // hc.i
        public void onNext(Object obj) {
            long j10 = this.f27314f.get();
            if (j10 != Long.MAX_VALUE) {
                long j11 = 1 + j10;
                if (this.f27314f.compareAndSet(j10, j11)) {
                    ((kc.b) this.f27313e.get()).dispose();
                    this.f27309a.onNext(obj);
                    c(j11);
                }
            }
        }
    }

    static final class c extends AtomicLong implements i, kc.b, d {

        /* JADX INFO: renamed from: a */
        final i f27317a;

        /* JADX INFO: renamed from: b */
        final long f27318b;

        /* JADX INFO: renamed from: c */
        final TimeUnit f27319c;

        /* JADX INFO: renamed from: d */
        final j.b f27320d;

        /* JADX INFO: renamed from: e */
        final nc.e f27321e = new nc.e();

        /* JADX INFO: renamed from: f */
        final AtomicReference f27322f = new AtomicReference();

        c(i iVar, long j10, TimeUnit timeUnit, j.b bVar) {
            this.f27317a = iVar;
            this.f27318b = j10;
            this.f27319c = timeUnit;
            this.f27320d = bVar;
        }

        @Override // hc.i
        public void a(kc.b bVar) {
            nc.b.h(this.f27322f, bVar);
        }

        @Override // sc.g.d
        public void b(long j10) {
            if (compareAndSet(j10, Long.MAX_VALUE)) {
                nc.b.a(this.f27322f);
                this.f27317a.onError(new TimeoutException(xc.e.c(this.f27318b, this.f27319c)));
                this.f27320d.dispose();
            }
        }

        void c(long j10) {
            this.f27321e.a(this.f27320d.c(new e(j10, this), this.f27318b, this.f27319c));
        }

        @Override // kc.b
        public boolean d() {
            return nc.b.e((kc.b) this.f27322f.get());
        }

        @Override // kc.b
        public void dispose() {
            nc.b.a(this.f27322f);
            this.f27320d.dispose();
        }

        @Override // hc.i
        public void onComplete() {
            if (getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                this.f27321e.dispose();
                this.f27317a.onComplete();
                this.f27320d.dispose();
            }
        }

        @Override // hc.i
        public void onError(Throwable th2) {
            if (getAndSet(Long.MAX_VALUE) == Long.MAX_VALUE) {
                yc.a.n(th2);
                return;
            }
            this.f27321e.dispose();
            this.f27317a.onError(th2);
            this.f27320d.dispose();
        }

        @Override // hc.i
        public void onNext(Object obj) {
            long j10 = get();
            if (j10 != Long.MAX_VALUE) {
                long j11 = 1 + j10;
                if (compareAndSet(j10, j11)) {
                    ((kc.b) this.f27321e.get()).dispose();
                    this.f27317a.onNext(obj);
                    c(j11);
                }
            }
        }
    }

    interface d {
        void b(long j10);
    }

    static final class e implements Runnable {

        /* JADX INFO: renamed from: a */
        final d f27323a;

        /* JADX INFO: renamed from: b */
        final long f27324b;

        e(long j10, d dVar) {
            this.f27324b = j10;
            this.f27323a = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f27323a.b(this.f27324b);
        }
    }

    public g(hc.g gVar, long j10, TimeUnit timeUnit, j jVar, h hVar) {
        super(gVar);
        this.f27303b = j10;
        this.f27304c = timeUnit;
        this.f27305d = jVar;
        this.f27306e = hVar;
    }

    @Override // hc.g
    protected void k(i iVar) {
        if (this.f27306e == null) {
            c cVar = new c(iVar, this.f27303b, this.f27304c, this.f27305d.a());
            iVar.a(cVar);
            cVar.c(0L);
            this.f27278a.a(cVar);
            return;
        }
        b bVar = new b(iVar, this.f27303b, this.f27304c, this.f27305d.a(), this.f27306e);
        iVar.a(bVar);
        bVar.c(0L);
        this.f27278a.a(bVar);
    }
}
