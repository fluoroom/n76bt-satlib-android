package p3;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Handler;

/* JADX INFO: loaded from: classes.dex */
public class b extends Drawable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Paint f23875a;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f23880f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private a f23881g;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f23884j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int[] f23885k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int[] f23886l;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Runnable f23876b = new Runnable() { // from class: p3.a
        @Override // java.lang.Runnable
        public final void run() {
            this.f23874a.invalidateSelf();
        }
    };

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f23877c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f23878d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f23879e = 16;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f23882h = 100;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Handler f23883i = new Handler();

    public interface a {
        int w();
    }

    public b(a aVar) {
        Paint paint = new Paint(1);
        this.f23875a = paint;
        paint.setColor(-16711936);
        this.f23881g = aVar;
    }

    public void a(int i10) {
        this.f23875a.setColor(i10);
    }

    public void b(int[] iArr, int[] iArr2) {
        if ((iArr == null) != (iArr2 == null)) {
            throw new IllegalArgumentException("颜色数量和电平数量必须相同");
        }
        if (iArr == null) {
            this.f23885k = null;
            this.f23886l = null;
        }
        if (iArr.length != iArr2.length) {
            throw new IllegalArgumentException("颜色数量和电平数量必须相同");
        }
        this.f23885k = iArr;
        this.f23886l = iArr2;
        invalidateSelf();
    }

    public void c(int i10) {
        this.f23882h = i10;
    }

    public void d(a aVar) {
        if (this.f23881g == aVar) {
            return;
        }
        this.f23881g = aVar;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        a aVar = this.f23881g;
        if (aVar == null) {
            return;
        }
        if (this.f23882h == 0) {
            invalidateSelf();
        } else {
            this.f23883i.removeCallbacks(this.f23876b);
            this.f23883i.postDelayed(this.f23876b, this.f23882h);
        }
        Rect bounds = getBounds();
        int iSave = canvas.save();
        int iW = aVar.w();
        if (!this.f23880f) {
            this.f23877c = Math.max(iW, this.f23877c);
        }
        int i10 = this.f23882h;
        if (i10 != 0) {
            int i11 = this.f23878d;
            if (iW > i11) {
                this.f23878d = i11 + (((iW - i11) * i10) / 100);
            } else {
                this.f23878d = i11 - (((i11 - iW) * i10) / 100);
            }
            iW = this.f23878d;
        }
        float fLog10 = (float) Math.log10(this.f23877c);
        float fLog102 = (float) Math.log10(iW);
        canvas.translate(bounds.left, bounds.top);
        int i12 = this.f23884j;
        if (i12 == 0) {
            canvas.drawRect(0.0f, (int) ((bounds.height() * (fLog10 - fLog102)) / fLog10), bounds.width(), bounds.height(), this.f23875a);
        } else if (i12 == 1) {
            canvas.drawCircle(bounds.width() / 2, bounds.height() / 2, ((bounds.height() / 2) * fLog102) / fLog10, this.f23875a);
        } else if (i12 == 2) {
            int i13 = this.f23879e;
            float fWidth = bounds.width() / ((i13 * 2) - 1);
            int i14 = (iW * i13) / this.f23877c;
            if (i14 >= i13) {
                i14 = i13 - 1;
            }
            int i15 = i14;
            for (int i16 = 0; i16 <= i15; i16++) {
                if (this.f23885k != null) {
                    int i17 = (this.f23877c * i16) / i13;
                    int i18 = this.f23886l[0];
                    int i19 = 0;
                    while (true) {
                        int[] iArr = this.f23885k;
                        if (i19 >= iArr.length) {
                            break;
                        }
                        if (i17 >= iArr[i19]) {
                            i18 = this.f23886l[i19];
                        }
                        i19++;
                    }
                    this.f23875a.setColor(i18);
                }
                float f10 = i16 * 2 * fWidth;
                canvas.drawRect(f10, 0.0f, f10 + fWidth, bounds.height(), this.f23875a);
            }
        }
        canvas.restoreToCount(iSave);
    }

    public void e(int i10) {
        this.f23877c = i10;
        this.f23880f = i10 != 0;
    }

    public void f(int i10) {
        this.f23884j = i10;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        this.f23875a.setAlpha(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f23875a.setColorFilter(colorFilter);
    }
}
