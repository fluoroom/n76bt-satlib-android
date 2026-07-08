package rg;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes3.dex */
public abstract class e0 extends b0 {

    public static final class a implements qg.h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ CharSequence f26027a;

        public a(CharSequence charSequence) {
            this.f26027a = charSequence;
        }

        @Override // qg.h
        public Iterator iterator() {
            return new i(this.f26027a);
        }
    }

    private static final List A0(CharSequence charSequence, String str, boolean z10, int i10) {
        x0(i10);
        int length = 0;
        int iY = Y(charSequence, str, 0, z10);
        if (iY == -1 || i10 == 1) {
            return ed.q.e(charSequence.toString());
        }
        boolean z11 = i10 > 0;
        ArrayList arrayList = new ArrayList(z11 ? xd.d.c(i10, 10) : 10);
        do {
            arrayList.add(charSequence.subSequence(length, iY).toString());
            length = str.length() + iY;
            if (z11 && arrayList.size() == i10 - 1) {
                break;
            }
            iY = Y(charSequence, str, length, z10);
        } while (iY != -1);
        arrayList.add(charSequence.subSequence(length, charSequence.length()).toString());
        return arrayList;
    }

    public static /* synthetic */ List B0(CharSequence charSequence, char[] cArr, boolean z10, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z10 = false;
        }
        if ((i11 & 4) != 0) {
            i10 = 0;
        }
        return y0(charSequence, cArr, z10, i10);
    }

    public static /* synthetic */ List C0(CharSequence charSequence, String[] strArr, boolean z10, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z10 = false;
        }
        if ((i11 & 4) != 0) {
            i10 = 0;
        }
        return z0(charSequence, strArr, z10, i10);
    }

    public static final boolean D0(CharSequence charSequence, char c10, boolean z10) {
        rd.m.e(charSequence, "<this>");
        return charSequence.length() > 0 && c.e(charSequence.charAt(0), c10, z10);
    }

    public static final boolean E0(CharSequence charSequence, CharSequence charSequence2, boolean z10) {
        rd.m.e(charSequence, "<this>");
        rd.m.e(charSequence2, "prefix");
        return (!z10 && (charSequence instanceof String) && (charSequence2 instanceof String)) ? b0.J((String) charSequence, (String) charSequence2, false, 2, null) : u0(charSequence, 0, charSequence2, 0, charSequence2.length(), z10);
    }

    public static /* synthetic */ boolean F0(CharSequence charSequence, char c10, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return D0(charSequence, c10, z10);
    }

    public static /* synthetic */ boolean G0(CharSequence charSequence, CharSequence charSequence2, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return E0(charSequence, charSequence2, z10);
    }

    public static final String H0(CharSequence charSequence, xd.c cVar) {
        rd.m.e(charSequence, "<this>");
        rd.m.e(cVar, "range");
        return charSequence.subSequence(cVar.h().intValue(), cVar.g().intValue() + 1).toString();
    }

    public static final String I0(String str, char c10, String str2) {
        rd.m.e(str, "<this>");
        rd.m.e(str2, "missingDelimiterValue");
        int iB0 = b0(str, c10, 0, false, 6, null);
        if (iB0 == -1) {
            return str2;
        }
        String strSubstring = str.substring(iB0 + 1, str.length());
        rd.m.d(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static final String J0(String str, String str2, String str3) {
        rd.m.e(str, "<this>");
        rd.m.e(str2, "delimiter");
        rd.m.e(str3, "missingDelimiterValue");
        int iC0 = c0(str, str2, 0, false, 6, null);
        if (iC0 == -1) {
            return str3;
        }
        String strSubstring = str.substring(iC0 + str2.length(), str.length());
        rd.m.d(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static /* synthetic */ String K0(String str, char c10, String str2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = str;
        }
        return I0(str, c10, str2);
    }

    public static /* synthetic */ String L0(String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str3 = str;
        }
        return J0(str, str2, str3);
    }

    public static final boolean M(CharSequence charSequence, char c10, boolean z10) {
        rd.m.e(charSequence, "<this>");
        return b0(charSequence, c10, 0, z10, 2, null) >= 0;
    }

    public static final String M0(String str, char c10, String str2) {
        rd.m.e(str, "<this>");
        rd.m.e(str2, "missingDelimiterValue");
        int iH0 = h0(str, c10, 0, false, 6, null);
        if (iH0 == -1) {
            return str2;
        }
        String strSubstring = str.substring(iH0 + 1, str.length());
        rd.m.d(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static boolean N(CharSequence charSequence, CharSequence charSequence2, boolean z10) {
        rd.m.e(charSequence, "<this>");
        rd.m.e(charSequence2, "other");
        return charSequence2 instanceof String ? c0(charSequence, (String) charSequence2, 0, z10, 2, null) >= 0 : a0(charSequence, charSequence2, 0, charSequence.length(), z10, false, 16, null) >= 0;
    }

    public static final String N0(String str, String str2, String str3) {
        rd.m.e(str, "<this>");
        rd.m.e(str2, "delimiter");
        rd.m.e(str3, "missingDelimiterValue");
        int iI0 = i0(str, str2, 0, false, 6, null);
        if (iI0 == -1) {
            return str3;
        }
        String strSubstring = str.substring(iI0 + str2.length(), str.length());
        rd.m.d(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static /* synthetic */ boolean O(CharSequence charSequence, char c10, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return M(charSequence, c10, z10);
    }

    public static /* synthetic */ String O0(String str, char c10, String str2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = str;
        }
        return M0(str, c10, str2);
    }

    public static /* synthetic */ boolean P(CharSequence charSequence, CharSequence charSequence2, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return N(charSequence, charSequence2, z10);
    }

    public static /* synthetic */ String P0(String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str3 = str;
        }
        return N0(str, str2, str3);
    }

    public static final boolean Q(CharSequence charSequence, char c10, boolean z10) {
        rd.m.e(charSequence, "<this>");
        return charSequence.length() > 0 && c.e(charSequence.charAt(W(charSequence)), c10, z10);
    }

    public static final String Q0(String str, char c10, String str2) {
        rd.m.e(str, "<this>");
        rd.m.e(str2, "missingDelimiterValue");
        int iB0 = b0(str, c10, 0, false, 6, null);
        if (iB0 == -1) {
            return str2;
        }
        String strSubstring = str.substring(0, iB0);
        rd.m.d(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static final boolean R(CharSequence charSequence, CharSequence charSequence2, boolean z10) {
        rd.m.e(charSequence, "<this>");
        rd.m.e(charSequence2, "suffix");
        return (!z10 && (charSequence instanceof String) && (charSequence2 instanceof String)) ? b0.w((String) charSequence, (String) charSequence2, false, 2, null) : u0(charSequence, charSequence.length() - charSequence2.length(), charSequence2, 0, charSequence2.length(), z10);
    }

    public static final String R0(String str, String str2, String str3) {
        rd.m.e(str, "<this>");
        rd.m.e(str2, "delimiter");
        rd.m.e(str3, "missingDelimiterValue");
        int iC0 = c0(str, str2, 0, false, 6, null);
        if (iC0 == -1) {
            return str3;
        }
        String strSubstring = str.substring(0, iC0);
        rd.m.d(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static /* synthetic */ boolean S(CharSequence charSequence, char c10, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return Q(charSequence, c10, z10);
    }

    public static /* synthetic */ String S0(String str, char c10, String str2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = str;
        }
        return Q0(str, c10, str2);
    }

    public static /* synthetic */ boolean T(CharSequence charSequence, CharSequence charSequence2, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return R(charSequence, charSequence2, z10);
    }

    public static /* synthetic */ String T0(String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str3 = str;
        }
        return R0(str, str2, str3);
    }

    private static final dd.q U(CharSequence charSequence, Collection collection, int i10, boolean z10, boolean z11) {
        CharSequence charSequence2;
        Object next;
        boolean z12;
        Object next2;
        if (!z10 && collection.size() == 1) {
            String str = (String) ed.q.v0(collection);
            int iC0 = !z11 ? c0(charSequence, str, i10, false, 4, null) : i0(charSequence, str, i10, false, 4, null);
            if (iC0 < 0) {
                return null;
            }
            return dd.w.a(Integer.valueOf(iC0), str);
        }
        CharSequence charSequence3 = charSequence;
        xd.a cVar = !z11 ? new xd.c(xd.d.b(i10, 0), charSequence3.length()) : xd.d.g(xd.d.c(i10, W(charSequence3)), 0);
        if (charSequence3 instanceof String) {
            int iB = cVar.b();
            int iC = cVar.c();
            int iD = cVar.d();
            if ((iD > 0 && iB <= iC) || (iD < 0 && iC <= iB)) {
                int i11 = iB;
                while (true) {
                    Iterator it = collection.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            z12 = z10;
                            next2 = null;
                            break;
                        }
                        next2 = it.next();
                        String str2 = (String) next2;
                        z12 = z10;
                        if (b0.z(str2, 0, (String) charSequence3, i11, str2.length(), z12)) {
                            break;
                        }
                        z10 = z12;
                    }
                    String str3 = (String) next2;
                    if (str3 == null) {
                        if (i11 == iC) {
                            break;
                        }
                        i11 += iD;
                        z10 = z12;
                    } else {
                        return dd.w.a(Integer.valueOf(i11), str3);
                    }
                }
            }
        } else {
            boolean z13 = z10;
            int iB2 = cVar.b();
            int iC2 = cVar.c();
            int iD2 = cVar.d();
            if ((iD2 > 0 && iB2 <= iC2) || (iD2 < 0 && iC2 <= iB2)) {
                int i12 = iB2;
                while (true) {
                    Iterator it2 = collection.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            charSequence2 = charSequence3;
                            next = null;
                            break;
                        }
                        next = it2.next();
                        String str4 = (String) next;
                        boolean z14 = z13;
                        charSequence2 = charSequence3;
                        z13 = z14;
                        if (u0(str4, 0, charSequence2, i12, str4.length(), z14)) {
                            break;
                        }
                        charSequence3 = charSequence2;
                    }
                    String str5 = (String) next;
                    if (str5 == null) {
                        if (i12 == iC2) {
                            break;
                        }
                        i12 += iD2;
                        charSequence3 = charSequence2;
                    } else {
                        return dd.w.a(Integer.valueOf(i12), str5);
                    }
                }
            }
        }
        return null;
    }

    public static String U0(String str, char c10, String str2) {
        rd.m.e(str, "<this>");
        rd.m.e(str2, "missingDelimiterValue");
        int iH0 = h0(str, c10, 0, false, 6, null);
        if (iH0 == -1) {
            return str2;
        }
        String strSubstring = str.substring(0, iH0);
        rd.m.d(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static xd.c V(CharSequence charSequence) {
        rd.m.e(charSequence, "<this>");
        return new xd.c(0, charSequence.length() - 1);
    }

    public static String V0(String str, String str2, String str3) {
        rd.m.e(str, "<this>");
        rd.m.e(str2, "delimiter");
        rd.m.e(str3, "missingDelimiterValue");
        int iI0 = i0(str, str2, 0, false, 6, null);
        if (iI0 == -1) {
            return str3;
        }
        String strSubstring = str.substring(0, iI0);
        rd.m.d(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static int W(CharSequence charSequence) {
        rd.m.e(charSequence, "<this>");
        return charSequence.length() - 1;
    }

    public static CharSequence W0(CharSequence charSequence) {
        rd.m.e(charSequence, "<this>");
        int length = charSequence.length() - 1;
        int i10 = 0;
        boolean z10 = false;
        while (i10 <= length) {
            boolean zC = b.c(charSequence.charAt(!z10 ? i10 : length));
            if (z10) {
                if (!zC) {
                    break;
                }
                length--;
            } else if (zC) {
                i10++;
            } else {
                z10 = true;
            }
        }
        return charSequence.subSequence(i10, length + 1);
    }

    public static final int X(CharSequence charSequence, char c10, int i10, boolean z10) {
        rd.m.e(charSequence, "<this>");
        return (z10 || !(charSequence instanceof String)) ? d0(charSequence, new char[]{c10}, i10, z10) : ((String) charSequence).indexOf(c10, i10);
    }

    public static final int Y(CharSequence charSequence, String str, int i10, boolean z10) {
        rd.m.e(charSequence, "<this>");
        rd.m.e(str, "string");
        return (z10 || !(charSequence instanceof String)) ? a0(charSequence, str, i10, charSequence.length(), z10, false, 16, null) : ((String) charSequence).indexOf(str, i10);
    }

    private static final int Z(CharSequence charSequence, CharSequence charSequence2, int i10, int i11, boolean z10, boolean z11) {
        xd.a cVar = !z11 ? new xd.c(xd.d.b(i10, 0), xd.d.c(i11, charSequence.length())) : xd.d.g(xd.d.c(i10, W(charSequence)), xd.d.b(i11, 0));
        if ((charSequence instanceof String) && (charSequence2 instanceof String)) {
            int iB = cVar.b();
            int iC = cVar.c();
            int iD = cVar.d();
            if ((iD <= 0 || iB > iC) && (iD >= 0 || iC > iB)) {
                return -1;
            }
            int i12 = iB;
            while (true) {
                String str = (String) charSequence2;
                boolean z12 = z10;
                if (b0.z(str, 0, (String) charSequence, i12, str.length(), z12)) {
                    return i12;
                }
                if (i12 == iC) {
                    return -1;
                }
                i12 += iD;
                z10 = z12;
            }
        } else {
            boolean z13 = z10;
            int iB2 = cVar.b();
            int iC2 = cVar.c();
            int iD2 = cVar.d();
            if ((iD2 <= 0 || iB2 > iC2) && (iD2 >= 0 || iC2 > iB2)) {
                return -1;
            }
            int i13 = iB2;
            while (true) {
                boolean z14 = z13;
                CharSequence charSequence3 = charSequence;
                CharSequence charSequence4 = charSequence2;
                z13 = z14;
                if (u0(charSequence4, 0, charSequence3, i13, charSequence2.length(), z14)) {
                    return i13;
                }
                if (i13 == iC2) {
                    return -1;
                }
                i13 += iD2;
                charSequence2 = charSequence4;
                charSequence = charSequence3;
            }
        }
    }

    static /* synthetic */ int a0(CharSequence charSequence, CharSequence charSequence2, int i10, int i11, boolean z10, boolean z11, int i12, Object obj) {
        return Z(charSequence, charSequence2, i10, i11, z10, (i12 & 16) != 0 ? false : z11);
    }

    public static /* synthetic */ int b0(CharSequence charSequence, char c10, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        return X(charSequence, c10, i10, z10);
    }

    public static /* synthetic */ int c0(CharSequence charSequence, String str, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        return Y(charSequence, str, i10, z10);
    }

    public static final int d0(CharSequence charSequence, char[] cArr, int i10, boolean z10) {
        rd.m.e(charSequence, "<this>");
        rd.m.e(cArr, "chars");
        if (!z10 && cArr.length == 1 && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(ed.j.W(cArr), i10);
        }
        int iB = xd.d.b(i10, 0);
        int iW = W(charSequence);
        if (iB > iW) {
            return -1;
        }
        while (true) {
            char cCharAt = charSequence.charAt(iB);
            for (char c10 : cArr) {
                if (c.e(c10, cCharAt, z10)) {
                    return iB;
                }
            }
            if (iB == iW) {
                return -1;
            }
            iB++;
        }
    }

    public static boolean e0(CharSequence charSequence) {
        rd.m.e(charSequence, "<this>");
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            if (!b.c(charSequence.charAt(i10))) {
                return false;
            }
        }
        return true;
    }

    public static final int f0(CharSequence charSequence, char c10, int i10, boolean z10) {
        rd.m.e(charSequence, "<this>");
        return (z10 || !(charSequence instanceof String)) ? j0(charSequence, new char[]{c10}, i10, z10) : ((String) charSequence).lastIndexOf(c10, i10);
    }

    public static final int g0(CharSequence charSequence, String str, int i10, boolean z10) {
        rd.m.e(charSequence, "<this>");
        rd.m.e(str, "string");
        return (z10 || !(charSequence instanceof String)) ? Z(charSequence, str, i10, 0, z10, true) : ((String) charSequence).lastIndexOf(str, i10);
    }

    public static /* synthetic */ int h0(CharSequence charSequence, char c10, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = W(charSequence);
        }
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        return f0(charSequence, c10, i10, z10);
    }

    public static /* synthetic */ int i0(CharSequence charSequence, String str, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = W(charSequence);
        }
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        return g0(charSequence, str, i10, z10);
    }

    public static final int j0(CharSequence charSequence, char[] cArr, int i10, boolean z10) {
        rd.m.e(charSequence, "<this>");
        rd.m.e(cArr, "chars");
        if (!z10 && cArr.length == 1 && (charSequence instanceof String)) {
            return ((String) charSequence).lastIndexOf(ed.j.W(cArr), i10);
        }
        for (int iC = xd.d.c(i10, W(charSequence)); -1 < iC; iC--) {
            char cCharAt = charSequence.charAt(iC);
            for (char c10 : cArr) {
                if (c.e(c10, cCharAt, z10)) {
                    return iC;
                }
            }
        }
        return -1;
    }

    public static final qg.h k0(CharSequence charSequence) {
        rd.m.e(charSequence, "<this>");
        return new a(charSequence);
    }

    public static final List l0(CharSequence charSequence) {
        rd.m.e(charSequence, "<this>");
        return qg.k.O(k0(charSequence));
    }

    public static final CharSequence m0(CharSequence charSequence, int i10, char c10) {
        rd.m.e(charSequence, "<this>");
        if (i10 < 0) {
            throw new IllegalArgumentException("Desired length " + i10 + " is less than zero.");
        }
        if (i10 <= charSequence.length()) {
            return charSequence.subSequence(0, charSequence.length());
        }
        StringBuilder sb2 = new StringBuilder(i10);
        int length = i10 - charSequence.length();
        int i11 = 1;
        if (1 <= length) {
            while (true) {
                sb2.append(c10);
                if (i11 == length) {
                    break;
                }
                i11++;
            }
        }
        sb2.append(charSequence);
        return sb2;
    }

    public static String n0(String str, int i10, char c10) {
        rd.m.e(str, "<this>");
        return m0(str, i10, c10).toString();
    }

    private static final qg.h o0(CharSequence charSequence, final char[] cArr, int i10, final boolean z10, int i11) {
        x0(i11);
        return new e(charSequence, i10, i11, new qd.p() { // from class: rg.c0
            @Override // qd.p
            public final Object s(Object obj, Object obj2) {
                return e0.s0(cArr, z10, (CharSequence) obj, ((Integer) obj2).intValue());
            }
        });
    }

    private static final qg.h p0(CharSequence charSequence, String[] strArr, int i10, final boolean z10, int i11) {
        x0(i11);
        final List listD = ed.j.d(strArr);
        return new e(charSequence, i10, i11, new qd.p() { // from class: rg.d0
            @Override // qd.p
            public final Object s(Object obj, Object obj2) {
                return e0.t0(listD, z10, (CharSequence) obj, ((Integer) obj2).intValue());
            }
        });
    }

    static /* synthetic */ qg.h q0(CharSequence charSequence, char[] cArr, int i10, boolean z10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            z10 = false;
        }
        if ((i12 & 8) != 0) {
            i11 = 0;
        }
        return o0(charSequence, cArr, i10, z10, i11);
    }

    static /* synthetic */ qg.h r0(CharSequence charSequence, String[] strArr, int i10, boolean z10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            z10 = false;
        }
        if ((i12 & 8) != 0) {
            i11 = 0;
        }
        return p0(charSequence, strArr, i10, z10, i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final dd.q s0(char[] cArr, boolean z10, CharSequence charSequence, int i10) {
        rd.m.e(charSequence, "$this$DelimitedRangesSequence");
        int iD0 = d0(charSequence, cArr, i10, z10);
        if (iD0 < 0) {
            return null;
        }
        return dd.w.a(Integer.valueOf(iD0), 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final dd.q t0(List list, boolean z10, CharSequence charSequence, int i10) {
        rd.m.e(charSequence, "$this$DelimitedRangesSequence");
        dd.q qVarU = U(charSequence, list, i10, z10, false);
        if (qVarU != null) {
            return dd.w.a(qVarU.c(), Integer.valueOf(((String) qVarU.d()).length()));
        }
        return null;
    }

    public static final boolean u0(CharSequence charSequence, int i10, CharSequence charSequence2, int i11, int i12, boolean z10) {
        rd.m.e(charSequence, "<this>");
        rd.m.e(charSequence2, "other");
        if (i11 < 0 || i10 < 0 || i10 > charSequence.length() - i12 || i11 > charSequence2.length() - i12) {
            return false;
        }
        for (int i13 = 0; i13 < i12; i13++) {
            if (!c.e(charSequence.charAt(i10 + i13), charSequence2.charAt(i11 + i13), z10)) {
                return false;
            }
        }
        return true;
    }

    public static String v0(String str, CharSequence charSequence) {
        rd.m.e(str, "<this>");
        rd.m.e(charSequence, "prefix");
        if (!G0(str, charSequence, false, 2, null)) {
            return str;
        }
        String strSubstring = str.substring(charSequence.length());
        rd.m.d(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static String w0(String str, CharSequence charSequence) {
        rd.m.e(str, "<this>");
        rd.m.e(charSequence, "suffix");
        if (!T(str, charSequence, false, 2, null)) {
            return str;
        }
        String strSubstring = str.substring(0, str.length() - charSequence.length());
        rd.m.d(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static final void x0(int i10) {
        if (i10 >= 0) {
            return;
        }
        throw new IllegalArgumentException(("Limit must be non-negative, but was " + i10).toString());
    }

    public static final List y0(CharSequence charSequence, char[] cArr, boolean z10, int i10) {
        rd.m.e(charSequence, "<this>");
        rd.m.e(cArr, "delimiters");
        if (cArr.length == 1) {
            return A0(charSequence, String.valueOf(cArr[0]), z10, i10);
        }
        Iterable iterableU = qg.k.u(q0(charSequence, cArr, 0, z10, i10, 2, null));
        ArrayList arrayList = new ArrayList(ed.q.v(iterableU, 10));
        Iterator it = iterableU.iterator();
        while (it.hasNext()) {
            arrayList.add(H0(charSequence, (xd.c) it.next()));
        }
        return arrayList;
    }

    public static final List z0(CharSequence charSequence, String[] strArr, boolean z10, int i10) {
        rd.m.e(charSequence, "<this>");
        rd.m.e(strArr, "delimiters");
        if (strArr.length == 1) {
            String str = strArr[0];
            if (str.length() != 0) {
                return A0(charSequence, str, z10, i10);
            }
        }
        Iterable iterableU = qg.k.u(r0(charSequence, strArr, 0, z10, i10, 2, null));
        ArrayList arrayList = new ArrayList(ed.q.v(iterableU, 10));
        Iterator it = iterableU.iterator();
        while (it.hasNext()) {
            arrayList.add(H0(charSequence, (xd.c) it.next()));
        }
        return arrayList;
    }
}
