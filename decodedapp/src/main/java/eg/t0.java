package eg;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
class t0 implements qd.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final u1 f12177a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f12178b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final q1 f12179c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f12180d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final xf.k f12181e;

    public t0(u1 u1Var, List list, q1 q1Var, boolean z10, xf.k kVar) {
        this.f12177a = u1Var;
        this.f12178b = list;
        this.f12179c = q1Var;
        this.f12180d = z10;
        this.f12181e = kVar;
    }

    @Override // qd.l
    public Object l(Object obj) {
        return u0.o(this.f12177a, this.f12178b, this.f12179c, this.f12180d, this.f12181e, (fg.g) obj);
    }
}
