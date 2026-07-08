package eg;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
final class d1 extends c1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final u1 f12068b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List f12069c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f12070d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final xf.k f12071e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final qd.l f12072f;

    public d1(u1 u1Var, List list, boolean z10, xf.k kVar, qd.l lVar) {
        rd.m.e(u1Var, "constructor");
        rd.m.e(list, "arguments");
        rd.m.e(kVar, "memberScope");
        rd.m.e(lVar, "refinedTypeFactory");
        this.f12068b = u1Var;
        this.f12069c = list;
        this.f12070d = z10;
        this.f12071e = kVar;
        this.f12072f = lVar;
        if (!(p() instanceof gg.g) || (p() instanceof gg.m)) {
            return;
        }
        throw new IllegalStateException("SimpleTypeImpl should not be created for error type: " + p() + '\n' + N0());
    }

    @Override // eg.r0
    public List L0() {
        return this.f12069c;
    }

    @Override // eg.r0
    public q1 M0() {
        return q1.f12167b.k();
    }

    @Override // eg.r0
    public u1 N0() {
        return this.f12068b;
    }

    @Override // eg.r0
    public boolean O0() {
        return this.f12070d;
    }

    @Override // eg.l2
    /* JADX INFO: renamed from: U0 */
    public c1 R0(boolean z10) {
        return z10 == O0() ? this : z10 ? new a1(this) : new y0(this);
    }

    @Override // eg.l2
    /* JADX INFO: renamed from: V0 */
    public c1 T0(q1 q1Var) {
        rd.m.e(q1Var, "newAttributes");
        return q1Var.isEmpty() ? this : new e1(this, q1Var);
    }

    @Override // eg.l2
    /* JADX INFO: renamed from: W0, reason: merged with bridge method [inline-methods] */
    public c1 X0(fg.g gVar) {
        rd.m.e(gVar, "kotlinTypeRefiner");
        c1 c1Var = (c1) this.f12072f.l(gVar);
        return c1Var == null ? this : c1Var;
    }

    @Override // eg.r0
    public xf.k p() {
        return this.f12071e;
    }
}
