package jh;

import d.h0;
import dd.d0;
import eh.e0;
import eh.j0;
import eh.x;
import eh.z;
import java.io.IOException;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLPeerUnverifiedException;
import kh.d;
import mh.c;
import mh.o;
import vh.o0;

/* JADX INFO: loaded from: classes3.dex */
public final class n extends o.c implements eh.k, d.a {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final a f18806v = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ih.d f18807c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final o f18808d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final j0 f18809e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Socket f18810f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Socket f18811g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final x f18812h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final e0 f18813i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final jh.a f18814j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final int f18815k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final g f18816l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private mh.o f18817m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f18818n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f18819o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f18820p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f18821q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f18822r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f18823s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final List f18824t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private long f18825u;

    public static final class a {
        public /* synthetic */ a(rd.h hVar) {
            this();
        }

        private a() {
        }
    }

    public n(ih.d dVar, o oVar, j0 j0Var, Socket socket, Socket socket2, x xVar, e0 e0Var, jh.a aVar, int i10, g gVar) {
        rd.m.e(dVar, "taskRunner");
        rd.m.e(oVar, "connectionPool");
        rd.m.e(j0Var, "route");
        rd.m.e(socket, "rawSocket");
        rd.m.e(socket2, "javaNetSocket");
        rd.m.e(e0Var, "protocol");
        rd.m.e(aVar, "socket");
        rd.m.e(gVar, "connectionListener");
        this.f18807c = dVar;
        this.f18808d = oVar;
        this.f18809e = j0Var;
        this.f18810f = socket;
        this.f18811g = socket2;
        this.f18812h = xVar;
        this.f18813i = e0Var;
        this.f18814j = aVar;
        this.f18815k = i10;
        this.f18816l = gVar;
        this.f18823s = 1;
        this.f18824t = new ArrayList();
        this.f18825u = Long.MAX_VALUE;
    }

    private final boolean A(z zVar) {
        x xVar;
        if (!fh.p.f13109b || Thread.holdsLock(this)) {
            z zVarL = h().a().l();
            if (zVar.m() != zVarL.m()) {
                return false;
            }
            if (rd.m.a(zVar.h(), zVarL.h())) {
                return true;
            }
            return (this.f18819o || (xVar = this.f18812h) == null || !c(zVar, xVar)) ? false : true;
        }
        throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
    }

    private final boolean c(z zVar, x xVar) {
        List listE = xVar.e();
        if (!listE.isEmpty()) {
            th.d dVar = th.d.f27887a;
            String strH = zVar.h();
            Object obj = listE.get(0);
            rd.m.c(obj, "null cannot be cast to non-null type java.security.cert.X509Certificate");
            if (dVar.e(strH, (X509Certificate) obj)) {
                return true;
            }
        }
        return false;
    }

    private final boolean u(List list) {
        if (h0.a(list) && list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            j0 j0Var = (j0) it.next();
            Proxy.Type type = j0Var.b().type();
            Proxy.Type type2 = Proxy.Type.DIRECT;
            if (type == type2 && h().b().type() == type2 && rd.m.a(h().d(), j0Var.d())) {
                return true;
            }
        }
        return false;
    }

    private final void z() throws SocketException {
        this.f18811g.setSoTimeout(0);
        Object obj = this.f18816l;
        mh.c cVar = obj instanceof mh.c ? (mh.c) obj : null;
        if (cVar == null) {
            cVar = c.a.f22107a;
        }
        mh.o oVarA = new o.a(true, this.f18807c).o(this.f18814j, h().a().l().h()).k(this).l(this.f18815k).b(cVar).a();
        this.f18817m = oVarA;
        this.f18823s = mh.o.L.a().d();
        mh.o.d1(oVarA, false, 1, null);
    }

    public final void B() throws SocketException {
        this.f18811g.setSoTimeout(0);
        e();
    }

    @Override // mh.o.c
    public void a(mh.o oVar, mh.z zVar) {
        rd.m.e(oVar, "connection");
        rd.m.e(zVar, "settings");
        synchronized (this) {
            this.f18823s = zVar.d();
            d0 d0Var = d0.f10897a;
        }
    }

    @Override // mh.o.c
    public void b(mh.v vVar) {
        rd.m.e(vVar, "stream");
        vVar.f(mh.b.f22098s, null);
    }

