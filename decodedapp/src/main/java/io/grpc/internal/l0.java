package io.grpc.internal;

import io.grpc.internal.s;

/* JADX INFO: loaded from: classes3.dex */
class l0 implements t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final qb.u1 f16677a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final s.a f16678b;

    l0(qb.u1 u1Var, s.a aVar) {
        r9.l.e(!u1Var.q(), "error must not be OK");
        this.f16677a = u1Var;
        this.f16678b = aVar;
    }

    @Override // qb.o0
    public qb.j0 e() {
        throw new UnsupportedOperationException("Not a real transport");
    }

    @Override // io.grpc.internal.t
    public r g(qb.a1 a1Var, qb.z0 z0Var, qb.c cVar, qb.k[] kVarArr) {
        return new k0(this.f16677a, this.f16678b, kVarArr);
    }
}
