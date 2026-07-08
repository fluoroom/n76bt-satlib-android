package rb;

import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import rb.k;

/* JADX INFO: loaded from: classes3.dex */
final class b implements tb.c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Logger f25684d = Logger.getLogger(j.class.getName());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f25685a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final tb.c f25686b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final k f25687c = new k(Level.FINE, j.class);

    interface a {
        void d(Throwable th2);
    }

    b(a aVar, tb.c cVar) {
        this.f25685a = (a) r9.l.o(aVar, "transportExceptionHandler");
        this.f25686b = (tb.c) r9.l.o(cVar, "frameWriter");
    }

    static Level a(Throwable th2) {
        return th2.getClass().equals(IOException.class) ? Level.FINE : Level.INFO;
    }

    @Override // tb.c
    public void A() {
        try {
            this.f25686b.A();
        } catch (IOException e10) {
            this.f25685a.d(e10);
        }
    }

    @Override // tb.c
    public void I(tb.i iVar) {
        this.f25687c.j(k.a.OUTBOUND);
        try {
            this.f25686b.I(iVar);
        } catch (IOException e10) {
            this.f25685a.d(e10);
        }
    }

    @Override // tb.c
    public void a0(int i10, tb.a aVar, byte[] bArr) {
        this.f25687c.c(k.a.OUTBOUND, i10, aVar, vh.h.G(bArr));
        try {
            this.f25686b.a0(i10, aVar, bArr);
            this.f25686b.flush();
        } catch (IOException e10) {
            this.f25685a.d(e10);
        }
    }

    @Override // tb.c
    public void b(int i10, long j10) {
        this.f25687c.k(k.a.OUTBOUND, i10, j10);
        try {
            this.f25686b.b(i10, j10);
        } catch (IOException e10) {
            this.f25685a.d(e10);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        try {
            this.f25686b.close();
        } catch (IOException e10) {
            f25684d.log(a(e10), "Failed closing connection", (Throwable) e10);
        }
    }

    @Override // tb.c
    public void d(boolean z10, int i10, int i11) {
        if (z10) {
            this.f25687c.f(k.a.OUTBOUND, (4294967295L & ((long) i11)) | (((long) i10) << 32));
        } else {
            this.f25687c.e(k.a.OUTBOUND, (4294967295L & ((long) i11)) | (((long) i10) << 32));
        }
        try {
            this.f25686b.d(z10, i10, i11);
        } catch (IOException e10) {
            this.f25685a.d(e10);
        }
    }

    @Override // tb.c
    public void f(int i10, tb.a aVar) {
        this.f25687c.h(k.a.OUTBOUND, i10, aVar);
        try {
            this.f25686b.f(i10, aVar);
        } catch (IOException e10) {
            this.f25685a.d(e10);
        }
    }

    @Override // tb.c
    public void flush() {
        try {
            this.f25686b.flush();
        } catch (IOException e10) {
            this.f25685a.d(e10);
        }
    }

    @Override // tb.c
    public int i0() {
        return this.f25686b.i0();
    }

    @Override // tb.c
    public void j0(tb.i iVar) {
        this.f25687c.i(k.a.OUTBOUND, iVar);
        try {
            this.f25686b.j0(iVar);
        } catch (IOException e10) {
            this.f25685a.d(e10);
        }
    }

    @Override // tb.c
    public void k0(boolean z10, boolean z11, int i10, int i11, List list) {
        try {
            this.f25686b.k0(z10, z11, i10, i11, list);
        } catch (IOException e10) {
            this.f25685a.d(e10);
        }
    }

    @Override // tb.c
    public void m(boolean z10, int i10, vh.e eVar, int i11) {
        this.f25687c.b(k.a.OUTBOUND, i10, eVar.a(), i11, z10);
        try {
            this.f25686b.m(z10, i10, eVar, i11);
        } catch (IOException e10) {
            this.f25685a.d(e10);
        }
    }
}
