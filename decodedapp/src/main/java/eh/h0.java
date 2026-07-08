package eh;

import eh.y;
import java.io.Closeable;
import java.util.List;
import vh.m0;

/* JADX INFO: loaded from: classes3.dex */
public final class h0 implements Closeable {
    private final boolean A;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f0 f12426a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e0 f12427b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f12428c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f12429d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final x f12430e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final y f12431f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final i0 f12432g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final m0 f12433h;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final h0 f12434r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final h0 f12435s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final h0 f12436t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final long f12437u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final long f12438v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final jh.h f12439w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private l0 f12440x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private d f12441y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final boolean f12442z;

    public h0(f0 f0Var, e0 e0Var, String str, int i10, x xVar, y yVar, i0 i0Var, m0 m0Var, h0 h0Var, h0 h0Var2, h0 h0Var3, long j10, long j11, jh.h hVar, l0 l0Var) {
        rd.m.e(f0Var, "request");
        rd.m.e(e0Var, "protocol");
        rd.m.e(str, "message");
        rd.m.e(yVar, "headers");
        rd.m.e(i0Var, "body");
        rd.m.e(l0Var, "trailersSource");
        this.f12426a = f0Var;
        this.f12427b = e0Var;
        this.f12428c = str;
        this.f12429d = i10;
        this.f12430e = xVar;
        this.f12431f = yVar;
        this.f12432g = i0Var;
        this.f12433h = m0Var;
        this.f12434r = h0Var;
        this.f12435s = h0Var2;
        this.f12436t = h0Var3;
        this.f12437u = j10;
        this.f12438v = j11;
        this.f12439w = hVar;
        this.f12440x = l0Var;
        boolean z10 = true;
        this.f12442z = 200 <= i10 && i10 < 300;
        if (i10 != 307 && i10 != 308) {
            switch (i10) {
                case 300:
                case 301:
                case 302:
                case 303:
                    break;
                default:
                    z10 = false;
                    break;
            }
        }
        this.A = z10;
    }

