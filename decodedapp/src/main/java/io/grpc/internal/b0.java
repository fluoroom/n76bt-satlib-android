package io.grpc.internal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import qb.g;

/* JADX INFO: loaded from: classes3.dex */
public abstract class b0 extends qb.g {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final Logger f16312j = Logger.getLogger(b0.class.getName());

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final qb.g f16313k = new i();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ScheduledFuture f16314a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Executor f16315b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final qb.s f16316c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile boolean f16317d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private g.a f16318e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private qb.g f16319f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private qb.u1 f16320g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private List f16321h = new ArrayList();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private k f16322i;

    class a extends z {
        a(qb.s sVar) {
            super(sVar);
        }

        @Override // io.grpc.internal.z
        public void a() {
            b0.this.m();
        }
    }

    class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f16324a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f16325b;

        b(long j10, String str) {
            this.f16324a = j10;
            this.f16325b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            long jAbs = Math.abs(this.f16324a);
            TimeUnit timeUnit = TimeUnit.SECONDS;
            long nanos = jAbs / timeUnit.toNanos(1L);
            long jAbs2 = Math.abs(this.f16324a) % timeUnit.toNanos(1L);
            StringBuilder sb2 = new StringBuilder();
            if (this.f16324a < 0) {
                sb2.append("ClientCall started after ");
                sb2.append(this.f16325b);
                sb2.append(" deadline was exceeded. Deadline has been exceeded for ");
            } else {
                sb2.append("Deadline ");
                sb2.append(this.f16325b);
                sb2.append(" was exceeded after ");
            }
            sb2.append(nanos);
            sb2.append(String.format(Locale.US, ".%09d", Long.valueOf(jAbs2)));
            sb2.append("s");
            b0.this.k(qb.u1.f24773i.s(sb2.toString()), true);
        }
    }

    class c extends z {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ k f16327b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(k kVar) {
            super(b0.this.f16316c);
            this.f16327b = kVar;
        }

        @Override // io.grpc.internal.z
        public void a() {
            this.f16327b.g();
        }
    }

    class d implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ g.a f16329a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ qb.z0 f16330b;

        d(g.a aVar, qb.z0 z0Var) {
            this.f16329a = aVar;
            this.f16330b = z0Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            b0.this.f16319f.e(this.f16329a, this.f16330b);
        }
    }

    class e implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ qb.u1 f16332a;

        e(qb.u1 u1Var) {
            this.f16332a = u1Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            b0.this.f16319f.a(this.f16332a.p(), this.f16332a.n());
        }
    }

    class f implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f16334a;

        f(Object obj) {
            this.f16334a = obj;
        }

        @Override // java.lang.Runnable
        public void run() {
            b0.this.f16319f.d(this.f16334a);
        }
    }

    class g implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f16336a;

        g(int i10) {
            this.f16336a = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            b0.this.f16319f.c(this.f16336a);
        }
    }

    class h implements Runnable {
        h() {
        }

        @Override // java.lang.Runnable
        public void run() {
            b0.this.f16319f.b();
        }
    }

    private final class j extends z {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final g.a f16339b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final qb.u1 f16340c;

        j(g.a aVar, qb.u1 u1Var) {
            super(b0.this.f16316c);
            this.f16339b = aVar;
            this.f16340c = u1Var;
        }

        @Override // io.grpc.internal.z
        public void a() {
            this.f16339b.a(this.f16340c, new qb.z0());
        }
    }

    private static final class k extends g.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final g.a f16342a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private volatile boolean f16343b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private List f16344c = new ArrayList();

        class a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ qb.z0 f16345a;

            a(qb.z0 z0Var) {
                this.f16345a = z0Var;
            }

            @Override // java.lang.Runnable
            public void run() {
                k.this.f16342a.b(this.f16345a);
            }
        }

        class b implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ Object f16347a;

            b(Object obj) {
                this.f16347a = obj;
            }

            @Override // java.lang.Runnable
            public void run() {
                k.this.f16342a.c(this.f16347a);
            }
        }

        class c implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ qb.u1 f16349a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ qb.z0 f16350b;

            c(qb.u1 u1Var, qb.z0 z0Var) {
                this.f16349a = u1Var;
                this.f16350b = z0Var;
            }

            @Override // java.lang.Runnable
            public void run() {
                k.this.f16342a.a(this.f16349a, this.f16350b);
            }
        }

        class d implements Runnable {
            d() {
            }

            @Override // java.lang.Runnable
            public void run() {
                k.this.f16342a.d();
            }
        }

        public k(g.a aVar) {
            this.f16342a = aVar;
        }

        private void f(Runnable runnable) {
            synchronized (this) {
                try {
                    if (this.f16343b) {
                        runnable.run();
                    } else {
                        this.f16344c.add(runnable);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // qb.g.a
        public void a(qb.u1 u1Var, qb.z0 z0Var) {
            f(new c(u1Var, z0Var));
        }

        @Override // qb.g.a
        public void b(qb.z0 z0Var) {
            if (this.f16343b) {
                this.f16342a.b(z0Var);
            } else {
                f(new a(z0Var));
            }
        }

        @Override // qb.g.a
        public void c(Object obj) {
            if (this.f16343b) {
                this.f16342a.c(obj);
            } else {
                f(new b(obj));
            }
        }

        @Override // qb.g.a
        public void d() {
            if (this.f16343b) {
                this.f16342a.d();
            } else {
                f(new d());
            }
        }

        void g() {
            List list;
            List arrayList = new ArrayList();
            while (true) {
                synchronized (this) {
                    try {
                        if (this.f16344c.isEmpty()) {
                            this.f16344c = null;
                            this.f16343b = true;
                            return;
                        } else {
                            list = this.f16344c;
                            this.f16344c = arrayList;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((Runnable) it.next()).run();
                }
                list.clear();
                arrayList = list;
            }
        }
    }

    protected b0(Executor executor, ScheduledExecutorService scheduledExecutorService, qb.u uVar) {
        this.f16315b = (Executor) r9.l.o(executor, "callExecutor");
        r9.l.o(scheduledExecutorService, "scheduler");
        this.f16316c = qb.s.e();
        this.f16314a = o(scheduledExecutorService, uVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k(qb.u1 u1Var, boolean z10) {
        boolean z11;
        g.a aVar;
        synchronized (this) {
            try {
                if (this.f16319f == null) {
                    q(f16313k);
                    aVar = this.f16318e;
                    this.f16320g = u1Var;
                    z11 = false;
                } else {
                    if (z10) {
                        return;
                    }
                    z11 = true;
                    aVar = null;
                }
                if (z11) {
                    l(new e(u1Var));
                } else {
                    if (aVar != null) {
                        this.f16315b.execute(new j(aVar, u1Var));
                    }
                    m();
                }
                j();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private void l(Runnable runnable) {
        synchronized (this) {
            try {
                if (this.f16317d) {
                    runnable.run();
                } else {
                    this.f16321h.add(runnable);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002b, code lost:
    
        r0 = r1.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0033, code lost:
    
        if (r0.hasNext() == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0035, code lost:
    
        ((java.lang.Runnable) r0.next()).run();
     */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m() {
        /*
            r3 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        L5:
            monitor-enter(r3)
            java.util.List r1 = r3.f16321h     // Catch: java.lang.Throwable -> L24
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L24
            if (r1 == 0) goto L26
            r0 = 0
            r3.f16321h = r0     // Catch: java.lang.Throwable -> L24
            r0 = 1
            r3.f16317d = r0     // Catch: java.lang.Throwable -> L24
            io.grpc.internal.b0$k r0 = r3.f16322i     // Catch: java.lang.Throwable -> L24
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L24
            if (r0 == 0) goto L23
            java.util.concurrent.Executor r1 = r3.f16315b
            io.grpc.internal.b0$c r2 = new io.grpc.internal.b0$c
            r2.<init>(r0)
            r1.execute(r2)
        L23:
            return
        L24:
            r0 = move-exception
            goto L44
        L26:
            java.util.List r1 = r3.f16321h     // Catch: java.lang.Throwable -> L24
            r3.f16321h = r0     // Catch: java.lang.Throwable -> L24
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L24
            java.util.Iterator r0 = r1.iterator()
        L2f:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L3f
            java.lang.Object r2 = r0.next()
            java.lang.Runnable r2 = (java.lang.Runnable) r2
            r2.run()
            goto L2f
        L3f:
            r1.clear()
            r0 = r1
            goto L5
        L44:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L24
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: io.grpc.internal.b0.m():void");
    }

    private boolean n(qb.u uVar, qb.u uVar2) {
        if (uVar2 == null) {
            return true;
        }
        if (uVar == null) {
            return false;
        }
        return uVar.h(uVar2);
    }

    private ScheduledFuture o(ScheduledExecutorService scheduledExecutorService, qb.u uVar) {
        String str;
        long jK;
        qb.u uVarG = this.f16316c.g();
        if (uVar != null && n(uVar, uVarG)) {
            jK = uVar.k(TimeUnit.NANOSECONDS);
            str = "CallOptions";
        } else {
            if (uVarG == null) {
                return null;
            }
            TimeUnit timeUnit = TimeUnit.NANOSECONDS;
            long jK2 = uVarG.k(timeUnit);
            Logger logger = f16312j;
            if (logger.isLoggable(Level.FINE)) {
                Locale locale = Locale.US;
                StringBuilder sb2 = new StringBuilder(String.format(locale, "Call timeout set to '%d' ns, due to context deadline.", Long.valueOf(jK2)));
                if (uVar == null) {
                    sb2.append(" Explicit call timeout was not set.");
                } else {
                    sb2.append(String.format(locale, " Explicit call timeout was '%d' ns.", Long.valueOf(uVar.k(timeUnit))));
                }
                logger.fine(sb2.toString());
            }
            str = "Context";
            jK = jK2;
        }
        return scheduledExecutorService.schedule(new b(jK, str), jK, TimeUnit.NANOSECONDS);
    }

    private void q(qb.g gVar) {
        qb.g gVar2 = this.f16319f;
        r9.l.w(gVar2 == null, "realCall already set to %s", gVar2);
        ScheduledFuture scheduledFuture = this.f16314a;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.f16319f = gVar;
    }

    @Override // qb.g
    public final void a(String str, Throwable th2) {
        qb.u1 u1Var = qb.u1.f24770f;
        qb.u1 u1VarS = str != null ? u1Var.s(str) : u1Var.s("Call cancelled without message");
        if (th2 != null) {
            u1VarS = u1VarS.r(th2);
        }
        k(u1VarS, false);
    }

    @Override // qb.g
    public final void b() {
        l(new h());
    }

    @Override // qb.g
    public final void c(int i10) {
        if (this.f16317d) {
            this.f16319f.c(i10);
        } else {
            l(new g(i10));
        }
    }

    @Override // qb.g
    public final void d(Object obj) {
        if (this.f16317d) {
            this.f16319f.d(obj);
        } else {
            l(new f(obj));
        }
    }

    @Override // qb.g
    public final void e(g.a aVar, qb.z0 z0Var) {
        qb.u1 u1Var;
        boolean z10;
        r9.l.u(this.f16318e == null, "already started");
        synchronized (this) {
            try {
                this.f16318e = (g.a) r9.l.o(aVar, "listener");
                u1Var = this.f16320g;
                z10 = this.f16317d;
                if (!z10) {
                    k kVar = new k(aVar);
                    this.f16322i = kVar;
                    aVar = kVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (u1Var != null) {
            this.f16315b.execute(new j(aVar, u1Var));
        } else if (z10) {
            this.f16319f.e(aVar, z0Var);
        } else {
            l(new d(aVar, z0Var));
        }
    }

    protected void j() {
    }

    public final Runnable p(qb.g gVar) {
        synchronized (this) {
            try {
                if (this.f16319f != null) {
                    return null;
                }
                q((qb.g) r9.l.o(gVar, "call"));
                return new a(this.f16316c);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public String toString() {
        return r9.g.b(this).d("realCall", this.f16319f).toString();
    }

    class i extends qb.g {
        i() {
        }

        @Override // qb.g
        public void a(String str, Throwable th2) {
        }

        @Override // qb.g
        public void b() {
        }

        @Override // qb.g
        public void c(int i10) {
        }

        @Override // qb.g
        public void d(Object obj) {
        }

        @Override // qb.g
        public void e(g.a aVar, qb.z0 z0Var) {
        }
    }
}
