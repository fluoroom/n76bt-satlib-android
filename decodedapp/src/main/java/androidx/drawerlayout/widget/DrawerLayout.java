package androidx.drawerlayout.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import com.tencent.mm.opensdk.modelmsg.WXVideoFileObject;
import java.util.ArrayList;
import java.util.List;
import m0.i1;
import m0.l;
import m0.o0;
import n0.a0;
import n0.x;
import r0.c;

/* JADX INFO: loaded from: classes.dex */
public class DrawerLayout extends ViewGroup {
    private static final int[] U = {R.attr.colorPrimaryDark};
    static final int[] V = {R.attr.layout_gravity};
    static final boolean W;

    /* JADX INFO: renamed from: a0 */
    private static final boolean f1997a0;

    /* JADX INFO: renamed from: b0 */
    private static boolean f1998b0;
    private boolean A;
    private e B;
    private List C;
    private float D;
    private float E;
    private Drawable F;
    private Drawable G;
    private Drawable H;
    private CharSequence I;
    private CharSequence J;
    private Object K;
    private boolean L;
    private Drawable M;
    private Drawable N;
    private Drawable O;
    private Drawable P;
    private final ArrayList Q;
    private Rect R;
    private Matrix S;
    private final a0 T;

    /* JADX INFO: renamed from: a */
    private final d f1999a;

    /* JADX INFO: renamed from: b */
    private float f2000b;

    /* JADX INFO: renamed from: c */
    private int f2001c;

    /* JADX INFO: renamed from: d */
    private int f2002d;

    /* JADX INFO: renamed from: e */
    private float f2003e;

    /* JADX INFO: renamed from: f */
    private Paint f2004f;

    /* JADX INFO: renamed from: g */
    private final r0.c f2005g;

    /* JADX INFO: renamed from: h */
    private final r0.c f2006h;

    /* JADX INFO: renamed from: r */
    private final h f2007r;

    /* JADX INFO: renamed from: s */
    private final h f2008s;

    /* JADX INFO: renamed from: t */
    private int f2009t;

    /* JADX INFO: renamed from: u */
    private boolean f2010u;

    /* JADX INFO: renamed from: v */
    private boolean f2011v;

    /* JADX INFO: renamed from: w */
    private int f2012w;

    /* JADX INFO: renamed from: x */
    private int f2013x;

    /* JADX INFO: renamed from: y */
    private int f2014y;

    /* JADX INFO: renamed from: z */
    private int f2015z;

    class a implements a0 {
        a() {
        }

        @Override // n0.a0
        public boolean a(View view, a0.a aVar) {
            if (!DrawerLayout.this.D(view) || DrawerLayout.this.r(view) == 2) {
                return false;
            }
            DrawerLayout.this.f(view);
            return true;
        }
    }

    class b implements View.OnApplyWindowInsetsListener {
        b() {
        }

