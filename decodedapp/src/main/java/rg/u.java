package rg;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class u extends r {
    private static final qd.l d(final String str) {
        return str.length() == 0 ? new qd.l() { // from class: rg.s
            @Override // qd.l
            public final Object l(Object obj) {
                return u.e((String) obj);
            }
        } : new qd.l() { // from class: rg.t
            @Override // qd.l
            public final Object l(Object obj) {
                return u.f(str, (String) obj);
            }
        };
    }

    public static final String e(String str) {
        rd.m.e(str, "line");
        return str;
    }

    public static final String f(String str, String str2) {
        rd.m.e(str2, "line");
        return str + str2;
    }

    private static final int g(String str) {
        int length = str.length();
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                i10 = -1;
                break;
            }
            if (!b.c(str.charAt(i10))) {
                break;
            }
            i10++;
        }
        return i10 == -1 ? str.length() : i10;
    }

    public static final String h(String str, String str2) {
        String str3;
        rd.m.e(str, "<this>");
        rd.m.e(str2, "newIndent");
        List listL0 = e0.l0(str);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listL0) {
            if (!e0.e0((String) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(ed.q.v(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(Integer.valueOf(g((String) it.next())));
        }
        Integer num = (Integer) ed.q.o0(arrayList2);
        int i10 = 0;
        int iIntValue = num != null ? num.intValue() : 0;
        int length = str.length() + (str2.length() * listL0.size());
        qd.l lVarD = d(str2);
        int iM = ed.q.m(listL0);
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : listL0) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                ed.q.u();
            }
            String str4 = (String) obj2;
            if ((i10 == 0 || i10 == iM) && e0.e0(str4)) {
                str4 = null;
            } else {
                String strX0 = g0.X0(str4, iIntValue);
                if (strX0 != null && (str3 = (String) lVarD.l(strX0)) != null) {
                    str4 = str3;
                }
            }
            if (str4 != null) {
                arrayList3.add(str4);
            }
            i10 = i11;
        }
        return ((StringBuilder) ed.b0.f0(arrayList3, new StringBuilder(length), (124 & 2) != 0 ? ", " : "\n", (124 & 4) != 0 ? "" : null, (124 & 8) == 0 ? null : "", (124 & 16) != 0 ? -1 : 0, (124 & 32) != 0 ? "..." : null, (124 & 64) != 0 ? null : null)).toString();
    }

    public static final String i(String str, String str2, String str3) {
        String str4;
        String str5;
        rd.m.e(str, "<this>");
        rd.m.e(str2, "newIndent");
        rd.m.e(str3, "marginPrefix");
        if (e0.e0(str3)) {
            throw new IllegalArgumentException("marginPrefix must be non-blank string.");
        }
        List listL0 = e0.l0(str);
        int length = str.length() + (str2.length() * listL0.size());
        qd.l lVarD = d(str2);
        int iM = ed.q.m(listL0);
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        for (Object obj : listL0) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                ed.q.u();
            }
            String str6 = (String) obj;
            String strSubstring = null;
            if ((i10 == 0 || i10 == iM) && e0.e0(str6)) {
                str4 = str3;
                str6 = null;
            } else {
                int length2 = str6.length();
                int i12 = 0;
                while (true) {
                    if (i12 >= length2) {
                        i12 = -1;
                        break;
                    }
                    if (!b.c(str6.charAt(i12))) {
                        break;
                    }
                    i12++;
                }
                if (i12 == -1) {
                    str4 = str3;
                } else {
                    int i13 = i12;
                    str4 = str3;
                    if (b0.I(str6, str4, i13, false, 4, null)) {
                        int length3 = str4.length() + i13;
                        rd.m.c(str6, "null cannot be cast to non-null type java.lang.String");
                        strSubstring = str6.substring(length3);
                        rd.m.d(strSubstring, "substring(...)");
                    }
                }
                if (strSubstring != null && (str5 = (String) lVarD.l(strSubstring)) != null) {
                    str6 = str5;
                }
            }
            if (str6 != null) {
                arrayList.add(str6);
            }
            i10 = i11;
            str3 = str4;
        }
        return ((StringBuilder) ed.b0.f0(arrayList, new StringBuilder(length), (124 & 2) != 0 ? ", " : "\n", (124 & 4) != 0 ? "" : null, (124 & 8) == 0 ? null : "", (124 & 16) != 0 ? -1 : 0, (124 & 32) != 0 ? "..." : null, (124 & 64) != 0 ? null : null)).toString();
    }

    public static String j(String str) {
        rd.m.e(str, "<this>");
        return h(str, "");
    }

    public static final String k(String str, String str2) {
        rd.m.e(str, "<this>");
        rd.m.e(str2, "marginPrefix");
        return i(str, "", str2);
    }

    public static /* synthetic */ String l(String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str2 = "|";
        }
        return k(str, str2);
    }
}
