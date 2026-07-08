package xb;

import qb.z0;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a extends qb.k {
    @Override // qb.y1
    public void a(int i10) {
        p().a(i10);
    }

    @Override // qb.y1
    public void b(int i10, long j10, long j11) {
        p().b(i10, j10, j11);
    }

    @Override // qb.y1
    public void c(long j10) {
        p().c(j10);
    }

    @Override // qb.y1
    public void d(long j10) {
        p().d(j10);
    }

    @Override // qb.y1
    public void e(int i10) {
        p().e(i10);
    }

    @Override // qb.y1
    public void f(int i10, long j10, long j11) {
        p().f(i10, j10, j11);
    }

    @Override // qb.y1
    public void g(long j10) {
        p().g(j10);
    }

    @Override // qb.y1
    public void h(long j10) {
        p().h(j10);
    }

    @Override // qb.k
    public void j() {
        p().j();
    }

    @Override // qb.k
    public void k() {
        p().k();
    }

    @Override // qb.k
    public void l(z0 z0Var) {
        p().l(z0Var);
    }

    @Override // qb.k
    public void m(z0 z0Var) {
        p().m(z0Var);
    }

    @Override // qb.k
    public void n() {
        p().n();
    }

    @Override // qb.k
    public void o(qb.a aVar, z0 z0Var) {
        p().o(aVar, z0Var);
    }

    protected abstract qb.k p();

    public String toString() {
        return r9.g.b(this).d("delegate", p()).toString();
    }
}
