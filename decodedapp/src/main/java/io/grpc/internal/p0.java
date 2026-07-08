package io.grpc.internal;

import io.grpc.internal.q1;
import io.grpc.internal.t;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
abstract class p0 implements x {
    p0() {
    }

    protected abstract x a();

    @Override // io.grpc.internal.q1
    public void b(qb.u1 u1Var) {
        a().b(u1Var);
    }

    @Override // io.grpc.internal.q1
    public Runnable c(q1.a aVar) {
        return a().c(aVar);
    }

    @Override // qb.o0
    public qb.j0 e() {
        return a().e();
    }

    @Override // io.grpc.internal.q1
    public void f(qb.u1 u1Var) {
        a().f(u1Var);
    }

    @Override // io.grpc.internal.t
    public r g(qb.a1 a1Var, qb.z0 z0Var, qb.c cVar, qb.k[] kVarArr) {
        return a().g(a1Var, z0Var, cVar, kVarArr);
    }

    @Override // io.grpc.internal.x
    public qb.a getAttributes() {
        return a().getAttributes();
    }

    @Override // io.grpc.internal.t
    public void h(t.a aVar, Executor executor) {
        a().h(aVar, executor);
    }

    public String toString() {
        return r9.g.b(this).d("delegate", a()).toString();
    }
}
