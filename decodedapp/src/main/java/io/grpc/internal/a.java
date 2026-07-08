package io.grpc.internal;

import io.grpc.internal.c;
import io.grpc.internal.s;
import io.grpc.internal.s1;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import qb.l;
import qb.z0;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a extends io.grpc.internal.c implements r, s1.d {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Logger f16226h = Logger.getLogger(a.class.getName());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final f3 f16227b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final u0 f16228c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f16229d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f16230e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private qb.z0 f16231f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private volatile boolean f16232g;

    /* JADX INFO: Access modifiers changed from: protected */
    public interface b {
        void b(qb.u1 u1Var);

        void c(qb.z0 z0Var, byte[] bArr);

        void d(g3 g3Var, boolean z10, boolean z11, int i10);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static abstract class c extends c.a {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private final x2 f16238j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private boolean f16239k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private s f16240l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private boolean f16241m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private qb.w f16242n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private boolean f16243o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private Runnable f16244p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private volatile boolean f16245q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private boolean f16246r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private boolean f16247s;

        /* JADX INFO: renamed from: io.grpc.internal.a$c$a, reason: collision with other inner class name */
        class RunnableC0225a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ qb.u1 f16248a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ s.a f16249b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ qb.z0 f16250c;

            RunnableC0225a(qb.u1 u1Var, s.a aVar, qb.z0 z0Var) {
                this.f16248a = u1Var;
                this.f16249b = aVar;
                this.f16250c = z0Var;
            }

            @Override // java.lang.Runnable
            public void run() {
                c.this.D(this.f16248a, this.f16249b, this.f16250c);
            }
        }

        protected c(int i10, x2 x2Var, f3 f3Var, qb.c cVar) {
            super(i10, x2Var, f3Var);
            this.f16242n = qb.w.c();
            this.f16243o = false;
            this.f16238j = (x2) r9.l.o(x2Var, "statsTraceCtx");
            if (cVar.h() != null) {
                y(cVar.h().intValue());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void D(qb.u1 u1Var, s.a aVar, qb.z0 z0Var) {
            if (this.f16239k) {
                return;
            }
            this.f16239k = true;
            this.f16238j.m(u1Var);
            if (m() != null) {
                m().f(u1Var.q());
            }
            o().d(u1Var, aVar, z0Var);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void J(qb.w wVar) {
            r9.l.u(this.f16240l == null, "Already called start");
            this.f16242n = (qb.w) r9.l.o(wVar, "decompressorRegistry");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void K(boolean z10) {
            this.f16241m = z10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void M() {
            this.f16245q = true;
        }

        protected void E(i2 i2Var) throws Throwable {
            r9.l.o(i2Var, "frame");
            boolean z10 = true;
            try {
                if (this.f16246r) {
                    a.f16226h.log(Level.INFO, "Received data on closed stream");
                    i2Var.close();
                    return;
                } else {
                    try {
                        l(i2Var);
                        return;
                    } catch (Throwable th2) {
                        th = th2;
                        z10 = false;
                    }
                }
            } catch (Throwable th3) {
                th = th3;
            }
            if (z10) {
                i2Var.close();
            }
            throw th;
        }

        protected void F(qb.z0 z0Var) {
            boolean z10;
            r9.l.u(!this.f16246r, "Received headers on closed stream");
            this.f16238j.a(z0Var);
            String str = (String) z0Var.g(w0.f17189g);
            if (!this.f16241m || str == null) {
                z10 = false;
            } else if (str.equalsIgnoreCase("gzip")) {
                w(new x0());
                z10 = true;
            } else {
                if (!str.equalsIgnoreCase("identity")) {
                    e(qb.u1.f24783s.s(String.format("Can't find full stream decompressor for %s", str)).e());
                    return;
                }
                z10 = false;
            }
            String str2 = (String) z0Var.g(w0.f17187e);
            if (str2 != null) {
                qb.v vVarE = this.f16242n.e(str2);
                if (vVarE == null) {
                    e(qb.u1.f24783s.s(String.format("Can't find decompressor for %s", str2)).e());
                    return;
                } else if (vVarE != l.b.f24679a) {
                    if (z10) {
                        e(qb.u1.f24783s.s("Full stream and gRPC message encoding cannot both be set").e());
                        return;
                    }
                    v(vVarE);
                }
            }
            o().b(z0Var);
        }

        protected void G(qb.z0 z0Var, qb.u1 u1Var) {
            r9.l.o(u1Var, "status");
            r9.l.o(z0Var, "trailers");
            if (this.f16246r) {
                a.f16226h.log(Level.INFO, "Received trailers on closed stream:\n {1}\n {2}", new Object[]{u1Var, z0Var});
            } else {
                this.f16238j.b(z0Var);
                O(u1Var, false, z0Var);
            }
        }

        protected final boolean H() {
            return this.f16245q;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // io.grpc.internal.c.a
        /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
        public final s o() {
            return this.f16240l;
        }

        public final void L(s sVar) {
            r9.l.u(this.f16240l == null, "Already called setListener");
            this.f16240l = (s) r9.l.o(sVar, "listener");
        }

        public final void N(qb.u1 u1Var, s.a aVar, boolean z10, qb.z0 z0Var) {
            r9.l.o(u1Var, "status");
            r9.l.o(z0Var, "trailers");
            if (!this.f16246r || z10) {
                this.f16246r = true;
                this.f16247s = u1Var.q();
                s();
                if (this.f16243o) {
                    this.f16244p = null;
                    D(u1Var, aVar, z0Var);
                } else {
                    this.f16244p = new RunnableC0225a(u1Var, aVar, z0Var);
                    k(z10);
                }
            }
        }

        public final void O(qb.u1 u1Var, boolean z10, qb.z0 z0Var) {
            N(u1Var, s.a.PROCESSED, z10, z0Var);
        }

        @Override // io.grpc.internal.r1.b
        public void c(boolean z10) {
            r9.l.u(this.f16246r, "status should have been reported on deframer closed");
            this.f16243o = true;
            if (this.f16247s && z10) {
                O(qb.u1.f24783s.s("Encountered end-of-stream mid-frame"), true, new qb.z0());
            }
            Runnable runnable = this.f16244p;
            if (runnable != null) {
                runnable.run();
                this.f16244p = null;
            }
        }
    }

    protected a(h3 h3Var, x2 x2Var, f3 f3Var, qb.z0 z0Var, qb.c cVar, boolean z10) {
        r9.l.o(z0Var, "headers");
        this.f16227b = (f3) r9.l.o(f3Var, "transportTracer");
        this.f16229d = w0.o(cVar);
        this.f16230e = z10;
        if (z10) {
            this.f16228c = new C0224a(z0Var, x2Var);
        } else {
            this.f16228c = new s1(this, h3Var, x2Var);
            this.f16231f = z0Var;
        }
    }

    @Override // io.grpc.internal.c, io.grpc.internal.y2
    public final boolean a() {
        return super.a() && !this.f16232g;
    }

    @Override // io.grpc.internal.r
    public final void b(qb.u1 u1Var) {
        r9.l.e(!u1Var.q(), "Should not cancel with OK status");
        this.f16232g = true;
        v().b(u1Var);
    }

    @Override // io.grpc.internal.s1.d
    public final void g(g3 g3Var, boolean z10, boolean z11, int i10) {
        r9.l.e(g3Var != null || z10, "null frame before EOS");
        v().d(g3Var, z10, z11, i10);
    }

    @Override // io.grpc.internal.c
    protected final u0 j() {
        return this.f16228c;
    }

    @Override // io.grpc.internal.r
    public void k(int i10) {
        z().x(i10);
    }

    @Override // io.grpc.internal.r
    public void l(int i10) {
        this.f16228c.l(i10);
    }

    @Override // io.grpc.internal.r
    public void m(qb.u uVar) {
        qb.z0 z0Var = this.f16231f;
        z0.h hVar = w0.f17186d;
        z0Var.e(hVar);
        this.f16231f.o(hVar, Long.valueOf(uVar.k(TimeUnit.NANOSECONDS)));
    }

    @Override // io.grpc.internal.r
    public final void o(c1 c1Var) {
        c1Var.b("remote_addr", getAttributes().b(qb.b0.f24537a));
    }

    @Override // io.grpc.internal.r
    public final void p() {
        if (z().H()) {
            return;
        }
        z().M();
        i();
    }

    @Override // io.grpc.internal.r
    public final void q(qb.w wVar) {
        z().J(wVar);
    }

    @Override // io.grpc.internal.r
    public final void r(s sVar) {
        z().L(sVar);
        if (this.f16230e) {
            return;
        }
        v().c(this.f16231f, null);
        this.f16231f = null;
    }

    @Override // io.grpc.internal.r
    public final void s(boolean z10) {
        z().K(z10);
    }

    protected abstract b v();

    protected f3 x() {
        return this.f16227b;
    }

    public final boolean y() {
        return this.f16229d;
    }

    protected abstract c z();

    /* JADX INFO: renamed from: io.grpc.internal.a$a, reason: collision with other inner class name */
    private class C0224a implements u0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private qb.z0 f16233a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f16234b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final x2 f16235c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private byte[] f16236d;

        public C0224a(qb.z0 z0Var, x2 x2Var) {
            this.f16233a = (qb.z0) r9.l.o(z0Var, "headers");
            this.f16235c = (x2) r9.l.o(x2Var, "statsTraceCtx");
        }

        @Override // io.grpc.internal.u0
        public void close() {
            this.f16234b = true;
            r9.l.u(this.f16236d != null, "Lack of request message. GET request is only supported for unary requests");
            a.this.v().c(this.f16233a, this.f16236d);
            this.f16236d = null;
            this.f16233a = null;
        }

        @Override // io.grpc.internal.u0
        public void d(InputStream inputStream) {
            r9.l.u(this.f16236d == null, "writePayload should not be called multiple times");
            try {
                this.f16236d = t9.b.d(inputStream);
                this.f16235c.i(0);
                x2 x2Var = this.f16235c;
                byte[] bArr = this.f16236d;
                x2Var.j(0, bArr.length, bArr.length);
                this.f16235c.k(this.f16236d.length);
                this.f16235c.l(this.f16236d.length);
            } catch (IOException e10) {
                throw new RuntimeException(e10);
            }
        }

        @Override // io.grpc.internal.u0
        public void flush() {
        }

        @Override // io.grpc.internal.u0
        public boolean isClosed() {
            return this.f16234b;
        }

        @Override // io.grpc.internal.u0
        public void l(int i10) {
        }

        @Override // io.grpc.internal.u0
        public u0 c(qb.n nVar) {
            return this;
        }
    }
}
