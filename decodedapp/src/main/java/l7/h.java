package l7;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes.dex */
public class h extends d {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final i f20504j;

    public h(boolean z10, i iVar) {
        this.f20489a = z10;
        this.f20504j = iVar;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
        byteBufferAllocate.order(z10 ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
        this.f20490b = iVar.n(byteBufferAllocate, 16L);
        this.f20491c = iVar.q(byteBufferAllocate, 32L);
        this.f20492d = iVar.q(byteBufferAllocate, 40L);
        this.f20493e = iVar.n(byteBufferAllocate, 54L);
        this.f20494f = iVar.n(byteBufferAllocate, 56L);
        this.f20495g = iVar.n(byteBufferAllocate, 58L);
        this.f20496h = iVar.n(byteBufferAllocate, 60L);
        this.f20497i = iVar.n(byteBufferAllocate, 62L);
    }

    @Override // l7.d
    public c a(long j10, int i10) {
        return new b(this.f20504j, this, j10, i10);
    }

    @Override // l7.d
    public e b(long j10) {
        return new k(this.f20504j, this, j10);
    }

    @Override // l7.d
    public f c(int i10) {
        return new m(this.f20504j, this, i10);
    }
}
