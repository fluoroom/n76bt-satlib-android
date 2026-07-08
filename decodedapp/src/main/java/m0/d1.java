package m0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import m0.i1;

/* JADX INFO: loaded from: classes.dex */
public final class d1 {

    /* JADX INFO: renamed from: a */
    private e f20746a;

    public static abstract class b {

        /* JADX INFO: renamed from: a */
        i1 f20749a;

        /* JADX INFO: renamed from: b */
        private final int f20750b;

        public b(int i10) {
            this.f20750b = i10;
        }

        public final int a() {
            return this.f20750b;
        }

        public abstract void b(d1 d1Var);

        public abstract void c(d1 d1Var);

        public abstract i1 d(i1 i1Var, List list);

        public abstract a e(d1 d1Var, a aVar);
    }

    private static class c extends e {

        /* JADX INFO: renamed from: f */
        private static final Interpolator f20751f = new PathInterpolator(0.0f, 1.1f, 0.0f, 1.0f);

        /* JADX INFO: renamed from: g */
        private static final Interpolator f20752g = new b1.a();

        /* JADX INFO: renamed from: h */
        private static final Interpolator f20753h = new DecelerateInterpolator(1.5f);

        /* JADX INFO: renamed from: i */
        private static final Interpolator f20754i = new AccelerateInterpolator(1.5f);

        private static class a implements View.OnApplyWindowInsetsListener {

            /* JADX INFO: renamed from: a */
            final b f20755a;

            /* JADX INFO: renamed from: b */
            private i1 f20756b;

            /* JADX INFO: renamed from: m0.d1$c$a$a */
            class C0283a implements ValueAnimator.AnimatorUpdateListener {

                /* JADX INFO: renamed from: a */
                final /* synthetic */ d1 f20757a;

                /* JADX INFO: renamed from: b */
                final /* synthetic */ i1 f20758b;

                /* JADX INFO: renamed from: c */
                final /* synthetic */ i1 f20759c;

                /* JADX INFO: renamed from: d */
                final /* synthetic */ int f20760d;

                /* JADX INFO: renamed from: e */
                final /* synthetic */ View f20761e;

                C0283a(d1 d1Var, i1 i1Var, i1 i1Var2, int i10, View view) {
                    this.f20757a = d1Var;
                    this.f20758b = i1Var;
                    this.f20759c = i1Var2;
                    this.f20760d = i10;
                    this.f20761e = view;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    this.f20757a.e(valueAnimator.getAnimatedFraction());
                    c.k(this.f20761e, c.o(this.f20758b, this.f20759c, this.f20757a.b(), this.f20760d), Collections.singletonList(this.f20757a));
                }
            }

            class b extends AnimatorListenerAdapter {

                /* JADX INFO: renamed from: a */
                final /* synthetic */ d1 f20763a;

                /* JADX INFO: renamed from: b */
                final /* synthetic */ View f20764b;

                b(d1 d1Var, View view) {
                    this.f20763a = d1Var;
                    this.f20764b = view;
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    this.f20763a.e(1.0f);
                    c.i(this.f20764b, this.f20763a);
                }
            }

            /* JADX INFO: renamed from: m0.d1$c$a$c */
            class RunnableC0284c implements Runnable {

                /* JADX INFO: renamed from: a */
                final /* synthetic */ View f20766a;

                /* JADX INFO: renamed from: b */
                final /* synthetic */ d1 f20767b;

                /* JADX INFO: renamed from: c */
                final /* synthetic */ a f20768c;

                /* JADX INFO: renamed from: d */
                final /* synthetic */ ValueAnimator f20769d;

                RunnableC0284c(View view, d1 d1Var, a aVar, ValueAnimator valueAnimator) {
                    this.f20766a = view;
                    this.f20767b = d1Var;
                    this.f20768c = aVar;
                    this.f20769d = valueAnimator;
                }

                @Override // java.lang.Runnable
                public void run() {
                    c.l(this.f20766a, this.f20767b, this.f20768c);
                    this.f20769d.start();
                }
            }

            a(View view, b bVar) {
                this.f20755a = bVar;
                i1 i1VarI = o0.I(view);
                this.f20756b = i1VarI != null ? new i1.b(i1VarI).a() : null;
            }

