package io.grpc.internal;

import io.grpc.internal.e;
import io.grpc.internal.r1;
import io.grpc.internal.z2;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import qb.l;

/* JADX INFO: loaded from: classes3.dex */
public abstract class c implements y2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Logger f16356a = Logger.getLogger(c.class.getName());

    public static abstract class a implements e.h, r1.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private a0 f16357a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Object f16358b = new Object();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final x2 f16359c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final f3 f16360d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final r1 f16361e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f16362f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private boolean f16363g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private boolean f16364h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f16365i;

        /* JADX INFO: renamed from: io.grpc.internal.c$a$a, reason: collision with other inner class name */
        class RunnableC0226a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ gc.b f16366a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ int f16367b;

            RunnableC0226a(gc.b bVar, int i10) {
                this.f16366a = bVar;
                this.f16367b = i10;
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    gc.e eVarH = gc.c.h("AbstractStream.request");
                    try {
                        gc.c.e(this.f16366a);
                        a.this.f16357a.e(this.f16367b);
                        if (eVarH != null) {
                            eVarH.close();
                        }
                    } finally {
                    }
                } catch (Throwable th2) {
                    a.this.e(th2);
                }
            }
        }

        protected a(int i10, x2 x2Var, f3 f3Var) {
            this.f16359c = (x2) r9.l.o(x2Var, "statsTraceCtx");
            this.f16360d = (f3) r9.l.o(f3Var, "transportTracer");
            r1 r1Var = new r1(this, l.b.f24679a, i10, x2Var, f3Var);
            this.f16361e = r1Var;
            this.f16357a = r1Var;
            this.f16365i = 32768;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean n() {
            boolean z10;
            synchronized (this.f16358b) {
                try {
                    z10 = this.f16363g && this.f16362f < this.f16365i && !this.f16364h;
                } finally {
                }
            }
            return z10;
        }

        private void p() {
            boolean zN;
            synchronized (this.f16358b) {
                try {
                    zN = n();
                    if (!zN) {
                        Logger logger = c.f16356a;
                        Level level = Level.FINEST;
                        if (logger.isLoggable(level)) {
                            c.f16356a.log(level, "Stream not ready so skip notifying listener.\ndetails: allocated/deallocated:{0}/{3}, sent queued: {1}, ready thresh: {2}", new Object[]{Boolean.valueOf(this.f16363g), Integer.valueOf(this.f16362f), Integer.valueOf(this.f16365i), Boolean.valueOf(this.f16364h)});
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (zN) {
                o().c();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void q(int i10) {
            synchronized (this.f16358b) {
                this.f16362f += i10;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void u(int i10) {
            f(new RunnableC0226a(gc.c.f(), i10));
        }

        @Override // io.grpc.internal.r1.b
        public void a(z2.a aVar) {
            o().a(aVar);
        }

        public final void b(int i10) {
            boolean z10;
            synchronized (this.f16358b) {
                r9.l.u(this.f16363g, "onStreamAllocated was not called, but it seems the stream is active");
                int i11 = this.f16362f;
                int i12 = this.f16365i;
                z10 = false;
                boolean z11 = i11 < i12;
                int i13 = i11 - i10;
                this.f16362f = i13;
                boolean z12 = i13 < i12;
                if (!z11 && z12) {
                    z10 = true;
                }
            }
            if (z10) {
                p();
            }
        }

        protected final void k(boolean z10) {
            if (z10) {
                this.f16357a.close();
            } else {
                this.f16357a.l();
            }
        }

        protected final void l(i2 i2Var) {
            try {
                this.f16357a.q(i2Var);
            } catch (Throwable th2) {
                e(th2);
            }
        }

        protected f3 m() {
            return this.f16360d;
        }

        protected abstract z2 o();

        protected void r() {
            r9.l.t(o() != null);
            synchronized (this.f16358b) {
                r9.l.u(!this.f16363g, "Already allocated");
                this.f16363g = true;
            }
            p();
        }

        protected final void s() {
            synchronized (this.f16358b) {
                this.f16364h = true;
            }
        }

        final void t() {
            this.f16361e.S(this);
            this.f16357a = this.f16361e;
        }

        protected final void v(qb.v vVar) {
            this.f16357a.n(vVar);
        }

        protected void w(x0 x0Var) {
            this.f16361e.H(x0Var);
            this.f16357a = new e(this, this, this.f16361e);
        }

        final void x(int i10) {
            this.f16357a.k(i10);
        }

        void y(int i10) {
            synchronized (this.f16358b) {
                this.f16365i = i10;
            }
        }
    }

    @Override // io.grpc.internal.y2
    public boolean a() {
        return u().n();
    }

    @Override // io.grpc.internal.y2
    public final void c(qb.n nVar) {
        j().c((qb.n) r9.l.o(nVar, "compressor"));
    }

    @Override // io.grpc.internal.y2
    public final void d(InputStream inputStream) {
        r9.l.o(inputStream, "message");
        try {
            if (!j().isClosed()) {
                j().d(inputStream);
            }
        } finally {
            w0.e(inputStream);
        }
    }

    @Override // io.grpc.internal.y2
    public final void e(int i10) {
        u().u(i10);
    }

    @Override // io.grpc.internal.y2
    public void f() {
        u().t();
    }

    @Override // io.grpc.internal.y2
    public final void flush() {
        if (j().isClosed()) {
            return;
        }
        j().flush();
    }

    protected final void i() {
        j().close();
    }

    protected abstract u0 j();

    protected final void t(int i10) {
        u().q(i10);
    }

    protected abstract a u();
}
