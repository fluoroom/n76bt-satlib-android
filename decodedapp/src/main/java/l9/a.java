package l9;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;

/* JADX INFO: loaded from: classes3.dex */
public class a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int[] f20511i = new int[3];

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final float[] f20512j = {0.0f, 0.5f, 1.0f};

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final int[] f20513k = new int[4];

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final float[] f20514l = {0.0f, 0.0f, 0.5f, 1.0f};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Paint f20515a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Paint f20516b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Paint f20517c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f20518d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f20519e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f20520f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Path f20521g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Paint f20522h;

    public a() {
        this(-16777216);
    }

    public void a(Canvas canvas, Matrix matrix, RectF rectF, int i10, float f10, float f11) {
        float f12;
        boolean z10 = f11 < 0.0f;
        Path path = this.f20521g;
        if (z10) {
            int[] iArr = f20513k;
            iArr[0] = 0;
            iArr[1] = this.f20520f;
            iArr[2] = this.f20519e;
            iArr[3] = this.f20518d;
            f12 = f10;
        } else {
            path.rewind();
            path.moveTo(rectF.centerX(), rectF.centerY());
            f12 = f10;
            path.arcTo(rectF, f12, f11);
            path.close();
            float f13 = -i10;
            rectF.inset(f13, f13);
            int[] iArr2 = f20513k;
            iArr2[0] = 0;
            iArr2[1] = this.f20518d;
            iArr2[2] = this.f20519e;
            iArr2[3] = this.f20520f;
        }
        float fWidth = rectF.width() / 2.0f;
        if (fWidth <= 0.0f) {
            return;
        }
        float f14 = 1.0f - (i10 / fWidth);
        float[] fArr = f20514l;
        fArr[1] = f14;
        fArr[2] = ((1.0f - f14) / 2.0f) + f14;
        this.f20516b.setShader(new RadialGradient(rectF.centerX(), rectF.centerY(), fWidth, f20513k, fArr, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix);
        canvas.scale(1.0f, rectF.height() / rectF.width());
        if (!z10) {
            canvas.clipPath(path, Region.Op.DIFFERENCE);
            canvas.drawPath(path, this.f20522h);
        }
        canvas.drawArc(rectF, f12, f11, true, this.f20516b);
        canvas.restore();
    }

    public void b(Canvas canvas, Matrix matrix, RectF rectF, int i10) {
        rectF.bottom += i10;
        rectF.offset(0.0f, -i10);
        int[] iArr = f20511i;
        iArr[0] = this.f20520f;
        iArr[1] = this.f20519e;
        iArr[2] = this.f20518d;
        Paint paint = this.f20517c;
        float f10 = rectF.left;
        paint.setShader(new LinearGradient(f10, rectF.top, f10, rectF.bottom, iArr, f20512j, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix);
        canvas.drawRect(rectF, this.f20517c);
        canvas.restore();
    }

    public Paint c() {
        return this.f20515a;
    }

    public void d(int i10) {
        this.f20518d = d0.a.k(i10, 68);
        this.f20519e = d0.a.k(i10, 20);
        this.f20520f = d0.a.k(i10, 0);
        this.f20515a.setColor(this.f20518d);
    }

    public a(int i10) {
        this.f20521g = new Path();
        Paint paint = new Paint();
        this.f20522h = paint;
        this.f20515a = new Paint();
        d(i10);
        paint.setColor(0);
        Paint paint2 = new Paint(4);
        this.f20516b = paint2;
        paint2.setStyle(Paint.Style.FILL);
        this.f20517c = new Paint(paint2);
    }
}
