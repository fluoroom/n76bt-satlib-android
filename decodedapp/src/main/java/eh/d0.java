package eh;

import com.tencent.mm.opensdk.constants.ConstantsAPI;
import eh.e;
import eh.s;
import java.net.Proxy;
import java.net.ProxySelector;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import okhttp3.internal.platform.c;

/* JADX INFO: loaded from: classes3.dex */
public class d0 implements e.a {
    public static final b H = new b(null);
    private static final List I = fh.p.l(e0.f12390f, e0.f12388d);
    private static final List J = fh.p.l(m.f12558i, m.f12560k);
    private final int A;
    private final int B;
    private final int C;
    private final long D;
    private final jh.s E;
    private final ih.d F;
    private final l G;

    /* JADX INFO: renamed from: a */
    private final q f12334a;

    /* JADX INFO: renamed from: b */
    private final List f12335b;

    /* JADX INFO: renamed from: c */
    private final List f12336c;

    /* JADX INFO: renamed from: d */
    private final s.c f12337d;

    /* JADX INFO: renamed from: e */
    private final boolean f12338e;

    /* JADX INFO: renamed from: f */
    private final boolean f12339f;

    /* JADX INFO: renamed from: g */
    private final eh.b f12340g;

    /* JADX INFO: renamed from: h */
    private final boolean f12341h;

    /* JADX INFO: renamed from: i */
    private final boolean f12342i;

    /* JADX INFO: renamed from: j */
    private final o f12343j;

    /* JADX INFO: renamed from: k */
    private final c f12344k;

    /* JADX INFO: renamed from: l */
    private final r f12345l;

    /* JADX INFO: renamed from: m */
    private final Proxy f12346m;

    /* JADX INFO: renamed from: n */
    private final ProxySelector f12347n;

    /* JADX INFO: renamed from: o */
    private final eh.b f12348o;

    /* JADX INFO: renamed from: p */
    private final SocketFactory f12349p;

    /* JADX INFO: renamed from: q */
    private final SSLSocketFactory f12350q;

    /* JADX INFO: renamed from: r */
    private final X509TrustManager f12351r;

    /* JADX INFO: renamed from: s */
    private final List f12352s;

    /* JADX INFO: renamed from: t */
    private final List f12353t;

    /* JADX INFO: renamed from: u */
    private final HostnameVerifier f12354u;

    /* JADX INFO: renamed from: v */
    private final h f12355v;

    /* JADX INFO: renamed from: w */
    private final th.c f12356w;

    /* JADX INFO: renamed from: x */
    private final int f12357x;

    /* JADX INFO: renamed from: y */
    private final int f12358y;

    /* JADX INFO: renamed from: z */
    private final int f12359z;

    public static final class b {
        public /* synthetic */ b(rd.h hVar) {
            this();
        }

        public final List a() {
            return d0.J;
        }

        public final List b() {
            return d0.I;
        }

        private b() {
        }
    }

