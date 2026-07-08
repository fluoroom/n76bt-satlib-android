package qf;

import eg.u1;
import fg.e;

/* JADX INFO: loaded from: classes3.dex */
class e implements e.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f25123a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final he.a f25124b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final he.a f25125c;

    public e(boolean z10, he.a aVar, he.a aVar2) {
        this.f25123a = z10;
        this.f25124b = aVar;
        this.f25125c = aVar2;
    }

    @Override // fg.e.a
    public boolean a(u1 u1Var, u1 u1Var2) {
        return g.h(this.f25123a, this.f25124b, this.f25125c, u1Var, u1Var2);
    }
}
