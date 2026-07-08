package io.grpc.internal;

import io.grpc.internal.r1;
import io.grpc.internal.z2;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.Queue;

/* JADX INFO: loaded from: classes3.dex */
final class f implements r1.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d f16566a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final r1.b f16567b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Queue f16568c = new ArrayDeque();

    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f16569a;

        a(int i10) {
            this.f16569a = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            f.this.f16567b.d(this.f16569a);
        }
    }

    class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f16571a;

        b(boolean z10) {
            this.f16571a = z10;
        }

        @Override // java.lang.Runnable
        public void run() {
            f.this.f16567b.c(this.f16571a);
        }
    }

    class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Throwable f16573a;

        c(Throwable th2) {
            this.f16573a = th2;
        }

        @Override // java.lang.Runnable
        public void run() {
            f.this.f16567b.e(this.f16573a);
        }
    }

    public interface d {
        void f(Runnable runnable);
    }

    public f(r1.b bVar, d dVar) {
        this.f16567b = (r1.b) r9.l.o(bVar, "listener");
        this.f16566a = (d) r9.l.o(dVar, "transportExecutor");
    }

    @Override // io.grpc.internal.r1.b
    public void a(z2.a aVar) {
        while (true) {
            InputStream next = aVar.next();
            if (next == null) {
                return;
            } else {
                this.f16568c.add(next);
            }
        }
    }

    @Override // io.grpc.internal.r1.b
    public void c(boolean z10) {
        this.f16566a.f(new b(z10));
    }

    @Override // io.grpc.internal.r1.b
    public void d(int i10) {
        this.f16566a.f(new a(i10));
    }

    @Override // io.grpc.internal.r1.b
    public void e(Throwable th2) {
        this.f16566a.f(new c(th2));
    }

    public InputStream f() {
        return (InputStream) this.f16568c.poll();
    }
}
