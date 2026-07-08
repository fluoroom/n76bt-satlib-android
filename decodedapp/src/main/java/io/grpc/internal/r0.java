package io.grpc.internal;

/* JADX INFO: loaded from: classes3.dex */
abstract class r0 extends qb.v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final qb.v0 f17074a;

    r0(qb.v0 v0Var) {
        this.f17074a = v0Var;
    }

    @Override // qb.d
    public String a() {
        return this.f17074a.a();
    }

    @Override // qb.d
    public qb.g d(qb.a1 a1Var, qb.c cVar) {
        return this.f17074a.d(a1Var, cVar);
    }

    @Override // qb.v0
    public qb.q i(boolean z10) {
        return this.f17074a.i(z10);
    }

    @Override // qb.v0
    public void j(qb.q qVar, Runnable runnable) {
        this.f17074a.j(qVar, runnable);
    }

    @Override // qb.v0
    public void k() {
        this.f17074a.k();
    }

    @Override // qb.v0
    public qb.v0 l() {
        return this.f17074a.l();
    }

    public String toString() {
        return r9.g.b(this).d("delegate", this.f17074a).toString();
    }
}
