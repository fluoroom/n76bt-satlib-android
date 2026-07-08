package w2;

import android.graphics.Bitmap;
import i2.h;
import java.io.ByteArrayOutputStream;
import k2.v;

/* JADX INFO: loaded from: classes.dex */
public class a implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Bitmap.CompressFormat f31065a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f31066b;

    public a() {
        this(Bitmap.CompressFormat.JPEG, 100);
    }

    @Override // w2.e
    public v a(v vVar, h hVar) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ((Bitmap) vVar.get()).compress(this.f31065a, this.f31066b, byteArrayOutputStream);
        vVar.c();
        return new s2.b(byteArrayOutputStream.toByteArray());
    }

    public a(Bitmap.CompressFormat compressFormat, int i10) {
        this.f31065a = compressFormat;
        this.f31066b = i10;
    }
}
