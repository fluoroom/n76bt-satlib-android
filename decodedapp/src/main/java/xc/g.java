package xc;

/* JADX INFO: loaded from: classes3.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final float f31966a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f31967b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f31968c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f31969d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    Object[] f31970e;

    public g() {
        this(16, 0.75f);
    }

    static int c(int i10) {
        int i11 = i10 * (-1640531527);
        return i11 ^ (i11 >>> 16);
    }

    public boolean a(Object obj) {
        Object obj2;
        Object[] objArr = this.f31970e;
        int i10 = this.f31967b;
        int iC = c(obj.hashCode()) & i10;
        Object obj3 = objArr[iC];
        if (obj3 != null) {
            if (obj3.equals(obj)) {
                return false;
            }
            do {
                iC = (iC + 1) & i10;
                obj2 = objArr[iC];
                if (obj2 == null) {
                }
            } while (!obj2.equals(obj));
            return false;
        }
        objArr[iC] = obj;
        int i11 = this.f31968c + 1;
        this.f31968c = i11;
        if (i11 >= this.f31969d) {
            d();
        }
        return true;
    }

    public Object[] b() {
        return this.f31970e;
    }

    void d() {
        Object obj;
        Object[] objArr = this.f31970e;
        int length = objArr.length;
        int i10 = length << 1;
        int i11 = i10 - 1;
        Object[] objArr2 = new Object[i10];
        int i12 = this.f31968c;
        while (true) {
            int i13 = i12 - 1;
            if (i12 == 0) {
                this.f31967b = i11;
                this.f31969d = (int) (i10 * this.f31966a);
                this.f31970e = objArr2;
                return;
            }
            do {
                length--;
                obj = objArr[length];
            } while (obj == null);
            int iC = c(obj.hashCode()) & i11;
            if (objArr2[iC] != null) {
                do {
                    iC = (iC + 1) & i11;
                } while (objArr2[iC] != null);
            }
            objArr2[iC] = objArr[length];
            i12 = i13;
        }
    }

    public boolean e(Object obj) {
        Object obj2;
        Object[] objArr = this.f31970e;
        int i10 = this.f31967b;
        int iC = c(obj.hashCode()) & i10;
        Object obj3 = objArr[iC];
        if (obj3 == null) {
            return false;
        }
        if (obj3.equals(obj)) {
            return f(iC, objArr, i10);
        }
        do {
            iC = (iC + 1) & i10;
            obj2 = objArr[iC];
            if (obj2 == null) {
                return false;
            }
        } while (!obj2.equals(obj));
        return f(iC, objArr, i10);
    }

    boolean f(int i10, Object[] objArr, int i11) {
        int i12;
        Object obj;
        this.f31968c--;
        while (true) {
            int i13 = i10 + 1;
            while (true) {
                i12 = i13 & i11;
                obj = objArr[i12];
                if (obj == null) {
                    objArr[i10] = null;
                    return true;
                }
                int iC = c(obj.hashCode()) & i11;
                if (i10 <= i12) {
                    if (i10 >= iC || iC > i12) {
                        break;
                    }
                    i13 = i12 + 1;
                } else if (i10 < iC || iC <= i12) {
                    i13 = i12 + 1;
                }
            }
            objArr[i10] = obj;
            i10 = i12;
        }
    }

    public g(int i10, float f10) {
        this.f31966a = f10;
        int iA = h.a(i10);
        this.f31967b = iA - 1;
        this.f31969d = (int) (f10 * iA);
        this.f31970e = new Object[iA];
    }
}
