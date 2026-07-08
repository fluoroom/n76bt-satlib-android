package qb;

/* JADX INFO: loaded from: classes3.dex */
public abstract class z extends w0 {
    protected z() {
    }

    @Override // qb.w0
    public v0 a() {
        return f().a();
    }

    @Override // qb.w0
    public w0 d(String str) {
        f().d(str);
        return g();
    }

    protected abstract w0 f();

    public String toString() {
        return r9.g.b(this).d("delegate", f()).toString();
    }

    private w0 g() {
        return this;
    }
}
