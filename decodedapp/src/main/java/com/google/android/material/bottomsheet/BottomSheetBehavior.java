package com.google.android.material.bottomsheet;

import android.R;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.RoundedCorner;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import androidx.appcompat.widget.RtlSpacingHelper;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.facebook.stetho.server.http.HttpStatus;
import com.facebook.stetho.websocket.CloseCodes;
import com.google.android.material.internal.p;
import com.tencent.mm.opensdk.modelmsg.WXVideoFileObject;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import m0.o0;
import m9.l;
import n0.a0;
import n0.x;
import r0.c;
import u8.j;
import u8.k;

/* JADX INFO: loaded from: classes3.dex */
public class BottomSheetBehavior<V extends View> extends CoordinatorLayout.c {

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    private static final int f7474l0 = k.f28731g;
    private boolean A;
    private final h B;
    private ValueAnimator C;
    int D;
    int E;
    int F;
    float G;
    int H;
    float I;
    boolean J;
    private boolean K;
    private boolean L;
    private boolean M;
    private boolean N;
    int O;
    int P;
    r0.c Q;
    private boolean R;
    private int S;
    private boolean T;
    private float U;
    private int V;
    int W;
    int X;
    WeakReference Y;
    WeakReference Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f7475a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    WeakReference f7476a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f7477b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    WeakReference f7478b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f7479c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private final ArrayList f7480c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f7481d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private VelocityTracker f7482d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f7483e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    h9.b f7484e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f7485f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    int f7486f0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f7487g;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    private int f7488g0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f7489h;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    boolean f7490h0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f7491i;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    private Map f7492i0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private m9.h f7493j;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    final SparseIntArray f7494j0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private ColorStateList f7495k;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    private final c.AbstractC0348c f7496k0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f7497l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f7498m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f7499n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f7500o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f7501p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f7502q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f7503r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f7504s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f7505t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f7506u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f7507v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f7508w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private int f7509x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private boolean f7510y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private l f7511z;

    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f7512a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f7513b;

