package ih;

import androidx.appcompat.widget.ActivityChooserView;
import dd.d0;
import fh.p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import rd.h;
import rd.m;

/* JADX INFO: loaded from: classes3.dex */
public final class d {

    /* JADX INFO: renamed from: k */
    public static final b f16137k = new b(null);

    /* JADX INFO: renamed from: l */
    private static final Logger f16138l;

    /* JADX INFO: renamed from: m */
    public static final d f16139m;

    /* JADX INFO: renamed from: a */
    private final a f16140a;

    /* JADX INFO: renamed from: b */
    private final Logger f16141b;

    /* JADX INFO: renamed from: c */
    private int f16142c;

    /* JADX INFO: renamed from: d */
    private boolean f16143d;

    /* JADX INFO: renamed from: e */
    private long f16144e;

    /* JADX INFO: renamed from: f */
    private int f16145f;

    /* JADX INFO: renamed from: g */
    private int f16146g;

    /* JADX INFO: renamed from: h */
    private final List f16147h;

    /* JADX INFO: renamed from: i */
    private final List f16148i;

    /* JADX INFO: renamed from: j */
    private final Runnable f16149j;

    public interface a {
        void a(d dVar, long j10);

        void b(d dVar);

        void c(d dVar, Runnable runnable);

        BlockingQueue d(BlockingQueue blockingQueue);

        long e();
    }

    public static final class b {
        public /* synthetic */ b(h hVar) {
            this();
        }

        private b() {
        }
    }

    public static final class c implements a {

        /* JADX INFO: renamed from: a */
        private final ThreadPoolExecutor f16150a;

        public c(ThreadFactory threadFactory) {
            m.e(threadFactory, "threadFactory");
            this.f16150a = new ThreadPoolExecutor(0, ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED, 60L, TimeUnit.SECONDS, new SynchronousQueue(), threadFactory);
        }

        @Override // ih.d.a
        public void a(d dVar, long j10) throws InterruptedException {
            m.e(dVar, "taskRunner");
            if (p.f13109b && !Thread.holdsLock(dVar)) {
                throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + dVar);
            }
            if (j10 > 0) {
                long j11 = j10 / 1000000;
                long j12 = j10 - (1000000 * j11);
                if (j11 > 0 || j10 > 0) {
                    dVar.wait(j11, (int) j12);
                }
            }
        }

        @Override // ih.d.a
        public void b(d dVar) {
            m.e(dVar, "taskRunner");
            dVar.notify();
        }

        @Override // ih.d.a
        public void c(d dVar, Runnable runnable) {
            m.e(dVar, "taskRunner");
            m.e(runnable, "runnable");
            this.f16150a.execute(runnable);
        }

        @Override // ih.d.a
        public BlockingQueue d(BlockingQueue blockingQueue) {
            m.e(blockingQueue, "queue");
            return blockingQueue;
        }

