package tg;

/* JADX INFO: loaded from: classes3.dex */
public abstract class k1 extends xg.l implements q0, b1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public l1 f27830d;

    @Override // tg.b1
    public boolean c() {
        return true;
    }

    @Override // tg.b1
    public p1 d() {
        return null;
    }

    @Override // tg.q0
    public void dispose() {
        u().j0(this);
    }

    @Override // xg.l
    public String toString() {
        return h0.a(this) + '@' + h0.b(this) + "[job@" + h0.b(u()) + ']';
    }

    public final l1 u() {
        l1 l1Var = this.f27830d;
        if (l1Var != null) {
            return l1Var;
        }
        rd.m.o("job");
        return null;
    }

    public abstract boolean v();

    public abstract void w(Throwable th2);

    public final void x(l1 l1Var) {
        this.f27830d = l1Var;
    }
}
