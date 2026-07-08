package androidx.appcompat.app;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.os.PowerManager;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.app.b;
import androidx.appcompat.view.b;
import androidx.appcompat.view.f;
import androidx.appcompat.view.menu.h;
import androidx.appcompat.view.menu.n;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.AppCompatDrawableManager;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.DecorContentParent;
import androidx.appcompat.widget.TintTypedArray;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.VectorEnabledTintResources;
import androidx.appcompat.widget.ViewStubCompat;
import androidx.appcompat.widget.ViewUtils;
import androidx.lifecycle.m;
import c0.k;
import j$.util.Objects;
import java.util.List;
import java.util.Locale;
import m0.a1;
import m0.b0;
import m0.i1;
import m0.m;
import m0.o0;
import m0.y0;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: loaded from: classes.dex */
class j extends androidx.appcompat.app.h implements h.a, LayoutInflater.Factory2 {

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    private static final androidx.collection.i f864s0 = new androidx.collection.i();

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    private static final boolean f865t0 = false;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    private static final int[] f866u0 = {R.attr.windowBackground};

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    private static final boolean f867v0 = !"robolectric".equals(Build.FINGERPRINT);
    private DecorContentParent A;
    private h B;
    private t C;
    androidx.appcompat.view.b D;
    ActionBarContextView E;
    PopupWindow F;
    Runnable G;
    y0 H;
    private boolean I;
    private boolean J;
    ViewGroup K;
    private TextView L;
    private View M;
    private boolean N;
    private boolean O;
    boolean P;
    boolean Q;
    boolean R;
    boolean S;
    boolean T;
    private boolean U;
    private s[] V;
    private s W;
    private boolean X;
    private boolean Y;
    private boolean Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    boolean f868a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private Configuration f869b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private int f870c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private int f871d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private int f872e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    private boolean f873f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    private p f874g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    private p f875h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    boolean f876i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    int f877j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    private final Runnable f878k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    private boolean f879l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    private Rect f880m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    private Rect f881n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    private androidx.appcompat.app.r f882o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private androidx.appcompat.app.s f883p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    private OnBackInvokedDispatcher f884q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    private OnBackInvokedCallback f885r0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    final Object f886s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    final Context f887t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    Window f888u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private n f889v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    final androidx.appcompat.app.e f890w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    androidx.appcompat.app.a f891x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    MenuInflater f892y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private CharSequence f893z;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            j jVar = j.this;
            if ((jVar.f877j0 & 1) != 0) {
                jVar.n0(0);
            }
            j jVar2 = j.this;
            if ((jVar2.f877j0 & 4096) != 0) {
                jVar2.n0(108);
            }
            j jVar3 = j.this;
            jVar3.f876i0 = false;
            jVar3.f877j0 = 0;
        }
    }

    class b implements b0 {
        b() {
        }

        @Override // m0.b0
        public i1 a(View view, i1 i1Var) {
            int iL = i1Var.l();
            int iJ1 = j.this.j1(i1Var, null);
            if (iL != iJ1) {
                i1Var = i1Var.p(i1Var.j(), iJ1, i1Var.k(), i1Var.i());
            }
            return o0.Y(view, i1Var);
        }
    }

    class c implements ContentFrameLayout.OnAttachListener {
        c() {
        }

        @Override // androidx.appcompat.widget.ContentFrameLayout.OnAttachListener
        public void onAttachedFromWindow() {
        }

        @Override // androidx.appcompat.widget.ContentFrameLayout.OnAttachListener
        public void onDetachedFromWindow() {
            j.this.l0();
        }
    }

    class d implements Runnable {

        class a extends a1 {
            a() {
            }

            @Override // m0.z0
            public void onAnimationEnd(View view) {
                j.this.E.setAlpha(1.0f);
                j.this.H.g(null);
                j.this.H = null;
            }

            @Override // m0.a1, m0.z0
            public void onAnimationStart(View view) {
                j.this.E.setVisibility(0);
            }
        }

        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            j jVar = j.this;
            jVar.F.showAtLocation(jVar.E, 55, 0, 0);
            j.this.o0();
            if (!j.this.Z0()) {
                j.this.E.setAlpha(1.0f);
                j.this.E.setVisibility(0);
            } else {
                j.this.E.setAlpha(0.0f);
                j jVar2 = j.this;
                jVar2.H = o0.e(jVar2.E).b(1.0f);
                j.this.H.g(new a());
            }
        }
    }

    class e extends a1 {
        e() {
        }

        @Override // m0.z0
        public void onAnimationEnd(View view) {
            j.this.E.setAlpha(1.0f);
            j.this.H.g(null);
            j.this.H = null;
        }

        @Override // m0.a1, m0.z0
        public void onAnimationStart(View view) {
            j.this.E.setVisibility(0);
            if (j.this.E.getParent() instanceof View) {
                o0.j0((View) j.this.E.getParent());
            }
        }
    }

    private class f implements b.InterfaceC0016b {
        f() {
        }

        @Override // androidx.appcompat.app.b.InterfaceC0016b
        public boolean a() {
            androidx.appcompat.app.a aVarV = j.this.v();
            return (aVarV == null || (aVarV.d() & 4) == 0) ? false : true;
        }

        @Override // androidx.appcompat.app.b.InterfaceC0016b
        public Context b() {
            return j.this.t0();
        }

        @Override // androidx.appcompat.app.b.InterfaceC0016b
        public void c(Drawable drawable, int i10) {
            androidx.appcompat.app.a aVarV = j.this.v();
            if (aVarV != null) {
                aVarV.s(drawable);
                aVarV.q(i10);
            }
        }

        @Override // androidx.appcompat.app.b.InterfaceC0016b
        public Drawable d() {
            TintTypedArray tintTypedArrayObtainStyledAttributes = TintTypedArray.obtainStyledAttributes(b(), (AttributeSet) null, new int[]{h.a.f14743c0});
            Drawable drawable = tintTypedArrayObtainStyledAttributes.getDrawable(0);
            tintTypedArrayObtainStyledAttributes.recycle();
            return drawable;
        }

        @Override // androidx.appcompat.app.b.InterfaceC0016b
        public void e(int i10) {
            androidx.appcompat.app.a aVarV = j.this.v();
            if (aVarV != null) {
                aVarV.q(i10);
            }
        }
    }

    interface g {
        boolean a(int i10);

        View onCreatePanelView(int i10);
    }

    private final class h implements n.a {
        h() {
        }

        @Override // androidx.appcompat.view.menu.n.a
        public void onCloseMenu(androidx.appcompat.view.menu.h hVar, boolean z10) {
            j.this.e0(hVar);
        }

        @Override // androidx.appcompat.view.menu.n.a
        public boolean onOpenSubMenu(androidx.appcompat.view.menu.h hVar) {
            Window.Callback callbackA0 = j.this.A0();
            if (callbackA0 == null) {
                return true;
            }
            callbackA0.onMenuOpened(108, hVar);
            return true;
        }
    }

    class i implements b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private b.a f902a;

        class a extends a1 {
            a() {
            }

            @Override // m0.z0
            public void onAnimationEnd(View view) {
                j.this.E.setVisibility(8);
                j jVar = j.this;
                PopupWindow popupWindow = jVar.F;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (jVar.E.getParent() instanceof View) {
                    o0.j0((View) j.this.E.getParent());
                }
                j.this.E.killMode();
                j.this.H.g(null);
                j jVar2 = j.this;
                jVar2.H = null;
                o0.j0(jVar2.K);
            }
        }

        public i(b.a aVar) {
            this.f902a = aVar;
        }

        @Override // androidx.appcompat.view.b.a
        public void a(androidx.appcompat.view.b bVar) {
            this.f902a.a(bVar);
            j jVar = j.this;
            if (jVar.F != null) {
                jVar.f888u.getDecorView().removeCallbacks(j.this.G);
            }
            j jVar2 = j.this;
            if (jVar2.E != null) {
                jVar2.o0();
                j jVar3 = j.this;
                jVar3.H = o0.e(jVar3.E).b(0.0f);
                j.this.H.g(new a());
            }
            j jVar4 = j.this;
            androidx.appcompat.app.e eVar = jVar4.f890w;
            if (eVar != null) {
                eVar.g(jVar4.D);
            }
            j jVar5 = j.this;
            jVar5.D = null;
            o0.j0(jVar5.K);
            j.this.h1();
        }

        @Override // androidx.appcompat.view.b.a
        public boolean b(androidx.appcompat.view.b bVar, Menu menu) {
            return this.f902a.b(bVar, menu);
        }

        @Override // androidx.appcompat.view.b.a
        public boolean c(androidx.appcompat.view.b bVar, Menu menu) {
            o0.j0(j.this.K);
            return this.f902a.c(bVar, menu);
        }

        @Override // androidx.appcompat.view.b.a
        public boolean d(androidx.appcompat.view.b bVar, MenuItem menuItem) {
            return this.f902a.d(bVar, menuItem);
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.app.j$j, reason: collision with other inner class name */
    static class C0017j {
        static boolean a(PowerManager powerManager) {
            return powerManager.isPowerSaveMode();
        }

        static String b(Locale locale) {
            return locale.toLanguageTag();
        }
    }

    static class k {
        static void a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
            LocaleList locales = configuration.getLocales();
            LocaleList locales2 = configuration2.getLocales();
            if (locales.equals(locales2)) {
                return;
            }
            configuration3.setLocales(locales2);
            configuration3.locale = configuration2.locale;
        }

        static i0.f b(Configuration configuration) {
            return i0.f.c(configuration.getLocales().toLanguageTags());
        }

        public static void c(i0.f fVar) {
            LocaleList.setDefault(LocaleList.forLanguageTags(fVar.h()));
        }

        static void d(Configuration configuration, i0.f fVar) {
            configuration.setLocales(LocaleList.forLanguageTags(fVar.h()));
        }
    }

    static class l {
        static void a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
            int i10 = configuration.colorMode & 3;
            int i11 = configuration2.colorMode;
            if (i10 != (i11 & 3)) {
                configuration3.colorMode |= i11 & 3;
            }
            int i12 = configuration.colorMode & 12;
            int i13 = configuration2.colorMode;
            if (i12 != (i13 & 12)) {
                configuration3.colorMode |= i13 & 12;
            }
        }
    }

    static class m {
        static OnBackInvokedDispatcher a(Activity activity) {
            return activity.getOnBackInvokedDispatcher();
        }

        static OnBackInvokedCallback b(Object obj, final j jVar) {
            Objects.requireNonNull(jVar);
            OnBackInvokedCallback onBackInvokedCallback = new OnBackInvokedCallback() { // from class: androidx.appcompat.app.o
                @Override // android.window.OnBackInvokedCallback
                public final void onBackInvoked() {
                    jVar.I0();
                }
            };
            androidx.appcompat.app.n.a(obj).registerOnBackInvokedCallback(1000000, onBackInvokedCallback);
            return onBackInvokedCallback;
        }

        static void c(Object obj, Object obj2) {
            androidx.appcompat.app.n.a(obj).unregisterOnBackInvokedCallback(androidx.appcompat.app.m.a(obj2));
        }
    }

    private class o extends p {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final PowerManager f910c;

        o(Context context) {
            super();
            this.f910c = (PowerManager) context.getApplicationContext().getSystemService("power");
        }

        @Override // androidx.appcompat.app.j.p
        IntentFilter b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
            return intentFilter;
        }

        @Override // androidx.appcompat.app.j.p
        public int c() {
            return C0017j.a(this.f910c) ? 2 : 1;
        }

        @Override // androidx.appcompat.app.j.p
        public void d() {
            j.this.Y();
        }
    }

    abstract class p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private BroadcastReceiver f912a;

        class a extends BroadcastReceiver {
            a() {
            }

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                p.this.d();
            }
        }

        p() {
        }

        void a() {
            BroadcastReceiver broadcastReceiver = this.f912a;
            if (broadcastReceiver != null) {
                try {
                    j.this.f887t.unregisterReceiver(broadcastReceiver);
                } catch (IllegalArgumentException unused) {
                }
                this.f912a = null;
            }
        }

        abstract IntentFilter b();

        abstract int c();

        abstract void d();

        void e() {
            a();
            IntentFilter intentFilterB = b();
            if (intentFilterB == null || intentFilterB.countActions() == 0) {
                return;
            }
            if (this.f912a == null) {
                this.f912a = new a();
            }
            j.this.f887t.registerReceiver(this.f912a, intentFilterB);
        }
    }

    private class q extends p {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final x f915c;

        q(x xVar) {
            super();
            this.f915c = xVar;
        }

        @Override // androidx.appcompat.app.j.p
        IntentFilter b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.TIME_SET");
            intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
            intentFilter.addAction("android.intent.action.TIME_TICK");
            return intentFilter;
        }

        @Override // androidx.appcompat.app.j.p
        public int c() {
            return this.f915c.d() ? 2 : 1;
        }

        @Override // androidx.appcompat.app.j.p
        public void d() {
            j.this.Y();
        }
    }

    private class r extends ContentFrameLayout {
        public r(Context context) {
            super(context);
        }

        private boolean a(int i10, int i11) {
            return i10 < -5 || i11 < -5 || i10 > getWidth() + 5 || i11 > getHeight() + 5;
        }

        @Override // android.view.ViewGroup, android.view.View
        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return j.this.m0(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        @Override // android.view.ViewGroup
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getAction() != 0 || !a((int) motionEvent.getX(), (int) motionEvent.getY())) {
                return super.onInterceptTouchEvent(motionEvent);
            }
            j.this.g0(0);
            return true;
        }

        @Override // android.view.View
        public void setBackgroundResource(int i10) {
            setBackgroundDrawable(i.a.b(getContext(), i10));
        }
    }

    protected static final class s {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f918a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f919b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f920c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f921d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f922e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f923f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        ViewGroup f924g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        View f925h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        View f926i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        androidx.appcompat.view.menu.h f927j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        androidx.appcompat.view.menu.f f928k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Context f929l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        boolean f930m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        boolean f931n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        boolean f932o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public boolean f933p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        boolean f934q = false;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        boolean f935r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        Bundle f936s;

        s(int i10) {
            this.f918a = i10;
        }

        androidx.appcompat.view.menu.o a(n.a aVar) {
            if (this.f927j == null) {
                return null;
            }
            if (this.f928k == null) {
                androidx.appcompat.view.menu.f fVar = new androidx.appcompat.view.menu.f(this.f929l, h.g.f14877l);
                this.f928k = fVar;
                fVar.setCallback(aVar);
                this.f927j.b(this.f928k);
            }
            return this.f928k.b(this.f924g);
        }

        public boolean b() {
            if (this.f925h == null) {
                return false;
            }
            return this.f926i != null || this.f928k.a().getCount() > 0;
        }

        void c(androidx.appcompat.view.menu.h hVar) {
            androidx.appcompat.view.menu.f fVar;
            androidx.appcompat.view.menu.h hVar2 = this.f927j;
            if (hVar == hVar2) {
                return;
            }
            if (hVar2 != null) {
                hVar2.R(this.f928k);
            }
            this.f927j = hVar;
            if (hVar == null || (fVar = this.f928k) == null) {
                return;
            }
            hVar.b(fVar);
        }

        void d(Context context) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme themeNewTheme = context.getResources().newTheme();
            themeNewTheme.setTo(context.getTheme());
            themeNewTheme.resolveAttribute(h.a.f14738a, typedValue, true);
            int i10 = typedValue.resourceId;
            if (i10 != 0) {
                themeNewTheme.applyStyle(i10, true);
            }
            themeNewTheme.resolveAttribute(h.a.f14765n0, typedValue, true);
            int i11 = typedValue.resourceId;
            if (i11 != 0) {
                themeNewTheme.applyStyle(i11, true);
            } else {
                themeNewTheme.applyStyle(h.i.f14909d, true);
            }
            androidx.appcompat.view.d dVar = new androidx.appcompat.view.d(context, 0);
            dVar.getTheme().setTo(themeNewTheme);
            this.f929l = dVar;
            TypedArray typedArrayObtainStyledAttributes = dVar.obtainStyledAttributes(h.j.A0);
            this.f919b = typedArrayObtainStyledAttributes.getResourceId(h.j.D0, 0);
            this.f923f = typedArrayObtainStyledAttributes.getResourceId(h.j.C0, 0);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    private final class t implements n.a {
        t() {
        }

        @Override // androidx.appcompat.view.menu.n.a
        public void onCloseMenu(androidx.appcompat.view.menu.h hVar, boolean z10) {
            androidx.appcompat.view.menu.h hVarF = hVar.F();
            boolean z11 = hVarF != hVar;
            j jVar = j.this;
            if (z11) {
                hVar = hVarF;
            }
            s sVarR0 = jVar.r0(hVar);
            if (sVarR0 != null) {
                if (!z11) {
                    j.this.h0(sVarR0, z10);
                } else {
                    j.this.d0(sVarR0.f918a, sVarR0, hVarF);
                    j.this.h0(sVarR0, true);
                }
            }
        }

        @Override // androidx.appcompat.view.menu.n.a
        public boolean onOpenSubMenu(androidx.appcompat.view.menu.h hVar) {
            Window.Callback callbackA0;
            if (hVar != hVar.F()) {
                return true;
            }
            j jVar = j.this;
            if (!jVar.P || (callbackA0 = jVar.A0()) == null || j.this.f868a0) {
                return true;
            }
            callbackA0.onMenuOpened(108, hVar);
            return true;
        }
    }

    j(Activity activity, androidx.appcompat.app.e eVar) {
        this(activity, null, eVar, activity);
    }

    private void B0() {
        p0();
        if (this.P && this.f891x == null) {
            Object obj = this.f886s;
            if (obj instanceof Activity) {
                this.f891x = new y((Activity) this.f886s, this.Q);
            } else if (obj instanceof Dialog) {
                this.f891x = new y((Dialog) this.f886s);
            }
            androidx.appcompat.app.a aVar = this.f891x;
            if (aVar != null) {
                aVar.n(this.f879l0);
            }
        }
    }

    private boolean C0(s sVar) {
        View view = sVar.f926i;
        if (view != null) {
            sVar.f925h = view;
            return true;
        }
        if (sVar.f927j == null) {
            return false;
        }
        if (this.C == null) {
            this.C = new t();
        }
        View view2 = (View) sVar.a(this.C);
        sVar.f925h = view2;
        return view2 != null;
    }

    private boolean D0(s sVar) {
        sVar.d(t0());
        sVar.f924g = new r(sVar.f929l);
        sVar.f920c = 81;
        return true;
    }

    private boolean E0(s sVar) {
        Resources.Theme themeNewTheme;
        Context context = this.f887t;
        int i10 = sVar.f918a;
        if ((i10 == 0 || i10 == 108) && this.A != null) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme theme = context.getTheme();
            theme.resolveAttribute(h.a.f14748f, typedValue, true);
            if (typedValue.resourceId != 0) {
                themeNewTheme = context.getResources().newTheme();
                themeNewTheme.setTo(theme);
                themeNewTheme.applyStyle(typedValue.resourceId, true);
                themeNewTheme.resolveAttribute(h.a.f14750g, typedValue, true);
            } else {
                theme.resolveAttribute(h.a.f14750g, typedValue, true);
                themeNewTheme = null;
            }
            if (typedValue.resourceId != 0) {
                if (themeNewTheme == null) {
                    themeNewTheme = context.getResources().newTheme();
                    themeNewTheme.setTo(theme);
                }
                themeNewTheme.applyStyle(typedValue.resourceId, true);
            }
            if (themeNewTheme != null) {
                androidx.appcompat.view.d dVar = new androidx.appcompat.view.d(context, 0);
                dVar.getTheme().setTo(themeNewTheme);
                context = dVar;
            }
        }
        androidx.appcompat.view.menu.h hVar = new androidx.appcompat.view.menu.h(context);
        hVar.W(this);
        sVar.c(hVar);
        return true;
    }

    private void F0(int i10) {
        this.f877j0 = (1 << i10) | this.f877j0;
        if (this.f876i0) {
            return;
        }
        o0.e0(this.f888u.getDecorView(), this.f878k0);
        this.f876i0 = true;
    }

    private boolean K0(int i10, KeyEvent keyEvent) {
        if (keyEvent.getRepeatCount() != 0) {
            return false;
        }
        s sVarY0 = y0(i10, true);
        if (sVarY0.f932o) {
            return false;
        }
        return U0(sVarY0, keyEvent);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean N0(int r5, android.view.KeyEvent r6) {
        /*
            r4 = this;
            androidx.appcompat.view.b r0 = r4.D
            r1 = 0
            if (r0 == 0) goto L6
            return r1
        L6:
            r0 = 1
            androidx.appcompat.app.j$s r2 = r4.y0(r5, r0)
            if (r5 != 0) goto L43
            androidx.appcompat.widget.DecorContentParent r5 = r4.A
            if (r5 == 0) goto L43
            boolean r5 = r5.canShowOverflowMenu()
            if (r5 == 0) goto L43
            android.content.Context r5 = r4.f887t
            android.view.ViewConfiguration r5 = android.view.ViewConfiguration.get(r5)
            boolean r5 = r5.hasPermanentMenuKey()
            if (r5 != 0) goto L43
            androidx.appcompat.widget.DecorContentParent r5 = r4.A
            boolean r5 = r5.isOverflowMenuShowing()
            if (r5 != 0) goto L3c
            boolean r5 = r4.f868a0
            if (r5 != 0) goto L62
            boolean r5 = r4.U0(r2, r6)
            if (r5 == 0) goto L62
            androidx.appcompat.widget.DecorContentParent r5 = r4.A
            boolean r0 = r5.showOverflowMenu()
            goto L68
        L3c:
            androidx.appcompat.widget.DecorContentParent r5 = r4.A
            boolean r0 = r5.hideOverflowMenu()
            goto L68
        L43:
            boolean r5 = r2.f932o
            if (r5 != 0) goto L64
            boolean r3 = r2.f931n
            if (r3 == 0) goto L4c
            goto L64
        L4c:
            boolean r5 = r2.f930m
            if (r5 == 0) goto L62
            boolean r5 = r2.f935r
            if (r5 == 0) goto L5b
            r2.f930m = r1
            boolean r5 = r4.U0(r2, r6)
            goto L5c
        L5b:
            r5 = 1
        L5c:
            if (r5 == 0) goto L62
            r4.R0(r2, r6)
            goto L68
        L62:
            r0 = 0
            goto L68
        L64:
            r4.h0(r2, r0)
            r0 = r5
        L68:
            if (r0 == 0) goto L85
            android.content.Context r5 = r4.f887t
            android.content.Context r5 = r5.getApplicationContext()
            java.lang.String r6 = "audio"
            java.lang.Object r5 = r5.getSystemService(r6)
            android.media.AudioManager r5 = (android.media.AudioManager) r5
            if (r5 == 0) goto L7e
            r5.playSoundEffect(r1)
            return r0
        L7e:
            java.lang.String r5 = "AppCompatDelegate"
            java.lang.String r6 = "Couldn't get audio manager"
            android.util.Log.w(r5, r6)
        L85:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.j.N0(int, android.view.KeyEvent):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void R0(androidx.appcompat.app.j.s r12, android.view.KeyEvent r13) {
        /*
            Method dump skipped, instruction units count: 246
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.j.R0(androidx.appcompat.app.j$s, android.view.KeyEvent):void");
    }

    private boolean T0(s sVar, int i10, KeyEvent keyEvent, int i11) {
        androidx.appcompat.view.menu.h hVar;
        boolean zPerformShortcut = false;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((sVar.f930m || U0(sVar, keyEvent)) && (hVar = sVar.f927j) != null) {
            zPerformShortcut = hVar.performShortcut(i10, keyEvent, i11);
        }
        if (zPerformShortcut && (i11 & 1) == 0 && this.A == null) {
            h0(sVar, true);
        }
        return zPerformShortcut;
    }

    private boolean U0(s sVar, KeyEvent keyEvent) {
        DecorContentParent decorContentParent;
        DecorContentParent decorContentParent2;
        DecorContentParent decorContentParent3;
        if (this.f868a0) {
            return false;
        }
        if (sVar.f930m) {
            return true;
        }
        s sVar2 = this.W;
        if (sVar2 != null && sVar2 != sVar) {
            h0(sVar2, false);
        }
        Window.Callback callbackA0 = A0();
        if (callbackA0 != null) {
            sVar.f926i = callbackA0.onCreatePanelView(sVar.f918a);
        }
        int i10 = sVar.f918a;
        boolean z10 = i10 == 0 || i10 == 108;
        if (z10 && (decorContentParent3 = this.A) != null) {
            decorContentParent3.setMenuPrepared();
        }
        if (sVar.f926i == null && (!z10 || !(S0() instanceof v))) {
            androidx.appcompat.view.menu.h hVar = sVar.f927j;
            if (hVar == null || sVar.f935r) {
                if (hVar == null && (!E0(sVar) || sVar.f927j == null)) {
                    return false;
                }
                if (z10 && this.A != null) {
                    if (this.B == null) {
                        this.B = new h();
                    }
                    this.A.setMenu(sVar.f927j, this.B);
                }
                sVar.f927j.i0();
                if (!callbackA0.onCreatePanelMenu(sVar.f918a, sVar.f927j)) {
                    sVar.c(null);
                    if (z10 && (decorContentParent = this.A) != null) {
                        decorContentParent.setMenu(null, this.B);
                    }
                    return false;
                }
                sVar.f935r = false;
            }
            sVar.f927j.i0();
            Bundle bundle = sVar.f936s;
            if (bundle != null) {
                sVar.f927j.S(bundle);
                sVar.f936s = null;
            }
            if (!callbackA0.onPreparePanel(0, sVar.f926i, sVar.f927j)) {
                if (z10 && (decorContentParent2 = this.A) != null) {
                    decorContentParent2.setMenu(null, this.B);
                }
                sVar.f927j.h0();
                return false;
            }
            boolean z11 = KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1;
            sVar.f933p = z11;
            sVar.f927j.setQwertyMode(z11);
            sVar.f927j.h0();
        }
        sVar.f930m = true;
        sVar.f931n = false;
        this.W = sVar;
        return true;
    }

    private void V0(boolean z10) {
        DecorContentParent decorContentParent = this.A;
        if (decorContentParent == null || !decorContentParent.canShowOverflowMenu() || (ViewConfiguration.get(this.f887t).hasPermanentMenuKey() && !this.A.isOverflowMenuShowPending())) {
            s sVarY0 = y0(0, true);
            sVarY0.f934q = true;
            h0(sVarY0, false);
            R0(sVarY0, null);
            return;
        }
        Window.Callback callbackA0 = A0();
        if (this.A.isOverflowMenuShowing() && z10) {
            this.A.hideOverflowMenu();
            if (this.f868a0) {
                return;
            }
            callbackA0.onPanelClosed(108, y0(0, true).f927j);
            return;
        }
        if (callbackA0 == null || this.f868a0) {
            return;
        }
        if (this.f876i0 && (this.f877j0 & 1) != 0) {
            this.f888u.getDecorView().removeCallbacks(this.f878k0);
            this.f878k0.run();
        }
        s sVarY02 = y0(0, true);
        androidx.appcompat.view.menu.h hVar = sVarY02.f927j;
        if (hVar == null || sVarY02.f935r || !callbackA0.onPreparePanel(0, sVarY02.f926i, hVar)) {
            return;
        }
        callbackA0.onMenuOpened(108, sVarY02.f927j);
        this.A.showOverflowMenu();
    }

    private boolean W(boolean z10) {
        return X(z10, true);
    }

    private int W0(int i10) {
        if (i10 == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            return 108;
        }
        if (i10 != 9) {
            return i10;
        }
        Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
        return 109;
    }

    private boolean X(boolean z10, boolean z11) {
        if (this.f868a0) {
            return false;
        }
        int iC0 = c0();
        int iH0 = H0(this.f887t, iC0);
        i0.f fVarB0 = Build.VERSION.SDK_INT < 33 ? b0(this.f887t) : null;
        if (!z11 && fVarB0 != null) {
            fVarB0 = x0(this.f887t.getResources().getConfiguration());
        }
        boolean zG1 = g1(iH0, fVarB0, z10);
        if (iC0 == 0) {
            w0(this.f887t).e();
        } else {
            p pVar = this.f874g0;
            if (pVar != null) {
                pVar.a();
            }
        }
        if (iC0 == 3) {
            v0(this.f887t).e();
            return zG1;
        }
        p pVar2 = this.f875h0;
        if (pVar2 != null) {
            pVar2.a();
        }
        return zG1;
    }

    private void Z() {
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) this.K.findViewById(R.id.content);
        View decorView = this.f888u.getDecorView();
        contentFrameLayout.setDecorPadding(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        TypedArray typedArrayObtainStyledAttributes = this.f887t.obtainStyledAttributes(h.j.A0);
        typedArrayObtainStyledAttributes.getValue(h.j.M0, contentFrameLayout.getMinWidthMajor());
        typedArrayObtainStyledAttributes.getValue(h.j.N0, contentFrameLayout.getMinWidthMinor());
        int i10 = h.j.K0;
        if (typedArrayObtainStyledAttributes.hasValue(i10)) {
            typedArrayObtainStyledAttributes.getValue(i10, contentFrameLayout.getFixedWidthMajor());
        }
        int i11 = h.j.L0;
        if (typedArrayObtainStyledAttributes.hasValue(i11)) {
            typedArrayObtainStyledAttributes.getValue(i11, contentFrameLayout.getFixedWidthMinor());
        }
        int i12 = h.j.I0;
        if (typedArrayObtainStyledAttributes.hasValue(i12)) {
            typedArrayObtainStyledAttributes.getValue(i12, contentFrameLayout.getFixedHeightMajor());
        }
        int i13 = h.j.J0;
        if (typedArrayObtainStyledAttributes.hasValue(i13)) {
            typedArrayObtainStyledAttributes.getValue(i13, contentFrameLayout.getFixedHeightMinor());
        }
        typedArrayObtainStyledAttributes.recycle();
        contentFrameLayout.requestLayout();
    }

    private void a0(Window window) {
        if (this.f888u != null) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        Window.Callback callback = window.getCallback();
        if (callback instanceof n) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        n nVar = new n(callback);
        this.f889v = nVar;
        window.setCallback(nVar);
        TintTypedArray tintTypedArrayObtainStyledAttributes = TintTypedArray.obtainStyledAttributes(this.f887t, (AttributeSet) null, f866u0);
        Drawable drawableIfKnown = tintTypedArrayObtainStyledAttributes.getDrawableIfKnown(0);
        if (drawableIfKnown != null) {
            window.setBackgroundDrawable(drawableIfKnown);
        }
        tintTypedArrayObtainStyledAttributes.recycle();
        this.f888u = window;
        if (Build.VERSION.SDK_INT < 33 || this.f884q0 != null) {
            return;
        }
        P(null);
    }

    private boolean a1(ViewParent viewParent) {
        if (viewParent == null) {
            return false;
        }
        View decorView = this.f888u.getDecorView();
        while (viewParent != null) {
            if (viewParent == decorView || !(viewParent instanceof View) || ((View) viewParent).isAttachedToWindow()) {
                return false;
            }
            viewParent = viewParent.getParent();
        }
        return true;
    }

    private int c0() {
        int i10 = this.f870c0;
        return i10 != -100 ? i10 : androidx.appcompat.app.h.o();
    }

    private void d1() {
        if (this.J) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    private androidx.appcompat.app.d e1() {
        for (Context baseContext = this.f887t; baseContext != null; baseContext = ((ContextWrapper) baseContext).getBaseContext()) {
            if (baseContext instanceof androidx.appcompat.app.d) {
                return (androidx.appcompat.app.d) baseContext;
            }
            if (!(baseContext instanceof ContextWrapper)) {
                break;
            }
        }
        return null;
    }

    private void f0() {
        p pVar = this.f874g0;
        if (pVar != null) {
            pVar.a();
        }
        p pVar2 = this.f875h0;
        if (pVar2 != null) {
            pVar2.a();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void f1(Configuration configuration) {
        Activity activity = (Activity) this.f886s;
        if (activity instanceof androidx.lifecycle.t) {
            if (((androidx.lifecycle.t) activity).S0().b().d(m.b.f2653c)) {
                activity.onConfigurationChanged(configuration);
            }
        } else {
            if (!this.Z || this.f868a0) {
                return;
            }
            activity.onConfigurationChanged(configuration);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x008c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean g1(int r11, i0.f r12, boolean r13) {
        /*
            Method dump skipped, instruction units count: 203
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.j.g1(int, i0.f, boolean):boolean");
    }

    private Configuration i0(Context context, int i10, i0.f fVar, Configuration configuration, boolean z10) {
        int i11 = i10 != 1 ? i10 != 2 ? z10 ? 0 : context.getApplicationContext().getResources().getConfiguration().uiMode & 48 : 32 : 16;
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i11 | (configuration2.uiMode & (-49));
        if (fVar != null) {
            X0(configuration2, fVar);
        }
        return configuration2;
    }

    private void i1(int i10, i0.f fVar, boolean z10, Configuration configuration) {
        Resources resources = this.f887t.getResources();
        Configuration configuration2 = new Configuration(resources.getConfiguration());
        if (configuration != null) {
            configuration2.updateFrom(configuration);
        }
        configuration2.uiMode = i10 | (resources.getConfiguration().uiMode & (-49));
        if (fVar != null) {
            X0(configuration2, fVar);
        }
        resources.updateConfiguration(configuration2, null);
        int i11 = Build.VERSION.SDK_INT;
        if (i11 < 26) {
            u.a(resources);
        }
        int i12 = this.f871d0;
        if (i12 != 0) {
            this.f887t.setTheme(i12);
            if (i11 >= 23) {
                this.f887t.getTheme().applyStyle(this.f871d0, true);
            }
        }
        if (z10 && (this.f886s instanceof Activity)) {
            f1(configuration2);
        }
    }

    private ViewGroup j0() {
        ViewGroup viewGroup;
        TypedArray typedArrayObtainStyledAttributes = this.f887t.obtainStyledAttributes(h.j.A0);
        int i10 = h.j.F0;
        if (!typedArrayObtainStyledAttributes.hasValue(i10)) {
            typedArrayObtainStyledAttributes.recycle();
            throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
        if (typedArrayObtainStyledAttributes.getBoolean(h.j.O0, false)) {
            J(1);
        } else if (typedArrayObtainStyledAttributes.getBoolean(i10, false)) {
            J(108);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(h.j.G0, false)) {
            J(109);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(h.j.H0, false)) {
            J(10);
        }
        this.S = typedArrayObtainStyledAttributes.getBoolean(h.j.B0, false);
        typedArrayObtainStyledAttributes.recycle();
        q0();
        this.f888u.getDecorView();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.f887t);
        if (this.T) {
            viewGroup = this.R ? (ViewGroup) layoutInflaterFrom.inflate(h.g.f14882q, (ViewGroup) null) : (ViewGroup) layoutInflaterFrom.inflate(h.g.f14881p, (ViewGroup) null);
        } else if (this.S) {
            viewGroup = (ViewGroup) layoutInflaterFrom.inflate(h.g.f14873h, (ViewGroup) null);
            this.Q = false;
            this.P = false;
        } else if (this.P) {
            TypedValue typedValue = new TypedValue();
            this.f887t.getTheme().resolveAttribute(h.a.f14748f, typedValue, true);
            viewGroup = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new androidx.appcompat.view.d(this.f887t, typedValue.resourceId) : this.f887t).inflate(h.g.f14883r, (ViewGroup) null);
            DecorContentParent decorContentParent = (DecorContentParent) viewGroup.findViewById(h.f.f14856q);
            this.A = decorContentParent;
            decorContentParent.setWindowCallback(A0());
            if (this.Q) {
                this.A.initFeature(109);
            }
            if (this.N) {
                this.A.initFeature(2);
            }
            if (this.O) {
                this.A.initFeature(5);
            }
        } else {
            viewGroup = null;
        }
        if (viewGroup == null) {
            throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.P + ", windowActionBarOverlay: " + this.Q + ", android:windowIsFloating: " + this.S + ", windowActionModeOverlay: " + this.R + ", windowNoTitle: " + this.T + " }");
        }
        o0.y0(viewGroup, new b());
        if (this.A == null) {
            this.L = (TextView) viewGroup.findViewById(h.f.S);
        }
        ViewUtils.makeOptionalFitsSystemWindows(viewGroup);
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(h.f.f14841b);
        ViewGroup viewGroup2 = (ViewGroup) this.f888u.findViewById(R.id.content);
        if (viewGroup2 != null) {
            while (viewGroup2.getChildCount() > 0) {
                View childAt = viewGroup2.getChildAt(0);
                viewGroup2.removeViewAt(0);
                contentFrameLayout.addView(childAt);
            }
            viewGroup2.setId(-1);
            contentFrameLayout.setId(R.id.content);
            if (viewGroup2 instanceof FrameLayout) {
                ((FrameLayout) viewGroup2).setForeground(null);
            }
        }
        this.f888u.setContentView(viewGroup);
        contentFrameLayout.setAttachListener(new c());
        return viewGroup;
    }

    private void k1(View view) {
        view.setBackgroundColor((o0.N(view) & 8192) != 0 ? b0.b.b(this.f887t, h.c.f14792b) : b0.b.b(this.f887t, h.c.f14791a));
    }

    private void p0() {
        if (this.J) {
            return;
        }
        this.K = j0();
        CharSequence charSequenceZ0 = z0();
        if (!TextUtils.isEmpty(charSequenceZ0)) {
            DecorContentParent decorContentParent = this.A;
            if (decorContentParent != null) {
                decorContentParent.setWindowTitle(charSequenceZ0);
            } else if (S0() != null) {
                S0().z(charSequenceZ0);
            } else {
                TextView textView = this.L;
                if (textView != null) {
                    textView.setText(charSequenceZ0);
                }
            }
        }
        Z();
        Q0(this.K);
        this.J = true;
        s sVarY0 = y0(0, false);
        if (this.f868a0) {
            return;
        }
        if (sVarY0 == null || sVarY0.f927j == null) {
            F0(108);
        }
    }

    private void q0() {
        if (this.f888u == null) {
            Object obj = this.f886s;
            if (obj instanceof Activity) {
                a0(((Activity) obj).getWindow());
            }
        }
        if (this.f888u == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    private static Configuration s0(Configuration configuration, Configuration configuration2) {
        Configuration configuration3 = new Configuration();
        configuration3.fontScale = 0.0f;
        if (configuration2 != null && configuration.diff(configuration2) != 0) {
            float f10 = configuration.fontScale;
            float f11 = configuration2.fontScale;
            if (f10 != f11) {
                configuration3.fontScale = f11;
            }
            int i10 = configuration.mcc;
            int i11 = configuration2.mcc;
            if (i10 != i11) {
                configuration3.mcc = i11;
            }
            int i12 = configuration.mnc;
            int i13 = configuration2.mnc;
            if (i12 != i13) {
                configuration3.mnc = i13;
            }
            int i14 = Build.VERSION.SDK_INT;
            if (i14 >= 24) {
                k.a(configuration, configuration2, configuration3);
            } else if (!l0.b.a(configuration.locale, configuration2.locale)) {
                configuration3.locale = configuration2.locale;
            }
            int i15 = configuration.touchscreen;
            int i16 = configuration2.touchscreen;
            if (i15 != i16) {
                configuration3.touchscreen = i16;
            }
            int i17 = configuration.keyboard;
            int i18 = configuration2.keyboard;
            if (i17 != i18) {
                configuration3.keyboard = i18;
            }
            int i19 = configuration.keyboardHidden;
            int i20 = configuration2.keyboardHidden;
            if (i19 != i20) {
                configuration3.keyboardHidden = i20;
            }
            int i21 = configuration.navigation;
            int i22 = configuration2.navigation;
            if (i21 != i22) {
                configuration3.navigation = i22;
            }
            int i23 = configuration.navigationHidden;
            int i24 = configuration2.navigationHidden;
            if (i23 != i24) {
                configuration3.navigationHidden = i24;
            }
            int i25 = configuration.orientation;
            int i26 = configuration2.orientation;
            if (i25 != i26) {
                configuration3.orientation = i26;
            }
            int i27 = configuration.screenLayout & 15;
            int i28 = configuration2.screenLayout;
            if (i27 != (i28 & 15)) {
                configuration3.screenLayout |= i28 & 15;
            }
            int i29 = configuration.screenLayout & 192;
            int i30 = configuration2.screenLayout;
            if (i29 != (i30 & 192)) {
                configuration3.screenLayout |= i30 & 192;
            }
            int i31 = configuration.screenLayout & 48;
            int i32 = configuration2.screenLayout;
            if (i31 != (i32 & 48)) {
                configuration3.screenLayout |= i32 & 48;
            }
            int i33 = configuration.screenLayout & 768;
            int i34 = configuration2.screenLayout;
            if (i33 != (i34 & 768)) {
                configuration3.screenLayout |= i34 & 768;
            }
            if (i14 >= 26) {
                l.a(configuration, configuration2, configuration3);
            }
            int i35 = configuration.uiMode & 15;
            int i36 = configuration2.uiMode;
            if (i35 != (i36 & 15)) {
                configuration3.uiMode |= i36 & 15;
            }
            int i37 = configuration.uiMode & 48;
            int i38 = configuration2.uiMode;
            if (i37 != (i38 & 48)) {
                configuration3.uiMode |= i38 & 48;
            }
            int i39 = configuration.screenWidthDp;
            int i40 = configuration2.screenWidthDp;
            if (i39 != i40) {
                configuration3.screenWidthDp = i40;
            }
            int i41 = configuration.screenHeightDp;
            int i42 = configuration2.screenHeightDp;
            if (i41 != i42) {
                configuration3.screenHeightDp = i42;
            }
            int i43 = configuration.smallestScreenWidthDp;
            int i44 = configuration2.smallestScreenWidthDp;
            if (i43 != i44) {
                configuration3.smallestScreenWidthDp = i44;
            }
            int i45 = configuration.densityDpi;
            int i46 = configuration2.densityDpi;
            if (i45 != i46) {
                configuration3.densityDpi = i46;
            }
        }
        return configuration3;
    }

    private int u0(Context context) {
        if (!this.f873f0 && (this.f886s instanceof Activity)) {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                return 0;
            }
            try {
                int i10 = Build.VERSION.SDK_INT;
                ActivityInfo activityInfo = packageManager.getActivityInfo(new ComponentName(context, this.f886s.getClass()), i10 >= 29 ? 269221888 : i10 >= 24 ? 786432 : 0);
                if (activityInfo != null) {
                    this.f872e0 = activityInfo.configChanges;
                }
            } catch (PackageManager.NameNotFoundException e10) {
                Log.d("AppCompatDelegate", "Exception while getting ActivityInfo", e10);
                this.f872e0 = 0;
            }
        }
        this.f873f0 = true;
        return this.f872e0;
    }

    private p v0(Context context) {
        if (this.f875h0 == null) {
            this.f875h0 = new o(context);
        }
        return this.f875h0;
    }

    private p w0(Context context) {
        if (this.f874g0 == null) {
            this.f874g0 = new q(x.a(context));
        }
        return this.f874g0;
    }

    @Override // androidx.appcompat.app.h
    public void A(Bundle bundle) {
        String strC;
        this.Y = true;
        W(false);
        q0();
        Object obj = this.f886s;
        if (obj instanceof Activity) {
            try {
                strC = a0.i.c((Activity) obj);
            } catch (IllegalArgumentException unused) {
                strC = null;
            }
            if (strC != null) {
                androidx.appcompat.app.a aVarS0 = S0();
                if (aVarS0 == null) {
                    this.f879l0 = true;
                } else {
                    aVarS0.n(true);
                }
            }
            androidx.appcompat.app.h.c(this);
        }
        this.f869b0 = new Configuration(this.f887t.getResources().getConfiguration());
        this.Z = true;
    }

    final Window.Callback A0() {
        return this.f888u.getCallback();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0045  */
    @Override // androidx.appcompat.app.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void B() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f886s
            boolean r0 = r0 instanceof android.app.Activity
            if (r0 == 0) goto L9
            androidx.appcompat.app.h.H(r3)
        L9:
            boolean r0 = r3.f876i0
            if (r0 == 0) goto L18
            android.view.Window r0 = r3.f888u
            android.view.View r0 = r0.getDecorView()
            java.lang.Runnable r1 = r3.f878k0
            r0.removeCallbacks(r1)
        L18:
            r0 = 1
            r3.f868a0 = r0
            int r0 = r3.f870c0
            r1 = -100
            if (r0 == r1) goto L45
            java.lang.Object r0 = r3.f886s
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L45
            android.app.Activity r0 = (android.app.Activity) r0
            boolean r0 = r0.isChangingConfigurations()
            if (r0 == 0) goto L45
            androidx.collection.i r0 = androidx.appcompat.app.j.f864s0
            java.lang.Object r1 = r3.f886s
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            int r2 = r3.f870c0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.put(r1, r2)
            goto L54
        L45:
            androidx.collection.i r0 = androidx.appcompat.app.j.f864s0
            java.lang.Object r1 = r3.f886s
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            r0.remove(r1)
        L54:
            androidx.appcompat.app.a r0 = r3.f891x
            if (r0 == 0) goto L5b
            r0.i()
        L5b:
            r3.f0()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.j.B():void");
    }

    @Override // androidx.appcompat.app.h
    public void C(Bundle bundle) {
        p0();
    }

    @Override // androidx.appcompat.app.h
    public void D() {
        androidx.appcompat.app.a aVarV = v();
        if (aVarV != null) {
            aVarV.v(true);
        }
    }

    @Override // androidx.appcompat.app.h
    public void E(Bundle bundle) {
    }

    @Override // androidx.appcompat.app.h
    public void F() {
        X(true, false);
    }

    @Override // androidx.appcompat.app.h
    public void G() {
        androidx.appcompat.app.a aVarV = v();
        if (aVarV != null) {
            aVarV.v(false);
        }
    }

    public boolean G0() {
        return this.I;
    }

    int H0(Context context, int i10) {
        if (i10 == -100) {
            return -1;
        }
        if (i10 != -1) {
            if (i10 == 0) {
                if (Build.VERSION.SDK_INT < 23 || ((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() != 0) {
                    return w0(context).c();
                }
                return -1;
            }
            if (i10 != 1 && i10 != 2) {
                if (i10 == 3) {
                    return v0(context).c();
                }
                throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
            }
        }
        return i10;
    }

    boolean I0() {
        boolean z10 = this.X;
        this.X = false;
        s sVarY0 = y0(0, false);
        if (sVarY0 != null && sVarY0.f932o) {
            if (!z10) {
                h0(sVarY0, true);
            }
            return true;
        }
        androidx.appcompat.view.b bVar = this.D;
        if (bVar != null) {
            bVar.finish();
            return true;
        }
        androidx.appcompat.app.a aVarV = v();
        return aVarV != null && aVarV.b();
    }

    @Override // androidx.appcompat.app.h
    public boolean J(int i10) {
        int iW0 = W0(i10);
        if (this.T && iW0 == 108) {
            return false;
        }
        if (this.P && iW0 == 1) {
            this.P = false;
        }
        if (iW0 == 1) {
            d1();
            this.T = true;
            return true;
        }
        if (iW0 == 2) {
            d1();
            this.N = true;
            return true;
        }
        if (iW0 == 5) {
            d1();
            this.O = true;
            return true;
        }
        if (iW0 == 10) {
            d1();
            this.R = true;
            return true;
        }
        if (iW0 == 108) {
            d1();
            this.P = true;
            return true;
        }
        if (iW0 != 109) {
            return this.f888u.requestFeature(iW0);
        }
        d1();
        this.Q = true;
        return true;
    }

    boolean J0(int i10, KeyEvent keyEvent) {
        if (i10 == 4) {
            this.X = (keyEvent.getFlags() & 128) != 0;
        } else if (i10 == 82) {
            K0(0, keyEvent);
            return true;
        }
        return false;
    }

    boolean L0(int i10, KeyEvent keyEvent) {
        androidx.appcompat.app.a aVarV = v();
        if (aVarV != null && aVarV.j(i10, keyEvent)) {
            return true;
        }
        s sVar = this.W;
        if (sVar != null && T0(sVar, keyEvent.getKeyCode(), keyEvent, 1)) {
            s sVar2 = this.W;
            if (sVar2 != null) {
                sVar2.f931n = true;
            }
            return true;
        }
        if (this.W == null) {
            s sVarY0 = y0(0, true);
            U0(sVarY0, keyEvent);
            boolean zT0 = T0(sVarY0, keyEvent.getKeyCode(), keyEvent, 1);
            sVarY0.f930m = false;
            if (zT0) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.appcompat.app.h
    public void M(int i10) {
        p0();
        ViewGroup viewGroup = (ViewGroup) this.K.findViewById(R.id.content);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.f887t).inflate(i10, viewGroup);
        this.f889v.c(this.f888u.getCallback());
    }

    boolean M0(int i10, KeyEvent keyEvent) {
        if (i10 != 4) {
            if (i10 == 82) {
                N0(0, keyEvent);
                return true;
            }
        } else if (I0()) {
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.app.h
    public void N(View view) {
        p0();
        ViewGroup viewGroup = (ViewGroup) this.K.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.f889v.c(this.f888u.getCallback());
    }

    @Override // androidx.appcompat.app.h
    public void O(View view, ViewGroup.LayoutParams layoutParams) {
        p0();
        ViewGroup viewGroup = (ViewGroup) this.K.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.f889v.c(this.f888u.getCallback());
    }

    void O0(int i10) {
        androidx.appcompat.app.a aVarV;
        if (i10 != 108 || (aVarV = v()) == null) {
            return;
        }
        aVarV.c(true);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002c  */
    @Override // androidx.appcompat.app.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void P(android.window.OnBackInvokedDispatcher r3) {
        /*
            r2 = this;
            super.P(r3)
            android.window.OnBackInvokedDispatcher r0 = r2.f884q0
            if (r0 == 0) goto L11
            android.window.OnBackInvokedCallback r1 = r2.f885r0
            if (r1 == 0) goto L11
            androidx.appcompat.app.j.m.c(r0, r1)
            r0 = 0
            r2.f885r0 = r0
        L11:
            if (r3 != 0) goto L2c
            java.lang.Object r0 = r2.f886s
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L2c
            android.app.Activity r0 = (android.app.Activity) r0
            android.view.Window r0 = r0.getWindow()
            if (r0 == 0) goto L2c
            java.lang.Object r3 = r2.f886s
            android.app.Activity r3 = (android.app.Activity) r3
            android.window.OnBackInvokedDispatcher r3 = androidx.appcompat.app.j.m.a(r3)
            r2.f884q0 = r3
            goto L2e
        L2c:
            r2.f884q0 = r3
        L2e:
            r2.h1()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.j.P(android.window.OnBackInvokedDispatcher):void");
    }

    void P0(int i10) {
        if (i10 == 108) {
            androidx.appcompat.app.a aVarV = v();
            if (aVarV != null) {
                aVarV.c(false);
                return;
            }
            return;
        }
        if (i10 == 0) {
            s sVarY0 = y0(i10, true);
            if (sVarY0.f932o) {
                h0(sVarY0, false);
            }
        }
    }

    @Override // androidx.appcompat.app.h
    public void Q(Toolbar toolbar) {
        if (this.f886s instanceof Activity) {
            androidx.appcompat.app.a aVarV = v();
            if (aVarV instanceof y) {
                throw new IllegalStateException("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
            }
            this.f892y = null;
            if (aVarV != null) {
                aVarV.i();
            }
            this.f891x = null;
            if (toolbar != null) {
                v vVar = new v(toolbar, z0(), this.f889v);
                this.f891x = vVar;
                this.f889v.e(vVar.f965c);
                toolbar.setBackInvokedCallbackEnabled(true);
            } else {
                this.f889v.e(null);
            }
            x();
        }
    }

    void Q0(ViewGroup viewGroup) {
    }

    @Override // androidx.appcompat.app.h
    public void R(int i10) {
        this.f871d0 = i10;
    }

    @Override // androidx.appcompat.app.h
    public final void S(CharSequence charSequence) {
        this.f893z = charSequence;
        DecorContentParent decorContentParent = this.A;
        if (decorContentParent != null) {
            decorContentParent.setWindowTitle(charSequence);
            return;
        }
        if (S0() != null) {
            S0().z(charSequence);
            return;
        }
        TextView textView = this.L;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    final androidx.appcompat.app.a S0() {
        return this.f891x;
    }

    @Override // androidx.appcompat.app.h
    public androidx.appcompat.view.b T(b.a aVar) {
        androidx.appcompat.app.e eVar;
        if (aVar == null) {
            throw new IllegalArgumentException("ActionMode callback can not be null.");
        }
        androidx.appcompat.view.b bVar = this.D;
        if (bVar != null) {
            bVar.finish();
        }
        i iVar = new i(aVar);
        androidx.appcompat.app.a aVarV = v();
        if (aVarV != null) {
            androidx.appcompat.view.b bVarB = aVarV.B(iVar);
            this.D = bVarB;
            if (bVarB != null && (eVar = this.f890w) != null) {
                eVar.e(bVarB);
            }
        }
        if (this.D == null) {
            this.D = c1(iVar);
        }
        h1();
        return this.D;
    }

    void X0(Configuration configuration, i0.f fVar) {
        if (Build.VERSION.SDK_INT >= 24) {
            k.d(configuration, fVar);
        } else {
            configuration.setLocale(fVar.d(0));
            configuration.setLayoutDirection(fVar.d(0));
        }
    }

    public boolean Y() {
        return W(true);
    }

    void Y0(i0.f fVar) {
        if (Build.VERSION.SDK_INT >= 24) {
            k.c(fVar);
        } else {
            Locale.setDefault(fVar.d(0));
        }
    }

    final boolean Z0() {
        ViewGroup viewGroup;
        return this.J && (viewGroup = this.K) != null && viewGroup.isLaidOut();
    }

    i0.f b0(Context context) {
        i0.f fVarT;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 33 || (fVarT = androidx.appcompat.app.h.t()) == null) {
            return null;
        }
        i0.f fVarX0 = x0(context.getApplicationContext().getResources().getConfiguration());
        i0.f fVarB = i10 >= 24 ? androidx.appcompat.app.t.b(fVarT, fVarX0) : fVarT.f() ? i0.f.e() : i0.f.c(C0017j.b(fVarT.d(0)));
        return fVarB.f() ? fVarX0 : fVarB;
    }

    boolean b1() {
        if (this.f884q0 == null) {
            return false;
        }
        s sVarY0 = y0(0, false);
        return (sVarY0 != null && sVarY0.f932o) || this.D != null;
    }

    androidx.appcompat.view.b c1(b.a aVar) {
        androidx.appcompat.view.b bVarS;
        Context dVar;
        androidx.appcompat.app.e eVar;
        o0();
        androidx.appcompat.view.b bVar = this.D;
        if (bVar != null) {
            bVar.finish();
        }
        if (!(aVar instanceof i)) {
            aVar = new i(aVar);
        }
        androidx.appcompat.app.e eVar2 = this.f890w;
        if (eVar2 == null || this.f868a0) {
            bVarS = null;
        } else {
            try {
                bVarS = eVar2.s(aVar);
            } catch (AbstractMethodError unused) {
                bVarS = null;
            }
        }
        if (bVarS != null) {
            this.D = bVarS;
        } else {
            if (this.E == null) {
                if (this.S) {
                    TypedValue typedValue = new TypedValue();
                    Resources.Theme theme = this.f887t.getTheme();
                    theme.resolveAttribute(h.a.f14748f, typedValue, true);
                    if (typedValue.resourceId != 0) {
                        Resources.Theme themeNewTheme = this.f887t.getResources().newTheme();
                        themeNewTheme.setTo(theme);
                        themeNewTheme.applyStyle(typedValue.resourceId, true);
                        dVar = new androidx.appcompat.view.d(this.f887t, 0);
                        dVar.getTheme().setTo(themeNewTheme);
                    } else {
                        dVar = this.f887t;
                    }
                    this.E = new ActionBarContextView(dVar);
                    PopupWindow popupWindow = new PopupWindow(dVar, (AttributeSet) null, h.a.f14754i);
                    this.F = popupWindow;
                    androidx.core.widget.h.b(popupWindow, 2);
                    this.F.setContentView(this.E);
                    this.F.setWidth(-1);
                    dVar.getTheme().resolveAttribute(h.a.f14740b, typedValue, true);
                    this.E.setContentHeight(TypedValue.complexToDimensionPixelSize(typedValue.data, dVar.getResources().getDisplayMetrics()));
                    this.F.setHeight(-2);
                    this.G = new d();
                } else {
                    ViewStubCompat viewStubCompat = (ViewStubCompat) this.K.findViewById(h.f.f14847h);
                    if (viewStubCompat != null) {
                        viewStubCompat.setLayoutInflater(LayoutInflater.from(t0()));
                        this.E = (ActionBarContextView) viewStubCompat.inflate();
                    }
                }
            }
            if (this.E != null) {
                o0();
                this.E.killMode();
                androidx.appcompat.view.e eVar3 = new androidx.appcompat.view.e(this.E.getContext(), this.E, aVar, this.F == null);
                if (aVar.b(eVar3, eVar3.getMenu())) {
                    eVar3.invalidate();
                    this.E.initForMode(eVar3);
                    this.D = eVar3;
                    if (Z0()) {
                        this.E.setAlpha(0.0f);
                        y0 y0VarB = o0.e(this.E).b(1.0f);
                        this.H = y0VarB;
                        y0VarB.g(new e());
                    } else {
                        this.E.setAlpha(1.0f);
                        this.E.setVisibility(0);
                        if (this.E.getParent() instanceof View) {
                            o0.j0((View) this.E.getParent());
                        }
                    }
                    if (this.F != null) {
                        this.f888u.getDecorView().post(this.G);
                    }
                } else {
                    this.D = null;
                }
            }
        }
        androidx.appcompat.view.b bVar2 = this.D;
        if (bVar2 != null && (eVar = this.f890w) != null) {
            eVar.e(bVar2);
        }
        h1();
        return this.D;
    }

    @Override // androidx.appcompat.app.h
    public void d(View view, ViewGroup.LayoutParams layoutParams) {
        p0();
        ((ViewGroup) this.K.findViewById(R.id.content)).addView(view, layoutParams);
        this.f889v.c(this.f888u.getCallback());
    }

    void d0(int i10, s sVar, Menu menu) {
        if (menu == null) {
            if (sVar == null && i10 >= 0) {
                s[] sVarArr = this.V;
                if (i10 < sVarArr.length) {
                    sVar = sVarArr[i10];
                }
            }
            if (sVar != null) {
                menu = sVar.f927j;
            }
        }
        if ((sVar == null || sVar.f932o) && !this.f868a0) {
            this.f889v.d(this.f888u.getCallback(), i10, menu);
        }
    }

    @Override // androidx.appcompat.app.h
    boolean e() {
        if (androidx.appcompat.app.h.y(this.f887t) && androidx.appcompat.app.h.t() != null && !androidx.appcompat.app.h.t().equals(androidx.appcompat.app.h.u())) {
            g(this.f887t);
        }
        return W(true);
    }

    void e0(androidx.appcompat.view.menu.h hVar) {
        if (this.U) {
            return;
        }
        this.U = true;
        this.A.dismissPopups();
        Window.Callback callbackA0 = A0();
        if (callbackA0 != null && !this.f868a0) {
            callbackA0.onPanelClosed(108, hVar);
        }
        this.U = false;
    }

    void g0(int i10) {
        h0(y0(i10, true), true);
    }

    void h0(s sVar, boolean z10) {
        ViewGroup viewGroup;
        DecorContentParent decorContentParent;
        if (z10 && sVar.f918a == 0 && (decorContentParent = this.A) != null && decorContentParent.isOverflowMenuShowing()) {
            e0(sVar.f927j);
            return;
        }
        WindowManager windowManager = (WindowManager) this.f887t.getSystemService("window");
        if (windowManager != null && sVar.f932o && (viewGroup = sVar.f924g) != null) {
            windowManager.removeView(viewGroup);
            if (z10) {
                d0(sVar.f918a, sVar, null);
            }
        }
        sVar.f930m = false;
        sVar.f931n = false;
        sVar.f932o = false;
        sVar.f925h = null;
        sVar.f934q = true;
        if (this.W == sVar) {
            this.W = null;
        }
        if (sVar.f918a == 0) {
            h1();
        }
    }

    void h1() {
        OnBackInvokedCallback onBackInvokedCallback;
        if (Build.VERSION.SDK_INT >= 33) {
            boolean zB1 = b1();
            if (zB1 && this.f885r0 == null) {
                this.f885r0 = m.b(this.f884q0, this);
            } else {
                if (zB1 || (onBackInvokedCallback = this.f885r0) == null) {
                    return;
                }
                m.c(this.f884q0, onBackInvokedCallback);
                this.f885r0 = null;
            }
        }
    }

    @Override // androidx.appcompat.app.h
    public Context i(Context context) {
        Context context2;
        this.Y = true;
        int iH0 = H0(context, c0());
        if (androidx.appcompat.app.h.y(context)) {
            androidx.appcompat.app.h.V(context);
        }
        i0.f fVarB0 = b0(context);
        if (context instanceof ContextThemeWrapper) {
            context2 = context;
            try {
                ((ContextThemeWrapper) context2).applyOverrideConfiguration(i0(context2, iH0, fVarB0, null, false));
                return context2;
            } catch (IllegalStateException unused) {
            }
        } else {
            context2 = context;
        }
        if (context2 instanceof androidx.appcompat.view.d) {
            try {
                ((androidx.appcompat.view.d) context2).a(i0(context2, iH0, fVarB0, null, false));
                return context2;
            } catch (IllegalStateException unused2) {
            }
        }
        if (!f867v0) {
            return super.i(context2);
        }
        Configuration configuration = new Configuration();
        configuration.uiMode = -1;
        configuration.fontScale = 0.0f;
        Configuration configuration2 = context2.createConfigurationContext(configuration).getResources().getConfiguration();
        Configuration configuration3 = context2.getResources().getConfiguration();
        configuration2.uiMode = configuration3.uiMode;
        Configuration configurationI0 = i0(context2, iH0, fVarB0, !configuration2.equals(configuration3) ? s0(configuration2, configuration3) : null, true);
        androidx.appcompat.view.d dVar = new androidx.appcompat.view.d(context2, h.i.f14910e);
        dVar.a(configurationI0);
        try {
            if (context2.getTheme() != null) {
                k.f.a(dVar.getTheme());
            }
        } catch (NullPointerException unused3) {
        }
        return super.i(dVar);
    }

    final int j1(i1 i1Var, Rect rect) {
        boolean z10;
        boolean z11;
        int iL = i1Var != null ? i1Var.l() : rect != null ? rect.top : 0;
        ActionBarContextView actionBarContextView = this.E;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            z10 = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.E.getLayoutParams();
            if (this.E.isShown()) {
                if (this.f880m0 == null) {
                    this.f880m0 = new Rect();
                    this.f881n0 = new Rect();
                }
                Rect rect2 = this.f880m0;
                Rect rect3 = this.f881n0;
                if (i1Var == null) {
                    rect2.set(rect);
                } else {
                    rect2.set(i1Var.j(), i1Var.l(), i1Var.k(), i1Var.i());
                }
                ViewUtils.computeFitSystemWindows(this.K, rect2, rect3);
                int i10 = rect2.top;
                int i11 = rect2.left;
                int i12 = rect2.right;
                i1 i1VarI = o0.I(this.K);
                int iJ = i1VarI == null ? 0 : i1VarI.j();
                int iK = i1VarI == null ? 0 : i1VarI.k();
                if (marginLayoutParams.topMargin == i10 && marginLayoutParams.leftMargin == i11 && marginLayoutParams.rightMargin == i12) {
                    z11 = false;
                } else {
                    marginLayoutParams.topMargin = i10;
                    marginLayoutParams.leftMargin = i11;
                    marginLayoutParams.rightMargin = i12;
                    z11 = true;
                }
                if (i10 <= 0 || this.M != null) {
                    View view = this.M;
                    if (view != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                        int i13 = marginLayoutParams2.height;
                        int i14 = marginLayoutParams.topMargin;
                        if (i13 != i14 || marginLayoutParams2.leftMargin != iJ || marginLayoutParams2.rightMargin != iK) {
                            marginLayoutParams2.height = i14;
                            marginLayoutParams2.leftMargin = iJ;
                            marginLayoutParams2.rightMargin = iK;
                            this.M.setLayoutParams(marginLayoutParams2);
                        }
                    }
                } else {
                    View view2 = new View(this.f887t);
                    this.M = view2;
                    view2.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                    layoutParams.leftMargin = iJ;
                    layoutParams.rightMargin = iK;
                    this.K.addView(this.M, -1, layoutParams);
                }
                View view3 = this.M;
                z = view3 != null;
                if (z && view3.getVisibility() != 0) {
                    k1(this.M);
                }
                if (!this.R && z) {
                    iL = 0;
                }
                z10 = z;
                z = z11;
            } else if (marginLayoutParams.topMargin != 0) {
                marginLayoutParams.topMargin = 0;
                z10 = false;
            } else {
                z10 = false;
                z = false;
            }
            if (z) {
                this.E.setLayoutParams(marginLayoutParams);
            }
        }
        View view4 = this.M;
        if (view4 != null) {
            view4.setVisibility(z10 ? 0 : 8);
        }
        return iL;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View k0(View view, String str, Context context, AttributeSet attributeSet) {
        boolean z10;
        if (this.f882o0 == null) {
            TypedArray typedArrayObtainStyledAttributes = this.f887t.obtainStyledAttributes(h.j.A0);
            String string = typedArrayObtainStyledAttributes.getString(h.j.E0);
            typedArrayObtainStyledAttributes.recycle();
            if (string == null) {
                this.f882o0 = new androidx.appcompat.app.r();
            } else {
                try {
                    this.f882o0 = (androidx.appcompat.app.r) this.f887t.getClassLoader().loadClass(string).getDeclaredConstructor(null).newInstance(null);
                } catch (Throwable th2) {
                    Log.i("AppCompatDelegate", "Failed to instantiate custom view inflater " + string + ". Falling back to default.", th2);
                    this.f882o0 = new androidx.appcompat.app.r();
                }
            }
        }
        boolean z11 = f865t0;
        boolean zA1 = false;
        if (z11) {
            if (this.f883p0 == null) {
                this.f883p0 = new androidx.appcompat.app.s();
            }
            if (this.f883p0.a(attributeSet)) {
                z10 = true;
            } else {
                if (!(attributeSet instanceof XmlPullParser)) {
                    zA1 = a1((ViewParent) view);
                } else if (((XmlPullParser) attributeSet).getDepth() > 1) {
                    zA1 = true;
                }
                z10 = zA1;
            }
        } else {
            z10 = false;
        }
        return this.f882o0.r(view, str, context, attributeSet, z10, z11, true, VectorEnabledTintResources.shouldBeUsed());
    }

    @Override // androidx.appcompat.app.h
    public View l(int i10) {
        p0();
        return this.f888u.findViewById(i10);
    }

    void l0() {
        androidx.appcompat.view.menu.h hVar;
        DecorContentParent decorContentParent = this.A;
        if (decorContentParent != null) {
            decorContentParent.dismissPopups();
        }
        if (this.F != null) {
            this.f888u.getDecorView().removeCallbacks(this.G);
            if (this.F.isShowing()) {
                try {
                    this.F.dismiss();
                } catch (IllegalArgumentException unused) {
                }
            }
            this.F = null;
        }
        o0();
        s sVarY0 = y0(0, false);
        if (sVarY0 == null || (hVar = sVarY0.f927j) == null) {
            return;
        }
        hVar.close();
    }

    boolean m0(KeyEvent keyEvent) {
        View decorView;
        Object obj = this.f886s;
        if (((obj instanceof m.a) || (obj instanceof androidx.appcompat.app.q)) && (decorView = this.f888u.getDecorView()) != null && m0.m.d(decorView, keyEvent)) {
            return true;
        }
        if (keyEvent.getKeyCode() == 82 && this.f889v.b(this.f888u.getCallback(), keyEvent)) {
            return true;
        }
        int keyCode = keyEvent.getKeyCode();
        return keyEvent.getAction() == 0 ? J0(keyCode, keyEvent) : M0(keyCode, keyEvent);
    }

    @Override // androidx.appcompat.app.h
    public Context n() {
        return this.f887t;
    }

    void n0(int i10) {
        s sVarY0;
        s sVarY02 = y0(i10, true);
        if (sVarY02.f927j != null) {
            Bundle bundle = new Bundle();
            sVarY02.f927j.U(bundle);
            if (bundle.size() > 0) {
                sVarY02.f936s = bundle;
            }
            sVarY02.f927j.i0();
            sVarY02.f927j.clear();
        }
        sVarY02.f935r = true;
        sVarY02.f934q = true;
        if ((i10 != 108 && i10 != 0) || this.A == null || (sVarY0 = y0(0, false)) == null) {
            return;
        }
        sVarY0.f930m = false;
        U0(sVarY0, null);
    }

    void o0() {
        y0 y0Var = this.H;
        if (y0Var != null) {
            y0Var.c();
        }
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return k0(view, str, context, attributeSet);
    }

    @Override // androidx.appcompat.view.menu.h.a
    public boolean onMenuItemSelected(androidx.appcompat.view.menu.h hVar, MenuItem menuItem) {
        s sVarR0;
        Window.Callback callbackA0 = A0();
        if (callbackA0 == null || this.f868a0 || (sVarR0 = r0(hVar.F())) == null) {
            return false;
        }
        return callbackA0.onMenuItemSelected(sVarR0.f918a, menuItem);
    }

    @Override // androidx.appcompat.view.menu.h.a
    public void onMenuModeChange(androidx.appcompat.view.menu.h hVar) {
        V0(true);
    }

    @Override // androidx.appcompat.app.h
    public final b.InterfaceC0016b p() {
        return new f();
    }

    @Override // androidx.appcompat.app.h
    public int q() {
        return this.f870c0;
    }

    s r0(Menu menu) {
        s[] sVarArr = this.V;
        int length = sVarArr != null ? sVarArr.length : 0;
        for (int i10 = 0; i10 < length; i10++) {
            s sVar = sVarArr[i10];
            if (sVar != null && sVar.f927j == menu) {
                return sVar;
            }
        }
        return null;
    }

    @Override // androidx.appcompat.app.h
    public MenuInflater s() {
        if (this.f892y == null) {
            B0();
            androidx.appcompat.app.a aVar = this.f891x;
            this.f892y = new androidx.appcompat.view.g(aVar != null ? aVar.e() : this.f887t);
        }
        return this.f892y;
    }

    final Context t0() {
        androidx.appcompat.app.a aVarV = v();
        Context contextE = aVarV != null ? aVarV.e() : null;
        return contextE == null ? this.f887t : contextE;
    }

    @Override // androidx.appcompat.app.h
    public androidx.appcompat.app.a v() {
        B0();
        return this.f891x;
    }

    @Override // androidx.appcompat.app.h
    public void w() {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.f887t);
        if (layoutInflaterFrom.getFactory() == null) {
            m0.n.a(layoutInflaterFrom, this);
        } else {
            if (layoutInflaterFrom.getFactory2() instanceof j) {
                return;
            }
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    @Override // androidx.appcompat.app.h
    public void x() {
        if (S0() == null || v().g()) {
            return;
        }
        F0(0);
    }

    i0.f x0(Configuration configuration) {
        return Build.VERSION.SDK_INT >= 24 ? k.b(configuration) : i0.f.c(C0017j.b(configuration.locale));
    }

    protected s y0(int i10, boolean z10) {
        s[] sVarArr = this.V;
        if (sVarArr == null || sVarArr.length <= i10) {
            s[] sVarArr2 = new s[i10 + 1];
            if (sVarArr != null) {
                System.arraycopy(sVarArr, 0, sVarArr2, 0, sVarArr.length);
            }
            this.V = sVarArr2;
            sVarArr = sVarArr2;
        }
        s sVar = sVarArr[i10];
        if (sVar != null) {
            return sVar;
        }
        s sVar2 = new s(i10);
        sVarArr[i10] = sVar2;
        return sVar2;
    }

    @Override // androidx.appcompat.app.h
    public void z(Configuration configuration) {
        androidx.appcompat.app.a aVarV;
        if (this.P && this.J && (aVarV = v()) != null) {
            aVarV.h(configuration);
        }
        AppCompatDrawableManager.get().onConfigurationChanged(this.f887t);
        this.f869b0 = new Configuration(this.f887t.getResources().getConfiguration());
        X(false, false);
    }

    final CharSequence z0() {
        Object obj = this.f886s;
        return obj instanceof Activity ? ((Activity) obj).getTitle() : this.f893z;
    }

    j(Dialog dialog, androidx.appcompat.app.e eVar) {
        this(dialog.getContext(), dialog.getWindow(), eVar, dialog);
    }

    @Override // android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    private j(Context context, Window window, androidx.appcompat.app.e eVar, Object obj) {
        androidx.appcompat.app.d dVarE1;
        this.H = null;
        this.I = true;
        this.f870c0 = -100;
        this.f878k0 = new a();
        this.f887t = context;
        this.f890w = eVar;
        this.f886s = obj;
        if (this.f870c0 == -100 && (obj instanceof Dialog) && (dVarE1 = e1()) != null) {
            this.f870c0 = dVarE1.X0().q();
        }
        if (this.f870c0 == -100) {
            androidx.collection.i iVar = f864s0;
            Integer num = (Integer) iVar.get(obj.getClass().getName());
            if (num != null) {
                this.f870c0 = num.intValue();
                iVar.remove(obj.getClass().getName());
            }
        }
        if (window != null) {
            a0(window);
        }
        AppCompatDrawableManager.preload();
    }

    class n extends androidx.appcompat.view.i {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private g f905b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f906c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f907d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f908e;

        n(Window.Callback callback) {
            super(callback);
        }

        public boolean b(Window.Callback callback, KeyEvent keyEvent) {
            try {
                this.f907d = true;
                return callback.dispatchKeyEvent(keyEvent);
            } finally {
                this.f907d = false;
            }
        }

        public void c(Window.Callback callback) {
            try {
                this.f906c = true;
                callback.onContentChanged();
            } finally {
                this.f906c = false;
            }
        }

        public void d(Window.Callback callback, int i10, Menu menu) {
            try {
                this.f908e = true;
                callback.onPanelClosed(i10, menu);
            } finally {
                this.f908e = false;
            }
        }

        @Override // androidx.appcompat.view.i, android.view.Window.Callback
        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return this.f907d ? a().dispatchKeyEvent(keyEvent) : j.this.m0(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        @Override // androidx.appcompat.view.i, android.view.Window.Callback
        public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
            return super.dispatchKeyShortcutEvent(keyEvent) || j.this.L0(keyEvent.getKeyCode(), keyEvent);
        }

        void e(g gVar) {
            this.f905b = gVar;
        }

        final ActionMode f(ActionMode.Callback callback) {
            f.a aVar = new f.a(j.this.f887t, callback);
            androidx.appcompat.view.b bVarT = j.this.T(aVar);
            if (bVarT != null) {
                return aVar.e(bVarT);
            }
            return null;
        }

        @Override // android.view.Window.Callback
        public void onContentChanged() {
            if (this.f906c) {
                a().onContentChanged();
            }
        }

        @Override // androidx.appcompat.view.i, android.view.Window.Callback
        public boolean onCreatePanelMenu(int i10, Menu menu) {
            if (i10 != 0 || (menu instanceof androidx.appcompat.view.menu.h)) {
                return super.onCreatePanelMenu(i10, menu);
            }
            return false;
        }

        @Override // androidx.appcompat.view.i, android.view.Window.Callback
        public View onCreatePanelView(int i10) {
            View viewOnCreatePanelView;
            g gVar = this.f905b;
            return (gVar == null || (viewOnCreatePanelView = gVar.onCreatePanelView(i10)) == null) ? super.onCreatePanelView(i10) : viewOnCreatePanelView;
        }

        @Override // androidx.appcompat.view.i, android.view.Window.Callback
        public boolean onMenuOpened(int i10, Menu menu) {
            super.onMenuOpened(i10, menu);
            j.this.O0(i10);
            return true;
        }

        @Override // androidx.appcompat.view.i, android.view.Window.Callback
        public void onPanelClosed(int i10, Menu menu) {
            if (this.f908e) {
                a().onPanelClosed(i10, menu);
            } else {
                super.onPanelClosed(i10, menu);
                j.this.P0(i10);
            }
        }

        @Override // androidx.appcompat.view.i, android.view.Window.Callback
        public boolean onPreparePanel(int i10, View view, Menu menu) {
            androidx.appcompat.view.menu.h hVar = menu instanceof androidx.appcompat.view.menu.h ? (androidx.appcompat.view.menu.h) menu : null;
            if (i10 == 0 && hVar == null) {
                return false;
            }
            if (hVar != null) {
                hVar.f0(true);
            }
            g gVar = this.f905b;
            boolean zOnPreparePanel = gVar != null && gVar.a(i10);
            if (!zOnPreparePanel) {
                zOnPreparePanel = super.onPreparePanel(i10, view, menu);
            }
            if (hVar != null) {
                hVar.f0(false);
            }
            return zOnPreparePanel;
        }

        @Override // androidx.appcompat.view.i, android.view.Window.Callback
        public void onProvideKeyboardShortcuts(List list, Menu menu, int i10) {
            androidx.appcompat.view.menu.h hVar;
            s sVarY0 = j.this.y0(0, true);
            if (sVarY0 == null || (hVar = sVarY0.f927j) == null) {
                super.onProvideKeyboardShortcuts(list, menu, i10);
            } else {
                super.onProvideKeyboardShortcuts(list, hVar, i10);
            }
        }

        @Override // androidx.appcompat.view.i, android.view.Window.Callback
        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
            if (Build.VERSION.SDK_INT >= 23) {
                return null;
            }
            return j.this.G0() ? f(callback) : super.onWindowStartingActionMode(callback);
        }

        @Override // androidx.appcompat.view.i, android.view.Window.Callback
        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i10) {
            if (j.this.G0() && i10 == 0) {
                return f(callback);
            }
            return super.onWindowStartingActionMode(callback, i10);
        }
    }
}
