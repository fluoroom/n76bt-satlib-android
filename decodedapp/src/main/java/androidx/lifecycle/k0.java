package androidx.lifecycle;

import androidx.lifecycle.m;

/* JADX INFO: loaded from: classes.dex */
public final class k0 implements q, AutoCloseable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f2639a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final i0 f2640b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f2641c;

    public k0(String str, i0 i0Var) {
        rd.m.e(str, "key");
        rd.m.e(i0Var, "handle");
        this.f2639a = str;
        this.f2640b = i0Var;
    }

    public final void a(l1.f fVar, m mVar) {
        rd.m.e(fVar, "registry");
        rd.m.e(mVar, "lifecycle");
        if (this.f2641c) {
            throw new IllegalStateException("Already attached to lifecycleOwner");
        }
        this.f2641c = true;
        mVar.a(this);
        fVar.c(this.f2639a, this.f2640b.a());
    }

    @Override // java.lang.AutoCloseable
    public void close() {
    }

    @Override // androidx.lifecycle.q
    public void k(t tVar, m.a aVar) {
        rd.m.e(tVar, "source");
        rd.m.e(aVar, "event");
        if (aVar == m.a.ON_DESTROY) {
            this.f2641c = false;
            tVar.S0().d(this);
        }
    }

    public final i0 n() {
        return this.f2640b;
    }

    public final boolean q() {
        return this.f2641c;
    }
}
