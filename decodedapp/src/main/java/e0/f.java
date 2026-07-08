package e0;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes.dex */
final class f extends Drawable.ConstantState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    int f11330a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Drawable.ConstantState f11331b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    ColorStateList f11332c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    PorterDuff.Mode f11333d;

    f(f fVar) {
        this.f11332c = null;
        this.f11333d = d.f11322g;
        if (fVar != null) {
            this.f11330a = fVar.f11330a;
            this.f11331b = fVar.f11331b;
            this.f11332c = fVar.f11332c;
            this.f11333d = fVar.f11333d;
        }
    }

    boolean a() {
        return this.f11331b != null;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        int i10 = this.f11330a;
        Drawable.ConstantState constantState = this.f11331b;
        return i10 | (constantState != null ? constantState.getChangingConfigurations() : 0);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable() {
        return newDrawable(null);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable(Resources resources) {
        return new e(this, resources);
    }
}
