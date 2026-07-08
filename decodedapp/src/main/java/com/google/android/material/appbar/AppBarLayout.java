package com.google.android.material.appbar;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.AbsListView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.internal.m;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import m0.b0;
import m0.i1;
import m0.o0;
import m0.w;
import m9.h;
import m9.i;
import n0.x;
import u8.k;
import u8.l;

/* JADX INFO: loaded from: classes3.dex */
public class AppBarLayout extends LinearLayout implements CoordinatorLayout.b {
    private static final int K = k.f28729e;
    private final List A;
    private final LinkedHashSet B;
    private final long C;
    private final TimeInterpolator D;
    private int[] E;
    private int F;
    private Drawable G;
    private Integer H;
    private final float I;
    private Behavior J;

    /* JADX INFO: renamed from: a */
    private int f7328a;

    /* JADX INFO: renamed from: b */
    private int f7329b;

    /* JADX INFO: renamed from: c */
    private int f7330c;

    /* JADX INFO: renamed from: d */
    private int f7331d;

    /* JADX INFO: renamed from: e */
    private boolean f7332e;

    /* JADX INFO: renamed from: f */
    private int f7333f;

    /* JADX INFO: renamed from: g */
    private i1 f7334g;

    /* JADX INFO: renamed from: h */
    private List f7335h;

    /* JADX INFO: renamed from: r */
    private boolean f7336r;

    /* JADX INFO: renamed from: s */
    private boolean f7337s;

    /* JADX INFO: renamed from: t */
    private boolean f7338t;

    /* JADX INFO: renamed from: u */
    private boolean f7339u;

    /* JADX INFO: renamed from: v */
    private ColorStateList f7340v;

    /* JADX INFO: renamed from: w */
    private int f7341w;

    /* JADX INFO: renamed from: x */
    private WeakReference f7342x;

    /* JADX INFO: renamed from: y */
    private ValueAnimator f7343y;

    /* JADX INFO: renamed from: z */
    private ValueAnimator.AnimatorUpdateListener f7344z;

    protected static class BaseBehavior<T extends AppBarLayout> extends com.google.android.material.appbar.c {

        /* JADX INFO: renamed from: k */
        private int f7345k;

        /* JADX INFO: renamed from: l */
        private int f7346l;

        /* JADX INFO: renamed from: m */
        private ValueAnimator f7347m;

        /* JADX INFO: renamed from: n */
        private c f7348n;

        /* JADX INFO: renamed from: o */
        private WeakReference f7349o;

        class a implements ValueAnimator.AnimatorUpdateListener {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ CoordinatorLayout f7350a;

            /* JADX INFO: renamed from: b */
            final /* synthetic */ AppBarLayout f7351b;

            a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
                this.f7350a = coordinatorLayout;
                this.f7351b = appBarLayout;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                BaseBehavior.this.P(this.f7350a, this.f7351b, ((Integer) valueAnimator.getAnimatedValue()).intValue());
            }
        }

        class b extends m0.a {

            /* JADX INFO: renamed from: d */
            final /* synthetic */ AppBarLayout f7353d;

            /* JADX INFO: renamed from: e */
            final /* synthetic */ CoordinatorLayout f7354e;

            b(AppBarLayout appBarLayout, CoordinatorLayout coordinatorLayout) {
                this.f7353d = appBarLayout;
                this.f7354e = coordinatorLayout;
            }

            @Override // m0.a
            public void g(View view, x xVar) {
                View viewF0;
                super.g(view, xVar);
                xVar.t0(ScrollView.class.getName());
                if (this.f7353d.getTotalScrollRange() == 0 || (viewF0 = BaseBehavior.this.f0(this.f7354e)) == null || !BaseBehavior.this.b0(this.f7353d)) {
                    return;
                }
                if (BaseBehavior.this.M() != (-this.f7353d.getTotalScrollRange())) {
                    xVar.b(x.a.f22380q);
                    xVar.O0(true);
                }
                if (BaseBehavior.this.M() != 0) {
                    if (!viewF0.canScrollVertically(-1)) {
                        xVar.b(x.a.f22381r);
                        xVar.O0(true);
                    } else if ((-this.f7353d.getDownNestedPreScrollRange()) != 0) {
                        xVar.b(x.a.f22381r);
                        xVar.O0(true);
                    }
                }
            }

            @Override // m0.a
            public boolean j(View view, int i10, Bundle bundle) {
                if (i10 == 4096) {
                    this.f7353d.setExpanded(false);
                    return true;
                }
                if (i10 != 8192) {
                    return super.j(view, i10, bundle);
                }
                if (BaseBehavior.this.M() != 0) {
                    View viewF0 = BaseBehavior.this.f0(this.f7354e);
                    if (!viewF0.canScrollVertically(-1)) {
                        this.f7353d.setExpanded(true);
                        return true;
                    }
                    int i11 = -this.f7353d.getDownNestedPreScrollRange();
                    if (i11 != 0) {
                        BaseBehavior.this.q(this.f7354e, this.f7353d, viewF0, 0, i11, new int[]{0, 0}, 1);
                        return true;
                    }
                }
                return false;
            }
        }

        public BaseBehavior() {
        }

        private void U(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            if (o0.P(coordinatorLayout)) {
                return;
            }
            o0.n0(coordinatorLayout, new b(appBarLayout, coordinatorLayout));
        }

        private void V(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i10, float f10) {
            int iAbs = Math.abs(M() - i10);
            float fAbs = Math.abs(f10);
            W(coordinatorLayout, appBarLayout, i10, fAbs > 0.0f ? Math.round((iAbs / fAbs) * 1000.0f) * 3 : (int) (((iAbs / appBarLayout.getHeight()) + 1.0f) * 150.0f));
        }

        private void W(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i10, int i11) {
            int iM = M();
            if (iM == i10) {
                ValueAnimator valueAnimator = this.f7347m;
                if (valueAnimator == null || !valueAnimator.isRunning()) {
                    return;
                }
                this.f7347m.cancel();
                return;
            }
            ValueAnimator valueAnimator2 = this.f7347m;
            if (valueAnimator2 == null) {
                ValueAnimator valueAnimator3 = new ValueAnimator();
                this.f7347m = valueAnimator3;
                valueAnimator3.setInterpolator(v8.a.f30496e);
                this.f7347m.addUpdateListener(new a(coordinatorLayout, appBarLayout));
            } else {
                valueAnimator2.cancel();
            }
            this.f7347m.setDuration(Math.min(i11, 600));
            this.f7347m.setIntValues(iM, i10);
            this.f7347m.start();
        }

        private int X(int i10, int i11, int i12) {
            return i10 < (i11 + i12) / 2 ? i11 : i12;
        }

        private boolean Z(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view) {
            return appBarLayout.k() && coordinatorLayout.getHeight() - view.getHeight() <= appBarLayout.getHeight();
        }

