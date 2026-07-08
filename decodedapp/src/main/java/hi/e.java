package hi;

/* JADX INFO: loaded from: classes3.dex */
public class e extends f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private i f15432b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f15433c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f15434d;

    protected e(i iVar, byte[] bArr, boolean z10, boolean z11) {
        super(bArr);
        this.f15432b = iVar;
        this.f15433c = z10;
        this.f15434d = z11;
    }

    public long b() {
        return this.f15432b.i();
    }

    public int c() {
        return this.f15432b.m();
    }

    public boolean d() {
        return this.f15433c;
    }

    public boolean e() {
        return this.f15434d;
    }

    protected void f() {
        this.f15433c = true;
    }

    protected void g() {
        this.f15434d = true;
    }

    protected void h(i iVar) {
        this.f15432b = iVar;
    }

    public e(byte[] bArr) {
        super(bArr);
    }
}
