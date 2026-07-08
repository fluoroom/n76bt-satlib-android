package io.grpc.internal;

import io.grpc.internal.t;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public class i1 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final long f16621l = TimeUnit.SECONDS.toNanos(10);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final long f16622m = TimeUnit.MILLISECONDS.toNanos(10);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ScheduledExecutorService f16623a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final r9.o f16624b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final d f16625c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f16626d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private e f16627e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private ScheduledFuture f16628f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private ScheduledFuture f16629g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Runnable f16630h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Runnable f16631i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final long f16632j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final long f16633k;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean z10;
            synchronized (i1.this) {
                try {
                    e eVar = i1.this.f16627e;
                    e eVar2 = e.DISCONNECTED;
                    if (eVar != eVar2) {
                        i1.this.f16627e = eVar2;
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (z10) {
                i1.this.f16625c.a();
            }
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean z10;
            synchronized (i1.this) {
                try {
                    i1.this.f16629g = null;
                    e eVar = i1.this.f16627e;
                    e eVar2 = e.PING_SCHEDULED;
                    if (eVar == eVar2) {
                        i1.this.f16627e = e.PING_SENT;
                        i1 i1Var = i1.this;
                        i1Var.f16628f = i1Var.f16623a.schedule(i1.this.f16630h, i1.this.f16633k, TimeUnit.NANOSECONDS);
                        z10 = true;
                    } else {
                        if (i1.this.f16627e == e.PING_DELAYED) {
                            i1 i1Var2 = i1.this;
                            ScheduledExecutorService scheduledExecutorService = i1Var2.f16623a;
                            Runnable runnable = i1.this.f16631i;
                            long j10 = i1.this.f16632j;
                            r9.o oVar = i1.this.f16624b;
                            TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                            i1Var2.f16629g = scheduledExecutorService.schedule(runnable, j10 - oVar.d(timeUnit), timeUnit);
                            i1.this.f16627e = eVar2;
                        }
                        z10 = false;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (z10) {
                i1.this.f16625c.b();
            }
        }
    }

    public static final class c implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final x f16636a;

        class a implements t.a {
            a() {
            }

            @Override // io.grpc.internal.t.a
            public void a(qb.u1 u1Var) {
                c.this.f16636a.f(qb.u1.f24784t.s("Keepalive failed. The connection is likely gone"));
            }

            @Override // io.grpc.internal.t.a
            public void b(long j10) {
            }
        }

        public c(x xVar) {
            this.f16636a = xVar;
        }

        @Override // io.grpc.internal.i1.d
        public void a() {
            this.f16636a.f(qb.u1.f24784t.s("Keepalive failed. The connection is likely gone"));
        }

        @Override // io.grpc.internal.i1.d
        public void b() {
            this.f16636a.h(new a(), com.google.common.util.concurrent.h.a());
        }
    }

    public interface d {
        void a();

        void b();
    }

    private enum e {
        IDLE,
        PING_SCHEDULED,
        PING_DELAYED,
        PING_SENT,
        IDLE_AND_PING_SENT,
        DISCONNECTED
    }

    public i1(d dVar, ScheduledExecutorService scheduledExecutorService, long j10, long j11, boolean z10) {
        this(dVar, scheduledExecutorService, r9.o.c(), j10, j11, z10);
    }

    public static long l(long j10) {
        return Math.max(j10, f16621l);
    }

    public synchronized void m() {
        try {
            this.f16624b.f().g();
            e eVar = this.f16627e;
            e eVar2 = e.PING_SCHEDULED;
            if (eVar == eVar2) {
                this.f16627e = e.PING_DELAYED;
            } else if (eVar == e.PING_SENT || eVar == e.IDLE_AND_PING_SENT) {
                ScheduledFuture scheduledFuture = this.f16628f;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                }
                if (this.f16627e == e.IDLE_AND_PING_SENT) {
                    this.f16627e = e.IDLE;
                } else {
                    this.f16627e = eVar2;
                    r9.l.u(this.f16629g == null, "There should be no outstanding pingFuture");
                    this.f16629g = this.f16623a.schedule(this.f16631i, this.f16632j, TimeUnit.NANOSECONDS);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized void n() {
        try {
            e eVar = this.f16627e;
            if (eVar == e.IDLE) {
                this.f16627e = e.PING_SCHEDULED;
                if (this.f16629g == null) {
                    ScheduledExecutorService scheduledExecutorService = this.f16623a;
                    Runnable runnable = this.f16631i;
                    long j10 = this.f16632j;
                    r9.o oVar = this.f16624b;
                    TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                    this.f16629g = scheduledExecutorService.schedule(runnable, j10 - oVar.d(timeUnit), timeUnit);
                }
            } else if (eVar == e.IDLE_AND_PING_SENT) {
                this.f16627e = e.PING_SENT;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized void o() {
        try {
            if (this.f16626d) {
                return;
            }
            e eVar = this.f16627e;
            if (eVar == e.PING_SCHEDULED || eVar == e.PING_DELAYED) {
                this.f16627e = e.IDLE;
            }
            if (this.f16627e == e.PING_SENT) {
                this.f16627e = e.IDLE_AND_PING_SENT;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized void p() {
        if (this.f16626d) {
            n();
        }
    }

    public synchronized void q() {
        try {
            e eVar = this.f16627e;
            e eVar2 = e.DISCONNECTED;
            if (eVar != eVar2) {
                this.f16627e = eVar2;
                ScheduledFuture scheduledFuture = this.f16628f;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                }
                ScheduledFuture scheduledFuture2 = this.f16629g;
                if (scheduledFuture2 != null) {
                    scheduledFuture2.cancel(false);
                    this.f16629g = null;
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    i1(d dVar, ScheduledExecutorService scheduledExecutorService, r9.o oVar, long j10, long j11, boolean z10) {
        this.f16627e = e.IDLE;
        this.f16630h = new j1(new a());
        this.f16631i = new j1(new b());
        this.f16625c = (d) r9.l.o(dVar, "keepAlivePinger");
        this.f16623a = (ScheduledExecutorService) r9.l.o(scheduledExecutorService, "scheduler");
        this.f16624b = (r9.o) r9.l.o(oVar, "stopwatch");
        this.f16632j = j10;
        this.f16633k = j11;
        this.f16626d = z10;
        oVar.f().g();
    }
}
