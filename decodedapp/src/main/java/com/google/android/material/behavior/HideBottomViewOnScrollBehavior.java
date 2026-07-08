package com.google.android.material.behavior;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.accessibility.AccessibilityManager;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public class HideBottomViewOnScrollBehavior<V extends View> extends CoordinatorLayout.c {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final int f7405m = u8.b.f28568x;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final int f7406n = u8.b.A;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final int f7407o = u8.b.G;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final LinkedHashSet f7408a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f7409b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f7410c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private TimeInterpolator f7411d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private TimeInterpolator f7412e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f7413f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private AccessibilityManager f7414g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private AccessibilityManager.TouchExplorationStateChangeListener f7415h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f7416i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f7417j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f7418k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private ViewPropertyAnimator f7419l;

    class a implements View.OnAttachStateChangeListener {
        a() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            if (HideBottomViewOnScrollBehavior.this.f7415h == null || HideBottomViewOnScrollBehavior.this.f7414g == null) {
                return;
            }
            HideBottomViewOnScrollBehavior.this.f7414g.removeTouchExplorationStateChangeListener(HideBottomViewOnScrollBehavior.this.f7415h);
            HideBottomViewOnScrollBehavior.this.f7415h = null;
        }
    }

    class b extends AnimatorListenerAdapter {
        b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            HideBottomViewOnScrollBehavior.this.f7419l = null;
        }
    }

    public HideBottomViewOnScrollBehavior() {
        this.f7408a = new LinkedHashSet();
        this.f7413f = 0;
        this.f7416i = true;
        this.f7417j = 2;
        this.f7418k = 0;
    }

    public static /* synthetic */ void E(HideBottomViewOnScrollBehavior hideBottomViewOnScrollBehavior, View view, boolean z10) {
        if (!z10) {
            hideBottomViewOnScrollBehavior.getClass();
        } else if (hideBottomViewOnScrollBehavior.L()) {
            hideBottomViewOnScrollBehavior.P(view);
        }
    }

    private void J(View view, int i10, long j10, TimeInterpolator timeInterpolator) {
        this.f7419l = view.animate().translationY(i10).setInterpolator(timeInterpolator).setDuration(j10).setListener(new b());
    }

    private void K(final View view) {
        if (this.f7414g == null) {
            this.f7414g = (AccessibilityManager) b0.b.g(view.getContext(), AccessibilityManager.class);
        }
        if (this.f7414g == null || this.f7415h != null) {
            return;
        }
        AccessibilityManager.TouchExplorationStateChangeListener touchExplorationStateChangeListener = new AccessibilityManager.TouchExplorationStateChangeListener() { // from class: x8.a
            @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
            public final void onTouchExplorationStateChanged(boolean z10) {
                HideBottomViewOnScrollBehavior.E(this.f31841a, view, z10);
            }
        };
        this.f7415h = touchExplorationStateChangeListener;
        this.f7414g.addTouchExplorationStateChangeListener(touchExplorationStateChangeListener);
        view.addOnAttachStateChangeListener(new a());
    }

    private void R(View view, int i10) {
        this.f7417j = i10;
        Iterator it = this.f7408a.iterator();
        if (it.hasNext()) {
            android.support.v4.media.session.b.a(it.next());
            throw null;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean A(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i10, int i11) {
        return i10 == 2;
    }

    public boolean L() {
        return this.f7417j == 1;
    }

    public boolean M() {
        return this.f7417j == 2;
    }

    public void N(View view) {
        O(view, true);
    }

    public void O(View view, boolean z10) {
        AccessibilityManager accessibilityManager;
        if (L()) {
            return;
        }
        if (this.f7416i && (accessibilityManager = this.f7414g) != null && accessibilityManager.isTouchExplorationEnabled()) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator = this.f7419l;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            view.clearAnimation();
        }
        R(view, 1);
        int i10 = this.f7413f + this.f7418k;
        if (z10) {
            J(view, i10, this.f7410c, this.f7412e);
        } else {
            view.setTranslationY(i10);
        }
    }

    public void P(View view) {
        Q(view, true);
    }

    public void Q(View view, boolean z10) {
        if (M()) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator = this.f7419l;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            view.clearAnimation();
        }
        R(view, 2);
        if (z10) {
            J(view, 0, this.f7409b, this.f7411d);
        } else {
            view.setTranslationY(0);
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean l(CoordinatorLayout coordinatorLayout, View view, int i10) {
        this.f7413f = view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).bottomMargin;
        this.f7409b = h9.d.f(view.getContext(), f7405m, 225);
        this.f7410c = h9.d.f(view.getContext(), f7406n, 175);
        Context context = view.getContext();
        int i11 = f7407o;
        this.f7411d = h9.d.g(context, i11, v8.a.f30495d);
        this.f7412e = h9.d.g(view.getContext(), i11, v8.a.f30494c);
        K(view);
        return super.l(coordinatorLayout, view, i10);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void t(CoordinatorLayout coordinatorLayout, View view, View view2, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        if (i11 > 0) {
            N(view);
        } else if (i11 < 0) {
            P(view);
        }
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f7408a = new LinkedHashSet();
        this.f7413f = 0;
        this.f7416i = true;
        this.f7417j = 2;
        this.f7418k = 0;
    }
}
