package r2;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.util.Log;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class e implements i2.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final l2.d f25337a = new l2.e();

    @Override // i2.j
    public /* bridge */ /* synthetic */ boolean a(Object obj, i2.h hVar) {
        return d(d.a(obj), hVar);
    }

    @Override // i2.j
    public /* bridge */ /* synthetic */ k2.v b(Object obj, int i10, int i11, i2.h hVar) {
        return c(d.a(obj), i10, i11, hVar);
    }

    public k2.v c(ImageDecoder.Source source, int i10, int i11, i2.h hVar) throws IOException {
        Bitmap bitmapDecodeBitmap = ImageDecoder.decodeBitmap(source, new q2.c(i10, i11, hVar));
        if (Log.isLoggable("BitmapImageDecoder", 2)) {
            Log.v("BitmapImageDecoder", "Decoded [" + bitmapDecodeBitmap.getWidth() + "x" + bitmapDecodeBitmap.getHeight() + "] for [" + i10 + "x" + i11 + "]");
        }
        return new f(bitmapDecodeBitmap, this.f25337a);
    }

    public boolean d(ImageDecoder.Source source, i2.h hVar) {
        return true;
    }
}
