package i7;

import java.io.InputStream;
import java.nio.ByteBuffer;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes.dex */
public class f extends InputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final ByteBuffer f15884a;

    public f(ByteBuffer byteBuffer) {
        this.f15884a = byteBuffer;
    }

    @Override // java.io.InputStream
    public int available() {
        return this.f15884a.remaining();
    }

    @Override // java.io.InputStream
    public int read() {
        if (this.f15884a.hasRemaining()) {
            return this.f15884a.get() & MessagePack.Code.EXT_TIMESTAMP;
        }
        return -1;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) {
        if (!this.f15884a.hasRemaining()) {
            return -1;
        }
        int iMin = Math.min(i11, this.f15884a.remaining());
        this.f15884a.get(bArr, i10, iMin);
        return iMin;
    }
}
