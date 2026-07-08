package qb;

/* JADX INFO: loaded from: classes3.dex */
abstract class j1 extends g {
    j1() {
    }

    @Override // qb.g
    public void b() {
        f().b();
    }

    @Override // qb.g
    public void c(int i10) {
        f().c(i10);
    }

    protected abstract g f();

    public String toString() {
        return r9.g.b(this).d("delegate", f()).toString();
    }
}
