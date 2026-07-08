package androidx.recyclerview.widget;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.stetho.server.http.HttpStatus;

/* JADX INFO: loaded from: classes.dex */
class d extends RecyclerView.p implements RecyclerView.t {
    private static final int[] M = {R.attr.state_pressed};
    private static final int[] N = new int[0];
    private RecyclerView B;
    final ValueAnimator I;
    int J;
    private final Runnable K;
    private final RecyclerView.u L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f3155a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f3156b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final StateListDrawable f3157c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final Drawable f3158d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f3159e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f3160f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final StateListDrawable f3161g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Drawable f3162h;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final int f3163r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final int f3164s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    int f3165t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    int f3166u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    float f3167v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    int f3168w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    int f3169x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    float f3170y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private int f3171z = 0;
    private int A = 0;
    private boolean C = false;
    private boolean D = false;
    private int E = 0;
    private int F = 0;
    private final int[] G = new int[2];
    private final int[] H = new int[2];

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            d.this.q(HttpStatus.HTTP_INTERNAL_SERVER_ERROR);
        }
    }

    class b extends RecyclerView.u {
        b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.u
        public void b(RecyclerView recyclerView, int i10, int i11) {
            d.this.B(recyclerView.computeHorizontalScrollOffset(), recyclerView.computeVerticalScrollOffset());
        }
    }

    private class c extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f3174a = false;

        c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f3174a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f3174a) {
                this.f3174a = false;
                return;
            }
            if (((Float) d.this.I.getAnimatedValue()).floatValue() == 0.0f) {
                d dVar = d.this;
                dVar.J = 0;
                dVar.y(0);
            } else {
                d dVar2 = d.this;
                dVar2.J = 2;
                dVar2.v();
            }
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.d$d, reason: collision with other inner class name */
    private class C0044d implements ValueAnimator.AnimatorUpdateListener {
        C0044d() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int iFloatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
            d.this.f3157c.setAlpha(iFloatValue);
            d.this.f3158d.setAlpha(iFloatValue);
            d.this.v();
        }
    }

    d(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i10, int i11, int i12) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.I = valueAnimatorOfFloat;
        this.J = 0;
        this.K = new a();
        this.L = new b();
        this.f3157c = stateListDrawable;
        this.f3158d = drawable;
        this.f3161g = stateListDrawable2;
        this.f3162h = drawable2;
        this.f3159e = Math.max(i10, stateListDrawable.getIntrinsicWidth());
        this.f3160f = Math.max(i10, drawable.getIntrinsicWidth());
        this.f3163r = Math.max(i10, stateListDrawable2.getIntrinsicWidth());
        this.f3164s = Math.max(i10, drawable2.getIntrinsicWidth());
        this.f3155a = i11;
        this.f3156b = i12;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        valueAnimatorOfFloat.addListener(new c());
        valueAnimatorOfFloat.addUpdateListener(new C0044d());
        j(recyclerView);
    }

    private void C(float f10) {
        int[] iArrP = p();
        float fMax = Math.max(iArrP[0], Math.min(iArrP[1], f10));
        if (Math.abs(this.f3166u - fMax) < 2.0f) {
            return;
        }
        int iX = x(this.f3167v, fMax, iArrP, this.B.computeVerticalScrollRange(), this.B.computeVerticalScrollOffset(), this.A);
        if (iX != 0) {
            this.B.scrollBy(0, iX);
        }
        this.f3167v = fMax;
    }

    private void k() {
        this.B.removeCallbacks(this.K);
    }

    private void l() {
        this.B.k1(this);
        this.B.l1(this);
        this.B.m1(this.L);
        k();
    }

    private void m(Canvas canvas) {
        int i10 = this.A;
        int i11 = this.f3163r;
        int i12 = this.f3169x;
        int i13 = this.f3168w;
        this.f3161g.setBounds(0, 0, i13, i11);
        this.f3162h.setBounds(0, 0, this.f3171z, this.f3164s);
        canvas.translate(0.0f, i10 - i11);
        this.f3162h.draw(canvas);
        canvas.translate(i12 - (i13 / 2), 0.0f);
        this.f3161g.draw(canvas);
        canvas.translate(-r2, -r0);
    }

    private void n(Canvas canvas) {
        int i10 = this.f3171z;
        int i11 = this.f3159e;
        int i12 = i10 - i11;
        int i13 = this.f3166u;
        int i14 = this.f3165t;
        int i15 = i13 - (i14 / 2);
        this.f3157c.setBounds(0, 0, i11, i14);
        this.f3158d.setBounds(0, 0, this.f3160f, this.A);
        if (!s()) {
            canvas.translate(i12, 0.0f);
            this.f3158d.draw(canvas);
            canvas.translate(0.0f, i15);
            this.f3157c.draw(canvas);
            canvas.translate(-i12, -i15);
            return;
        }
        this.f3158d.draw(canvas);
        canvas.translate(this.f3159e, i15);
        canvas.scale(-1.0f, 1.0f);
        this.f3157c.draw(canvas);
        canvas.scale(-1.0f, 1.0f);
        canvas.translate(-this.f3159e, -i15);
    }

    private int[] o() {
        int[] iArr = this.H;
        int i10 = this.f3156b;
        iArr[0] = i10;
        iArr[1] = this.f3171z - i10;
        return iArr;
    }

    private int[] p() {
        int[] iArr = this.G;
        int i10 = this.f3156b;
        iArr[0] = i10;
        iArr[1] = this.A - i10;
        return iArr;
    }

    private void r(float f10) {
        int[] iArrO = o();
        float fMax = Math.max(iArrO[0], Math.min(iArrO[1], f10));
        if (Math.abs(this.f3169x - fMax) < 2.0f) {
            return;
        }
        int iX = x(this.f3170y, fMax, iArrO, this.B.computeHorizontalScrollRange(), this.B.computeHorizontalScrollOffset(), this.f3171z);
        if (iX != 0) {
            this.B.scrollBy(iX, 0);
        }
        this.f3170y = fMax;
    }

    private boolean s() {
        return this.B.getLayoutDirection() == 1;
    }

    private void w(int i10) {
        k();
        this.B.postDelayed(this.K, i10);
    }

    private int x(float f10, float f11, int[] iArr, int i10, int i11, int i12) {
        int i13 = iArr[1] - iArr[0];
        if (i13 == 0) {
            return 0;
        }
        int i14 = i10 - i12;
        int i15 = (int) (((f11 - f10) / i13) * i14);
        int i16 = i11 + i15;
        if (i16 >= i14 || i16 < 0) {
            return 0;
        }
        return i15;
    }

    private void z() {
        this.B.l(this);
        this.B.n(this);
        this.B.o(this.L);
    }

    public void A() {
        int i10 = this.J;
        if (i10 != 0) {
            if (i10 != 3) {
                return;
            } else {
                this.I.cancel();
            }
        }
        this.J = 1;
        ValueAnimator valueAnimator = this.I;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        this.I.setDuration(500L);
        this.I.setStartDelay(0L);
        this.I.start();
    }

    void B(int i10, int i11) {
        int iComputeVerticalScrollRange = this.B.computeVerticalScrollRange();
        int i12 = this.A;
        this.C = iComputeVerticalScrollRange - i12 > 0 && i12 >= this.f3155a;
        int iComputeHorizontalScrollRange = this.B.computeHorizontalScrollRange();
        int i13 = this.f3171z;
        boolean z10 = iComputeHorizontalScrollRange - i13 > 0 && i13 >= this.f3155a;
        this.D = z10;
        boolean z11 = this.C;
        if (!z11 && !z10) {
            if (this.E != 0) {
                y(0);
                return;
            }
            return;
        }
        if (z11) {
            float f10 = i12;
            this.f3166u = (int) ((f10 * (i11 + (f10 / 2.0f))) / iComputeVerticalScrollRange);
            this.f3165t = Math.min(i12, (i12 * i12) / iComputeVerticalScrollRange);
        }
        if (this.D) {
            float f11 = i13;
            this.f3169x = (int) ((f11 * (i10 + (f11 / 2.0f))) / iComputeHorizontalScrollRange);
            this.f3168w = Math.min(i13, (i13 * i13) / iComputeHorizontalScrollRange);
        }
        int i14 = this.E;
        if (i14 == 0 || i14 == 1) {
            y(1);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.t
    public void a(RecyclerView recyclerView, MotionEvent motionEvent) {
        if (this.E == 0) {
            return;
        }
        if (motionEvent.getAction() == 0) {
            boolean zU = u(motionEvent.getX(), motionEvent.getY());
            boolean zT = t(motionEvent.getX(), motionEvent.getY());
            if (zU || zT) {
                if (zT) {
                    this.F = 1;
                    this.f3170y = (int) motionEvent.getX();
                } else if (zU) {
                    this.F = 2;
                    this.f3167v = (int) motionEvent.getY();
                }
                y(2);
                return;
            }
            return;
        }
        if (motionEvent.getAction() == 1 && this.E == 2) {
            this.f3167v = 0.0f;
            this.f3170y = 0.0f;
            y(1);
            this.F = 0;
            return;
        }
        if (motionEvent.getAction() == 2 && this.E == 2) {
            A();
            if (this.F == 1) {
                r(motionEvent.getX());
            }
            if (this.F == 2) {
                C(motionEvent.getY());
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.t
    public boolean b(RecyclerView recyclerView, MotionEvent motionEvent) {
        int i10 = this.E;
        if (i10 != 1) {
            return i10 == 2;
        }
        boolean zU = u(motionEvent.getX(), motionEvent.getY());
        boolean zT = t(motionEvent.getX(), motionEvent.getY());
        if (motionEvent.getAction() != 0 || (!zU && !zT)) {
            return false;
        }
        if (zT) {
            this.F = 1;
            this.f3170y = (int) motionEvent.getX();
        } else if (zU) {
            this.F = 2;
            this.f3167v = (int) motionEvent.getY();
        }
        y(2);
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.t
    public void c(boolean z10) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void i(Canvas canvas, RecyclerView recyclerView, RecyclerView.b0 b0Var) {
        if (this.f3171z != this.B.getWidth() || this.A != this.B.getHeight()) {
            this.f3171z = this.B.getWidth();
            this.A = this.B.getHeight();
            y(0);
        } else if (this.J != 0) {
            if (this.C) {
                n(canvas);
            }
            if (this.D) {
                m(canvas);
            }
        }
    }

    public void j(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.B;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            l();
        }
        this.B = recyclerView;
        if (recyclerView != null) {
            z();
        }
    }

    void q(int i10) {
        int i11 = this.J;
        if (i11 == 1) {
            this.I.cancel();
        } else if (i11 != 2) {
            return;
        }
        this.J = 3;
        ValueAnimator valueAnimator = this.I;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f);
        this.I.setDuration(i10);
        this.I.start();
    }

    boolean t(float f10, float f11) {
        if (f11 < this.A - this.f3163r) {
            return false;
        }
        int i10 = this.f3169x;
        int i11 = this.f3168w;
        return f10 >= ((float) (i10 - (i11 / 2))) && f10 <= ((float) (i10 + (i11 / 2)));
    }

    boolean u(float f10, float f11) {
        if (s()) {
            if (f10 > this.f3159e) {
                return false;
            }
        } else if (f10 < this.f3171z - this.f3159e) {
            return false;
        }
        int i10 = this.f3166u;
        int i11 = this.f3165t;
        return f11 >= ((float) (i10 - (i11 / 2))) && f11 <= ((float) (i10 + (i11 / 2)));
    }

    void v() {
        this.B.invalidate();
    }

    void y(int i10) {
        if (i10 == 2 && this.E != 2) {
            this.f3157c.setState(M);
            k();
        }
        if (i10 == 0) {
            v();
        } else {
            A();
        }
        if (this.E == 2 && i10 != 2) {
            this.f3157c.setState(N);
            w(1200);
        } else if (i10 == 1) {
            w(1500);
        }
        this.E = i10;
    }
}
