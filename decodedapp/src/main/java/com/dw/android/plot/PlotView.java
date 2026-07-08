package com.dw.android.plot;

import a6.k;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.view.View;
import androidx.core.widget.i;
import d4.d;
import java.util.ArrayList;
import java.util.Iterator;
import k3.l;

/* JADX INFO: loaded from: classes.dex */
public class PlotView extends View implements SurfaceHolder.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ArrayList f5225a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final RectF f5226b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f5227c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f5228d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Paint f5229e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private SurfaceHolder f5230f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private b f5231g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private com.dw.widget.c f5232h;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f5233r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private float f5234s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private GestureDetector f5235t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private GestureDetector.OnGestureListener f5236u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private float f5237v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private float f5238w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private RectF f5239x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private float f5240y;

    class a implements GestureDetector.OnGestureListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private i f5241a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Runnable f5242b = new RunnableC0079a();

        /* JADX INFO: renamed from: com.dw.android.plot.PlotView$a$a, reason: collision with other inner class name */
        class RunnableC0079a implements Runnable {
            RunnableC0079a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.f5241a.a();
                a aVar = a.this;
                PlotView.this.scrollTo(aVar.f5241a.f(), a.this.f5241a.g());
                if (a.this.f5241a.h()) {
                    return;
                }
                PlotView.this.post(this);
            }
        }

        a() {
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public boolean onDown(MotionEvent motionEvent) {
            PlotView.this.removeCallbacks(this.f5242b);
            return false;
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
            if (this.f5241a == null) {
                this.f5241a = i.b(PlotView.this.getContext());
            }
            this.f5241a.d(PlotView.this.getScrollX(), PlotView.this.getScrollY(), (int) (-f10), 0, 0, PlotView.this.getScrollXMax(), 0, 0);
            PlotView.this.post(this.f5242b);
            return false;
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public void onLongPress(MotionEvent motionEvent) {
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
            PlotView.this.scrollBy((int) f10, (int) f11);
            return true;
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public void onShowPress(MotionEvent motionEvent) {
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public boolean onSingleTapUp(MotionEvent motionEvent) {
            return false;
        }
    }

    class b extends com.dw.util.concurrent.a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final Object f5245e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f5246f;

        public b() {
            super("DrawThread");
            this.f5245e = new Object();
        }

        @Override // com.dw.util.concurrent.a
        protected void doInBackground() {
            while (!isCancelled()) {
                Canvas canvasLockCanvas = PlotView.this.f5230f.lockCanvas(null);
                if (canvasLockCanvas != null) {
                    canvasLockCanvas.drawColor(-1);
                    PlotView.this.g(canvasLockCanvas);
                    PlotView.this.f5230f.unlockCanvasAndPost(canvasLockCanvas);
                }
                synchronized (this.f5245e) {
                    if (this.f5246f) {
                        this.f5246f = false;
                    } else {
                        try {
                            this.f5245e.wait();
                        } catch (InterruptedException unused) {
                        }
                    }
                }
            }
        }

        @Override // com.dw.util.concurrent.a
        protected void onCancel() {
            super.onCancel();
            t();
        }

        public void t() {
            synchronized (this.f5245e) {
                this.f5246f = true;
                this.f5245e.notifyAll();
            }
        }
    }

    public PlotView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f5225a = d.b();
        this.f5226b = new RectF();
        this.f5236u = new a();
        this.f5237v = Float.MAX_VALUE;
        this.f5238w = Float.MIN_VALUE;
        h(attributeSet, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g(Canvas canvas) {
        for (q3.c cVar : this.f5225a) {
            int iSave = canvas.save();
            cVar.a(canvas);
            canvas.restoreToCount(iSave);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getScrollXMax() {
        Iterator it = this.f5225a.iterator();
        int iMax = 0;
        while (it.hasNext()) {
            iMax = Math.max(iMax, ((q3.c) it.next()).b());
        }
        return iMax;
    }

    private void h(AttributeSet attributeSet, int i10) {
        getContext().obtainStyledAttributes(attributeSet, l.C2, i10, 0).recycle();
        this.f5235t = new GestureDetector(getContext(), this.f5236u);
        Paint paint = new Paint(1);
        this.f5229e = paint;
        paint.setStrokeWidth(1.0f);
        this.f5229e.setColor(855638016);
        RectF rectF = this.f5226b;
        rectF.top = 32767.0f;
        rectF.bottom = -32768.0f;
        rectF.right = 1000.0f;
        this.f5232h = new com.dw.widget.c(2);
        if (isInEditMode()) {
            return;
        }
        this.f5228d = k.g(getContext(), 1.0f);
    }

    private void n() {
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = getPaddingRight();
        int paddingBottom = getPaddingBottom();
        this.f5227c = (getWidth() - paddingLeft) - paddingRight;
        this.f5233r = (getHeight() - paddingTop) - paddingBottom;
        ArrayList arrayList = this.f5225a;
        if (arrayList == null) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((q3.c) it.next()).c(this.f5227c, this.f5233r);
        }
    }

    private void o() {
        ArrayList arrayList = this.f5225a;
        if (arrayList == null) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((q3.c) it.next()).d(this.f5226b);
        }
    }

    private float p(float f10) {
        return ((f10 - getPaddingLeft()) / getScaleX()) + this.f5226b.left;
    }

    private void setMaxY(float f10) {
        this.f5226b.top = f10;
        o();
        f();
    }

    private void setMinY(float f10) {
        this.f5226b.bottom = f10;
        o();
        f();
    }

    public void e(q3.c cVar) {
        if (this.f5225a.contains(cVar)) {
            return;
        }
        this.f5225a.add(cVar);
        cVar.c(this.f5227c, this.f5233r);
        cVar.d(this.f5226b);
        f();
    }

    void f() {
        b bVar = this.f5231g;
        if (bVar != null) {
            bVar.t();
        } else {
            invalidate();
        }
    }

    @Override // android.view.View
    public float getScaleX() {
        if (this.f5226b.width() == 0.0f) {
            return 1.0f;
        }
        return Math.abs(this.f5227c / this.f5226b.width());
    }

    @Override // android.view.View
    public float getScaleY() {
        if (this.f5226b.height() == 0.0f) {
            return 1.0f;
        }
        return Math.abs(this.f5233r / this.f5226b.height());
    }

    public com.dw.android.plot.b i() {
        com.dw.android.plot.b bVar = new com.dw.android.plot.b(this);
        e(bVar);
        return bVar;
    }

    public c j(float f10) {
        c cVar = new c(f10);
        e(cVar);
        return cVar;
    }

    public c k(float f10, int i10) {
        c cVar = new c(f10, i10);
        e(cVar);
        return cVar;
    }

    public void l(q3.c cVar) {
        if (this.f5225a.remove(cVar)) {
            f();
        }
    }

    public void m(float f10, float f11, float f12, float f13) {
        RectF rectF = this.f5226b;
        if (rectF.top == f11 && rectF.bottom == f13 && rectF.left == f10 && rectF.right == f12) {
            return;
        }
        rectF.top = f11;
        rectF.bottom = f13;
        rectF.left = f10;
        rectF.right = f12;
        o();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.translate(getPaddingLeft(), getPaddingTop());
        canvas.translate(getScrollX(), getScrollY());
        g(canvas);
    }

    @Override // android.view.View
    protected void onScrollChanged(int i10, int i11, int i12, int i13) {
        super.onScrollChanged(i10, i11, i12, i13);
        float fWidth = this.f5226b.width();
        this.f5226b.left = i10 / getScaleX();
        RectF rectF = this.f5226b;
        rectF.right = rectF.left + fWidth;
        o();
    }

    @Override // android.view.View
    protected void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        n();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        this.f5232h.m(motionEvent);
        this.f5235t.onTouchEvent(motionEvent);
        if (motionEvent.getPointerCount() <= 1) {
            this.f5234s = 0.0f;
            this.f5239x = null;
        } else if (this.f5232h.h() > this.f5232h.i()) {
            float fK = this.f5232h.k();
            if (fK > 0.0f) {
                if (this.f5239x == null) {
                    this.f5239x = new RectF(this.f5226b);
                    this.f5240y = p(this.f5232h.f().x) - this.f5239x.left;
                }
                RectF rectF = this.f5226b;
                rectF.right = rectF.left + (this.f5239x.width() / fK);
                float f10 = this.f5239x.left;
                float f11 = this.f5240y;
                scrollTo((int) (((f10 + (f11 - (f11 / fK))) - (this.f5232h.j() / getScaleX())) * getScaleX()), 0);
                o();
            }
        } else {
            float fL = this.f5232h.l();
            if (fL > 0.0f) {
                float f12 = this.f5234s;
                float f13 = f12 == 0.0f ? fL : fL / f12;
                RectF rectF2 = this.f5226b;
                float f14 = rectF2.top / f13;
                rectF2.top = f14;
                float f15 = this.f5238w;
                if (f14 < f15) {
                    rectF2.top = f15;
                }
                float f16 = rectF2.top;
                float f17 = this.f5237v;
                if (f16 > f17) {
                    rectF2.top = f17;
                }
                rectF2.bottom = -rectF2.top;
                o();
                this.f5234s = fL;
            }
        }
        super.onTouchEvent(motionEvent);
        return true;
    }

    @Override // android.view.View
    public void scrollTo(int i10, int i11) {
        int iMax = Math.max(i10, 0);
        super.scrollTo(Math.min(iMax, getScrollXMax()), Math.max(i11, 0));
    }

    public void setMaxValue(float f10) {
        this.f5237v = f10;
        setMaxY(f10);
        setMinY(-f10);
    }

    public void setMinValue(float f10) {
        this.f5238w = f10;
    }

    @Override // android.view.View
    public void setPadding(int i10, int i11, int i12, int i13) {
        super.setPadding(i10, i11, i12, i13);
        n();
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(SurfaceHolder surfaceHolder, int i10, int i11, int i12) {
        b bVar = this.f5231g;
        if (bVar != null) {
            bVar.t();
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        b bVar = this.f5231g;
        if (bVar != null) {
            bVar.cancel();
        }
        b bVar2 = new b();
        this.f5231g = bVar2;
        bVar2.start();
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        this.f5231g.cancel();
        this.f5231g = null;
    }

    public class c extends q3.a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private float f5248d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private Paint f5249e;

        @Override // q3.c
        public void a(Canvas canvas) {
            canvas.translate(0.0f, this.f24294b / 2);
            canvas.scale(1.0f, -1.0f);
            canvas.translate(0.0f, this.f24293a.centerY());
            float f10 = this.f5248d * f();
            Paint paint = this.f5249e;
            if (paint != null) {
                canvas.drawLine(0.0f, f10, this.f24295c, f10, paint);
            } else {
                canvas.drawLine(0.0f, f10, this.f24295c, f10, PlotView.this.f5229e);
            }
        }

        private c(float f10) {
            this.f5248d = f10;
        }

        private c(float f10, int i10) {
            this.f5248d = f10;
            Paint paint = new Paint();
            this.f5249e = paint;
            paint.setColor(i10);
            this.f5249e.setStyle(Paint.Style.STROKE);
            this.f5249e.setStrokeWidth(1.0f);
        }
    }
}
