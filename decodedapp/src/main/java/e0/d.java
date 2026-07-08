package e0;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes.dex */
abstract class d extends Drawable implements Drawable.Callback, c, b {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static final PorterDuff.Mode f11322g = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f11323a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private PorterDuff.Mode f11324b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f11325c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    f f11326d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f11327e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    Drawable f11328f;

    d(f fVar, Resources resources) {
        this.f11326d = fVar;
        e(resources);
    }

    private f d() {
        return new f(this.f11326d);
    }

    private void e(Resources resources) {
        Drawable.ConstantState constantState;
        f fVar = this.f11326d;
        if (fVar == null || (constantState = fVar.f11331b) == null) {
            return;
        }
        a(constantState.newDrawable(resources));
    }

    private boolean f(int[] iArr) {
        if (!c()) {
            return false;
        }
        f fVar = this.f11326d;
        ColorStateList colorStateList = fVar.f11332c;
        PorterDuff.Mode mode = fVar.f11333d;
        if (colorStateList == null || mode == null) {
            this.f11325c = false;
            clearColorFilter();
        } else {
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (!this.f11325c || colorForState != this.f11323a || mode != this.f11324b) {
                setColorFilter(colorForState, mode);
                this.f11323a = colorForState;
                this.f11324b = mode;
                this.f11325c = true;
                return true;
            }
        }
        return false;
    }

    @Override // e0.c
    public final void a(Drawable drawable) {
        Drawable drawable2 = this.f11328f;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f11328f = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            setVisible(drawable.isVisible(), true);
            setState(drawable.getState());
            setLevel(drawable.getLevel());
            setBounds(drawable.getBounds());
            f fVar = this.f11326d;
            if (fVar != null) {
                fVar.f11331b = drawable.getConstantState();
            }
        }
        invalidateSelf();
    }

    @Override // e0.c
    public final Drawable b() {
        return this.f11328f;
    }

    protected abstract boolean c();

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        this.f11328f.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        int changingConfigurations = super.getChangingConfigurations();
        f fVar = this.f11326d;
        return changingConfigurations | (fVar != null ? fVar.getChangingConfigurations() : 0) | this.f11328f.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        f fVar = this.f11326d;
        if (fVar == null || !fVar.a()) {
            return null;
        }
        this.f11326d.f11330a = getChangingConfigurations();
        return this.f11326d;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable getCurrent() {
        return this.f11328f.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f11328f.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f11328f.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getLayoutDirection() {
        return a.f(this.f11328f);
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
        return this.f11328f.getMinimumHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
        return this.f11328f.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.f11328f.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        return this.f11328f.getPadding(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public int[] getState() {
        return this.f11328f.getState();
    }

    @Override // android.graphics.drawable.Drawable
    public Region getTransparentRegion() {
        return this.f11328f.getTransparentRegion();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        return a.h(this.f11328f);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        f fVar;
        ColorStateList colorStateList = (!c() || (fVar = this.f11326d) == null) ? null : fVar.f11332c;
        return (colorStateList != null && colorStateList.isStateful()) || this.f11328f.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        this.f11328f.jumpToCurrentState();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.f11327e && super.mutate() == this) {
            this.f11326d = d();
            Drawable drawable = this.f11328f;
            if (drawable != null) {
                drawable.mutate();
            }
            f fVar = this.f11326d;
            if (fVar != null) {
                Drawable drawable2 = this.f11328f;
                fVar.f11331b = drawable2 != null ? drawable2.getConstantState() : null;
            }
            this.f11327e = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        Drawable drawable = this.f11328f;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLayoutDirectionChanged(int i10) {
        return a.m(this.f11328f, i10);
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i10) {
        return this.f11328f.setLevel(i10);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
        scheduleSelf(runnable, j10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        this.f11328f.setAlpha(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z10) {
        a.j(this.f11328f, z10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setChangingConfigurations(int i10) {
        this.f11328f.setChangingConfigurations(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f11328f.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z10) {
        this.f11328f.setDither(z10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean z10) {
        this.f11328f.setFilterBitmap(z10);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setState(int[] iArr) {
        return f(iArr) || this.f11328f.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(int i10) {
        setTintList(ColorStateList.valueOf(i10));
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f11326d.f11332c = colorStateList;
        f(getState());
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        this.f11326d.f11333d = mode;
        f(getState());
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z10, boolean z11) {
        return super.setVisible(z10, z11) || this.f11328f.setVisible(z10, z11);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }

    d(Drawable drawable) {
        this.f11326d = d();
        a(drawable);
    }
}
