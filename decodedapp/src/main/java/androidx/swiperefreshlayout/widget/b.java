package androidx.swiperefreshlayout.widget;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import l0.g;

/* JADX INFO: loaded from: classes.dex */
public class b extends Drawable implements Animatable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Interpolator f3281g = new LinearInterpolator();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Interpolator f3282h = new b1.b();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final int[] f3283r = {-16777216};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c f3284a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f3285b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Resources f3286c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Animator f3287d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    float f3288e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    boolean f3289f;

    class a implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ c f3290a;

        a(c cVar) {
            this.f3290a = cVar;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            b.this.n(fFloatValue, this.f3290a);
            b.this.b(fFloatValue, this.f3290a, false);
            b.this.invalidateSelf();
        }
    }

    /* JADX INFO: renamed from: androidx.swiperefreshlayout.widget.b$b, reason: collision with other inner class name */
    class C0046b implements Animator.AnimatorListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ c f3292a;

        C0046b(c cVar) {
            this.f3292a = cVar;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            b.this.b(1.0f, this.f3292a, true);
            this.f3292a.A();
            this.f3292a.l();
            b bVar = b.this;
            if (!bVar.f3289f) {
                bVar.f3288e += 1.0f;
                return;
            }
            bVar.f3289f = false;
            animator.cancel();
            animator.setDuration(1332L);
            animator.start();
            this.f3292a.x(false);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            b.this.f3288e = 0.0f;
        }
    }

    private static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final RectF f3294a = new RectF();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Paint f3295b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final Paint f3296c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final Paint f3297d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        float f3298e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        float f3299f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        float f3300g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        float f3301h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        int[] f3302i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f3303j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        float f3304k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        float f3305l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        float f3306m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        boolean f3307n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Path f3308o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        float f3309p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        float f3310q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f3311r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f3312s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f3313t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        int f3314u;

        c() {
            Paint paint = new Paint();
            this.f3295b = paint;
            Paint paint2 = new Paint();
            this.f3296c = paint2;
            Paint paint3 = new Paint();
            this.f3297d = paint3;
            this.f3298e = 0.0f;
            this.f3299f = 0.0f;
            this.f3300g = 0.0f;
            this.f3301h = 5.0f;
            this.f3309p = 1.0f;
            this.f3313t = 255;
            paint.setStrokeCap(Paint.Cap.SQUARE);
            paint.setAntiAlias(true);
            paint.setStyle(Paint.Style.STROKE);
            paint2.setStyle(Paint.Style.FILL);
            paint2.setAntiAlias(true);
            paint3.setColor(0);
        }

        void A() {
            this.f3304k = this.f3298e;
            this.f3305l = this.f3299f;
            this.f3306m = this.f3300g;
        }

        void a(Canvas canvas, Rect rect) {
            RectF rectF = this.f3294a;
            float f10 = this.f3310q;
            float fMin = (this.f3301h / 2.0f) + f10;
            if (f10 <= 0.0f) {
                fMin = (Math.min(rect.width(), rect.height()) / 2.0f) - Math.max((this.f3311r * this.f3309p) / 2.0f, this.f3301h / 2.0f);
            }
            rectF.set(rect.centerX() - fMin, rect.centerY() - fMin, rect.centerX() + fMin, rect.centerY() + fMin);
            float f11 = this.f3298e;
            float f12 = this.f3300g;
            float f13 = (f11 + f12) * 360.0f;
            float f14 = ((this.f3299f + f12) * 360.0f) - f13;
            this.f3295b.setColor(this.f3314u);
            this.f3295b.setAlpha(this.f3313t);
            float f15 = this.f3301h / 2.0f;
            rectF.inset(f15, f15);
            canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, this.f3297d);
            float f16 = -f15;
            rectF.inset(f16, f16);
            canvas.drawArc(rectF, f13, f14, false, this.f3295b);
            b(canvas, f13, f14, rectF);
        }

        void b(Canvas canvas, float f10, float f11, RectF rectF) {
            if (this.f3307n) {
                Path path = this.f3308o;
                if (path == null) {
                    Path path2 = new Path();
                    this.f3308o = path2;
                    path2.setFillType(Path.FillType.EVEN_ODD);
                } else {
                    path.reset();
                }
                float fMin = Math.min(rectF.width(), rectF.height()) / 2.0f;
                float f12 = (this.f3311r * this.f3309p) / 2.0f;
                this.f3308o.moveTo(0.0f, 0.0f);
                this.f3308o.lineTo(this.f3311r * this.f3309p, 0.0f);
                Path path3 = this.f3308o;
                float f13 = this.f3311r;
                float f14 = this.f3309p;
                path3.lineTo((f13 * f14) / 2.0f, this.f3312s * f14);
                this.f3308o.offset((fMin + rectF.centerX()) - f12, rectF.centerY() + (this.f3301h / 2.0f));
                this.f3308o.close();
                this.f3296c.setColor(this.f3314u);
                this.f3296c.setAlpha(this.f3313t);
                canvas.save();
                canvas.rotate(f10 + f11, rectF.centerX(), rectF.centerY());
                canvas.drawPath(this.f3308o, this.f3296c);
                canvas.restore();
            }
        }

        int c() {
            return this.f3313t;
        }

        float d() {
            return this.f3299f;
        }

        int e() {
            return this.f3302i[f()];
        }

        int f() {
            return (this.f3303j + 1) % this.f3302i.length;
        }

        float g() {
            return this.f3298e;
        }

        int h() {
            return this.f3302i[this.f3303j];
        }

        float i() {
            return this.f3305l;
        }

        float j() {
            return this.f3306m;
        }

        float k() {
            return this.f3304k;
        }

        void l() {
            t(f());
        }

        void m() {
            this.f3304k = 0.0f;
            this.f3305l = 0.0f;
            this.f3306m = 0.0f;
            y(0.0f);
            v(0.0f);
            w(0.0f);
        }

        void n(int i10) {
            this.f3313t = i10;
        }

        void o(float f10, float f11) {
            this.f3311r = (int) f10;
            this.f3312s = (int) f11;
        }

        void p(float f10) {
            if (f10 != this.f3309p) {
                this.f3309p = f10;
            }
        }

        void q(float f10) {
            this.f3310q = f10;
        }

        void r(int i10) {
            this.f3314u = i10;
        }

        void s(ColorFilter colorFilter) {
            this.f3295b.setColorFilter(colorFilter);
        }

        void t(int i10) {
            this.f3303j = i10;
            this.f3314u = this.f3302i[i10];
        }

        void u(int[] iArr) {
            this.f3302i = iArr;
            t(0);
        }

        void v(float f10) {
            this.f3299f = f10;
        }

        void w(float f10) {
            this.f3300g = f10;
        }

        void x(boolean z10) {
            if (this.f3307n != z10) {
                this.f3307n = z10;
            }
        }

        void y(float f10) {
            this.f3298e = f10;
        }

        void z(float f10) {
            this.f3301h = f10;
            this.f3295b.setStrokeWidth(f10);
        }
    }

    public b(Context context) {
        this.f3286c = ((Context) g.g(context)).getResources();
        c cVar = new c();
        this.f3284a = cVar;
        cVar.u(f3283r);
        k(2.5f);
        m();
    }

    private void a(float f10, c cVar) {
        n(f10, cVar);
        float fFloor = (float) (Math.floor(cVar.j() / 0.8f) + 1.0d);
        cVar.y(cVar.k() + (((cVar.i() - 0.01f) - cVar.k()) * f10));
        cVar.v(cVar.i());
        cVar.w(cVar.j() + ((fFloor - cVar.j()) * f10));
    }

    private int c(float f10, int i10, int i11) {
        return ((((i10 >> 24) & 255) + ((int) ((((i11 >> 24) & 255) - r0) * f10))) << 24) | ((((i10 >> 16) & 255) + ((int) ((((i11 >> 16) & 255) - r1) * f10))) << 16) | ((((i10 >> 8) & 255) + ((int) ((((i11 >> 8) & 255) - r2) * f10))) << 8) | ((i10 & 255) + ((int) (f10 * ((i11 & 255) - r8))));
    }

    private void h(float f10) {
        this.f3285b = f10;
    }

    private void i(float f10, float f11, float f12, float f13) {
        c cVar = this.f3284a;
        float f14 = this.f3286c.getDisplayMetrics().density;
        cVar.z(f11 * f14);
        cVar.q(f10 * f14);
        cVar.t(0);
        cVar.o(f12 * f14, f13 * f14);
    }

    private void m() {
        c cVar = this.f3284a;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new a(cVar));
        valueAnimatorOfFloat.setRepeatCount(-1);
        valueAnimatorOfFloat.setRepeatMode(1);
        valueAnimatorOfFloat.setInterpolator(f3281g);
        valueAnimatorOfFloat.addListener(new C0046b(cVar));
        this.f3287d = valueAnimatorOfFloat;
    }

    void b(float f10, c cVar, boolean z10) {
        float interpolation;
        float interpolation2;
        if (this.f3289f) {
            a(f10, cVar);
            return;
        }
        if (f10 != 1.0f || z10) {
            float fJ = cVar.j();
            if (f10 < 0.5f) {
                interpolation = cVar.k();
                interpolation2 = (f3282h.getInterpolation(f10 / 0.5f) * 0.79f) + 0.01f + interpolation;
            } else {
                float fK = cVar.k() + 0.79f;
                interpolation = fK - (((1.0f - f3282h.getInterpolation((f10 - 0.5f) / 0.5f)) * 0.79f) + 0.01f);
                interpolation2 = fK;
            }
            float f11 = fJ + (0.20999998f * f10);
            float f12 = (f10 + this.f3288e) * 216.0f;
            cVar.y(interpolation);
            cVar.v(interpolation2);
            cVar.w(f11);
            h(f12);
        }
    }

    public void d(boolean z10) {
        this.f3284a.x(z10);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        canvas.save();
        canvas.rotate(this.f3285b, bounds.exactCenterX(), bounds.exactCenterY());
        this.f3284a.a(canvas, bounds);
        canvas.restore();
    }

    public void e(float f10) {
        this.f3284a.p(f10);
        invalidateSelf();
    }

    public void f(int... iArr) {
        this.f3284a.u(iArr);
        this.f3284a.t(0);
        invalidateSelf();
    }

    public void g(float f10) {
        this.f3284a.w(f10);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f3284a.c();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.f3287d.isRunning();
    }

    public void j(float f10, float f11) {
        this.f3284a.y(f10);
        this.f3284a.v(f11);
        invalidateSelf();
    }

    public void k(float f10) {
        this.f3284a.z(f10);
        invalidateSelf();
    }

    public void l(int i10) {
        if (i10 == 0) {
            i(11.0f, 3.0f, 12.0f, 6.0f);
        } else {
            i(7.5f, 2.5f, 10.0f, 5.0f);
        }
        invalidateSelf();
    }

    void n(float f10, c cVar) {
        if (f10 > 0.75f) {
            cVar.r(c((f10 - 0.75f) / 0.25f, cVar.h(), cVar.e()));
        } else {
            cVar.r(cVar.h());
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        this.f3284a.n(i10);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f3284a.s(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        this.f3287d.cancel();
        this.f3284a.A();
        if (this.f3284a.d() != this.f3284a.g()) {
            this.f3289f = true;
            this.f3287d.setDuration(666L);
            this.f3287d.start();
        } else {
            this.f3284a.t(0);
            this.f3284a.m();
            this.f3287d.setDuration(1332L);
            this.f3287d.start();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        this.f3287d.cancel();
        h(0.0f);
        this.f3284a.x(false);
        this.f3284a.t(0);
        this.f3284a.m();
        invalidateSelf();
    }
}
