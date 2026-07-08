package io.grpc.internal;

import java.io.OutputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
public abstract class t0 implements i2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i2 f17135a;

    protected t0(i2 i2Var) {
        this.f17135a = (i2) r9.l.o(i2Var, "buf");
    }

    @Override // io.grpc.internal.i2
    public void L(byte[] bArr, int i10, int i11) {
        this.f17135a.L(bArr, i10, i11);
    }

    @Override // io.grpc.internal.i2
    public void R() {
        this.f17135a.R();
    }

    @Override // io.grpc.internal.i2
    public void c0(OutputStream outputStream, int i10) {
        this.f17135a.c0(outputStream, i10);
    }

    @Override // io.grpc.internal.i2
    public int g() {
        return this.f17135a.g();
    }

    @Override // io.grpc.internal.i2
    public void m0(ByteBuffer byteBuffer) {
        this.f17135a.m0(byteBuffer);
    }

    @Override // io.grpc.internal.i2
    public boolean markSupported() {
        return this.f17135a.markSupported();
    }

    @Override // io.grpc.internal.i2
    public int readUnsignedByte() {
        return this.f17135a.readUnsignedByte();
    }

    @Override // io.grpc.internal.i2
    public void reset() {
        this.f17135a.reset();
    }

    @Override // io.grpc.internal.i2
    public void skipBytes(int i10) {
        this.f17135a.skipBytes(i10);
    }

    public String toString() {
        return r9.g.b(this).d("delegate", this.f17135a).toString();
    }

    @Override // io.grpc.internal.i2
    public i2 u(int i10) {
        return this.f17135a.u(i10);
    }
}
