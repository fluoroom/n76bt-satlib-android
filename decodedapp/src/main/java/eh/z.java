package eh;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class z {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final b f12621j = new b(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f12622a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f12623b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f12624c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f12625d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f12626e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final List f12627f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final List f12628g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f12629h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final String f12630i;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f12631a;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f12634d;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private List f12637g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private String f12638h;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f12632b = "";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f12633c = "";

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f12635e = -1;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final List f12636f = ed.q.q("");

        private final int A(String str, int i10, int i11) {
            int i12 = 0;
            while (i10 < i11) {
                char cCharAt = str.charAt(i10);
                if (cCharAt != '/' && cCharAt != '\\') {
                    break;
                }
                i12++;
                i10++;
            }
            return i12;
        }

        private final void B(List list, StringBuilder sb2) {
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                sb2.append('/');
                sb2.append((String) list.get(i10));
            }
        }

        private final List C(String str) {
            ArrayList arrayList = new ArrayList();
            int i10 = 0;
            while (i10 <= str.length()) {
                String str2 = str;
                int iB0 = rg.q.b0(str2, '&', i10, false, 4, null);
                if (iB0 == -1) {
                    iB0 = str2.length();
                }
                int iB02 = rg.q.b0(str2, '=', i10, false, 4, null);
                if (iB02 == -1 || iB02 > iB0) {
                    String strSubstring = str2.substring(i10, iB0);
                    rd.m.d(strSubstring, "substring(...)");
                    arrayList.add(strSubstring);
                    arrayList.add(null);
                } else {
                    String strSubstring2 = str2.substring(i10, iB02);
                    rd.m.d(strSubstring2, "substring(...)");
                    arrayList.add(strSubstring2);
                    String strSubstring3 = str2.substring(iB02 + 1, iB0);
                    rd.m.d(strSubstring3, "substring(...)");
                    arrayList.add(strSubstring3);
                }
                i10 = iB0 + 1;
                str = str2;
            }
            return arrayList;
        }

        private final int d() {
            int i10 = this.f12635e;
            if (i10 != -1) {
                return i10;
            }
            b bVar = z.f12621j;
            String str = this.f12631a;
            rd.m.b(str);
            return bVar.b(str);
        }

        private final boolean h(String str) {
            return rd.m.a(str, ".") || rg.q.x(str, "%2e", true);
        }

        private final boolean i(String str) {
            return rd.m.a(str, "..") || rg.q.x(str, "%2e.", true) || rg.q.x(str, ".%2e", true) || rg.q.x(str, "%2e%2e", true);
        }

        private final int k(String str, int i10, int i11) {
            int i12;
            try {
                i12 = Integer.parseInt(uh.a.b(str, i10, i11, "", false, false, false, false, 120, null));
            } catch (NumberFormatException unused) {
            }
            if (1 > i12 || i12 >= 65536) {
                return -1;
            }
            return i12;
        }

        private final void m() {
            if (((String) this.f12636f.remove(r0.size() - 1)).length() != 0 || this.f12636f.isEmpty()) {
                this.f12636f.add("");
            } else {
                this.f12636f.set(r0.size() - 1, "");
            }
        }

        private final int o(String str, int i10, int i11) {
            while (i10 < i11) {
                char cCharAt = str.charAt(i10);
                if (cCharAt == ':') {
                    return i10;
                }
                if (cCharAt == '[') {
                    do {
                        i10++;
                        if (i10 < i11) {
                        }
                    } while (str.charAt(i10) != ']');
                }
                i10++;
            }
            return i11;
        }

        private final void p(String str, int i10, int i11, boolean z10, boolean z11) {
            String strB = uh.a.b(str, i10, i11, " \"<>^`{}|/\\?#", z11, false, false, false, 112, null);
            if (h(strB)) {
                return;
            }
            if (i(strB)) {
                m();
                return;
            }
            if (((CharSequence) this.f12636f.get(r12.size() - 1)).length() == 0) {
                this.f12636f.set(r12.size() - 1, strB);
            } else {
                this.f12636f.add(strB);
            }
            if (z10) {
                this.f12636f.add("");
            }
        }

        private final void r(String str, int i10, int i11) {
            if (i10 == i11) {
                return;
            }
            char cCharAt = str.charAt(i10);
            if (cCharAt == '/' || cCharAt == '\\') {
                this.f12636f.clear();
                this.f12636f.add("");
                i10++;
            } else {
                List list = this.f12636f;
                list.set(list.size() - 1, "");
            }
            int i12 = i10;
            while (i12 < i11) {
                int iK = fh.m.k(str, "/\\", i12, i11);
                boolean z10 = iK < i11;
                String str2 = str;
                p(str2, i12, iK, z10, true);
                if (z10) {
                    i12 = iK + 1;
                    str = str2;
                } else {
                    str = str2;
                    i12 = iK;
                }
            }
        }

        private final int t(String str, int i10, int i11) {
            if (i11 - i10 < 2) {
                return -1;
            }
            char cCharAt = str.charAt(i10);
            if ((rd.m.f(cCharAt, 97) >= 0 && rd.m.f(cCharAt, 122) <= 0) || (rd.m.f(cCharAt, 65) >= 0 && rd.m.f(cCharAt, 90) <= 0)) {
                while (true) {
                    i10++;
                    if (i10 >= i11) {
                        break;
                    }
                    char cCharAt2 = str.charAt(i10);
                    if ('a' > cCharAt2 || cCharAt2 >= '{') {
                        if ('A' > cCharAt2 || cCharAt2 >= '[') {
                            if ('0' > cCharAt2 || cCharAt2 >= ':') {
                                if (cCharAt2 != '+' && cCharAt2 != '-' && cCharAt2 != '.') {
                                    if (cCharAt2 == ':') {
                                        return i10;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return -1;
        }

        public final a D(String str) {
            rd.m.e(str, "username");
            this.f12632b = uh.a.b(str, 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, 123, null);
            return this;
        }

        public final a a(String str, String str2) {
            rd.m.e(str, "encodedName");
            if (this.f12637g == null) {
                this.f12637g = new ArrayList();
            }
            List list = this.f12637g;
            rd.m.b(list);
            list.add(uh.a.b(str, 0, 0, " \"'<>#&=", true, false, true, false, 83, null));
            List list2 = this.f12637g;
            rd.m.b(list2);
            list2.add(str2 != null ? uh.a.b(str2, 0, 0, " \"'<>#&=", true, false, true, false, 83, null) : null);
            return this;
        }

        public final a b(String str, String str2) {
            rd.m.e(str, "name");
            if (this.f12637g == null) {
                this.f12637g = new ArrayList();
            }
            List list = this.f12637g;
            rd.m.b(list);
            list.add(uh.a.b(str, 0, 0, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", false, false, true, false, 91, null));
            List list2 = this.f12637g;
            rd.m.b(list2);
            list2.add(str2 != null ? uh.a.b(str2, 0, 0, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", false, false, true, false, 91, null) : null);
            return this;
        }

        public final z c() {
            ArrayList arrayList;
            String str = this.f12631a;
            if (str == null) {
                throw new IllegalStateException("scheme == null");
            }
            String strG = uh.a.g(this.f12632b, 0, 0, false, 7, null);
            String strG2 = uh.a.g(this.f12633c, 0, 0, false, 7, null);
            String str2 = this.f12634d;
            if (str2 == null) {
                throw new IllegalStateException("host == null");
            }
            int iD = d();
            List list = this.f12636f;
            ArrayList arrayList2 = new ArrayList(ed.q.v(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList2.add(uh.a.g((String) it.next(), 0, 0, false, 7, null));
            }
            List<String> list2 = this.f12637g;
            if (list2 != null) {
                ArrayList arrayList3 = new ArrayList(ed.q.v(list2, 10));
                for (String str3 : list2) {
                    arrayList3.add(str3 != null ? uh.a.g(str3, 0, 0, true, 3, null) : null);
                }
                arrayList = arrayList3;
            } else {
                arrayList = null;
            }
            String str4 = this.f12638h;
            return new z(str, strG, strG2, str2, iD, arrayList2, arrayList, str4 != null ? uh.a.g(str4, 0, 0, false, 7, null) : null, toString(), null);
        }

        public final a e(String str) {
            String strB;
            this.f12637g = (str == null || (strB = uh.a.b(str, 0, 0, " \"'<>#", true, false, true, false, 83, null)) == null) ? null : C(strB);
            return this;
        }

        public final List f() {
            return this.f12636f;
        }

        public final a g(String str) {
            rd.m.e(str, "host");
            String strK = fh.k.k(uh.a.g(str, 0, 0, false, 7, null));
            if (strK != null) {
                this.f12634d = strK;
                return this;
            }
            throw new IllegalArgumentException("unexpected host: " + str);
        }

        public final a j(z zVar, String str) {
            int iK;
            int i10;
            int i11;
            char c10;
            String str2 = str;
            rd.m.e(str2, "input");
            int iR = fh.m.r(str2, 0, 0, 3, null);
            int iT = fh.m.t(str2, iR, 0, 2, null);
            int iT2 = t(str2, iR, iT);
            if (iT2 != -1) {
                if (rg.q.G(str2, "https:", iR, true)) {
                    this.f12631a = "https";
                    iR += 6;
                } else {
                    if (!rg.q.G(str2, "http:", iR, true)) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Expected URL scheme 'http' or 'https' but was '");
                        String strSubstring = str2.substring(0, iT2);
                        rd.m.d(strSubstring, "substring(...)");
                        sb2.append(strSubstring);
                        sb2.append('\'');
                        throw new IllegalArgumentException(sb2.toString());
                    }
                    this.f12631a = "http";
                    iR += 5;
                }
            } else {
                if (zVar == null) {
                    if (str2.length() > 6) {
                        str2 = rg.q.a1(str2, 6) + "...";
                    }
                    throw new IllegalArgumentException("Expected URL scheme 'http' or 'https' but no scheme was found for " + str2);
                }
                this.f12631a = zVar.q();
            }
            int iA = A(str2, iR, iT);
            char c11 = '?';
            char c12 = '#';
            if (iA >= 2 || zVar == null || !rd.m.a(zVar.q(), this.f12631a)) {
                int i12 = iR + iA;
                boolean z10 = false;
                boolean z11 = false;
                while (true) {
                    iK = fh.m.k(str2, "@/\\?#", i12, iT);
                    byte bCharAt = iK != iT ? str2.charAt(iK) : (byte) -1;
                    if (bCharAt == -1 || bCharAt == c12 || bCharAt == 47 || bCharAt == 92 || bCharAt == c11) {
                        break;
                    }
                    if (bCharAt == 64) {
                        if (z10) {
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append(this.f12633c);
                            sb3.append("%40");
                            str2 = str;
                            i10 = iK;
                            sb3.append(uh.a.b(str2, i12, iK, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, 112, null));
                            this.f12633c = sb3.toString();
                        } else {
                            int iJ = fh.m.j(str2, ':', i12, iK);
                            String strB = uh.a.b(str2, i12, iJ, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, 112, null);
                            if (z11) {
                                strB = this.f12632b + "%40" + strB;
                            }
                            this.f12632b = strB;
                            if (iJ != iK) {
                                i11 = iK;
                                this.f12633c = uh.a.b(str, iJ + 1, i11, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, 112, null);
                                z10 = true;
                            } else {
                                i11 = iK;
                            }
                            str2 = str;
                            i10 = i11;
                            z11 = true;
                        }
                        i12 = i10 + 1;
                        c12 = '#';
                        c11 = '?';
                    }
                }
                int iO = o(str2, i12, iK);
                int i13 = iO + 1;
                if (i13 < iK) {
                    this.f12634d = fh.k.k(uh.a.g(str2, i12, iO, false, 4, null));
                    int iK2 = k(str2, i13, iK);
                    this.f12635e = iK2;
                    if (iK2 == -1) {
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append("Invalid URL port: \"");
                        String strSubstring2 = str2.substring(i13, iK);
                        rd.m.d(strSubstring2, "substring(...)");
                        sb4.append(strSubstring2);
                        sb4.append('\"');
                        throw new IllegalArgumentException(sb4.toString().toString());
                    }
                } else {
                    this.f12634d = fh.k.k(uh.a.g(str2, i12, iO, false, 4, null));
                    b bVar = z.f12621j;
                    String str3 = this.f12631a;
                    rd.m.b(str3);
                    this.f12635e = bVar.b(str3);
                }
                if (this.f12634d == null) {
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append("Invalid URL host: \"");
                    String strSubstring3 = str2.substring(i12, iO);
                    rd.m.d(strSubstring3, "substring(...)");
                    sb5.append(strSubstring3);
                    sb5.append('\"');
                    throw new IllegalArgumentException(sb5.toString().toString());
                }
                iR = iK;
            } else {
                this.f12632b = zVar.f();
                this.f12633c = zVar.b();
                this.f12634d = zVar.h();
                this.f12635e = zVar.m();
                this.f12636f.clear();
                this.f12636f.addAll(zVar.d());
                if (iR == iT || str2.charAt(iR) == '#') {
                    e(zVar.e());
                }
            }
            int iK3 = fh.m.k(str2, "?#", iR, iT);
            r(str2, iR, iK3);
            if (iK3 >= iT || str2.charAt(iK3) != '?') {
                c10 = '#';
            } else {
                c10 = '#';
                int iJ2 = fh.m.j(str2, '#', iK3, iT);
                this.f12637g = C(uh.a.b(str2, iK3 + 1, iJ2, " \"'<>#", true, false, true, false, 80, null));
                iK3 = iJ2;
            }
            if (iK3 < iT && str2.charAt(iK3) == c10) {
                this.f12638h = uh.a.b(str2, iK3 + 1, iT, "", true, false, false, true, 48, null);
            }
            return this;
        }

        public final a l(String str) {
            rd.m.e(str, "password");
            this.f12633c = uh.a.b(str, 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, 123, null);
            return this;
        }

        public final a n(int i10) {
            if (1 <= i10 && i10 < 65536) {
                this.f12635e = i10;
                return this;
            }
            throw new IllegalArgumentException(("unexpected port: " + i10).toString());
        }

        public final a q() {
            String str = this.f12634d;
            this.f12634d = str != null ? new rg.o("[\"<>^`{|}]").d(str, "") : null;
            int size = this.f12636f.size();
            for (int i10 = 0; i10 < size; i10++) {
                List list = this.f12636f;
                list.set(i10, uh.a.b((String) list.get(i10), 0, 0, "[]", true, true, false, false, 99, null));
            }
            List list2 = this.f12637g;
            if (list2 != null) {
                int size2 = list2.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    String str2 = (String) list2.get(i11);
                    list2.set(i11, str2 != null ? uh.a.b(str2, 0, 0, "\\^`{|}", true, true, true, false, 67, null) : null);
                }
            }
            String str3 = this.f12638h;
            this.f12638h = str3 != null ? uh.a.b(str3, 0, 0, " \"#<>\\^`{|}", true, true, false, true, 35, null) : null;
            return this;
        }

        public final a s(String str) {
            rd.m.e(str, "scheme");
            if (rg.q.x(str, "http", true)) {
                this.f12631a = "http";
                return this;
            }
            if (rg.q.x(str, "https", true)) {
                this.f12631a = "https";
                return this;
            }
            throw new IllegalArgumentException("unexpected scheme: " + str);
        }

        /* JADX WARN: Removed duplicated region for block: B:29:0x0085  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.String toString() {
            /*
                r6 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = r6.f12631a
                if (r1 == 0) goto L12
                r0.append(r1)
                java.lang.String r1 = "://"
                r0.append(r1)
                goto L17
            L12:
                java.lang.String r1 = "//"
                r0.append(r1)
            L17:
                java.lang.String r1 = r6.f12632b
                int r1 = r1.length()
                r2 = 58
                if (r1 <= 0) goto L22
                goto L2a
            L22:
                java.lang.String r1 = r6.f12633c
                int r1 = r1.length()
                if (r1 <= 0) goto L44
            L2a:
                java.lang.String r1 = r6.f12632b
                r0.append(r1)
                java.lang.String r1 = r6.f12633c
                int r1 = r1.length()
                if (r1 <= 0) goto L3f
                r0.append(r2)
                java.lang.String r1 = r6.f12633c
                r0.append(r1)
            L3f:
                r1 = 64
                r0.append(r1)
            L44:
                java.lang.String r1 = r6.f12634d
                if (r1 == 0) goto L69
                rd.m.b(r1)
                r3 = 2
                r4 = 0
                r5 = 0
                boolean r1 = rg.q.O(r1, r2, r5, r3, r4)
                if (r1 == 0) goto L64
                r1 = 91
                r0.append(r1)
                java.lang.String r1 = r6.f12634d
                r0.append(r1)
                r1 = 93
                r0.append(r1)
                goto L69
            L64:
                java.lang.String r1 = r6.f12634d
                r0.append(r1)
            L69:
                int r1 = r6.f12635e
                r3 = -1
                if (r1 != r3) goto L72
                java.lang.String r1 = r6.f12631a
                if (r1 == 0) goto L8b
            L72:
                int r1 = r6.d()
                java.lang.String r3 = r6.f12631a
                if (r3 == 0) goto L85
                eh.z$b r4 = eh.z.f12621j
                rd.m.b(r3)
                int r3 = r4.b(r3)
                if (r1 == r3) goto L8b
            L85:
                r0.append(r2)
                r0.append(r1)
            L8b:
                java.util.List r1 = r6.f12636f
                r6.B(r1, r0)
                java.util.List r1 = r6.f12637g
                if (r1 == 0) goto La3
                r1 = 63
                r0.append(r1)
                eh.z$b r1 = eh.z.f12621j
                java.util.List r2 = r6.f12637g
                rd.m.b(r2)
                eh.z.b.a(r1, r2, r0)
            La3:
                java.lang.String r1 = r6.f12638h
                if (r1 == 0) goto Lb1
                r1 = 35
                r0.append(r1)
                java.lang.String r1 = r6.f12638h
                r0.append(r1)
            Lb1:
                java.lang.String r0 = r0.toString()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: eh.z.a.toString():java.lang.String");
        }

        public final void u(String str) {
            this.f12638h = str;
        }

        public final void v(String str) {
            rd.m.e(str, "<set-?>");
            this.f12633c = str;
        }

        public final void w(String str) {
            rd.m.e(str, "<set-?>");
            this.f12632b = str;
        }

        public final void x(String str) {
            this.f12634d = str;
        }

        public final void y(int i10) {
            this.f12635e = i10;
        }

        public final void z(String str) {
            this.f12631a = str;
        }
    }

    public static final class b {
        public /* synthetic */ b(rd.h hVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void e(List list, StringBuilder sb2) {
            xd.a aVarH = xd.d.h(xd.d.i(0, list.size()), 2);
            int iB = aVarH.b();
            int iC = aVarH.c();
            int iD = aVarH.d();
            if ((iD <= 0 || iB > iC) && (iD >= 0 || iC > iB)) {
                return;
            }
            while (true) {
                String str = (String) list.get(iB);
                String str2 = (String) list.get(iB + 1);
                if (iB > 0) {
                    sb2.append('&');
                }
                sb2.append(str);
                if (str2 != null) {
                    sb2.append('=');
                    sb2.append(str2);
                }
                if (iB == iC) {
                    return;
                } else {
                    iB += iD;
                }
            }
        }

        public final int b(String str) {
            rd.m.e(str, "scheme");
            if (rd.m.a(str, "http")) {
                return 80;
            }
            return rd.m.a(str, "https") ? 443 : -1;
        }

        public final z c(String str) {
            rd.m.e(str, "<this>");
            return new a().j(null, str).c();
        }

        public final z d(String str) {
            rd.m.e(str, "<this>");
            try {
                return c(str);
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }

        private b() {
        }
    }

    public /* synthetic */ z(String str, String str2, String str3, String str4, int i10, List list, List list2, String str5, String str6, rd.h hVar) {
        this(str, str2, str3, str4, i10, list, list2, str5, str6);
    }

    public static final z g(String str) {
        return f12621j.c(str);
    }

    public final String a() {
        if (this.f12629h == null) {
            return null;
        }
        String strSubstring = this.f12630i.substring(rg.q.b0(this.f12630i, '#', 0, false, 6, null) + 1);
        rd.m.d(strSubstring, "substring(...)");
        return strSubstring;
    }

    public final String b() {
        if (this.f12624c.length() == 0) {
            return "";
        }
        String strSubstring = this.f12630i.substring(rg.q.b0(this.f12630i, ':', this.f12622a.length() + 3, false, 4, null) + 1, rg.q.b0(this.f12630i, '@', 0, false, 6, null));
        rd.m.d(strSubstring, "substring(...)");
        return strSubstring;
    }

    public final String c() {
        int iB0 = rg.q.b0(this.f12630i, '/', this.f12622a.length() + 3, false, 4, null);
        String str = this.f12630i;
        String strSubstring = this.f12630i.substring(iB0, fh.m.k(str, "?#", iB0, str.length()));
        rd.m.d(strSubstring, "substring(...)");
        return strSubstring;
    }

    public final List d() {
        int iB0 = rg.q.b0(this.f12630i, '/', this.f12622a.length() + 3, false, 4, null);
        String str = this.f12630i;
        int iK = fh.m.k(str, "?#", iB0, str.length());
        ArrayList arrayList = new ArrayList();
        while (iB0 < iK) {
            int i10 = iB0 + 1;
            int iJ = fh.m.j(this.f12630i, '/', i10, iK);
            String strSubstring = this.f12630i.substring(i10, iJ);
            rd.m.d(strSubstring, "substring(...)");
            arrayList.add(strSubstring);
            iB0 = iJ;
        }
        return arrayList;
    }

    public final String e() {
        if (this.f12628g == null) {
            return null;
        }
        int iB0 = rg.q.b0(this.f12630i, '?', 0, false, 6, null) + 1;
        String str = this.f12630i;
        String strSubstring = this.f12630i.substring(iB0, fh.m.j(str, '#', iB0, str.length()));
        rd.m.d(strSubstring, "substring(...)");
        return strSubstring;
    }

    public boolean equals(Object obj) {
        return (obj instanceof z) && rd.m.a(((z) obj).f12630i, this.f12630i);
    }

    public final String f() {
        if (this.f12623b.length() == 0) {
            return "";
        }
        int length = this.f12622a.length() + 3;
        String str = this.f12630i;
        String strSubstring = this.f12630i.substring(length, fh.m.k(str, ":@", length, str.length()));
        rd.m.d(strSubstring, "substring(...)");
        return strSubstring;
    }

    public final String h() {
        return this.f12625d;
    }

    public int hashCode() {
        return this.f12630i.hashCode();
    }

    public final boolean i() {
        return rd.m.a(this.f12622a, "https");
    }

    public final a j() {
        a aVar = new a();
        aVar.z(this.f12622a);
        aVar.w(f());
        aVar.v(b());
        aVar.x(this.f12625d);
        aVar.y(this.f12626e != f12621j.b(this.f12622a) ? this.f12626e : -1);
        aVar.f().clear();
        aVar.f().addAll(d());
        aVar.e(e());
        aVar.u(a());
        return aVar;
    }

    public final a k(String str) {
        rd.m.e(str, "link");
        try {
            return new a().j(this, str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public final List l() {
        return this.f12627f;
    }

    public final int m() {
        return this.f12626e;
    }

    public final String n() {
        if (this.f12628g == null) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        f12621j.e(this.f12628g, sb2);
        return sb2.toString();
    }

    public final String o() {
        a aVarK = k("/...");
        rd.m.b(aVarK);
        return aVarK.D("").l("").c().toString();
    }

    public final z p(String str) {
        rd.m.e(str, "link");
        a aVarK = k(str);
        if (aVarK != null) {
            return aVarK.c();
        }
        return null;
    }

    public final String q() {
        return this.f12622a;
    }

    public final URI r() {
        String string = j().q().toString();
        try {
            return new URI(string);
        } catch (URISyntaxException e10) {
            try {
                URI uriCreate = URI.create(new rg.o("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]").d(string, ""));
                rd.m.b(uriCreate);
                return uriCreate;
            } catch (Exception unused) {
                throw new RuntimeException(e10);
            }
        }
    }

    public final URL s() {
        try {
            return new URL(this.f12630i);
        } catch (MalformedURLException e10) {
            throw new RuntimeException(e10);
        }
    }

    public String toString() {
        return this.f12630i;
    }

    private z(String str, String str2, String str3, String str4, int i10, List list, List list2, String str5, String str6) {
        this.f12622a = str;
        this.f12623b = str2;
        this.f12624c = str3;
        this.f12625d = str4;
        this.f12626e = i10;
        this.f12627f = list;
        this.f12628g = list2;
        this.f12629h = str5;
        this.f12630i = str6;
    }
}
