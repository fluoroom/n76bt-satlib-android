package com.google.protobuf;

import com.google.protobuf.l;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes3.dex */
final class x1 extends l.i {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ByteBuffer f10141e;

    x1(ByteBuffer byteBuffer) {
        o0.b(byteBuffer, "buffer");
        this.f10141e = byteBuffer.slice().order(ByteOrder.nativeOrder());
    }

    private ByteBuffer Z(int i10, int i11) {
        if (i10 < this.f10141e.position() || i11 > this.f10141e.limit() || i10 > i11) {
            throw new IllegalArgumentException(String.format("Invalid indices [%d, %d]", Integer.valueOf(i10), Integer.valueOf(i11)));
        }
        ByteBuffer byteBufferSlice = this.f10141e.slice();
        q0.b(byteBufferSlice, i10 - this.f10141e.position());
        q0.a(byteBufferSlice, i11 - this.f10141e.position());
        return byteBufferSlice;
    }

    @Override // com.google.protobuf.l
    public l A(int i10, int i11) {
        try {
            return new x1(Z(i10, i11));
        } catch (ArrayIndexOutOfBoundsException e10) {
            throw e10;
        } catch (IndexOutOfBoundsException e11) {
            throw new ArrayIndexOutOfBoundsException(e11.getMessage());
        }
    }

    @Override // com.google.protobuf.l
    protected String L(Charset charset) {
        byte[] bArrC;
        int length;
        int iArrayOffset;
        if (this.f10141e.hasArray()) {
            bArrC = this.f10141e.array();
            iArrayOffset = this.f10141e.arrayOffset() + this.f10141e.position();
            length = this.f10141e.remaining();
        } else {
            bArrC = C();
            length = bArrC.length;
            iArrayOffset = 0;
        }
        return new String(bArrC, iArrayOffset, length, charset);
    }

    @Override // com.google.protobuf.l
    void Y(k kVar) {
        kVar.a(this.f10141e.slice());
    }

    @Override // com.google.protobuf.l
    public ByteBuffer c() {
        return this.f10141e.asReadOnlyBuffer();
    }

    @Override // com.google.protobuf.l
    public byte d(int i10) {
        try {
            return this.f10141e.get(i10);
        } catch (ArrayIndexOutOfBoundsException e10) {
            throw e10;
        } catch (IndexOutOfBoundsException e11) {
            throw new ArrayIndexOutOfBoundsException(e11.getMessage());
        }
    }

    @Override // com.google.protobuf.l
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        if (size() != lVar.size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        return obj instanceof x1 ? this.f10141e.equals(((x1) obj).f10141e) : this.f10141e.equals(lVar.c());
    }

    @Override // com.google.protobuf.l
    protected void j(byte[] bArr, int i10, int i11, int i12) {
        ByteBuffer byteBufferSlice = this.f10141e.slice();
        q0.b(byteBufferSlice, i10);
        byteBufferSlice.get(bArr, i11, i12);
    }

    @Override // com.google.protobuf.l
    public byte l(int i10) {
        return d(i10);
    }

    @Override // com.google.protobuf.l
    public boolean o() {
        return z2.r(this.f10141e);
    }

    @Override // com.google.protobuf.l
    public m s() {
        return m.k(this.f10141e, true);
    }

    @Override // com.google.protobuf.l
    public int size() {
        return this.f10141e.remaining();
    }

    @Override // com.google.protobuf.l
    protected int t(int i10, int i11, int i12) {
        for (int i13 = i11; i13 < i11 + i12; i13++) {
            i10 = (i10 * 31) + this.f10141e.get(i13);
        }
        return i10;
    }
}
