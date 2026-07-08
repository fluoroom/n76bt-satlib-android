package r2;

import android.content.Context;
import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes.dex */
public abstract class g implements i2.l {
    @Override // i2.l
    public final k2.v b(Context context, k2.v vVar, int i10, int i11) {
        if (!e3.l.t(i10, i11)) {
            throw new IllegalArgumentException("Cannot apply transformation on width: " + i10 + " or height: " + i11 + " less than or equal to zero and not Target.SIZE_ORIGINAL");
        }
        l2.d dVarF = com.bumptech.glide.c.c(context).f();
        Bitmap bitmap = (Bitmap) vVar.get();
        if (i10 == Integer.MIN_VALUE) {
            i10 = bitmap.getWidth();
        }
        if (i11 == Integer.MIN_VALUE) {
            i11 = bitmap.getHeight();
        }
        Bitmap bitmapC = c(dVarF, bitmap, i10, i11);
        return bitmap.equals(bitmapC) ? vVar : f.f(bitmapC, dVarF);
    }

    protected abstract Bitmap c(l2.d dVar, Bitmap bitmap, int i10, int i11);
}
