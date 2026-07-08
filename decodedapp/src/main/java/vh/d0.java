package vh;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes3.dex */
final class d0 implements l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final OutputStream f30772a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final o0 f30773b;

    public d0(OutputStream outputStream, o0 o0Var) {
        rd.m.e(outputStream, "out");
        rd.m.e(o0Var, "timeout");
        this.f30772a = outputStream;
        this.f30773b = o0Var;
    }

    @Override // vh.l0
    public void C(e eVar, long j10) throws IOException {
        rd.m.e(eVar, "source");
        b.b(eVar.size(), 0L, j10);
        while (j10 > 0) {
            this.f30773b.f();
            i0 i0Var = eVar.f30774a;
            rd.m.b(i0Var);
            int iMin = (int) Math.min(j10, i0Var.f30811c - i0Var.f30810b);
            this.f30772a.write(i0Var.f30809a, i0Var.f30810b, iMin);
            i0Var.f30810b += iMin;
            long j11 = iMin;
            j10 -= j11;
            eVar.y0(eVar.size() - j11);
            if (i0Var.f30810b == i0Var.f30811c) {
                eVar.f30774a = i0Var.b();
                j0.b(i0Var);
            }
        }
    }

    @Override // vh.l0, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f30772a.close();
    }

    @Override // vh.l0, java.io.Flushable
    public void flush() throws IOException {
        this.f30772a.flush();
    }

    @Override // vh.l0
    public o0 i() {
        return this.f30773b;
    }

    public String toString() {
        return "sink(" + this.f30772a + ')';
    }
}
