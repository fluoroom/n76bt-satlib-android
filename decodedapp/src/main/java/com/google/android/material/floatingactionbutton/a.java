package com.google.android.material.floatingactionbutton;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import m9.l;
import m9.m;

/* JADX INFO: loaded from: classes3.dex */
class a extends Drawable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Paint f7861b;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    float f7867h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f7868i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f7869j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f7870k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f7871l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f7872m;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private l f7874o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private ColorStateList f7875p;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final m f7860a = m.l();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Path f7862c = new Path();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Rect f7863d = new Rect();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final RectF f7864e = new RectF();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final RectF f7865f = new RectF();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final b f7866g = new b();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f7873n = true;

    private class b extends Drawable.ConstantState {
        private b() {
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return a.this;
        }
    }

    a(l lVar) {
        this.f7874o = lVar;
        Paint paint = new Paint(1);
        this.f7861b = paint;
        paint.setStyle(Paint.Style.STROKE);
    }

    private Shader a() {
        copyBounds(this.f7863d);
        float fHeight = this.f7867h / r1.height();
        return new LinearGradient(0.0f, r1.top, 0.0f, r1.bottom, new int[]{d0.a.g(this.f7868i, this.f7872m), d0.a.g(this.f7869j, this.f7872m), d0.a.g(d0.a.k(this.f7869j, 0), this.f7872m), d0.a.g(d0.a.k(this.f7871l, 0), this.f7872m), d0.a.g(this.f7871l, this.f7872m), d0.a.g(this.f7870k, this.f7872m)}, new float[]{0.0f, fHeight, 0.5f, 0.5f, 1.0f - fHeight, 1.0f}, Shader.TileMode.CLAMP);
    }

    protected RectF b() {
        this.f7865f.set(getBounds());
        return this.f7865f;
    }

    void c(ColorStateList colorStateList) {
        if (colorStateList != null) {
            this.f7872m = colorStateList.getColorForState(getState(), this.f7872m);
        }
        this.f7875p = colorStateList;
        this.f7873n = true;
        invalidateSelf();
    }

    public void d(float f10) {
        if (this.f7867h != f10) {
            this.f7867h = f10;
            this.f7861b.setStrokeWidth(f10 * 1.3333f);
            this.f7873n = true;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (this.f7873n) {
            this.f7861b.setShader(a());
            this.f7873n = false;
        }
        float strokeWidth = this.f7861b.getStrokeWidth() / 2.0f;
        copyBounds(this.f7863d);
        this.f7864e.set(this.f7863d);
        float fMin = Math.min(this.f7874o.r().a(b()), this.f7864e.width() / 2.0f);
        if (this.f7874o.v(b())) {
            this.f7864e.inset(strokeWidth, strokeWidth);
            canvas.drawRoundRect(this.f7864e, fMin, fMin, this.f7861b);
        }
    }

    void e(int i10, int i11, int i12, int i13) {
        this.f7868i = i10;
        this.f7869j = i11;
        this.f7870k = i12;
        this.f7871l = i13;
    }

    public void f(l lVar) {
        this.f7874o = lVar;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.f7866g;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.f7867h > 0.0f ? -3 : -2;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        if (this.f7874o.v(b())) {
            outline.setRoundRect(getBounds(), this.f7874o.r().a(b()));
        } else {
            copyBounds(this.f7863d);
            this.f7864e.set(this.f7863d);
            this.f7860a.d(this.f7874o, 1.0f, this.f7864e, this.f7862c);
            com.google.android.material.drawable.c.j(outline, this.f7862c);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        if (!this.f7874o.v(b())) {
            return true;
        }
        int iRound = Math.round(this.f7867h);
        rect.set(iRound, iRound, iRound, iRound);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList = this.f7875p;
        return (colorStateList != null && colorStateList.isStateful()) || super.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        this.f7873n = true;
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        int colorForState;
        ColorStateList colorStateList = this.f7875p;
        if (colorStateList != null && (colorForState = colorStateList.getColorForState(iArr, this.f7872m)) != this.f7872m) {
            this.f7873n = true;
            this.f7872m = colorForState;
        }
        if (this.f7873n) {
            invalidateSelf();
        }
        return this.f7873n;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        this.f7861b.setAlpha(i10);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f7861b.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
