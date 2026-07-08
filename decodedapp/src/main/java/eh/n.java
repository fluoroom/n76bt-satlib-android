package eh;

import com.facebook.stetho.websocket.CloseCodes;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;

/* JADX INFO: loaded from: classes3.dex */
public final class n {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final a f12569k = new a(null);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final Pattern f12570l = Pattern.compile("(\\d{2,4})[^\\d]*");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final Pattern f12571m = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final Pattern f12572n = Pattern.compile("(\\d{1,2})[^\\d]*");

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final Pattern f12573o = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f12574a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f12575b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f12576c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f12577d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f12578e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f12579f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f12580g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f12581h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final boolean f12582i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final String f12583j;

    public static final class a {
        public /* synthetic */ a(rd.h hVar) {
            this();
        }

        private final int a(String str, int i10, int i11, boolean z10) {
            while (i10 < i11) {
                char cCharAt = str.charAt(i10);
                if (((cCharAt < ' ' && cCharAt != '\t') || cCharAt >= 127 || ('0' <= cCharAt && cCharAt < ':') || (('a' <= cCharAt && cCharAt < '{') || (('A' <= cCharAt && cCharAt < '[') || cCharAt == ':'))) == (!z10)) {
                    return i10;
                }
                i10++;
            }
            return i11;
        }

        private final boolean b(String str, String str2) {
            if (rd.m.a(str, str2)) {
                return true;
            }
            return rg.q.w(str, str2, false, 2, null) && str.charAt((str.length() - str2.length()) - 1) == '.' && !fh.k.a(str);
        }

        private final String f(String str) {
            if (rg.q.w(str, ".", false, 2, null)) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            String strK = fh.k.k(rg.q.v0(str, "."));
            if (strK != null) {
                return strK;
            }
            throw new IllegalArgumentException();
        }

        private final long g(String str, int i10, int i11) {
            int iA = a(str, i10, i11, false);
            Matcher matcher = n.f12573o.matcher(str);
            int i12 = -1;
            int i13 = -1;
            int i14 = -1;
            int iC0 = -1;
            int i15 = -1;
            int i16 = -1;
            while (iA < i11) {
                int iA2 = a(str, iA + 1, i11, true);
                matcher.region(iA, iA2);
                if (i13 == -1 && matcher.usePattern(n.f12573o).matches()) {
                    String strGroup = matcher.group(1);
                    rd.m.d(strGroup, "group(...)");
                    i13 = Integer.parseInt(strGroup);
                    String strGroup2 = matcher.group(2);
                    rd.m.d(strGroup2, "group(...)");
                    i15 = Integer.parseInt(strGroup2);
                    String strGroup3 = matcher.group(3);
                    rd.m.d(strGroup3, "group(...)");
                    i16 = Integer.parseInt(strGroup3);
                } else if (i14 == -1 && matcher.usePattern(n.f12572n).matches()) {
                    String strGroup4 = matcher.group(1);
                    rd.m.d(strGroup4, "group(...)");
                    i14 = Integer.parseInt(strGroup4);
                } else if (iC0 == -1 && matcher.usePattern(n.f12571m).matches()) {
                    String strGroup5 = matcher.group(1);
                    rd.m.d(strGroup5, "group(...)");
                    Locale locale = Locale.US;
                    rd.m.d(locale, "US");
                    String lowerCase = strGroup5.toLowerCase(locale);
                    rd.m.d(lowerCase, "toLowerCase(...)");
                    String strPattern = n.f12571m.pattern();
                    rd.m.d(strPattern, "pattern(...)");
                    iC0 = rg.q.c0(strPattern, lowerCase, 0, false, 6, null) / 4;
                } else if (i12 == -1 && matcher.usePattern(n.f12570l).matches()) {
                    String strGroup6 = matcher.group(1);
                    rd.m.d(strGroup6, "group(...)");
                    i12 = Integer.parseInt(strGroup6);
                }
                iA = a(str, iA2 + 1, i11, false);
            }
            if (70 <= i12 && i12 < 100) {
                i12 += 1900;
            }
            if (i12 >= 0 && i12 < 70) {
                i12 += 2000;
            }
            if (i12 < 1601) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            if (iC0 == -1) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            if (1 > i14 || i14 >= 32) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            if (i13 < 0 || i13 >= 24) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            if (i15 < 0 || i15 >= 60) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            if (i16 < 0 || i16 >= 60) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            GregorianCalendar gregorianCalendar = new GregorianCalendar(fh.p.f13108a);
            gregorianCalendar.setLenient(false);
            gregorianCalendar.set(1, i12);
            gregorianCalendar.set(2, iC0 - 1);
            gregorianCalendar.set(5, i14);
            gregorianCalendar.set(11, i13);
            gregorianCalendar.set(12, i15);
            gregorianCalendar.set(13, i16);
            gregorianCalendar.set(14, 0);
            return gregorianCalendar.getTimeInMillis();
        }

