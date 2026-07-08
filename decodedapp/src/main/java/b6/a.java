package b6;

/* JADX INFO: loaded from: classes.dex */
public class a extends b {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final byte[] f3685g;

    public a(int i10) {
        super(i10);
        this.f3685g = new byte[i10];
    }

    public int k(byte b10) {
        int iMin = Math.min(this.f3685g.length, c() + this.f3691f);
        for (int i10 = this.f3691f; i10 < iMin; i10++) {
            if (this.f3685g[i10] == b10) {
                return i10 - this.f3691f;
            }
        }
        int iC = c() - (this.f3685g.length - this.f3691f);
        for (int i11 = 0; i11 < iC; i11++) {
            byte[] bArr = this.f3685g;
            if (bArr[i11] == b10) {
                return i11 + (bArr.length - this.f3691f);
            }
        }
        return -1;
    }

    public synchronized int l(byte[] bArr, int i10, int i11) {
        try {
            if (i11 > c()) {
                i11 = c();
            }
            int iMin = Math.min(this.f3685g.length - this.f3691f, i11);
            System.arraycopy(this.f3685g, this.f3691f, bArr, i10, iMin);
            int i12 = this.f3691f + iMin;
            this.f3691f = i12;
            byte[] bArr2 = this.f3685g;
            int length = i12 % bArr2.length;
            this.f3691f = length;
            if (iMin < i11) {
                int i13 = i10 + iMin;
                int i14 = i11 - iMin;
                System.arraycopy(bArr2, length, bArr, i13, i14);
                this.f3691f += i14;
            } else {
                i11 = iMin;
            }
            g(c() - i11);
        } catch (Throwable th2) {
            throw th2;
        }
        return i11;
    }

    public synchronized int m(byte[] bArr, int i10, int i11) {
        try {
            if (i11 > this.f3685g.length - c()) {
                i11 = this.f3685g.length - c();
            }
            int iMin = Math.min(this.f3685g.length - this.f3690e, i11);
            System.arraycopy(bArr, i10, this.f3685g, this.f3690e, iMin);
            int i12 = this.f3690e + iMin;
            this.f3690e = i12;
            byte[] bArr2 = this.f3685g;
            int length = i12 % bArr2.length;
            this.f3690e = length;
            if (iMin < i11) {
                int i13 = i10 + iMin;
                int i14 = i11 - iMin;
                System.arraycopy(bArr, i13, bArr2, length, i14);
                this.f3690e += i14;
            } else {
                i11 = iMin;
            }
            g(c() + i11);
        } catch (Throwable th2) {
            throw th2;
        }
        return i11;
    }
}
