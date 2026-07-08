package com.simplecityapps.recyclerview_fastscroll.views;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import androidx.annotation.Keep;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.mm.opensdk.constants.Build;

/* JADX INFO: loaded from: classes3.dex */
public class FastScroller {

    /* JADX INFO: renamed from: a */
    private FastScrollRecyclerView f10235a;

    /* JADX INFO: renamed from: b */
    private FastScrollPopup f10236b;

    /* JADX INFO: renamed from: c */
    private int f10237c;

    /* JADX INFO: renamed from: d */
    private int f10238d;

    /* JADX INFO: renamed from: e */
    private Paint f10239e;

    /* JADX INFO: renamed from: f */
    private Paint f10240f;

    /* JADX INFO: renamed from: g */
    private int f10241g;

    /* JADX INFO: renamed from: k */
    private int f10245k;

    /* JADX INFO: renamed from: l */
    private int f10246l;

    /* JADX INFO: renamed from: o */
    private boolean f10249o;

    /* JADX INFO: renamed from: p */
    private Animator f10250p;

    /* JADX INFO: renamed from: q */
    private boolean f10251q;

    /* JADX INFO: renamed from: r */
    private int f10252r;

    /* JADX INFO: renamed from: s */
    private boolean f10253s;

    /* JADX INFO: renamed from: t */
    private final Runnable f10254t;

    /* JADX INFO: renamed from: u */
    private int f10255u;

    /* JADX INFO: renamed from: v */
    private int f10256v;

    /* JADX INFO: renamed from: w */
    private boolean f10257w;

    /* JADX INFO: renamed from: x */
    private int f10258x;

    /* JADX INFO: renamed from: y */
    private int f10259y;

    /* JADX INFO: renamed from: h */
    private Rect f10242h = new Rect();

    /* JADX INFO: renamed from: i */
    private Rect f10243i = new Rect();

    /* JADX INFO: renamed from: j */
    private Rect f10244j = new Rect();

    /* JADX INFO: renamed from: m */
    private Point f10247m = new Point(-1, -1);

    /* JADX INFO: renamed from: n */
    private Point f10248n = new Point(0, 0);

