package tg;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a extends l1 implements f1, hd.e, d0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final hd.i f27795c;

    public a(hd.i iVar, boolean z10, boolean z11) {
        super(z11);
        if (z10) {
            P((f1) iVar.a(f1.f27816q));
        }
        this.f27795c = iVar.l(this);
    }

    @Override // tg.d0
    public hd.i G() {
        return this.f27795c;
    }

    @Override // tg.l1
    public final void O(Throwable th2) {
        c0.a(this.f27795c, th2);
    }

    @Override // tg.l1
    public String Z() {
        String strG = y.g(this.f27795c);
        if (strG == null) {
            return super.Z();
        }
        return '\"' + strG + "\":" + super.Z();
    }

    @Override // tg.l1, tg.f1
    public boolean c() {
        return super.c();
    }

    @Override // hd.e
    public final void d(Object obj) {
        Object objY = Y(u.b(obj));
        if (objY == m1.f27846b) {
            return;
        }
        v0(objY);
    }

    @Override // tg.l1
    protected final void e0(Object obj) {
        if (!(obj instanceof s)) {
            x0(obj);
        } else {
            s sVar = (s) obj;
            w0(sVar.f27867a, sVar.a());
        }
    }

    @Override // hd.e
    public final hd.i getContext() {
        return this.f27795c;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // tg.l1
    public String t() {
        return h0.a(this) + " was cancelled";
    }

    protected void v0(Object obj) {
        i(obj);
    }

    public final void y0(f0 f0Var, Object obj, qd.p pVar) {
        f0Var.d(pVar, obj, this);
    }

    protected void x0(Object obj) {
    }

    protected void w0(Throwable th2, boolean z10) {
    }
}
