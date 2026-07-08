package androidx.appcompat.graphics.drawable;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import h.i;
import h.j;

/* JADX INFO: loaded from: classes.dex */
public class d extends Drawable {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final float f1072m = (float) Math.toRadians(45.0d);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Paint f1073a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f1074b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f1075c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f1076d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f1077e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f1078f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Path f1079g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f1080h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f1081i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private float f1082j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private float f1083k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f1084l;

    public d(Context context) {
        Paint paint = new Paint();
        this.f1073a = paint;
        this.f1079g = new Path();
        this.f1081i = false;
        this.f1084l = 2;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeJoin(Paint.Join.MITER);
        paint.setStrokeCap(Paint.Cap.BUTT);
        paint.setAntiAlias(true);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, j.f14921b1, h.a.Z, i.f14907b);
        c(typedArrayObtainStyledAttributes.getColor(j.f14945f1, 0));
        b(typedArrayObtainStyledAttributes.getDimension(j.f14968j1, 0.0f));
        f(typedArrayObtainStyledAttributes.getBoolean(j.f14963i1, true));
        d(Math.round(typedArrayObtainStyledAttributes.getDimension(j.f14957h1, 0.0f)));
        this.f1080h = typedArrayObtainStyledAttributes.getDimensionPixelSize(j.f14951g1, 0);
        this.f1075c = Math.round(typedArrayObtainStyledAttributes.getDimension(j.f14939e1, 0.0f));
        this.f1074b = Math.round(typedArrayObtainStyledAttributes.getDimension(j.f14927c1, 0.0f));
        this.f1076d = typedArrayObtainStyledAttributes.getDimension(j.f14933d1, 0.0f);
        typedArrayObtainStyledAttributes.recycle();
    }

    private static float a(float f10, float f11, float f12) {
        return f10 + ((f11 - f10) * f12);
    }

    public void b(float f10) {
        if (this.f1073a.getStrokeWidth() != f10) {
            this.f1073a.setStrokeWidth(f10);
            this.f1083k = (float) (((double) (f10 / 2.0f)) * Math.cos(f1072m));
            invalidateSelf();
        }
    }

    public void c(int i10) {
        if (i10 != this.f1073a.getColor()) {
            this.f1073a.setColor(i10);
            invalidateSelf();
        }
    }

    public void d(float f10) {
        if (f10 != this.f1077e) {
            this.f1077e = f10;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        int i10 = this.f1084l;
        boolean z10 = false;
        if (i10 != 0 && (i10 == 1 || (i10 == 3 ? e0.a.f(this) == 0 : e0.a.f(this) == 1))) {
            z10 = true;
        }
        float f10 = this.f1074b;
        float fA = a(this.f1075c, (float) Math.sqrt(f10 * f10 * 2.0f), this.f1082j);
        float fA2 = a(this.f1075c, this.f1076d, this.f1082j);
        float fRound = Math.round(a(0.0f, this.f1083k, this.f1082j));
        float fA3 = a(0.0f, f1072m, this.f1082j);
        float fA4 = a(z10 ? 0.0f : -180.0f, z10 ? 180.0f : 0.0f, this.f1082j);
        double d10 = fA;
        double d11 = fA3;
        boolean z11 = z10;
        float fRound2 = Math.round(Math.cos(d11) * d10);
        float fRound3 = Math.round(d10 * Math.sin(d11));
        this.f1079g.rewind();
        float fA5 = a(this.f1077e + this.f1073a.getStrokeWidth(), -this.f1083k, this.f1082j);
        float f11 = (-fA2) / 2.0f;
        this.f1079g.moveTo(f11 + fRound, 0.0f);
        this.f1079g.rLineTo(fA2 - (fRound * 2.0f), 0.0f);
        this.f1079g.moveTo(f11, fA5);
        this.f1079g.rLineTo(fRound2, fRound3);
        this.f1079g.moveTo(f11, -fA5);
        this.f1079g.rLineTo(fRound2, -fRound3);
        this.f1079g.close();
        canvas.save();
        float strokeWidth = this.f1073a.getStrokeWidth();
        float fHeight = bounds.height() - (3.0f * strokeWidth);
        canvas.translate(bounds.centerX(), ((((int) (fHeight - (r5 * 2.0f))) / 4) * 2) + (strokeWidth * 1.5f) + this.f1077e);
        if (this.f1078f) {
            canvas.rotate(fA4 * (this.f1081i ^ z11 ? -1 : 1));
        } else if (z11) {
            canvas.rotate(180.0f);
        }
        canvas.drawPath(this.f1079g, this.f1073a);
        canvas.restore();
    }

    public void e(float f10) {
        if (this.f1082j != f10) {
            this.f1082j = f10;
            invalidateSelf();
        }
    }

    public void f(boolean z10) {
        if (this.f1078f != z10) {
            this.f1078f = z10;
            invalidateSelf();
        }
    }

    public void g(boolean z10) {
        if (this.f1081i != z10) {
            this.f1081i = z10;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f1080h;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f1080h;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        if (i10 != this.f1073a.getAlpha()) {
            this.f1073a.setAlpha(i10);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f1073a.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
