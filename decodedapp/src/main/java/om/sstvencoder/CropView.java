package om.sstvencoder;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapRegionDecoder;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import androidx.appcompat.widget.AppCompatImageView;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import java.io.InputStream;
import m0.k;

/* JADX INFO: loaded from: classes3.dex */
public class CropView extends AppCompatImageView {
    private final Rect A;
    private int B;
    private Rect C;
    private int D;
    private final BitmapFactory.Options E;
    private bi.d F;

    /* JADX INFO: renamed from: a */
    private k f23711a;

    /* JADX INFO: renamed from: b */
    private ScaleGestureDetector f23712b;

    /* JADX INFO: renamed from: c */
    private boolean f23713c;

    /* JADX INFO: renamed from: d */
    private boolean f23714d;

    /* JADX INFO: renamed from: e */
    private yh.c f23715e;

    /* JADX INFO: renamed from: f */
    private final Paint f23716f;

    /* JADX INFO: renamed from: g */
    private final Paint f23717g;

    /* JADX INFO: renamed from: h */
    private final Paint f23718h;

    /* JADX INFO: renamed from: r */
    private RectF f23719r;

    /* JADX INFO: renamed from: s */
    private Rect f23720s;

    /* JADX INFO: renamed from: t */
    private BitmapRegionDecoder f23721t;

    /* JADX INFO: renamed from: u */
    private int f23722u;

    /* JADX INFO: renamed from: v */
    private int f23723v;

    /* JADX INFO: renamed from: w */
    private Bitmap f23724w;

    /* JADX INFO: renamed from: x */
    private boolean f23725x;

    /* JADX INFO: renamed from: y */
    private boolean f23726y;

    /* JADX INFO: renamed from: z */
    private final Rect f23727z;

    private class b extends GestureDetector.SimpleOnGestureListener {
        private b() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public void onLongPress(MotionEvent motionEvent) {
            CropView.this.f23713c = false;
            if (CropView.this.f23714d || !CropView.this.F.h(motionEvent.getX(), motionEvent.getY())) {
                return;
            }
            CropView.this.invalidate();
            CropView.this.f23713c = true;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
            if (CropView.this.f23713c) {
                return false;
            }
            CropView.this.r(f10, f11);
            return true;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
            if (CropView.this.f23713c) {
                return false;
            }
            CropView.this.m(motionEvent.getX(), motionEvent.getY());
            return true;
        }

        /* synthetic */ b(CropView cropView, a aVar) {
            this();
        }
    }

    private class c extends ScaleGestureDetector.SimpleOnScaleGestureListener {
        private c() {
        }

        @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
        public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
            CropView.this.x(scaleGestureDetector.getScaleFactor());
            return true;
        }

