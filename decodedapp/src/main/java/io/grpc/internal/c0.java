package io.grpc.internal;

import io.grpc.internal.q1;
import io.grpc.internal.s;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.Executor;
import qb.q0;

/* JADX INFO: loaded from: classes3.dex */
final class c0 implements q1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Executor f16371c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final qb.z1 f16372d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Runnable f16373e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Runnable f16374f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Runnable f16375g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private q1.a f16376h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final qb.j0 f16369a = qb.j0.a(c0.class, null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f16370b = new Object();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Collection f16377i = new LinkedHashSet();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private volatile f f16378j = new f(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0);

    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ q1.a f16379a;

        a(q1.a aVar) {
            this.f16379a = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f16379a.d(true);
        }
    }

    class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ q1.a f16381a;

        b(q1.a aVar) {
            this.f16381a = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f16381a.d(false);
        }
    }

    class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ q1.a f16383a;

        c(q1.a aVar) {
            this.f16383a = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f16383a.b();
        }
    }

    class d implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ qb.u1 f16385a;

        d(qb.u1 u1Var) {
            this.f16385a = u1Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            c0.this.f16376h.c(this.f16385a);
        }
    }

    private class e extends d0 {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private final q0.h f16387j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private final qb.s f16388k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private final qb.k[] f16389l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private volatile qb.u1 f16390m;

        /* synthetic */ e(c0 c0Var, q0.h hVar, qb.k[] kVarArr, a aVar) {
            this(hVar, kVarArr);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Runnable B(t tVar, String str) {
            qb.s sVarB = this.f16388k.b();
            try {
                r rVarG = tVar.g(this.f16387j.c(), this.f16387j.b(), this.f16387j.a(), this.f16389l);
                if (str != null) {
                    rVarG.n(str);
                }
                return w(rVarG);
            } finally {
                this.f16388k.f(sVarB);
            }
        }

        @Override // io.grpc.internal.d0, io.grpc.internal.r
        public void b(qb.u1 u1Var) {
            super.b(u1Var);
            synchronized (c0.this.f16370b) {
                try {
                    if (c0.this.f16375g != null) {
                        boolean zRemove = c0.this.f16377i.remove(this);
                        if (!c0.this.q() && zRemove) {
                            c0.this.f16372d.b(c0.this.f16374f);
                            if (c0.this.f16378j.f16393b != null) {
                                c0.this.f16372d.b(c0.this.f16375g);
                                c0.this.f16375g = null;
                            }
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            c0.this.f16372d.a();
        }

        @Override // io.grpc.internal.d0, io.grpc.internal.r
        public void o(c1 c1Var) {
            if (this.f16387j.a().k()) {
                c1Var.a("wait_for_ready");
                qb.u1 u1Var = this.f16390m;
                if (u1Var != null && !u1Var.q()) {
                    c1Var.b("Last Pick Failure", u1Var);
                }
            }
            super.o(c1Var);
        }

        @Override // io.grpc.internal.d0
        protected void u(qb.u1 u1Var) {
            for (qb.k kVar : this.f16389l) {
                kVar.i(u1Var);
            }
        }

        private e(q0.h hVar, qb.k[] kVarArr) {
            this.f16388k = qb.s.e();
            this.f16387j = hVar;
            this.f16389l = kVarArr;
        }
    }

    static final class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final q0.k f16392a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final qb.u1 f16393b;

        /* synthetic */ f(q0.k kVar, qb.u1 u1Var, a aVar) {
            this(kVar, u1Var);
        }

        public f a(q0.k kVar) {
            return new f(kVar, this.f16393b);
        }

        public f b(qb.u1 u1Var) {
            return new f(this.f16392a, u1Var);
        }

        private f(q0.k kVar, qb.u1 u1Var) {
            this.f16392a = kVar;
            this.f16393b = u1Var;
        }
    }

    c0(Executor executor, qb.z1 z1Var) {
        this.f16371c = executor;
        this.f16372d = z1Var;
    }

    private e o(q0.h hVar, qb.k[] kVarArr, q0.g gVar) {
        e eVar = new e(this, hVar, kVarArr, null);
        if (hVar.a().k() && gVar != null && gVar.e()) {
            eVar.f16390m = gVar.b();
        }
        this.f16377i.add(eVar);
        if (p() == 1) {
            this.f16372d.b(this.f16373e);
        }
        for (qb.k kVar : kVarArr) {
            kVar.j();
        }
        return eVar;
    }

    @Override // io.grpc.internal.q1
    public final void b(qb.u1 u1Var) {
        Runnable runnable;
        synchronized (this.f16370b) {
            try {
                if (this.f16378j.f16393b != null) {
                    return;
                }
                this.f16378j = this.f16378j.b(u1Var);
                this.f16372d.b(new d(u1Var));
                if (!q() && (runnable = this.f16375g) != null) {
                    this.f16372d.b(runnable);
                    this.f16375g = null;
                }
                this.f16372d.a();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // io.grpc.internal.q1
    public final Runnable c(q1.a aVar) {
        this.f16376h = aVar;
        this.f16373e = new a(aVar);
        this.f16374f = new b(aVar);
        this.f16375g = new c(aVar);
        return null;
    }

    @Override // qb.o0
    public qb.j0 e() {
        return this.f16369a;
    }

    @Override // io.grpc.internal.q1
    public final void f(qb.u1 u1Var) {
        Collection<e> collection;
        Runnable runnable;
        b(u1Var);
        synchronized (this.f16370b) {
            try {
                collection = this.f16377i;
                runnable = this.f16375g;
                this.f16375g = null;
                if (!collection.isEmpty()) {
                    this.f16377i = Collections.EMPTY_LIST;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (runnable != null) {
            for (e eVar : collection) {
                Runnable runnableW = eVar.w(new k0(u1Var, s.a.REFUSED, eVar.f16389l));
                if (runnableW != null) {
                    runnableW.run();
                }
            }
            this.f16372d.execute(runnable);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0079, code lost:
    
        r3 = r1;
     */
    @Override // io.grpc.internal.t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final io.grpc.internal.r g(qb.a1 r3, qb.z0 r4, qb.c r5, qb.k[] r6) {
        /*
            r2 = this;
            io.grpc.internal.f2 r0 = new io.grpc.internal.f2     // Catch: java.lang.Throwable -> L1d
            io.grpc.internal.y1 r1 = new io.grpc.internal.y1     // Catch: java.lang.Throwable -> L1d
            r1.<init>(r6)     // Catch: java.lang.Throwable -> L1d
            r0.<init>(r3, r4, r5, r1)     // Catch: java.lang.Throwable -> L1d
            io.grpc.internal.c0$f r3 = r2.f16378j     // Catch: java.lang.Throwable -> L1d
        Lc:
            qb.u1 r4 = r3.f16393b     // Catch: java.lang.Throwable -> L1d
            if (r4 == 0) goto L1f
            io.grpc.internal.k0 r4 = new io.grpc.internal.k0     // Catch: java.lang.Throwable -> L1d
            qb.u1 r3 = r3.f16393b     // Catch: java.lang.Throwable -> L1d
            r4.<init>(r3, r6)     // Catch: java.lang.Throwable -> L1d
            qb.z1 r3 = r2.f16372d
            r3.a()
            return r4
        L1d:
            r3 = move-exception
            goto L7d
        L1f:
            qb.q0$k r4 = r3.f16392a     // Catch: java.lang.Throwable -> L1d
            if (r4 == 0) goto L68
            qb.q0$g r4 = r4.a(r0)     // Catch: java.lang.Throwable -> L1d
            qb.c r5 = r0.a()     // Catch: java.lang.Throwable -> L1d
            java.lang.String r1 = r5.a()     // Catch: java.lang.Throwable -> L1d
            if (r1 != 0) goto L3f
            java.lang.String r1 = r4.a()     // Catch: java.lang.Throwable -> L1d
            if (r1 == 0) goto L3f
            java.lang.String r1 = r4.a()     // Catch: java.lang.Throwable -> L1d
            qb.c r5 = r5.m(r1)     // Catch: java.lang.Throwable -> L1d
        L3f:
            boolean r1 = r5.k()     // Catch: java.lang.Throwable -> L1d
            io.grpc.internal.t r1 = io.grpc.internal.w0.j(r4, r1)     // Catch: java.lang.Throwable -> L1d
            if (r1 == 0) goto L69
            qb.a1 r3 = r0.c()     // Catch: java.lang.Throwable -> L1d
            qb.z0 r0 = r0.b()     // Catch: java.lang.Throwable -> L1d
            io.grpc.internal.r r3 = r1.g(r3, r0, r5, r6)     // Catch: java.lang.Throwable -> L1d
            java.lang.String r5 = r4.a()     // Catch: java.lang.Throwable -> L1d
            if (r5 == 0) goto L62
            java.lang.String r4 = r4.a()     // Catch: java.lang.Throwable -> L1d
            r3.n(r4)     // Catch: java.lang.Throwable -> L1d
        L62:
            qb.z1 r4 = r2.f16372d
            r4.a()
            return r3
        L68:
            r4 = 0
        L69:
            java.lang.Object r5 = r2.f16370b     // Catch: java.lang.Throwable -> L1d
            monitor-enter(r5)     // Catch: java.lang.Throwable -> L1d
            io.grpc.internal.c0$f r1 = r2.f16378j     // Catch: java.lang.Throwable -> L76
            if (r3 != r1) goto L78
            io.grpc.internal.c0$e r3 = r2.o(r0, r6, r4)     // Catch: java.lang.Throwable -> L76
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L76
            goto L62
        L76:
            r3 = move-exception
            goto L7b
        L78:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L76
            r3 = r1
            goto Lc
        L7b:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L76
            throw r3     // Catch: java.lang.Throwable -> L1d
        L7d:
            qb.z1 r4 = r2.f16372d
            r4.a()
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: io.grpc.internal.c0.g(qb.a1, qb.z0, qb.c, qb.k[]):io.grpc.internal.r");
    }

    final int p() {
        int size;
        synchronized (this.f16370b) {
            size = this.f16377i.size();
        }
        return size;
    }

    public final boolean q() {
        boolean z10;
        synchronized (this.f16370b) {
            z10 = !this.f16377i.isEmpty();
        }
        return z10;
    }

    final void r(q0.k kVar) {
        Runnable runnable;
        synchronized (this.f16370b) {
            this.f16378j = this.f16378j.a(kVar);
            if (kVar != null && q()) {
                ArrayList<e> arrayList = new ArrayList(this.f16377i);
                ArrayList arrayList2 = new ArrayList();
                for (e eVar : arrayList) {
                    q0.g gVarA = kVar.a(eVar.f16387j);
                    qb.c cVarA = eVar.f16387j.a();
                    if (cVarA.k() && gVarA.e()) {
                        eVar.f16390m = gVarA.b();
                    }
                    t tVarJ = w0.j(gVarA, cVarA.k());
                    if (tVarJ != null) {
                        Executor executorE = this.f16371c;
                        if (cVarA.e() != null) {
                            executorE = cVarA.e();
                        }
                        Runnable runnableB = eVar.B(tVarJ, gVarA.a());
                        if (runnableB != null) {
                            executorE.execute(runnableB);
                        }
                        arrayList2.add(eVar);
                    }
                }
                synchronized (this.f16370b) {
                    try {
                        if (q()) {
                            Iterator it = arrayList2.iterator();
                            while (it.hasNext()) {
                                this.f16377i.remove((e) it.next());
                            }
                            if (this.f16377i.isEmpty()) {
                                this.f16377i = new LinkedHashSet();
                            }
                            if (!q()) {
                                this.f16372d.b(this.f16374f);
                                if (this.f16378j.f16393b != null && (runnable = this.f16375g) != null) {
                                    this.f16372d.b(runnable);
                                    this.f16375g = null;
                                }
                            }
                            this.f16372d.a();
                        }
                    } finally {
                    }
                }
            }
        }
    }
}
