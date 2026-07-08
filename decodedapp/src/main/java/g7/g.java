package g7;

import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public class g extends h0 {
    public g() {
        super(ByteBuffer.class);
    }

    @Override // g7.i0, p6.p
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public void f(ByteBuffer byteBuffer, e6.g gVar, p6.d0 d0Var) throws IOException {
        if (byteBuffer.hasArray()) {
            int iPosition = byteBuffer.position();
            gVar.x0(byteBuffer.array(), byteBuffer.arrayOffset() + iPosition, byteBuffer.limit() - iPosition);
            return;
        }
        ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        if (byteBufferAsReadOnlyBuffer.position() > 0) {
            byteBufferAsReadOnlyBuffer.rewind();
        }
        i7.f fVar = new i7.f(byteBufferAsReadOnlyBuffer);
        gVar.u0(fVar, byteBufferAsReadOnlyBuffer.remaining());
        fVar.close();
    }
}
