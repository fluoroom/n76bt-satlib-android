package zh;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes3.dex */
public abstract class g {
    public static e a(Bitmap bitmap, int i10) {
        if (i10 == 17) {
            return new a(bitmap);
        }
        if (i10 == 20) {
            return new c(bitmap);
        }
        if (i10 == 842094169) {
            return new d(bitmap);
        }
        if (i10 == 1345336372) {
            return new b(bitmap);
        }
        throw new IllegalArgumentException("Only support YV12, NV21, YUY2 and YUV440P");
    }
}
