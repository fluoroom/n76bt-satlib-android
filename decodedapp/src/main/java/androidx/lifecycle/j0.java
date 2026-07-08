package androidx.lifecycle;

import androidx.lifecycle.m;

/* JADX INFO: loaded from: classes.dex */
public final class j0 implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final n0 f2638a;

    public j0(n0 n0Var) {
        rd.m.e(n0Var, "provider");
        this.f2638a = n0Var;
    }

    @Override // androidx.lifecycle.q
    public void k(t tVar, m.a aVar) {
        rd.m.e(tVar, "source");
        rd.m.e(aVar, "event");
        if (aVar == m.a.ON_CREATE) {
            tVar.S0().d(this);
            this.f2638a.e();
        } else {
            throw new IllegalStateException(("Next event must be ON_CREATE, it was " + aVar).toString());
        }
    }
}
