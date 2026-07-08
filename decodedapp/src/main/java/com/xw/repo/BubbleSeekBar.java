package com.xw.repo;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Property;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.LinearInterpolator;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import java.math.BigDecimal;

/* JADX INFO: loaded from: classes3.dex */
public class BubbleSeekBar extends View {
    private int A;
    private int B;
    private boolean C;
    private int D;
    private int E;
    private boolean F;
    private boolean G;
    private boolean H;
    private boolean I;
    private long J;
    private boolean K;
    private long L;
    private boolean M;
    private boolean N;
    private int O;
    private int P;
    private int Q;
    private float R;
    private float S;
    private float T;
    private float U;
    private float V;
    private boolean W;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f10322a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private int f10323a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f10324b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private boolean f10325b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f10326c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private SparseArray f10327c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f10328d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private float f10329d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f10330e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private boolean f10331e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f10332f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    private k f10333f0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f10334g;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    private float f10335g0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f10336h;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    private float f10337h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    private Paint f10338i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    private Rect f10339j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    private WindowManager f10340k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    private i f10341l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    private int f10342m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    private float f10343n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    private float f10344o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private float f10345p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    private WindowManager.LayoutParams f10346q0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f10347r;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    private int[] f10348r0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f10349s;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    private boolean f10350s0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f10351t;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    private float f10352t0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f10353u;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    private com.xw.repo.a f10354u0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f10355v;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    float f10356v0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f10357w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private boolean f10358x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private int f10359y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private int f10360z;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            BubbleSeekBar.this.requestLayout();
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            BubbleSeekBar.this.f10350s0 = false;
            BubbleSeekBar.this.z();
        }
    }

    class c extends AnimatorListenerAdapter {
        c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            BubbleSeekBar.this.W = false;
            BubbleSeekBar.this.invalidate();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BubbleSeekBar.this.W = false;
            BubbleSeekBar.this.invalidate();
        }
    }

    class d implements Runnable {

        class a extends AnimatorListenerAdapter {
            a() {
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
                if (!BubbleSeekBar.this.K) {
                    BubbleSeekBar.this.H();
                }
                BubbleSeekBar.this.W = false;
                BubbleSeekBar.this.invalidate();
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                if (!BubbleSeekBar.this.K) {
                    BubbleSeekBar.this.H();
                }
                BubbleSeekBar.this.W = false;
                BubbleSeekBar.this.invalidate();
            }
        }

        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            BubbleSeekBar.this.f10341l0.animate().alpha(BubbleSeekBar.this.K ? 1.0f : 0.0f).setDuration(BubbleSeekBar.this.J).setListener(new a()).start();
        }
    }

    class e implements ValueAnimator.AnimatorUpdateListener {
        e() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            BubbleSeekBar.this.T = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            BubbleSeekBar bubbleSeekBar = BubbleSeekBar.this;
            bubbleSeekBar.f10326c = bubbleSeekBar.C();
            if (BubbleSeekBar.this.M || BubbleSeekBar.this.f10341l0.getParent() == null) {
                BubbleSeekBar.this.N();
            } else {
                BubbleSeekBar bubbleSeekBar2 = BubbleSeekBar.this;
                bubbleSeekBar2.f10345p0 = bubbleSeekBar2.B();
                BubbleSeekBar.this.f10346q0.x = (int) (BubbleSeekBar.this.f10345p0 + 0.5f);
                BubbleSeekBar.this.f10340k0.updateViewLayout(BubbleSeekBar.this.f10341l0, BubbleSeekBar.this.f10346q0);
                BubbleSeekBar.this.f10341l0.a(BubbleSeekBar.this.F ? String.valueOf(BubbleSeekBar.this.getProgressFloat()) : String.valueOf(BubbleSeekBar.this.getProgress()));
            }
            BubbleSeekBar.this.invalidate();
            if (BubbleSeekBar.this.f10333f0 != null) {
                k kVar = BubbleSeekBar.this.f10333f0;
                BubbleSeekBar bubbleSeekBar3 = BubbleSeekBar.this;
                kVar.J(bubbleSeekBar3, bubbleSeekBar3.getProgress(), BubbleSeekBar.this.getProgressFloat(), true);
            }
        }
    }

    class f extends AnimatorListenerAdapter {
        f() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            if (!BubbleSeekBar.this.M && !BubbleSeekBar.this.K) {
                BubbleSeekBar.this.H();
            }
            BubbleSeekBar bubbleSeekBar = BubbleSeekBar.this;
            bubbleSeekBar.f10326c = bubbleSeekBar.C();
            BubbleSeekBar.this.W = false;
            BubbleSeekBar.this.f10350s0 = true;
            BubbleSeekBar.this.invalidate();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (!BubbleSeekBar.this.M && !BubbleSeekBar.this.K) {
                BubbleSeekBar.this.H();
            }
            BubbleSeekBar bubbleSeekBar = BubbleSeekBar.this;
            bubbleSeekBar.f10326c = bubbleSeekBar.C();
            BubbleSeekBar.this.W = false;
            BubbleSeekBar.this.f10350s0 = true;
            BubbleSeekBar.this.invalidate();
            if (BubbleSeekBar.this.f10333f0 != null) {
                k kVar = BubbleSeekBar.this.f10333f0;
                BubbleSeekBar bubbleSeekBar2 = BubbleSeekBar.this;
                kVar.H0(bubbleSeekBar2, bubbleSeekBar2.getProgress(), BubbleSeekBar.this.getProgressFloat(), true);
            }
        }
    }

    class g extends AnimatorListenerAdapter {
        g() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            BubbleSeekBar.this.f10340k0.addView(BubbleSeekBar.this.f10341l0, BubbleSeekBar.this.f10346q0);
        }
    }

    class h implements Runnable {
        h() {
        }

        @Override // java.lang.Runnable
        public void run() {
            BubbleSeekBar.this.O();
            BubbleSeekBar.this.f10325b0 = true;
        }
    }

    private class i extends View {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Paint f10370a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Path f10371b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private RectF f10372c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Rect f10373d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private String f10374e;

        i(BubbleSeekBar bubbleSeekBar, Context context) {
            this(bubbleSeekBar, context, null);
        }

        void a(String str) {
            if (str == null || this.f10374e.equals(str)) {
                return;
            }
            this.f10374e = str;
            invalidate();
        }

        @Override // android.view.View
        protected void onDraw(Canvas canvas) {
            super.onDraw(canvas);
            this.f10371b.reset();
            float measuredWidth = getMeasuredWidth() / 2.0f;
            float measuredHeight = getMeasuredHeight() - (BubbleSeekBar.this.f10342m0 / 3.0f);
            this.f10371b.moveTo(measuredWidth, measuredHeight);
            float measuredWidth2 = (float) (((double) (getMeasuredWidth() / 2.0f)) - ((Math.sqrt(3.0d) / 2.0d) * ((double) BubbleSeekBar.this.f10342m0)));
            float f10 = BubbleSeekBar.this.f10342m0 * 1.5f;
            this.f10371b.quadTo(measuredWidth2 - com.xw.repo.b.a(2), f10 - com.xw.repo.b.a(2), measuredWidth2, f10);
            this.f10371b.arcTo(this.f10372c, 150.0f, 240.0f);
            this.f10371b.quadTo(((float) (((double) (getMeasuredWidth() / 2.0f)) + ((Math.sqrt(3.0d) / 2.0d) * ((double) BubbleSeekBar.this.f10342m0)))) + com.xw.repo.b.a(2), f10 - com.xw.repo.b.a(2), measuredWidth, measuredHeight);
            this.f10371b.close();
            this.f10370a.setColor(BubbleSeekBar.this.O);
            canvas.drawPath(this.f10371b, this.f10370a);
            this.f10370a.setTextSize(BubbleSeekBar.this.P);
            this.f10370a.setColor(BubbleSeekBar.this.Q);
            Paint paint = this.f10370a;
            String str = this.f10374e;
            paint.getTextBounds(str, 0, str.length(), this.f10373d);
            Paint.FontMetrics fontMetrics = this.f10370a.getFontMetrics();
            float f11 = BubbleSeekBar.this.f10342m0;
            float f12 = fontMetrics.descent;
            canvas.drawText(this.f10374e, getMeasuredWidth() / 2.0f, (f11 + ((f12 - fontMetrics.ascent) / 2.0f)) - f12, this.f10370a);
        }

        @Override // android.view.View
        protected void onMeasure(int i10, int i11) {
            super.onMeasure(i10, i11);
            setMeasuredDimension(BubbleSeekBar.this.f10342m0 * 3, BubbleSeekBar.this.f10342m0 * 3);
            this.f10372c.set((getMeasuredWidth() / 2.0f) - BubbleSeekBar.this.f10342m0, 0.0f, (getMeasuredWidth() / 2.0f) + BubbleSeekBar.this.f10342m0, BubbleSeekBar.this.f10342m0 * 2);
        }

        i(BubbleSeekBar bubbleSeekBar, Context context, AttributeSet attributeSet) {
            this(context, attributeSet, 0);
        }

        i(Context context, AttributeSet attributeSet, int i10) {
            super(context, attributeSet, i10);
            this.f10374e = "";
            Paint paint = new Paint();
            this.f10370a = paint;
            paint.setAntiAlias(true);
            this.f10370a.setTextAlign(Paint.Align.CENTER);
            this.f10371b = new Path();
            this.f10372c = new RectF();
            this.f10373d = new Rect();
        }
    }

    public interface j {
        SparseArray a(int i10, SparseArray sparseArray);
    }

    public interface k {
        void H0(BubbleSeekBar bubbleSeekBar, int i10, float f10, boolean z10);

        void J(BubbleSeekBar bubbleSeekBar, int i10, float f10, boolean z10);

        void b0(BubbleSeekBar bubbleSeekBar, int i10, float f10);
    }

    public BubbleSeekBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private float A(float f10) {
        float f11 = this.f10335g0;
        if (f10 <= f11) {
            return f11;
        }
        float f12 = this.f10337h0;
        if (f10 >= f12) {
            return f12;
        }
        float f13 = 0.0f;
        int i10 = 0;
        while (i10 <= this.f10353u) {
            float f14 = this.V;
            f13 = (i10 * f14) + this.f10335g0;
            if (f13 <= f10 && f10 - f13 <= f14) {
                break;
            }
            i10++;
        }
        float f15 = f10 - f13;
        float f16 = this.V;
        return f15 <= f16 / 2.0f ? f13 : ((i10 + 1) * f16) + this.f10335g0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float B() {
        return this.N ? this.f10343n0 - ((this.U * (this.f10326c - this.f10322a)) / this.R) : this.f10343n0 + ((this.U * (this.f10326c - this.f10322a)) / this.R);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float C() {
        float f10;
        float f11;
        if (this.N) {
            f10 = ((this.f10337h0 - this.T) * this.R) / this.U;
            f11 = this.f10322a;
        } else {
            f10 = ((this.T - this.f10335g0) * this.R) / this.U;
            f11 = this.f10322a;
        }
        return f10 + f11;
    }

    private void D() {
        String strF;
        String strF2;
        this.f10338i0.setTextSize(this.P);
        if (this.F) {
            strF = F(this.N ? this.f10324b : this.f10322a);
        } else {
            strF = this.N ? this.f10328d ? F(this.f10324b) : String.valueOf((int) this.f10324b) : this.f10328d ? F(this.f10322a) : String.valueOf((int) this.f10322a);
        }
        this.f10338i0.getTextBounds(strF, 0, strF.length(), this.f10339j0);
        int iWidth = (this.f10339j0.width() + (this.f10323a0 * 2)) >> 1;
        if (this.F) {
            strF2 = F(this.N ? this.f10322a : this.f10324b);
        } else {
            strF2 = this.N ? this.f10328d ? F(this.f10322a) : String.valueOf((int) this.f10322a) : this.f10328d ? F(this.f10324b) : String.valueOf((int) this.f10324b);
        }
        this.f10338i0.getTextBounds(strF2, 0, strF2.length(), this.f10339j0);
        int iWidth2 = (this.f10339j0.width() + (this.f10323a0 * 2)) >> 1;
        int iA = com.xw.repo.b.a(14);
        this.f10342m0 = iA;
        this.f10342m0 = Math.max(iA, Math.max(iWidth, iWidth2)) + this.f10323a0;
    }

    private String F(float f10) {
        return String.valueOf(G(f10));
    }

    private float G(float f10) {
        return BigDecimal.valueOf(f10).setScale(1, 4).floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void H() {
        i iVar = this.f10341l0;
        if (iVar == null) {
            return;
        }
        iVar.setVisibility(8);
        if (this.f10341l0.getParent() != null) {
            this.f10340k0.removeViewImmediate(this.f10341l0);
        }
    }

    private void I() {
        if (this.f10322a == this.f10324b) {
            this.f10322a = 0.0f;
            this.f10324b = 100.0f;
        }
        float f10 = this.f10322a;
        float f11 = this.f10324b;
        if (f10 > f11) {
            this.f10324b = f10;
            this.f10322a = f11;
        }
        float f12 = this.f10326c;
        float f13 = this.f10322a;
        if (f12 < f13) {
            this.f10326c = f13;
        }
        float f14 = this.f10326c;
        float f15 = this.f10324b;
        if (f14 > f15) {
            this.f10326c = f15;
        }
        int i10 = this.f10332f;
        int i11 = this.f10330e;
        if (i10 < i11) {
            this.f10332f = i11 + com.xw.repo.b.a(2);
        }
        int i12 = this.f10334g;
        int i13 = this.f10332f;
        if (i12 <= i13) {
            this.f10334g = i13 + com.xw.repo.b.a(2);
        }
        int i14 = this.f10336h;
        int i15 = this.f10332f;
        if (i14 <= i15) {
            this.f10336h = i15 * 2;
        }
        if (this.f10353u <= 0) {
            this.f10353u = 10;
        }
        float f16 = this.f10324b - this.f10322a;
        this.R = f16;
        float f17 = f16 / this.f10353u;
        this.S = f17;
        if (f17 < 1.0f) {
            this.f10328d = true;
        }
        if (this.f10328d) {
            this.F = true;
        }
        int i16 = this.A;
        if (i16 != -1) {
            this.f10358x = true;
        }
        if (this.f10358x) {
            if (i16 == -1) {
                this.A = 0;
            }
            if (this.A == 2) {
                this.f10355v = true;
            }
        }
        if (this.B < 1) {
            this.B = 1;
        }
        J();
        if (this.H) {
            this.I = false;
            this.f10357w = false;
        }
        if (this.f10357w && !this.f10355v) {
            this.f10357w = false;
        }
        if (this.I) {
            float f18 = this.f10322a;
            this.f10352t0 = f18;
            if (this.f10326c != f18) {
                this.f10352t0 = this.S;
            }
            this.f10355v = true;
            this.f10357w = true;
        }
        if (this.M) {
            this.K = false;
        }
        if (this.K) {
            setProgress(this.f10326c);
        }
        this.D = (this.f10328d || this.I || (this.f10358x && this.A == 2)) ? this.f10359y : this.D;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0052 A[PHI: r5
      0x0052: PHI (r5v3 float) = (r5v2 float), (r5v2 float), (r5v2 float), (r5v7 float) binds: [B:26:0x004d, B:27:0x004f, B:19:0x0030, B:24:0x0042] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void J() {
        /*
            r8 = this;
            int r0 = r8.A
            r1 = 0
            r2 = 1
            r3 = 2
            if (r0 != r3) goto L9
            r0 = 1
            goto La
        L9:
            r0 = 0
        La:
            int r4 = r8.B
            if (r4 <= r2) goto L14
            int r4 = r8.f10353u
            int r4 = r4 % r3
            if (r4 != 0) goto L14
            goto L15
        L14:
            r2 = 0
        L15:
            int r3 = r8.f10353u
            if (r1 > r3) goto L75
            boolean r4 = r8.N
            if (r4 == 0) goto L26
            float r5 = r8.f10324b
            float r6 = r8.S
            float r7 = (float) r1
            float r6 = r6 * r7
            float r5 = r5 - r6
            goto L2e
        L26:
            float r5 = r8.f10322a
            float r6 = r8.S
            float r7 = (float) r1
            float r6 = r6 * r7
            float r5 = r5 + r6
        L2e:
            if (r0 == 0) goto L4d
            if (r2 == 0) goto L52
            int r3 = r8.B
            int r3 = r1 % r3
            if (r3 != 0) goto L72
            if (r4 == 0) goto L44
            float r3 = r8.f10324b
            float r4 = r8.S
            float r5 = (float) r1
            float r4 = r4 * r5
            float r3 = r3 - r4
        L42:
            r5 = r3
            goto L52
        L44:
            float r3 = r8.f10322a
            float r4 = r8.S
            float r5 = (float) r1
            float r4 = r4 * r5
            float r3 = r3 + r4
            goto L42
        L4d:
            if (r1 == 0) goto L52
            if (r1 == r3) goto L52
            goto L72
        L52:
            android.util.SparseArray r3 = r8.f10327c0
            boolean r4 = r8.f10328d
            if (r4 == 0) goto L5d
            java.lang.String r4 = r8.F(r5)
            goto L6f
        L5d:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            int r5 = (int) r5
            r4.append(r5)
            java.lang.String r5 = ""
            r4.append(r5)
            java.lang.String r4 = r4.toString()
        L6f:
            r3.put(r1, r4)
        L72:
            int r1 = r1 + 1
            goto L15
        L75:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xw.repo.BubbleSeekBar.J():void");
    }

    private boolean K(MotionEvent motionEvent) {
        if (!isEnabled()) {
            return false;
        }
        float f10 = (this.U / this.R) * (this.f10326c - this.f10322a);
        float f11 = this.N ? this.f10337h0 - f10 : this.f10335g0 + f10;
        float measuredHeight = getMeasuredHeight() / 2.0f;
        return ((motionEvent.getX() - f11) * (motionEvent.getX() - f11)) + ((motionEvent.getY() - measuredHeight) * (motionEvent.getY() - measuredHeight)) <= (this.f10335g0 + ((float) com.xw.repo.b.a(8))) * (this.f10335g0 + ((float) com.xw.repo.b.a(8)));
    }

    private boolean L(MotionEvent motionEvent) {
        return isEnabled() && motionEvent.getX() >= ((float) getPaddingLeft()) && motionEvent.getX() <= ((float) (getMeasuredWidth() - getPaddingRight())) && motionEvent.getY() >= ((float) getPaddingTop()) && motionEvent.getY() <= ((float) (getMeasuredHeight() - getPaddingBottom()));
    }

    private void M() {
        Window window;
        getLocationInWindow(this.f10348r0);
        Object parent = getParent();
        if (parent instanceof View) {
            View view = (View) parent;
            if (view.getMeasuredWidth() > 0) {
                int[] iArr = this.f10348r0;
                iArr[0] = iArr[0] % view.getMeasuredWidth();
            }
        }
        if (this.N) {
            this.f10343n0 = (this.f10348r0[0] + this.f10337h0) - (this.f10341l0.getMeasuredWidth() / 2.0f);
        } else {
            this.f10343n0 = (this.f10348r0[0] + this.f10335g0) - (this.f10341l0.getMeasuredWidth() / 2.0f);
        }
        this.f10345p0 = B();
        float measuredHeight = this.f10348r0[1] - this.f10341l0.getMeasuredHeight();
        this.f10344o0 = measuredHeight;
        this.f10344o0 = measuredHeight - com.xw.repo.b.a(24);
        if (com.xw.repo.b.b()) {
            this.f10344o0 -= com.xw.repo.b.a(4);
        }
        Context context = getContext();
        if (!(context instanceof Activity) || (window = ((Activity) context).getWindow()) == null || (window.getAttributes().flags & WXMediaMessage.DESCRIPTION_LENGTH_LIMIT) == 0) {
            return;
        }
        Resources system = Resources.getSystem();
        this.f10344o0 += system.getDimensionPixelSize(system.getIdentifier("status_bar_height", "dimen", "android"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float N() {
        float f10 = this.f10326c;
        if (this.I && this.f10331e0) {
            float f11 = this.S / 2.0f;
            if (this.G) {
                if (f10 != this.f10322a && f10 != this.f10324b) {
                    for (int i10 = 0; i10 <= this.f10353u; i10++) {
                        float f12 = this.S;
                        float f13 = i10 * f12;
                        if (f13 < f10 && f13 + f12 >= f10) {
                            return f11 + f13 > f10 ? f13 : f13 + f12;
                        }
                    }
                }
            }
            float f14 = this.f10352t0;
            if (f10 >= f14) {
                if (f10 >= f11 + f14) {
                    float f15 = f14 + this.S;
                    this.f10352t0 = f15;
                    return f15;
                }
            } else if (f10 < f14 - f11) {
                float f16 = f14 - this.S;
                this.f10352t0 = f16;
                return f16;
            }
            return f14;
        }
        return f10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void O() {
        i iVar = this.f10341l0;
        if (iVar == null || iVar.getParent() != null) {
            return;
        }
        WindowManager.LayoutParams layoutParams = this.f10346q0;
        layoutParams.x = (int) (this.f10345p0 + 0.5f);
        layoutParams.y = (int) (this.f10344o0 + 0.5f);
        this.f10341l0.setAlpha(0.0f);
        this.f10341l0.setVisibility(0);
        this.f10341l0.animate().alpha(1.0f).setDuration(this.G ? 0L : this.J).setListener(new g()).start();
        this.f10341l0.a(this.F ? String.valueOf(getProgressFloat()) : String.valueOf(getProgress()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z() {
        ValueAnimator valueAnimatorOfFloat;
        int i10 = 0;
        float f10 = 0.0f;
        while (i10 <= this.f10353u) {
            float f11 = this.V;
            f10 = (i10 * f11) + this.f10335g0;
            float f12 = this.T;
            if (f10 <= f12 && f12 - f10 <= f11) {
                break;
            } else {
                i10++;
            }
        }
        boolean z10 = BigDecimal.valueOf((double) this.T).setScale(1, 4).floatValue() == f10;
        AnimatorSet animatorSet = new AnimatorSet();
        if (z10) {
            valueAnimatorOfFloat = null;
        } else {
            float f13 = this.T;
            float f14 = f13 - f10;
            float f15 = this.V;
            valueAnimatorOfFloat = f14 <= f15 / 2.0f ? ValueAnimator.ofFloat(f13, f10) : ValueAnimator.ofFloat(f13, ((i10 + 1) * f15) + this.f10335g0);
            valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
            valueAnimatorOfFloat.addUpdateListener(new e());
        }
        if (!this.M) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f10341l0, (Property<i, Float>) View.ALPHA, this.K ? 1.0f : 0.0f);
            if (z10) {
                animatorSet.setDuration(this.J).play(objectAnimatorOfFloat);
            } else {
                animatorSet.setDuration(this.J).playTogether(valueAnimatorOfFloat, objectAnimatorOfFloat);
            }
        } else if (!z10) {
            animatorSet.setDuration(this.J).playTogether(valueAnimatorOfFloat);
        }
        animatorSet.addListener(new f());
        animatorSet.start();
    }

    void E(com.xw.repo.a aVar) {
        this.f10322a = aVar.f10376a;
        this.f10324b = aVar.f10377b;
        this.f10326c = aVar.f10378c;
        this.f10328d = aVar.f10379d;
        this.f10330e = aVar.f10380e;
        this.f10332f = aVar.f10381f;
        this.f10334g = aVar.f10382g;
        this.f10336h = aVar.f10383h;
        this.f10347r = aVar.f10384i;
        this.f10349s = aVar.f10385j;
        this.f10351t = aVar.f10386k;
        this.f10353u = aVar.f10387l;
        this.f10355v = aVar.f10388m;
        this.f10357w = aVar.f10389n;
        this.f10358x = aVar.f10390o;
        this.f10359y = aVar.f10391p;
        this.f10360z = aVar.f10392q;
        this.A = aVar.f10393r;
        this.B = aVar.f10394s;
        this.C = aVar.f10395t;
        this.D = aVar.f10396u;
        this.E = aVar.f10397v;
        this.F = aVar.f10398w;
        this.J = aVar.f10399x;
        this.G = aVar.f10400y;
        this.H = aVar.f10401z;
        this.I = aVar.A;
        this.O = aVar.B;
        this.P = aVar.C;
        this.Q = aVar.D;
        this.K = aVar.E;
        this.L = aVar.F;
        this.M = aVar.G;
        this.N = aVar.H;
        I();
        D();
        k kVar = this.f10333f0;
        if (kVar != null) {
            kVar.J(this, getProgress(), getProgressFloat(), false);
            this.f10333f0.H0(this, getProgress(), getProgressFloat(), false);
        }
        this.f10354u0 = null;
        requestLayout();
    }

    public com.xw.repo.a getConfigBuilder() {
        if (this.f10354u0 == null) {
            this.f10354u0 = new com.xw.repo.a(this);
        }
        com.xw.repo.a aVar = this.f10354u0;
        aVar.f10376a = this.f10322a;
        aVar.f10377b = this.f10324b;
        aVar.f10378c = this.f10326c;
        aVar.f10379d = this.f10328d;
        aVar.f10380e = this.f10330e;
        aVar.f10381f = this.f10332f;
        aVar.f10382g = this.f10334g;
        aVar.f10383h = this.f10336h;
        aVar.f10384i = this.f10347r;
        aVar.f10385j = this.f10349s;
        aVar.f10386k = this.f10351t;
        aVar.f10387l = this.f10353u;
        aVar.f10388m = this.f10355v;
        aVar.f10389n = this.f10357w;
        aVar.f10390o = this.f10358x;
        aVar.f10391p = this.f10359y;
        aVar.f10392q = this.f10360z;
        aVar.f10393r = this.A;
        aVar.f10394s = this.B;
        aVar.f10395t = this.C;
        aVar.f10396u = this.D;
        aVar.f10397v = this.E;
        aVar.f10398w = this.F;
        aVar.f10399x = this.J;
        aVar.f10400y = this.G;
        aVar.f10401z = this.H;
        aVar.A = this.I;
        aVar.B = this.O;
        aVar.C = this.P;
        aVar.D = this.Q;
        aVar.E = this.K;
        aVar.F = this.L;
        aVar.G = this.M;
        aVar.H = this.N;
        return aVar;
    }

    public float getMax() {
        return this.f10324b;
    }

    public float getMin() {
        return this.f10322a;
    }

    public k getOnProgressChangedListener() {
        return this.f10333f0;
    }

    public int getProgress() {
        return Math.round(N());
    }

    public float getProgressFloat() {
        return G(N());
    }

    @Override // android.view.View
    protected void onDetachedFromWindow() {
        H();
        super.onDetachedFromWindow();
    }

    /* JADX WARN: Removed duplicated region for block: B:86:0x025d  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void onDraw(android.graphics.Canvas r18) {
        /*
            Method dump skipped, instruction units count: 732
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xw.repo.BubbleSeekBar.onDraw(android.graphics.Canvas):void");
    }

    @Override // android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (this.M) {
            return;
        }
        M();
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int iMax = this.f10336h * 2;
        if (this.C) {
            this.f10338i0.setTextSize(this.D);
            this.f10338i0.getTextBounds("j", 0, 1, this.f10339j0);
            iMax += this.f10339j0.height();
        }
        if (this.f10358x && this.A >= 1) {
            this.f10338i0.setTextSize(this.f10359y);
            this.f10338i0.getTextBounds("j", 0, 1, this.f10339j0);
            iMax = Math.max(iMax, (this.f10336h * 2) + this.f10339j0.height());
        }
        setMeasuredDimension(View.resolveSize(com.xw.repo.b.a(180), i10), iMax + (this.f10323a0 * 2));
        this.f10335g0 = getPaddingLeft() + this.f10336h;
        this.f10337h0 = (getMeasuredWidth() - getPaddingRight()) - this.f10336h;
        if (this.f10358x) {
            this.f10338i0.setTextSize(this.f10359y);
            int i12 = this.A;
            if (i12 == 0) {
                String str = (String) this.f10327c0.get(0);
                this.f10338i0.getTextBounds(str, 0, str.length(), this.f10339j0);
                this.f10335g0 += this.f10339j0.width() + this.f10323a0;
                String str2 = (String) this.f10327c0.get(this.f10353u);
                this.f10338i0.getTextBounds(str2, 0, str2.length(), this.f10339j0);
                this.f10337h0 -= this.f10339j0.width() + this.f10323a0;
            } else if (i12 >= 1) {
                String str3 = (String) this.f10327c0.get(0);
                this.f10338i0.getTextBounds(str3, 0, str3.length(), this.f10339j0);
                this.f10335g0 = getPaddingLeft() + Math.max(this.f10336h, this.f10339j0.width() / 2.0f) + this.f10323a0;
                String str4 = (String) this.f10327c0.get(this.f10353u);
                this.f10338i0.getTextBounds(str4, 0, str4.length(), this.f10339j0);
                this.f10337h0 = ((getMeasuredWidth() - getPaddingRight()) - Math.max(this.f10336h, this.f10339j0.width() / 2.0f)) - this.f10323a0;
            }
        } else if (this.C && this.A == -1) {
            this.f10338i0.setTextSize(this.D);
            String str5 = (String) this.f10327c0.get(0);
            this.f10338i0.getTextBounds(str5, 0, str5.length(), this.f10339j0);
            this.f10335g0 = getPaddingLeft() + Math.max(this.f10336h, this.f10339j0.width() / 2.0f) + this.f10323a0;
            String str6 = (String) this.f10327c0.get(this.f10353u);
            this.f10338i0.getTextBounds(str6, 0, str6.length(), this.f10339j0);
            this.f10337h0 = ((getMeasuredWidth() - getPaddingRight()) - Math.max(this.f10336h, this.f10339j0.width() / 2.0f)) - this.f10323a0;
        }
        float f10 = this.f10337h0 - this.f10335g0;
        this.U = f10;
        this.V = (f10 * 1.0f) / this.f10353u;
        if (this.M) {
            return;
        }
        this.f10341l0.measure(i10, i11);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof Bundle)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        Bundle bundle = (Bundle) parcelable;
        this.f10326c = bundle.getFloat("progress");
        super.onRestoreInstanceState(bundle.getParcelable("save_instance"));
        i iVar = this.f10341l0;
        if (iVar != null) {
            iVar.a(this.F ? String.valueOf(getProgressFloat()) : String.valueOf(getProgress()));
        }
        setProgress(this.f10326c);
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("save_instance", super.onSaveInstanceState());
        bundle.putFloat("progress", this.f10326c);
        return bundle;
    }

    @Override // android.view.View
    protected void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        post(new a());
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00a1  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r6) {
        /*
            Method dump skipped, instruction units count: 452
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xw.repo.BubbleSeekBar.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.View
    protected void onVisibilityChanged(View view, int i10) {
        if (this.M || !this.K) {
            return;
        }
        if (i10 != 0) {
            H();
        } else if (this.f10325b0) {
            O();
        }
        super.onVisibilityChanged(view, i10);
    }

    @Override // android.view.View
    public boolean performClick() {
        return super.performClick();
    }

    public void setBubbleColor(int i10) {
        if (this.O != i10) {
            this.O = i10;
            i iVar = this.f10341l0;
            if (iVar != null) {
                iVar.invalidate();
            }
        }
    }

    public void setCustomSectionTextArray(j jVar) {
        this.f10327c0 = jVar.a(this.f10353u, this.f10327c0);
        for (int i10 = 0; i10 <= this.f10353u; i10++) {
            if (this.f10327c0.get(i10) == null) {
                this.f10327c0.put(i10, "");
            }
        }
        this.C = false;
        requestLayout();
        invalidate();
    }

    public void setOnProgressChangedListener(k kVar) {
        this.f10333f0 = kVar;
    }

    public void setProgress(float f10) {
        this.f10326c = f10;
        k kVar = this.f10333f0;
        if (kVar != null) {
            kVar.J(this, getProgress(), getProgressFloat(), false);
            this.f10333f0.H0(this, getProgress(), getProgressFloat(), false);
        }
        if (!this.M) {
            this.f10345p0 = B();
        }
        if (this.K) {
            H();
            postDelayed(new h(), this.L);
        }
        if (this.I) {
            this.f10331e0 = false;
        }
        postInvalidate();
    }

    public void setSecondTrackColor(int i10) {
        if (this.f10349s != i10) {
            this.f10349s = i10;
            invalidate();
        }
    }

    public void setThumbColor(int i10) {
        if (this.f10351t != i10) {
            this.f10351t = i10;
            invalidate();
        }
    }

    public void setTrackColor(int i10) {
        if (this.f10347r != i10) {
            this.f10347r = i10;
            invalidate();
        }
    }

    public BubbleSeekBar(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.A = -1;
        this.f10327c0 = new SparseArray();
        this.f10348r0 = new int[2];
        this.f10350s0 = true;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ob.b.f23380p, i10, 0);
        this.f10322a = typedArrayObtainStyledAttributes.getFloat(ob.b.B, 0.0f);
        this.f10324b = typedArrayObtainStyledAttributes.getFloat(ob.b.A, 100.0f);
        this.f10326c = typedArrayObtainStyledAttributes.getFloat(ob.b.C, this.f10322a);
        this.f10328d = typedArrayObtainStyledAttributes.getBoolean(ob.b.f23400z, false);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(ob.b.Y, com.xw.repo.b.a(2));
        this.f10330e = dimensionPixelSize;
        int dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(ob.b.F, dimensionPixelSize + com.xw.repo.b.a(2));
        this.f10332f = dimensionPixelSize2;
        this.f10334g = typedArrayObtainStyledAttributes.getDimensionPixelSize(ob.b.S, dimensionPixelSize2 + com.xw.repo.b.a(2));
        this.f10336h = typedArrayObtainStyledAttributes.getDimensionPixelSize(ob.b.T, this.f10332f * 2);
        this.f10353u = typedArrayObtainStyledAttributes.getInteger(ob.b.G, 10);
        this.f10347r = typedArrayObtainStyledAttributes.getColor(ob.b.X, b0.b.b(context, ob.a.f23349b));
        int color = typedArrayObtainStyledAttributes.getColor(ob.b.E, b0.b.b(context, ob.a.f23348a));
        this.f10349s = color;
        this.f10351t = typedArrayObtainStyledAttributes.getColor(ob.b.R, color);
        this.f10358x = typedArrayObtainStyledAttributes.getBoolean(ob.b.P, false);
        this.f10359y = typedArrayObtainStyledAttributes.getDimensionPixelSize(ob.b.K, com.xw.repo.b.c(14));
        this.f10360z = typedArrayObtainStyledAttributes.getColor(ob.b.H, this.f10347r);
        this.H = typedArrayObtainStyledAttributes.getBoolean(ob.b.M, false);
        this.I = typedArrayObtainStyledAttributes.getBoolean(ob.b.L, false);
        int integer = typedArrayObtainStyledAttributes.getInteger(ob.b.J, -1);
        if (integer == 0) {
            this.A = 0;
        } else if (integer == 1) {
            this.A = 1;
        } else if (integer == 2) {
            this.A = 2;
        } else {
            this.A = -1;
        }
        this.B = typedArrayObtainStyledAttributes.getInteger(ob.b.I, 1);
        this.C = typedArrayObtainStyledAttributes.getBoolean(ob.b.Q, false);
        this.D = typedArrayObtainStyledAttributes.getDimensionPixelSize(ob.b.V, com.xw.repo.b.c(14));
        this.E = typedArrayObtainStyledAttributes.getColor(ob.b.U, this.f10349s);
        this.O = typedArrayObtainStyledAttributes.getColor(ob.b.f23392v, this.f10349s);
        this.P = typedArrayObtainStyledAttributes.getDimensionPixelSize(ob.b.f23396x, com.xw.repo.b.c(14));
        this.Q = typedArrayObtainStyledAttributes.getColor(ob.b.f23394w, -1);
        this.f10355v = typedArrayObtainStyledAttributes.getBoolean(ob.b.O, false);
        this.f10357w = typedArrayObtainStyledAttributes.getBoolean(ob.b.f23390u, false);
        this.F = typedArrayObtainStyledAttributes.getBoolean(ob.b.N, false);
        int integer2 = typedArrayObtainStyledAttributes.getInteger(ob.b.f23388t, -1);
        this.J = integer2 < 0 ? 200L : integer2;
        this.G = typedArrayObtainStyledAttributes.getBoolean(ob.b.W, false);
        this.K = typedArrayObtainStyledAttributes.getBoolean(ob.b.f23384r, false);
        int integer3 = typedArrayObtainStyledAttributes.getInteger(ob.b.f23386s, 0);
        this.L = integer3 < 0 ? 0L : integer3;
        this.M = typedArrayObtainStyledAttributes.getBoolean(ob.b.f23398y, false);
        this.N = typedArrayObtainStyledAttributes.getBoolean(ob.b.D, false);
        setEnabled(typedArrayObtainStyledAttributes.getBoolean(ob.b.f23382q, isEnabled()));
        typedArrayObtainStyledAttributes.recycle();
        Paint paint = new Paint();
        this.f10338i0 = paint;
        paint.setAntiAlias(true);
        this.f10338i0.setStrokeCap(Paint.Cap.ROUND);
        this.f10338i0.setTextAlign(Paint.Align.CENTER);
        this.f10339j0 = new Rect();
        this.f10323a0 = com.xw.repo.b.a(2);
        I();
        if (this.M) {
            return;
        }
        this.f10340k0 = (WindowManager) context.getSystemService("window");
        i iVar = new i(this, context);
        this.f10341l0 = iVar;
        iVar.a(this.F ? String.valueOf(getProgressFloat()) : String.valueOf(getProgress()));
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.f10346q0 = layoutParams;
        layoutParams.gravity = 8388659;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.flags = 524328;
        if (com.xw.repo.b.b() || Build.VERSION.SDK_INT >= 25) {
            this.f10346q0.type = 2;
        } else {
            this.f10346q0.type = 2005;
        }
        D();
    }
}