        private static boolean a0(int i10, int i11) {
            return (i10 & i11) == i11;
        }

        public boolean b0(AppBarLayout appBarLayout) {
            int childCount = appBarLayout.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                if (((d) appBarLayout.getChildAt(i10).getLayoutParams()).f7364a != 0) {
                    return true;
                }
            }
            return false;
        }

        private View c0(CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = coordinatorLayout.getChildAt(i10);
                if ((childAt instanceof w) || (childAt instanceof AbsListView) || (childAt instanceof ScrollView)) {
                    return childAt;
                }
            }
            return null;
        }

        private static View d0(AppBarLayout appBarLayout, int i10) {
            int iAbs = Math.abs(i10);
            int childCount = appBarLayout.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = appBarLayout.getChildAt(i11);
                if (iAbs >= childAt.getTop() && iAbs <= childAt.getBottom()) {
                    return childAt;
                }
            }
            return null;
        }

        private int e0(AppBarLayout appBarLayout, int i10) {
            int childCount = appBarLayout.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = appBarLayout.getChildAt(i11);
                int top = childAt.getTop();
                int bottom = childAt.getBottom();
                d dVar = (d) childAt.getLayoutParams();
                if (a0(dVar.c(), 32)) {
                    top -= ((LinearLayout.LayoutParams) dVar).topMargin;
                    bottom += ((LinearLayout.LayoutParams) dVar).bottomMargin;
                }
                int i12 = -i10;
                if (top <= i12 && bottom >= i12) {
                    return i11;
                }
            }
            return -1;
        }

        public View f0(CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = coordinatorLayout.getChildAt(i10);
                if (((CoordinatorLayout.f) childAt.getLayoutParams()).f() instanceof ScrollingViewBehavior) {
                    return childAt;
                }
            }
            return null;
        }

        private int i0(AppBarLayout appBarLayout, int i10) {
            int iAbs = Math.abs(i10);
            int childCount = appBarLayout.getChildCount();
            int topInset = 0;
            int i11 = 0;
            while (true) {
                if (i11 >= childCount) {
                    break;
                }
                View childAt = appBarLayout.getChildAt(i11);
                d dVar = (d) childAt.getLayoutParams();
                Interpolator interpolatorD = dVar.d();
                if (iAbs < childAt.getTop() || iAbs > childAt.getBottom()) {
                    i11++;
                } else if (interpolatorD != null) {
                    int iC = dVar.c();
                    if ((iC & 1) != 0) {
                        topInset = childAt.getHeight() + ((LinearLayout.LayoutParams) dVar).topMargin + ((LinearLayout.LayoutParams) dVar).bottomMargin;
                        if ((iC & 2) != 0) {
                            topInset -= childAt.getMinimumHeight();
                        }
                    }
                    if (childAt.getFitsSystemWindows()) {
                        topInset -= appBarLayout.getTopInset();
                    }
                    if (topInset > 0) {
                        float f10 = topInset;
                        return Integer.signum(i10) * (childAt.getTop() + Math.round(f10 * interpolatorD.getInterpolation((iAbs - childAt.getTop()) / f10)));
                    }
                }
            }
            return i10;
        }

        private boolean v0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            List listM = coordinatorLayout.m(appBarLayout);
            int size = listM.size();
            for (int i10 = 0; i10 < size; i10++) {
                CoordinatorLayout.c cVarF = ((CoordinatorLayout.f) ((View) listM.get(i10)).getLayoutParams()).f();
                if (cVarF instanceof ScrollingViewBehavior) {
                    return ((ScrollingViewBehavior) cVarF).K() != 0;
                }
            }
            return false;
        }

        private void w0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            int topInset = appBarLayout.getTopInset() + appBarLayout.getPaddingTop();
            int iM = M() - topInset;
            int iE0 = e0(appBarLayout, iM);
            if (iE0 >= 0) {
                View childAt = appBarLayout.getChildAt(iE0);
                d dVar = (d) childAt.getLayoutParams();
                int iC = dVar.c();
                if ((iC & 17) == 17) {
                    int topInset2 = -childAt.getTop();
                    int minimumHeight = -childAt.getBottom();
                    if (iE0 == 0 && appBarLayout.getFitsSystemWindows() && childAt.getFitsSystemWindows()) {
                        topInset2 -= appBarLayout.getTopInset();
                    }
                    if (a0(iC, 2)) {
                        minimumHeight += childAt.getMinimumHeight();
                    } else if (a0(iC, 5)) {
                        int minimumHeight2 = childAt.getMinimumHeight() + minimumHeight;
                        if (iM < minimumHeight2) {
                            topInset2 = minimumHeight2;
                        } else {
                            minimumHeight = minimumHeight2;
                        }
                    }
                    if (a0(iC, 32)) {
                        topInset2 += ((LinearLayout.LayoutParams) dVar).topMargin;
                        minimumHeight -= ((LinearLayout.LayoutParams) dVar).bottomMargin;
                    }
                    V(coordinatorLayout, appBarLayout, h0.a.b(X(iM, minimumHeight, topInset2) + topInset, -appBarLayout.getTotalScrollRange(), 0), 0.0f);
                }
            }
        }

        private void x0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i10, int i11, boolean z10) {
            View viewD0 = d0(appBarLayout, i10);
            boolean zC = false;
            if (viewD0 != null) {
                int iC = ((d) viewD0.getLayoutParams()).c();
                if ((iC & 1) != 0) {
                    int minimumHeight = viewD0.getMinimumHeight();
                    if (i11 <= 0 || (iC & 12) == 0 ? !((iC & 2) == 0 || (-i10) < (viewD0.getBottom() - minimumHeight) - appBarLayout.getTopInset()) : (-i10) >= (viewD0.getBottom() - minimumHeight) - appBarLayout.getTopInset()) {
                        zC = true;
                    }
                }
            }
            if (appBarLayout.o()) {
                zC = appBarLayout.C(c0(coordinatorLayout));
            }
            boolean z11 = appBarLayout.z(zC);
            if (z10 || (z11 && v0(coordinatorLayout, appBarLayout))) {
                if (appBarLayout.getBackground() != null) {
                    appBarLayout.getBackground().jumpToCurrentState();
                }
                if (Build.VERSION.SDK_INT >= 23 && appBarLayout.getForeground() != null) {
                    appBarLayout.getForeground().jumpToCurrentState();
                }
                if (appBarLayout.getStateListAnimator() != null) {
                    appBarLayout.getStateListAnimator().jumpToCurrentState();
                }
            }
        }

        @Override // com.google.android.material.appbar.c
        int M() {
            return E() + this.f7345k;
        }

        @Override // com.google.android.material.appbar.c
        /* JADX INFO: renamed from: Y */
        public boolean H(AppBarLayout appBarLayout) {
            WeakReference weakReference = this.f7349o;
            if (weakReference == null) {
                return true;
            }
            View view = (View) weakReference.get();
            return (view == null || !view.isShown() || view.canScrollVertically(-1)) ? false : true;
        }

        @Override // com.google.android.material.appbar.c
        /* JADX INFO: renamed from: g0 */
        public int K(AppBarLayout appBarLayout) {
            return (-appBarLayout.getDownNestedScrollRange()) + appBarLayout.getTopInset();
        }

        @Override // com.google.android.material.appbar.c
        /* JADX INFO: renamed from: h0 */
        public int L(AppBarLayout appBarLayout) {
            return appBarLayout.getTotalScrollRange();
        }

        @Override // com.google.android.material.appbar.c
        /* JADX INFO: renamed from: j0 */
        public void N(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            w0(coordinatorLayout, appBarLayout);
            if (appBarLayout.o()) {
                appBarLayout.z(appBarLayout.C(c0(coordinatorLayout)));
            }
        }

        @Override // com.google.android.material.appbar.e, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* JADX INFO: renamed from: k0 */
        public boolean l(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i10) {
            boolean zL = super.l(coordinatorLayout, appBarLayout, i10);
            int pendingAction = appBarLayout.getPendingAction();
            c cVar = this.f7348n;
            if (cVar == null || (pendingAction & 8) != 0) {
                if (pendingAction != 0) {
                    boolean z10 = (pendingAction & 4) != 0;
                    if ((pendingAction & 2) != 0) {
                        int i11 = -appBarLayout.getUpNestedPreScrollRange();
                        if (z10) {
                            V(coordinatorLayout, appBarLayout, i11, 0.0f);
                        } else {
                            P(coordinatorLayout, appBarLayout, i11);
                        }
                    } else if ((pendingAction & 1) != 0) {
                        if (z10) {
                            V(coordinatorLayout, appBarLayout, 0, 0.0f);
                        } else {
                            P(coordinatorLayout, appBarLayout, 0);
                        }
                    }
                }
            } else if (cVar.f7356a) {
                P(coordinatorLayout, appBarLayout, -appBarLayout.getTotalScrollRange());
            } else if (cVar.f7357b) {
                P(coordinatorLayout, appBarLayout, 0);
            } else {
                View childAt = appBarLayout.getChildAt(cVar.f7358c);
                P(coordinatorLayout, appBarLayout, (-childAt.getBottom()) + (this.f7348n.f7360e ? childAt.getMinimumHeight() + appBarLayout.getTopInset() : Math.round(childAt.getHeight() * this.f7348n.f7359d)));
            }
            appBarLayout.v();
            this.f7348n = null;
            G(h0.a.b(E(), -appBarLayout.getTotalScrollRange(), 0));
            x0(coordinatorLayout, appBarLayout, E(), 0, true);
            appBarLayout.t(E());
            U(coordinatorLayout, appBarLayout);
            return zL;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* JADX INFO: renamed from: l0 */
        public boolean m(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i10, int i11, int i12, int i13) {
            if (((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.f) appBarLayout.getLayoutParams())).height != -2) {
                return super.m(coordinatorLayout, appBarLayout, i10, i11, i12, i13);
            }
            coordinatorLayout.D(appBarLayout, i10, i11, View.MeasureSpec.makeMeasureSpec(0, 0), i13);
            return true;
        }

        /* JADX WARN: Removed duplicated region for block: B:24:0x0027  */
        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* JADX INFO: renamed from: m0 */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void q(androidx.coordinatorlayout.widget.CoordinatorLayout r7, com.google.android.material.appbar.AppBarLayout r8, android.view.View r9, int r10, int r11, int[] r12, int r13) {
            /*
                r6 = this;
                if (r11 == 0) goto L27
                if (r11 >= 0) goto L11
                int r10 = r8.getTotalScrollRange()
                int r10 = -r10
                int r13 = r8.getDownNestedPreScrollRange()
                int r13 = r13 + r10
                r5 = r13
            Lf:
                r4 = r10
                goto L19
            L11:
                int r10 = r8.getUpNestedPreScrollRange()
                int r10 = -r10
                r13 = 0
                r5 = 0
                goto Lf
            L19:
                if (r4 == r5) goto L27
                r10 = 1
                r0 = r6
                r1 = r7
                r2 = r8
                r3 = r11
                int r7 = r0.O(r1, r2, r3, r4, r5)
                r12[r10] = r7
                goto L28
            L27:
                r2 = r8
            L28:
                boolean r7 = r2.o()
                if (r7 == 0) goto L35
                boolean r7 = r2.C(r9)
                r2.z(r7)
            L35:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.BaseBehavior.q(androidx.coordinatorlayout.widget.CoordinatorLayout, com.google.android.material.appbar.AppBarLayout, android.view.View, int, int, int[], int):void");
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* JADX INFO: renamed from: n0 */
        public void t(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
            CoordinatorLayout coordinatorLayout2;
            AppBarLayout appBarLayout2;
            int i15;
            if (i13 < 0) {
                coordinatorLayout2 = coordinatorLayout;
                appBarLayout2 = appBarLayout;
                i15 = i13;
                iArr[1] = O(coordinatorLayout2, appBarLayout2, i15, -appBarLayout.getDownNestedScrollRange(), 0);
            } else {
                coordinatorLayout2 = coordinatorLayout;
                appBarLayout2 = appBarLayout;
                i15 = i13;
            }
            if (i15 == 0) {
                U(coordinatorLayout2, appBarLayout2);
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* JADX INFO: renamed from: o0 */
        public void x(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, Parcelable parcelable) {
            if (parcelable instanceof c) {
                s0((c) parcelable, true);
                super.x(coordinatorLayout, appBarLayout, this.f7348n.getSuperState());
            } else {
                super.x(coordinatorLayout, appBarLayout, parcelable);
                this.f7348n = null;
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* JADX INFO: renamed from: p0 */
        public Parcelable y(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            Parcelable parcelableY = super.y(coordinatorLayout, appBarLayout);
            c cVarT0 = t0(parcelableY, appBarLayout);
            return cVarT0 == null ? parcelableY : cVarT0;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* JADX INFO: renamed from: q0 */
        public boolean A(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, View view2, int i10, int i11) {
            ValueAnimator valueAnimator;
            boolean z10 = (i10 & 2) != 0 && (appBarLayout.o() || appBarLayout.q() || Z(coordinatorLayout, appBarLayout, view));
            if (z10 && (valueAnimator = this.f7347m) != null) {
                valueAnimator.cancel();
            }
            this.f7349o = null;
            this.f7346l = i11;
            return z10;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* JADX INFO: renamed from: r0 */
        public void C(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i10) {
            if (this.f7346l == 0 || i10 == 1) {
                w0(coordinatorLayout, appBarLayout);
                if (appBarLayout.o()) {
                    appBarLayout.z(appBarLayout.C(view));
                }
            }
            this.f7349o = new WeakReference(view);
        }

        void s0(c cVar, boolean z10) {
            if (this.f7348n == null || z10) {
                this.f7348n = cVar;
            }
        }

        c t0(Parcelable parcelable, AppBarLayout appBarLayout) {
            int iE = E();
            int childCount = appBarLayout.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = appBarLayout.getChildAt(i10);
                int bottom = childAt.getBottom() + iE;
                if (childAt.getTop() + iE <= 0 && bottom >= 0) {
                    if (parcelable == null) {
                        parcelable = q0.a.EMPTY_STATE;
                    }
                    c cVar = new c(parcelable);
                    boolean z10 = iE == 0;
                    cVar.f7357b = z10;
                    cVar.f7356a = !z10 && (-iE) >= appBarLayout.getTotalScrollRange();
                    cVar.f7358c = i10;
                    cVar.f7360e = bottom == childAt.getMinimumHeight() + appBarLayout.getTopInset();
                    cVar.f7359d = bottom / childAt.getHeight();
                    return cVar;
                }
            }
            return null;
        }

        @Override // com.google.android.material.appbar.c
        /* JADX INFO: renamed from: u0 */
        public int Q(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i10, int i11, int i12) {
            CoordinatorLayout coordinatorLayout2;
            AppBarLayout appBarLayout2;
            int iM = M();
            int i13 = 0;
            if (i11 == 0 || iM < i11 || iM > i12) {
                coordinatorLayout2 = coordinatorLayout;
                appBarLayout2 = appBarLayout;
                this.f7345k = 0;
            } else {
                int iB = h0.a.b(i10, i11, i12);
                if (iM != iB) {
                    int iI0 = appBarLayout.i() ? i0(appBarLayout, iB) : iB;
                    boolean zG = G(iI0);
                    int i14 = iM - iB;
                    this.f7345k = iB - iI0;
                    if (zG) {
                        while (i13 < appBarLayout.getChildCount()) {
                            d dVar = (d) appBarLayout.getChildAt(i13).getLayoutParams();
                            b bVarB = dVar.b();
                            if (bVarB != null && (dVar.c() & 1) != 0) {
                                bVarB.a(appBarLayout, appBarLayout.getChildAt(i13), E());
                            }
                            i13++;
                        }
                    }
                    if (!zG && appBarLayout.i()) {
                        coordinatorLayout.f(appBarLayout);
                    }
                    appBarLayout.t(E());
                    coordinatorLayout2 = coordinatorLayout;
                    appBarLayout2 = appBarLayout;
                    x0(coordinatorLayout2, appBarLayout2, iB, iB < iM ? -1 : 1, false);
                    i13 = i14;
                } else {
                    coordinatorLayout2 = coordinatorLayout;
                    appBarLayout2 = appBarLayout;
                }
            }
            U(coordinatorLayout2, appBarLayout2);
            return i13;
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        protected static class c extends q0.a {
            public static final Parcelable.Creator<c> CREATOR = new a();

            /* JADX INFO: renamed from: a */
            boolean f7356a;

            /* JADX INFO: renamed from: b */
            boolean f7357b;

            /* JADX INFO: renamed from: c */
            int f7358c;

            /* JADX INFO: renamed from: d */
            float f7359d;

            /* JADX INFO: renamed from: e */
            boolean f7360e;

            class a implements Parcelable.ClassLoaderCreator {
                a() {
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: a */
                public c createFromParcel(Parcel parcel) {
                    return new c(parcel, null);
                }

                @Override // android.os.Parcelable.ClassLoaderCreator
                /* JADX INFO: renamed from: b */
                public c createFromParcel(Parcel parcel, ClassLoader classLoader) {
                    return new c(parcel, classLoader);
                }

                @Override // android.os.Parcelable.Creator
                /* JADX INFO: renamed from: c */
                public c[] newArray(int i10) {
                    return new c[i10];
                }
            }

            public c(Parcel parcel, ClassLoader classLoader) {
                super(parcel, classLoader);
                this.f7356a = parcel.readByte() != 0;
                this.f7357b = parcel.readByte() != 0;
                this.f7358c = parcel.readInt();
                this.f7359d = parcel.readFloat();
                this.f7360e = parcel.readByte() != 0;
            }

            @Override // q0.a, android.os.Parcelable
            public void writeToParcel(Parcel parcel, int i10) {
                super.writeToParcel(parcel, i10);
                parcel.writeByte(this.f7356a ? (byte) 1 : (byte) 0);
                parcel.writeByte(this.f7357b ? (byte) 1 : (byte) 0);
                parcel.writeInt(this.f7358c);
                parcel.writeFloat(this.f7359d);
                parcel.writeByte(this.f7360e ? (byte) 1 : (byte) 0);
            }

            public c(Parcelable parcelable) {
                super(parcelable);
            }
        }
    }

    public static class Behavior extends BaseBehavior<AppBarLayout> {
        public Behavior() {
        }

        @Override // com.google.android.material.appbar.c, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public /* bridge */ /* synthetic */ boolean D(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            return super.D(coordinatorLayout, view, motionEvent);
        }

        @Override // com.google.android.material.appbar.e
        public /* bridge */ /* synthetic */ int E() {
            return super.E();
        }

        @Override // com.google.android.material.appbar.e
        public /* bridge */ /* synthetic */ boolean G(int i10) {
            return super.G(i10);
        }

        @Override // com.google.android.material.appbar.c, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public /* bridge */ /* synthetic */ boolean k(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            return super.k(coordinatorLayout, view, motionEvent);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* JADX INFO: renamed from: k0 */
        public /* bridge */ /* synthetic */ boolean l(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i10) {
            return super.l(coordinatorLayout, appBarLayout, i10);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* JADX INFO: renamed from: l0 */
        public /* bridge */ /* synthetic */ boolean m(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i10, int i11, int i12, int i13) {
            return super.m(coordinatorLayout, appBarLayout, i10, i11, i12, i13);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* JADX INFO: renamed from: m0 */
        public /* bridge */ /* synthetic */ void q(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i10, int i11, int[] iArr, int i12) {
            super.q(coordinatorLayout, appBarLayout, view, i10, i11, iArr, i12);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* JADX INFO: renamed from: n0 */
        public /* bridge */ /* synthetic */ void t(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
            super.t(coordinatorLayout, appBarLayout, view, i10, i11, i12, i13, i14, iArr);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* JADX INFO: renamed from: o0 */
        public /* bridge */ /* synthetic */ void x(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, Parcelable parcelable) {
            super.x(coordinatorLayout, appBarLayout, parcelable);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* JADX INFO: renamed from: p0 */
        public /* bridge */ /* synthetic */ Parcelable y(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            return super.y(coordinatorLayout, appBarLayout);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* JADX INFO: renamed from: q0 */
        public /* bridge */ /* synthetic */ boolean A(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, View view2, int i10, int i11) {
            return super.A(coordinatorLayout, appBarLayout, view, view2, i10, i11);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* JADX INFO: renamed from: r0 */
        public /* bridge */ /* synthetic */ void C(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i10) {
            super.C(coordinatorLayout, appBarLayout, view, i10);
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    public static class ScrollingViewBehavior extends com.google.android.material.appbar.d {
        public ScrollingViewBehavior() {
        }

        private static int R(AppBarLayout appBarLayout) {
            CoordinatorLayout.c cVarF = ((CoordinatorLayout.f) appBarLayout.getLayoutParams()).f();
            if (cVarF instanceof BaseBehavior) {
                return ((BaseBehavior) cVarF).M();
            }
            return 0;
        }

        private void S(View view, View view2) {
            CoordinatorLayout.c cVarF = ((CoordinatorLayout.f) view2.getLayoutParams()).f();
            if (cVarF instanceof BaseBehavior) {
                o0.X(view, (((view2.getBottom() - view.getTop()) + ((BaseBehavior) cVarF).f7345k) + M()) - I(view2));
            }
        }

        private void T(View view, View view2) {
            if (view2 instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view2;
                if (appBarLayout.o()) {
                    appBarLayout.z(appBarLayout.C(view));
                }
            }
        }

        @Override // com.google.android.material.appbar.d
        float J(View view) {
            int i10;
            if (view instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view;
                int totalScrollRange = appBarLayout.getTotalScrollRange();
                int downNestedPreScrollRange = appBarLayout.getDownNestedPreScrollRange();
                int iR = R(appBarLayout);
                if ((downNestedPreScrollRange == 0 || totalScrollRange + iR > downNestedPreScrollRange) && (i10 = totalScrollRange - downNestedPreScrollRange) != 0) {
                    return (iR / i10) + 1.0f;
                }
            }
            return 0.0f;
        }

        @Override // com.google.android.material.appbar.d
        int L(View view) {
            return view instanceof AppBarLayout ? ((AppBarLayout) view).getTotalScrollRange() : super.L(view);
        }

        @Override // com.google.android.material.appbar.d
        /* JADX INFO: renamed from: Q */
        public AppBarLayout H(List list) {
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                View view = (View) list.get(i10);
                if (view instanceof AppBarLayout) {
                    return (AppBarLayout) view;
                }
            }
            return null;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public boolean e(CoordinatorLayout coordinatorLayout, View view, View view2) {
            return view2 instanceof AppBarLayout;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public boolean h(CoordinatorLayout coordinatorLayout, View view, View view2) {
            S(view, view2);
            T(view, view2);
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public void i(CoordinatorLayout coordinatorLayout, View view, View view2) {
            if (view2 instanceof AppBarLayout) {
                o0.n0(coordinatorLayout, null);
            }
        }

        @Override // com.google.android.material.appbar.e, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public /* bridge */ /* synthetic */ boolean l(CoordinatorLayout coordinatorLayout, View view, int i10) {
            return super.l(coordinatorLayout, view, i10);
        }

        @Override // com.google.android.material.appbar.d, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public /* bridge */ /* synthetic */ boolean m(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12, int i13) {
            return super.m(coordinatorLayout, view, i10, i11, i12, i13);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public boolean w(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z10) {
            AppBarLayout appBarLayoutH = H(coordinatorLayout.l(view));
            if (appBarLayoutH != null) {
                Rect rect2 = new Rect(rect);
                rect2.offset(view.getLeft(), view.getTop());
                Rect rect3 = this.f7390d;
                rect3.set(0, 0, coordinatorLayout.getWidth(), coordinatorLayout.getHeight());
                if (!rect3.contains(rect2)) {
                    appBarLayoutH.w(false, !z10);
                    return true;
                }
            }
            return false;
        }

        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, l.f28803f5);
            O(typedArrayObtainStyledAttributes.getDimensionPixelSize(l.f28812g5, 0));
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    class a implements b0 {
        a() {
        }

        @Override // m0.b0
        public i1 a(View view, i1 i1Var) {
            return AppBarLayout.this.u(i1Var);
        }
    }

    public static abstract class b {
        public abstract void a(AppBarLayout appBarLayout, View view, float f10);
    }

    public static class c extends b {

        /* JADX INFO: renamed from: a */
        private final Rect f7362a = new Rect();

        /* JADX INFO: renamed from: b */
        private final Rect f7363b = new Rect();

        private static void b(Rect rect, AppBarLayout appBarLayout, View view) {
            view.getDrawingRect(rect);
            appBarLayout.offsetDescendantRectToMyCoords(view, rect);
            rect.offset(0, -appBarLayout.getTopInset());
        }

        @Override // com.google.android.material.appbar.AppBarLayout.b
        public void a(AppBarLayout appBarLayout, View view, float f10) {
            b(this.f7362a, appBarLayout, view);
            float fAbs = this.f7362a.top - Math.abs(f10);
            if (fAbs > 0.0f) {
                view.setClipBounds(null);
                view.setTranslationY(0.0f);
                view.setAlpha(1.0f);
                return;
            }
            float fA = 1.0f - h0.a.a(Math.abs(fAbs / this.f7362a.height()), 0.0f, 1.0f);
            float fHeight = (-fAbs) - ((this.f7362a.height() * 0.3f) * (1.0f - (fA * fA)));
            view.setTranslationY(fHeight);
            view.getDrawingRect(this.f7363b);
            this.f7363b.offset(0, (int) (-fHeight));
            if (fHeight >= this.f7363b.height()) {
                view.setAlpha(0.0f);
            } else {
                view.setAlpha(1.0f);
            }
            view.setClipBounds(this.f7363b);
        }
    }

    public AppBarLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, u8.b.f28542a);
    }

    private boolean B() {
        return this.G != null && getTopInset() > 0;
    }

    private boolean D() {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            if (childAt.getVisibility() != 8 && !childAt.getFitsSystemWindows()) {
                return true;
            }
        }
        return false;
    }

    private void E(float f10, float f11) {
        ValueAnimator valueAnimator = this.f7343y;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f10, f11);
        this.f7343y = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(this.C);
        this.f7343y.setInterpolator(this.D);
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = this.f7344z;
        if (animatorUpdateListener != null) {
            this.f7343y.addUpdateListener(animatorUpdateListener);
        }
        this.f7343y.start();
    }

    private void F() {
        setWillNotDraw(!B());
    }

    public static /* synthetic */ void a(AppBarLayout appBarLayout, h hVar, ValueAnimator valueAnimator) {
        appBarLayout.getClass();
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        hVar.b0(fFloatValue);
        Drawable drawable = appBarLayout.G;
        if (drawable instanceof h) {
            ((h) drawable).b0(fFloatValue);
        }
        Iterator it = appBarLayout.A.iterator();
        if (it.hasNext()) {
            android.support.v4.media.session.b.a(it.next());
            hVar.E();
            throw null;
        }
        Iterator it2 = appBarLayout.B.iterator();
        if (it2.hasNext()) {
            android.support.v4.media.session.b.a(it2.next());
            hVar.E();
            throw null;
        }
    }

    public static /* synthetic */ void b(AppBarLayout appBarLayout, ColorStateList colorStateList, h hVar, Integer num, ValueAnimator valueAnimator) {
        Integer num2;
        appBarLayout.getClass();
        int iK = c9.a.k(appBarLayout.F, colorStateList.getDefaultColor(), ((Float) valueAnimator.getAnimatedValue()).floatValue());
        hVar.c0(ColorStateList.valueOf(iK));
        if (appBarLayout.G != null && (num2 = appBarLayout.H) != null && num2.equals(num)) {
            appBarLayout.G.setTint(iK);
        }
        if (!appBarLayout.A.isEmpty()) {
            Iterator it = appBarLayout.A.iterator();
            while (it.hasNext()) {
                android.support.v4.media.session.b.a(it.next());
                if (hVar.B() != null) {
                    throw null;
                }
            }
        }
        if (appBarLayout.B.isEmpty()) {
            return;
        }
        Iterator it2 = appBarLayout.B.iterator();
        if (it2.hasNext()) {
            android.support.v4.media.session.b.a(it2.next());
            throw null;
        }
    }

    private void c() {
        WeakReference weakReference = this.f7342x;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f7342x = null;
    }

    private Integer d() {
        Drawable drawable = this.G;
        if (drawable instanceof h) {
            return Integer.valueOf(((h) drawable).E());
        }
        ColorStateList colorStateListF = com.google.android.material.drawable.c.f(drawable);
        if (colorStateListF != null) {
            return Integer.valueOf(colorStateListF.getDefaultColor());
        }
        return null;
    }

    private View e(View view) {
        int i10;
        if (this.f7342x == null && (i10 = this.f7341w) != -1) {
            View viewFindViewById = view != null ? view.findViewById(i10) : null;
            if (viewFindViewById == null && (getParent() instanceof ViewGroup)) {
                viewFindViewById = ((ViewGroup) getParent()).findViewById(this.f7341w);
            }
            if (viewFindViewById != null) {
                this.f7342x = new WeakReference(viewFindViewById);
            }
        }
        WeakReference weakReference = this.f7342x;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    private boolean j() {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            if (((d) getChildAt(i10).getLayoutParams()).e()) {
                return true;
            }
        }
        return false;
    }

    private void l(final h hVar, final ColorStateList colorStateList) {
        final Integer numF = c9.a.f(getContext(), u8.b.f28552h);
        this.f7344z = new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.appbar.a
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                AppBarLayout.b(this.f7374a, colorStateList, hVar, numF, valueAnimator);
            }
        };
    }

    private void m(Context context, final h hVar) {
        hVar.Q(context);
        this.f7344z = new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.appbar.b
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                AppBarLayout.a(this.f7378a, hVar, valueAnimator);
            }
        };
    }

    private void n() {
        Behavior behavior = this.J;
        BaseBehavior.c cVarT0 = (behavior == null || this.f7329b == -1 || this.f7333f != 0) ? null : behavior.t0(q0.a.EMPTY_STATE, this);
        this.f7329b = -1;
        this.f7330c = -1;
        this.f7331d = -1;
        if (cVarT0 != null) {
            this.J.s0(cVarT0, false);
        }
    }

    private boolean p() {
        return getBackground() instanceof h;
    }

    private h r(Drawable drawable) {
        if (drawable instanceof h) {
            return (h) drawable;
        }
        ColorStateList colorStateListF = com.google.android.material.drawable.c.f(drawable);
        if (colorStateListF == null) {
            return null;
        }
        h hVar = new h();
        hVar.c0(colorStateListF);
        return hVar;
    }

    private Drawable s(Context context, Drawable drawable) {
        h hVarR = r(drawable);
        if (hVarR == null || hVarR.B() == null) {
            return drawable;
        }
        this.F = hVarR.B().getDefaultColor();
        ColorStateList colorStateList = this.f7340v;
        if (colorStateList != null) {
            l(hVarR, colorStateList);
            return hVarR;
        }
        m(context, hVarR);
        return hVarR;
    }

    private void x(boolean z10, boolean z11, boolean z12) {
        this.f7333f = (z10 ? 1 : 2) | (z11 ? 4 : 0) | (z12 ? 8 : 0);
        requestLayout();
    }

    private boolean y(boolean z10) {
        if (this.f7337s == z10) {
            return false;
        }
        this.f7337s = z10;
        refreshDrawableState();
        return true;
    }

    boolean A(boolean z10, boolean z11) {
        if (!z11 || this.f7338t == z10) {
            return false;
        }
        this.f7338t = z10;
        refreshDrawableState();
        if (!p()) {
            return true;
        }
        if (this.f7340v != null) {
            E(z10 ? 0.0f : 1.0f, z10 ? 1.0f : 0.0f);
            return true;
        }
        if (!this.f7339u) {
            return true;
        }
        E(z10 ? 0.0f : this.I, z10 ? this.I : 0.0f);
        return true;
    }

    boolean C(View view) {
        View viewE = e(view);
        if (viewE != null) {
            view = viewE;
        }
        if (view != null) {
            return view.canScrollVertically(-1) || view.getScrollY() > 0;
        }
        return false;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof d;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (B()) {
            int iSave = canvas.save();
            canvas.translate(0.0f, -this.f7328a);
            this.G.draw(canvas);
            canvas.restoreToCount(iSave);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.G;
        if (drawable != null && drawable.isStateful() && drawable.setState(drawableState)) {
            invalidateDrawable(drawable);
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* JADX INFO: renamed from: f */
    public d generateDefaultLayoutParams() {
        return new d(-1, -2);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* JADX INFO: renamed from: g */
    public d generateLayoutParams(AttributeSet attributeSet) {
        return new d(getContext(), attributeSet);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public CoordinatorLayout.c getBehavior() {
        Behavior behavior = new Behavior();
        this.J = behavior;
        return behavior;
    }

    int getDownNestedPreScrollRange() {
        int iMin;
        int minimumHeight;
        int i10 = this.f7330c;
        if (i10 != -1) {
            return i10;
        }
        int i11 = 0;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (childAt.getVisibility() != 8) {
                d dVar = (d) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight();
                int i12 = dVar.f7364a;
                if ((i12 & 5) != 5) {
                    if (i11 > 0) {
                        break;
                    }
                } else {
                    int i13 = ((LinearLayout.LayoutParams) dVar).topMargin + ((LinearLayout.LayoutParams) dVar).bottomMargin;
                    if ((i12 & 8) != 0) {
                        minimumHeight = childAt.getMinimumHeight();
                    } else if ((i12 & 2) != 0) {
                        minimumHeight = measuredHeight - childAt.getMinimumHeight();
                    } else {
                        iMin = i13 + measuredHeight;
                        if (childCount == 0 && childAt.getFitsSystemWindows()) {
                            iMin = Math.min(iMin, measuredHeight - getTopInset());
                        }
                        i11 += iMin;
                    }
                    iMin = i13 + minimumHeight;
                    if (childCount == 0) {
                        iMin = Math.min(iMin, measuredHeight - getTopInset());
                    }
                    i11 += iMin;
                }
            }
        }
        int iMax = Math.max(0, i11);
        this.f7330c = iMax;
        return iMax;
    }

    int getDownNestedScrollRange() {
        int i10 = this.f7331d;
        if (i10 != -1) {
            return i10;
        }
        int childCount = getChildCount();
        int i11 = 0;
        int minimumHeight = 0;
        while (true) {
            if (i11 >= childCount) {
                break;
            }
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() != 8) {
                d dVar = (d) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight() + ((LinearLayout.LayoutParams) dVar).topMargin + ((LinearLayout.LayoutParams) dVar).bottomMargin;
                int i12 = dVar.f7364a;
                if ((i12 & 1) == 0) {
                    break;
                }
                minimumHeight += measuredHeight;
                if ((i12 & 2) != 0) {
                    minimumHeight -= childAt.getMinimumHeight();
                    break;
                }
            }
            i11++;
        }
        int iMax = Math.max(0, minimumHeight);
        this.f7331d = iMax;
        return iMax;
    }

    public int getLiftOnScrollTargetViewId() {
        return this.f7341w;
    }

    public h getMaterialShapeBackground() {
        Drawable background = getBackground();
        if (background instanceof h) {
            return (h) background;
        }
        return null;
    }

    public final int getMinimumHeightForVisibleOverlappingContent() {
        int topInset = getTopInset();
        int minimumHeight = getMinimumHeight();
        if (minimumHeight != 0) {
            int i10 = (minimumHeight * 2) + topInset;
            return i10 < getHeight() ? i10 : minimumHeight + topInset;
        }
        int childCount = getChildCount();
        int minimumHeight2 = childCount >= 1 ? getChildAt(childCount - 1).getMinimumHeight() : 0;
        if (minimumHeight2 == 0) {
            return getHeight() / 3;
        }
        int i11 = (minimumHeight2 * 2) + topInset;
        return i11 < getHeight() ? i11 : minimumHeight2 + topInset;
    }

    int getPendingAction() {
        return this.f7333f;
    }

    public Drawable getStatusBarForeground() {
        return this.G;
    }

    @Deprecated
    public float getTargetElevation() {
        return 0.0f;
    }

    final int getTopInset() {
        i1 i1Var = this.f7334g;
        if (i1Var != null) {
            return i1Var.l();
        }
        return 0;
    }

    public final int getTotalScrollRange() {
        int i10 = this.f7329b;
        if (i10 != -1) {
            return i10;
        }
        int childCount = getChildCount();
        int i11 = 0;
        int minimumHeight = 0;
        while (true) {
            if (i11 >= childCount) {
                break;
            }
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() != 8) {
                d dVar = (d) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight();
                int i12 = dVar.f7364a;
                if ((i12 & 1) == 0) {
                    break;
                }
                minimumHeight += measuredHeight + ((LinearLayout.LayoutParams) dVar).topMargin + ((LinearLayout.LayoutParams) dVar).bottomMargin;
                if (i11 == 0 && childAt.getFitsSystemWindows()) {
                    minimumHeight -= getTopInset();
                }
                if ((i12 & 2) != 0) {
                    minimumHeight -= childAt.getMinimumHeight();
                    break;
                }
            }
            i11++;
        }
        int iMax = Math.max(0, minimumHeight);
        this.f7329b = iMax;
        return iMax;
    }

    int getUpNestedPreScrollRange() {
        return getTotalScrollRange();
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* JADX INFO: renamed from: h */
    public d generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LinearLayout.LayoutParams ? new d((LinearLayout.LayoutParams) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new d((ViewGroup.MarginLayoutParams) layoutParams) : new d(layoutParams);
    }

    boolean i() {
        return this.f7332e;
    }

    boolean k() {
        return getTotalScrollRange() != 0;
    }

    public boolean o() {
        return this.f7339u;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        i.e(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected int[] onCreateDrawableState(int i10) {
        if (this.E == null) {
            this.E = new int[4];
        }
        int[] iArr = this.E;
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i10 + iArr.length);
        boolean z10 = this.f7337s;
        int i11 = u8.b.V;
        if (!z10) {
            i11 = -i11;
        }
        iArr[0] = i11;
        iArr[1] = (z10 && this.f7338t) ? u8.b.W : -u8.b.W;
        int i12 = u8.b.S;
        if (!z10) {
            i12 = -i12;
        }
        iArr[2] = i12;
        iArr[3] = (z10 && this.f7338t) ? u8.b.R : -u8.b.R;
        return View.mergeDrawableStates(iArrOnCreateDrawableState, iArr);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        c();
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        boolean z11 = true;
        if (getFitsSystemWindows() && D()) {
            int topInset = getTopInset();
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                o0.X(getChildAt(childCount), topInset);
            }
        }
        n();
        this.f7332e = false;
        int childCount2 = getChildCount();
        int i14 = 0;
        while (true) {
            if (i14 >= childCount2) {
                break;
            }
            if (((d) getChildAt(i14).getLayoutParams()).d() != null) {
                this.f7332e = true;
                break;
            }
            i14++;
        }
        Drawable drawable = this.G;
        if (drawable != null) {
            drawable.setBounds(0, 0, getWidth(), getTopInset());
        }
        if (this.f7336r) {
            return;
        }
        if (!this.f7339u && !j()) {
            z11 = false;
        }
        y(z11);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int mode = View.MeasureSpec.getMode(i11);
        if (mode != 1073741824 && getFitsSystemWindows() && D()) {
            int measuredHeight = getMeasuredHeight();
            if (mode == Integer.MIN_VALUE) {
                measuredHeight = h0.a.b(getMeasuredHeight() + getTopInset(), 0, View.MeasureSpec.getSize(i11));
            } else if (mode == 0) {
                measuredHeight += getTopInset();
            }
            setMeasuredDimension(getMeasuredWidth(), measuredHeight);
        }
        n();
    }

    public boolean q() {
        return this.f7338t;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        super.setBackground(s(getContext(), drawable));
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        super.setElevation(f10);
        i.d(this, f10);
    }

    public void setExpanded(boolean z10) {
        w(z10, isLaidOut());
    }

    public void setLiftOnScroll(boolean z10) {
        this.f7339u = z10;
    }

    public void setLiftOnScrollColor(ColorStateList colorStateList) {
        if (this.f7340v != colorStateList) {
            this.f7340v = colorStateList;
            setBackground(getBackground());
        }
    }

    public void setLiftOnScrollTargetView(View view) {
        this.f7341w = -1;
        if (view == null) {
            c();
        } else {
            this.f7342x = new WeakReference(view);
        }
    }

    public void setLiftOnScrollTargetViewId(int i10) {
        this.f7341w = i10;
        c();
    }

    public void setLiftableOverrideEnabled(boolean z10) {
        this.f7336r = z10;
    }

    @Override // android.widget.LinearLayout
    public void setOrientation(int i10) {
        if (i10 != 1) {
            throw new IllegalArgumentException("AppBarLayout is always vertical and does not support horizontal orientation");
        }
        super.setOrientation(i10);
    }

    void setPendingAction(int i10) {
        this.f7333f = i10;
    }

    public void setStatusBarForeground(Drawable drawable) {
        Drawable drawable2 = this.G;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            this.G = drawable != null ? drawable.mutate() : null;
            this.H = d();
            Drawable drawable3 = this.G;
            if (drawable3 != null) {
                if (drawable3.isStateful()) {
                    this.G.setState(getDrawableState());
                }
                e0.a.m(this.G, getLayoutDirection());
                this.G.setVisible(getVisibility() == 0, false);
                this.G.setCallback(this);
            }
            F();
            postInvalidateOnAnimation();
        }
    }

    public void setStatusBarForegroundColor(int i10) {
        setStatusBarForeground(new ColorDrawable(i10));
    }

    public void setStatusBarForegroundResource(int i10) {
        setStatusBarForeground(i.a.b(getContext(), i10));
    }

    @Deprecated
    public void setTargetElevation(float f10) {
        g.b(this, f10);
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        boolean z10 = i10 == 0;
        Drawable drawable = this.G;
        if (drawable != null) {
            drawable.setVisible(z10, false);
        }
    }

    void t(int i10) {
        this.f7328a = i10;
        if (!willNotDraw()) {
            postInvalidateOnAnimation();
        }
        List list = this.f7335h;
        if (list != null) {
            int size = list.size();
            for (int i11 = 0; i11 < size; i11++) {
                android.support.v4.media.session.b.a(this.f7335h.get(i11));
            }
        }
    }

    i1 u(i1 i1Var) {
        i1 i1Var2 = getFitsSystemWindows() ? i1Var : null;
        if (!l0.b.a(this.f7334g, i1Var2)) {
            this.f7334g = i1Var2;
            F();
            requestLayout();
        }
        return i1Var;
    }

    void v() {
        this.f7333f = 0;
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.G;
    }

    public void w(boolean z10, boolean z11) {
        x(z10, z11, true);
    }

    boolean z(boolean z10) {
        return A(z10, !this.f7336r);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public AppBarLayout(Context context, AttributeSet attributeSet, int i10) {
        int i11 = K;
        super(q9.a.d(context, attributeSet, i10, i11), attributeSet, i10);
        this.f7329b = -1;
        this.f7330c = -1;
        this.f7331d = -1;
        this.f7333f = 0;
        this.A = new ArrayList();
        this.B = new LinkedHashSet();
        Context context2 = getContext();
        setOrientation(1);
        if (getOutlineProvider() == ViewOutlineProvider.BACKGROUND) {
            g.a(this);
        }
        g.c(this, attributeSet, i10, i11);
        TypedArray typedArrayI = m.i(context2, attributeSet, l.f28751a, i10, i11, new int[0]);
        this.f7340v = j9.c.a(context2, typedArrayI, l.f28815h);
        this.C = h9.d.f(context2, u8.b.f28570z, getResources().getInteger(u8.g.f28669a));
        this.D = h9.d.g(context2, u8.b.J, v8.a.f30492a);
        int i12 = l.f28797f;
        if (typedArrayI.hasValue(i12)) {
            x(typedArrayI.getBoolean(i12, false), false, false);
        }
        if (typedArrayI.hasValue(l.f28788e)) {
            g.b(this, typedArrayI.getDimensionPixelSize(r10, 0));
        }
        setBackground(typedArrayI.getDrawable(l.f28761b));
        if (Build.VERSION.SDK_INT >= 26) {
            int i13 = l.f28779d;
            if (typedArrayI.hasValue(i13)) {
                setKeyboardNavigationCluster(typedArrayI.getBoolean(i13, false));
            }
            int i14 = l.f28770c;
            if (typedArrayI.hasValue(i14)) {
                setTouchscreenBlocksFocus(typedArrayI.getBoolean(i14, false));
            }
        }
        this.I = getResources().getDimension(u8.d.f28585c);
        this.f7339u = typedArrayI.getBoolean(l.f28806g, false);
        this.f7341w = typedArrayI.getResourceId(l.f28824i, -1);
        setStatusBarForeground(typedArrayI.getDrawable(l.f28833j));
        typedArrayI.recycle();
        o0.y0(this, new a());
    }

    public static class d extends LinearLayout.LayoutParams {

        /* JADX INFO: renamed from: a */
        int f7364a;

        /* JADX INFO: renamed from: b */
        private b f7365b;

        /* JADX INFO: renamed from: c */
        Interpolator f7366c;

        public d(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f7364a = 1;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, l.f28851l);
            this.f7364a = typedArrayObtainStyledAttributes.getInt(l.f28869n, 0);
            f(typedArrayObtainStyledAttributes.getInt(l.f28860m, 0));
            int i10 = l.f28878o;
            if (typedArrayObtainStyledAttributes.hasValue(i10)) {
                this.f7366c = AnimationUtils.loadInterpolator(context, typedArrayObtainStyledAttributes.getResourceId(i10, 0));
            }
            typedArrayObtainStyledAttributes.recycle();
        }

        private b a(int i10) {
            if (i10 != 1) {
                return null;
            }
            return new c();
        }

        public b b() {
            return this.f7365b;
        }

        public int c() {
            return this.f7364a;
        }

        public Interpolator d() {
            return this.f7366c;
        }

        boolean e() {
            int i10 = this.f7364a;
            return (i10 & 1) == 1 && (i10 & 10) != 0;
        }

        public void f(int i10) {
            this.f7365b = a(i10);
        }

        public d(int i10, int i11) {
            super(i10, i11);
            this.f7364a = 1;
        }

        public d(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f7364a = 1;
        }

        public d(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f7364a = 1;
        }

        public d(LinearLayout.LayoutParams layoutParams) {
            super(layoutParams);
            this.f7364a = 1;
        }
    }
}
