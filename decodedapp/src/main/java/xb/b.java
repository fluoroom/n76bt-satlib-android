package xb;

import qb.q0;
import qb.u1;

/* JADX INFO: loaded from: classes3.dex */
public abstract class b extends q0 {
    @Override // qb.q0
    public void b(u1 u1Var) {
        e().b(u1Var);
    }

    @Override // qb.q0
    public void c() {
        e().c();
    }

    protected abstract q0 e();

    public String toString() {
        return r9.g.b(this).d("delegate", e()).toString();
    }
}
