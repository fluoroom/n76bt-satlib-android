package rb;

import androidx.appcompat.widget.ActivityChooserView;
import com.tencent.mm.opensdk.constants.ConstantsAPI;
import io.grpc.internal.a1;
import io.grpc.internal.b1;
import io.grpc.internal.f3;
import io.grpc.internal.i1;
import io.grpc.internal.q1;
import io.grpc.internal.s;
import io.grpc.internal.s2;
import io.grpc.internal.t;
import io.grpc.internal.v0;
import io.grpc.internal.w0;
import io.grpc.internal.w1;
import io.grpc.internal.x;
import io.grpc.internal.x2;
import j$.util.DesugarCollections;
import java.io.EOFException;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.URI;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.Deque;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import qb.a1;
import qb.b0;
import qb.c0;
import qb.d0;
import qb.j0;
import qb.n1;
import qb.u1;
import qb.v1;
import qb.z0;
import rb.b;
import rb.g;
import rb.i;
import rb.k;
import rb.s;
import tb.b;
import ub.a;
import ub.b;
import vh.n0;
import vh.o0;
import vh.z;

/* JADX INFO: loaded from: classes3.dex */
class j implements x, b.a, s.d {
    private static final Map Z = U();

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private static final Logger f25758a0 = Logger.getLogger(j.class.getName());

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    static boolean f25759b0 = w0.g("GRPC_ENABLE_PER_RPC_AUTHORITY_CHECK", false);

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private static final Class f25760c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private static final Method f25761d0;
    private boolean A;
    private boolean B;
    private final SocketFactory C;
    private SSLSocketFactory D;
    private HostnameVerifier E;
    private Socket F;
    private int G;
    private final Deque H;
    private final sb.b I;
    private i1 J;
    private boolean K;
    private long L;
    private long M;
    private boolean N;
    private final Runnable O;
    private final int P;
    private final boolean Q;
    private final f3 R;
    private final TrustManager S;
    private final Map T;
    private final b1 U;
    private d0.b V;
    final c0 W;
    int X;
    Runnable Y;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Socket f25762a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private SSLSession f25763b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InetSocketAddress f25764c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f25765d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f25766e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Random f25767f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final r9.q f25768g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f25769h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final tb.j f25770i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private q1.a f25771j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private rb.b f25772k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private s f25773l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Object f25774m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final j0 f25775n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f25776o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final Map f25777p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final Executor f25778q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final s2 f25779r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final ScheduledExecutorService f25780s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final int f25781t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f25782u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private f f25783v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private qb.a f25784w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private u1 f25785x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private boolean f25786y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private a1 f25787z;

    class a extends b1 {
        a() {
        }

        @Override // io.grpc.internal.b1
        protected void b() {
            j.this.f25771j.d(true);
        }

        @Override // io.grpc.internal.b1
        protected void c() {
            j.this.f25771j.d(false);
        }
    }

    class b implements f3.c {
        b() {
        }
    }

    class d implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ CyclicBarrier f25796a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ CountDownLatch f25797b;

