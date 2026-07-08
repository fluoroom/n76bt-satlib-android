package he;

/* JADX INFO: loaded from: classes3.dex */
public abstract class u {
    protected u() {
    }

    public final Integer a(u uVar) {
        rd.m.e(uVar, "visibility");
        return b().a(uVar.b());
    }

    public abstract w1 b();

    public abstract String c();

    public final boolean d() {
        return b().c();
    }

    public abstract boolean e(yf.g gVar, q qVar, m mVar, boolean z10);

    public abstract u f();

    public final String toString() {
        return b().toString();
    }
}
