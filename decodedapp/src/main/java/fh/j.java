package fh;

import dd.w;
import eh.y;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import rg.q;

/* JADX INFO: loaded from: classes3.dex */
public abstract class j {
    private static final String a(char c10) {
        String string = Integer.toString(c10, rg.a.a(16));
        rd.m.d(string, "toString(...)");
        if (string.length() >= 2) {
            return string;
        }
        return '0' + string;
    }

    public static final y.a b(y.a aVar, String str, String str2) {
        rd.m.e(aVar, "<this>");
        rd.m.e(str, "name");
        rd.m.e(str2, "value");
        s(str);
        t(str2, str);
        d(aVar, str, str2);
        return aVar;
    }

    public static final y.a c(y.a aVar, y yVar) {
        rd.m.e(aVar, "<this>");
        rd.m.e(yVar, "headers");
        int size = yVar.size();
        for (int i10 = 0; i10 < size; i10++) {
            d(aVar, yVar.d(i10), yVar.g(i10));
        }
        return aVar;
    }

    public static final y.a d(y.a aVar, String str, String str2) {
        rd.m.e(aVar, "<this>");
        rd.m.e(str, "name");
        rd.m.e(str2, "value");
        aVar.h().add(str);
        aVar.h().add(q.W0(str2).toString());
        return aVar;
    }

    public static final y e(y.a aVar) {
        rd.m.e(aVar, "<this>");
        return new y((String[]) aVar.h().toArray(new String[0]));
    }

    public static final boolean f(y yVar, Object obj) {
        rd.m.e(yVar, "<this>");
        return (obj instanceof y) && Arrays.equals(yVar.c(), ((y) obj).c());
    }

    public static final String g(y.a aVar, String str) {
        rd.m.e(aVar, "<this>");
        rd.m.e(str, "name");
        int size = aVar.h().size() - 2;
        int iB = ld.c.b(size, 0, -2);
        if (iB > size) {
            return null;
        }
        while (!q.x(str, (String) aVar.h().get(size), true)) {
            if (size == iB) {
                return null;
            }
            size -= 2;
        }
        return (String) aVar.h().get(size + 1);
    }

    public static final int h(y yVar) {
        rd.m.e(yVar, "<this>");
        return Arrays.hashCode(yVar.c());
    }

    public static final String i(String[] strArr, String str) {
        rd.m.e(strArr, "namesAndValues");
        rd.m.e(str, "name");
        int length = strArr.length - 2;
        int iB = ld.c.b(length, 0, -2);
        if (iB > length) {
            return null;
        }
        while (!q.x(str, strArr[length], true)) {
            if (length == iB) {
                return null;
            }
            length -= 2;
        }
        return strArr[length + 1];
    }

    public static final y j(String... strArr) {
        rd.m.e(strArr, "inputNamesAndValues");
        if (strArr.length % 2 != 0) {
            throw new IllegalArgumentException("Expected alternating header names and values");
        }
        String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
        int length = strArr2.length;
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11++) {
            if (strArr2[i11] == null) {
                throw new IllegalArgumentException("Headers cannot be null");
            }
            strArr2[i11] = q.W0(strArr[i11]).toString();
        }
        int iB = ld.c.b(0, strArr2.length - 1, 2);
        if (iB >= 0) {
            while (true) {
                String str = strArr2[i10];
                String str2 = strArr2[i10 + 1];
                s(str);
                t(str2, str);
                if (i10 == iB) {
                    break;
                }
                i10 += 2;
            }
        }
        return new y(strArr2);
    }

    public static final Iterator k(y yVar) {
        rd.m.e(yVar, "<this>");
        int size = yVar.size();
        dd.q[] qVarArr = new dd.q[size];
        for (int i10 = 0; i10 < size; i10++) {
            qVarArr[i10] = w.a(yVar.d(i10), yVar.g(i10));
        }
        return rd.c.a(qVarArr);
    }

    public static final String l(y yVar, int i10) {
        rd.m.e(yVar, "<this>");
        String str = (String) ed.j.J(yVar.c(), i10 * 2);
        if (str != null) {
            return str;
        }
        throw new IndexOutOfBoundsException("name[" + i10 + ']');
    }

    public static final y.a m(y yVar) {
        rd.m.e(yVar, "<this>");
        y.a aVar = new y.a();
        ed.q.B(aVar.h(), yVar.c());
        return aVar;
    }

    public static final y.a n(y.a aVar, String str) {
        rd.m.e(aVar, "<this>");
        rd.m.e(str, "name");
        int i10 = 0;
        while (i10 < aVar.h().size()) {
            if (q.x(str, (String) aVar.h().get(i10), true)) {
                aVar.h().remove(i10);
                aVar.h().remove(i10);
                i10 -= 2;
            }
            i10 += 2;
        }
        return aVar;
    }

    public static final y.a o(y.a aVar, String str, String str2) {
        rd.m.e(aVar, "<this>");
        rd.m.e(str, "name");
        rd.m.e(str2, "value");
        s(str);
        t(str2, str);
        aVar.i(str);
        d(aVar, str, str2);
        return aVar;
    }

    public static final String p(y yVar) {
        rd.m.e(yVar, "<this>");
        StringBuilder sb2 = new StringBuilder();
        int size = yVar.size();
        for (int i10 = 0; i10 < size; i10++) {
            String strD = yVar.d(i10);
            String strG = yVar.g(i10);
            sb2.append(strD);
            sb2.append(": ");
            if (m.y(strD)) {
                strG = "██";
            }
            sb2.append(strG);
            sb2.append("\n");
        }
        return sb2.toString();
    }

    public static final String q(y yVar, int i10) {
        rd.m.e(yVar, "<this>");
        String str = (String) ed.j.J(yVar.c(), (i10 * 2) + 1);
        if (str != null) {
            return str;
        }
        throw new IndexOutOfBoundsException("value[" + i10 + ']');
    }

    public static final List r(y yVar, String str) {
        rd.m.e(yVar, "<this>");
        rd.m.e(str, "name");
        int size = yVar.size();
        List listUnmodifiableList = null;
        ArrayList arrayList = null;
        for (int i10 = 0; i10 < size; i10++) {
            if (q.x(str, yVar.d(i10), true)) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(yVar.g(i10));
            }
        }
        if (arrayList != null) {
            listUnmodifiableList = DesugarCollections.unmodifiableList(arrayList);
            rd.m.d(listUnmodifiableList, "unmodifiableList(...)");
        }
        return listUnmodifiableList == null ? ed.q.k() : listUnmodifiableList;
    }

    public static final void s(String str) {
        rd.m.e(str, "name");
        if (str.length() <= 0) {
            throw new IllegalArgumentException("name is empty");
        }
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            char cCharAt = str.charAt(i10);
            if ('!' > cCharAt || cCharAt >= 127) {
                throw new IllegalArgumentException(("Unexpected char 0x" + a(cCharAt) + " at " + i10 + " in header name: " + str).toString());
            }
        }
    }

    public static final void t(String str, String str2) {
        rd.m.e(str, "value");
        rd.m.e(str2, "name");
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            char cCharAt = str.charAt(i10);
            if (cCharAt != '\t' && (' ' > cCharAt || cCharAt >= 127)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Unexpected char 0x");
                sb2.append(a(cCharAt));
                sb2.append(" at ");
                sb2.append(i10);
                sb2.append(" in ");
                sb2.append(str2);
                sb2.append(" value");
                sb2.append(m.y(str2) ? "" : ": " + str);
                throw new IllegalArgumentException(sb2.toString().toString());
            }
        }
    }
}
