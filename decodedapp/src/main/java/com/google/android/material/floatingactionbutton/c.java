package com.google.android.material.floatingactionbutton;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.FloatEvaluator;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.animation.TimeInterpolator;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.Property;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.ArrayList;
import java.util.Iterator;
import m9.h;
import m9.i;
import m9.l;
import m9.o;

/* JADX INFO: loaded from: classes3.dex */
class c {
    static final TimeInterpolator C = v8.a.f30494c;
    private static final int D = u8.b.f28568x;
    private static final int E = u8.b.G;
    private static final int F = u8.b.f28569y;
    private static final int G = u8.b.E;
    static final int[] H = {R.attr.state_pressed, R.attr.state_enabled};
    static final int[] I = {R.attr.state_hovered, R.attr.state_focused, R.attr.state_enabled};
    static final int[] J = {R.attr.state_focused, R.attr.state_enabled};
    static final int[] K = {R.attr.state_hovered, R.attr.state_enabled};
    static final int[] L = {R.attr.state_enabled};
    static final int[] M = new int[0];
    private ViewTreeObserver.OnPreDrawListener B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    l f7886a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    h f7887b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    Drawable f7888c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    com.google.android.material.floatingactionbutton.a f7889d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    Drawable f7890e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    boolean f7891f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    float f7893h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    float f7894i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    float f7895j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    int f7896k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private StateListAnimator f7897l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private Animator f7898m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private v8.f f7899n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private v8.f f7900o;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f7902q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private ArrayList f7904s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private ArrayList f7905t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private ArrayList f7906u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    final FloatingActionButton f7907v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    final l9.b f7908w;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    boolean f7892g = true;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private float f7901p = 1.0f;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f7903r = 0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final Rect f7909x = new Rect();

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final RectF f7910y = new RectF();

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final RectF f7911z = new RectF();
    private final Matrix A = new Matrix();

    class a extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f7912a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f7913b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ g f7914c;

        a(boolean z10, g gVar) {
            this.f7913b = z10;
            this.f7914c = gVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f7912a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            c.this.f7903r = 0;
            c.this.f7898m = null;
            if (this.f7912a) {
                return;
            }
            FloatingActionButton floatingActionButton = c.this.f7907v;
            boolean z10 = this.f7913b;
            floatingActionButton.b(z10 ? 8 : 4, z10);
            g gVar = this.f7914c;
            if (gVar != null) {
                gVar.b();
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            c.this.f7907v.b(0, this.f7913b);
            c.this.f7903r = 1;
            c.this.f7898m = animator;
            this.f7912a = false;
        }
    }

    class b extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f7916a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ g f7917b;

