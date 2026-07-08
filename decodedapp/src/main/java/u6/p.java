package u6;

import com.fasterxml.jackson.databind.JavaType;
import j$.util.DesugarTimeZone;
import java.io.File;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.Currency;
import java.util.IllformedLocaleException;
import java.util.Locale;
import java.util.TimeZone;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public abstract class p extends g0 {

    public static class a extends p {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        protected final int f28308e;

        protected a(Class cls, int i10) {
            super(cls);
            this.f28308e = i10;
        }

        private Locale m1(String str, int i10, String str2, String str3, int i11) {
            String strSubstring = "";
            if (i11 > 0 && i11 > i10) {
                try {
                    strSubstring = str.substring(i10 + 1, i11);
                } catch (IllformedLocaleException unused) {
                    return new Locale(str2, str3, "");
                }
            }
            String strSubstring2 = str.substring(i11 + 2);
            int iIndexOf = strSubstring2.indexOf(95);
            if (iIndexOf < 0) {
                int iIndexOf2 = strSubstring2.indexOf(45);
                return iIndexOf2 < 0 ? new Locale.Builder().setLanguage(str2).setRegion(str3).setVariant(strSubstring).setScript(strSubstring2).build() : new Locale.Builder().setLanguage(str2).setRegion(str3).setVariant(strSubstring).setExtension(strSubstring2.charAt(0), strSubstring2.substring(iIndexOf2 + 1)).build();
            }
            int length = strSubstring2.length();
            Locale.Builder script = new Locale.Builder().setLanguage(str2).setRegion(str3).setVariant(strSubstring).setScript(strSubstring2.substring(0, iIndexOf));
            int i12 = iIndexOf + 1;
            if (i12 < length) {
                script = script.setExtension(strSubstring2.charAt(i12), strSubstring2.substring(Math.min(length, iIndexOf + 3)));
            }
            return script.build();
        }

        private Locale n1(String str, p6.h hVar) {
            int iO1 = o1(str);
            if (iO1 < 0) {
                return new Locale(str);
            }
            String strSubstring = str.substring(0, iO1);
            String strSubstring2 = str.substring(iO1 + 1);
            int iO12 = o1(strSubstring2);
            if (iO12 < 0) {
                return new Locale(strSubstring, strSubstring2);
            }
            String strSubstring3 = strSubstring2.substring(0, iO12);
            int iIndexOf = strSubstring2.indexOf("_#");
            return iIndexOf < 0 ? new Locale(strSubstring, strSubstring3, strSubstring2.substring(iO12 + 1)) : m1(strSubstring2, iO12, strSubstring, strSubstring3, iIndexOf);
        }

        @Override // u6.p
        protected Object e1(String str, p6.h hVar) throws v6.c {
            switch (this.f28308e) {
                case 1:
                    return new File(str);
                case 2:
                    return new URL(str);
                case 3:
                    return URI.create(str);
                case 4:
                    try {
                        return hVar.L(str);
                    } catch (Exception e10) {
                        return hVar.l0(this.f28200a, str, i7.h.F(e10));
                    }
                case 5:
                    return hVar.l().G(str);
                case 6:
                    return Currency.getInstance(str);
                case 7:
                    return Pattern.compile(str);
                case 8:
                    return n1(str, hVar);
                case 9:
                    return Charset.forName(str);
                case 10:
                    return DesugarTimeZone.getTimeZone(str);
                case 11:
                    return InetAddress.getByName(str);
                case 12:
                    if (str.startsWith("[")) {
                        int iLastIndexOf = str.lastIndexOf(93);
                        if (iLastIndexOf == -1) {
                            throw new v6.c(hVar.i0(), "Bracketed IPv6 address must contain closing bracket", str, InetSocketAddress.class);
                        }
                        int iIndexOf = str.indexOf(58, iLastIndexOf);
                        return new InetSocketAddress(str.substring(0, iLastIndexOf + 1), iIndexOf > -1 ? Integer.parseInt(str.substring(iIndexOf + 1)) : 0);
                    }
                    int iIndexOf2 = str.indexOf(58);
                    if (iIndexOf2 >= 0) {
                        int i10 = iIndexOf2 + 1;
                        if (str.indexOf(58, i10) < 0) {
                            return new InetSocketAddress(str.substring(0, iIndexOf2), Integer.parseInt(str.substring(i10)));
                        }
                    }
                    return new InetSocketAddress(str, 0);
                default:
                    o6.r.a();
                    return null;
            }
        }

        @Override // u6.p
        protected Object h1(p6.h hVar) {
            return k(hVar);
        }

        @Override // u6.p
        protected boolean j1() {
            return this.f28308e != 7;
        }

        @Override // p6.l
        public Object k(p6.h hVar) {
            int i10 = this.f28308e;
            return i10 != 3 ? i10 != 8 ? super.k(hVar) : Locale.ROOT : URI.create("");
        }

        protected int o1(String str) {
            int length = str.length();
            for (int i10 = 0; i10 < length; i10++) {
                char cCharAt = str.charAt(i10);
                if (cCharAt == '_' || cCharAt == '-') {
                    return i10;
                }
            }
            return -1;
        }
    }

    static class b extends p {
        public b() {
            super(StringBuffer.class);
        }

        @Override // u6.p, p6.l
        public Object e(e6.j jVar, p6.h hVar) {
            String strK0 = jVar.K0();
            return strK0 != null ? e1(strK0, hVar) : super.e(jVar, hVar);
        }

        @Override // u6.p
        protected Object e1(String str, p6.h hVar) {
            return new StringBuffer(str);
        }

        @Override // p6.l
        public Object k(p6.h hVar) {
            return new StringBuffer();
        }

        @Override // u6.p, u6.g0, p6.l
        public h7.c r() {
            return h7.c.Textual;
        }
    }

    static class c extends p {
        public c() {
            super(StringBuilder.class);
        }

        @Override // u6.p, p6.l
        public Object e(e6.j jVar, p6.h hVar) {
            String strK0 = jVar.K0();
            return strK0 != null ? e1(strK0, hVar) : super.e(jVar, hVar);
        }

        @Override // u6.p
        protected Object e1(String str, p6.h hVar) {
            return new StringBuilder(str);
        }

        @Override // p6.l
        public Object k(p6.h hVar) {
            return new StringBuilder();
        }

        @Override // u6.p, u6.g0, p6.l
        public h7.c r() {
            return h7.c.Textual;
        }
    }

    protected p(Class cls) {
        super(cls);
    }

    public static p k1(Class cls) {
        int i10;
        if (cls == File.class) {
            i10 = 1;
        } else if (cls == URL.class) {
            i10 = 2;
        } else if (cls == URI.class) {
            i10 = 3;
        } else if (cls == Class.class) {
            i10 = 4;
        } else if (cls == JavaType.class) {
            i10 = 5;
        } else if (cls == Currency.class) {
            i10 = 6;
        } else if (cls == Pattern.class) {
            i10 = 7;
        } else if (cls == Locale.class) {
            i10 = 8;
        } else if (cls == Charset.class) {
            i10 = 9;
        } else if (cls == TimeZone.class) {
            i10 = 10;
        } else if (cls == InetAddress.class) {
            i10 = 11;
        } else {
            if (cls != InetSocketAddress.class) {
                if (cls == StringBuilder.class) {
                    return new c();
                }
                if (cls == StringBuffer.class) {
                    return new b();
                }
                return null;
            }
            i10 = 12;
        }
        return new a(cls, i10);
    }

    public static Class[] l1() {
        return new Class[]{File.class, URL.class, URI.class, Class.class, JavaType.class, Currency.class, Pattern.class, Locale.class, Charset.class, TimeZone.class, InetAddress.class, InetSocketAddress.class, StringBuilder.class, StringBuffer.class};
    }

    @Override // p6.l
    public Object e(e6.j jVar, p6.h hVar) throws p6.m {
        String strK0 = jVar.K0();
        if (strK0 == null) {
            e6.m mVarN = jVar.n();
            if (mVarN != e6.m.START_OBJECT) {
                return i1(jVar, hVar, mVarN);
            }
            strK0 = hVar.K(jVar, this, this.f28200a);
        }
        if (strK0.isEmpty()) {
            return g1(hVar);
        }
        if (j1()) {
            String strTrim = strK0.trim();
            if (strTrim != strK0 && strTrim.isEmpty()) {
                return g1(hVar);
            }
            strK0 = strTrim;
        }
        try {
            return e1(strK0, hVar);
        } catch (IllegalArgumentException | MalformedURLException e10) {
            String message = e10.getMessage();
            String str = "not a valid textual representation";
            if (message != null) {
                str = "not a valid textual representation, problem: " + message;
            }
            throw hVar.e1(strK0, this.f28200a, str).q(e10);
        }
    }

    protected abstract Object e1(String str, p6.h hVar);

    protected Object f1(Object obj, p6.h hVar) throws v6.f {
        hVar.S0(this, "Don't know how to convert embedded Object of type %s into %s", obj.getClass().getName(), this.f28200a.getName());
        return null;
    }

    protected Object g1(p6.h hVar) throws v6.f {
        r6.b bVarN = hVar.N(r(), this.f28200a, r6.e.EmptyString);
        if (bVarN == r6.b.Fail) {
            hVar.S0(this, "Cannot coerce empty String (\"\") to %s (but could if enabling coercion using `CoercionConfig`)", S());
        }
        return bVarN == r6.b.AsNull ? a(hVar) : bVarN == r6.b.AsEmpty ? k(hVar) : h1(hVar);
    }

    protected Object h1(p6.h hVar) {
        return a(hVar);
    }

    protected Object i1(e6.j jVar, p6.h hVar, e6.m mVar) {
        if (mVar == e6.m.START_ARRAY) {
            return W(jVar, hVar);
        }
        if (mVar != e6.m.VALUE_EMBEDDED_OBJECT) {
            return hVar.s0(this.f28200a, jVar);
        }
        Object objH0 = jVar.h0();
        if (objH0 == null) {
            return null;
        }
        return this.f28200a.isAssignableFrom(objH0.getClass()) ? objH0 : f1(objH0, hVar);
    }

    protected boolean j1() {
        return true;
    }

    @Override // u6.g0, p6.l
    public h7.c r() {
        return h7.c.OtherScalar;
    }
}
