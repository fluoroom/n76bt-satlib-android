package jh;

import com.facebook.stetho.server.http.HttpHeaders;
import eh.f0;
import eh.g0;
import eh.h0;
import eh.i0;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.SocketException;
import kh.d;
import vh.l0;
import vh.m0;
import vh.n0;
import vh.z;

/* JADX INFO: loaded from: classes3.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final m f18751a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final eh.s f18752b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final i f18753c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final kh.d f18754d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f18755e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f18756f;

    private final class a extends vh.m {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f18757b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final boolean f18758c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f18759d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private long f18760e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f18761f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private boolean f18762g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ h f18763h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(h hVar, l0 l0Var, long j10, boolean z10) {
            super(l0Var);
            rd.m.e(l0Var, "delegate");
            this.f18763h = hVar;
            this.f18757b = j10;
            this.f18758c = z10;
            this.f18761f = z10;
        }

        private final IOException a(IOException iOException) {
            if (this.f18759d) {
                return iOException;
            }
            this.f18759d = true;
            return h.c(this.f18763h, this.f18760e, this.f18758c, false, true, iOException, 4, null);
        }

        @Override // vh.m, vh.l0
        public void C(vh.e eVar, long j10) throws IOException {
            rd.m.e(eVar, "source");
            if (this.f18762g) {
                throw new IllegalStateException("closed");
            }
            long j11 = this.f18757b;
            if (j11 != -1 && this.f18760e + j10 > j11) {
                throw new ProtocolException("expected " + this.f18757b + " bytes but received " + (this.f18760e + j10));
            }
            try {
                if (this.f18761f) {
                    this.f18761f = false;
                    this.f18763h.k().u(this.f18763h.i());
                }
                super.C(eVar, j10);
                this.f18760e += j10;
            } catch (IOException e10) {
                IOException iOExceptionA = a(e10);
                rd.m.b(iOExceptionA);
                throw iOExceptionA;
            }
        }

        @Override // vh.m, vh.l0, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.f18762g) {
                return;
            }
            this.f18762g = true;
            long j10 = this.f18757b;
            if (j10 != -1 && this.f18760e != j10) {
                throw new ProtocolException("unexpected end of stream");
            }
            try {
                super.close();
                a(null);
            } catch (IOException e10) {
                IOException iOExceptionA = a(e10);
                rd.m.b(iOExceptionA);
                throw iOExceptionA;
            }
        }

        @Override // vh.m, vh.l0, java.io.Flushable
        public void flush() throws IOException {
            try {
                super.flush();
            } catch (IOException e10) {
                IOException iOExceptionA = a(e10);
                rd.m.b(iOExceptionA);
                throw iOExceptionA;
            }
        }
    }

    public final class b extends vh.n {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f18764b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final boolean f18765c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private long f18766d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f18767e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f18768f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private boolean f18769g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ h f18770h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(h hVar, n0 n0Var, long j10, boolean z10) {
            super(n0Var);
            rd.m.e(n0Var, "delegate");
            this.f18770h = hVar;
            this.f18764b = j10;
            this.f18765c = z10;
            this.f18767e = true;
            if (j10 == 0) {
                c(null);
            }
        }

        @Override // vh.n, vh.n0
        public long N(vh.e eVar, long j10) throws IOException {
            rd.m.e(eVar, "sink");
            if (this.f18769g) {
                throw new IllegalStateException("closed");
            }
            try {
                long jN = a().N(eVar, j10);
                if (this.f18767e) {
                    this.f18767e = false;
                    this.f18770h.k().z(this.f18770h.i());
                }
                if (jN == -1) {
                    c(null);
                    return -1L;
                }
                long j11 = this.f18766d + jN;
                long j12 = this.f18764b;
                if (j12 != -1 && j11 > j12) {
                    throw new ProtocolException("expected " + this.f18764b + " bytes but received " + j11);
                }
                this.f18766d = j11;
                if (this.f18770h.f18754d.b()) {
                    c(null);
                }
                return jN;
            } catch (IOException e10) {
                IOException iOExceptionC = c(e10);
                rd.m.b(iOExceptionC);
                throw iOExceptionC;
            }
        }

        public final IOException c(IOException iOException) {
            if (this.f18768f) {
                return iOException;
            }
            this.f18768f = true;
            if (iOException == null && this.f18767e) {
                this.f18767e = false;
                this.f18770h.k().z(this.f18770h.i());
            }
            return h.c(this.f18770h, this.f18766d, this.f18765c, true, false, iOException, 8, null);
        }

        @Override // vh.n, vh.n0, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.f18769g) {
                return;
            }
            this.f18769g = true;
            try {
                super.close();
                c(null);
            } catch (IOException e10) {
                IOException iOExceptionC = c(e10);
                rd.m.b(iOExceptionC);
                throw iOExceptionC;
            }
        }
    }

    public static final class c implements m0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final a f18771a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final b f18772b;

        c() {
            this.f18771a = new a(h.this, h.this.f18754d.h().a(), -1L, true);
            this.f18772b = new b(h.this, h.this.f18754d.h().getSource(), -1L, true);
        }

        @Override // vh.m0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public a a() {
            return this.f18771a;
        }

        @Override // vh.m0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public b getSource() {
            return this.f18772b;
        }

        @Override // vh.m0
        public void cancel() {
            h.this.d();
        }
    }

    public h(m mVar, eh.s sVar, i iVar, kh.d dVar) {
        rd.m.e(mVar, "call");
        rd.m.e(sVar, "eventListener");
        rd.m.e(iVar, "finder");
        rd.m.e(dVar, "codec");
        this.f18751a = mVar;
        this.f18752b = sVar;
        this.f18753c = iVar;
        this.f18754d = dVar;
    }

    public static /* synthetic */ IOException c(h hVar, long j10, boolean z10, boolean z11, boolean z12, IOException iOException, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = -1;
        }
        return hVar.b(j10, z10, (i10 & 4) != 0 ? false : z11, (i10 & 8) != 0 ? false : z12, iOException);
    }

    private final void v(IOException iOException) {
        this.f18756f = true;
        this.f18754d.i().f(this.f18751a, iOException);
    }

    public final IOException b(long j10, boolean z10, boolean z11, boolean z12, IOException iOException) {
        if (iOException != null) {
            v(iOException);
        }
        if (z12) {
            if (iOException != null) {
                this.f18752b.v(this.f18751a, iOException);
            } else {
                this.f18752b.t(this.f18751a, j10);
            }
        }
        if (z11) {
            if (iOException != null) {
                this.f18752b.A(this.f18751a, iOException);
            } else {
                this.f18752b.y(this.f18751a, j10);
            }
        }
        return this.f18751a.w(this, z12 && !z10, z11 && !z10, z11 && z10, z12 && z10, iOException);
    }

    public final void d() {
        this.f18754d.cancel();
    }

    public final l0 e(f0 f0Var, boolean z10) {
        rd.m.e(f0Var, "request");
        this.f18755e = z10;
        g0 g0VarA = f0Var.a();
        rd.m.b(g0VarA);
        long jA = g0VarA.a();
        this.f18752b.u(this.f18751a);
        return new a(this, this.f18754d.j(f0Var, jA), jA, false);
    }

    public final void f() {
        this.f18754d.cancel();
        this.f18751a.w(this, true, true, true, true, null);
    }

    public final void g() {
        try {
            this.f18754d.a();
        } catch (IOException e10) {
            this.f18752b.v(this.f18751a, e10);
            v(e10);
            throw e10;
        }
    }

    public final void h() {
        try {
            this.f18754d.g();
        } catch (IOException e10) {
            this.f18752b.v(this.f18751a, e10);
            v(e10);
            throw e10;
        }
    }

    public final m i() {
        return this.f18751a;
    }

    public final n j() {
        d.a aVarI = this.f18754d.i();
        n nVar = aVarI instanceof n ? (n) aVarI : null;
        if (nVar != null) {
            return nVar;
        }
        throw new IllegalStateException("no connection for CONNECT tunnels");
    }

    public final eh.s k() {
        return this.f18752b;
    }

    public final i l() {
        return this.f18753c;
    }

    public final boolean m() {
        return this.f18756f;
    }

    public final boolean n() {
        return !rd.m.a(this.f18753c.b().d().l().h(), this.f18754d.i().h().a().l().h());
    }

    public final boolean o() {
        return this.f18755e;
    }

    public final void p() {
        this.f18754d.i().e();
    }

    public final void q() {
        m.x(this.f18751a, this, true, false, false, false, null, 28, null);
    }

    public final i0 r(h0 h0Var) {
        h hVar;
        String strW;
        long jC;
        rd.m.e(h0Var, "response");
        try {
            strW = h0.w(h0Var, HttpHeaders.CONTENT_TYPE, null, 2, null);
            jC = this.f18754d.c(h0Var);
            hVar = this;
        } catch (IOException e10) {
            e = e10;
            hVar = this;
        }
        try {
            return new kh.h(strW, jC, z.c(new b(hVar, this.f18754d.e(h0Var), jC, false)));
        } catch (IOException e11) {
            e = e11;
            IOException iOException = e;
            hVar.f18752b.A(hVar.f18751a, iOException);
            v(iOException);
            throw iOException;
        }
    }

    public final h0.a s(boolean z10) {
        try {
            h0.a aVarD = this.f18754d.d(z10);
            if (aVarD == null) {
                return aVarD;
            }
            aVarD.k(this);
            return aVarD;
        } catch (IOException e10) {
            this.f18752b.A(this.f18751a, e10);
            v(e10);
            throw e10;
        }
    }

    public final void t(h0 h0Var) {
        rd.m.e(h0Var, "response");
        this.f18752b.B(this.f18751a, h0Var);
    }

    public final void u() {
        this.f18752b.C(this.f18751a);
    }

    public final m0 w() throws SocketException {
        this.f18751a.F();
        d.a aVarI = this.f18754d.i();
        rd.m.c(aVarI, "null cannot be cast to non-null type okhttp3.internal.connection.RealConnection");
        ((n) aVarI).B();
        return new c();
    }

    public final void x(f0 f0Var) {
        rd.m.e(f0Var, "request");
        try {
            this.f18752b.x(this.f18751a);
            this.f18754d.f(f0Var);
            this.f18752b.w(this.f18751a, f0Var);
        } catch (IOException e10) {
            this.f18752b.v(this.f18751a, e10);
            v(e10);
            throw e10;
        }
    }
}
