package com.google.android.material.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import androidx.appcompat.widget.LinearLayoutCompat;

/* JADX INFO: loaded from: classes3.dex */
public abstract class d extends LinearLayoutCompat {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Drawable f7997a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Rect f7998b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Rect f7999c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f8000d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected boolean f8001e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    boolean f8002f;

    public d(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f7998b = new Rect();
        this.f7999c = new Rect();
        this.f8000d = 119;
        this.f8001e = true;
        this.f8002f = false;
        TypedArray typedArrayI = m.i(context, attributeSet, u8.l.Y1, i10, 0, new int[0]);
        this.f8000d = typedArrayI.getInt(u8.l.f28754a2, this.f8000d);
        Drawable drawable = typedArrayI.getDrawable(u8.l.Z1);
        if (drawable != null) {
            setForeground(drawable);
        }
        this.f8001e = typedArrayI.getBoolean(u8.l.f28764b2, true);
        typedArrayI.recycle();
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        Drawable drawable = this.f7997a;
        if (drawable != null) {
            if (this.f8002f) {
                this.f8002f = false;
                Rect rect = this.f7998b;
                Rect rect2 = this.f7999c;
                int right = getRight() - getLeft();
                int bottom = getBottom() - getTop();
                if (this.f8001e) {
                    rect.set(0, 0, right, bottom);
                } else {
                    rect.set(getPaddingLeft(), getPaddingTop(), right - getPaddingRight(), bottom - getPaddingBottom());
                }
                Gravity.apply(this.f8000d, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), rect, rect2);
                drawable.setBounds(rect2);
            }
            drawable.draw(canvas);
        }
    }

    @Override // android.view.View
    public void drawableHotspotChanged(float f10, float f11) {
        super.drawableHotspotChanged(f10, f11);
        Drawable drawable = this.f7997a;
        if (drawable != null) {
            drawable.setHotspot(f10, f11);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f7997a;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        this.f7997a.setState(getDrawableState());
    }

    @Override // android.view.View
    public Drawable getForeground() {
        return this.f7997a;
    }

    @Override // android.view.View
    public int getForegroundGravity() {
        return this.f8000d;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f7997a;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.f8002f = z10 | this.f8002f;
    }

    @Override // android.view.View
    protected void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        this.f8002f = true;
    }

    @Override // android.view.View
    public void setForeground(Drawable drawable) {
        Drawable drawable2 = this.f7997a;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
                unscheduleDrawable(this.f7997a);
            }
            this.f7997a = drawable;
            this.f8002f = true;
            if (drawable != null) {
                setWillNotDraw(false);
                drawable.setCallback(this);
                if (drawable.isStateful()) {
                    drawable.setState(getDrawableState());
                }
                if (this.f8000d == 119) {
                    drawable.getPadding(new Rect());
                }
            } else {
                setWillNotDraw(true);
            }
            requestLayout();
            invalidate();
        }
    }

    @Override // android.view.View
    public void setForegroundGravity(int i10) {
        if (this.f8000d != i10) {
            if ((8388615 & i10) == 0) {
                i10 |= 8388611;
            }
            if ((i10 & 112) == 0) {
                i10 |= 48;
            }
            this.f8000d = i10;
            if (i10 == 119 && this.f7997a != null) {
                this.f7997a.getPadding(new Rect());
            }
            requestLayout();
        }
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f7997a;
    }
}