        private final long h(String str) {
            try {
                long j10 = Long.parseLong(str);
                if (j10 <= 0) {
                    return Long.MIN_VALUE;
                }
                return j10;
            } catch (NumberFormatException e10) {
                if (new rg.o("-?\\d+").c(str)) {
                    return rg.q.J(str, "-", false, 2, null) ? Long.MIN_VALUE : Long.MAX_VALUE;
                }
                throw e10;
            }
        }

        public final n c(z zVar, String str) {
            rd.m.e(zVar, "url");
            rd.m.e(str, "setCookie");
            return d(System.currentTimeMillis(), zVar, str);
        }

        public final n d(long j10, z zVar, String str) {
            long j11;
            rd.m.e(zVar, "url");
            rd.m.e(str, "setCookie");
            int iL = fh.m.l(str, ';', 0, 0, 6, null);
            int iL2 = fh.m.l(str, '=', 0, iL, 2, null);
            n nVar = null;
            if (iL2 == iL) {
                return null;
            }
            String strF = fh.m.F(str, 0, iL2, 1, null);
            if (strF.length() == 0 || fh.m.p(strF) != -1) {
                return null;
            }
            String strE = fh.m.E(str, iL2 + 1, iL);
            if (fh.m.p(strE) != -1) {
                return null;
            }
            int i10 = iL + 1;
            int length = str.length();
            String strF2 = null;
            String str2 = null;
            String str3 = null;
            long jH = -1;
            boolean z10 = false;
            boolean z11 = true;
            boolean z12 = false;
            long jG = 253402300799999L;
            boolean z13 = false;
            while (i10 < length) {
                int iJ = fh.m.j(str, ';', i10, length);
                int iJ2 = fh.m.j(str, '=', i10, iJ);
                String strE2 = fh.m.E(str, i10, iJ2);
                String strE3 = iJ2 < iJ ? fh.m.E(str, iJ2 + 1, iJ) : "";
                n nVar2 = nVar;
                if (rg.q.x(strE2, "expires", true)) {
                    try {
                        jG = g(strE3, 0, strE3.length());
                        z12 = true;
                    } catch (NumberFormatException | IllegalArgumentException unused) {
                    }
                } else if (rg.q.x(strE2, "max-age", true)) {
                    jH = h(strE3);
                    z12 = true;
                } else if (rg.q.x(strE2, "domain", true)) {
                    strF2 = f(strE3);
                    z11 = false;
                } else if (rg.q.x(strE2, "path", true)) {
                    str2 = strE3;
                } else if (rg.q.x(strE2, "secure", true)) {
                    z13 = true;
                } else if (rg.q.x(strE2, "httponly", true)) {
                    z10 = true;
                } else if (rg.q.x(strE2, "samesite", true)) {
                    str3 = strE3;
                }
                i10 = iJ + 1;
                nVar = nVar2;
            }
            n nVar3 = nVar;
            if (jH == Long.MIN_VALUE) {
                j11 = Long.MIN_VALUE;
            } else if (jH != -1) {
                long j12 = j10 + (jH <= 9223372036854775L ? jH * ((long) CloseCodes.NORMAL_CLOSURE) : Long.MAX_VALUE);
                j11 = (j12 < j10 || j12 > 253402300799999L) ? 253402300799999L : j12;
            } else {
                j11 = jG;
            }
            String strH = zVar.h();
            if (strF2 == null) {
                strF2 = strH;
            } else if (!b(strH, strF2)) {
                return nVar3;
            }
            if (strH.length() != strF2.length() && PublicSuffixDatabase.INSTANCE.c().c(strF2) == null) {
                return nVar3;
            }
            String strSubstring = "/";
            if (str2 == null || !rg.q.J(str2, "/", false, 2, nVar3)) {
                String strC = zVar.c();
                int iH0 = rg.q.h0(strC, '/', 0, false, 6, null);
                if (iH0 != 0) {
                    strSubstring = strC.substring(0, iH0);
                    rd.m.d(strSubstring, "substring(...)");
                }
                str2 = strSubstring;
            }
            return new n(strF, strE, j11, strF2, str2, z13, z10, z12, z11, str3, null);
        }

