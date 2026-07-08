package cd;

/* JADX INFO: loaded from: classes3.dex */
public class r extends p {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    protected long[] f4665k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    protected byte[] f4666l;

    protected r(long[] jArr, byte[] bArr) {
        this.f4657e = 203;
        this.f4666l = bArr;
        this.f4665k = jArr;
        if (jArr.length < 1) {
            System.out.println("RtcpBYE.RtcpPktBYE(long[] ssrcs, byte[] aReason) requires at least one SSRC!");
        }
    }

    protected void c() {
        long[] jArr;
        long[] jArr2 = this.f4665k;
        this.f4656d = jArr2.length;
        int length = jArr2.length * 4;
        this.f4658f = length;
        byte[] bArr = this.f4666l;
        if (bArr != null) {
            int length2 = length + ((bArr.length + 1) / 4);
            this.f4658f = length2;
            if ((bArr.length + 1) % 4 != 0) {
                this.f4658f = length2 + 1;
            }
        }
        this.f4660h = new byte[(this.f4658f * 4) + 4];
        int i10 = 0;
        while (true) {
            jArr = this.f4665k;
            if (i10 >= jArr.length) {
                break;
            }
            System.arraycopy(y.e(jArr[i10]), 0, this.f4660h, (i10 * 4) + 4, 4);
            i10++;
        }
        byte[] bArr2 = this.f4666l;
        if (bArr2 != null) {
            byte[] bArr3 = this.f4660h;
            bArr3[(jArr.length * 4) + 4] = (byte) bArr2.length;
            System.arraycopy(bArr2, 0, bArr3, (i10 * 4) + 5, bArr2.length);
        }
        super.b();
    }

    protected r(byte[] bArr, int i10) {
        int i11;
        this.f4665k = null;
        this.f4666l = null;
        this.f4660h = bArr;
        if (super.a(i10) && this.f4657e == 203) {
            this.f4665k = new long[this.f4656d];
            int i12 = 0;
            while (true) {
                i11 = this.f4656d;
                if (i12 >= i11) {
                    break;
                }
                int i13 = i12 + 1;
                this.f4665k[i12] = y.b(bArr, (i13 * 4) + i10);
                i12 = i13;
            }
            if (this.f4658f > i11 + 1) {
                int i14 = bArr[((i11 + 1) * 4) + i10];
                byte[] bArr2 = new byte[i14];
                this.f4666l = bArr2;
                System.arraycopy(bArr, i10 + ((i11 + 1) * 4) + 1, bArr2, 0, i14);
                return;
            }
            return;
        }
        this.f4653a = -203;
    }
}
