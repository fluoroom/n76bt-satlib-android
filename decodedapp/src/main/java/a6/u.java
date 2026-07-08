package a6;

/* JADX INFO: loaded from: classes.dex */
public class u implements Cloneable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long[] f346a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f347b;

    public u() {
        this(10);
    }

    private static int a(long[] jArr, int i10, int i11, long j10) {
        int i12 = i11 + i10;
        int i13 = i10 - 1;
        int i14 = i12;
        while (i14 - i13 > 1) {
            int i15 = (i14 + i13) / 2;
            if (jArr[i15] < j10) {
                i13 = i15;
            } else {
                i14 = i15;
            }
        }
        return i14 == i12 ? ~i12 : jArr[i14] == j10 ? i14 : ~i14;
    }

    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public u clone() {
        try {
            u uVar = (u) super.clone();
            try {
                uVar.f346a = (long[]) this.f346a.clone();
                return uVar;
            } catch (CloneNotSupportedException unused) {
                return uVar;
            }
        } catch (CloneNotSupportedException unused2) {
            return null;
        }
    }

    public boolean d(long j10) {
        return a(this.f346a, 0, this.f347b, j10) >= 0;
    }

    public long[] f() {
        int i10 = this.f347b;
        long[] jArr = new long[i10];
        System.arraycopy(this.f346a, 0, jArr, 0, i10);
        return jArr;
    }

    public boolean g(long j10) {
        int iA = a(this.f346a, 0, this.f347b, j10);
        if (iA >= 0) {
            return false;
        }
        int i10 = ~iA;
        int i11 = this.f347b;
        if (i11 >= this.f346a.length) {
            long[] jArr = new long[g.b(i11 + 1)];
            long[] jArr2 = this.f346a;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            this.f346a = jArr;
        }
        int i12 = this.f347b;
        if (i12 - i10 != 0) {
            long[] jArr3 = this.f346a;
            System.arraycopy(jArr3, i10, jArr3, i10 + 1, i12 - i10);
        }
        this.f346a[i10] = j10;
        this.f347b++;
        return true;
    }

    public int h() {
        return this.f347b;
    }

    public boolean i(long j10) {
        int iA = a(this.f346a, 0, this.f347b, j10);
        if (iA >= 0) {
            long[] jArr = this.f346a;
            int i10 = iA + 1;
            System.arraycopy(jArr, i10, jArr, iA, this.f347b - i10);
            this.f347b--;
            return false;
        }
        int i11 = ~iA;
        int i12 = this.f347b;
        if (i12 >= this.f346a.length) {
            long[] jArr2 = new long[g.b(i12 + 1)];
            long[] jArr3 = this.f346a;
            System.arraycopy(jArr3, 0, jArr2, 0, jArr3.length);
            this.f346a = jArr2;
        }
        int i13 = this.f347b;
        if (i13 - i11 != 0) {
            long[] jArr4 = this.f346a;
            System.arraycopy(jArr4, i11, jArr4, i11 + 1, i13 - i11);
        }
        this.f346a[i11] = j10;
        this.f347b++;
        return true;
    }

    public u(int i10) {
        this.f346a = new long[g.b(i10)];
        this.f347b = 0;
    }
}
