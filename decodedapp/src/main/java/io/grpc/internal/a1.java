package io.grpc.internal;

import io.grpc.internal.t;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes3.dex */
public class a1 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Logger f16252g = Logger.getLogger(a1.class.getName());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f16253a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final r9.o f16254b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Map f16255c = new LinkedHashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f16256d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private qb.u1 f16257e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f16258f;

    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ t.a f16259a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f16260b;

        a(t.a aVar, long j10) {
            this.f16259a = aVar;
            this.f16260b = j10;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f16259a.b(this.f16260b);
        }
    }

    class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ t.a f16261a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ qb.u1 f16262b;

        b(t.a aVar, qb.u1 u1Var) {
            this.f16261a = aVar;
            this.f16262b = u1Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f16261a.a(this.f16262b);
        }
    }

    public a1(long j10, r9.o oVar) {
        this.f16253a = j10;
        this.f16254b = oVar;
    }

    private static Runnable b(t.a aVar, long j10) {
        return new a(aVar, j10);
    }

    private static Runnable c(t.a aVar, qb.u1 u1Var) {
        return new b(aVar, u1Var);
    }

    private static void e(Executor executor, Runnable runnable) {
        try {
            executor.execute(runnable);
        } catch (Throwable th2) {
            f16252g.log(Level.SEVERE, "Failed to execute PingCallback", th2);
        }
    }

    public static void g(t.a aVar, Executor executor, qb.u1 u1Var) {
        e(executor, c(aVar, u1Var));
    }

    public void a(t.a aVar, Executor executor) {
        synchronized (this) {
            try {
                if (!this.f16256d) {
                    this.f16255c.put(aVar, executor);
                } else {
                    qb.u1 u1Var = this.f16257e;
                    e(executor, u1Var != null ? c(aVar, u1Var) : b(aVar, this.f16258f));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public boolean d() {
        synchronized (this) {
            try {
                if (this.f16256d) {
                    return false;
                }
                this.f16256d = true;
                long jD = this.f16254b.d(TimeUnit.NANOSECONDS);
                this.f16258f = jD;
                Map map = this.f16255c;
                this.f16255c = null;
                for (Map.Entry entry : map.entrySet()) {
                    e((Executor) entry.getValue(), b((t.a) entry.getKey(), jD));
                }
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void f(qb.u1 u1Var) {
        synchronized (this) {
            try {
                if (this.f16256d) {
                    return;
                }
                this.f16256d = true;
                this.f16257e = u1Var;
                Map map = this.f16255c;
                this.f16255c = null;
                for (Map.Entry entry : map.entrySet()) {
                    g((t.a) entry.getKey(), (Executor) entry.getValue(), u1Var);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public long h() {
        return this.f16253a;
    }
}
