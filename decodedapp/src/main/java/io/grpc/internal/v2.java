package io.grpc.internal;

import io.grpc.internal.u2;

/* JADX INFO: loaded from: classes3.dex */
public final class v2 implements x1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final u2.d f17182a;

    private v2(u2.d dVar) {
        this.f17182a = dVar;
    }

    public static v2 c(u2.d dVar) {
        return new v2(dVar);
    }

    @Override // io.grpc.internal.x1
    public Object a() {
        return u2.d(this.f17182a);
    }

    @Override // io.grpc.internal.x1
    public Object b(Object obj) {
        u2.f(this.f17182a, obj);
        return null;
    }
}
