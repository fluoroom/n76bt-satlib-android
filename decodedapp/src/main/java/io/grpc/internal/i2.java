package io.grpc.internal;

import java.io.Closeable;
import java.io.OutputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
public interface i2 extends Closeable {
    void L(byte[] bArr, int i10, int i11);

    void R();

    void c0(OutputStream outputStream, int i10);

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    int g();

    void m0(ByteBuffer byteBuffer);

    boolean markSupported();

    int readUnsignedByte();

    void reset();

    void skipBytes(int i10);

    i2 u(int i10);
}