            @Override // android.view.View.OnApplyWindowInsetsListener
            public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                if (!view.isLaidOut()) {
                    this.f20756b = i1.x(windowInsets, view);
                    return c.m(view, windowInsets);
                }
                i1 i1VarX = i1.x(windowInsets, view);
                if (this.f20756b == null) {
                    this.f20756b = o0.I(view);
                }
                if (this.f20756b == null) {
                    this.f20756b = i1VarX;
                    return c.m(view, windowInsets);
                }
                b bVarN = c.n(view);
                if (bVarN != null && Objects.equals(bVarN.f20749a, i1VarX)) {
                    return c.m(view, windowInsets);
                }
                int[] iArr = new int[1];
                int[] iArr2 = new int[1];
                c.e(i1VarX, this.f20756b, iArr, iArr2);
                int i10 = iArr[0];
                int i11 = iArr2[0];
                int i12 = i10 | i11;
                if (i12 == 0) {
                    this.f20756b = i1VarX;
                    return c.m(view, windowInsets);
                }
                i1 i1Var = this.f20756b;
                d1 d1Var = new d1(i12, c.g(i10, i11), (i1.q.a() & i12) != 0 ? 160L : 250L);
                d1Var.e(0.0f);
                ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(d1Var.a());
                a aVarF = c.f(i1VarX, i1Var, i12);
                c.j(view, d1Var, i1VarX, false);
                duration.addUpdateListener(new C0283a(d1Var, i1VarX, i1Var, i12, view));
                duration.addListener(new b(d1Var, view));
                e0.a(view, new RunnableC0284c(view, d1Var, aVarF, duration));
                this.f20756b = i1VarX;
                return c.m(view, windowInsets);
            }
        }

        c(int i10, Interpolator interpolator, long j10) {
            super(i10, interpolator, j10);
        }

        static void e(i1 i1Var, i1 i1Var2, int[] iArr, int[] iArr2) {
            for (int i10 = 1; i10 <= 512; i10 <<= 1) {
                d0.b bVarF = i1Var.f(i10);
                d0.b bVarF2 = i1Var2.f(i10);
                int i11 = bVarF.f10510a;
                int i12 = bVarF2.f10510a;
                boolean z10 = i11 > i12 || bVarF.f10511b > bVarF2.f10511b || bVarF.f10512c > bVarF2.f10512c || bVarF.f10513d > bVarF2.f10513d;
                if (z10 != (i11 < i12 || bVarF.f10511b < bVarF2.f10511b || bVarF.f10512c < bVarF2.f10512c || bVarF.f10513d < bVarF2.f10513d)) {
                    if (z10) {
                        iArr[0] = iArr[0] | i10;
                    } else {
                        iArr2[0] = iArr2[0] | i10;
                    }
                }
            }
        }

        static a f(i1 i1Var, i1 i1Var2, int i10) {
            d0.b bVarF = i1Var.f(i10);
            d0.b bVarF2 = i1Var2.f(i10);
            return new a(d0.b.b(Math.min(bVarF.f10510a, bVarF2.f10510a), Math.min(bVarF.f10511b, bVarF2.f10511b), Math.min(bVarF.f10512c, bVarF2.f10512c), Math.min(bVarF.f10513d, bVarF2.f10513d)), d0.b.b(Math.max(bVarF.f10510a, bVarF2.f10510a), Math.max(bVarF.f10511b, bVarF2.f10511b), Math.max(bVarF.f10512c, bVarF2.f10512c), Math.max(bVarF.f10513d, bVarF2.f10513d)));
        }

        static Interpolator g(int i10, int i11) {
            if ((i1.q.a() & i10) != 0) {
                return f20751f;
            }
            if ((i1.q.a() & i11) != 0) {
                return f20752g;
            }
            if ((i10 & i1.q.d()) != 0) {
                return f20753h;
            }
            if ((i1.q.d() & i11) != 0) {
                return f20754i;
            }
            return null;
        }

        private static View.OnApplyWindowInsetsListener h(View view, b bVar) {
            return new a(view, bVar);
        }

        static void i(View view, d1 d1Var) {
            b bVarN = n(view);
            if (bVarN != null) {
                bVarN.b(d1Var);
                if (bVarN.a() == 0) {
                    return;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                    i(viewGroup.getChildAt(i10), d1Var);
                }
            }
        }

        static void j(View view, d1 d1Var, i1 i1Var, boolean z10) {
            b bVarN = n(view);
            if (bVarN != null) {
                bVarN.f20749a = i1Var;
                if (!z10) {
                    bVarN.c(d1Var);
                    z10 = bVarN.a() == 0;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                    j(viewGroup.getChildAt(i10), d1Var, i1Var, z10);
                }
            }
        }

