package tg;

/* JADX INFO: loaded from: classes3.dex */
public abstract class s0 extends a0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f27868c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f27869d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ed.i f27870e;

    public static /* synthetic */ void A0(s0 s0Var, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: incrementUseCount");
        }
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        s0Var.z0(z10);
    }

    private final long w0(boolean z10) {
        return z10 ? 4294967296L : 1L;
    }

    public final boolean B0() {
        return this.f27868c >= w0(true);
    }

    public final boolean C0() {
        ed.i iVar = this.f27870e;
        if (iVar != null) {
            return iVar.isEmpty();
        }
        return true;
    }

    public final boolean D0() {
        n0 n0Var;
        ed.i iVar = this.f27870e;
        if (iVar == null || (n0Var = (n0) iVar.p()) == null) {
            return false;
        }
        n0Var.run();
        return true;
    }

    public abstract void shutdown();

    @Override // tg.a0
    public final a0 t0(int i10, String str) {
        xg.i.a(i10);
        return xg.i.b(this, str);
    }

    public final void v0(boolean z10) {
        long jW0 = this.f27868c - w0(z10);
        this.f27868c = jW0;
        if (jW0 <= 0 && this.f27869d) {
            shutdown();
        }
    }

    public final void x0(n0 n0Var) {
        ed.i iVar = this.f27870e;
        if (iVar == null) {
            iVar = new ed.i();
            this.f27870e = iVar;
        }
        iVar.addLast(n0Var);
    }

    protected long y0() {
        ed.i iVar = this.f27870e;
        return (iVar == null || iVar.isEmpty()) ? Long.MAX_VALUE : 0L;
    }

    public final void z0(boolean z10) {
        this.f27868c += w0(z10);
        if (z10) {
            return;
        }
        this.f27869d = true;
    }
}
