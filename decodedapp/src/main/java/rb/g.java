package rb;

import androidx.appcompat.widget.ActivityChooserView;
import io.grpc.internal.f3;
import io.grpc.internal.g;
import io.grpc.internal.i1;
import io.grpc.internal.n1;
import io.grpc.internal.u;
import io.grpc.internal.u2;
import io.grpc.internal.v2;
import io.grpc.internal.w0;
import io.grpc.internal.x;
import io.grpc.internal.x1;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.security.GeneralSecurityException;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumSet;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import qb.c2;
import qb.z;
import sb.b;

/* JADX INFO: loaded from: classes3.dex */
public final class g extends z {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final Logger f25698r = Logger.getLogger(g.class.getName());

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    static final sb.b f25699s = new b.C0376b(sb.b.f27210f).g(sb.a.TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256, sb.a.TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256, sb.a.TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384, sb.a.TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384, sb.a.TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256, sb.a.TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256).j(sb.k.TLS_1_2).h(true).e();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final long f25700t = TimeUnit.DAYS.toNanos(1000);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final u2.d f25701u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    static final x1 f25702v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final EnumSet f25703w;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final n1 f25704a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private SocketFactory f25708e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private SSLSocketFactory f25709f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private HostnameVerifier f25711h;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f25717n;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private f3.b f25705b = f3.a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private x1 f25706c = f25702v;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private x1 f25707d = v2.c(w0.f17204v);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private sb.b f25712i = f25699s;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private c f25713j = c.TLS;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f25714k = Long.MAX_VALUE;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f25715l = w0.f17196n;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f25716m = 65535;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f25718o = 4194304;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f25719p = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final boolean f25720q = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f25710g = false;

    class a implements u2.d {
        a() {
        }

        @Override // io.grpc.internal.u2.d
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void b(Executor executor) {
            ((ExecutorService) executor).shutdown();
        }

        @Override // io.grpc.internal.u2.d
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public Executor create() {
            return Executors.newCachedThreadPool(w0.i("grpc-okhttp-%d", true));
        }
    }

    static /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f25721a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f25722b;

