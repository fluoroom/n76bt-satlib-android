package androidx.recyclerview.widget;

import android.R;
import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Observable;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.Trace;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import androidx.appcompat.widget.ActivityChooserView;
import androidx.appcompat.widget.RtlSpacingHelper;
import androidx.recyclerview.widget.a;
import androidx.recyclerview.widget.b;
import androidx.recyclerview.widget.e;
import androidx.recyclerview.widget.k;
import androidx.recyclerview.widget.o;
import androidx.recyclerview.widget.p;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import com.tencent.mm.opensdk.modelmsg.WXVideoFileObject;
import j$.util.DesugarCollections;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import m0.o0;
import m0.r0;
import n0.x;

/* JADX INFO: loaded from: classes.dex */
public class RecyclerView extends ViewGroup implements m0.w {
    static boolean N0 = false;
    static boolean O0 = false;
    private static final int[] P0 = {R.attr.nestedScrollingEnabled};
    private static final float Q0 = (float) (Math.log(0.78d) / Math.log(0.9d));
    static final boolean R0;
    static final boolean S0;
    static final boolean T0;
    private static final Class[] U0;
    static final Interpolator V0;
    static final c0 W0;
    private t A;
    private m0.x A0;
    boolean B;
    private final int[] B0;
    boolean C;
    private final int[] C0;
    boolean D;
    final int[] D0;
    boolean E;
    final List E0;
    private int F;
    private Runnable F0;
    boolean G;
    private boolean G0;
    boolean H;
    private int H0;
    private boolean I;
    private int I0;
    private int J;
    boolean J0;
    boolean K;
    private final p.b K0;
    private final AccessibilityManager L;
    private final m0.i L0;
    private List M;
    m0.h M0;
    boolean N;
    boolean O;
    private int P;
    private int Q;
    private m R;
    private EdgeEffect S;
    private EdgeEffect T;
    private EdgeEffect U;
    private EdgeEffect V;
    n W;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f2877a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private int f2878a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final y f2879b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private int f2880b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final w f2881c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private VelocityTracker f2882c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    z f2883d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private int f2884d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    androidx.recyclerview.widget.a f2885e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private int f2886e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    androidx.recyclerview.widget.b f2887f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    private int f2888f0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final androidx.recyclerview.widget.p f2889g;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    private int f2890g0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    boolean f2891h;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    private int f2892h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    private s f2893i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    private final int f2894j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    private final int f2895k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    float f2896l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    float f2897m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    private boolean f2898n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    final e0 f2899o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    androidx.recyclerview.widget.e f2900p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    e.b f2901q0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    final Runnable f2902r;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    final b0 f2903r0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    final Rect f2904s;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    private u f2905s0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Rect f2906t;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    private List f2907t0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    final RectF f2908u;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    boolean f2909u0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    h f2910v;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    boolean f2911v0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    q f2912w;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    private n.a f2913w0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    final List f2914x;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    boolean f2915x0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    final ArrayList f2916y;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    androidx.recyclerview.widget.k f2917y0;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final ArrayList f2918z;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    private final int[] f2919z0;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            RecyclerView recyclerView = RecyclerView.this;
            if (!recyclerView.E || recyclerView.isLayoutRequested()) {
                return;
            }
            RecyclerView recyclerView2 = RecyclerView.this;
            if (!recyclerView2.B) {
                recyclerView2.requestLayout();
            } else if (recyclerView2.H) {
                recyclerView2.G = true;
            } else {
                recyclerView2.B();
            }
        }
    }

    public static abstract class a0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private RecyclerView f2922b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private q f2923c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f2924d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f2925e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private View f2926f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private boolean f2928h;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f2921a = -1;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final a f2927g = new a(0, 0);

        public static class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private int f2929a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private int f2930b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private int f2931c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private int f2932d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private Interpolator f2933e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private boolean f2934f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            private int f2935g;

            public a(int i10, int i11) {
                this(i10, i11, RtlSpacingHelper.UNDEFINED, null);
            }

            private void e() {
                if (this.f2933e != null && this.f2931c < 1) {
                    throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
                }
                if (this.f2931c < 1) {
                    throw new IllegalStateException("Scroll duration must be a positive number");
                }
            }

            boolean a() {
                return this.f2932d >= 0;
            }

            public void b(int i10) {
                this.f2932d = i10;
            }

            void c(RecyclerView recyclerView) {
                int i10 = this.f2932d;
                if (i10 >= 0) {
                    this.f2932d = -1;
                    recyclerView.H0(i10);
                    this.f2934f = false;
                } else {
                    if (!this.f2934f) {
                        this.f2935g = 0;
                        return;
                    }
                    e();
                    recyclerView.f2899o0.e(this.f2929a, this.f2930b, this.f2931c, this.f2933e);
                    int i11 = this.f2935g + 1;
                    this.f2935g = i11;
                    if (i11 > 10) {
                        Log.e("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
                    }
                    this.f2934f = false;
                }
            }

            public void d(int i10, int i11, int i12, Interpolator interpolator) {
                this.f2929a = i10;
                this.f2930b = i11;
                this.f2931c = i12;
                this.f2933e = interpolator;
                this.f2934f = true;
            }

            public a(int i10, int i11, int i12, Interpolator interpolator) {
                this.f2932d = -1;
                this.f2934f = false;
                this.f2935g = 0;
                this.f2929a = i10;
                this.f2930b = i11;
                this.f2931c = i12;
                this.f2933e = interpolator;
            }
        }

        public interface b {
            PointF c(int i10);
        }

        public PointF a(int i10) {
            Object objE = e();
            if (objE instanceof b) {
                return ((b) objE).c(i10);
            }
            Log.w("RecyclerView", "You should override computeScrollVectorForPosition when the LayoutManager does not implement " + b.class.getCanonicalName());
            return null;
        }

        public View b(int i10) {
            return this.f2922b.f2912w.H(i10);
        }

        public int c() {
            return this.f2922b.f2912w.O();
        }

        public int d(View view) {
            return this.f2922b.n0(view);
        }

        public q e() {
            return this.f2923c;
        }

        public int f() {
            return this.f2921a;
        }

        public boolean g() {
            return this.f2924d;
        }

        public boolean h() {
            return this.f2925e;
        }

        protected void i(PointF pointF) {
            float f10 = pointF.x;
            float f11 = pointF.y;
            float fSqrt = (float) Math.sqrt((f10 * f10) + (f11 * f11));
            pointF.x /= fSqrt;
            pointF.y /= fSqrt;
        }

        void j(int i10, int i11) {
            PointF pointFA;
            RecyclerView recyclerView = this.f2922b;
            if (this.f2921a == -1 || recyclerView == null) {
                r();
            }
            if (this.f2924d && this.f2926f == null && this.f2923c != null && (pointFA = a(this.f2921a)) != null) {
                float f10 = pointFA.x;
                if (f10 != 0.0f || pointFA.y != 0.0f) {
                    recyclerView.u1((int) Math.signum(f10), (int) Math.signum(pointFA.y), null);
                }
            }
            this.f2924d = false;
            View view = this.f2926f;
            if (view != null) {
                if (d(view) == this.f2921a) {
                    o(this.f2926f, recyclerView.f2903r0, this.f2927g);
                    this.f2927g.c(recyclerView);
                    r();
                } else {
                    Log.e("RecyclerView", "Passed over target position while smooth scrolling.");
                    this.f2926f = null;
                }
            }
            if (this.f2925e) {
                l(i10, i11, recyclerView.f2903r0, this.f2927g);
                boolean zA = this.f2927g.a();
                this.f2927g.c(recyclerView);
                if (zA && this.f2925e) {
                    this.f2924d = true;
                    recyclerView.f2899o0.d();
                }
            }
        }

        protected void k(View view) {
            if (d(view) == f()) {
                this.f2926f = view;
                if (RecyclerView.O0) {
                    Log.d("RecyclerView", "smooth scroll target view has been attached");
                }
            }
        }

        protected abstract void l(int i10, int i11, b0 b0Var, a aVar);

        protected abstract void m();

        protected abstract void n();

        protected abstract void o(View view, b0 b0Var, a aVar);

        public void p(int i10) {
            this.f2921a = i10;
        }

        void q(RecyclerView recyclerView, q qVar) {
            recyclerView.f2899o0.f();
            if (this.f2928h) {
                Log.w("RecyclerView", "An instance of " + getClass().getSimpleName() + " was started more than once. Each instance of" + getClass().getSimpleName() + " is intended to only be used once. You should create a new instance for each use.");
            }
            this.f2922b = recyclerView;
            this.f2923c = qVar;
            int i10 = this.f2921a;
            if (i10 == -1) {
                throw new IllegalArgumentException("Invalid target position");
            }
            recyclerView.f2903r0.f2937a = i10;
            this.f2925e = true;
            this.f2924d = true;
            this.f2926f = b(f());
            m();
            this.f2922b.f2899o0.d();
            this.f2928h = true;
        }

        protected final void r() {
            if (this.f2925e) {
                this.f2925e = false;
                n();
                this.f2922b.f2903r0.f2937a = -1;
                this.f2926f = null;
                this.f2921a = -1;
                this.f2924d = false;
                this.f2923c.k1(this);
                this.f2923c = null;
                this.f2922b = null;
            }
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            n nVar = RecyclerView.this.W;
            if (nVar != null) {
                nVar.u();
            }
            RecyclerView.this.f2915x0 = false;
        }
    }

    public static class b0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private SparseArray f2938b;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f2949m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        long f2950n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        int f2951o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f2952p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f2953q;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f2937a = -1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f2939c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f2940d = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f2941e = 1;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f2942f = 0;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        boolean f2943g = false;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        boolean f2944h = false;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        boolean f2945i = false;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        boolean f2946j = false;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        boolean f2947k = false;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        boolean f2948l = false;

        void a(int i10) {
            if ((this.f2941e & i10) != 0) {
                return;
            }
            throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i10) + " but it is " + Integer.toBinaryString(this.f2941e));
        }

        public int b() {
            return this.f2944h ? this.f2939c - this.f2940d : this.f2942f;
        }

        public int c() {
            return this.f2937a;
        }

        public boolean d() {
            return this.f2937a != -1;
        }

        public boolean e() {
            return this.f2944h;
        }

        void f(h hVar) {
            this.f2941e = 1;
            this.f2942f = hVar.f();
            this.f2944h = false;
            this.f2945i = false;
            this.f2946j = false;
        }

        public boolean g() {
            return this.f2948l;
        }

        public String toString() {
            return "State{mTargetPosition=" + this.f2937a + ", mData=" + this.f2938b + ", mItemCount=" + this.f2942f + ", mIsMeasuring=" + this.f2946j + ", mPreviousLayoutItemCount=" + this.f2939c + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.f2940d + ", mStructureChanged=" + this.f2943g + ", mInPreLayout=" + this.f2944h + ", mRunSimpleAnimations=" + this.f2947k + ", mRunPredictiveAnimations=" + this.f2948l + '}';
        }
    }

    class c implements Interpolator {
        c() {
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f10) {
            float f11 = f10 - 1.0f;
            return (f11 * f11 * f11 * f11 * f11) + 1.0f;
        }
    }

    static class c0 extends m {
        c0() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.m
        protected EdgeEffect a(RecyclerView recyclerView, int i10) {
            return new EdgeEffect(recyclerView.getContext());
        }
    }

    class d implements p.b {
        d() {
        }

        @Override // androidx.recyclerview.widget.p.b
        public void a(f0 f0Var) {
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.f2912w.r1(f0Var.f2964a, recyclerView.f2881c);
        }

        @Override // androidx.recyclerview.widget.p.b
        public void b(f0 f0Var, n.b bVar, n.b bVar2) {
            RecyclerView.this.p(f0Var, bVar, bVar2);
        }

        @Override // androidx.recyclerview.widget.p.b
        public void c(f0 f0Var, n.b bVar, n.b bVar2) {
            RecyclerView.this.f2881c.O(f0Var);
            RecyclerView.this.r(f0Var, bVar, bVar2);
        }

        @Override // androidx.recyclerview.widget.p.b
        public void d(f0 f0Var, n.b bVar, n.b bVar2) {
            f0Var.I(false);
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.N) {
                if (recyclerView.W.b(f0Var, f0Var, bVar, bVar2)) {
                    RecyclerView.this.Y0();
                }
            } else if (recyclerView.W.d(f0Var, bVar, bVar2)) {
                RecyclerView.this.Y0();
            }
        }
    }

    public static abstract class d0 {
    }

    class e implements m0.i {
        e() {
        }

        @Override // m0.i
        public boolean a(float f10) {
            int i10;
            int i11;
            if (RecyclerView.this.f2912w.q()) {
                i11 = (int) f10;
                i10 = 0;
            } else {
                i10 = RecyclerView.this.f2912w.p() ? (int) f10 : 0;
                i11 = 0;
            }
            if (i10 == 0 && i11 == 0) {
                return false;
            }
            RecyclerView.this.L1();
            return RecyclerView.this.j0(i10, i11);
        }

        @Override // m0.i
        public float b() {
            float f10;
            if (RecyclerView.this.f2912w.q()) {
                f10 = RecyclerView.this.f2897m0;
            } else {
                if (!RecyclerView.this.f2912w.p()) {
                    return 0.0f;
                }
                f10 = RecyclerView.this.f2896l0;
            }
            return -f10;
        }

        @Override // m0.i
        public void c() {
            RecyclerView.this.L1();
        }
    }

    class e0 implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f2956a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f2957b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        OverScroller f2958c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Interpolator f2959d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f2960e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f2961f;

        e0() {
            Interpolator interpolator = RecyclerView.V0;
            this.f2959d = interpolator;
            this.f2960e = false;
            this.f2961f = false;
            this.f2958c = new OverScroller(RecyclerView.this.getContext(), interpolator);
        }

        private int a(int i10, int i11) {
            int iAbs = Math.abs(i10);
            int iAbs2 = Math.abs(i11);
            boolean z10 = iAbs > iAbs2;
            RecyclerView recyclerView = RecyclerView.this;
            int width = z10 ? recyclerView.getWidth() : recyclerView.getHeight();
            if (!z10) {
                iAbs = iAbs2;
            }
            return Math.min((int) (((iAbs / width) + 1.0f) * 300.0f), 2000);
        }

        private void c() {
            RecyclerView.this.removeCallbacks(this);
            o0.e0(RecyclerView.this, this);
        }

        public void b(int i10, int i11) {
            RecyclerView.this.setScrollState(2);
            this.f2957b = 0;
            this.f2956a = 0;
            Interpolator interpolator = this.f2959d;
            Interpolator interpolator2 = RecyclerView.V0;
            if (interpolator != interpolator2) {
                this.f2959d = interpolator2;
                this.f2958c = new OverScroller(RecyclerView.this.getContext(), interpolator2);
            }
            this.f2958c.fling(0, 0, i10, i11, RtlSpacingHelper.UNDEFINED, ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED, RtlSpacingHelper.UNDEFINED, ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED);
            d();
        }

        void d() {
            if (this.f2960e) {
                this.f2961f = true;
            } else {
                c();
            }
        }

        public void e(int i10, int i11, int i12, Interpolator interpolator) {
            if (i12 == Integer.MIN_VALUE) {
                i12 = a(i10, i11);
            }
            int i13 = i12;
            if (interpolator == null) {
                interpolator = RecyclerView.V0;
            }
            if (this.f2959d != interpolator) {
                this.f2959d = interpolator;
                this.f2958c = new OverScroller(RecyclerView.this.getContext(), interpolator);
            }
            this.f2957b = 0;
            this.f2956a = 0;
            RecyclerView.this.setScrollState(2);
            this.f2958c.startScroll(0, 0, i10, i11, i13);
            if (Build.VERSION.SDK_INT < 23) {
                this.f2958c.computeScrollOffset();
            }
            d();
        }

        public void f() {
            RecyclerView.this.removeCallbacks(this);
            this.f2958c.abortAnimation();
        }

        @Override // java.lang.Runnable
        public void run() {
            int i10;
            int i11;
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.f2912w == null) {
                f();
                return;
            }
            this.f2961f = false;
            this.f2960e = true;
            recyclerView.B();
            OverScroller overScroller = this.f2958c;
            if (overScroller.computeScrollOffset()) {
                int currX = overScroller.getCurrX();
                int currY = overScroller.getCurrY();
                int i12 = currX - this.f2956a;
                int i13 = currY - this.f2957b;
                this.f2956a = currX;
                this.f2957b = currY;
                int iY = RecyclerView.this.y(i12);
                int iA = RecyclerView.this.A(i13);
                RecyclerView recyclerView2 = RecyclerView.this;
                int[] iArr = recyclerView2.D0;
                iArr[0] = 0;
                iArr[1] = 0;
                if (recyclerView2.M(iY, iA, iArr, null, 1)) {
                    int[] iArr2 = RecyclerView.this.D0;
                    iY -= iArr2[0];
                    iA -= iArr2[1];
                }
                if (RecyclerView.this.getOverScrollMode() != 2) {
                    RecyclerView.this.x(iY, iA);
                }
                RecyclerView recyclerView3 = RecyclerView.this;
                if (recyclerView3.f2910v != null) {
                    int[] iArr3 = recyclerView3.D0;
                    iArr3[0] = 0;
                    iArr3[1] = 0;
                    recyclerView3.u1(iY, iA, iArr3);
                    RecyclerView recyclerView4 = RecyclerView.this;
                    int[] iArr4 = recyclerView4.D0;
                    int i14 = iArr4[0];
                    int i15 = iArr4[1];
                    iY -= i14;
                    iA -= i15;
                    a0 a0Var = recyclerView4.f2912w.f3006g;
                    if (a0Var != null && !a0Var.g() && a0Var.h()) {
                        int iB = RecyclerView.this.f2903r0.b();
                        if (iB == 0) {
                            a0Var.r();
                        } else if (a0Var.f() >= iB) {
                            a0Var.p(iB - 1);
                            a0Var.j(i14, i15);
                        } else {
                            a0Var.j(i14, i15);
                        }
                    }
                    i11 = i15;
                    i10 = i14;
                } else {
                    i10 = 0;
                    i11 = 0;
                }
                int i16 = iY;
                int i17 = iA;
                if (!RecyclerView.this.f2916y.isEmpty()) {
                    RecyclerView.this.invalidate();
                }
                RecyclerView recyclerView5 = RecyclerView.this;
                int[] iArr5 = recyclerView5.D0;
                iArr5[0] = 0;
                iArr5[1] = 0;
                recyclerView5.N(i10, i11, i16, i17, null, 1, iArr5);
                RecyclerView recyclerView6 = RecyclerView.this;
                int[] iArr6 = recyclerView6.D0;
                int i18 = i16 - iArr6[0];
                int i19 = i17 - iArr6[1];
                if (i10 != 0 || i11 != 0) {
                    recyclerView6.P(i10, i11);
                }
                if (!RecyclerView.this.awakenScrollBars()) {
                    RecyclerView.this.invalidate();
                }
                boolean z10 = overScroller.isFinished() || (((overScroller.getCurrX() == overScroller.getFinalX()) || i18 != 0) && ((overScroller.getCurrY() == overScroller.getFinalY()) || i19 != 0));
                a0 a0Var2 = RecyclerView.this.f2912w.f3006g;
                if ((a0Var2 == null || !a0Var2.g()) && z10) {
                    if (RecyclerView.this.getOverScrollMode() != 2) {
                        int currVelocity = (int) overScroller.getCurrVelocity();
                        int i20 = i18 < 0 ? -currVelocity : i18 > 0 ? currVelocity : 0;
                        if (i19 < 0) {
                            currVelocity = -currVelocity;
                        } else if (i19 <= 0) {
                            currVelocity = 0;
                        }
                        RecyclerView.this.d(i20, currVelocity);
                    }
                    if (RecyclerView.T0) {
                        RecyclerView.this.f2901q0.b();
                    }
                } else {
                    d();
                    RecyclerView recyclerView7 = RecyclerView.this;
                    androidx.recyclerview.widget.e eVar = recyclerView7.f2900p0;
                    if (eVar != null) {
                        eVar.f(recyclerView7, i10, i11);
                    }
                }
                if (Build.VERSION.SDK_INT >= 35) {
                    k.a(RecyclerView.this, Math.abs(overScroller.getCurrVelocity()));
                }
            }
            a0 a0Var3 = RecyclerView.this.f2912w.f3006g;
            if (a0Var3 != null && a0Var3.g()) {
                a0Var3.j(0, 0);
            }
            this.f2960e = false;
            if (this.f2961f) {
                c();
            } else {
                RecyclerView.this.setScrollState(0);
                RecyclerView.this.K1(1);
            }
        }
    }

    class f implements b.InterfaceC0042b {
        f() {
        }

        @Override // androidx.recyclerview.widget.b.InterfaceC0042b
        public View a(int i10) {
            return RecyclerView.this.getChildAt(i10);
        }

        @Override // androidx.recyclerview.widget.b.InterfaceC0042b
        public void b(View view) {
            f0 f0VarP0 = RecyclerView.p0(view);
            if (f0VarP0 != null) {
                f0VarP0.D(RecyclerView.this);
            }
        }

        @Override // androidx.recyclerview.widget.b.InterfaceC0042b
        public int c() {
            return RecyclerView.this.getChildCount();
        }

        @Override // androidx.recyclerview.widget.b.InterfaceC0042b
        public void d() {
            int iC = c();
            for (int i10 = 0; i10 < iC; i10++) {
                View viewA = a(i10);
                RecyclerView.this.G(viewA);
                viewA.clearAnimation();
            }
            RecyclerView.this.removeAllViews();
        }

        @Override // androidx.recyclerview.widget.b.InterfaceC0042b
        public int e(View view) {
            return RecyclerView.this.indexOfChild(view);
        }

        @Override // androidx.recyclerview.widget.b.InterfaceC0042b
        public f0 f(View view) {
            return RecyclerView.p0(view);
        }

        @Override // androidx.recyclerview.widget.b.InterfaceC0042b
        public void g(int i10) {
            View viewA = a(i10);
            if (viewA != null) {
                f0 f0VarP0 = RecyclerView.p0(viewA);
                if (f0VarP0 != null) {
                    if (f0VarP0.z() && !f0VarP0.L()) {
                        throw new IllegalArgumentException("called detach on an already detached child " + f0VarP0 + RecyclerView.this.W());
                    }
                    if (RecyclerView.O0) {
                        Log.d("RecyclerView", "tmpDetach " + f0VarP0);
                    }
                    f0VarP0.b(256);
                }
            } else if (RecyclerView.N0) {
                throw new IllegalArgumentException("No view at offset " + i10 + RecyclerView.this.W());
            }
            RecyclerView.this.detachViewFromParent(i10);
        }

        @Override // androidx.recyclerview.widget.b.InterfaceC0042b
        public void h(View view) {
            f0 f0VarP0 = RecyclerView.p0(view);
            if (f0VarP0 != null) {
                f0VarP0.E(RecyclerView.this);
            }
        }

        @Override // androidx.recyclerview.widget.b.InterfaceC0042b
        public void i(View view, int i10) {
            RecyclerView.this.addView(view, i10);
            RecyclerView.this.F(view);
        }

        @Override // androidx.recyclerview.widget.b.InterfaceC0042b
        public void j(int i10) {
            View childAt = RecyclerView.this.getChildAt(i10);
            if (childAt != null) {
                RecyclerView.this.G(childAt);
                childAt.clearAnimation();
            }
            RecyclerView.this.removeViewAt(i10);
        }

        @Override // androidx.recyclerview.widget.b.InterfaceC0042b
        public void k(View view, int i10, ViewGroup.LayoutParams layoutParams) {
            f0 f0VarP0 = RecyclerView.p0(view);
            if (f0VarP0 != null) {
                if (!f0VarP0.z() && !f0VarP0.L()) {
                    throw new IllegalArgumentException("Called attach on a child which is not detached: " + f0VarP0 + RecyclerView.this.W());
                }
                if (RecyclerView.O0) {
                    Log.d("RecyclerView", "reAttach " + f0VarP0);
                }
                f0VarP0.f();
            } else if (RecyclerView.N0) {
                throw new IllegalArgumentException("No ViewHolder found for child: " + view + ", index: " + i10 + RecyclerView.this.W());
            }
            RecyclerView.this.attachViewToParent(view, i10, layoutParams);
        }
    }

    public static abstract class f0 {
        private static final List C = Collections.EMPTY_LIST;
        RecyclerView A;
        h B;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final View f2964a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        WeakReference f2965b;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f2973s;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f2966c = -1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f2967d = -1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        long f2968e = -1;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f2969f = -1;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f2970g = -1;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        f0 f2971h = null;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        f0 f2972r = null;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        List f2974t = null;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        List f2975u = null;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        private int f2976v = 0;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        w f2977w = null;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        boolean f2978x = false;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        private int f2979y = 0;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        int f2980z = -1;

        public f0(View view) {
            if (view == null) {
                throw new IllegalArgumentException("itemView may not be null");
            }
            this.f2964a = view;
        }

        private void g() {
            if (this.f2974t == null) {
                ArrayList arrayList = new ArrayList();
                this.f2974t = arrayList;
                this.f2975u = DesugarCollections.unmodifiableList(arrayList);
            }
        }

        boolean A() {
            return (this.f2973s & 2) != 0;
        }

        boolean B() {
            return (this.f2973s & 2) != 0;
        }

        void C(int i10, boolean z10) {
            if (this.f2967d == -1) {
                this.f2967d = this.f2966c;
            }
            if (this.f2970g == -1) {
                this.f2970g = this.f2966c;
            }
            if (z10) {
                this.f2970g += i10;
            }
            this.f2966c += i10;
            if (this.f2964a.getLayoutParams() != null) {
                ((r) this.f2964a.getLayoutParams()).f3026c = true;
            }
        }

        void D(RecyclerView recyclerView) {
            int i10 = this.f2980z;
            if (i10 != -1) {
                this.f2979y = i10;
            } else {
                this.f2979y = this.f2964a.getImportantForAccessibility();
            }
            recyclerView.x1(this, 4);
        }

        void E(RecyclerView recyclerView) {
            recyclerView.x1(this, this.f2979y);
            this.f2979y = 0;
        }

        void F() {
            if (RecyclerView.N0 && z()) {
                throw new IllegalStateException("Attempting to reset temp-detached ViewHolder: " + this + ". ViewHolders should be fully detached before resetting.");
            }
            this.f2973s = 0;
            this.f2966c = -1;
            this.f2967d = -1;
            this.f2968e = -1L;
            this.f2970g = -1;
            this.f2976v = 0;
            this.f2971h = null;
            this.f2972r = null;
            d();
            this.f2979y = 0;
            this.f2980z = -1;
            RecyclerView.v(this);
        }

        void G() {
            if (this.f2967d == -1) {
                this.f2967d = this.f2966c;
            }
        }

        void H(int i10, int i11) {
            this.f2973s = (i10 & i11) | (this.f2973s & (~i11));
        }

        public final void I(boolean z10) {
            int i10 = this.f2976v;
            int i11 = z10 ? i10 - 1 : i10 + 1;
            this.f2976v = i11;
            if (i11 < 0) {
                this.f2976v = 0;
                if (RecyclerView.N0) {
                    throw new RuntimeException("isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
                }
                Log.e("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
            } else if (!z10 && i11 == 1) {
                this.f2973s |= 16;
            } else if (z10 && i11 == 0) {
                this.f2973s &= -17;
            }
            if (RecyclerView.O0) {
                Log.d("RecyclerView", "setIsRecyclable val:" + z10 + ":" + this);
            }
        }

        void J(w wVar, boolean z10) {
            this.f2977w = wVar;
            this.f2978x = z10;
        }

        boolean K() {
            return (this.f2973s & 16) != 0;
        }

        boolean L() {
            return (this.f2973s & 128) != 0;
        }

        void M() {
            this.f2977w.O(this);
        }

        boolean N() {
            return (this.f2973s & 32) != 0;
        }

        void a(Object obj) {
            if (obj == null) {
                b(WXMediaMessage.DESCRIPTION_LENGTH_LIMIT);
            } else if ((1024 & this.f2973s) == 0) {
                g();
                this.f2974t.add(obj);
            }
        }

        void b(int i10) {
            this.f2973s = i10 | this.f2973s;
        }

        void c() {
            this.f2967d = -1;
            this.f2970g = -1;
        }

        void d() {
            List list = this.f2974t;
            if (list != null) {
                list.clear();
            }
            this.f2973s &= -1025;
        }

        void e() {
            this.f2973s &= -33;
        }

        void f() {
            this.f2973s &= -257;
        }

        boolean h() {
            return (this.f2973s & 16) == 0 && o0.Q(this.f2964a);
        }

        void i(int i10, int i11, boolean z10) {
            b(8);
            C(i11, z10);
            this.f2966c = i10;
        }

        public final int j() {
            RecyclerView recyclerView = this.A;
            if (recyclerView == null) {
                return -1;
            }
            return recyclerView.k0(this);
        }

        public final int k() {
            return l();
        }

        public final int l() {
            RecyclerView recyclerView;
            h adapter;
            int iK0;
            if (this.B == null || (recyclerView = this.A) == null || (adapter = recyclerView.getAdapter()) == null || (iK0 = this.A.k0(this)) == -1) {
                return -1;
            }
            return adapter.e(this.B, this, iK0);
        }

        public final long m() {
            return this.f2968e;
        }

        public final int n() {
            return this.f2969f;
        }

        public final int o() {
            int i10 = this.f2970g;
            return i10 == -1 ? this.f2966c : i10;
        }

        public final int p() {
            return this.f2967d;
        }

        List q() {
            if ((this.f2973s & WXMediaMessage.DESCRIPTION_LENGTH_LIMIT) != 0) {
                return C;
            }
            List list = this.f2974t;
            return (list == null || list.size() == 0) ? C : this.f2975u;
        }

        boolean r(int i10) {
            return (i10 & this.f2973s) != 0;
        }

        boolean s() {
            return (this.f2973s & WXMediaMessage.TITLE_LENGTH_LIMIT) != 0 || v();
        }

        boolean t() {
            return (this.f2964a.getParent() == null || this.f2964a.getParent() == this.A) ? false : true;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder((getClass().isAnonymousClass() ? "ViewHolder" : getClass().getSimpleName()) + "{" + Integer.toHexString(hashCode()) + " position=" + this.f2966c + " id=" + this.f2968e + ", oldPos=" + this.f2967d + ", pLpos:" + this.f2970g);
            if (y()) {
                sb2.append(" scrap ");
                sb2.append(this.f2978x ? "[changeScrap]" : "[attachedScrap]");
            }
            if (v()) {
                sb2.append(" invalid");
            }
            if (!u()) {
                sb2.append(" unbound");
            }
            if (B()) {
                sb2.append(" update");
            }
            if (x()) {
                sb2.append(" removed");
            }
            if (L()) {
                sb2.append(" ignored");
            }
            if (z()) {
                sb2.append(" tmpDetached");
            }
            if (!w()) {
                sb2.append(" not recyclable(" + this.f2976v + ")");
            }
            if (s()) {
                sb2.append(" undefined adapter position");
            }
            if (this.f2964a.getParent() == null) {
                sb2.append(" no parent");
            }
            sb2.append("}");
            return sb2.toString();
        }

        boolean u() {
            return (this.f2973s & 1) != 0;
        }

        boolean v() {
            return (this.f2973s & 4) != 0;
        }

        public final boolean w() {
            return (this.f2973s & 16) == 0 && !o0.Q(this.f2964a);
        }

        boolean x() {
            return (this.f2973s & 8) != 0;
        }

        boolean y() {
            return this.f2977w != null;
        }

        boolean z() {
            return (this.f2973s & 256) != 0;
        }
    }

    class g implements a.InterfaceC0041a {
        g() {
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0041a
        public void a(int i10, int i11) {
            RecyclerView.this.O0(i10, i11);
            RecyclerView.this.f2909u0 = true;
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0041a
        public void b(a.b bVar) {
            i(bVar);
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0041a
        public void c(int i10, int i11, Object obj) {
            RecyclerView.this.N1(i10, i11, obj);
            RecyclerView.this.f2911v0 = true;
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0041a
        public void d(a.b bVar) {
            i(bVar);
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0041a
        public f0 e(int i10) {
            f0 f0VarG0 = RecyclerView.this.g0(i10, true);
            if (f0VarG0 == null) {
                return null;
            }
            if (!RecyclerView.this.f2887f.n(f0VarG0.f2964a)) {
                return f0VarG0;
            }
            if (RecyclerView.O0) {
                Log.d("RecyclerView", "assuming view holder cannot be find because it is hidden");
            }
            return null;
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0041a
        public void f(int i10, int i11) {
            RecyclerView.this.P0(i10, i11, false);
            RecyclerView.this.f2909u0 = true;
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0041a
        public void g(int i10, int i11) {
            RecyclerView.this.N0(i10, i11);
            RecyclerView.this.f2909u0 = true;
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0041a
        public void h(int i10, int i11) {
            RecyclerView.this.P0(i10, i11, true);
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.f2909u0 = true;
            recyclerView.f2903r0.f2940d += i11;
        }

        void i(a.b bVar) {
            int i10 = bVar.f3093a;
            if (i10 == 1) {
                RecyclerView recyclerView = RecyclerView.this;
                recyclerView.f2912w.W0(recyclerView, bVar.f3094b, bVar.f3096d);
                return;
            }
            if (i10 == 2) {
                RecyclerView recyclerView2 = RecyclerView.this;
                recyclerView2.f2912w.Z0(recyclerView2, bVar.f3094b, bVar.f3096d);
            } else if (i10 == 4) {
                RecyclerView recyclerView3 = RecyclerView.this;
                recyclerView3.f2912w.b1(recyclerView3, bVar.f3094b, bVar.f3096d, bVar.f3095c);
            } else {
                if (i10 != 8) {
                    return;
                }
                RecyclerView recyclerView4 = RecyclerView.this;
                recyclerView4.f2912w.Y0(recyclerView4, bVar.f3094b, bVar.f3096d, 1);
            }
        }
    }

    public static abstract class h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final i f2982a = new i();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f2983b = false;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private a f2984c = a.ALLOW;

        public enum a {
            ALLOW,
            PREVENT_WHEN_EMPTY,
            PREVENT
        }

        public void A(j jVar) {
            this.f2982a.registerObserver(jVar);
        }

        public void B(boolean z10) {
            if (i()) {
                throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
            }
            this.f2983b = z10;
        }

        public void C(j jVar) {
            this.f2982a.unregisterObserver(jVar);
        }

        public final void b(f0 f0Var, int i10) {
            boolean z10 = f0Var.B == null;
            if (z10) {
                f0Var.f2966c = i10;
                if (j()) {
                    f0Var.f2968e = g(i10);
                }
                f0Var.H(1, 519);
                if (i0.l.c()) {
                    Trace.beginSection(String.format("RV onBindViewHolder type=0x%X", Integer.valueOf(f0Var.f2969f)));
                }
            }
            f0Var.B = this;
            if (RecyclerView.N0) {
                if (f0Var.f2964a.getParent() == null && f0Var.f2964a.isAttachedToWindow() != f0Var.z()) {
                    throw new IllegalStateException("Temp-detached state out of sync with reality. holder.isTmpDetached(): " + f0Var.z() + ", attached to window: " + f0Var.f2964a.isAttachedToWindow() + ", holder: " + f0Var);
                }
                if (f0Var.f2964a.getParent() == null && f0Var.f2964a.isAttachedToWindow()) {
                    throw new IllegalStateException("Attempting to bind attached holder with no parent (AKA temp detached): " + f0Var);
                }
            }
            t(f0Var, i10, f0Var.q());
            if (z10) {
                f0Var.d();
                ViewGroup.LayoutParams layoutParams = f0Var.f2964a.getLayoutParams();
                if (layoutParams instanceof r) {
                    ((r) layoutParams).f3026c = true;
                }
                Trace.endSection();
            }
        }

        boolean c() {
            int iOrdinal = this.f2984c.ordinal();
            return iOrdinal != 1 ? iOrdinal != 2 : f() > 0;
        }

        public final f0 d(ViewGroup viewGroup, int i10) {
            try {
                if (i0.l.c()) {
                    Trace.beginSection(String.format("RV onCreateViewHolder type=0x%X", Integer.valueOf(i10)));
                }
                f0 f0VarU = u(viewGroup, i10);
                if (f0VarU.f2964a.getParent() != null) {
                    throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
                }
                f0VarU.f2969f = i10;
                Trace.endSection();
                return f0VarU;
            } catch (Throwable th2) {
                Trace.endSection();
                throw th2;
            }
        }

        public int e(h hVar, f0 f0Var, int i10) {
            if (hVar == this) {
                return i10;
            }
            return -1;
        }

        public abstract int f();

        public long g(int i10) {
            return -1L;
        }

        public int h(int i10) {
            return 0;
        }

        public final boolean i() {
            return this.f2982a.a();
        }

        public final boolean j() {
            return this.f2983b;
        }

        public final void k() {
            this.f2982a.b();
        }

        public final void l(int i10) {
            this.f2982a.c(i10, 1);
        }

        public final void m(int i10) {
            this.f2982a.e(i10, 1);
        }

        public final void n(int i10, int i11, Object obj) {
            this.f2982a.d(i10, i11, obj);
        }

        public final void o(int i10, int i11) {
            this.f2982a.e(i10, i11);
        }

        public final void p(int i10, int i11) {
            this.f2982a.f(i10, i11);
        }

        public final void q(int i10) {
            this.f2982a.f(i10, 1);
        }

        public void r(RecyclerView recyclerView) {
        }

        public abstract void s(f0 f0Var, int i10);

        public void t(f0 f0Var, int i10, List list) {
            s(f0Var, i10);
        }

        public abstract f0 u(ViewGroup viewGroup, int i10);

        public void v(RecyclerView recyclerView) {
        }

        public boolean w(f0 f0Var) {
            return false;
        }

        public void x(f0 f0Var) {
        }

        public void y(f0 f0Var) {
        }

        public void z(f0 f0Var) {
        }
    }

    static class i extends Observable {
        i() {
        }

        public boolean a() {
            return !((Observable) this).mObservers.isEmpty();
        }

        public void b() {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((j) ((Observable) this).mObservers.get(size)).a();
            }
        }

        public void c(int i10, int i11) {
            d(i10, i11, null);
        }

        public void d(int i10, int i11, Object obj) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((j) ((Observable) this).mObservers.get(size)).b(i10, i11, obj);
            }
        }

        public void e(int i10, int i11) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((j) ((Observable) this).mObservers.get(size)).c(i10, i11);
            }
        }

        public void f(int i10, int i11) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((j) ((Observable) this).mObservers.get(size)).d(i10, i11);
            }
        }
    }

    public static abstract class j {
        public abstract void a();

        public abstract void b(int i10, int i11, Object obj);

        public abstract void c(int i10, int i11);

        public abstract void d(int i10, int i11);
    }

    private static final class k {
        public static void a(View view, float f10) {
            try {
                view.setFrameContentVelocity(f10);
            } catch (LinkageError unused) {
            }
        }
    }

    public interface l {
    }

    public static class m {
        protected abstract EdgeEffect a(RecyclerView recyclerView, int i10);
    }

    public static abstract class n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private a f2989a = null;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private ArrayList f2990b = new ArrayList();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private long f2991c = 120;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private long f2992d = 120;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private long f2993e = 250;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private long f2994f = 250;

        interface a {
            void a(f0 f0Var);
        }

        public static class b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f2995a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int f2996b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public int f2997c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public int f2998d;

            public b a(f0 f0Var) {
                return b(f0Var, 0);
            }

            public b b(f0 f0Var, int i10) {
                View view = f0Var.f2964a;
                this.f2995a = view.getLeft();
                this.f2996b = view.getTop();
                this.f2997c = view.getRight();
                this.f2998d = view.getBottom();
                return this;
            }
        }

        static int e(f0 f0Var) {
            int i10 = f0Var.f2973s;
            int i11 = i10 & 14;
            if (f0Var.v()) {
                return 4;
            }
            if ((i10 & 4) == 0) {
                int iP = f0Var.p();
                int iJ = f0Var.j();
                if (iP != -1 && iJ != -1 && iP != iJ) {
                    return i11 | 2048;
                }
            }
            return i11;
        }

        public abstract boolean a(f0 f0Var, b bVar, b bVar2);

        public abstract boolean b(f0 f0Var, f0 f0Var2, b bVar, b bVar2);

        public abstract boolean c(f0 f0Var, b bVar, b bVar2);

        public abstract boolean d(f0 f0Var, b bVar, b bVar2);

        public abstract boolean f(f0 f0Var);

        public boolean g(f0 f0Var, List list) {
            return f(f0Var);
        }

        public final void h(f0 f0Var) {
            r(f0Var);
            a aVar = this.f2989a;
            if (aVar != null) {
                aVar.a(f0Var);
            }
        }

        public final void i() {
            if (this.f2990b.size() <= 0) {
                this.f2990b.clear();
            } else {
                android.support.v4.media.session.b.a(this.f2990b.get(0));
                throw null;
            }
        }

        public abstract void j(f0 f0Var);

        public abstract void k();

        public long l() {
            return this.f2991c;
        }

        public long m() {
            return this.f2994f;
        }

        public long n() {
            return this.f2993e;
        }

        public long o() {
            return this.f2992d;
        }

        public abstract boolean p();

        public b q() {
            return new b();
        }

        public void r(f0 f0Var) {
        }

        public b s(b0 b0Var, f0 f0Var) {
            return q().a(f0Var);
        }

        public b t(b0 b0Var, f0 f0Var, int i10, List list) {
            return q().a(f0Var);
        }

        public abstract void u();

        void v(a aVar) {
            this.f2989a = aVar;
        }
    }

    private class o implements n.a {
        o() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.n.a
        public void a(f0 f0Var) {
            f0Var.I(true);
            if (f0Var.f2971h != null && f0Var.f2972r == null) {
                f0Var.f2971h = null;
            }
            f0Var.f2972r = null;
            if (f0Var.K() || RecyclerView.this.j1(f0Var.f2964a) || !f0Var.z()) {
                return;
            }
            RecyclerView.this.removeDetachedView(f0Var.f2964a, false);
        }
    }

    public static abstract class p {
        public void d(Rect rect, int i10, RecyclerView recyclerView) {
            rect.set(0, 0, 0, 0);
        }

        public void e(Rect rect, View view, RecyclerView recyclerView, b0 b0Var) {
            d(rect, ((r) view.getLayoutParams()).a(), recyclerView);
        }

        public void f(Canvas canvas, RecyclerView recyclerView) {
        }

        public void g(Canvas canvas, RecyclerView recyclerView, b0 b0Var) {
            f(canvas, recyclerView);
        }

        public void h(Canvas canvas, RecyclerView recyclerView) {
        }

        public void i(Canvas canvas, RecyclerView recyclerView, b0 b0Var) {
            h(canvas, recyclerView);
        }
    }

    public static abstract class q {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        androidx.recyclerview.widget.b f3000a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        RecyclerView f3001b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final o.b f3002c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final o.b f3003d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        androidx.recyclerview.widget.o f3004e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        androidx.recyclerview.widget.o f3005f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        a0 f3006g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        boolean f3007h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        boolean f3008i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        boolean f3009j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private boolean f3010k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private boolean f3011l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f3012m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        boolean f3013n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private int f3014o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private int f3015p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private int f3016q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private int f3017r;

        class a implements o.b {
            a() {
            }

            @Override // androidx.recyclerview.widget.o.b
            public View a(int i10) {
                return q.this.N(i10);
            }

            @Override // androidx.recyclerview.widget.o.b
            public int b(View view) {
                return q.this.V(view) - ((ViewGroup.MarginLayoutParams) ((r) view.getLayoutParams())).leftMargin;
            }

            @Override // androidx.recyclerview.widget.o.b
            public int c() {
                return q.this.i0();
            }

            @Override // androidx.recyclerview.widget.o.b
            public int d() {
                return q.this.s0() - q.this.j0();
            }

            @Override // androidx.recyclerview.widget.o.b
            public int e(View view) {
                return q.this.Y(view) + ((ViewGroup.MarginLayoutParams) ((r) view.getLayoutParams())).rightMargin;
            }
        }

        class b implements o.b {
            b() {
            }

            @Override // androidx.recyclerview.widget.o.b
            public View a(int i10) {
                return q.this.N(i10);
            }

            @Override // androidx.recyclerview.widget.o.b
            public int b(View view) {
                return q.this.Z(view) - ((ViewGroup.MarginLayoutParams) ((r) view.getLayoutParams())).topMargin;
            }

            @Override // androidx.recyclerview.widget.o.b
            public int c() {
                return q.this.k0();
            }

            @Override // androidx.recyclerview.widget.o.b
            public int d() {
                return q.this.b0() - q.this.h0();
            }

            @Override // androidx.recyclerview.widget.o.b
            public int e(View view) {
                return q.this.T(view) + ((ViewGroup.MarginLayoutParams) ((r) view.getLayoutParams())).bottomMargin;
            }
        }

        public interface c {
            void a(int i10, int i11);
        }

        public static class d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f3020a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int f3021b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public boolean f3022c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public boolean f3023d;
        }

        public q() {
            a aVar = new a();
            this.f3002c = aVar;
            b bVar = new b();
            this.f3003d = bVar;
            this.f3004e = new androidx.recyclerview.widget.o(aVar);
            this.f3005f = new androidx.recyclerview.widget.o(bVar);
            this.f3007h = false;
            this.f3008i = false;
            this.f3009j = false;
            this.f3010k = true;
            this.f3011l = true;
        }

        private void A1(w wVar, int i10, View view) {
            f0 f0VarP0 = RecyclerView.p0(view);
            if (f0VarP0.L()) {
                if (RecyclerView.O0) {
                    Log.d("RecyclerView", "ignoring view " + f0VarP0);
                    return;
                }
                return;
            }
            if (f0VarP0.v() && !f0VarP0.x() && !this.f3001b.f2910v.j()) {
                v1(i10);
                wVar.H(f0VarP0);
            } else {
                C(i10);
                wVar.I(view);
                this.f3001b.f2889g.k(f0VarP0);
            }
        }

        private static boolean B0(int i10, int i11, int i12) {
            int mode = View.MeasureSpec.getMode(i11);
            int size = View.MeasureSpec.getSize(i11);
            if (i12 > 0 && i10 != i12) {
                return false;
            }
            if (mode == Integer.MIN_VALUE) {
                return size >= i10;
            }
            if (mode != 0) {
                return mode == 1073741824 && size == i10;
            }
            return true;
        }

        private void D(int i10, View view) {
            this.f3000a.d(i10);
        }

        public static int P(int i10, int i11, int i12, int i13, boolean z10) {
            int iMax = Math.max(0, i10 - i12);
            if (z10) {
                if (i13 < 0) {
                    if (i13 != -1 || (i11 != Integer.MIN_VALUE && (i11 == 0 || i11 != 1073741824))) {
                        i11 = 0;
                        i13 = 0;
                    } else {
                        i13 = iMax;
                    }
                }
                i11 = WXVideoFileObject.FILE_SIZE_LIMIT;
            } else {
                if (i13 < 0) {
                    if (i13 != -1) {
                        if (i13 == -2) {
                            i11 = (i11 == Integer.MIN_VALUE || i11 == 1073741824) ? RtlSpacingHelper.UNDEFINED : 0;
                        }
                        i11 = 0;
                        i13 = 0;
                    }
                    i13 = iMax;
                }
                i11 = WXVideoFileObject.FILE_SIZE_LIMIT;
            }
            return View.MeasureSpec.makeMeasureSpec(i13, i11);
        }

        private int[] Q(View view, Rect rect) {
            int iI0 = i0();
            int iK0 = k0();
            int iS0 = s0() - j0();
            int iB0 = b0() - h0();
            int left = (view.getLeft() + rect.left) - view.getScrollX();
            int top = (view.getTop() + rect.top) - view.getScrollY();
            int iWidth = rect.width() + left;
            int iHeight = rect.height() + top;
            int i10 = left - iI0;
            int iMin = Math.min(0, i10);
            int i11 = top - iK0;
            int iMin2 = Math.min(0, i11);
            int i12 = iWidth - iS0;
            int iMax = Math.max(0, i12);
            int iMax2 = Math.max(0, iHeight - iB0);
            if (d0() != 1) {
                if (iMin == 0) {
                    iMin = Math.min(i10, iMax);
                }
                iMax = iMin;
            } else if (iMax == 0) {
                iMax = Math.max(iMin, i12);
            }
            if (iMin2 == 0) {
                iMin2 = Math.min(i11, iMax2);
            }
            return new int[]{iMax, iMin2};
        }

        private void k(View view, int i10, boolean z10) {
            f0 f0VarP0 = RecyclerView.p0(view);
            if (z10 || f0VarP0.x()) {
                this.f3001b.f2889g.b(f0VarP0);
            } else {
                this.f3001b.f2889g.p(f0VarP0);
            }
            r rVar = (r) view.getLayoutParams();
            if (f0VarP0.N() || f0VarP0.y()) {
                if (f0VarP0.y()) {
                    f0VarP0.M();
                } else {
                    f0VarP0.e();
                }
                this.f3000a.c(view, i10, view.getLayoutParams(), false);
            } else if (view.getParent() == this.f3001b) {
                int iM = this.f3000a.m(view);
                if (i10 == -1) {
                    i10 = this.f3000a.g();
                }
                if (iM == -1) {
                    throw new IllegalStateException("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:" + this.f3001b.indexOfChild(view) + this.f3001b.W());
                }
                if (iM != i10) {
                    this.f3001b.f2912w.G0(iM, i10);
                }
            } else {
                this.f3000a.a(view, i10, false);
                rVar.f3026c = true;
                a0 a0Var = this.f3006g;
                if (a0Var != null && a0Var.h()) {
                    this.f3006g.k(view);
                }
            }
            if (rVar.f3027d) {
                if (RecyclerView.O0) {
                    Log.d("RecyclerView", "consuming pending invalidate on child " + rVar.f3024a);
                }
                f0VarP0.f2964a.invalidate();
                rVar.f3027d = false;
            }
        }

        public static d m0(Context context, AttributeSet attributeSet, int i10, int i11) {
            d dVar = new d();
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k1.c.f18924a, i10, i11);
            dVar.f3020a = typedArrayObtainStyledAttributes.getInt(k1.c.f18925b, 1);
            dVar.f3021b = typedArrayObtainStyledAttributes.getInt(k1.c.f18935l, 1);
            dVar.f3022c = typedArrayObtainStyledAttributes.getBoolean(k1.c.f18934k, false);
            dVar.f3023d = typedArrayObtainStyledAttributes.getBoolean(k1.c.f18936m, false);
            typedArrayObtainStyledAttributes.recycle();
            return dVar;
        }

        public static int s(int i10, int i11, int i12) {
            int mode = View.MeasureSpec.getMode(i10);
            int size = View.MeasureSpec.getSize(i10);
            return mode != Integer.MIN_VALUE ? mode != 1073741824 ? Math.max(i11, i12) : size : Math.min(size, Math.max(i11, i12));
        }

        private boolean x0(RecyclerView recyclerView, int i10, int i11) {
            View focusedChild = recyclerView.getFocusedChild();
            if (focusedChild == null) {
                return false;
            }
            int iI0 = i0();
            int iK0 = k0();
            int iS0 = s0() - j0();
            int iB0 = b0() - h0();
            Rect rect = this.f3001b.f2904s;
            U(focusedChild, rect);
            return rect.left - i10 < iS0 && rect.right - i10 > iI0 && rect.top - i11 < iB0 && rect.bottom - i11 > iK0;
        }

        public abstract int A(b0 b0Var);

        public boolean A0() {
            return false;
        }

        public void B(w wVar) {
            for (int iO = O() - 1; iO >= 0; iO--) {
                A1(wVar, iO, N(iO));
            }
        }

        public abstract int B1(int i10, w wVar, b0 b0Var);

        public void C(int i10) {
            D(i10, N(i10));
        }

        public boolean C0() {
            a0 a0Var = this.f3006g;
            return a0Var != null && a0Var.h();
        }

        public abstract void C1(int i10);

        public boolean D0(View view, boolean z10, boolean z11) {
            boolean z12 = this.f3004e.b(view, 24579) && this.f3005f.b(view, 24579);
            return z10 ? z12 : !z12;
        }

        public abstract int D1(int i10, w wVar, b0 b0Var);

        void E(RecyclerView recyclerView) {
            this.f3008i = true;
            L0(recyclerView);
        }

        public void E0(View view, int i10, int i11, int i12, int i13) {
            r rVar = (r) view.getLayoutParams();
            Rect rect = rVar.f3025b;
            view.layout(i10 + rect.left + ((ViewGroup.MarginLayoutParams) rVar).leftMargin, i11 + rect.top + ((ViewGroup.MarginLayoutParams) rVar).topMargin, (i12 - rect.right) - ((ViewGroup.MarginLayoutParams) rVar).rightMargin, (i13 - rect.bottom) - ((ViewGroup.MarginLayoutParams) rVar).bottomMargin);
        }

        void E1(RecyclerView recyclerView) {
            F1(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), WXVideoFileObject.FILE_SIZE_LIMIT), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), WXVideoFileObject.FILE_SIZE_LIMIT));
        }

        void F(RecyclerView recyclerView, w wVar) {
            this.f3008i = false;
            N0(recyclerView, wVar);
        }

        public void F0(View view, int i10, int i11) {
            r rVar = (r) view.getLayoutParams();
            Rect rectU0 = this.f3001b.u0(view);
            int i12 = i10 + rectU0.left + rectU0.right;
            int i13 = i11 + rectU0.top + rectU0.bottom;
            int iP = P(s0(), t0(), i0() + j0() + ((ViewGroup.MarginLayoutParams) rVar).leftMargin + ((ViewGroup.MarginLayoutParams) rVar).rightMargin + i12, ((ViewGroup.MarginLayoutParams) rVar).width, p());
            int iP2 = P(b0(), c0(), k0() + h0() + ((ViewGroup.MarginLayoutParams) rVar).topMargin + ((ViewGroup.MarginLayoutParams) rVar).bottomMargin + i13, ((ViewGroup.MarginLayoutParams) rVar).height, q());
            if (K1(view, iP, iP2, rVar)) {
                view.measure(iP, iP2);
            }
        }

        void F1(int i10, int i11) {
            this.f3016q = View.MeasureSpec.getSize(i10);
            int mode = View.MeasureSpec.getMode(i10);
            this.f3014o = mode;
            if (mode == 0 && !RecyclerView.S0) {
                this.f3016q = 0;
            }
            this.f3017r = View.MeasureSpec.getSize(i11);
            int mode2 = View.MeasureSpec.getMode(i11);
            this.f3015p = mode2;
            if (mode2 != 0 || RecyclerView.S0) {
                return;
            }
            this.f3017r = 0;
        }

        public View G(View view) {
            View viewY;
            RecyclerView recyclerView = this.f3001b;
            if (recyclerView == null || (viewY = recyclerView.Y(view)) == null || this.f3000a.n(viewY)) {
                return null;
            }
            return viewY;
        }

        public void G0(int i10, int i11) {
            View viewN = N(i10);
            if (viewN != null) {
                C(i10);
                m(viewN, i11);
            } else {
                throw new IllegalArgumentException("Cannot move a child from non-existing index:" + i10 + this.f3001b.toString());
            }
        }

        public void G1(int i10, int i11) {
            this.f3001b.setMeasuredDimension(i10, i11);
        }

        public View H(int i10) {
            int iO = O();
            for (int i11 = 0; i11 < iO; i11++) {
                View viewN = N(i11);
                f0 f0VarP0 = RecyclerView.p0(viewN);
                if (f0VarP0 != null && f0VarP0.o() == i10 && !f0VarP0.L() && (this.f3001b.f2903r0.e() || !f0VarP0.x())) {
                    return viewN;
                }
            }
            return null;
        }

        public void H0(int i10) {
            RecyclerView recyclerView = this.f3001b;
            if (recyclerView != null) {
                recyclerView.L0(i10);
            }
        }

        public void H1(Rect rect, int i10, int i11) {
            G1(s(i10, rect.width() + i0() + j0(), g0()), s(i11, rect.height() + k0() + h0(), f0()));
        }

        public abstract r I();

        public void I0(int i10) {
            RecyclerView recyclerView = this.f3001b;
            if (recyclerView != null) {
                recyclerView.M0(i10);
            }
        }

        void I1(int i10, int i11) {
            int iO = O();
            if (iO == 0) {
                this.f3001b.D(i10, i11);
                return;
            }
            int i12 = RtlSpacingHelper.UNDEFINED;
            int i13 = RtlSpacingHelper.UNDEFINED;
            int i14 = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
            int i15 = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
            for (int i16 = 0; i16 < iO; i16++) {
                View viewN = N(i16);
                Rect rect = this.f3001b.f2904s;
                U(viewN, rect);
                int i17 = rect.left;
                if (i17 < i14) {
                    i14 = i17;
                }
                int i18 = rect.right;
                if (i18 > i12) {
                    i12 = i18;
                }
                int i19 = rect.top;
                if (i19 < i15) {
                    i15 = i19;
                }
                int i20 = rect.bottom;
                if (i20 > i13) {
                    i13 = i20;
                }
            }
            this.f3001b.f2904s.set(i14, i15, i12, i13);
            H1(this.f3001b.f2904s, i10, i11);
        }

        public r J(Context context, AttributeSet attributeSet) {
            return new r(context, attributeSet);
        }

        public void J0(h hVar, h hVar2) {
        }

        void J1(RecyclerView recyclerView) {
            if (recyclerView == null) {
                this.f3001b = null;
                this.f3000a = null;
                this.f3016q = 0;
                this.f3017r = 0;
            } else {
                this.f3001b = recyclerView;
                this.f3000a = recyclerView.f2887f;
                this.f3016q = recyclerView.getWidth();
                this.f3017r = recyclerView.getHeight();
            }
            this.f3014o = WXVideoFileObject.FILE_SIZE_LIMIT;
            this.f3015p = WXVideoFileObject.FILE_SIZE_LIMIT;
        }

        public r K(ViewGroup.LayoutParams layoutParams) {
            return layoutParams instanceof r ? new r((r) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new r((ViewGroup.MarginLayoutParams) layoutParams) : new r(layoutParams);
        }

        public boolean K0(RecyclerView recyclerView, ArrayList arrayList, int i10, int i11) {
            return false;
        }

        boolean K1(View view, int i10, int i11, r rVar) {
            return (!view.isLayoutRequested() && this.f3010k && B0(view.getWidth(), i10, ((ViewGroup.MarginLayoutParams) rVar).width) && B0(view.getHeight(), i11, ((ViewGroup.MarginLayoutParams) rVar).height)) ? false : true;
        }

        public int L() {
            return -1;
        }

        public void L0(RecyclerView recyclerView) {
        }

        boolean L1() {
            return false;
        }

        public int M(View view) {
            return ((r) view.getLayoutParams()).f3025b.bottom;
        }

        public void M0(RecyclerView recyclerView) {
        }

        boolean M1(View view, int i10, int i11, r rVar) {
            return (this.f3010k && B0(view.getMeasuredWidth(), i10, ((ViewGroup.MarginLayoutParams) rVar).width) && B0(view.getMeasuredHeight(), i11, ((ViewGroup.MarginLayoutParams) rVar).height)) ? false : true;
        }

        public View N(int i10) {
            androidx.recyclerview.widget.b bVar = this.f3000a;
            if (bVar != null) {
                return bVar.f(i10);
            }
            return null;
        }

        public void N0(RecyclerView recyclerView, w wVar) {
            M0(recyclerView);
        }

        public abstract void N1(RecyclerView recyclerView, b0 b0Var, int i10);

        public int O() {
            androidx.recyclerview.widget.b bVar = this.f3000a;
            if (bVar != null) {
                return bVar.g();
            }
            return 0;
        }

        public abstract View O0(View view, int i10, w wVar, b0 b0Var);

        public void O1(a0 a0Var) {
            a0 a0Var2 = this.f3006g;
            if (a0Var2 != null && a0Var != a0Var2 && a0Var2.h()) {
                this.f3006g.r();
            }
            this.f3006g = a0Var;
            a0Var.q(this.f3001b, this);
        }

        public void P0(AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.f3001b;
            Q0(recyclerView.f2881c, recyclerView.f2903r0, accessibilityEvent);
        }

        void P1() {
            a0 a0Var = this.f3006g;
            if (a0Var != null) {
                a0Var.r();
            }
        }

        public void Q0(w wVar, b0 b0Var, AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.f3001b;
            if (recyclerView == null || accessibilityEvent == null) {
                return;
            }
            boolean z10 = true;
            if (!recyclerView.canScrollVertically(1) && !this.f3001b.canScrollVertically(-1) && !this.f3001b.canScrollHorizontally(-1) && !this.f3001b.canScrollHorizontally(1)) {
                z10 = false;
            }
            accessibilityEvent.setScrollable(z10);
            h hVar = this.f3001b.f2910v;
            if (hVar != null) {
                accessibilityEvent.setItemCount(hVar.f());
            }
        }

        public boolean Q1() {
            return false;
        }

        public boolean R() {
            RecyclerView recyclerView = this.f3001b;
            return recyclerView != null && recyclerView.f2891h;
        }

        public void R0(w wVar, b0 b0Var, n0.x xVar) {
            if (this.f3001b.canScrollVertically(-1) || this.f3001b.canScrollHorizontally(-1)) {
                xVar.a(8192);
                xVar.O0(true);
                xVar.D0(true);
            }
            if (this.f3001b.canScrollVertically(1) || this.f3001b.canScrollHorizontally(1)) {
                xVar.a(4096);
                xVar.O0(true);
                xVar.D0(true);
            }
            xVar.v0(x.f.a(o0(wVar, b0Var), S(wVar, b0Var), z0(wVar, b0Var), p0(wVar, b0Var)));
        }

        public int S(w wVar, b0 b0Var) {
            RecyclerView recyclerView = this.f3001b;
            if (recyclerView == null || recyclerView.f2910v == null || !p()) {
                return 1;
            }
            return this.f3001b.f2910v.f();
        }

        void S0(n0.x xVar) {
            RecyclerView recyclerView = this.f3001b;
            R0(recyclerView.f2881c, recyclerView.f2903r0, xVar);
        }

        public int T(View view) {
            return view.getBottom() + M(view);
        }

        void T0(View view, n0.x xVar) {
            f0 f0VarP0 = RecyclerView.p0(view);
            if (f0VarP0 == null || f0VarP0.x() || this.f3000a.n(f0VarP0.f2964a)) {
                return;
            }
            RecyclerView recyclerView = this.f3001b;
            U0(recyclerView.f2881c, recyclerView.f2903r0, view, xVar);
        }

        public void U(View view, Rect rect) {
            RecyclerView.r0(view, rect);
        }

        public void U0(w wVar, b0 b0Var, View view, n0.x xVar) {
            xVar.w0(x.g.a(q() ? l0(view) : 0, 1, p() ? l0(view) : 0, 1, false, false));
        }

        public int V(View view) {
            return view.getLeft() - e0(view);
        }

        public View V0(View view, int i10) {
            return null;
        }

        public int W(View view) {
            Rect rect = ((r) view.getLayoutParams()).f3025b;
            return view.getMeasuredHeight() + rect.top + rect.bottom;
        }

        public void W0(RecyclerView recyclerView, int i10, int i11) {
        }

        public int X(View view) {
            Rect rect = ((r) view.getLayoutParams()).f3025b;
            return view.getMeasuredWidth() + rect.left + rect.right;
        }

        public void X0(RecyclerView recyclerView) {
        }

        public int Y(View view) {
            return view.getRight() + n0(view);
        }

        public void Y0(RecyclerView recyclerView, int i10, int i11, int i12) {
        }

        public int Z(View view) {
            return view.getTop() - q0(view);
        }

        public void Z0(RecyclerView recyclerView, int i10, int i11) {
        }

        public View a0() {
            View focusedChild;
            RecyclerView recyclerView = this.f3001b;
            if (recyclerView == null || (focusedChild = recyclerView.getFocusedChild()) == null || this.f3000a.n(focusedChild)) {
                return null;
            }
            return focusedChild;
        }

        public void a1(RecyclerView recyclerView, int i10, int i11) {
        }

        public int b0() {
            return this.f3017r;
        }

        public void b1(RecyclerView recyclerView, int i10, int i11, Object obj) {
            a1(recyclerView, i10, i11);
        }

        public int c0() {
            return this.f3015p;
        }

        public abstract void c1(w wVar, b0 b0Var);

        public int d0() {
            return this.f3001b.getLayoutDirection();
        }

        public void d1(b0 b0Var) {
        }

        public int e() {
            RecyclerView recyclerView = this.f3001b;
            h adapter = recyclerView != null ? recyclerView.getAdapter() : null;
            if (adapter != null) {
                return adapter.f();
            }
            return 0;
        }

        public int e0(View view) {
            return ((r) view.getLayoutParams()).f3025b.left;
        }

        public void e1(w wVar, b0 b0Var, int i10, int i11) {
            this.f3001b.D(i10, i11);
        }

        public int f0() {
            return o0.E(this.f3001b);
        }

        public boolean f1(RecyclerView recyclerView, View view, View view2) {
            return C0() || recyclerView.F0();
        }

        public void g(View view) {
            h(view, -1);
        }

        public int g0() {
            return o0.F(this.f3001b);
        }

        public boolean g1(RecyclerView recyclerView, b0 b0Var, View view, View view2) {
            return f1(recyclerView, view, view2);
        }

        public void h(View view, int i10) {
            k(view, i10, true);
        }

        public int h0() {
            RecyclerView recyclerView = this.f3001b;
            if (recyclerView != null) {
                return recyclerView.getPaddingBottom();
            }
            return 0;
        }

        public void h1(Parcelable parcelable) {
        }

        public void i(View view) {
            j(view, -1);
        }

        public int i0() {
            RecyclerView recyclerView = this.f3001b;
            if (recyclerView != null) {
                return recyclerView.getPaddingLeft();
            }
            return 0;
        }

        public Parcelable i1() {
            return null;
        }

        public void j(View view, int i10) {
            k(view, i10, false);
        }

        public int j0() {
            RecyclerView recyclerView = this.f3001b;
            if (recyclerView != null) {
                return recyclerView.getPaddingRight();
            }
            return 0;
        }

        public void j1(int i10) {
        }

        public int k0() {
            RecyclerView recyclerView = this.f3001b;
            if (recyclerView != null) {
                return recyclerView.getPaddingTop();
            }
            return 0;
        }

        void k1(a0 a0Var) {
            if (this.f3006g == a0Var) {
                this.f3006g = null;
            }
        }

        public void l(String str) {
            RecyclerView recyclerView = this.f3001b;
            if (recyclerView != null) {
                recyclerView.s(str);
            }
        }

        public int l0(View view) {
            return ((r) view.getLayoutParams()).a();
        }

        boolean l1(int i10, Bundle bundle) {
            RecyclerView recyclerView = this.f3001b;
            return m1(recyclerView.f2881c, recyclerView.f2903r0, i10, bundle);
        }

        public void m(View view, int i10) {
            n(view, i10, (r) view.getLayoutParams());
        }

        public boolean m1(w wVar, b0 b0Var, int i10, Bundle bundle) {
            int iK0;
            int iI0;
            float f10;
            if (this.f3001b == null) {
                return false;
            }
            int iB0 = b0();
            int iS0 = s0();
            Rect rect = new Rect();
            if (this.f3001b.getMatrix().isIdentity() && this.f3001b.getGlobalVisibleRect(rect)) {
                iB0 = rect.height();
                iS0 = rect.width();
            }
            if (i10 != 4096) {
                if (i10 != 8192) {
                    iK0 = 0;
                } else {
                    iK0 = this.f3001b.canScrollVertically(-1) ? -((iB0 - k0()) - h0()) : 0;
                    if (this.f3001b.canScrollHorizontally(-1)) {
                        iI0 = -((iS0 - i0()) - j0());
                    }
                }
            } else {
                iK0 = this.f3001b.canScrollVertically(1) ? (iB0 - k0()) - h0() : 0;
                iI0 = this.f3001b.canScrollHorizontally(1) ? (iS0 - i0()) - j0() : 0;
            }
            if (iK0 == 0 && iI0 == 0) {
                return false;
            }
            if (bundle != null) {
                f10 = bundle.getFloat("androidx.core.view.accessibility.action.ARGUMENT_SCROLL_AMOUNT_FLOAT", 1.0f);
                if (f10 < 0.0f) {
                    if (!RecyclerView.N0) {
                        return false;
                    }
                    throw new IllegalArgumentException("attempting to use ACTION_ARGUMENT_SCROLL_AMOUNT_FLOAT with a negative value (" + f10 + ")");
                }
            } else {
                f10 = 1.0f;
            }
            if (Float.compare(f10, Float.POSITIVE_INFINITY) != 0) {
                if (Float.compare(1.0f, f10) != 0 && Float.compare(0.0f, f10) != 0) {
                    iI0 = (int) (iI0 * f10);
                    iK0 = (int) (iK0 * f10);
                }
                this.f3001b.D1(iI0, iK0, null, RtlSpacingHelper.UNDEFINED, true);
                return true;
            }
            RecyclerView recyclerView = this.f3001b;
            h hVar = recyclerView.f2910v;
            if (hVar == null) {
                return false;
            }
            if (i10 == 4096) {
                recyclerView.E1(hVar.f() - 1);
            } else if (i10 == 8192) {
                recyclerView.E1(0);
            }
            return true;
        }

        public void n(View view, int i10, r rVar) {
            f0 f0VarP0 = RecyclerView.p0(view);
            if (f0VarP0.x()) {
                this.f3001b.f2889g.b(f0VarP0);
            } else {
                this.f3001b.f2889g.p(f0VarP0);
            }
            this.f3000a.c(view, i10, rVar, f0VarP0.x());
        }

        public int n0(View view) {
            return ((r) view.getLayoutParams()).f3025b.right;
        }

        boolean n1(View view, int i10, Bundle bundle) {
            RecyclerView recyclerView = this.f3001b;
            return o1(recyclerView.f2881c, recyclerView.f2903r0, view, i10, bundle);
        }

        public void o(View view, Rect rect) {
            RecyclerView recyclerView = this.f3001b;
            if (recyclerView == null) {
                rect.set(0, 0, 0, 0);
            } else {
                rect.set(recyclerView.u0(view));
            }
        }

        public int o0(w wVar, b0 b0Var) {
            RecyclerView recyclerView = this.f3001b;
            if (recyclerView == null || recyclerView.f2910v == null || !q()) {
                return 1;
            }
            return this.f3001b.f2910v.f();
        }

        public boolean o1(w wVar, b0 b0Var, View view, int i10, Bundle bundle) {
            return false;
        }

        public abstract boolean p();

        public int p0(w wVar, b0 b0Var) {
            return 0;
        }

        public void p1(w wVar) {
            for (int iO = O() - 1; iO >= 0; iO--) {
                if (!RecyclerView.p0(N(iO)).L()) {
                    s1(iO, wVar);
                }
            }
        }

        public abstract boolean q();

        public int q0(View view) {
            return ((r) view.getLayoutParams()).f3025b.top;
        }

        void q1(w wVar) {
            int iJ = wVar.j();
            for (int i10 = iJ - 1; i10 >= 0; i10--) {
                View viewN = wVar.n(i10);
                f0 f0VarP0 = RecyclerView.p0(viewN);
                if (!f0VarP0.L()) {
                    f0VarP0.I(false);
                    if (f0VarP0.z()) {
                        this.f3001b.removeDetachedView(viewN, false);
                    }
                    n nVar = this.f3001b.W;
                    if (nVar != null) {
                        nVar.j(f0VarP0);
                    }
                    f0VarP0.I(true);
                    wVar.D(viewN);
                }
            }
            wVar.e();
            if (iJ > 0) {
                this.f3001b.invalidate();
            }
        }

        public boolean r(r rVar) {
            return rVar != null;
        }

        public void r0(View view, boolean z10, Rect rect) {
            Matrix matrix;
            if (z10) {
                Rect rect2 = ((r) view.getLayoutParams()).f3025b;
                rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
            } else {
                rect.set(0, 0, view.getWidth(), view.getHeight());
            }
            if (this.f3001b != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
                RectF rectF = this.f3001b.f2908u;
                rectF.set(rect);
                matrix.mapRect(rectF);
                rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
            }
            rect.offset(view.getLeft(), view.getTop());
        }

        public void r1(View view, w wVar) {
            u1(view);
            wVar.G(view);
        }

        public int s0() {
            return this.f3016q;
        }

        public void s1(int i10, w wVar) {
            View viewN = N(i10);
            v1(i10);
            wVar.G(viewN);
        }

        public void t(int i10, int i11, b0 b0Var, c cVar) {
        }

        public int t0() {
            return this.f3014o;
        }

        public boolean t1(Runnable runnable) {
            RecyclerView recyclerView = this.f3001b;
            if (recyclerView != null) {
                return recyclerView.removeCallbacks(runnable);
            }
            return false;
        }

        public void u(int i10, c cVar) {
        }

        boolean u0() {
            int iO = O();
            for (int i10 = 0; i10 < iO; i10++) {
                ViewGroup.LayoutParams layoutParams = N(i10).getLayoutParams();
                if (layoutParams.width < 0 && layoutParams.height < 0) {
                    return true;
                }
            }
            return false;
        }

        public void u1(View view) {
            this.f3000a.p(view);
        }

        public abstract int v(b0 b0Var);

        public boolean v0() {
            return this.f3008i;
        }

        public void v1(int i10) {
            if (N(i10) != null) {
                this.f3000a.q(i10);
            }
        }

        public abstract int w(b0 b0Var);

        public abstract boolean w0();

        public boolean w1(RecyclerView recyclerView, View view, Rect rect, boolean z10) {
            return x1(recyclerView, view, rect, z10, false);
        }

        public abstract int x(b0 b0Var);

        public boolean x1(RecyclerView recyclerView, View view, Rect rect, boolean z10, boolean z11) {
            int[] iArrQ = Q(view, rect);
            int i10 = iArrQ[0];
            int i11 = iArrQ[1];
            if ((z11 && !x0(recyclerView, i10, i11)) || (i10 == 0 && i11 == 0)) {
                return false;
            }
            if (z10) {
                recyclerView.scrollBy(i10, i11);
            } else {
                recyclerView.A1(i10, i11);
            }
            return true;
        }

        public abstract int y(b0 b0Var);

        public final boolean y0() {
            return this.f3011l;
        }

        public void y1() {
            RecyclerView recyclerView = this.f3001b;
            if (recyclerView != null) {
                recyclerView.requestLayout();
            }
        }

        public abstract int z(b0 b0Var);

        public boolean z0(w wVar, b0 b0Var) {
            return false;
        }

        public void z1() {
            this.f3007h = true;
        }
    }

    public static abstract class s {
        public abstract boolean a(int i10, int i11);
    }

    public interface t {
        void a(RecyclerView recyclerView, MotionEvent motionEvent);

        boolean b(RecyclerView recyclerView, MotionEvent motionEvent);

        void c(boolean z10);
    }

    public static abstract class u {
        public void a(RecyclerView recyclerView, int i10) {
        }

        public void b(RecyclerView recyclerView, int i10, int i11) {
        }
    }

    public static class v {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        SparseArray f3028a = new SparseArray();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f3029b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Set f3030c = Collections.newSetFromMap(new IdentityHashMap());

        static class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final ArrayList f3031a = new ArrayList();

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            int f3032b = 5;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            long f3033c = 0;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            long f3034d = 0;

            a() {
            }
        }

        private a i(int i10) {
            a aVar = (a) this.f3028a.get(i10);
            if (aVar != null) {
                return aVar;
            }
            a aVar2 = new a();
            this.f3028a.put(i10, aVar2);
            return aVar2;
        }

        void a() {
            this.f3029b++;
        }

        void b(h hVar) {
            this.f3030c.add(hVar);
        }

        public void c() {
            for (int i10 = 0; i10 < this.f3028a.size(); i10++) {
                a aVar = (a) this.f3028a.valueAt(i10);
                Iterator it = aVar.f3031a.iterator();
                while (it.hasNext()) {
                    p0.a.a(((f0) it.next()).f2964a);
                }
                aVar.f3031a.clear();
            }
        }

        void d() {
            this.f3029b--;
        }

        void e(h hVar, boolean z10) {
            this.f3030c.remove(hVar);
            if (this.f3030c.size() != 0 || z10) {
                return;
            }
            for (int i10 = 0; i10 < this.f3028a.size(); i10++) {
                SparseArray sparseArray = this.f3028a;
                ArrayList arrayList = ((a) sparseArray.get(sparseArray.keyAt(i10))).f3031a;
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    p0.a.a(((f0) arrayList.get(i11)).f2964a);
                }
            }
        }

        void f(int i10, long j10) {
            a aVarI = i(i10);
            aVarI.f3034d = l(aVarI.f3034d, j10);
        }

        void g(int i10, long j10) {
            a aVarI = i(i10);
            aVarI.f3033c = l(aVarI.f3033c, j10);
        }

        public f0 h(int i10) {
            a aVar = (a) this.f3028a.get(i10);
            if (aVar == null || aVar.f3031a.isEmpty()) {
                return null;
            }
            ArrayList arrayList = aVar.f3031a;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (!((f0) arrayList.get(size)).t()) {
                    return (f0) arrayList.remove(size);
                }
            }
            return null;
        }

        void j(h hVar, h hVar2, boolean z10) {
            if (hVar != null) {
                d();
            }
            if (!z10 && this.f3029b == 0) {
                c();
            }
            if (hVar2 != null) {
                a();
            }
        }

        public void k(f0 f0Var) {
            int iN = f0Var.n();
            ArrayList arrayList = i(iN).f3031a;
            if (((a) this.f3028a.get(iN)).f3032b <= arrayList.size()) {
                p0.a.a(f0Var.f2964a);
            } else {
                if (RecyclerView.N0 && arrayList.contains(f0Var)) {
                    throw new IllegalArgumentException("this scrap item already exists");
                }
                f0Var.F();
                arrayList.add(f0Var);
            }
        }

        long l(long j10, long j11) {
            return j10 == 0 ? j11 : ((j10 / 4) * 3) + (j11 / 4);
        }

        boolean m(int i10, long j10, long j11) {
            long j12 = i(i10).f3034d;
            return j12 == 0 || j10 + j12 < j11;
        }

        boolean n(int i10, long j10, long j11) {
            long j12 = i(i10).f3033c;
            return j12 == 0 || j10 + j12 < j11;
        }
    }

    public final class w {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final ArrayList f3035a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        ArrayList f3036b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final ArrayList f3037c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final List f3038d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f3039e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f3040f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        v f3041g;

        public w() {
            ArrayList arrayList = new ArrayList();
            this.f3035a = arrayList;
            this.f3036b = null;
            this.f3037c = new ArrayList();
            this.f3038d = DesugarCollections.unmodifiableList(arrayList);
            this.f3039e = 2;
            this.f3040f = 2;
        }

        private void B(h hVar) {
            C(hVar, false);
        }

        private void C(h hVar, boolean z10) {
            v vVar = this.f3041g;
            if (vVar != null) {
                vVar.e(hVar, z10);
            }
        }

        private boolean M(f0 f0Var, int i10, int i11, long j10) {
            f0Var.B = null;
            f0Var.A = RecyclerView.this;
            int iN = f0Var.n();
            long nanoTime = RecyclerView.this.getNanoTime();
            boolean z10 = false;
            if (j10 != Long.MAX_VALUE && !this.f3041g.m(iN, nanoTime, j10)) {
                return false;
            }
            if (f0Var.z()) {
                RecyclerView recyclerView = RecyclerView.this;
                recyclerView.attachViewToParent(f0Var.f2964a, recyclerView.getChildCount(), f0Var.f2964a.getLayoutParams());
                z10 = true;
            }
            RecyclerView.this.f2910v.b(f0Var, i10);
            if (z10) {
                RecyclerView.this.detachViewFromParent(f0Var.f2964a);
            }
            this.f3041g.f(f0Var.n(), RecyclerView.this.getNanoTime() - nanoTime);
            b(f0Var);
            if (RecyclerView.this.f2903r0.e()) {
                f0Var.f2970g = i11;
            }
            return true;
        }

        private void b(f0 f0Var) {
            if (RecyclerView.this.E0()) {
                View view = f0Var.f2964a;
                if (view.getImportantForAccessibility() == 0) {
                    view.setImportantForAccessibility(1);
                }
                androidx.recyclerview.widget.k kVar = RecyclerView.this.f2917y0;
                if (kVar == null) {
                    return;
                }
                m0.a aVarN = kVar.n();
                if (aVarN instanceof k.a) {
                    ((k.a) aVarN).o(view);
                }
                o0.n0(view, aVarN);
            }
        }

        private void q(ViewGroup viewGroup, boolean z10) {
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                if (childAt instanceof ViewGroup) {
                    q((ViewGroup) childAt, true);
                }
            }
            if (z10) {
                if (viewGroup.getVisibility() == 4) {
                    viewGroup.setVisibility(0);
                    viewGroup.setVisibility(4);
                } else {
                    int visibility = viewGroup.getVisibility();
                    viewGroup.setVisibility(4);
                    viewGroup.setVisibility(visibility);
                }
            }
        }

        private void r(f0 f0Var) {
            View view = f0Var.f2964a;
            if (view instanceof ViewGroup) {
                q((ViewGroup) view, false);
            }
        }

        private void u() {
            if (this.f3041g != null) {
                RecyclerView recyclerView = RecyclerView.this;
                if (recyclerView.f2910v == null || !recyclerView.isAttachedToWindow()) {
                    return;
                }
                this.f3041g.b(RecyclerView.this.f2910v);
            }
        }

        void A() {
            for (int i10 = 0; i10 < this.f3037c.size(); i10++) {
                p0.a.a(((f0) this.f3037c.get(i10)).f2964a);
            }
            B(RecyclerView.this.f2910v);
        }

        void D(View view) {
            f0 f0VarP0 = RecyclerView.p0(view);
            f0VarP0.f2977w = null;
            f0VarP0.f2978x = false;
            f0VarP0.e();
            H(f0VarP0);
        }

        void E() {
            for (int size = this.f3037c.size() - 1; size >= 0; size--) {
                F(size);
            }
            this.f3037c.clear();
            if (RecyclerView.T0) {
                RecyclerView.this.f2901q0.b();
            }
        }

        void F(int i10) {
            if (RecyclerView.O0) {
                Log.d("RecyclerView", "Recycling cached view at index " + i10);
            }
            f0 f0Var = (f0) this.f3037c.get(i10);
            if (RecyclerView.O0) {
                Log.d("RecyclerView", "CachedViewHolder to be recycled: " + f0Var);
            }
            a(f0Var, true);
            this.f3037c.remove(i10);
        }

        public void G(View view) {
            f0 f0VarP0 = RecyclerView.p0(view);
            if (f0VarP0.z()) {
                RecyclerView.this.removeDetachedView(view, false);
            }
            if (f0VarP0.y()) {
                f0VarP0.M();
            } else if (f0VarP0.N()) {
                f0VarP0.e();
            }
            H(f0VarP0);
            if (RecyclerView.this.W == null || f0VarP0.w()) {
                return;
            }
            RecyclerView.this.W.j(f0VarP0);
        }

        void H(f0 f0Var) {
            boolean z10;
            boolean z11 = true;
            if (f0Var.y() || f0Var.f2964a.getParent() != null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Scrapped or attached views may not be recycled. isScrap:");
                sb2.append(f0Var.y());
                sb2.append(" isAttached:");
                sb2.append(f0Var.f2964a.getParent() != null);
                sb2.append(RecyclerView.this.W());
                throw new IllegalArgumentException(sb2.toString());
            }
            if (f0Var.z()) {
                throw new IllegalArgumentException("Tmp detached view should be removed from RecyclerView before it can be recycled: " + f0Var + RecyclerView.this.W());
            }
            if (f0Var.L()) {
                throw new IllegalArgumentException("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle." + RecyclerView.this.W());
            }
            boolean zH = f0Var.h();
            h hVar = RecyclerView.this.f2910v;
            boolean z12 = hVar != null && zH && hVar.w(f0Var);
            if (RecyclerView.N0 && this.f3037c.contains(f0Var)) {
                throw new IllegalArgumentException("cached view received recycle internal? " + f0Var + RecyclerView.this.W());
            }
            if (z12 || f0Var.w()) {
                if (this.f3040f <= 0 || f0Var.r(526)) {
                    z10 = false;
                } else {
                    int size = this.f3037c.size();
                    if (size >= this.f3040f && size > 0) {
                        F(0);
                        size--;
                    }
                    if (RecyclerView.T0 && size > 0 && !RecyclerView.this.f2901q0.d(f0Var.f2966c)) {
                        int i10 = size - 1;
                        while (i10 >= 0) {
                            if (!RecyclerView.this.f2901q0.d(((f0) this.f3037c.get(i10)).f2966c)) {
                                break;
                            } else {
                                i10--;
                            }
                        }
                        size = i10 + 1;
                    }
                    this.f3037c.add(size, f0Var);
                    z10 = true;
                }
                if (!z10) {
                    a(f0Var, true);
                    z = z10;
                    RecyclerView.this.f2889g.q(f0Var);
                    if (z && !z11 && zH) {
                        p0.a.a(f0Var.f2964a);
                        f0Var.B = null;
                        f0Var.A = null;
                        return;
                    }
                    return;
                }
                z = z10;
            } else if (RecyclerView.O0) {
                Log.d("RecyclerView", "trying to recycle a non-recycleable holder. Hopefully, it will re-visit here. We are still removing it from animation lists" + RecyclerView.this.W());
            }
            z11 = false;
            RecyclerView.this.f2889g.q(f0Var);
            if (z) {
            }
        }

        void I(View view) {
            f0 f0VarP0 = RecyclerView.p0(view);
            if (!f0VarP0.r(12) && f0VarP0.A() && !RecyclerView.this.t(f0VarP0)) {
                if (this.f3036b == null) {
                    this.f3036b = new ArrayList();
                }
                f0VarP0.J(this, true);
                this.f3036b.add(f0VarP0);
                return;
            }
            if (!f0VarP0.v() || f0VarP0.x() || RecyclerView.this.f2910v.j()) {
                f0VarP0.J(this, false);
                this.f3035a.add(f0VarP0);
            } else {
                throw new IllegalArgumentException("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool." + RecyclerView.this.W());
            }
        }

        void J(v vVar) {
            B(RecyclerView.this.f2910v);
            v vVar2 = this.f3041g;
            if (vVar2 != null) {
                vVar2.d();
            }
            this.f3041g = vVar;
            if (vVar != null && RecyclerView.this.getAdapter() != null) {
                this.f3041g.a();
            }
            u();
        }

        void K(d0 d0Var) {
        }

        public void L(int i10) {
            this.f3039e = i10;
            P();
        }

        /* JADX WARN: Removed duplicated region for block: B:103:0x021d A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:105:0x0220  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x005c  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x005f  */
        /* JADX WARN: Removed duplicated region for block: B:72:0x0171  */
        /* JADX WARN: Removed duplicated region for block: B:78:0x019d  */
        /* JADX WARN: Removed duplicated region for block: B:96:0x01f3  */
        /* JADX WARN: Removed duplicated region for block: B:97:0x0201  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        androidx.recyclerview.widget.RecyclerView.f0 N(int r17, boolean r18, long r19) {
            /*
                Method dump skipped, instruction units count: 604
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.w.N(int, boolean, long):androidx.recyclerview.widget.RecyclerView$f0");
        }

        void O(f0 f0Var) {
            if (f0Var.f2978x) {
                this.f3036b.remove(f0Var);
            } else {
                this.f3035a.remove(f0Var);
            }
            f0Var.f2977w = null;
            f0Var.f2978x = false;
            f0Var.e();
        }

        void P() {
            q qVar = RecyclerView.this.f2912w;
            this.f3040f = this.f3039e + (qVar != null ? qVar.f3012m : 0);
            for (int size = this.f3037c.size() - 1; size >= 0 && this.f3037c.size() > this.f3040f; size--) {
                F(size);
            }
        }

        boolean Q(f0 f0Var) {
            if (f0Var.x()) {
                if (!RecyclerView.N0 || RecyclerView.this.f2903r0.e()) {
                    return RecyclerView.this.f2903r0.e();
                }
                throw new IllegalStateException("should not receive a removed view unless it is pre layout" + RecyclerView.this.W());
            }
            int i10 = f0Var.f2966c;
            if (i10 >= 0 && i10 < RecyclerView.this.f2910v.f()) {
                if (RecyclerView.this.f2903r0.e() || RecyclerView.this.f2910v.h(f0Var.f2966c) == f0Var.n()) {
                    return !RecyclerView.this.f2910v.j() || f0Var.m() == RecyclerView.this.f2910v.g(f0Var.f2966c);
                }
                return false;
            }
            throw new IndexOutOfBoundsException("Inconsistency detected. Invalid view holder adapter position" + f0Var + RecyclerView.this.W());
        }

        void R(int i10, int i11) {
            int i12;
            int i13 = i11 + i10;
            for (int size = this.f3037c.size() - 1; size >= 0; size--) {
                f0 f0Var = (f0) this.f3037c.get(size);
                if (f0Var != null && (i12 = f0Var.f2966c) >= i10 && i12 < i13) {
                    f0Var.b(2);
                    F(size);
                }
            }
        }

        void a(f0 f0Var, boolean z10) {
            RecyclerView.v(f0Var);
            View view = f0Var.f2964a;
            androidx.recyclerview.widget.k kVar = RecyclerView.this.f2917y0;
            if (kVar != null) {
                m0.a aVarN = kVar.n();
                o0.n0(view, aVarN instanceof k.a ? ((k.a) aVarN).n(view) : null);
            }
            if (z10) {
                g(f0Var);
            }
            f0Var.B = null;
            f0Var.A = null;
            i().k(f0Var);
        }

        public void c() {
            this.f3035a.clear();
            E();
        }

        void d() {
            int size = this.f3037c.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((f0) this.f3037c.get(i10)).c();
            }
            int size2 = this.f3035a.size();
            for (int i11 = 0; i11 < size2; i11++) {
                ((f0) this.f3035a.get(i11)).c();
            }
            ArrayList arrayList = this.f3036b;
            if (arrayList != null) {
                int size3 = arrayList.size();
                for (int i12 = 0; i12 < size3; i12++) {
                    ((f0) this.f3036b.get(i12)).c();
                }
            }
        }

        void e() {
            this.f3035a.clear();
            ArrayList arrayList = this.f3036b;
            if (arrayList != null) {
                arrayList.clear();
            }
        }

        public int f(int i10) {
            if (i10 >= 0 && i10 < RecyclerView.this.f2903r0.b()) {
                return !RecyclerView.this.f2903r0.e() ? i10 : RecyclerView.this.f2885e.m(i10);
            }
            throw new IndexOutOfBoundsException("invalid position " + i10 + ". State item count is " + RecyclerView.this.f2903r0.b() + RecyclerView.this.W());
        }

        void g(f0 f0Var) {
            RecyclerView.this.getClass();
            if (RecyclerView.this.f2914x.size() > 0) {
                android.support.v4.media.session.b.a(RecyclerView.this.f2914x.get(0));
                throw null;
            }
            h hVar = RecyclerView.this.f2910v;
            if (hVar != null) {
                hVar.z(f0Var);
            }
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.f2903r0 != null) {
                recyclerView.f2889g.q(f0Var);
            }
            if (RecyclerView.O0) {
                Log.d("RecyclerView", "dispatchViewRecycled: " + f0Var);
            }
        }

        f0 h(int i10) {
            int size;
            int iM;
            ArrayList arrayList = this.f3036b;
            if (arrayList != null && (size = arrayList.size()) != 0) {
                for (int i11 = 0; i11 < size; i11++) {
                    f0 f0Var = (f0) this.f3036b.get(i11);
                    if (!f0Var.N() && f0Var.o() == i10) {
                        f0Var.b(32);
                        return f0Var;
                    }
                }
                if (RecyclerView.this.f2910v.j() && (iM = RecyclerView.this.f2885e.m(i10)) > 0 && iM < RecyclerView.this.f2910v.f()) {
                    long jG = RecyclerView.this.f2910v.g(iM);
                    for (int i12 = 0; i12 < size; i12++) {
                        f0 f0Var2 = (f0) this.f3036b.get(i12);
                        if (!f0Var2.N() && f0Var2.m() == jG) {
                            f0Var2.b(32);
                            return f0Var2;
                        }
                    }
                }
            }
            return null;
        }

        v i() {
            if (this.f3041g == null) {
                this.f3041g = new v();
                u();
            }
            return this.f3041g;
        }

        int j() {
            return this.f3035a.size();
        }

        public List k() {
            return this.f3038d;
        }

        f0 l(long j10, int i10, boolean z10) {
            for (int size = this.f3035a.size() - 1; size >= 0; size--) {
                f0 f0Var = (f0) this.f3035a.get(size);
                if (f0Var.m() == j10 && !f0Var.N()) {
                    if (i10 == f0Var.n()) {
                        f0Var.b(32);
                        if (f0Var.x() && !RecyclerView.this.f2903r0.e()) {
                            f0Var.H(2, 14);
                        }
                        return f0Var;
                    }
                    if (!z10) {
                        this.f3035a.remove(size);
                        RecyclerView.this.removeDetachedView(f0Var.f2964a, false);
                        D(f0Var.f2964a);
                    }
                }
            }
            int size2 = this.f3037c.size();
            while (true) {
                size2--;
                if (size2 < 0) {
                    return null;
                }
                f0 f0Var2 = (f0) this.f3037c.get(size2);
                if (f0Var2.m() == j10 && !f0Var2.t()) {
                    if (i10 == f0Var2.n()) {
                        if (!z10) {
                            this.f3037c.remove(size2);
                        }
                        return f0Var2;
                    }
                    if (!z10) {
                        F(size2);
                        return null;
                    }
                }
            }
        }

        f0 m(int i10, boolean z10) {
            View viewE;
            int size = this.f3035a.size();
            for (int i11 = 0; i11 < size; i11++) {
                f0 f0Var = (f0) this.f3035a.get(i11);
                if (!f0Var.N() && f0Var.o() == i10 && !f0Var.v() && (RecyclerView.this.f2903r0.f2944h || !f0Var.x())) {
                    f0Var.b(32);
                    return f0Var;
                }
            }
            if (!z10 && (viewE = RecyclerView.this.f2887f.e(i10)) != null) {
                f0 f0VarP0 = RecyclerView.p0(viewE);
                RecyclerView.this.f2887f.s(viewE);
                int iM = RecyclerView.this.f2887f.m(viewE);
                if (iM != -1) {
                    RecyclerView.this.f2887f.d(iM);
                    I(viewE);
                    f0VarP0.b(8224);
                    return f0VarP0;
                }
                throw new IllegalStateException("layout index should not be -1 after unhiding a view:" + f0VarP0 + RecyclerView.this.W());
            }
            int size2 = this.f3037c.size();
            for (int i12 = 0; i12 < size2; i12++) {
                f0 f0Var2 = (f0) this.f3037c.get(i12);
                if (!f0Var2.v() && f0Var2.o() == i10 && !f0Var2.t()) {
                    if (!z10) {
                        this.f3037c.remove(i12);
                    }
                    if (RecyclerView.O0) {
                        Log.d("RecyclerView", "getScrapOrHiddenOrCachedHolderForPosition(" + i10 + ") found match in cache: " + f0Var2);
                    }
                    return f0Var2;
                }
            }
            return null;
        }

        View n(int i10) {
            return ((f0) this.f3035a.get(i10)).f2964a;
        }

        public View o(int i10) {
            return p(i10, false);
        }

        View p(int i10, boolean z10) {
            return N(i10, z10, Long.MAX_VALUE).f2964a;
        }

        void s() {
            int size = this.f3037c.size();
            for (int i10 = 0; i10 < size; i10++) {
                r rVar = (r) ((f0) this.f3037c.get(i10)).f2964a.getLayoutParams();
                if (rVar != null) {
                    rVar.f3026c = true;
                }
            }
        }

        void t() {
            int size = this.f3037c.size();
            for (int i10 = 0; i10 < size; i10++) {
                f0 f0Var = (f0) this.f3037c.get(i10);
                if (f0Var != null) {
                    f0Var.b(6);
                    f0Var.a(null);
                }
            }
            h hVar = RecyclerView.this.f2910v;
            if (hVar == null || !hVar.j()) {
                E();
            }
        }

        void v(int i10, int i11) {
            int size = this.f3037c.size();
            for (int i12 = 0; i12 < size; i12++) {
                f0 f0Var = (f0) this.f3037c.get(i12);
                if (f0Var != null && f0Var.f2966c >= i10) {
                    if (RecyclerView.O0) {
                        Log.d("RecyclerView", "offsetPositionRecordsForInsert cached " + i12 + " holder " + f0Var + " now at position " + (f0Var.f2966c + i11));
                    }
                    f0Var.C(i11, false);
                }
            }
        }

        void w(int i10, int i11) {
            int i12;
            int i13;
            int i14;
            int i15;
            if (i10 < i11) {
                i12 = -1;
                i14 = i10;
                i13 = i11;
            } else {
                i12 = 1;
                i13 = i10;
                i14 = i11;
            }
            int size = this.f3037c.size();
            for (int i16 = 0; i16 < size; i16++) {
                f0 f0Var = (f0) this.f3037c.get(i16);
                if (f0Var != null && (i15 = f0Var.f2966c) >= i14 && i15 <= i13) {
                    if (i15 == i10) {
                        f0Var.C(i11 - i10, false);
                    } else {
                        f0Var.C(i12, false);
                    }
                    if (RecyclerView.O0) {
                        Log.d("RecyclerView", "offsetPositionRecordsForMove cached child " + i16 + " holder " + f0Var);
                    }
                }
            }
        }

        void x(int i10, int i11, boolean z10) {
            int i12 = i10 + i11;
            for (int size = this.f3037c.size() - 1; size >= 0; size--) {
                f0 f0Var = (f0) this.f3037c.get(size);
                if (f0Var != null) {
                    int i13 = f0Var.f2966c;
                    if (i13 >= i12) {
                        if (RecyclerView.O0) {
                            Log.d("RecyclerView", "offsetPositionRecordsForRemove cached " + size + " holder " + f0Var + " now at position " + (f0Var.f2966c - i11));
                        }
                        f0Var.C(-i11, z10);
                    } else if (i13 >= i10) {
                        f0Var.b(8);
                        F(size);
                    }
                }
            }
        }

        void y(h hVar, h hVar2, boolean z10) {
            c();
            C(hVar, true);
            i().j(hVar, hVar2, z10);
            u();
        }

        void z() {
            u();
        }
    }

    public interface x {
    }

    private class y extends j {
        y() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void a() {
            RecyclerView.this.s(null);
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.f2903r0.f2943g = true;
            recyclerView.b1(true);
            if (RecyclerView.this.f2885e.p()) {
                return;
            }
            RecyclerView.this.requestLayout();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void b(int i10, int i11, Object obj) {
            RecyclerView.this.s(null);
            if (RecyclerView.this.f2885e.r(i10, i11, obj)) {
                e();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void c(int i10, int i11) {
            RecyclerView.this.s(null);
            if (RecyclerView.this.f2885e.s(i10, i11)) {
                e();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void d(int i10, int i11) {
            RecyclerView.this.s(null);
            if (RecyclerView.this.f2885e.t(i10, i11)) {
                e();
            }
        }

        void e() {
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.C && recyclerView.B) {
                o0.e0(recyclerView, recyclerView.f2902r);
            } else {
                recyclerView.K = true;
                recyclerView.requestLayout();
            }
        }
    }

    static {
        int i10 = Build.VERSION.SDK_INT;
        R0 = false;
        S0 = i10 >= 23;
        T0 = true;
        Class cls = Integer.TYPE;
        U0 = new Class[]{Context.class, AttributeSet.class, cls, cls};
        V0 = new c();
        W0 = new c0();
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, k1.a.f18920a);
    }

    private void A0() {
        if (o0.B(this) == 0) {
            o0.w0(this, 8);
        }
    }

    private void B0() {
        this.f2887f = new androidx.recyclerview.widget.b(new f());
    }

    private void C(Context context, String str, AttributeSet attributeSet, int i10, int i11) {
        Object[] objArr;
        Constructor constructor;
        if (str != null) {
            String strTrim = str.trim();
            if (strTrim.isEmpty()) {
                return;
            }
            String strT0 = t0(context, strTrim);
            try {
                Class<? extends U> clsAsSubclass = Class.forName(strT0, false, isInEditMode() ? getClass().getClassLoader() : context.getClassLoader()).asSubclass(q.class);
                try {
                    constructor = clsAsSubclass.getConstructor(U0);
                    objArr = new Object[]{context, attributeSet, Integer.valueOf(i10), Integer.valueOf(i11)};
                } catch (NoSuchMethodException e10) {
                    objArr = null;
                    try {
                        constructor = clsAsSubclass.getConstructor(null);
                    } catch (NoSuchMethodException e11) {
                        e11.initCause(e10);
                        throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + strT0, e11);
                    }
                }
                constructor.setAccessible(true);
                setLayoutManager((q) constructor.newInstance(objArr));
            } catch (ClassCastException e12) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Class is not a LayoutManager " + strT0, e12);
            } catch (ClassNotFoundException e13) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Unable to find LayoutManager " + strT0, e13);
            } catch (IllegalAccessException e14) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Cannot access non-public constructor " + strT0, e14);
            } catch (InstantiationException e15) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + strT0, e15);
            } catch (InvocationTargetException e16) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + strT0, e16);
            }
        }
    }

    private boolean E(int i10, int i11) {
        b0(this.f2919z0);
        int[] iArr = this.f2919z0;
        return (iArr[0] == i10 && iArr[1] == i11) ? false : true;
    }

    private boolean G0(View view, View view2, int i10) {
        int i11;
        if (view2 == null || view2 == this || view2 == view || Y(view2) == null) {
            return false;
        }
        if (view == null || Y(view) == null) {
            return true;
        }
        this.f2904s.set(0, 0, view.getWidth(), view.getHeight());
        this.f2906t.set(0, 0, view2.getWidth(), view2.getHeight());
        offsetDescendantRectToMyCoords(view, this.f2904s);
        offsetDescendantRectToMyCoords(view2, this.f2906t);
        byte b10 = -1;
        int i12 = this.f2912w.d0() == 1 ? -1 : 1;
        Rect rect = this.f2904s;
        int i13 = rect.left;
        Rect rect2 = this.f2906t;
        int i14 = rect2.left;
        if ((i13 < i14 || rect.right <= i14) && rect.right < rect2.right) {
            i11 = 1;
        } else {
            int i15 = rect.right;
            int i16 = rect2.right;
            i11 = ((i15 > i16 || i13 >= i16) && i13 > i14) ? -1 : 0;
        }
        int i17 = rect.top;
        int i18 = rect2.top;
        if ((i17 < i18 || rect.bottom <= i18) && rect.bottom < rect2.bottom) {
            b10 = 1;
        } else {
            int i19 = rect.bottom;
            int i20 = rect2.bottom;
            if ((i19 <= i20 && i17 < i20) || i17 <= i18) {
                b10 = 0;
            }
        }
        if (i10 == 1) {
            return b10 < 0 || (b10 == 0 && i11 * i12 < 0);
        }
        if (i10 == 2) {
            return b10 > 0 || (b10 == 0 && i11 * i12 > 0);
        }
        if (i10 == 17) {
            return i11 < 0;
        }
        if (i10 == 33) {
            return b10 < 0;
        }
        if (i10 == 66) {
            return i11 > 0;
        }
        if (i10 == 130) {
            return b10 > 0;
        }
        throw new IllegalArgumentException("Invalid direction: " + i10 + W());
    }

    private void H() {
        int i10 = this.J;
        this.J = 0;
        if (i10 == 0 || !E0()) {
            return;
        }
        AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
        accessibilityEventObtain.setEventType(2048);
        n0.b.b(accessibilityEventObtain, i10);
        sendAccessibilityEventUnchecked(accessibilityEventObtain);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void H1(int i10) {
        boolean zP = this.f2912w.p();
        int i11 = zP;
        if (this.f2912w.q()) {
            i11 = (zP ? 1 : 0) | 2;
        }
        G1(i11, i10);
    }

    private boolean I1(MotionEvent motionEvent) {
        boolean z10;
        EdgeEffect edgeEffect = this.S;
        if (edgeEffect == null || androidx.core.widget.d.b(edgeEffect) == 0.0f || canScrollHorizontally(-1)) {
            z10 = false;
        } else {
            androidx.core.widget.d.d(this.S, 0.0f, 1.0f - (motionEvent.getY() / getHeight()));
            z10 = true;
        }
        EdgeEffect edgeEffect2 = this.U;
        if (edgeEffect2 != null && androidx.core.widget.d.b(edgeEffect2) != 0.0f && !canScrollHorizontally(1)) {
            androidx.core.widget.d.d(this.U, 0.0f, motionEvent.getY() / getHeight());
            z10 = true;
        }
        EdgeEffect edgeEffect3 = this.T;
        if (edgeEffect3 != null && androidx.core.widget.d.b(edgeEffect3) != 0.0f && !canScrollVertically(-1)) {
            androidx.core.widget.d.d(this.T, 0.0f, motionEvent.getX() / getWidth());
            z10 = true;
        }
        EdgeEffect edgeEffect4 = this.V;
        if (edgeEffect4 == null || androidx.core.widget.d.b(edgeEffect4) == 0.0f || canScrollVertically(1)) {
            return z10;
        }
        androidx.core.widget.d.d(this.V, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
        return true;
    }

    private void J() {
        this.f2903r0.a(1);
        X(this.f2903r0);
        this.f2903r0.f2946j = false;
        F1();
        this.f2889g.f();
        S0();
        a1();
        r1();
        b0 b0Var = this.f2903r0;
        b0Var.f2945i = b0Var.f2947k && this.f2911v0;
        this.f2911v0 = false;
        this.f2909u0 = false;
        b0Var.f2944h = b0Var.f2948l;
        b0Var.f2942f = this.f2910v.f();
        b0(this.f2919z0);
        if (this.f2903r0.f2947k) {
            int iG = this.f2887f.g();
            for (int i10 = 0; i10 < iG; i10++) {
                f0 f0VarP0 = p0(this.f2887f.f(i10));
                if (!f0VarP0.L() && (!f0VarP0.v() || this.f2910v.j())) {
                    this.f2889g.e(f0VarP0, this.W.t(this.f2903r0, f0VarP0, n.e(f0VarP0), f0VarP0.q()));
                    if (this.f2903r0.f2945i && f0VarP0.A() && !f0VarP0.x() && !f0VarP0.L() && !f0VarP0.v()) {
                        this.f2889g.c(l0(f0VarP0), f0VarP0);
                    }
                }
            }
        }
        if (this.f2903r0.f2948l) {
            s1();
            b0 b0Var2 = this.f2903r0;
            boolean z10 = b0Var2.f2943g;
            b0Var2.f2943g = false;
            this.f2912w.c1(this.f2881c, b0Var2);
            this.f2903r0.f2943g = z10;
            for (int i11 = 0; i11 < this.f2887f.g(); i11++) {
                f0 f0VarP02 = p0(this.f2887f.f(i11));
                if (!f0VarP02.L() && !this.f2889g.i(f0VarP02)) {
                    int iE = n.e(f0VarP02);
                    boolean zR = f0VarP02.r(8192);
                    if (!zR) {
                        iE |= 4096;
                    }
                    n.b bVarT = this.W.t(this.f2903r0, f0VarP02, iE, f0VarP02.q());
                    if (zR) {
                        d1(f0VarP02, bVarT);
                    } else {
                        this.f2889g.a(f0VarP02, bVarT);
                    }
                }
            }
            w();
        } else {
            w();
        }
        T0();
        J1(false);
        this.f2903r0.f2941e = 2;
    }

    private void K() {
        F1();
        S0();
        this.f2903r0.a(6);
        this.f2885e.j();
        this.f2903r0.f2942f = this.f2910v.f();
        this.f2903r0.f2940d = 0;
        if (this.f2883d != null && this.f2910v.c()) {
            Parcelable parcelable = this.f2883d.f3044a;
            if (parcelable != null) {
                this.f2912w.h1(parcelable);
            }
            this.f2883d = null;
        }
        b0 b0Var = this.f2903r0;
        b0Var.f2944h = false;
        this.f2912w.c1(this.f2881c, b0Var);
        b0 b0Var2 = this.f2903r0;
        b0Var2.f2943g = false;
        b0Var2.f2947k = b0Var2.f2947k && this.W != null;
        b0Var2.f2941e = 4;
        T0();
        J1(false);
    }

    private void K0(int i10, int i11, MotionEvent motionEvent, int i12) {
        q qVar = this.f2912w;
        if (qVar == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.H) {
            return;
        }
        int[] iArr = this.D0;
        iArr[0] = 0;
        iArr[1] = 0;
        boolean zP = qVar.p();
        boolean zQ = this.f2912w.q();
        int i13 = zQ ? (zP ? 1 : 0) | 2 : zP ? 1 : 0;
        float height = motionEvent == null ? getHeight() / 2.0f : motionEvent.getY();
        float width = motionEvent == null ? getWidth() / 2.0f : motionEvent.getX();
        int iG1 = i10 - g1(i10, height);
        int iH1 = i11 - h1(i11, width);
        G1(i13, i12);
        if (M(zP ? iG1 : 0, zQ ? iH1 : 0, this.D0, this.B0, i12)) {
            int[] iArr2 = this.D0;
            iG1 -= iArr2[0];
            iH1 -= iArr2[1];
        }
        t1(zP ? iG1 : 0, zQ ? iH1 : 0, motionEvent, i12);
        androidx.recyclerview.widget.e eVar = this.f2900p0;
        if (eVar != null && (iG1 != 0 || iH1 != 0)) {
            eVar.f(this, iG1, iH1);
        }
        K1(i12);
    }

    private void L() {
        RecyclerView recyclerView;
        this.f2903r0.a(4);
        F1();
        S0();
        b0 b0Var = this.f2903r0;
        b0Var.f2941e = 1;
        if (b0Var.f2947k) {
            for (int iG = this.f2887f.g() - 1; iG >= 0; iG--) {
                f0 f0VarP0 = p0(this.f2887f.f(iG));
                if (!f0VarP0.L()) {
                    long jL0 = l0(f0VarP0);
                    n.b bVarS = this.W.s(this.f2903r0, f0VarP0);
                    f0 f0VarG = this.f2889g.g(jL0);
                    if (f0VarG == null || f0VarG.L()) {
                        this.f2889g.d(f0VarP0, bVarS);
                    } else {
                        boolean zH = this.f2889g.h(f0VarG);
                        boolean zH2 = this.f2889g.h(f0VarP0);
                        if (zH && f0VarG == f0VarP0) {
                            this.f2889g.d(f0VarP0, bVarS);
                        } else {
                            n.b bVarN = this.f2889g.n(f0VarG);
                            this.f2889g.d(f0VarP0, bVarS);
                            n.b bVarM = this.f2889g.m(f0VarP0);
                            if (bVarN == null) {
                                w0(jL0, f0VarP0, f0VarG);
                            } else {
                                q(f0VarG, f0VarP0, bVarN, bVarM, zH, zH2);
                            }
                        }
                    }
                }
            }
            recyclerView = this;
            recyclerView.f2889g.o(recyclerView.K0);
        } else {
            recyclerView = this;
        }
        recyclerView.f2912w.q1(recyclerView.f2881c);
        b0 b0Var2 = recyclerView.f2903r0;
        b0Var2.f2939c = b0Var2.f2942f;
        recyclerView.N = false;
        recyclerView.O = false;
        b0Var2.f2947k = false;
        b0Var2.f2948l = false;
        recyclerView.f2912w.f3007h = false;
        ArrayList arrayList = recyclerView.f2881c.f3036b;
        if (arrayList != null) {
            arrayList.clear();
        }
        q qVar = recyclerView.f2912w;
        if (qVar.f3013n) {
            qVar.f3012m = 0;
            qVar.f3013n = false;
            recyclerView.f2881c.P();
        }
        recyclerView.f2912w.d1(recyclerView.f2903r0);
        T0();
        J1(false);
        recyclerView.f2889g.f();
        int[] iArr = recyclerView.f2919z0;
        if (E(iArr[0], iArr[1])) {
            P(0, 0);
        }
        e1();
        p1();
    }

    private void M1() {
        this.f2899o0.f();
        q qVar = this.f2912w;
        if (qVar != null) {
            qVar.P1();
        }
    }

    private boolean R(MotionEvent motionEvent) {
        t tVar = this.A;
        if (tVar == null) {
            if (motionEvent.getAction() == 0) {
                return false;
            }
            return a0(motionEvent);
        }
        tVar.a(this, motionEvent);
        int action = motionEvent.getAction();
        if (action == 3 || action == 1) {
            this.A = null;
        }
        return true;
    }

    private void V0(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f2880b0) {
            int i10 = actionIndex == 0 ? 1 : 0;
            this.f2880b0 = motionEvent.getPointerId(i10);
            int x10 = (int) (motionEvent.getX(i10) + 0.5f);
            this.f2888f0 = x10;
            this.f2884d0 = x10;
            int y10 = (int) (motionEvent.getY(i10) + 0.5f);
            this.f2890g0 = y10;
            this.f2886e0 = y10;
        }
    }

    private boolean Z0() {
        return this.W != null && this.f2912w.Q1();
    }

    private boolean a0(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        int size = this.f2918z.size();
        for (int i10 = 0; i10 < size; i10++) {
            t tVar = (t) this.f2918z.get(i10);
            if (tVar.b(this, motionEvent) && action != 3) {
                this.A = tVar;
                return true;
            }
        }
        return false;
    }

    private void a1() {
        boolean z10;
        if (this.N) {
            this.f2885e.x();
            if (this.O) {
                this.f2912w.X0(this);
            }
        }
        if (Z0()) {
            this.f2885e.v();
        } else {
            this.f2885e.j();
        }
        boolean z11 = this.f2909u0 || this.f2911v0;
        this.f2903r0.f2947k = this.E && this.W != null && ((z10 = this.N) || z11 || this.f2912w.f3007h) && (!z10 || this.f2910v.j());
        b0 b0Var = this.f2903r0;
        b0Var.f2948l = b0Var.f2947k && z11 && !this.N && Z0();
    }

    private void b0(int[] iArr) {
        int iG = this.f2887f.g();
        if (iG == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i10 = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        int i11 = RtlSpacingHelper.UNDEFINED;
        for (int i12 = 0; i12 < iG; i12++) {
            f0 f0VarP0 = p0(this.f2887f.f(i12));
            if (!f0VarP0.L()) {
                int iO = f0VarP0.o();
                if (iO < i10) {
                    i10 = iO;
                }
                if (iO > i11) {
                    i11 = iO;
                }
            }
        }
        iArr[0] = i10;
        iArr[1] = i11;
    }

    static RecyclerView c0(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            RecyclerView recyclerViewC0 = c0(viewGroup.getChildAt(i10));
            if (recyclerViewC0 != null) {
                return recyclerViewC0;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void c1(float r7, float r8, float r9, float r10) {
        /*
            r6 = this;
            r0 = 1065353216(0x3f800000, float:1.0)
            r1 = 1
            r2 = 0
            int r3 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r3 >= 0) goto L21
            r6.T()
            android.widget.EdgeEffect r3 = r6.S
            float r4 = -r8
            int r5 = r6.getWidth()
            float r5 = (float) r5
            float r4 = r4 / r5
            int r5 = r6.getHeight()
            float r5 = (float) r5
            float r9 = r9 / r5
            float r9 = r0 - r9
            androidx.core.widget.d.d(r3, r4, r9)
        L1f:
            r9 = 1
            goto L3c
        L21:
            int r3 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r3 <= 0) goto L3b
            r6.U()
            android.widget.EdgeEffect r3 = r6.U
            int r4 = r6.getWidth()
            float r4 = (float) r4
            float r4 = r8 / r4
            int r5 = r6.getHeight()
            float r5 = (float) r5
            float r9 = r9 / r5
            androidx.core.widget.d.d(r3, r4, r9)
            goto L1f
        L3b:
            r9 = 0
        L3c:
            int r3 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r3 >= 0) goto L56
            r6.V()
            android.widget.EdgeEffect r9 = r6.T
            float r0 = -r10
            int r3 = r6.getHeight()
            float r3 = (float) r3
            float r0 = r0 / r3
            int r3 = r6.getWidth()
            float r3 = (float) r3
            float r7 = r7 / r3
            androidx.core.widget.d.d(r9, r0, r7)
            goto L72
        L56:
            int r3 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r3 <= 0) goto L71
            r6.S()
            android.widget.EdgeEffect r9 = r6.V
            int r3 = r6.getHeight()
            float r3 = (float) r3
            float r3 = r10 / r3
            int r4 = r6.getWidth()
            float r4 = (float) r4
            float r7 = r7 / r4
            float r0 = r0 - r7
            androidx.core.widget.d.d(r9, r3, r0)
            goto L72
        L71:
            r1 = r9
        L72:
            if (r1 != 0) goto L7e
            int r7 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r7 != 0) goto L7e
            int r7 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r7 == 0) goto L7d
            goto L7e
        L7d:
            return
        L7e:
            r6.postInvalidateOnAnimation()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.c1(float, float, float, float):void");
    }

    private View d0() {
        f0 f0VarE0;
        b0 b0Var = this.f2903r0;
        int i10 = b0Var.f2949m;
        if (i10 == -1) {
            i10 = 0;
        }
        int iB = b0Var.b();
        for (int i11 = i10; i11 < iB; i11++) {
            f0 f0VarE02 = e0(i11);
            if (f0VarE02 == null) {
                break;
            }
            if (f0VarE02.f2964a.hasFocusable()) {
                return f0VarE02.f2964a;
            }
        }
        int iMin = Math.min(iB, i10);
        do {
            iMin--;
            if (iMin < 0 || (f0VarE0 = e0(iMin)) == null) {
                return null;
            }
        } while (!f0VarE0.f2964a.hasFocusable());
        return f0VarE0.f2964a;
    }

    private void e1() {
        View viewFindViewById;
        if (!this.f2898n0 || this.f2910v == null || !hasFocus() || getDescendantFocusability() == 393216) {
            return;
        }
        if (getDescendantFocusability() == 131072 && isFocused()) {
            return;
        }
        if (!isFocused()) {
            if (!this.f2887f.n(getFocusedChild())) {
                return;
            }
        }
        View viewD0 = null;
        f0 f0VarF0 = (this.f2903r0.f2950n == -1 || !this.f2910v.j()) ? null : f0(this.f2903r0.f2950n);
        if (f0VarF0 != null && !this.f2887f.n(f0VarF0.f2964a) && f0VarF0.f2964a.hasFocusable()) {
            viewD0 = f0VarF0.f2964a;
        } else if (this.f2887f.g() > 0) {
            viewD0 = d0();
        }
        if (viewD0 != null) {
            int i10 = this.f2903r0.f2951o;
            if (i10 != -1 && (viewFindViewById = viewD0.findViewById(i10)) != null && viewFindViewById.isFocusable()) {
                viewD0 = viewFindViewById;
            }
            viewD0.requestFocus();
        }
    }

    private void f1() {
        boolean zIsFinished;
        EdgeEffect edgeEffect = this.S;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            zIsFinished = this.S.isFinished();
        } else {
            zIsFinished = false;
        }
        EdgeEffect edgeEffect2 = this.T;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            zIsFinished |= this.T.isFinished();
        }
        EdgeEffect edgeEffect3 = this.U;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            zIsFinished |= this.U.isFinished();
        }
        EdgeEffect edgeEffect4 = this.V;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            zIsFinished |= this.V.isFinished();
        }
        if (zIsFinished) {
            postInvalidateOnAnimation();
        }
    }

    private int g1(int i10, float f10) {
        float height = f10 / getHeight();
        float width = i10 / getWidth();
        EdgeEffect edgeEffect = this.S;
        float f11 = 0.0f;
        if (edgeEffect == null || androidx.core.widget.d.b(edgeEffect) == 0.0f) {
            EdgeEffect edgeEffect2 = this.U;
            if (edgeEffect2 != null && androidx.core.widget.d.b(edgeEffect2) != 0.0f) {
                if (canScrollHorizontally(1)) {
                    this.U.onRelease();
                } else {
                    float fD = androidx.core.widget.d.d(this.U, width, height);
                    if (androidx.core.widget.d.b(this.U) == 0.0f) {
                        this.U.onRelease();
                    }
                    f11 = fD;
                }
                invalidate();
            }
        } else {
            if (canScrollHorizontally(-1)) {
                this.S.onRelease();
            } else {
                float f12 = -androidx.core.widget.d.d(this.S, -width, 1.0f - height);
                if (androidx.core.widget.d.b(this.S) == 0.0f) {
                    this.S.onRelease();
                }
                f11 = f12;
            }
            invalidate();
        }
        return Math.round(f11 * getWidth());
    }

    private m0.x getScrollingChildHelper() {
        if (this.A0 == null) {
            this.A0 = new m0.x(this);
        }
        return this.A0;
    }

    private int h1(int i10, float f10) {
        float width = f10 / getWidth();
        float height = i10 / getHeight();
        EdgeEffect edgeEffect = this.T;
        float f11 = 0.0f;
        if (edgeEffect == null || androidx.core.widget.d.b(edgeEffect) == 0.0f) {
            EdgeEffect edgeEffect2 = this.V;
            if (edgeEffect2 != null && androidx.core.widget.d.b(edgeEffect2) != 0.0f) {
                if (canScrollVertically(1)) {
                    this.V.onRelease();
                } else {
                    float fD = androidx.core.widget.d.d(this.V, height, 1.0f - width);
                    if (androidx.core.widget.d.b(this.V) == 0.0f) {
                        this.V.onRelease();
                    }
                    f11 = fD;
                }
                invalidate();
            }
        } else {
            if (canScrollVertically(-1)) {
                this.T.onRelease();
            } else {
                float f12 = -androidx.core.widget.d.d(this.T, -height, width);
                if (androidx.core.widget.d.b(this.T) == 0.0f) {
                    this.T.onRelease();
                }
                f11 = f12;
            }
            invalidate();
        }
        return Math.round(f11 * getHeight());
    }

    private boolean i0(int i10, int i11, int i12, int i13) {
        int iMax;
        int i14;
        q qVar = this.f2912w;
        if (qVar == null) {
            Log.e("RecyclerView", "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return false;
        }
        if (this.H) {
            return false;
        }
        boolean zP = qVar.p();
        boolean zQ = this.f2912w.q();
        if (!zP || Math.abs(i10) < i12) {
            i10 = 0;
        }
        if (!zQ || Math.abs(i11) < i12) {
            i11 = 0;
        }
        if (i10 == 0 && i11 == 0) {
            return false;
        }
        if (i10 == 0) {
            iMax = 0;
        } else {
            EdgeEffect edgeEffect = this.S;
            if (edgeEffect == null || androidx.core.widget.d.b(edgeEffect) == 0.0f) {
                EdgeEffect edgeEffect2 = this.U;
                if (edgeEffect2 != null && androidx.core.widget.d.b(edgeEffect2) != 0.0f) {
                    if (y1(this.U, i10, getWidth())) {
                        this.U.onAbsorb(i10);
                        i10 = 0;
                    }
                    iMax = i10;
                    i10 = 0;
                }
                iMax = 0;
            } else {
                int i15 = -i10;
                if (y1(this.S, i15, getWidth())) {
                    this.S.onAbsorb(i15);
                    i10 = 0;
                }
                iMax = i10;
                i10 = 0;
            }
        }
        if (i11 == 0) {
            i14 = i11;
            i11 = 0;
        } else {
            EdgeEffect edgeEffect3 = this.T;
            if (edgeEffect3 == null || androidx.core.widget.d.b(edgeEffect3) == 0.0f) {
                EdgeEffect edgeEffect4 = this.V;
                if (edgeEffect4 != null && androidx.core.widget.d.b(edgeEffect4) != 0.0f) {
                    if (y1(this.V, i11, getHeight())) {
                        this.V.onAbsorb(i11);
                        i11 = 0;
                    }
                    i14 = 0;
                }
                i14 = i11;
                i11 = 0;
            } else {
                int i16 = -i11;
                if (y1(this.T, i16, getHeight())) {
                    this.T.onAbsorb(i16);
                    i11 = 0;
                }
                i14 = 0;
            }
        }
        if (iMax != 0 || i11 != 0) {
            int i17 = -i13;
            iMax = Math.max(i17, Math.min(iMax, i13));
            i11 = Math.max(i17, Math.min(i11, i13));
            H1(1);
            this.f2899o0.b(iMax, i11);
        }
        if (i10 == 0 && i14 == 0) {
            return (iMax == 0 && i11 == 0) ? false : true;
        }
        float f10 = i10;
        float f11 = i14;
        if (!dispatchNestedPreFling(f10, f11)) {
            boolean z10 = zP || zQ;
            dispatchNestedFling(f10, f11, z10);
            s sVar = this.f2893i0;
            if (sVar != null && sVar.a(i10, i14)) {
                return true;
            }
            if (z10) {
                H1(1);
                int i18 = -i13;
                this.f2899o0.b(Math.max(i18, Math.min(i10, i13)), Math.max(i18, Math.min(i14, i13)));
                return true;
            }
        }
        return false;
    }

    private void k(f0 f0Var) {
        View view = f0Var.f2964a;
        boolean z10 = view.getParent() == this;
        this.f2881c.O(o0(view));
        if (f0Var.z()) {
            this.f2887f.c(view, -1, view.getLayoutParams(), true);
        } else if (z10) {
            this.f2887f.k(view);
        } else {
            this.f2887f.b(view, true);
        }
    }

    private void o1(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        this.f2904s.set(0, 0, view3.getWidth(), view3.getHeight());
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof r) {
            r rVar = (r) layoutParams;
            if (!rVar.f3026c) {
                Rect rect = rVar.f3025b;
                Rect rect2 = this.f2904s;
                rect2.left -= rect.left;
                rect2.right += rect.right;
                rect2.top -= rect.top;
                rect2.bottom += rect.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, this.f2904s);
            offsetRectIntoDescendantCoords(view, this.f2904s);
        }
        this.f2912w.x1(this, view, this.f2904s, !this.E, view2 == null);
    }

    static f0 p0(View view) {
        if (view == null) {
            return null;
        }
        return ((r) view.getLayoutParams()).f3024a;
    }

    private void p1() {
        b0 b0Var = this.f2903r0;
        b0Var.f2950n = -1L;
        b0Var.f2949m = -1;
        b0Var.f2951o = -1;
    }

    private void q(f0 f0Var, f0 f0Var2, n.b bVar, n.b bVar2, boolean z10, boolean z11) {
        f0Var.I(false);
        if (z10) {
            k(f0Var);
        }
        if (f0Var != f0Var2) {
            if (z11) {
                k(f0Var2);
            }
            f0Var.f2971h = f0Var2;
            k(f0Var);
            this.f2881c.O(f0Var);
            f0Var2.I(false);
            f0Var2.f2972r = f0Var;
        }
        if (this.W.b(f0Var, f0Var2, bVar, bVar2)) {
            Y0();
        }
    }

    private void q1() {
        VelocityTracker velocityTracker = this.f2882c0;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        K1(0);
        f1();
    }

    static void r0(View view, Rect rect) {
        r rVar = (r) view.getLayoutParams();
        Rect rect2 = rVar.f3025b;
        rect.set((view.getLeft() - rect2.left) - ((ViewGroup.MarginLayoutParams) rVar).leftMargin, (view.getTop() - rect2.top) - ((ViewGroup.MarginLayoutParams) rVar).topMargin, view.getRight() + rect2.right + ((ViewGroup.MarginLayoutParams) rVar).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) rVar).bottomMargin);
    }

    private void r1() {
        View focusedChild = (this.f2898n0 && hasFocus() && this.f2910v != null) ? getFocusedChild() : null;
        f0 f0VarZ = focusedChild != null ? Z(focusedChild) : null;
        if (f0VarZ == null) {
            p1();
            return;
        }
        this.f2903r0.f2950n = this.f2910v.j() ? f0VarZ.m() : -1L;
        this.f2903r0.f2949m = this.N ? -1 : f0VarZ.x() ? f0VarZ.f2967d : f0VarZ.j();
        this.f2903r0.f2951o = s0(f0VarZ.f2964a);
    }

    private int s0(View view) {
        int id2 = view.getId();
        while (!view.isFocused() && (view instanceof ViewGroup) && view.hasFocus()) {
            view = ((ViewGroup) view).getFocusedChild();
            if (view.getId() != -1) {
                id2 = view.getId();
            }
        }
        return id2;
    }

    public static void setDebugAssertionsEnabled(boolean z10) {
        N0 = z10;
    }

    public static void setVerboseLoggingEnabled(boolean z10) {
        O0 = z10;
    }

    private String t0(Context context, String str) {
        if (str.charAt(0) == '.') {
            return context.getPackageName() + str;
        }
        if (str.contains(".")) {
            return str;
        }
        return RecyclerView.class.getPackage().getName() + '.' + str;
    }

    private void u() {
        q1();
        setScrollState(0);
    }

    static void v(f0 f0Var) {
        WeakReference weakReference = f0Var.f2965b;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            while (view != null) {
                if (view == f0Var.f2964a) {
                    return;
                }
                Object parent = view.getParent();
                view = parent instanceof View ? (View) parent : null;
            }
            f0Var.f2965b = null;
        }
    }

    private float v0(int i10) {
        double dLog = Math.log((Math.abs(i10) * 0.35f) / (this.f2877a * 0.015f));
        float f10 = Q0;
        return (float) (((double) (this.f2877a * 0.015f)) * Math.exp((((double) f10) / (((double) f10) - 1.0d)) * dLog));
    }

    private void w0(long j10, f0 f0Var, f0 f0Var2) {
        int iG = this.f2887f.g();
        for (int i10 = 0; i10 < iG; i10++) {
            f0 f0VarP0 = p0(this.f2887f.f(i10));
            if (f0VarP0 != f0Var && l0(f0VarP0) == j10) {
                h hVar = this.f2910v;
                if (hVar == null || !hVar.j()) {
                    throw new IllegalStateException("Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:" + f0VarP0 + " \n View Holder 2:" + f0Var + W());
                }
                throw new IllegalStateException("Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:" + f0VarP0 + " \n View Holder 2:" + f0Var + W());
            }
        }
        Log.e("RecyclerView", "Problem while matching changed view holders with the newones. The pre-layout information for the change holder " + f0Var2 + " cannot be found but it is necessary for " + f0Var + W());
    }

    private void w1(h hVar, boolean z10, boolean z11) {
        h hVar2 = this.f2910v;
        if (hVar2 != null) {
            hVar2.C(this.f2879b);
            this.f2910v.v(this);
        }
        if (!z10 || z11) {
            i1();
        }
        this.f2885e.x();
        h hVar3 = this.f2910v;
        this.f2910v = hVar;
        if (hVar != null) {
            hVar.A(this.f2879b);
            hVar.r(this);
        }
        q qVar = this.f2912w;
        if (qVar != null) {
            qVar.J0(hVar3, this.f2910v);
        }
        this.f2881c.y(hVar3, this.f2910v, z10);
        this.f2903r0.f2943g = true;
    }

    private boolean y0() {
        int iG = this.f2887f.g();
        for (int i10 = 0; i10 < iG; i10++) {
            f0 f0VarP0 = p0(this.f2887f.f(i10));
            if (f0VarP0 != null && !f0VarP0.L() && f0VarP0.A()) {
                return true;
            }
        }
        return false;
    }

    private boolean y1(EdgeEffect edgeEffect, int i10, int i11) {
        if (i10 > 0) {
            return true;
        }
        return v0(-i10) < androidx.core.widget.d.b(edgeEffect) * ((float) i11);
    }

    private int z(int i10, EdgeEffect edgeEffect, EdgeEffect edgeEffect2, int i11) {
        if (i10 > 0 && edgeEffect != null && androidx.core.widget.d.b(edgeEffect) != 0.0f) {
            int iRound = Math.round(((-i11) / 4.0f) * androidx.core.widget.d.d(edgeEffect, ((-i10) * 4.0f) / i11, 0.5f));
            if (iRound != i10) {
                edgeEffect.finish();
            }
            return i10 - iRound;
        }
        if (i10 >= 0 || edgeEffect2 == null || androidx.core.widget.d.b(edgeEffect2) == 0.0f) {
            return i10;
        }
        float f10 = i11;
        int iRound2 = Math.round((f10 / 4.0f) * androidx.core.widget.d.d(edgeEffect2, (i10 * 4.0f) / f10, 0.5f));
        if (iRound2 != i10) {
            edgeEffect2.finish();
        }
        return i10 - iRound2;
    }

    int A(int i10) {
        return z(i10, this.T, this.V, getHeight());
    }

    public void A1(int i10, int i11) {
        B1(i10, i11, null);
    }

    void B() {
        if (!this.E || this.N) {
            Trace.beginSection("RV FullInvalidate");
            I();
            Trace.endSection();
            return;
        }
        if (this.f2885e.p()) {
            if (!this.f2885e.o(4) || this.f2885e.o(11)) {
                if (this.f2885e.p()) {
                    Trace.beginSection("RV FullInvalidate");
                    I();
                    Trace.endSection();
                    return;
                }
                return;
            }
            Trace.beginSection("RV PartialInvalidate");
            F1();
            S0();
            this.f2885e.v();
            if (!this.G) {
                if (y0()) {
                    I();
                } else {
                    this.f2885e.i();
                }
            }
            J1(true);
            T0();
            Trace.endSection();
        }
    }

    public void B1(int i10, int i11, Interpolator interpolator) {
        C1(i10, i11, interpolator, RtlSpacingHelper.UNDEFINED);
    }

    void C0(StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2) {
        if (stateListDrawable != null && drawable != null && stateListDrawable2 != null && drawable2 != null) {
            Resources resources = getContext().getResources();
            new androidx.recyclerview.widget.d(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(k1.b.f18921a), resources.getDimensionPixelSize(k1.b.f18923c), resources.getDimensionPixelOffset(k1.b.f18922b));
        } else {
            throw new IllegalArgumentException("Trying to set fast scroller without both required drawables." + W());
        }
    }

    public void C1(int i10, int i11, Interpolator interpolator, int i12) {
        D1(i10, i11, interpolator, i12, false);
    }

    void D(int i10, int i11) {
        setMeasuredDimension(q.s(i10, getPaddingLeft() + getPaddingRight(), o0.F(this)), q.s(i11, getPaddingTop() + getPaddingBottom(), o0.E(this)));
    }

    void D0() {
        this.V = null;
        this.T = null;
        this.U = null;
        this.S = null;
    }

    void D1(int i10, int i11, Interpolator interpolator, int i12, boolean z10) {
        q qVar = this.f2912w;
        if (qVar == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.H) {
            return;
        }
        if (!qVar.p()) {
            i10 = 0;
        }
        if (!this.f2912w.q()) {
            i11 = 0;
        }
        if (i10 == 0 && i11 == 0) {
            return;
        }
        if (i12 != Integer.MIN_VALUE && i12 <= 0) {
            scrollBy(i10, i11);
            return;
        }
        if (z10) {
            int i13 = i10 != 0 ? 1 : 0;
            if (i11 != 0) {
                i13 |= 2;
            }
            G1(i13, 1);
        }
        this.f2899o0.e(i10, i11, i12, interpolator);
    }

    boolean E0() {
        AccessibilityManager accessibilityManager = this.L;
        return accessibilityManager != null && accessibilityManager.isEnabled();
    }

    public void E1(int i10) {
        if (this.H) {
            return;
        }
        q qVar = this.f2912w;
        if (qVar == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            qVar.N1(this, this.f2903r0, i10);
        }
    }

    void F(View view) {
        int size;
        f0 f0VarP0 = p0(view);
        Q0(view);
        h hVar = this.f2910v;
        if (hVar != null && f0VarP0 != null) {
            hVar.x(f0VarP0);
        }
        if (this.M == null || r2.size() - 1 < 0) {
            return;
        }
        android.support.v4.media.session.b.a(this.M.get(size));
        throw null;
    }

    public boolean F0() {
        return this.P > 0;
    }

    void F1() {
        int i10 = this.F + 1;
        this.F = i10;
        if (i10 != 1 || this.H) {
            return;
        }
        this.G = false;
    }

    void G(View view) {
        int size;
        f0 f0VarP0 = p0(view);
        R0(view);
        h hVar = this.f2910v;
        if (hVar != null && f0VarP0 != null) {
            hVar.y(f0VarP0);
        }
        if (this.M == null || r2.size() - 1 < 0) {
            return;
        }
        android.support.v4.media.session.b.a(this.M.get(size));
        throw null;
    }

    public boolean G1(int i10, int i11) {
        return getScrollingChildHelper().p(i10, i11);
    }

    void H0(int i10) {
        if (this.f2912w == null) {
            return;
        }
        setScrollState(2);
        this.f2912w.C1(i10);
        awakenScrollBars();
    }

    void I() {
        if (this.f2910v == null) {
            Log.w("RecyclerView", "No adapter attached; skipping layout");
            return;
        }
        if (this.f2912w == null) {
            Log.e("RecyclerView", "No layout manager attached; skipping layout");
            return;
        }
        this.f2903r0.f2946j = false;
        boolean z10 = this.G0 && !(this.H0 == getWidth() && this.I0 == getHeight());
        this.H0 = 0;
        this.I0 = 0;
        this.G0 = false;
        if (this.f2903r0.f2941e == 1) {
            J();
            this.f2912w.E1(this);
            K();
        } else if (this.f2885e.q() || z10 || this.f2912w.s0() != getWidth() || this.f2912w.b0() != getHeight()) {
            this.f2912w.E1(this);
            K();
        } else {
            this.f2912w.E1(this);
        }
        L();
    }

    void I0() {
        int iJ = this.f2887f.j();
        for (int i10 = 0; i10 < iJ; i10++) {
            ((r) this.f2887f.i(i10).getLayoutParams()).f3026c = true;
        }
        this.f2881c.s();
    }

    void J0() {
        int iJ = this.f2887f.j();
        for (int i10 = 0; i10 < iJ; i10++) {
            f0 f0VarP0 = p0(this.f2887f.i(i10));
            if (f0VarP0 != null && !f0VarP0.L()) {
                f0VarP0.b(6);
            }
        }
        I0();
        this.f2881c.t();
    }

    void J1(boolean z10) {
        if (this.F < 1) {
            if (N0) {
                throw new IllegalStateException("stopInterceptRequestLayout was called more times than startInterceptRequestLayout." + W());
            }
            this.F = 1;
        }
        if (!z10 && !this.H) {
            this.G = false;
        }
        if (this.F == 1) {
            if (z10 && this.G && !this.H && this.f2912w != null && this.f2910v != null) {
                I();
            }
            if (!this.H) {
                this.G = false;
            }
        }
        this.F--;
    }

    public void K1(int i10) {
        getScrollingChildHelper().r(i10);
    }

    public void L0(int i10) {
        int iG = this.f2887f.g();
        for (int i11 = 0; i11 < iG; i11++) {
            this.f2887f.f(i11).offsetLeftAndRight(i10);
        }
    }

    public void L1() {
        setScrollState(0);
        M1();
    }

    public boolean M(int i10, int i11, int[] iArr, int[] iArr2, int i12) {
        return getScrollingChildHelper().d(i10, i11, iArr, iArr2, i12);
    }

    public void M0(int i10) {
        int iG = this.f2887f.g();
        for (int i11 = 0; i11 < iG; i11++) {
            this.f2887f.f(i11).offsetTopAndBottom(i10);
        }
    }

    public final void N(int i10, int i11, int i12, int i13, int[] iArr, int i14, int[] iArr2) {
        getScrollingChildHelper().e(i10, i11, i12, i13, iArr, i14, iArr2);
    }

    void N0(int i10, int i11) {
        int iJ = this.f2887f.j();
        for (int i12 = 0; i12 < iJ; i12++) {
            f0 f0VarP0 = p0(this.f2887f.i(i12));
            if (f0VarP0 != null && !f0VarP0.L() && f0VarP0.f2966c >= i10) {
                if (O0) {
                    Log.d("RecyclerView", "offsetPositionRecordsForInsert attached child " + i12 + " holder " + f0VarP0 + " now at position " + (f0VarP0.f2966c + i11));
                }
                f0VarP0.C(i11, false);
                this.f2903r0.f2943g = true;
            }
        }
        this.f2881c.v(i10, i11);
        requestLayout();
    }

    void N1(int i10, int i11, Object obj) {
        int i12;
        int iJ = this.f2887f.j();
        int i13 = i10 + i11;
        for (int i14 = 0; i14 < iJ; i14++) {
            View viewI = this.f2887f.i(i14);
            f0 f0VarP0 = p0(viewI);
            if (f0VarP0 != null && !f0VarP0.L() && (i12 = f0VarP0.f2966c) >= i10 && i12 < i13) {
                f0VarP0.b(2);
                f0VarP0.a(obj);
                ((r) viewI.getLayoutParams()).f3026c = true;
            }
        }
        this.f2881c.R(i10, i11);
    }

    void O(int i10) {
        q qVar = this.f2912w;
        if (qVar != null) {
            qVar.j1(i10);
        }
        W0(i10);
        u uVar = this.f2905s0;
        if (uVar != null) {
            uVar.a(this, i10);
        }
        List list = this.f2907t0;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                ((u) this.f2907t0.get(size)).a(this, i10);
            }
        }
    }

    void O0(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        int iJ = this.f2887f.j();
        if (i10 < i11) {
            i14 = -1;
            i13 = i10;
            i12 = i11;
        } else {
            i12 = i10;
            i13 = i11;
            i14 = 1;
        }
        for (int i16 = 0; i16 < iJ; i16++) {
            f0 f0VarP0 = p0(this.f2887f.i(i16));
            if (f0VarP0 != null && (i15 = f0VarP0.f2966c) >= i13 && i15 <= i12) {
                if (O0) {
                    Log.d("RecyclerView", "offsetPositionRecordsForMove attached child " + i16 + " holder " + f0VarP0);
                }
                if (f0VarP0.f2966c == i10) {
                    f0VarP0.C(i11 - i10, false);
                } else {
                    f0VarP0.C(i14, false);
                }
                this.f2903r0.f2943g = true;
            }
        }
        this.f2881c.w(i10, i11);
        requestLayout();
    }

    void P(int i10, int i11) {
        this.Q++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i10, scrollY - i11);
        X0(i10, i11);
        u uVar = this.f2905s0;
        if (uVar != null) {
            uVar.b(this, i10, i11);
        }
        List list = this.f2907t0;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                ((u) this.f2907t0.get(size)).b(this, i10, i11);
            }
        }
        this.Q--;
    }

    void P0(int i10, int i11, boolean z10) {
        int i12 = i10 + i11;
        int iJ = this.f2887f.j();
        for (int i13 = 0; i13 < iJ; i13++) {
            f0 f0VarP0 = p0(this.f2887f.i(i13));
            if (f0VarP0 != null && !f0VarP0.L()) {
                int i14 = f0VarP0.f2966c;
                if (i14 >= i12) {
                    if (O0) {
                        Log.d("RecyclerView", "offsetPositionRecordsForRemove attached child " + i13 + " holder " + f0VarP0 + " now at position " + (f0VarP0.f2966c - i11));
                    }
                    f0VarP0.C(-i11, z10);
                    this.f2903r0.f2943g = true;
                } else if (i14 >= i10) {
                    if (O0) {
                        Log.d("RecyclerView", "offsetPositionRecordsForRemove attached child " + i13 + " holder " + f0VarP0 + " now REMOVED");
                    }
                    f0VarP0.i(i10 - 1, -i11, z10);
                    this.f2903r0.f2943g = true;
                }
            }
        }
        this.f2881c.x(i10, i11, z10);
        requestLayout();
    }

    void Q() {
        int i10;
        for (int size = this.E0.size() - 1; size >= 0; size--) {
            f0 f0Var = (f0) this.E0.get(size);
            if (f0Var.f2964a.getParent() == this && !f0Var.L() && (i10 = f0Var.f2980z) != -1) {
                f0Var.f2964a.setImportantForAccessibility(i10);
                f0Var.f2980z = -1;
            }
        }
        this.E0.clear();
    }

    public void Q0(View view) {
    }

    public void R0(View view) {
    }

    void S() {
        if (this.V != null) {
            return;
        }
        EdgeEffect edgeEffectA = this.R.a(this, 3);
        this.V = edgeEffectA;
        if (this.f2891h) {
            edgeEffectA.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffectA.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    void S0() {
        this.P++;
    }

    void T() {
        if (this.S != null) {
            return;
        }
        EdgeEffect edgeEffectA = this.R.a(this, 0);
        this.S = edgeEffectA;
        if (this.f2891h) {
            edgeEffectA.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffectA.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    void T0() {
        U0(true);
    }

    void U() {
        if (this.U != null) {
            return;
        }
        EdgeEffect edgeEffectA = this.R.a(this, 2);
        this.U = edgeEffectA;
        if (this.f2891h) {
            edgeEffectA.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffectA.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    void U0(boolean z10) {
        int i10 = this.P - 1;
        this.P = i10;
        if (i10 < 1) {
            if (N0 && i10 < 0) {
                throw new IllegalStateException("layout or scroll counter cannot go below zero.Some calls are not matching" + W());
            }
            this.P = 0;
            if (z10) {
                H();
                Q();
            }
        }
    }

    void V() {
        if (this.T != null) {
            return;
        }
        EdgeEffect edgeEffectA = this.R.a(this, 1);
        this.T = edgeEffectA;
        if (this.f2891h) {
            edgeEffectA.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffectA.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    String W() {
        return " " + super.toString() + ", adapter:" + this.f2910v + ", layout:" + this.f2912w + ", context:" + getContext();
    }

    public void W0(int i10) {
    }

    final void X(b0 b0Var) {
        if (getScrollState() != 2) {
            b0Var.f2952p = 0;
            b0Var.f2953q = 0;
        } else {
            OverScroller overScroller = this.f2899o0.f2958c;
            b0Var.f2952p = overScroller.getFinalX() - overScroller.getCurrX();
            b0Var.f2953q = overScroller.getFinalY() - overScroller.getCurrY();
        }
    }

    public void X0(int i10, int i11) {
    }

    public View Y(View view) {
        ViewParent parent = view.getParent();
        while (parent != null && parent != this && (parent instanceof View)) {
            view = parent;
            parent = view.getParent();
        }
        if (parent == this) {
            return view;
        }
        return null;
    }

    void Y0() {
        if (this.f2915x0 || !this.B) {
            return;
        }
        o0.e0(this, this.F0);
        this.f2915x0 = true;
    }

    public f0 Z(View view) {
        View viewY = Y(view);
        if (viewY == null) {
            return null;
        }
        return o0(viewY);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList arrayList, int i10, int i11) {
        q qVar = this.f2912w;
        if (qVar == null || !qVar.K0(this, arrayList, i10, i11)) {
            super.addFocusables(arrayList, i10, i11);
        }
    }

    void b1(boolean z10) {
        this.O = z10 | this.O;
        this.N = true;
        J0();
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof r) && this.f2912w.r((r) layoutParams);
    }

    @Override // android.view.View
    public int computeHorizontalScrollExtent() {
        q qVar = this.f2912w;
        if (qVar != null && qVar.p()) {
            return this.f2912w.v(this.f2903r0);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeHorizontalScrollOffset() {
        q qVar = this.f2912w;
        if (qVar != null && qVar.p()) {
            return this.f2912w.w(this.f2903r0);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeHorizontalScrollRange() {
        q qVar = this.f2912w;
        if (qVar != null && qVar.p()) {
            return this.f2912w.x(this.f2903r0);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeVerticalScrollExtent() {
        q qVar = this.f2912w;
        if (qVar != null && qVar.q()) {
            return this.f2912w.y(this.f2903r0);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeVerticalScrollOffset() {
        q qVar = this.f2912w;
        if (qVar != null && qVar.q()) {
            return this.f2912w.z(this.f2903r0);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeVerticalScrollRange() {
        q qVar = this.f2912w;
        if (qVar != null && qVar.q()) {
            return this.f2912w.A(this.f2903r0);
        }
        return 0;
    }

    void d(int i10, int i11) {
        if (i10 < 0) {
            T();
            if (this.S.isFinished()) {
                this.S.onAbsorb(-i10);
            }
        } else if (i10 > 0) {
            U();
            if (this.U.isFinished()) {
                this.U.onAbsorb(i10);
            }
        }
        if (i11 < 0) {
            V();
            if (this.T.isFinished()) {
                this.T.onAbsorb(-i11);
            }
        } else if (i11 > 0) {
            S();
            if (this.V.isFinished()) {
                this.V.onAbsorb(i11);
            }
        }
        if (i10 == 0 && i11 == 0) {
            return;
        }
        postInvalidateOnAnimation();
    }

    void d1(f0 f0Var, n.b bVar) {
        f0Var.H(0, 8192);
        if (this.f2903r0.f2945i && f0Var.A() && !f0Var.x() && !f0Var.L()) {
            this.f2889g.c(l0(f0Var), f0Var);
        }
        this.f2889g.e(f0Var, bVar);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (super.dispatchKeyEvent(keyEvent)) {
            return true;
        }
        q layoutManager = getLayoutManager();
        int iF = 0;
        if (layoutManager == null) {
            return false;
        }
        if (layoutManager.q()) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode == 92 || keyCode == 93) {
                int measuredHeight = getMeasuredHeight();
                if (keyCode == 93) {
                    C1(0, measuredHeight, null, RtlSpacingHelper.UNDEFINED);
                } else {
                    C1(0, -measuredHeight, null, RtlSpacingHelper.UNDEFINED);
                }
                return true;
            }
            if (keyCode == 122 || keyCode == 123) {
                boolean zA0 = layoutManager.A0();
                if (keyCode == 122) {
                    if (zA0) {
                        iF = getAdapter().f();
                    }
                } else if (!zA0) {
                    iF = getAdapter().f();
                }
                E1(iF);
                return true;
            }
        } else if (layoutManager.p()) {
            int keyCode2 = keyEvent.getKeyCode();
            if (keyCode2 == 92 || keyCode2 == 93) {
                int measuredWidth = getMeasuredWidth();
                if (keyCode2 == 93) {
                    C1(measuredWidth, 0, null, RtlSpacingHelper.UNDEFINED);
                } else {
                    C1(-measuredWidth, 0, null, RtlSpacingHelper.UNDEFINED);
                }
                return true;
            }
            if (keyCode2 == 122 || keyCode2 == 123) {
                boolean zA02 = layoutManager.A0();
                if (keyCode2 == 122) {
                    if (zA02) {
                        iF = getAdapter().f();
                    }
                } else if (!zA02) {
                    iF = getAdapter().f();
                }
                E1(iF);
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float f10, float f11, boolean z10) {
        return getScrollingChildHelper().a(f10, f11, z10);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float f10, float f11) {
        return getScrollingChildHelper().b(f10, f11);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int i10, int i11, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().c(i10, i11, iArr, iArr2);
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int i10, int i11, int i12, int i13, int[] iArr) {
        return getScrollingChildHelper().f(i10, i11, i12, i13, iArr);
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchRestoreInstanceState(SparseArray sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchSaveInstanceState(SparseArray sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        boolean z10;
        super.draw(canvas);
        int size = this.f2916y.size();
        boolean z11 = false;
        for (int i10 = 0; i10 < size; i10++) {
            ((p) this.f2916y.get(i10)).i(canvas, this, this.f2903r0);
        }
        EdgeEffect edgeEffect = this.S;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z10 = false;
        } else {
            int iSave = canvas.save();
            int paddingBottom = this.f2891h ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + paddingBottom, 0.0f);
            EdgeEffect edgeEffect2 = this.S;
            z10 = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(iSave);
        }
        EdgeEffect edgeEffect3 = this.T;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int iSave2 = canvas.save();
            if (this.f2891h) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.T;
            z10 |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(iSave2);
        }
        EdgeEffect edgeEffect5 = this.U;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int iSave3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.f2891h ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate(paddingTop, -width);
            EdgeEffect edgeEffect6 = this.U;
            z10 |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(iSave3);
        }
        EdgeEffect edgeEffect7 = this.V;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int iSave4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.f2891h) {
                canvas.translate((-getWidth()) + getPaddingRight(), (-getHeight()) + getPaddingBottom());
            } else {
                canvas.translate(-getWidth(), -getHeight());
            }
            EdgeEffect edgeEffect8 = this.V;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z11 = true;
            }
            z10 |= z11;
            canvas.restoreToCount(iSave4);
        }
        if ((z10 || this.W == null || this.f2916y.size() <= 0 || !this.W.p()) ? z10 : true) {
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j10) {
        return super.drawChild(canvas, view, j10);
    }

    public f0 e0(int i10) {
        f0 f0Var = null;
        if (this.N) {
            return null;
        }
        int iJ = this.f2887f.j();
        for (int i11 = 0; i11 < iJ; i11++) {
            f0 f0VarP0 = p0(this.f2887f.i(i11));
            if (f0VarP0 != null && !f0VarP0.x() && k0(f0VarP0) == i10) {
                if (!this.f2887f.n(f0VarP0.f2964a)) {
                    return f0VarP0;
                }
                f0Var = f0VarP0;
            }
        }
        return f0Var;
    }

    public f0 f0(long j10) {
        h hVar = this.f2910v;
        f0 f0Var = null;
        if (hVar != null && hVar.j()) {
            int iJ = this.f2887f.j();
            for (int i10 = 0; i10 < iJ; i10++) {
                f0 f0VarP0 = p0(this.f2887f.i(i10));
                if (f0VarP0 != null && !f0VarP0.x() && f0VarP0.m() == j10) {
                    if (!this.f2887f.n(f0VarP0.f2964a)) {
                        return f0VarP0;
                    }
                    f0Var = f0VarP0;
                }
            }
        }
        return f0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0071  */
    @Override // android.view.ViewGroup, android.view.ViewParent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.view.View focusSearch(android.view.View r8, int r9) {
        /*
            Method dump skipped, instruction units count: 214
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.focusSearch(android.view.View, int):android.view.View");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    androidx.recyclerview.widget.RecyclerView.f0 g0(int r6, boolean r7) {
        /*
            r5 = this;
            androidx.recyclerview.widget.b r0 = r5.f2887f
            int r0 = r0.j()
            r1 = 0
            r2 = 0
        L8:
            if (r2 >= r0) goto L3a
            androidx.recyclerview.widget.b r3 = r5.f2887f
            android.view.View r3 = r3.i(r2)
            androidx.recyclerview.widget.RecyclerView$f0 r3 = p0(r3)
            if (r3 == 0) goto L37
            boolean r4 = r3.x()
            if (r4 != 0) goto L37
            if (r7 == 0) goto L23
            int r4 = r3.f2966c
            if (r4 == r6) goto L2a
            goto L37
        L23:
            int r4 = r3.o()
            if (r4 == r6) goto L2a
            goto L37
        L2a:
            androidx.recyclerview.widget.b r1 = r5.f2887f
            android.view.View r4 = r3.f2964a
            boolean r1 = r1.n(r4)
            if (r1 == 0) goto L36
            r1 = r3
            goto L37
        L36:
            return r3
        L37:
            int r2 = r2 + 1
            goto L8
        L3a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.g0(int, boolean):androidx.recyclerview.widget.RecyclerView$f0");
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        q qVar = this.f2912w;
        if (qVar != null) {
            return qVar.I();
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + W());
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        q qVar = this.f2912w;
        if (qVar != null) {
            return qVar.J(getContext(), attributeSet);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + W());
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public h getAdapter() {
        return this.f2910v;
    }

    @Override // android.view.View
    public int getBaseline() {
        q qVar = this.f2912w;
        return qVar != null ? qVar.L() : super.getBaseline();
    }

    @Override // android.view.ViewGroup
    protected int getChildDrawingOrder(int i10, int i11) {
        return super.getChildDrawingOrder(i10, i11);
    }

    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
        return this.f2891h;
    }

    public androidx.recyclerview.widget.k getCompatAccessibilityDelegate() {
        return this.f2917y0;
    }

    public m getEdgeEffectFactory() {
        return this.R;
    }

    public n getItemAnimator() {
        return this.W;
    }

    public int getItemDecorationCount() {
        return this.f2916y.size();
    }

    public q getLayoutManager() {
        return this.f2912w;
    }

    public int getMaxFlingVelocity() {
        return this.f2895k0;
    }

    public int getMinFlingVelocity() {
        return this.f2894j0;
    }

    long getNanoTime() {
        if (T0) {
            return System.nanoTime();
        }
        return 0L;
    }

    public s getOnFlingListener() {
        return this.f2893i0;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.f2898n0;
    }

    public v getRecycledViewPool() {
        return this.f2881c.i();
    }

    public int getScrollState() {
        return this.f2878a0;
    }

    public boolean h0(int i10, int i11) {
        return i0(i10, i11, this.f2894j0, this.f2895k0);
    }

    @Override // android.view.View
    public boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().j();
    }

    void i1() {
        n nVar = this.W;
        if (nVar != null) {
            nVar.k();
        }
        q qVar = this.f2912w;
        if (qVar != null) {
            qVar.p1(this.f2881c);
            this.f2912w.q1(this.f2881c);
        }
        this.f2881c.c();
    }

    @Override // android.view.View
    public boolean isAttachedToWindow() {
        return this.B;
    }

    @Override // android.view.ViewGroup
    public final boolean isLayoutSuppressed() {
        return this.H;
    }

    @Override // android.view.View
    public boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().l();
    }

    boolean j0(int i10, int i11) {
        return i0(i10, i11, 0, ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED);
    }

    boolean j1(View view) {
        F1();
        boolean zR = this.f2887f.r(view);
        if (zR) {
            f0 f0VarP0 = p0(view);
            this.f2881c.O(f0VarP0);
            this.f2881c.H(f0VarP0);
            if (O0) {
                Log.d("RecyclerView", "after removing animated view: " + view + ", " + this);
            }
        }
        J1(!zR);
        return zR;
    }

    int k0(f0 f0Var) {
        if (f0Var.r(524) || !f0Var.u()) {
            return -1;
        }
        return this.f2885e.e(f0Var.f2966c);
    }

    public void k1(p pVar) {
        q qVar = this.f2912w;
        if (qVar != null) {
            qVar.l("Cannot remove item decoration during a scroll  or layout");
        }
        this.f2916y.remove(pVar);
        if (this.f2916y.isEmpty()) {
            setWillNotDraw(getOverScrollMode() == 2);
        }
        I0();
        requestLayout();
    }

    public void l(p pVar) {
        m(pVar, -1);
    }

    long l0(f0 f0Var) {
        return this.f2910v.j() ? f0Var.m() : f0Var.f2966c;
    }

    public void l1(t tVar) {
        this.f2918z.remove(tVar);
        if (this.A == tVar) {
            this.A = null;
        }
    }

    public void m(p pVar, int i10) {
        q qVar = this.f2912w;
        if (qVar != null) {
            qVar.l("Cannot add item decoration during a scroll  or layout");
        }
        if (this.f2916y.isEmpty()) {
            setWillNotDraw(false);
        }
        if (i10 < 0) {
            this.f2916y.add(pVar);
        } else {
            this.f2916y.add(i10, pVar);
        }
        I0();
        requestLayout();
    }

    public int m0(View view) {
        f0 f0VarP0 = p0(view);
        if (f0VarP0 != null) {
            return f0VarP0.j();
        }
        return -1;
    }

    public void m1(u uVar) {
        List list = this.f2907t0;
        if (list != null) {
            list.remove(uVar);
        }
    }

    public void n(t tVar) {
        this.f2918z.add(tVar);
    }

    public int n0(View view) {
        f0 f0VarP0 = p0(view);
        if (f0VarP0 != null) {
            return f0VarP0.o();
        }
        return -1;
    }

    void n1() {
        f0 f0Var;
        int iG = this.f2887f.g();
        for (int i10 = 0; i10 < iG; i10++) {
            View viewF = this.f2887f.f(i10);
            f0 f0VarO0 = o0(viewF);
            if (f0VarO0 != null && (f0Var = f0VarO0.f2972r) != null) {
                View view = f0Var.f2964a;
                int left = viewF.getLeft();
                int top = viewF.getTop();
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
    }

    public void o(u uVar) {
        if (this.f2907t0 == null) {
            this.f2907t0 = new ArrayList();
        }
        this.f2907t0.add(uVar);
    }

    public f0 o0(View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return p0(view);
        }
        throw new IllegalArgumentException("View " + view + " is not a direct child of " + this);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0053  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void onAttachedToWindow() {
        /*
            r5 = this;
            super.onAttachedToWindow()
            r0 = 0
            r5.P = r0
            r1 = 1
            r5.B = r1
            boolean r2 = r5.E
            if (r2 == 0) goto L14
            boolean r2 = r5.isLayoutRequested()
            if (r2 != 0) goto L14
            goto L15
        L14:
            r1 = 0
        L15:
            r5.E = r1
            androidx.recyclerview.widget.RecyclerView$w r1 = r5.f2881c
            r1.z()
            androidx.recyclerview.widget.RecyclerView$q r1 = r5.f2912w
            if (r1 == 0) goto L23
            r1.E(r5)
        L23:
            r5.f2915x0 = r0
            boolean r0 = androidx.recyclerview.widget.RecyclerView.T0
            if (r0 == 0) goto L66
            java.lang.ThreadLocal r0 = androidx.recyclerview.widget.e.f3177e
            java.lang.Object r1 = r0.get()
            androidx.recyclerview.widget.e r1 = (androidx.recyclerview.widget.e) r1
            r5.f2900p0 = r1
            if (r1 != 0) goto L61
            androidx.recyclerview.widget.e r1 = new androidx.recyclerview.widget.e
            r1.<init>()
            r5.f2900p0 = r1
            android.view.Display r1 = m0.o0.v(r5)
            boolean r2 = r5.isInEditMode()
            if (r2 != 0) goto L53
            if (r1 == 0) goto L53
            float r1 = r1.getRefreshRate()
            r2 = 1106247680(0x41f00000, float:30.0)
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 < 0) goto L53
            goto L55
        L53:
            r1 = 1114636288(0x42700000, float:60.0)
        L55:
            androidx.recyclerview.widget.e r2 = r5.f2900p0
            r3 = 1315859240(0x4e6e6b28, float:1.0E9)
            float r3 = r3 / r1
            long r3 = (long) r3
            r2.f3181c = r3
            r0.set(r2)
        L61:
            androidx.recyclerview.widget.e r0 = r5.f2900p0
            r0.a(r5)
        L66:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onAttachedToWindow():void");
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        androidx.recyclerview.widget.e eVar;
        super.onDetachedFromWindow();
        n nVar = this.W;
        if (nVar != null) {
            nVar.k();
        }
        L1();
        this.B = false;
        q qVar = this.f2912w;
        if (qVar != null) {
            qVar.F(this, this.f2881c);
        }
        this.E0.clear();
        removeCallbacks(this.F0);
        this.f2889g.j();
        this.f2881c.A();
        p0.a.b(this);
        if (!T0 || (eVar = this.f2900p0) == null) {
            return;
        }
        eVar.j(this);
        this.f2900p0 = null;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int size = this.f2916y.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((p) this.f2916y.get(i10)).g(canvas, this, this.f2903r0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a0 A[ADDED_TO_REGION] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onGenericMotionEvent(android.view.MotionEvent r14) {
        /*
            r13 = this;
            androidx.recyclerview.widget.RecyclerView$q r0 = r13.f2912w
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            boolean r0 = r13.H
            if (r0 == 0) goto Lb
            return r1
        Lb:
            int r0 = r14.getAction()
            r2 = 8
            if (r0 != r2) goto La8
            int r0 = r14.getSource()
            r0 = r0 & 2
            r2 = 0
            if (r0 == 0) goto L45
            androidx.recyclerview.widget.RecyclerView$q r0 = r13.f2912w
            boolean r0 = r0.q()
            if (r0 == 0) goto L2c
            r0 = 9
            float r0 = r14.getAxisValue(r0)
            float r0 = -r0
            goto L2d
        L2c:
            r0 = 0
        L2d:
            androidx.recyclerview.widget.RecyclerView$q r3 = r13.f2912w
            boolean r3 = r3.p()
            if (r3 == 0) goto L40
            r2 = 10
            float r2 = r14.getAxisValue(r2)
            r3 = r2
            r4 = 0
            r2 = r0
            r0 = 0
            goto L6a
        L40:
            r2 = r0
        L41:
            r0 = 0
            r3 = 0
            r4 = 0
            goto L6a
        L45:
            int r0 = r14.getSource()
            r3 = 4194304(0x400000, float:5.877472E-39)
            r0 = r0 & r3
            if (r0 == 0) goto L41
            r0 = 26
            float r3 = r14.getAxisValue(r0)
            androidx.recyclerview.widget.RecyclerView$q r4 = r13.f2912w
            boolean r4 = r4.q()
            if (r4 == 0) goto L60
            float r3 = -r3
            r2 = r3
        L5e:
            r3 = 0
            goto L68
        L60:
            androidx.recyclerview.widget.RecyclerView$q r4 = r13.f2912w
            boolean r4 = r4.p()
            if (r4 == 0) goto L5e
        L68:
            boolean r4 = r13.J0
        L6a:
            float r5 = r13.f2897m0
            float r2 = r2 * r5
            int r2 = (int) r2
            float r5 = r13.f2896l0
            float r3 = r3 * r5
            int r3 = (int) r3
            if (r4 == 0) goto L99
            androidx.recyclerview.widget.RecyclerView$e0 r5 = r13.f2899o0
            android.widget.OverScroller r5 = r5.f2958c
            int r6 = r5.getFinalY()
            int r7 = r5.getCurrY()
            int r6 = r6 - r7
            int r9 = r2 + r6
            int r2 = r5.getFinalX()
            int r5 = r5.getCurrX()
            int r2 = r2 - r5
            int r8 = r3 + r2
            r11 = -2147483648(0xffffffff80000000, float:-0.0)
            r12 = 1
            r10 = 0
            r7 = r13
            r7.D1(r8, r9, r10, r11, r12)
            goto L9e
        L99:
            r7 = r13
            r5 = 1
            r13.K0(r3, r2, r14, r5)
        L9e:
            if (r0 == 0) goto La9
            if (r4 != 0) goto La9
            m0.h r2 = r7.M0
            r2.g(r14, r0)
            goto La9
        La8:
            r7 = r13
        La9:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onGenericMotionEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        if (this.H) {
            return false;
        }
        this.A = null;
        if (a0(motionEvent)) {
            u();
            return true;
        }
        q qVar = this.f2912w;
        if (qVar == null) {
            return false;
        }
        boolean zP = qVar.p();
        boolean zQ = this.f2912w.q();
        if (this.f2882c0 == null) {
            this.f2882c0 = VelocityTracker.obtain();
        }
        this.f2882c0.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            if (this.I) {
                this.I = false;
            }
            this.f2880b0 = motionEvent.getPointerId(0);
            int x10 = (int) (motionEvent.getX() + 0.5f);
            this.f2888f0 = x10;
            this.f2884d0 = x10;
            int y10 = (int) (motionEvent.getY() + 0.5f);
            this.f2890g0 = y10;
            this.f2886e0 = y10;
            if (I1(motionEvent) || this.f2878a0 == 2) {
                getParent().requestDisallowInterceptTouchEvent(true);
                setScrollState(1);
                K1(1);
            }
            int[] iArr = this.C0;
            iArr[1] = 0;
            iArr[0] = 0;
            H1(0);
        } else if (actionMasked == 1) {
            this.f2882c0.clear();
            K1(0);
        } else if (actionMasked == 2) {
            int iFindPointerIndex = motionEvent.findPointerIndex(this.f2880b0);
            if (iFindPointerIndex < 0) {
                Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.f2880b0 + " not found. Did any MotionEvents get skipped?");
                return false;
            }
            int x11 = (int) (motionEvent.getX(iFindPointerIndex) + 0.5f);
            int y11 = (int) (motionEvent.getY(iFindPointerIndex) + 0.5f);
            if (this.f2878a0 != 1) {
                int i10 = x11 - this.f2884d0;
                int i11 = y11 - this.f2886e0;
                if (!zP || Math.abs(i10) <= this.f2892h0) {
                    z10 = false;
                } else {
                    this.f2888f0 = x11;
                    z10 = true;
                }
                if (zQ && Math.abs(i11) > this.f2892h0) {
                    this.f2890g0 = y11;
                    z10 = true;
                }
                if (z10) {
                    setScrollState(1);
                }
            }
        } else if (actionMasked == 3) {
            u();
        } else if (actionMasked == 5) {
            this.f2880b0 = motionEvent.getPointerId(actionIndex);
            int x12 = (int) (motionEvent.getX(actionIndex) + 0.5f);
            this.f2888f0 = x12;
            this.f2884d0 = x12;
            int y12 = (int) (motionEvent.getY(actionIndex) + 0.5f);
            this.f2890g0 = y12;
            this.f2886e0 = y12;
        } else if (actionMasked == 6) {
            V0(motionEvent);
        }
        return this.f2878a0 == 1;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        Trace.beginSection("RV OnLayout");
        I();
        Trace.endSection();
        this.E = true;
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        q qVar = this.f2912w;
        if (qVar == null) {
            D(i10, i11);
            return;
        }
        boolean z10 = false;
        if (qVar.w0()) {
            int mode = View.MeasureSpec.getMode(i10);
            int mode2 = View.MeasureSpec.getMode(i11);
            this.f2912w.e1(this.f2881c, this.f2903r0, i10, i11);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z10 = true;
            }
            this.G0 = z10;
            if (z10 || this.f2910v == null) {
                return;
            }
            if (this.f2903r0.f2941e == 1) {
                J();
            }
            this.f2912w.F1(i10, i11);
            this.f2903r0.f2946j = true;
            K();
            this.f2912w.I1(i10, i11);
            if (this.f2912w.L1()) {
                this.f2912w.F1(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), WXVideoFileObject.FILE_SIZE_LIMIT), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), WXVideoFileObject.FILE_SIZE_LIMIT));
                this.f2903r0.f2946j = true;
                K();
                this.f2912w.I1(i10, i11);
            }
            this.H0 = getMeasuredWidth();
            this.I0 = getMeasuredHeight();
            return;
        }
        if (this.C) {
            this.f2912w.e1(this.f2881c, this.f2903r0, i10, i11);
            return;
        }
        if (this.K) {
            F1();
            S0();
            a1();
            T0();
            b0 b0Var = this.f2903r0;
            if (b0Var.f2948l) {
                b0Var.f2944h = true;
            } else {
                this.f2885e.j();
                this.f2903r0.f2944h = false;
            }
            this.K = false;
            J1(false);
        } else if (this.f2903r0.f2948l) {
            setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
            return;
        }
        h hVar = this.f2910v;
        if (hVar != null) {
            this.f2903r0.f2942f = hVar.f();
        } else {
            this.f2903r0.f2942f = 0;
        }
        F1();
        this.f2912w.e1(this.f2881c, this.f2903r0, i10, i11);
        J1(false);
        this.f2903r0.f2944h = false;
    }

    @Override // android.view.ViewGroup
    protected boolean onRequestFocusInDescendants(int i10, Rect rect) {
        if (F0()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i10, rect);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof z)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        z zVar = (z) parcelable;
        this.f2883d = zVar;
        super.onRestoreInstanceState(zVar.getSuperState());
        requestLayout();
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        z zVar = new z(super.onSaveInstanceState());
        z zVar2 = this.f2883d;
        if (zVar2 != null) {
            zVar.b(zVar2);
            return zVar;
        }
        q qVar = this.f2912w;
        if (qVar != null) {
            zVar.f3044a = qVar.i1();
            return zVar;
        }
        zVar.f3044a = null;
        return zVar;
    }

    @Override // android.view.View
    protected void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        if (i10 == i12 && i11 == i13) {
            return;
        }
        D0();
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00df A[PHI: r1
      0x00df: PHI (r1v46 int) = (r1v26 int), (r1v50 int) binds: [B:41:0x00c8, B:45:0x00db] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00f8  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r17) {
        /*
            Method dump skipped, instruction units count: 486
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    void p(f0 f0Var, n.b bVar, n.b bVar2) {
        f0Var.I(false);
        if (this.W.a(f0Var, bVar, bVar2)) {
            Y0();
        }
    }

    public void q0(View view, Rect rect) {
        r0(view, rect);
    }

    void r(f0 f0Var, n.b bVar, n.b bVar2) {
        k(f0Var);
        f0Var.I(false);
        if (this.W.c(f0Var, bVar, bVar2)) {
            Y0();
        }
    }

    @Override // android.view.ViewGroup
    protected void removeDetachedView(View view, boolean z10) {
        f0 f0VarP0 = p0(view);
        if (f0VarP0 != null) {
            if (f0VarP0.z()) {
                f0VarP0.f();
            } else if (!f0VarP0.L()) {
                throw new IllegalArgumentException("Called removeDetachedView with a view which is not flagged as tmp detached." + f0VarP0 + W());
            }
        } else if (N0) {
            throw new IllegalArgumentException("No ViewHolder found for child: " + view + W());
        }
        view.clearAnimation();
        G(view);
        super.removeDetachedView(view, z10);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        if (!this.f2912w.g1(this, this.f2903r0, view, view2) && view2 != null) {
            o1(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z10) {
        return this.f2912w.w1(this, view, rect, z10);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z10) {
        int size = this.f2918z.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((t) this.f2918z.get(i10)).c(z10);
        }
        super.requestDisallowInterceptTouchEvent(z10);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (this.F != 0 || this.H) {
            this.G = true;
        } else {
            super.requestLayout();
        }
    }

    void s(String str) {
        if (F0()) {
            if (str != null) {
                throw new IllegalStateException(str);
            }
            throw new IllegalStateException("Cannot call this method while RecyclerView is computing a layout or scrolling" + W());
        }
        if (this.Q > 0) {
            Log.w("RecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException("" + W()));
        }
    }

    void s1() {
        int iJ = this.f2887f.j();
        for (int i10 = 0; i10 < iJ; i10++) {
            f0 f0VarP0 = p0(this.f2887f.i(i10));
            if (N0 && f0VarP0.f2966c == -1 && !f0VarP0.x()) {
                throw new IllegalStateException("view holder cannot have position -1 unless it is removed" + W());
            }
            if (!f0VarP0.L()) {
                f0VarP0.G();
            }
        }
    }

    @Override // android.view.View
    public void scrollBy(int i10, int i11) {
        q qVar = this.f2912w;
        if (qVar == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.H) {
            return;
        }
        boolean zP = qVar.p();
        boolean zQ = this.f2912w.q();
        if (zP || zQ) {
            if (!zP) {
                i10 = 0;
            }
            if (!zQ) {
                i11 = 0;
            }
            t1(i10, i11, null, 0);
        }
    }

    @Override // android.view.View
    public void scrollTo(int i10, int i11) {
        Log.w("RecyclerView", "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (z1(accessibilityEvent)) {
            return;
        }
        super.sendAccessibilityEventUnchecked(accessibilityEvent);
    }

    public void setAccessibilityDelegateCompat(androidx.recyclerview.widget.k kVar) {
        this.f2917y0 = kVar;
        o0.n0(this, kVar);
    }

    public void setAdapter(h hVar) {
        setLayoutFrozen(false);
        w1(hVar, false, true);
        b1(false);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(l lVar) {
        if (lVar == null) {
            return;
        }
        setChildrenDrawingOrderEnabled(false);
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z10) {
        if (z10 != this.f2891h) {
            D0();
        }
        this.f2891h = z10;
        super.setClipToPadding(z10);
        if (this.E) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(m mVar) {
        l0.g.g(mVar);
        this.R = mVar;
        D0();
    }

    public void setHasFixedSize(boolean z10) {
        this.C = z10;
    }

    public void setItemAnimator(n nVar) {
        n nVar2 = this.W;
        if (nVar2 != null) {
            nVar2.k();
            this.W.v(null);
        }
        this.W = nVar;
        if (nVar != null) {
            nVar.v(this.f2913w0);
        }
    }

    public void setItemViewCacheSize(int i10) {
        this.f2881c.L(i10);
    }

    @Deprecated
    public void setLayoutFrozen(boolean z10) {
        suppressLayout(z10);
    }

    public void setLayoutManager(q qVar) {
        if (qVar == this.f2912w) {
            return;
        }
        L1();
        if (this.f2912w != null) {
            n nVar = this.W;
            if (nVar != null) {
                nVar.k();
            }
            this.f2912w.p1(this.f2881c);
            this.f2912w.q1(this.f2881c);
            this.f2881c.c();
            if (this.B) {
                this.f2912w.F(this, this.f2881c);
            }
            this.f2912w.J1(null);
            this.f2912w = null;
        } else {
            this.f2881c.c();
        }
        this.f2887f.o();
        this.f2912w = qVar;
        if (qVar != null) {
            if (qVar.f3001b != null) {
                throw new IllegalArgumentException("LayoutManager " + qVar + " is already attached to a RecyclerView:" + qVar.f3001b.W());
            }
            qVar.J1(this);
            if (this.B) {
                this.f2912w.E(this);
            }
        }
        this.f2881c.P();
        requestLayout();
    }

    @Override // android.view.ViewGroup
    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (layoutTransition != null) {
            throw new IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
        }
        super.setLayoutTransition(null);
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z10) {
        getScrollingChildHelper().m(z10);
    }

    public void setOnFlingListener(s sVar) {
        this.f2893i0 = sVar;
    }

    @Deprecated
    public void setOnScrollListener(u uVar) {
        this.f2905s0 = uVar;
    }

    public void setPreserveFocusAfterLayout(boolean z10) {
        this.f2898n0 = z10;
    }

    public void setRecycledViewPool(v vVar) {
        this.f2881c.J(vVar);
    }

    @Deprecated
    public void setRecyclerListener(x xVar) {
    }

    void setScrollState(int i10) {
        if (i10 == this.f2878a0) {
            return;
        }
        if (O0) {
            Log.d("RecyclerView", "setting scroll state to " + i10 + " from " + this.f2878a0, new Exception());
        }
        this.f2878a0 = i10;
        if (i10 != 2) {
            M1();
        }
        O(i10);
    }

    public void setScrollingTouchSlop(int i10) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i10 != 0) {
            if (i10 == 1) {
                this.f2892h0 = viewConfiguration.getScaledPagingTouchSlop();
                return;
            }
            Log.w("RecyclerView", "setScrollingTouchSlop(): bad argument constant " + i10 + "; using default value");
        }
        this.f2892h0 = viewConfiguration.getScaledTouchSlop();
    }

    public void setViewCacheExtension(d0 d0Var) {
        this.f2881c.K(d0Var);
    }

    @Override // android.view.View
    public boolean startNestedScroll(int i10) {
        return getScrollingChildHelper().o(i10);
    }

    @Override // android.view.View
    public void stopNestedScroll() {
        getScrollingChildHelper().q();
    }

    @Override // android.view.ViewGroup
    public final void suppressLayout(boolean z10) {
        if (z10 != this.H) {
            s("Do not suppressLayout in layout or scroll");
            if (z10) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0));
                this.H = true;
                this.I = true;
                L1();
                return;
            }
            this.H = false;
            if (this.G && this.f2912w != null && this.f2910v != null) {
                requestLayout();
            }
            this.G = false;
        }
    }

    boolean t(f0 f0Var) {
        n nVar = this.W;
        return nVar == null || nVar.g(f0Var, f0Var.q());
    }

    boolean t1(int i10, int i11, MotionEvent motionEvent, int i12) {
        int i13;
        int i14;
        int i15;
        int i16;
        B();
        if (this.f2910v != null) {
            int[] iArr = this.D0;
            iArr[0] = 0;
            iArr[1] = 0;
            u1(i10, i11, iArr);
            int[] iArr2 = this.D0;
            int i17 = iArr2[0];
            int i18 = iArr2[1];
            i15 = i10 - i17;
            i16 = i11 - i18;
            i14 = i18;
            i13 = i17;
        } else {
            i13 = 0;
            i14 = 0;
            i15 = 0;
            i16 = 0;
        }
        if (!this.f2916y.isEmpty()) {
            invalidate();
        }
        int[] iArr3 = this.D0;
        iArr3[0] = 0;
        iArr3[1] = 0;
        N(i13, i14, i15, i16, this.B0, i12, iArr3);
        int[] iArr4 = this.D0;
        int i19 = iArr4[0];
        int i20 = i15 - i19;
        int i21 = iArr4[1];
        int i22 = i16 - i21;
        boolean z10 = (i19 == 0 && i21 == 0) ? false : true;
        int i23 = this.f2888f0;
        int[] iArr5 = this.B0;
        int i24 = iArr5[0];
        this.f2888f0 = i23 - i24;
        int i25 = this.f2890g0;
        int i26 = iArr5[1];
        this.f2890g0 = i25 - i26;
        int[] iArr6 = this.C0;
        iArr6[0] = iArr6[0] + i24;
        iArr6[1] = iArr6[1] + i26;
        if (getOverScrollMode() != 2) {
            if (motionEvent != null && !m0.v.a(motionEvent, 8194)) {
                c1(motionEvent.getX(), i20, motionEvent.getY(), i22);
                if (Build.VERSION.SDK_INT >= 31 && m0.v.a(motionEvent, 4194304)) {
                    f1();
                }
            }
            x(i10, i11);
        }
        if (i13 != 0 || i14 != 0) {
            P(i13, i14);
        }
        if (!awakenScrollBars()) {
            invalidate();
        }
        return (!z10 && i13 == 0 && i14 == 0) ? false : true;
    }

    Rect u0(View view) {
        r rVar = (r) view.getLayoutParams();
        if (!rVar.f3026c) {
            return rVar.f3025b;
        }
        if (this.f2903r0.e() && (rVar.b() || rVar.d())) {
            return rVar.f3025b;
        }
        Rect rect = rVar.f3025b;
        rect.set(0, 0, 0, 0);
        int size = this.f2916y.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f2904s.set(0, 0, 0, 0);
            ((p) this.f2916y.get(i10)).e(this.f2904s, view, this, this.f2903r0);
            int i11 = rect.left;
            Rect rect2 = this.f2904s;
            rect.left = i11 + rect2.left;
            rect.top += rect2.top;
            rect.right += rect2.right;
            rect.bottom += rect2.bottom;
        }
        rVar.f3026c = false;
        return rect;
    }

    void u1(int i10, int i11, int[] iArr) {
        F1();
        S0();
        Trace.beginSection("RV Scroll");
        X(this.f2903r0);
        int iB1 = i10 != 0 ? this.f2912w.B1(i10, this.f2881c, this.f2903r0) : 0;
        int iD1 = i11 != 0 ? this.f2912w.D1(i11, this.f2881c, this.f2903r0) : 0;
        Trace.endSection();
        n1();
        T0();
        J1(false);
        if (iArr != null) {
            iArr[0] = iB1;
            iArr[1] = iD1;
        }
    }

    public void v1(int i10) {
        if (this.H) {
            return;
        }
        L1();
        q qVar = this.f2912w;
        if (qVar == null) {
            Log.e("RecyclerView", "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            qVar.C1(i10);
            awakenScrollBars();
        }
    }

    void w() {
        int iJ = this.f2887f.j();
        for (int i10 = 0; i10 < iJ; i10++) {
            f0 f0VarP0 = p0(this.f2887f.i(i10));
            if (!f0VarP0.L()) {
                f0VarP0.c();
            }
        }
        this.f2881c.d();
    }

    void x(int i10, int i11) {
        boolean zIsFinished;
        EdgeEffect edgeEffect = this.S;
        if (edgeEffect == null || edgeEffect.isFinished() || i10 <= 0) {
            zIsFinished = false;
        } else {
            this.S.onRelease();
            zIsFinished = this.S.isFinished();
        }
        EdgeEffect edgeEffect2 = this.U;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i10 < 0) {
            this.U.onRelease();
            zIsFinished |= this.U.isFinished();
        }
        EdgeEffect edgeEffect3 = this.T;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i11 > 0) {
            this.T.onRelease();
            zIsFinished |= this.T.isFinished();
        }
        EdgeEffect edgeEffect4 = this.V;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i11 < 0) {
            this.V.onRelease();
            zIsFinished |= this.V.isFinished();
        }
        if (zIsFinished) {
            postInvalidateOnAnimation();
        }
    }

    public boolean x0() {
        return !this.E || this.N || this.f2885e.p();
    }

    boolean x1(f0 f0Var, int i10) {
        if (!F0()) {
            f0Var.f2964a.setImportantForAccessibility(i10);
            return true;
        }
        f0Var.f2980z = i10;
        this.E0.add(f0Var);
        return false;
    }

    int y(int i10) {
        return z(i10, this.S, this.U, getWidth());
    }

    void z0() {
        this.f2885e = new androidx.recyclerview.widget.a(new g());
    }

    boolean z1(AccessibilityEvent accessibilityEvent) {
        if (!F0()) {
            return false;
        }
        int iA = accessibilityEvent != null ? n0.b.a(accessibilityEvent) : 0;
        this.J |= iA != 0 ? iA : 0;
        return true;
    }

    public RecyclerView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f2879b = new y();
        this.f2881c = new w();
        this.f2889g = new androidx.recyclerview.widget.p();
        this.f2902r = new a();
        this.f2904s = new Rect();
        this.f2906t = new Rect();
        this.f2908u = new RectF();
        this.f2914x = new ArrayList();
        this.f2916y = new ArrayList();
        this.f2918z = new ArrayList();
        this.F = 0;
        this.N = false;
        this.O = false;
        this.P = 0;
        this.Q = 0;
        this.R = W0;
        this.W = new androidx.recyclerview.widget.c();
        this.f2878a0 = 0;
        this.f2880b0 = -1;
        this.f2896l0 = Float.MIN_VALUE;
        this.f2897m0 = Float.MIN_VALUE;
        this.f2898n0 = true;
        this.f2899o0 = new e0();
        this.f2901q0 = T0 ? new e.b() : null;
        this.f2903r0 = new b0();
        this.f2909u0 = false;
        this.f2911v0 = false;
        this.f2913w0 = new o();
        this.f2915x0 = false;
        this.f2919z0 = new int[2];
        this.B0 = new int[2];
        this.C0 = new int[2];
        this.D0 = new int[2];
        this.E0 = new ArrayList();
        this.F0 = new b();
        this.H0 = 0;
        this.I0 = 0;
        this.K0 = new d();
        e eVar = new e();
        this.L0 = eVar;
        this.M0 = new m0.h(getContext(), eVar);
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f2892h0 = viewConfiguration.getScaledTouchSlop();
        this.f2896l0 = r0.f(viewConfiguration, context);
        this.f2897m0 = r0.j(viewConfiguration, context);
        this.f2894j0 = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f2895k0 = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f2877a = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        setWillNotDraw(getOverScrollMode() == 2);
        this.W.v(this.f2913w0);
        z0();
        B0();
        A0();
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
        this.L = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new androidx.recyclerview.widget.k(this));
        int[] iArr = k1.c.f18924a;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i10, 0);
        o0.l0(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes, i10, 0);
        String string = typedArrayObtainStyledAttributes.getString(k1.c.f18933j);
        if (typedArrayObtainStyledAttributes.getInt(k1.c.f18927d, -1) == -1) {
            setDescendantFocusability(262144);
        }
        this.f2891h = typedArrayObtainStyledAttributes.getBoolean(k1.c.f18926c, true);
        boolean z10 = typedArrayObtainStyledAttributes.getBoolean(k1.c.f18928e, false);
        this.D = z10;
        if (z10) {
            C0((StateListDrawable) typedArrayObtainStyledAttributes.getDrawable(k1.c.f18931h), typedArrayObtainStyledAttributes.getDrawable(k1.c.f18932i), (StateListDrawable) typedArrayObtainStyledAttributes.getDrawable(k1.c.f18929f), typedArrayObtainStyledAttributes.getDrawable(k1.c.f18930g));
        }
        typedArrayObtainStyledAttributes.recycle();
        this.J0 = context.getPackageManager().hasSystemFeature("android.hardware.rotaryencoder.lowres");
        C(context, string, attributeSet, i10, 0);
        int[] iArr2 = P0;
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr2, i10, 0);
        o0.l0(this, context, iArr2, attributeSet, typedArrayObtainStyledAttributes2, i10, 0);
        boolean z11 = typedArrayObtainStyledAttributes2.getBoolean(0, true);
        typedArrayObtainStyledAttributes2.recycle();
        setNestedScrollingEnabled(z11);
        p0.a.d(this, true);
    }

    public static class z extends q0.a {
        public static final Parcelable.Creator<z> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Parcelable f3044a;

        class a implements Parcelable.ClassLoaderCreator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public z createFromParcel(Parcel parcel) {
                return new z(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public z createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new z(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public z[] newArray(int i10) {
                return new z[i10];
            }
        }

        z(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f3044a = parcel.readParcelable(classLoader == null ? q.class.getClassLoader() : classLoader);
        }

        void b(z zVar) {
            this.f3044a = zVar.f3044a;
        }

        @Override // q0.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeParcelable(this.f3044a, 0);
        }

        z(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public static class r extends ViewGroup.MarginLayoutParams {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        f0 f3024a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Rect f3025b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        boolean f3026c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        boolean f3027d;

        public r(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f3025b = new Rect();
            this.f3026c = true;
            this.f3027d = false;
        }

        public int a() {
            return this.f3024a.o();
        }

        public boolean b() {
            return this.f3024a.A();
        }

        public boolean c() {
            return this.f3024a.x();
        }

        public boolean d() {
            return this.f3024a.v();
        }

        public r(int i10, int i11) {
            super(i10, i11);
            this.f3025b = new Rect();
            this.f3026c = true;
            this.f3027d = false;
        }

        public r(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f3025b = new Rect();
            this.f3026c = true;
            this.f3027d = false;
        }

        public r(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f3025b = new Rect();
            this.f3026c = true;
            this.f3027d = false;
        }

        public r(r rVar) {
            super((ViewGroup.LayoutParams) rVar);
            this.f3025b = new Rect();
            this.f3026c = true;
            this.f3027d = false;
        }
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        q qVar = this.f2912w;
        if (qVar != null) {
            return qVar.K(layoutParams);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + W());
    }
}
