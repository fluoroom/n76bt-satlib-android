package r2;

import android.graphics.ImageDecoder;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class i implements i2.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e f25354a = new e();

    @Override // i2.j
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public k2.v b(ByteBuffer byteBuffer, int i10, int i11, i2.h hVar) {
        return this.f25354a.c(ImageDecoder.createSource(byteBuffer), i10, i11, hVar);
    }

    @Override // i2.j
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(ByteBuffer byteBuffer, i2.h hVar) {
        return true;
    }
}
