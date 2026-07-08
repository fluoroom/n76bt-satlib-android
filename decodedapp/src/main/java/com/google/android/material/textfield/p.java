package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.text.Editable;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Spinner;

/* JADX INFO: loaded from: classes3.dex */
class p extends s {

    /* JADX INFO: renamed from: e */
    private final int f8401e;

    /* JADX INFO: renamed from: f */
    private final int f8402f;

    /* JADX INFO: renamed from: g */
    private final TimeInterpolator f8403g;

    /* JADX INFO: renamed from: h */
    private AutoCompleteTextView f8404h;

    /* JADX INFO: renamed from: i */
    private final View.OnClickListener f8405i;

    /* JADX INFO: renamed from: j */
    private final View.OnFocusChangeListener f8406j;

    /* JADX INFO: renamed from: k */
    private final AccessibilityManager.TouchExplorationStateChangeListener f8407k;

    /* JADX INFO: renamed from: l */
    private boolean f8408l;

    /* JADX INFO: renamed from: m */
    private boolean f8409m;

    /* JADX INFO: renamed from: n */
    private boolean f8410n;

    /* JADX INFO: renamed from: o */
    private long f8411o;

    /* JADX INFO: renamed from: p */
    private AccessibilityManager f8412p;

    /* JADX INFO: renamed from: q */
    private ValueAnimator f8413q;

    /* JADX INFO: renamed from: r */
    private ValueAnimator f8414r;

