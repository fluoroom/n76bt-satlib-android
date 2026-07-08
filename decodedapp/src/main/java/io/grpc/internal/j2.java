package io.grpc.internal;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.InvalidMarkException;
import java.nio.charset.Charset;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes3.dex */
public abstract class j2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final i2 f16653a = new c(new byte[0]);

    class a extends t0 {
        a(i2 i2Var) {
            super(i2Var);
        }

        @Override // io.grpc.internal.i2, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }
    }

    private static class c extends io.grpc.internal.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f16655a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final int f16656b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final byte[] f16657c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f16658d;

        c(byte[] bArr) {
            this(bArr, 0, bArr.length);
        }

        @Override // io.grpc.internal.i2
        public void L(byte[] bArr, int i10, int i11) {
            System.arraycopy(this.f16657c, this.f16655a, bArr, i10, i11);
            this.f16655a += i11;
        }

        @Override // io.grpc.internal.b, io.grpc.internal.i2
        public void R() {
            this.f16658d = this.f16655a;
        }

        @Override // io.grpc.internal.i2
        public void c0(OutputStream outputStream, int i10) throws IOException {
            a(i10);
            outputStream.write(this.f16657c, this.f16655a, i10);
            this.f16655a += i10;
        }

        @Override // io.grpc.internal.i2
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public c u(int i10) {
            a(i10);
            int i11 = this.f16655a;
            this.f16655a = i11 + i10;
            return new c(this.f16657c, i11, i10);
        }

        @Override // io.grpc.internal.i2
        public int g() {
            return this.f16656b - this.f16655a;
        }

        @Override // io.grpc.internal.i2
        public void m0(ByteBuffer byteBuffer) {
            r9.l.o(byteBuffer, "dest");
            int iRemaining = byteBuffer.remaining();
            a(iRemaining);
            byteBuffer.put(this.f16657c, this.f16655a, iRemaining);
            this.f16655a += iRemaining;
        }

        @Override // io.grpc.internal.b, io.grpc.internal.i2
        public boolean markSupported() {
            return true;
        }

        @Override // io.grpc.internal.i2
        public int readUnsignedByte() {
            a(1);
            byte[] bArr = this.f16657c;
            int i10 = this.f16655a;
            this.f16655a = i10 + 1;
            return bArr[i10] & MessagePack.Code.EXT_TIMESTAMP;
        }

        @Override // io.grpc.internal.b, io.grpc.internal.i2
        public void reset() {
            int i10 = this.f16658d;
            if (i10 == -1) {
                throw new InvalidMarkException();
            }
            this.f16655a = i10;
        }

        @Override // io.grpc.internal.i2
        public void skipBytes(int i10) {
            a(i10);
            this.f16655a += i10;
        }

        c(byte[] bArr, int i10, int i11) {
            this.f16658d = -1;
            r9.l.e(i10 >= 0, "offset must be >= 0");
            r9.l.e(i11 >= 0, "length must be >= 0");
            int i12 = i11 + i10;
            r9.l.e(i12 <= bArr.length, "offset + length exceeds array boundary");
            this.f16657c = (byte[]) r9.l.o(bArr, "bytes");
            this.f16655a = i10;
            this.f16656b = i12;
        }
    }

    public static i2 a() {
        return f16653a;
    }

    public static i2 b(i2 i2Var) {
        return new a(i2Var);
    }

    public static InputStream c(i2 i2Var, boolean z10) {
        if (!z10) {
            i2Var = b(i2Var);
        }
        return new b(i2Var);
    }

    public static byte[] d(i2 i2Var) {
        r9.l.o(i2Var, "buffer");
        int iG = i2Var.g();
        byte[] bArr = new byte[iG];
        i2Var.L(bArr, 0, iG);
        return bArr;
    }

    public static String e(i2 i2Var, Charset charset) {
        r9.l.o(charset, "charset");
        return new String(d(i2Var), charset);
    }

    public static i2 f(byte[] bArr, int i10, int i11) {
        return new c(bArr, i10, i11);
    }

    private static final class b extends InputStream implements qb.p0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private i2 f16654a;

        public b(i2 i2Var) {
            this.f16654a = (i2) r9.l.o(i2Var, "buffer");
        }

        @Override // java.io.InputStream
        public int available() {
            return this.f16654a.g();
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f16654a.close();
        }

        @Override // java.io.InputStream
        public void mark(int i10) {
            this.f16654a.R();
        }

        @Override // java.io.InputStream
        public boolean markSupported() {
            return this.f16654a.markSupported();
        }

        @Override // java.io.InputStream
        public int read() {
            if (this.f16654a.g() == 0) {
                return -1;
            }
            return this.f16654a.readUnsignedByte();
        }

        @Override // java.io.InputStream
        public void reset() {
            this.f16654a.reset();
        }

        @Override // java.io.InputStream
        public long skip(long j10) {
            int iMin = (int) Math.min(this.f16654a.g(), j10);
            this.f16654a.skipBytes(iMin);
            return iMin;
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i10, int i11) {
            if (this.f16654a.g() == 0) {
                return -1;
            }
            int iMin = Math.min(this.f16654a.g(), i11);
            this.f16654a.L(bArr, i10, iMin);
            return iMin;
        }
    }
}
