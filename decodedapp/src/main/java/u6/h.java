package u6;

import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public class h extends g0 {
    protected h() {
        super(ByteBuffer.class);
    }

    @Override // p6.l
    /* JADX INFO: renamed from: e1, reason: merged with bridge method [inline-methods] */
    public ByteBuffer e(e6.j jVar, p6.h hVar) {
        return ByteBuffer.wrap(jVar.s());
    }

    @Override // u6.g0, p6.l
    /* JADX INFO: renamed from: f1, reason: merged with bridge method [inline-methods] */
    public ByteBuffer f(e6.j jVar, p6.h hVar, ByteBuffer byteBuffer) throws IOException {
        i7.g gVar = new i7.g(byteBuffer);
        jVar.a1(hVar.b0(), gVar);
        gVar.close();
        return byteBuffer;
    }

    @Override // u6.g0, p6.l
    public h7.c r() {
        return h7.c.Binary;
    }
}
