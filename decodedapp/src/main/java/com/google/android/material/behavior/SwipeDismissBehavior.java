package com.google.android.material.behavior;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import m0.o0;
import n0.a0;
import n0.x;
import r0.c;

/* JADX INFO: loaded from: classes3.dex */
public class SwipeDismissBehavior<V extends View> extends CoordinatorLayout.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    r0.c f7441a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    c f7442b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f7443c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f7444d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f7446f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f7445e = 0.0f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    int f7447g = 2;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    float f7448h = 0.5f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    float f7449i = 0.0f;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    float f7450j = 0.5f;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final c.AbstractC0348c f7451k = new a();

    class a extends c.AbstractC0348c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f7452a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f7453b = -1;

        a() {
        }

        private boolean n(View view, float f10) {
            if (f10 == 0.0f) {
                return Math.abs(view.getLeft() - this.f7452a) >= Math.round(((float) view.getWidth()) * SwipeDismissBehavior.this.f7448h);
            }
            boolean z10 = view.getLayoutDirection() == 1;
            int i10 = SwipeDismissBehavior.this.f7447g;
            if (i10 == 2) {
                return true;
            }
            if (i10 == 0) {
                return z10 ? f10 < 0.0f : f10 > 0.0f;
            }
            if (i10 == 1) {
                if (z10) {
                    return f10 > 0.0f;
                }
                if (f10 < 0.0f) {
                    return true;
                }
            }
            return false;
        }

        @Override // r0.c.AbstractC0348c
        public int a(View view, int i10, int i11) {
            int width;
            int width2;
            int width3;
            boolean z10 = view.getLayoutDirection() == 1;
            int i12 = SwipeDismissBehavior.this.f7447g;
            if (i12 == 0) {
                if (z10) {
                    width = this.f7452a - view.getWidth();
                    width2 = this.f7452a;
                } else {
                    width = this.f7452a;
                    width3 = view.getWidth();
                    width2 = width3 + width;
                }
            } else if (i12 != 1) {
                width = this.f7452a - view.getWidth();
                width2 = view.getWidth() + this.f7452a;
            } else if (z10) {
                width = this.f7452a;
                width3 = view.getWidth();
                width2 = width3 + width;
            } else {
                width = this.f7452a - view.getWidth();
                width2 = this.f7452a;
            }
            return SwipeDismissBehavior.H(width, i10, width2);
        }

        @Override // r0.c.AbstractC0348c
        public int b(View view, int i10, int i11) {
            return view.getTop();
        }

        @Override // r0.c.AbstractC0348c
        public int d(View view) {
            return view.getWidth();
        }

        @Override // r0.c.AbstractC0348c
        public void i(View view, int i10) {
            this.f7453b = i10;
            this.f7452a = view.getLeft();
            ViewParent parent = view.getParent();
            if (parent != null) {
                SwipeDismissBehavior.this.f7444d = true;
                parent.requestDisallowInterceptTouchEvent(true);
                SwipeDismissBehavior.this.f7444d = false;
            }
        }

        @Override // r0.c.AbstractC0348c
        public void j(int i10) {
            c cVar = SwipeDismissBehavior.this.f7442b;
            if (cVar != null) {
                cVar.b(i10);
            }
        }

        @Override // r0.c.AbstractC0348c
        public void k(View view, int i10, int i11, int i12, int i13) {
            float width = view.getWidth() * SwipeDismissBehavior.this.f7449i;
            float width2 = view.getWidth() * SwipeDismissBehavior.this.f7450j;
            float fAbs = Math.abs(i10 - this.f7452a);
            if (fAbs <= width) {
                view.setAlpha(1.0f);
            } else if (fAbs >= width2) {
                view.setAlpha(0.0f);
            } else {
                view.setAlpha(SwipeDismissBehavior.G(0.0f, 1.0f - SwipeDismissBehavior.J(width, width2, fAbs), 1.0f));
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x001d  */
        @Override // r0.c.AbstractC0348c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void l(android.view.View r3, float r4, float r5) {
            /*
                r2 = this;
                r5 = -1
                r2.f7453b = r5
                int r5 = r3.getWidth()
                boolean r0 = r2.n(r3, r4)
                if (r0 == 0) goto L23
                r0 = 0
                int r4 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
                if (r4 < 0) goto L1d
                int r4 = r3.getLeft()
                int r0 = r2.f7452a
                if (r4 >= r0) goto L1b
                goto L1d
            L1b:
                int r0 = r0 + r5
                goto L21
            L1d:
                int r4 = r2.f7452a
                int r0 = r4 - r5
            L21:
                r4 = 1
                goto L26
            L23:
                int r0 = r2.f7452a
                r4 = 0
            L26:
                com.google.android.material.behavior.SwipeDismissBehavior r5 = com.google.android.material.behavior.SwipeDismissBehavior.this
                r0.c r5 = r5.f7441a
                int r1 = r3.getTop()
                boolean r5 = r5.O(r0, r1)
                if (r5 == 0) goto L3f
                com.google.android.material.behavior.SwipeDismissBehavior$d r5 = new com.google.android.material.behavior.SwipeDismissBehavior$d
                com.google.android.material.behavior.SwipeDismissBehavior r0 = com.google.android.material.behavior.SwipeDismissBehavior.this
                r5.<init>(r3, r4)
                r3.postOnAnimation(r5)
                return
            L3f:
                if (r4 == 0) goto L4a
                com.google.android.material.behavior.SwipeDismissBehavior r4 = com.google.android.material.behavior.SwipeDismissBehavior.this
                com.google.android.material.behavior.SwipeDismissBehavior$c r4 = r4.f7442b
                if (r4 == 0) goto L4a
                r4.a(r3)
            L4a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.behavior.SwipeDismissBehavior.a.l(android.view.View, float, float):void");
        }

        @Override // r0.c.AbstractC0348c
        public boolean m(View view, int i10) {
            int i11 = this.f7453b;
            return (i11 == -1 || i11 == i10) && SwipeDismissBehavior.this.F(view);
        }
    }

    class b implements a0 {
        b() {
        }

        @Override // n0.a0
        public boolean a(View view, a0.a aVar) {
            if (!SwipeDismissBehavior.this.F(view)) {
                return false;
            }
            boolean z10 = view.getLayoutDirection() == 1;
            int i10 = SwipeDismissBehavior.this.f7447g;
            o0.W(view, (!(i10 == 0 && z10) && (i10 != 1 || z10)) ? view.getWidth() : -view.getWidth());
            view.setAlpha(0.0f);
            c cVar = SwipeDismissBehavior.this.f7442b;
            if (cVar != null) {
                cVar.a(view);
            }
            return true;
        }
    }

    public interface c {
        void a(View view);

        void b(int i10);
    }

    private class d implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final View f7456a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f7457b;

        d(View view, boolean z10) {
            this.f7456a = view;
            this.f7457b = z10;
        }

        @Override // java.lang.Runnable
        public void run() {
            c cVar;
            r0.c cVar2 = SwipeDismissBehavior.this.f7441a;
            if (cVar2 != null && cVar2.m(true)) {
                this.f7456a.postOnAnimation(this);
            } else {
                if (!this.f7457b || (cVar = SwipeDismissBehavior.this.f7442b) == null) {
                    return;
                }
                cVar.a(this.f7456a);
            }
        }
    }

    static float G(float f10, float f11, float f12) {
        return Math.min(Math.max(f10, f11), f12);
    }

    static int H(int i10, int i11, int i12) {
        return Math.min(Math.max(i10, i11), i12);
    }

    private void I(ViewGroup viewGroup) {
        if (this.f7441a == null) {
            this.f7441a = this.f7446f ? r0.c.n(viewGroup, this.f7445e, this.f7451k) : r0.c.o(viewGroup, this.f7451k);
        }
    }

    static float J(float f10, float f11, float f12) {
        return (f12 - f10) / (f11 - f10);
    }

    private void O(View view) {
        o0.g0(view, 1048576);
        if (F(view)) {
            o0.i0(view, x.a.f22388y, null, new b());
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean D(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        if (this.f7441a == null) {
            return false;
        }
        if (this.f7444d && motionEvent.getActionMasked() == 3) {
            return true;
        }
        this.f7441a.F(motionEvent);
        return true;
    }

    public boolean F(View view) {
        return true;
    }

    public void K(float f10) {
        this.f7450j = G(0.0f, f10, 1.0f);
    }

    public void L(c cVar) {
        this.f7442b = cVar;
    }

    public void M(float f10) {
        this.f7449i = G(0.0f, f10, 1.0f);
    }

    public void N(int i10) {
        this.f7447g = i10;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean k(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        boolean zV = this.f7443c;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            zV = coordinatorLayout.v(view, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.f7443c = zV;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f7443c = false;
        }
        if (zV) {
            I(coordinatorLayout);
            if (!this.f7444d && this.f7441a.P(motionEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean l(CoordinatorLayout coordinatorLayout, View view, int i10) {
        boolean zL = super.l(coordinatorLayout, view, i10);
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
            O(view);
        }
        return zL;
    }
}
