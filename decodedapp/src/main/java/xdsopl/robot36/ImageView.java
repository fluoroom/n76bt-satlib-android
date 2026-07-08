package xdsopl.robot36;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import androidx.appcompat.widget.ActivityChooserView;

/* JADX INFO: loaded from: classes3.dex */
public class ImageView extends SurfaceView implements SurfaceHolder.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Drawable f31981a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f31982b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f31983c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f31984d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f31985e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f31986f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f31987g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final SurfaceHolder f31988h;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Bitmap f31989r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final Paint f31990s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f31991t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f31992u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f31993v;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ImageView.this.requestLayout();
        }
    }

    public ImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private int c(int i10, int i11, int i12) {
        int mode = View.MeasureSpec.getMode(i12);
        int size = View.MeasureSpec.getSize(i12);
        return mode != Integer.MIN_VALUE ? mode != 0 ? mode != 1073741824 ? i10 : size : Math.min(i10, i11) : Math.min(Math.min(i10, size), i11);
    }

    void a(Canvas canvas) {
        float width;
        float fMax;
        if (this.f31985e * this.f31983c < this.f31982b * this.f31989r.getHeight()) {
            fMax = this.f31983c / this.f31989r.getHeight();
            width = (this.f31985e * fMax) / this.f31989r.getWidth();
        } else {
            width = this.f31982b / this.f31989r.getWidth();
            fMax = this.f31982b / this.f31985e;
        }
        if (this.f31987g) {
            width = (float) Math.max(1.0d, Math.floor(width));
            fMax = (float) Math.max(1.0d, Math.floor(fMax));
        }
        float width2 = (this.f31982b - (this.f31989r.getWidth() * width)) / 2.0f;
        float height = (this.f31983c - (this.f31989r.getHeight() * fMax)) / 2.0f;
        Drawable drawable = this.f31981a;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        canvas.save();
        canvas.scale(width, fMax, width2, height);
        canvas.drawBitmap(this.f31989r, width2, height, this.f31990s);
        canvas.restore();
    }

    /* JADX WARN: Finally extract failed */
    void b() {
        synchronized (this.f31988h) {
            try {
                if (this.f31984d || this.f31989r == null) {
                    return;
                }
                Canvas canvasLockCanvas = null;
                try {
                    canvasLockCanvas = this.f31988h.lockCanvas(null);
                    if (canvasLockCanvas != null) {
                        a(canvasLockCanvas);
                    }
                    if (canvasLockCanvas != null) {
                        this.f31988h.unlockCanvasAndPost(canvasLockCanvas);
                    }
                } catch (Throwable th2) {
                    if (canvasLockCanvas != null) {
                        this.f31988h.unlockCanvasAndPost(canvasLockCanvas);
                    }
                    throw th2;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public void d(int i10, int i11) {
        synchronized (this.f31988h) {
            try {
                if (i10 != this.f31985e || i11 != this.f31986f) {
                    this.f31985e = i10;
                    this.f31986f = i11;
                    Bitmap bitmap = this.f31989r;
                    if (bitmap != null) {
                        bitmap.recycle();
                    }
                    this.f31989r = Bitmap.createBitmap(this.f31985e, this.f31986f, Bitmap.Config.ARGB_8888);
                    post(new a());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // android.view.View
    public Drawable getBackground() {
        return this.f31981a;
    }

    @Override // android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        Drawable drawable = this.f31981a;
        if (drawable != null) {
            SurfaceHolder surfaceHolder = this.f31988h;
            if (surfaceHolder == null) {
                drawable.setBounds(i10, i11, i12, i13);
            } else {
                synchronized (surfaceHolder) {
                    this.f31981a.setBounds(i10, i11, i12, i13);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00a5 A[PHI: r5
      0x00a5: PHI (r5v6 int) = (r5v4 int), (r5v8 int) binds: [B:27:0x0091, B:31:0x00a0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c0 A[PHI: r5 r6
      0x00c0: PHI (r5v5 int) = (r5v4 int), (r5v4 int), (r5v7 int), (r5v7 int), (r5v7 int) binds: [B:24:0x0075, B:26:0x008f, B:34:0x00a6, B:35:0x00a8, B:39:0x00bb] A[DONT_GENERATE, DONT_INLINE]
      0x00c0: PHI (r6v5 int) = (r6v4 int), (r6v4 int), (r6v4 int), (r6v4 int), (r6v6 int) binds: [B:24:0x0075, B:26:0x008f, B:34:0x00a6, B:35:0x00a8, B:39:0x00bb] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.view.SurfaceView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void onMeasure(int r20, int r21) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            r2 = r21
            int r3 = android.view.View.MeasureSpec.getMode(r1)
            int r4 = android.view.View.MeasureSpec.getMode(r2)
            int r5 = r0.f31985e
            int r6 = r0.f31986f
            if (r5 > 0) goto L15
            r5 = 1
        L15:
            if (r6 > 0) goto L18
            r6 = 1
        L18:
            boolean r8 = r0.f31991t
            r9 = 0
            r10 = 0
            if (r8 == 0) goto L2e
            r8 = 1073741824(0x40000000, float:2.0)
            if (r3 == r8) goto L24
            r3 = 1
            goto L25
        L24:
            r3 = 0
        L25:
            if (r4 == r8) goto L29
            r4 = 1
            goto L2a
        L29:
            r4 = 0
        L2a:
            float r8 = (float) r5
            float r11 = (float) r6
            float r8 = r8 / r11
            goto L31
        L2e:
            r3 = 0
            r4 = 0
            r8 = 0
        L31:
            int r11 = r0.getPaddingLeft()
            int r12 = r0.getPaddingRight()
            int r13 = r0.getPaddingTop()
            int r14 = r0.getPaddingBottom()
            if (r3 != 0) goto L63
            if (r4 == 0) goto L46
            goto L63
        L46:
            int r11 = r11 + r12
            int r5 = r5 + r11
            int r13 = r13 + r14
            int r6 = r6 + r13
            int r3 = r0.getSuggestedMinimumWidth()
            int r3 = java.lang.Math.max(r5, r3)
            int r4 = r0.getSuggestedMinimumHeight()
            int r4 = java.lang.Math.max(r6, r4)
            int r1 = android.view.View.resolveSizeAndState(r3, r1, r10)
            int r2 = android.view.View.resolveSizeAndState(r4, r2, r10)
            goto Lc2
        L63:
            int r5 = r5 + r11
            int r5 = r5 + r12
            int r15 = r0.f31992u
            int r5 = r0.c(r5, r15, r1)
            int r6 = r6 + r13
            int r6 = r6 + r14
            int r15 = r0.f31993v
            int r6 = r0.c(r6, r15, r2)
            int r9 = (r8 > r9 ? 1 : (r8 == r9 ? 0 : -1))
            if (r9 == 0) goto Lc0
            int r9 = r5 - r11
            int r9 = r9 - r12
            float r9 = (float) r9
            int r15 = r6 - r13
            int r15 = r15 - r14
            float r15 = (float) r15
            float r9 = r9 / r15
            float r9 = r9 - r8
            float r9 = java.lang.Math.abs(r9)
            r16 = r8
            double r7 = (double) r9
            r17 = 4502148214488346440(0x3e7ad7f29abcaf48, double:1.0E-7)
            int r9 = (r7 > r17 ? 1 : (r7 == r17 ? 0 : -1))
            if (r9 <= 0) goto Lc0
            if (r3 == 0) goto La5
            float r8 = r16 * r15
            int r7 = (int) r8
            int r7 = r7 + r11
            int r7 = r7 + r12
            if (r4 != 0) goto La0
            int r5 = r0.f31992u
            int r5 = r0.c(r7, r5, r1)
        La0:
            if (r7 > r5) goto La5
            r5 = r7
            r7 = 1
            goto La6
        La5:
            r7 = 0
        La6:
            if (r7 != 0) goto Lc0
            if (r4 == 0) goto Lc0
            int r1 = r5 - r11
            int r1 = r1 - r12
            float r1 = (float) r1
            float r1 = r1 / r16
            int r1 = (int) r1
            int r1 = r1 + r13
            int r1 = r1 + r14
            if (r3 != 0) goto Lbb
            int r3 = r0.f31993v
            int r6 = r0.c(r1, r3, r2)
        Lbb:
            if (r1 > r6) goto Lc0
            r2 = r1
            r1 = r5
            goto Lc2
        Lc0:
            r1 = r5
            r2 = r6
        Lc2:
            r0.setMeasuredDimension(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: xdsopl.robot36.ImageView.onMeasure(int, int):void");
    }

    public void setAdjustViewBounds(boolean z10) {
        this.f31991t = z10;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        SurfaceHolder surfaceHolder = this.f31988h;
        if (surfaceHolder == null) {
            this.f31981a = drawable;
        } else {
            synchronized (surfaceHolder) {
                this.f31981a = drawable;
            }
        }
    }

    public void setMaxHeight(int i10) {
        this.f31993v = i10;
    }

    public void setMaxWidth(int i10) {
        this.f31992u = i10;
    }

    public void setPixels(int[] iArr) {
        synchronized (this.f31988h) {
            Bitmap bitmap = this.f31989r;
            bitmap.setPixels(iArr, 0, bitmap.getWidth(), 0, 0, this.f31989r.getWidth(), this.f31989r.getHeight());
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(SurfaceHolder surfaceHolder, int i10, int i11, int i12) {
        synchronized (this.f31988h) {
            this.f31982b = i11;
            this.f31983c = i12;
        }
        b();
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        synchronized (this.f31988h) {
            this.f31984d = false;
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        synchronized (this.f31988h) {
            this.f31984d = true;
        }
    }

    public ImageView(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    public ImageView(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10);
        this.f31982b = -1;
        this.f31983c = -1;
        this.f31984d = true;
        this.f31985e = -1;
        this.f31986f = -1;
        this.f31987g = false;
        this.f31989r = null;
        this.f31991t = false;
        this.f31992u = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        this.f31993v = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        SurfaceHolder holder = getHolder();
        this.f31988h = holder;
        holder.addCallback(this);
        this.f31990s = new Paint(2);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.adjustViewBounds, R.attr.maxWidth, R.attr.maxHeight}, i10, i11);
        setAdjustViewBounds(typedArrayObtainStyledAttributes.getBoolean(0, false));
        setMaxWidth(typedArrayObtainStyledAttributes.getDimensionPixelSize(1, ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED));
        setMaxHeight(typedArrayObtainStyledAttributes.getDimensionPixelSize(2, ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED));
        typedArrayObtainStyledAttributes.recycle();
    }
}
