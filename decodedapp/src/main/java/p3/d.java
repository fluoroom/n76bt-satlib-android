package p3;

import a6.k;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* JADX INFO: loaded from: classes.dex */
public abstract class d extends Drawable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    Bitmap f23887a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f23888b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private BitmapShader f23891e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float f23892f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float f23893g;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f23897k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f23898l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    boolean f23899m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private ImageView.ScaleType f23900n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private Matrix f23901o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private RectF f23902p;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f23889c = 119;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Paint f23890d = new Paint(6);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final Rect f23894h = new Rect();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final RectF f23895i = new RectF();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f23896j = true;

    d(Resources resources, Bitmap bitmap) {
        this.f23888b = 160;
        if (resources != null) {
            this.f23888b = resources.getDisplayMetrics().densityDpi;
        }
        this.f23887a = bitmap;
        if (bitmap == null) {
            this.f23898l = -1;
            this.f23897k = -1;
        } else {
            a();
            Bitmap bitmap2 = this.f23887a;
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            this.f23891e = new BitmapShader(bitmap2, tileMode, tileMode);
        }
    }

    private void a() {
        this.f23897k = this.f23887a.getScaledWidth(this.f23888b);
        this.f23898l = this.f23887a.getScaledHeight(this.f23888b);
    }

    private static boolean d(float f10) {
        return Float.compare(f10, 0.0f) > 0;
    }

    public float b() {
        return this.f23892f;
    }

    abstract void c(int i10, int i11, int i12, Rect rect, Rect rect2);

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Bitmap bitmap = this.f23887a;
        if (bitmap == null) {
            return;
        }
        f();
        Paint paint = this.f23890d;
        if (paint.getShader() == null) {
            canvas.drawBitmap(bitmap, (Rect) null, this.f23894h, paint);
            return;
        }
        Matrix matrix = this.f23901o;
        if (matrix != null) {
            canvas.save();
            RectF rectF = this.f23902p;
            if (rectF != null) {
                canvas.clipRect(rectF);
            }
            canvas.concat(matrix);
        }
        if (this.f23899m) {
            canvas.drawOval(this.f23895i, paint);
        } else {
            canvas.drawRoundRect(this.f23895i, this.f23892f, this.f23893g, paint);
        }
        if (matrix != null) {
            canvas.restore();
        }
    }

    public void e(boolean z10) {
        this.f23899m = z10;
        if (z10) {
            this.f23890d.setShader(this.f23891e);
        } else {
            this.f23890d.setShader(null);
        }
    }

    void f() {
        if (this.f23896j) {
            this.f23901o = null;
            this.f23902p = null;
            c(this.f23889c, this.f23897k, this.f23898l, getBounds(), this.f23894h);
            this.f23895i.set(this.f23894h);
            if (this.f23899m && this.f23900n != null) {
                this.f23901o = k.l(this.f23897k, this.f23898l, this.f23894h.width(), this.f23894h.height(), this.f23900n);
                RectF rectF = new RectF(0.0f, 0.0f, this.f23897k, this.f23898l);
                this.f23902p = rectF;
                Matrix matrix = this.f23901o;
                if (matrix != null) {
                    matrix.mapRect(rectF);
                    Matrix matrix2 = new Matrix();
                    if (this.f23901o.invert(matrix2)) {
                        matrix2.mapRect(this.f23895i);
                    }
                }
            }
            this.f23896j = false;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f23890d.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        return this.f23890d.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f23898l;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f23897k;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Bitmap bitmap;
        return (this.f23889c != 119 || (bitmap = this.f23887a) == null || bitmap.hasAlpha() || this.f23890d.getAlpha() < 255 || d(this.f23892f) || d(this.f23893g)) ? -3 : -1;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        if (i10 != this.f23890d.getAlpha()) {
            this.f23890d.setAlpha(i10);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f23890d.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z10) {
        this.f23890d.setDither(z10);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean z10) {
        this.f23890d.setFilterBitmap(z10);
        invalidateSelf();
    }
}
