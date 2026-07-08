package vh;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* JADX INFO: loaded from: classes3.dex */
public final class q implements n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g f30849a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Inflater f30850b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f30851c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f30852d;

    public q(g gVar, Inflater inflater) {
        rd.m.e(gVar, "source");
        rd.m.e(inflater, "inflater");
        this.f30849a = gVar;
        this.f30850b = inflater;
    }

    private final void e() {
        int i10 = this.f30851c;
        if (i10 == 0) {
            return;
        }
        int remaining = i10 - this.f30850b.getRemaining();
        this.f30851c -= remaining;
        this.f30849a.skip(remaining);
    }

    @Override // vh.n0
    public long N(e eVar, long j10) throws IOException {
        rd.m.e(eVar, "sink");
        do {
            long jA = a(eVar, j10);
            if (jA > 0) {
                return jA;
            }
            if (this.f30850b.finished() || this.f30850b.needsDictionary()) {
                return -1L;
            }
        } while (!this.f30849a.z());
        throw new EOFException("source exhausted prematurely");
    }

    public final long a(e eVar, long j10) throws IOException {
        rd.m.e(eVar, "sink");
        if (j10 < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j10).toString());
        }
        if (this.f30852d) {
            throw new IllegalStateException("closed");
        }
        if (j10 == 0) {
            return 0L;
        }
        try {
            i0 i0VarB0 = eVar.B0(1);
            int iMin = (int) Math.min(j10, 8192 - i0VarB0.f30811c);
            c();
            int iInflate = this.f30850b.inflate(i0VarB0.f30809a, i0VarB0.f30811c, iMin);
            e();
            if (iInflate > 0) {
                i0VarB0.f30811c += iInflate;
                long j11 = iInflate;
                eVar.y0(eVar.size() + j11);
                return j11;
            }
            if (i0VarB0.f30810b == i0VarB0.f30811c) {
                eVar.f30774a = i0VarB0.b();
                j0.b(i0VarB0);
            }
            return 0L;
        } catch (DataFormatException e10) {
            throw new IOException(e10);
        }
    }

    public final boolean c() {
        if (!this.f30850b.needsInput()) {
            return false;
        }
        if (this.f30849a.z()) {
            return true;
        }
        i0 i0Var = this.f30849a.h().f30774a;
        rd.m.b(i0Var);
        int i10 = i0Var.f30811c;
        int i11 = i0Var.f30810b;
        int i12 = i10 - i11;
        this.f30851c = i12;
        this.f30850b.setInput(i0Var.f30809a, i11, i12);
        return false;
    }

    @Override // vh.n0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f30852d) {
            return;
        }
        this.f30850b.end();
        this.f30852d = true;
        this.f30849a.close();
    }

    @Override // vh.n0
    public o0 i() {
        return this.f30849a.i();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public q(n0 n0Var, Inflater inflater) {
        this(z.c(n0Var), inflater);
        rd.m.e(n0Var, "source");
        rd.m.e(inflater, "inflater");
    }
}
