package io.grpc.internal;

import io.grpc.internal.z2;
import java.io.Closeable;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Locale;
import java.util.zip.DataFormatException;
import qb.l;

/* JADX INFO: loaded from: classes3.dex */
public class r1 implements Closeable, a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private b f17075a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f17076b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final x2 f17077c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final f3 f17078d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private qb.v f17079e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private x0 f17080f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private byte[] f17081g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f17082h;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f17085t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private v f17086u;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private long f17088w;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private int f17091z;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private e f17083r = e.HEADER;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f17084s = 5;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private v f17087v = new v();

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private boolean f17089x = false;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private int f17090y = -1;
    private boolean A = false;
    private volatile boolean B = false;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f17092a;

        static {
            int[] iArr = new int[e.values().length];
            f17092a = iArr;
            try {
                iArr[e.HEADER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17092a[e.BODY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public interface b {
        void a(z2.a aVar);

        void c(boolean z10);

        void d(int i10);

        void e(Throwable th2);
    }

    private static class c implements z2.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private InputStream f17093a;

        /* synthetic */ c(InputStream inputStream, a aVar) {
            this(inputStream);
        }

        @Override // io.grpc.internal.z2.a
        public InputStream next() {
            InputStream inputStream = this.f17093a;
            this.f17093a = null;
            return inputStream;
        }

        private c(InputStream inputStream) {
            this.f17093a = inputStream;
        }
    }

    private enum e {
        HEADER,
        BODY
    }

    public r1(b bVar, qb.v vVar, int i10, x2 x2Var, f3 f3Var) {
        this.f17075a = (b) r9.l.o(bVar, "sink");
        this.f17079e = (qb.v) r9.l.o(vVar, "decompressor");
        this.f17076b = i10;
        this.f17077c = (x2) r9.l.o(x2Var, "statsTraceCtx");
        this.f17078d = (f3) r9.l.o(f3Var, "transportTracer");
    }

    private boolean G() throws Throwable {
        int iW;
        int i10 = 0;
        try {
            if (this.f17086u == null) {
                this.f17086u = new v();
            }
            int iV = 0;
            iW = 0;
            while (true) {
                try {
                    int iG = this.f17084s - this.f17086u.g();
                    if (iG <= 0) {
                        if (iV > 0) {
                            this.f17075a.d(iV);
                            if (this.f17083r == e.BODY) {
                                if (this.f17080f != null) {
                                    this.f17077c.g(iW);
                                    this.f17091z += iW;
                                    return true;
                                }
                                this.f17077c.g(iV);
                                this.f17091z += iV;
                            }
                        }
                        return true;
                    }
                    if (this.f17080f != null) {
                        try {
                            byte[] bArr = this.f17081g;
                            if (bArr == null || this.f17082h == bArr.length) {
                                this.f17081g = new byte[Math.min(iG, 2097152)];
                                this.f17082h = 0;
                            }
                            int iH = this.f17080f.H(this.f17081g, this.f17082h, Math.min(iG, this.f17081g.length - this.f17082h));
                            iV += this.f17080f.v();
                            iW += this.f17080f.w();
                            if (iH == 0) {
                                if (iV > 0) {
                                    this.f17075a.d(iV);
                                    if (this.f17083r == e.BODY) {
                                        if (this.f17080f != null) {
                                            this.f17077c.g(iW);
                                            this.f17091z += iW;
                                            return false;
                                        }
                                        this.f17077c.g(iV);
                                        this.f17091z += iV;
                                    }
                                }
                                return false;
                            }
                            this.f17086u.e(j2.f(this.f17081g, this.f17082h, iH));
                            this.f17082h += iH;
                        } catch (IOException e10) {
                            throw new RuntimeException(e10);
                        } catch (DataFormatException e11) {
                            throw new RuntimeException(e11);
                        }
                    } else {
                        if (this.f17087v.g() == 0) {
                            if (iV > 0) {
                                this.f17075a.d(iV);
                                if (this.f17083r == e.BODY) {
                                    if (this.f17080f != null) {
                                        this.f17077c.g(iW);
                                        this.f17091z += iW;
                                        return false;
                                    }
                                    this.f17077c.g(iV);
                                    this.f17091z += iV;
                                }
                            }
                            return false;
                        }
                        int iMin = Math.min(iG, this.f17087v.g());
                        iV += iMin;
                        this.f17086u.e(this.f17087v.u(iMin));
                    }
                } catch (Throwable th2) {
                    int i11 = iV;
                    th = th2;
                    i10 = i11;
                    if (i10 > 0) {
                        this.f17075a.d(i10);
                        if (this.f17083r == e.BODY) {
                            if (this.f17080f != null) {
                                this.f17077c.g(iW);
                                this.f17091z += iW;
                            } else {
                                this.f17077c.g(i10);
                                this.f17091z += i10;
                            }
                        }
                    }
                    throw th;
                }
            }
        } catch (Throwable th3) {
            th = th3;
            iW = 0;
        }
    }

    private void a() {
        if (this.f17089x) {
            return;
        }
        this.f17089x = true;
        while (!this.B && this.f17088w > 0 && G()) {
            try {
                int i10 = a.f17092a[this.f17083r.ordinal()];
                if (i10 == 1) {
                    x();
                } else {
                    if (i10 != 2) {
                        throw new AssertionError("Invalid state: " + this.f17083r);
                    }
                    w();
                    this.f17088w--;
                }
            } catch (Throwable th2) {
                this.f17089x = false;
                throw th2;
            }
        }
        if (this.B) {
            close();
            this.f17089x = false;
        } else {
            if (this.A && v()) {
                close();
            }
            this.f17089x = false;
        }
    }

    private InputStream c() {
        qb.v vVar = this.f17079e;
        if (vVar == l.b.f24679a) {
            throw qb.u1.f24783s.s("Can't decode compressed gRPC message as compression not configured").e();
        }
        try {
            return new d(vVar.b(j2.c(this.f17086u, true)), this.f17076b, this.f17077c);
        } catch (IOException e10) {
            throw new RuntimeException(e10);
        }
    }

    private InputStream r() {
        this.f17077c.f(this.f17086u.g());
        return j2.c(this.f17086u, true);
    }

    private boolean s() {
        return isClosed() || this.A;
    }

    private boolean v() {
        x0 x0Var = this.f17080f;
        return x0Var != null ? x0Var.T() : this.f17087v.g() == 0;
    }

    private void w() {
        x2 x2Var = this.f17077c;
        int i10 = this.f17090y;
        int i11 = this.f17091z;
        x2Var.e(i10, i11, (this.f17085t || this.f17080f != null) ? -1L : i11);
        this.f17091z = 0;
        InputStream inputStreamC = this.f17085t ? c() : r();
        this.f17086u.c();
        this.f17086u = null;
        this.f17075a.a(new c(inputStreamC, null));
        this.f17083r = e.HEADER;
        this.f17084s = 5;
    }

    private void x() {
        int unsignedByte = this.f17086u.readUnsignedByte();
        if ((unsignedByte & 254) != 0) {
            throw qb.u1.f24783s.s("gRPC frame header malformed: reserved bits not zero").e();
        }
        this.f17085t = (unsignedByte & 1) != 0;
        int i10 = this.f17086u.readInt();
        this.f17084s = i10;
        if (i10 < 0 || i10 > this.f17076b) {
            throw qb.u1.f24778n.s(String.format(Locale.US, "gRPC message exceeds maximum size %d: %d", Integer.valueOf(this.f17076b), Integer.valueOf(this.f17084s))).e();
        }
        int i11 = this.f17090y + 1;
        this.f17090y = i11;
        this.f17077c.d(i11);
        this.f17078d.d();
        this.f17083r = e.BODY;
    }

    public void H(x0 x0Var) {
        r9.l.u(this.f17079e == l.b.f24679a, "per-message decompressor already set");
        r9.l.u(this.f17080f == null, "full stream decompressor already set");
        this.f17080f = (x0) r9.l.o(x0Var, "Can't pass a null full stream decompressor");
        this.f17087v = null;
    }

    void S(b bVar) {
        this.f17075a = bVar;
    }

    void T() {
        this.B = true;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, io.grpc.internal.a0
    public void close() {
        if (isClosed()) {
            return;
        }
        v vVar = this.f17086u;
        boolean z10 = vVar != null && vVar.g() > 0;
        try {
            x0 x0Var = this.f17080f;
            if (x0Var != null) {
                boolean z11 = z10 || x0Var.x();
                this.f17080f.close();
                z10 = z11;
            }
            v vVar2 = this.f17087v;
            if (vVar2 != null) {
                vVar2.close();
            }
            v vVar3 = this.f17086u;
            if (vVar3 != null) {
                vVar3.close();
            }
            this.f17080f = null;
            this.f17087v = null;
            this.f17086u = null;
            this.f17075a.c(z10);
        } catch (Throwable th2) {
            this.f17080f = null;
            this.f17087v = null;
            this.f17086u = null;
            throw th2;
        }
    }

    @Override // io.grpc.internal.a0
    public void e(int i10) {
        r9.l.e(i10 > 0, "numMessages must be > 0");
        if (isClosed()) {
            return;
        }
        this.f17088w += (long) i10;
        a();
    }

    public boolean isClosed() {
        return this.f17087v == null && this.f17080f == null;
    }

    @Override // io.grpc.internal.a0
    public void k(int i10) {
        this.f17076b = i10;
    }

    @Override // io.grpc.internal.a0
    public void l() {
        if (isClosed()) {
            return;
        }
        if (v()) {
            close();
        } else {
            this.A = true;
        }
    }

    @Override // io.grpc.internal.a0
    public void n(qb.v vVar) {
        r9.l.u(this.f17080f == null, "Already set full stream decompressor");
        this.f17079e = (qb.v) r9.l.o(vVar, "Can't pass an empty decompressor");
    }

    @Override // io.grpc.internal.a0
    public void q(i2 i2Var) throws Throwable {
        r9.l.o(i2Var, "data");
        boolean z10 = true;
        try {
            if (s()) {
                i2Var.close();
                return;
            }
            x0 x0Var = this.f17080f;
            if (x0Var != null) {
                x0Var.r(i2Var);
            } else {
                this.f17087v.e(i2Var);
            }
            try {
                a();
            } catch (Throwable th2) {
                th = th2;
                z10 = false;
                if (z10) {
                    i2Var.close();
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    static final class d extends FilterInputStream {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f17094a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final x2 f17095b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private long f17096c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private long f17097d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private long f17098e;

        d(InputStream inputStream, int i10, x2 x2Var) {
            super(inputStream);
            this.f17098e = -1L;
            this.f17094a = i10;
            this.f17095b = x2Var;
        }

        private void a() {
            long j10 = this.f17097d;
            long j11 = this.f17096c;
            if (j10 > j11) {
                this.f17095b.f(j10 - j11);
                this.f17096c = this.f17097d;
            }
        }

        private void c() {
            if (this.f17097d <= this.f17094a) {
                return;
            }
            throw qb.u1.f24778n.s("Decompressed gRPC message exceeds maximum size " + this.f17094a).e();
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public synchronized void mark(int i10) {
            ((FilterInputStream) this).in.mark(i10);
            this.f17098e = this.f17097d;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read() throws IOException {
            int i10 = ((FilterInputStream) this).in.read();
            if (i10 != -1) {
                this.f17097d++;
            }
            c();
            a();
            return i10;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public synchronized void reset() {
            if (!((FilterInputStream) this).in.markSupported()) {
                throw new IOException("Mark not supported");
            }
            if (this.f17098e == -1) {
                throw new IOException("Mark not set");
            }
            ((FilterInputStream) this).in.reset();
            this.f17097d = this.f17098e;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public long skip(long j10) throws IOException {
            long jSkip = ((FilterInputStream) this).in.skip(j10);
            this.f17097d += jSkip;
            c();
            a();
            return jSkip;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read(byte[] bArr, int i10, int i11) throws IOException {
            int i12 = ((FilterInputStream) this).in.read(bArr, i10, i11);
            if (i12 != -1) {
                this.f17097d += (long) i12;
            }
            c();
            a();
            return i12;
        }
    }
}
