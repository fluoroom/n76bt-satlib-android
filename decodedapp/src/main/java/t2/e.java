package t2;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import e3.k;
import k2.r;
import k2.v;

/* JADX INFO: loaded from: classes.dex */
public abstract class e implements v, r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final Drawable f27460a;

    public e(Drawable drawable) {
        this.f27460a = (Drawable) k.e(drawable);
    }

    @Override // k2.r
    public void b() {
        Drawable drawable = this.f27460a;
        if (drawable instanceof BitmapDrawable) {
            ((BitmapDrawable) drawable).getBitmap().prepareToDraw();
        } else if (drawable instanceof v2.c) {
            ((v2.c) drawable).e().prepareToDraw();
        }
    }

    @Override // k2.v
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public final Drawable get() {
        Drawable.ConstantState constantState = this.f27460a.getConstantState();
        return constantState == null ? this.f27460a : constantState.newDrawable();
    }
}
