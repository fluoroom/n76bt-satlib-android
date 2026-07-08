package rb;

import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
abstract class c implements tb.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final tb.c f25688a;

    public c(tb.c cVar) {
        this.f25688a = (tb.c) r9.l.o(cVar, "delegate");
    }

    @Override // tb.c
    public void A() {
        this.f25688a.A();
    }

    @Override // tb.c
    public void I(tb.i iVar) {
        this.f25688a.I(iVar);
    }

    @Override // tb.c
    public void a0(int i10, tb.a aVar, byte[] bArr) {
        this.f25688a.a0(i10, aVar, bArr);
    }

    @Override // tb.c
    public void b(int i10, long j10) {
        this.f25688a.b(i10, j10);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f25688a.close();
    }

    @Override // tb.c
    public void d(boolean z10, int i10, int i11) {
        this.f25688a.d(z10, i10, i11);
    }

    @Override // tb.c
    public void f(int i10, tb.a aVar) {
        this.f25688a.f(i10, aVar);
    }

    @Override // tb.c
    public void flush() {
        this.f25688a.flush();
    }

    @Override // tb.c
    public int i0() {
        return this.f25688a.i0();
    }

    @Override // tb.c
    public void j0(tb.i iVar) {
        this.f25688a.j0(iVar);
    }

    @Override // tb.c
    public void k0(boolean z10, boolean z11, int i10, int i11, List list) {
        this.f25688a.k0(z10, z11, i10, i11, list);
    }

    @Override // tb.c
    public void m(boolean z10, int i10, vh.e eVar, int i11) {
        this.f25688a.m(z10, i10, eVar, i11);
    }
}
