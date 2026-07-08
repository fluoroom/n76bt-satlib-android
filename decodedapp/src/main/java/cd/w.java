package cd;

import com.facebook.stetho.server.http.HttpStatus;

/* JADX INFO: loaded from: classes3.dex */
public class w extends p {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    protected long f4692k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    protected long f4693l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    protected long f4694m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    protected long f4695n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    protected long f4696o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    protected t f4697p;

    protected w(long j10, long j11, long j12, t tVar) {
        this.f4692k = -1L;
        this.f4693l = -1L;
        this.f4694m = -1L;
        this.f4659g = j10;
        this.f4657e = HttpStatus.HTTP_OK;
        this.f4695n = j11;
        this.f4696o = j12;
        this.f4697p = tVar;
    }

    protected void c() {
        t tVar = this.f4697p;
        if (tVar != null) {
            this.f4656d = tVar.f4677k.length;
            byte[] bArrD = tVar.d();
            byte[] bArr = new byte[bArrD.length + 28];
            this.f4660h = bArr;
            System.arraycopy(bArrD, 0, bArr, 28, bArrD.length);
        } else {
            this.f4656d = 0;
            this.f4660h = new byte[28];
        }
        super.b();
        this.f4692k = (System.currentTimeMillis() / 1000) + 2208988800L;
        this.f4693l = (long) (((r0 % 1000) / 1000.0d) * 4.294967295E9d);
        this.f4694m = System.currentTimeMillis();
        System.arraycopy(y.e(this.f4659g), 0, this.f4660h, 4, 4);
        System.arraycopy(y.e(this.f4692k), 0, this.f4660h, 8, 4);
        System.arraycopy(y.e(this.f4693l), 0, this.f4660h, 12, 4);
        System.arraycopy(y.e(this.f4694m), 0, this.f4660h, 16, 4);
        System.arraycopy(y.e(this.f4695n), 0, this.f4660h, 20, 4);
        System.arraycopy(y.e(this.f4696o), 0, this.f4660h, 24, 4);
    }

    protected w(byte[] bArr, int i10, int i11) {
        this.f4692k = -1L;
        this.f4693l = -1L;
        this.f4694m = -1L;
        this.f4695n = -1L;
        this.f4696o = -1L;
        this.f4697p = null;
        this.f4660h = bArr;
        if (super.a(i10) && this.f4657e == 200) {
            this.f4659g = y.b(bArr, i10 + 4);
            if (i11 > 11) {
                this.f4692k = y.b(bArr, i10 + 8);
            }
            if (i11 > 15) {
                this.f4693l = y.b(bArr, i10 + 12);
            }
            if (i11 > 19) {
                this.f4694m = y.b(bArr, i10 + 16);
            }
            if (i11 > 23) {
                this.f4695n = y.b(bArr, i10 + 20);
            }
            if (i11 > 27) {
                this.f4696o = y.b(bArr, i10 + 24);
            }
            int i12 = this.f4656d;
            if (i12 > 0) {
                this.f4697p = new t(this.f4660h, i10, i12);
                return;
            }
            return;
        }
        this.f4653a = -200;
    }
}
