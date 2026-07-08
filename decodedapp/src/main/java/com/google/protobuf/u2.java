package com.google.protobuf;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class u2 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final u2 f10118f = new u2(0, new int[0], new Object[0], false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f10119a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int[] f10120b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Object[] f10121c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f10122d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f10123e;

    private u2() {
        this(0, new int[8], new Object[8], true);
    }

    private void b(int i10) {
        int[] iArr = this.f10120b;
        if (i10 > iArr.length) {
            int i11 = this.f10119a;
            int i12 = i11 + (i11 / 2);
            if (i12 >= i10) {
                i10 = i12;
            }
            if (i10 < 8) {
                i10 = 8;
            }
            this.f10120b = Arrays.copyOf(iArr, i10);
            this.f10121c = Arrays.copyOf(this.f10121c, i10);
        }
    }

    public static u2 c() {
        return f10118f;
    }

    private static int f(int[] iArr, int i10) {
        int i11 = 17;
        for (int i12 = 0; i12 < i10; i12++) {
            i11 = (i11 * 31) + iArr[i12];
        }
        return i11;
    }

    private static int g(Object[] objArr, int i10) {
        int iHashCode = 17;
        for (int i11 = 0; i11 < i10; i11++) {
            iHashCode = (iHashCode * 31) + objArr[i11].hashCode();
        }
        return iHashCode;
    }

    static u2 j(u2 u2Var, u2 u2Var2) {
        int i10 = u2Var.f10119a + u2Var2.f10119a;
        int[] iArrCopyOf = Arrays.copyOf(u2Var.f10120b, i10);
        System.arraycopy(u2Var2.f10120b, 0, iArrCopyOf, u2Var.f10119a, u2Var2.f10119a);
        Object[] objArrCopyOf = Arrays.copyOf(u2Var.f10121c, i10);
        System.arraycopy(u2Var2.f10121c, 0, objArrCopyOf, u2Var.f10119a, u2Var2.f10119a);
        return new u2(i10, iArrCopyOf, objArrCopyOf, true);
    }

    static u2 k() {
        return new u2();
    }

    private static boolean l(Object[] objArr, Object[] objArr2, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            if (!objArr[i11].equals(objArr2[i11])) {
                return false;
            }
        }
        return true;
    }

    private static boolean n(int[] iArr, int[] iArr2, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            if (iArr[i11] != iArr2[i11]) {
                return false;
            }
        }
        return true;
    }

    void a() {
        if (!this.f10123e) {
            throw new UnsupportedOperationException();
        }
    }

    public int d() {
        int iZ;
        int i10 = this.f10122d;
        if (i10 != -1) {
            return i10;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < this.f10119a; i12++) {
            int i13 = this.f10120b[i12];
            int iA = a3.a(i13);
            int iB = a3.b(i13);
            if (iB == 0) {
                iZ = o.Z(iA, ((Long) this.f10121c[i12]).longValue());
            } else if (iB == 1) {
                iZ = o.p(iA, ((Long) this.f10121c[i12]).longValue());
            } else if (iB == 2) {
                iZ = o.h(iA, (l) this.f10121c[i12]);
            } else if (iB == 3) {
                iZ = (o.W(iA) * 2) + ((u2) this.f10121c[i12]).d();
            } else {
                if (iB != 5) {
                    throw new IllegalStateException(p0.d());
                }
                iZ = o.n(iA, ((Integer) this.f10121c[i12]).intValue());
            }
            i11 += iZ;
        }
        this.f10122d = i11;
        return i11;
    }

    public int e() {
        int i10 = this.f10122d;
        if (i10 != -1) {
            return i10;
        }
        int iL = 0;
        for (int i11 = 0; i11 < this.f10119a; i11++) {
            iL += o.L(a3.a(this.f10120b[i11]), (l) this.f10121c[i11]);
        }
        this.f10122d = iL;
        return iL;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof u2)) {
            return false;
        }
        u2 u2Var = (u2) obj;
        int i10 = this.f10119a;
        return i10 == u2Var.f10119a && n(this.f10120b, u2Var.f10120b, i10) && l(this.f10121c, u2Var.f10121c, this.f10119a);
    }

    public void h() {
        if (this.f10123e) {
            this.f10123e = false;
        }
    }

    public int hashCode() {
        int i10 = this.f10119a;
        return ((((527 + i10) * 31) + f(this.f10120b, i10)) * 31) + g(this.f10121c, this.f10119a);
    }

    u2 i(u2 u2Var) {
        if (u2Var.equals(c())) {
            return this;
        }
        a();
        int i10 = this.f10119a + u2Var.f10119a;
        b(i10);
        System.arraycopy(u2Var.f10120b, 0, this.f10120b, this.f10119a, u2Var.f10119a);
        System.arraycopy(u2Var.f10121c, 0, this.f10121c, this.f10119a, u2Var.f10119a);
        this.f10119a = i10;
        return this;
    }

    void m(int i10, Object obj) {
        a();
        b(this.f10119a + 1);
        int[] iArr = this.f10120b;
        int i11 = this.f10119a;
        iArr[i11] = i10;
        this.f10121c[i11] = obj;
        this.f10119a = i11 + 1;
    }

    private u2(int i10, int[] iArr, Object[] objArr, boolean z10) {
        this.f10122d = -1;
        this.f10119a = i10;
        this.f10120b = iArr;
        this.f10121c = objArr;
        this.f10123e = z10;
    }
}
