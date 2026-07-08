package androidx.cardview.widget;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes.dex */
class d extends Drawable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f1341a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final RectF f1343c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Rect f1344d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f1345e;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private ColorStateList f1348h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private PorterDuffColorFilter f1349i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private ColorStateList f1350j;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f1346f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f1347g = true;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private PorterDuff.Mode f1351k = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Paint f1342b = new Paint(5);

    d(ColorStateList colorStateList, float f10) {
        this.f1341a = f10;
        e(colorStateList);
        this.f1343c = new RectF();
        this.f1344d = new Rect();
    }

    private PorterDuffColorFilter a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    private void e(ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.f1348h = colorStateList;
        this.f1342b.setColor(colorStateList.getColorForState(getState(), this.f1348h.getDefaultColor()));
    }

    private void i(Rect rect) {
        if (rect == null) {
            rect = getBounds();
        }
        this.f1343c.set(rect.left, rect.top, rect.right, rect.bottom);
        this.f1344d.set(rect);
        if (this.f1346f) {
            this.f1344d.inset((int) Math.ceil(e.a(this.f1345e, this.f1341a, this.f1347g)), (int) Math.ceil(e.b(this.f1345e, this.f1341a, this.f1347g)));
            this.f1343c.set(this.f1344d);
        }
    }

    public ColorStateList b() {
        return this.f1348h;
    }

    float c() {
        return this.f1345e;
    }

    public float d() {
        return this.f1341a;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        boolean z10;
        Paint paint = this.f1342b;
        if (this.f1349i == null || paint.getColorFilter() != null) {
            z10 = false;
        } else {
            paint.setColorFilter(this.f1349i);
            z10 = true;
        }
        RectF rectF = this.f1343c;
        float f10 = this.f1341a;
        canvas.drawRoundRect(rectF, f10, f10, paint);
        if (z10) {
            paint.setColorFilter(null);
        }
    }

    public void f(ColorStateList colorStateList) {
        e(colorStateList);
        invalidateSelf();
    }

    void g(float f10, boolean z10, boolean z11) {
        if (f10 == this.f1345e && this.f1346f == z10 && this.f1347g == z11) {
            return;
        }
        this.f1345e = f10;
        this.f1346f = z10;
        this.f1347g = z11;
        i(null);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        outline.setRoundRect(this.f1344d, this.f1341a);
    }

    void h(float f10) {
        if (f10 == this.f1341a) {
            return;
        }
        this.f1341a = f10;
        i(null);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList = this.f1350j;
        if (colorStateList != null && colorStateList.isStateful()) {
            return true;
        }
        ColorStateList colorStateList2 = this.f1348h;
        return (colorStateList2 != null && colorStateList2.isStateful()) || super.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        i(rect);
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        ColorStateList colorStateList = this.f1348h;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        boolean z10 = colorForState != this.f1342b.getColor();
        if (z10) {
            this.f1342b.setColor(colorForState);
        }
        ColorStateList colorStateList2 = this.f1350j;
        if (colorStateList2 == null || (mode = this.f1351k) == null) {
            return z10;
        }
        this.f1349i = a(colorStateList2, mode);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        this.f1342b.setAlpha(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f1342b.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f1350j = colorStateList;
        this.f1349i = a(colorStateList, this.f1351k);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        this.f1351k = mode;
        this.f1349i = a(this.f1350j, mode);
        invalidateSelf();
    }
}
