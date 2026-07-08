package vh;

/* JADX INFO: loaded from: classes3.dex */
public abstract class m implements l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final l0 f30836a;

    public m(l0 l0Var) {
        rd.m.e(l0Var, "delegate");
        this.f30836a = l0Var;
    }

    @Override // vh.l0
    public void C(e eVar, long j10) {
        rd.m.e(eVar, "source");
        this.f30836a.C(eVar, j10);
    }

    @Override // vh.l0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f30836a.close();
    }

    @Override // vh.l0, java.io.Flushable
    public void flush() {
        this.f30836a.flush();
    }

    @Override // vh.l0
    public o0 i() {
        return this.f30836a.i();
    }

    public String toString() {
        return getClass().getSimpleName() + '(' + this.f30836a + ')';
    }
}
