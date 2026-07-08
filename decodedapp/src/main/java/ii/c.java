package ii;

/* JADX INFO: loaded from: classes3.dex */
public class c extends hi.b implements d {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private byte f16162e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f16163f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f16164g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f16165h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f16166i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f16167j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f16168k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private byte f16169l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private byte f16170m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private byte f16171n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private byte[] f16172o;

    public c() {
        this.f16162e = (byte) 1;
    }

    private void e() {
        byte b10 = this.f16162e;
        this.f16164g = b10 & 15;
        this.f16163f = b10 >> 4;
    }

    @Override // hi.b
    public hi.e c() {
        byte[] bArr = new byte[this.f16169l != 0 ? this.f16165h + 21 : 19];
        System.arraycopy(d.f16173a, 0, bArr, 0, 8);
        bArr[8] = this.f16162e;
        bArr[9] = (byte) this.f16165h;
        hi.c.i(bArr, 10, this.f16166i);
        hi.c.j(bArr, 12, this.f16167j);
        hi.c.i(bArr, 16, this.f16168k);
        byte b10 = this.f16169l;
        bArr[18] = b10;
        if (b10 != 0) {
            bArr[19] = this.f16170m;
            bArr[20] = this.f16171n;
            System.arraycopy(this.f16172o, 0, bArr, 21, this.f16165h);
        }
        b(bArr);
        return super.c();
    }

    public int d() {
        return (int) this.f16167j;
    }

    public void f(int i10) {
        this.f16165h = i10;
    }

    public void g(long j10) {
        this.f16167j = j10;
    }

    public c(hi.e eVar) {
        super(eVar);
        byte[] bArrA = a();
        if (hi.c.a(d.f16173a, bArrA, 0)) {
            this.f16162e = bArrA[8];
            e();
            if (this.f16163f == 0) {
                this.f16165h = bArrA[9];
                this.f16166i = hi.c.f(bArrA, 10);
                this.f16167j = hi.c.g(bArrA, 12);
                this.f16168k = hi.c.f(bArrA, 16);
                byte b10 = bArrA[18];
                this.f16169l = b10;
                if (b10 != 0) {
                    this.f16170m = bArrA[19];
                    this.f16171n = bArrA[20];
                    int i10 = this.f16165h;
                    byte[] bArr = new byte[i10];
                    this.f16172o = bArr;
                    System.arraycopy(bArrA, 21, bArr, 0, i10);
                    return;
                }
                return;
            }
            throw new IllegalArgumentException("Unsupported Opus version " + ((int) this.f16162e) + " at major version " + this.f16163f + " detected");
        }
        throw new IllegalArgumentException("Invalid type, not a Opus Header");
    }
}
