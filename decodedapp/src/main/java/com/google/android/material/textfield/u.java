package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
final class u {
    private ColorStateList A;
    private Typeface B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f8444a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f8445b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f8446c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final TimeInterpolator f8447d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final TimeInterpolator f8448e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final TimeInterpolator f8449f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Context f8450g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final TextInputLayout f8451h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private LinearLayout f8452i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f8453j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private FrameLayout f8454k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Animator f8455l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final float f8456m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f8457n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f8458o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private CharSequence f8459p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f8460q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private TextView f8461r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private CharSequence f8462s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f8463t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f8464u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private ColorStateList f8465v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private CharSequence f8466w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private boolean f8467x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private TextView f8468y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private int f8469z;

    class a extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f8470a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ TextView f8471b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f8472c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ TextView f8473d;

        a(int i10, TextView textView, int i11, TextView textView2) {
            this.f8470a = i10;
            this.f8471b = textView;
            this.f8472c = i11;
            this.f8473d = textView2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            u.this.f8457n = this.f8470a;
            u.this.f8455l = null;
            TextView textView = this.f8471b;
            if (textView != null) {
                textView.setVisibility(4);
                if (this.f8472c == 1 && u.this.f8461r != null) {
                    u.this.f8461r.setText((CharSequence) null);
                }
            }
            TextView textView2 = this.f8473d;
            if (textView2 != null) {
                textView2.setTranslationY(0.0f);
                this.f8473d.setAlpha(1.0f);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            TextView textView = this.f8473d;
            if (textView != null) {
                textView.setVisibility(0);
                this.f8473d.setAlpha(0.0f);
            }
        }
    }

    class b extends View.AccessibilityDelegate {
        b() {
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            EditText editText = u.this.f8451h.getEditText();
            if (editText != null) {
                accessibilityNodeInfo.setLabeledBy(editText);
            }
        }
    }

    public u(TextInputLayout textInputLayout) {
        Context context = textInputLayout.getContext();
        this.f8450g = context;
        this.f8451h = textInputLayout;
        this.f8456m = context.getResources().getDimensionPixelSize(u8.d.f28613q);
        int i10 = u8.b.D;
        this.f8444a = h9.d.f(context, i10, 217);
        this.f8445b = h9.d.f(context, u8.b.A, 167);
        this.f8446c = h9.d.f(context, i10, 167);
        int i11 = u8.b.F;
        this.f8447d = h9.d.g(context, i11, v8.a.f30495d);
        TimeInterpolator timeInterpolator = v8.a.f30492a;
        this.f8448e = h9.d.g(context, i11, timeInterpolator);
        this.f8449f = h9.d.g(context, u8.b.H, timeInterpolator);
    }

    private void D(int i10, int i11) {
        TextView textViewM;
        TextView textViewM2;
        if (i10 == i11) {
            return;
        }
        if (i11 != 0 && (textViewM2 = m(i11)) != null) {
            textViewM2.setVisibility(0);
            textViewM2.setAlpha(1.0f);
        }
        if (i10 != 0 && (textViewM = m(i10)) != null) {
            textViewM.setVisibility(4);
            if (i10 == 1) {
                textViewM.setText((CharSequence) null);
            }
        }
        this.f8457n = i11;
    }

    private void M(TextView textView, Typeface typeface) {
        if (textView != null) {
            textView.setTypeface(typeface);
        }
    }

    private void O(ViewGroup viewGroup, int i10) {
        if (i10 == 0) {
            viewGroup.setVisibility(8);
        }
    }

    private boolean P(TextView textView, CharSequence charSequence) {
        if (this.f8451h.isLaidOut() && this.f8451h.isEnabled()) {
            return (this.f8458o == this.f8457n && textView != null && TextUtils.equals(textView.getText(), charSequence)) ? false : true;
        }
        return false;
    }

    private void S(int i10, int i11, boolean z10) {
        u uVar;
        if (i10 == i11) {
            return;
        }
        if (z10) {
            AnimatorSet animatorSet = new AnimatorSet();
            this.f8455l = animatorSet;
            ArrayList arrayList = new ArrayList();
            uVar = this;
            uVar.i(arrayList, this.f8467x, this.f8468y, 2, i10, i11);
            uVar.i(arrayList, uVar.f8460q, uVar.f8461r, 1, i10, i11);
            v8.b.a(animatorSet, arrayList);
            animatorSet.addListener(uVar.new a(i11, m(i10), i10, m(i11)));
            animatorSet.start();
        } else {
            uVar = this;
            D(i10, i11);
        }
        uVar.f8451h.q0();
        uVar.f8451h.w0(z10);
        uVar.f8451h.C0();
    }

