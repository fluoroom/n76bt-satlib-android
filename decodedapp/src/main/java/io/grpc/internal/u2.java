package io.grpc.internal;

import java.util.IdentityHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class u2 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final u2 f17157d = new u2(new a());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final IdentityHashMap f17158a = new IdentityHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e f17159b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ScheduledExecutorService f17160c;

    class a implements e {
        a() {
        }

        @Override // io.grpc.internal.u2.e
        public ScheduledExecutorService a() {
            return Executors.newSingleThreadScheduledExecutor(w0.i("grpc-shared-destroyer-%d", true));
        }
    }

    class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ c f17161a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ d f17162b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Object f17163c;

        b(c cVar, d dVar, Object obj) {
            this.f17161a = cVar;
            this.f17162b = dVar;
            this.f17163c = obj;
        }

        /* JADX WARN: Finally extract failed */
        @Override // java.lang.Runnable
        public void run() {
            synchronized (u2.this) {
                try {
                    if (this.f17161a.f17166b == 0) {
                        try {
                            this.f17162b.b(this.f17163c);
                            u2.this.f17158a.remove(this.f17162b);
                            if (u2.this.f17158a.isEmpty()) {
                                u2.this.f17160c.shutdown();
                                u2.this.f17160c = null;
                            }
                        } catch (Throwable th2) {
                            u2.this.f17158a.remove(this.f17162b);
                            if (u2.this.f17158a.isEmpty()) {
                                u2.this.f17160c.shutdown();
                                u2.this.f17160c = null;
                            }
                            throw th2;
                        }
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
    }

    private static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Object f17165a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f17166b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        ScheduledFuture f17167c;

        c(Object obj) {
            this.f17165a = obj;
        }
    }

    public interface d {
        void b(Object obj);

        Object create();
    }

    interface e {
        ScheduledExecutorService a();
    }

    u2(e eVar) {
        this.f17159b = eVar;
    }

    public static Object d(d dVar) {
        return f17157d.e(dVar);
    }

    public static Object f(d dVar, Object obj) {
        return f17157d.g(dVar, obj);
    }

    synchronized Object e(d dVar) {
        c cVar;
        try {
            cVar = (c) this.f17158a.get(dVar);
            if (cVar == null) {
                cVar = new c(dVar.create());
                this.f17158a.put(dVar, cVar);
            }
            ScheduledFuture scheduledFuture = cVar.f17167c;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
                cVar.f17167c = null;
            }
            cVar.f17166b++;
        } catch (Throwable th2) {
            throw th2;
        }
        return cVar.f17165a;
    }

    synchronized Object g(d dVar, Object obj) {
        try {
            c cVar = (c) this.f17158a.get(dVar);
            if (cVar == null) {
                throw new IllegalArgumentException("No cached instance found for " + dVar);
            }
            r9.l.e(obj == cVar.f17165a, "Releasing the wrong instance");
            r9.l.u(cVar.f17166b > 0, "Refcount has already reached zero");
            int i10 = cVar.f17166b - 1;
            cVar.f17166b = i10;
            if (i10 == 0) {
                r9.l.u(cVar.f17167c == null, "Destroy task already scheduled");
                if (this.f17160c == null) {
                    this.f17160c = this.f17159b.a();
                }
                cVar.f17167c = this.f17160c.schedule(new j1(new b(cVar, dVar, obj)), 1L, TimeUnit.SECONDS);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return null;
    }
}
