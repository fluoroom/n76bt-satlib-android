package com.google.android.material.sidesheet;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.widget.RtlSpacingHelper;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.facebook.stetho.server.http.HttpStatus;
import com.google.android.material.sidesheet.SideSheetBehavior;
import com.tencent.mm.opensdk.modelmsg.WXVideoFileObject;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import m0.o0;
import m9.h;
import m9.l;
import n0.a0;
import n0.x;
import r0.c;
import u8.j;
import u8.k;

/* JADX INFO: loaded from: classes3.dex */
public class SideSheetBehavior<V extends View> extends CoordinatorLayout.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.google.android.material.sidesheet.c f8141a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f8142b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private h f8143c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ColorStateList f8144d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private l f8145e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final c f8146f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float f8147g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f8148h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f8149i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f8150j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private r0.c f8151k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f8152l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private float f8153m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f8154n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f8155o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f8156p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f8157q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private WeakReference f8158r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private WeakReference f8159s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f8160t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private VelocityTracker f8161u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private h9.c f8162v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f8163w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final Set f8164x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final c.AbstractC0348c f8165y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final int f8140z = j.D;
    private static final int A = k.f28737m;

    class a extends c.AbstractC0348c {
        a() {
        }

        @Override // r0.c.AbstractC0348c
        public int a(View view, int i10, int i11) {
            return h0.a.b(i10, SideSheetBehavior.this.f8141a.f(), SideSheetBehavior.this.f8141a.e());
        }

        @Override // r0.c.AbstractC0348c
        public int b(View view, int i10, int i11) {
            return view.getTop();
        }

        @Override // r0.c.AbstractC0348c
        public int d(View view) {
            return SideSheetBehavior.this.f8154n + SideSheetBehavior.this.d0();
        }

        @Override // r0.c.AbstractC0348c
        public void j(int i10) {
            if (i10 == 1 && SideSheetBehavior.this.f8148h) {
                SideSheetBehavior.this.z0(1);
            }
        }

        @Override // r0.c.AbstractC0348c
        public void k(View view, int i10, int i11, int i12, int i13) {
            ViewGroup.MarginLayoutParams marginLayoutParams;
            View viewZ = SideSheetBehavior.this.Z();
            if (viewZ != null && (marginLayoutParams = (ViewGroup.MarginLayoutParams) viewZ.getLayoutParams()) != null) {
                SideSheetBehavior.this.f8141a.n(marginLayoutParams, view.getLeft(), view.getRight());
                viewZ.setLayoutParams(marginLayoutParams);
            }
            SideSheetBehavior.this.V(view, i10);
        }

        @Override // r0.c.AbstractC0348c
        public void l(View view, float f10, float f11) {
            int iR = SideSheetBehavior.this.R(view, f10, f11);
            SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
            sideSheetBehavior.E0(view, iR, sideSheetBehavior.D0());
        }

        @Override // r0.c.AbstractC0348c
        public boolean m(View view, int i10) {
            return (SideSheetBehavior.this.f8149i == 1 || SideSheetBehavior.this.f8158r == null || SideSheetBehavior.this.f8158r.get() != view) ? false : true;
        }
    }

    class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f8168a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f8169b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Runnable f8170c = new Runnable() { // from class: com.google.android.material.sidesheet.e
            @Override // java.lang.Runnable
            public final void run() {
                SideSheetBehavior.c.a(this.f8174a);
            }
        };

        c() {
        }

        public static /* synthetic */ void a(c cVar) {
            cVar.f8169b = false;
            if (SideSheetBehavior.this.f8151k != null && SideSheetBehavior.this.f8151k.m(true)) {
                cVar.b(cVar.f8168a);
            } else if (SideSheetBehavior.this.f8149i == 2) {
                SideSheetBehavior.this.z0(cVar.f8168a);
            }
        }

        void b(int i10) {
            if (SideSheetBehavior.this.f8158r == null || SideSheetBehavior.this.f8158r.get() == null) {
                return;
            }
            this.f8168a = i10;
            if (this.f8169b) {
                return;
            }
            ((View) SideSheetBehavior.this.f8158r.get()).postOnAnimation(this.f8170c);
            this.f8169b = true;
        }
    }

    public SideSheetBehavior() {
        this.f8146f = new c();
        this.f8148h = true;
        this.f8149i = 5;
        this.f8150j = 5;
        this.f8153m = 0.1f;
        this.f8160t = -1;
        this.f8164x = new LinkedHashSet();
        this.f8165y = new a();
    }

    private boolean A0() {
        if (this.f8151k != null) {
            return this.f8148h || this.f8149i == 1;
        }
        return false;
    }

    private boolean C0(View view) {
        return (view.isShown() || o0.q(view) != null) && this.f8148h;
    }

    public static /* synthetic */ boolean E(SideSheetBehavior sideSheetBehavior, int i10, View view, a0.a aVar) {
        sideSheetBehavior.y0(i10);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void E0(View view, int i10, boolean z10) {
        if (!p0(view, i10, z10)) {
            z0(i10);
        } else {
            z0(2);
            this.f8146f.b(i10);
        }
    }

    public static /* synthetic */ void F(SideSheetBehavior sideSheetBehavior, int i10) {
        View view = (View) sideSheetBehavior.f8158r.get();
        if (view != null) {
            sideSheetBehavior.E0(view, i10, false);
        }
    }

    private void F0() {
        View view;
        WeakReference weakReference = this.f8158r;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        o0.g0(view, 262144);
        o0.g0(view, 1048576);
        if (this.f8149i != 5) {
            r0(view, x.a.f22388y, 5);
        }
        if (this.f8149i != 3) {
            r0(view, x.a.f22386w, 3);
        }
    }

    private void G0(l lVar) {
        h hVar = this.f8143c;
        if (hVar != null) {
            hVar.setShapeAppearanceModel(lVar);
        }
    }

    private void H0(View view) {
        int i10 = this.f8149i == 5 ? 4 : 0;
        if (view.getVisibility() != i10) {
            view.setVisibility(i10);
        }
    }

    private int P(int i10, View view) {
        int i11 = this.f8149i;
        if (i11 == 1 || i11 == 2) {
            return i10 - this.f8141a.g(view);
        }
        if (i11 == 3) {
            return 0;
        }
        if (i11 == 5) {
            return this.f8141a.d();
        }
        throw new IllegalStateException("Unexpected value: " + this.f8149i);
    }

    private float Q(float f10, float f11) {
        return Math.abs(f10 - f11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int R(View view, float f10, float f11) {
        if (n0(f10)) {
            return 3;
        }
        if (B0(view, f10)) {
            return (this.f8141a.l(f10, f11) || this.f8141a.k(view)) ? 5 : 3;
        }
        if (f10 != 0.0f && d.a(f10, f11)) {
            return 5;
        }
        int left = view.getLeft();
        return Math.abs(left - a0()) < Math.abs(left - this.f8141a.d()) ? 3 : 5;
    }

    private void S() {
        WeakReference weakReference = this.f8159s;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f8159s = null;
    }

    private a0 T(final int i10) {
        return new a0() { // from class: n9.a
            @Override // n0.a0
            public final boolean a(View view, a0.a aVar) {
                return SideSheetBehavior.E(this.f22643a, i10, view, aVar);
            }
        };
    }

    private void U(Context context) {
        if (this.f8145e == null) {
            return;
        }
        h hVar = new h(this.f8145e);
        this.f8143c = hVar;
        hVar.Q(context);
        ColorStateList colorStateList = this.f8144d;
        if (colorStateList != null) {
            this.f8143c.c0(colorStateList);
            return;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.colorBackground, typedValue, true);
        this.f8143c.setTint(typedValue.data);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void V(View view, int i10) {
        if (this.f8164x.isEmpty()) {
            return;
        }
        this.f8141a.b(i10);
        Iterator it = this.f8164x.iterator();
        if (it.hasNext()) {
            android.support.v4.media.session.b.a(it.next());
            throw null;
        }
    }

    private void W(View view) {
        if (o0.q(view) == null) {
            o0.p0(view, view.getResources().getString(f8140z));
        }
    }

    private int X(int i10, int i11, int i12, int i13) {
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

    private CoordinatorLayout.f j0() {
        View view;
        WeakReference weakReference = this.f8158r;
        if (weakReference == null || (view = (View) weakReference.get()) == null || !(view.getLayoutParams() instanceof CoordinatorLayout.f)) {
            return null;
        }
        return (CoordinatorLayout.f) view.getLayoutParams();
    }

    private boolean k0() {
        CoordinatorLayout.f fVarJ0 = j0();
        return fVarJ0 != null && ((ViewGroup.MarginLayoutParams) fVarJ0).leftMargin > 0;
    }

    private boolean l0() {
        CoordinatorLayout.f fVarJ0 = j0();
        return fVarJ0 != null && ((ViewGroup.MarginLayoutParams) fVarJ0).rightMargin > 0;
    }

    private boolean m0(MotionEvent motionEvent) {
        return A0() && Q((float) this.f8163w, motionEvent.getX()) > ((float) this.f8151k.z());
    }

    private boolean n0(float f10) {
        return this.f8141a.j(f10);
    }

    private boolean o0(View view) {
        ViewParent parent = view.getParent();
        return parent != null && parent.isLayoutRequested() && view.isAttachedToWindow();
    }

    private boolean p0(View view, int i10, boolean z10) {
        int iE0 = e0(i10);
        r0.c cVarI0 = i0();
        if (cVarI0 != null) {
            return z10 ? cVarI0.O(iE0, view.getTop()) : cVarI0.Q(view, iE0, view.getTop());
        }
        return false;
    }

    private void q0(CoordinatorLayout coordinatorLayout) {
        int i10;
        View viewFindViewById;
        if (this.f8159s != null || (i10 = this.f8160t) == -1 || (viewFindViewById = coordinatorLayout.findViewById(i10)) == null) {
            return;
        }
        this.f8159s = new WeakReference(viewFindViewById);
    }

    private void r0(View view, x.a aVar, int i10) {
        o0.i0(view, aVar, null, T(i10));
    }

    private void s0() {
        VelocityTracker velocityTracker = this.f8161u;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f8161u = null;
        }
    }

    private void t0(View view, Runnable runnable) {
        if (o0(view)) {
            view.post(runnable);
        } else {
            runnable.run();
        }
    }

    private void w0(int i10) {
        com.google.android.material.sidesheet.c cVar = this.f8141a;
        if (cVar == null || cVar.i() != i10) {
            if (i10 == 0) {
                this.f8141a = new com.google.android.material.sidesheet.b(this);
                if (this.f8145e == null || l0()) {
                    return;
                }
                l.b bVarW = this.f8145e.w();
                bVarW.G(0.0f).y(0.0f);
                G0(bVarW.m());
                return;
            }
            if (i10 == 1) {
                this.f8141a = new com.google.android.material.sidesheet.a(this);
                if (this.f8145e == null || k0()) {
                    return;
                }
                l.b bVarW2 = this.f8145e.w();
                bVarW2.C(0.0f).u(0.0f);
                G0(bVarW2.m());
                return;
            }
            throw new IllegalArgumentException("Invalid sheet edge position value: " + i10 + ". Must be 0 or 1.");
        }
    }

    private void x0(View view, int i10) {
        w0(Gravity.getAbsoluteGravity(((CoordinatorLayout.f) view.getLayoutParams()).f1874c, i10) == 3 ? 1 : 0);
    }

    boolean B0(View view, float f10) {
        return this.f8141a.m(view, f10);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean D(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.f8149i == 1 && actionMasked == 0) {
            return true;
        }
        if (A0()) {
            this.f8151k.F(motionEvent);
        }
        if (actionMasked == 0) {
            s0();
        }
        if (this.f8161u == null) {
            this.f8161u = VelocityTracker.obtain();
        }
        this.f8161u.addMovement(motionEvent);
        if (A0() && actionMasked == 2 && !this.f8152l && m0(motionEvent)) {
            this.f8151k.b(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
        }
        return !this.f8152l;
    }

    public boolean D0() {
        return true;
    }

    int Y() {
        return this.f8154n;
    }

    public View Z() {
        WeakReference weakReference = this.f8159s;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    public int a0() {
        return this.f8141a.c();
    }

    public float b0() {
        return this.f8153m;
    }

    float c0() {
        return 0.5f;
    }

    int d0() {
        return this.f8157q;
    }

    int e0(int i10) {
        if (i10 == 3) {
            return a0();
        }
        if (i10 == 5) {
            return this.f8141a.d();
        }
        throw new IllegalArgumentException("Invalid state to get outer edge offset: " + i10);
    }

    int f0() {
        return this.f8156p;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void g(CoordinatorLayout.f fVar) {
        super.g(fVar);
        this.f8158r = null;
        this.f8151k = null;
        this.f8162v = null;
    }

    int g0() {
        return this.f8155o;
    }

    int h0() {
        return HttpStatus.HTTP_INTERNAL_SERVER_ERROR;
    }

    r0.c i0() {
        return this.f8151k;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void j() {
        super.j();
        this.f8158r = null;
        this.f8151k = null;
        this.f8162v = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean k(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        r0.c cVar;
        if (!C0(view)) {
            this.f8152l = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            s0();
        }
        if (this.f8161u == null) {
            this.f8161u = VelocityTracker.obtain();
        }
        this.f8161u.addMovement(motionEvent);
        if (actionMasked == 0) {
            this.f8163w = (int) motionEvent.getX();
        } else if ((actionMasked == 1 || actionMasked == 3) && this.f8152l) {
            this.f8152l = false;
            return false;
        }
        return (this.f8152l || (cVar = this.f8151k) == null || !cVar.P(motionEvent)) ? false : true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean l(CoordinatorLayout coordinatorLayout, View view, int i10) {
        if (coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
            view.setFitsSystemWindows(true);
        }
        if (this.f8158r == null) {
            this.f8158r = new WeakReference(view);
            this.f8162v = new h9.c(view);
            h hVar = this.f8143c;
            if (hVar != null) {
                view.setBackground(hVar);
                h hVar2 = this.f8143c;
                float elevation = this.f8147g;
                if (elevation == -1.0f) {
                    elevation = view.getElevation();
                }
                hVar2.b0(elevation);
            } else {
                ColorStateList colorStateList = this.f8144d;
                if (colorStateList != null) {
                    o0.r0(view, colorStateList);
                }
            }
            H0(view);
            F0();
            if (view.getImportantForAccessibility() == 0) {
                view.setImportantForAccessibility(1);
            }
            W(view);
        }
        x0(view, i10);
        if (this.f8151k == null) {
            this.f8151k = r0.c.o(coordinatorLayout, this.f8165y);
        }
        int iG = this.f8141a.g(view);
        coordinatorLayout.C(view, i10);
        this.f8155o = coordinatorLayout.getWidth();
        this.f8156p = this.f8141a.h(coordinatorLayout);
        this.f8154n = view.getWidth();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        this.f8157q = marginLayoutParams != null ? this.f8141a.a(marginLayoutParams) : 0;
        o0.W(view, P(iG, view));
        q0(coordinatorLayout);
        Iterator it = this.f8164x.iterator();
        while (it.hasNext()) {
            android.support.v4.media.session.b.a(it.next());
        }
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean m(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12, int i13) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(X(i10, coordinatorLayout.getPaddingLeft() + coordinatorLayout.getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i11, -1, marginLayoutParams.width), X(i12, coordinatorLayout.getPaddingTop() + coordinatorLayout.getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i13, -1, marginLayoutParams.height));
        return true;
    }

    public void u0(int i10) {
        this.f8160t = i10;
        S();
        WeakReference weakReference = this.f8158r;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            if (i10 == -1 || !view.isLaidOut()) {
                return;
            }
            view.requestLayout();
        }
    }

    public void v0(boolean z10) {
        this.f8148h = z10;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void x(CoordinatorLayout coordinatorLayout, View view, Parcelable parcelable) {
        b bVar = (b) parcelable;
        if (bVar.getSuperState() != null) {
            super.x(coordinatorLayout, view, bVar.getSuperState());
        }
        int i10 = bVar.f8167a;
        if (i10 == 1 || i10 == 2) {
            i10 = 5;
        }
        this.f8149i = i10;
        this.f8150j = i10;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public Parcelable y(CoordinatorLayout coordinatorLayout, View view) {
        return new b(super.y(coordinatorLayout, view), this);
    }

    public void y0(final int i10) {
        if (i10 == 1 || i10 == 2) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("STATE_");
            sb2.append(i10 == 1 ? "DRAGGING" : "SETTLING");
            sb2.append(" should not be set externally.");
            throw new IllegalArgumentException(sb2.toString());
        }
        WeakReference weakReference = this.f8158r;
        if (weakReference == null || weakReference.get() == null) {
            z0(i10);
        } else {
            t0((View) this.f8158r.get(), new Runnable() { // from class: n9.b
                @Override // java.lang.Runnable
                public final void run() {
                    SideSheetBehavior.F(this.f22645a, i10);
                }
            });
        }
    }

    void z0(int i10) {
        View view;
        if (this.f8149i == i10) {
            return;
        }
        this.f8149i = i10;
        if (i10 == 3 || i10 == 5) {
            this.f8150j = i10;
        }
        WeakReference weakReference = this.f8158r;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        H0(view);
        Iterator it = this.f8164x.iterator();
        if (it.hasNext()) {
            android.support.v4.media.session.b.a(it.next());
            throw null;
        }
        F0();
    }

    protected static class b extends q0.a {
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final int f8167a;

        class a implements Parcelable.ClassLoaderCreator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public b createFromParcel(Parcel parcel) {
                return new b(parcel, (ClassLoader) null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public b createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new b(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public b[] newArray(int i10) {
                return new b[i10];
            }
        }

        public b(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f8167a = parcel.readInt();
        }

        @Override // q0.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f8167a);
        }

        public b(Parcelable parcelable, SideSheetBehavior sideSheetBehavior) {
            super(parcelable);
            this.f8167a = sideSheetBehavior.f8149i;
        }
    }

    public SideSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f8146f = new c();
        this.f8148h = true;
        this.f8149i = 5;
        this.f8150j = 5;
        this.f8153m = 0.1f;
        this.f8160t = -1;
        this.f8164x = new LinkedHashSet();
        this.f8165y = new a();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, u8.l.f28947v5);
        int i10 = u8.l.f28965x5;
        if (typedArrayObtainStyledAttributes.hasValue(i10)) {
            this.f8144d = j9.c.a(context, typedArrayObtainStyledAttributes, i10);
        }
        if (typedArrayObtainStyledAttributes.hasValue(u8.l.A5)) {
            this.f8145e = l.e(context, attributeSet, 0, A).m();
        }
        int i11 = u8.l.f28983z5;
        if (typedArrayObtainStyledAttributes.hasValue(i11)) {
            u0(typedArrayObtainStyledAttributes.getResourceId(i11, -1));
        }
        U(context);
        this.f8147g = typedArrayObtainStyledAttributes.getDimension(u8.l.f28956w5, -1.0f);
        v0(typedArrayObtainStyledAttributes.getBoolean(u8.l.f28974y5, true));
        typedArrayObtainStyledAttributes.recycle();
        this.f8142b = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }
}