    private boolean g() {
        return (this.f8452i == null || this.f8451h.getEditText() == null) ? false : true;
    }

    private void i(List list, boolean z10, TextView textView, int i10, int i11, int i12) {
        if (textView == null || !z10) {
            return;
        }
        if (i10 == i12 || i10 == i11) {
            ObjectAnimator objectAnimatorJ = j(textView, i12 == i10);
            if (i10 == i12 && i11 != 0) {
                objectAnimatorJ.setStartDelay(this.f8446c);
            }
            list.add(objectAnimatorJ);
            if (i12 != i10 || i11 == 0) {
                return;
            }
            ObjectAnimator objectAnimatorK = k(textView);
            objectAnimatorK.setStartDelay(this.f8446c);
            list.add(objectAnimatorK);
        }
    }

    private ObjectAnimator j(TextView textView, boolean z10) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) View.ALPHA, z10 ? 1.0f : 0.0f);
        objectAnimatorOfFloat.setDuration(z10 ? this.f8445b : this.f8446c);
        objectAnimatorOfFloat.setInterpolator(z10 ? this.f8448e : this.f8449f);
        return objectAnimatorOfFloat;
    }

    private ObjectAnimator k(TextView textView) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) View.TRANSLATION_Y, -this.f8456m, 0.0f);
        objectAnimatorOfFloat.setDuration(this.f8444a);
        objectAnimatorOfFloat.setInterpolator(this.f8447d);
        return objectAnimatorOfFloat;
    }

    private TextView m(int i10) {
        if (i10 == 1) {
            return this.f8461r;
        }
        if (i10 != 2) {
            return null;
        }
        return this.f8468y;
    }

    private int v(boolean z10, int i10, int i11) {
        return z10 ? this.f8450g.getResources().getDimensionPixelSize(i10) : i11;
    }

    private boolean y(int i10) {
        return (i10 != 1 || this.f8461r == null || TextUtils.isEmpty(this.f8459p)) ? false : true;
    }

    boolean A() {
        return this.f8460q;
    }

    boolean B() {
        return this.f8467x;
    }

    void C(TextView textView, int i10) {
        FrameLayout frameLayout;
        if (this.f8452i == null) {
            return;
        }
        if (!z(i10) || (frameLayout = this.f8454k) == null) {
            this.f8452i.removeView(textView);
        } else {
            frameLayout.removeView(textView);
        }
        int i11 = this.f8453j - 1;
        this.f8453j = i11;
        O(this.f8452i, i11);
    }

    void E(int i10) {
        this.f8463t = i10;
        TextView textView = this.f8461r;
        if (textView != null) {
            textView.setAccessibilityLiveRegion(i10);
        }
    }

    void F(CharSequence charSequence) {
        this.f8462s = charSequence;
        TextView textView = this.f8461r;
        if (textView != null) {
            textView.setContentDescription(charSequence);
        }
    }

    void G(boolean z10) {
        if (this.f8460q == z10) {
            return;
        }
        h();
        if (z10) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(this.f8450g);
            this.f8461r = appCompatTextView;
            appCompatTextView.setId(u8.f.V);
            this.f8461r.setTextAlignment(5);
            Typeface typeface = this.B;
            if (typeface != null) {
                this.f8461r.setTypeface(typeface);
            }
            H(this.f8464u);
            I(this.f8465v);
            F(this.f8462s);
            E(this.f8463t);
            this.f8461r.setVisibility(4);
            e(this.f8461r, 0);
        } else {
            w();
            C(this.f8461r, 0);
            this.f8461r = null;
            this.f8451h.q0();
            this.f8451h.C0();
        }
        this.f8460q = z10;
    }

    void H(int i10) {
        this.f8464u = i10;
        TextView textView = this.f8461r;
        if (textView != null) {
            this.f8451h.c0(textView, i10);
        }
    }

    void I(ColorStateList colorStateList) {
        this.f8465v = colorStateList;
        TextView textView = this.f8461r;
        if (textView == null || colorStateList == null) {
            return;
        }
        textView.setTextColor(colorStateList);
    }

    void J(int i10) {
        this.f8469z = i10;
        TextView textView = this.f8468y;
        if (textView != null) {
            androidx.core.widget.j.m(textView, i10);
        }
    }

    void K(boolean z10) {
        if (this.f8467x == z10) {
            return;
        }
        h();
        if (z10) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(this.f8450g);
            this.f8468y = appCompatTextView;
            appCompatTextView.setId(u8.f.W);
            this.f8468y.setTextAlignment(5);
            Typeface typeface = this.B;
            if (typeface != null) {
                this.f8468y.setTypeface(typeface);
            }
            this.f8468y.setVisibility(4);
            this.f8468y.setAccessibilityLiveRegion(1);
            J(this.f8469z);
            L(this.A);
            e(this.f8468y, 1);
            this.f8468y.setAccessibilityDelegate(new b());
        } else {
            x();
            C(this.f8468y, 1);
            this.f8468y = null;
            this.f8451h.q0();
            this.f8451h.C0();
        }
        this.f8467x = z10;
    }

    void L(ColorStateList colorStateList) {
        this.A = colorStateList;
        TextView textView = this.f8468y;
        if (textView == null || colorStateList == null) {
            return;
        }
        textView.setTextColor(colorStateList);
    }

    void N(Typeface typeface) {
        if (typeface != this.B) {
            this.B = typeface;
            M(this.f8461r, typeface);
            M(this.f8468y, typeface);
        }
    }

    void Q(CharSequence charSequence) {
        h();
        this.f8459p = charSequence;
        this.f8461r.setText(charSequence);
        int i10 = this.f8457n;
        if (i10 != 1) {
            this.f8458o = 1;
        }
        S(i10, this.f8458o, P(this.f8461r, charSequence));
    }

    void R(CharSequence charSequence) {
        h();
        this.f8466w = charSequence;
        this.f8468y.setText(charSequence);
        int i10 = this.f8457n;
        if (i10 != 2) {
            this.f8458o = 2;
        }
        S(i10, this.f8458o, P(this.f8468y, charSequence));
    }

    void e(TextView textView, int i10) {
        if (this.f8452i == null && this.f8454k == null) {
            LinearLayout linearLayout = new LinearLayout(this.f8450g);
            this.f8452i = linearLayout;
            linearLayout.setOrientation(0);
            this.f8451h.addView(this.f8452i, -1, -2);
            this.f8454k = new FrameLayout(this.f8450g);
            this.f8452i.addView(this.f8454k, new LinearLayout.LayoutParams(0, -2, 1.0f));
            if (this.f8451h.getEditText() != null) {
                f();
            }
        }
        if (z(i10)) {
            this.f8454k.setVisibility(0);
            this.f8454k.addView(textView);
        } else {
            this.f8452i.addView(textView, new LinearLayout.LayoutParams(-2, -2));
        }
        this.f8452i.setVisibility(0);
        this.f8453j++;
    }

    void f() {
        if (g()) {
            EditText editText = this.f8451h.getEditText();
            boolean zK = j9.c.k(this.f8450g);
            LinearLayout linearLayout = this.f8452i;
            int i10 = u8.d.T;
            linearLayout.setPaddingRelative(v(zK, i10, editText.getPaddingStart()), v(zK, u8.d.U, this.f8450g.getResources().getDimensionPixelSize(u8.d.S)), v(zK, i10, editText.getPaddingEnd()), 0);
        }
    }

    void h() {
        Animator animator = this.f8455l;
        if (animator != null) {
            animator.cancel();
        }
    }

    boolean l() {
        return y(this.f8458o);
    }

    int n() {
        return this.f8463t;
    }

    CharSequence o() {
        return this.f8462s;
    }

    CharSequence p() {
        return this.f8459p;
    }

    int q() {
        TextView textView = this.f8461r;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    ColorStateList r() {
        TextView textView = this.f8461r;
        if (textView != null) {
            return textView.getTextColors();
        }
        return null;
    }

    CharSequence s() {
        return this.f8466w;
    }

    View t() {
        return this.f8468y;
    }

    int u() {
        TextView textView = this.f8468y;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    void w() {
        this.f8459p = null;
        h();
        if (this.f8457n == 1) {
            if (!this.f8467x || TextUtils.isEmpty(this.f8466w)) {
                this.f8458o = 0;
            } else {
                this.f8458o = 2;
            }
        }
        S(this.f8457n, this.f8458o, P(this.f8461r, ""));
    }

    void x() {
        h();
        int i10 = this.f8457n;
        if (i10 == 2) {
            this.f8458o = 0;
        }
        S(i10, this.f8458o, P(this.f8468y, ""));
    }

    boolean z(int i10) {
        return i10 == 0 || i10 == 1;
    }
}
