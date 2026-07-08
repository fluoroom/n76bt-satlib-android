package w4;

import a6.p;
import d5.a;
import rd.m;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {
    public static final int a(int i10) {
        return i10 & 1073741823;
    }

    public static final a.d b(int i10) {
        a.d dVarD = a.d.d((i10 >> 30) & 3);
        m.d(dVarD, "valueOf(...)");
        return dVarD;
    }

    public static final String c(int i10, boolean z10) {
        if (i10 == 0) {
            return "";
        }
        String strB = p.b(i10, 3, 0, false, false);
        m.d(strB, "convert(...)");
        if (!z10) {
            return strB;
        }
        return strB + "KHz";
    }

    public static final String d(int i10, boolean z10) {
        if (i10 == 0) {
            return "";
        }
        String strA = p.a(i10, 3, 1, true);
        m.d(strA, "convert(...)");
        if (!z10) {
            return strA;
        }
        return strA + "KHz";
    }

    public static final String e(int i10, boolean z10, boolean z11, boolean z12, String str) {
        m.e(str, "empty");
        int iA = a(i10);
        if (iA <= 0) {
            return str;
        }
        String strB = p.b(iA, 6, 3, false, z12);
        m.d(strB, "convert(...)");
        if (z10 || b(i10) != a.d.FM) {
            strB = b(i10) + ' ' + strB;
        }
        if (!z11) {
            return strB;
        }
        return strB + "MHz";
    }

    public static /* synthetic */ String f(int i10, boolean z10, boolean z11, boolean z12, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z10 = false;
        }
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        if ((i11 & 4) != 0) {
            z12 = false;
        }
        if ((i11 & 8) != 0) {
            str = "";
        }
        return e(i10, z10, z11, z12, str);
    }
}
