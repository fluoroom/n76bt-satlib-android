package xb;

import java.util.List;
import qb.q0;

/* JADX INFO: loaded from: classes3.dex */
public abstract class d extends q0.j {
    @Override // qb.q0.j
    public List b() {
        return j().b();
    }

    @Override // qb.q0.j
    public qb.a c() {
        return j().c();
    }

    @Override // qb.q0.j
    public qb.f d() {
        return j().d();
    }

    @Override // qb.q0.j
    public Object e() {
        return j().e();
    }

    @Override // qb.q0.j
    public void f() {
        j().f();
    }

    @Override // qb.q0.j
    public void g() {
        j().g();
    }

    @Override // qb.q0.j
    public void h(q0.l lVar) {
        j().h(lVar);
    }

    @Override // qb.q0.j
    public void i(List list) {
        j().i(list);
    }

    protected abstract q0.j j();

    public String toString() {
        return r9.g.b(this).d("delegate", j()).toString();
    }
}
