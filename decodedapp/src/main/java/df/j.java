package df;

import eg.i2;
import eg.k2;
import eg.l2;

/* JADX INFO: loaded from: classes3.dex */
public final class j extends eg.a0 implements eg.z0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final eg.c1 f10994b;

    public j(eg.c1 c1Var) {
        rd.m.e(c1Var, "delegate");
        this.f10994b = c1Var;
    }

    private final eg.c1 Z0(eg.c1 c1Var) {
        eg.c1 c1VarR0 = c1Var.R0(false);
        return !jg.d.y(c1Var) ? c1VarR0 : new j(c1VarR0);
    }

    @Override // eg.w
    public boolean B0() {
        return true;
    }

    @Override // eg.a0, eg.r0
    public boolean O0() {
        return false;
    }

    @Override // eg.l2
    /* JADX INFO: renamed from: U0 */
    public eg.c1 R0(boolean z10) {
        return z10 ? W0().R0(true) : this;
    }

    @Override // eg.a0
    protected eg.c1 W0() {
        return this.f10994b;
    }

    @Override // eg.c1
    /* JADX INFO: renamed from: a1, reason: merged with bridge method [inline-methods] */
    public j T0(eg.q1 q1Var) {
        rd.m.e(q1Var, "newAttributes");
        return new j(W0().T0(q1Var));
    }

    @Override // eg.a0
    /* JADX INFO: renamed from: b1, reason: merged with bridge method [inline-methods] */
    public j Y0(eg.c1 c1Var) {
        rd.m.e(c1Var, "delegate");
        return new j(c1Var);
    }

    @Override // eg.w
    public eg.r0 f0(eg.r0 r0Var) {
        rd.m.e(r0Var, "replacement");
        l2 l2VarQ0 = r0Var.Q0();
        if (!jg.d.y(l2VarQ0) && !i2.l(l2VarQ0)) {
            return l2VarQ0;
        }
        if (l2VarQ0 instanceof eg.c1) {
            return Z0((eg.c1) l2VarQ0);
        }
        if (!(l2VarQ0 instanceof eg.i0)) {
            throw new dd.o();
        }
        eg.i0 i0Var = (eg.i0) l2VarQ0;
        return k2.d(eg.u0.e(Z0(i0Var.V0()), Z0(i0Var.W0())), k2.a(l2VarQ0));
    }
}