        public final List e(z zVar, y yVar) {
            rd.m.e(zVar, "url");
            rd.m.e(yVar, "headers");
            List listH = yVar.h("Set-Cookie");
            int size = listH.size();
            List listUnmodifiableList = null;
            ArrayList arrayList = null;
            for (int i10 = 0; i10 < size; i10++) {
                n nVarC = c(zVar, (String) listH.get(i10));
                if (nVarC != null) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(nVarC);
                }
            }
            if (arrayList != null) {
                listUnmodifiableList = DesugarCollections.unmodifiableList(arrayList);
                rd.m.d(listUnmodifiableList, "unmodifiableList(...)");
            }
            return listUnmodifiableList == null ? ed.q.k() : listUnmodifiableList;
        }

        private a() {
        }
    }

    public /* synthetic */ n(String str, String str2, long j10, String str3, String str4, boolean z10, boolean z11, boolean z12, boolean z13, String str5, rd.h hVar) {
        this(str, str2, j10, str3, str4, z10, z11, z12, z13, str5);
    }

    public final String e() {
        return this.f12574a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return rd.m.a(nVar.f12574a, this.f12574a) && rd.m.a(nVar.f12575b, this.f12575b) && nVar.f12576c == this.f12576c && rd.m.a(nVar.f12577d, this.f12577d) && rd.m.a(nVar.f12578e, this.f12578e) && nVar.f12579f == this.f12579f && nVar.f12580g == this.f12580g && nVar.f12581h == this.f12581h && nVar.f12582i == this.f12582i && rd.m.a(nVar.f12583j, this.f12583j);
    }

    public final String f(boolean z10) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f12574a);
        sb2.append('=');
        sb2.append(this.f12575b);
        if (this.f12581h) {
            if (this.f12576c == Long.MIN_VALUE) {
                sb2.append("; max-age=0");
            } else {
                sb2.append("; expires=");
                sb2.append(kh.c.b(new Date(this.f12576c)));
            }
        }
        if (!this.f12582i) {
            sb2.append("; domain=");
            if (z10) {
                sb2.append(".");
            }
            sb2.append(this.f12577d);
        }
        sb2.append("; path=");
        sb2.append(this.f12578e);
        if (this.f12579f) {
            sb2.append("; secure");
        }
        if (this.f12580g) {
            sb2.append("; httponly");
        }
        if (this.f12583j != null) {
            sb2.append("; samesite=");
            sb2.append(this.f12583j);
        }
        String string = sb2.toString();
        rd.m.d(string, "toString(...)");
        return string;
    }

    public final String g() {
        return this.f12575b;
    }

    public int hashCode() {
        int iHashCode = (((((((((((((((((527 + this.f12574a.hashCode()) * 31) + this.f12575b.hashCode()) * 31) + o4.a.a(this.f12576c)) * 31) + this.f12577d.hashCode()) * 31) + this.f12578e.hashCode()) * 31) + o4.b.a(this.f12579f)) * 31) + o4.b.a(this.f12580g)) * 31) + o4.b.a(this.f12581h)) * 31) + o4.b.a(this.f12582i)) * 31;
        String str = this.f12583j;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return f(false);
    }

    private n(String str, String str2, long j10, String str3, String str4, boolean z10, boolean z11, boolean z12, boolean z13, String str5) {
        this.f12574a = str;
        this.f12575b = str2;
        this.f12576c = j10;
        this.f12577d = str3;
        this.f12578e = str4;
        this.f12579f = z10;
        this.f12580g = z11;
        this.f12581h = z12;
        this.f12582i = z13;
        this.f12583j = str5;
    }
}
