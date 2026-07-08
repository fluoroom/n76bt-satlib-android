package wh;

import vh.k0;

/* JADX INFO: loaded from: classes3.dex */
public abstract class f {
    public static final int a(int[] iArr, int i10, int i11, int i12) {
        rd.m.e(iArr, "<this>");
        int i13 = i12 - 1;
        while (i11 <= i13) {
            int i14 = (i11 + i13) >>> 1;
            int i15 = iArr[i14];
            if (i15 < i10) {
                i11 = i14 + 1;
            } else {
                if (i15 <= i10) {
                    return i14;
                }
                i13 = i14 - 1;
            }
        }
        return (-i11) - 1;
    }

    public static final int b(k0 k0Var, int i10) {
        rd.m.e(k0Var, "<this>");
        int iA = a(k0Var.b0(), i10 + 1, 0, k0Var.c0().length);
        return iA >= 0 ? iA : ~iA;
    }
}