        static void k(View view, i1 i1Var, List list) {
            b bVarN = n(view);
            if (bVarN != null) {
                i1Var = bVarN.d(i1Var, list);
                if (bVarN.a() == 0) {
                    return;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                    k(viewGroup.getChildAt(i10), i1Var, list);
                }
            }
        }

        static void l(View view, d1 d1Var, a aVar) {
            b bVarN = n(view);
            if (bVarN != null) {
                bVarN.e(d1Var, aVar);
                if (bVarN.a() == 0) {
                    return;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                    l(viewGroup.getChildAt(i10), d1Var, aVar);
                }
            }
        }

        static WindowInsets m(View view, WindowInsets windowInsets) {
            return view.getTag(z.b.M) != null ? windowInsets : view.onApplyWindowInsets(windowInsets);
        }

        static b n(View view) {
            Object tag = view.getTag(z.b.T);
            if (tag instanceof a) {
                return ((a) tag).f20755a;
            }
            return null;
        }

        static i1 o(i1 i1Var, i1 i1Var2, float f10, int i10) {
            i1.b bVar = new i1.b(i1Var);
            for (int i11 = 1; i11 <= 512; i11 <<= 1) {
                if ((i10 & i11) == 0) {
                    bVar.b(i11, i1Var.f(i11));
                } else {
                    d0.b bVarF = i1Var.f(i11);
                    d0.b bVarF2 = i1Var2.f(i11);
                    float f11 = 1.0f - f10;
                    bVar.b(i11, i1.n(bVarF, (int) (((double) ((bVarF.f10510a - bVarF2.f10510a) * f11)) + 0.5d), (int) (((double) ((bVarF.f10511b - bVarF2.f10511b) * f11)) + 0.5d), (int) (((double) ((bVarF.f10512c - bVarF2.f10512c) * f11)) + 0.5d), (int) (((double) ((bVarF.f10513d - bVarF2.f10513d) * f11)) + 0.5d)));
                }
            }
            return bVar.a();
        }

