package l7;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes.dex */
public class k extends e {
    public k(i iVar, d dVar, long j10) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
        byteBufferAllocate.order(dVar.f20489a ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
        long j11 = dVar.f20491c + (j10 * ((long) dVar.f20493e));
        this.f20498a = iVar.s(byteBufferAllocate, j11);
        this.f20499b = iVar.q(byteBufferAllocate, 8 + j11);
        this.f20500c = iVar.q(byteBufferAllocate, 16 + j11);
        this.f20501d = iVar.q(byteBufferAllocate, j11 + 40);
    }
}
