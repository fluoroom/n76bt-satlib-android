package ef;

import he.g1;
import he.h1;

/* JADX INFO: loaded from: classes3.dex */
public final class y implements g1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ze.d0 f12053b;

    public y(ze.d0 d0Var) {
        rd.m.e(d0Var, "packageFragment");
        this.f12053b = d0Var;
    }

    @Override // he.g1
    public h1 a() {
        h1 h1Var = h1.f15282a;
        rd.m.d(h1Var, "NO_SOURCE_FILE");
        return h1Var;
    }

    public String toString() {
        return this.f12053b + ": " + this.f12053b.O0().keySet();
    }
}
