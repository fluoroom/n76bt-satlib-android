package eg;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class n2 extends r0 {
    public n2() {
        super(null);
    }

    @Override // eg.r0
    public List L0() {
        return R0().L0();
    }

    @Override // eg.r0
    public q1 M0() {
        return R0().M0();
    }

    @Override // eg.r0
    public u1 N0() {
        return R0().N0();
    }

    @Override // eg.r0
    public boolean O0() {
        return R0().O0();
    }

    @Override // eg.r0
    public final l2 Q0() {
        r0 r0VarR0 = R0();
        while (r0VarR0 instanceof n2) {
            r0VarR0 = ((n2) r0VarR0).R0();
        }
        rd.m.c(r0VarR0, "null cannot be cast to non-null type org.jetbrains.kotlin.types.UnwrappedType");
        return (l2) r0VarR0;
    }

    protected abstract r0 R0();

    public abstract boolean S0();

    @Override // eg.r0
    public xf.k p() {
        return R0().p();
    }

    public String toString() {
        return S0() ? R0().toString() : "<Not computed yet>";
    }
}
