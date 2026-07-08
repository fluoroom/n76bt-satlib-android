package hi;

/* JADX INFO: loaded from: classes3.dex */
public abstract class k extends b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected long f15461e;

    public k(e eVar) {
        super(eVar);
        this.f15461e = eVar.b();
    }

    public long d() {
        return this.f15461e;
    }

    public void e(long j10) {
        this.f15461e = j10;
    }

    public k(byte[] bArr) {
        b(bArr);
        this.f15461e = -1L;
    }
}
