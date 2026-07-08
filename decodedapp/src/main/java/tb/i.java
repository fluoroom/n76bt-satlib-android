package tb;

/* JADX INFO: loaded from: classes3.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f27765a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f27766b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f27767c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int[] f27768d = new int[10];

    public int a(int i10) {
        return this.f27768d[i10];
    }

    int b() {
        if ((this.f27765a & 2) != 0) {
            return this.f27768d[1];
        }
        return -1;
    }

    int c(int i10) {
        return (this.f27765a & 32) != 0 ? this.f27768d[5] : i10;
    }

    public boolean d(int i10) {
        return ((1 << i10) & this.f27765a) != 0;
    }

    public i e(int i10, int i11, int i12) {
        int[] iArr = this.f27768d;
        if (i10 >= iArr.length) {
            return this;
        }
        int i13 = 1 << i10;
        this.f27765a |= i13;
        if ((i11 & 1) != 0) {
            this.f27766b |= i13;
        } else {
            this.f27766b &= ~i13;
        }
        if ((i11 & 2) != 0) {
            this.f27767c |= i13;
        } else {
            this.f27767c &= ~i13;
        }
        iArr[i10] = i12;
        return this;
    }

    int f() {
        return Integer.bitCount(this.f27765a);
    }
}
