package eg;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
class s0 implements qd.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final u1 f12171a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f12172b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final q1 f12173c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f12174d;

    public s0(u1 u1Var, List list, q1 q1Var, boolean z10) {
        this.f12171a = u1Var;
        this.f12172b = list;
        this.f12173c = q1Var;
        this.f12174d = z10;
    }

    @Override // qd.l
    public Object l(Object obj) {
        return u0.l(this.f12171a, this.f12172b, this.f12173c, this.f12174d, (fg.g) obj);
    }
}
