package r2;

import android.graphics.ImageDecoder;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public final class c0 implements i2.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e f25334a = new e();

    @Override // i2.j
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public k2.v b(InputStream inputStream, int i10, int i11, i2.h hVar) {
        return this.f25334a.c(ImageDecoder.createSource(e3.a.b(inputStream)), i10, i11, hVar);
    }

    @Override // i2.j
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(InputStream inputStream, i2.h hVar) {
        return true;
    }
}