        b(boolean z10, g gVar) {
            this.f7916a = z10;
            this.f7917b = gVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            c.this.f7903r = 0;
            c.this.f7898m = null;
            g gVar = this.f7917b;
            if (gVar != null) {
                gVar.a();
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            c.this.f7907v.b(0, this.f7916a);
            c.this.f7903r = 2;
            c.this.f7898m = animator;
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.floatingactionbutton.c$c, reason: collision with other inner class name */
    class C0118c extends v8.e {
        C0118c() {
        }

        @Override // android.animation.TypeEvaluator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Matrix evaluate(float f10, Matrix matrix, Matrix matrix2) {
            c.this.f7901p = f10;
            return super.evaluate(f10, matrix, matrix2);
        }
    }

    class d implements TypeEvaluator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final FloatEvaluator f7920a = new FloatEvaluator();

        d() {
        }

        @Override // android.animation.TypeEvaluator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float evaluate(float f10, Float f11, Float f12) {
            float fFloatValue = this.f7920a.evaluate(f10, (Number) f11, (Number) f12).floatValue();
            if (fFloatValue < 0.1f) {
                fFloatValue = 0.0f;
            }
            return Float.valueOf(fFloatValue);
        }
    }

    static class e extends h {
        e(l lVar) {
            super(lVar);
        }

        @Override // m9.h, android.graphics.drawable.Drawable
        public boolean isStateful() {
            return true;
        }
    }

    interface f {
        void a();

        void b();
    }

    interface g {
        void a();

        void b();
    }

    c(FloatingActionButton floatingActionButton, l9.b bVar) {
        this.f7907v = floatingActionButton;
        this.f7908w = bVar;
    }

    private boolean X() {
        return this.f7907v.isLaidOut() && !this.f7907v.isInEditMode();
    }

    public static /* synthetic */ void a(c cVar, float f10, float f11, float f12, float f13, float f14, float f15, float f16, Matrix matrix, ValueAnimator valueAnimator) {
        cVar.getClass();
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        cVar.f7907v.setAlpha(v8.a.b(f10, f11, 0.0f, 0.2f, fFloatValue));
        cVar.f7907v.setScaleX(v8.a.a(f12, f13, fFloatValue));
        cVar.f7907v.setScaleY(v8.a.a(f14, f13, fFloatValue));
        cVar.f7901p = v8.a.a(f15, f16, fFloatValue);
        cVar.e(v8.a.a(f15, f16, fFloatValue), matrix);
        cVar.f7907v.setImageMatrix(matrix);
    }

    private void c0(ObjectAnimator objectAnimator) {
        if (Build.VERSION.SDK_INT != 26) {
            return;
        }
        objectAnimator.setEvaluator(new d());
    }

    private void e(float f10, Matrix matrix) {
        matrix.reset();
        if (this.f7907v.getDrawable() == null || this.f7902q == 0) {
            return;
        }
        RectF rectF = this.f7910y;
        RectF rectF2 = this.f7911z;
        rectF.set(0.0f, 0.0f, r0.getIntrinsicWidth(), r0.getIntrinsicHeight());
        int i10 = this.f7902q;
        rectF2.set(0.0f, 0.0f, i10, i10);
        matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
        int i11 = this.f7902q;
        matrix.postScale(f10, f10, i11 / 2.0f, i11 / 2.0f);
    }

    private AnimatorSet f(v8.f fVar, float f10, float f11, float f12) {
        ArrayList arrayList = new ArrayList();
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f7907v, (Property<FloatingActionButton, Float>) View.ALPHA, f10);
        fVar.e("opacity").a(objectAnimatorOfFloat);
        arrayList.add(objectAnimatorOfFloat);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.f7907v, (Property<FloatingActionButton, Float>) View.SCALE_X, f11);
        fVar.e("scale").a(objectAnimatorOfFloat2);
        c0(objectAnimatorOfFloat2);
        arrayList.add(objectAnimatorOfFloat2);
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(this.f7907v, (Property<FloatingActionButton, Float>) View.SCALE_Y, f11);
        fVar.e("scale").a(objectAnimatorOfFloat3);
        c0(objectAnimatorOfFloat3);
        arrayList.add(objectAnimatorOfFloat3);
        e(f12, this.A);
        ObjectAnimator objectAnimatorOfObject = ObjectAnimator.ofObject(this.f7907v, new v8.d(), new C0118c(), new Matrix(this.A));
        fVar.e("iconScale").a(objectAnimatorOfObject);
        arrayList.add(objectAnimatorOfObject);
        AnimatorSet animatorSet = new AnimatorSet();
        v8.b.a(animatorSet, arrayList);
        return animatorSet;
    }

    private AnimatorSet h(final float f10, final float f11, final float f12, int i10, int i11) {
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        final float alpha = this.f7907v.getAlpha();
        final float scaleX = this.f7907v.getScaleX();
        final float scaleY = this.f7907v.getScaleY();
        final float f13 = this.f7901p;
        final Matrix matrix = new Matrix(this.A);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.floatingactionbutton.b
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                c.a(this.f7877a, alpha, f10, scaleX, f11, scaleY, f13, f12, matrix, valueAnimator);
            }
        });
        arrayList.add(valueAnimatorOfFloat);
        v8.b.a(animatorSet, arrayList);
        animatorSet.setDuration(h9.d.f(this.f7907v.getContext(), i10, this.f7907v.getContext().getResources().getInteger(u8.g.f28670b)));
        animatorSet.setInterpolator(h9.d.g(this.f7907v.getContext(), i11, v8.a.f30493b));
        return animatorSet;
    }

    private StateListAnimator i(float f10, float f11, float f12) {
        StateListAnimator stateListAnimator = new StateListAnimator();
        stateListAnimator.addState(H, j(f10, f12));
        stateListAnimator.addState(I, j(f10, f11));
        stateListAnimator.addState(J, j(f10, f11));
        stateListAnimator.addState(K, j(f10, f11));
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        arrayList.add(ObjectAnimator.ofFloat(this.f7907v, "elevation", f10).setDuration(0L));
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 22 && i10 <= 24) {
            FloatingActionButton floatingActionButton = this.f7907v;
            arrayList.add(ObjectAnimator.ofFloat(floatingActionButton, (Property<FloatingActionButton, Float>) View.TRANSLATION_Z, floatingActionButton.getTranslationZ()).setDuration(100L));
        }
        arrayList.add(ObjectAnimator.ofFloat(this.f7907v, (Property<FloatingActionButton, Float>) View.TRANSLATION_Z, 0.0f).setDuration(100L));
        animatorSet.playSequentially((Animator[]) arrayList.toArray(new Animator[0]));
        animatorSet.setInterpolator(C);
        stateListAnimator.addState(L, animatorSet);
        stateListAnimator.addState(M, j(0.0f, 0.0f));
        return stateListAnimator;
    }

    private Animator j(float f10, float f11) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(ObjectAnimator.ofFloat(this.f7907v, "elevation", f10).setDuration(0L)).with(ObjectAnimator.ofFloat(this.f7907v, (Property<FloatingActionButton, Float>) View.TRANSLATION_Z, f11).setDuration(100L));
        animatorSet.setInterpolator(C);
        return animatorSet;
    }

    void A() {
        h hVar = this.f7887b;
        if (hVar != null) {
            i.f(this.f7907v, hVar);
        }
    }

    void B() {
        a0();
    }

    void C() {
        ViewTreeObserver viewTreeObserver = this.f7907v.getViewTreeObserver();
        ViewTreeObserver.OnPreDrawListener onPreDrawListener = this.B;
        if (onPreDrawListener != null) {
            viewTreeObserver.removeOnPreDrawListener(onPreDrawListener);
            this.B = null;
        }
    }

    void D() {
        if (!this.f7907v.isEnabled()) {
            this.f7907v.setElevation(0.0f);
            this.f7907v.setTranslationZ(0.0f);
            return;
        }
        this.f7907v.setElevation(this.f7893h);
        if (this.f7907v.isPressed()) {
            this.f7907v.setTranslationZ(this.f7895j);
        } else if (this.f7907v.isFocused() || this.f7907v.isHovered()) {
            this.f7907v.setTranslationZ(this.f7894i);
        } else {
            this.f7907v.setTranslationZ(0.0f);
        }
    }

    void E(float f10, float f11, float f12) {
        if (Build.VERSION.SDK_INT == 21) {
            this.f7907v.refreshDrawableState();
        } else if (this.f7907v.getStateListAnimator() == this.f7897l) {
            StateListAnimator stateListAnimatorI = i(f10, f11, f12);
            this.f7897l = stateListAnimatorI;
            this.f7907v.setStateListAnimator(stateListAnimatorI);
        }
        if (W()) {
            a0();
        }
    }

    void F(Rect rect) {
        l0.g.h(this.f7890e, "Didn't initialize content background");
        if (!W()) {
            this.f7908w.setBackgroundDrawable(this.f7890e);
        } else {
            this.f7908w.setBackgroundDrawable(new InsetDrawable(this.f7890e, rect.left, rect.top, rect.right, rect.bottom));
        }
    }

    void G() {
        ArrayList arrayList = this.f7906u;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((f) it.next()).b();
            }
        }
    }

    void H() {
        ArrayList arrayList = this.f7906u;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((f) it.next()).a();
            }
        }
    }

    void I(ColorStateList colorStateList) {
        h hVar = this.f7887b;
        if (hVar != null) {
            hVar.setTintList(colorStateList);
        }
        com.google.android.material.floatingactionbutton.a aVar = this.f7889d;
        if (aVar != null) {
            aVar.c(colorStateList);
        }
    }

    void J(PorterDuff.Mode mode) {
        h hVar = this.f7887b;
        if (hVar != null) {
            hVar.setTintMode(mode);
        }
    }

    final void K(float f10) {
        if (this.f7893h != f10) {
            this.f7893h = f10;
            E(f10, this.f7894i, this.f7895j);
        }
    }

    void L(boolean z10) {
        this.f7891f = z10;
    }

    final void M(v8.f fVar) {
        this.f7900o = fVar;
    }

    final void N(float f10) {
        if (this.f7894i != f10) {
            this.f7894i = f10;
            E(this.f7893h, f10, this.f7895j);
        }
    }

    final void O(float f10) {
        this.f7901p = f10;
        Matrix matrix = this.A;
        e(f10, matrix);
        this.f7907v.setImageMatrix(matrix);
    }

    final void P(int i10) {
        if (this.f7902q != i10) {
            this.f7902q = i10;
            Z();
        }
    }

    void Q(int i10) {
        this.f7896k = i10;
    }

    final void R(float f10) {
        if (this.f7895j != f10) {
            this.f7895j = f10;
            E(this.f7893h, this.f7894i, f10);
        }
    }

    void S(ColorStateList colorStateList) {
        Drawable drawable = this.f7888c;
        if (drawable instanceof RippleDrawable) {
            ((RippleDrawable) drawable).setColor(k9.a.e(colorStateList));
        } else if (drawable != null) {
            drawable.setTintList(k9.a.e(colorStateList));
        }
    }

    void T(boolean z10) {
        this.f7892g = z10;
        a0();
    }

    final void U(l lVar) {
        this.f7886a = lVar;
        h hVar = this.f7887b;
        if (hVar != null) {
            hVar.setShapeAppearanceModel(lVar);
        }
        Object obj = this.f7888c;
        if (obj instanceof o) {
            ((o) obj).setShapeAppearanceModel(lVar);
        }
        com.google.android.material.floatingactionbutton.a aVar = this.f7889d;
        if (aVar != null) {
            aVar.f(lVar);
        }
    }

    final void V(v8.f fVar) {
        this.f7899n = fVar;
    }

    boolean W() {
        return this.f7908w.b() || w();
    }

    void Y(g gVar, boolean z10) {
        AnimatorSet animatorSetH;
        c cVar;
        if (z()) {
            return;
        }
        Animator animator = this.f7898m;
        if (animator != null) {
            animator.cancel();
        }
        boolean z11 = this.f7899n == null;
        if (!X()) {
            this.f7907v.b(0, z10);
            this.f7907v.setAlpha(1.0f);
            this.f7907v.setScaleY(1.0f);
            this.f7907v.setScaleX(1.0f);
            O(1.0f);
            if (gVar != null) {
                gVar.a();
                return;
            }
            return;
        }
        if (this.f7907v.getVisibility() != 0) {
            this.f7907v.setAlpha(0.0f);
            this.f7907v.setScaleY(z11 ? 0.4f : 0.0f);
            this.f7907v.setScaleX(z11 ? 0.4f : 0.0f);
            O(z11 ? 0.4f : 0.0f);
        }
        v8.f fVar = this.f7899n;
        if (fVar != null) {
            animatorSetH = f(fVar, 1.0f, 1.0f, 1.0f);
            cVar = this;
        } else {
            animatorSetH = h(1.0f, 1.0f, 1.0f, D, E);
            cVar = this;
        }
        animatorSetH.addListener(new b(z10, gVar));
        ArrayList arrayList = cVar.f7904s;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                animatorSetH.addListener((Animator.AnimatorListener) it.next());
            }
        }
        animatorSetH.start();
    }

    final void Z() {
        O(this.f7901p);
    }

    final void a0() {
        Rect rect = this.f7909x;
        q(rect);
        F(rect);
        this.f7908w.a(rect.left, rect.top, rect.right, rect.bottom);
    }

    void b0(float f10) {
        h hVar = this.f7887b;
        if (hVar != null) {
            hVar.b0(f10);
        }
    }

    com.google.android.material.floatingactionbutton.a g(int i10, ColorStateList colorStateList) {
        Context context = this.f7907v.getContext();
        com.google.android.material.floatingactionbutton.a aVar = new com.google.android.material.floatingactionbutton.a((l) l0.g.g(this.f7886a));
        aVar.e(b0.b.b(context, u8.c.f28575e), b0.b.b(context, u8.c.f28574d), b0.b.b(context, u8.c.f28572b), b0.b.b(context, u8.c.f28573c));
        aVar.d(i10);
        aVar.c(colorStateList);
        return aVar;
    }

    h k() {
        return new e((l) l0.g.g(this.f7886a));
    }

    final Drawable l() {
        return this.f7890e;
    }

    float m() {
        return this.f7907v.getElevation();
    }

    boolean n() {
        return this.f7891f;
    }

    final v8.f o() {
        return this.f7900o;
    }

    float p() {
        return this.f7894i;
    }

    void q(Rect rect) {
        if (this.f7908w.b()) {
            int iU = u();
            int iMax = Math.max(iU, (int) Math.ceil(this.f7892g ? m() + this.f7895j : 0.0f));
            int iMax2 = Math.max(iU, (int) Math.ceil(r1 * 1.5f));
            rect.set(iMax, iMax2, iMax, iMax2);
            return;
        }
        if (!w()) {
            rect.set(0, 0, 0, 0);
        } else {
            int sizeDimension = (this.f7896k - this.f7907v.getSizeDimension()) / 2;
            rect.set(sizeDimension, sizeDimension, sizeDimension, sizeDimension);
        }
    }

    float r() {
        return this.f7895j;
    }

    final l s() {
        return this.f7886a;
    }

    final v8.f t() {
        return this.f7899n;
    }

    int u() {
        if (this.f7891f) {
            return Math.max((this.f7896k - this.f7907v.getSizeDimension()) / 2, 0);
        }
        return 0;
    }

    void v(g gVar, boolean z10) {
        c cVar;
        AnimatorSet animatorSetH;
        if (y()) {
            return;
        }
        Animator animator = this.f7898m;
        if (animator != null) {
            animator.cancel();
        }
        if (!X()) {
            this.f7907v.b(z10 ? 8 : 4, z10);
            if (gVar != null) {
                gVar.b();
                return;
            }
            return;
        }
        v8.f fVar = this.f7900o;
        if (fVar != null) {
            animatorSetH = f(fVar, 0.0f, 0.0f, 0.0f);
            cVar = this;
        } else {
            cVar = this;
            animatorSetH = cVar.h(0.0f, 0.4f, 0.4f, F, G);
        }
        animatorSetH.addListener(new a(z10, gVar));
        ArrayList arrayList = cVar.f7905t;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                animatorSetH.addListener((Animator.AnimatorListener) it.next());
            }
        }
        animatorSetH.start();
    }

    final boolean w() {
        return this.f7891f && this.f7907v.getSizeDimension() < this.f7896k;
    }

    void x(ColorStateList colorStateList, PorterDuff.Mode mode, ColorStateList colorStateList2, int i10) {
        Drawable layerDrawable;
        h hVarK = k();
        this.f7887b = hVarK;
        hVarK.setTintList(colorStateList);
        if (mode != null) {
            this.f7887b.setTintMode(mode);
        }
        this.f7887b.Q(this.f7907v.getContext());
        if (i10 > 0) {
            this.f7889d = g(i10, colorStateList);
            layerDrawable = new LayerDrawable(new Drawable[]{(Drawable) l0.g.g(this.f7889d), (Drawable) l0.g.g(this.f7887b)});
        } else {
            this.f7889d = null;
            layerDrawable = this.f7887b;
        }
        RippleDrawable rippleDrawable = new RippleDrawable(k9.a.e(colorStateList2), layerDrawable, null);
        this.f7888c = rippleDrawable;
        this.f7890e = rippleDrawable;
    }

    boolean y() {
        return this.f7907v.getVisibility() == 0 ? this.f7903r == 1 : this.f7903r != 2;
    }

    boolean z() {
        return this.f7907v.getVisibility() != 0 ? this.f7903r == 2 : this.f7903r != 1;
    }
}
