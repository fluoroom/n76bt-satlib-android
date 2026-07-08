package eg;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a0 extends c1 {
    @Override // eg.r0
    public List L0() {
        return W0().L0();
    }

    @Override // eg.r0
    public q1 M0() {
        return W0().M0();
    }

    @Override // eg.r0
    public u1 N0() {
        return W0().N0();
    }

    @Override // eg.r0
    public boolean O0() {
        return W0().O0();
    }

    protected abstract c1 W0();

    @Override // eg.l2
    public c1 X0(fg.g gVar) {
        rd.m.e(gVar, "kotlinTypeRefiner");
        r0 r0VarA = gVar.a(W0());
        rd.m.c(r0VarA, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        return Y0((c1) r0VarA);
    }

    public abstract a0 Y0(c1 c1Var);

    @Override // eg.r0
    public xf.k p() {
        return W0().p();
    }
}