        a(View view, int i10) {
            this.f7512a = view;
            this.f7513b = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            BottomSheetBehavior.this.a1(this.f7512a, this.f7513b, false);
        }
    }

    class b implements ValueAnimator.AnimatorUpdateListener {
        b() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            if (BottomSheetBehavior.this.f7493j != null) {
                BottomSheetBehavior.this.f7493j.d0(fFloatValue);
            }
        }
    }

    class c implements p.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f7516a;

        c(boolean z10) {
            this.f7516a = z10;
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x0080  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x00a3  */
        @Override // com.google.android.material.internal.p.c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public m0.i1 a(android.view.View r11, m0.i1 r12, com.google.android.material.internal.p.d r13) {
            /*
                Method dump skipped, instruction units count: 207
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.c.a(android.view.View, m0.i1, com.google.android.material.internal.p$d):m0.i1");
        }
    }

    class d extends c.AbstractC0348c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private long f7518a;

        d() {
        }

        private boolean n(View view) {
            int top = view.getTop();
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            return top > (bottomSheetBehavior.X + bottomSheetBehavior.o0()) / 2;
        }

        @Override // r0.c.AbstractC0348c
        public int a(View view, int i10, int i11) {
            return view.getLeft();
        }

        @Override // r0.c.AbstractC0348c
        public int b(View view, int i10, int i11) {
            return h0.a.b(i10, BottomSheetBehavior.this.o0(), e(view));
        }

        @Override // r0.c.AbstractC0348c
        public int e(View view) {
            return BottomSheetBehavior.this.f0() ? BottomSheetBehavior.this.X : BottomSheetBehavior.this.H;
        }

        @Override // r0.c.AbstractC0348c
        public void j(int i10) {
            if (i10 == 1 && BottomSheetBehavior.this.L) {
                BottomSheetBehavior.this.T0(1);
            }
        }

        @Override // r0.c.AbstractC0348c
        public void k(View view, int i10, int i11, int i12, int i13) {
            BottomSheetBehavior.this.k0(i11);
        }

        /* JADX WARN: Removed duplicated region for block: B:39:0x00ae  */
        /* JADX WARN: Removed duplicated region for block: B:6:0x0010  */
        @Override // r0.c.AbstractC0348c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void l(android.view.View r8, float r9, float r10) {
            /*
                Method dump skipped, instruction units count: 309
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.d.l(android.view.View, float, float):void");
        }

        @Override // r0.c.AbstractC0348c
        public boolean m(View view, int i10) {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            int i11 = bottomSheetBehavior.O;
            if (i11 == 1 || bottomSheetBehavior.f7490h0) {
                return false;
            }
            if (i11 == 3 && bottomSheetBehavior.f7486f0 == i10) {
                WeakReference weakReference = bottomSheetBehavior.f7478b0;
                View view2 = weakReference != null ? (View) weakReference.get() : null;
                if (view2 != null && view2.canScrollVertically(-1)) {
                    return false;
                }
            }
            this.f7518a = SystemClock.uptimeMillis();
            WeakReference weakReference2 = BottomSheetBehavior.this.Y;
            return weakReference2 != null && weakReference2.get() == view;
        }
    }

    class e implements a0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f7520a;

        e(int i10) {
            this.f7520a = i10;
        }

        @Override // n0.a0
        public boolean a(View view, a0.a aVar) {
            BottomSheetBehavior.this.S0(this.f7520a);
            return true;
        }
    }

    public static abstract class f {
        void a(View view) {
        }

        public abstract void b(View view, float f10);

        public abstract void c(View view, int i10);
    }

    public BottomSheetBehavior() {
        this.f7475a = 0;
        this.f7477b = true;
        this.f7479c = false;
        this.f7497l = -1;
        this.f7498m = -1;
        this.B = new h(this, null);
        this.G = 0.5f;
        this.I = -1.0f;
        this.L = true;
        this.M = true;
        this.O = 4;
        this.P = 4;
        this.U = 0.1f;
        this.f7480c0 = new ArrayList();
        this.f7488g0 = -1;
        this.f7494j0 = new SparseIntArray();
        this.f7496k0 = new d();
    }

    private void A0(View view, x.a aVar, int i10) {
        o0.i0(view, aVar, null, h0(i10));
    }

    private void B0() {
        this.f7486f0 = -1;
        this.f7488g0 = -1;
        VelocityTracker velocityTracker = this.f7482d0;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f7482d0 = null;
        }
    }

    private void C0(g gVar) {
        int i10 = this.f7475a;
        if (i10 == 0) {
            return;
        }
        if (i10 == -1 || (i10 & 1) == 1) {
            this.f7485f = gVar.f7523b;
        }
        if (i10 == -1 || (i10 & 2) == 2) {
            this.f7477b = gVar.f7524c;
        }
        if (i10 == -1 || (i10 & 4) == 4) {
            this.J = gVar.f7525d;
        }
        if (i10 == -1 || (i10 & 8) == 8) {
            this.K = gVar.f7526e;
        }
    }

    private void D0(View view, Runnable runnable) {
        if (w0(view)) {
            view.post(runnable);
        } else {
            runnable.run();
        }
    }

    private void U0(View view) {
        boolean z10 = (Build.VERSION.SDK_INT < 29 || t0() || this.f7487g) ? false : true;
        if (this.f7501p || this.f7502q || this.f7503r || this.f7505t || this.f7506u || this.f7507v || z10) {
            p.b(view, new c(z10));
        }
    }

    private boolean W0() {
        if (this.Q != null) {
            return this.L || this.O == 1;
        }
        return false;
    }

    private int X(View view, int i10, int i11) {
        return o0.c(view, view.getResources().getString(i10), h0(i11));
    }

    private void Z() {
        int iD0 = d0();
        if (this.f7477b) {
            this.H = Math.max(this.X - iD0, this.E);
        } else {
            this.H = this.X - iD0;
        }
    }

    private float a0(float f10, RoundedCorner roundedCorner) {
        if (roundedCorner != null) {
            float radius = roundedCorner.getRadius();
            if (radius > 0.0f && f10 > 0.0f) {
                return radius / f10;
            }
        }
        return 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a1(View view, int i10, boolean z10) {
        int iP0 = p0(i10);
        r0.c cVar = this.Q;
        if (cVar == null || (!z10 ? cVar.Q(view, view.getLeft(), iP0) : cVar.O(view.getLeft(), iP0))) {
            T0(i10);
            return;
        }
        T0(2);
        d1(i10, true);
        this.B.c(i10);
    }

    private void b0() {
        this.F = (int) (this.X * (1.0f - this.G));
    }

    private void b1() {
        WeakReference weakReference = this.Y;
        if (weakReference != null) {
            c1((View) weakReference.get(), 0);
        }
        WeakReference weakReference2 = this.Z;
        if (weakReference2 != null) {
            c1((View) weakReference2.get(), 1);
        }
    }

    private float c0() {
        WeakReference weakReference;
        WindowInsets rootWindowInsets;
        if (this.f7493j == null || (weakReference = this.Y) == null || weakReference.get() == null || Build.VERSION.SDK_INT < 31) {
            return 0.0f;
        }
        View view = (View) this.Y.get();
        if (!r0() || (rootWindowInsets = view.getRootWindowInsets()) == null) {
            return 0.0f;
        }
        return Math.max(a0(this.f7493j.J(), rootWindowInsets.getRoundedCorner(0)), a0(this.f7493j.K(), rootWindowInsets.getRoundedCorner(1)));
    }

    private void c1(View view, int i10) {
        if (view == null) {
            return;
        }
        g0(view, i10);
        if (!this.f7477b && this.O != 6) {
            this.f7494j0.put(i10, X(view, j.f28699a, 6));
        }
        if (this.J && v0() && this.O != 5) {
            A0(view, x.a.f22388y, 5);
        }
        int i11 = this.O;
        if (i11 == 3) {
            A0(view, x.a.f22387x, this.f7477b ? 4 : 6);
            return;
        }
        if (i11 == 4) {
            A0(view, x.a.f22386w, this.f7477b ? 3 : 6);
        } else {
            if (i11 != 6) {
                return;
            }
            A0(view, x.a.f22387x, 4);
            A0(view, x.a.f22386w, 3);
        }
    }

    private int d0() {
        int i10;
        return this.f7487g ? Math.min(Math.max(this.f7489h, this.X - ((this.W * 9) / 16)), this.V) + this.f7508w : (this.f7500o || this.f7501p || (i10 = this.f7499n) <= 0) ? this.f7485f + this.f7508w : Math.max(this.f7485f, i10 + this.f7491i);
    }

    private void d1(int i10, boolean z10) {
        boolean zS0;
        ValueAnimator valueAnimator;
        if (i10 == 2 || this.A == (zS0 = s0()) || this.f7493j == null) {
            return;
        }
        this.A = zS0;
        if (!z10 || (valueAnimator = this.C) == null) {
            ValueAnimator valueAnimator2 = this.C;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.C.cancel();
            }
            this.f7493j.d0(this.A ? c0() : 1.0f);
            return;
        }
        if (valueAnimator.isRunning()) {
            this.C.reverse();
        } else {
            this.C.setFloatValues(this.f7493j.C(), zS0 ? c0() : 1.0f);
            this.C.start();
        }
    }

    private float e0(int i10) {
        float f10;
        float fO0;
        int i11 = this.H;
        if (i10 > i11 || i11 == o0()) {
            int i12 = this.H;
            f10 = i12 - i10;
            fO0 = this.X - i12;
        } else {
            int i13 = this.H;
            f10 = i13 - i10;
            fO0 = i13 - o0();
        }
        return f10 / fO0;
    }

    private void e1(boolean z10) {
        Map map;
        WeakReference weakReference = this.Y;
        if (weakReference == null) {
            return;
        }
        ViewParent parent = ((View) weakReference.get()).getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z10) {
                if (this.f7492i0 != null) {
                    return;
                } else {
                    this.f7492i0 = new HashMap(childCount);
                }
            }
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = coordinatorLayout.getChildAt(i10);
                if (childAt != this.Y.get()) {
                    if (z10) {
                        this.f7492i0.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                        if (this.f7479c) {
                            childAt.setImportantForAccessibility(4);
                        }
                    } else if (this.f7479c && (map = this.f7492i0) != null && map.containsKey(childAt)) {
                        childAt.setImportantForAccessibility(((Integer) this.f7492i0.get(childAt)).intValue());
                    }
                }
            }
            if (!z10) {
                this.f7492i0 = null;
            } else if (this.f7479c) {
                ((View) this.Y.get()).sendAccessibilityEvent(8);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean f0() {
        return u0() && v0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f1(boolean z10) {
        View view;
        if (this.Y != null) {
            Z();
            if (this.O != 4 || (view = (View) this.Y.get()) == null) {
                return;
            }
            if (z10) {
                S0(4);
            } else {
                view.requestLayout();
            }
        }
    }

    private void g0(View view, int i10) {
        if (view == null) {
            return;
        }
        o0.g0(view, 524288);
        o0.g0(view, 262144);
        o0.g0(view, 1048576);
        int i11 = this.f7494j0.get(i10, -1);
        if (i11 != -1) {
            o0.g0(view, i11);
            this.f7494j0.delete(i10);
        }
    }

    private a0 h0(int i10) {
        return new e(i10);
    }

    private void i0(Context context) {
        if (this.f7511z == null) {
            return;
        }
        m9.h hVar = new m9.h(this.f7511z);
        this.f7493j = hVar;
        hVar.Q(context);
        ColorStateList colorStateList = this.f7495k;
        if (colorStateList != null) {
            this.f7493j.c0(colorStateList);
            return;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.colorBackground, typedValue, true);
        this.f7493j.setTint(typedValue.data);
    }

    private void j0() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(c0(), 1.0f);
        this.C = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(500L);
        this.C.addUpdateListener(new b());
    }

    public static BottomSheetBehavior m0(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof CoordinatorLayout.f)) {
            throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
        }
        CoordinatorLayout.c cVarF = ((CoordinatorLayout.f) layoutParams).f();
        if (cVarF instanceof BottomSheetBehavior) {
            return (BottomSheetBehavior) cVarF;
        }
        throw new IllegalArgumentException("The view is not associated with BottomSheetBehavior");
    }

    private int n0(int i10, int i11, int i12, int i13) {
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i10, i11, i13);
        if (i12 == -1) {
            return childMeasureSpec;
        }
        int mode = View.MeasureSpec.getMode(childMeasureSpec);
        int size = View.MeasureSpec.getSize(childMeasureSpec);
        if (mode == 1073741824) {
            return View.MeasureSpec.makeMeasureSpec(Math.min(size, i12), WXVideoFileObject.FILE_SIZE_LIMIT);
        }
        if (size != 0) {
            i12 = Math.min(size, i12);
        }
        return View.MeasureSpec.makeMeasureSpec(i12, RtlSpacingHelper.UNDEFINED);
    }

    private int p0(int i10) {
        if (i10 == 3) {
            return o0();
        }
        if (i10 == 4) {
            return this.H;
        }
        if (i10 == 5) {
            return this.X;
        }
        if (i10 == 6) {
            return this.F;
        }
        throw new IllegalArgumentException("Invalid state to get top offset: " + i10);
    }

    private float q0() {
        VelocityTracker velocityTracker = this.f7482d0;
        if (velocityTracker == null) {
            return 0.0f;
        }
        velocityTracker.computeCurrentVelocity(CloseCodes.NORMAL_CLOSURE, this.f7481d);
        return this.f7482d0.getYVelocity(this.f7486f0);
    }

    private boolean r0() {
        WeakReference weakReference = this.Y;
        if (weakReference != null && weakReference.get() != null) {
            int[] iArr = new int[2];
            ((View) this.Y.get()).getLocationOnScreen(iArr);
            if (iArr[1] == 0) {
                return true;
            }
        }
        return false;
    }

    private boolean s0() {
        if (this.O == 3) {
            return this.f7510y || r0();
        }
        return false;
    }

    private boolean w0(View view) {
        ViewParent parent = view.getParent();
        return parent != null && parent.isLayoutRequested() && view.isAttachedToWindow();
    }

    private boolean y0(CoordinatorLayout coordinatorLayout, int i10, int i11) {
        WeakReference weakReference = this.f7476a0;
        View view = weakReference != null ? (View) weakReference.get() : null;
        return view != null && coordinatorLayout.v(view, i10, i11);
    }

    private boolean z0(CoordinatorLayout coordinatorLayout, int i10, int i11) {
        WeakReference weakReference = this.f7478b0;
        View view = weakReference != null ? (View) weakReference.get() : null;
        return view != null && coordinatorLayout.v(view, i10, i11);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean A(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i10, int i11) {
        this.S = 0;
        this.T = false;
        return (i10 & 2) != 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00a9  */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void C(androidx.coordinatorlayout.widget.CoordinatorLayout r3, android.view.View r4, android.view.View r5, int r6) {
        /*
            r2 = this;
            int r3 = r4.getTop()
            int r6 = r2.o0()
            r0 = 3
            if (r3 != r6) goto Lf
            r2.T0(r0)
            return
        Lf:
            boolean r3 = r2.x0()
            if (r3 == 0) goto L24
            java.lang.ref.WeakReference r3 = r2.f7478b0
            if (r3 == 0) goto L23
            java.lang.Object r3 = r3.get()
            if (r5 != r3) goto L23
            boolean r3 = r2.T
            if (r3 != 0) goto L24
        L23:
            return
        L24:
            int r3 = r2.S
            r5 = 6
            if (r3 <= 0) goto L39
            boolean r3 = r2.f7477b
            if (r3 == 0) goto L2f
            goto Laa
        L2f:
            int r3 = r4.getTop()
            int r6 = r2.F
            if (r3 <= r6) goto Laa
            goto La9
        L39:
            boolean r3 = r2.J
            if (r3 == 0) goto L49
            float r3 = r2.q0()
            boolean r3 = r2.X0(r4, r3)
            if (r3 == 0) goto L49
            r0 = 5
            goto Laa
        L49:
            int r3 = r2.S
            r6 = 4
            if (r3 != 0) goto L8e
            int r3 = r4.getTop()
            boolean r1 = r2.f7477b
            if (r1 == 0) goto L68
            int r5 = r2.E
            int r5 = r3 - r5
            int r5 = java.lang.Math.abs(r5)
            int r1 = r2.H
            int r3 = r3 - r1
            int r3 = java.lang.Math.abs(r3)
            if (r5 >= r3) goto L92
            goto Laa
        L68:
            int r1 = r2.F
            if (r3 >= r1) goto L7e
            int r1 = r2.H
            int r1 = r3 - r1
            int r1 = java.lang.Math.abs(r1)
            if (r3 >= r1) goto L77
            goto Laa
        L77:
            boolean r3 = r2.Y0()
            if (r3 == 0) goto La9
            goto L92
        L7e:
            int r0 = r3 - r1
            int r0 = java.lang.Math.abs(r0)
            int r1 = r2.H
            int r3 = r3 - r1
            int r3 = java.lang.Math.abs(r3)
            if (r0 >= r3) goto L92
            goto La9
        L8e:
            boolean r3 = r2.f7477b
            if (r3 == 0) goto L94
        L92:
            r0 = 4
            goto Laa
        L94:
            int r3 = r4.getTop()
            int r0 = r2.F
            int r0 = r3 - r0
            int r0 = java.lang.Math.abs(r0)
            int r1 = r2.H
            int r3 = r3 - r1
            int r3 = java.lang.Math.abs(r3)
            if (r0 >= r3) goto L92
        La9:
            r0 = 6
        Laa:
            r3 = 0
            r2.a1(r4, r0, r3)
            r2.T = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.C(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.View, int):void");
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean D(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.O == 1 && actionMasked == 0) {
            return true;
        }
        if (W0()) {
            this.Q.F(motionEvent);
        }
        if (actionMasked == 0) {
            B0();
        }
        if (this.f7482d0 == null) {
            this.f7482d0 = VelocityTracker.obtain();
        }
        this.f7482d0.addMovement(motionEvent);
        if (W0() && actionMasked == 2 && !this.R && Math.abs(this.f7488g0 - motionEvent.getY()) > this.Q.z()) {
            this.Q.b(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
        }
        return !this.R;
    }

    public void E0(boolean z10) {
        this.L = z10;
    }

    public void F0(boolean z10) {
        this.M = z10;
    }

    public void G0(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("offset must be greater than or equal to 0");
        }
        this.D = i10;
        d1(this.O, true);
    }

    public void H0(boolean z10) {
        if (this.f7477b == z10) {
            return;
        }
        this.f7477b = z10;
        if (this.Y != null) {
            Z();
        }
        T0((this.f7477b && this.O == 6) ? 3 : this.O);
        d1(this.O, true);
        b1();
    }

    public void I0(boolean z10) {
        this.f7500o = z10;
    }

    public void J0(float f10) {
        if (f10 <= 0.0f || f10 >= 1.0f) {
            throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
        }
        this.G = f10;
        if (this.Y != null) {
            b0();
        }
    }

    public void K0(boolean z10) {
        if (this.J != z10) {
            this.J = z10;
            if (!z10 && this.O == 5) {
                S0(4);
            }
            b1();
        }
    }

    public void L0(int i10) {
        this.f7498m = i10;
    }

    public void M0(int i10) {
        this.f7497l = i10;
    }

    public void N0(int i10) {
        O0(i10, false);
    }

    public final void O0(int i10, boolean z10) {
        if (i10 == -1) {
            if (this.f7487g) {
                return;
            } else {
                this.f7487g = true;
            }
        } else {
            if (!this.f7487g && this.f7485f == i10) {
                return;
            }
            this.f7487g = false;
            this.f7485f = Math.max(0, i10);
        }
        f1(z10);
    }

    public void P0(int i10) {
        this.f7475a = i10;
    }

    public void Q0(int i10) {
        this.f7483e = i10;
    }

    public void R0(boolean z10) {
        this.K = z10;
    }

    public void S0(int i10) {
        if (i10 == 1 || i10 == 2) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("STATE_");
            sb2.append(i10 == 1 ? "DRAGGING" : "SETTLING");
            sb2.append(" should not be set externally.");
            throw new IllegalArgumentException(sb2.toString());
        }
        if (!this.J && i10 == 5) {
            Log.w("BottomSheetBehavior", "Cannot set state: " + i10);
            return;
        }
        int i11 = (i10 == 6 && this.f7477b && p0(i10) <= this.E) ? 3 : i10;
        WeakReference weakReference = this.Y;
        if (weakReference == null || weakReference.get() == null) {
            T0(i10);
        } else {
            View view = (View) this.Y.get();
            D0(view, new a(view, i11));
        }
    }

    void T0(int i10) {
        View view;
        if (this.O == i10) {
            return;
        }
        this.O = i10;
        if (i10 == 4 || i10 == 3 || i10 == 6 || (this.J && i10 == 5)) {
            this.P = i10;
        }
        WeakReference weakReference = this.Y;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        if (i10 == 3) {
            e1(true);
        } else if (i10 == 6 || i10 == 5 || i10 == 4) {
            e1(false);
        }
        d1(i10, true);
        for (int i11 = 0; i11 < this.f7480c0.size(); i11++) {
            ((f) this.f7480c0.get(i11)).c(view, i10);
        }
        b1();
    }

    public boolean V0(long j10, float f10) {
        return false;
    }

    boolean X0(View view, float f10) {
        if (this.K) {
            return true;
        }
        if (v0() && view.getTop() >= this.H) {
            return Math.abs((((float) view.getTop()) + (f10 * this.U)) - ((float) this.H)) / ((float) d0()) > 0.5f;
        }
        return false;
    }

    public void Y(f fVar) {
        if (this.f7480c0.contains(fVar)) {
            return;
        }
        this.f7480c0.add(fVar);
    }

    public boolean Y0() {
        return false;
    }

    public boolean Z0() {
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void g(CoordinatorLayout.f fVar) {
        super.g(fVar);
        this.Y = null;
        this.Q = null;
        this.f7484e0 = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void j() {
        super.j();
        this.Y = null;
        this.Q = null;
        this.f7484e0 = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean k(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        int i10;
        r0.c cVar;
        if (!view.isShown() || !this.L) {
            this.R = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            B0();
        }
        if (this.f7482d0 == null) {
            this.f7482d0 = VelocityTracker.obtain();
        }
        this.f7482d0.addMovement(motionEvent);
        if (actionMasked == 0) {
            int x10 = (int) motionEvent.getX();
            int y10 = (int) motionEvent.getY();
            this.f7488g0 = y10;
            if (this.O != 2 && z0(coordinatorLayout, x10, y10)) {
                this.f7486f0 = motionEvent.getPointerId(motionEvent.getActionIndex());
                if (!y0(coordinatorLayout, x10, this.f7488g0)) {
                    this.f7490h0 = true;
                }
            }
            this.R = this.f7486f0 == -1 && !coordinatorLayout.v(view, x10, this.f7488g0);
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f7490h0 = false;
            this.f7486f0 = -1;
            if (this.R) {
                this.R = false;
                return false;
            }
        }
        if (!this.R && (cVar = this.Q) != null && cVar.P(motionEvent)) {
            return true;
        }
        WeakReference weakReference = this.f7478b0;
        View view2 = weakReference != null ? (View) weakReference.get() : null;
        return (actionMasked != 2 || view2 == null || this.R || this.O == 1 || coordinatorLayout.v(view2, (int) motionEvent.getX(), (int) motionEvent.getY()) || this.Q == null || (i10 = this.f7488g0) == -1 || Math.abs(((float) i10) - motionEvent.getY()) <= ((float) this.Q.z())) ? false : true;
    }

    void k0(int i10) {
        View view = (View) this.Y.get();
        if (view == null || this.f7480c0.isEmpty()) {
            return;
        }
        float fE0 = e0(i10);
        for (int i11 = 0; i11 < this.f7480c0.size(); i11++) {
            ((f) this.f7480c0.get(i11)).b(view, fE0);
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean l(CoordinatorLayout coordinatorLayout, View view, int i10) {
        if (coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
            view.setFitsSystemWindows(true);
        }
        if (this.Y == null) {
            this.f7489h = coordinatorLayout.getResources().getDimensionPixelSize(u8.d.f28597i);
            U0(view);
            o0.F0(view, new com.google.android.material.bottomsheet.a(view));
            this.Y = new WeakReference(view);
            this.f7484e0 = new h9.b(view);
            m9.h hVar = this.f7493j;
            if (hVar != null) {
                view.setBackground(hVar);
                m9.h hVar2 = this.f7493j;
                float elevation = this.I;
                if (elevation == -1.0f) {
                    elevation = view.getElevation();
                }
                hVar2.b0(elevation);
            } else {
                ColorStateList colorStateList = this.f7495k;
                if (colorStateList != null) {
                    o0.r0(view, colorStateList);
                }
            }
            b1();
            if (view.getImportantForAccessibility() == 0) {
                view.setImportantForAccessibility(1);
            }
        }
        if (this.Q == null) {
            this.Q = r0.c.o(coordinatorLayout, this.f7496k0);
        }
        int top = view.getTop();
        coordinatorLayout.C(view, i10);
        this.W = coordinatorLayout.getWidth();
        this.X = coordinatorLayout.getHeight();
        int height = view.getHeight();
        this.V = height;
        int iMin = this.X;
        int i11 = iMin - height;
        int i12 = this.f7509x;
        if (i11 < i12) {
            if (this.f7504s) {
                int i13 = this.f7498m;
                if (i13 != -1) {
                    iMin = Math.min(iMin, i13);
                }
                this.V = iMin;
            } else {
                int iMin2 = iMin - i12;
                int i14 = this.f7498m;
                if (i14 != -1) {
                    iMin2 = Math.min(iMin2, i14);
                }
                this.V = iMin2;
            }
        }
        this.E = Math.max(0, this.X - this.V);
        b0();
        Z();
        int i15 = this.O;
        if (i15 == 3) {
            o0.X(view, o0());
        } else if (i15 == 6) {
            o0.X(view, this.F);
        } else if (this.J && i15 == 5) {
            o0.X(view, this.X);
        } else if (i15 == 4) {
            o0.X(view, this.H);
        } else if (i15 == 1 || i15 == 2) {
            o0.X(view, top - view.getTop());
        }
        d1(this.O, false);
        this.f7478b0 = new WeakReference(l0(view));
        for (int i16 = 0; i16 < this.f7480c0.size(); i16++) {
            ((f) this.f7480c0.get(i16)).a(view);
        }
        return true;
    }

    View l0(View view) {
        if (view.getVisibility() != 0) {
            return null;
        }
        if (view.isNestedScrollingEnabled()) {
            return view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View viewL0 = l0(viewGroup.getChildAt(i10));
                if (viewL0 != null) {
                    return viewL0;
                }
            }
        }
        return null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean m(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12, int i13) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(n0(i10, coordinatorLayout.getPaddingLeft() + coordinatorLayout.getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i11, this.f7497l, marginLayoutParams.width), n0(i12, coordinatorLayout.getPaddingTop() + coordinatorLayout.getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i13, this.f7498m, marginLayoutParams.height));
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean o(CoordinatorLayout coordinatorLayout, View view, View view2, float f10, float f11) {
        WeakReference weakReference;
        return x0() && (weakReference = this.f7478b0) != null && view2 == weakReference.get() && (!(this.O == 3 || this.N) || super.o(coordinatorLayout, view, view2, f10, f11));
    }

    public int o0() {
        if (this.f7477b) {
            return this.E;
        }
        return Math.max(this.D, this.f7504s ? 0 : this.f7509x);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void q(CoordinatorLayout coordinatorLayout, View view, View view2, int i10, int i11, int[] iArr, int i12) {
        if (i12 == 1) {
            return;
        }
        WeakReference weakReference = this.f7478b0;
        View view3 = weakReference != null ? (View) weakReference.get() : null;
        if (!x0() || view2 == view3) {
            int top = view.getTop();
            int i13 = top - i11;
            if (i11 > 0) {
                if (!this.T && !this.M && view2 == view3 && view2.canScrollVertically(1)) {
                    this.N = true;
                    return;
                }
                if (i13 < o0()) {
                    int iO0 = top - o0();
                    iArr[1] = iO0;
                    o0.X(view, -iO0);
                    T0(3);
                } else {
                    if (!this.L) {
                        return;
                    }
                    iArr[1] = i11;
                    o0.X(view, -i11);
                    T0(1);
                }
            } else if (i11 < 0) {
                boolean zCanScrollVertically = view2.canScrollVertically(-1);
                if (!this.T && !this.M && view2 == view3 && zCanScrollVertically) {
                    this.N = true;
                    return;
                }
                if (!zCanScrollVertically) {
                    if (i13 > this.H && !f0()) {
                        int i14 = top - this.H;
                        iArr[1] = i14;
                        o0.X(view, -i14);
                        T0(4);
                    } else {
                        if (!this.L) {
                            return;
                        }
                        iArr[1] = i11;
                        o0.X(view, -i11);
                        T0(1);
                    }
                }
            }
            k0(view.getTop());
            this.S = i11;
            this.T = true;
            this.N = false;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void t(CoordinatorLayout coordinatorLayout, View view, View view2, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
    }

    public boolean t0() {
        return this.f7500o;
    }

    public boolean u0() {
        return this.J;
    }

    public boolean v0() {
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void x(CoordinatorLayout coordinatorLayout, View view, Parcelable parcelable) {
        g gVar = (g) parcelable;
        super.x(coordinatorLayout, view, gVar.getSuperState());
        C0(gVar);
        int i10 = gVar.f7522a;
        if (i10 == 1 || i10 == 2) {
            this.O = 4;
            this.P = 4;
        } else {
            this.O = i10;
            this.P = i10;
        }
    }

    public boolean x0() {
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public Parcelable y(CoordinatorLayout coordinatorLayout, View view) {
        return new g(super.y(coordinatorLayout, view), this);
    }

    private class h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f7527a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f7528b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Runnable f7529c;

        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                h.this.f7528b = false;
                r0.c cVar = BottomSheetBehavior.this.Q;
                if (cVar != null && cVar.m(true)) {
                    h hVar = h.this;
                    hVar.c(hVar.f7527a);
                    return;
                }
                h hVar2 = h.this;
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                if (bottomSheetBehavior.O == 2) {
                    bottomSheetBehavior.T0(hVar2.f7527a);
                }
            }
        }

        private h() {
            this.f7529c = new a();
        }

        void c(int i10) {
            WeakReference weakReference = BottomSheetBehavior.this.Y;
            if (weakReference == null || weakReference.get() == null) {
                return;
            }
            this.f7527a = i10;
            if (this.f7528b) {
                return;
            }
            ((View) BottomSheetBehavior.this.Y.get()).postOnAnimation(this.f7529c);
            this.f7528b = true;
        }

        /* synthetic */ h(BottomSheetBehavior bottomSheetBehavior, a aVar) {
            this();
        }
    }

    protected static class g extends q0.a {
        public static final Parcelable.Creator<g> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final int f7522a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f7523b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        boolean f7524c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        boolean f7525d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        boolean f7526e;

        class a implements Parcelable.ClassLoaderCreator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public g createFromParcel(Parcel parcel) {
                return new g(parcel, (ClassLoader) null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public g createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new g(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public g[] newArray(int i10) {
                return new g[i10];
            }
        }

        public g(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f7522a = parcel.readInt();
            this.f7523b = parcel.readInt();
            this.f7524c = parcel.readInt() == 1;
            this.f7525d = parcel.readInt() == 1;
            this.f7526e = parcel.readInt() == 1;
        }

        @Override // q0.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f7522a);
            parcel.writeInt(this.f7523b);
            parcel.writeInt(this.f7524c ? 1 : 0);
            parcel.writeInt(this.f7525d ? 1 : 0);
            parcel.writeInt(this.f7526e ? 1 : 0);
        }

        public g(Parcelable parcelable, BottomSheetBehavior bottomSheetBehavior) {
            super(parcelable);
            this.f7522a = bottomSheetBehavior.O;
            this.f7523b = bottomSheetBehavior.f7485f;
            this.f7524c = bottomSheetBehavior.f7477b;
            this.f7525d = bottomSheetBehavior.J;
            this.f7526e = bottomSheetBehavior.K;
        }
    }

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        int i10;
        super(context, attributeSet);
        this.f7475a = 0;
        this.f7477b = true;
        this.f7479c = false;
        this.f7497l = -1;
        this.f7498m = -1;
        this.B = new h(this, null);
        this.G = 0.5f;
        this.I = -1.0f;
        this.L = true;
        this.M = true;
        this.O = 4;
        this.P = 4;
        this.U = 0.1f;
        this.f7480c0 = new ArrayList();
        this.f7488g0 = -1;
        this.f7494j0 = new SparseIntArray();
        this.f7496k0 = new d();
        this.f7491i = context.getResources().getDimensionPixelSize(u8.d.f28612p0);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, u8.l.X);
        int i11 = u8.l.f28762b0;
        if (typedArrayObtainStyledAttributes.hasValue(i11)) {
            this.f7495k = j9.c.a(context, typedArrayObtainStyledAttributes, i11);
        }
        if (typedArrayObtainStyledAttributes.hasValue(u8.l.f28933u0)) {
            this.f7511z = l.e(context, attributeSet, u8.b.f28548d, f7474l0).m();
        }
        i0(context);
        j0();
        this.I = typedArrayObtainStyledAttributes.getDimension(u8.l.f28752a0, -1.0f);
        int i12 = u8.l.Y;
        if (typedArrayObtainStyledAttributes.hasValue(i12)) {
            M0(typedArrayObtainStyledAttributes.getDimensionPixelSize(i12, -1));
        }
        int i13 = u8.l.Z;
        if (typedArrayObtainStyledAttributes.hasValue(i13)) {
            L0(typedArrayObtainStyledAttributes.getDimensionPixelSize(i13, -1));
        }
        int i14 = u8.l.f28825i0;
        TypedValue typedValuePeekValue = typedArrayObtainStyledAttributes.peekValue(i14);
        if (typedValuePeekValue != null && (i10 = typedValuePeekValue.data) == -1) {
            N0(i10);
        } else {
            N0(typedArrayObtainStyledAttributes.getDimensionPixelSize(i14, -1));
        }
        K0(typedArrayObtainStyledAttributes.getBoolean(u8.l.f28816h0, false));
        I0(typedArrayObtainStyledAttributes.getBoolean(u8.l.f28861m0, false));
        H0(typedArrayObtainStyledAttributes.getBoolean(u8.l.f28798f0, true));
        R0(typedArrayObtainStyledAttributes.getBoolean(u8.l.f28852l0, false));
        E0(typedArrayObtainStyledAttributes.getBoolean(u8.l.f28771c0, true));
        F0(typedArrayObtainStyledAttributes.getBoolean(u8.l.f28780d0, true));
        P0(typedArrayObtainStyledAttributes.getInt(u8.l.f28834j0, 0));
        J0(typedArrayObtainStyledAttributes.getFloat(u8.l.f28807g0, 0.5f));
        int i15 = u8.l.f28789e0;
        TypedValue typedValuePeekValue2 = typedArrayObtainStyledAttributes.peekValue(i15);
        if (typedValuePeekValue2 != null && typedValuePeekValue2.type == 16) {
            G0(typedValuePeekValue2.data);
        } else {
            G0(typedArrayObtainStyledAttributes.getDimensionPixelOffset(i15, 0));
        }
        Q0(typedArrayObtainStyledAttributes.getInt(u8.l.f28843k0, HttpStatus.HTTP_INTERNAL_SERVER_ERROR));
        this.f7501p = typedArrayObtainStyledAttributes.getBoolean(u8.l.f28897q0, false);
        this.f7502q = typedArrayObtainStyledAttributes.getBoolean(u8.l.f28906r0, false);
        this.f7503r = typedArrayObtainStyledAttributes.getBoolean(u8.l.f28915s0, false);
        this.f7504s = typedArrayObtainStyledAttributes.getBoolean(u8.l.f28924t0, true);
        this.f7505t = typedArrayObtainStyledAttributes.getBoolean(u8.l.f28870n0, false);
        this.f7506u = typedArrayObtainStyledAttributes.getBoolean(u8.l.f28879o0, false);
        this.f7507v = typedArrayObtainStyledAttributes.getBoolean(u8.l.f28888p0, false);
        this.f7510y = typedArrayObtainStyledAttributes.getBoolean(u8.l.f28942v0, true);
        typedArrayObtainStyledAttributes.recycle();
        this.f7481d = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }
}
