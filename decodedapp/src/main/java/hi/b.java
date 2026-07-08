package hi;

/* JADX INFO: loaded from: classes3.dex */
public abstract class b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private e f15425c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private byte[] f15426d;

    protected b(e eVar) {
        this.f15425c = eVar;
    }

    public byte[] a() {
        byte[] bArr = this.f15426d;
        if (bArr != null) {
            return bArr;
        }
        e eVar = this.f15425c;
        if (eVar != null) {
            return eVar.a();
        }
        return null;
    }

    public void b(byte[] bArr) {
        this.f15426d = bArr;
    }

    public e c() {
        e eVar = new e(a());
        this.f15425c = eVar;
        return eVar;
    }

    protected b() {
        this.f15425c = null;
    }
}
