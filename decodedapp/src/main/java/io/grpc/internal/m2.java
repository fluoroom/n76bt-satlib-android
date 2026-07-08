package io.grpc.internal;

import androidx.appcompat.widget.RtlSpacingHelper;
import io.grpc.internal.s;
import io.grpc.internal.z2;
import j$.util.DesugarCollections;
import java.io.InputStream;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import qb.k;
import qb.u1;
import qb.z0;

/* JADX INFO: loaded from: classes3.dex */
abstract class m2 implements io.grpc.internal.r {
    static final z0.h A;
    static final z0.h B;
    private static final qb.u1 C;
    private static Random D;
    private static final boolean E;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final qb.a1 f16830a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Executor f16831b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ScheduledExecutorService f16833d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final qb.z0 f16834e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final n2 f16835f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final y0 f16836g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f16837h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final t f16839j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final long f16840k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final long f16841l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final d0 f16842m;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private y f16848s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private long f16849t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private io.grpc.internal.s f16850u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private u f16851v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private u f16852w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private long f16853x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private qb.u1 f16854y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private boolean f16855z;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Executor f16832c = new qb.z1(new a());

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Object f16838i = new Object();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final c1 f16843n = new c1();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private volatile a0 f16844o = new a0(new ArrayList(8), Collections.EMPTY_LIST, null, null, false, false, false, 0);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final AtomicBoolean f16845p = new AtomicBoolean();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final AtomicInteger f16846q = new AtomicInteger();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final AtomicInteger f16847r = new AtomicInteger();

    class a implements Thread.UncaughtExceptionHandler {
        a() {
        }

        @Override // java.lang.Thread.UncaughtExceptionHandler
        public void uncaughtException(Thread thread, Throwable th2) {
            throw qb.u1.m(th2).s("Uncaught exception in the SynchronizationContext. Re-thrown.").e();
        }
    }

    private static final class a0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final boolean f16857a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final List f16858b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final Collection f16859c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final Collection f16860d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final int f16861e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final c0 f16862f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final boolean f16863g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final boolean f16864h;

        a0(List list, Collection collection, Collection collection2, c0 c0Var, boolean z10, boolean z11, boolean z12, int i10) {
            this.f16858b = list;
            this.f16859c = (Collection) r9.l.o(collection, "drainedSubstreams");
            this.f16862f = c0Var;
            this.f16860d = collection2;
            this.f16863g = z10;
            this.f16857a = z11;
            this.f16864h = z12;
            this.f16861e = i10;
            r9.l.u(!z11 || list == null, "passThrough should imply buffer is null");
            r9.l.u((z11 && c0Var == null) ? false : true, "passThrough should imply winningSubstream != null");
            r9.l.u(!z11 || (collection.size() == 1 && collection.contains(c0Var)) || (collection.size() == 0 && c0Var.f16889b), "passThrough should imply winningSubstream is drained");
            r9.l.u((z10 && c0Var == null) ? false : true, "cancelled should imply committed");
        }

        a0 a(c0 c0Var) {
            Collection collectionUnmodifiableCollection;
            r9.l.u(!this.f16864h, "hedging frozen");
            r9.l.u(this.f16862f == null, "already committed");
            if (this.f16860d == null) {
                collectionUnmodifiableCollection = Collections.singleton(c0Var);
            } else {
                ArrayList arrayList = new ArrayList(this.f16860d);
                arrayList.add(c0Var);
                collectionUnmodifiableCollection = DesugarCollections.unmodifiableCollection(arrayList);
            }
            return new a0(this.f16858b, this.f16859c, collectionUnmodifiableCollection, this.f16862f, this.f16863g, this.f16857a, this.f16864h, this.f16861e + 1);
        }

        a0 b() {
            return new a0(this.f16858b, this.f16859c, this.f16860d, this.f16862f, true, this.f16857a, this.f16864h, this.f16861e);
        }

        a0 c(c0 c0Var) {
            List list;
            Collection collectionSingleton;
            boolean z10;
            r9.l.u(this.f16862f == null, "Already committed");
            List list2 = this.f16858b;
            if (this.f16859c.contains(c0Var)) {
                collectionSingleton = Collections.singleton(c0Var);
                list = null;
                z10 = true;
            } else {
                list = list2;
                collectionSingleton = Collections.EMPTY_LIST;
                z10 = false;
            }
            return new a0(list, collectionSingleton, this.f16860d, c0Var, this.f16863g, z10, this.f16864h, this.f16861e);
        }

        a0 d() {
            return this.f16864h ? this : new a0(this.f16858b, this.f16859c, this.f16860d, this.f16862f, this.f16863g, this.f16857a, true, this.f16861e);
        }

        a0 e(c0 c0Var) {
            ArrayList arrayList = new ArrayList(this.f16860d);
            arrayList.remove(c0Var);
            return new a0(this.f16858b, this.f16859c, DesugarCollections.unmodifiableCollection(arrayList), this.f16862f, this.f16863g, this.f16857a, this.f16864h, this.f16861e);
        }

        a0 f(c0 c0Var, c0 c0Var2) {
            ArrayList arrayList = new ArrayList(this.f16860d);
            arrayList.remove(c0Var);
            arrayList.add(c0Var2);
            return new a0(this.f16858b, this.f16859c, DesugarCollections.unmodifiableCollection(arrayList), this.f16862f, this.f16863g, this.f16857a, this.f16864h, this.f16861e);
        }

