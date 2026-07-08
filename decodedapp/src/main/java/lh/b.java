package lh;

import androidx.appcompat.widget.ActivityChooserView;
import eh.d0;
import eh.f0;
import eh.g0;
import eh.h0;
import eh.y;
import eh.z;
import fh.p;
import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.util.concurrent.TimeUnit;
import kh.d;
import kh.i;
import kh.k;
import rd.h;
import rd.m;
import rg.q;
import vh.l0;
import vh.n0;
import vh.o;
import vh.o0;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements kh.d {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final d f20663g = new d(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final y f20664h = y.f12617b.a("OkHttp-Response-Body", "Truncated");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d0 f20665a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final d.a f20666b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final jh.a f20667c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f20668d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final lh.a f20669e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private y f20670f;

    private abstract class a implements n0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final z f20671a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final o f20672b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f20673c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ b f20674d;

        public a(b bVar, z zVar) {
            m.e(zVar, "url");
            this.f20674d = bVar;
            this.f20671a = zVar;
            this.f20672b = new o(bVar.h().getSource().i());
        }

        @Override // vh.n0
        public long N(vh.e eVar, long j10) throws IOException {
            m.e(eVar, "sink");
            try {
                return this.f20674d.h().getSource().N(eVar, j10);
            } catch (IOException e10) {
                this.f20674d.i().e();
                c(b.f20664h);
                throw e10;
            }
        }

        protected final boolean a() {
            return this.f20673c;
        }

        public final void c(y yVar) {
            d0 d0Var;
            eh.o oVarN;
            m.e(yVar, "trailers");
            if (this.f20674d.f20668d == 6) {
                return;
            }
            if (this.f20674d.f20668d != 5) {
                throw new IllegalStateException("state: " + this.f20674d.f20668d);
            }
            this.f20674d.r(this.f20672b);
            this.f20674d.f20670f = yVar;
            this.f20674d.f20668d = 6;
            if (yVar.size() <= 0 || (d0Var = this.f20674d.f20665a) == null || (oVarN = d0Var.n()) == null) {
                return;
            }
            kh.e.f(oVarN, this.f20671a, yVar);
        }

        protected final void e(boolean z10) {
            this.f20673c = z10;
        }

        @Override // vh.n0
        public o0 i() {
            return this.f20672b;
        }
    }

    /* JADX INFO: renamed from: lh.b$b, reason: collision with other inner class name */
    private final class C0276b implements l0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final o f20675a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f20676b;

        public C0276b() {
            this.f20675a = new o(b.this.h().a().i());
        }

        @Override // vh.l0
        public void C(vh.e eVar, long j10) {
            m.e(eVar, "source");
            if (this.f20676b) {
                throw new IllegalStateException("closed");
            }
            if (j10 == 0) {
                return;
            }
            vh.f fVarA = b.this.h().a();
            fVarA.O(j10);
            fVarA.J("\r\n");
            fVarA.C(eVar, j10);
            fVarA.J("\r\n");
        }

        @Override // vh.l0, java.io.Closeable, java.lang.AutoCloseable
        public synchronized void close() {
            if (this.f20676b) {
                return;
            }
            this.f20676b = true;
            b.this.h().a().J("0\r\n\r\n");
            b.this.r(this.f20675a);
            b.this.f20668d = 3;
        }

        @Override // vh.l0, java.io.Flushable
        public synchronized void flush() {
            if (this.f20676b) {
                return;
            }
            b.this.h().a().flush();
        }

        @Override // vh.l0
        public o0 i() {
            return this.f20675a;
        }
    }

    private final class c extends a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private long f20678e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f20679f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ b f20680g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(b bVar, z zVar) {
            super(bVar, zVar);
            m.e(zVar, "url");
            this.f20680g = bVar;
            this.f20678e = -1L;
            this.f20679f = true;
        }

        private final void k() throws ProtocolException {
            if (this.f20678e != -1) {
                this.f20680g.h().getSource().U();
            }
            try {
                this.f20678e = this.f20680g.h().getSource().q0();
                String string = q.W0(this.f20680g.h().getSource().U()).toString();
                if (this.f20678e >= 0 && (string.length() <= 0 || q.J(string, ";", false, 2, null))) {
                    if (this.f20678e == 0) {
                        this.f20679f = false;
                        c(this.f20680g.f20669e.a());
                        return;
                    }
                    return;
                }
                throw new ProtocolException("expected chunk size and optional extensions but was \"" + this.f20678e + string + '\"');
            } catch (NumberFormatException e10) {
                throw new ProtocolException(e10.getMessage());
            }
        }

        @Override // lh.b.a, vh.n0
        public long N(vh.e eVar, long j10) throws IOException {
            m.e(eVar, "sink");
            if (j10 < 0) {
                throw new IllegalArgumentException(("byteCount < 0: " + j10).toString());
            }
            if (a()) {
                throw new IllegalStateException("closed");
            }
            if (!this.f20679f) {
                return -1L;
            }
            long j11 = this.f20678e;
            if (j11 == 0 || j11 == -1) {
                k();
                if (!this.f20679f) {
                    return -1L;
                }
            }
            long jN = super.N(eVar, Math.min(j10, this.f20678e));
            if (jN != -1) {
                this.f20678e -= jN;
                return jN;
            }
            this.f20680g.i().e();
            ProtocolException protocolException = new ProtocolException("unexpected end of stream");
            c(b.f20664h);
            throw protocolException;
        }

        @Override // vh.n0, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (a()) {
                return;
            }
            if (this.f20679f && !p.i(this, 100, TimeUnit.MILLISECONDS)) {
                this.f20680g.i().e();
                c(b.f20664h);
            }
            e(true);
        }
    }

    public static final class d {
        public /* synthetic */ d(h hVar) {
            this();
        }

        private d() {
        }
    }

    private final class e extends a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private long f20681e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ b f20682f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(b bVar, z zVar, long j10) {
            super(bVar, zVar);
            m.e(zVar, "url");
            this.f20682f = bVar;
            this.f20681e = j10;
            if (j10 == 0) {
                c(y.f12618c);
            }
        }

        @Override // lh.b.a, vh.n0
        public long N(vh.e eVar, long j10) throws IOException {
            m.e(eVar, "sink");
            if (j10 < 0) {
                throw new IllegalArgumentException(("byteCount < 0: " + j10).toString());
            }
            if (a()) {
                throw new IllegalStateException("closed");
            }
            long j11 = this.f20681e;
            if (j11 == 0) {
                return -1L;
            }
            long jN = super.N(eVar, Math.min(j11, j10));
            if (jN == -1) {
                this.f20682f.i().e();
                ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                c(b.f20664h);
                throw protocolException;
            }
            long j12 = this.f20681e - jN;
            this.f20681e = j12;
            if (j12 == 0) {
                c(y.f12618c);
            }
            return jN;
        }

        @Override // vh.n0, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (a()) {
                return;
            }
            if (this.f20681e != 0 && !p.i(this, 100, TimeUnit.MILLISECONDS)) {
                this.f20682f.i().e();
                c(b.f20664h);
            }
            e(true);
        }
    }

    private final class f implements l0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final o f20683a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f20684b;

        public f() {
            this.f20683a = new o(b.this.h().a().i());
        }

        @Override // vh.l0
        public void C(vh.e eVar, long j10) {
            m.e(eVar, "source");
            if (this.f20684b) {
                throw new IllegalStateException("closed");
            }
            fh.m.e(eVar.size(), 0L, j10);
            b.this.h().a().C(eVar, j10);
        }

        @Override // vh.l0, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.f20684b) {
                return;
            }
            this.f20684b = true;
            b.this.r(this.f20683a);
            b.this.f20668d = 3;
        }

        @Override // vh.l0, java.io.Flushable
        public void flush() {
            if (this.f20684b) {
                return;
            }
            b.this.h().a().flush();
        }

        @Override // vh.l0
        public o0 i() {
            return this.f20683a;
        }
    }

    private final class g extends a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f20686e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ b f20687f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(b bVar, z zVar) {
            super(bVar, zVar);
            m.e(zVar, "url");
            this.f20687f = bVar;
        }

        @Override // lh.b.a, vh.n0
        public long N(vh.e eVar, long j10) throws IOException {
            m.e(eVar, "sink");
            if (j10 < 0) {
                throw new IllegalArgumentException(("byteCount < 0: " + j10).toString());
            }
            if (a()) {
                throw new IllegalStateException("closed");
            }
            if (this.f20686e) {
                return -1L;
            }
            long jN = super.N(eVar, j10);
            if (jN != -1) {
                return jN;
            }
            this.f20686e = true;
            c(y.f12618c);
            return -1L;
        }

        @Override // vh.n0, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (a()) {
                return;
            }
            if (!this.f20686e) {
                c(b.f20664h);
            }
            e(true);
        }
    }

    public b(d0 d0Var, d.a aVar, jh.a aVar2) {
        m.e(aVar, "carrier");
        m.e(aVar2, "socket");
        this.f20665a = d0Var;
        this.f20666b = aVar;
        this.f20667c = aVar2;
        this.f20669e = new lh.a(h().getSource());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void r(o oVar) {
        o0 o0VarI = oVar.i();
        oVar.j(o0.f30840e);
        o0VarI.a();
        o0VarI.b();
    }

    private final boolean t(f0 f0Var) {
        return q.x("chunked", f0Var.e("Transfer-Encoding"), true);
    }

    private final boolean u(h0 h0Var) {
        return q.x("chunked", h0.w(h0Var, "Transfer-Encoding", null, 2, null), true);
    }

    private final l0 v() {
        if (this.f20668d == 1) {
            this.f20668d = 2;
            return new C0276b();
        }
        throw new IllegalStateException(("state: " + this.f20668d).toString());
    }

    private final n0 w(z zVar) {
        if (this.f20668d == 4) {
            this.f20668d = 5;
            return new c(this, zVar);
        }
        throw new IllegalStateException(("state: " + this.f20668d).toString());
    }

    private final n0 x(z zVar, long j10) {
        if (this.f20668d == 4) {
            this.f20668d = 5;
            return new e(this, zVar, j10);
        }
        throw new IllegalStateException(("state: " + this.f20668d).toString());
    }

    private final l0 y() {
        if (this.f20668d == 1) {
            this.f20668d = 2;
            return new f();
        }
        throw new IllegalStateException(("state: " + this.f20668d).toString());
    }

    private final n0 z(z zVar) {
        if (this.f20668d == 4) {
            this.f20668d = 5;
            i().e();
            return new g(this, zVar);
        }
        throw new IllegalStateException(("state: " + this.f20668d).toString());
    }

    public final void A(h0 h0Var) {
        m.e(h0Var, "response");
        long jK = p.k(h0Var);
        if (jK == -1) {
            return;
        }
        n0 n0VarX = x(h0Var.p0().m(), jK);
        p.o(n0VarX, ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED, TimeUnit.MILLISECONDS);
        n0VarX.close();
    }

    public final void B(y yVar, String str) {
        m.e(yVar, "headers");
        m.e(str, "requestLine");
        if (this.f20668d != 0) {
            throw new IllegalStateException(("state: " + this.f20668d).toString());
        }
        h().a().J(str).J("\r\n");
        int size = yVar.size();
        for (int i10 = 0; i10 < size; i10++) {
            h().a().J(yVar.d(i10)).J(": ").J(yVar.g(i10)).J("\r\n");
        }
        h().a().J("\r\n");
        this.f20668d = 1;
    }

    @Override // kh.d
    public void a() {
        h().a().flush();
    }

    @Override // kh.d
    public boolean b() {
        return this.f20668d == 6;
    }

    @Override // kh.d
    public long c(h0 h0Var) {
        m.e(h0Var, "response");
        if (!kh.e.b(h0Var)) {
            return 0L;
        }
        if (u(h0Var)) {
            return -1L;
        }
        return p.k(h0Var);
    }

    @Override // kh.d
    public void cancel() {
        i().cancel();
    }

    @Override // kh.d
    public h0.a d(boolean z10) throws IOException {
        int i10 = this.f20668d;
        if (i10 != 0 && i10 != 1 && i10 != 2 && i10 != 3) {
            throw new IllegalStateException(("state: " + this.f20668d).toString());
        }
        try {
            k kVarA = k.f19956d.a(this.f20669e.b());
            h0.a aVarJ = new h0.a().o(kVarA.f19957a).f(kVarA.f19958b).l(kVarA.f19959c).j(this.f20669e.a());
            if (z10 && kVarA.f19958b == 100) {
                return null;
            }
            int i11 = kVarA.f19958b;
            if (i11 == 100) {
                this.f20668d = 3;
                return aVarJ;
            }
            if (102 > i11 || i11 >= 200) {
                this.f20668d = 4;
                return aVarJ;
            }
            this.f20668d = 3;
            return aVarJ;
        } catch (EOFException e10) {
            throw new IOException("unexpected end of stream on " + i().h().a().l().o(), e10);
        }
    }

    @Override // kh.d
    public n0 e(h0 h0Var) {
        m.e(h0Var, "response");
        if (!kh.e.b(h0Var)) {
            return x(h0Var.p0().m(), 0L);
        }
        if (u(h0Var)) {
            return w(h0Var.p0().m());
        }
        long jK = p.k(h0Var);
        return jK != -1 ? x(h0Var.p0().m(), jK) : z(h0Var.p0().m());
    }

    @Override // kh.d
    public void f(f0 f0Var) {
        m.e(f0Var, "request");
        i iVar = i.f19953a;
        Proxy.Type type = i().h().b().type();
        m.d(type, "type(...)");
        B(f0Var.f(), iVar.a(f0Var, type));
    }

    @Override // kh.d
    public void g() {
        h().a().flush();
    }

    @Override // kh.d
    public d.a i() {
        return this.f20666b;
    }

    @Override // kh.d
    public l0 j(f0 f0Var, long j10) throws ProtocolException {
        m.e(f0Var, "request");
        g0 g0VarA = f0Var.a();
        if (g0VarA != null && g0VarA.d()) {
            throw new ProtocolException("Duplex connections are not supported for HTTP/1");
        }
        if (t(f0Var)) {
            return v();
        }
        if (j10 != -1) {
            return y();
        }
        throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
    }

    @Override // kh.d
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public jh.a h() {
        return this.f20667c;
    }
}