        @Override // android.view.View.OnApplyWindowInsetsListener
        public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
            ((DrawerLayout) view).S(windowInsets, windowInsets.getSystemWindowInsetTop() > 0);
            return windowInsets.consumeSystemWindowInsets();
        }
    }

    class c extends m0.a {

        /* JADX INFO: renamed from: d */
        private final Rect f2018d = new Rect();

        c() {
        }

        private void n(x xVar, ViewGroup viewGroup) {
            int childCount = viewGroup.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = viewGroup.getChildAt(i10);
                if (DrawerLayout.A(childAt)) {
                    xVar.c(childAt);
                }
            }
        }

        private void o(x xVar, x xVar2) {
            Rect rect = this.f2018d;
            xVar2.n(rect);
            xVar.p0(rect);
            xVar.W0(xVar2.e0());
            xVar.I0(xVar2.C());
            xVar.t0(xVar2.s());
            xVar.x0(xVar2.v());
            xVar.z0(xVar2.S());
            xVar.C0(xVar2.V());
            xVar.m0(xVar2.N());
            xVar.P0(xVar2.b0());
            xVar.a(xVar2.k());
        }

        @Override // m0.a
        public boolean a(View view, AccessibilityEvent accessibilityEvent) {
            if (accessibilityEvent.getEventType() != 32) {
                return super.a(view, accessibilityEvent);
            }
            List<CharSequence> text = accessibilityEvent.getText();
            View viewP = DrawerLayout.this.p();
            if (viewP == null) {
                return true;
            }
            CharSequence charSequenceS = DrawerLayout.this.s(DrawerLayout.this.t(viewP));
            if (charSequenceS == null) {
                return true;
            }
            text.add(charSequenceS);
            return true;
        }

        @Override // m0.a
        public void f(View view, AccessibilityEvent accessibilityEvent) {
            super.f(view, accessibilityEvent);
            accessibilityEvent.setClassName("androidx.drawerlayout.widget.DrawerLayout");
        }

        @Override // m0.a
        public void g(View view, x xVar) {
            if (DrawerLayout.W) {
                super.g(view, xVar);
            } else {
                x xVarH0 = x.h0(xVar);
                super.g(view, xVarH0);
                xVar.R0(view);
                Object objH = o0.H(view);
                if (objH instanceof View) {
                    xVar.K0((View) objH);
                }
                o(xVar, xVarH0);
                xVarH0.j0();
                n(xVar, (ViewGroup) view);
            }
            xVar.t0("androidx.drawerlayout.widget.DrawerLayout");
            xVar.B0(false);
            xVar.C0(false);
            xVar.k0(x.a.f22368e);
            xVar.k0(x.a.f22369f);
        }

        @Override // m0.a
        public boolean i(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            if (DrawerLayout.W || DrawerLayout.A(view)) {
                return super.i(viewGroup, view, accessibilityEvent);
            }
            return false;
        }
    }

    static final class d extends m0.a {
        d() {
        }

        @Override // m0.a
        public void g(View view, x xVar) {
            super.g(view, xVar);
            if (DrawerLayout.A(view)) {
                return;
            }
            xVar.K0(null);
        }
    }

    public interface e {
        void a(View view);

        void b(View view);

        void c(int i10);

        void d(View view, float f10);
    }

    private class h extends c.AbstractC0348c {

        /* JADX INFO: renamed from: a */
        private final int f2029a;

        /* JADX INFO: renamed from: b */
        private r0.c f2030b;

        /* JADX INFO: renamed from: c */
        private final Runnable f2031c = new a();

        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                h.this.o();
            }
        }

        h(int i10) {
            this.f2029a = i10;
        }

        private void n() {
            View viewN = DrawerLayout.this.n(this.f2029a == 3 ? 5 : 3);
            if (viewN != null) {
                DrawerLayout.this.f(viewN);
            }
        }

        @Override // r0.c.AbstractC0348c
        public int a(View view, int i10, int i11) {
            if (DrawerLayout.this.c(view, 3)) {
                return Math.max(-view.getWidth(), Math.min(i10, 0));
            }
            int width = DrawerLayout.this.getWidth();
            return Math.max(width - view.getWidth(), Math.min(i10, width));
        }

        @Override // r0.c.AbstractC0348c
        public int b(View view, int i10, int i11) {
            return view.getTop();
        }

        @Override // r0.c.AbstractC0348c
        public int d(View view) {
            if (DrawerLayout.this.E(view)) {
                return view.getWidth();
            }
            return 0;
        }

        @Override // r0.c.AbstractC0348c
        public void f(int i10, int i11) {
            View viewN = (i10 & 1) == 1 ? DrawerLayout.this.n(3) : DrawerLayout.this.n(5);
            if (viewN == null || DrawerLayout.this.r(viewN) != 0) {
                return;
            }
            this.f2030b.b(viewN, i11);
        }

        @Override // r0.c.AbstractC0348c
        public boolean g(int i10) {
            return false;
        }

        @Override // r0.c.AbstractC0348c
        public void h(int i10, int i11) {
            DrawerLayout.this.postDelayed(this.f2031c, 160L);
        }

        @Override // r0.c.AbstractC0348c
        public void i(View view, int i10) {
            ((f) view.getLayoutParams()).f2022c = false;
            n();
        }

        @Override // r0.c.AbstractC0348c
        public void j(int i10) {
            DrawerLayout.this.Z(i10, this.f2030b.v());
        }

        @Override // r0.c.AbstractC0348c
        public void k(View view, int i10, int i11, int i12, int i13) {
            float width = (DrawerLayout.this.c(view, 3) ? i10 + r3 : DrawerLayout.this.getWidth() - i10) / view.getWidth();
            DrawerLayout.this.W(view, width);
            view.setVisibility(width == 0.0f ? 4 : 0);
            DrawerLayout.this.invalidate();
        }

        @Override // r0.c.AbstractC0348c
        public void l(View view, float f10, float f11) {
            int i10;
            float fU = DrawerLayout.this.u(view);
            int width = view.getWidth();
            if (DrawerLayout.this.c(view, 3)) {
                i10 = (f10 > 0.0f || (f10 == 0.0f && fU > 0.5f)) ? 0 : -width;
            } else {
                int width2 = DrawerLayout.this.getWidth();
                if (f10 < 0.0f || (f10 == 0.0f && fU > 0.5f)) {
                    width2 -= width;
                }
                i10 = width2;
            }
            this.f2030b.O(i10, view.getTop());
            DrawerLayout.this.invalidate();
        }

        @Override // r0.c.AbstractC0348c
        public boolean m(View view, int i10) {
            return DrawerLayout.this.E(view) && DrawerLayout.this.c(view, this.f2029a) && DrawerLayout.this.r(view) == 0;
        }

        void o() {
            View viewN;
            int width;
            int iX = this.f2030b.x();
            boolean z10 = this.f2029a == 3;
            if (z10) {
                viewN = DrawerLayout.this.n(3);
                width = (viewN != null ? -viewN.getWidth() : 0) + iX;
            } else {
                viewN = DrawerLayout.this.n(5);
                width = DrawerLayout.this.getWidth() - iX;
            }
            if (viewN != null) {
                if (((!z10 || viewN.getLeft() >= width) && (z10 || viewN.getLeft() <= width)) || DrawerLayout.this.r(viewN) != 0) {
                    return;
                }
                f fVar = (f) viewN.getLayoutParams();
                this.f2030b.Q(viewN, width, viewN.getTop());
                fVar.f2022c = true;
                DrawerLayout.this.invalidate();
                n();
                DrawerLayout.this.b();
            }
        }

        public void p() {
            DrawerLayout.this.removeCallbacks(this.f2031c);
        }

        public void q(r0.c cVar) {
            this.f2030b = cVar;
        }
    }

    static {
        int i10 = Build.VERSION.SDK_INT;
        W = true;
        f1997a0 = true;
        f1998b0 = i10 >= 29;
    }

    public DrawerLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, s0.a.f26305a);
    }

    static boolean A(View view) {
        return (o0.A(view) == 4 || o0.A(view) == 2) ? false : true;
    }

    private boolean H(float f10, float f11, View view) {
        if (this.R == null) {
            this.R = new Rect();
        }
        view.getHitRect(this.R);
        return this.R.contains((int) f10, (int) f11);
    }

    private void I(Drawable drawable, int i10) {
        if (drawable == null || !e0.a.h(drawable)) {
            return;
        }
        e0.a.m(drawable, i10);
    }

    private Drawable P() {
        int iC = o0.C(this);
        if (iC == 0) {
            Drawable drawable = this.M;
            if (drawable != null) {
                I(drawable, iC);
                return this.M;
            }
        } else {
            Drawable drawable2 = this.N;
            if (drawable2 != null) {
                I(drawable2, iC);
                return this.N;
            }
        }
        return this.O;
    }

    private Drawable Q() {
        int iC = o0.C(this);
        if (iC == 0) {
            Drawable drawable = this.N;
            if (drawable != null) {
                I(drawable, iC);
                return this.N;
            }
        } else {
            Drawable drawable2 = this.M;
            if (drawable2 != null) {
                I(drawable2, iC);
                return this.M;
            }
        }
        return this.P;
    }

    private void R() {
        if (f1997a0) {
            return;
        }
        this.G = P();
        this.H = Q();
    }

    private void X(View view) {
        x.a aVar = x.a.f22388y;
        o0.g0(view, aVar.b());
        if (!D(view) || r(view) == 2) {
            return;
        }
        o0.i0(view, aVar, null, this.T);
    }

    private void Y(View view, boolean z10) {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if ((z10 || E(childAt)) && !(z10 && childAt == view)) {
                o0.u0(childAt, 4);
            } else {
                o0.u0(childAt, 1);
            }
        }
    }

    private boolean m(MotionEvent motionEvent, View view) {
        if (!view.getMatrix().isIdentity()) {
            MotionEvent motionEventV = v(motionEvent, view);
            boolean zDispatchGenericMotionEvent = view.dispatchGenericMotionEvent(motionEventV);
            motionEventV.recycle();
            return zDispatchGenericMotionEvent;
        }
        float scrollX = getScrollX() - view.getLeft();
        float scrollY = getScrollY() - view.getTop();
        motionEvent.offsetLocation(scrollX, scrollY);
        boolean zDispatchGenericMotionEvent2 = view.dispatchGenericMotionEvent(motionEvent);
        motionEvent.offsetLocation(-scrollX, -scrollY);
        return zDispatchGenericMotionEvent2;
    }

    private MotionEvent v(MotionEvent motionEvent, View view) {
        float scrollX = getScrollX() - view.getLeft();
        float scrollY = getScrollY() - view.getTop();
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        motionEventObtain.offsetLocation(scrollX, scrollY);
        Matrix matrix = view.getMatrix();
        if (!matrix.isIdentity()) {
            if (this.S == null) {
                this.S = new Matrix();
            }
            matrix.invert(this.S);
            motionEventObtain.transform(this.S);
        }
        return motionEventObtain;
    }

    static String w(int i10) {
        return (i10 & 3) == 3 ? "LEFT" : (i10 & 5) == 5 ? "RIGHT" : Integer.toHexString(i10);
    }

    private static boolean x(View view) {
        Drawable background = view.getBackground();
        return background != null && background.getOpacity() == -1;
    }

    private boolean y() {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            if (((f) getChildAt(i10).getLayoutParams()).f2022c) {
                return true;
            }
        }
        return false;
    }

    private boolean z() {
        return p() != null;
    }

    boolean B(View view) {
        return ((f) view.getLayoutParams()).f2020a == 0;
    }

    public boolean C(int i10) {
        View viewN = n(i10);
        if (viewN != null) {
            return D(viewN);
        }
        return false;
    }

    public boolean D(View view) {
        if (E(view)) {
            return (((f) view.getLayoutParams()).f2023d & 1) == 1;
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    boolean E(View view) {
        int iB = l.b(((f) view.getLayoutParams()).f2020a, o0.C(view));
        return ((iB & 3) == 0 && (iB & 5) == 0) ? false : true;
    }

    public boolean F(int i10) {
        View viewN = n(i10);
        if (viewN != null) {
            return G(viewN);
        }
        return false;
    }

    public boolean G(View view) {
        if (E(view)) {
            return ((f) view.getLayoutParams()).f2021b > 0.0f;
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    void J(View view, float f10) {
        float fU = u(view);
        float width = view.getWidth();
        int i10 = ((int) (width * f10)) - ((int) (fU * width));
        if (!c(view, 3)) {
            i10 = -i10;
        }
        view.offsetLeftAndRight(i10);
        W(view, f10);
    }

    public void K(int i10) {
        L(i10, true);
    }

    public void L(int i10, boolean z10) {
        View viewN = n(i10);
        if (viewN != null) {
            N(viewN, z10);
            return;
        }
        throw new IllegalArgumentException("No drawer view found with gravity " + w(i10));
    }

    public void M(View view) {
        N(view, true);
    }

    public void N(View view, boolean z10) {
        if (!E(view)) {
            throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
        }
        f fVar = (f) view.getLayoutParams();
        if (this.f2011v) {
            fVar.f2021b = 1.0f;
            fVar.f2023d = 1;
            Y(view, true);
            X(view);
        } else if (z10) {
            fVar.f2023d |= 2;
            if (c(view, 3)) {
                this.f2005g.Q(view, 0, view.getTop());
            } else {
                this.f2006h.Q(view, getWidth() - view.getWidth(), view.getTop());
            }
        } else {
            J(view, 1.0f);
            Z(0, view);
            view.setVisibility(0);
        }
        invalidate();
    }

    public void O(e eVar) {
        List list;
        if (eVar == null || (list = this.C) == null) {
            return;
        }
        list.remove(eVar);
    }

    public void S(Object obj, boolean z10) {
        this.K = obj;
        this.L = z10;
        setWillNotDraw(!z10 && getBackground() == null);
        requestLayout();
    }

    public void T(int i10, int i11) {
        View viewN;
        int iB = l.b(i11, o0.C(this));
        if (i11 == 3) {
            this.f2012w = i10;
        } else if (i11 == 5) {
            this.f2013x = i10;
        } else if (i11 == 8388611) {
            this.f2014y = i10;
        } else if (i11 == 8388613) {
            this.f2015z = i10;
        }
        if (i10 != 0) {
            (iB == 3 ? this.f2005g : this.f2006h).a();
        }
        if (i10 != 1) {
            if (i10 == 2 && (viewN = n(iB)) != null) {
                M(viewN);
                return;
            }
            return;
        }
        View viewN2 = n(iB);
        if (viewN2 != null) {
            f(viewN2);
        }
    }

    public void U(int i10, int i11) {
        V(b0.b.d(getContext(), i10), i11);
    }

    public void V(Drawable drawable, int i10) {
        if (f1997a0) {
            return;
        }
        if ((i10 & 8388611) == 8388611) {
            this.M = drawable;
        } else if ((i10 & 8388613) == 8388613) {
            this.N = drawable;
        } else if ((i10 & 3) == 3) {
            this.O = drawable;
        } else if ((i10 & 5) != 5) {
            return;
        } else {
            this.P = drawable;
        }
        R();
        invalidate();
    }

    void W(View view, float f10) {
        f fVar = (f) view.getLayoutParams();
        if (f10 == fVar.f2021b) {
            return;
        }
        fVar.f2021b = f10;
        l(view, f10);
    }

    void Z(int i10, View view) {
        int i11;
        int iA = this.f2005g.A();
        int iA2 = this.f2006h.A();
        if (iA == 1 || iA2 == 1) {
            i11 = 1;
        } else {
            i11 = 2;
            if (iA != 2 && iA2 != 2) {
                i11 = 0;
            }
        }
        if (view != null && i10 == 0) {
            float f10 = ((f) view.getLayoutParams()).f2021b;
            if (f10 == 0.0f) {
                j(view);
            } else if (f10 == 1.0f) {
                k(view);
            }
        }
        if (i11 != this.f2009t) {
            this.f2009t = i11;
            List list = this.C;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    ((e) this.C.get(size)).c(i11);
                }
            }
        }
    }

    public void a(e eVar) {
        if (eVar == null) {
            return;
        }
        if (this.C == null) {
            this.C = new ArrayList();
        }
        this.C.add(eVar);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList arrayList, int i10, int i11) {
        if (getDescendantFocusability() == 393216) {
            return;
        }
        int childCount = getChildCount();
        boolean z10 = false;
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (!E(childAt)) {
                this.Q.add(childAt);
            } else if (D(childAt)) {
                childAt.addFocusables(arrayList, i10, i11);
                z10 = true;
            }
        }
        if (!z10) {
            int size = this.Q.size();
            for (int i13 = 0; i13 < size; i13++) {
                View view = (View) this.Q.get(i13);
                if (view.getVisibility() == 0) {
                    view.addFocusables(arrayList, i10, i11);
                }
            }
        }
        this.Q.clear();
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i10, layoutParams);
        if (o() != null || E(view)) {
            o0.u0(view, 4);
        } else {
            o0.u0(view, 1);
        }
        if (W) {
            return;
        }
        o0.n0(view, this.f1999a);
    }

    void b() {
        if (this.A) {
            return;
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            getChildAt(i10).dispatchTouchEvent(motionEventObtain);
        }
        motionEventObtain.recycle();
        this.A = true;
    }

    boolean c(View view, int i10) {
        return (t(view) & i10) == i10;
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof f) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public void computeScroll() {
        int childCount = getChildCount();
        float fMax = 0.0f;
        for (int i10 = 0; i10 < childCount; i10++) {
            fMax = Math.max(fMax, ((f) getChildAt(i10).getLayoutParams()).f2021b);
        }
        this.f2003e = fMax;
        boolean zM = this.f2005g.m(true);
        boolean zM2 = this.f2006h.m(true);
        if (zM || zM2) {
            o0.d0(this);
        }
    }

    public void d(int i10) {
        e(i10, true);
    }

    @Override // android.view.View
    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        if ((motionEvent.getSource() & 2) == 0 || motionEvent.getAction() == 10 || this.f2003e <= 0.0f) {
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        int childCount = getChildCount();
        if (childCount == 0) {
            return false;
        }
        float x10 = motionEvent.getX();
        float y10 = motionEvent.getY();
        for (int i10 = childCount - 1; i10 >= 0; i10--) {
            View childAt = getChildAt(i10);
            if (H(x10, y10, childAt) && !B(childAt) && m(motionEvent, childAt)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup
    protected boolean drawChild(Canvas canvas, View view, long j10) {
        int height = getHeight();
        boolean zB = B(view);
        int width = getWidth();
        int iSave = canvas.save();
        int i10 = 0;
        if (zB) {
            int childCount = getChildCount();
            int i11 = 0;
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = getChildAt(i12);
                if (childAt != view && childAt.getVisibility() == 0 && x(childAt) && E(childAt) && childAt.getHeight() >= height) {
                    if (c(childAt, 3)) {
                        int right = childAt.getRight();
                        if (right > i11) {
                            i11 = right;
                        }
                    } else {
                        int left = childAt.getLeft();
                        if (left < width) {
                            width = left;
                        }
                    }
                }
            }
            canvas.clipRect(i11, 0, width, getHeight());
            i10 = i11;
        }
        boolean zDrawChild = super.drawChild(canvas, view, j10);
        canvas.restoreToCount(iSave);
        float f10 = this.f2003e;
        if (f10 > 0.0f && zB) {
            this.f2004f.setColor((this.f2002d & 16777215) | (((int) ((((-16777216) & r14) >>> 24) * f10)) << 24));
            canvas.drawRect(i10, 0.0f, width, getHeight(), this.f2004f);
            return zDrawChild;
        }
        if (this.G != null && c(view, 3)) {
            int intrinsicWidth = this.G.getIntrinsicWidth();
            int right2 = view.getRight();
            float fMax = Math.max(0.0f, Math.min(right2 / this.f2005g.x(), 1.0f));
            this.G.setBounds(right2, view.getTop(), intrinsicWidth + right2, view.getBottom());
            this.G.setAlpha((int) (fMax * 255.0f));
            this.G.draw(canvas);
            return zDrawChild;
        }
        if (this.H != null && c(view, 5)) {
            int intrinsicWidth2 = this.H.getIntrinsicWidth();
            int left2 = view.getLeft();
            float fMax2 = Math.max(0.0f, Math.min((getWidth() - left2) / this.f2006h.x(), 1.0f));
            this.H.setBounds(left2 - intrinsicWidth2, view.getTop(), left2, view.getBottom());
            this.H.setAlpha((int) (fMax2 * 255.0f));
            this.H.draw(canvas);
        }
        return zDrawChild;
    }

    public void e(int i10, boolean z10) {
        View viewN = n(i10);
        if (viewN != null) {
            g(viewN, z10);
            return;
        }
        throw new IllegalArgumentException("No drawer view found with gravity " + w(i10));
    }

    public void f(View view) {
        g(view, true);
    }

    public void g(View view, boolean z10) {
        if (!E(view)) {
            throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
        }
        f fVar = (f) view.getLayoutParams();
        if (this.f2011v) {
            fVar.f2021b = 0.0f;
            fVar.f2023d = 0;
        } else if (z10) {
            fVar.f2023d |= 4;
            if (c(view, 3)) {
                this.f2005g.Q(view, -view.getWidth(), view.getTop());
            } else {
                this.f2006h.Q(view, getWidth(), view.getTop());
            }
        } else {
            J(view, 0.0f);
            Z(0, view);
            view.setVisibility(4);
        }
        invalidate();
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new f(-1, -1);
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof f ? new f((f) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new f((ViewGroup.MarginLayoutParams) layoutParams) : new f(layoutParams);
    }

    public float getDrawerElevation() {
        if (f1997a0) {
            return this.f2000b;
        }
        return 0.0f;
    }

    public Drawable getStatusBarBackgroundDrawable() {
        return this.F;
    }

    public void h() {
        i(false);
    }

    void i(boolean z10) {
        int childCount = getChildCount();
        boolean zQ = false;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            f fVar = (f) childAt.getLayoutParams();
            if (E(childAt) && (!z10 || fVar.f2022c)) {
                zQ |= c(childAt, 3) ? this.f2005g.Q(childAt, -childAt.getWidth(), childAt.getTop()) : this.f2006h.Q(childAt, getWidth(), childAt.getTop());
                fVar.f2022c = false;
            }
        }
        this.f2007r.p();
        this.f2008s.p();
        if (zQ) {
            invalidate();
        }
    }

    void j(View view) {
        View rootView;
        f fVar = (f) view.getLayoutParams();
        if ((fVar.f2023d & 1) == 1) {
            fVar.f2023d = 0;
            List list = this.C;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    ((e) this.C.get(size)).b(view);
                }
            }
            Y(view, false);
            X(view);
            if (!hasWindowFocus() || (rootView = getRootView()) == null) {
                return;
            }
            rootView.sendAccessibilityEvent(32);
        }
    }

    void k(View view) {
        f fVar = (f) view.getLayoutParams();
        if ((fVar.f2023d & 1) == 0) {
            fVar.f2023d = 1;
            List list = this.C;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    ((e) this.C.get(size)).a(view);
                }
            }
            Y(view, true);
            X(view);
            if (hasWindowFocus()) {
                sendAccessibilityEvent(32);
            }
        }
    }

    void l(View view, float f10) {
        List list = this.C;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                ((e) this.C.get(size)).d(view, f10);
            }
        }
    }

    View n(int i10) {
        int iB = l.b(i10, o0.C(this)) & 7;
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if ((t(childAt) & 7) == iB) {
                return childAt;
            }
        }
        return null;
    }

    View o() {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if ((((f) childAt.getLayoutParams()).f2023d & 1) == 1) {
                return childAt;
            }
        }
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f2011v = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f2011v = true;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.L || this.F == null) {
            return;
        }
        Object obj = this.K;
        int systemWindowInsetTop = obj != null ? ((WindowInsets) obj).getSystemWindowInsetTop() : 0;
        if (systemWindowInsetTop > 0) {
            this.F.setBounds(0, 0, getWidth(), systemWindowInsetTop);
            this.F.draw(canvas);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0031  */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            int r0 = r7.getActionMasked()
            r0.c r1 = r6.f2005g
            boolean r1 = r1.P(r7)
            r0.c r2 = r6.f2006h
            boolean r2 = r2.P(r7)
            r1 = r1 | r2
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L38
            if (r0 == r2) goto L31
            r7 = 2
            r4 = 3
            if (r0 == r7) goto L1e
            if (r0 == r4) goto L31
            goto L36
        L1e:
            r0.c r7 = r6.f2005g
            boolean r7 = r7.d(r4)
            if (r7 == 0) goto L36
            androidx.drawerlayout.widget.DrawerLayout$h r7 = r6.f2007r
            r7.p()
            androidx.drawerlayout.widget.DrawerLayout$h r7 = r6.f2008s
            r7.p()
            goto L36
        L31:
            r6.i(r2)
            r6.A = r3
        L36:
            r7 = 0
            goto L60
        L38:
            float r0 = r7.getX()
            float r7 = r7.getY()
            r6.D = r0
            r6.E = r7
            float r4 = r6.f2003e
            r5 = 0
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto L5d
            r0.c r4 = r6.f2005g
            int r0 = (int) r0
            int r7 = (int) r7
            android.view.View r7 = r4.t(r0, r7)
            if (r7 == 0) goto L5d
            boolean r7 = r6.B(r7)
            if (r7 == 0) goto L5d
            r7 = 1
            goto L5e
        L5d:
            r7 = 0
        L5e:
            r6.A = r3
        L60:
            if (r1 != 0) goto L70
            if (r7 != 0) goto L70
            boolean r7 = r6.y()
            if (r7 != 0) goto L70
            boolean r7 = r6.A
            if (r7 == 0) goto L6f
            goto L70
        L6f:
            return r3
        L70:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.drawerlayout.widget.DrawerLayout.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        if (i10 != 4 || !z()) {
            return super.onKeyDown(i10, keyEvent);
        }
        keyEvent.startTracking();
        return true;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i10, KeyEvent keyEvent) {
        if (i10 != 4) {
            return super.onKeyUp(i10, keyEvent);
        }
        View viewP = p();
        if (viewP != null && r(viewP) == 0) {
            h();
        }
        return viewP != null;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        WindowInsets rootWindowInsets;
        float f10;
        int i14;
        this.f2010u = true;
        int i15 = i12 - i10;
        int childCount = getChildCount();
        for (int i16 = 0; i16 < childCount; i16++) {
            View childAt = getChildAt(i16);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (B(childAt)) {
                    int i17 = ((ViewGroup.MarginLayoutParams) fVar).leftMargin;
                    childAt.layout(i17, ((ViewGroup.MarginLayoutParams) fVar).topMargin, childAt.getMeasuredWidth() + i17, ((ViewGroup.MarginLayoutParams) fVar).topMargin + childAt.getMeasuredHeight());
                } else {
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (c(childAt, 3)) {
                        float f11 = measuredWidth;
                        i14 = (-measuredWidth) + ((int) (fVar.f2021b * f11));
                        f10 = (measuredWidth + i14) / f11;
                    } else {
                        float f12 = measuredWidth;
                        f10 = (i15 - r11) / f12;
                        i14 = i15 - ((int) (fVar.f2021b * f12));
                    }
                    boolean z11 = f10 != fVar.f2021b;
                    int i18 = fVar.f2020a & 112;
                    if (i18 == 16) {
                        int i19 = i13 - i11;
                        int i20 = (i19 - measuredHeight) / 2;
                        int i21 = ((ViewGroup.MarginLayoutParams) fVar).topMargin;
                        if (i20 < i21) {
                            i20 = i21;
                        } else {
                            int i22 = i20 + measuredHeight;
                            int i23 = ((ViewGroup.MarginLayoutParams) fVar).bottomMargin;
                            if (i22 > i19 - i23) {
                                i20 = (i19 - i23) - measuredHeight;
                            }
                        }
                        childAt.layout(i14, i20, measuredWidth + i14, measuredHeight + i20);
                    } else if (i18 != 80) {
                        int i24 = ((ViewGroup.MarginLayoutParams) fVar).topMargin;
                        childAt.layout(i14, i24, measuredWidth + i14, measuredHeight + i24);
                    } else {
                        int i25 = i13 - i11;
                        childAt.layout(i14, (i25 - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin) - childAt.getMeasuredHeight(), measuredWidth + i14, i25 - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin);
                    }
                    if (z11) {
                        W(childAt, f10);
                    }
                    int i26 = fVar.f2021b > 0.0f ? 0 : 4;
                    if (childAt.getVisibility() != i26) {
                        childAt.setVisibility(i26);
                    }
                }
            }
        }
        if (f1998b0 && (rootWindowInsets = getRootWindowInsets()) != null) {
            d0.b bVarH = i1.w(rootWindowInsets).h();
            r0.c cVar = this.f2005g;
            cVar.L(Math.max(cVar.w(), bVarH.f10510a));
            r0.c cVar2 = this.f2006h;
            cVar2.L(Math.max(cVar2.w(), bVarH.f10512c));
        }
        this.f2010u = false;
        this.f2011v = false;
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        int mode = View.MeasureSpec.getMode(i10);
        int mode2 = View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        if (mode != 1073741824 || mode2 != 1073741824) {
            if (!isInEditMode()) {
                throw new IllegalArgumentException("DrawerLayout must be measured with MeasureSpec.EXACTLY.");
            }
            if (mode == 0) {
                size = 300;
            }
            if (mode2 == 0) {
                size2 = 300;
            }
        }
        setMeasuredDimension(size, size2);
        boolean z10 = this.K != null && o0.z(this);
        int iC = o0.C(this);
        int childCount = getChildCount();
        boolean z11 = false;
        boolean z12 = false;
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (z10) {
                    int iB = l.b(fVar.f2020a, iC);
                    if (o0.z(childAt)) {
                        WindowInsets windowInsetsReplaceSystemWindowInsets = (WindowInsets) this.K;
                        if (iB == 3) {
                            windowInsetsReplaceSystemWindowInsets = windowInsetsReplaceSystemWindowInsets.replaceSystemWindowInsets(windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetLeft(), windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetTop(), 0, windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetBottom());
                        } else if (iB == 5) {
                            windowInsetsReplaceSystemWindowInsets = windowInsetsReplaceSystemWindowInsets.replaceSystemWindowInsets(0, windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetTop(), windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetRight(), windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetBottom());
                        }
                        childAt.dispatchApplyWindowInsets(windowInsetsReplaceSystemWindowInsets);
                    } else {
                        WindowInsets windowInsetsReplaceSystemWindowInsets2 = (WindowInsets) this.K;
                        if (iB == 3) {
                            windowInsetsReplaceSystemWindowInsets2 = windowInsetsReplaceSystemWindowInsets2.replaceSystemWindowInsets(windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetLeft(), windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetTop(), 0, windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetBottom());
                        } else if (iB == 5) {
                            windowInsetsReplaceSystemWindowInsets2 = windowInsetsReplaceSystemWindowInsets2.replaceSystemWindowInsets(0, windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetTop(), windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetRight(), windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetBottom());
                        }
                        ((ViewGroup.MarginLayoutParams) fVar).leftMargin = windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetLeft();
                        ((ViewGroup.MarginLayoutParams) fVar).topMargin = windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetTop();
                        ((ViewGroup.MarginLayoutParams) fVar).rightMargin = windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetRight();
                        ((ViewGroup.MarginLayoutParams) fVar).bottomMargin = windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetBottom();
                    }
                }
                if (B(childAt)) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec((size - ((ViewGroup.MarginLayoutParams) fVar).leftMargin) - ((ViewGroup.MarginLayoutParams) fVar).rightMargin, WXVideoFileObject.FILE_SIZE_LIMIT), View.MeasureSpec.makeMeasureSpec((size2 - ((ViewGroup.MarginLayoutParams) fVar).topMargin) - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin, WXVideoFileObject.FILE_SIZE_LIMIT));
                } else {
                    if (!E(childAt)) {
                        throw new IllegalStateException("Child " + childAt + " at index " + i12 + " does not have a valid layout_gravity - must be Gravity.LEFT, Gravity.RIGHT or Gravity.NO_GRAVITY");
                    }
                    if (f1997a0) {
                        float fW = o0.w(childAt);
                        float f10 = this.f2000b;
                        if (fW != f10) {
                            o0.t0(childAt, f10);
                        }
                    }
                    int iT = t(childAt) & 7;
                    boolean z13 = iT == 3;
                    if ((z13 && z11) || (!z13 && z12)) {
                        throw new IllegalStateException("Child drawer has absolute gravity " + w(iT) + " but this DrawerLayout already has a drawer view along that edge");
                    }
                    if (z13) {
                        z11 = true;
                    } else {
                        z12 = true;
                    }
                    childAt.measure(ViewGroup.getChildMeasureSpec(i10, this.f2001c + ((ViewGroup.MarginLayoutParams) fVar).leftMargin + ((ViewGroup.MarginLayoutParams) fVar).rightMargin, ((ViewGroup.MarginLayoutParams) fVar).width), ViewGroup.getChildMeasureSpec(i11, ((ViewGroup.MarginLayoutParams) fVar).topMargin + ((ViewGroup.MarginLayoutParams) fVar).bottomMargin, ((ViewGroup.MarginLayoutParams) fVar).height));
                }
            }
        }
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        View viewN;
        if (!(parcelable instanceof g)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        g gVar = (g) parcelable;
        super.onRestoreInstanceState(gVar.getSuperState());
        int i10 = gVar.f2024a;
        if (i10 != 0 && (viewN = n(i10)) != null) {
            M(viewN);
        }
        int i11 = gVar.f2025b;
        if (i11 != 3) {
            T(i11, 3);
        }
        int i12 = gVar.f2026c;
        if (i12 != 3) {
            T(i12, 5);
        }
        int i13 = gVar.f2027d;
        if (i13 != 3) {
            T(i13, 8388611);
        }
        int i14 = gVar.f2028e;
        if (i14 != 3) {
            T(i14, 8388613);
        }
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i10) {
        R();
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        g gVar = new g(super.onSaveInstanceState());
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            f fVar = (f) getChildAt(i10).getLayoutParams();
            int i11 = fVar.f2023d;
            boolean z10 = i11 == 1;
            boolean z11 = i11 == 2;
            if (z10 || z11) {
                gVar.f2024a = fVar.f2020a;
                break;
            }
        }
        gVar.f2025b = this.f2012w;
        gVar.f2026c = this.f2013x;
        gVar.f2027d = this.f2014y;
        gVar.f2028e = this.f2015z;
        return gVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x005d  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            r0.c r0 = r6.f2005g
            r0.F(r7)
            r0.c r0 = r6.f2006h
            r0.F(r7)
            int r0 = r7.getAction()
            r0 = r0 & 255(0xff, float:3.57E-43)
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L62
            if (r0 == r2) goto L20
            r7 = 3
            if (r0 == r7) goto L1a
            goto L70
        L1a:
            r6.i(r2)
            r6.A = r1
            goto L70
        L20:
            float r0 = r7.getX()
            float r7 = r7.getY()
            r0.c r3 = r6.f2005g
            int r4 = (int) r0
            int r5 = (int) r7
            android.view.View r3 = r3.t(r4, r5)
            if (r3 == 0) goto L5d
            boolean r3 = r6.B(r3)
            if (r3 == 0) goto L5d
            float r3 = r6.D
            float r0 = r0 - r3
            float r3 = r6.E
            float r7 = r7 - r3
            r0.c r3 = r6.f2005g
            int r3 = r3.z()
            float r0 = r0 * r0
            float r7 = r7 * r7
            float r0 = r0 + r7
            int r3 = r3 * r3
            float r7 = (float) r3
            int r7 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r7 >= 0) goto L5d
            android.view.View r7 = r6.o()
            if (r7 == 0) goto L5d
            int r7 = r6.r(r7)
            r0 = 2
            if (r7 != r0) goto L5e
        L5d:
            r1 = 1
        L5e:
            r6.i(r1)
            goto L70
        L62:
            float r0 = r7.getX()
            float r7 = r7.getY()
            r6.D = r0
            r6.E = r7
            r6.A = r1
        L70:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.drawerlayout.widget.DrawerLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    View p() {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (E(childAt) && G(childAt)) {
                return childAt;
            }
        }
        return null;
    }

    public int q(int i10) {
        int iC = o0.C(this);
        if (i10 == 3) {
            int i11 = this.f2012w;
            if (i11 != 3) {
                return i11;
            }
            int i12 = iC == 0 ? this.f2014y : this.f2015z;
            if (i12 != 3) {
                return i12;
            }
            return 0;
        }
        if (i10 == 5) {
            int i13 = this.f2013x;
            if (i13 != 3) {
                return i13;
            }
            int i14 = iC == 0 ? this.f2015z : this.f2014y;
            if (i14 != 3) {
                return i14;
            }
            return 0;
        }
        if (i10 == 8388611) {
            int i15 = this.f2014y;
            if (i15 != 3) {
                return i15;
            }
            int i16 = iC == 0 ? this.f2012w : this.f2013x;
            if (i16 != 3) {
                return i16;
            }
            return 0;
        }
        if (i10 != 8388613) {
            return 0;
        }
        int i17 = this.f2015z;
        if (i17 != 3) {
            return i17;
        }
        int i18 = iC == 0 ? this.f2013x : this.f2012w;
        if (i18 != 3) {
            return i18;
        }
        return 0;
    }

    public int r(View view) {
        if (E(view)) {
            return q(((f) view.getLayoutParams()).f2020a);
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z10) {
        super.requestDisallowInterceptTouchEvent(z10);
        if (z10) {
            i(true);
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (this.f2010u) {
            return;
        }
        super.requestLayout();
    }

    public CharSequence s(int i10) {
        int iB = l.b(i10, o0.C(this));
        if (iB == 3) {
            return this.I;
        }
        if (iB == 5) {
            return this.J;
        }
        return null;
    }

    public void setDrawerElevation(float f10) {
        this.f2000b = f10;
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (E(childAt)) {
                o0.t0(childAt, this.f2000b);
            }
        }
    }

    @Deprecated
    public void setDrawerListener(e eVar) {
        e eVar2 = this.B;
        if (eVar2 != null) {
            O(eVar2);
        }
        if (eVar != null) {
            a(eVar);
        }
        this.B = eVar;
    }

    public void setDrawerLockMode(int i10) {
        T(i10, 3);
        T(i10, 5);
    }

    public void setScrimColor(int i10) {
        this.f2002d = i10;
        invalidate();
    }

    public void setStatusBarBackground(Drawable drawable) {
        this.F = drawable;
        invalidate();
    }

    public void setStatusBarBackgroundColor(int i10) {
        this.F = new ColorDrawable(i10);
        invalidate();
    }

    int t(View view) {
        return l.b(((f) view.getLayoutParams()).f2020a, o0.C(this));
    }

    float u(View view) {
        return ((f) view.getLayoutParams()).f2021b;
    }

    public DrawerLayout(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f1999a = new d();
        this.f2002d = -1728053248;
        this.f2004f = new Paint();
        this.f2011v = true;
        this.f2012w = 3;
        this.f2013x = 3;
        this.f2014y = 3;
        this.f2015z = 3;
        this.M = null;
        this.N = null;
        this.O = null;
        this.P = null;
        this.T = new a();
        setDescendantFocusability(262144);
        float f10 = getResources().getDisplayMetrics().density;
        this.f2001c = (int) ((64.0f * f10) + 0.5f);
        float f11 = f10 * 400.0f;
        h hVar = new h(3);
        this.f2007r = hVar;
        h hVar2 = new h(5);
        this.f2008s = hVar2;
        r0.c cVarN = r0.c.n(this, 1.0f, hVar);
        this.f2005g = cVarN;
        cVarN.M(1);
        cVarN.N(f11);
        hVar.q(cVarN);
        r0.c cVarN2 = r0.c.n(this, 1.0f, hVar2);
        this.f2006h = cVarN2;
        cVarN2.M(2);
        cVarN2.N(f11);
        hVar2.q(cVarN2);
        setFocusableInTouchMode(true);
        o0.u0(this, 1);
        o0.n0(this, new c());
        setMotionEventSplittingEnabled(false);
        if (o0.z(this)) {
            setOnApplyWindowInsetsListener(new b());
            setSystemUiVisibility(1280);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(U);
            try {
                this.F = typedArrayObtainStyledAttributes.getDrawable(0);
            } finally {
                typedArrayObtainStyledAttributes.recycle();
            }
        }
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, s0.c.f26308b, i10, 0);
        try {
            int i11 = s0.c.f26309c;
            if (typedArrayObtainStyledAttributes2.hasValue(i11)) {
                this.f2000b = typedArrayObtainStyledAttributes2.getDimension(i11, 0.0f);
            } else {
                this.f2000b = getResources().getDimension(s0.b.f26306a);
            }
            typedArrayObtainStyledAttributes2.recycle();
            this.Q = new ArrayList();
        } catch (Throwable th2) {
            typedArrayObtainStyledAttributes2.recycle();
            throw th2;
        }
    }

    public void setStatusBarBackground(int i10) {
        this.F = i10 != 0 ? b0.b.d(getContext(), i10) : null;
        invalidate();
    }

    public static class f extends ViewGroup.MarginLayoutParams {

        /* JADX INFO: renamed from: a */
        public int f2020a;

        /* JADX INFO: renamed from: b */
        float f2021b;

        /* JADX INFO: renamed from: c */
        boolean f2022c;

        /* JADX INFO: renamed from: d */
        int f2023d;

        public f(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f2020a = 0;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, DrawerLayout.V);
            this.f2020a = typedArrayObtainStyledAttributes.getInt(0, 0);
            typedArrayObtainStyledAttributes.recycle();
        }

        public f(int i10, int i11) {
            super(i10, i11);
            this.f2020a = 0;
        }

        public f(f fVar) {
            super((ViewGroup.MarginLayoutParams) fVar);
            this.f2020a = 0;
            this.f2020a = fVar.f2020a;
        }

        public f(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f2020a = 0;
        }

        public f(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f2020a = 0;
        }
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new f(getContext(), attributeSet);
    }

    protected static class g extends q0.a {
        public static final Parcelable.Creator<g> CREATOR = new a();

        /* JADX INFO: renamed from: a */
        int f2024a;

        /* JADX INFO: renamed from: b */
        int f2025b;

        /* JADX INFO: renamed from: c */
        int f2026c;

        /* JADX INFO: renamed from: d */
        int f2027d;

        /* JADX INFO: renamed from: e */
        int f2028e;

        class a implements Parcelable.ClassLoaderCreator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a */
            public g createFromParcel(Parcel parcel) {
                return new g(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* JADX INFO: renamed from: b */
            public g createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new g(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: c */
            public g[] newArray(int i10) {
                return new g[i10];
            }
        }

        public g(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f2024a = 0;
            this.f2024a = parcel.readInt();
            this.f2025b = parcel.readInt();
            this.f2026c = parcel.readInt();
            this.f2027d = parcel.readInt();
            this.f2028e = parcel.readInt();
        }

        @Override // q0.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f2024a);
            parcel.writeInt(this.f2025b);
            parcel.writeInt(this.f2026c);
            parcel.writeInt(this.f2027d);
            parcel.writeInt(this.f2028e);
        }

        public g(Parcelable parcelable) {
            super(parcelable);
            this.f2024a = 0;
        }
    }
}
