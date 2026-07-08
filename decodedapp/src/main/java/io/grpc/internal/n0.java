package io.grpc.internal;

import java.io.InputStream;

/* JADX INFO: loaded from: classes3.dex */
abstract class n0 implements r {
    n0() {
    }

    @Override // io.grpc.internal.y2
    public boolean a() {
        return g().a();
    }

    @Override // io.grpc.internal.r
    public void b(qb.u1 u1Var) {
        g().b(u1Var);
    }

    @Override // io.grpc.internal.y2
    public void c(qb.n nVar) {
        g().c(nVar);
    }

    @Override // io.grpc.internal.y2
    public void d(InputStream inputStream) {
        g().d(inputStream);
    }

    @Override // io.grpc.internal.y2
    public void e(int i10) {
        g().e(i10);
    }

    @Override // io.grpc.internal.y2
    public void f() {
        g().f();
    }

    @Override // io.grpc.internal.y2
    public void flush() {
        g().flush();
    }

    protected abstract r g();

    @Override // io.grpc.internal.r
    public void k(int i10) {
        g().k(i10);
    }

    @Override // io.grpc.internal.r
    public void l(int i10) {
        g().l(i10);
    }

    @Override // io.grpc.internal.r
    public void m(qb.u uVar) {
        g().m(uVar);
    }

    @Override // io.grpc.internal.r
    public void n(String str) {
        g().n(str);
    }

    @Override // io.grpc.internal.r
    public void o(c1 c1Var) {
        g().o(c1Var);
    }

    @Override // io.grpc.internal.r
    public void p() {
        g().p();
    }

    @Override // io.grpc.internal.r
    public void q(qb.w wVar) {
        g().q(wVar);
    }

    @Override // io.grpc.internal.r
    public void r(s sVar) {
        g().r(sVar);
    }

    @Override // io.grpc.internal.r
    public void s(boolean z10) {
        g().s(z10);
    }

    public String toString() {
        return r9.g.b(this).d("delegate", g()).toString();
    }
}
