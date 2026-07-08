package pf;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class g0 {
    public static final String a(mf.d dVar) {
        rd.m.e(dVar, "<this>");
        return c(dVar.h());
    }

    public static final String b(mf.f fVar) {
        rd.m.e(fVar, "<this>");
        if (!e(fVar)) {
            String strD = fVar.d();
            rd.m.d(strD, "asString(...)");
            return strD;
        }
        StringBuilder sb2 = new StringBuilder();
        String strD2 = fVar.d();
        rd.m.d(strD2, "asString(...)");
        sb2.append('`' + strD2);
        sb2.append('`');
        return sb2.toString();
    }

    public static final String c(List list) {
        rd.m.e(list, "pathSegments");
        StringBuilder sb2 = new StringBuilder();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            mf.f fVar = (mf.f) it.next();
            if (sb2.length() > 0) {
                sb2.append(".");
            }
            sb2.append(b(fVar));
        }
        return sb2.toString();
    }

    public static final String d(String str, String str2, String str3, String str4, String str5) {
        rd.m.e(str, "lowerRendered");
        rd.m.e(str2, "lowerPrefix");
        rd.m.e(str3, "upperRendered");
        rd.m.e(str4, "upperPrefix");
        rd.m.e(str5, "foldedPrefix");
        if (rg.q.J(str, str2, false, 2, null) && rg.q.J(str3, str4, false, 2, null)) {
            String strSubstring = str.substring(str2.length());
            rd.m.d(strSubstring, "substring(...)");
            String strSubstring2 = str3.substring(str4.length());
            rd.m.d(strSubstring2, "substring(...)");
            String str6 = str5 + strSubstring;
            if (rd.m.a(strSubstring, strSubstring2)) {
                return str6;
            }
            if (f(strSubstring, strSubstring2)) {
                return str6 + '!';
            }
        }
        return null;
    }

    private static final boolean e(mf.f fVar) {
        String strD = fVar.d();
        rd.m.d(strD, "asString(...)");
        if (b0.f24142a.contains(strD)) {
            return true;
        }
        for (int i10 = 0; i10 < strD.length(); i10++) {
            char cCharAt = strD.charAt(i10);
            if (!Character.isLetterOrDigit(cCharAt) && cCharAt != '_') {
                return true;
            }
        }
        return strD.length() == 0 || !Character.isJavaIdentifierStart(strD.codePointAt(0));
    }

    public static final boolean f(String str, String str2) {
        rd.m.e(str, "lower");
        rd.m.e(str2, "upper");
        if (rd.m.a(str, rg.q.F(str2, "?", "", false, 4, null))) {
            return true;
        }
        if (rg.q.w(str2, "?", false, 2, null)) {
            if (rd.m.a(str + '?', str2)) {
                return true;
            }
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append('(');
        sb2.append(str);
        sb2.append(")?");
        return rd.m.a(sb2.toString(), str2);
    }
}