    /* JADX INFO: renamed from: z */
    RectF f10260z = new RectF();

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (FastScroller.this.f10249o) {
                return;
            }
            if (FastScroller.this.f10250p != null) {
                FastScroller.this.f10250p.cancel();
            }
            FastScroller fastScroller = FastScroller.this;
            fastScroller.f10250p = ObjectAnimator.ofInt(fastScroller, "offsetX", (cb.a.a(fastScroller.f10235a.getResources()) ? -1 : 1) * FastScroller.this.j());
            FastScroller.this.f10250p.setInterpolator(new b1.a());
            FastScroller.this.f10250p.setDuration(200L);
            FastScroller.this.f10250p.start();
        }
    }

    class b extends RecyclerView.u {
        b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.u
        public void b(RecyclerView recyclerView, int i10, int i11) {
            super.b(recyclerView, i10, i11);
            if (FastScroller.this.f10235a.isInEditMode()) {
                return;
            }
            FastScroller.this.A();
        }
    }

    class c extends AnimatorListenerAdapter {
        c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            super.onAnimationCancel(animator);
            FastScroller.this.f10251q = false;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            FastScroller.this.f10251q = false;
        }
    }

    public FastScroller(Context context, FastScrollRecyclerView fastScrollRecyclerView, AttributeSet attributeSet) {
        this.f10252r = 1500;
        this.f10253s = true;
        this.f10256v = 2030043136;
        Resources resources = context.getResources();
        this.f10235a = fastScrollRecyclerView;
        this.f10236b = new FastScrollPopup(resources, fastScrollRecyclerView);
        this.f10237c = cb.a.b(resources, 52.0f);
        this.f10238d = cb.a.b(resources, 8.0f);
        this.f10241g = cb.a.b(resources, 6.0f);
        this.f10245k = cb.a.b(resources, -24.0f);
        this.f10239e = new Paint(1);
        this.f10240f = new Paint(1);
        this.f10258x = ViewConfiguration.get(context).getScaledTouchSlop();
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, ab.a.f420w, 0, 0);
        try {
            this.f10253s = typedArrayObtainStyledAttributes.getBoolean(ab.a.f421x, true);
            this.f10252r = typedArrayObtainStyledAttributes.getInteger(ab.a.f422y, 1500);
            this.f10257w = typedArrayObtainStyledAttributes.getBoolean(ab.a.f423z, true);
            this.f10255u = typedArrayObtainStyledAttributes.getColor(ab.a.G, 2030043136);
            this.f10256v = typedArrayObtainStyledAttributes.getColor(ab.a.I, 2030043136);
            int color = typedArrayObtainStyledAttributes.getColor(ab.a.K, Build.SUPPORT_SEND_MUSIC_VIDEO_MESSAGE);
            int color2 = typedArrayObtainStyledAttributes.getColor(ab.a.B, -16777216);
            int color3 = typedArrayObtainStyledAttributes.getColor(ab.a.D, -1);
            int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(ab.a.E, cb.a.c(resources, 32.0f));
            int dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(ab.a.A, cb.a.b(resources, 62.0f));
            int integer = typedArrayObtainStyledAttributes.getInteger(ab.a.F, 0);
            int integer2 = typedArrayObtainStyledAttributes.getInteger(ab.a.C, 0);
            this.f10238d = typedArrayObtainStyledAttributes.getDimensionPixelSize(ab.a.J, this.f10238d);
            this.f10241g = typedArrayObtainStyledAttributes.getDimensionPixelSize(ab.a.L, this.f10241g);
            this.f10240f.setColor(color);
            this.f10239e.setColor(this.f10257w ? this.f10256v : this.f10255u);
            this.f10236b.f(color2);
            this.f10236b.j(color3);
            this.f10236b.k(dimensionPixelSize);
            this.f10236b.e(dimensionPixelSize2);
            this.f10236b.h(integer);
            this.f10236b.g(integer2);
            typedArrayObtainStyledAttributes.recycle();
            this.f10254t = new a();
            this.f10235a.o(new b());
            if (this.f10253s) {
                n();
            }
        } catch (Throwable th2) {
            typedArrayObtainStyledAttributes.recycle();
            throw th2;
        }
    }

    private boolean m(int i10, int i11) {
        Rect rect = this.f10242h;
        Point point = this.f10247m;
        int i12 = point.x;
        int i13 = point.y;
        rect.set(i12, i13, this.f10241g + i12, this.f10237c + i13);
        Rect rect2 = this.f10242h;
        int i14 = this.f10245k;
        rect2.inset(i14, i14);
        return this.f10242h.contains(i10, i11);
    }

    public void A() {
        if (!this.f10251q) {
            Animator animator = this.f10250p;
            if (animator != null) {
                animator.cancel();
            }
            ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt(this, "offsetX", 0);
            this.f10250p = objectAnimatorOfInt;
            objectAnimatorOfInt.setInterpolator(new b1.c());
            this.f10250p.setDuration(150L);
            this.f10250p.addListener(new c());
            this.f10251q = true;
            this.f10250p.start();
        }
        if (this.f10253s) {
            n();
        } else {
            f();
        }
    }

    protected void f() {
        FastScrollRecyclerView fastScrollRecyclerView = this.f10235a;
        if (fastScrollRecyclerView != null) {
            fastScrollRecyclerView.removeCallbacks(this.f10254t);
        }
    }

    public void g(Canvas canvas) {
        Point point = this.f10247m;
        int i10 = point.x;
        if (i10 < 0 || point.y < 0) {
            return;
        }
        RectF rectF = this.f10260z;
        Point point2 = this.f10248n;
        float f10 = i10 + point2.x + (this.f10238d - this.f10241g);
        float paddingTop = point2.y + this.f10235a.getPaddingTop();
        int i11 = this.f10247m.x + this.f10248n.x;
        int i12 = this.f10241g;
        rectF.set(f10, paddingTop, i11 + i12 + (this.f10238d - i12), (this.f10235a.getHeight() + this.f10248n.y) - this.f10235a.getPaddingBottom());
        RectF rectF2 = this.f10260z;
        int i13 = this.f10241g;
        canvas.drawRoundRect(rectF2, i13, i13, this.f10240f);
        RectF rectF3 = this.f10260z;
        Point point3 = this.f10247m;
        int i14 = point3.x;
        Point point4 = this.f10248n;
        int i15 = point4.x;
        int i16 = this.f10238d;
        int i17 = this.f10241g;
        int i18 = point3.y;
        int i19 = point4.y;
        rectF3.set(i14 + i15 + ((i16 - i17) / 2), i18 + i19, i14 + i15 + i16 + ((i16 - i17) / 2), i18 + i19 + this.f10237c);
        RectF rectF4 = this.f10260z;
        int i20 = this.f10238d;
        canvas.drawRoundRect(rectF4, i20, i20, this.f10239e);
        this.f10236b.c(canvas);
    }

    @Keep
    public int getOffsetX() {
        return this.f10248n.x;
    }

    public void h(boolean z10) {
        this.f10257w = z10;
        this.f10239e.setColor(z10 ? this.f10256v : this.f10255u);
    }

    public int i() {
        return this.f10237c;
    }

    public int j() {
        return Math.max(this.f10241g, this.f10238d);
    }

    public void k(MotionEvent motionEvent, int i10, int i11, int i12, bb.a aVar) {
        int action = motionEvent.getAction();
        int y10 = (int) motionEvent.getY();
        if (action == 0) {
            if (m(i10, i11)) {
                this.f10246l = i11 - this.f10247m.y;
                return;
            }
            return;
        }
        if (action != 1) {
            if (action == 2) {
                if (!this.f10249o && m(i10, i11) && Math.abs(y10 - i11) > this.f10258x) {
                    this.f10235a.getParent().requestDisallowInterceptTouchEvent(true);
                    this.f10249o = true;
                    this.f10246l += i12 - i11;
                    this.f10236b.a(true);
                    if (aVar != null) {
                        aVar.b();
                    }
                    if (this.f10257w) {
                        this.f10239e.setColor(this.f10255u);
                    }
                }
                if (this.f10249o) {
                    int i13 = this.f10259y;
                    if (i13 == 0 || Math.abs(i13 - y10) >= this.f10258x) {
                        this.f10259y = y10;
                        boolean zU1 = this.f10235a.U1();
                        float fMax = Math.max(0, Math.min(r7, y10 - this.f10246l)) / (this.f10235a.getHeight() - this.f10237c);
                        if (zU1) {
                            fMax = 1.0f - fMax;
                        }
                        this.f10236b.i(this.f10235a.W1(fMax));
                        this.f10236b.a(!r5.isEmpty());
                        FastScrollRecyclerView fastScrollRecyclerView = this.f10235a;
                        fastScrollRecyclerView.invalidate(this.f10236b.m(fastScrollRecyclerView, this.f10247m.y));
                        return;
                    }
                    return;
                }
                return;
            }
            if (action != 3) {
                return;
            }
        }
        this.f10246l = 0;
        this.f10259y = 0;
        if (this.f10249o) {
            this.f10249o = false;
            this.f10236b.a(false);
            if (aVar != null) {
                aVar.a();
            }
        }
        if (this.f10257w) {
            this.f10239e.setColor(this.f10256v);
        }
    }

    public boolean l() {
        return this.f10249o;
    }

    protected void n() {
        if (this.f10235a != null) {
            f();
            this.f10235a.postDelayed(this.f10254t, this.f10252r);
        }
    }

    public void o(int i10) {
        this.f10252r = i10;
        if (this.f10253s) {
            n();
        }
    }

    public void p(boolean z10) {
        this.f10253s = z10;
        if (z10) {
            n();
        } else {
            f();
        }
    }

    public void q(int i10, int i11) {
        Point point = this.f10248n;
        int i12 = point.x;
        if (i12 == i10 && point.y == i11) {
            return;
        }
        Rect rect = this.f10243i;
        int i13 = this.f10247m.x;
        rect.set(i13 + i12, point.y, i13 + i12 + this.f10241g, this.f10235a.getHeight() + this.f10248n.y);
        this.f10248n.set(i10, i11);
        Rect rect2 = this.f10244j;
        int i14 = this.f10247m.x;
        Point point2 = this.f10248n;
        int i15 = point2.x;
        rect2.set(i14 + i15, point2.y, i14 + i15 + this.f10241g, this.f10235a.getHeight() + this.f10248n.y);
        this.f10243i.union(this.f10244j);
        this.f10235a.invalidate(this.f10243i);
    }

    public void r(int i10) {
        this.f10236b.f(i10);
    }

    public void s(int i10) {
        this.f10236b.g(i10);
    }

    @Keep
    public void setOffsetX(int i10) {
        q(i10, this.f10248n.y);
    }

    public void t(int i10) {
        this.f10236b.j(i10);
    }

    public void u(int i10) {
        this.f10236b.k(i10);
    }

    public void v(Typeface typeface) {
        this.f10236b.l(typeface);
    }

    public void w(int i10) {
        this.f10255u = i10;
        this.f10239e.setColor(i10);
        this.f10235a.invalidate(this.f10243i);
    }

    public void x(int i10) {
        this.f10256v = i10;
        h(true);
    }

    public void y(int i10, int i11) {
        Point point = this.f10247m;
        int i12 = point.x;
        if (i12 == i10 && point.y == i11) {
            return;
        }
        Rect rect = this.f10243i;
        Point point2 = this.f10248n;
        int i13 = point2.x;
        rect.set(i12 + i13, point2.y, i12 + i13 + this.f10241g, this.f10235a.getHeight() + this.f10248n.y);
        this.f10247m.set(i10, i11);
        Rect rect2 = this.f10244j;
        int i14 = this.f10247m.x;
        Point point3 = this.f10248n;
        int i15 = point3.x;
        rect2.set(i14 + i15, point3.y, i14 + i15 + this.f10241g, this.f10235a.getHeight() + this.f10248n.y);
        this.f10243i.union(this.f10244j);
        this.f10235a.invalidate(this.f10243i);
    }

    public void z(int i10) {
        this.f10240f.setColor(i10);
        this.f10235a.invalidate(this.f10243i);
    }
}
