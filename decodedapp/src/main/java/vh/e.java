package vh;

import androidx.appcompat.widget.ActivityChooserView;
import com.facebook.stetho.dumpapp.Framer;
import com.tencent.mm.opensdk.constants.ConstantsAPI;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes3.dex */
public final class e implements g, f, Cloneable, ByteChannel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public i0 f30774a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f30775b;

    public static final class a implements Closeable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public e f30776a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private i0 f30777b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public byte[] f30779d;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public long f30778c = -1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f30780e = -1;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f30781f = -1;

        public final void a(i0 i0Var) {
            this.f30777b = i0Var;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.f30776a == null) {
                throw new IllegalStateException("not attached to a buffer");
            }
            this.f30776a = null;
            a(null);
            this.f30778c = -1L;
            this.f30779d = null;
            this.f30780e = -1;
            this.f30781f = -1;
        }
    }

    public static final class c extends OutputStream {
        c() {
        }

        public String toString() {
            return e.this + ".outputStream()";
        }

        @Override // java.io.OutputStream
        public void write(int i10) {
            e.this.writeByte(i10);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr, int i10, int i11) {
            rd.m.e(bArr, "data");
            e.this.write(bArr, i10, i11);
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public void flush() {
        }
    }

    public static /* synthetic */ e O0(e eVar, OutputStream outputStream, long j10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = eVar.f30775b;
        }
        return eVar.N0(outputStream, j10);
    }

    public final h A0(int i10) {
        if (i10 == 0) {
            return h.f30793e;
        }
        vh.b.b(size(), 0L, i10);
        i0 i0Var = this.f30774a;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (i12 < i10) {
            rd.m.b(i0Var);
            int i14 = i0Var.f30811c;
            int i15 = i0Var.f30810b;
            if (i14 == i15) {
                throw new AssertionError("s.limit == s.pos");
            }
            i12 += i14 - i15;
            i13++;
            i0Var = i0Var.f30814f;
        }
        byte[][] bArr = new byte[i13][];
        int[] iArr = new int[i13 * 2];
        i0 i0Var2 = this.f30774a;
        int i16 = 0;
        while (i11 < i10) {
            rd.m.b(i0Var2);
            bArr[i16] = i0Var2.f30809a;
            i11 += i0Var2.f30811c - i0Var2.f30810b;
            iArr[i16] = Math.min(i11, i10);
            iArr[i16 + i13] = i0Var2.f30810b;
            i0Var2.f30812d = true;
            i16++;
            i0Var2 = i0Var2.f30814f;
        }
        return new k0(bArr, iArr);
    }

    @Override // vh.g
    public long B(l0 l0Var) {
        rd.m.e(l0Var, "sink");
        long size = size();
        if (size > 0) {
            l0Var.C(this, size);
        }
        return size;
    }

    public final i0 B0(int i10) {
        if (i10 < 1 || i10 > 8192) {
            throw new IllegalArgumentException("unexpected capacity");
        }
        i0 i0Var = this.f30774a;
        if (i0Var != null) {
            rd.m.b(i0Var);
            i0 i0Var2 = i0Var.f30815g;
            rd.m.b(i0Var2);
            return (i0Var2.f30811c + i10 > 8192 || !i0Var2.f30813e) ? i0Var2.c(j0.c()) : i0Var2;
        }
        i0 i0VarC = j0.c();
        this.f30774a = i0VarC;
        i0VarC.f30815g = i0VarC;
        i0VarC.f30814f = i0VarC;
        return i0VarC;
    }

    @Override // vh.l0
    public void C(e eVar, long j10) {
        i0 i0Var;
        rd.m.e(eVar, "source");
        if (eVar == this) {
            throw new IllegalArgumentException("source == this");
        }
        vh.b.b(eVar.size(), 0L, j10);
        while (j10 > 0) {
            i0 i0Var2 = eVar.f30774a;
            rd.m.b(i0Var2);
            int i10 = i0Var2.f30811c;
            rd.m.b(eVar.f30774a);
            if (j10 < i10 - r1.f30810b) {
                i0 i0Var3 = this.f30774a;
                if (i0Var3 != null) {
                    rd.m.b(i0Var3);
                    i0Var = i0Var3.f30815g;
                } else {
                    i0Var = null;
                }
                if (i0Var != null && i0Var.f30813e) {
                    if ((((long) i0Var.f30811c) + j10) - ((long) (i0Var.f30812d ? 0 : i0Var.f30810b)) <= 8192) {
                        i0 i0Var4 = eVar.f30774a;
                        rd.m.b(i0Var4);
                        i0Var4.f(i0Var, (int) j10);
                        eVar.y0(eVar.size() - j10);
                        y0(size() + j10);
                        return;
                    }
                }
                i0 i0Var5 = eVar.f30774a;
                rd.m.b(i0Var5);
                eVar.f30774a = i0Var5.e((int) j10);
            }
            i0 i0Var6 = eVar.f30774a;
            rd.m.b(i0Var6);
            long j11 = i0Var6.f30811c - i0Var6.f30810b;
            eVar.f30774a = i0Var6.b();
            i0 i0Var7 = this.f30774a;
            if (i0Var7 == null) {
                this.f30774a = i0Var6;
                i0Var6.f30815g = i0Var6;
                i0Var6.f30814f = i0Var6;
            } else {
                rd.m.b(i0Var7);
                i0 i0Var8 = i0Var7.f30815g;
                rd.m.b(i0Var8);
                i0Var8.c(i0Var6).a();
            }
            eVar.y0(eVar.size() - j11);
            y0(size() + j11);
            j10 -= j11;
        }
    }

    @Override // vh.f
    /* JADX INFO: renamed from: C0, reason: merged with bridge method [inline-methods] */
    public e Z(h hVar) {
        rd.m.e(hVar, "byteString");
        hVar.a0(this, 0, hVar.Q());
        return this;
    }

    @Override // vh.f
    /* JADX INFO: renamed from: D0, reason: merged with bridge method [inline-methods] */
    public e write(byte[] bArr) {
        rd.m.e(bArr, "source");
        return write(bArr, 0, bArr.length);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0048, code lost:
    
        r1 = new vh.e().H0(r8).G0(r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0055, code lost:
    
        if (r2 != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0057, code lost:
    
        r1.readByte();
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0074, code lost:
    
        throw new java.lang.NumberFormatException("Number too large: " + r1.w0());
     */
    @Override // vh.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long E() throws java.io.EOFException {
        /*
            Method dump skipped, instruction units count: 249
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: vh.e.E():long");
    }

    @Override // vh.f
    /* JADX INFO: renamed from: E0, reason: merged with bridge method [inline-methods] */
    public e write(byte[] bArr, int i10, int i11) {
        rd.m.e(bArr, "source");
        long j10 = i11;
        vh.b.b(bArr.length, i10, j10);
        int i12 = i11 + i10;
        while (i10 < i12) {
            i0 i0VarB0 = B0(1);
            int iMin = Math.min(i12 - i10, 8192 - i0VarB0.f30811c);
            int i13 = i10 + iMin;
            ed.j.g(bArr, i0VarB0.f30809a, i0VarB0.f30811c, i10, i13);
            i0VarB0.f30811c += iMin;
            i10 = i13;
        }
        y0(size() + j10);
        return this;
    }

    @Override // vh.g
    public String F(long j10) throws EOFException {
        if (j10 < 0) {
            throw new IllegalArgumentException(("limit < 0: " + j10).toString());
        }
        long j11 = j10 != Long.MAX_VALUE ? j10 + 1 : Long.MAX_VALUE;
        long jH = H((byte) 10, 0L, j11);
        if (jH != -1) {
            return wh.a.f(this, jH);
        }
        if (j11 < size() && G(j11 - 1) == 13 && G(j11) == 10) {
            return wh.a.f(this, j11);
        }
        e eVar = new e();
        w(eVar, 0L, Math.min(32, size()));
        throw new EOFException("\\n not found: limit=" + Math.min(size(), j10) + " content=" + eVar.Q().n() + (char) 8230);
    }

    public long F0(n0 n0Var) {
        rd.m.e(n0Var, "source");
        long j10 = 0;
        while (true) {
            long jN = n0Var.N(this, 8192L);
            if (jN == -1) {
                return j10;
            }
            j10 += jN;
        }
    }

    public final byte G(long j10) {
        vh.b.b(size(), j10, 1L);
        i0 i0Var = this.f30774a;
        if (i0Var == null) {
            rd.m.b(null);
            throw null;
        }
        if (size() - j10 < j10) {
            long size = size();
            while (size > j10) {
                i0Var = i0Var.f30815g;
                rd.m.b(i0Var);
                size -= (long) (i0Var.f30811c - i0Var.f30810b);
            }
            rd.m.b(i0Var);
            return i0Var.f30809a[(int) ((((long) i0Var.f30810b) + j10) - size)];
        }
        long j11 = 0;
        while (true) {
            long j12 = ((long) (i0Var.f30811c - i0Var.f30810b)) + j11;
            if (j12 > j10) {
                rd.m.b(i0Var);
                return i0Var.f30809a[(int) ((((long) i0Var.f30810b) + j10) - j11)];
            }
            i0Var = i0Var.f30814f;
            rd.m.b(i0Var);
            j11 = j12;
        }
    }

    @Override // vh.f
    /* JADX INFO: renamed from: G0, reason: merged with bridge method [inline-methods] */
    public e writeByte(int i10) {
        i0 i0VarB0 = B0(1);
        byte[] bArr = i0VarB0.f30809a;
        int i11 = i0VarB0.f30811c;
        i0VarB0.f30811c = i11 + 1;
        bArr[i11] = (byte) i10;
        y0(size() + 1);
        return this;
    }

    public long H(byte b10, long j10, long j11) {
        i0 i0Var;
        int i10;
        long size = 0;
        if (0 > j10 || j10 > j11) {
            throw new IllegalArgumentException(("size=" + size() + " fromIndex=" + j10 + " toIndex=" + j11).toString());
        }
        if (j11 > size()) {
            j11 = size();
        }
        if (j10 == j11 || (i0Var = this.f30774a) == null) {
            return -1L;
        }
        if (size() - j10 < j10) {
            size = size();
            while (size > j10) {
                i0Var = i0Var.f30815g;
                rd.m.b(i0Var);
                size -= (long) (i0Var.f30811c - i0Var.f30810b);
            }
            while (size < j11) {
                byte[] bArr = i0Var.f30809a;
                int iMin = (int) Math.min(i0Var.f30811c, (((long) i0Var.f30810b) + j11) - size);
                i10 = (int) ((((long) i0Var.f30810b) + j10) - size);
                while (i10 < iMin) {
                    if (bArr[i10] != b10) {
                        i10++;
                    }
                }
                size += (long) (i0Var.f30811c - i0Var.f30810b);
                i0Var = i0Var.f30814f;
                rd.m.b(i0Var);
                j10 = size;
            }
            return -1L;
        }
        while (true) {
            long j12 = ((long) (i0Var.f30811c - i0Var.f30810b)) + size;
            if (j12 > j10) {
                break;
            }
            i0Var = i0Var.f30814f;
            rd.m.b(i0Var);
            size = j12;
        }
        while (size < j11) {
            byte[] bArr2 = i0Var.f30809a;
            int iMin2 = (int) Math.min(i0Var.f30811c, (((long) i0Var.f30810b) + j11) - size);
            i10 = (int) ((((long) i0Var.f30810b) + j10) - size);
            while (i10 < iMin2) {
                if (bArr2[i10] != b10) {
                    i10++;
                }
            }
            size += (long) (i0Var.f30811c - i0Var.f30810b);
            i0Var = i0Var.f30814f;
            rd.m.b(i0Var);
            j10 = size;
        }
        return -1L;
        return ((long) (i10 - i0Var.f30810b)) + size;
    }

    @Override // vh.f
    /* JADX INFO: renamed from: H0, reason: merged with bridge method [inline-methods] */
    public e n0(long j10) {
        boolean z10;
        if (j10 == 0) {
            return writeByte(48);
        }
        if (j10 < 0) {
            j10 = -j10;
            if (j10 < 0) {
                return J("-9223372036854775808");
            }
            z10 = true;
        } else {
            z10 = false;
        }
        int iC = wh.a.c(j10);
        if (z10) {
            iC++;
        }
        i0 i0VarB0 = B0(iC);
        byte[] bArr = i0VarB0.f30809a;
        int i10 = i0VarB0.f30811c + iC;
        while (j10 != 0) {
            long j11 = 10;
            i10--;
            bArr[i10] = wh.a.d()[(int) (j10 % j11)];
            j10 /= j11;
        }
        if (z10) {
            bArr[i10 - 1] = Framer.STDIN_FRAME_PREFIX;
        }
        i0VarB0.f30811c += iC;
        y0(size() + ((long) iC));
        return this;
    }

    @Override // vh.f
    /* JADX INFO: renamed from: I0, reason: merged with bridge method [inline-methods] */
    public e O(long j10) {
        if (j10 == 0) {
            return writeByte(48);
        }
        long j11 = (j10 >>> 1) | j10;
        long j12 = j11 | (j11 >>> 2);
        long j13 = j12 | (j12 >>> 4);
        long j14 = j13 | (j13 >>> 8);
        long j15 = j14 | (j14 >>> 16);
        long j16 = j15 | (j15 >>> 32);
        long j17 = j16 - ((j16 >>> 1) & 6148914691236517205L);
        long j18 = ((j17 >>> 2) & 3689348814741910323L) + (j17 & 3689348814741910323L);
        long j19 = ((j18 >>> 4) + j18) & 1085102592571150095L;
        long j20 = j19 + (j19 >>> 8);
        long j21 = j20 + (j20 >>> 16);
        int i10 = (int) ((((j21 & 63) + ((j21 >>> 32) & 63)) + ((long) 3)) / ((long) 4));
        i0 i0VarB0 = B0(i10);
        byte[] bArr = i0VarB0.f30809a;
        int i11 = i0VarB0.f30811c;
        for (int i12 = (i11 + i10) - 1; i12 >= i11; i12--) {
            bArr[i12] = wh.a.d()[(int) (15 & j10)];
            j10 >>>= 4;
        }
        i0VarB0.f30811c += i10;
        y0(size() + ((long) i10));
        return this;
    }

    @Override // vh.f
    /* JADX INFO: renamed from: J0, reason: merged with bridge method [inline-methods] */
    public e writeInt(int i10) {
        i0 i0VarB0 = B0(4);
        byte[] bArr = i0VarB0.f30809a;
        int i11 = i0VarB0.f30811c;
        bArr[i11] = (byte) ((i10 >>> 24) & 255);
        bArr[i11 + 1] = (byte) ((i10 >>> 16) & 255);
        bArr[i11 + 2] = (byte) ((i10 >>> 8) & 255);
        bArr[i11 + 3] = (byte) (i10 & 255);
        i0VarB0.f30811c = i11 + 4;
        y0(size() + 4);
        return this;
    }

    @Override // vh.g
    public String K(Charset charset) {
        rd.m.e(charset, "charset");
        return v0(this.f30775b, charset);
    }

    @Override // vh.f
    /* JADX INFO: renamed from: K0, reason: merged with bridge method [inline-methods] */
    public e writeShort(int i10) {
        i0 i0VarB0 = B0(2);
        byte[] bArr = i0VarB0.f30809a;
        int i11 = i0VarB0.f30811c;
        bArr[i11] = (byte) ((i10 >>> 8) & 255);
        bArr[i11 + 1] = (byte) (i10 & 255);
        i0VarB0.f30811c = i11 + 2;
        y0(size() + 2);
        return this;
    }

    public e L0(String str, int i10, int i11, Charset charset) {
        rd.m.e(str, "string");
        rd.m.e(charset, "charset");
        if (i10 < 0) {
            throw new IllegalArgumentException(("beginIndex < 0: " + i10).toString());
        }
        if (i11 < i10) {
            throw new IllegalArgumentException(("endIndex < beginIndex: " + i11 + " < " + i10).toString());
        }
        if (i11 > str.length()) {
            throw new IllegalArgumentException(("endIndex > string.length: " + i11 + " > " + str.length()).toString());
        }
        if (rd.m.a(charset, rg.d.f26007b)) {
            return M(str, i10, i11);
        }
        String strSubstring = str.substring(i10, i11);
        rd.m.d(strSubstring, "substring(...)");
        byte[] bytes = strSubstring.getBytes(charset);
        rd.m.d(bytes, "getBytes(...)");
        return write(bytes, 0, bytes.length);
    }

    public e M0(String str, Charset charset) {
        rd.m.e(str, "string");
        rd.m.e(charset, "charset");
        return L0(str, 0, str.length(), charset);
    }

    @Override // vh.n0
    public long N(e eVar, long j10) {
        rd.m.e(eVar, "sink");
        if (j10 < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j10).toString());
        }
        if (size() == 0) {
            return -1L;
        }
        if (j10 > size()) {
            j10 = size();
        }
        eVar.C(this, j10);
        return j10;
    }

    public final e N0(OutputStream outputStream, long j10) throws IOException {
        rd.m.e(outputStream, "out");
        vh.b.b(this.f30775b, 0L, j10);
        i0 i0Var = this.f30774a;
        long j11 = j10;
        while (j11 > 0) {
            rd.m.b(i0Var);
            int iMin = (int) Math.min(j11, i0Var.f30811c - i0Var.f30810b);
            outputStream.write(i0Var.f30809a, i0Var.f30810b, iMin);
            int i10 = i0Var.f30810b + iMin;
            i0Var.f30810b = i10;
            long j12 = iMin;
            this.f30775b -= j12;
            j11 -= j12;
            if (i10 == i0Var.f30811c) {
                i0 i0VarB = i0Var.b();
                this.f30774a = i0VarB;
                j0.b(i0Var);
                i0Var = i0VarB;
            }
        }
        return this;
    }

    @Override // vh.f
    /* JADX INFO: renamed from: P0, reason: merged with bridge method [inline-methods] */
    public e J(String str) {
        rd.m.e(str, "string");
        return M(str, 0, str.length());
    }

    @Override // vh.g
    public h Q() {
        return p(size());
    }

    @Override // vh.f
    /* JADX INFO: renamed from: Q0, reason: merged with bridge method [inline-methods] */
    public e M(String str, int i10, int i11) {
        char cCharAt;
        rd.m.e(str, "string");
        if (i10 < 0) {
            throw new IllegalArgumentException(("beginIndex < 0: " + i10).toString());
        }
        if (i11 < i10) {
            throw new IllegalArgumentException(("endIndex < beginIndex: " + i11 + " < " + i10).toString());
        }
        if (i11 > str.length()) {
            throw new IllegalArgumentException(("endIndex > string.length: " + i11 + " > " + str.length()).toString());
        }
        while (i10 < i11) {
            char cCharAt2 = str.charAt(i10);
            if (cCharAt2 < 128) {
                i0 i0VarB0 = B0(1);
                byte[] bArr = i0VarB0.f30809a;
                int i12 = i0VarB0.f30811c - i10;
                int iMin = Math.min(i11, 8192 - i12);
                int i13 = i10 + 1;
                bArr[i10 + i12] = (byte) cCharAt2;
                while (true) {
                    i10 = i13;
                    if (i10 >= iMin || (cCharAt = str.charAt(i10)) >= 128) {
                        break;
                    }
                    i13 = i10 + 1;
                    bArr[i10 + i12] = (byte) cCharAt;
                }
                int i14 = i0VarB0.f30811c;
                int i15 = (i12 + i10) - i14;
                i0VarB0.f30811c = i14 + i15;
                y0(size() + ((long) i15));
            } else {
                if (cCharAt2 < 2048) {
                    i0 i0VarB02 = B0(2);
                    byte[] bArr2 = i0VarB02.f30809a;
                    int i16 = i0VarB02.f30811c;
                    bArr2[i16] = (byte) ((cCharAt2 >> 6) | 192);
                    bArr2[i16 + 1] = (byte) ((cCharAt2 & '?') | 128);
                    i0VarB02.f30811c = i16 + 2;
                    y0(size() + 2);
                } else if (cCharAt2 < 55296 || cCharAt2 > 57343) {
                    i0 i0VarB03 = B0(3);
                    byte[] bArr3 = i0VarB03.f30809a;
                    int i17 = i0VarB03.f30811c;
                    bArr3[i17] = (byte) ((cCharAt2 >> '\f') | 224);
                    bArr3[i17 + 1] = (byte) ((63 & (cCharAt2 >> 6)) | 128);
                    bArr3[i17 + 2] = (byte) ((cCharAt2 & '?') | 128);
                    i0VarB03.f30811c = i17 + 3;
                    y0(size() + 3);
                } else {
                    int i18 = i10 + 1;
                    char cCharAt3 = i18 < i11 ? str.charAt(i18) : (char) 0;
                    if (cCharAt2 > 56319 || 56320 > cCharAt3 || cCharAt3 >= 57344) {
                        writeByte(63);
                        i10 = i18;
                    } else {
                        int i19 = (((cCharAt2 & 1023) << 10) | (cCharAt3 & 1023)) + WXMediaMessage.THUMB_LENGTH_LIMIT;
                        i0 i0VarB04 = B0(4);
                        byte[] bArr4 = i0VarB04.f30809a;
                        int i20 = i0VarB04.f30811c;
                        bArr4[i20] = (byte) ((i19 >> 18) | 240);
                        bArr4[i20 + 1] = (byte) (((i19 >> 12) & 63) | 128);
                        bArr4[i20 + 2] = (byte) (((i19 >> 6) & 63) | 128);
                        bArr4[i20 + 3] = (byte) ((i19 & 63) | 128);
                        i0VarB04.f30811c = i20 + 4;
                        y0(size() + 4);
                        i10 += 2;
                    }
                }
                i10++;
            }
        }
        return this;
    }

    @Override // vh.f
    /* JADX INFO: renamed from: R0, reason: merged with bridge method [inline-methods] */
    public e t(int i10) {
        if (i10 < 128) {
            writeByte(i10);
            return this;
        }
        if (i10 < 2048) {
            i0 i0VarB0 = B0(2);
            byte[] bArr = i0VarB0.f30809a;
            int i11 = i0VarB0.f30811c;
            bArr[i11] = (byte) ((i10 >> 6) | 192);
            bArr[i11 + 1] = (byte) ((i10 & 63) | 128);
            i0VarB0.f30811c = i11 + 2;
            y0(size() + 2);
            return this;
        }
        if (55296 <= i10 && i10 < 57344) {
            writeByte(63);
            return this;
        }
        if (i10 < 65536) {
            i0 i0VarB02 = B0(3);
            byte[] bArr2 = i0VarB02.f30809a;
            int i12 = i0VarB02.f30811c;
            bArr2[i12] = (byte) ((i10 >> 12) | 224);
            bArr2[i12 + 1] = (byte) (((i10 >> 6) & 63) | 128);
            bArr2[i12 + 2] = (byte) ((i10 & 63) | 128);
            i0VarB02.f30811c = i12 + 3;
            y0(size() + 3);
            return this;
        }
        if (i10 > 1114111) {
            throw new IllegalArgumentException("Unexpected code point: 0x" + vh.b.j(i10));
        }
        i0 i0VarB03 = B0(4);
        byte[] bArr3 = i0VarB03.f30809a;
        int i13 = i0VarB03.f30811c;
        bArr3[i13] = (byte) ((i10 >> 18) | 240);
        bArr3[i13 + 1] = (byte) (((i10 >> 12) & 63) | 128);
        bArr3[i13 + 2] = (byte) (((i10 >> 6) & 63) | 128);
        bArr3[i13 + 3] = (byte) ((i10 & 63) | 128);
        i0VarB03.f30811c = i13 + 4;
        y0(size() + 4);
        return this;
    }

    public long T(h hVar) {
        rd.m.e(hVar, "targetBytes");
        return W(hVar, 0L);
    }

    @Override // vh.g
    public String U() {
        return F(Long.MAX_VALUE);
    }

    @Override // vh.g
    public int V() {
        return vh.b.f(readInt());
    }

    public long W(h hVar, long j10) {
        int i10;
        int i11;
        rd.m.e(hVar, "targetBytes");
        long size = 0;
        if (j10 < 0) {
            throw new IllegalArgumentException(("fromIndex < 0: " + j10).toString());
        }
        i0 i0Var = this.f30774a;
        if (i0Var == null) {
            return -1L;
        }
        if (size() - j10 < j10) {
            size = size();
            while (size > j10) {
                i0Var = i0Var.f30815g;
                rd.m.b(i0Var);
                size -= (long) (i0Var.f30811c - i0Var.f30810b);
            }
            if (hVar.Q() == 2) {
                byte bH = hVar.h(0);
                byte bH2 = hVar.h(1);
                while (size < size()) {
                    byte[] bArr = i0Var.f30809a;
                    i10 = (int) ((((long) i0Var.f30810b) + j10) - size);
                    int i12 = i0Var.f30811c;
                    while (i10 < i12) {
                        byte b10 = bArr[i10];
                        if (b10 == bH || b10 == bH2) {
                            i11 = i0Var.f30810b;
                        } else {
                            i10++;
                        }
                    }
                    size += (long) (i0Var.f30811c - i0Var.f30810b);
                    i0Var = i0Var.f30814f;
                    rd.m.b(i0Var);
                    j10 = size;
                }
            } else {
                byte[] bArrV = hVar.v();
                while (size < size()) {
                    byte[] bArr2 = i0Var.f30809a;
                    i10 = (int) ((((long) i0Var.f30810b) + j10) - size);
                    int i13 = i0Var.f30811c;
                    while (i10 < i13) {
                        byte b11 = bArr2[i10];
                        for (byte b12 : bArrV) {
                            if (b11 == b12) {
                                i11 = i0Var.f30810b;
                            }
                        }
                        i10++;
                    }
                    size += (long) (i0Var.f30811c - i0Var.f30810b);
                    i0Var = i0Var.f30814f;
                    rd.m.b(i0Var);
                    j10 = size;
                }
            }
            return -1L;
        }
        while (true) {
            long j11 = ((long) (i0Var.f30811c - i0Var.f30810b)) + size;
            if (j11 > j10) {
                break;
            }
            i0Var = i0Var.f30814f;
            rd.m.b(i0Var);
            size = j11;
        }
        if (hVar.Q() == 2) {
            byte bH3 = hVar.h(0);
            byte bH4 = hVar.h(1);
            while (size < size()) {
                byte[] bArr3 = i0Var.f30809a;
                i10 = (int) ((((long) i0Var.f30810b) + j10) - size);
                int i14 = i0Var.f30811c;
                while (i10 < i14) {
                    byte b13 = bArr3[i10];
                    if (b13 == bH3 || b13 == bH4) {
                        i11 = i0Var.f30810b;
                    } else {
                        i10++;
                    }
                }
                size += (long) (i0Var.f30811c - i0Var.f30810b);
                i0Var = i0Var.f30814f;
                rd.m.b(i0Var);
                j10 = size;
            }
        } else {
            byte[] bArrV2 = hVar.v();
            while (size < size()) {
                byte[] bArr4 = i0Var.f30809a;
                i10 = (int) ((((long) i0Var.f30810b) + j10) - size);
                int i15 = i0Var.f30811c;
                while (i10 < i15) {
                    byte b14 = bArr4[i10];
                    for (byte b15 : bArrV2) {
                        if (b14 == b15) {
                            i11 = i0Var.f30810b;
                        }
                    }
                    i10++;
                }
                size += (long) (i0Var.f30811c - i0Var.f30810b);
                i0Var = i0Var.f30814f;
                rd.m.b(i0Var);
                j10 = size;
            }
        }
        return -1L;
        return ((long) (i10 - i11)) + size;
    }

    public OutputStream X() {
        return new c();
    }

    @Override // vh.g
    public byte[] Y(long j10) throws EOFException {
        if (j10 < 0 || j10 > 2147483647L) {
            throw new IllegalArgumentException(("byteCount: " + j10).toString());
        }
        if (size() < j10) {
            throw new EOFException();
        }
        byte[] bArr = new byte[(int) j10];
        t0(bArr);
        return bArr;
    }

    @Override // vh.g
    public short b0() {
        return vh.b.h(readShort());
    }

    @Override // vh.g
    public long d0() {
        return vh.b.g(u0());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (size() != eVar.size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        i0 i0Var = this.f30774a;
        rd.m.b(i0Var);
        i0 i0Var2 = eVar.f30774a;
        rd.m.b(i0Var2);
        int i10 = i0Var.f30810b;
        int i11 = i0Var2.f30810b;
        long j10 = 0;
        while (j10 < size()) {
            long jMin = Math.min(i0Var.f30811c - i10, i0Var2.f30811c - i11);
            long j11 = 0;
            while (j11 < jMin) {
                int i12 = i10 + 1;
                int i13 = i11 + 1;
                if (i0Var.f30809a[i10] != i0Var2.f30809a[i11]) {
                    return false;
                }
                j11++;
                i10 = i12;
                i11 = i13;
            }
            if (i10 == i0Var.f30811c) {
                i0Var = i0Var.f30814f;
                rd.m.b(i0Var);
                i10 = i0Var.f30810b;
            }
            if (i11 == i0Var2.f30811c) {
                i0Var2 = i0Var2.f30814f;
                rd.m.b(i0Var2);
                i11 = i0Var2.f30810b;
            }
            j10 += jMin;
        }
        return true;
    }

    public boolean h0(long j10, h hVar) {
        rd.m.e(hVar, "bytes");
        return p0(j10, hVar, 0, hVar.Q());
    }

    public int hashCode() {
        i0 i0Var = this.f30774a;
        if (i0Var == null) {
            return 0;
        }
        int i10 = 1;
        do {
            int i11 = i0Var.f30811c;
            for (int i12 = i0Var.f30810b; i12 < i11; i12++) {
                i10 = (i10 * 31) + i0Var.f30809a[i12];
            }
            i0Var = i0Var.f30814f;
            rd.m.b(i0Var);
        } while (i0Var != this.f30774a);
        return i10;
    }

    @Override // vh.n0
    public o0 i() {
        return o0.f30840e;
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return true;
    }

    public final void k() throws EOFException {
        skip(size());
    }

    @Override // vh.g
    public void l0(long j10) throws EOFException {
        if (this.f30775b < j10) {
            throw new EOFException();
        }
    }

    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public e clone() {
        return v();
    }

    @Override // vh.g
    public String o(long j10) throws EOFException {
        return v0(j10, rg.d.f26007b);
    }

    @Override // vh.g
    public int o0(c0 c0Var) throws EOFException {
        rd.m.e(c0Var, "options");
        int iH = wh.a.h(this, c0Var, false, 2, null);
        if (iH == -1) {
            return -1;
        }
        skip(c0Var.g()[iH].Q());
        return iH;
    }

    @Override // vh.g
    public h p(long j10) throws EOFException {
        if (j10 < 0 || j10 > 2147483647L) {
            throw new IllegalArgumentException(("byteCount: " + j10).toString());
        }
        if (size() < j10) {
            throw new EOFException();
        }
        if (j10 < ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF) {
            return new h(Y(j10));
        }
        h hVarA0 = A0((int) j10);
        skip(j10);
        return hVarA0;
    }

    public boolean p0(long j10, h hVar, int i10, int i11) {
        rd.m.e(hVar, "bytes");
        return i11 >= 0 && j10 >= 0 && ((long) i11) + j10 <= size() && i10 >= 0 && i10 + i11 <= hVar.Q() && (i11 == 0 || wh.a.b(this, hVar, j10, j10 + 1, i10, i11) != -1);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a7 A[EDGE_INSN: B:43:0x00a7->B:37:0x00a7 BREAK  A[LOOP:0: B:5:0x000d->B:45:?], SYNTHETIC] */
    @Override // vh.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long q0() throws java.io.EOFException {
        /*
            r15 = this;
            long r0 = r15.size()
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto Lb1
            r0 = 0
            r4 = r2
            r1 = 0
        Ld:
            vh.i0 r6 = r15.f30774a
            rd.m.b(r6)
            byte[] r7 = r6.f30809a
            int r8 = r6.f30810b
            int r9 = r6.f30811c
        L18:
            if (r8 >= r9) goto L93
            r10 = r7[r8]
            r11 = 48
            if (r10 < r11) goto L27
            r11 = 57
            if (r10 > r11) goto L27
            int r11 = r10 + (-48)
            goto L3c
        L27:
            r11 = 97
            if (r10 < r11) goto L32
            r11 = 102(0x66, float:1.43E-43)
            if (r10 > r11) goto L32
            int r11 = r10 + (-87)
            goto L3c
        L32:
            r11 = 65
            if (r10 < r11) goto L74
            r11 = 70
            if (r10 > r11) goto L74
            int r11 = r10 + (-55)
        L3c:
            r12 = -1152921504606846976(0xf000000000000000, double:-3.105036184601418E231)
            long r12 = r12 & r4
            int r14 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r14 != 0) goto L4c
            r10 = 4
            long r4 = r4 << r10
            long r10 = (long) r11
            long r4 = r4 | r10
            int r8 = r8 + 1
            int r0 = r0 + 1
            goto L18
        L4c:
            vh.e r0 = new vh.e
            r0.<init>()
            vh.e r0 = r0.O(r4)
            vh.e r0 = r0.writeByte(r10)
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Number too large: "
            r2.append(r3)
            java.lang.String r0 = r0.w0()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        L74:
            if (r0 == 0) goto L78
            r1 = 1
            goto L93
        L78:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Expected leading [0-9a-fA-F] character but was 0x"
            r1.append(r2)
            java.lang.String r2 = vh.b.i(r10)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L93:
            if (r8 != r9) goto L9f
            vh.i0 r7 = r6.b()
            r15.f30774a = r7
            vh.j0.b(r6)
            goto La1
        L9f:
            r6.f30810b = r8
        La1:
            if (r1 != 0) goto La7
            vh.i0 r6 = r15.f30774a
            if (r6 != 0) goto Ld
        La7:
            long r1 = r15.size()
            long r6 = (long) r0
            long r1 = r1 - r6
            r15.y0(r1)
            return r4
        Lb1:
            java.io.EOFException r0 = new java.io.EOFException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: vh.e.q0():long");
    }

    public final long r() {
        long size = size();
        if (size == 0) {
            return 0L;
        }
        i0 i0Var = this.f30774a;
        rd.m.b(i0Var);
        i0 i0Var2 = i0Var.f30815g;
        rd.m.b(i0Var2);
        int i10 = i0Var2.f30811c;
        return (i10 >= 8192 || !i0Var2.f30813e) ? size : size - ((long) (i10 - i0Var2.f30810b));
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer byteBuffer) {
        rd.m.e(byteBuffer, "sink");
        i0 i0Var = this.f30774a;
        if (i0Var == null) {
            return -1;
        }
        int iMin = Math.min(byteBuffer.remaining(), i0Var.f30811c - i0Var.f30810b);
        byteBuffer.put(i0Var.f30809a, i0Var.f30810b, iMin);
        int i10 = i0Var.f30810b + iMin;
        i0Var.f30810b = i10;
        this.f30775b -= (long) iMin;
        if (i10 == i0Var.f30811c) {
            this.f30774a = i0Var.b();
            j0.b(i0Var);
        }
        return iMin;
    }

    @Override // vh.g
    public byte readByte() throws EOFException {
        if (size() == 0) {
            throw new EOFException();
        }
        i0 i0Var = this.f30774a;
        rd.m.b(i0Var);
        int i10 = i0Var.f30810b;
        int i11 = i0Var.f30811c;
        int i12 = i10 + 1;
        byte b10 = i0Var.f30809a[i10];
        y0(size() - 1);
        if (i12 != i11) {
            i0Var.f30810b = i12;
            return b10;
        }
        this.f30774a = i0Var.b();
        j0.b(i0Var);
        return b10;
    }

    @Override // vh.g
    public int readInt() throws EOFException {
        if (size() < 4) {
            throw new EOFException();
        }
        i0 i0Var = this.f30774a;
        rd.m.b(i0Var);
        int i10 = i0Var.f30810b;
        int i11 = i0Var.f30811c;
        if (i11 - i10 < 4) {
            return ((readByte() & MessagePack.Code.EXT_TIMESTAMP) << 24) | ((readByte() & MessagePack.Code.EXT_TIMESTAMP) << 16) | ((readByte() & MessagePack.Code.EXT_TIMESTAMP) << 8) | (readByte() & MessagePack.Code.EXT_TIMESTAMP);
        }
        byte[] bArr = i0Var.f30809a;
        int i12 = i10 + 3;
        int i13 = ((bArr[i10 + 1] & MessagePack.Code.EXT_TIMESTAMP) << 16) | ((bArr[i10] & MessagePack.Code.EXT_TIMESTAMP) << 24) | ((bArr[i10 + 2] & MessagePack.Code.EXT_TIMESTAMP) << 8);
        int i14 = i10 + 4;
        int i15 = (bArr[i12] & MessagePack.Code.EXT_TIMESTAMP) | i13;
        y0(size() - 4);
        if (i14 != i11) {
            i0Var.f30810b = i14;
            return i15;
        }
        this.f30774a = i0Var.b();
        j0.b(i0Var);
        return i15;
    }

    @Override // vh.g
    public short readShort() throws EOFException {
        if (size() < 2) {
            throw new EOFException();
        }
        i0 i0Var = this.f30774a;
        rd.m.b(i0Var);
        int i10 = i0Var.f30810b;
        int i11 = i0Var.f30811c;
        if (i11 - i10 < 2) {
            return (short) (((readByte() & MessagePack.Code.EXT_TIMESTAMP) << 8) | (readByte() & MessagePack.Code.EXT_TIMESTAMP));
        }
        byte[] bArr = i0Var.f30809a;
        int i12 = i10 + 1;
        int i13 = (bArr[i10] & MessagePack.Code.EXT_TIMESTAMP) << 8;
        int i14 = i10 + 2;
        int i15 = (bArr[i12] & MessagePack.Code.EXT_TIMESTAMP) | i13;
        y0(size() - 2);
        if (i14 == i11) {
            this.f30774a = i0Var.b();
            j0.b(i0Var);
        } else {
            i0Var.f30810b = i14;
        }
        return (short) i15;
    }

    @Override // vh.g
    public InputStream s0() {
        return new b();
    }

    public final long size() {
        return this.f30775b;
    }

    @Override // vh.g
    public void skip(long j10) throws EOFException {
        while (j10 > 0) {
            i0 i0Var = this.f30774a;
            if (i0Var == null) {
                throw new EOFException();
            }
            int iMin = (int) Math.min(j10, i0Var.f30811c - i0Var.f30810b);
            long j11 = iMin;
            y0(size() - j11);
            j10 -= j11;
            int i10 = i0Var.f30810b + iMin;
            i0Var.f30810b = i10;
            if (i10 == i0Var.f30811c) {
                this.f30774a = i0Var.b();
                j0.b(i0Var);
            }
        }
    }

    public void t0(byte[] bArr) throws EOFException {
        rd.m.e(bArr, "sink");
        int i10 = 0;
        while (i10 < bArr.length) {
            int i11 = read(bArr, i10, bArr.length - i10);
            if (i11 == -1) {
                throw new EOFException();
            }
            i10 += i11;
        }
    }

    public String toString() {
        return z0().toString();
    }

    public long u0() throws EOFException {
        if (size() < 8) {
            throw new EOFException();
        }
        i0 i0Var = this.f30774a;
        rd.m.b(i0Var);
        int i10 = i0Var.f30810b;
        int i11 = i0Var.f30811c;
        if (i11 - i10 < 8) {
            return ((((long) readInt()) & 4294967295L) << 32) | (4294967295L & ((long) readInt()));
        }
        byte[] bArr = i0Var.f30809a;
        int i12 = i10 + 7;
        long j10 = ((((long) bArr[i10 + 3]) & 255) << 32) | ((((long) bArr[i10]) & 255) << 56) | ((((long) bArr[i10 + 1]) & 255) << 48) | ((((long) bArr[i10 + 2]) & 255) << 40) | ((((long) bArr[i10 + 4]) & 255) << 24) | ((((long) bArr[i10 + 5]) & 255) << 16) | ((((long) bArr[i10 + 6]) & 255) << 8);
        int i13 = i10 + 8;
        long j11 = j10 | (((long) bArr[i12]) & 255);
        y0(size() - 8);
        if (i13 != i11) {
            i0Var.f30810b = i13;
            return j11;
        }
        this.f30774a = i0Var.b();
        j0.b(i0Var);
        return j11;
    }

    public final e v() {
        e eVar = new e();
        if (size() == 0) {
            return eVar;
        }
        i0 i0Var = this.f30774a;
        rd.m.b(i0Var);
        i0 i0VarD = i0Var.d();
        eVar.f30774a = i0VarD;
        i0VarD.f30815g = i0VarD;
        i0VarD.f30814f = i0VarD;
        for (i0 i0Var2 = i0Var.f30814f; i0Var2 != i0Var; i0Var2 = i0Var2.f30814f) {
            i0 i0Var3 = i0VarD.f30815g;
            rd.m.b(i0Var3);
            rd.m.b(i0Var2);
            i0Var3.c(i0Var2.d());
        }
        eVar.y0(size());
        return eVar;
    }

    public String v0(long j10, Charset charset) throws EOFException {
        rd.m.e(charset, "charset");
        if (j10 < 0 || j10 > 2147483647L) {
            throw new IllegalArgumentException(("byteCount: " + j10).toString());
        }
        if (this.f30775b < j10) {
            throw new EOFException();
        }
        if (j10 == 0) {
            return "";
        }
        i0 i0Var = this.f30774a;
        rd.m.b(i0Var);
        int i10 = i0Var.f30810b;
        if (((long) i10) + j10 > i0Var.f30811c) {
            return new String(Y(j10), charset);
        }
        int i11 = (int) j10;
        String str = new String(i0Var.f30809a, i10, i11, charset);
        int i12 = i0Var.f30810b + i11;
        i0Var.f30810b = i12;
        this.f30775b -= j10;
        if (i12 == i0Var.f30811c) {
            this.f30774a = i0Var.b();
            j0.b(i0Var);
        }
        return str;
    }

    public final e w(e eVar, long j10, long j11) {
        rd.m.e(eVar, "out");
        long j12 = j10;
        vh.b.b(size(), j12, j11);
        if (j11 != 0) {
            eVar.y0(eVar.size() + j11);
            i0 i0Var = this.f30774a;
            while (true) {
                rd.m.b(i0Var);
                int i10 = i0Var.f30811c;
                int i11 = i0Var.f30810b;
                if (j12 < i10 - i11) {
                    break;
                }
                j12 -= (long) (i10 - i11);
                i0Var = i0Var.f30814f;
            }
            i0 i0Var2 = i0Var;
            long j13 = j11;
            while (j13 > 0) {
                rd.m.b(i0Var2);
                i0 i0VarD = i0Var2.d();
                int i12 = i0VarD.f30810b + ((int) j12);
                i0VarD.f30810b = i12;
                i0VarD.f30811c = Math.min(i12 + ((int) j13), i0VarD.f30811c);
                i0 i0Var3 = eVar.f30774a;
                if (i0Var3 == null) {
                    i0VarD.f30815g = i0VarD;
                    i0VarD.f30814f = i0VarD;
                    eVar.f30774a = i0VarD;
                } else {
                    rd.m.b(i0Var3);
                    i0 i0Var4 = i0Var3.f30815g;
                    rd.m.b(i0Var4);
                    i0Var4.c(i0VarD);
                }
                j13 -= (long) (i0VarD.f30811c - i0VarD.f30810b);
                i0Var2 = i0Var2.f30814f;
                j12 = 0;
            }
        }
        return this;
    }

    public String w0() {
        return v0(this.f30775b, rg.d.f26007b);
    }

    public int x0() throws EOFException {
        int i10;
        int i11;
        int i12;
        if (size() == 0) {
            throw new EOFException();
        }
        byte bG = G(0L);
        if ((bG & 128) == 0) {
            i10 = bG & 127;
            i11 = 1;
            i12 = 0;
        } else if ((bG & MessagePack.Code.NEGFIXINT_PREFIX) == 192) {
            i10 = bG & 31;
            i11 = 2;
            i12 = 128;
        } else if ((bG & 240) == 224) {
            i10 = bG & 15;
            i11 = 3;
            i12 = 2048;
        } else {
            if ((bG & 248) != 240) {
                skip(1L);
                return 65533;
            }
            i10 = bG & 7;
            i11 = 4;
            i12 = WXMediaMessage.THUMB_LENGTH_LIMIT;
        }
        long j10 = i11;
        if (size() < j10) {
            throw new EOFException("size < " + i11 + ": " + size() + " (to read code point prefixed 0x" + vh.b.i(bG) + ')');
        }
        for (int i13 = 1; i13 < i11; i13++) {
            long j11 = i13;
            byte bG2 = G(j11);
            if ((bG2 & MessagePack.Code.NIL) != 128) {
                skip(j11);
                return 65533;
            }
            i10 = (i10 << 6) | (bG2 & 63);
        }
        skip(j10);
        if (i10 > 1114111) {
            return 65533;
        }
        if ((55296 > i10 || i10 >= 57344) && i10 >= i12) {
            return i10;
        }
        return 65533;
    }

    @Override // vh.g
    public byte[] y() {
        return Y(size());
    }

    public final void y0(long j10) {
        this.f30775b = j10;
    }

    @Override // vh.g
    public boolean z() {
        return this.f30775b == 0;
    }

    public final h z0() {
        if (size() <= 2147483647L) {
            return A0((int) size());
        }
        throw new IllegalStateException(("size > Int.MAX_VALUE: " + size()).toString());
    }

    public static final class b extends InputStream {
        b() {
        }

        @Override // java.io.InputStream
        public int available() {
            return (int) Math.min(e.this.size(), ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED);
        }

        @Override // java.io.InputStream
        public int read() {
            if (e.this.size() > 0) {
                return e.this.readByte() & MessagePack.Code.EXT_TIMESTAMP;
            }
            return -1;
        }

        public String toString() {
            return e.this + ".inputStream()";
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i10, int i11) {
            rd.m.e(bArr, "sink");
            return e.this.read(bArr, i10, i11);
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(ByteBuffer byteBuffer) {
        rd.m.e(byteBuffer, "source");
        int iRemaining = byteBuffer.remaining();
        int i10 = iRemaining;
        while (i10 > 0) {
            i0 i0VarB0 = B0(1);
            int iMin = Math.min(i10, 8192 - i0VarB0.f30811c);
            byteBuffer.get(i0VarB0.f30809a, i0VarB0.f30811c, iMin);
            i10 -= iMin;
            i0VarB0.f30811c += iMin;
        }
        this.f30775b += (long) iRemaining;
        return iRemaining;
    }

    public int read(byte[] bArr, int i10, int i11) {
        rd.m.e(bArr, "sink");
        vh.b.b(bArr.length, i10, i11);
        i0 i0Var = this.f30774a;
        if (i0Var == null) {
            return -1;
        }
        int iMin = Math.min(i11, i0Var.f30811c - i0Var.f30810b);
        byte[] bArr2 = i0Var.f30809a;
        int i12 = i0Var.f30810b;
        ed.j.g(bArr2, bArr, i10, i12, i12 + iMin);
        i0Var.f30810b += iMin;
        y0(size() - ((long) iMin));
        if (i0Var.f30810b == i0Var.f30811c) {
            this.f30774a = i0Var.b();
            j0.b(i0Var);
        }
        return iMin;
    }

    public e a() {
        return this;
    }

    @Override // vh.n0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // vh.f, vh.l0, java.io.Flushable
    public void flush() {
    }

    @Override // vh.g, vh.f
    public e h() {
        return this;
    }

    @Override // vh.f
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public e D() {
        return this;
    }
}
