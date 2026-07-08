package io.grpc.internal;

import io.grpc.internal.e1;
import io.grpc.internal.i;
import io.grpc.internal.j;
import io.grpc.internal.m2;
import io.grpc.internal.n;
import io.grpc.internal.p1;
import io.grpc.internal.q;
import io.grpc.internal.q1;
import j$.util.DesugarCollections;
import java.lang.Thread;
import java.net.URI;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;
import java.util.logging.Logger;
import qb.a;
import qb.e0;
import qb.f;
import qb.f0;
import qb.g;
import qb.g1;
import qb.k;
import qb.q0;
import qb.u;
import qb.z1;

/* JADX INFO: loaded from: classes3.dex */
final class m1 extends qb.v0 implements qb.i0 {

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    static final Logger f16704o0 = Logger.getLogger(m1.class.getName());

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    static final qb.u1 f16705p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    static final qb.u1 f16706q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    static final qb.u1 f16707r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    private static final p1 f16708s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    private static final qb.f0 f16709t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    private static final q0.f f16710u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    private static final qb.g f16711v0;
    private final j.a A;
    private final qb.d B;
    private final List C;
    private final String D;
    private qb.g1 E;
    private boolean F;
    private s G;
    private boolean H;
    private final Set I;
    private Collection J;
    private final Object K;
    private final Set L;
    private final c0 M;
    private final y N;
    private final AtomicBoolean O;
    private boolean P;
    private boolean Q;
    private volatile boolean R;
    private final CountDownLatch S;
    private final n.b T;
    private final io.grpc.internal.n U;
    private final io.grpc.internal.p V;
    private final qb.f W;
    private final qb.d0 X;
    private final u Y;
    private v Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final qb.j0 f16712a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private p1 f16713a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f16714b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private final p1 f16715b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f16716c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private boolean f16717c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final qb.i1 f16718d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private final boolean f16719d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final URI f16720e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private final m2.t f16721e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final qb.h1 f16722f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    private final long f16723f0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final g1.a f16724g;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    private final long f16725g0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final io.grpc.internal.i f16726h;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    private final boolean f16727h0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final io.grpc.internal.u f16728i;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    private final u.c f16729i0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final io.grpc.internal.u f16730j;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    private final q1.a f16731j0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final io.grpc.internal.u f16732k;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    final b1 f16733k0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final w f16734l;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    private final m f16735l0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Executor f16736m;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    private final l2 f16737m0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final x1 f16738n;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    private final qb.e1 f16739n0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final x1 f16740o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final p f16741p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final p f16742q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final b3 f16743r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final int f16744s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    final qb.z1 f16745t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f16746u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final qb.w f16747v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final qb.o f16748w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final r9.q f16749x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final long f16750y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final io.grpc.internal.y f16751z;

    class a extends qb.f0 {
        a() {
        }

        @Override // qb.f0
        public f0.b a(q0.h hVar) {
            throw new IllegalStateException("Resolution is pending");
        }
    }

