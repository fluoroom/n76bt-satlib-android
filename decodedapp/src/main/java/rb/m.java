package rb;

import io.grpc.internal.i2;
import java.io.EOFException;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes3.dex */
class m extends io.grpc.internal.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final vh.e f25837a;

    m(vh.e eVar) {
        this.f25837a = eVar;
    }

    @Override // io.grpc.internal.i2
    public void L(byte[] bArr, int i10, int i11) {
        while (i11 > 0) {
            int i12 = this.f25837a.read(bArr, i10, i11);
            if (i12 == -1) {
                throw new IndexOutOfBoundsException("EOF trying to read " + i11 + " bytes");
            }
            i11 -= i12;
            i10 += i12;
        }
    }

    @Override // io.grpc.internal.i2
    public void c0(OutputStream outputStream, int i10) throws IOException {
        this.f25837a.N0(outputStream, i10);
    }

    @Override // io.grpc.internal.b, io.grpc.internal.i2, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws EOFException {
        this.f25837a.k();
    }

    @Override // io.grpc.internal.i2
    public int g() {
        return (int) this.f25837a.size();
    }

    @Override // io.grpc.internal.i2
    public void m0(ByteBuffer byteBuffer) {
        throw new UnsupportedOperationException();
    }

    @Override // io.grpc.internal.i2
    public int readUnsignedByte() {
        try {
            e();
            return this.f25837a.readByte() & MessagePack.Code.EXT_TIMESTAMP;
        } catch (EOFException e10) {
            throw new IndexOutOfBoundsException(e10.getMessage());
        }
    }

    @Override // io.grpc.internal.i2
    public void skipBytes(int i10) {
        try {
            this.f25837a.skip(i10);
        } catch (EOFException e10) {
            throw new IndexOutOfBoundsException(e10.getMessage());
        }
    }

    @Override // io.grpc.internal.i2
    public i2 u(int i10) {
        vh.e eVar = new vh.e();
        eVar.C(this.f25837a, i10);
        return new m(eVar);
    }

    private void e() {
    }
}
