package b6;

/* JADX INFO: loaded from: classes.dex */
public class d extends b {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private short[] f3693g;

    public d(int i10) {
        super(i10);
        this.f3693g = new short[i10];
    }

    public short[] k() {
        return this.f3693g;
    }

    public synchronized int l(short[] sArr, int i10, int i11) {
        try {
            if (i11 > c()) {
                i11 = c();
            }
            int iMin = Math.min(this.f3693g.length - this.f3691f, i11);
            System.arraycopy(this.f3693g, this.f3691f, sArr, i10, iMin);
            int i12 = this.f3691f + iMin;
            this.f3691f = i12;
            short[] sArr2 = this.f3693g;
            int length = i12 % sArr2.length;
            this.f3691f = length;
            if (iMin < i11) {
                int i13 = i10 + iMin;
                int i14 = i11 - iMin;
                System.arraycopy(sArr2, length, sArr, i13, i14);
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

    public synchronized void m(int i10) {
        if (i10 == this.f3693g.length) {
            return;
        }
        short[] sArr = new short[i10];
        int iL = l(sArr, 0, Math.min(i10, c()));
        this.f3693g = sArr;
        this.f3688c = i10;
        this.f3691f = 0;
        this.f3690e = iL;
        g(iL);
    }

    public int n(short[] sArr) {
        return o(sArr, 0, sArr.length);
    }

    public synchronized int o(short[] sArr, int i10, int i11) {
        try {
            if (i11 > this.f3693g.length - c()) {
                i11 = this.f3693g.length - c();
            }
            int iMin = Math.min(this.f3693g.length - this.f3690e, i11);
            System.arraycopy(sArr, i10, this.f3693g, this.f3690e, iMin);
            int i12 = this.f3690e + iMin;
            this.f3690e = i12;
            short[] sArr2 = this.f3693g;
            int length = i12 % sArr2.length;
            this.f3690e = length;
            if (iMin < i11) {
                int i13 = i10 + iMin;
                int i14 = i11 - iMin;
                System.arraycopy(sArr, i13, sArr2, length, i14);
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
