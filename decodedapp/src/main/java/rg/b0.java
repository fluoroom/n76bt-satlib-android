package rg;

import java.util.Comparator;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes3.dex */
public abstract class b0 extends a0 {
    public static String B(CharSequence charSequence, int i10) {
        rd.m.e(charSequence, "<this>");
        if (i10 < 0) {
            throw new IllegalArgumentException(("Count 'n' must be non-negative, but was " + i10 + '.').toString());
        }
        if (i10 == 0) {
            return "";
        }
        int i11 = 1;
        if (i10 == 1) {
            return charSequence.toString();
        }
        int length = charSequence.length();
        if (length == 0) {
            return "";
        }
        if (length == 1) {
            char cCharAt = charSequence.charAt(0);
            char[] cArr = new char[i10];
            for (int i12 = 0; i12 < i10; i12++) {
                cArr[i12] = cCharAt;
            }
            return new String(cArr);
        }
        StringBuilder sb2 = new StringBuilder(charSequence.length() * i10);
        if (1 <= i10) {
            while (true) {
                sb2.append(charSequence);
                if (i11 == i10) {
                    break;
                }
                i11++;
            }
        }
        String string = sb2.toString();
        rd.m.b(string);
        return string;
    }

    public static final String C(String str, char c10, char c11, boolean z10) {
        rd.m.e(str, "<this>");
        if (!z10) {
            String strReplace = str.replace(c10, c11);
            rd.m.d(strReplace, "replace(...)");
            return strReplace;
        }
        StringBuilder sb2 = new StringBuilder(str.length());
        for (int i10 = 0; i10 < str.length(); i10++) {
            char cCharAt = str.charAt(i10);
            if (c.e(cCharAt, c10, z10)) {
                cCharAt = c11;
            }
            sb2.append(cCharAt);
        }
        return sb2.toString();
    }

    public static final String D(String str, String str2, String str3, boolean z10) {
        rd.m.e(str, "<this>");
        rd.m.e(str2, "oldValue");
        rd.m.e(str3, "newValue");
        int i10 = 0;
        int iY = e0.Y(str, str2, 0, z10);
        if (iY < 0) {
            return str;
        }
        int length = str2.length();
        int iB = xd.d.b(length, 1);
        int length2 = (str.length() - length) + str3.length();
        if (length2 < 0) {
            throw new OutOfMemoryError();
        }
        StringBuilder sb2 = new StringBuilder(length2);
        do {
            sb2.append((CharSequence) str, i10, iY);
            sb2.append(str3);
            i10 = iY + length;
            if (iY >= str.length()) {
                break;
            }
            iY = e0.Y(str, str2, iY + iB, z10);
        } while (iY > 0);
        sb2.append((CharSequence) str, i10, str.length());
        String string = sb2.toString();
        rd.m.d(string, "toString(...)");
        return string;
    }

    public static /* synthetic */ String E(String str, char c10, char c11, boolean z10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        return C(str, c10, c11, z10);
    }

    public static /* synthetic */ String F(String str, String str2, String str3, boolean z10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        return D(str, str2, str3, z10);
    }

    public static boolean G(String str, String str2, int i10, boolean z10) {
        rd.m.e(str, "<this>");
        rd.m.e(str2, "prefix");
        return !z10 ? str.startsWith(str2, i10) : z(str, i10, str2, 0, str2.length(), z10);
    }

    public static boolean H(String str, String str2, boolean z10) {
        rd.m.e(str, "<this>");
        rd.m.e(str2, "prefix");
        return !z10 ? str.startsWith(str2) : z(str, 0, str2, 0, str2.length(), z10);
    }

    public static /* synthetic */ boolean I(String str, String str2, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        return G(str, str2, i10, z10);
    }

    public static /* synthetic */ boolean J(String str, String str2, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return H(str, str2, z10);
    }

    public static String t(char[] cArr) {
        rd.m.e(cArr, "<this>");
        return new String(cArr);
    }

    public static String u(char[] cArr, int i10, int i11) {
        rd.m.e(cArr, "<this>");
        ed.d.f11750a.a(i10, i11, cArr.length);
        return new String(cArr, i10, i11 - i10);
    }

    public static boolean v(String str, String str2, boolean z10) {
        rd.m.e(str, "<this>");
        rd.m.e(str2, "suffix");
        return !z10 ? str.endsWith(str2) : z(str, str.length() - str2.length(), str2, 0, str2.length(), true);
    }

    public static /* synthetic */ boolean w(String str, String str2, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return v(str, str2, z10);
    }

    public static boolean x(String str, String str2, boolean z10) {
        return str == null ? str2 == null : !z10 ? str.equals(str2) : str.equalsIgnoreCase(str2);
    }

    public static Comparator y(rd.g0 g0Var) {
        rd.m.e(g0Var, "<this>");
        Comparator comparator = String.CASE_INSENSITIVE_ORDER;
        rd.m.d(comparator, "CASE_INSENSITIVE_ORDER");
        return comparator;
    }

    public static boolean z(String str, int i10, String str2, int i11, int i12, boolean z10) {
        rd.m.e(str, "<this>");
        rd.m.e(str2, "other");
        return !z10 ? str.regionMatches(i10, str2, i11, i12) : str.regionMatches(z10, i10, str2, i11, i12);
    }
}
