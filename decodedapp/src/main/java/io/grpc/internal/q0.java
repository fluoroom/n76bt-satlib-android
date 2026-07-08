package io.grpc.internal;

import io.grpc.internal.r1;
import io.grpc.internal.z2;

/* JADX INFO: loaded from: classes3.dex */
abstract class q0 implements r1.b {
    q0() {
    }

    @Override // io.grpc.internal.r1.b
    public void a(z2.a aVar) {
        b().a(aVar);
    }

    protected abstract r1.b b();

    @Override // io.grpc.internal.r1.b
    public void c(boolean z10) {
        b().c(z10);
    }

    @Override // io.grpc.internal.r1.b
    public void d(int i10) {
        b().d(i10);
    }

    @Override // io.grpc.internal.r1.b
    public void e(Throwable th2) {
        b().e(th2);
    }
}
