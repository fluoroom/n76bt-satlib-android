package m0;

import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import j$.util.Objects;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public class i1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final i1 f20802b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p f20803a;

    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static Field f20804a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static Field f20805b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static Field f20806c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static boolean f20807d;

        static {
            try {
                Field declaredField = View.class.getDeclaredField("mAttachInfo");
                f20804a = declaredField;
                declaredField.setAccessible(true);
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                Field declaredField2 = cls.getDeclaredField("mStableInsets");
                f20805b = declaredField2;
                declaredField2.setAccessible(true);
                Field declaredField3 = cls.getDeclaredField("mContentInsets");
                f20806c = declaredField3;
                declaredField3.setAccessible(true);
                f20807d = true;
            } catch (ReflectiveOperationException e10) {
                Log.w("WindowInsetsCompat", "Failed to get visible insets from AttachInfo " + e10.getMessage(), e10);
            }
        }

        public static i1 a(View view) {
            if (f20807d && view.isAttachedToWindow()) {
                try {
                    Object obj = f20804a.get(view.getRootView());
                    if (obj != null) {
                        Rect rect = (Rect) f20805b.get(obj);
                        Rect rect2 = (Rect) f20806c.get(obj);
                        if (rect != null && rect2 != null) {
                            i1 i1VarA = new b().c(d0.b.c(rect)).d(d0.b.c(rect2)).a();
                            i1VarA.s(i1VarA);
                            i1VarA.d(view.getRootView());
                            return i1VarA;
                        }
                    }
                } catch (IllegalAccessException e10) {
                    Log.w("WindowInsetsCompat", "Failed to get insets from AttachInfo. " + e10.getMessage(), e10);
                }
            }
            return null;
        }
    }

    private static class e extends d {
        e() {
        }

        @Override // m0.i1.h
        void c(int i10, d0.b bVar) {
            this.f20815c.setInsets(r.a(i10), bVar.e());
        }

        e(i1 i1Var) {
            super(i1Var);
        }
    }

    private static class f extends e {
        f() {
        }

        f(i1 i1Var) {
            super(i1Var);
        }
    }

    private static class g extends f {
        g() {
        }

        @Override // m0.i1.e, m0.i1.h
        void c(int i10, d0.b bVar) {
            this.f20815c.setInsets(s.a(i10), bVar.e());
        }

        g(i1 i1Var) {
            super(i1Var);
        }
    }

    private static class h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final i1 f20816a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        d0.b[] f20817b;

        h() {
            this(new i1((i1) null));
        }

        protected final void a() {
            d0.b[] bVarArr = this.f20817b;
            if (bVarArr != null) {
                d0.b bVarF = bVarArr[q.b(1)];
                d0.b bVarF2 = this.f20817b[q.b(2)];
                if (bVarF2 == null) {
                    bVarF2 = this.f20816a.f(2);
                }
                if (bVarF == null) {
                    bVarF = this.f20816a.f(1);
                }
                g(d0.b.a(bVarF, bVarF2));
                d0.b bVar = this.f20817b[q.b(16)];
                if (bVar != null) {
                    f(bVar);
                }
                d0.b bVar2 = this.f20817b[q.b(32)];
                if (bVar2 != null) {
                    d(bVar2);
                }
                d0.b bVar3 = this.f20817b[q.b(64)];
                if (bVar3 != null) {
                    h(bVar3);
                }
            }
        }

        abstract i1 b();

        void c(int i10, d0.b bVar) {
            if (this.f20817b == null) {
                this.f20817b = new d0.b[10];
            }
            for (int i11 = 1; i11 <= 512; i11 <<= 1) {
                if ((i10 & i11) != 0) {
                    this.f20817b[q.b(i11)] = bVar;
                }
            }
        }

        abstract void e(d0.b bVar);

        abstract void g(d0.b bVar);

        h(i1 i1Var) {
            this.f20816a = i1Var;
        }

        void d(d0.b bVar) {
        }

        void f(d0.b bVar) {
        }

        void h(d0.b bVar) {
        }
    }

    private static class k extends j {
        k(i1 i1Var, WindowInsets windowInsets) {
            super(i1Var, windowInsets);
        }

        @Override // m0.i1.p
        i1 a() {
            return i1.w(this.f20823c.consumeDisplayCutout());
        }

        @Override // m0.i1.i, m0.i1.p
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof k)) {
                return false;
            }
            k kVar = (k) obj;
            return Objects.equals(this.f20823c, kVar.f20823c) && Objects.equals(this.f20827g, kVar.f20827g) && i.z(this.f20828h, kVar.f20828h);
        }

        @Override // m0.i1.p
        m0.j f() {
            return m0.j.e(this.f20823c.getDisplayCutout());
        }

        @Override // m0.i1.p
        public int hashCode() {
            return this.f20823c.hashCode();
        }

        k(i1 i1Var, k kVar) {
            super(i1Var, kVar);
        }
    }

    private static class m extends l {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        static final i1 f20833r = i1.w(WindowInsets.CONSUMED);

        m(i1 i1Var, WindowInsets windowInsets) {
            super(i1Var, windowInsets);
        }

        @Override // m0.i1.i, m0.i1.p
        public d0.b g(int i10) {
            return d0.b.d(this.f20823c.getInsets(r.a(i10)));
        }

        m(i1 i1Var, m mVar) {
            super(i1Var, mVar);
        }

        @Override // m0.i1.i, m0.i1.p
        final void d(View view) {
        }
    }

    private static class n extends m {
        n(i1 i1Var, WindowInsets windowInsets) {
            super(i1Var, windowInsets);
        }

        n(i1 i1Var, n nVar) {
            super(i1Var, nVar);
        }
    }

    private static class o extends n {

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        static final i1 f20834s = i1.w(WindowInsets.CONSUMED);

        o(i1 i1Var, WindowInsets windowInsets) {
            super(i1Var, windowInsets);
        }

        @Override // m0.i1.m, m0.i1.i, m0.i1.p
        public d0.b g(int i10) {
            return d0.b.d(this.f20823c.getInsets(s.a(i10)));
        }

        o(i1 i1Var, o oVar) {
            super(i1Var, oVar);
        }
    }

    public static final class q {
        public static int a() {
            return 8;
        }

        static int b(int i10) {
            if (i10 == 1) {
                return 0;
            }
            if (i10 == 2) {
                return 1;
            }
            if (i10 == 4) {
                return 2;
            }
            if (i10 == 8) {
                return 3;
            }
            if (i10 == 16) {
                return 4;
            }
            if (i10 == 32) {
                return 5;
            }
            if (i10 == 64) {
                return 6;
            }
            if (i10 == 128) {
                return 7;
            }
            if (i10 == 256) {
                return 8;
            }
            if (i10 == 512) {
                return 9;
            }
            throw new IllegalArgumentException("type needs to be >= FIRST and <= LAST, type=" + i10);
        }

        public static int c() {
            return 32;
        }

        public static int d() {
            return 519;
        }
    }

    private static final class r {
        static int a(int i10) {
            int iStatusBars;
            int i11 = 0;
            for (int i12 = 1; i12 <= 512; i12 <<= 1) {
                if ((i10 & i12) != 0) {
                    if (i12 == 1) {
                        iStatusBars = WindowInsets.Type.statusBars();
                    } else if (i12 == 2) {
                        iStatusBars = WindowInsets.Type.navigationBars();
                    } else if (i12 == 4) {
                        iStatusBars = WindowInsets.Type.captionBar();
                    } else if (i12 == 8) {
                        iStatusBars = WindowInsets.Type.ime();
                    } else if (i12 == 16) {
                        iStatusBars = WindowInsets.Type.systemGestures();
                    } else if (i12 == 32) {
                        iStatusBars = WindowInsets.Type.mandatorySystemGestures();
                    } else if (i12 == 64) {
                        iStatusBars = WindowInsets.Type.tappableElement();
                    } else if (i12 == 128) {
                        iStatusBars = WindowInsets.Type.displayCutout();
                    }
                    i11 |= iStatusBars;
                }
            }
            return i11;
        }
    }

    private static final class s {
        static int a(int i10) {
            int iStatusBars;
            int i11 = 0;
            for (int i12 = 1; i12 <= 512; i12 <<= 1) {
                if ((i10 & i12) != 0) {
                    if (i12 == 1) {
                        iStatusBars = WindowInsets.Type.statusBars();
                    } else if (i12 == 2) {
                        iStatusBars = WindowInsets.Type.navigationBars();
                    } else if (i12 == 4) {
                        iStatusBars = WindowInsets.Type.captionBar();
                    } else if (i12 == 8) {
                        iStatusBars = WindowInsets.Type.ime();
                    } else if (i12 == 16) {
                        iStatusBars = WindowInsets.Type.systemGestures();
                    } else if (i12 == 32) {
                        iStatusBars = WindowInsets.Type.mandatorySystemGestures();
                    } else if (i12 == 64) {
                        iStatusBars = WindowInsets.Type.tappableElement();
                    } else if (i12 == 128) {
                        iStatusBars = WindowInsets.Type.displayCutout();
                    } else if (i12 == 512) {
                        iStatusBars = WindowInsets.Type.systemOverlays();
                    }
                    i11 |= iStatusBars;
                }
            }
            return i11;
        }
    }

    static {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 34) {
            f20802b = o.f20834s;
        } else if (i10 >= 30) {
            f20802b = m.f20833r;
        } else {
            f20802b = p.f20835b;
        }
    }

    private i1(WindowInsets windowInsets) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 34) {
            this.f20803a = new o(this, windowInsets);
            return;
        }
        if (i10 >= 31) {
            this.f20803a = new n(this, windowInsets);
            return;
        }
        if (i10 >= 30) {
            this.f20803a = new m(this, windowInsets);
            return;
        }
        if (i10 >= 29) {
            this.f20803a = new l(this, windowInsets);
        } else if (i10 >= 28) {
            this.f20803a = new k(this, windowInsets);
        } else {
            this.f20803a = new j(this, windowInsets);
        }
    }

    static d0.b n(d0.b bVar, int i10, int i11, int i12, int i13) {
        int iMax = Math.max(0, bVar.f10510a - i10);
        int iMax2 = Math.max(0, bVar.f10511b - i11);
        int iMax3 = Math.max(0, bVar.f10512c - i12);
        int iMax4 = Math.max(0, bVar.f10513d - i13);
        return (iMax == i10 && iMax2 == i11 && iMax3 == i12 && iMax4 == i13) ? bVar : d0.b.b(iMax, iMax2, iMax3, iMax4);
    }

    public static i1 w(WindowInsets windowInsets) {
        return x(windowInsets, null);
    }

    public static i1 x(WindowInsets windowInsets, View view) {
        i1 i1Var = new i1((WindowInsets) l0.g.g(windowInsets));
        if (view != null && view.isAttachedToWindow()) {
            i1Var.s(o0.I(view));
            i1Var.d(view.getRootView());
            i1Var.u(view.getWindowSystemUiVisibility());
        }
        return i1Var;
    }

    public i1 a() {
        return this.f20803a.a();
    }

    public i1 b() {
        return this.f20803a.b();
    }

    public i1 c() {
        return this.f20803a.c();
    }

    void d(View view) {
        this.f20803a.d(view);
    }

    public m0.j e() {
        return this.f20803a.f();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof i1) {
            return l0.b.a(this.f20803a, ((i1) obj).f20803a);
        }
        return false;
    }

    public d0.b f(int i10) {
        return this.f20803a.g(i10);
    }

    public d0.b g() {
        return this.f20803a.i();
    }

    public d0.b h() {
        return this.f20803a.j();
    }

    public int hashCode() {
        p pVar = this.f20803a;
        if (pVar == null) {
            return 0;
        }
        return pVar.hashCode();
    }

    public int i() {
        return this.f20803a.k().f10513d;
    }

    public int j() {
        return this.f20803a.k().f10510a;
    }

    public int k() {
        return this.f20803a.k().f10512c;
    }

    public int l() {
        return this.f20803a.k().f10511b;
    }

    public i1 m(int i10, int i11, int i12, int i13) {
        return this.f20803a.m(i10, i11, i12, i13);
    }

    public boolean o() {
        return this.f20803a.n();
    }

    public i1 p(int i10, int i11, int i12, int i13) {
        return new b(this).d(d0.b.b(i10, i11, i12, i13)).a();
    }

    void q(d0.b[] bVarArr) {
        this.f20803a.p(bVarArr);
    }

    void r(d0.b bVar) {
        this.f20803a.q(bVar);
    }

    void s(i1 i1Var) {
        this.f20803a.r(i1Var);
    }

    void t(d0.b bVar) {
        this.f20803a.s(bVar);
    }

    void u(int i10) {
        this.f20803a.t(i10);
    }

    public WindowInsets v() {
        p pVar = this.f20803a;
        if (pVar instanceof i) {
            return ((i) pVar).f20823c;
        }
        return null;
    }

    private static class c extends h {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static Field f20809e = null;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static boolean f20810f = false;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static Constructor f20811g = null;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static boolean f20812h = false;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private WindowInsets f20813c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private d0.b f20814d;

        c() {
            this.f20813c = i();
        }

        private static WindowInsets i() {
            if (!f20810f) {
                try {
                    f20809e = WindowInsets.class.getDeclaredField("CONSUMED");
                } catch (ReflectiveOperationException e10) {
                    Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e10);
                }
                f20810f = true;
            }
            Field field = f20809e;
            if (field != null) {
                try {
                    WindowInsets windowInsets = (WindowInsets) field.get(null);
                    if (windowInsets != null) {
                        return new WindowInsets(windowInsets);
                    }
                } catch (ReflectiveOperationException e11) {
                    Log.i("WindowInsetsCompat", "Could not get value from WindowInsets.CONSUMED field", e11);
                }
            }
            if (!f20812h) {
                try {
                    f20811g = WindowInsets.class.getConstructor(Rect.class);
                } catch (ReflectiveOperationException e12) {
                    Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e12);
                }
                f20812h = true;
            }
            Constructor constructor = f20811g;
            if (constructor != null) {
                try {
                    return (WindowInsets) constructor.newInstance(new Rect());
                } catch (ReflectiveOperationException e13) {
                    Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", e13);
                }
            }
            return null;
        }

        @Override // m0.i1.h
        i1 b() {
            a();
            i1 i1VarW = i1.w(this.f20813c);
            i1VarW.q(this.f20817b);
            i1VarW.t(this.f20814d);
            return i1VarW;
        }

        @Override // m0.i1.h
        void e(d0.b bVar) {
            this.f20814d = bVar;
        }

        @Override // m0.i1.h
        void g(d0.b bVar) {
            WindowInsets windowInsets = this.f20813c;
            if (windowInsets != null) {
                this.f20813c = windowInsets.replaceSystemWindowInsets(bVar.f10510a, bVar.f10511b, bVar.f10512c, bVar.f10513d);
            }
        }

        c(i1 i1Var) {
            super(i1Var);
            this.f20813c = i1Var.v();
        }
    }

    private static class d extends h {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final WindowInsets.Builder f20815c;

        d() {
            this.f20815c = k1.a();
        }

        @Override // m0.i1.h
        i1 b() {
            a();
            i1 i1VarW = i1.w(this.f20815c.build());
            i1VarW.q(this.f20817b);
            return i1VarW;
        }

        @Override // m0.i1.h
        void d(d0.b bVar) {
            this.f20815c.setMandatorySystemGestureInsets(bVar.e());
        }

        @Override // m0.i1.h
        void e(d0.b bVar) {
            this.f20815c.setStableInsets(bVar.e());
        }

        @Override // m0.i1.h
        void f(d0.b bVar) {
            this.f20815c.setSystemGestureInsets(bVar.e());
        }

        @Override // m0.i1.h
        void g(d0.b bVar) {
            this.f20815c.setSystemWindowInsets(bVar.e());
        }

        @Override // m0.i1.h
        void h(d0.b bVar) {
            this.f20815c.setTappableElementInsets(bVar.e());
        }

        d(i1 i1Var) {
            WindowInsets.Builder builderA;
            super(i1Var);
            WindowInsets windowInsetsV = i1Var.v();
            if (windowInsetsV != null) {
                builderA = j1.a(windowInsetsV);
            } else {
                builderA = k1.a();
            }
            this.f20815c = builderA;
        }
    }

    private static class j extends i {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private d0.b f20829n;

        j(i1 i1Var, WindowInsets windowInsets) {
            super(i1Var, windowInsets);
            this.f20829n = null;
        }

        @Override // m0.i1.p
        i1 b() {
            return i1.w(this.f20823c.consumeStableInsets());
        }

        @Override // m0.i1.p
        i1 c() {
            return i1.w(this.f20823c.consumeSystemWindowInsets());
        }

        @Override // m0.i1.p
        final d0.b i() {
            if (this.f20829n == null) {
                this.f20829n = d0.b.b(this.f20823c.getStableInsetLeft(), this.f20823c.getStableInsetTop(), this.f20823c.getStableInsetRight(), this.f20823c.getStableInsetBottom());
            }
            return this.f20829n;
        }

        @Override // m0.i1.p
        boolean n() {
            return this.f20823c.isConsumed();
        }

        @Override // m0.i1.p
        public void s(d0.b bVar) {
            this.f20829n = bVar;
        }

        j(i1 i1Var, j jVar) {
            super(i1Var, jVar);
            this.f20829n = null;
            this.f20829n = jVar.f20829n;
        }
    }

    private static class i extends p {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static boolean f20818i = false;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static Method f20819j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private static Class f20820k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private static Field f20821l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private static Field f20822m;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final WindowInsets f20823c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private d0.b[] f20824d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private d0.b f20825e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private i1 f20826f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        d0.b f20827g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f20828h;

        i(i1 i1Var, WindowInsets windowInsets) {
            super(i1Var);
            this.f20825e = null;
            this.f20823c = windowInsets;
        }

        private d0.b u(int i10, boolean z10) {
            d0.b bVarA = d0.b.f10509e;
            for (int i11 = 1; i11 <= 512; i11 <<= 1) {
                if ((i10 & i11) != 0) {
                    bVarA = d0.b.a(bVarA, v(i11, z10));
                }
            }
            return bVarA;
        }

        private d0.b w() {
            i1 i1Var = this.f20826f;
            return i1Var != null ? i1Var.g() : d0.b.f10509e;
        }

        private d0.b x(View view) {
            if (Build.VERSION.SDK_INT >= 30) {
                throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
            }
            if (!f20818i) {
                y();
            }
            Method method = f20819j;
            if (method != null && f20820k != null && f20821l != null) {
                try {
                    Object objInvoke = method.invoke(view, null);
                    if (objInvoke == null) {
                        Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                        return null;
                    }
                    Rect rect = (Rect) f20821l.get(f20822m.get(objInvoke));
                    if (rect != null) {
                        return d0.b.c(rect);
                    }
                    return null;
                } catch (ReflectiveOperationException e10) {
                    Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e10.getMessage(), e10);
                }
            }
            return null;
        }

        private static void y() {
            try {
                f20819j = View.class.getDeclaredMethod("getViewRootImpl", null);
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                f20820k = cls;
                f20821l = cls.getDeclaredField("mVisibleInsets");
                f20822m = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
                f20821l.setAccessible(true);
                f20822m.setAccessible(true);
            } catch (ReflectiveOperationException e10) {
                Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e10.getMessage(), e10);
            }
            f20818i = true;
        }

        static boolean z(int i10, int i11) {
            return (i10 & 6) == (i11 & 6);
        }

        @Override // m0.i1.p
        void d(View view) {
            d0.b bVarX = x(view);
            if (bVarX == null) {
                bVarX = d0.b.f10509e;
            }
            q(bVarX);
        }

        @Override // m0.i1.p
        void e(i1 i1Var) {
            i1Var.s(this.f20826f);
            i1Var.r(this.f20827g);
            i1Var.u(this.f20828h);
        }

        @Override // m0.i1.p
        public boolean equals(Object obj) {
            if (!super.equals(obj)) {
                return false;
            }
            i iVar = (i) obj;
            return Objects.equals(this.f20827g, iVar.f20827g) && z(this.f20828h, iVar.f20828h);
        }

        @Override // m0.i1.p
        public d0.b g(int i10) {
            return u(i10, false);
        }

        @Override // m0.i1.p
        final d0.b k() {
            if (this.f20825e == null) {
                this.f20825e = d0.b.b(this.f20823c.getSystemWindowInsetLeft(), this.f20823c.getSystemWindowInsetTop(), this.f20823c.getSystemWindowInsetRight(), this.f20823c.getSystemWindowInsetBottom());
            }
            return this.f20825e;
        }

        @Override // m0.i1.p
        i1 m(int i10, int i11, int i12, int i13) {
            b bVar = new b(i1.w(this.f20823c));
            bVar.d(i1.n(k(), i10, i11, i12, i13));
            bVar.c(i1.n(i(), i10, i11, i12, i13));
            return bVar.a();
        }

        @Override // m0.i1.p
        boolean o() {
            return this.f20823c.isRound();
        }

        @Override // m0.i1.p
        public void p(d0.b[] bVarArr) {
            this.f20824d = bVarArr;
        }

        @Override // m0.i1.p
        void q(d0.b bVar) {
            this.f20827g = bVar;
        }

        @Override // m0.i1.p
        void r(i1 i1Var) {
            this.f20826f = i1Var;
        }

        @Override // m0.i1.p
        void t(int i10) {
            this.f20828h = i10;
        }

        protected d0.b v(int i10, boolean z10) {
            d0.b bVarG;
            int i11;
            if (i10 == 1) {
                return z10 ? d0.b.b(0, Math.max(w().f10511b, k().f10511b), 0, 0) : (this.f20828h & 4) != 0 ? d0.b.f10509e : d0.b.b(0, k().f10511b, 0, 0);
            }
            if (i10 == 2) {
                if (z10) {
                    d0.b bVarW = w();
                    d0.b bVarI = i();
                    return d0.b.b(Math.max(bVarW.f10510a, bVarI.f10510a), 0, Math.max(bVarW.f10512c, bVarI.f10512c), Math.max(bVarW.f10513d, bVarI.f10513d));
                }
                if ((this.f20828h & 2) != 0) {
                    return d0.b.f10509e;
                }
                d0.b bVarK = k();
                i1 i1Var = this.f20826f;
                bVarG = i1Var != null ? i1Var.g() : null;
                int iMin = bVarK.f10513d;
                if (bVarG != null) {
                    iMin = Math.min(iMin, bVarG.f10513d);
                }
                return d0.b.b(bVarK.f10510a, 0, bVarK.f10512c, iMin);
            }
            if (i10 != 8) {
                if (i10 == 16) {
                    return j();
                }
                if (i10 == 32) {
                    return h();
                }
                if (i10 == 64) {
                    return l();
                }
                if (i10 != 128) {
                    return d0.b.f10509e;
                }
                i1 i1Var2 = this.f20826f;
                m0.j jVarE = i1Var2 != null ? i1Var2.e() : f();
                return jVarE != null ? d0.b.b(jVarE.b(), jVarE.d(), jVarE.c(), jVarE.a()) : d0.b.f10509e;
            }
            d0.b[] bVarArr = this.f20824d;
            bVarG = bVarArr != null ? bVarArr[q.b(8)] : null;
            if (bVarG != null) {
                return bVarG;
            }
            d0.b bVarK2 = k();
            d0.b bVarW2 = w();
            int i12 = bVarK2.f10513d;
            if (i12 > bVarW2.f10513d) {
                return d0.b.b(0, 0, 0, i12);
            }
            d0.b bVar = this.f20827g;
            return (bVar == null || bVar.equals(d0.b.f10509e) || (i11 = this.f20827g.f10513d) <= bVarW2.f10513d) ? d0.b.f10509e : d0.b.b(0, 0, 0, i11);
        }

        i(i1 i1Var, i iVar) {
            this(i1Var, new WindowInsets(iVar.f20823c));
        }
    }

    private static class l extends k {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private d0.b f20830o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private d0.b f20831p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private d0.b f20832q;

        l(i1 i1Var, WindowInsets windowInsets) {
            super(i1Var, windowInsets);
            this.f20830o = null;
            this.f20831p = null;
            this.f20832q = null;
        }

        @Override // m0.i1.p
        d0.b h() {
            if (this.f20831p == null) {
                this.f20831p = d0.b.d(this.f20823c.getMandatorySystemGestureInsets());
            }
            return this.f20831p;
        }

        @Override // m0.i1.p
        d0.b j() {
            if (this.f20830o == null) {
                this.f20830o = d0.b.d(this.f20823c.getSystemGestureInsets());
            }
            return this.f20830o;
        }

        @Override // m0.i1.p
        d0.b l() {
            if (this.f20832q == null) {
                this.f20832q = d0.b.d(this.f20823c.getTappableElementInsets());
            }
            return this.f20832q;
        }

        @Override // m0.i1.i, m0.i1.p
        i1 m(int i10, int i11, int i12, int i13) {
            return i1.w(this.f20823c.inset(i10, i11, i12, i13));
        }

        l(i1 i1Var, l lVar) {
            super(i1Var, lVar);
            this.f20830o = null;
            this.f20831p = null;
            this.f20832q = null;
        }

        @Override // m0.i1.j, m0.i1.p
        public void s(d0.b bVar) {
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final h f20808a;

        public b() {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 34) {
                this.f20808a = new g();
                return;
            }
            if (i10 >= 31) {
                this.f20808a = new f();
                return;
            }
            if (i10 >= 30) {
                this.f20808a = new e();
            } else if (i10 >= 29) {
                this.f20808a = new d();
            } else {
                this.f20808a = new c();
            }
        }

        public i1 a() {
            return this.f20808a.b();
        }

        public b b(int i10, d0.b bVar) {
            this.f20808a.c(i10, bVar);
            return this;
        }

        public b c(d0.b bVar) {
            this.f20808a.e(bVar);
            return this;
        }

        public b d(d0.b bVar) {
            this.f20808a.g(bVar);
            return this;
        }

        public b(i1 i1Var) {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 34) {
                this.f20808a = new g(i1Var);
                return;
            }
            if (i10 >= 31) {
                this.f20808a = new f(i1Var);
                return;
            }
            if (i10 >= 30) {
                this.f20808a = new e(i1Var);
            } else if (i10 >= 29) {
                this.f20808a = new d(i1Var);
            } else {
                this.f20808a = new c(i1Var);
            }
        }
    }

    public i1(i1 i1Var) {
        if (i1Var != null) {
            p pVar = i1Var.f20803a;
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 34 && (pVar instanceof o)) {
                this.f20803a = new o(this, (o) pVar);
            } else if (i10 >= 31 && (pVar instanceof n)) {
                this.f20803a = new n(this, (n) pVar);
            } else if (i10 >= 30 && (pVar instanceof m)) {
                this.f20803a = new m(this, (m) pVar);
            } else if (i10 >= 29 && (pVar instanceof l)) {
                this.f20803a = new l(this, (l) pVar);
            } else if (i10 >= 28 && (pVar instanceof k)) {
                this.f20803a = new k(this, (k) pVar);
            } else if (pVar instanceof j) {
                this.f20803a = new j(this, (j) pVar);
            } else if (pVar instanceof i) {
                this.f20803a = new i(this, (i) pVar);
            } else {
                this.f20803a = new p(this);
            }
            pVar.e(this);
            return;
        }
        this.f20803a = new p(this);
    }

    private static class p {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final i1 f20835b = new b().a().a().b().c();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final i1 f20836a;

        p(i1 i1Var) {
            this.f20836a = i1Var;
        }

        i1 a() {
            return this.f20836a;
        }

        i1 b() {
            return this.f20836a;
        }

        i1 c() {
            return this.f20836a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof p)) {
                return false;
            }
            p pVar = (p) obj;
            return o() == pVar.o() && n() == pVar.n() && l0.b.a(k(), pVar.k()) && l0.b.a(i(), pVar.i()) && l0.b.a(f(), pVar.f());
        }

        m0.j f() {
            return null;
        }

        d0.b g(int i10) {
            return d0.b.f10509e;
        }

        d0.b h() {
            return k();
        }

        public int hashCode() {
            return l0.b.b(Boolean.valueOf(o()), Boolean.valueOf(n()), k(), i(), f());
        }

        d0.b i() {
            return d0.b.f10509e;
        }

        d0.b j() {
            return k();
        }

        d0.b k() {
            return d0.b.f10509e;
        }

        d0.b l() {
            return k();
        }

        i1 m(int i10, int i11, int i12, int i13) {
            return f20835b;
        }

        boolean n() {
            return false;
        }

        boolean o() {
            return false;
        }

        void d(View view) {
        }

        void e(i1 i1Var) {
        }

        public void p(d0.b[] bVarArr) {
        }

        void q(d0.b bVar) {
        }

        void r(i1 i1Var) {
        }

        public void s(d0.b bVar) {
        }

        void t(int i10) {
        }
    }
}