    @Override // kh.d.a
    public void cancel() {
        fh.p.h(this.f18810f);
    }

    public final void d(eh.d0 d0Var, j0 j0Var, IOException iOException) {
        rd.m.e(d0Var, "client");
        rd.m.e(j0Var, "failedRoute");
        rd.m.e(iOException, "failure");
        if (j0Var.b().type() != Proxy.Type.DIRECT) {
            eh.a aVarA = j0Var.a();
            aVarA.i().connectFailed(aVarA.l().r(), j0Var.b().address(), iOException);
        }
        d0Var.u().b(j0Var);
    }

    @Override // kh.d.a
    public void e() {
        synchronized (this) {
            this.f18818n = true;
            d0 d0Var = d0.f10897a;
        }
        this.f18816l.h(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x004c  */
    @Override // kh.d.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void f(jh.m r4, java.io.IOException r5) {
        /*
            r3 = this;
            java.lang.String r0 = "call"
            rd.m.e(r4, r0)
            monitor-enter(r3)
            boolean r0 = r5 instanceof mh.a0     // Catch: java.lang.Throwable -> L26
            r1 = 1
            if (r0 == 0) goto L41
            r0 = r5
            mh.a0 r0 = (mh.a0) r0     // Catch: java.lang.Throwable -> L26
            mh.b r0 = r0.f22089a     // Catch: java.lang.Throwable -> L26
            mh.b r2 = mh.b.f22098s     // Catch: java.lang.Throwable -> L26
            if (r0 != r2) goto L28
            int r4 = r3.f18822r     // Catch: java.lang.Throwable -> L26
            int r4 = r4 + r1
            r3.f18822r = r4     // Catch: java.lang.Throwable -> L26
            if (r4 <= r1) goto L4c
            boolean r4 = r3.f18818n     // Catch: java.lang.Throwable -> L26
            r4 = r4 ^ r1
            r3.f18818n = r1     // Catch: java.lang.Throwable -> L26
            int r5 = r3.f18820p     // Catch: java.lang.Throwable -> L26
            int r5 = r5 + r1
            r3.f18820p = r5     // Catch: java.lang.Throwable -> L26
            goto L6a
        L26:
            r4 = move-exception
            goto L75
        L28:
            mh.a0 r5 = (mh.a0) r5     // Catch: java.lang.Throwable -> L26
            mh.b r5 = r5.f22089a     // Catch: java.lang.Throwable -> L26
            mh.b r0 = mh.b.f22099t     // Catch: java.lang.Throwable -> L26
            if (r5 != r0) goto L36
            boolean r4 = r4.c()     // Catch: java.lang.Throwable -> L26
            if (r4 != 0) goto L4c
        L36:
            boolean r4 = r3.f18818n     // Catch: java.lang.Throwable -> L26
            r4 = r4 ^ r1
            r3.f18818n = r1     // Catch: java.lang.Throwable -> L26
            int r5 = r3.f18820p     // Catch: java.lang.Throwable -> L26
            int r5 = r5 + r1
            r3.f18820p = r5     // Catch: java.lang.Throwable -> L26
            goto L6a
        L41:
            boolean r0 = r3.q()     // Catch: java.lang.Throwable -> L26
            if (r0 == 0) goto L4e
            boolean r0 = r5 instanceof mh.a     // Catch: java.lang.Throwable -> L26
            if (r0 == 0) goto L4c
            goto L4e
        L4c:
            r4 = 0
            goto L6a
        L4e:
            boolean r0 = r3.f18818n     // Catch: java.lang.Throwable -> L26
            r0 = r0 ^ r1
            r3.f18818n = r1     // Catch: java.lang.Throwable -> L26
            int r2 = r3.f18821q     // Catch: java.lang.Throwable -> L26
            if (r2 != 0) goto L69
            if (r5 == 0) goto L64
            eh.d0 r4 = r4.k()     // Catch: java.lang.Throwable -> L26
            eh.j0 r2 = r3.h()     // Catch: java.lang.Throwable -> L26
            r3.d(r4, r2, r5)     // Catch: java.lang.Throwable -> L26
        L64:
            int r4 = r3.f18820p     // Catch: java.lang.Throwable -> L26
            int r4 = r4 + r1
            r3.f18820p = r4     // Catch: java.lang.Throwable -> L26
        L69:
            r4 = r0
        L6a:
            dd.d0 r5 = dd.d0.f10897a     // Catch: java.lang.Throwable -> L26
            monitor-exit(r3)
            if (r4 == 0) goto L74
            jh.g r4 = r3.f18816l
            r4.h(r3)
        L74:
            return
        L75:
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: jh.n.f(jh.m, java.io.IOException):void");
    }

    public final List g() {
        return this.f18824t;
    }

    @Override // kh.d.a
    public j0 h() {
        return this.f18809e;
    }

    public final g i() {
        return this.f18816l;
    }

    public final long j() {
        return this.f18825u;
    }

    public final boolean k() {
        return this.f18818n;
    }

    public final int l() {
        return this.f18820p;
    }

    public x m() {
        return this.f18812h;
    }

    public final void n() {
        synchronized (this) {
            this.f18821q++;
        }
    }

    public final boolean o(eh.a aVar, List list) {
        rd.m.e(aVar, "address");
        if (fh.p.f13109b && !Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
        }
        if (this.f18824t.size() >= this.f18823s || this.f18818n || !h().a().d(aVar)) {
            return false;
        }
        if (rd.m.a(aVar.l().h(), t().a().l().h())) {
            return true;
        }
        if (this.f18817m == null || list == null || !u(list) || aVar.e() != th.d.f27887a || !A(aVar.l())) {
            return false;
        }
        try {
            eh.h hVarA = aVar.a();
            rd.m.b(hVarA);
            String strH = aVar.l().h();
            x xVarM = m();
            rd.m.b(xVarM);
            hVarA.b(strH, xVarM.e());
            return true;
        } catch (SSLPeerUnverifiedException unused) {
            return false;
        }
    }

    public final boolean p(boolean z10) {
        long j10;
        if (fh.p.f13109b && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        long jNanoTime = System.nanoTime();
        if (this.f18810f.isClosed() || this.f18811g.isClosed() || this.f18811g.isInputShutdown() || this.f18811g.isOutputShutdown()) {
            return false;
        }
        mh.o oVar = this.f18817m;
        if (oVar != null) {
            return oVar.K0(jNanoTime);
        }
        synchronized (this) {
            j10 = jNanoTime - this.f18825u;
        }
        if (j10 < 10000000000L || !z10) {
            return true;
        }
        return fh.p.m(this.f18811g, this.f18814j.getSource());
    }

    public final boolean q() {
        return this.f18817m != null;
    }

    public final kh.d r(eh.d0 d0Var, kh.g gVar) {
        rd.m.e(d0Var, "client");
        rd.m.e(gVar, "chain");
        jh.a aVar = this.f18814j;
        mh.o oVar = this.f18817m;
        if (oVar != null) {
            return new mh.t(d0Var, this, gVar, oVar);
        }
        this.f18811g.setSoTimeout(gVar.l());
        o0 o0VarI = aVar.getSource().i();
        long jI = gVar.i();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        o0VarI.g(jI, timeUnit);
        aVar.a().i().g(gVar.k(), timeUnit);
        return new lh.b(d0Var, this, aVar);
    }

    public final void s() {
        synchronized (this) {
            this.f18819o = true;
            d0 d0Var = d0.f10897a;
        }
    }

    public j0 t() {
        return h();
    }

    public String toString() {
        Object objB;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Connection{");
        sb2.append(h().a().l().h());
        sb2.append(':');
        sb2.append(h().a().l().m());
        sb2.append(", proxy=");
        sb2.append(h().b());
        sb2.append(" hostAddress=");
        sb2.append(h().d());
        sb2.append(" cipherSuite=");
        x xVar = this.f18812h;
        if (xVar == null || (objB = xVar.b()) == null) {
            objB = "none";
        }
        sb2.append(objB);
        sb2.append(" protocol=");
        sb2.append(this.f18813i);
        sb2.append('}');
        return sb2.toString();
    }

    public final void v(long j10) {
        this.f18825u = j10;
    }

    public final void w(boolean z10) {
        this.f18818n = z10;
    }

    public Socket x() {
        return this.f18811g;
    }

    public final void y() throws SocketException {
        this.f18825u = System.nanoTime();
        e0 e0Var = this.f18813i;
        if (e0Var == e0.f12390f || e0Var == e0.f12391g) {
            z();
        }
    }
}
