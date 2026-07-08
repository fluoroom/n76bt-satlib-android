package vh;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes3.dex */
public class c extends o0 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final a f30755i = new a(null);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final f0 f30756j = new f0();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static c f30757k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final ReentrantLock f30758l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final Condition f30759m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final long f30760n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final long f30761o;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f30762f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f30763g = -1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f30764h;

    private static final class a {
        public /* synthetic */ a(rd.h hVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void g(c cVar) {
            if (d() == null) {
                h(new c());
                new b().start();
            }
            c.y(cVar, 0L, 1, null);
            f().a(cVar);
            if (cVar.f30763g == 1) {
                c().signal();
            }
        }

        public final c b() throws InterruptedException {
            c cVarB = f().b();
            if (cVarB == null) {
                long jNanoTime = System.nanoTime();
                c().await(c.f30760n, TimeUnit.MILLISECONDS);
                if (f().b() != null || System.nanoTime() - jNanoTime < c.f30761o) {
                    return null;
                }
                return d();
            }
            long jW = cVarB.w(System.nanoTime());
            if (jW > 0) {
                c().await(jW, TimeUnit.NANOSECONDS);
                return null;
            }
            f().e(cVarB);
            cVarB.f30762f = 2;
            return cVarB;
        }

        public final Condition c() {
            return c.f30759m;
        }

        public final c d() {
            return c.f30757k;
        }

        public final ReentrantLock e() {
            return c.f30758l;
        }

        public final f0 f() {
            return c.f30756j;
        }

        public final void h(c cVar) {
            c.f30757k = cVar;
        }

        private a() {
        }
    }

    private static final class b extends Thread {
        public b() {
            super("Okio Watchdog");
            setDaemon(true);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            ReentrantLock reentrantLockE;
            c cVarB;
            while (true) {
                try {
                    reentrantLockE = c.f30755i.e();
                    reentrantLockE.lock();
                    try {
                        cVarB = c.f30755i.b();
                    } finally {
                        reentrantLockE.unlock();
                    }
                } catch (InterruptedException unused) {
                }
                if (cVarB == c.f30755i.d()) {
                    c.f30755i.h(null);
                    return;
                }
                dd.d0 d0Var = dd.d0.f10897a;
                reentrantLockE.unlock();
                if (cVarB != null) {
                    cVarB.B();
                }
            }
        }
    }

    /* JADX INFO: renamed from: vh.c$c, reason: collision with other inner class name */
    public static final class C0409c implements l0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ l0 f30766b;

        C0409c(l0 l0Var) {
            this.f30766b = l0Var;
        }

        @Override // vh.l0
        public void C(e eVar, long j10) throws IOException {
            rd.m.e(eVar, "source");
            vh.b.b(eVar.size(), 0L, j10);
            while (true) {
                long j11 = 0;
                if (j10 <= 0) {
                    return;
                }
                i0 i0Var = eVar.f30774a;
                rd.m.b(i0Var);
                while (true) {
                    if (j11 >= 65536) {
                        break;
                    }
                    j11 += (long) (i0Var.f30811c - i0Var.f30810b);
                    if (j11 >= j10) {
                        j11 = j10;
                        break;
                    } else {
                        i0Var = i0Var.f30814f;
                        rd.m.b(i0Var);
                    }
                }
                c cVar = c.this;
                l0 l0Var = this.f30766b;
                cVar.s();
                try {
                    try {
                        l0Var.C(eVar, j11);
                        dd.d0 d0Var = dd.d0.f10897a;
                        if (cVar.t()) {
                            throw cVar.p(null);
                        }
                        j10 -= j11;
                    } catch (IOException e10) {
                        if (!cVar.t()) {
                            throw e10;
                        }
                        throw cVar.p(e10);
                    }
                } catch (Throwable th2) {
                    cVar.t();
                    throw th2;
                }
            }
        }

        @Override // vh.l0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public c i() {
            return c.this;
        }

        @Override // vh.l0, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            c cVar = c.this;
            l0 l0Var = this.f30766b;
            cVar.s();
            try {
                l0Var.close();
                dd.d0 d0Var = dd.d0.f10897a;
                if (cVar.t()) {
                    throw cVar.p(null);
                }
            } catch (IOException e10) {
                if (!cVar.t()) {
                    throw e10;
                }
                throw cVar.p(e10);
            } finally {
                cVar.t();
            }
        }

        @Override // vh.l0, java.io.Flushable
        public void flush() throws IOException {
            c cVar = c.this;
            l0 l0Var = this.f30766b;
            cVar.s();
            try {
                l0Var.flush();
                dd.d0 d0Var = dd.d0.f10897a;
                if (cVar.t()) {
                    throw cVar.p(null);
                }
            } catch (IOException e10) {
                if (!cVar.t()) {
                    throw e10;
                }
                throw cVar.p(e10);
            } finally {
                cVar.t();
            }
        }

        public String toString() {
            return "AsyncTimeout.sink(" + this.f30766b + ')';
        }
    }

    public static final class d implements n0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ n0 f30768b;

        d(n0 n0Var) {
            this.f30768b = n0Var;
        }

        @Override // vh.n0
        public long N(e eVar, long j10) throws IOException {
            rd.m.e(eVar, "sink");
            c cVar = c.this;
            n0 n0Var = this.f30768b;
            cVar.s();
            try {
                long jN = n0Var.N(eVar, j10);
                if (cVar.t()) {
                    throw cVar.p(null);
                }
                return jN;
            } catch (IOException e10) {
                if (cVar.t()) {
                    throw cVar.p(e10);
                }
                throw e10;
            } finally {
                cVar.t();
            }
        }

        @Override // vh.n0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public c i() {
            return c.this;
        }

        @Override // vh.n0, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            c cVar = c.this;
            n0 n0Var = this.f30768b;
            cVar.s();
            try {
                n0Var.close();
                dd.d0 d0Var = dd.d0.f10897a;
                if (cVar.t()) {
                    throw cVar.p(null);
                }
            } catch (IOException e10) {
                if (!cVar.t()) {
                    throw e10;
                }
                throw cVar.p(e10);
            } finally {
                cVar.t();
            }
        }

        public String toString() {
            return "AsyncTimeout.source(" + this.f30768b + ')';
        }
    }

    static {
        ReentrantLock reentrantLock = new ReentrantLock();
        f30758l = reentrantLock;
        Condition conditionNewCondition = reentrantLock.newCondition();
        rd.m.d(conditionNewCondition, "newCondition(...)");
        f30759m = conditionNewCondition;
        long millis = TimeUnit.SECONDS.toMillis(60L);
        f30760n = millis;
        f30761o = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    public static /* synthetic */ void y(c cVar, long j10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setTimeoutAt");
        }
        if ((i10 & 1) != 0) {
            j10 = System.nanoTime();
        }
        cVar.x(j10);
    }

    public final n0 A(n0 n0Var) {
        rd.m.e(n0Var, "source");
        return new d(n0Var);
    }

    public final IOException p(IOException iOException) {
        return v(iOException);
    }

    public final void s() {
        long jH = h();
        boolean zE = e();
        if (jH != 0 || zE) {
            ReentrantLock reentrantLock = f30758l;
            reentrantLock.lock();
            try {
                if (this.f30762f != 0) {
                    throw new IllegalStateException("Unbalanced enter/exit");
                }
                this.f30762f = 1;
                f30755i.g(this);
                dd.d0 d0Var = dd.d0.f10897a;
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    public final boolean t() {
        ReentrantLock reentrantLock = f30758l;
        reentrantLock.lock();
        try {
            int i10 = this.f30762f;
            this.f30762f = 0;
            if (i10 != 1) {
                return i10 == 2;
            }
            f30756j.e(this);
            return false;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final long u() {
        return this.f30764h;
    }

    protected IOException v(IOException iOException) {
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    public final long w(long j10) {
        return this.f30764h - j10;
    }

    public final void x(long j10) {
        long jH = h();
        boolean zE = e();
        if (h() != 0 && e()) {
            this.f30764h = j10 + Math.min(jH, c() - j10);
        } else if (jH != 0) {
            this.f30764h = j10 + jH;
        } else {
            if (!zE) {
                throw new AssertionError();
            }
            this.f30764h = c();
        }
    }

    public final l0 z(l0 l0Var) {
        rd.m.e(l0Var, "sink");
        return new C0409c(l0Var);
    }

    protected void B() {
    }
}
