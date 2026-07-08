package io.grpc.internal;

import io.grpc.internal.s;
import io.grpc.internal.z2;

/* JADX INFO: loaded from: classes3.dex */
abstract class o0 implements s {
    o0() {
    }

    @Override // io.grpc.internal.z2
    public void a(z2.a aVar) {
        e().a(aVar);
    }

    @Override // io.grpc.internal.s
    public void b(qb.z0 z0Var) {
        e().b(z0Var);
    }

    @Override // io.grpc.internal.z2
    public void c() {
        e().c();
    }

    @Override // io.grpc.internal.s
    public void d(qb.u1 u1Var, s.a aVar, qb.z0 z0Var) {
        e().d(u1Var, aVar, z0Var);
    }

    protected abstract s e();

    public String toString() {
        return r9.g.b(this).d("delegate", e()).toString();
    }
}
