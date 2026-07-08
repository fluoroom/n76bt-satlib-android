package wh;

import dd.d0;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.concurrent.atomic.AtomicInteger;
import vh.i0;
import vh.j0;
import vh.l0;
import vh.m0;
import vh.n0;

/* JADX INFO: loaded from: classes3.dex */
public final class g implements m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Socket f31444a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private AtomicInteger f31445b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final n0 f31446c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final l0 f31447d;

    public final class a implements l0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final OutputStream f31448a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final m f31449b;

        public a() {
            this.f31448a = g.this.c().getOutputStream();
            this.f31449b = new m(g.this.c());
        }

        @Override // vh.l0
        public void C(vh.e eVar, long j10) throws IOException {
            rd.m.e(eVar, "source");
            vh.b.b(eVar.size(), 0L, j10);
            while (j10 > 0) {
                this.f31449b.f();
                i0 i0Var = eVar.f30774a;
                rd.m.b(i0Var);
                int iMin = (int) Math.min(j10, i0Var.f30811c - i0Var.f30810b);
                m mVar = this.f31449b;
                mVar.s();
                try {
                    try {
                        this.f31448a.write(i0Var.f30809a, i0Var.f30810b, iMin);
                        d0 d0Var = d0.f10897a;
                        if (mVar.t()) {
                            throw mVar.p(null);
                        }
                        i0Var.f30810b += iMin;
                        long j11 = iMin;
                        j10 -= j11;
                        eVar.y0(eVar.size() - j11);
                        if (i0Var.f30810b == i0Var.f30811c) {
                            eVar.f30774a = i0Var.b();
                            j0.b(i0Var);
                        }
                    } catch (IOException e10) {
                        if (!mVar.t()) {
                            throw e10;
                        }
                        throw mVar.p(e10);
                    }
                } catch (Throwable th2) {
                    mVar.t();
                    throw th2;
                }
            }
        }

        @Override // vh.l0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public m i() {
            return this.f31449b;
        }

        @Override // vh.l0, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            m mVar = this.f31449b;
            g gVar = g.this;
            mVar.s();
            try {
                int iA = s.a(gVar.f31445b, 1);
                if (iA != 0) {
                    if (iA != 3) {
                        if (!gVar.c().isClosed() && !gVar.c().isOutputShutdown()) {
                            this.f31448a.flush();
                            try {
                                gVar.c().shutdownOutput();
                            } catch (UnsupportedOperationException unused) {
                                this.f31448a.close();
                            }
                        }
                        return;
                    }
                    gVar.c().close();
                    d0 d0Var = d0.f10897a;
                    if (mVar.t()) {
                        throw mVar.p(null);
                    }
                    return;
                }
                return;
            } catch (IOException e10) {
                if (!mVar.t()) {
                    throw e10;
                }
                throw mVar.p(e10);
            } finally {
                mVar.t();
            }
            mVar.t();
        }

        @Override // vh.l0, java.io.Flushable
        public void flush() throws IOException {
            m mVar = this.f31449b;
            mVar.s();
            try {
                this.f31448a.flush();
                d0 d0Var = d0.f10897a;
                if (mVar.t()) {
                    throw mVar.p(null);
                }
            } catch (IOException e10) {
                if (!mVar.t()) {
                    throw e10;
                }
                throw mVar.p(e10);
            } finally {
                mVar.t();
            }
        }

        public String toString() {
            return "sink(" + g.this.c() + ')';
        }
    }

    public final class b implements n0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final InputStream f31451a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final m f31452b;

        public b() {
            this.f31451a = g.this.c().getInputStream();
            this.f31452b = new m(g.this.c());
        }

        @Override // vh.n0
        public long N(vh.e eVar, long j10) throws IOException {
            rd.m.e(eVar, "sink");
            if (j10 == 0) {
                return 0L;
            }
            if (j10 < 0) {
                throw new IllegalArgumentException(("byteCount < 0: " + j10).toString());
            }
            this.f31452b.f();
            i0 i0VarB0 = eVar.B0(1);
            int iMin = (int) Math.min(j10, 8192 - i0VarB0.f30811c);
            try {
                m mVar = this.f31452b;
                mVar.s();
                try {
                    int i10 = this.f31451a.read(i0VarB0.f30809a, i0VarB0.f30811c, iMin);
                    if (mVar.t()) {
                        throw mVar.p(null);
                    }
                    if (i10 != -1) {
                        i0VarB0.f30811c += i10;
                        long j11 = i10;
                        eVar.y0(eVar.size() + j11);
                        return j11;
                    }
                    if (i0VarB0.f30810b != i0VarB0.f30811c) {
                        return -1L;
                    }
                    eVar.f30774a = i0VarB0.b();
                    j0.b(i0VarB0);
                    return -1L;
                } catch (IOException e10) {
                    if (mVar.t()) {
                        throw mVar.p(e10);
                    }
                    throw e10;
                } finally {
                    mVar.t();
                }
            } catch (AssertionError e11) {
                if (t.b(e11)) {
                    throw new IOException(e11);
                }
                throw e11;
            }
        }

        @Override // vh.n0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public m i() {
            return this.f31452b;
        }

        @Override // vh.n0, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            m mVar = this.f31452b;
            g gVar = g.this;
            mVar.s();
            try {
                int iA = s.a(gVar.f31445b, 2);
                if (iA != 0) {
                    if (iA == 3) {
                        gVar.c().close();
                    } else {
                        if (gVar.c().isClosed() || gVar.c().isInputShutdown()) {
                            return;
                        }
                        try {
                            gVar.c().shutdownInput();
                        } catch (UnsupportedOperationException unused) {
                            this.f31451a.close();
                        }
                    }
                    d0 d0Var = d0.f10897a;
                    if (mVar.t()) {
                        throw mVar.p(null);
                    }
                }
            } catch (IOException e10) {
                if (!mVar.t()) {
                    throw e10;
                }
                throw mVar.p(e10);
            } finally {
                mVar.t();
            }
        }

        public String toString() {
            return "source(" + g.this.c() + ')';
        }
    }

    public g(Socket socket) {
        rd.m.e(socket, "socket");
        this.f31444a = socket;
        this.f31445b = new AtomicInteger();
        this.f31446c = new b();
        this.f31447d = new a();
    }

    @Override // vh.m0
    public l0 a() {
        return this.f31447d;
    }

    public final Socket c() {
        return this.f31444a;
    }

    @Override // vh.m0
    public void cancel() throws IOException {
        this.f31444a.close();
    }

    @Override // vh.m0
    public n0 getSource() {
        return this.f31446c;
    }

    public String toString() {
        String string = this.f31444a.toString();
        rd.m.d(string, "toString(...)");
        return string;
    }
}
