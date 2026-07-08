package p3;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Outline;
import android.graphics.Rect;
import android.view.Gravity;

/* JADX INFO: loaded from: classes.dex */
class c extends d {
    protected c(Resources resources, Bitmap bitmap) {
        super(resources, bitmap);
    }

    @Override // p3.d
    void c(int i10, int i11, int i12, Rect rect, Rect rect2) {
        Gravity.apply(i10, i11, i12, rect, rect2, 0);
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        f();
        if (this.f23899m) {
            outline.setOval(this.f23894h);
        } else {
            outline.setRoundRect(this.f23894h, b());
        }
    }
}
