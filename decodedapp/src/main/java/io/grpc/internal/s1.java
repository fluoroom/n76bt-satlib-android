package io.grpc.internal;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import qb.l;

/* JADX INFO: loaded from: classes3.dex */
public class s1 implements u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d f17111a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private g3 f17113c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f17114d;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final h3 f17119i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final x2 f17120j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f17121k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f17122l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f17124n;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f17112b = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private qb.n f17115e = l.b.f24679a;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f17116f = true;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final c f17117g = new c();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final ByteBuffer f17118h = ByteBuffer.allocate(5);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f17123m = -1;

    public interface d {
        void g(g3 g3Var, boolean z10, boolean z11, int i10);
    }

    public s1(d dVar, h3 h3Var, x2 x2Var) {
        this.f17111a = (d) r9.l.o(dVar, "sink");
        this.f17119i = (h3) r9.l.o(h3Var, "bufferAllocator");
        this.f17120j = (x2) r9.l.o(x2Var, "statsTraceCtx");
    }

    private void e(boolean z10, boolean z11) {
        g3 g3Var = this.f17113c;
        this.f17113c = null;
        this.f17111a.g(g3Var, z10, z11, this.f17122l);
        this.f17122l = 0;
    }

    private int f(InputStream inputStream) {
        if ((inputStream instanceof qb.p0) || (inputStream instanceof ByteArrayInputStream)) {
            return inputStream.available();
        }
        return -1;
    }

    private void g() {
        g3 g3Var = this.f17113c;
        if (g3Var != null) {
            g3Var.a();
            this.f17113c = null;
        }
    }

    private void i() {
        if (isClosed()) {
            throw new IllegalStateException("Framer already closed");
        }
    }

    private void j(b bVar, boolean z10) {
        int iG = bVar.g();
        int i10 = this.f17112b;
        if (i10 >= 0 && iG > i10) {
            throw qb.u1.f24778n.s(String.format(Locale.US, "message too large %d > %d", Integer.valueOf(iG), Integer.valueOf(this.f17112b))).e();
        }
        this.f17118h.clear();
        this.f17118h.put(z10 ? (byte) 1 : (byte) 0).putInt(iG);
        g3 g3VarA = this.f17119i.a(5);
        g3VarA.write(this.f17118h.array(), 0, this.f17118h.position());
        if (iG == 0) {
            this.f17113c = g3VarA;
            return;
        }
        this.f17111a.g(g3VarA, false, false, this.f17122l - 1);
        this.f17122l = 1;
        List list = bVar.f17125a;
        for (int i11 = 0; i11 < list.size() - 1; i11++) {
            this.f17111a.g((g3) list.get(i11), false, false, 0);
        }
        this.f17113c = (g3) list.get(list.size() - 1);
        this.f17124n = iG;
    }

    private int k(InputStream inputStream, int i10) throws IOException {
        b bVar = new b();
        OutputStream outputStreamC = this.f17115e.c(bVar);
        try {
            int iO = o(inputStream, outputStreamC);
            outputStreamC.close();
            int i11 = this.f17112b;
            if (i11 >= 0 && iO > i11) {
                throw qb.u1.f24778n.s(String.format(Locale.US, "message too large %d > %d", Integer.valueOf(iO), Integer.valueOf(this.f17112b))).e();
            }
            j(bVar, true);
            return iO;
        } catch (Throwable th2) {
            outputStreamC.close();
            throw th2;
        }
    }

    private int m(InputStream inputStream, int i10) {
        int i11 = this.f17112b;
        if (i11 >= 0 && i10 > i11) {
            throw qb.u1.f24778n.s(String.format(Locale.US, "message too large %d > %d", Integer.valueOf(i10), Integer.valueOf(this.f17112b))).e();
        }
        this.f17118h.clear();
        this.f17118h.put((byte) 0).putInt(i10);
        this.f17114d = i10 + 5;
        n(this.f17118h.array(), 0, this.f17118h.position());
        return o(inputStream, this.f17117g);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n(byte[] bArr, int i10, int i11) {
        while (i11 > 0) {
            g3 g3Var = this.f17113c;
            if (g3Var != null && g3Var.b() == 0) {
                e(false, false);
            }
            if (this.f17113c == null) {
                r9.l.u(this.f17114d > 0, "knownLengthPendingAllocation reached 0");
                g3 g3VarA = this.f17119i.a(this.f17114d);
                this.f17113c = g3VarA;
                int i12 = this.f17114d;
                this.f17114d = i12 - Math.min(i12, g3VarA.b());
            }
            int iMin = Math.min(i11, this.f17113c.b());
            this.f17113c.write(bArr, i10, iMin);
            i10 += iMin;
            i11 -= iMin;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static int o(InputStream inputStream, OutputStream outputStream) throws IOException {
        if (inputStream instanceof qb.x) {
            return ((qb.x) inputStream).a(outputStream);
        }
        long jB = t9.b.b(inputStream, outputStream);
        r9.l.i(jB <= 2147483647L, "Message size overflow: %s", jB);
        return (int) jB;
    }

    private int p(InputStream inputStream, int i10) throws IOException {
        if (i10 != -1) {
            this.f17124n = i10;
            return m(inputStream, i10);
        }
        b bVar = new b();
        int iO = o(inputStream, bVar);
        j(bVar, false);
        return iO;
    }

    @Override // io.grpc.internal.u0
    public void close() {
        if (isClosed()) {
            return;
        }
        this.f17121k = true;
        g3 g3Var = this.f17113c;
        if (g3Var != null && g3Var.g() == 0) {
            g();
        }
        e(true, true);
    }

    @Override // io.grpc.internal.u0
    public void d(InputStream inputStream) {
        i();
        this.f17122l++;
        int i10 = this.f17123m + 1;
        this.f17123m = i10;
        this.f17124n = 0L;
        this.f17120j.i(i10);
        boolean z10 = this.f17116f && this.f17115e != l.b.f24679a;
        try {
            int iF = f(inputStream);
            int iP = (iF == 0 || !z10) ? p(inputStream, iF) : k(inputStream, iF);
            if (iF != -1 && iP != iF) {
                throw qb.u1.f24783s.s(String.format("Message length inaccurate %s != %s", Integer.valueOf(iP), Integer.valueOf(iF))).e();
            }
            long j10 = iP;
            this.f17120j.k(j10);
            this.f17120j.l(this.f17124n);
            this.f17120j.j(this.f17123m, this.f17124n, j10);
        } catch (IOException e10) {
            throw qb.u1.f24783s.s("Failed to frame message").r(e10).e();
        } catch (qb.x1 e11) {
            throw e11;
        } catch (RuntimeException e12) {
            throw qb.u1.f24783s.s("Failed to frame message").r(e12).e();
        }
    }

    @Override // io.grpc.internal.u0
    public void flush() {
        g3 g3Var = this.f17113c;
        if (g3Var == null || g3Var.g() <= 0) {
            return;
        }
        e(false, true);
    }

    @Override // io.grpc.internal.u0
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public s1 c(qb.n nVar) {
        this.f17115e = (qb.n) r9.l.o(nVar, "Can't pass an empty compressor");
        return this;
    }

    @Override // io.grpc.internal.u0
    public boolean isClosed() {
        return this.f17121k;
    }

    @Override // io.grpc.internal.u0
    public void l(int i10) {
        r9.l.u(this.f17112b == -1, "max size already set");
        this.f17112b = i10;
    }

    private class c extends OutputStream {
        private c() {
        }

        @Override // java.io.OutputStream
        public void write(int i10) {
            write(new byte[]{(byte) i10}, 0, 1);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr, int i10, int i11) {
            s1.this.n(bArr, i10, i11);
        }
    }

    private final class b extends OutputStream {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List f17125a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private g3 f17126b;

        private b() {
            this.f17125a = new ArrayList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public int g() {
            Iterator it = this.f17125a.iterator();
            int iG = 0;
            while (it.hasNext()) {
                iG += ((g3) it.next()).g();
            }
            return iG;
        }

        @Override // java.io.OutputStream
        public void write(int i10) {
            g3 g3Var = this.f17126b;
            if (g3Var == null || g3Var.b() <= 0) {
                write(new byte[]{(byte) i10}, 0, 1);
            } else {
                this.f17126b.c((byte) i10);
            }
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr, int i10, int i11) {
            if (this.f17126b == null) {
                g3 g3VarA = s1.this.f17119i.a(Math.max(4096, i11));
                this.f17126b = g3VarA;
                this.f17125a.add(g3VarA);
            }
            while (i11 > 0) {
                int iMin = Math.min(i11, this.f17126b.b());
                if (iMin == 0) {
                    g3 g3VarA2 = s1.this.f17119i.a(Math.max(i11, this.f17126b.g() * 2));
                    this.f17126b = g3VarA2;
                    this.f17125a.add(g3VarA2);
                } else {
                    this.f17126b.write(bArr, i10, iMin);
                    i10 += iMin;
                    i11 -= iMin;
                }
            }
        }
    }
}
