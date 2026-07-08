package v9;

import java.io.Serializable;
import r9.h;
import r9.l;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f30512a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f30513b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f30514c;

    private a(String str, int i10, boolean z10) {
        this.f30512a = str;
        this.f30513b = i10;
        this.f30514c = z10;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static v9.a a(java.lang.String r7) {
        /*
            r9.l.n(r7)
            java.lang.String r0 = "["
            boolean r0 = r7.startsWith(r0)
            r1 = -1
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L19
            java.lang.String[] r0 = c(r7)
            r4 = r0[r3]
            r0 = r0[r2]
        L16:
            r5 = r4
            r4 = 0
            goto L3c
        L19:
            r0 = 58
            int r4 = r7.indexOf(r0)
            if (r4 < 0) goto L32
            int r5 = r4 + 1
            int r0 = r7.indexOf(r0, r5)
            if (r0 != r1) goto L32
            java.lang.String r4 = r7.substring(r3, r4)
            java.lang.String r0 = r7.substring(r5)
            goto L16
        L32:
            if (r4 < 0) goto L36
            r0 = 1
            goto L37
        L36:
            r0 = 0
        L37:
            r4 = 0
            r5 = r4
            r4 = r0
            r0 = r5
            r5 = r7
        L3c:
            boolean r6 = r9.p.b(r0)
            if (r6 == 0) goto L47
            java.lang.Integer r7 = java.lang.Integer.valueOf(r1)
            goto L62
        L47:
            java.lang.Integer r0 = w9.a.b(r0)
            if (r0 == 0) goto L4e
            goto L4f
        L4e:
            r2 = 0
        L4f:
            java.lang.String r1 = "Unparseable port number: %s"
            r9.l.j(r2, r1, r7)
            int r1 = r0.intValue()
            boolean r1 = e(r1)
            java.lang.String r2 = "Port number out of range: %s"
            r9.l.j(r1, r2, r7)
            r7 = r0
        L62:
            v9.a r0 = new v9.a
            int r7 = r7.intValue()
            r0.<init>(r5, r7, r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: v9.a.a(java.lang.String):v9.a");
    }

    private static String[] c(String str) {
        l.j(str.charAt(0) == '[', "Bracketed host-port string must start with a bracket: %s", str);
        int iIndexOf = str.indexOf(58);
        int iLastIndexOf = str.lastIndexOf(93);
        l.j(iIndexOf > -1 && iLastIndexOf > iIndexOf, "Invalid bracketed host/port: %s", str);
        String strSubstring = str.substring(1, iLastIndexOf);
        int i10 = iLastIndexOf + 1;
        if (i10 == str.length()) {
            return new String[]{strSubstring, ""};
        }
        l.j(str.charAt(i10) == ':', "Only a colon may follow a close bracket: %s", str);
        int i11 = iLastIndexOf + 2;
        for (int i12 = i11; i12 < str.length(); i12++) {
            l.j(Character.isDigit(str.charAt(i12)), "Port must be numeric: %s", str);
        }
        return new String[]{strSubstring, str.substring(i11)};
    }

    private static boolean e(int i10) {
        return i10 >= 0 && i10 <= 65535;
    }

    public String b() {
        return this.f30512a;
    }

    public boolean d() {
        return this.f30513b >= 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (h.a(this.f30512a, aVar.f30512a) && this.f30513b == aVar.f30513b) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return h.b(this.f30512a, Integer.valueOf(this.f30513b));
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(this.f30512a.length() + 8);
        if (this.f30512a.indexOf(58) >= 0) {
            sb2.append('[');
            sb2.append(this.f30512a);
            sb2.append(']');
        } else {
            sb2.append(this.f30512a);
        }
        if (d()) {
            sb2.append(':');
            sb2.append(this.f30513b);
        }
        return sb2.toString();
    }
}
