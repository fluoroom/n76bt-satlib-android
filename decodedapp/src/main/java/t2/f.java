package t2;

import android.graphics.drawable.Drawable;
import k2.v;

/* JADX INFO: loaded from: classes.dex */
final class f extends e {
    private f(Drawable drawable) {
        super(drawable);
    }

    static v f(Drawable drawable) {
        if (drawable != null) {
            return new f(drawable);
        }
        return null;
    }

    @Override // k2.v
    public int a() {
        return Math.max(1, this.f27460a.getIntrinsicWidth() * this.f27460a.getIntrinsicHeight() * 4);
    }

    @Override // k2.v
    public Class d() {
        return this.f27460a.getClass();
    }

    @Override // k2.v
    public void c() {
    }
}