    public d0(a aVar) throws NoSuchAlgorithmException, KeyStoreException {
        ProxySelector proxySelectorC;
        rd.m.e(aVar, "builder");
        this.f12334a = aVar.o();
        this.f12335b = fh.p.v(aVar.v());
        this.f12336c = fh.p.v(aVar.x());
        this.f12337d = aVar.q();
        this.f12338e = aVar.E();
        this.f12339f = aVar.r();
        this.f12340g = aVar.f();
        this.f12341h = aVar.s();
        this.f12342i = aVar.t();
        this.f12343j = aVar.n();
        this.f12344k = aVar.g();
        this.f12345l = aVar.p();
        this.f12346m = aVar.A();
        if (aVar.A() != null) {
            proxySelectorC = rh.a.f26077a;
        } else {
            proxySelectorC = aVar.C();
            if (proxySelectorC == null && (proxySelectorC = ProxySelector.getDefault()) == null) {
                proxySelectorC = rh.a.f26077a;
            }
        }
        this.f12347n = proxySelectorC;
        this.f12348o = aVar.B();
        this.f12349p = aVar.G();
        List listM = aVar.m();
        this.f12352s = listM;
        this.f12353t = aVar.z();
        this.f12354u = aVar.u();
        this.f12357x = aVar.h();
        this.f12358y = aVar.k();
        this.f12359z = aVar.D();
        this.A = aVar.K();
        this.B = aVar.y();
        this.C = aVar.J();
        this.D = aVar.w();
        jh.s sVarF = aVar.F();
        this.E = sVarF == null ? new jh.s() : sVarF;
        ih.d dVarI = aVar.I();
        this.F = dVarI == null ? ih.d.f16139m : dVarI;
        l lVarL = aVar.l();
        if (lVarL == null) {
            lVarL = new l();
            aVar.N(lVarL);
        }
        this.G = lVarL;
        if (d.h0.a(listM) && listM.isEmpty()) {
            this.f12350q = null;
            this.f12356w = null;
            this.f12351r = null;
            this.f12355v = h.f12422d;
        } else {
            Iterator it = listM.iterator();
            while (it.hasNext()) {
                if (((m) it.next()).f()) {
                    if (aVar.H() != null) {
                        this.f12350q = aVar.H();
                        th.c cVarI = aVar.i();
                        rd.m.b(cVarI);
                        this.f12356w = cVarI;
                        X509TrustManager x509TrustManagerL = aVar.L();
                        rd.m.b(x509TrustManagerL);
                        this.f12351r = x509TrustManagerL;
                        this.f12355v = aVar.j().g(cVarI);
                    } else {
                        c.a aVar2 = okhttp3.internal.platform.c.f23684a;
                        X509TrustManager x509TrustManagerQ = aVar2.e().q();
                        this.f12351r = x509TrustManagerQ;
                        this.f12350q = aVar2.e().p(x509TrustManagerQ);
                        th.c cVarA = th.c.f27886a.a(x509TrustManagerQ);
                        this.f12356w = cVarA;
                        this.f12355v = aVar.j().g(cVarA);
                    }
                }
            }
            this.f12350q = null;
            this.f12356w = null;
            this.f12351r = null;
            this.f12355v = h.f12422d;
        }
        K();
    }

