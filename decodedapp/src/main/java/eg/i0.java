package eg;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class i0 extends l2 implements ig.g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final c1 f12108b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final c1 f12109c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(c1 c1Var, c1 c1Var2) {
        super(null);
        rd.m.e(c1Var, "lowerBound");
        rd.m.e(c1Var2, "upperBound");
        this.f12108b = c1Var;
        this.f12109c = c1Var2;
    }

    @Override // eg.r0
    public List L0() {
        return U0().L0();
    }

    @Override // eg.r0
    public q1 M0() {
        return U0().M0();
    }

    @Override // eg.r0
    public u1 N0() {
        return U0().N0();
    }

    @Override // eg.r0
    public boolean O0() {
        return U0().O0();
    }

    public abstract c1 U0();

    public final c1 V0() {
        return this.f12108b;
    }

    public final c1 W0() {
        return this.f12109c;
    }

    public abstract String X0(pf.n nVar, pf.w wVar);

    @Override // eg.r0
    public xf.k p() {
        return U0().p();
    }

    public String toString() {
        return pf.n.f24183k.S(this);
    }
}
