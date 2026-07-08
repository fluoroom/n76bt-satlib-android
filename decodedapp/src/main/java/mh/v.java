package mh;

import dd.d0;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.ArrayDeque;
import vh.l0;
import vh.m0;
import vh.n0;
import vh.o0;

/* JADX INFO: loaded from: classes3.dex */
public final class v implements m0 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final a f22228n = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f22229a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final o f22230b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final nh.a f22231c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f22232d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f22233e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ArrayDeque f22234f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f22235g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final c f22236h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final b f22237i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final d f22238j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final d f22239k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private mh.b f22240l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private IOException f22241m;

    public static final class a {
        public /* synthetic */ a(rd.h hVar) {
            this();
        }

        private a() {
        }
    }

    public final class b implements l0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f22242a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final vh.e f22243b = new vh.e();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private eh.y f22244c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f22245d;

        public b(boolean z10) {
            this.f22242a = z10;
        }

        /* JADX WARN: Finally extract failed */
        private final void a(boolean z10) throws IOException {
            long jMin;
            boolean z11;
            v vVar = v.this;
            synchronized (vVar) {
                try {
                    vVar.t().s();
                    while (vVar.s() >= vVar.r() && !this.f22242a && !this.f22245d && vVar.k() == null) {
                        try {
                            vVar.D();
                        } catch (Throwable th2) {
                            vVar.t().C();
                            throw th2;
                        }
                    }
                    vVar.t().C();
                    vVar.e();
                    jMin = Math.min(vVar.r() - vVar.s(), this.f22243b.size());
                    vVar.B(vVar.s() + jMin);
                    z11 = z10 && jMin == this.f22243b.size();
                    d0 d0Var = d0.f10897a;
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            v.this.t().s();
            try {
                v.this.j().f1(v.this.m(), z11, this.f22243b, jMin);
            } finally {
                v.this.t().C();
            }
        }

        @Override // vh.l0
        public void C(vh.e eVar, long j10) throws IOException {
            rd.m.e(eVar, "source");
            v vVar = v.this;
            if (!fh.p.f13109b || !Thread.holdsLock(vVar)) {
                this.f22243b.C(eVar, j10);
                while (this.f22243b.size() >= 16384) {
                    a(false);
                }
            } else {
                throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + vVar);
            }
        }

        public final boolean c() {
            return this.f22245d;
        }

        @Override // vh.l0, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            v vVar = v.this;
            if (fh.p.f13109b && Thread.holdsLock(vVar)) {
                throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + vVar);
            }
            v vVar2 = v.this;
            synchronized (vVar2) {
                if (this.f22245d) {
                    return;
                }
                boolean z10 = vVar2.k() == null;
                d0 d0Var = d0.f10897a;
                if (!v.this.a().f22242a) {
                    boolean z11 = this.f22243b.size() > 0;
                    if (this.f22244c != null) {
                        while (this.f22243b.size() > 0) {
                            a(false);
                        }
                        o oVarJ = v.this.j();
                        int iM = v.this.m();
                        eh.y yVar = this.f22244c;
                        rd.m.b(yVar);
                        oVarJ.g1(iM, z10, fh.p.r(yVar));
                    } else if (z11) {
                        while (this.f22243b.size() > 0) {
                            a(true);
                        }
                    } else if (z10) {
                        v.this.j().f1(v.this.m(), true, null, 0L);
                    }
                }
                v vVar3 = v.this;
                synchronized (vVar3) {
                    this.f22245d = true;
                    rd.m.c(vVar3, "null cannot be cast to non-null type java.lang.Object");
                    vVar3.notifyAll();
                    d0 d0Var2 = d0.f10897a;
                }
                v.this.j().flush();
                v.this.d();
            }
        }

        public final boolean e() {
            return this.f22242a;
        }

        @Override // vh.l0, java.io.Flushable
        public void flush() throws IOException {
            v vVar = v.this;
            if (fh.p.f13109b && Thread.holdsLock(vVar)) {
                throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + vVar);
            }
            v vVar2 = v.this;
            synchronized (vVar2) {
                vVar2.e();
                d0 d0Var = d0.f10897a;
            }
            while (this.f22243b.size() > 0) {
                a(false);
                v.this.j().flush();
            }
        }

        @Override // vh.l0
        public o0 i() {
            return v.this.t();
        }
    }

    public final class c implements n0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final long f22247a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f22248b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final vh.e f22249c = new vh.e();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final vh.e f22250d = new vh.e();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private eh.y f22251e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f22252f;

        public c(long j10, boolean z10) {
            this.f22247a = j10;
            this.f22248b = z10;
        }

        private final void q(long j10) {
            v vVar = v.this;
            if (!fh.p.f13109b || !Thread.holdsLock(vVar)) {
                v.this.j().e1(j10);
                return;
            }
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + vVar);
        }

        @Override // vh.n0
        public long N(vh.e eVar, long j10) throws IOException {
            IOException iOExceptionL;
            boolean z10;
            long jN;
            rd.m.e(eVar, "sink");
            if (j10 < 0) {
                throw new IllegalArgumentException(("byteCount < 0: " + j10).toString());
            }
            do {
                v vVar = v.this;
                synchronized (vVar) {
                    boolean zI = vVar.i();
                    if (zI) {
                        vVar.o().s();
                    }
                    try {
                        if (vVar.k() == null || this.f22248b) {
                            iOExceptionL = null;
                        } else {
                            iOExceptionL = vVar.l();
                            if (iOExceptionL == null) {
                                mh.b bVarK = vVar.k();
                                rd.m.b(bVarK);
                                iOExceptionL = new a0(bVarK);
                            }
                        }
                        if (this.f22252f) {
                            throw new IOException("stream closed");
                        }
                        z10 = false;
                        if (this.f22250d.size() > 0) {
                            vh.e eVar2 = this.f22250d;
                            jN = eVar2.N(eVar, Math.min(j10, eVar2.size()));
                            nh.a.c(vVar.n(), jN, 0L, 2, null);
                            long jA = vVar.n().a();
                            if (iOExceptionL == null && jA >= vVar.j().E0().c() / 2) {
                                vVar.j().m1(vVar.m(), jA);
                                nh.a.c(vVar.n(), 0L, jA, 1, null);
                            }
                        } else {
                            if (!this.f22248b && iOExceptionL == null) {
                                vVar.D();
                                z10 = true;
                            }
                            jN = -1;
                        }
                        if (zI) {
                            vVar.o().C();
                        }
                        d0 d0Var = d0.f10897a;
                    } finally {
                    }
                }
                v.this.j().A0().b(v.this.m(), v.this.n(), this.f22250d.size());
            } while (z10);
            if (jN != -1) {
                return jN;
            }
            if (iOExceptionL == null) {
                return -1L;
            }
            throw iOExceptionL;
        }

        public final boolean a() {
            return this.f22252f;
        }

        public final boolean c() {
            return this.f22248b;
        }

        @Override // vh.n0, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            long size;
            v vVar = v.this;
            synchronized (vVar) {
                this.f22252f = true;
                size = this.f22250d.size();
                this.f22250d.k();
                rd.m.c(vVar, "null cannot be cast to non-null type java.lang.Object");
                vVar.notifyAll();
                d0 d0Var = d0.f10897a;
            }
            if (size > 0) {
                q(size);
            }
            v.this.d();
        }

        public final vh.e e() {
            return this.f22250d;
        }

        @Override // vh.n0
        public o0 i() {
            return v.this.o();
        }

        public final void k(vh.g gVar, long j10) throws EOFException {
            boolean z10;
            boolean z11;
            rd.m.e(gVar, "source");
            v vVar = v.this;
            if (fh.p.f13109b && Thread.holdsLock(vVar)) {
                throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + vVar);
            }
            long j11 = j10;
            while (j11 > 0) {
                synchronized (v.this) {
                    z10 = this.f22248b;
                    z11 = this.f22250d.size() + j11 > this.f22247a;
                    d0 d0Var = d0.f10897a;
                }
                if (z11) {
                    gVar.skip(j11);
                    v.this.h(mh.b.f22094f);
                    return;
                }
                if (z10) {
                    gVar.skip(j11);
                    return;
                }
                long jN = gVar.N(this.f22249c, j11);
                if (jN == -1) {
                    throw new EOFException();
                }
                j11 -= jN;
                v vVar2 = v.this;
                synchronized (vVar2) {
                    try {
                        if (this.f22252f) {
                            this.f22249c.k();
                        } else {
                            boolean z12 = this.f22250d.size() == 0;
                            this.f22250d.F0(this.f22249c);
                            if (z12) {
                                rd.m.c(vVar2, "null cannot be cast to non-null type java.lang.Object");
                                vVar2.notifyAll();
                            }
                        }
                    } finally {
                    }
                }
            }
            q(j10);
            v.this.j().A0().b(v.this.m(), v.this.n(), this.f22250d.size());
        }

        public final void l(boolean z10) {
            this.f22248b = z10;
        }

        public final void n(eh.y yVar) {
            this.f22251e = yVar;
        }
    }

    public final class d extends vh.c {
        public d() {
        }

        @Override // vh.c
        protected void B() {
            v.this.h(mh.b.f22099t);
            v.this.j().Y0();
        }

        public final void C() throws IOException {
            if (t()) {
                throw v(null);
            }
        }

        @Override // vh.c
        protected IOException v(IOException iOException) {
            SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
            if (iOException != null) {
                socketTimeoutException.initCause(iOException);
            }
            return socketTimeoutException;
        }
    }

    public v(int i10, o oVar, boolean z10, boolean z11, eh.y yVar) {
        rd.m.e(oVar, "connection");
        this.f22229a = i10;
        this.f22230b = oVar;
        this.f22231c = new nh.a(i10);
        this.f22233e = oVar.F0().c();
        ArrayDeque arrayDeque = new ArrayDeque();
        this.f22234f = arrayDeque;
        this.f22236h = new c(oVar.E0().c(), z11);
        this.f22237i = new b(z10);
        this.f22238j = new d();
        this.f22239k = new d();
        if (yVar == null) {
            if (!u()) {
                throw new IllegalStateException("remotely-initiated streams should have headers");
            }
        } else {
            if (u()) {
                throw new IllegalStateException("locally-initiated streams shouldn't have headers yet");
            }
            arrayDeque.add(yVar);
        }
    }

    private final boolean g(mh.b bVar, IOException iOException) {
        if (fh.p.f13109b && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        synchronized (this) {
            if (k() != null) {
                return false;
            }
            this.f22240l = bVar;
            this.f22241m = iOException;
            rd.m.c(this, "null cannot be cast to non-null type java.lang.Object");
            notifyAll();
            if (getSource().c() && a().e()) {
                return false;
            }
            d0 d0Var = d0.f10897a;
            this.f22230b.W0(this.f22229a);
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean i() {
        return !this.f22230b.y0() || a().c() || a().e();
    }

    public final void A(mh.b bVar) {
        rd.m.e(bVar, "errorCode");
        synchronized (this) {
            try {
                if (k() == null) {
                    this.f22240l = bVar;
                    rd.m.c(this, "null cannot be cast to non-null type java.lang.Object");
                    notifyAll();
                }
                d0 d0Var = d0.f10897a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void B(long j10) {
        this.f22232d = j10;
    }

    public final eh.y C(boolean z10) throws IOException {
        eh.y yVar;
        synchronized (this) {
            while (this.f22234f.isEmpty() && k() == null) {
                try {
                    boolean z11 = z10 || i();
                    if (z11) {
                        this.f22238j.s();
                    }
                    try {
                        D();
                        if (z11) {
                            this.f22238j.C();
                        }
                    } catch (Throwable th2) {
                        if (z11) {
                            this.f22238j.C();
                        }
                        throw th2;
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            if (this.f22234f.isEmpty()) {
                IOException iOException = this.f22241m;
                if (iOException != null) {
                    throw iOException;
                }
                mh.b bVarK = k();
                rd.m.b(bVarK);
                throw new a0(bVarK);
            }
            Object objRemoveFirst = this.f22234f.removeFirst();
            rd.m.d(objRemoveFirst, "removeFirst(...)");
            yVar = (eh.y) objRemoveFirst;
        }
        return yVar;
    }

    public final void D() throws InterruptedIOException {
        try {
            rd.m.c(this, "null cannot be cast to non-null type java.lang.Object");
            wait();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException();
        }
    }

    public final o0 E() {
        return this.f22239k;
    }

    public final void c(long j10) {
        this.f22233e += j10;
        if (j10 > 0) {
            rd.m.c(this, "null cannot be cast to non-null type java.lang.Object");
            notifyAll();
        }
    }

    @Override // vh.m0
    public void cancel() {
        h(mh.b.f22099t);
    }

    public final void d() {
        boolean z10;
        boolean zV;
        if (fh.p.f13109b && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        synchronized (this) {
            try {
                z10 = !getSource().c() && getSource().a() && (a().e() || a().c());
                zV = v();
                d0 d0Var = d0.f10897a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (z10) {
            f(mh.b.f22099t, null);
        } else {
            if (zV) {
                return;
            }
            this.f22230b.W0(this.f22229a);
        }
    }

    public final void e() throws IOException {
        if (a().c()) {
            throw new IOException("stream closed");
        }
        if (a().e()) {
            throw new IOException("stream finished");
        }
        if (k() != null) {
            IOException iOException = this.f22241m;
            if (iOException != null) {
                throw iOException;
            }
            mh.b bVarK = k();
            rd.m.b(bVarK);
            throw new a0(bVarK);
        }
    }

    public final void f(mh.b bVar, IOException iOException) {
        rd.m.e(bVar, "rstStatusCode");
        if (g(bVar, iOException)) {
            this.f22230b.i1(this.f22229a, bVar);
        }
    }

    public final void h(mh.b bVar) {
        rd.m.e(bVar, "errorCode");
        if (g(bVar, null)) {
            this.f22230b.k1(this.f22229a, bVar);
        }
    }

    public final o j() {
        return this.f22230b;
    }

    public final mh.b k() {
        mh.b bVar;
        synchronized (this) {
            bVar = this.f22240l;
        }
        return bVar;
    }

    public final IOException l() {
        return this.f22241m;
    }

    public final int m() {
        return this.f22229a;
    }

    public final nh.a n() {
        return this.f22231c;
    }

    public final d o() {
        return this.f22238j;
    }

    @Override // vh.m0
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public b a() {
        return this.f22237i;
    }

    @Override // vh.m0
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public c getSource() {
        return this.f22236h;
    }

    public final long r() {
        return this.f22233e;
    }

    public final long s() {
        return this.f22232d;
    }

    public final d t() {
        return this.f22239k;
    }

    public final boolean u() {
        return this.f22230b.y0() == ((this.f22229a & 1) == 1);
    }

    public final boolean v() {
        synchronized (this) {
            try {
                if (k() != null) {
                    return false;
                }
                if (getSource().c() || getSource().a()) {
                    if (a().e() || a().c()) {
                        if (this.f22235g) {
                            return false;
                        }
                    }
                }
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean w() {
        /*
            r1 = this;
            monitor-enter(r1)
            mh.v$c r0 = r1.getSource()     // Catch: java.lang.Throwable -> L1b
            boolean r0 = r0.c()     // Catch: java.lang.Throwable -> L1b
            if (r0 == 0) goto L1d
            mh.v$c r0 = r1.getSource()     // Catch: java.lang.Throwable -> L1b
            vh.e r0 = r0.e()     // Catch: java.lang.Throwable -> L1b
            boolean r0 = r0.z()     // Catch: java.lang.Throwable -> L1b
            if (r0 == 0) goto L1d
            r0 = 1
            goto L1e
        L1b:
            r0 = move-exception
            goto L20
        L1d:
            r0 = 0
        L1e:
            monitor-exit(r1)
            return r0
        L20:
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: mh.v.w():boolean");
    }

    public final o0 x() {
        return this.f22238j;
    }

    public final void y(vh.g gVar, int i10) {
        rd.m.e(gVar, "source");
        if (!fh.p.f13109b || !Thread.holdsLock(this)) {
            getSource().k(gVar, i10);
            return;
        }
        throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
    }

    public final void z(eh.y yVar, boolean z10) {
        boolean zV;
        rd.m.e(yVar, "headers");
        if (fh.p.f13109b && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        synchronized (this) {
            try {
                if (this.f22235g && yVar.b(":status") == null && yVar.b(":method") == null) {
                    getSource().n(yVar);
                } else {
                    this.f22235g = true;
                    this.f22234f.add(yVar);
                }
                if (z10) {
                    getSource().l(true);
                }
                zV = v();
                rd.m.c(this, "null cannot be cast to non-null type java.lang.Object");
                notifyAll();
                d0 d0Var = d0.f10897a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (zV) {
            return;
        }
        this.f22230b.W0(this.f22229a);
    }
}