    final class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            m1.this.A0(true);
        }
    }

    final class c implements n.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ b3 f16753a;

        c(b3 b3Var) {
            this.f16753a = b3Var;
        }

        @Override // io.grpc.internal.n.b
        public io.grpc.internal.n create() {
            return new io.grpc.internal.n(this.f16753a);
        }
    }

    final class d implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Runnable f16755a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ qb.q f16756b;

        d(Runnable runnable, qb.q qVar) {
            this.f16755a = runnable;
            this.f16756b = qVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            m1.this.f16751z.c(this.f16755a, m1.this.f16736m, this.f16756b);
        }
    }

    final class e implements Runnable {
        e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            m1.this.C0();
            if (m1.this.G != null) {
                m1.this.G.f16781a.c();
            }
        }
    }

    final class f implements Runnable {
        f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (m1.this.O.get()) {
                return;
            }
            if (m1.this.F) {
                m1.this.I0();
            }
            Iterator it = m1.this.I.iterator();
            while (it.hasNext()) {
                ((e1) it.next()).V();
            }
            Iterator it2 = m1.this.L.iterator();
            if (it2.hasNext()) {
                android.support.v4.media.session.b.a(it2.next());
                throw null;
            }
        }
    }

    final class g implements Runnable {
        g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            m1.this.W.a(f.a.INFO, "Entering SHUTDOWN state");
            m1.this.f16751z.b(qb.q.SHUTDOWN);
        }
    }

    final class h implements Runnable {
        h() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (m1.this.P) {
                return;
            }
            m1.this.P = true;
            m1.this.F0();
        }
    }

    class i implements q0.f {
        i() {
        }
    }

    class j implements Thread.UncaughtExceptionHandler {
        j() {
        }

        @Override // java.lang.Thread.UncaughtExceptionHandler
        public void uncaughtException(Thread thread, Throwable th2) {
            m1.f16704o0.log(Level.SEVERE, "[" + m1.this.e() + "] Uncaught exception in the SynchronizationContext. Panic!", th2);
            try {
                m1.this.H0(th2);
            } catch (Throwable th3) {
                m1.f16704o0.log(Level.SEVERE, "[" + m1.this.e() + "] Uncaught exception while panicking", th3);
            }
        }
    }

    class k extends s0 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f16763c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(qb.g1 g1Var, String str) {
            super(g1Var);
            this.f16763c = str;
        }

        @Override // io.grpc.internal.s0, qb.g1
        public String c() {
            return this.f16763c;
        }
    }

    private final class m implements q.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        volatile m2.d0 f16764a;

        final class a extends m2 {
            final /* synthetic */ qb.a1 F;
            final /* synthetic */ qb.z0 G;
            final /* synthetic */ qb.c H;
            final /* synthetic */ n2 I;
            final /* synthetic */ y0 J;
            final /* synthetic */ qb.s K;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(qb.a1 a1Var, qb.z0 z0Var, qb.c cVar, n2 n2Var, y0 y0Var, qb.s sVar) {
                super(a1Var, z0Var, m1.this.f16721e0, m1.this.f16723f0, m1.this.f16725g0, m1.this.D0(cVar), m1.this.f16730j.e0(), n2Var, y0Var, m.this.f16764a);
                this.F = a1Var;
                this.G = z0Var;
                this.H = cVar;
                this.I = n2Var;
                this.J = y0Var;
                this.K = sVar;
            }

            @Override // io.grpc.internal.m2
            io.grpc.internal.r i0(qb.z0 z0Var, k.a aVar, int i10, boolean z10, boolean z11) {
                qb.c cVarW = this.H.w(aVar);
                qb.k[] kVarArrF = w0.f(cVarW, z0Var, i10, z10, z11);
                qb.s sVarB = this.K.b();
                try {
                    return m1.this.M.g(this.F, z0Var, cVarW, kVarArrF);
                } finally {
                    this.K.f(sVarB);
                }
            }

            @Override // io.grpc.internal.m2
            void j0() {
                m1.this.N.d(this);
            }

            @Override // io.grpc.internal.m2
            qb.u1 k0() {
                return m1.this.N.a(this);
            }
        }

        private m() {
        }

        @Override // io.grpc.internal.q.e
        public io.grpc.internal.r a(qb.a1 a1Var, qb.c cVar, qb.z0 z0Var, qb.s sVar) {
            if (m1.this.f16727h0) {
                p1.b bVar = (p1.b) cVar.i(p1.b.f17010g);
                return new a(a1Var, z0Var, cVar, bVar == null ? null : bVar.f17015e, bVar != null ? bVar.f17016f : null, sVar);
            }
            qb.k[] kVarArrF = w0.f(cVar, z0Var, 0, false, false);
            qb.s sVarB = sVar.b();
            try {
                return m1.this.M.g(a1Var, z0Var, cVar, kVarArrF);
            } finally {
                sVar.f(sVarB);
            }
        }

        /* synthetic */ m(m1 m1Var, a aVar) {
            this();
        }
    }

    static final class n extends qb.a0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final qb.f0 f16766a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final qb.d f16767b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Executor f16768c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final qb.a1 f16769d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final qb.s f16770e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private qb.c f16771f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private qb.g f16772g;

        class a extends z {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ g.a f16773b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ qb.u1 f16774c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(g.a aVar, qb.u1 u1Var) {
                super(n.this.f16770e);
                this.f16773b = aVar;
                this.f16774c = u1Var;
            }

            @Override // io.grpc.internal.z
            public void a() {
                this.f16773b.a(this.f16774c, new qb.z0());
            }
        }

        n(qb.f0 f0Var, qb.d dVar, Executor executor, qb.a1 a1Var, qb.c cVar) {
            this.f16766a = f0Var;
            this.f16767b = dVar;
            this.f16769d = a1Var;
            executor = cVar.e() != null ? cVar.e() : executor;
            this.f16768c = executor;
            this.f16771f = cVar.r(executor);
            this.f16770e = qb.s.e();
        }

        private void h(g.a aVar, qb.u1 u1Var) {
            this.f16768c.execute(new a(aVar, u1Var));
        }

        @Override // qb.g
        public void a(String str, Throwable th2) {
            qb.g gVar = this.f16772g;
            if (gVar != null) {
                gVar.a(str, th2);
            }
        }

        @Override // qb.g
        public void e(g.a aVar, qb.z0 z0Var) {
            f0.b bVarA = this.f16766a.a(new f2(this.f16769d, z0Var, this.f16771f, m1.f16710u0));
            qb.u1 u1VarC = bVarA.c();
            if (!u1VarC.q()) {
                h(aVar, w0.n(u1VarC));
                this.f16772g = m1.f16711v0;
                return;
            }
            bVarA.b();
            p1.b bVarF = ((p1) bVarA.a()).f(this.f16769d);
            if (bVarF != null) {
                this.f16771f = this.f16771f.v(p1.b.f17010g, bVarF);
            }
            qb.g gVarD = this.f16767b.d(this.f16769d, this.f16771f);
            this.f16772g = gVarD;
            gVarD.e(aVar, z0Var);
        }

        @Override // qb.a0, qb.j1
        protected qb.g f() {
            return this.f16772g;
        }
    }

    private final class o implements q1.a {
        private o() {
        }

        @Override // io.grpc.internal.q1.a
        public void a() {
        }

        @Override // io.grpc.internal.q1.a
        public void b() {
            r9.l.u(m1.this.O.get(), "Channel must have been shut down");
            m1.this.Q = true;
            m1.this.L0(false);
            m1.this.F0();
            m1.this.G0();
        }

        @Override // io.grpc.internal.q1.a
        public void c(qb.u1 u1Var) {
            r9.l.u(m1.this.O.get(), "Channel must have been shut down");
        }

        @Override // io.grpc.internal.q1.a
        public void d(boolean z10) {
            m1 m1Var = m1.this;
            m1Var.f16733k0.e(m1Var.M, z10);
            if (z10) {
                m1.this.C0();
            }
        }

        /* synthetic */ o(m1 m1Var, a aVar) {
            this();
        }

        @Override // io.grpc.internal.q1.a
        public qb.a e(qb.a aVar) {
            return aVar;
        }
    }

    static final class p implements Executor {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final x1 f16777a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Executor f16778b;

        p(x1 x1Var) {
            this.f16777a = (x1) r9.l.o(x1Var, "executorPool");
        }

        synchronized Executor a() {
            try {
                if (this.f16778b == null) {
                    this.f16778b = (Executor) r9.l.p((Executor) this.f16777a.a(), "%s.getObject()", this.f16778b);
                }
            } catch (Throwable th2) {
                throw th2;
            }
            return this.f16778b;
        }

        synchronized void b() {
            Executor executor = this.f16778b;
            if (executor != null) {
                this.f16778b = (Executor) this.f16777a.b(executor);
            }
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            a().execute(runnable);
        }
    }

    private final class q extends b1 {
        private q() {
        }

        @Override // io.grpc.internal.b1
        protected void b() {
            m1.this.C0();
        }

        @Override // io.grpc.internal.b1
        protected void c() {
            if (m1.this.O.get()) {
                return;
            }
            m1.this.J0();
        }

        /* synthetic */ q(m1 m1Var, a aVar) {
            this();
        }
    }

    private class r implements Runnable {
        private r() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (m1.this.G == null) {
                return;
            }
            m1.this.B0();
        }

        /* synthetic */ r(m1 m1Var, a aVar) {
            this();
        }
    }

    private final class s extends q0.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        i.b f16781a;

        final class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                m1.this.I0();
            }
        }

        private s() {
        }

        @Override // qb.q0.e
        public qb.f b() {
            return m1.this.W;
        }

        @Override // qb.q0.e
        public ScheduledExecutorService c() {
            return m1.this.f16734l;
        }

        @Override // qb.q0.e
        public qb.z1 d() {
            return m1.this.f16745t;
        }

        @Override // qb.q0.e
        public void e() {
            m1.this.f16745t.f();
            m1.this.f16745t.execute(new a());
        }

        @Override // qb.q0.e
        public void f(qb.q qVar, q0.k kVar) {
            m1.this.f16745t.f();
            r9.l.o(qVar, "newState");
            r9.l.o(kVar, "newPicker");
            if (this != m1.this.G || m1.this.H) {
                return;
            }
            m1.this.N0(kVar);
            if (qVar != qb.q.SHUTDOWN) {
                m1.this.W.b(f.a.INFO, "Entering {0} state with picker: {1}", qVar, kVar);
                m1.this.f16751z.b(qVar);
            }
        }

        @Override // qb.q0.e
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public io.grpc.internal.d a(q0.b bVar) {
            m1.this.f16745t.f();
            r9.l.u(!m1.this.Q, "Channel is being terminated");
            return m1.this.new x(bVar);
        }

        public qb.e1 h() {
            return m1.this.f16739n0;
        }

        /* synthetic */ s(m1 m1Var, a aVar) {
            this();
        }
    }

    final class t extends g1.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final s f16784a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final qb.g1 f16785b;

        final class a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ qb.u1 f16787a;

            a(qb.u1 u1Var) {
                this.f16787a = u1Var;
            }

            @Override // java.lang.Runnable
            public void run() {
                t.this.c(this.f16787a);
            }
        }

        t(s sVar, qb.g1 g1Var) {
            this.f16784a = (s) r9.l.o(sVar, "helperImpl");
            this.f16785b = (qb.g1) r9.l.o(g1Var, "resolver");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void c(qb.u1 u1Var) {
            m1.f16704o0.log(Level.WARNING, "[{0}] Failed to resolve name. status={1}", new Object[]{m1.this.e(), u1Var});
            m1.this.Y.m();
            v vVar = m1.this.Z;
            v vVar2 = v.ERROR;
            if (vVar != vVar2) {
                m1.this.W.b(f.a.WARNING, "Failed to resolve name: {0}", u1Var);
                m1.this.Z = vVar2;
            }
            if (this.f16784a != m1.this.G) {
                return;
            }
            this.f16784a.f16781a.b(u1Var);
        }

        @Override // qb.g1.d
        public qb.u1 a(g1.e eVar) {
            p1 p1Var;
            m1.this.f16745t.f();
            if (m1.this.E != this.f16785b) {
                return qb.u1.f24769e;
            }
            qb.w1 w1VarA = eVar.a();
            if (!w1VarA.e()) {
                c(w1VarA.c());
                return w1VarA.c();
            }
            List list = (List) w1VarA.d();
            qb.f fVar = m1.this.W;
            f.a aVar = f.a.DEBUG;
            fVar.b(aVar, "Resolved address: {0}, config={1}", list, eVar.b());
            v vVar = m1.this.Z;
            v vVar2 = v.SUCCESS;
            if (vVar != vVar2) {
                m1.this.W.b(f.a.INFO, "Address resolved: {0}", list);
                m1.this.Z = vVar2;
            }
            g1.b bVarC = eVar.c();
            qb.f0 f0Var = (qb.f0) eVar.b().b(qb.f0.f24613a);
            p1 p1Var2 = (bVarC == null || bVarC.c() == null) ? null : (p1) bVarC.c();
            qb.u1 u1VarD = bVarC != null ? bVarC.d() : null;
            if (m1.this.f16719d0) {
                if (p1Var2 != null) {
                    if (f0Var != null) {
                        m1.this.Y.p(f0Var);
                        if (p1Var2.c() != null) {
                            m1.this.W.a(aVar, "Method configs in service config will be discarded due to presence ofconfig-selector");
                        }
                    } else {
                        m1.this.Y.p(p1Var2.c());
                    }
                } else if (m1.this.f16715b0 != null) {
                    p1Var2 = m1.this.f16715b0;
                    m1.this.Y.p(p1Var2.c());
                    m1.this.W.a(f.a.INFO, "Received no service config, using default service config");
                } else if (u1VarD == null) {
                    p1Var2 = m1.f16708s0;
                    m1.this.Y.p(null);
                } else {
                    if (!m1.this.f16717c0) {
                        m1.this.W.a(f.a.INFO, "Fallback to error due to invalid first service config without default config");
                        d(bVarC.d());
                        return bVarC.d();
                    }
                    p1Var2 = m1.this.f16713a0;
                }
                if (!p1Var2.equals(m1.this.f16713a0)) {
                    m1.this.W.b(f.a.INFO, "Service config changed{0}", p1Var2 == m1.f16708s0 ? " to empty" : "");
                    m1.this.f16713a0 = p1Var2;
                    m1.this.f16735l0.f16764a = p1Var2.g();
                }
                try {
                    m1.this.f16717c0 = true;
                } catch (RuntimeException e10) {
                    m1.f16704o0.log(Level.WARNING, "[" + m1.this.e() + "] Unexpected exception from parsing service config", (Throwable) e10);
                }
                p1Var = p1Var2;
            } else {
                if (p1Var2 != null) {
                    m1.this.W.a(f.a.INFO, "Service config from name resolver discarded by channel settings");
                }
                p1Var = m1.this.f16715b0 == null ? m1.f16708s0 : m1.this.f16715b0;
                if (f0Var != null) {
                    m1.this.W.a(f.a.INFO, "Config selector from name resolver discarded by channel settings");
                }
                m1.this.Y.p(p1Var.c());
            }
            qb.a aVarB = eVar.b();
            if (this.f16784a != m1.this.G) {
                return qb.u1.f24769e;
            }
            a.b bVarC2 = aVarB.d().c(qb.f0.f24613a);
            Map mapD = p1Var.d();
            if (mapD != null) {
                bVarC2.d(qb.q0.f24709a, mapD).a();
            }
            return this.f16784a.f16781a.e(q0.i.d().b((List) w1VarA.d()).c(bVarC2.a()).d(p1Var.e()).a());
        }

        public void d(qb.u1 u1Var) {
            r9.l.e(!u1Var.q(), "the error status must not be OK");
            m1.this.f16745t.execute(new a(u1Var));
        }
    }

    private class u extends qb.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final AtomicReference f16789a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f16790b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final qb.d f16791c;

        class a extends qb.d {
            a() {
            }

            @Override // qb.d
            public String a() {
                return u.this.f16790b;
            }

            @Override // qb.d
            public qb.g d(qb.a1 a1Var, qb.c cVar) {
                return new io.grpc.internal.q(a1Var, m1.this.D0(cVar), cVar, m1.this.f16735l0, m1.this.R ? null : m1.this.f16730j.e0(), m1.this.U, null).B(m1.this.f16746u).A(m1.this.f16747v).z(m1.this.f16748w);
            }
        }

        final class b implements Runnable {
            b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (m1.this.J == null) {
                    if (u.this.f16789a.get() == m1.f16709t0) {
                        u.this.f16789a.set(null);
                    }
                    m1.this.N.b(m1.f16706q0);
                }
            }
        }

        final class c implements Runnable {
            c() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (u.this.f16789a.get() == m1.f16709t0) {
                    u.this.f16789a.set(null);
                }
                if (m1.this.J != null) {
                    Iterator it = m1.this.J.iterator();
                    while (it.hasNext()) {
                        ((g) it.next()).a("Channel is forcefully shutdown", null);
                    }
                }
                m1.this.N.c(m1.f16705p0);
            }
        }

        class d implements Runnable {
            d() {
            }

            @Override // java.lang.Runnable
            public void run() {
                m1.this.C0();
            }
        }

        class e extends qb.g {
            e() {
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
                aVar.a(m1.f16706q0, new qb.z0());
            }
        }

        class f implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ g f16798a;

            f(g gVar) {
                this.f16798a = gVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (u.this.f16789a.get() != m1.f16709t0) {
                    this.f16798a.r();
                    return;
                }
                if (m1.this.J == null) {
                    m1.this.J = new LinkedHashSet();
                    m1 m1Var = m1.this;
                    m1Var.f16733k0.e(m1Var.K, true);
                }
                m1.this.J.add(this.f16798a);
            }
        }

        private final class g extends b0 {

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            final qb.s f16800l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            final qb.a1 f16801m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final qb.c f16802n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            private final long f16803o;

            class a implements Runnable {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ Runnable f16805a;

                a(Runnable runnable) {
                    this.f16805a = runnable;
                }

                @Override // java.lang.Runnable
                public void run() {
                    this.f16805a.run();
                    g gVar = g.this;
                    m1.this.f16745t.execute(gVar.new b());
                }
            }

            final class b implements Runnable {
                b() {
                }

                @Override // java.lang.Runnable
                public void run() {
                    if (m1.this.J != null) {
                        m1.this.J.remove(g.this);
                        if (m1.this.J.isEmpty()) {
                            m1 m1Var = m1.this;
                            m1Var.f16733k0.e(m1Var.K, false);
                            m1.this.J = null;
                            if (m1.this.O.get()) {
                                m1.this.N.b(m1.f16706q0);
                            }
                        }
                    }
                }
            }

            g(qb.s sVar, qb.a1 a1Var, qb.c cVar) {
                super(m1.this.D0(cVar), m1.this.f16734l, cVar.d());
                this.f16800l = sVar;
                this.f16801m = a1Var;
                this.f16802n = cVar;
                this.f16803o = m1.this.f16729i0.a();
            }

            @Override // io.grpc.internal.b0
            protected void j() {
                super.j();
                m1.this.f16745t.execute(new b());
            }

            void r() {
                qb.s sVarB = this.f16800l.b();
                try {
                    qb.g gVarL = u.this.l(this.f16801m, this.f16802n.v(qb.k.f24661a, Long.valueOf(m1.this.f16729i0.a() - this.f16803o)));
                    this.f16800l.f(sVarB);
                    Runnable runnableP = p(gVarL);
                    if (runnableP == null) {
                        m1.this.f16745t.execute(new b());
                    } else {
                        m1.this.D0(this.f16802n).execute(new a(runnableP));
                    }
                } catch (Throwable th2) {
                    this.f16800l.f(sVarB);
                    throw th2;
                }
            }
        }

        /* synthetic */ u(m1 m1Var, String str, a aVar) {
            this(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public qb.g l(qb.a1 a1Var, qb.c cVar) {
            qb.f0 f0Var = (qb.f0) this.f16789a.get();
            if (f0Var == null) {
                return this.f16791c.d(a1Var, cVar);
            }
            if (!(f0Var instanceof p1.c)) {
                return new n(f0Var, this.f16791c, m1.this.f16736m, a1Var, cVar);
            }
            p1.b bVarF = ((p1.c) f0Var).f17017b.f(a1Var);
            if (bVarF != null) {
                cVar = cVar.v(p1.b.f17010g, bVarF);
            }
            return this.f16791c.d(a1Var, cVar);
        }

        @Override // qb.d
        public String a() {
            return this.f16790b;
        }

        @Override // qb.d
        public qb.g d(qb.a1 a1Var, qb.c cVar) {
            if (this.f16789a.get() != m1.f16709t0) {
                return l(a1Var, cVar);
            }
            m1.this.f16745t.execute(new d());
            if (this.f16789a.get() != m1.f16709t0) {
                return l(a1Var, cVar);
            }
            if (m1.this.O.get()) {
                return new e();
            }
            g gVar = new g(qb.s.e(), a1Var, cVar);
            m1.this.f16745t.execute(new f(gVar));
            return gVar;
        }

        void m() {
            if (this.f16789a.get() == m1.f16709t0) {
                if (m1.this.f16715b0 == null) {
                    p(null);
                    return;
                }
                p(m1.this.f16715b0.c());
                m1 m1Var = m1.this;
                m1Var.f16713a0 = m1Var.f16715b0;
                m1.this.W.a(f.a.ERROR, "Initial Name Resolution error, using default service config");
            }
        }

        void n() {
            m1.this.f16745t.execute(new b());
        }

        void o() {
            m1.this.f16745t.execute(new c());
        }

        void p(qb.f0 f0Var) {
            qb.f0 f0Var2 = (qb.f0) this.f16789a.get();
            this.f16789a.set(f0Var);
            if (f0Var2 != m1.f16709t0 || m1.this.J == null) {
                return;
            }
            Iterator it = m1.this.J.iterator();
            while (it.hasNext()) {
                ((g) it.next()).r();
            }
        }

        private u(String str) {
            this.f16789a = new AtomicReference(m1.f16709t0);
            this.f16791c = new a();
            this.f16790b = (String) r9.l.o(str, "authority");
        }
    }

    enum v {
        NO_RESOLUTION,
        SUCCESS,
        ERROR
    }

    private static final class w implements ScheduledExecutorService, AutoCloseable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final ScheduledExecutorService f16812a;

        /* synthetic */ w(ScheduledExecutorService scheduledExecutorService, a aVar) {
            this(scheduledExecutorService);
        }

        @Override // java.util.concurrent.ExecutorService
        public boolean awaitTermination(long j10, TimeUnit timeUnit) {
            return this.f16812a.awaitTermination(j10, timeUnit);
        }

        @Override // java.lang.AutoCloseable
        public /* synthetic */ void close() {
            c0.f.a(this);
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            this.f16812a.execute(runnable);
        }

        @Override // java.util.concurrent.ExecutorService
        public List invokeAll(Collection collection) {
            return this.f16812a.invokeAll(collection);
        }

        @Override // java.util.concurrent.ExecutorService
        public Object invokeAny(Collection collection) {
            return this.f16812a.invokeAny(collection);
        }

        @Override // java.util.concurrent.ExecutorService
        public boolean isShutdown() {
            return this.f16812a.isShutdown();
        }

        @Override // java.util.concurrent.ExecutorService
        public boolean isTerminated() {
            return this.f16812a.isTerminated();
        }

        @Override // java.util.concurrent.ScheduledExecutorService
        public ScheduledFuture schedule(Callable callable, long j10, TimeUnit timeUnit) {
            return this.f16812a.schedule(callable, j10, timeUnit);
        }

        @Override // java.util.concurrent.ScheduledExecutorService
        public ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j10, long j11, TimeUnit timeUnit) {
            return this.f16812a.scheduleAtFixedRate(runnable, j10, j11, timeUnit);
        }

        @Override // java.util.concurrent.ScheduledExecutorService
        public ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j10, long j11, TimeUnit timeUnit) {
            return this.f16812a.scheduleWithFixedDelay(runnable, j10, j11, timeUnit);
        }

        @Override // java.util.concurrent.ExecutorService
        public void shutdown() {
            throw new UnsupportedOperationException("Restricted: shutdown() is not allowed");
        }

        @Override // java.util.concurrent.ExecutorService
        public List shutdownNow() {
            throw new UnsupportedOperationException("Restricted: shutdownNow() is not allowed");
        }

        @Override // java.util.concurrent.ExecutorService
        public Future submit(Callable callable) {
            return this.f16812a.submit(callable);
        }

        private w(ScheduledExecutorService scheduledExecutorService) {
            this.f16812a = (ScheduledExecutorService) r9.l.o(scheduledExecutorService, "delegate");
        }

        @Override // java.util.concurrent.ExecutorService
        public List invokeAll(Collection collection, long j10, TimeUnit timeUnit) {
            return this.f16812a.invokeAll(collection, j10, timeUnit);
        }

        @Override // java.util.concurrent.ExecutorService
        public Object invokeAny(Collection collection, long j10, TimeUnit timeUnit) {
            return this.f16812a.invokeAny(collection, j10, timeUnit);
        }

        @Override // java.util.concurrent.ScheduledExecutorService
        public ScheduledFuture schedule(Runnable runnable, long j10, TimeUnit timeUnit) {
            return this.f16812a.schedule(runnable, j10, timeUnit);
        }

        @Override // java.util.concurrent.ExecutorService
        public Future submit(Runnable runnable) {
            return this.f16812a.submit(runnable);
        }

        @Override // java.util.concurrent.ExecutorService
        public Future submit(Runnable runnable, Object obj) {
            return this.f16812a.submit(runnable, obj);
        }
    }

    private final class x extends io.grpc.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final q0.b f16813a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final qb.j0 f16814b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final io.grpc.internal.o f16815c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final io.grpc.internal.p f16816d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        List f16817e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        e1 f16818f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        boolean f16819g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        boolean f16820h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        z1.d f16821i;

        final class a extends e1.l {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ q0.l f16823a;

            a(q0.l lVar) {
                this.f16823a = lVar;
            }

            @Override // io.grpc.internal.e1.l
            void a(e1 e1Var) {
                m1.this.f16733k0.e(e1Var, true);
            }

            @Override // io.grpc.internal.e1.l
            void b(e1 e1Var) {
                m1.this.f16733k0.e(e1Var, false);
            }

            @Override // io.grpc.internal.e1.l
            void c(e1 e1Var, qb.r rVar) {
                r9.l.u(this.f16823a != null, "listener is null");
                this.f16823a.a(rVar);
            }

            @Override // io.grpc.internal.e1.l
            void d(e1 e1Var) {
                m1.this.I.remove(e1Var);
                m1.this.X.k(e1Var);
                m1.this.G0();
            }
        }

        final class b implements Runnable {
            b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                x.this.f16818f.b(m1.f16707r0);
            }
        }

        x(q0.b bVar) {
            r9.l.o(bVar, "args");
            this.f16817e = bVar.a();
            if (m1.this.f16716c != null) {
                bVar = bVar.e().e(j(bVar.a())).c();
            }
            this.f16813a = bVar;
            qb.j0 j0VarB = qb.j0.b("Subchannel", m1.this.a());
            this.f16814b = j0VarB;
            io.grpc.internal.p pVar = new io.grpc.internal.p(j0VarB, m1.this.f16744s, m1.this.f16743r.a(), "Subchannel for " + bVar.a());
            this.f16816d = pVar;
            this.f16815c = new io.grpc.internal.o(pVar, m1.this.f16743r);
        }

        private List j(List list) {
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                qb.y yVar = (qb.y) it.next();
                arrayList.add(new qb.y(yVar.a(), yVar.b().d().c(qb.y.f24822d).a()));
            }
            return DesugarCollections.unmodifiableList(arrayList);
        }

        @Override // qb.q0.j
        public List b() {
            m1.this.f16745t.f();
            r9.l.u(this.f16819g, "not started");
            return this.f16817e;
        }

        @Override // qb.q0.j
        public qb.a c() {
            return this.f16813a.b();
        }

        @Override // qb.q0.j
        public qb.f d() {
            return this.f16815c;
        }

        @Override // qb.q0.j
        public Object e() {
            r9.l.u(this.f16819g, "Subchannel is not started");
            return this.f16818f;
        }

        @Override // qb.q0.j
        public void f() {
            m1.this.f16745t.f();
            r9.l.u(this.f16819g, "not started");
            if (this.f16820h) {
                return;
            }
            this.f16818f.a();
        }

        @Override // qb.q0.j
        public void g() {
            z1.d dVar;
            m1.this.f16745t.f();
            if (this.f16818f == null) {
                this.f16820h = true;
                return;
            }
            if (!this.f16820h) {
                this.f16820h = true;
            } else {
                if (!m1.this.Q || (dVar = this.f16821i) == null) {
                    return;
                }
                dVar.a();
                this.f16821i = null;
            }
            if (m1.this.Q) {
                this.f16818f.b(m1.f16706q0);
            } else {
                this.f16821i = m1.this.f16745t.c(new j1(new b()), 5L, TimeUnit.SECONDS, m1.this.f16730j.e0());
            }
        }

        @Override // qb.q0.j
        public void h(q0.l lVar) {
            m1.this.f16745t.f();
            r9.l.u(!this.f16819g, "already started");
            r9.l.u(!this.f16820h, "already shutdown");
            r9.l.u(!m1.this.Q, "Channel is being terminated");
            this.f16819g = true;
            e1 e1Var = new e1(this.f16813a, m1.this.a(), m1.this.D, m1.this.A, m1.this.f16730j, m1.this.f16730j.e0(), m1.this.f16749x, m1.this.f16745t, new a(lVar), m1.this.X, m1.this.T.create(), this.f16816d, this.f16814b, this.f16815c, m1.this.C, m1.this.f16714b, m1.this.G.h());
            m1.this.V.e(new e0.a().b("Child Subchannel started").c(e0.b.CT_INFO).e(m1.this.f16743r.a()).d(e1Var).a());
            this.f16818f = e1Var;
            m1.this.X.e(e1Var);
            m1.this.I.add(e1Var);
        }

        @Override // qb.q0.j
        public void i(List list) {
            m1.this.f16745t.f();
            this.f16817e = list;
            if (m1.this.f16716c != null) {
                list = j(list);
            }
            this.f16818f.Y(list);
        }

        public String toString() {
            return this.f16814b.toString();
        }
    }

    static {
        qb.u1 u1Var = qb.u1.f24784t;
        f16705p0 = u1Var.s("Channel shutdownNow invoked");
        f16706q0 = u1Var.s("Channel shutdown invoked");
        f16707r0 = u1Var.s("Subchannel shutdown invoked");
        f16708s0 = p1.a();
        f16709t0 = new a();
        f16710u0 = new i();
        f16711v0 = new l();
    }

    m1(n1 n1Var, io.grpc.internal.u uVar, URI uri, qb.h1 h1Var, j.a aVar, x1 x1Var, r9.q qVar, List list, b3 b3Var) {
        a aVar2;
        qb.z1 z1Var = new qb.z1(new j());
        this.f16745t = z1Var;
        this.f16751z = new io.grpc.internal.y();
        this.I = new HashSet(16, 0.75f);
        this.K = new Object();
        this.L = new HashSet(1, 0.75f);
        a aVar3 = null;
        this.N = new y(this, aVar3);
        this.O = new AtomicBoolean(false);
        this.S = new CountDownLatch(1);
        this.Z = v.NO_RESOLUTION;
        this.f16713a0 = f16708s0;
        this.f16717c0 = false;
        this.f16721e0 = new m2.t();
        this.f16729i0 = qb.u.g();
        o oVar = new o(this, aVar3);
        this.f16731j0 = oVar;
        this.f16733k0 = new q(this, aVar3);
        m mVar = new m(this, aVar3);
        this.f16735l0 = mVar;
        String str = (String) r9.l.o(n1Var.f16952f, "target");
        this.f16714b = str;
        qb.j0 j0VarB = qb.j0.b("Channel", str);
        this.f16712a = j0VarB;
        this.f16743r = (b3) r9.l.o(b3Var, "timeProvider");
        x1 x1Var2 = (x1) r9.l.o(n1Var.f16947a, "executorPool");
        this.f16738n = x1Var2;
        Executor executor = (Executor) r9.l.o((Executor) x1Var2.a(), "executor");
        this.f16736m = executor;
        this.f16728i = uVar;
        p pVar = new p((x1) r9.l.o(n1Var.f16948b, "offloadExecutorPool"));
        this.f16742q = pVar;
        io.grpc.internal.m mVar2 = new io.grpc.internal.m(uVar, n1Var.f16953g, pVar);
        this.f16730j = mVar2;
        this.f16732k = new io.grpc.internal.m(uVar, null, pVar);
        w wVar = new w(mVar2.e0(), null);
        this.f16734l = wVar;
        this.f16744s = n1Var.f16969w;
        io.grpc.internal.p pVar2 = new io.grpc.internal.p(j0VarB, n1Var.f16969w, b3Var.a(), "Channel for '" + str + "'");
        this.V = pVar2;
        io.grpc.internal.o oVar2 = new io.grpc.internal.o(pVar2, b3Var);
        this.W = oVar2;
        qb.m1 m1Var = n1Var.f16972z;
        m1Var = m1Var == null ? w0.f17199q : m1Var;
        boolean z10 = n1Var.f16967u;
        this.f16727h0 = z10;
        io.grpc.internal.i iVar = new io.grpc.internal.i(n1Var.f16958l);
        this.f16726h = iVar;
        this.f16718d = n1Var.f16950d;
        this.f16720e = (URI) r9.l.o(uri, "targetUri");
        this.f16722f = (qb.h1) r9.l.o(h1Var, "nameResolverProvider");
        q2 q2Var = new q2(z10, n1Var.f16963q, n1Var.f16964r, iVar);
        String str2 = n1Var.f16957k;
        this.f16716c = str2;
        u1 u1Var = new u1(n1Var.H, qb.c1.a());
        this.f16739n0 = u1Var;
        g1.a.C0339a c0339aQ = g1.a.g().o(n1Var.h()).t(m1Var).w(z1Var).u(wVar).v(q2Var).n(oVar2).r(pVar).s(str2).p(u1Var).q(n1Var.f16950d);
        n1Var.g(c0339aQ);
        g1.a aVarL = c0339aQ.l();
        this.f16724g = aVarL;
        this.E = E0(uri, str2, h1Var, aVarL);
        this.f16740o = (x1) r9.l.o(x1Var, "balancerRpcExecutorPool");
        this.f16741p = new p(x1Var);
        c0 c0Var = new c0(executor, z1Var);
        this.M = c0Var;
        c0Var.c(oVar);
        this.A = aVar;
        Map map = n1Var.f16970x;
        if (map != null) {
            g1.b bVarA = q2Var.a(map);
            r9.l.w(bVarA.d() == null, "Default config is invalid: %s", bVarA.d());
            p1 p1Var = (p1) bVarA.c();
            this.f16715b0 = p1Var;
            mVar.f16764a = p1Var.g();
            aVar2 = null;
        } else {
            aVar2 = null;
            this.f16715b0 = null;
        }
        boolean z11 = n1Var.f16971y;
        this.f16719d0 = z11;
        u uVar2 = new u(this, this.E.c(), aVar2);
        this.Y = uVar2;
        this.B = qb.j.a(uVar2, list);
        this.C = new ArrayList(n1Var.f16951e);
        this.f16749x = (r9.q) r9.l.o(qVar, "stopwatchSupplier");
        long j10 = n1Var.f16962p;
        if (j10 == -1) {
            this.f16750y = j10;
        } else {
            r9.l.i(j10 >= n1.M, "invalid idleTimeoutMillis %s", j10);
            this.f16750y = n1Var.f16962p;
        }
        this.f16737m0 = new l2(new r(this, null), z1Var, mVar2.e0(), (r9.o) qVar.get());
        this.f16746u = n1Var.f16959m;
        this.f16747v = (qb.w) r9.l.o(n1Var.f16960n, "decompressorRegistry");
        this.f16748w = (qb.o) r9.l.o(n1Var.f16961o, "compressorRegistry");
        this.D = n1Var.f16956j;
        this.f16725g0 = n1Var.f16965s;
        this.f16723f0 = n1Var.f16966t;
        c cVar = new c(b3Var);
        this.T = cVar;
        this.U = cVar.create();
        qb.d0 d0Var = (qb.d0) r9.l.n(n1Var.f16968v);
        this.X = d0Var;
        d0Var.d(this);
        if (z11) {
            return;
        }
        if (this.f16715b0 != null) {
            oVar2.a(f.a.INFO, "Service config look-up disabled, using default service config");
        }
        this.f16717c0 = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0(boolean z10) {
        this.f16737m0.i(z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void B0() {
        L0(true);
        this.M.r(null);
        this.W.a(f.a.INFO, "Entering IDLE state");
        this.f16751z.b(qb.q.IDLE);
        if (this.f16733k0.a(this.K, this.M)) {
            C0();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Executor D0(qb.c cVar) {
        Executor executorE = cVar.e();
        return executorE == null ? this.f16736m : executorE;
    }

    static qb.g1 E0(URI uri, String str, qb.h1 h1Var, g1.a aVar) {
        qb.g1 g1VarB = h1Var.b(uri, aVar);
        if (g1VarB != null) {
            qb.g1 g1VarH = p2.h(g1VarB, aVar);
            return str == null ? g1VarH : new k(g1VarH, str);
        }
        throw new IllegalArgumentException("cannot create a NameResolver for " + uri);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void F0() {
        if (this.P) {
            Iterator it = this.I.iterator();
            while (it.hasNext()) {
                ((e1) it.next()).f(f16705p0);
            }
            Iterator it2 = this.L.iterator();
            if (it2.hasNext()) {
                android.support.v4.media.session.b.a(it2.next());
                throw null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void G0() {
        if (!this.R && this.O.get() && this.I.isEmpty() && this.L.isEmpty()) {
            this.W.a(f.a.INFO, "Terminated");
            this.X.j(this);
            this.f16738n.b(this.f16736m);
            this.f16741p.b();
            this.f16742q.b();
            this.f16730j.close();
            this.R = true;
            this.S.countDown();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void I0() {
        this.f16745t.f();
        if (this.F) {
            this.E.d();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void J0() {
        long j10 = this.f16750y;
        if (j10 == -1) {
            return;
        }
        this.f16737m0.k(j10, TimeUnit.MILLISECONDS);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void L0(boolean z10) {
        this.f16745t.f();
        if (z10) {
            r9.l.u(this.F, "nameResolver is not started");
            r9.l.u(this.G != null, "lbHelper is null");
        }
        qb.g1 g1Var = this.E;
        if (g1Var != null) {
            g1Var.e();
            this.F = false;
            if (z10) {
                this.E = E0(this.f16720e, this.f16716c, this.f16722f, this.f16724g);
            } else {
                this.E = null;
            }
        }
        s sVar = this.G;
        if (sVar != null) {
            sVar.f16781a.d();
            this.G = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void N0(q0.k kVar) {
        this.M.r(kVar);
    }

    void C0() {
        this.f16745t.f();
        if (this.O.get() || this.H) {
            return;
        }
        if (this.f16733k0.d()) {
            A0(false);
        } else {
            J0();
        }
        if (this.G != null) {
            return;
        }
        this.W.a(f.a.INFO, "Exiting idle mode");
        s sVar = new s(this, null);
        sVar.f16781a = this.f16726h.e(sVar);
        this.G = sVar;
        this.f16751z.b(qb.q.CONNECTING);
        this.E.f(new t(sVar, this.E));
        this.F = true;
    }

    void H0(Throwable th2) {
        if (this.H) {
            return;
        }
        this.H = true;
        try {
            A0(true);
            L0(false);
        } finally {
            N0(new q0.d(q0.g.g(qb.u1.f24783s.s("Panic! This is a bug!").r(th2))));
            this.Y.p(null);
            this.W.a(f.a.ERROR, "PANIC! Entering TRANSIENT_FAILURE");
            this.f16751z.b(qb.q.TRANSIENT_FAILURE);
        }
    }

    public m1 K0() {
        this.W.a(f.a.DEBUG, "shutdown() called");
        if (!this.O.compareAndSet(false, true)) {
            return this;
        }
        this.f16745t.execute(new g());
        this.Y.n();
        this.f16745t.execute(new b());
        return this;
    }

    @Override // qb.v0
    /* JADX INFO: renamed from: M0, reason: merged with bridge method [inline-methods] */
    public m1 l() {
        this.W.a(f.a.DEBUG, "shutdownNow() called");
        K0();
        this.Y.o();
        this.f16745t.execute(new h());
        return this;
    }

    @Override // qb.d
    public String a() {
        return this.B.a();
    }

    @Override // qb.d
    public qb.g d(qb.a1 a1Var, qb.c cVar) {
        return this.B.d(a1Var, cVar);
    }

    @Override // qb.o0
    public qb.j0 e() {
        return this.f16712a;
    }

    @Override // qb.v0
    public qb.q i(boolean z10) {
        qb.q qVarA = this.f16751z.a();
        if (z10 && qVarA == qb.q.IDLE) {
            this.f16745t.execute(new e());
        }
        return qVarA;
    }

    @Override // qb.v0
    public void j(qb.q qVar, Runnable runnable) {
        this.f16745t.execute(new d(runnable, qVar));
    }

    @Override // qb.v0
    public void k() {
        this.f16745t.execute(new f());
    }

    public String toString() {
        return r9.g.b(this).c("logId", this.f16712a.d()).d("target", this.f16714b).toString();
    }

    private final class y {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Object f16826a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Collection f16827b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        qb.u1 f16828c;

        private y() {
            this.f16826a = new Object();
            this.f16827b = new HashSet();
        }

        qb.u1 a(m2 m2Var) {
            synchronized (this.f16826a) {
                try {
                    qb.u1 u1Var = this.f16828c;
                    if (u1Var != null) {
                        return u1Var;
                    }
                    this.f16827b.add(m2Var);
                    return null;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        void b(qb.u1 u1Var) {
            synchronized (this.f16826a) {
                try {
                    if (this.f16828c != null) {
                        return;
                    }
                    this.f16828c = u1Var;
                    boolean zIsEmpty = this.f16827b.isEmpty();
                    if (zIsEmpty) {
                        m1.this.M.b(u1Var);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        void c(qb.u1 u1Var) {
            ArrayList arrayList;
            b(u1Var);
            synchronized (this.f16826a) {
                arrayList = new ArrayList(this.f16827b);
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((io.grpc.internal.r) it.next()).b(u1Var);
            }
            m1.this.M.f(u1Var);
        }

        void d(m2 m2Var) {
            qb.u1 u1Var;
            synchronized (this.f16826a) {
                try {
                    this.f16827b.remove(m2Var);
                    if (this.f16827b.isEmpty()) {
                        u1Var = this.f16828c;
                        this.f16827b = new HashSet();
                    } else {
                        u1Var = null;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (u1Var != null) {
                m1.this.M.b(u1Var);
            }
        }

        /* synthetic */ y(m1 m1Var, a aVar) {
            this();
        }
    }

    class l extends qb.g {
        l() {
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
