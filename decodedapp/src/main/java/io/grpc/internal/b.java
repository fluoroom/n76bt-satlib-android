package io.grpc.internal;

/* JADX INFO: loaded from: classes3.dex */
public abstract class b implements i2 {
    @Override // io.grpc.internal.i2
    public void R() {
    }

    protected final void a(int i10) {
        if (g() < i10) {
            throw new IndexOutOfBoundsException();
        }
    }

    public /* synthetic */ void c() {
        h2.a(this);
    }

    @Override // io.grpc.internal.i2, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // io.grpc.internal.i2
    public boolean markSupported() {
        return false;
    }

    public final int readInt() {
        a(4);
        return (readUnsignedByte() << 24) | (readUnsignedByte() << 16) | (readUnsignedByte() << 8) | readUnsignedByte();
    }

    @Override // io.grpc.internal.i2
    public void reset() {
        throw new UnsupportedOperationException();
    }
}
