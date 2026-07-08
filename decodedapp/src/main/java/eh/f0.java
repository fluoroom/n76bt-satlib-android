package eh;

import eh.y;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final z f12397a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f12398b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final y f12399c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final g0 f12400d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final z f12401e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final fh.f f12402f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private d f12403g;

    public f0(a aVar) {
        rd.m.e(aVar, "builder");
        z zVarJ = aVar.j();
        if (zVarJ == null) {
            throw new IllegalStateException("url == null");
        }
        this.f12397a = zVarJ;
        this.f12398b = aVar.h();
        this.f12399c = aVar.g().f();
        this.f12400d = aVar.e();
        this.f12401e = aVar.f();
        this.f12402f = aVar.i();
    }

    public final g0 a() {
        return this.f12400d;
    }

    public final d b() {
        d dVar = this.f12403g;
        if (dVar != null) {
            return dVar;
        }
        d dVarA = d.f12310n.a(this.f12399c);
        this.f12403g = dVarA;
        return dVarA;
    }

    public final z c() {
        return this.f12401e;
    }

    public final fh.f d() {
        return this.f12402f;
    }

    public final String e(String str) {
        rd.m.e(str, "name");
        return this.f12399c.b(str);
    }

    public final y f() {
        return this.f12399c;
    }

    public final List g(String str) {
        rd.m.e(str, "name");
        return this.f12399c.h(str);
    }

    public final boolean h() {
        return this.f12397a.i();
    }

    public final String i() {
        return this.f12398b;
    }

    public final a j() {
        return new a(this);
    }

    public final Object k(Class cls) {
        rd.m.e(cls, "type");
        return l(pd.a.e(cls));
    }

    public final Object l(yd.c cVar) {
        rd.m.e(cVar, "type");
        return pd.a.b(cVar).cast(this.f12402f.a(cVar));
    }

    public final z m() {
        return this.f12397a;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(32);
        sb2.append("Request{method=");
        sb2.append(this.f12398b);
        sb2.append(", url=");
        sb2.append(this.f12397a);
        if (this.f12399c.size() != 0) {
            sb2.append(", headers=[");
            int i10 = 0;
            for (Object obj : this.f12399c) {
                int i11 = i10 + 1;
                if (i10 < 0) {
                    ed.q.u();
                }
                dd.q qVar = (dd.q) obj;
                String str = (String) qVar.a();
                String str2 = (String) qVar.b();
                if (i10 > 0) {
                    sb2.append(", ");
                }
                sb2.append(str);
                sb2.append(':');
                if (fh.m.y(str)) {
                    str2 = "██";
                }
                sb2.append(str2);
                i10 = i11;
            }
            sb2.append(']');
        }
        if (!rd.m.a(this.f12402f, fh.a.f13096a)) {
            sb2.append(", tags=");
            sb2.append(this.f12402f);
        }
        sb2.append('}');
        return sb2.toString();
    }

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private z f12404a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f12405b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private y.a f12406c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private g0 f12407d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private z f12408e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private fh.f f12409f;

        public a() {
            this.f12409f = fh.a.f13096a;
            this.f12405b = "GET";
            this.f12406c = new y.a();
        }

        private final String c(String str) {
            if (rg.q.H(str, "ws:", true)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("http:");
                String strSubstring = str.substring(3);
                rd.m.d(strSubstring, "substring(...)");
                sb2.append(strSubstring);
                return sb2.toString();
            }
            if (!rg.q.H(str, "wss:", true)) {
                return str;
            }
            StringBuilder sb3 = new StringBuilder();
            sb3.append("https:");
            String strSubstring2 = str.substring(4);
            rd.m.d(strSubstring2, "substring(...)");
            sb3.append(strSubstring2);
            return sb3.toString();
        }

        public f0 a() {
            return new f0(this);
        }

        public final a b(z zVar) {
            this.f12408e = zVar;
            return this;
        }

        public a d() {
            return m("GET", null);
        }

        public final g0 e() {
            return this.f12407d;
        }

        public final z f() {
            return this.f12408e;
        }

        public final y.a g() {
            return this.f12406c;
        }

        public final String h() {
            return this.f12405b;
        }

        public final fh.f i() {
            return this.f12409f;
        }

        public final z j() {
            return this.f12404a;
        }

        public a k(String str, String str2) {
            rd.m.e(str, "name");
            rd.m.e(str2, "value");
            this.f12406c.j(str, str2);
            return this;
        }

        public a l(y yVar) {
            rd.m.e(yVar, "headers");
            this.f12406c = yVar.e();
            return this;
        }

        public a m(String str, g0 g0Var) {
            rd.m.e(str, "method");
            if (str.length() <= 0) {
                throw new IllegalArgumentException("method.isEmpty() == true");
            }
            if (g0Var == null) {
                if (kh.f.f(str)) {
                    throw new IllegalArgumentException(("method " + str + " must have a request body.").toString());
                }
            } else if (!kh.f.c(str)) {
                throw new IllegalArgumentException(("method " + str + " must not have a request body.").toString());
            }
            this.f12405b = str;
            this.f12407d = g0Var;
            return this;
        }

        public a n(g0 g0Var) {
            rd.m.e(g0Var, "body");
            return m("POST", g0Var);
        }

        public a o(String str) {
            rd.m.e(str, "name");
            this.f12406c.i(str);
            return this;
        }

        public a p(Class cls, Object obj) {
            rd.m.e(cls, "type");
            return q(pd.a.e(cls), obj);
        }

        public final a q(yd.c cVar, Object obj) {
            rd.m.e(cVar, "type");
            this.f12409f = this.f12409f.b(cVar, obj);
            return this;
        }

        public a r(z zVar) {
            rd.m.e(zVar, "url");
            this.f12404a = zVar;
            return this;
        }

        public a s(String str) {
            rd.m.e(str, "url");
            return r(z.f12621j.c(c(str)));
        }

        public a(f0 f0Var) {
            rd.m.e(f0Var, "request");
            this.f12409f = fh.a.f13096a;
            this.f12404a = f0Var.m();
            this.f12405b = f0Var.i();
            this.f12407d = f0Var.a();
            this.f12409f = f0Var.d();
            this.f12406c = f0Var.f().e();
            this.f12408e = f0Var.c();
        }
    }

    public /* synthetic */ f0(z zVar, y yVar, String str, g0 g0Var, int i10, rd.h hVar) {
        this(zVar, (i10 & 2) != 0 ? y.f12617b.a(new String[0]) : yVar, (i10 & 4) != 0 ? "\u0000" : str, (i10 & 8) != 0 ? null : g0Var);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public f0(z zVar, y yVar, String str, g0 g0Var) {
        rd.m.e(zVar, "url");
        rd.m.e(yVar, "headers");
        rd.m.e(str, "method");
        a aVarL = new a().r(zVar).l(yVar);
        if (rd.m.a(str, "\u0000")) {
            if (g0Var != null) {
                str = "POST";
            } else {
                str = "GET";
            }
        }
        this(aVarL.m(str, g0Var));
    }
}
