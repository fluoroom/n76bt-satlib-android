package fh;

import androidx.appcompat.widget.ActivityChooserView;
import java.io.Closeable;
import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import rg.q;
import vh.c0;
import vh.e0;
import vh.h;

/* JADX INFO: loaded from: classes3.dex */
public abstract class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte[] f13103a = new byte[0];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final c0 f13104b;

    static {
        c0.a aVar = c0.f30769d;
        h.a aVar2 = vh.h.f30792d;
        f13104b = aVar.d(aVar2.b("efbbbf"), aVar2.b("feff"), aVar2.b("fffe0000"), aVar2.b("fffe"), aVar2.b("0000feff"));
    }

    public static final int A(vh.g gVar) {
        rd.m.e(gVar, "<this>");
        return b(gVar.readByte(), 255) | (b(gVar.readByte(), 255) << 16) | (b(gVar.readByte(), 255) << 8);
    }

    public static final int B(vh.e eVar, byte b10) throws EOFException {
        rd.m.e(eVar, "<this>");
        int i10 = 0;
        while (!eVar.z() && eVar.G(0L) == b10) {
            i10++;
            eVar.readByte();
        }
        return i10;
    }

    public static final long C(String str, long j10) {
        rd.m.e(str, "<this>");
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return j10;
        }
    }

    public static final int D(String str, int i10) {
        if (str == null) {
            return i10;
        }
        try {
            long j10 = Long.parseLong(str);
            if (j10 > 2147483647L) {
                return ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
            }
            if (j10 < 0) {
                return 0;
            }
            return (int) j10;
        } catch (NumberFormatException unused) {
            return i10;
        }
    }

    public static final String E(String str, int i10, int i11) {
        rd.m.e(str, "<this>");
        int iQ = q(str, i10, i11);
        String strSubstring = str.substring(iQ, s(str, iQ, i11));
        rd.m.d(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static /* synthetic */ String F(String str, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = str.length();
        }
        return E(str, i10, i11);
    }

    public static final Throwable G(Exception exc, List list) {
        rd.m.e(exc, "<this>");
        rd.m.e(list, "suppressed");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            dd.b.a(exc, (Exception) it.next());
        }
        return exc;
    }

    public static final void H(vh.f fVar, int i10) {
        rd.m.e(fVar, "<this>");
        fVar.writeByte((i10 >>> 16) & 255);
        fVar.writeByte((i10 >>> 8) & 255);
        fVar.writeByte(i10 & 255);
    }

    public static final void a(List list, Object obj) {
        rd.m.e(list, "<this>");
        if (list.contains(obj)) {
            return;
        }
        list.add(obj);
    }

    public static final int b(byte b10, int i10) {
        return b10 & i10;
    }

    public static final int c(short s10, int i10) {
        return s10 & i10;
    }

    public static final long d(int i10, long j10) {
        return j10 & ((long) i10);
    }

    public static final void e(long j10, long j11, long j12) {
        if ((j11 | j12) < 0 || j11 > j10 || j10 - j11 < j12) {
            throw new ArrayIndexOutOfBoundsException("length=" + j10 + ", offset=" + j11 + ", count=" + j11);
        }
    }

    public static final void f(Closeable closeable) {
        rd.m.e(closeable, "<this>");
        try {
            closeable.close();
        } catch (RuntimeException e10) {
            throw e10;
        } catch (Exception unused) {
        }
    }

    public static final String[] g(String[] strArr, String str) {
        rd.m.e(strArr, "<this>");
        rd.m.e(str, "value");
        Object[] objArrCopyOf = Arrays.copyOf(strArr, strArr.length + 1);
        rd.m.d(objArrCopyOf, "copyOf(...)");
        String[] strArr2 = (String[]) objArrCopyOf;
        strArr2[ed.j.H(strArr2)] = str;
        return strArr2;
    }

    public static final void h(vh.k kVar, e0 e0Var) throws IOException {
        rd.m.e(kVar, "<this>");
        rd.m.e(e0Var, "directory");
        try {
            IOException iOException = null;
            for (e0 e0Var2 : kVar.w(e0Var)) {
                try {
                    if (kVar.x(e0Var2).e()) {
                        h(kVar, e0Var2);
                    }
                    kVar.r(e0Var2);
                } catch (IOException e10) {
                    if (iOException == null) {
                        iOException = e10;
                    }
                }
            }
            if (iOException != null) {
                throw iOException;
            }
        } catch (FileNotFoundException unused) {
        }
    }

    public static final void i(vh.k kVar, e0 e0Var) {
        rd.m.e(kVar, "<this>");
        rd.m.e(e0Var, "path");
        try {
            kVar.r(e0Var);
        } catch (FileNotFoundException unused) {
        }
    }

    public static final int j(String str, char c10, int i10, int i11) {
        rd.m.e(str, "<this>");
        while (i10 < i11) {
            if (str.charAt(i10) == c10) {
                return i10;
            }
            i10++;
        }
        return i11;
    }

    public static final int k(String str, String str2, int i10, int i11) {
        rd.m.e(str, "<this>");
        rd.m.e(str2, "delimiters");
        while (i10 < i11) {
            if (q.O(str2, str.charAt(i10), false, 2, null)) {
                return i10;
            }
            i10++;
        }
        return i11;
    }

    public static /* synthetic */ int l(String str, char c10, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = str.length();
        }
        return j(str, c10, i10, i11);
    }

    public static final c0 m() {
        return f13104b;
    }

    public static final boolean n(String[] strArr, String[] strArr2, Comparator comparator) {
        rd.m.e(strArr, "<this>");
        rd.m.e(comparator, "comparator");
        if (strArr.length != 0 && strArr2 != null && strArr2.length != 0) {
            for (String str : strArr) {
                for (String str2 : strArr2) {
                    if (comparator.compare(str, str2) == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static final int o(String[] strArr, String str, Comparator comparator) {
        rd.m.e(strArr, "<this>");
        rd.m.e(str, "value");
        rd.m.e(comparator, "comparator");
        int length = strArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (comparator.compare(strArr[i10], str) == 0) {
                return i10;
            }
        }
        return -1;
    }

    public static final int p(String str) {
        rd.m.e(str, "<this>");
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            char cCharAt = str.charAt(i10);
            if (rd.m.f(cCharAt, 31) <= 0 || rd.m.f(cCharAt, 127) >= 0) {
                return i10;
            }
        }
        return -1;
    }

    public static final int q(String str, int i10, int i11) {
        rd.m.e(str, "<this>");
        while (i10 < i11) {
            char cCharAt = str.charAt(i10);
            if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\f' && cCharAt != '\r' && cCharAt != ' ') {
                return i10;
            }
            i10++;
        }
        return i11;
    }

    public static /* synthetic */ int r(String str, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = str.length();
        }
        return q(str, i10, i11);
    }

    public static final int s(String str, int i10, int i11) {
        rd.m.e(str, "<this>");
        int i12 = i11 - 1;
        if (i10 <= i12) {
            while (true) {
                char cCharAt = str.charAt(i12);
                if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\f' && cCharAt != '\r' && cCharAt != ' ') {
                    return i12 + 1;
                }
                if (i12 == i10) {
                    break;
                }
                i12--;
            }
        }
        return i10;
    }

    public static /* synthetic */ int t(String str, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = str.length();
        }
        return s(str, i10, i11);
    }

    public static final int u(String str, int i10) {
        rd.m.e(str, "<this>");
        int length = str.length();
        while (i10 < length) {
            char cCharAt = str.charAt(i10);
            if (cCharAt != ' ' && cCharAt != '\t') {
                return i10;
            }
            i10++;
        }
        return str.length();
    }

    public static final List v(Iterable iterable, Iterable iterable2) {
        rd.m.e(iterable, "a");
        rd.m.e(iterable2, "b");
        Iterator it = iterable.iterator();
        Iterator it2 = iterable2.iterator();
        List listC = ed.q.c();
        while (true) {
            if (!it.hasNext() && !it2.hasNext()) {
                return ed.q.a(listC);
            }
            if (it.hasNext()) {
                listC.add(it.next());
            }
            if (it2.hasNext()) {
                listC.add(it2.next());
            }
        }
    }

    public static final String[] w(String[] strArr, String[] strArr2, Comparator comparator) {
        rd.m.e(strArr, "<this>");
        rd.m.e(strArr2, "other");
        rd.m.e(comparator, "comparator");
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            int length = strArr2.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    break;
                }
                if (comparator.compare(str, strArr2[i10]) == 0) {
                    arrayList.add(str);
                    break;
                }
                i10++;
            }
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0038  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean x(vh.k r2, vh.e0 r3) throws java.lang.Throwable {
        /*
            java.lang.String r0 = "<this>"
            rd.m.e(r2, r0)
            java.lang.String r0 = "file"
            rd.m.e(r3, r0)
            vh.l0 r0 = r2.S(r3)
            r2.r(r3)     // Catch: java.lang.Throwable -> L18 java.io.IOException -> L1a
            r2 = 1
            if (r0 == 0) goto L17
            r0.close()     // Catch: java.lang.Throwable -> L17
        L17:
            return r2
        L18:
            r1 = move-exception
            goto L26
        L1a:
            dd.d0 r1 = dd.d0.f10897a     // Catch: java.lang.Throwable -> L18
            if (r0 == 0) goto L24
            r0.close()     // Catch: java.lang.Throwable -> L22
            goto L24
        L22:
            r0 = move-exception
            goto L31
        L24:
            r0 = 0
            goto L31
        L26:
            if (r0 == 0) goto L30
            r0.close()     // Catch: java.lang.Throwable -> L2c
            goto L30
        L2c:
            r0 = move-exception
            dd.b.a(r1, r0)
        L30:
            r0 = r1
        L31:
            if (r0 != 0) goto L38
            r2.r(r3)
            r2 = 0
            return r2
        L38:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: fh.m.x(vh.k, vh.e0):boolean");
    }

    public static final boolean y(String str) {
        rd.m.e(str, "name");
        return q.x(str, "Authorization", true) || q.x(str, "Cookie", true) || q.x(str, "Proxy-Authorization", true) || q.x(str, "Set-Cookie", true);
    }

    public static final int z(char c10) {
        if ('0' <= c10 && c10 < ':') {
            return c10 - '0';
        }
        if ('a' <= c10 && c10 < 'g') {
            return c10 - 'W';
        }
        if ('A' > c10 || c10 >= 'G') {
            return -1;
        }
        return c10 - '7';
    }
}
