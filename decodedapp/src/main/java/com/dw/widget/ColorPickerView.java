package com.dw.widget;

import a6.k;
import android.content.Context;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.facebook.stetho.websocket.CloseCodes;
import k3.e;

/* JADX INFO: loaded from: classes.dex */
public class ColorPickerView extends View {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final int[] f6908w = {-65536, -256, -16711936, -16711681, -16776961, -65281, -65536};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f6909a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f6910b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    float[] f6911c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Rect f6912d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Rect f6913e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Rect f6914f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Rect f6915g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f6916h;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f6917r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private Rect f6918s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private Drawable f6919t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private Paint f6920u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private Paint f6921v;

    public interface a {
    }

    public ColorPickerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6911c = new float[3];
        this.f6920u = new Paint(1);
        b(context);
    }

    private void a(int i10, int i11, int i12) {
        if (i10 == 1) {
            Rect rect = this.f6915g;
            this.f6911c[0] = ((i11 - rect.left) / rect.width()) * 360.0f;
            c();
            this.f6917r = Color.HSVToColor(new float[]{this.f6911c[0], 1.0f, 1.0f});
            return;
        }
        if (i10 == 2) {
            Rect rect2 = this.f6914f;
            int i13 = i11 - rect2.left;
            int i14 = i12 - rect2.top;
            this.f6911c[2] = i13 / rect2.width();
            this.f6911c[1] = 1.0f - (i14 / rect2.height());
            c();
            return;
        }
        if (i10 != 3) {
            return;
        }
        Rect rect3 = this.f6918s;
        int i15 = i11 - rect3.left;
        if (i15 > rect3.width()) {
            this.f6909a |= -16777216;
        } else if (i15 < 0) {
            this.f6909a &= 16777215;
        } else {
            this.f6909a = (((i15 * 255) / rect3.width()) << 24) | (16777215 & this.f6909a);
        }
    }

    private void b(Context context) {
        Drawable drawable = context.getResources().getDrawable(e.f19176a);
        this.f6919t = drawable;
        if (drawable instanceof BitmapDrawable) {
            Shader.TileMode tileMode = Shader.TileMode.REPEAT;
            ((BitmapDrawable) drawable).setTileModeXY(tileMode, tileMode);
        }
        Paint paint = new Paint(1);
        this.f6921v = paint;
        paint.setColor(-1);
        this.f6921v.setStrokeWidth(k.b(context, 1.0f));
        if (isInEditMode()) {
            setColor(-1996488960);
        }
    }

    private void c() {
        this.f6909a = Color.HSVToColor(Color.alpha(this.f6909a), this.f6911c);
    }

    public int getColor() {
        return this.f6909a;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0146 A[PHI: r2
      0x0146: PHI (r2v23 int) = (r2v10 int), (r2v11 int) binds: [B:15:0x0144, B:19:0x014e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0177 A[PHI: r2
      0x0177: PHI (r2v22 int) = (r2v15 int), (r2v16 int) binds: [B:22:0x0175, B:26:0x017f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x006b A[PHI: r4
      0x006b: PHI (r4v25 int) = (r4v8 int), (r4v9 int) binds: [B:6:0x0069, B:9:0x0072] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void onDraw(android.graphics.Canvas r23) {
        /*
            Method dump skipped, instruction units count: 429
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dw.widget.ColorPickerView.onDraw(android.graphics.Canvas):void");
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        if (View.MeasureSpec.getMode(i11) != 1073741824 && size2 == 0) {
            size2 = CloseCodes.NORMAL_CLOSURE;
        }
        if (View.MeasureSpec.getMode(i10) != 1073741824 && size == 0) {
            size2 /= 2;
        }
        setMeasuredDimension(size, size2);
    }

    @Override // android.view.View
    protected void onSizeChanged(int i10, int i11, int i12, int i13) {
        int i14;
        int i15;
        super.onSizeChanged(i10, i11, i12, i13);
        int i16 = (i10 * 9) / 5;
        if (i16 > i11) {
            i15 = (i11 * 5) / 9;
            i14 = i11;
        } else {
            i14 = i16;
            i15 = i10;
        }
        int i17 = (i10 - i15) / 2;
        int i18 = (i11 - i14) / 2;
        int i19 = i15 / 5;
        int i20 = i19 / 3;
        int i21 = (i15 / 2) + i17;
        int i22 = i18 + i19;
        this.f6912d = new Rect(i17, i18, i21, i22);
        int i23 = i17 + i15;
        this.f6913e = new Rect(i21, i18, i23, i22);
        int i24 = this.f6913e.bottom;
        this.f6914f = new Rect(i17, i24 + i20, i23, i24 + i20 + i15);
        int i25 = this.f6914f.bottom;
        this.f6918s = new Rect(i17, i25 + i20, i23, i25 + i20 + i19);
        int i26 = this.f6918s.bottom;
        this.f6915g = new Rect(i17, i26 + i20, i23, i26 + i20 + i19);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f6915g == null) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            int x10 = (int) motionEvent.getX();
            int y10 = (int) motionEvent.getY();
            if (this.f6915g.contains(x10, y10)) {
                this.f6916h = 1;
            } else if (this.f6914f.contains(x10, y10)) {
                this.f6916h = 2;
            } else if (this.f6918s.contains(x10, y10)) {
                this.f6916h = 3;
            } else {
                this.f6916h = 0;
            }
            int i10 = this.f6916h;
            if (i10 != 0) {
                a(i10, x10, y10);
                invalidate();
                return true;
            }
        } else if (action == 2 && this.f6916h != 0) {
            a(this.f6916h, (int) motionEvent.getX(), (int) motionEvent.getY());
            invalidate();
            return true;
        }
        return false;
    }

    public void setColor(int i10) {
        if (this.f6909a == i10) {
            return;
        }
        this.f6909a = i10;
        Color.colorToHSV(i10, this.f6911c);
        this.f6917r = Color.HSVToColor(new float[]{this.f6911c[0], 1.0f, 1.0f});
        invalidate();
    }

    public void setOnColorChangedListener(a aVar) {
    }

    public void setOriginalColor(int i10) {
        if (this.f6910b == i10) {
            return;
        }
        this.f6910b = i10;
        invalidate();
    }
}