    private final void K() {
        List list = this.f12335b;
        rd.m.c(list, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
        if (list.contains(null)) {
            throw new IllegalStateException(("Null interceptor: " + this.f12335b).toString());
        }
        List list2 = this.f12336c;
        rd.m.c(list2, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
        if (list2.contains(null)) {
            throw new IllegalStateException(("Null network interceptor: " + this.f12336c).toString());
        }
        List list3 = this.f12352s;
        if (!d.h0.a(list3) || !list3.isEmpty()) {
            Iterator it = list3.iterator();
            while (it.hasNext()) {
                if (((m) it.next()).f()) {
                    if (this.f12350q == null) {
                        throw new IllegalStateException("sslSocketFactory == null");
                    }
                    if (this.f12356w == null) {
                        throw new IllegalStateException("certificateChainCleaner == null");
                    }
                    if (this.f12351r == null) {
                        throw new IllegalStateException("x509TrustManager == null");
                    }
                    return;
                }
            }
        }
        if (this.f12350q != null) {
            throw new IllegalStateException("Check failed.");
        }
        if (this.f12356w != null) {
            throw new IllegalStateException("Check failed.");
        }
        if (this.f12351r != null) {
            throw new IllegalStateException("Check failed.");
        }
        if (!rd.m.a(this.f12355v, h.f12422d)) {
            throw new IllegalStateException("Check failed.");
        }
        dd.d0 d0Var = dd.d0.f10897a;
    }

    public a A() {
        return new a(this);
    }

    public final int B() {
        return this.B;
    }

    public final List C() {
        return this.f12353t;
    }

    public final Proxy D() {
        return this.f12346m;
    }

    public final eh.b E() {
        return this.f12348o;
    }

    public final ProxySelector F() {
        return this.f12347n;
    }

    public final int G() {
        return this.f12359z;
    }

    public final boolean H() {
        return this.f12338e;
    }

    public final SocketFactory I() {
        return this.f12349p;
    }

    public final SSLSocketFactory J() {
        SSLSocketFactory sSLSocketFactory = this.f12350q;
        if (sSLSocketFactory != null) {
            return sSLSocketFactory;
        }
        throw new IllegalStateException("CLEARTEXT-only client");
    }

    public final int L() {
        return this.C;
    }

    public final int M() {
        return this.A;
    }

    public final X509TrustManager N() {
        return this.f12351r;
    }

    @Override // eh.e.a
    public e a(f0 f0Var) {
        rd.m.e(f0Var, "request");
        return new jh.m(this, f0Var, false);
    }

    public final eh.a e(z zVar) {
        SSLSocketFactory sSLSocketFactoryJ;
        HostnameVerifier hostnameVerifier;
        h hVar;
        rd.m.e(zVar, "url");
        if (zVar.i()) {
            sSLSocketFactoryJ = J();
            hostnameVerifier = this.f12354u;
            hVar = this.f12355v;
        } else {
            sSLSocketFactoryJ = null;
            hostnameVerifier = null;
            hVar = null;
        }
        return new eh.a(zVar.h(), zVar.m(), this.f12345l, this.f12349p, sSLSocketFactoryJ, hostnameVerifier, hVar, this.f12348o, this.f12346m, this.f12353t, this.f12352s, this.f12347n);
    }

    public final eh.b f() {
        return this.f12340g;
    }

    public final c g() {
        return this.f12344k;
    }

    public final int h() {
        return this.f12357x;
    }

    public final th.c i() {
        return this.f12356w;
    }

    public final h j() {
        return this.f12355v;
    }

    public final int k() {
        return this.f12358y;
    }

    public final l l() {
        return this.G;
    }

    public final List m() {
        return this.f12352s;
    }

    public final o n() {
        return this.f12343j;
    }

    public final q o() {
        return this.f12334a;
    }

    public final r p() {
        return this.f12345l;
    }

    public final s.c q() {
        return this.f12337d;
    }

    public final boolean r() {
        return this.f12339f;
    }

    public final boolean s() {
        return this.f12341h;
    }

    public final boolean t() {
        return this.f12342i;
    }

    public final jh.s u() {
        return this.E;
    }

    public final ih.d v() {
        return this.F;
    }

    public final HostnameVerifier w() {
        return this.f12354u;
    }

    public final List x() {
        return this.f12335b;
    }

    public final long y() {
        return this.D;
    }

    public final List z() {
        return this.f12336c;
    }

    public static final class a {
        private int A;
        private int B;
        private int C;
        private int D;
        private long E;
        private jh.s F;
        private ih.d G;

        /* JADX INFO: renamed from: a */
        private q f12360a;

        /* JADX INFO: renamed from: b */
        private l f12361b;

        /* JADX INFO: renamed from: c */
        private final List f12362c;

        /* JADX INFO: renamed from: d */
        private final List f12363d;

        /* JADX INFO: renamed from: e */
        private s.c f12364e;

        /* JADX INFO: renamed from: f */
        private boolean f12365f;

        /* JADX INFO: renamed from: g */
        private boolean f12366g;

        /* JADX INFO: renamed from: h */
        private eh.b f12367h;

        /* JADX INFO: renamed from: i */
        private boolean f12368i;

        /* JADX INFO: renamed from: j */
        private boolean f12369j;

        /* JADX INFO: renamed from: k */
        private o f12370k;

        /* JADX INFO: renamed from: l */
        private c f12371l;

        /* JADX INFO: renamed from: m */
        private r f12372m;

        /* JADX INFO: renamed from: n */
        private Proxy f12373n;

        /* JADX INFO: renamed from: o */
        private ProxySelector f12374o;

        /* JADX INFO: renamed from: p */
        private eh.b f12375p;

        /* JADX INFO: renamed from: q */
        private SocketFactory f12376q;

        /* JADX INFO: renamed from: r */
        private SSLSocketFactory f12377r;

        /* JADX INFO: renamed from: s */
        private X509TrustManager f12378s;

        /* JADX INFO: renamed from: t */
        private List f12379t;

        /* JADX INFO: renamed from: u */
        private List f12380u;

        /* JADX INFO: renamed from: v */
        private HostnameVerifier f12381v;

        /* JADX INFO: renamed from: w */
        private h f12382w;

        /* JADX INFO: renamed from: x */
        private th.c f12383x;

        /* JADX INFO: renamed from: y */
        private int f12384y;

        /* JADX INFO: renamed from: z */
        private int f12385z;

        public a() {
            this.f12360a = new q();
            this.f12362c = new ArrayList();
            this.f12363d = new ArrayList();
            this.f12364e = fh.p.c(s.f12601b);
            this.f12365f = true;
            this.f12366g = true;
            eh.b bVar = eh.b.f12248b;
            this.f12367h = bVar;
            this.f12368i = true;
            this.f12369j = true;
            this.f12370k = o.f12585b;
            this.f12372m = r.f12598b;
            this.f12375p = bVar;
            SocketFactory socketFactory = SocketFactory.getDefault();
            rd.m.d(socketFactory, "getDefault(...)");
            this.f12376q = socketFactory;
            b bVar2 = d0.H;
            this.f12379t = bVar2.a();
            this.f12380u = bVar2.b();
            this.f12381v = th.d.f27887a;
            this.f12382w = h.f12422d;
            this.f12385z = 10000;
            this.A = 10000;
            this.B = 10000;
            this.D = 60000;
            this.E = ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLS;
        }

        public final Proxy A() {
            return this.f12373n;
        }

        public final eh.b B() {
            return this.f12375p;
        }

        public final ProxySelector C() {
            return this.f12374o;
        }

        public final int D() {
            return this.A;
        }

        public final boolean E() {
            return this.f12365f;
        }

        public final jh.s F() {
            return this.F;
        }

        public final SocketFactory G() {
            return this.f12376q;
        }

        public final SSLSocketFactory H() {
            return this.f12377r;
        }

        public final ih.d I() {
            return this.G;
        }

        public final int J() {
            return this.D;
        }

        public final int K() {
            return this.B;
        }

        public final X509TrustManager L() {
            return this.f12378s;
        }

        public final a M(long j10, TimeUnit timeUnit) {
            rd.m.e(timeUnit, "unit");
            this.A = fh.p.g("timeout", j10, timeUnit);
            return this;
        }

        public final void N(l lVar) {
            this.f12361b = lVar;
        }

        public final a O(long j10, TimeUnit timeUnit) {
            rd.m.e(timeUnit, "unit");
            this.B = fh.p.g("timeout", j10, timeUnit);
            return this;
        }

        public final a a(a0 a0Var) {
            rd.m.e(a0Var, "interceptor");
            this.f12362c.add(a0Var);
            return this;
        }

        public final d0 b() {
            return new d0(this);
        }

        public final a c(c cVar) {
            this.f12371l = cVar;
            return this;
        }

        public final a d(long j10, TimeUnit timeUnit) {
            rd.m.e(timeUnit, "unit");
            this.f12385z = fh.p.g("timeout", j10, timeUnit);
            return this;
        }

        public final a e(List list) {
            rd.m.e(list, "connectionSpecs");
            if (!rd.m.a(list, this.f12379t)) {
                this.F = null;
            }
            this.f12379t = fh.p.v(list);
            return this;
        }

        public final eh.b f() {
            return this.f12367h;
        }

        public final c g() {
            return this.f12371l;
        }

        public final int h() {
            return this.f12384y;
        }

        public final th.c i() {
            return this.f12383x;
        }

        public final h j() {
            return this.f12382w;
        }

        public final int k() {
            return this.f12385z;
        }

        public final l l() {
            return this.f12361b;
        }

        public final List m() {
            return this.f12379t;
        }

        public final o n() {
            return this.f12370k;
        }

        public final q o() {
            return this.f12360a;
        }

        public final r p() {
            return this.f12372m;
        }

        public final s.c q() {
            return this.f12364e;
        }

        public final boolean r() {
            return this.f12366g;
        }

        public final boolean s() {
            return this.f12368i;
        }

        public final boolean t() {
            return this.f12369j;
        }

        public final HostnameVerifier u() {
            return this.f12381v;
        }

        public final List v() {
            return this.f12362c;
        }

        public final long w() {
            return this.E;
        }

        public final List x() {
            return this.f12363d;
        }

        public final int y() {
            return this.C;
        }

        public final List z() {
            return this.f12380u;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public a(d0 d0Var) {
            this();
            rd.m.e(d0Var, "okHttpClient");
            this.f12360a = d0Var.o();
            this.f12361b = d0Var.l();
            ed.q.A(this.f12362c, d0Var.x());
            ed.q.A(this.f12363d, d0Var.z());
            this.f12364e = d0Var.q();
            this.f12365f = d0Var.H();
            this.f12366g = d0Var.r();
            this.f12367h = d0Var.f();
            this.f12368i = d0Var.s();
            this.f12369j = d0Var.t();
            this.f12370k = d0Var.n();
            this.f12371l = d0Var.g();
            this.f12372m = d0Var.p();
            this.f12373n = d0Var.D();
            this.f12374o = d0Var.F();
            this.f12375p = d0Var.E();
            this.f12376q = d0Var.I();
            this.f12377r = d0Var.f12350q;
            this.f12378s = d0Var.N();
            this.f12379t = d0Var.m();
            this.f12380u = d0Var.C();
            this.f12381v = d0Var.w();
            this.f12382w = d0Var.j();
            this.f12383x = d0Var.i();
            this.f12384y = d0Var.h();
            this.f12385z = d0Var.k();
            this.A = d0Var.G();
            this.B = d0Var.M();
            this.C = d0Var.B();
            this.D = d0Var.L();
            this.E = d0Var.y();
            this.F = d0Var.u();
            this.G = d0Var.v();
        }
    }

    public d0() {
        this(new a());
    }
}