    public static /* synthetic */ String w(h0 h0Var, String str, String str2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = null;
        }
        return h0Var.v(str, str2);
    }

    public final boolean G() {
        return this.f12442z;
    }

    public final String H() {
        return this.f12428c;
    }

    public final h0 S() {
        return this.f12434r;
    }

    public final a T() {
        return new a(this);
    }

    public final h0 W() {
        return this.f12436t;
    }

    public final e0 X() {
        return this.f12427b;
    }

    public final i0 c() {
        return this.f12432g;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f12432g.close();
    }

    public final d e() {
        d dVar = this.f12441y;
        if (dVar != null) {
            return dVar;
        }
        d dVarA = d.f12310n.a(this.f12431f);
        this.f12441y = dVarA;
        return dVarA;
    }

    public final long h0() {
        return this.f12438v;
    }

    public final h0 k() {
        return this.f12435s;
    }

    public final List l() {
        String str;
        y yVar = this.f12431f;
        int i10 = this.f12429d;
        if (i10 == 401) {
            str = "WWW-Authenticate";
        } else {
            if (i10 != 407) {
                return ed.q.k();
            }
            str = "Proxy-Authenticate";
        }
        return kh.e.a(yVar, str);
    }

    public final int n() {
        return this.f12429d;
    }

    public final f0 p0() {
        return this.f12426a;
    }

    public final jh.h q() {
        return this.f12439w;
    }

    public final x r() {
        return this.f12430e;
    }

    public final String s(String str) {
        rd.m.e(str, "name");
        return w(this, str, null, 2, null);
    }

    public final long t0() {
        return this.f12437u;
    }

    public String toString() {
        return "Response{protocol=" + this.f12427b + ", code=" + this.f12429d + ", message=" + this.f12428c + ", url=" + this.f12426a.m() + '}';
    }

    public final m0 u0() {
        return this.f12433h;
    }

    public final String v(String str, String str2) {
        rd.m.e(str, "name");
        String strB = this.f12431f.b(str);
        return strB == null ? str2 : strB;
    }

    public final y x() {
        return this.f12431f;
    }

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private f0 f12443a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private e0 f12444b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f12445c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f12446d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private x f12447e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private y.a f12448f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private i0 f12449g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private m0 f12450h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private h0 f12451i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private h0 f12452j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private h0 f12453k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private long f12454l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private long f12455m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private jh.h f12456n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private l0 f12457o;

        public a() {
            this.f12445c = -1;
            this.f12449g = i0.EMPTY;
            this.f12457o = l0.f12552b;
            this.f12448f = new y.a();
        }

        private final void e(String str, h0 h0Var) {
            if (h0Var != null) {
                if (h0Var.S() != null) {
                    throw new IllegalArgumentException((str + ".networkResponse != null").toString());
                }
                if (h0Var.k() != null) {
                    throw new IllegalArgumentException((str + ".cacheResponse != null").toString());
                }
                if (h0Var.W() == null) {
                    return;
                }
                throw new IllegalArgumentException((str + ".priorResponse != null").toString());
            }
        }

        public a a(String str, String str2) {
            rd.m.e(str, "name");
            rd.m.e(str2, "value");
            this.f12448f.a(str, str2);
            return this;
        }

        public a b(i0 i0Var) {
            rd.m.e(i0Var, "body");
            this.f12449g = i0Var;
            return this;
        }

        public h0 c() {
            int i10 = this.f12445c;
            if (i10 < 0) {
                throw new IllegalStateException(("code < 0: " + this.f12445c).toString());
            }
            f0 f0Var = this.f12443a;
            if (f0Var == null) {
                throw new IllegalStateException("request == null");
            }
            e0 e0Var = this.f12444b;
            if (e0Var == null) {
                throw new IllegalStateException("protocol == null");
            }
            String str = this.f12446d;
            if (str != null) {
                return new h0(f0Var, e0Var, str, i10, this.f12447e, this.f12448f.f(), this.f12449g, this.f12450h, this.f12451i, this.f12452j, this.f12453k, this.f12454l, this.f12455m, this.f12456n, this.f12457o);
            }
            throw new IllegalStateException("message == null");
        }

        public a d(h0 h0Var) {
            e("cacheResponse", h0Var);
            this.f12452j = h0Var;
            return this;
        }

        public a f(int i10) {
            this.f12445c = i10;
            return this;
        }

        public final int g() {
            return this.f12445c;
        }

        public a h(x xVar) {
            this.f12447e = xVar;
            return this;
        }

        public a i(String str, String str2) {
            rd.m.e(str, "name");
            rd.m.e(str2, "value");
            this.f12448f.j(str, str2);
            return this;
        }

        public a j(y yVar) {
            rd.m.e(yVar, "headers");
            this.f12448f = yVar.e();
            return this;
        }

        public final void k(jh.h hVar) {
            rd.m.e(hVar, "exchange");
            this.f12456n = hVar;
        }

        public a l(String str) {
            rd.m.e(str, "message");
            this.f12446d = str;
            return this;
        }

        public a m(h0 h0Var) {
            e("networkResponse", h0Var);
            this.f12451i = h0Var;
            return this;
        }

        public a n(h0 h0Var) {
            this.f12453k = h0Var;
            return this;
        }

        public a o(e0 e0Var) {
            rd.m.e(e0Var, "protocol");
            this.f12444b = e0Var;
            return this;
        }

        public a p(long j10) {
            this.f12455m = j10;
            return this;
        }

        public a q(f0 f0Var) {
            rd.m.e(f0Var, "request");
            this.f12443a = f0Var;
            return this;
        }

        public a r(long j10) {
            this.f12454l = j10;
            return this;
        }

        public a s(m0 m0Var) {
            rd.m.e(m0Var, "socket");
            this.f12450h = m0Var;
            return this;
        }

        public a t(l0 l0Var) {
            rd.m.e(l0Var, "trailersSource");
            this.f12457o = l0Var;
            return this;
        }

        public a(h0 h0Var) {
            rd.m.e(h0Var, "response");
            this.f12445c = -1;
            this.f12449g = i0.EMPTY;
            this.f12457o = l0.f12552b;
            this.f12443a = h0Var.p0();
            this.f12444b = h0Var.X();
            this.f12445c = h0Var.n();
            this.f12446d = h0Var.H();
            this.f12447e = h0Var.r();
            this.f12448f = h0Var.x().e();
            this.f12449g = h0Var.c();
            this.f12450h = h0Var.u0();
            this.f12451i = h0Var.S();
            this.f12452j = h0Var.k();
            this.f12453k = h0Var.W();
            this.f12454l = h0Var.t0();
            this.f12455m = h0Var.h0();
            this.f12456n = h0Var.q();
            this.f12457o = h0Var.f12440x;
        }
    }
}
