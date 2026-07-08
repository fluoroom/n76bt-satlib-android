package r2;

import android.graphics.Bitmap;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes.dex */
public class j extends g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final byte[] f25360b = "com.bumptech.glide.load.resource.bitmap.CenterCrop".getBytes(i2.f.f15750a);

    @Override // i2.f
    public void a(MessageDigest messageDigest) {
        messageDigest.update(f25360b);
    }

    @Override // r2.g
    protected Bitmap c(l2.d dVar, Bitmap bitmap, int i10, int i11) {
        return i0.b(dVar, bitmap, i10, i11);
    }

    @Override // i2.f
    public boolean equals(Object obj) {
        return obj instanceof j;
    }

    @Override // i2.f
    public int hashCode() {
        return -599754482;
    }
}