        a0 g(c0 c0Var) {
            c0Var.f16889b = true;
            if (!this.f16859c.contains(c0Var)) {
                return this;
            }
            ArrayList arrayList = new ArrayList(this.f16859c);
            arrayList.remove(c0Var);
            return new a0(this.f16858b, DesugarCollections.unmodifiableCollection(arrayList), this.f16860d, this.f16862f, this.f16863g, this.f16857a, this.f16864h, this.f16861e);
        }

        a0 h(c0 c0Var) {
            Collection collectionUnmodifiableCollection;
            r9.l.u(!this.f16857a, "Already passThrough");
            if (c0Var.f16889b) {
                collectionUnmodifiableCollection = this.f16859c;
            } else if (this.f16859c.isEmpty()) {
                collectionUnmodifiableCollection = Collections.singletonList(c0Var);
            } else {
                ArrayList arrayList = new ArrayList(this.f16859c);
                arrayList.add(c0Var);
                collectionUnmodifiableCollection = DesugarCollections.unmodifiableCollection(arrayList);
            }
            Collection collection = collectionUnmodifiableCollection;
            c0 c0Var2 = this.f16862f;
            boolean z10 = c0Var2 != null;
            List list = this.f16858b;
            if (z10) {
                r9.l.u(c0Var2 == c0Var, "Another RPC attempt has already committed");
                list = null;
            }
            return new a0(list, collection, this.f16860d, this.f16862f, this.f16863g, z10, this.f16864h, this.f16861e);
        }
    }

    class b implements r {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f16865a;

        b(String str) {
            this.f16865a = str;
        }

        @Override // io.grpc.internal.m2.r
        public void a(c0 c0Var) {
            c0Var.f16888a.n(this.f16865a);
        }
    }

    private final class b0 implements io.grpc.internal.s {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final c0 f16867a;

        class a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ qb.z0 f16869a;

            a(qb.z0 z0Var) {
                this.f16869a = z0Var;
            }

            @Override // java.lang.Runnable
            public void run() {
                m2.this.f16850u.b(this.f16869a);
            }
        }

        class b implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ u f16871a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ c0 f16872b;

            class a implements Runnable {
                a() {
                }

                @Override // java.lang.Runnable
                public void run() {
                    b bVar = b.this;
                    m2.this.e0(bVar.f16872b);
                }
            }

            b(u uVar, c0 c0Var) {
                this.f16871a = uVar;
                this.f16872b = c0Var;
            }

            @Override // java.lang.Runnable
            public void run() {
                synchronized (this.f16871a.f16926a) {
                    try {
                        if (this.f16871a.a()) {
                            return;
                        }
                        this.f16871a.b();
                        m2.this.f16831b.execute(new a());
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        }

        class c implements Runnable {
            c() {
            }

            @Override // java.lang.Runnable
            public void run() {
                m2.this.f16855z = true;
                m2.this.f16850u.d(m2.this.f16848s.f16937a, m2.this.f16848s.f16938b, m2.this.f16848s.f16939c);
            }
        }

        class d implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ c0 f16876a;

            d(c0 c0Var) {
                this.f16876a = c0Var;
            }

            @Override // java.lang.Runnable
            public void run() {
                m2.this.e0(this.f16876a);
            }
        }

        class e implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ z2.a f16878a;

            e(z2.a aVar) {
                this.f16878a = aVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                m2.this.f16850u.a(this.f16878a);
            }
        }

        class f implements Runnable {
            f() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (m2.this.f16855z) {
                    return;
                }
                m2.this.f16850u.c();
            }
        }

        b0(c0 c0Var) {
            this.f16867a = c0Var;
        }

        private Integer e(qb.z0 z0Var) {
            String str = (String) z0Var.g(m2.B);
            if (str == null) {
                return null;
            }
            try {
                return Integer.valueOf(str);
            } catch (NumberFormatException unused) {
                return -1;
            }
        }

        private v f(qb.u1 u1Var, qb.z0 z0Var) {
            Integer numE = e(z0Var);
            boolean zContains = m2.this.f16836g.f17264c.contains(u1Var.o());
            boolean z10 = (m2.this.f16842m == null || (!zContains && (numE == null || numE.intValue() >= 0))) ? false : !m2.this.f16842m.b();
            if (zContains && !z10 && !u1Var.q() && numE != null && numE.intValue() > 0) {
                numE = 0;
            }
            return new v(zContains && !z10, numE);
        }

        private x g(qb.u1 u1Var, qb.z0 z0Var) {
            long nanos = 0;
            boolean z10 = false;
            if (m2.this.f16835f == null) {
                return new x(false, 0L);
            }
            boolean zContains = m2.this.f16835f.f16980f.contains(u1Var.o());
            Integer numE = e(z0Var);
            boolean z11 = (m2.this.f16842m == null || (!zContains && (numE == null || numE.intValue() >= 0))) ? false : !m2.this.f16842m.b();
            if (m2.this.f16835f.f16975a > this.f16867a.f16891d + 1 && !z11) {
                if (numE == null) {
                    if (zContains) {
                        nanos = m2.h0(m2.this.f16853x);
                        m2.this.f16853x = Math.min((long) (r10.f16853x * m2.this.f16835f.f16978d), m2.this.f16835f.f16977c);
                        z10 = true;
                    }
                } else if (numE.intValue() >= 0) {
                    nanos = TimeUnit.MILLISECONDS.toNanos(numE.intValue());
                    m2 m2Var = m2.this;
                    m2Var.f16853x = m2Var.f16835f.f16976b;
                    z10 = true;
                }
            }
            return new x(z10, nanos);
        }

        @Override // io.grpc.internal.z2
        public void a(z2.a aVar) {
            a0 a0Var = m2.this.f16844o;
            r9.l.u(a0Var.f16862f != null, "Headers should be received prior to messages.");
            if (a0Var.f16862f != this.f16867a) {
                w0.d(aVar);
            } else {
                m2.this.f16832c.execute(new e(aVar));
            }
        }

        @Override // io.grpc.internal.s
        public void b(qb.z0 z0Var) {
            if (this.f16867a.f16891d > 0) {
                z0.h hVar = m2.A;
                z0Var.e(hVar);
                z0Var.o(hVar, String.valueOf(this.f16867a.f16891d));
            }
            m2.this.b0(this.f16867a);
            if (m2.this.f16844o.f16862f == this.f16867a) {
                if (m2.this.f16842m != null) {
                    m2.this.f16842m.c();
                }
                m2.this.f16832c.execute(new a(z0Var));
            }
        }

        @Override // io.grpc.internal.z2
        public void c() {
            if (m2.this.a()) {
                m2.this.f16832c.execute(new f());
            }
        }

        @Override // io.grpc.internal.s
        public void d(qb.u1 u1Var, s.a aVar, qb.z0 z0Var) {
            u uVar;
            synchronized (m2.this.f16838i) {
                m2 m2Var = m2.this;
                m2Var.f16844o = m2Var.f16844o.g(this.f16867a);
                m2.this.f16843n.a(u1Var.o());
            }
            if (m2.this.f16847r.decrementAndGet() == Integer.MIN_VALUE) {
                m2.this.f16832c.execute(new c());
                return;
            }
            c0 c0Var = this.f16867a;
            if (c0Var.f16890c) {
                m2.this.b0(c0Var);
                if (m2.this.f16844o.f16862f == this.f16867a) {
                    m2.this.m0(u1Var, aVar, z0Var);
                    return;
                }
                return;
            }
            s.a aVar2 = s.a.MISCARRIED;
            if (aVar == aVar2 && m2.this.f16846q.incrementAndGet() > 1000) {
                m2.this.b0(this.f16867a);
                if (m2.this.f16844o.f16862f == this.f16867a) {
                    m2.this.m0(w0.q(u1.b.INTERNAL, "Too many transparent retries. Might be a bug in gRPC", u1Var), aVar, z0Var);
                    return;
                }
                return;
            }
            if (m2.this.f16844o.f16862f == null) {
                if (aVar == aVar2 || (aVar == s.a.REFUSED && m2.this.f16845p.compareAndSet(false, true))) {
                    c0 c0VarC0 = m2.this.c0(this.f16867a.f16891d, true, false);
                    if (c0VarC0 == null) {
                        return;
                    }
                    if (m2.this.f16837h) {
                        synchronized (m2.this.f16838i) {
                            m2 m2Var2 = m2.this;
                            m2Var2.f16844o = m2Var2.f16844o.f(this.f16867a, c0VarC0);
                        }
                    }
                    m2.this.f16831b.execute(new d(c0VarC0));
                    return;
                }
                if (aVar != s.a.DROPPED) {
                    m2.this.f16845p.set(true);
                    if (m2.this.f16837h) {
                        v vVarF = f(u1Var, z0Var);
                        if (vVarF.f16929a) {
                            m2.this.l0(vVarF.f16930b);
                        }
                        synchronized (m2.this.f16838i) {
                            try {
                                m2 m2Var3 = m2.this;
                                m2Var3.f16844o = m2Var3.f16844o.e(this.f16867a);
                                if (vVarF.f16929a) {
                                    m2 m2Var4 = m2.this;
                                    if (!m2Var4.g0(m2Var4.f16844o)) {
                                        if (!m2.this.f16844o.f16860d.isEmpty()) {
                                        }
                                    }
                                    return;
                                }
                            } finally {
                            }
                        }
                    } else {
                        x xVarG = g(u1Var, z0Var);
                        if (xVarG.f16935a) {
                            c0 c0VarC02 = m2.this.c0(this.f16867a.f16891d + 1, false, false);
                            if (c0VarC02 == null) {
                                return;
                            }
                            synchronized (m2.this.f16838i) {
                                m2 m2Var5 = m2.this;
                                uVar = new u(m2Var5.f16838i);
                                m2Var5.f16851v = uVar;
                            }
                            uVar.c(m2.this.f16833d.schedule(new b(uVar, c0VarC02), xVarG.f16936b, TimeUnit.NANOSECONDS));
                            return;
                        }
                    }
                } else if (m2.this.f16837h) {
                    m2.this.f0();
                }
            }
            m2.this.b0(this.f16867a);
            if (m2.this.f16844o.f16862f == this.f16867a) {
                m2.this.m0(u1Var, aVar, z0Var);
            }
        }
    }

    class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Collection f16881a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ c0 f16882b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Future f16883c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f16884d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ Future f16885e;

        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                m2.this.f16855z = true;
                m2.this.f16850u.d(m2.this.f16848s.f16937a, m2.this.f16848s.f16938b, m2.this.f16848s.f16939c);
            }
        }

        c(Collection collection, c0 c0Var, Future future, boolean z10, Future future2) {
            this.f16881a = collection;
            this.f16882b = c0Var;
            this.f16883c = future;
            this.f16884d = z10;
            this.f16885e = future2;
        }

        @Override // java.lang.Runnable
        public void run() {
            for (c0 c0Var : this.f16881a) {
                if (c0Var != this.f16882b) {
                    c0Var.f16888a.b(m2.C);
                }
            }
            Future future = this.f16883c;
            if (future != null) {
                future.cancel(false);
                if (!this.f16884d && m2.this.f16847r.decrementAndGet() == Integer.MIN_VALUE) {
                    m2.this.f16832c.execute(new a());
                }
            }
            Future future2 = this.f16885e;
            if (future2 != null) {
                future2.cancel(false);
            }
            m2.this.j0();
        }
    }

    private static final class c0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        io.grpc.internal.r f16888a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        boolean f16889b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        boolean f16890c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final int f16891d;

        c0(int i10) {
            this.f16891d = i10;
        }
    }

    class d implements r {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ qb.n f16892a;

        d(qb.n nVar) {
            this.f16892a = nVar;
        }

        @Override // io.grpc.internal.m2.r
        public void a(c0 c0Var) {
            c0Var.f16888a.c(this.f16892a);
        }
    }

    static final class d0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final int f16894a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final int f16895b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final int f16896c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final AtomicInteger f16897d;

        d0(float f10, float f11) {
            AtomicInteger atomicInteger = new AtomicInteger();
            this.f16897d = atomicInteger;
            this.f16896c = (int) (f11 * 1000.0f);
            int i10 = (int) (f10 * 1000.0f);
            this.f16894a = i10;
            this.f16895b = i10 / 2;
            atomicInteger.set(i10);
        }

        boolean a() {
            return this.f16897d.get() > this.f16895b;
        }

        boolean b() {
            int i10;
            int i11;
            do {
                i10 = this.f16897d.get();
                if (i10 == 0) {
                    return false;
                }
                i11 = i10 - 1000;
            } while (!this.f16897d.compareAndSet(i10, Math.max(i11, 0)));
            return i11 > this.f16895b;
        }

        void c() {
            int i10;
            int i11;
            do {
                i10 = this.f16897d.get();
                i11 = this.f16894a;
                if (i10 == i11) {
                    return;
                }
            } while (!this.f16897d.compareAndSet(i10, Math.min(this.f16896c + i10, i11)));
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d0)) {
                return false;
            }
            d0 d0Var = (d0) obj;
            return this.f16894a == d0Var.f16894a && this.f16896c == d0Var.f16896c;
        }

        public int hashCode() {
            return r9.h.b(Integer.valueOf(this.f16894a), Integer.valueOf(this.f16896c));
        }
    }

    class e implements r {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ qb.u f16898a;

        e(qb.u uVar) {
            this.f16898a = uVar;
        }

        @Override // io.grpc.internal.m2.r
        public void a(c0 c0Var) {
            c0Var.f16888a.m(this.f16898a);
        }
    }

    class f implements r {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ qb.w f16900a;

        f(qb.w wVar) {
            this.f16900a = wVar;
        }

        @Override // io.grpc.internal.m2.r
        public void a(c0 c0Var) {
            c0Var.f16888a.q(this.f16900a);
        }
    }

    class g implements r {
        g() {
        }

        @Override // io.grpc.internal.m2.r
        public void a(c0 c0Var) {
            c0Var.f16888a.flush();
        }
    }

    class h implements r {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f16903a;

        h(boolean z10) {
            this.f16903a = z10;
        }

        @Override // io.grpc.internal.m2.r
        public void a(c0 c0Var) {
            c0Var.f16888a.s(this.f16903a);
        }
    }

    class i implements r {
        i() {
        }

        @Override // io.grpc.internal.m2.r
        public void a(c0 c0Var) {
            c0Var.f16888a.p();
        }
    }

    class j implements r {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f16906a;

        j(int i10) {
            this.f16906a = i10;
        }

        @Override // io.grpc.internal.m2.r
        public void a(c0 c0Var) {
            c0Var.f16888a.k(this.f16906a);
        }
    }

    class k implements r {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f16908a;

        k(int i10) {
            this.f16908a = i10;
        }

        @Override // io.grpc.internal.m2.r
        public void a(c0 c0Var) {
            c0Var.f16888a.l(this.f16908a);
        }
    }

    class l implements r {
        l() {
        }

        @Override // io.grpc.internal.m2.r
        public void a(c0 c0Var) {
            c0Var.f16888a.f();
        }
    }

    class m implements r {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f16911a;

        m(int i10) {
            this.f16911a = i10;
        }

        @Override // io.grpc.internal.m2.r
        public void a(c0 c0Var) {
            c0Var.f16888a.e(this.f16911a);
        }
    }

    class n implements r {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f16913a;

        n(Object obj) {
            this.f16913a = obj;
        }

        @Override // io.grpc.internal.m2.r
        public void a(c0 c0Var) {
            c0Var.f16888a.d(m2.this.f16830a.j(this.f16913a));
            c0Var.f16888a.flush();
        }
    }

    class o extends k.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ qb.k f16915a;

        o(qb.k kVar) {
            this.f16915a = kVar;
        }

        @Override // qb.k.a
        public qb.k a(k.b bVar, qb.z0 z0Var) {
            return this.f16915a;
        }
    }

    class p implements Runnable {
        p() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (m2.this.f16855z) {
                return;
            }
            m2.this.f16850u.c();
        }
    }

    class q implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ qb.u1 f16918a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ s.a f16919b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ qb.z0 f16920c;

        q(qb.u1 u1Var, s.a aVar, qb.z0 z0Var) {
            this.f16918a = u1Var;
            this.f16919b = aVar;
            this.f16920c = z0Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            m2.this.f16855z = true;
            m2.this.f16850u.d(this.f16918a, this.f16919b, this.f16920c);
        }
    }

    private interface r {
        void a(c0 c0Var);
    }

    class s extends qb.k {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final c0 f16922b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        long f16923c;

        s(c0 c0Var) {
            this.f16922b = c0Var;
        }

        @Override // qb.y1
        public void h(long j10) {
            if (m2.this.f16844o.f16862f != null) {
                return;
            }
            synchronized (m2.this.f16838i) {
                try {
                    if (m2.this.f16844o.f16862f == null && !this.f16922b.f16889b) {
                        long j11 = this.f16923c + j10;
                        this.f16923c = j11;
                        if (j11 <= m2.this.f16849t) {
                            return;
                        }
                        if (this.f16923c > m2.this.f16840k) {
                            this.f16922b.f16890c = true;
                        } else {
                            long jA = m2.this.f16839j.a(this.f16923c - m2.this.f16849t);
                            m2.this.f16849t = this.f16923c;
                            if (jA > m2.this.f16841l) {
                                this.f16922b.f16890c = true;
                            }
                        }
                        c0 c0Var = this.f16922b;
                        Runnable runnableA0 = c0Var.f16890c ? m2.this.a0(c0Var) : null;
                        if (runnableA0 != null) {
                            runnableA0.run();
                        }
                    }
                } finally {
                }
            }
        }
    }

    static final class t {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final AtomicLong f16925a = new AtomicLong();

        t() {
        }

        long a(long j10) {
            return this.f16925a.addAndGet(j10);
        }
    }

    private static final class u {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Object f16926a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Future f16927b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        boolean f16928c;

        u(Object obj) {
            this.f16926a = obj;
        }

        boolean a() {
            return this.f16928c;
        }

        Future b() {
            this.f16928c = true;
            return this.f16927b;
        }

        void c(Future future) {
            boolean z10;
            synchronized (this.f16926a) {
                try {
                    z10 = this.f16928c;
                    if (!z10) {
                        this.f16927b = future;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (z10) {
                future.cancel(false);
            }
        }
    }

    private static final class v {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final boolean f16929a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Integer f16930b;

        public v(boolean z10, Integer num) {
            this.f16929a = z10;
            this.f16930b = num;
        }
    }

    private final class w implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final u f16931a;

        class a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ c0 f16933a;

            a(c0 c0Var) {
                this.f16933a = c0Var;
            }

            @Override // java.lang.Runnable
            public void run() {
                u uVar;
                boolean z10;
                synchronized (m2.this.f16838i) {
                    try {
                        uVar = null;
                        if (w.this.f16931a.a()) {
                            z10 = true;
                        } else {
                            m2 m2Var = m2.this;
                            m2Var.f16844o = m2Var.f16844o.a(this.f16933a);
                            m2 m2Var2 = m2.this;
                            if (m2Var2.g0(m2Var2.f16844o) && (m2.this.f16842m == null || m2.this.f16842m.a())) {
                                m2 m2Var3 = m2.this;
                                uVar = new u(m2Var3.f16838i);
                                m2Var3.f16852w = uVar;
                            } else {
                                m2 m2Var4 = m2.this;
                                m2Var4.f16844o = m2Var4.f16844o.d();
                                m2.this.f16852w = null;
                            }
                            z10 = false;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                if (z10) {
                    this.f16933a.f16888a.r(m2.this.new b0(this.f16933a));
                    this.f16933a.f16888a.b(qb.u1.f24770f.s("Unneeded hedging"));
                } else {
                    if (uVar != null) {
                        uVar.c(m2.this.f16833d.schedule(m2.this.new w(uVar), m2.this.f16836g.f17263b, TimeUnit.NANOSECONDS));
                    }
                    m2.this.e0(this.f16933a);
                }
            }
        }

        w(u uVar) {
            this.f16931a = uVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            m2 m2Var = m2.this;
            c0 c0VarC0 = m2Var.c0(m2Var.f16844o.f16861e, false, true);
            if (c0VarC0 == null) {
                return;
            }
            m2.this.f16831b.execute(new a(c0VarC0));
        }
    }

    private static final class x {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final boolean f16935a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final long f16936b;

        x(boolean z10, long j10) {
            this.f16935a = z10;
            this.f16936b = j10;
        }
    }

    private static final class y {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final qb.u1 f16937a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final s.a f16938b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final qb.z0 f16939c;

        y(qb.u1 u1Var, s.a aVar, qb.z0 z0Var) {
            this.f16937a = u1Var;
            this.f16938b = aVar;
            this.f16939c = z0Var;
        }
    }

    class z implements r {
        z() {
        }

        @Override // io.grpc.internal.m2.r
        public void a(c0 c0Var) {
            c0Var.f16888a.r(m2.this.new b0(c0Var));
        }
    }

    static {
        z0.d dVar = qb.z0.f24834e;
        A = z0.h.e("grpc-previous-rpc-attempts", dVar);
        B = z0.h.e("grpc-retry-pushback-ms", dVar);
        C = qb.u1.f24770f.s("Stream thrown away because RetriableStream committed");
        D = new Random();
        E = w0.g("GRPC_EXPERIMENTAL_XDS_RLS_LB", true);
    }

    m2(qb.a1 a1Var, qb.z0 z0Var, t tVar, long j10, long j11, Executor executor, ScheduledExecutorService scheduledExecutorService, n2 n2Var, y0 y0Var, d0 d0Var) {
        this.f16830a = a1Var;
        this.f16839j = tVar;
        this.f16840k = j10;
        this.f16841l = j11;
        this.f16831b = executor;
        this.f16833d = scheduledExecutorService;
        this.f16834e = z0Var;
        this.f16835f = n2Var;
        if (n2Var != null) {
            this.f16853x = n2Var.f16976b;
        }
        this.f16836g = y0Var;
        r9.l.e(n2Var == null || y0Var == null, "Should not provide both retryPolicy and hedgingPolicy");
        this.f16837h = y0Var != null;
        this.f16842m = d0Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Runnable a0(c0 c0Var) {
        Future future;
        Future future2;
        synchronized (this.f16838i) {
            try {
                if (this.f16844o.f16862f != null) {
                    return null;
                }
                Collection collection = this.f16844o.f16859c;
                this.f16844o = this.f16844o.c(c0Var);
                this.f16839j.a(-this.f16849t);
                u uVar = this.f16851v;
                boolean zA = uVar != null ? uVar.a() : false;
                u uVar2 = this.f16851v;
                if (uVar2 != null) {
                    Future futureB = uVar2.b();
                    this.f16851v = null;
                    future = futureB;
                } else {
                    future = null;
                }
                u uVar3 = this.f16852w;
                if (uVar3 != null) {
                    Future futureB2 = uVar3.b();
                    this.f16852w = null;
                    future2 = futureB2;
                } else {
                    future2 = null;
                }
                return new c(collection, c0Var, future, zA, future2);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b0(c0 c0Var) {
        Runnable runnableA0 = a0(c0Var);
        if (runnableA0 != null) {
            this.f16831b.execute(runnableA0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public c0 c0(int i10, boolean z10, boolean z11) {
        int i11;
        do {
            i11 = this.f16847r.get();
            if (i11 < 0) {
                return null;
            }
        } while (!this.f16847r.compareAndSet(i11, i11 + 1));
        c0 c0Var = new c0(i10);
        c0Var.f16888a = i0(o0(this.f16834e, i10), new o(new s(c0Var)), i10, z10, z11);
        return c0Var;
    }

    private void d0(r rVar) {
        Collection collection;
        synchronized (this.f16838i) {
            try {
                if (!this.f16844o.f16857a) {
                    this.f16844o.f16858b.add(rVar);
                }
                collection = this.f16844o.f16859c;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            rVar.a((c0) it.next());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0036, code lost:
    
        if (r1 == null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0038, code lost:
    
        r8.f16832c.execute(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x003d, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x003e, code lost:
    
        if (r2 != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0040, code lost:
    
        r9.f16888a.r(new io.grpc.internal.m2.b0(r8, r9));
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x004a, code lost:
    
        r0 = r9.f16888a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0050, code lost:
    
        if (r8.f16844o.f16862f != r9) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0052, code lost:
    
        r9 = r8.f16854y;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0055, code lost:
    
        r9 = io.grpc.internal.m2.C;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0057, code lost:
    
        r0.b(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x005a, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0088, code lost:
    
        r0 = r3.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0090, code lost:
    
        if (r0.hasNext() == false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0092, code lost:
    
        r4 = (io.grpc.internal.m2.r) r0.next();
        r4.a(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x009d, code lost:
    
        if ((r4 instanceof io.grpc.internal.m2.z) == false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x009f, code lost:
    
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00a0, code lost:
    
        r4 = r8.f16844o;
        r5 = r4.f16862f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00a4, code lost:
    
        if (r5 == null) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00a6, code lost:
    
        if (r5 == r9) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00ab, code lost:
    
        if (r4.f16863g == false) goto L67;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void e0(io.grpc.internal.m2.c0 r9) {
        /*
            r8 = this;
            r0 = 0
            r1 = 0
            r3 = r1
            r2 = 0
        L4:
            java.lang.Object r4 = r8.f16838i
            monitor-enter(r4)
            io.grpc.internal.m2$a0 r5 = r8.f16844o     // Catch: java.lang.Throwable -> L11
            io.grpc.internal.m2$c0 r6 = r5.f16862f     // Catch: java.lang.Throwable -> L11
            if (r6 == 0) goto L14
            if (r6 == r9) goto L14
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L11
            goto L36
        L11:
            r9 = move-exception
            goto Lb0
        L14:
            boolean r6 = r5.f16863g     // Catch: java.lang.Throwable -> L11
            if (r6 == 0) goto L1a
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L11
            goto L36
        L1a:
            java.util.List r6 = r5.f16858b     // Catch: java.lang.Throwable -> L11
            int r6 = r6.size()     // Catch: java.lang.Throwable -> L11
            if (r0 != r6) goto L5b
            io.grpc.internal.m2$a0 r0 = r5.h(r9)     // Catch: java.lang.Throwable -> L11
            r8.f16844o = r0     // Catch: java.lang.Throwable -> L11
            boolean r0 = r8.a()     // Catch: java.lang.Throwable -> L11
            if (r0 != 0) goto L30
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L11
            return
        L30:
            io.grpc.internal.m2$p r1 = new io.grpc.internal.m2$p     // Catch: java.lang.Throwable -> L11
            r1.<init>()     // Catch: java.lang.Throwable -> L11
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L11
        L36:
            if (r1 == 0) goto L3e
            java.util.concurrent.Executor r9 = r8.f16832c
            r9.execute(r1)
            return
        L3e:
            if (r2 != 0) goto L4a
            io.grpc.internal.r r0 = r9.f16888a
            io.grpc.internal.m2$b0 r1 = new io.grpc.internal.m2$b0
            r1.<init>(r9)
            r0.r(r1)
        L4a:
            io.grpc.internal.r r0 = r9.f16888a
            io.grpc.internal.m2$a0 r1 = r8.f16844o
            io.grpc.internal.m2$c0 r1 = r1.f16862f
            if (r1 != r9) goto L55
            qb.u1 r9 = r8.f16854y
            goto L57
        L55:
            qb.u1 r9 = io.grpc.internal.m2.C
        L57:
            r0.b(r9)
            return
        L5b:
            boolean r6 = r9.f16889b     // Catch: java.lang.Throwable -> L11
            if (r6 == 0) goto L61
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L11
            return
        L61:
            int r6 = r0 + 128
            java.util.List r7 = r5.f16858b     // Catch: java.lang.Throwable -> L11
            int r7 = r7.size()     // Catch: java.lang.Throwable -> L11
            int r6 = java.lang.Math.min(r6, r7)     // Catch: java.lang.Throwable -> L11
            if (r3 != 0) goto L7b
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L11
            java.util.List r5 = r5.f16858b     // Catch: java.lang.Throwable -> L11
            java.util.List r0 = r5.subList(r0, r6)     // Catch: java.lang.Throwable -> L11
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L11
            goto L87
        L7b:
            r3.clear()     // Catch: java.lang.Throwable -> L11
            java.util.List r5 = r5.f16858b     // Catch: java.lang.Throwable -> L11
            java.util.List r0 = r5.subList(r0, r6)     // Catch: java.lang.Throwable -> L11
            r3.addAll(r0)     // Catch: java.lang.Throwable -> L11
        L87:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L11
            java.util.Iterator r0 = r3.iterator()
        L8c:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto Lad
            java.lang.Object r4 = r0.next()
            io.grpc.internal.m2$r r4 = (io.grpc.internal.m2.r) r4
            r4.a(r9)
            boolean r4 = r4 instanceof io.grpc.internal.m2.z
            if (r4 == 0) goto La0
            r2 = 1
        La0:
            io.grpc.internal.m2$a0 r4 = r8.f16844o
            io.grpc.internal.m2$c0 r5 = r4.f16862f
            if (r5 == 0) goto La9
            if (r5 == r9) goto La9
            goto Lad
        La9:
            boolean r4 = r4.f16863g
            if (r4 == 0) goto L8c
        Lad:
            r0 = r6
            goto L4
        Lb0:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L11
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: io.grpc.internal.m2.e0(io.grpc.internal.m2$c0):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f0() {
        Future future;
        synchronized (this.f16838i) {
            try {
                u uVar = this.f16852w;
                future = null;
                if (uVar != null) {
                    Future futureB = uVar.b();
                    this.f16852w = null;
                    future = futureB;
                }
                this.f16844o = this.f16844o.d();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (future != null) {
            future.cancel(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean g0(a0 a0Var) {
        return a0Var.f16862f == null && a0Var.f16861e < this.f16836g.f17262a && !a0Var.f16864h;
    }

    public static long h0(long j10) {
        return (long) (j10 * (E ? (D.nextDouble() * 0.8d) + 0.4d : D.nextDouble()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l0(Integer num) {
        if (num == null) {
            return;
        }
        if (num.intValue() < 0) {
            f0();
            return;
        }
        synchronized (this.f16838i) {
            try {
                u uVar = this.f16852w;
                if (uVar == null) {
                    return;
                }
                Future futureB = uVar.b();
                u uVar2 = new u(this.f16838i);
                this.f16852w = uVar2;
                if (futureB != null) {
                    futureB.cancel(false);
                }
                uVar2.c(this.f16833d.schedule(new w(uVar2), num.intValue(), TimeUnit.MILLISECONDS));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m0(qb.u1 u1Var, s.a aVar, qb.z0 z0Var) {
        this.f16848s = new y(u1Var, aVar, z0Var);
        if (this.f16847r.addAndGet(RtlSpacingHelper.UNDEFINED) == Integer.MIN_VALUE) {
            this.f16832c.execute(new q(u1Var, aVar, z0Var));
        }
    }

    @Override // io.grpc.internal.y2
    public final boolean a() {
        Iterator it = this.f16844o.f16859c.iterator();
        while (it.hasNext()) {
            if (((c0) it.next()).f16888a.a()) {
                return true;
            }
        }
        return false;
    }

    @Override // io.grpc.internal.r
    public final void b(qb.u1 u1Var) {
        c0 c0Var;
        c0 c0Var2 = new c0(0);
        c0Var2.f16888a = new v1();
        Runnable runnableA0 = a0(c0Var2);
        if (runnableA0 != null) {
            synchronized (this.f16838i) {
                this.f16844o = this.f16844o.h(c0Var2);
            }
            runnableA0.run();
            m0(u1Var, s.a.PROCESSED, new qb.z0());
            return;
        }
        synchronized (this.f16838i) {
            try {
                if (this.f16844o.f16859c.contains(this.f16844o.f16862f)) {
                    c0Var = this.f16844o.f16862f;
                } else {
                    this.f16854y = u1Var;
                    c0Var = null;
                }
                this.f16844o = this.f16844o.b();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (c0Var != null) {
            c0Var.f16888a.b(u1Var);
        }
    }

    @Override // io.grpc.internal.y2
    public final void c(qb.n nVar) {
        d0(new d(nVar));
    }

    @Override // io.grpc.internal.y2
    public final void d(InputStream inputStream) {
        throw new IllegalStateException("RetriableStream.writeMessage() should not be called directly");
    }

    @Override // io.grpc.internal.y2
    public final void e(int i10) {
        a0 a0Var = this.f16844o;
        if (a0Var.f16857a) {
            a0Var.f16862f.f16888a.e(i10);
        } else {
            d0(new m(i10));
        }
    }

    @Override // io.grpc.internal.y2
    public void f() {
        d0(new l());
    }

    @Override // io.grpc.internal.y2
    public final void flush() {
        a0 a0Var = this.f16844o;
        if (a0Var.f16857a) {
            a0Var.f16862f.f16888a.flush();
        } else {
            d0(new g());
        }
    }

    abstract io.grpc.internal.r i0(qb.z0 z0Var, k.a aVar, int i10, boolean z10, boolean z11);

    abstract void j0();

    @Override // io.grpc.internal.r
    public final void k(int i10) {
        d0(new j(i10));
    }

    abstract qb.u1 k0();

    @Override // io.grpc.internal.r
    public final void l(int i10) {
        d0(new k(i10));
    }

    @Override // io.grpc.internal.r
    public final void m(qb.u uVar) {
        d0(new e(uVar));
    }

    @Override // io.grpc.internal.r
    public final void n(String str) {
        d0(new b(str));
    }

    final void n0(Object obj) {
        a0 a0Var = this.f16844o;
        if (a0Var.f16857a) {
            a0Var.f16862f.f16888a.d(this.f16830a.j(obj));
        } else {
            d0(new n(obj));
        }
    }

    @Override // io.grpc.internal.r
    public void o(c1 c1Var) {
        a0 a0Var;
        synchronized (this.f16838i) {
            c1Var.b("closed", this.f16843n);
            a0Var = this.f16844o;
        }
        if (a0Var.f16862f != null) {
            c1 c1Var2 = new c1();
            a0Var.f16862f.f16888a.o(c1Var2);
            c1Var.b("committed", c1Var2);
            return;
        }
        c1 c1Var3 = new c1();
        for (c0 c0Var : a0Var.f16859c) {
            c1 c1Var4 = new c1();
            c0Var.f16888a.o(c1Var4);
            c1Var3.a(c1Var4);
        }
        c1Var.b("open", c1Var3);
    }

    final qb.z0 o0(qb.z0 z0Var, int i10) {
        qb.z0 z0Var2 = new qb.z0();
        z0Var2.l(z0Var);
        if (i10 > 0) {
            z0Var2.o(A, String.valueOf(i10));
        }
        return z0Var2;
    }

    @Override // io.grpc.internal.r
    public final void p() {
        d0(new i());
    }

    @Override // io.grpc.internal.r
    public final void q(qb.w wVar) {
        d0(new f(wVar));
    }

    @Override // io.grpc.internal.r
    public final void r(io.grpc.internal.s sVar) {
        u uVar;
        d0 d0Var;
        this.f16850u = sVar;
        qb.u1 u1VarK0 = k0();
        if (u1VarK0 != null) {
            b(u1VarK0);
            return;
        }
        synchronized (this.f16838i) {
            this.f16844o.f16858b.add(new z());
        }
        c0 c0VarC0 = c0(0, false, false);
        if (c0VarC0 == null) {
            return;
        }
        if (this.f16837h) {
            synchronized (this.f16838i) {
                try {
                    this.f16844o = this.f16844o.a(c0VarC0);
                    if (g0(this.f16844o) && ((d0Var = this.f16842m) == null || d0Var.a())) {
                        uVar = new u(this.f16838i);
                        this.f16852w = uVar;
                    } else {
                        uVar = null;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (uVar != null) {
                uVar.c(this.f16833d.schedule(new w(uVar), this.f16836g.f17263b, TimeUnit.NANOSECONDS));
            }
        }
        e0(c0VarC0);
    }

    @Override // io.grpc.internal.r
    public final void s(boolean z10) {
        d0(new h(z10));
    }
}
