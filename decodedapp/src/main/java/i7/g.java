package i7;

import java.io.OutputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public class g extends OutputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final ByteBuffer f15885a;

    public g(ByteBuffer byteBuffer) {
        this.f15885a = byteBuffer;
    }

    @Override // java.io.OutputStream
    public void write(int i10) {
        this.f15885a.put((byte) i10);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i10, int i11) {
        this.f15885a.put(bArr, i10, i11);
    }
}
