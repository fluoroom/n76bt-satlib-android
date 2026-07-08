package vh;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes3.dex */
class r implements n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InputStream f30859a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final o0 f30860b;

    public r(InputStream inputStream, o0 o0Var) {
        rd.m.e(inputStream, "input");
        rd.m.e(o0Var, "timeout");
        this.f30859a = inputStream;
        this.f30860b = o0Var;
    }

    @Override // vh.n0
    public long N(e eVar, long j10) throws IOException {
        rd.m.e(eVar, "sink");
        if (j10 == 0) {
            return 0L;
        }
        if (j10 < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j10).toString());
        }
        try {
            this.f30860b.f();
            i0 i0VarB0 = eVar.B0(1);
            int i10 = this.f30859a.read(i0VarB0.f30809a, i0VarB0.f30811c, (int) Math.min(j10, 8192 - i0VarB0.f30811c));
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
        } catch (AssertionError e10) {
            if (wh.t.b(e10)) {
                throw new IOException(e10);
            }
            throw e10;
        }
    }

    @Override // vh.n0, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f30859a.close();
    }

    @Override // vh.n0
    public o0 i() {
        return this.f30860b;
    }

    public String toString() {
        return "source(" + this.f30859a + ')';
    }
}