        @Override // ih.d.a
        public long e() {
            return System.nanoTime();
        }
    }

    /* JADX INFO: renamed from: ih.d$d */
    public static final class RunnableC0222d implements Runnable {
        RunnableC0222d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ih.a aVarE;
            long jE;
            ih.a aVarE2;
            d dVar = d.this;
            synchronized (dVar) {
                dVar.f16146g++;
                aVarE = dVar.e();
            }
            if (aVarE == null) {
                return;
            }
            Thread threadCurrentThread = Thread.currentThread();
            String name = threadCurrentThread.getName();
            while (true) {
                try {
                    threadCurrentThread.setName(aVarE.b());
                    Logger loggerI = d.this.i();
                    ih.c cVarD = aVarE.d();
                    m.b(cVarD);
                    boolean zIsLoggable = loggerI.isLoggable(Level.FINE);
                    if (zIsLoggable) {
                        jE = cVarD.j().h().e();
                        ih.b.c(loggerI, aVarE, cVarD, "starting");
                    } else {
                        jE = -1;
                    }
                    try {
                        long jF = aVarE.f();
                        if (zIsLoggable) {
                            ih.b.c(loggerI, aVarE, cVarD, "finished run in " + ih.b.b(cVarD.j().h().e() - jE));
                        }
                        d dVar2 = d.this;
                        synchronized (dVar2) {
                            dVar2.d(aVarE, jF, true);
                            aVarE2 = dVar2.e();
                        }
                        if (aVarE2 == null) {
                            return;
                        } else {
                            aVarE = aVarE2;
                        }
                    } catch (Throwable th2) {
                        if (zIsLoggable) {
                            ih.b.c(loggerI, aVarE, cVarD, "failed a run in " + ih.b.b(cVarD.j().h().e() - jE));
                        }
                        throw th2;
                    }
                } catch (Throwable th3) {
                    try {
                        d dVar3 = d.this;
                        synchronized (dVar3) {
                            dVar3.d(aVarE, -1L, false);
                            d0 d0Var = d0.f10897a;
                            if (!(th3 instanceof InterruptedException)) {
                                throw th3;
                            }
                            Thread.currentThread().interrupt();
                            return;
                        }
                    } finally {
                        threadCurrentThread.setName(name);
                    }
                }
            }
        }
    }

    static {
        Logger logger = Logger.getLogger(d.class.getName());
        m.d(logger, "getLogger(...)");
        f16138l = logger;
        f16139m = new d(new c(p.p(p.f13110c + " TaskRunner", true)), null, 2, null);
    }

    public d(a aVar, Logger logger) {
        m.e(aVar, "backend");
        m.e(logger, "logger");
        this.f16140a = aVar;
        this.f16141b = logger;
        this.f16142c = 10000;
        this.f16147h = new ArrayList();
        this.f16148i = new ArrayList();
        this.f16149j = new RunnableC0222d();
    }

    public final void d(ih.a aVar, long j10, boolean z10) {
        if (p.f13109b && !Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
        }
        ih.c cVarD = aVar.d();
        m.b(cVarD);
        if (cVarD.e() != aVar) {
            throw new IllegalStateException("Check failed.");
        }
        boolean zF = cVarD.f();
        cVarD.p(false);
        cVarD.o(null);
        this.f16147h.remove(cVarD);
        if (j10 != -1 && !zF && !cVarD.i()) {
            cVarD.n(aVar, j10, true);
        }
        if (cVarD.g().isEmpty()) {
            return;
        }
        this.f16148i.add(cVarD);
        if (z10) {
            return;
        }
        l();
    }

    private final void f(ih.a aVar) {
        if (p.f13109b && !Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
        }
        aVar.g(-1L);
        ih.c cVarD = aVar.d();
        m.b(cVarD);
        cVarD.g().remove(aVar);
        this.f16148i.remove(cVarD);
        cVarD.o(aVar);
        this.f16147h.add(cVarD);
    }

    private final void l() {
        if (!p.f13109b || Thread.holdsLock(this)) {
            int i10 = this.f16145f;
            if (i10 > this.f16146g) {
                return;
            }
            this.f16145f = i10 + 1;
            this.f16140a.c(this, this.f16149j);
            return;
        }
        throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
    }

    public final ih.a e() {
        boolean z10;
        if (p.f13109b && !Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
        }
        while (!this.f16148i.isEmpty()) {
            long jE = this.f16140a.e();
            Iterator it = this.f16148i.iterator();
            long jMin = Long.MAX_VALUE;
            ih.a aVar = null;
            while (true) {
                if (!it.hasNext()) {
                    z10 = false;
                    break;
                }
                ih.a aVar2 = (ih.a) ((ih.c) it.next()).g().get(0);
                long jMax = Math.max(0L, aVar2.c() - jE);
                if (jMax > 0) {
                    jMin = Math.min(jMax, jMin);
                } else {
                    if (aVar != null) {
                        z10 = true;
                        break;
                    }
                    aVar = aVar2;
                }
            }
            if (aVar != null) {
                f(aVar);
                if (z10 || (!this.f16143d && !this.f16148i.isEmpty())) {
                    l();
                }
                return aVar;
            }
            if (this.f16143d) {
                if (jMin < this.f16144e - jE) {
                    this.f16140a.b(this);
                }
                return null;
            }
            this.f16143d = true;
            this.f16144e = jE + jMin;
            try {
                try {
                    this.f16140a.a(this, jMin);
                } catch (InterruptedException unused) {
                    g();
                }
            } finally {
                this.f16143d = false;
            }
        }
        return null;
    }

    public final void g() {
        if (p.f13109b && !Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
        }
        int size = this.f16147h.size();
        while (true) {
            size--;
            if (-1 >= size) {
                break;
            } else {
                ((ih.c) this.f16147h.get(size)).b();
            }
        }
        for (int size2 = this.f16148i.size() - 1; -1 < size2; size2--) {
            ih.c cVar = (ih.c) this.f16148i.get(size2);
            cVar.b();
            if (cVar.g().isEmpty()) {
                this.f16148i.remove(size2);
            }
        }
    }

    public final a h() {
        return this.f16140a;
    }

    public final Logger i() {
        return this.f16141b;
    }

    public final void j(ih.c cVar) {
        m.e(cVar, "taskQueue");
        if (p.f13109b && !Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
        }
        if (cVar.e() == null) {
            if (cVar.g().isEmpty()) {
                this.f16148i.remove(cVar);
            } else {
                fh.m.a(this.f16148i, cVar);
            }
        }
        if (this.f16143d) {
            this.f16140a.b(this);
        } else {
            l();
        }
    }

    public final ih.c k() {
        int i10;
        synchronized (this) {
            i10 = this.f16142c;
            this.f16142c = i10 + 1;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append('Q');
        sb2.append(i10);
        return new ih.c(this, sb2.toString());
    }

    public /* synthetic */ d(a aVar, Logger logger, int i10, h hVar) {
        this(aVar, (i10 & 2) != 0 ? f16138l : logger);
    }
}
