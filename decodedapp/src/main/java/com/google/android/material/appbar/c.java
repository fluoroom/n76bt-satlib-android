package com.google.android.material.appbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.OverScroller;
import androidx.appcompat.widget.ActivityChooserView;
import androidx.appcompat.widget.RtlSpacingHelper;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* JADX INFO: loaded from: classes3.dex */
abstract class c extends e {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Runnable f7380d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    OverScroller f7381e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f7382f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f7383g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f7384h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f7385i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private VelocityTracker f7386j;

    private class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final CoordinatorLayout f7387a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final View f7388b;

        a(CoordinatorLayout coordinatorLayout, View view) {
            this.f7387a = coordinatorLayout;
            this.f7388b = view;
        }

        @Override // java.lang.Runnable
        public void run() {
            OverScroller overScroller;
            if (this.f7388b == null || (overScroller = c.this.f7381e) == null) {
                return;
            }
            if (!overScroller.computeScrollOffset()) {
                c.this.N(this.f7387a, this.f7388b);
                return;
            }
            c cVar = c.this;
            cVar.P(this.f7387a, this.f7388b, cVar.f7381e.getCurrY());
            this.f7388b.postOnAnimation(this);
        }
    }

    public c() {
        this.f7383g = -1;
        this.f7385i = -1;
    }

    private void I() {
        if (this.f7386j == null) {
            this.f7386j = VelocityTracker.obtain();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008b A[ADDED_TO_REGION] */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean D(androidx.coordinatorlayout.widget.CoordinatorLayout r10, android.view.View r11, android.view.MotionEvent r12) {
        /*
            r9 = this;
            int r1 = r12.getActionMasked()
            r6 = -1
            r7 = 0
            r8 = 1
            if (r1 == r8) goto L4d
            r3 = 2
            if (r1 == r3) goto L2d
            r2 = 3
            if (r1 == r2) goto L71
            r2 = 6
            if (r1 == r2) goto L13
            goto L4b
        L13:
            int r1 = r12.getActionIndex()
            if (r1 != 0) goto L1b
            r1 = 1
            goto L1c
        L1b:
            r1 = 0
        L1c:
            int r2 = r12.getPointerId(r1)
            r9.f7383g = r2
            float r1 = r12.getY(r1)
            r2 = 1056964608(0x3f000000, float:0.5)
            float r1 = r1 + r2
            int r1 = (int) r1
            r9.f7384h = r1
            goto L4b
        L2d:
            int r1 = r9.f7383g
            int r1 = r12.findPointerIndex(r1)
            if (r1 != r6) goto L36
            return r7
        L36:
            float r1 = r12.getY(r1)
            int r1 = (int) r1
            int r3 = r9.f7384h
            int r3 = r3 - r1
            r9.f7384h = r1
            int r4 = r9.K(r11)
            r5 = 0
            r0 = r9
            r1 = r10
            r2 = r11
            r0.O(r1, r2, r3, r4, r5)
        L4b:
            r1 = 0
            goto L80
        L4d:
            android.view.VelocityTracker r1 = r9.f7386j
            if (r1 == 0) goto L71
            r1.addMovement(r12)
            android.view.VelocityTracker r1 = r9.f7386j
            r3 = 1000(0x3e8, float:1.401E-42)
            r1.computeCurrentVelocity(r3)
            android.view.VelocityTracker r1 = r9.f7386j
            int r3 = r9.f7383g
            float r5 = r1.getYVelocity(r3)
            int r1 = r9.L(r11)
            int r3 = -r1
            r4 = 0
            r0 = r9
            r1 = r10
            r2 = r11
            r0.J(r1, r2, r3, r4, r5)
            r1 = 1
            goto L72
        L71:
            r1 = 0
        L72:
            r9.f7382f = r7
            r9.f7383g = r6
            android.view.VelocityTracker r2 = r9.f7386j
            if (r2 == 0) goto L80
            r2.recycle()
            r2 = 0
            r9.f7386j = r2
        L80:
            android.view.VelocityTracker r2 = r9.f7386j
            if (r2 == 0) goto L87
            r2.addMovement(r12)
        L87:
            boolean r2 = r9.f7382f
            if (r2 != 0) goto L8f
            if (r1 == 0) goto L8e
            goto L8f
        L8e:
            return r7
        L8f:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.c.D(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    abstract boolean H(View view);

    final boolean J(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, float f10) {
        Runnable runnable = this.f7380d;
        if (runnable != null) {
            view.removeCallbacks(runnable);
            this.f7380d = null;
        }
        if (this.f7381e == null) {
            this.f7381e = new OverScroller(view.getContext());
        }
        this.f7381e.fling(0, E(), 0, Math.round(f10), 0, 0, i10, i11);
        if (!this.f7381e.computeScrollOffset()) {
            N(coordinatorLayout, view);
            return false;
        }
        a aVar = new a(coordinatorLayout, view);
        this.f7380d = aVar;
        view.postOnAnimation(aVar);
        return true;
    }

    abstract int K(View view);

    abstract int L(View view);

    abstract int M();

    abstract void N(CoordinatorLayout coordinatorLayout, View view);

    final int O(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12) {
        return Q(coordinatorLayout, view, M() - i10, i11, i12);
    }

    int P(CoordinatorLayout coordinatorLayout, View view, int i10) {
        return Q(coordinatorLayout, view, i10, RtlSpacingHelper.UNDEFINED, ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED);
    }

    abstract int Q(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12);

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean k(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        int iFindPointerIndex;
        if (this.f7385i < 0) {
            this.f7385i = ViewConfiguration.get(coordinatorLayout.getContext()).getScaledTouchSlop();
        }
        if (motionEvent.getActionMasked() == 2 && this.f7382f) {
            int i10 = this.f7383g;
            if (i10 == -1 || (iFindPointerIndex = motionEvent.findPointerIndex(i10)) == -1) {
                return false;
            }
            int y10 = (int) motionEvent.getY(iFindPointerIndex);
            if (Math.abs(y10 - this.f7384h) > this.f7385i) {
                this.f7384h = y10;
                return true;
            }
        }
        if (motionEvent.getActionMasked() == 0) {
            this.f7383g = -1;
            int x10 = (int) motionEvent.getX();
            int y11 = (int) motionEvent.getY();
            boolean z10 = H(view) && coordinatorLayout.v(view, x10, y11);
            this.f7382f = z10;
            if (z10) {
                this.f7384h = y11;
                this.f7383g = motionEvent.getPointerId(0);
                I();
                OverScroller overScroller = this.f7381e;
                if (overScroller != null && !overScroller.isFinished()) {
                    this.f7381e.abortAnimation();
                    return true;
                }
            }
        }
        VelocityTracker velocityTracker = this.f7386j;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
        return false;
    }

    public c(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f7383g = -1;
        this.f7385i = -1;
    }
}
