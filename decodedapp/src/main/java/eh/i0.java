package eh;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes3.dex */
public abstract class i0 implements Closeable {
    public static final b Companion;
    public static final i0 EMPTY;
    private Reader reader;

    public static final class a extends Reader {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final vh.g f12460a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Charset f12461b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f12462c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Reader f12463d;

        public a(vh.g gVar, Charset charset) {
            rd.m.e(gVar, "source");
            rd.m.e(charset, "charset");
            this.f12460a = gVar;
            this.f12461b = charset;
        }

        @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            this.f12462c = true;
            Reader reader = this.f12463d;
            if (reader != null) {
                reader.close();
            } else {
                this.f12460a.close();
            }
        }

        @Override // java.io.Reader
        public int read(char[] cArr, int i10, int i11) throws IOException {
            rd.m.e(cArr, "cbuf");
            if (this.f12462c) {
                throw new IOException("Stream closed");
            }
            Reader inputStreamReader = this.f12463d;
            if (inputStreamReader == null) {
                inputStreamReader = new InputStreamReader(this.f12460a.s0(), fh.p.n(this.f12460a, this.f12461b));
                this.f12463d = inputStreamReader;
            }
            return inputStreamReader.read(cArr, i10, i11);
        }
    }

    public static final class b {

        public static final class a extends i0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ b0 f12464a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ long f12465b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ vh.g f12466c;

            a(b0 b0Var, long j10, vh.g gVar) {
                this.f12464a = b0Var;
                this.f12465b = j10;
                this.f12466c = gVar;
            }

            @Override // eh.i0
            public long contentLength() {
                return this.f12465b;
            }

            @Override // eh.i0
            public b0 contentType() {
                return this.f12464a;
            }

            @Override // eh.i0
            public vh.g source() {
                return this.f12466c;
            }
        }

        public /* synthetic */ b(rd.h hVar) {
            this();
        }

        public static /* synthetic */ i0 i(b bVar, vh.h hVar, b0 b0Var, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                b0Var = null;
            }
            return bVar.g(hVar, b0Var);
        }

        public final i0 a(b0 b0Var, long j10, vh.g gVar) {
            rd.m.e(gVar, "content");
            return f(gVar, b0Var, j10);
        }

        public final i0 b(b0 b0Var, String str) {
            rd.m.e(str, "content");
            return e(str, b0Var);
        }

        public final i0 c(b0 b0Var, vh.h hVar) {
            rd.m.e(hVar, "content");
            return g(hVar, b0Var);
        }

        public final i0 d(b0 b0Var, byte[] bArr) {
            rd.m.e(bArr, "content");
            return h(bArr, b0Var);
        }

        public final i0 e(String str, b0 b0Var) {
            rd.m.e(str, "<this>");
            dd.q qVarB = fh.b.b(b0Var);
            Charset charset = (Charset) qVarB.a();
            b0 b0Var2 = (b0) qVarB.b();
            vh.e eVarM0 = new vh.e().M0(str, charset);
            return f(eVarM0, b0Var2, eVarM0.size());
        }

        public final i0 f(vh.g gVar, b0 b0Var, long j10) {
            rd.m.e(gVar, "<this>");
            return new a(b0Var, j10, gVar);
        }

        public final i0 g(vh.h hVar, b0 b0Var) {
            rd.m.e(hVar, "<this>");
            return f(new vh.e().Z(hVar), b0Var, hVar.Q());
        }

        public final i0 h(byte[] bArr, b0 b0Var) {
            rd.m.e(bArr, "<this>");
            return f(new vh.e().write(bArr), b0Var, bArr.length);
        }

        private b() {
        }
    }

    static {
        b bVar = new b(null);
        Companion = bVar;
        EMPTY = b.i(bVar, vh.h.f30793e, null, 1, null);
    }

    private final Charset a() {
        return fh.b.a(contentType());
    }

    public static final i0 create(b0 b0Var, long j10, vh.g gVar) {
        return Companion.a(b0Var, j10, gVar);
    }

    public final InputStream byteStream() {
        return source().s0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r4v8 */
    public final vh.h byteString() throws IOException {
        long jContentLength = contentLength();
        if (jContentLength > 2147483647L) {
            throw new IOException("Cannot buffer entire body for content length: " + jContentLength);
        }
        vh.g gVarSource = source();
        vh.h th2 = null;
        try {
            vh.h hVarQ = gVarSource.Q();
            if (gVarSource != null) {
                try {
                    gVarSource.close();
                } catch (Throwable th3) {
                    th2 = th3;
                }
            }
            th = th2;
            th2 = hVarQ;
        } catch (Throwable th4) {
            th = th4;
            if (gVarSource != null) {
                try {
                    gVarSource.close();
                } catch (Throwable th5) {
                    dd.b.a(th, th5);
                }
            }
        }
        if (th != 0) {
            throw th;
        }
        int iQ = th2.Q();
        if (jContentLength == -1 || jContentLength == iQ) {
            return th2;
        }
        throw new IOException("Content-Length (" + jContentLength + ") and stream length (" + iQ + ") disagree");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r4v8 */
    public final byte[] bytes() throws IOException {
        long jContentLength = contentLength();
        if (jContentLength > 2147483647L) {
            throw new IOException("Cannot buffer entire body for content length: " + jContentLength);
        }
        vh.g gVarSource = source();
        byte[] th2 = null;
        try {
            byte[] bArrY = gVarSource.y();
            if (gVarSource != null) {
                try {
                    gVarSource.close();
                } catch (Throwable th3) {
                    th2 = th3;
                }
            }
            th = th2;
            th2 = bArrY;
        } catch (Throwable th4) {
            th = th4;
            if (gVarSource != null) {
                try {
                    gVarSource.close();
                } catch (Throwable th5) {
                    dd.b.a(th, th5);
                }
            }
        }
        if (th != 0) {
            throw th;
        }
        int length = th2.length;
        if (jContentLength == -1 || jContentLength == length) {
            return th2;
        }
        throw new IOException("Content-Length (" + jContentLength + ") and stream length (" + length + ") disagree");
    }

    public final Reader charStream() {
        Reader reader = this.reader;
        if (reader != null) {
            return reader;
        }
        a aVar = new a(source(), a());
        this.reader = aVar;
        return aVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        fh.m.f(source());
    }

    public abstract long contentLength();

    public abstract b0 contentType();

    public abstract vh.g source();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r2v5 */
    public final String string() throws IOException {
        vh.g gVarSource = source();
        String th2 = null;
        try {
            String strK = gVarSource.K(fh.p.n(gVarSource, a()));
            if (gVarSource != null) {
                try {
                    gVarSource.close();
                } catch (Throwable th3) {
                    th2 = th3;
                }
            }
            th = th2;
            th2 = strK;
        } catch (Throwable th4) {
            th = th4;
            if (gVarSource != null) {
                try {
                    gVarSource.close();
                } catch (Throwable th5) {
                    dd.b.a(th, th5);
                }
            }
        }
        if (th == 0) {
            return th2;
        }
        throw th;
    }

    public static final i0 create(b0 b0Var, String str) {
        return Companion.b(b0Var, str);
    }

    public static final i0 create(b0 b0Var, vh.h hVar) {
        return Companion.c(b0Var, hVar);
    }

    public static final i0 create(b0 b0Var, byte[] bArr) {
        return Companion.d(b0Var, bArr);
    }

    public static final i0 create(String str, b0 b0Var) {
        return Companion.e(str, b0Var);
    }

    public static final i0 create(vh.g gVar, b0 b0Var, long j10) {
        return Companion.f(gVar, b0Var, j10);
    }

    public static final i0 create(vh.h hVar, b0 b0Var) {
        return Companion.g(hVar, b0Var);
    }

    public static final i0 create(byte[] bArr, b0 b0Var) {
        return Companion.h(bArr, b0Var);
    }
}