        @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
        public boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
            if (CropView.this.f23713c) {
                return false;
            }
            CropView.this.f23714d = true;
            return true;
        }

        @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
        public void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
            CropView.this.f23714d = false;
        }

        /* synthetic */ c(CropView cropView, a aVar) {
            this();
        }
    }

    public CropView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f23711a = new k(getContext(), new b());
        this.f23712b = new ScaleGestureDetector(getContext(), new c());
        this.E = new BitmapFactory.Options();
        this.f23716f = new Paint(2);
        Paint paint = new Paint();
        this.f23717g = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(1.0f);
        Paint paint2 = new Paint();
        this.f23718h = paint2;
        paint2.setColor(-16777216);
        this.f23727z = new Rect();
        this.A = new Rect();
        this.C = new Rect();
        this.f23720s = new Rect();
        this.f23725x = false;
        this.f23726y = false;
        this.F = new bi.d();
    }

    private om.sstvencoder.c a() {
        Context context = getContext();
        if (!(context instanceof om.sstvencoder.c)) {
            context = ((ContextWrapper) context).getBaseContext();
        }
        return (om.sstvencoder.c) context;
    }

    private int getSampleSize() {
        return Integer.highestOneBit(Math.max(1, Math.max(Math.round(this.f23719r.width() / this.f23715e.width()), Math.round(this.f23719r.height() / this.f23715e.height()))));
    }

    private void i(int i10, int i11) {
        this.f23727z.set(0, 0, i10, i11);
        int i12 = this.A.left;
        if (i12 < 0) {
            Rect rect = this.f23727z;
            rect.left -= (i12 * rect.width()) / this.A.width();
            this.A.left = 0;
        }
        int i13 = this.A.top;
        if (i13 < 0) {
            Rect rect2 = this.f23727z;
            rect2.top -= (i13 * rect2.height()) / this.A.height();
            this.A.top = 0;
        }
        int i14 = this.A.right;
        int i15 = this.f23722u;
        if (i14 > i15) {
            Rect rect3 = this.f23727z;
            rect3.right -= ((i14 - i15) * rect3.width()) / this.A.width();
            this.A.right = this.f23722u;
        }
        int i16 = this.A.bottom;
        int i17 = this.f23723v;
        if (i16 > i17) {
            Rect rect4 = this.f23727z;
            rect4.bottom -= ((i16 - i17) * rect4.height()) / this.A.height();
            this.A.bottom = this.f23723v;
        }
    }

    private void j(Canvas canvas) {
        canvas.save();
        canvas.rotate(this.B);
        v();
        if (!this.f23725x) {
            z();
            Rect rect = this.A;
            Rect rect2 = this.C;
            rect.offset(-rect2.left, -rect2.top);
            Rect rect3 = this.A;
            int i10 = rect3.left;
            int i11 = this.D;
            rect3.left = i10 / i11;
            rect3.top /= i11;
            rect3.right /= i11;
            rect3.bottom /= i11;
        }
        canvas.drawBitmap(this.f23724w, this.A, this.f23727z, this.f23716f);
        canvas.restore();
    }

    private void k(Canvas canvas) {
        this.f23717g.setColor(-16776961);
        canvas.drawRect(this.f23720s, this.f23717g);
        this.f23717g.setColor(-16711936);
        l(canvas, this.f23720s, -1);
        this.f23717g.setColor(-65536);
        l(canvas, this.f23720s, -2);
    }

    private void l(Canvas canvas, Rect rect, int i10) {
        canvas.drawRect(rect.left + i10, rect.top + i10, rect.right - i10, rect.bottom - i10, this.f23717g);
    }

    public void m(float f10, float f11) {
        a().P1(this.F.d(f10, f11));
    }

    private Rect o(RectF rectF) {
        return new Rect(Math.round(rectF.left), Math.round(rectF.top), Math.round(rectF.right), Math.round(rectF.bottom));
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void p(java.io.InputStream r7) throws java.lang.Exception {
        /*
            r6 = this;
            android.graphics.BitmapFactory$Options r0 = new android.graphics.BitmapFactory$Options
            r0.<init>()
            r1 = 1
            r0.inJustDecodeBounds = r1
            r2 = 0
            r3 = 0
            int r4 = r7.available()     // Catch: java.lang.Exception -> L1c
            if (r4 <= 0) goto L1e
            byte[] r5 = new byte[r4]     // Catch: java.lang.Exception -> L1c
            int r7 = r7.read(r5, r2, r4)     // Catch: java.lang.Exception -> L1c
            if (r4 != r7) goto L1e
            android.graphics.BitmapFactory.decodeByteArray(r5, r2, r4, r0)     // Catch: java.lang.Exception -> L1c
            goto L1f
        L1c:
            r7 = move-exception
            goto L21
        L1e:
            r5 = r3
        L1f:
            r7 = r3
            goto L26
        L21:
            java.lang.String r7 = r7.getMessage()
            r5 = r3
        L26:
            int r4 = r0.outWidth
            r6.f23722u = r4
            int r0 = r0.outHeight
            r6.f23723v = r0
            if (r5 == 0) goto L55
            if (r4 <= 0) goto L55
            if (r0 <= 0) goto L55
            int r4 = r4 * r0
            r0 = 1048576(0x100000, float:1.469368E-39)
            if (r4 >= r0) goto L3c
            r0 = 1
            goto L3d
        L3c:
            r0 = 0
        L3d:
            r6.f23725x = r0
            if (r0 == 0) goto L49
            int r0 = r5.length
            android.graphics.Bitmap r0 = android.graphics.BitmapFactory.decodeByteArray(r5, r2, r0, r3)
            r6.f23724w = r0
            goto L55
        L49:
            int r0 = r5.length
            android.graphics.BitmapRegionDecoder r0 = android.graphics.BitmapRegionDecoder.newInstance(r5, r2, r0, r1)
            r6.f23721t = r0
            android.graphics.Rect r0 = r6.C
            r0.setEmpty()
        L55:
            android.graphics.Bitmap r0 = r6.f23724w
            if (r0 != 0) goto L91
            android.graphics.BitmapRegionDecoder r0 = r6.f23721t
            if (r0 != 0) goto L91
            if (r7 != 0) goto L8b
            int r7 = r6.f23722u
            java.lang.String r0 = "Stream could not be decoded."
            if (r7 <= 0) goto L8a
            int r7 = r6.f23723v
            if (r7 <= 0) goto L8a
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r0)
            java.lang.String r0 = " Image size: "
            r7.append(r0)
            int r0 = r6.f23722u
            r7.append(r0)
            java.lang.String r0 = "x"
            r7.append(r0)
            int r0 = r6.f23723v
            r7.append(r0)
            java.lang.String r7 = r7.toString()
            goto L8b
        L8a:
            r7 = r0
        L8b:
            java.lang.Exception r0 = new java.lang.Exception
            r0.<init>(r7)
            throw r0
        L91:
            r6.f23726y = r1
            r6.u()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: om.sstvencoder.CropView.p(java.io.InputStream):void");
    }

    private void q() {
        float fWidth = (this.f23720s.left * this.f23719r.width()) / this.f23720s.width();
        float fHeight = (this.f23720s.top * this.f23719r.height()) / this.f23720s.height();
        float width = ((this.f23720s.right - getWidth()) * this.f23719r.width()) / this.f23720s.width();
        float height = ((this.f23720s.bottom - getHeight()) * this.f23719r.height()) / this.f23720s.height();
        this.A.left = Math.round(this.f23719r.left - fWidth);
        this.A.top = Math.round(this.f23719r.top - fHeight);
        this.A.right = Math.round(this.f23719r.right - width);
        this.A.bottom = Math.round(this.f23719r.bottom - height);
    }

    private void s() {
        BitmapRegionDecoder bitmapRegionDecoder = this.f23721t;
        if (bitmapRegionDecoder != null) {
            bitmapRegionDecoder.recycle();
            this.f23721t = null;
        }
        Bitmap bitmap = this.f23724w;
        if (bitmap != null) {
            bitmap.recycle();
            this.f23724w = null;
        }
    }

    private void u() {
        float fWidth = this.f23715e.width();
        float fHeight = this.f23715e.height();
        float f10 = this.f23722u;
        float f11 = this.f23723v;
        float f12 = fWidth * f11;
        float f13 = f10 * fHeight;
        if (f12 > f13) {
            float f14 = f12 / fHeight;
            RectF rectF = new RectF(0.0f, 0.0f, f14, f11);
            this.f23719r = rectF;
            rectF.offset((f10 - f14) / 2.0f, 0.0f);
            return;
        }
        float f15 = f13 / fWidth;
        RectF rectF2 = new RectF(0.0f, 0.0f, f10, f15);
        this.f23719r = rectF2;
        rectF2.offset(0.0f, (f11 - f15) / 2.0f);
    }

    private void v() {
        int i10 = this.f23722u;
        int i11 = this.f23723v;
        int i12 = 0;
        while (i12 < this.B / 90) {
            Rect rect = this.A;
            rect.set(rect.top, i10 - rect.left, rect.bottom, i10 - rect.right);
            Rect rect2 = this.f23727z;
            rect2.set(rect2.top, -rect2.right, rect2.bottom, -rect2.left);
            i12++;
            int i13 = i11;
            i11 = i10;
            i10 = i13;
        }
        this.A.sort();
    }

    private void z() {
        int sampleSize = getSampleSize();
        if (sampleSize < this.D || !this.C.contains(this.A)) {
            Bitmap bitmap = this.f23724w;
            if (bitmap != null) {
                bitmap.recycle();
            }
            int iWidth = this.A.width();
            int iHeight = this.A.height();
            while (iWidth * iHeight < sampleSize * WXMediaMessage.DESCRIPTION_LENGTH_LIMIT * sampleSize * WXMediaMessage.DESCRIPTION_LENGTH_LIMIT) {
                iWidth += this.A.width();
                iHeight += this.A.height();
            }
            int i10 = ~(sampleSize - 1);
            this.C.set(Math.max(0, (this.A.centerX() - (iWidth / 2)) & i10), Math.max(0, (this.A.centerY() - (iHeight / 2)) & i10), Math.min(this.f23721t.getWidth(), i10 & (((this.A.centerX() + r1) + sampleSize) - 1)), Math.min(this.f23721t.getHeight(), i10 & (((this.A.centerY() + r2) + sampleSize) - 1)));
            BitmapFactory.Options options = this.E;
            this.D = sampleSize;
            options.inSampleSize = sampleSize;
            this.f23724w = this.f23721t.decodeRegion(this.C, options);
        }
    }

    public Bitmap getBitmap() {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(this.f23715e.width(), this.f23715e.height(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        canvas.drawColor(-16777216);
        if (this.f23726y) {
            this.A.set(o(this.f23719r));
            i(this.f23715e.width(), this.f23715e.height());
            j(canvas);
        }
        this.F.c(canvas, this.f23720s, new Rect(0, 0, this.f23715e.width(), this.f23715e.height()));
        return bitmapCreateBitmap;
    }

    public bi.d getLabels() {
        return this.F;
    }

    public void n(bi.c cVar) {
        this.F.e(cVar);
        invalidate();
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDraw(Canvas canvas) {
        if (this.f23726y) {
            q();
            i(getWidth(), getHeight());
            canvas.drawRect(this.f23720s, this.f23718h);
            j(canvas);
        }
        this.F.b(canvas);
        k(canvas);
    }

    @Override // android.view.View
    protected void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        yh.c cVar = this.f23715e;
        if (cVar != null) {
            this.f23720s = h.d(i10, i11, cVar.width(), this.f23715e.height());
        }
        this.F.k(i10, i11, h.j(i10, i11));
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0010, code lost:
    
        if (r0 != 3) goto L43;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            boolean r0 = r5.f23713c
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L30
            int r0 = r6.getAction()
            if (r0 == r1) goto L25
            r3 = 2
            if (r0 == r3) goto L13
            r3 = 3
            if (r0 == r3) goto L25
            goto L30
        L13:
            bi.d r0 = r5.F
            float r3 = r6.getX()
            float r4 = r6.getY()
            r0.g(r3, r4)
            r5.invalidate()
        L23:
            r0 = 1
            goto L31
        L25:
            bi.d r0 = r5.F
            r0.i()
            r5.invalidate()
            r5.f23713c = r2
            goto L23
        L30:
            r0 = 0
        L31:
            android.view.ScaleGestureDetector r3 = r5.f23712b
            boolean r3 = r3.onTouchEvent(r6)
            if (r3 != 0) goto L3e
            if (r0 == 0) goto L3c
            goto L3e
        L3c:
            r0 = 0
            goto L3f
        L3e:
            r0 = 1
        L3f:
            m0.k r3 = r5.f23711a
            boolean r3 = r3.a(r6)
            if (r3 != 0) goto L51
            if (r0 != 0) goto L51
            boolean r6 = super.onTouchEvent(r6)
            if (r6 == 0) goto L50
            goto L51
        L50:
            return r2
        L51:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: om.sstvencoder.CropView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void r(float f10, float f11) {
        if (this.f23726y) {
            float fWidth = (this.f23719r.width() * f10) / this.f23720s.width();
            float fHeight = (this.f23719r.height() * f11) / this.f23720s.height();
            float fWidth2 = this.f23719r.width() * 0.1f;
            float fHeight2 = this.f23719r.height() * 0.1f;
            float fMax = Math.max(fWidth2, this.f23719r.right + fWidth);
            RectF rectF = this.f23719r;
            float f12 = fMax - rectF.right;
            float fMax2 = Math.max(fHeight2, rectF.bottom + fHeight);
            RectF rectF2 = this.f23719r;
            float f13 = fMax2 - rectF2.bottom;
            float fMin = Math.min(this.f23722u - fWidth2, rectF2.left + f12);
            RectF rectF3 = this.f23719r;
            float f14 = fMin - rectF3.left;
            float fMin2 = Math.min(this.f23723v - fHeight2, rectF3.top + f13);
            RectF rectF4 = this.f23719r;
            rectF4.offset(f14, fMin2 - rectF4.top);
            invalidate();
        }
    }

    public void setBitmap(InputStream inputStream) throws Exception {
        this.f23726y = false;
        this.B = 0;
        s();
        p(inputStream);
        invalidate();
    }

    public void setModeSize(yh.c cVar) {
        this.f23715e = cVar;
        this.f23720s = h.d(getWidth(), getHeight(), this.f23715e.width(), this.f23715e.height());
        if (this.f23726y) {
            u();
        }
        invalidate();
    }

    public void t() {
        if (this.f23726y) {
            int i10 = this.B;
            if (i10 == 90 || i10 == 270) {
                int i11 = this.f23722u;
                this.f23722u = this.f23723v;
                this.f23723v = i11;
            }
            this.B = 0;
            u();
            invalidate();
        }
    }

    public void w(int i10) {
        if (this.f23726y) {
            this.B = (this.B + i10) % 360;
            if (i10 == 90 || i10 == 270) {
                int i11 = this.f23722u;
                this.f23722u = this.f23723v;
                this.f23723v = i11;
            }
            u();
            invalidate();
        }
    }

    public void x(float f10) {
        if (this.f23726y) {
            float fWidth = this.f23719r.width() / f10;
            float fHeight = this.f23719r.height() / f10;
            float fWidth2 = (this.f23719r.width() - fWidth) * 0.5f;
            float fHeight2 = (this.f23719r.height() - fHeight) * 0.5f;
            float fMax = Math.max(this.f23722u, this.f23723v) * 2.0f;
            if (Math.min(fWidth, fHeight) < 4.0f || Math.max(fWidth, fHeight) > fMax) {
                return;
            }
            this.f23719r.inset(fWidth2, fHeight2);
            invalidate();
        }
    }

    public void y() {
        this.f23726y = false;
        this.B = 0;
        s();
        invalidate();
    }
}
