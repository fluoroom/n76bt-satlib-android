package vh;

/* JADX INFO: loaded from: classes3.dex */
public abstract class n implements n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final n0 f30837a;

    public n(n0 n0Var) {
        rd.m.e(n0Var, "delegate");
        this.f30837a = n0Var;
    }

    @Override // vh.n0
    public long N(e eVar, long j10) {
        rd.m.e(eVar, "sink");
        return this.f30837a.N(eVar, j10);
    }

    public final n0 a() {
        return this.f30837a;
    }

    @Override // vh.n0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f30837a.close();
    }

    @Override // vh.n0
    public o0 i() {
        return this.f30837a.i();
    }

    public String toString() {
        return getClass().getSimpleName() + '(' + this.f30837a + ')';
    }
}
