package r2;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public class h implements i2.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final s f25349a;

    public h(s sVar) {
        this.f25349a = sVar;
    }

    @Override // i2.j
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public k2.v b(ByteBuffer byteBuffer, int i10, int i11, i2.h hVar) {
        return this.f25349a.f(byteBuffer, i10, i11, hVar);
    }

    @Override // i2.j
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(ByteBuffer byteBuffer, i2.h hVar) {
        return this.f25349a.q(byteBuffer);
    }
}