        d(CyclicBarrier cyclicBarrier, CountDownLatch countDownLatch) {
            this.f25796a = cyclicBarrier;
            this.f25797b = countDownLatch;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f25796a.await(1000L, TimeUnit.MILLISECONDS);
                this.f25797b.await();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            } catch (BrokenBarrierException | TimeoutException unused2) {
            }
        }
    }

    class e implements Runnable {
        e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Runnable runnable = j.this.Y;
            if (runnable != null) {
                runnable.run();
            }
            j.this.f25778q.execute(j.this.f25783v);
            synchronized (j.this.f25774m) {
                j.this.G = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
                j.this.o0();
            }
            j.this.getClass();
        }
    }

    static class g extends w1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f25804a;

        g(String str) {
            this.f25804a = str;
        }

        @Override // javax.net.ssl.SSLSession
        public String getPeerHost() {
            return this.f25804a;
        }
    }

    private static class h extends LinkedHashMap {
        private h() {
        }

        @Override // java.util.LinkedHashMap
        protected boolean removeEldestEntry(Map.Entry entry) {
            return size() > 100;
        }

        /* synthetic */ h(a aVar) {
            this();
        }
    }

    static final class i extends rb.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final SSLSession f25805a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final SSLSocket f25806b;

        i(SSLSocket sSLSocket, String str) {
            this.f25806b = sSLSocket;
            this.f25805a = new g(str);
        }

        @Override // javax.net.ssl.SSLSocket
        public SSLSession getHandshakeSession() {
            return this.f25805a;
        }

        @Override // javax.net.ssl.SSLSocket
        public SSLParameters getSSLParameters() {
            return this.f25806b.getSSLParameters();
        }

        @Override // java.net.Socket
        public boolean isConnected() {
            return this.f25806b.isConnected();
        }
    }

    static {
        Class<?> cls;
        Method method = null;
        try {
            cls = Class.forName("javax.net.ssl.X509ExtendedTrustManager");
            try {
                method = cls.getMethod("checkServerTrusted", X509Certificate[].class, String.class, Socket.class);
            } catch (ClassNotFoundException | NoSuchMethodException unused) {
            }
        } catch (ClassNotFoundException | NoSuchMethodException unused2) {
            cls = null;
        }
        f25760c0 = cls;
        f25761d0 = method;
    }

    public j(g.f fVar, InetSocketAddress inetSocketAddress, String str, String str2, qb.a aVar, c0 c0Var, Runnable runnable, qb.e eVar) {
        this(fVar, inetSocketAddress, str, str2, aVar, w0.f17205w, new tb.g(), c0Var, runnable, eVar);
    }

    static /* synthetic */ int G(j jVar, int i10) {
        int i11 = jVar.f25782u + i10;
        jVar.f25782u = i11;
        return i11;
    }

    private static Map U() {
        EnumMap enumMap = new EnumMap(tb.a.class);
        tb.a aVar = tb.a.NO_ERROR;
        u1 u1Var = u1.f24783s;
        enumMap.put(aVar, u1Var.s("No error: A GRPC status of OK should have been sent"));
        enumMap.put(tb.a.PROTOCOL_ERROR, u1Var.s("Protocol error"));
        enumMap.put(tb.a.INTERNAL_ERROR, u1Var.s("Internal error"));
        enumMap.put(tb.a.FLOW_CONTROL_ERROR, u1Var.s("Flow control error"));
        enumMap.put(tb.a.STREAM_CLOSED, u1Var.s("Stream closed"));
        enumMap.put(tb.a.FRAME_TOO_LARGE, u1Var.s("Frame too large"));
        enumMap.put(tb.a.REFUSED_STREAM, u1.f24784t.s("Refused stream"));
        enumMap.put(tb.a.CANCEL, u1.f24770f.s("Cancelled"));
        enumMap.put(tb.a.COMPRESSION_ERROR, u1Var.s("Compression error"));
        enumMap.put(tb.a.CONNECT_ERROR, u1Var.s("Connect error"));
        enumMap.put(tb.a.ENHANCE_YOUR_CALM, u1.f24778n.s("Enhance your calm"));
        enumMap.put(tb.a.INADEQUATE_SECURITY, u1.f24776l.s("Inadequate security"));
        return DesugarCollections.unmodifiableMap(enumMap);
    }

    private ub.b V(InetSocketAddress inetSocketAddress, String str, String str2) {
        ub.a aVarA = new a.b().k("https").h(inetSocketAddress.getHostName()).j(inetSocketAddress.getPort()).a();
        b.C0397b c0397bD = new b.C0397b().e(aVarA).d("Host", aVarA.c() + ":" + aVarA.f()).d("User-Agent", this.f25766e);
        if (str != null && str2 != null) {
            c0397bD.d("Proxy-Authorization", sb.c.a(str, str2));
        }
        return c0397bD.c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Socket W(InetSocketAddress inetSocketAddress, InetSocketAddress inetSocketAddress2, String str, String str2) throws v1 {
        Socket socketCreateSocket = null;
        try {
            socketCreateSocket = inetSocketAddress2.getAddress() != null ? this.C.createSocket(inetSocketAddress2.getAddress(), inetSocketAddress2.getPort()) : this.C.createSocket(inetSocketAddress2.getHostName(), inetSocketAddress2.getPort());
            socketCreateSocket.setTcpNoDelay(true);
            socketCreateSocket.setSoTimeout(this.X);
            n0 n0VarK = z.k(socketCreateSocket);
            vh.f fVarB = z.b(z.f(socketCreateSocket));
            ub.b bVarV = V(inetSocketAddress, str, str2);
            ub.a aVarB = bVarV.b();
            fVarB.J(String.format(Locale.US, "CONNECT %s:%d HTTP/1.1", aVarB.c(), Integer.valueOf(aVarB.f()))).J("\r\n");
            int iB = bVarV.a().b();
            for (int i10 = 0; i10 < iB; i10++) {
                fVarB.J(bVarV.a().a(i10)).J(": ").J(bVarV.a().c(i10)).J("\r\n");
            }
            fVarB.J("\r\n");
            fVarB.flush();
            sb.j jVarA = sb.j.a(j0(n0VarK));
            while (!j0(n0VarK).equals("")) {
            }
            int i11 = jVarA.f27267b;
            if (i11 >= 200 && i11 < 300) {
                socketCreateSocket.setSoTimeout(0);
                return socketCreateSocket;
            }
            vh.e eVar = new vh.e();
            try {
                socketCreateSocket.shutdownOutput();
                n0VarK.N(eVar, ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLS);
            } catch (IOException e10) {
                eVar.J("Unable to read body: " + e10.toString());
            }
            try {
                socketCreateSocket.close();
            } catch (IOException unused) {
            }
            throw u1.f24784t.s(String.format(Locale.US, "Response returned from proxy was not successful (expected 2xx, got %d %s). Response body:\n%s", Integer.valueOf(jVarA.f27267b), jVarA.f27268c, eVar.w0())).c();
        } catch (IOException e11) {
            if (socketCreateSocket != null) {
                w0.e(socketCreateSocket);
            }
            throw u1.f24784t.s("Failed trying to connect with proxy").r(e11).c();
        }
    }

    private u1 b0() {
        synchronized (this.f25774m) {
            try {
                u1 u1Var = this.f25785x;
                if (u1Var != null) {
                    return u1Var;
                }
                return u1.f24784t.s("Connection closed");
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private void d0() {
        synchronized (this.f25774m) {
            this.R.g(new b());
        }
    }

    private void g0(rb.i iVar) {
        if (this.B && this.H.isEmpty() && this.f25777p.isEmpty()) {
            this.B = false;
            i1 i1Var = this.J;
            if (i1Var != null) {
                i1Var.o();
            }
        }
        if (iVar.y()) {
            this.U.e(iVar, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i0(tb.a aVar, String str) {
        n0(0, aVar, s0(aVar).g(str));
    }

    private static String j0(n0 n0Var) throws EOFException {
        vh.e eVar = new vh.e();
        while (n0Var.N(eVar, 1L) != -1) {
            if (eVar.G(eVar.size() - 1) == 10) {
                return eVar.U();
            }
        }
        throw new EOFException("\\n not found: " + eVar.Q().n());
    }

    private void l0() {
        synchronized (this.f25774m) {
            try {
                this.f25772k.A();
                tb.i iVar = new tb.i();
                o.c(iVar, 7, this.f25769h);
                this.f25772k.j0(iVar);
                if (this.f25769h > 65535) {
                    this.f25772k.b(0, r1 - 65535);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private void m0(rb.i iVar) {
        if (!this.B) {
            this.B = true;
            i1 i1Var = this.J;
            if (i1Var != null) {
                i1Var.n();
            }
        }
        if (iVar.y()) {
            this.U.e(iVar, true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n0(int i10, tb.a aVar, u1 u1Var) {
        synchronized (this.f25774m) {
            try {
                if (this.f25785x == null) {
                    this.f25785x = u1Var;
                    this.f25771j.c(u1Var);
                }
                if (aVar != null && !this.f25786y) {
                    this.f25786y = true;
                    this.f25772k.a0(0, aVar, new byte[0]);
                }
                Iterator it = this.f25777p.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    if (((Integer) entry.getKey()).intValue() > i10) {
                        it.remove();
                        ((rb.i) entry.getValue()).u().N(u1Var, s.a.REFUSED, false, new z0());
                        g0((rb.i) entry.getValue());
                    }
                }
                for (rb.i iVar : this.H) {
                    iVar.u().N(u1Var, s.a.MISCARRIED, true, new z0());
                    g0(iVar);
                }
                this.H.clear();
                q0();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean o0() {
        boolean z10 = false;
        while (!this.H.isEmpty() && this.f25777p.size() < this.G) {
            p0((rb.i) this.H.poll());
            z10 = true;
        }
        return z10;
    }

    private void p0(rb.i iVar) {
        r9.l.u(iVar.u().d0() == -1, "StreamId already assigned");
        this.f25777p.put(Integer.valueOf(this.f25776o), iVar);
        m0(iVar);
        iVar.u().g0(this.f25776o);
        if ((iVar.M() != a1.d.UNARY && iVar.M() != a1.d.SERVER_STREAMING) || iVar.O()) {
            this.f25772k.flush();
        }
        int i10 = this.f25776o;
        if (i10 < 2147483645) {
            this.f25776o = i10 + 2;
        } else {
            this.f25776o = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
            n0(ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED, tb.a.NO_ERROR, u1.f24784t.s("Stream ids exhausted"));
        }
    }

    private void q0() {
        if (this.f25785x == null || !this.f25777p.isEmpty() || !this.H.isEmpty() || this.A) {
            return;
        }
        this.A = true;
        i1 i1Var = this.J;
        if (i1Var != null) {
            i1Var.q();
        }
        io.grpc.internal.a1 a1Var = this.f25787z;
        if (a1Var != null) {
            a1Var.f(b0());
            this.f25787z = null;
        }
        if (!this.f25786y) {
            this.f25786y = true;
            this.f25772k.a0(0, tb.a.NO_ERROR, new byte[0]);
        }
        this.f25772k.close();
    }

    static u1 s0(tb.a aVar) {
        u1 u1Var = (u1) Z.get(aVar);
        if (u1Var != null) {
            return u1Var;
        }
        return u1.f24771g.s("Unknown http2 error code: " + aVar.f27698a);
    }

    private u1 t0(String str) {
        u1 u1VarS;
        u1 u1VarS2 = this.E.verify(str, ((SSLSocket) this.F).getSession()) ? u1.f24769e : u1.f24784t.s(String.format("HostNameVerifier verification failed for authority '%s'", str));
        if (!u1VarS2.q() && !f25759b0) {
            f25758a0.log(Level.WARNING, String.format("HostNameVerifier verification failed for authority '%s'. This will be an error in the future.", str));
        }
        if (u1VarS2.q()) {
            TrustManager trustManager = this.S;
            if (trustManager == null) {
                return u1.f24784t.s(String.format("Could not verify authority '%s' for the rpc with no X509TrustManager available", str));
            }
            if (f25760c0.isInstance(trustManager)) {
                try {
                    Certificate[] peerCertificates = this.f25763b.getPeerCertificates();
                    X509Certificate[] x509CertificateArr = new X509Certificate[peerCertificates.length];
                    for (int i10 = 0; i10 < peerCertificates.length; i10++) {
                        x509CertificateArr[i10] = (X509Certificate) peerCertificates[i10];
                    }
                    f25761d0.invoke(this.S, x509CertificateArr, "RSA", new i((SSLSocket) this.F, str));
                    u1VarS = u1.f24769e;
                } catch (IllegalAccessException e10) {
                    e = e10;
                    u1VarS = u1.f24784t.r(e).s("Peer verification failed");
                } catch (InvocationTargetException e11) {
                    e = e11;
                    u1VarS = u1.f24784t.r(e).s("Peer verification failed");
                } catch (SSLPeerUnverifiedException e12) {
                    e = e12;
                    u1VarS = u1.f24784t.r(e).s("Peer verification failed");
                }
                if (u1VarS.n() != null) {
                    f25758a0.log(Level.WARNING, u1VarS.p() + ". This will be an error in the future.", u1VarS.n());
                } else {
                    f25758a0.log(Level.WARNING, u1VarS.p() + ". This will be an error in the future.");
                }
                return u1VarS;
            }
        }
        return u1VarS2;
    }

    void X(boolean z10, long j10, long j11, boolean z11) {
        this.K = z10;
        this.L = j10;
        this.M = j11;
        this.N = z11;
    }

    void Y(int i10, u1 u1Var, s.a aVar, boolean z10, tb.a aVar2, z0 z0Var) {
        synchronized (this.f25774m) {
            try {
                rb.i iVar = (rb.i) this.f25777p.remove(Integer.valueOf(i10));
                if (iVar != null) {
                    if (aVar2 != null) {
                        this.f25772k.f(i10, tb.a.CANCEL);
                    }
                    if (u1Var != null) {
                        i.b bVarN = iVar.u();
                        if (z0Var == null) {
                            z0Var = new z0();
                        }
                        bVarN.N(u1Var, aVar, z10, z0Var);
                    }
                    if (!o0()) {
                        q0();
                    }
                    g0(iVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    String Z() {
        URI uriB = w0.b(this.f25765d);
        return uriB.getHost() != null ? uriB.getHost() : this.f25765d;
    }

    @Override // rb.s.d
    public s.c[] a() {
        s.c[] cVarArr;
        synchronized (this.f25774m) {
            try {
                cVarArr = new s.c[this.f25777p.size()];
                Iterator it = this.f25777p.values().iterator();
                int i10 = 0;
                while (it.hasNext()) {
                    cVarArr[i10] = ((rb.i) it.next()).u().c0();
                    i10++;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return cVarArr;
    }

    int a0() {
        URI uriB = w0.b(this.f25765d);
        return uriB.getPort() != -1 ? uriB.getPort() : this.f25764c.getPort();
    }

    @Override // io.grpc.internal.q1
    public void b(u1 u1Var) {
        synchronized (this.f25774m) {
            try {
                if (this.f25785x != null) {
                    return;
                }
                this.f25785x = u1Var;
                this.f25771j.c(u1Var);
                q0();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // io.grpc.internal.q1
    public Runnable c(q1.a aVar) throws Throwable {
        this.f25771j = (q1.a) r9.l.o(aVar, "listener");
        if (this.K) {
            i1 i1Var = new i1(new i1.c(this), this.f25780s, this.L, this.M, this.N);
            this.J = i1Var;
            i1Var.p();
        }
        rb.a aVarG = rb.a.G(this.f25779r, this, 10000);
        tb.c cVarX = aVarG.x(this.f25770i.a(z.b(aVarG), true));
        synchronized (this.f25774m) {
            try {
                rb.b bVar = new rb.b(this, cVarX);
                this.f25772k = bVar;
                this.f25773l = new s(this, bVar);
            } catch (Throwable th2) {
                th = th2;
                while (true) {
                    try {
                        throw th;
                    } catch (Throwable th3) {
                        th = th3;
                    }
                }
            }
        }
        CountDownLatch countDownLatch = new CountDownLatch(1);
        CountDownLatch countDownLatch2 = new CountDownLatch(1);
        CyclicBarrier cyclicBarrier = new CyclicBarrier(2);
        this.f25779r.execute(new c(countDownLatch, cyclicBarrier, aVarG, countDownLatch2));
        this.f25778q.execute(new d(cyclicBarrier, countDownLatch2));
        try {
            l0();
            countDownLatch.countDown();
            this.f25779r.execute(new e());
            return null;
        } catch (Throwable th4) {
            countDownLatch.countDown();
            throw th4;
        }
    }

    rb.i c0(int i10) {
        rb.i iVar;
        synchronized (this.f25774m) {
            iVar = (rb.i) this.f25777p.get(Integer.valueOf(i10));
        }
        return iVar;
    }

    @Override // rb.b.a
    public void d(Throwable th2) {
        r9.l.o(th2, "failureCause");
        n0(0, tb.a.INTERNAL_ERROR, u1.f24784t.r(th2));
    }

    @Override // qb.o0
    public j0 e() {
        return this.f25775n;
    }

    boolean e0() {
        return this.D == null;
    }

    @Override // io.grpc.internal.q1
    public void f(u1 u1Var) {
        b(u1Var);
        synchronized (this.f25774m) {
            try {
                Iterator it = this.f25777p.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    it.remove();
                    ((rb.i) entry.getValue()).u().O(u1Var, false, new z0());
                    g0((rb.i) entry.getValue());
                }
                for (rb.i iVar : this.H) {
                    iVar.u().N(u1Var, s.a.MISCARRIED, true, new z0());
                    g0(iVar);
                }
                this.H.clear();
                q0();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x000c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    boolean f0(int r3) {
        /*
            r2 = this;
            java.lang.Object r0 = r2.f25774m
            monitor-enter(r0)
            int r1 = r2.f25776o     // Catch: java.lang.Throwable -> Lf
            if (r3 >= r1) goto Lc
            r1 = 1
            r3 = r3 & r1
            if (r3 != r1) goto Lc
            goto Ld
        Lc:
            r1 = 0
        Ld:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            return r1
        Lf:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: rb.j.f0(int):boolean");
    }

    @Override // io.grpc.internal.x
    public qb.a getAttributes() {
        return this.f25784w;
    }

    @Override // io.grpc.internal.t
    public void h(t.a aVar, Executor executor) {
        long jNextLong;
        synchronized (this.f25774m) {
            try {
                boolean z10 = true;
                r9.l.t(this.f25772k != null);
                if (this.A) {
                    io.grpc.internal.a1.g(aVar, executor, b0());
                    return;
                }
                io.grpc.internal.a1 a1Var = this.f25787z;
                if (a1Var != null) {
                    jNextLong = 0;
                    z10 = false;
                } else {
                    jNextLong = this.f25767f.nextLong();
                    r9.o oVar = (r9.o) this.f25768g.get();
                    oVar.g();
                    io.grpc.internal.a1 a1Var2 = new io.grpc.internal.a1(jNextLong, oVar);
                    this.f25787z = a1Var2;
                    this.R.b();
                    a1Var = a1Var2;
                }
                if (z10) {
                    this.f25772k.d(false, (int) (jNextLong >>> 32), (int) jNextLong);
                }
                a1Var.a(aVar, executor);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // io.grpc.internal.t
    /* JADX INFO: renamed from: h0, reason: merged with bridge method [inline-methods] */
    public rb.i g(qb.a1 a1Var, z0 z0Var, qb.c cVar, qb.k[] kVarArr) {
        rb.i iVar;
        r9.l.o(a1Var, "method");
        r9.l.o(z0Var, "headers");
        x2 x2VarH = x2.h(kVarArr, getAttributes(), z0Var);
        synchronized (this.f25774m) {
            iVar = new rb.i(a1Var, z0Var, this.f25772k, this, this.f25773l, this.f25774m, this.f25781t, this.f25769h, this.f25765d, this.f25766e, x2VarH, this.R, cVar, this.Q);
        }
        return iVar;
    }

    void k0(rb.i iVar) {
        this.H.remove(iVar);
        g0(iVar);
    }

    void r0(rb.i iVar, String str) {
        u1 u1Var;
        if (this.f25785x != null) {
            iVar.u().N(this.f25785x, s.a.MISCARRIED, true, new z0());
            return;
        }
        if ((this.F instanceof SSLSocket) && !str.equals(this.f25765d)) {
            if (this.T.containsKey(str)) {
                u1Var = (u1) this.T.get(str);
            } else {
                u1 u1VarT0 = t0(str);
                this.T.put(str, u1VarT0);
                u1Var = u1VarT0;
            }
            if (!u1Var.q() && f25759b0) {
                iVar.u().N(u1Var, s.a.PROCESSED, true, new z0());
                return;
            }
        }
        if (this.f25777p.size() < this.G) {
            p0(iVar);
        } else {
            this.H.add(iVar);
            m0(iVar);
        }
    }

    public String toString() {
        return r9.g.b(this).c("logId", this.f25775n.d()).d("address", this.f25764c).toString();
    }

    private j(g.f fVar, InetSocketAddress inetSocketAddress, String str, String str2, qb.a aVar, r9.q qVar, tb.j jVar, c0 c0Var, Runnable runnable, qb.e eVar) {
        this.f25767f = new Random();
        this.f25774m = new Object();
        this.f25777p = new HashMap();
        this.G = 0;
        this.H = new LinkedList();
        this.T = new h(null);
        this.U = new a();
        this.X = 30000;
        this.f25764c = (InetSocketAddress) r9.l.o(inetSocketAddress, "address");
        this.f25765d = str;
        this.f25781t = fVar.f25737s;
        this.f25769h = fVar.f25742x;
        this.f25778q = (Executor) r9.l.o(fVar.f25729b, "executor");
        this.f25779r = new s2(fVar.f25729b);
        this.f25780s = (ScheduledExecutorService) r9.l.o(fVar.f25731d, "scheduledExecutorService");
        this.f25776o = 3;
        SocketFactory socketFactory = fVar.f25733f;
        this.C = socketFactory == null ? SocketFactory.getDefault() : socketFactory;
        this.D = fVar.f25734g;
        HostnameVerifier hostnameVerifier = fVar.f25735h;
        this.E = hostnameVerifier == null ? sb.f.f27230a : hostnameVerifier;
        this.I = (sb.b) r9.l.o(fVar.f25736r, "connectionSpec");
        this.f25768g = (r9.q) r9.l.o(qVar, "stopwatchFactory");
        this.f25770i = (tb.j) r9.l.o(jVar, "variant");
        this.f25766e = w0.h("okhttp", str2);
        this.W = c0Var;
        this.O = (Runnable) r9.l.o(runnable, "tooManyPingsRunnable");
        this.P = fVar.f25744z;
        this.R = fVar.f25732e.a();
        this.f25775n = j0.a(getClass(), inetSocketAddress.toString());
        this.f25784w = qb.a.c().d(v0.f17179b, aVar).a();
        this.Q = fVar.A;
        d0();
        this.S = null;
    }

    class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ CountDownLatch f25790a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ CyclicBarrier f25791b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ rb.a f25792c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ CountDownLatch f25793d;

        c(CountDownLatch countDownLatch, CyclicBarrier cyclicBarrier, rb.a aVar, CountDownLatch countDownLatch2) {
            this.f25790a = countDownLatch;
            this.f25791b = cyclicBarrier;
            this.f25792c = aVar;
            this.f25793d = countDownLatch2;
        }

        @Override // java.lang.Runnable
        public void run() {
            j jVar;
            f fVar;
            vh.g gVarC = z.c(new a());
            try {
                try {
                    try {
                        this.f25790a.await();
                        this.f25791b.await(1000L, TimeUnit.MILLISECONDS);
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    } catch (BrokenBarrierException | TimeoutException unused2) {
                        j.this.n0(0, tb.a.INTERNAL_ERROR, u1.f24784t.s("Timed out waiting for second handshake thread. The transport executor pool may have run out of threads"));
                        jVar = j.this;
                        fVar = jVar.new f(jVar.f25770i.b(gVarC, true));
                        jVar.f25783v = fVar;
                        this.f25793d.countDown();
                        return;
                    }
                    j jVar2 = j.this;
                    c0 c0Var = jVar2.W;
                    if (c0Var == null) {
                        jVar2.f25762a = jVar2.C.createSocket(j.this.f25764c.getAddress(), j.this.f25764c.getPort());
                    } else {
                        if (!(c0Var.b() instanceof InetSocketAddress)) {
                            throw u1.f24783s.s("Unsupported SocketAddress implementation " + j.this.W.b().getClass()).c();
                        }
                        j jVar3 = j.this;
                        jVar3.f25762a = jVar3.W(jVar3.W.c(), (InetSocketAddress) j.this.W.b(), j.this.W.d(), j.this.W.a());
                    }
                    if (j.this.D != null) {
                        SSLSocket sSLSocketB = p.b(j.this.D, j.this.E, j.this.f25762a, j.this.Z(), j.this.a0(), j.this.I);
                        j.this.f25763b = sSLSocketB.getSession();
                        j.this.f25762a = sSLSocketB;
                    }
                    j.this.f25762a.setTcpNoDelay(true);
                    vh.g gVarC2 = z.c(z.k(j.this.f25762a));
                    this.f25792c.w(z.f(j.this.f25762a), j.this.f25762a);
                    j jVar4 = j.this;
                    jVar4.f25784w = jVar4.f25784w.d().d(b0.f24537a, j.this.f25762a.getRemoteSocketAddress()).d(b0.f24538b, j.this.f25762a.getLocalSocketAddress()).d(b0.f24539c, j.this.f25763b).d(v0.f17178a, j.this.f25763b == null ? n1.NONE : n1.PRIVACY_AND_INTEGRITY).a();
                    j jVar5 = j.this;
                    jVar5.f25783v = jVar5.new f(jVar5.f25770i.b(gVarC2, true));
                    this.f25793d.countDown();
                    synchronized (j.this.f25774m) {
                        try {
                            j jVar6 = j.this;
                            jVar6.F = (Socket) r9.l.o(jVar6.f25762a, "socket");
                            if (j.this.f25763b != null) {
                                j jVar7 = j.this;
                                jVar7.V = new d0.b(new d0.c(jVar7.f25763b));
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                } catch (Throwable th3) {
                    j jVar8 = j.this;
                    jVar8.f25783v = jVar8.new f(jVar8.f25770i.b(gVarC, true));
                    this.f25793d.countDown();
                    throw th3;
                }
            } catch (v1 e10) {
                j.this.n0(0, tb.a.INTERNAL_ERROR, e10.a());
                jVar = j.this;
                fVar = jVar.new f(jVar.f25770i.b(gVarC, true));
            } catch (Exception e11) {
                j.this.d(e11);
                jVar = j.this;
                fVar = jVar.new f(jVar.f25770i.b(gVarC, true));
            }
        }

        class a implements n0 {
            a() {
            }

            @Override // vh.n0
            public long N(vh.e eVar, long j10) {
                return -1L;
            }

            @Override // vh.n0
            public o0 i() {
                return o0.f30840e;
            }

            @Override // vh.n0, java.io.Closeable, java.lang.AutoCloseable
            public void close() {
            }
        }
    }

    class f implements b.a, Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        tb.b f25801b;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final k f25800a = new k(Level.FINE, j.class);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        boolean f25802c = true;

        f(tb.b bVar) {
            this.f25801b = bVar;
        }

        private int a(List list) {
            long jQ = 0;
            for (int i10 = 0; i10 < list.size(); i10++) {
                tb.d dVar = (tb.d) list.get(i10);
                jQ += (long) (dVar.f27708a.Q() + 32 + dVar.f27709b.Q());
            }
            return (int) Math.min(jQ, 2147483647L);
        }

        /* JADX WARN: Removed duplicated region for block: B:27:0x0079  */
        /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
        @Override // tb.b.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void b(int r8, long r9) {
            /*
                r7 = this;
                rb.k r0 = r7.f25800a
                rb.k$a r1 = rb.k.a.INBOUND
                r0.k(r1, r8, r9)
                r0 = 0
                int r2 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
                if (r2 != 0) goto L2c
                java.lang.String r9 = "Received 0 flow control window increment."
                if (r8 != 0) goto L19
                rb.j r8 = rb.j.this
                tb.a r10 = tb.a.PROTOCOL_ERROR
                rb.j.D(r8, r10, r9)
                return
            L19:
                rb.j r0 = rb.j.this
                qb.u1 r10 = qb.u1.f24783s
                qb.u1 r2 = r10.s(r9)
                io.grpc.internal.s$a r3 = io.grpc.internal.s.a.PROCESSED
                tb.a r5 = tb.a.PROTOCOL_ERROR
                r6 = 0
                r4 = 0
                r1 = r8
                r0.Y(r1, r2, r3, r4, r5, r6)
                return
            L2c:
                r1 = r8
                rb.j r8 = rb.j.this
                java.lang.Object r8 = rb.j.w(r8)
                monitor-enter(r8)
                if (r1 != 0) goto L46
                rb.j r0 = rb.j.this     // Catch: java.lang.Throwable -> L43
                rb.s r0 = rb.j.J(r0)     // Catch: java.lang.Throwable -> L43
                r1 = 0
                int r10 = (int) r9     // Catch: java.lang.Throwable -> L43
                r0.g(r1, r10)     // Catch: java.lang.Throwable -> L43
                monitor-exit(r8)     // Catch: java.lang.Throwable -> L43
                return
            L43:
                r0 = move-exception
                r9 = r0
                goto L92
            L46:
                rb.j r0 = rb.j.this     // Catch: java.lang.Throwable -> L43
                java.util.Map r0 = rb.j.I(r0)     // Catch: java.lang.Throwable -> L43
                java.lang.Integer r2 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Throwable -> L43
                java.lang.Object r0 = r0.get(r2)     // Catch: java.lang.Throwable -> L43
                rb.i r0 = (rb.i) r0     // Catch: java.lang.Throwable -> L43
                if (r0 == 0) goto L6b
                rb.j r2 = rb.j.this     // Catch: java.lang.Throwable -> L43
                rb.s r2 = rb.j.J(r2)     // Catch: java.lang.Throwable -> L43
                rb.i$b r0 = r0.u()     // Catch: java.lang.Throwable -> L43
                rb.s$c r0 = r0.c0()     // Catch: java.lang.Throwable -> L43
                int r10 = (int) r9     // Catch: java.lang.Throwable -> L43
                r2.g(r0, r10)     // Catch: java.lang.Throwable -> L43
                goto L75
            L6b:
                rb.j r9 = rb.j.this     // Catch: java.lang.Throwable -> L43
                boolean r9 = r9.f0(r1)     // Catch: java.lang.Throwable -> L43
                if (r9 != 0) goto L75
                r9 = 1
                goto L76
            L75:
                r9 = 0
            L76:
                monitor-exit(r8)     // Catch: java.lang.Throwable -> L43
                if (r9 == 0) goto L91
                rb.j r8 = rb.j.this
                tb.a r9 = tb.a.PROTOCOL_ERROR
                java.lang.StringBuilder r10 = new java.lang.StringBuilder
                r10.<init>()
                java.lang.String r0 = "Received window_update for unknown stream: "
                r10.append(r0)
                r10.append(r1)
                java.lang.String r10 = r10.toString()
                rb.j.D(r8, r9, r10)
            L91:
                return
            L92:
                monitor-exit(r8)     // Catch: java.lang.Throwable -> L43
                throw r9
            */
            throw new UnsupportedOperationException("Method not decompiled: rb.j.f.b(int, long):void");
        }

        @Override // tb.b.a
        public void d(boolean z10, int i10, int i11) {
            io.grpc.internal.a1 a1Var;
            long j10 = (((long) i10) << 32) | (((long) i11) & 4294967295L);
            this.f25800a.e(k.a.INBOUND, j10);
            if (!z10) {
                synchronized (j.this.f25774m) {
                    j.this.f25772k.d(true, i10, i11);
                }
                return;
            }
            synchronized (j.this.f25774m) {
                try {
                    a1Var = null;
                    if (j.this.f25787z == null) {
                        j.f25758a0.warning("Received unexpected ping ack. No ping outstanding");
                    } else if (j.this.f25787z.h() == j10) {
                        io.grpc.internal.a1 a1Var2 = j.this.f25787z;
                        j.this.f25787z = null;
                        a1Var = a1Var2;
                    } else {
                        j.f25758a0.log(Level.WARNING, String.format(Locale.US, "Received unexpected ping ack. Expecting %d, got %d", Long.valueOf(j.this.f25787z.h()), Long.valueOf(j10)));
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (a1Var != null) {
                a1Var.d();
            }
        }

        @Override // tb.b.a
        public void f(int i10, tb.a aVar) {
            this.f25800a.h(k.a.INBOUND, i10, aVar);
            u1 u1VarG = j.s0(aVar).g("Rst Stream");
            boolean z10 = u1VarG.o() == u1.b.CANCELLED || u1VarG.o() == u1.b.DEADLINE_EXCEEDED;
            synchronized (j.this.f25774m) {
                try {
                    rb.i iVar = (rb.i) j.this.f25777p.get(Integer.valueOf(i10));
                    if (iVar != null) {
                        gc.c.d("OkHttpClientTransport$ClientFrameHandler.rstStream", iVar.u().i0());
                        j.this.Y(i10, u1VarG, aVar == tb.a.REFUSED_STREAM ? s.a.REFUSED : s.a.PROCESSED, z10, null, null);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // tb.b.a
        public void h(boolean z10, int i10, vh.g gVar, int i11, int i12) {
            this.f25800a.b(k.a.INBOUND, i10, gVar.h(), i11, z10);
            rb.i iVarC0 = j.this.c0(i10);
            if (iVarC0 != null) {
                long j10 = i11;
                gVar.l0(j10);
                vh.e eVar = new vh.e();
                eVar.C(gVar.h(), j10);
                gc.c.d("OkHttpClientTransport$ClientFrameHandler.data", iVarC0.u().i0());
                synchronized (j.this.f25774m) {
                    iVarC0.u().j0(eVar, z10, i12 - i11);
                }
            } else {
                if (!j.this.f0(i10)) {
                    j.this.i0(tb.a.PROTOCOL_ERROR, "Received data for unknown stream: " + i10);
                    return;
                }
                synchronized (j.this.f25774m) {
                    j.this.f25772k.f(i10, tb.a.STREAM_CLOSED);
                }
                gVar.skip(i11);
            }
            j.G(j.this, i12);
            if (j.this.f25782u >= j.this.f25769h * 0.5f) {
                synchronized (j.this.f25774m) {
                    j.this.f25772k.b(0, j.this.f25782u);
                }
                j.this.f25782u = 0;
            }
        }

        @Override // tb.b.a
        public void i(int i10, int i11, List list) {
            this.f25800a.g(k.a.INBOUND, i10, i11, list);
            synchronized (j.this.f25774m) {
                j.this.f25772k.f(i10, tb.a.PROTOCOL_ERROR);
            }
        }

        @Override // tb.b.a
        public void j(int i10, tb.a aVar, vh.h hVar) {
            this.f25800a.c(k.a.INBOUND, i10, aVar, hVar);
            if (aVar == tb.a.ENHANCE_YOUR_CALM) {
                String strZ = hVar.Z();
                j.f25758a0.log(Level.WARNING, String.format("%s: Received GOAWAY with ENHANCE_YOUR_CALM. Debug data: %s", this, strZ));
                if ("too_many_pings".equals(strZ)) {
                    j.this.O.run();
                }
            }
            u1 u1VarG = w0.h.g(aVar.f27698a).g("Received Goaway");
            if (hVar.Q() > 0) {
                u1VarG = u1VarG.g(hVar.Z());
            }
            j.this.n0(i10, null, u1VarG);
        }

        @Override // tb.b.a
        public void k(boolean z10, tb.i iVar) {
            boolean zF;
            this.f25800a.i(k.a.INBOUND, iVar);
            synchronized (j.this.f25774m) {
                try {
                    if (o.b(iVar, 4)) {
                        j.this.G = o.a(iVar, 4);
                    }
                    if (o.b(iVar, 7)) {
                        zF = j.this.f25773l.f(o.a(iVar, 7));
                    } else {
                        zF = false;
                    }
                    if (this.f25802c) {
                        j jVar = j.this;
                        jVar.f25784w = jVar.f25771j.e(j.this.f25784w);
                        j.this.f25771j.a();
                        this.f25802c = false;
                    }
                    j.this.f25772k.I(iVar);
                    if (zF) {
                        j.this.f25773l.h();
                    }
                    j.this.o0();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // tb.b.a
        public void l(boolean z10, boolean z11, int i10, int i11, List list, tb.e eVar) {
            u1 u1VarS;
            int iA;
            this.f25800a.d(k.a.INBOUND, i10, list, z11);
            boolean z12 = true;
            if (j.this.P == Integer.MAX_VALUE || (iA = a(list)) <= j.this.P) {
                u1VarS = null;
            } else {
                u1VarS = u1.f24778n.s(String.format(Locale.US, "Response %s metadata larger than %d: %d", z11 ? "trailer" : "header", Integer.valueOf(j.this.P), Integer.valueOf(iA)));
            }
            synchronized (j.this.f25774m) {
                try {
                    rb.i iVar = (rb.i) j.this.f25777p.get(Integer.valueOf(i10));
                    if (iVar == null) {
                        if (j.this.f0(i10)) {
                            j.this.f25772k.f(i10, tb.a.STREAM_CLOSED);
                        }
                    } else if (u1VarS == null) {
                        gc.c.d("OkHttpClientTransport$ClientFrameHandler.headers", iVar.u().i0());
                        iVar.u().k0(list, z11);
                    } else {
                        if (!z11) {
                            j.this.f25772k.f(i10, tb.a.CANCEL);
                        }
                        iVar.u().O(u1VarS, false, new z0());
                    }
                    z12 = false;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (z12) {
                j.this.i0(tb.a.PROTOCOL_ERROR, "Received header for unknown stream: " + i10);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            u1 u1VarS;
            String name = Thread.currentThread().getName();
            Thread.currentThread().setName("OkHttpClientTransport");
            while (this.f25801b.f0(this)) {
                try {
                    if (j.this.J != null) {
                        j.this.J.m();
                    }
                } catch (Throwable th2) {
                    try {
                        j.this.n0(0, tb.a.PROTOCOL_ERROR, u1.f24783s.s("error in frame handler").r(th2));
                        try {
                            this.f25801b.close();
                        } catch (IOException e10) {
                            e = e10;
                            j.f25758a0.log(Level.INFO, "Exception closing frame reader", (Throwable) e);
                        } catch (RuntimeException e11) {
                            if (!"bio == null".equals(e11.getMessage())) {
                                throw e11;
                            }
                        }
                    } catch (Throwable th3) {
                        try {
                            this.f25801b.close();
                        } catch (IOException e12) {
                            j.f25758a0.log(Level.INFO, "Exception closing frame reader", (Throwable) e12);
                        } catch (RuntimeException e13) {
                            if (!"bio == null".equals(e13.getMessage())) {
                                throw e13;
                            }
                        }
                        j.this.f25771j.b();
                        Thread.currentThread().setName(name);
                        throw th3;
                    }
                }
            }
            synchronized (j.this.f25774m) {
                u1VarS = j.this.f25785x;
            }
            if (u1VarS == null) {
                u1VarS = u1.f24784t.s("End of stream or IOException");
            }
            j.this.n0(0, tb.a.INTERNAL_ERROR, u1VarS);
            try {
                this.f25801b.close();
            } catch (IOException e14) {
                e = e14;
                j.f25758a0.log(Level.INFO, "Exception closing frame reader", (Throwable) e);
            } catch (RuntimeException e15) {
                if (!"bio == null".equals(e15.getMessage())) {
                    throw e15;
                }
            }
            j.this.f25771j.b();
            Thread.currentThread().setName(name);
        }

        @Override // tb.b.a
        public void e() {
        }

        @Override // tb.b.a
        public void g(int i10, int i11, int i12, boolean z10) {
        }
    }
}
