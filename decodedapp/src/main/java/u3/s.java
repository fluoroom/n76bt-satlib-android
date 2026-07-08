package u3;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;

/* JADX INFO: loaded from: classes.dex */
public abstract class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Paint f28035a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final RectF f28036b;

    static {
        Paint paint = new Paint(1);
        f28035a = paint;
        paint.setColor(16777215);
        f28036b = new RectF();
    }

    public static void a(Canvas canvas, RectF rectF, int i10, float f10) {
        Paint paint = f28035a;
        paint.setShadowLayer(0.6f * f10, 0.0f, 0.3f * f10, 1140850688);
        float f11 = f10 * 0.2f;
        RectF rectF2 = f28036b;
        rectF2.set(rectF);
        rectF2.top -= f11;
        rectF2.bottom += f11;
        rectF2.right += f11;
        rectF2.left -= f11;
        float f12 = i10;
        canvas.drawRoundRect(rectF2, f12, f12, paint);
    }
}
