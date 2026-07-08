package tg;

/* JADX INFO: loaded from: classes3.dex */
public final class a2 extends xg.v {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ThreadLocal f27798e;
    private volatile boolean threadLocalIsSet;

    /* JADX WARN: Illegal instructions before constructor call */
    public a2(hd.i iVar, hd.e eVar) {
        b2 b2Var = b2.f27801a;
        super(iVar.a(b2Var) == null ? iVar.l(b2Var) : iVar, eVar);
        this.f27798e = new ThreadLocal();
        if (eVar.getContext().a(hd.f.f15241k) instanceof a0) {
            return;
        }
        Object objI = xg.e0.i(iVar, null);
        xg.e0.f(iVar, objI);
        C0(iVar, objI);
    }

    private final void B0() {
        if (this.threadLocalIsSet) {
            dd.q qVar = (dd.q) this.f27798e.get();
            if (qVar != null) {
                xg.e0.f((hd.i) qVar.a(), qVar.b());
            }
            this.f27798e.remove();
        }
    }

    public final boolean A0() {
        boolean z10 = this.threadLocalIsSet && this.f27798e.get() == null;
        this.f27798e.remove();
        return !z10;
    }

    public final void C0(hd.i iVar, Object obj) {
        this.threadLocalIsSet = true;
        this.f27798e.set(dd.w.a(iVar, obj));
    }

    @Override // xg.v, tg.a
    protected void v0(Object obj) {
        B0();
        Object objA = u.a(obj, this.f32147d);
        hd.e eVar = this.f32147d;
        hd.i context = eVar.getContext();
        Object objI = xg.e0.i(context, null);
        a2 a2VarM = objI != xg.e0.f32103a ? y.m(eVar, context, objI) : null;
        try {
            this.f32147d.d(objA);
            dd.d0 d0Var = dd.d0.f10897a;
            if (a2VarM == null || a2VarM.A0()) {
                xg.e0.f(context, objI);
            }
        } catch (Throwable th2) {
            if (a2VarM == null || a2VarM.A0()) {
                xg.e0.f(context, objI);
            }
            throw th2;
        }
    }

    @Override // xg.v
    public void z0() {
        B0();
    }
}
