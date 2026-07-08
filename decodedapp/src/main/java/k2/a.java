package k2;

import android.os.Process;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import k2.p;

/* JADX INFO: loaded from: classes.dex */
final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f18937a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Executor f18938b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final Map f18939c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ReferenceQueue f18940d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private p.a f18941e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private volatile boolean f18942f;

    /* JADX INFO: renamed from: k2.a$a, reason: collision with other inner class name */
    class ThreadFactoryC0249a implements ThreadFactory {

        /* JADX INFO: renamed from: k2.a$a$a, reason: collision with other inner class name */
        class RunnableC0250a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ Runnable f18943a;

            RunnableC0250a(Runnable runnable) {
                this.f18943a = runnable;
            }

            @Override // java.lang.Runnable
            public void run() {
                Process.setThreadPriority(10);
                this.f18943a.run();
            }
        }

        ThreadFactoryC0249a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(new RunnableC0250a(runnable), "glide-active-resources");
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a.this.b();
        }
    }

    static final class c extends WeakReference {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final i2.f f18946a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final boolean f18947b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        v f18948c;

        c(i2.f fVar, p pVar, ReferenceQueue referenceQueue, boolean z10) {
            super(pVar, referenceQueue);
            this.f18946a = (i2.f) e3.k.e(fVar);
            this.f18948c = (pVar.f() && z10) ? (v) e3.k.e(pVar.e()) : null;
            this.f18947b = pVar.f();
        }

        void a() {
            this.f18948c = null;
            clear();
        }
    }

    a(boolean z10) {
        this(z10, Executors.newSingleThreadExecutor(new ThreadFactoryC0249a()));
    }

    synchronized void a(i2.f fVar, p pVar) {
        c cVar = (c) this.f18939c.put(fVar, new c(fVar, pVar, this.f18940d, this.f18937a));
        if (cVar != null) {
            cVar.a();
        }
    }

    void b() {
        while (!this.f18942f) {
            try {
                c((c) this.f18940d.remove());
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
    }

    void c(c cVar) {
        v vVar;
        synchronized (this) {
            this.f18939c.remove(cVar.f18946a);
            if (cVar.f18947b && (vVar = cVar.f18948c) != null) {
                this.f18941e.a(cVar.f18946a, new p(vVar, true, false, cVar.f18946a, this.f18941e));
            }
        }
    }

    synchronized void d(i2.f fVar) {
        c cVar = (c) this.f18939c.remove(fVar);
        if (cVar != null) {
            cVar.a();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    synchronized p e(i2.f fVar) {
        c cVar = (c) this.f18939c.get(fVar);
        if (cVar == null) {
            return null;
        }
        p pVar = (p) cVar.get();
        if (pVar == null) {
            c(cVar);
        }
        return pVar;
    }

    void f(p.a aVar) {
        synchronized (aVar) {
            synchronized (this) {
                this.f18941e = aVar;
            }
        }
    }

    a(boolean z10, Executor executor) {
        this.f18939c = new HashMap();
        this.f18940d = new ReferenceQueue();
        this.f18937a = z10;
        this.f18938b = executor;
        executor.execute(new b());
    }
}
