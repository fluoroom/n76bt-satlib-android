package io.grpc.internal;

import io.grpc.internal.r1;
import io.grpc.internal.z2;
import java.io.Closeable;

/* JADX INFO: loaded from: classes3.dex */
final class w2 extends q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final r1.b f17225a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f17226b;

    public w2(r1.b bVar) {
        this.f17225a = bVar;
    }

    @Override // io.grpc.internal.q0, io.grpc.internal.r1.b
    public void a(z2.a aVar) {
        if (!this.f17226b) {
            super.a(aVar);
        } else if (aVar instanceof Closeable) {
            w0.e((Closeable) aVar);
        }
    }

    @Override // io.grpc.internal.q0
    protected r1.b b() {
        return this.f17225a;
    }

    @Override // io.grpc.internal.q0, io.grpc.internal.r1.b
    public void c(boolean z10) {
        this.f17226b = true;
        super.c(z10);
    }

    @Override // io.grpc.internal.q0, io.grpc.internal.r1.b
    public void e(Throwable th2) {
        this.f17226b = true;
        super.e(th2);
    }
}
