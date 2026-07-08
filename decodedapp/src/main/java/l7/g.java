package l7;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes.dex */
public class g extends d {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final i f20503j;

    public g(boolean z10, i iVar) {
        this.f20489a = z10;
        this.f20503j = iVar;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
        byteBufferAllocate.order(z10 ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
        this.f20490b = iVar.n(byteBufferAllocate, 16L);
        this.f20491c = iVar.s(byteBufferAllocate, 28L);
        this.f20492d = iVar.s(byteBufferAllocate, 32L);
        this.f20493e = iVar.n(byteBufferAllocate, 42L);
        this.f20494f = iVar.n(byteBufferAllocate, 44L);
        this.f20495g = iVar.n(byteBufferAllocate, 46L);
        this.f20496h = iVar.n(byteBufferAllocate, 48L);
        this.f20497i = iVar.n(byteBufferAllocate, 50L);
    }

    @Override // l7.d
    public c a(long j10, int i10) {
        return new a(this.f20503j, this, j10, i10);
    }

    @Override // l7.d
    public e b(long j10) {
        return new j(this.f20503j, this, j10);
    }

    @Override // l7.d
    public f c(int i10) {
        return new l(this.f20503j, this, i10);
    }
}
