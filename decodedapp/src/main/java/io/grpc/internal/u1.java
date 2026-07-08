package io.grpc.internal;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
final class u1 implements qb.e1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f17155a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final qb.c1 f17156b;

    u1(List list, qb.c1 c1Var) {
        this.f17155a = list;
        this.f17156b = c1Var;
    }

    @Override // qb.e1
    public void a(qb.u0 u0Var, long j10, List list, List list2) {
        qb.d1.b(this, u0Var, j10, list, list2);
        Iterator it = this.f17155a.iterator();
        if (it.hasNext()) {
            android.support.v4.media.session.b.a(it.next());
            throw null;
        }
    }

    @Override // qb.e1
    public void b(qb.t0 t0Var, long j10, List list, List list2) {
        qb.d1.a(this, t0Var, j10, list, list2);
        Iterator it = this.f17155a.iterator();
        if (it.hasNext()) {
            android.support.v4.media.session.b.a(it.next());
            throw null;
        }
    }
}