        static {
            int[] iArr = new int[c.values().length];
            f25722b = iArr;
            try {
                iArr[c.PLAINTEXT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f25722b[c.TLS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[rb.e.values().length];
            f25721a = iArr2;
            try {
                iArr2[rb.e.TLS.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f25721a[rb.e.PLAINTEXT.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    private enum c {
        TLS,
        PLAINTEXT
    }

    private final class d implements n1.b {
        private d() {
        }

        @Override // io.grpc.internal.n1.b
        public int a() {
            return g.this.k();
        }

        /* synthetic */ d(g gVar, a aVar) {
            this();
        }
    }

    private final class e implements n1.c {
        private e() {
        }

        @Override // io.grpc.internal.n1.c
        public u a() {
            return g.this.h();
        }

        /* synthetic */ e(g gVar, a aVar) {
            this();
        }
    }

    static final class f implements u {
        final boolean A;
        private boolean B;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final x1 f25728a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Executor f25729b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final x1 f25730c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final ScheduledExecutorService f25731d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final f3.b f25732e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final SocketFactory f25733f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final SSLSocketFactory f25734g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final HostnameVerifier f25735h;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final sb.b f25736r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final int f25737s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final boolean f25738t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        private final long f25739u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        private final io.grpc.internal.g f25740v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        private final long f25741w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        final int f25742x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        private final boolean f25743y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        final int f25744z;

        class a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ g.b f25745a;

            a(g.b bVar) {
                this.f25745a = bVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f25745a.a();
            }
        }

        /* synthetic */ f(x1 x1Var, x1 x1Var2, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, sb.b bVar, int i10, boolean z10, long j10, long j11, int i11, boolean z11, int i12, f3.b bVar2, boolean z12, qb.e eVar, a aVar) {
            this(x1Var, x1Var2, socketFactory, sSLSocketFactory, hostnameVerifier, bVar, i10, z10, j10, j11, i11, z11, i12, bVar2, z12, eVar);
        }

        @Override // io.grpc.internal.u, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.B) {
                return;
            }
            this.B = true;
            this.f25728a.b(this.f25729b);
            this.f25730c.b(this.f25731d);
        }

        @Override // io.grpc.internal.u
        public ScheduledExecutorService e0() {
            return this.f25731d;
        }

        @Override // io.grpc.internal.u
        public x g0(SocketAddress socketAddress, u.a aVar, qb.f fVar) {
            if (this.B) {
                throw new IllegalStateException("The transport factory is closed.");
            }
            g.b bVarD = this.f25740v.d();
            j jVar = new j(this, (InetSocketAddress) socketAddress, aVar.a(), aVar.d(), aVar.b(), aVar.c(), new a(bVarD), null);
            if (this.f25738t) {
                jVar.X(true, bVarD.b(), this.f25741w, this.f25743y);
            }
            return jVar;
        }

        @Override // io.grpc.internal.u
        public Collection r0() {
            return g.l();
        }

        private f(x1 x1Var, x1 x1Var2, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, sb.b bVar, int i10, boolean z10, long j10, long j11, int i11, boolean z11, int i12, f3.b bVar2, boolean z12, qb.e eVar) {
            this.f25728a = x1Var;
            this.f25729b = (Executor) x1Var.a();
            this.f25730c = x1Var2;
            this.f25731d = (ScheduledExecutorService) x1Var2.a();
            this.f25733f = socketFactory;
            this.f25734g = sSLSocketFactory;
            this.f25735h = hostnameVerifier;
            this.f25736r = bVar;
            this.f25737s = i10;
            this.f25738t = z10;
            this.f25739u = j10;
            this.f25740v = new io.grpc.internal.g("keepalive time nanos", j10);
            this.f25741w = j11;
            this.f25742x = i11;
            this.f25743y = z11;
            this.f25744z = i12;
            this.A = z12;
            this.f25732e = (f3.b) r9.l.o(bVar2, "transportTracerFactory");
        }
    }

    static {
        a aVar = new a();
        f25701u = aVar;
        f25702v = v2.c(aVar);
        f25703w = EnumSet.of(c2.MTLS, c2.CUSTOM_MANAGERS);
    }

    private g(String str) {
        a aVar = null;
        this.f25704a = new n1(str, new e(this, aVar), new d(this, aVar));
    }

    public static g j(String str) {
        return new g(str);
    }

    static Collection l() {
        return Collections.singleton(InetSocketAddress.class);
    }

    @Override // qb.z
    protected qb.w0 f() {
        return this.f25704a;
    }

    f h() {
        return new f(this.f25706c, this.f25707d, this.f25708e, i(), this.f25711h, this.f25712i, this.f25718o, this.f25714k != Long.MAX_VALUE, this.f25714k, this.f25715l, this.f25716m, this.f25717n, this.f25719p, this.f25705b, false, null, null);
    }

    SSLSocketFactory i() {
        int i10 = b.f25722b[this.f25713j.ordinal()];
        if (i10 == 1) {
            return null;
        }
        if (i10 != 2) {
            throw new RuntimeException("Unknown negotiation type: " + this.f25713j);
        }
        try {
            if (this.f25709f == null) {
                this.f25709f = SSLContext.getInstance("Default", sb.h.e().g()).getSocketFactory();
            }
            return this.f25709f;
        } catch (GeneralSecurityException e10) {
            throw new RuntimeException("TLS Provider failure", e10);
        }
    }

    int k() {
        int i10 = b.f25722b[this.f25713j.ordinal()];
        if (i10 == 1) {
            return 80;
        }
        if (i10 == 2) {
            return 443;
        }
        throw new AssertionError(this.f25713j + " not handled");
    }

    @Override // qb.w0
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public g c(long j10, TimeUnit timeUnit) {
        r9.l.e(j10 > 0, "keepalive time must be positive");
        long nanos = timeUnit.toNanos(j10);
        this.f25714k = nanos;
        long jL = i1.l(nanos);
        this.f25714k = jL;
        if (jL >= f25700t) {
            this.f25714k = Long.MAX_VALUE;
        }
        return this;
    }

    public g n(SSLSocketFactory sSLSocketFactory) {
        r9.l.u(!this.f25710g, "Cannot change security when using ChannelCredentials");
        this.f25709f = sSLSocketFactory;
        this.f25713j = c.TLS;
        return this;
    }

    @Override // qb.w0
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public g e() {
        r9.l.u(!this.f25710g, "Cannot change security when using ChannelCredentials");
        this.f25713j = c.PLAINTEXT;
        return this;
    }
}
