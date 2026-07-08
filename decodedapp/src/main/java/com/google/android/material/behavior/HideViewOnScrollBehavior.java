package com.google.android.material.behavior;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.accessibility.AccessibilityManager;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.HideViewOnScrollBehavior;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes3.dex */
public class HideViewOnScrollBehavior<V extends View> extends CoordinatorLayout.c {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final int f7422o = u8.b.f28568x;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final int f7423p = u8.b.A;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final int f7424q = u8.b.G;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private d f7425a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private AccessibilityManager f7426b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private AccessibilityManager.TouchExplorationStateChangeListener f7427c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f7428d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final LinkedHashSet f7429e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f7430f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f7431g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private TimeInterpolator f7432h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private TimeInterpolator f7433i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f7434j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f7435k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f7436l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private ViewPropertyAnimator f7437m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f7438n;

    class a implements View.OnAttachStateChangeListener {
        a() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            if (HideViewOnScrollBehavior.this.f7427c == null || HideViewOnScrollBehavior.this.f7426b == null) {
                return;
            }
            HideViewOnScrollBehavior.this.f7426b.removeTouchExplorationStateChangeListener(HideViewOnScrollBehavior.this.f7427c);
            HideViewOnScrollBehavior.this.f7427c = null;
        }
    }

    class b extends AnimatorListenerAdapter {
        b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            HideViewOnScrollBehavior.this.f7437m = null;
        }
    }

    public HideViewOnScrollBehavior() {
        this.f7428d = true;
        this.f7429e = new LinkedHashSet();
        this.f7434j = 0;
        this.f7435k = 2;
        this.f7436l = 0;
        this.f7438n = false;
    }

    public static /* synthetic */ void E(HideViewOnScrollBehavior hideViewOnScrollBehavior, View view, boolean z10) {
        if (hideViewOnScrollBehavior.f7428d && z10 && hideViewOnScrollBehavior.O()) {
            hideViewOnScrollBehavior.R(view);
        }
    }

    private void J(View view, int i10, long j10, TimeInterpolator timeInterpolator) {
        this.f7437m = this.f7425a.d(view, i10).setInterpolator(timeInterpolator).setDuration(j10).setListener(new b());
    }

    private void K(final View view) {
        if (this.f7426b == null) {
            this.f7426b = (AccessibilityManager) b0.b.g(view.getContext(), AccessibilityManager.class);
        }
        if (this.f7426b == null || this.f7427c != null) {
            return;
        }
        AccessibilityManager.TouchExplorationStateChangeListener touchExplorationStateChangeListener = new AccessibilityManager.TouchExplorationStateChangeListener() { // from class: x8.b
            @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
            public final void onTouchExplorationStateChanged(boolean z10) {
                HideViewOnScrollBehavior.E(this.f31843a, view, z10);
            }
        };
        this.f7427c = touchExplorationStateChangeListener;
        this.f7426b.addTouchExplorationStateChangeListener(touchExplorationStateChangeListener);
        view.addOnAttachStateChangeListener(new a());
    }

    private boolean L(int i10) {
        return i10 == 80 || i10 == 81;
    }

    private boolean M(int i10) {
        return i10 == 3 || i10 == 19;
    }

    private void P(View view, int i10) {
        if (this.f7438n) {
            return;
        }
        int i11 = ((CoordinatorLayout.f) view.getLayoutParams()).f1874c;
        if (L(i11)) {
            Q(1);
        } else {
            Q(M(Gravity.getAbsoluteGravity(i11, i10)) ? 2 : 0);
        }
    }

    private void Q(int i10) {
        d dVar = this.f7425a;
        if (dVar == null || dVar.c() != i10) {
            if (i10 == 0) {
                this.f7425a = new c();
                return;
            }
            if (i10 == 1) {
                this.f7425a = new com.google.android.material.behavior.a();
                return;
            }
            if (i10 == 2) {
                this.f7425a = new com.google.android.material.behavior.b();
                return;
            }
            throw new IllegalArgumentException("Invalid view edge position value: " + i10 + ". Must be 0, 1 or 2.");
        }
    }

    private void V(View view, int i10) {
        this.f7435k = i10;
        Iterator it = this.f7429e.iterator();
        if (it.hasNext()) {
            android.support.v4.media.session.b.a(it.next());
            throw null;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean A(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i10, int i11) {
        return i10 == 2;
    }

    public boolean N() {
        return this.f7435k == 2;
    }

    public boolean O() {
        return this.f7435k == 1;
    }

    public void R(View view) {
        S(view, true);
    }

    public void S(View view, boolean z10) {
        if (N()) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator = this.f7437m;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            view.clearAnimation();
        }
        V(view, 2);
        int iB = this.f7425a.b();
        if (z10) {
            J(view, iB, this.f7430f, this.f7432h);
        } else {
            this.f7425a.e(view, iB);
        }
    }

    public void T(View view) {
        U(view, true);
    }

    public void U(View view, boolean z10) {
        AccessibilityManager accessibilityManager;
        if (O()) {
            return;
        }
        if (this.f7428d && (accessibilityManager = this.f7426b) != null && accessibilityManager.isTouchExplorationEnabled()) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator = this.f7437m;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            view.clearAnimation();
        }
        V(view, 1);
        int i10 = this.f7434j + this.f7436l;
        if (z10) {
            J(view, i10, this.f7431g, this.f7433i);
        } else {
            this.f7425a.e(view, i10);
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean l(CoordinatorLayout coordinatorLayout, View view, int i10) {
        K(view);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        P(view, i10);
        this.f7434j = this.f7425a.a(view, marginLayoutParams);
        this.f7430f = h9.d.f(view.getContext(), f7422o, 225);
        this.f7431g = h9.d.f(view.getContext(), f7423p, 175);
        Context context = view.getContext();
        int i11 = f7424q;
        this.f7432h = h9.d.g(context, i11, v8.a.f30495d);
        this.f7433i = h9.d.g(view.getContext(), i11, v8.a.f30494c);
        return super.l(coordinatorLayout, view, i10);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void t(CoordinatorLayout coordinatorLayout, View view, View view2, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        if (i11 > 0) {
            T(view);
        } else if (i11 < 0) {
            R(view);
        }
    }

    public HideViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f7428d = true;
        this.f7429e = new LinkedHashSet();
        this.f7434j = 0;
        this.f7435k = 2;
        this.f7436l = 0;
        this.f7438n = false;
    }
}
