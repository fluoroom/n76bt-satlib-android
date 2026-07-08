package eg;

/* JADX INFO: loaded from: classes3.dex */
public final class y extends a0 implements w, ig.e {

    /* JADX INFO: renamed from: d */
    public static final a f12223d = new a(null);

    /* JADX INFO: renamed from: b */
    private final c1 f12224b;

    /* JADX INFO: renamed from: c */
    private final boolean f12225c;

    public static final class a {
        public /* synthetic */ a(rd.h hVar) {
            this();
        }

        private final boolean a(l2 l2Var) {
            l2Var.N0();
            return (l2Var.N0().q() instanceof he.l1) || (l2Var instanceof fg.i);
        }

        public static /* synthetic */ y c(a aVar, l2 l2Var, boolean z10, boolean z11, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                z10 = false;
            }
            if ((i10 & 4) != 0) {
                z11 = false;
            }
            return aVar.b(l2Var, z10, z11);
        }

        private final boolean d(l2 l2Var, boolean z10) {
            if (!a(l2Var)) {
                return false;
            }
            he.h hVarQ = l2Var.N0().q();
            ke.t0 t0Var = hVarQ instanceof ke.t0 ? (ke.t0) hVarQ : null;
            if (t0Var == null || t0Var.T0()) {
                return (z10 && (l2Var.N0().q() instanceof he.l1)) ? i2.l(l2Var) : !fg.r.f13083a.a(l2Var);
            }
            return true;
        }

        public final y b(l2 l2Var, boolean z10, boolean z11) {
            rd.m.e(l2Var, "type");
            if (l2Var instanceof y) {
                return (y) l2Var;
            }
            if (!z11 && !d(l2Var, z10)) {
                return null;
            }
            if (l2Var instanceof i0) {
                i0 i0Var = (i0) l2Var;
                rd.m.a(i0Var.V0().N0(), i0Var.W0().N0());
            }
            return new y(l0.c(l2Var).R0(false), z10, null);
        }

        private a() {
        }
    }

    public /* synthetic */ y(c1 c1Var, boolean z10, rd.h hVar) {
        this(c1Var, z10);
    }

    @Override // eg.w
    public boolean B0() {
        W0().N0();
        return W0().N0().q() instanceof he.l1;
    }

    @Override // eg.a0, eg.r0
    public boolean O0() {
        return false;
    }

    @Override // eg.l2
    /* JADX INFO: renamed from: U0 */
    public c1 R0(boolean z10) {
        return z10 ? W0().R0(z10) : this;
    }

    @Override // eg.l2
    /* JADX INFO: renamed from: V0 */
    public c1 T0(q1 q1Var) {
        rd.m.e(q1Var, "newAttributes");
        return new y(W0().T0(q1Var), this.f12225c);
    }

    @Override // eg.a0
    protected c1 W0() {
        return this.f12224b;
    }

    public final c1 Z0() {
        return this.f12224b;
    }

    @Override // eg.a0
    /* JADX INFO: renamed from: a1 */
    public y Y0(c1 c1Var) {
        rd.m.e(c1Var, "delegate");
        return new y(c1Var, this.f12225c);
    }

    @Override // eg.w
    public r0 f0(r0 r0Var) {
        rd.m.e(r0Var, "replacement");
        return g1.e(r0Var.Q0(), this.f12225c);
    }

    @Override // eg.c1
    public String toString() {
        return W0() + " & Any";
    }

    private y(c1 c1Var, boolean z10) {
        this.f12224b = c1Var;
        this.f12225c = z10;
    }
}
