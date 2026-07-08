package eg;

/* JADX INFO: loaded from: classes3.dex */
public final class j0 extends i0 implements w {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f12117e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static boolean f12118f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f12119d;

    public static final class a {
        public /* synthetic */ a(rd.h hVar) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(c1 c1Var, c1 c1Var2) {
        super(c1Var, c1Var2);
        rd.m.e(c1Var, "lowerBound");
        rd.m.e(c1Var2, "upperBound");
    }

    private final void Z0() {
        if (!f12118f || this.f12119d) {
            return;
        }
        this.f12119d = true;
        l0.b(V0());
        l0.b(W0());
        rd.m.a(V0(), W0());
        fg.e.f13057a.a(V0(), W0());
    }

    @Override // eg.w
    public boolean B0() {
        return (V0().N0().q() instanceof he.l1) && rd.m.a(V0().N0(), W0().N0());
    }

    @Override // eg.l2
    public l2 R0(boolean z10) {
        return u0.e(V0().R0(z10), W0().R0(z10));
    }

    @Override // eg.l2
    public l2 T0(q1 q1Var) {
        rd.m.e(q1Var, "newAttributes");
        return u0.e(V0().T0(q1Var), W0().T0(q1Var));
    }

    @Override // eg.i0
    public c1 U0() {
        Z0();
        return V0();
    }

    @Override // eg.i0
    public String X0(pf.n nVar, pf.w wVar) {
        rd.m.e(nVar, "renderer");
        rd.m.e(wVar, "options");
        if (!wVar.l()) {
            return nVar.P(nVar.S(V0()), nVar.S(W0()), jg.d.n(this));
        }
        return '(' + nVar.S(V0()) + ".." + nVar.S(W0()) + ')';
    }

    @Override // eg.l2
    /* JADX INFO: renamed from: Y0, reason: merged with bridge method [inline-methods] */
    public i0 X0(fg.g gVar) {
        rd.m.e(gVar, "kotlinTypeRefiner");
        r0 r0VarA = gVar.a(V0());
        rd.m.c(r0VarA, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        r0 r0VarA2 = gVar.a(W0());
        rd.m.c(r0VarA2, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        return new j0((c1) r0VarA, (c1) r0VarA2);
    }

    @Override // eg.w
    public r0 f0(r0 r0Var) {
        l2 l2VarE;
        rd.m.e(r0Var, "replacement");
        l2 l2VarQ0 = r0Var.Q0();
        if (l2VarQ0 instanceof i0) {
            l2VarE = l2VarQ0;
        } else {
            if (!(l2VarQ0 instanceof c1)) {
                throw new dd.o();
            }
            c1 c1Var = (c1) l2VarQ0;
            l2VarE = u0.e(c1Var, c1Var.R0(true));
        }
        return k2.b(l2VarE, l2VarQ0);
    }

    @Override // eg.i0
    public String toString() {
        return '(' + V0() + ".." + W0() + ')';
    }
}
