package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;

/* JADX INFO: loaded from: classes3.dex */
class f extends s {

    /* JADX INFO: renamed from: e */
    private final int f8382e;

    /* JADX INFO: renamed from: f */
    private final int f8383f;

    /* JADX INFO: renamed from: g */
    private final TimeInterpolator f8384g;

    /* JADX INFO: renamed from: h */
    private final TimeInterpolator f8385h;

    /* JADX INFO: renamed from: i */
    private EditText f8386i;

    /* JADX INFO: renamed from: j */
    private final View.OnClickListener f8387j;

    /* JADX INFO: renamed from: k */
    private final View.OnFocusChangeListener f8388k;

    /* JADX INFO: renamed from: l */
    private AnimatorSet f8389l;

    /* JADX INFO: renamed from: m */
    private ValueAnimator f8390m;

    class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            f.this.f8441b.a0(true);
        }
    }

    class b extends AnimatorListenerAdapter {
        b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            f.this.f8441b.a0(false);
        }
    }

    f(r rVar) {
        super(rVar);
        this.f8387j = new View.OnClickListener() { // from class: com.google.android.material.textfield.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                f.v(this.f8375a, view);
            }
        };
        this.f8388k = new View.OnFocusChangeListener() { // from class: com.google.android.material.textfield.b
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z10) {
                f fVar = this.f8377a;
                fVar.A(fVar.E());
            }
        };
        Context context = rVar.getContext();
        int i10 = u8.b.C;
        this.f8382e = h9.d.f(context, i10, 100);
        this.f8383f = h9.d.f(rVar.getContext(), i10, 150);
        this.f8384g = h9.d.g(rVar.getContext(), u8.b.H, v8.a.f30492a);
        this.f8385h = h9.d.g(rVar.getContext(), u8.b.G, v8.a.f30495d);
    }

    public void A(boolean z10) {
        boolean z11 = this.f8441b.F() == z10;
        if (z10 && !this.f8389l.isRunning()) {
            this.f8390m.cancel();
            this.f8389l.start();
            if (z11) {
                this.f8389l.end();
                return;
            }
            return;
        }
        if (z10) {
            return;
        }
        this.f8389l.cancel();
        this.f8390m.start();
        if (z11) {
            this.f8390m.end();
        }
    }

    private ValueAnimator B(float... fArr) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fArr);
        valueAnimatorOfFloat.setInterpolator(this.f8384g);
        valueAnimatorOfFloat.setDuration(this.f8382e);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.textfield.c
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                f.x(this.f8378a, valueAnimator);
            }
        });
        return valueAnimatorOfFloat;
    }

    private ValueAnimator C() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.8f, 1.0f);
        valueAnimatorOfFloat.setInterpolator(this.f8385h);
        valueAnimatorOfFloat.setDuration(this.f8383f);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.textfield.e
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                f.y(this.f8381a, valueAnimator);
            }
        });
        return valueAnimatorOfFloat;
    }

    private void D() {
        ValueAnimator valueAnimatorC = C();
        ValueAnimator valueAnimatorB = B(0.0f, 1.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        this.f8389l = animatorSet;
        animatorSet.playTogether(valueAnimatorC, valueAnimatorB);
        this.f8389l.addListener(new a());
        ValueAnimator valueAnimatorB2 = B(1.0f, 0.0f);
        this.f8390m = valueAnimatorB2;
        valueAnimatorB2.addListener(new b());
    }

    private boolean E() {
        EditText editText = this.f8386i;
        if (editText != null) {
            return (editText.hasFocus() || this.f8443d.hasFocus()) && this.f8386i.getText().length() > 0;
        }
        return false;
    }

    public static /* synthetic */ void v(f fVar, View view) {
        EditText editText = fVar.f8386i;
        if (editText == null) {
            return;
        }
        Editable text = editText.getText();
        if (text != null) {
            text.clear();
        }
        fVar.r();
    }

    public static /* synthetic */ void x(f fVar, ValueAnimator valueAnimator) {
        fVar.getClass();
        fVar.f8443d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    public static /* synthetic */ void y(f fVar, ValueAnimator valueAnimator) {
        fVar.getClass();
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        fVar.f8443d.setScaleX(fFloatValue);
        fVar.f8443d.setScaleY(fFloatValue);
    }

    @Override // com.google.android.material.textfield.s
    void a(Editable editable) {
        if (this.f8441b.w() != null) {
            return;
        }
        A(E());
    }

    @Override // com.google.android.material.textfield.s
    int c() {
        return u8.j.f28703e;
    }

    @Override // com.google.android.material.textfield.s
    int d() {
        return u8.e.f28639h;
    }

    @Override // com.google.android.material.textfield.s
    View.OnFocusChangeListener e() {
        return this.f8388k;
    }

    @Override // com.google.android.material.textfield.s
    View.OnClickListener f() {
        return this.f8387j;
    }

    @Override // com.google.android.material.textfield.s
    View.OnFocusChangeListener g() {
        return this.f8388k;
    }

    @Override // com.google.android.material.textfield.s
    public void n(EditText editText) {
        this.f8386i = editText;
        this.f8440a.setEndIconVisible(E());
    }

    @Override // com.google.android.material.textfield.s
    void q(boolean z10) {
        if (this.f8441b.w() == null) {
            return;
        }
        A(z10);
    }

    @Override // com.google.android.material.textfield.s
    void s() {
        D();
    }

    @Override // com.google.android.material.textfield.s
    void u() {
        EditText editText = this.f8386i;
        if (editText != null) {
            editText.post(new Runnable() { // from class: com.google.android.material.textfield.d
                @Override // java.lang.Runnable
                public final void run() {
                    this.f8380a.A(true);
                }
            });
        }
    }
}
