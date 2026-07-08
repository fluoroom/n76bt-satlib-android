package io.grpc.internal;

import qb.g1;

/* JADX INFO: loaded from: classes3.dex */
abstract class s0 extends qb.g1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final qb.g1 f17110b;

    s0(qb.g1 g1Var) {
        r9.l.o(g1Var, "delegate can not be null");
        this.f17110b = g1Var;
    }

    @Override // qb.g1
    public String c() {
        return this.f17110b.c();
    }

    @Override // qb.g1
    public void d() {
        this.f17110b.d();
    }

    @Override // qb.g1
    public void e() {
        this.f17110b.e();
    }

    @Override // qb.g1
    public void f(g1.d dVar) {
        this.f17110b.f(dVar);
    }

    public String toString() {
        return r9.g.b(this).d("delegate", this.f17110b).toString();
    }
}