        static void p(View view, b bVar) {
            View.OnApplyWindowInsetsListener onApplyWindowInsetsListenerH = bVar != null ? h(view, bVar) : null;
            view.setTag(z.b.T, onApplyWindowInsetsListenerH);
            if (view.getTag(z.b.L) == null && view.getTag(z.b.M) == null) {
                view.setOnApplyWindowInsetsListener(onApplyWindowInsetsListenerH);
            }
        }
    }

    private static class e {

        /* JADX INFO: renamed from: a */
        private final int f20776a;

        /* JADX INFO: renamed from: b */
        private float f20777b;

        /* JADX INFO: renamed from: c */
        private final Interpolator f20778c;

        /* JADX INFO: renamed from: d */
        private final long f20779d;

        /* JADX INFO: renamed from: e */
        private float f20780e = 1.0f;

        e(int i10, Interpolator interpolator, long j10) {
            this.f20776a = i10;
            this.f20778c = interpolator;
            this.f20779d = j10;
        }

        public long a() {
            return this.f20779d;
        }

        public float b() {
            Interpolator interpolator = this.f20778c;
            return interpolator != null ? interpolator.getInterpolation(this.f20777b) : this.f20777b;
        }

        public int c() {
            return this.f20776a;
        }

        public void d(float f10) {
            this.f20777b = f10;
        }
    }

    public d1(int i10, Interpolator interpolator, long j10) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.f20746a = new d(i10, interpolator, j10);
        } else {
            this.f20746a = new c(i10, interpolator, j10);
        }
    }

    static void d(View view, b bVar) {
        if (Build.VERSION.SDK_INT >= 30) {
            d.h(view, bVar);
        } else {
            c.p(view, bVar);
        }
    }

    static d1 f(WindowInsetsAnimation windowInsetsAnimation) {
        return new d1(windowInsetsAnimation);
    }

    public long a() {
        return this.f20746a.a();
    }

    public float b() {
        return this.f20746a.b();
    }

    public int c() {
        return this.f20746a.c();
    }

    public void e(float f10) {
        this.f20746a.d(f10);
    }

    private static class d extends e {

        /* JADX INFO: renamed from: f */
        private final WindowInsetsAnimation f20771f;

        private static class a extends WindowInsetsAnimation.Callback {

            /* JADX INFO: renamed from: a */
            private final b f20772a;

            /* JADX INFO: renamed from: b */
            private List f20773b;

            /* JADX INFO: renamed from: c */
            private ArrayList f20774c;

            /* JADX INFO: renamed from: d */
            private final HashMap f20775d;

            a(b bVar) {
                super(bVar.a());
                this.f20775d = new HashMap();
                this.f20772a = bVar;
            }

            private d1 a(WindowInsetsAnimation windowInsetsAnimation) {
                d1 d1Var = (d1) this.f20775d.get(windowInsetsAnimation);
                if (d1Var != null) {
                    return d1Var;
                }
                d1 d1VarF = d1.f(windowInsetsAnimation);
                this.f20775d.put(windowInsetsAnimation, d1VarF);
                return d1VarF;
            }

            @Override // android.view.WindowInsetsAnimation.Callback
            public void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
                this.f20772a.b(a(windowInsetsAnimation));
                this.f20775d.remove(windowInsetsAnimation);
            }

            @Override // android.view.WindowInsetsAnimation.Callback
            public void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
                this.f20772a.c(a(windowInsetsAnimation));
            }

            @Override // android.view.WindowInsetsAnimation.Callback
            public WindowInsets onProgress(WindowInsets windowInsets, List list) {
                ArrayList arrayList = this.f20774c;
                if (arrayList == null) {
                    ArrayList arrayList2 = new ArrayList(list.size());
                    this.f20774c = arrayList2;
                    this.f20773b = DesugarCollections.unmodifiableList(arrayList2);
                } else {
                    arrayList.clear();
                }
                for (int size = list.size() - 1; size >= 0; size--) {
                    WindowInsetsAnimation windowInsetsAnimationA = h1.a(list.get(size));
                    d1 d1VarA = a(windowInsetsAnimationA);
                    d1VarA.e(windowInsetsAnimationA.getFraction());
                    this.f20774c.add(d1VarA);
                }
                return this.f20772a.d(i1.w(windowInsets), this.f20773b).v();
            }

            @Override // android.view.WindowInsetsAnimation.Callback
            public WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation windowInsetsAnimation, WindowInsetsAnimation.Bounds bounds) {
                return this.f20772a.e(a(windowInsetsAnimation), a.d(bounds)).c();
            }
        }

        d(WindowInsetsAnimation windowInsetsAnimation) {
            super(0, null, 0L);
            this.f20771f = windowInsetsAnimation;
        }

        public static WindowInsetsAnimation.Bounds e(a aVar) {
            g1.a();
            return f1.a(aVar.a().e(), aVar.b().e());
        }

        public static d0.b f(WindowInsetsAnimation.Bounds bounds) {
            return d0.b.d(bounds.getUpperBound());
        }

        public static d0.b g(WindowInsetsAnimation.Bounds bounds) {
            return d0.b.d(bounds.getLowerBound());
        }

        public static void h(View view, b bVar) {
            view.setWindowInsetsAnimationCallback(bVar != null ? new a(bVar) : null);
        }

        @Override // m0.d1.e
        public long a() {
            return this.f20771f.getDurationMillis();
        }

        @Override // m0.d1.e
        public float b() {
            return this.f20771f.getInterpolatedFraction();
        }

        @Override // m0.d1.e
        public int c() {
            return this.f20771f.getTypeMask();
        }

        @Override // m0.d1.e
        public void d(float f10) {
            this.f20771f.setFraction(f10);
        }

        d(int i10, Interpolator interpolator, long j10) {
            this(e1.a(i10, interpolator, j10));
        }
    }

    public static final class a {

        /* JADX INFO: renamed from: a */
        private final d0.b f20747a;

        /* JADX INFO: renamed from: b */
        private final d0.b f20748b;

        public a(d0.b bVar, d0.b bVar2) {
            this.f20747a = bVar;
            this.f20748b = bVar2;
        }

        public static a d(WindowInsetsAnimation.Bounds bounds) {
            return new a(bounds);
        }

        public d0.b a() {
            return this.f20747a;
        }

        public d0.b b() {
            return this.f20748b;
        }

        public WindowInsetsAnimation.Bounds c() {
            return d.e(this);
        }

        public String toString() {
            return "Bounds{lower=" + this.f20747a + " upper=" + this.f20748b + "}";
        }

        private a(WindowInsetsAnimation.Bounds bounds) {
            this.f20747a = d.g(bounds);
            this.f20748b = d.f(bounds);
        }
    }

    private d1(WindowInsetsAnimation windowInsetsAnimation) {
        this(0, null, 0L);
        if (Build.VERSION.SDK_INT >= 30) {
            this.f20746a = new d(windowInsetsAnimation);
        }
    }
}
