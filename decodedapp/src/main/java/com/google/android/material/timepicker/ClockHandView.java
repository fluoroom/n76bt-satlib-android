package com.google.android.material.timepicker;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.facebook.stetho.server.http.HttpStatus;
import com.google.android.material.internal.p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import u8.k;
import u8.l;

/* JADX INFO: loaded from: classes3.dex */
class ClockHandView extends View {
    private double A;
    private int B;
    private int C;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f8513a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final TimeInterpolator f8514b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ValueAnimator f8515c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f8516d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f8517e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float f8518f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f8519g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f8520h;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f8521r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final List f8522s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final int f8523t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final float f8524u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final Paint f8525v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final RectF f8526w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final int f8527x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private float f8528y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private boolean f8529z;

    class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            animator.end();
        }
    }

    public interface b {
        void a(float f10, boolean z10);
    }

    public ClockHandView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, u8.b.f28563s);
    }

    public static /* synthetic */ void a(ClockHandView clockHandView, ValueAnimator valueAnimator) {
        clockHandView.getClass();
        clockHandView.p(((Float) valueAnimator.getAnimatedValue()).floatValue(), true);
    }

    private void c(float f10, float f11) {
        this.C = g9.a.b((float) (getWidth() / 2), (float) (getHeight() / 2), f10, f11) > ((float) h(2)) + p.c(getContext(), 12) ? 1 : 2;
    }

    private void d(Canvas canvas) {
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        float f10 = width;
        float fH = h(this.C);
        float fCos = (((float) Math.cos(this.A)) * fH) + f10;
        float f11 = height;
        float fSin = (fH * ((float) Math.sin(this.A))) + f11;
        this.f8525v.setStrokeWidth(0.0f);
        canvas.drawCircle(fCos, fSin, this.f8523t, this.f8525v);
        double dSin = Math.sin(this.A);
        double dCos = Math.cos(this.A);
        this.f8525v.setStrokeWidth(this.f8527x);
        canvas.drawLine(f10, f11, width + ((int) (dCos * d)), height + ((int) (d * dSin)), this.f8525v);
        canvas.drawCircle(f10, f11, this.f8524u, this.f8525v);
    }

    private int f(float f10, float f11) {
        int degrees = (int) Math.toDegrees(Math.atan2(f11 - (getHeight() / 2), f10 - (getWidth() / 2)));
        int i10 = degrees + 90;
        return i10 < 0 ? degrees + 450 : i10;
    }

    private int h(int i10) {
        return i10 == 2 ? Math.round(this.B * 0.66f) : this.B;
    }

    private Pair j(float f10) {
        float fG = g();
        if (Math.abs(fG - f10) > 180.0f) {
            if (fG > 180.0f && f10 < 180.0f) {
                f10 += 360.0f;
            }
            if (fG < 180.0f && f10 > 180.0f) {
                fG += 360.0f;
            }
        }
        return new Pair(Float.valueOf(fG), Float.valueOf(f10));
    }

    private boolean k(float f10, float f11, boolean z10, boolean z11, boolean z12) {
        float f12 = f(f10, f11);
        boolean z13 = false;
        boolean z14 = g() != f12;
        if (z11 && z14) {
            return true;
        }
        if (!z14 && !z10) {
            return false;
        }
        if (z12 && this.f8516d) {
            z13 = true;
        }
        o(f12, z13);
        return true;
    }

    private void l() {
        this.f8515c.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.timepicker.a
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                ClockHandView.a(this.f8535a, valueAnimator);
            }
        });
        this.f8515c.addListener(new a());
    }

    private void p(float f10, boolean z10) {
        float f11 = f10 % 360.0f;
        this.f8528y = f11;
        this.A = Math.toRadians(f11 - 90.0f);
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        float fH = h(this.C);
        float fCos = width + (((float) Math.cos(this.A)) * fH);
        float fSin = height + (fH * ((float) Math.sin(this.A)));
        RectF rectF = this.f8526w;
        int i10 = this.f8523t;
        rectF.set(fCos - i10, fSin - i10, fCos + i10, fSin + i10);
        Iterator it = this.f8522s.iterator();
        while (it.hasNext()) {
            ((b) it.next()).a(f11, z10);
        }
        invalidate();
    }

    public void b(b bVar) {
        this.f8522s.add(bVar);
    }

    public RectF e() {
        return this.f8526w;
    }

    public float g() {
        return this.f8528y;
    }

    public int i() {
        return this.f8523t;
    }

    public void m(int i10) {
        this.B = i10;
        invalidate();
    }

    public void n(float f10) {
        o(f10, false);
    }

    public void o(float f10, boolean z10) {
        this.f8515c.cancel();
        if (!z10) {
            p(f10, false);
            return;
        }
        Pair pairJ = j(f10);
        this.f8515c.setFloatValues(((Float) pairJ.first).floatValue(), ((Float) pairJ.second).floatValue());
        this.f8515c.setDuration(this.f8513a);
        this.f8515c.setInterpolator(this.f8514b);
        this.f8515c.start();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        d(canvas);
    }

    @Override // android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (this.f8515c.isRunning()) {
            return;
        }
        n(g());
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        boolean z11;
        boolean z12;
        int actionMasked = motionEvent.getActionMasked();
        float x10 = motionEvent.getX();
        float y10 = motionEvent.getY();
        if (actionMasked == 0) {
            this.f8517e = x10;
            this.f8518f = y10;
            this.f8519g = true;
            this.f8529z = false;
            z10 = false;
            z11 = true;
        } else {
            if (actionMasked == 1 || actionMasked == 2) {
                int i10 = (int) (x10 - this.f8517e);
                int i11 = (int) (y10 - this.f8518f);
                this.f8519g = (i10 * i10) + (i11 * i11) > this.f8520h;
                z10 = this.f8529z;
                boolean z13 = actionMasked == 1;
                if (this.f8521r) {
                    c(x10, y10);
                }
                z12 = z13;
                z11 = false;
                this.f8529z |= k(x10, y10, z10, z11, z12);
                return true;
            }
            z10 = false;
            z11 = false;
        }
        z12 = false;
        this.f8529z |= k(x10, y10, z10, z11, z12);
        return true;
    }

    void q(boolean z10) {
        if (this.f8521r && !z10) {
            this.C = 1;
        }
        this.f8521r = z10;
        invalidate();
    }

    public ClockHandView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f8515c = new ValueAnimator();
        this.f8522s = new ArrayList();
        Paint paint = new Paint();
        this.f8525v = paint;
        this.f8526w = new RectF();
        this.C = 1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, l.f28925t1, i10, k.f28749y);
        this.f8513a = h9.d.f(context, u8.b.f28568x, HttpStatus.HTTP_OK);
        this.f8514b = h9.d.g(context, u8.b.G, v8.a.f30493b);
        this.B = typedArrayObtainStyledAttributes.getDimensionPixelSize(l.f28943v1, 0);
        this.f8523t = typedArrayObtainStyledAttributes.getDimensionPixelSize(l.f28952w1, 0);
        this.f8527x = getResources().getDimensionPixelSize(u8.d.J);
        this.f8524u = r7.getDimensionPixelSize(u8.d.H);
        int color = typedArrayObtainStyledAttributes.getColor(l.f28934u1, 0);
        paint.setAntiAlias(true);
        paint.setColor(color);
        n(0.0f);
        this.f8520h = ViewConfiguration.get(context).getScaledTouchSlop();
        setImportantForAccessibility(2);
        typedArrayObtainStyledAttributes.recycle();
        l();
    }
}
