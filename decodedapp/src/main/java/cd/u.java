package cd;

/* JADX INFO: loaded from: classes3.dex */
public class u extends p {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    protected boolean f4685k = false;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    protected long f4686l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    protected int[] f4687m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    protected int[] f4688n;

    protected u(byte[] bArr, int i10, o oVar) {
        this.f4686l = -1L;
        this.f4660h = bArr;
        if (!super.a(i10) || this.f4657e != 205 || this.f4658f < 2) {
            this.f4653a = -205;
            return;
        }
        long jB = y.b(bArr, i10 + 8);
        this.f4686l = jB;
        if (jB == oVar.f4633g) {
            this.f4659g = y.b(bArr, i10 + 4);
            int i11 = this.f4658f - 2;
            this.f4687m = new int[i11];
            this.f4688n = new int[i11];
            int i12 = 12;
            for (int i13 = 0; i13 < i11; i13++) {
                this.f4687m[i13] = y.a(bArr, i12);
                this.f4688n[i13] = y.a(bArr, i12 + 2);
                i12 += 4;
            }
            throw null;
        }
    }

    protected void c() {
        int i10 = 12;
        this.f4660h = new byte[(this.f4687m.length * 4) + 12];
        System.arraycopy(y.e(this.f4659g), 0, this.f4660h, 4, 4);
        System.arraycopy(y.e(this.f4686l), 0, this.f4660h, 8, 4);
        int i11 = 0;
        while (true) {
            int[] iArr = this.f4687m;
            if (i11 >= iArr.length) {
                b();
                return;
            }
            byte[] bArrD = y.d(iArr[i11]);
            byte[] bArr = this.f4660h;
            bArr[i10] = bArrD[0];
            bArr[i10 + 1] = bArrD[1];
            byte[] bArrD2 = y.d(this.f4688n[i11]);
            byte[] bArr2 = this.f4660h;
            int i12 = i10 + 3;
            bArr2[i10 + 2] = bArrD2[0];
            i10 += 4;
            bArr2[i12] = bArrD2[1];
            i11++;
        }
    }
}
