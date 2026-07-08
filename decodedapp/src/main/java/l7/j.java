package l7;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes.dex */
public class j extends e {
    public j(i iVar, d dVar, long j10) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
        byteBufferAllocate.order(dVar.f20489a ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
        long j11 = dVar.f20491c + (j10 * ((long) dVar.f20493e));
        this.f20498a = iVar.s(byteBufferAllocate, j11);
        this.f20499b = iVar.s(byteBufferAllocate, 4 + j11);
        this.f20500c = iVar.s(byteBufferAllocate, 8 + j11);
        this.f20501d = iVar.s(byteBufferAllocate, j11 + 20);
    }
}
