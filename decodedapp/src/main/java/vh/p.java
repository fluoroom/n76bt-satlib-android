package vh;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.Inflater;

/* JADX INFO: loaded from: classes3.dex */
public final class p implements n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private byte f30844a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final h0 f30845b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Inflater f30846c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final q f30847d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final CRC32 f30848e;

    public p(n0 n0Var) {
        rd.m.e(n0Var, "source");
        h0 h0Var = new h0(n0Var);
        this.f30845b = h0Var;
        Inflater inflater = new Inflater(true);
        this.f30846c = inflater;
        this.f30847d = new q((g) h0Var, inflater);
        this.f30848e = new CRC32();
    }

    private final void a(String str, int i10, int i11) throws IOException {
        if (i11 == i10) {
            return;
        }
        throw new IOException(str + ": actual 0x" + rg.q.n0(b.j(i11), 8, '0') + " != expected 0x" + rg.q.n0(b.j(i10), 8, '0'));
    }

    private final void c() throws IOException {
        this.f30845b.l0(10L);
        byte bG = this.f30845b.f30798b.G(3L);
        boolean z10 = ((bG >> 1) & 1) == 1;
        if (z10) {
            k(this.f30845b.f30798b, 0L, 10L);
        }
        a("ID1ID2", 8075, this.f30845b.readShort());
        this.f30845b.skip(8L);
        if (((bG >> 2) & 1) == 1) {
            this.f30845b.l0(2L);
            if (z10) {
                k(this.f30845b.f30798b, 0L, 2L);
            }
            long jB0 = this.f30845b.f30798b.b0() & 65535;
            this.f30845b.l0(jB0);
            if (z10) {
                k(this.f30845b.f30798b, 0L, jB0);
            }
            this.f30845b.skip(jB0);
        }
        if (((bG >> 3) & 1) == 1) {
            long jA = this.f30845b.a((byte) 0);
            if (jA == -1) {
                throw new EOFException();
            }
            if (z10) {
                k(this.f30845b.f30798b, 0L, jA + 1);
            }
            this.f30845b.skip(jA + 1);
        }
        if (((bG >> 4) & 1) == 1) {
            long jA2 = this.f30845b.a((byte) 0);
            if (jA2 == -1) {
                throw new EOFException();
            }
            if (z10) {
                k(this.f30845b.f30798b, 0L, jA2 + 1);
            }
            this.f30845b.skip(jA2 + 1);
        }
        if (z10) {
            a("FHCRC", this.f30845b.b0(), (short) this.f30848e.getValue());
            this.f30848e.reset();
        }
    }

    private final void e() throws IOException {
        a("CRC", this.f30845b.V(), (int) this.f30848e.getValue());
        a("ISIZE", this.f30845b.V(), (int) this.f30846c.getBytesWritten());
    }

    private final void k(e eVar, long j10, long j11) {
        i0 i0Var = eVar.f30774a;
        rd.m.b(i0Var);
        while (true) {
            int i10 = i0Var.f30811c;
            int i11 = i0Var.f30810b;
            if (j10 < i10 - i11) {
                break;
            }
            j10 -= (long) (i10 - i11);
            i0Var = i0Var.f30814f;
            rd.m.b(i0Var);
        }
        while (j11 > 0) {
            int i12 = (int) (((long) i0Var.f30810b) + j10);
            int iMin = (int) Math.min(i0Var.f30811c - i12, j11);
            this.f30848e.update(i0Var.f30809a, i12, iMin);
            j11 -= (long) iMin;
            i0Var = i0Var.f30814f;
            rd.m.b(i0Var);
            j10 = 0;
        }
    }

    @Override // vh.n0
    public long N(e eVar, long j10) throws IOException {
        p pVar;
        rd.m.e(eVar, "sink");
        if (j10 < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j10).toString());
        }
        if (j10 == 0) {
            return 0L;
        }
        if (this.f30844a == 0) {
            c();
            this.f30844a = (byte) 1;
        }
        if (this.f30844a == 1) {
            long size = eVar.size();
            long jN = this.f30847d.N(eVar, j10);
            if (jN != -1) {
                k(eVar, size, jN);
                return jN;
            }
            pVar = this;
            pVar.f30844a = (byte) 2;
        } else {
            pVar = this;
        }
        if (pVar.f30844a == 2) {
            e();
            pVar.f30844a = (byte) 3;
            if (!pVar.f30845b.z()) {
                throw new IOException("gzip finished without exhausting source");
            }
        }
        return -1L;
    }

    @Override // vh.n0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f30847d.close();
    }

    @Override // vh.n0
    public o0 i() {
        return this.f30845b.i();
    }
}
