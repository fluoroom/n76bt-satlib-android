package jh;

import dd.d0;
import eh.e0;
import eh.f0;
import eh.h0;
import eh.j0;
import eh.x;
import java.io.IOException;
import java.net.ConnectException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.Socket;
import java.net.UnknownServiceException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import jh.u;
import kh.d;
import vh.o0;

/* JADX INFO: loaded from: classes3.dex */
public final class f implements u.b, d.a {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final a f18724x = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ih.d f18725a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final o f18726b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f18727c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f18728d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f18729e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f18730f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f18731g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f18732h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final m f18733i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final p f18734j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final j0 f18735k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final List f18736l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final int f18737m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final f0 f18738n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final int f18739o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final boolean f18740p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private volatile boolean f18741q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private Socket f18742r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private Socket f18743s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private x f18744t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private e0 f18745u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private jh.a f18746v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private n f18747w;

    public static final class a {
        public /* synthetic */ a(rd.h hVar) {
            this();
        }

        private a() {
        }
    }

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f18748a;

        static {
            int[] iArr = new int[Proxy.Type.values().length];
            try {
                iArr[Proxy.Type.DIRECT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Proxy.Type.HTTP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f18748a = iArr;
        }
    }

    public f(ih.d dVar, o oVar, int i10, int i11, int i12, int i13, int i14, boolean z10, m mVar, p pVar, j0 j0Var, List list, int i15, f0 f0Var, int i16, boolean z11) {
        rd.m.e(dVar, "taskRunner");
        rd.m.e(oVar, "connectionPool");
        rd.m.e(mVar, "call");
        rd.m.e(pVar, "routePlanner");
        rd.m.e(j0Var, "route");
        this.f18725a = dVar;
        this.f18726b = oVar;
        this.f18727c = i10;
        this.f18728d = i11;
        this.f18729e = i12;
        this.f18730f = i13;
        this.f18731g = i14;
        this.f18732h = z10;
        this.f18733i = mVar;
        this.f18734j = pVar;
        this.f18735k = j0Var;
        this.f18736l = list;
        this.f18737m = i15;
        this.f18738n = f0Var;
        this.f18739o = i16;
        this.f18740p = z11;
    }

    private final void l() throws IOException {
        Socket socketCreateSocket;
        Proxy.Type type = h().b().type();
        int i10 = type == null ? -1 : b.f18748a[type.ordinal()];
        if (i10 == 1 || i10 == 2) {
            socketCreateSocket = h().a().j().createSocket();
            rd.m.b(socketCreateSocket);
        } else {
            socketCreateSocket = new Socket(h().b());
        }
        this.f18742r = socketCreateSocket;
        if (this.f18741q) {
            throw new IOException("canceled");
        }
        socketCreateSocket.setSoTimeout(this.f18730f);
        try {
            okhttp3.internal.platform.c.f23684a.e().h(socketCreateSocket, h().d(), this.f18729e);
            try {
                this.f18746v = jh.b.a(socketCreateSocket);
            } catch (NullPointerException e10) {
                if (rd.m.a(e10.getMessage(), "throw with null exception")) {
                    throw new IOException(e10);
                }
            }
        } catch (ConnectException e11) {
            ConnectException connectException = new ConnectException("Failed to connect to " + h().d());
            connectException.initCause(e11);
            throw connectException;
        }
    }

    private final void m(SSLSocket sSLSocket, eh.m mVar) {
        final eh.a aVarA = h().a();
        try {
            if (mVar.h()) {
                okhttp3.internal.platform.c.f23684a.e().g(sSLSocket, aVarA.l().h(), aVarA.f());
            }
            sSLSocket.startHandshake();
            SSLSession session = sSLSocket.getSession();
            x.a aVar = x.f12612e;
            rd.m.b(session);
            final x xVarD = aVar.d(session);
            HostnameVerifier hostnameVerifierE = aVarA.e();
            rd.m.b(hostnameVerifierE);
            if (hostnameVerifierE.verify(aVarA.l().h(), session)) {
                final eh.h hVarA = aVarA.a();
                rd.m.b(hVarA);
                final x xVar = new x(xVarD.g(), xVarD.b(), xVarD.d(), new qd.a() { // from class: jh.d
                    @Override // qd.a
                    public final Object a() {
                        return f.n(hVarA, xVarD, aVarA);
                    }
                });
                this.f18744t = xVar;
                hVarA.d(aVarA.l().h(), new qd.a() { // from class: jh.e
                    @Override // qd.a
                    public final Object a() {
                        return f.o(xVar);
                    }
                });
                String strJ = mVar.h() ? okhttp3.internal.platform.c.f23684a.e().j(sSLSocket) : null;
                this.f18743s = sSLSocket;
                this.f18746v = jh.b.a(sSLSocket);
                this.f18745u = strJ != null ? e0.f12386b.a(strJ) : e0.f12388d;
                okhttp3.internal.platform.c.f23684a.e().d(sSLSocket);
                return;
            }
            List listE = xVarD.e();
            if (listE.isEmpty()) {
                throw new SSLPeerUnverifiedException("Hostname " + aVarA.l().h() + " not verified (no certificates)");
            }
            Object obj = listE.get(0);
            rd.m.c(obj, "null cannot be cast to non-null type java.security.cert.X509Certificate");
            X509Certificate x509Certificate = (X509Certificate) obj;
            throw new SSLPeerUnverifiedException(rg.q.l("\n            |Hostname " + aVarA.l().h() + " not verified:\n            |    certificate: " + eh.h.f12421c.a(x509Certificate) + "\n            |    DN: " + x509Certificate.getSubjectDN().getName() + "\n            |    subjectAltNames: " + th.d.f27887a.a(x509Certificate) + "\n            ", null, 1, null));
        } catch (Throwable th2) {
            okhttp3.internal.platform.c.f23684a.e().d(sSLSocket);
            fh.p.h(sSLSocket);
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List n(eh.h hVar, x xVar, eh.a aVar) {
        th.c cVarF = hVar.f();
        rd.m.b(cVarF);
        return cVarF.a(xVar.e(), aVar.l().h());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List o(x xVar) {
        List<Certificate> listE = xVar.e();
        ArrayList arrayList = new ArrayList(ed.q.v(listE, 10));
        for (Certificate certificate : listE) {
            rd.m.c(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
            arrayList.add((X509Certificate) certificate);
        }
        return arrayList;
    }

    private final f q(int i10, f0 f0Var, int i11, boolean z10) {
        return new f(this.f18725a, this.f18726b, this.f18727c, this.f18728d, this.f18729e, this.f18730f, this.f18731g, this.f18732h, this.f18733i, this.f18734j, h(), this.f18736l, i10, f0Var, i11, z10);
    }

    static /* synthetic */ f r(f fVar, int i10, f0 f0Var, int i11, boolean z10, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = fVar.f18737m;
        }
        if ((i12 & 2) != 0) {
            f0Var = fVar.f18738n;
        }
        if ((i12 & 4) != 0) {
            i11 = fVar.f18739o;
        }
        if ((i12 & 8) != 0) {
            z10 = fVar.f18740p;
        }
        return fVar.q(i10, f0Var, i11, z10);
    }

    private final f0 s() throws IOException {
        f0 f0Var = this.f18738n;
        rd.m.b(f0Var);
        String str = "CONNECT " + fh.p.t(h().a().l(), true) + " HTTP/1.1";
        while (true) {
            jh.a aVar = this.f18746v;
            if (aVar == null) {
                rd.m.o("socket");
                aVar = null;
            }
            lh.b bVar = new lh.b(null, this, aVar);
            jh.a aVar2 = this.f18746v;
            if (aVar2 == null) {
                rd.m.o("socket");
                aVar2 = null;
            }
            o0 o0VarI = aVar2.getSource().i();
            long j10 = this.f18727c;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            o0VarI.g(j10, timeUnit);
            jh.a aVar3 = this.f18746v;
            if (aVar3 == null) {
                rd.m.o("socket");
                aVar3 = null;
            }
            aVar3.a().i().g(this.f18728d, timeUnit);
            bVar.B(f0Var.f(), str);
            bVar.a();
            h0.a aVarD = bVar.d(false);
            rd.m.b(aVarD);
            h0 h0VarC = aVarD.q(f0Var).c();
            bVar.A(h0VarC);
            int iN = h0VarC.n();
            if (iN == 200) {
                return null;
            }
            if (iN != 407) {
                throw new IOException("Unexpected response code for CONNECT: " + h0VarC.n());
            }
            f0 f0VarA = h().a().h().a(h(), h0VarC);
            if (f0VarA == null) {
                throw new IOException("Failed to authenticate with proxy");
            }
            if (rg.q.x("close", h0.w(h0VarC, "Connection", null, 2, null), true)) {
                return f0VarA;
            }
            f0Var = f0VarA;
        }
    }

    @Override // jh.u.b
    public boolean a() {
        return this.f18745u != null;
    }

    @Override // jh.u.b
    public u.b b() {
        return new f(this.f18725a, this.f18726b, this.f18727c, this.f18728d, this.f18729e, this.f18730f, this.f18731g, this.f18732h, this.f18733i, this.f18734j, h(), this.f18736l, this.f18737m, this.f18738n, this.f18739o, this.f18740p);
    }

    @Override // jh.u.b
    public n c() {
        this.f18733i.k().u().a(h());
        n nVar = this.f18747w;
        rd.m.b(nVar);
        nVar.i().b(nVar, h(), this.f18733i);
        r rVarL = this.f18734j.l(this, this.f18736l);
        if (rVarL != null) {
            return rVarL.i();
        }
        synchronized (nVar) {
            this.f18726b.f(nVar);
            this.f18733i.d(nVar);
            d0 d0Var = d0.f10897a;
        }
        this.f18733i.n().k(this.f18733i, nVar);
        nVar.i().e(nVar, this.f18733i);
        return nVar;
    }

    @Override // jh.u.b, kh.d.a
    public void cancel() {
        this.f18741q = true;
        Socket socket = this.f18742r;
        if (socket != null) {
            fh.p.h(socket);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00fb  */
    @Override // jh.u.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public jh.u.a d() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 268
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: jh.f.d():jh.u$a");
    }

    @Override // kh.d.a
    public void f(m mVar, IOException iOException) {
        rd.m.e(mVar, "call");
    }

    /* JADX WARN: Removed duplicated region for block: B:71:0x01d8  */
    @Override // jh.u.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public jh.u.a g() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 521
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: jh.f.g():jh.u$a");
    }

    @Override // kh.d.a
    public j0 h() {
        return this.f18735k;
    }

    public final void k() {
        Socket socket = this.f18743s;
        if (socket != null) {
            fh.p.h(socket);
        }
    }

    public final u.a p() throws IOException {
        f0 f0VarS = s();
        if (f0VarS == null) {
            return new u.a(this, null, null, 6, null);
        }
        Socket socket = this.f18742r;
        if (socket != null) {
            fh.p.h(socket);
        }
        int i10 = this.f18737m + 1;
        if (i10 < 21) {
            this.f18733i.n().h(this.f18733i, h().d(), h().b(), null);
            return new u.a(this, r(this, i10, f0VarS, 0, false, 12, null), null, 4, null);
        }
        ProtocolException protocolException = new ProtocolException("Too many tunnel connections attempted: 21");
        this.f18733i.n().i(this.f18733i, h().d(), h().b(), null, protocolException);
        this.f18726b.d().c(h(), this.f18733i, protocolException);
        return new u.a(this, null, protocolException, 2, null);
    }

    public final List t() {
        return this.f18736l;
    }

    public final f u(List list, SSLSocket sSLSocket) {
        rd.m.e(list, "connectionSpecs");
        rd.m.e(sSLSocket, "sslSocket");
        int i10 = this.f18739o + 1;
        int size = list.size();
        for (int i11 = i10; i11 < size; i11++) {
            if (((eh.m) list.get(i11)).e(sSLSocket)) {
                return r(this, 0, null, i11, this.f18739o != -1, 3, null);
            }
        }
        return null;
    }

    public final f v(List list, SSLSocket sSLSocket) throws UnknownServiceException {
        rd.m.e(list, "connectionSpecs");
        rd.m.e(sSLSocket, "sslSocket");
        if (this.f18739o != -1) {
            return this;
        }
        f fVarU = u(list, sSLSocket);
        if (fVarU != null) {
            return fVarU;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Unable to find acceptable protocols. isFallback=");
        sb2.append(this.f18740p);
        sb2.append(", modes=");
        sb2.append(list);
        sb2.append(", supported protocols=");
        String[] enabledProtocols = sSLSocket.getEnabledProtocols();
        rd.m.b(enabledProtocols);
        String string = Arrays.toString(enabledProtocols);
        rd.m.d(string, "toString(...)");
        sb2.append(string);
        throw new UnknownServiceException(sb2.toString());
    }

    @Override // kh.d.a
    public void e() {
    }
}
