package xb;

import java.util.concurrent.ScheduledExecutorService;
import qb.q;
import qb.q0;
import qb.z1;

/* JADX INFO: loaded from: classes3.dex */
public abstract class c extends q0.e {
    @Override // qb.q0.e
    public q0.j a(q0.b bVar) {
        return g().a(bVar);
    }

    @Override // qb.q0.e
    public qb.f b() {
        return g().b();
    }

    @Override // qb.q0.e
    public ScheduledExecutorService c() {
        return g().c();
    }

    @Override // qb.q0.e
    public z1 d() {
        return g().d();
    }

    @Override // qb.q0.e
    public void e() {
        g().e();
    }

    @Override // qb.q0.e
    public void f(q qVar, q0.k kVar) {
        g().f(qVar, kVar);
    }

    protected abstract q0.e g();

    public String toString() {
        return r9.g.b(this).d("delegate", g()).toString();
    }
}
