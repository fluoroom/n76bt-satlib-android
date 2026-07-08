package eh;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public final class b0 {

    /* JADX INFO: renamed from: e */
    public static final a f12251e = new a(null);

    /* JADX INFO: renamed from: f */
    private static final rg.o f12252f = new rg.o("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");

    /* JADX INFO: renamed from: g */
    private static final rg.o f12253g = new rg.o(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");

    /* JADX INFO: renamed from: a */
    private final String f12254a;

    /* JADX INFO: renamed from: b */
    private final String f12255b;

    /* JADX INFO: renamed from: c */
    private final String f12256c;

    /* JADX INFO: renamed from: d */
    private final String[] f12257d;

    public static final class a {
        public /* synthetic */ a(rd.h hVar) {
            this();
        }

        public final b0 a(String str) {
            rd.m.e(str, "<this>");
            rg.l lVarA = b0.f12252f.a(str, 0);
            if (lVarA == null) {
                throw new IllegalArgumentException("No subtype found for: \"" + str + '\"');
            }
            String str2 = (String) lVarA.b().get(1);
            Locale locale = Locale.ROOT;
            String lowerCase = str2.toLowerCase(locale);
            rd.m.d(lowerCase, "toLowerCase(...)");
            String lowerCase2 = ((String) lVarA.b().get(2)).toLowerCase(locale);
            rd.m.d(lowerCase2, "toLowerCase(...)");
            ArrayList arrayList = new ArrayList();
            int iC = lVarA.d().c();
            while (true) {
                int i10 = iC + 1;
                if (i10 >= str.length()) {
                    return new b0(str, lowerCase, lowerCase2, (String[]) arrayList.toArray(new String[0]));
                }
                rg.l lVarA2 = b0.f12253g.a(str, i10);
                if (lVarA2 == null) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Parameter is not formatted correctly: \"");
                    String strSubstring = str.substring(i10);
                    rd.m.d(strSubstring, "substring(...)");
                    sb2.append(strSubstring);
                    sb2.append("\" for: \"");
                    sb2.append(str);
                    sb2.append('\"');
                    throw new IllegalArgumentException(sb2.toString().toString());
                }
                rg.j jVar = lVarA2.c().get(1);
                String strA = jVar != null ? jVar.a() : null;
                if (strA == null) {
                    iC = lVarA2.d().c();
                } else {
                    rg.j jVar2 = lVarA2.c().get(2);
                    String strA2 = jVar2 != null ? jVar2.a() : null;
                    if (strA2 == null) {
                        rg.j jVar3 = lVarA2.c().get(3);
                        rd.m.b(jVar3);
                        strA2 = jVar3.a();
                    } else if (rg.q.F0(strA2, '\'', false, 2, null) && rg.q.S(strA2, '\'', false, 2, null) && strA2.length() > 2) {
                        strA2 = strA2.substring(1, strA2.length() - 1);
                        rd.m.d(strA2, "substring(...)");
                    }
                    arrayList.add(strA);
                    arrayList.add(strA2);
                    iC = lVarA2.d().c();
                }
            }
        }

        public final b0 b(String str) {
            rd.m.e(str, "<this>");
            try {
                return a(str);
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }

        private a() {
        }
    }

    public b0(String str, String str2, String str3, String[] strArr) {
        rd.m.e(str, "mediaType");
        rd.m.e(str2, "type");
        rd.m.e(str3, "subtype");
        rd.m.e(strArr, "parameterNamesAndValues");
        this.f12254a = str;
        this.f12255b = str2;
        this.f12256c = str3;
        this.f12257d = strArr;
    }

    public static /* synthetic */ Charset d(b0 b0Var, Charset charset, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            charset = null;
        }
        return b0Var.c(charset);
    }

    public static final b0 e(String str) {
        return f12251e.a(str);
    }

    public final Charset c(Charset charset) {
        String strF = f("charset");
        if (strF == null) {
            return charset;
        }
        try {
            return Charset.forName(strF);
        } catch (IllegalArgumentException unused) {
            return charset;
        }
    }

    public boolean equals(Object obj) {
        return (obj instanceof b0) && rd.m.a(((b0) obj).f12254a, this.f12254a);
    }

    public final String f(String str) {
        rd.m.e(str, "name");
        int i10 = 0;
        int iB = ld.c.b(0, this.f12257d.length - 1, 2);
        if (iB < 0) {
            return null;
        }
        while (!rg.q.x(this.f12257d[i10], str, true)) {
            if (i10 == iB) {
                return null;
            }
            i10 += 2;
        }
        return this.f12257d[i10 + 1];
    }

    public final String g() {
        return this.f12255b;
    }

    public int hashCode() {
        return this.f12254a.hashCode();
    }

    public String toString() {
        return this.f12254a;
    }
}
