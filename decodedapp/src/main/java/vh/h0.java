package vh;

import androidx.appcompat.widget.ActivityChooserView;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes3.dex */
public final class h0 implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n0 f30797a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f30798b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f30799c;

    public h0(n0 n0Var) {
        rd.m.e(n0Var, "source");
        this.f30797a = n0Var;
        this.f30798b = new e();
    }

    @Override // vh.g
    public long B(l0 l0Var) {
        rd.m.e(l0Var, "sink");
        long j10 = 0;
        while (this.f30797a.N(this.f30798b, 8192L) != -1) {
            long jR = this.f30798b.r();
            if (jR > 0) {
                j10 += jR;
                l0Var.C(this.f30798b, jR);
            }
        }
        if (this.f30798b.size() <= 0) {
            return j10;
        }
        long size = j10 + this.f30798b.size();
        e eVar = this.f30798b;
        l0Var.C(eVar, eVar.size());
        return size;
    }

    @Override // vh.g
    public long E() throws EOFException {
        byte bG;
        l0(1L);
        long j10 = 0;
        while (true) {
            long j11 = j10 + 1;
            if (!e(j11)) {
                break;
            }
            bG = this.f30798b.G(j10);
            if ((bG < 48 || bG > 57) && !(j10 == 0 && bG == 45)) {
                break;
            }
            j10 = j11;
        }
        if (j10 == 0) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Expected a digit or '-' but was 0x");
            String string = Integer.toString(bG, rg.a.a(16));
            rd.m.d(string, "toString(...)");
            sb2.append(string);
            throw new NumberFormatException(sb2.toString());
        }
        return this.f30798b.E();
    }

    @Override // vh.g
    public String F(long j10) throws EOFException {
        if (j10 < 0) {
            throw new IllegalArgumentException(("limit < 0: " + j10).toString());
        }
        long j11 = j10 == Long.MAX_VALUE ? Long.MAX_VALUE : j10 + 1;
        long jC = c((byte) 10, 0L, j11);
        if (jC != -1) {
            return wh.a.f(this.f30798b, jC);
        }
        if (j11 < Long.MAX_VALUE && e(j11) && this.f30798b.G(j11 - 1) == 13 && e(1 + j11) && this.f30798b.G(j11) == 10) {
            return wh.a.f(this.f30798b, j11);
        }
        e eVar = new e();
        e eVar2 = this.f30798b;
        eVar2.w(eVar, 0L, Math.min(32, eVar2.size()));
        throw new EOFException("\\n not found: limit=" + Math.min(this.f30798b.size(), j10) + " content=" + eVar.Q().n() + (char) 8230);
    }

    @Override // vh.g
    public String K(Charset charset) {
        rd.m.e(charset, "charset");
        this.f30798b.F0(this.f30797a);
        return this.f30798b.K(charset);
    }

    @Override // vh.n0
    public long N(e eVar, long j10) {
        rd.m.e(eVar, "sink");
        if (j10 < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j10).toString());
        }
        if (this.f30799c) {
            throw new IllegalStateException("closed");
        }
        if (this.f30798b.size() == 0) {
            if (j10 == 0) {
                return 0L;
            }
            if (this.f30797a.N(this.f30798b, 8192L) == -1) {
                return -1L;
            }
        }
        return this.f30798b.N(eVar, Math.min(j10, this.f30798b.size()));
    }

    @Override // vh.g
    public h Q() {
        this.f30798b.F0(this.f30797a);
        return this.f30798b.Q();
    }

    @Override // vh.g
    public String U() {
        return F(Long.MAX_VALUE);
    }

    @Override // vh.g
    public int V() throws EOFException {
        l0(4L);
        return this.f30798b.V();
    }

    @Override // vh.g
    public byte[] Y(long j10) throws EOFException {
        l0(j10);
        return this.f30798b.Y(j10);
    }

    public long a(byte b10) {
        return c(b10, 0L, Long.MAX_VALUE);
    }

    @Override // vh.g
    public short b0() throws EOFException {
        l0(2L);
        return this.f30798b.b0();
    }

    public long c(byte b10, long j10, long j11) {
        if (this.f30799c) {
            throw new IllegalStateException("closed");
        }
        if (0 > j10 || j10 > j11) {
            throw new IllegalArgumentException(("fromIndex=" + j10 + " toIndex=" + j11).toString());
        }
        long jMax = j10;
        while (jMax < j11) {
            byte b11 = b10;
            long j12 = j11;
            long jH = this.f30798b.H(b11, jMax, j12);
            if (jH != -1) {
                return jH;
            }
            long size = this.f30798b.size();
            if (size >= j12 || this.f30797a.N(this.f30798b, 8192L) == -1) {
                break;
            }
            jMax = Math.max(jMax, size);
            b10 = b11;
            j11 = j12;
        }
        return -1L;
    }

    @Override // vh.n0, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws EOFException {
        if (this.f30799c) {
            return;
        }
        this.f30799c = true;
        this.f30797a.close();
        this.f30798b.k();
    }

    @Override // vh.g
    public long d0() throws EOFException {
        l0(8L);
        return this.f30798b.d0();
    }

    public boolean e(long j10) {
        if (j10 < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j10).toString());
        }
        if (this.f30799c) {
            throw new IllegalStateException("closed");
        }
        while (this.f30798b.size() < j10) {
            if (this.f30797a.N(this.f30798b, 8192L) == -1) {
                return false;
            }
        }
        return true;
    }

    @Override // vh.g, vh.f
    public e h() {
        return this.f30798b;
    }

    @Override // vh.n0
    public o0 i() {
        return this.f30797a.i();
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return !this.f30799c;
    }

    @Override // vh.g
    public void l0(long j10) throws EOFException {
        if (!e(j10)) {
            throw new EOFException();
        }
    }

    @Override // vh.g
    public String o(long j10) throws EOFException {
        l0(j10);
        return this.f30798b.o(j10);
    }

    @Override // vh.g
    public int o0(c0 c0Var) throws EOFException {
        rd.m.e(c0Var, "options");
        if (this.f30799c) {
            throw new IllegalStateException("closed");
        }
        do {
            int iG = wh.a.g(this.f30798b, c0Var, true);
            if (iG != -2) {
                if (iG == -1) {
                    return -1;
                }
                this.f30798b.skip(c0Var.g()[iG].Q());
                return iG;
            }
        } while (this.f30797a.N(this.f30798b, 8192L) != -1);
        return -1;
    }

    @Override // vh.g
    public h p(long j10) throws EOFException {
        l0(j10);
        return this.f30798b.p(j10);
    }

    @Override // vh.g
    public long q0() throws EOFException {
        byte bG;
        l0(1L);
        int i10 = 0;
        while (true) {
            int i11 = i10 + 1;
            if (!e(i11)) {
                break;
            }
            bG = this.f30798b.G(i10);
            if ((bG < 48 || bG > 57) && ((bG < 97 || bG > 102) && (bG < 65 || bG > 70))) {
                break;
            }
            i10 = i11;
        }
        if (i10 == 0) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Expected leading [0-9a-fA-F] character but was 0x");
            String string = Integer.toString(bG, rg.a.a(16));
            rd.m.d(string, "toString(...)");
            sb2.append(string);
            throw new NumberFormatException(sb2.toString());
        }
        return this.f30798b.q0();
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer byteBuffer) {
        rd.m.e(byteBuffer, "sink");
        if (this.f30798b.size() == 0 && this.f30797a.N(this.f30798b, 8192L) == -1) {
            return -1;
        }
        return this.f30798b.read(byteBuffer);
    }

    @Override // vh.g
    public byte readByte() throws EOFException {
        l0(1L);
        return this.f30798b.readByte();
    }

    @Override // vh.g
    public int readInt() throws EOFException {
        l0(4L);
        return this.f30798b.readInt();
    }

    @Override // vh.g
    public short readShort() throws EOFException {
        l0(2L);
        return this.f30798b.readShort();
    }

    @Override // vh.g
    public InputStream s0() {
        return new a();
    }

    @Override // vh.g
    public void skip(long j10) throws EOFException {
        if (this.f30799c) {
            throw new IllegalStateException("closed");
        }
        while (j10 > 0) {
            if (this.f30798b.size() == 0 && this.f30797a.N(this.f30798b, 8192L) == -1) {
                throw new EOFException();
            }
            long jMin = Math.min(j10, this.f30798b.size());
            this.f30798b.skip(jMin);
            j10 -= jMin;
        }
    }

    public String toString() {
        return "buffer(" + this.f30797a + ')';
    }

    @Override // vh.g
    public byte[] y() {
        this.f30798b.F0(this.f30797a);
        return this.f30798b.y();
    }

    @Override // vh.g
    public boolean z() {
        if (this.f30799c) {
            throw new IllegalStateException("closed");
        }
        return this.f30798b.z() && this.f30797a.N(this.f30798b, 8192L) == -1;
    }

    public static final class a extends InputStream {
        a() {
        }

        @Override // java.io.InputStream
        public int available() throws IOException {
            h0 h0Var = h0.this;
            if (h0Var.f30799c) {
                throw new IOException("closed");
            }
            return (int) Math.min(h0Var.f30798b.size(), ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED);
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws EOFException {
            h0.this.close();
        }

        @Override // java.io.InputStream
        public int read() throws IOException {
            h0 h0Var = h0.this;
            if (h0Var.f30799c) {
                throw new IOException("closed");
            }
            if (h0Var.f30798b.size() == 0) {
                h0 h0Var2 = h0.this;
                if (h0Var2.f30797a.N(h0Var2.f30798b, 8192L) == -1) {
                    return -1;
                }
            }
            return h0.this.f30798b.readByte() & MessagePack.Code.EXT_TIMESTAMP;
        }

        public String toString() {
            return h0.this + ".inputStream()";
        }

        @Override // java.io.InputStream
        public long transferTo(OutputStream outputStream) throws IOException {
            rd.m.e(outputStream, "out");
            if (h0.this.f30799c) {
                throw new IOException("closed");
            }
            long size = 0;
            while (true) {
                if (h0.this.f30798b.size() == 0) {
                    h0 h0Var = h0.this;
                    if (h0Var.f30797a.N(h0Var.f30798b, 8192L) == -1) {
                        return size;
                    }
                }
                size += h0.this.f30798b.size();
                e.O0(h0.this.f30798b, outputStream, 0L, 2, null);
            }
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i10, int i11) throws IOException {
            rd.m.e(bArr, "data");
            if (!h0.this.f30799c) {
                b.b(bArr.length, i10, i11);
                if (h0.this.f30798b.size() == 0) {
                    h0 h0Var = h0.this;
                    if (h0Var.f30797a.N(h0Var.f30798b, 8192L) == -1) {
                        return -1;
                    }
                }
                return h0.this.f30798b.read(bArr, i10, i11);
            }
            throw new IOException("closed");
        }
    }
}
