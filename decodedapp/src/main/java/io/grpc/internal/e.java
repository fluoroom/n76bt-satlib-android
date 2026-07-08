package io.grpc.internal;

import io.grpc.internal.f;
import io.grpc.internal.r1;
import io.grpc.internal.z2;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes3.dex */
public class e implements a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final r1.b f16454a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final io.grpc.internal.f f16455b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final r1 f16456c;

    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f16457a;

        a(int i10) {
            this.f16457a = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (e.this.f16456c.isClosed()) {
                return;
            }
            try {
                e.this.f16456c.e(this.f16457a);
            } catch (Throwable th2) {
                e.this.f16455b.e(th2);
                e.this.f16456c.close();
            }
        }
    }

    class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ i2 f16459a;

        b(i2 i2Var) {
            this.f16459a = i2Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                e.this.f16456c.q(this.f16459a);
            } catch (Throwable th2) {
                e.this.f16455b.e(th2);
                e.this.f16456c.close();
            }
        }
    }

    class c implements Closeable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ i2 f16461a;

        c(i2 i2Var) {
            this.f16461a = i2Var;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f16461a.close();
        }
    }

    class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            e.this.f16456c.l();
        }
    }

    /* JADX INFO: renamed from: io.grpc.internal.e$e, reason: collision with other inner class name */
    class RunnableC0227e implements Runnable {
        RunnableC0227e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            e.this.f16456c.close();
        }
    }

    private class f extends g implements Closeable {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final Closeable f16465d;

        public f(Runnable runnable, Closeable closeable) {
            super(e.this, runnable, null);
            this.f16465d = closeable;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            this.f16465d.close();
        }
    }

    private class g implements z2.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Runnable f16467a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f16468b;

        /* synthetic */ g(e eVar, Runnable runnable, a aVar) {
            this(runnable);
        }

        private void a() {
            if (this.f16468b) {
                return;
            }
            this.f16467a.run();
            this.f16468b = true;
        }

        @Override // io.grpc.internal.z2.a
        public InputStream next() {
            a();
            return e.this.f16455b.f();
        }

        private g(Runnable runnable) {
            this.f16468b = false;
            this.f16467a = runnable;
        }
    }

    interface h extends f.d {
    }

    e(r1.b bVar, h hVar, r1 r1Var) {
        w2 w2Var = new w2((r1.b) r9.l.o(bVar, "listener"));
        this.f16454a = w2Var;
        io.grpc.internal.f fVar = new io.grpc.internal.f(w2Var, hVar);
        this.f16455b = fVar;
        r1Var.S(fVar);
        this.f16456c = r1Var;
    }

    @Override // io.grpc.internal.a0
    public void close() {
        this.f16456c.T();
        this.f16454a.a(new g(this, new RunnableC0227e(), null));
    }

    @Override // io.grpc.internal.a0
    public void e(int i10) {
        this.f16454a.a(new g(this, new a(i10), null));
    }

    @Override // io.grpc.internal.a0
    public void k(int i10) {
        this.f16456c.k(i10);
    }

    @Override // io.grpc.internal.a0
    public void l() {
        this.f16454a.a(new g(this, new d(), null));
    }

    @Override // io.grpc.internal.a0
    public void n(qb.v vVar) {
        this.f16456c.n(vVar);
    }

    @Override // io.grpc.internal.a0
    public void q(i2 i2Var) {
        this.f16454a.a(new f(new b(i2Var), new c(i2Var)));
    }
}
