package io.grpc.internal;

import androidx.appcompat.widget.ActivityChooserView;
import io.grpc.internal.t1;
import io.grpc.internal.u;
import java.net.SocketAddress;
import java.util.Collection;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicInteger;
import qb.b;

/* JADX INFO: loaded from: classes3.dex */
final class m implements u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final u f16688a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final qb.b f16689b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Executor f16690c;

    private class a extends p0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final x f16691a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f16692b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private volatile qb.u1 f16694d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private qb.u1 f16695e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private qb.u1 f16696f;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final AtomicInteger f16693c = new AtomicInteger(-2147483647);

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final t1.a f16697g = new C0229a();

        /* JADX INFO: renamed from: io.grpc.internal.m$a$a, reason: collision with other inner class name */
        class C0229a implements t1.a {
            C0229a() {
            }

            @Override // io.grpc.internal.t1.a
            public void onComplete() {
                if (a.this.f16693c.decrementAndGet() == 0) {
                    a.this.j();
                }
            }
        }

        class b extends b.AbstractC0337b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ qb.a1 f16700a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ qb.c f16701b;

            b(qb.a1 a1Var, qb.c cVar) {
                this.f16700a = a1Var;
                this.f16701b = cVar;
            }
        }

        a(x xVar, String str) {
            this.f16691a = (x) r9.l.o(xVar, "delegate");
            this.f16692b = (String) r9.l.o(str, "authority");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void j() {
            synchronized (this) {
                try {
                    if (this.f16693c.get() != 0) {
                        return;
                    }
                    qb.u1 u1Var = this.f16695e;
                    qb.u1 u1Var2 = this.f16696f;
                    this.f16695e = null;
                    this.f16696f = null;
                    if (u1Var != null) {
                        super.b(u1Var);
                    }
                    if (u1Var2 != null) {
                        super.f(u1Var2);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // io.grpc.internal.p0
        protected x a() {
            return this.f16691a;
        }

        @Override // io.grpc.internal.p0, io.grpc.internal.q1
        public void b(qb.u1 u1Var) {
            r9.l.o(u1Var, "status");
            synchronized (this) {
                try {
                    if (this.f16693c.get() < 0) {
                        this.f16694d = u1Var;
                        this.f16693c.addAndGet(ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED);
                        if (this.f16693c.get() != 0) {
                            this.f16695e = u1Var;
                        } else {
                            super.b(u1Var);
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // io.grpc.internal.p0, io.grpc.internal.q1
        public void f(qb.u1 u1Var) {
            r9.l.o(u1Var, "status");
            synchronized (this) {
                try {
                    if (this.f16693c.get() < 0) {
                        this.f16694d = u1Var;
                        this.f16693c.addAndGet(ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED);
                    } else if (this.f16696f != null) {
                        return;
                    }
                    if (this.f16693c.get() != 0) {
                        this.f16696f = u1Var;
                    } else {
                        super.f(u1Var);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // io.grpc.internal.p0, io.grpc.internal.t
        public r g(qb.a1 a1Var, qb.z0 z0Var, qb.c cVar, qb.k[] kVarArr) {
            qb.b bVarC = cVar.c();
            if (bVarC == null) {
                bVarC = m.this.f16689b;
            } else if (m.this.f16689b != null) {
                bVarC = new qb.m(m.this.f16689b, bVarC);
            }
            if (bVarC == null) {
                return this.f16693c.get() >= 0 ? new k0(this.f16694d, kVarArr) : this.f16691a.g(a1Var, z0Var, cVar, kVarArr);
            }
            t1 t1Var = new t1(this.f16691a, a1Var, z0Var, cVar, this.f16697g, kVarArr);
            if (this.f16693c.incrementAndGet() > 0) {
                this.f16697g.onComplete();
                return new k0(this.f16694d, kVarArr);
            }
            try {
                bVarC.a(new b(a1Var, cVar), m.this.f16690c, t1Var);
            } catch (Throwable th2) {
                t1Var.b(qb.u1.f24777m.s("Credentials should use fail() instead of throwing exceptions").r(th2));
            }
            return t1Var.d();
        }
    }

    m(u uVar, qb.b bVar, Executor executor) {
        this.f16688a = (u) r9.l.o(uVar, "delegate");
        this.f16689b = bVar;
        this.f16690c = (Executor) r9.l.o(executor, "appExecutor");
    }

    @Override // io.grpc.internal.u, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f16688a.close();
    }

    @Override // io.grpc.internal.u
    public ScheduledExecutorService e0() {
        return this.f16688a.e0();
    }

    @Override // io.grpc.internal.u
    public x g0(SocketAddress socketAddress, u.a aVar, qb.f fVar) {
        return new a(this.f16688a.g0(socketAddress, aVar, fVar), aVar.a());
    }

    @Override // io.grpc.internal.u
    public Collection r0() {
        return this.f16688a.r0();
    }
}
