package b6;

/* JADX INFO: loaded from: classes.dex */
public class c extends b {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Object[] f3692g;

    public c(Object[] objArr) {
        super(objArr.length);
        this.f3692g = objArr;
    }

    public synchronized Object k(int i10) {
        int i11;
        Object[] objArr;
        if (i10 >= c() || i10 < 0) {
            throw new ArrayIndexOutOfBoundsException();
        }
        i11 = i10 + this.f3691f;
        objArr = this.f3692g;
        return objArr[i11 % objArr.length];
    }

    public synchronized int l(Object[] objArr, int i10, int i11) {
        try {
            if (i11 > c()) {
                i11 = c();
            }
            int iMin = Math.min(this.f3692g.length - this.f3691f, i11);
            System.arraycopy(this.f3692g, this.f3691f, objArr, i10, iMin);
            int i12 = this.f3691f + iMin;
            this.f3691f = i12;
            Object[] objArr2 = this.f3692g;
            int length = i12 % objArr2.length;
            this.f3691f = length;
            if (iMin < i11) {
                int i13 = i10 + iMin;
                int i14 = i11 - iMin;
                System.arraycopy(objArr2, length, objArr, i13, i14);
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

    public synchronized Object m() {
        if (c() < 1) {
            return null;
        }
        Object[] objArr = this.f3692g;
        int i10 = this.f3691f;
        Object obj = objArr[i10];
        int i11 = i10 + 1;
        this.f3691f = i11;
        this.f3691f = i11 % objArr.length;
        g(c() - 1);
        return obj;
    }

    public synchronized boolean n(Object obj) {
        if (b() == 0) {
            return false;
        }
        Object[] objArr = this.f3692g;
        int i10 = this.f3690e;
        int i11 = i10 + 1;
        this.f3690e = i11;
        objArr[i10] = obj;
        this.f3690e = i11 % objArr.length;
        g(c() + 1);
        return true;
    }
}
