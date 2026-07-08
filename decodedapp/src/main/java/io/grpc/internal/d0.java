package io.grpc.internal;

import io.grpc.internal.s;
import io.grpc.internal.z2;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
class d0 implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile boolean f16406a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private s f16407b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private r f16408c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private qb.u1 f16409d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private o f16411f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f16412g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f16413h;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private List f16410e = new ArrayList();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private List f16414i = new ArrayList();

    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f16415a;

        a(int i10) {
            this.f16415a = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            d0.this.f16408c.e(this.f16415a);
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            d0.this.f16408c.f();
        }
    }

    class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ qb.n f16418a;

        c(qb.n nVar) {
            this.f16418a = nVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            d0.this.f16408c.c(this.f16418a);
        }
    }

    class d implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f16420a;

        d(boolean z10) {
            this.f16420a = z10;
        }

        @Override // java.lang.Runnable
        public void run() {
            d0.this.f16408c.s(this.f16420a);
        }
    }

    class e implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ qb.w f16422a;

        e(qb.w wVar) {
            this.f16422a = wVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            d0.this.f16408c.q(this.f16422a);
        }
    }

    class f implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f16424a;

        f(int i10) {
            this.f16424a = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            d0.this.f16408c.k(this.f16424a);
        }
    }

    class g implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f16426a;

        g(int i10) {
            this.f16426a = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            d0.this.f16408c.l(this.f16426a);
        }
    }

    class h implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ qb.u f16428a;

        h(qb.u uVar) {
            this.f16428a = uVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            d0.this.f16408c.m(this.f16428a);
        }
    }

    class i implements Runnable {
        i() {
        }

        @Override // java.lang.Runnable
        public void run() {
            d0.this.j();
        }
    }

    class j implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f16431a;

        j(String str) {
            this.f16431a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            d0.this.f16408c.n(this.f16431a);
        }
    }

    class k implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ InputStream f16433a;

        k(InputStream inputStream) {
            this.f16433a = inputStream;
        }

        @Override // java.lang.Runnable
        public void run() {
            d0.this.f16408c.d(this.f16433a);
        }
    }

    class l implements Runnable {
        l() {
        }

        @Override // java.lang.Runnable
        public void run() {
            d0.this.f16408c.flush();
        }
    }

    class m implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ qb.u1 f16436a;

        m(qb.u1 u1Var) {
            this.f16436a = u1Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            d0.this.f16408c.b(this.f16436a);
        }
    }

    class n implements Runnable {
        n() {
        }

        @Override // java.lang.Runnable
        public void run() {
            d0.this.f16408c.p();
        }
    }

    private static class o implements s {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final s f16439a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private volatile boolean f16440b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private List f16441c = new ArrayList();

        class a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ z2.a f16442a;

            a(z2.a aVar) {
                this.f16442a = aVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                o.this.f16439a.a(this.f16442a);
            }
        }

        class b implements Runnable {
            b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                o.this.f16439a.c();
            }
        }

        class c implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ qb.z0 f16445a;

            c(qb.z0 z0Var) {
                this.f16445a = z0Var;
            }

            @Override // java.lang.Runnable
            public void run() {
                o.this.f16439a.b(this.f16445a);
            }
        }

        class d implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ qb.u1 f16447a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ s.a f16448b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ qb.z0 f16449c;

            d(qb.u1 u1Var, s.a aVar, qb.z0 z0Var) {
                this.f16447a = u1Var;
                this.f16448b = aVar;
                this.f16449c = z0Var;
            }

            @Override // java.lang.Runnable
            public void run() {
                o.this.f16439a.d(this.f16447a, this.f16448b, this.f16449c);
            }
        }

        public o(s sVar) {
            this.f16439a = sVar;
        }

        private void f(Runnable runnable) {
            synchronized (this) {
                try {
                    if (this.f16440b) {
                        runnable.run();
                    } else {
                        this.f16441c.add(runnable);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // io.grpc.internal.z2
        public void a(z2.a aVar) {
            if (this.f16440b) {
                this.f16439a.a(aVar);
            } else {
                f(new a(aVar));
            }
        }

        @Override // io.grpc.internal.s
        public void b(qb.z0 z0Var) {
            f(new c(z0Var));
        }

        @Override // io.grpc.internal.z2
        public void c() {
            if (this.f16440b) {
                this.f16439a.c();
            } else {
                f(new b());
            }
        }

        @Override // io.grpc.internal.s
        public void d(qb.u1 u1Var, s.a aVar, qb.z0 z0Var) {
            f(new d(u1Var, aVar, z0Var));
        }

        public void g() {
            List list;
            List arrayList = new ArrayList();
            while (true) {
                synchronized (this) {
                    try {
                        if (this.f16441c.isEmpty()) {
                            this.f16441c = null;
                            this.f16440b = true;
                            return;
                        } else {
                            list = this.f16441c;
                            this.f16441c = arrayList;
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

    d0() {
    }

    private void i(Runnable runnable) {
        r9.l.u(this.f16407b != null, "May only be called after start");
        synchronized (this) {
            try {
                if (this.f16406a) {
                    runnable.run();
                } else {
                    this.f16410e.add(runnable);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0024, code lost:
    
        r0 = r1.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x002c, code lost:
    
        if (r0.hasNext() == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x002e, code lost:
    
        ((java.lang.Runnable) r0.next()).run();
     */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void j() {
        /*
            r3 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        L5:
            monitor-enter(r3)
            java.util.List r1 = r3.f16410e     // Catch: java.lang.Throwable -> L1d
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L1d
            if (r1 == 0) goto L1f
            r0 = 0
            r3.f16410e = r0     // Catch: java.lang.Throwable -> L1d
            r0 = 1
            r3.f16406a = r0     // Catch: java.lang.Throwable -> L1d
            io.grpc.internal.d0$o r0 = r3.f16411f     // Catch: java.lang.Throwable -> L1d
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L1d
            if (r0 == 0) goto L1c
            r0.g()
        L1c:
            return
        L1d:
            r0 = move-exception
            goto L3d
        L1f:
            java.util.List r1 = r3.f16410e     // Catch: java.lang.Throwable -> L1d
            r3.f16410e = r0     // Catch: java.lang.Throwable -> L1d
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L1d
            java.util.Iterator r0 = r1.iterator()
        L28:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L38
            java.lang.Object r2 = r0.next()
            java.lang.Runnable r2 = (java.lang.Runnable) r2
            r2.run()
            goto L28
        L38:
            r1.clear()
            r0 = r1
            goto L5
        L3d:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L1d
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: io.grpc.internal.d0.j():void");
    }

    private void t(s sVar) {
        Iterator it = this.f16414i.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        this.f16414i = null;
        this.f16408c.r(sVar);
    }

    private void v(r rVar) {
        r rVar2 = this.f16408c;
        r9.l.w(rVar2 == null, "realStream already set to %s", rVar2);
        this.f16408c = rVar;
        this.f16413h = System.nanoTime();
    }

    @Override // io.grpc.internal.y2
    public boolean a() {
        if (this.f16406a) {
            return this.f16408c.a();
        }
        return false;
    }

    @Override // io.grpc.internal.r
    public void b(qb.u1 u1Var) {
        boolean z10 = false;
        r9.l.u(this.f16407b != null, "May only be called after start");
        r9.l.o(u1Var, "reason");
        synchronized (this) {
            try {
                if (this.f16408c == null) {
                    v(v1.f17181a);
                    this.f16409d = u1Var;
                } else {
                    z10 = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (z10) {
            i(new m(u1Var));
            return;
        }
        j();
        u(u1Var);
        this.f16407b.d(u1Var, s.a.PROCESSED, new qb.z0());
    }

    @Override // io.grpc.internal.y2
    public void c(qb.n nVar) {
        r9.l.u(this.f16407b == null, "May only be called before start");
        r9.l.o(nVar, "compressor");
        this.f16414i.add(new c(nVar));
    }

    @Override // io.grpc.internal.y2
    public void d(InputStream inputStream) {
        r9.l.u(this.f16407b != null, "May only be called after start");
        r9.l.o(inputStream, "message");
        if (this.f16406a) {
            this.f16408c.d(inputStream);
        } else {
            i(new k(inputStream));
        }
    }

    @Override // io.grpc.internal.y2
    public void e(int i10) {
        r9.l.u(this.f16407b != null, "May only be called after start");
        if (this.f16406a) {
            this.f16408c.e(i10);
        } else {
            i(new a(i10));
        }
    }

    @Override // io.grpc.internal.y2
    public void f() {
        r9.l.u(this.f16407b == null, "May only be called before start");
        this.f16414i.add(new b());
    }

    @Override // io.grpc.internal.y2
    public void flush() {
        r9.l.u(this.f16407b != null, "May only be called after start");
        if (this.f16406a) {
            this.f16408c.flush();
        } else {
            i(new l());
        }
    }

    @Override // io.grpc.internal.r
    public void k(int i10) {
        r9.l.u(this.f16407b == null, "May only be called before start");
        this.f16414i.add(new f(i10));
    }

    @Override // io.grpc.internal.r
    public void l(int i10) {
        r9.l.u(this.f16407b == null, "May only be called before start");
        this.f16414i.add(new g(i10));
    }

    @Override // io.grpc.internal.r
    public void m(qb.u uVar) {
        r9.l.u(this.f16407b == null, "May only be called before start");
        this.f16414i.add(new h(uVar));
    }

    @Override // io.grpc.internal.r
    public void n(String str) {
        r9.l.o(str, "authority");
        this.f16414i.add(new j(str));
    }

    @Override // io.grpc.internal.r
    public void o(c1 c1Var) {
        synchronized (this) {
            try {
                if (this.f16407b == null) {
                    return;
                }
                if (this.f16408c != null) {
                    c1Var.b("buffered_nanos", Long.valueOf(this.f16413h - this.f16412g));
                    this.f16408c.o(c1Var);
                } else {
                    c1Var.b("buffered_nanos", Long.valueOf(System.nanoTime() - this.f16412g));
                    c1Var.a("waiting_for_connection");
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // io.grpc.internal.r
    public void p() {
        r9.l.u(this.f16407b != null, "May only be called after start");
        i(new n());
    }

    @Override // io.grpc.internal.r
    public void q(qb.w wVar) {
        r9.l.u(this.f16407b == null, "May only be called before start");
        r9.l.o(wVar, "decompressorRegistry");
        this.f16414i.add(new e(wVar));
    }

    @Override // io.grpc.internal.r
    public void r(s sVar) {
        qb.u1 u1Var;
        boolean z10;
        r9.l.o(sVar, "listener");
        r9.l.u(this.f16407b == null, "already started");
        synchronized (this) {
            try {
                u1Var = this.f16409d;
                z10 = this.f16406a;
                if (!z10) {
                    o oVar = new o(sVar);
                    this.f16411f = oVar;
                    sVar = oVar;
                }
                this.f16407b = sVar;
                this.f16412g = System.nanoTime();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (u1Var != null) {
            sVar.d(u1Var, s.a.PROCESSED, new qb.z0());
        } else if (z10) {
            t(sVar);
        }
    }

    @Override // io.grpc.internal.r
    public void s(boolean z10) {
        r9.l.u(this.f16407b == null, "May only be called before start");
        this.f16414i.add(new d(z10));
    }

    final Runnable w(r rVar) {
        synchronized (this) {
            try {
                if (this.f16408c != null) {
                    return null;
                }
                v((r) r9.l.o(rVar, "stream"));
                s sVar = this.f16407b;
                if (sVar == null) {
                    this.f16410e = null;
                    this.f16406a = true;
                }
                if (sVar == null) {
                    return null;
                }
                t(sVar);
                return new i();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    protected void u(qb.u1 u1Var) {
    }
}