    class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            p.this.r();
            p.this.f8414r.start();
        }
    }

    p(r rVar) {
        super(rVar);
        this.f8405i = new View.OnClickListener() { // from class: com.google.android.material.textfield.l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f8397a.J();
            }
        };
        this.f8406j = new View.OnFocusChangeListener() { // from class: com.google.android.material.textfield.m
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z10) {
                p.y(this.f8398a, view, z10);
            }
        };
        this.f8407k = new AccessibilityManager.TouchExplorationStateChangeListener() { // from class: com.google.android.material.textfield.n
            @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
            public final void onTouchExplorationStateChanged(boolean z10) {
                p.w(this.f8399a, z10);
            }
        };
        this.f8411o = Long.MAX_VALUE;
        Context context = rVar.getContext();
        int i10 = u8.b.C;
        this.f8402f = h9.d.f(context, i10, 67);
        this.f8401e = h9.d.f(rVar.getContext(), i10, 50);
        this.f8403g = h9.d.g(rVar.getContext(), u8.b.H, v8.a.f30492a);
    }

    public static /* synthetic */ void A(p pVar) {
        pVar.K();
        pVar.H(false);
    }

    private static AutoCompleteTextView D(EditText editText) {
        if (editText instanceof AutoCompleteTextView) {
            return (AutoCompleteTextView) editText;
        }
        throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
    }

    private ValueAnimator E(int i10, float... fArr) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fArr);
        valueAnimatorOfFloat.setInterpolator(this.f8403g);
        valueAnimatorOfFloat.setDuration(i10);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.textfield.i
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                p.x(this.f8394a, valueAnimator);
            }
        });
        return valueAnimatorOfFloat;
    }

    private void F() {
        this.f8414r = E(this.f8402f, 0.0f, 1.0f);
        ValueAnimator valueAnimatorE = E(this.f8401e, 1.0f, 0.0f);
        this.f8413q = valueAnimatorE;
        valueAnimatorE.addListener(new a());
    }

    private boolean G() {
        long jUptimeMillis = SystemClock.uptimeMillis() - this.f8411o;
        return jUptimeMillis < 0 || jUptimeMillis > 300;
    }

    private void H(boolean z10) {
        if (this.f8410n != z10) {
            this.f8410n = z10;
            this.f8414r.cancel();
            this.f8413q.start();
        }
    }

    private void I() {
        this.f8404h.setOnTouchListener(new View.OnTouchListener() { // from class: com.google.android.material.textfield.j
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return p.z(this.f8395a, view, motionEvent);
            }
        });
        this.f8404h.setOnDismissListener(new AutoCompleteTextView.OnDismissListener() { // from class: com.google.android.material.textfield.k
            @Override // android.widget.AutoCompleteTextView.OnDismissListener
            public final void onDismiss() {
                p.A(this.f8396a);
            }
        });
        this.f8404h.setThreshold(0);
    }

    public void J() {
        if (this.f8404h == null) {
            return;
        }
        if (G()) {
            this.f8409m = false;
        }
        if (this.f8409m) {
            this.f8409m = false;
            return;
        }
        H(!this.f8410n);
        if (!this.f8410n) {
            this.f8404h.dismissDropDown();
        } else {
            this.f8404h.requestFocus();
            this.f8404h.showDropDown();
        }
    }

    private void K() {
        this.f8409m = true;
        this.f8411o = SystemClock.uptimeMillis();
    }

    public static /* synthetic */ void v(p pVar) {
        boolean zIsPopupShowing = pVar.f8404h.isPopupShowing();
        pVar.H(zIsPopupShowing);
        pVar.f8409m = zIsPopupShowing;
    }

    public static /* synthetic */ void w(p pVar, boolean z10) {
        AutoCompleteTextView autoCompleteTextView = pVar.f8404h;
        if (autoCompleteTextView == null || q.a(autoCompleteTextView)) {
            return;
        }
        pVar.f8443d.setImportantForAccessibility(z10 ? 2 : 1);
    }

    public static /* synthetic */ void x(p pVar, ValueAnimator valueAnimator) {
        pVar.getClass();
        pVar.f8443d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    public static /* synthetic */ void y(p pVar, View view, boolean z10) {
        pVar.f8408l = z10;
        pVar.r();
        if (z10) {
            return;
        }
        pVar.H(false);
        pVar.f8409m = false;
    }

    public static /* synthetic */ boolean z(p pVar, View view, MotionEvent motionEvent) {
        pVar.getClass();
        if (motionEvent.getAction() == 1) {
            if (pVar.G()) {
                pVar.f8409m = false;
            }
            pVar.J();
            pVar.K();
        }
        return false;
    }

    @Override // com.google.android.material.textfield.s
    public void a(Editable editable) {
        if (this.f8412p.isTouchExplorationEnabled() && q.a(this.f8404h) && !this.f8443d.hasFocus()) {
            this.f8404h.dismissDropDown();
        }
        this.f8404h.post(new Runnable() { // from class: com.google.android.material.textfield.o
            @Override // java.lang.Runnable
            public final void run() {
                p.v(this.f8400a);
            }
        });
    }

    @Override // com.google.android.material.textfield.s
    int c() {
        return u8.j.f28705g;
    }

    @Override // com.google.android.material.textfield.s
    int d() {
        return u8.e.f28638g;
    }

    @Override // com.google.android.material.textfield.s
    View.OnFocusChangeListener e() {
        return this.f8406j;
    }

    @Override // com.google.android.material.textfield.s
    View.OnClickListener f() {
        return this.f8405i;
    }

    @Override // com.google.android.material.textfield.s
    public AccessibilityManager.TouchExplorationStateChangeListener h() {
        return this.f8407k;
    }

    @Override // com.google.android.material.textfield.s
    boolean i(int i10) {
        return i10 != 0;
    }

    @Override // com.google.android.material.textfield.s
    boolean j() {
        return true;
    }

    @Override // com.google.android.material.textfield.s
    boolean k() {
        return this.f8408l;
    }

    @Override // com.google.android.material.textfield.s
    boolean l() {
        return true;
    }

    @Override // com.google.android.material.textfield.s
    boolean m() {
        return this.f8410n;
    }

    @Override // com.google.android.material.textfield.s
    public void n(EditText editText) {
        this.f8404h = D(editText);
        I();
        this.f8440a.setErrorIconDrawable((Drawable) null);
        if (!q.a(editText) && this.f8412p.isTouchExplorationEnabled()) {
            this.f8443d.setImportantForAccessibility(2);
        }
        this.f8440a.setEndIconVisible(true);
    }

    @Override // com.google.android.material.textfield.s
    public void o(View view, n0.x xVar) {
        if (!q.a(this.f8404h)) {
            xVar.t0(Spinner.class.getName());
        }
        if (xVar.c0()) {
            xVar.F0(null);
        }
    }

    @Override // com.google.android.material.textfield.s
    public void p(View view, AccessibilityEvent accessibilityEvent) {
        if (!this.f8412p.isEnabled() || q.a(this.f8404h)) {
            return;
        }
        boolean z10 = (accessibilityEvent.getEventType() == 32768 || accessibilityEvent.getEventType() == 8) && this.f8410n && !this.f8404h.isPopupShowing();
        if (accessibilityEvent.getEventType() == 1 || z10) {
            J();
            K();
        }
    }

    @Override // com.google.android.material.textfield.s
    void s() {
        F();
        this.f8412p = (AccessibilityManager) this.f8442c.getSystemService("accessibility");
    }

    @Override // com.google.android.material.textfield.s
    boolean t() {
        return true;
    }

    @Override // com.google.android.material.textfield.s
    void u() {
        AutoCompleteTextView autoCompleteTextView = this.f8404h;
        if (autoCompleteTextView != null) {
            autoCompleteTextView.setOnTouchListener(null);
            this.f8404h.setOnDismissListener(null);
        }
    }
}
