package cd;

/* JADX INFO: loaded from: classes3.dex */
public class q extends p {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    protected byte[] f4663k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    protected byte[] f4664l;

    protected q(byte[] bArr, int i10) {
        this.f4663k = null;
        this.f4664l = null;
        this.f4659g = y.b(bArr, 4);
        this.f4660h = bArr;
        if (!super.a(i10) || this.f4657e != 204) {
            this.f4653a = -204;
            return;
        }
        if (this.f4658f > 1) {
            byte[] bArr2 = new byte[4];
            this.f4663k = bArr2;
            System.arraycopy(bArr, 8, bArr2, 0, 4);
        }
        int i11 = this.f4658f;
        if (i11 > 2) {
            byte[] bArr3 = new byte[((i11 + 1) * 4) - 12];
            this.f4664l = bArr3;
            System.arraycopy(bArr, 12, bArr3, 0, bArr3.length);
        }
    }

    protected void c() {
        this.f4660h = new byte[this.f4664l.length + 12];
        System.arraycopy(y.e(this.f4659g), 0, this.f4660h, 4, 4);
        System.arraycopy(this.f4663k, 0, this.f4660h, 8, 4);
        byte[] bArr = this.f4664l;
        System.arraycopy(bArr, 0, this.f4660h, 12, bArr.length);
        b();
    }
}
