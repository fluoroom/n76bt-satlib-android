package d;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.a1;
import androidx.lifecycle.m;
import androidx.lifecycle.p0;
import androidx.lifecycle.v0;
import androidx.lifecycle.x0;
import androidx.lifecycle.y0;
import androidx.lifecycle.z0;
import d.q;
import g.a;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import l1.f;

/* JADX INFO: loaded from: classes.dex */
public abstract class q extends a0.g implements androidx.lifecycle.t, y0, androidx.lifecycle.k, l1.i, k0, f.g, b0.e, b0.f, a0.o, a0.p, m0.o, y {
    private static final c E = new c(null);
    private boolean A;
    private boolean B;
    private final dd.j C;
    private final dd.j D;

    /* JADX INFO: renamed from: c */
    private final e.a f10464c = new e.a();

    /* JADX INFO: renamed from: d */
    private final m0.r f10465d = new m0.r(new Runnable() { // from class: d.e
        @Override // java.lang.Runnable
        public final void run() {
            q.D0(this.f10424a);
        }
    });

    /* JADX INFO: renamed from: e */
    private final l1.h f10466e;

    /* JADX INFO: renamed from: f */
    private x0 f10467f;

    /* JADX INFO: renamed from: g */
    private final e f10468g;

    /* JADX INFO: renamed from: h */
    private final dd.j f10469h;

    /* JADX INFO: renamed from: r */
    private int f10470r;

    /* JADX INFO: renamed from: s */
    private final AtomicInteger f10471s;

    /* JADX INFO: renamed from: t */
    private final f.f f10472t;

    /* JADX INFO: renamed from: u */
    private final CopyOnWriteArrayList f10473u;

    /* JADX INFO: renamed from: v */
    private final CopyOnWriteArrayList f10474v;

    /* JADX INFO: renamed from: w */
    private final CopyOnWriteArrayList f10475w;

    /* JADX INFO: renamed from: x */
    private final CopyOnWriteArrayList f10476x;

    /* JADX INFO: renamed from: y */
    private final CopyOnWriteArrayList f10477y;

    /* JADX INFO: renamed from: z */
    private final CopyOnWriteArrayList f10478z;

    public static final class a implements androidx.lifecycle.q {
        a() {
        }

        @Override // androidx.lifecycle.q
        public void k(androidx.lifecycle.t tVar, m.a aVar) {
            rd.m.e(tVar, "source");
            rd.m.e(aVar, "event");
            q.this.x0();
            q.this.S0().d(this);
        }
    }

    private static final class b {

        /* JADX INFO: renamed from: a */
        public static final b f10480a = new b();

        private b() {
        }

        public final OnBackInvokedDispatcher a(Activity activity) {
            rd.m.e(activity, "activity");
            OnBackInvokedDispatcher onBackInvokedDispatcher = activity.getOnBackInvokedDispatcher();
            rd.m.d(onBackInvokedDispatcher, "getOnBackInvokedDispatcher(...)");
            return onBackInvokedDispatcher;
        }
    }

    private static final class c {
        public /* synthetic */ c(rd.h hVar) {
            this();
        }

        private c() {
        }
    }

    public static final class d {

        /* JADX INFO: renamed from: a */
        private Object f10481a;

        /* JADX INFO: renamed from: b */
        private x0 f10482b;

        public final x0 a() {
            return this.f10482b;
        }

        public final void b(Object obj) {
            this.f10481a = obj;
        }

        public final void c(x0 x0Var) {
            this.f10482b = x0Var;
        }
    }

    private interface e extends Executor {
        void S(View view);

        void e();
    }

    final class f implements e, ViewTreeObserver.OnDrawListener, Runnable {

        /* JADX INFO: renamed from: a */
        private final long f10483a = SystemClock.uptimeMillis() + ((long) 10000);

        /* JADX INFO: renamed from: b */
        private Runnable f10484b;

        /* JADX INFO: renamed from: c */
        private boolean f10485c;

        public f() {
        }

        public static final void b(f fVar) {
            Runnable runnable = fVar.f10484b;
            if (runnable != null) {
                rd.m.b(runnable);
                runnable.run();
                fVar.f10484b = null;
            }
        }

        @Override // d.q.e
        public void S(View view) {
            rd.m.e(view, "view");
            if (this.f10485c) {
                return;
            }
            this.f10485c = true;
            view.getViewTreeObserver().addOnDrawListener(this);
        }

        @Override // d.q.e
        public void e() {
            q.this.getWindow().getDecorView().removeCallbacks(this);
            q.this.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            rd.m.e(runnable, "runnable");
            this.f10484b = runnable;
            View decorView = q.this.getWindow().getDecorView();
            rd.m.d(decorView, "getDecorView(...)");
            if (!this.f10485c) {
                decorView.postOnAnimation(new Runnable() { // from class: d.r
                    @Override // java.lang.Runnable
                    public final void run() {
                        q.f.b(this.f10488a);
                    }
                });
            } else if (rd.m.a(Looper.myLooper(), Looper.getMainLooper())) {
                decorView.invalidate();
            } else {
                decorView.postInvalidate();
            }
        }

        @Override // android.view.ViewTreeObserver.OnDrawListener
        public void onDraw() {
            Runnable runnable = this.f10484b;
            if (runnable == null) {
                if (SystemClock.uptimeMillis() > this.f10483a) {
                    this.f10485c = false;
                    q.this.getWindow().getDecorView().post(this);
                    return;
                }
                return;
            }
            runnable.run();
            this.f10484b = null;
            if (q.this.A0().c()) {
                this.f10485c = false;
                q.this.getWindow().getDecorView().post(this);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            q.this.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
        }
    }

    public static final class g extends f.f {
        g() {
        }

        public static final void u(g gVar, int i10, a.C0189a c0189a) {
            gVar.g(i10, c0189a.a());
        }

        public static final void v(g gVar, int i10, IntentSender.SendIntentException sendIntentException) {
            gVar.f(i10, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", sendIntentException));
        }

        @Override // f.f
        public void k(final int i10, g.a aVar, Object obj, a0.c cVar) {
            Bundle bundleExtra;
            final int i11;
            rd.m.e(aVar, "contract");
            q qVar = q.this;
            final a.C0189a c0189aB = aVar.b(qVar, obj);
            if (c0189aB != null) {
                new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: d.s
                    @Override // java.lang.Runnable
                    public final void run() {
                        q.g.u(this.f10489a, i10, c0189aB);
                    }
                });
                return;
            }
            Intent intentA = aVar.a(qVar, obj);
            if (intentA.getExtras() != null) {
                Bundle extras = intentA.getExtras();
                rd.m.b(extras);
                if (extras.getClassLoader() == null) {
                    intentA.setExtrasClassLoader(qVar.getClassLoader());
                }
            }
            if (intentA.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
                bundleExtra = intentA.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                intentA.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            } else {
                bundleExtra = null;
            }
            Bundle bundle = bundleExtra;
            if (rd.m.a("androidx.activity.result.contract.action.REQUEST_PERMISSIONS", intentA.getAction())) {
                String[] stringArrayExtra = intentA.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
                if (stringArrayExtra == null) {
                    stringArrayExtra = new String[0];
                }
                a0.b.q(qVar, stringArrayExtra, i10);
                return;
            }
            if (!rd.m.a("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST", intentA.getAction())) {
                a0.b.s(qVar, intentA, i10, bundle);
                return;
            }
            f.h hVar = (f.h) intentA.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
            try {
                rd.m.b(hVar);
                i11 = i10;
            } catch (IntentSender.SendIntentException e10) {
                e = e10;
                i11 = i10;
            }
            try {
                a0.b.t(qVar, hVar.f(), i11, hVar.b(), hVar.c(), hVar.e(), 0, bundle);
                dd.d0 d0Var = dd.d0.f10897a;
            } catch (IntentSender.SendIntentException e11) {
                e = e11;
                final IntentSender.SendIntentException sendIntentException = e;
                new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: d.t
                    @Override // java.lang.Runnable
                    public final void run() {
                        q.g.v(this.f10492a, i11, sendIntentException);
                    }
                });
            }
        }
    }

    public q() {
        l1.h hVarB = l1.h.f20328c.b(this);
        this.f10466e = hVarB;
        this.f10468g = v0();
        this.f10469h = dd.k.b(new qd.a() { // from class: d.h
            @Override // qd.a
            public final Object a() {
                return q.y0(this.f10431a);
            }
        });
        this.f10471s = new AtomicInteger();
        this.f10472t = new g();
        this.f10473u = new CopyOnWriteArrayList();
        this.f10474v = new CopyOnWriteArrayList();
        this.f10475w = new CopyOnWriteArrayList();
        this.f10476x = new CopyOnWriteArrayList();
        this.f10477y = new CopyOnWriteArrayList();
        this.f10478z = new CopyOnWriteArrayList();
        if (S0() == null) {
            throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
        }
        S0().a(new androidx.lifecycle.q() { // from class: d.i
            @Override // androidx.lifecycle.q
            public final void k(androidx.lifecycle.t tVar, m.a aVar) {
                q.k0(this.f10432a, tVar, aVar);
            }
        });
        S0().a(new androidx.lifecycle.q() { // from class: d.j
            @Override // androidx.lifecycle.q
            public final void k(androidx.lifecycle.t tVar, m.a aVar) {
                q.l0(this.f10434a, tVar, aVar);
            }
        });
        S0().a(new a());
        hVarB.c();
        androidx.lifecycle.l0.c(this);
        if (Build.VERSION.SDK_INT <= 23) {
            S0().a(new a0(this));
        }
        e0().c("android:support:activity-result", new f.b() { // from class: d.k
            @Override // l1.f.b
            public final Bundle a() {
                return q.m0(this.f10455a);
            }
        });
        t0(new e.b() { // from class: d.l
            @Override // e.b
            public final void a(Context context) {
                q.n0(this.f10456a, context);
            }
        });
        this.C = dd.k.b(new qd.a() { // from class: d.m
            @Override // qd.a
            public final Object a() {
                return q.w0(this.f10459a);
            }
        });
        this.D = dd.k.b(new qd.a() { // from class: d.n
            @Override // qd.a
            public final Object a() {
                return q.E0(this.f10460a);
            }
        });
    }

    public static final void D0(q qVar) {
        qVar.C0();
    }

    public static final j0 E0(final q qVar) {
        final j0 j0Var = new j0(new Runnable() { // from class: d.o
            @Override // java.lang.Runnable
            public final void run() {
                q.F0(this.f10461a);
            }
        });
        if (Build.VERSION.SDK_INT >= 33) {
            if (!rd.m.a(Looper.myLooper(), Looper.getMainLooper())) {
                new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: d.p
                    @Override // java.lang.Runnable
                    public final void run() {
                        q.G0(this.f10462a, j0Var);
                    }
                });
                return j0Var;
            }
            qVar.r0(j0Var);
        }
        return j0Var;
    }

    public static final void F0(q qVar) {
        try {
            super.onBackPressed();
        } catch (IllegalStateException e10) {
            if (!rd.m.a(e10.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                throw e10;
            }
        } catch (NullPointerException e11) {
            if (!rd.m.a(e11.getMessage(), "Attempt to invoke virtual method 'android.os.Handler android.app.FragmentHostCallback.getHandler()' on a null object reference")) {
                throw e11;
            }
        }
    }

    public static final void G0(q qVar, j0 j0Var) {
        qVar.r0(j0Var);
    }

    public static final void k0(q qVar, androidx.lifecycle.t tVar, m.a aVar) {
        Window window;
        View viewPeekDecorView;
        rd.m.e(tVar, "<unused var>");
        rd.m.e(aVar, "event");
        if (aVar != m.a.ON_STOP || (window = qVar.getWindow()) == null || (viewPeekDecorView = window.peekDecorView()) == null) {
            return;
        }
        viewPeekDecorView.cancelPendingInputEvents();
    }

    public static final void l0(q qVar, androidx.lifecycle.t tVar, m.a aVar) {
        rd.m.e(tVar, "<unused var>");
        rd.m.e(aVar, "event");
        if (aVar == m.a.ON_DESTROY) {
            qVar.f10464c.b();
            if (!qVar.isChangingConfigurations()) {
                qVar.U().a();
            }
            qVar.f10468g.e();
        }
    }

    public static final Bundle m0(q qVar) {
        Bundle bundle = new Bundle();
        qVar.f10472t.m(bundle);
        return bundle;
    }

    public static final void n0(q qVar, Context context) {
        rd.m.e(context, "it");
        Bundle bundleA = qVar.e0().a("android:support:activity-result");
        if (bundleA != null) {
            qVar.f10472t.l(bundleA);
        }
    }

    private final void r0(final j0 j0Var) {
        S0().a(new androidx.lifecycle.q() { // from class: d.g
            @Override // androidx.lifecycle.q
            public final void k(androidx.lifecycle.t tVar, m.a aVar) {
                q.s0(j0Var, this, tVar, aVar);
            }
        });
    }

    public static final void s0(j0 j0Var, q qVar, androidx.lifecycle.t tVar, m.a aVar) {
        rd.m.e(tVar, "<unused var>");
        rd.m.e(aVar, "event");
        if (aVar == m.a.ON_CREATE) {
            j0Var.u(b.f10480a.a(qVar));
        }
    }

    private final e v0() {
        return new f();
    }

    public static final p0 w0(q qVar) {
        return new p0(qVar.getApplication(), qVar, qVar.getIntent() != null ? qVar.getIntent().getExtras() : null);
    }

    public final void x0() {
        if (this.f10467f == null) {
            d dVar = (d) getLastNonConfigurationInstance();
            if (dVar != null) {
                this.f10467f = dVar.a();
            }
            if (this.f10467f == null) {
                this.f10467f = new x0();
            }
        }
    }

    public static final x y0(final q qVar) {
        return new x(qVar.f10468g, new qd.a() { // from class: d.f
            @Override // qd.a
            public final Object a() {
                return q.z0(this.f10426a);
            }
        });
    }

    public static final dd.d0 z0(q qVar) {
        qVar.reportFullyDrawn();
        return dd.d0.f10897a;
    }

    @Override // androidx.lifecycle.k
    public v0.c A() {
        return (v0.c) this.C.getValue();
    }

    public x A0() {
        return (x) this.f10469h.getValue();
    }

    @Override // androidx.lifecycle.k
    public e1.a B() {
        e1.b bVar = new e1.b(null, 1, null);
        if (getApplication() != null) {
            bVar.c(v0.a.f2702g, getApplication());
        }
        bVar.c(androidx.lifecycle.l0.f2645a, this);
        bVar.c(androidx.lifecycle.l0.f2646b, this);
        Intent intent = getIntent();
        Bundle extras = intent != null ? intent.getExtras() : null;
        if (extras != null) {
            bVar.c(androidx.lifecycle.l0.f2647c, extras);
        }
        return bVar;
    }

    public void B0() {
        View decorView = getWindow().getDecorView();
        rd.m.d(decorView, "getDecorView(...)");
        z0.a(decorView, this);
        View decorView2 = getWindow().getDecorView();
        rd.m.d(decorView2, "getDecorView(...)");
        a1.a(decorView2, this);
        View decorView3 = getWindow().getDecorView();
        rd.m.d(decorView3, "getDecorView(...)");
        l1.m.a(decorView3, this);
        View decorView4 = getWindow().getDecorView();
        rd.m.d(decorView4, "getDecorView(...)");
        n0.a(decorView4, this);
        View decorView5 = getWindow().getDecorView();
        rd.m.d(decorView5, "getDecorView(...)");
        m0.a(decorView5, this);
    }

    public void C0() {
        invalidateOptionsMenu();
    }

    @Override // a0.o
    public final void E(l0.a aVar) {
        rd.m.e(aVar, "listener");
        this.f10476x.remove(aVar);
    }

    @Override // b0.e
    public final void H(l0.a aVar) {
        rd.m.e(aVar, "listener");
        this.f10473u.add(aVar);
    }

    public Object H0() {
        return null;
    }

    @Override // a0.o
    public final void I(l0.a aVar) {
        rd.m.e(aVar, "listener");
        this.f10476x.add(aVar);
    }

    @Override // b0.f
    public final void J(l0.a aVar) {
        rd.m.e(aVar, "listener");
        this.f10474v.add(aVar);
    }

    @Override // a0.p
    public final void L(l0.a aVar) {
        rd.m.e(aVar, "listener");
        this.f10477y.add(aVar);
    }

    @Override // b0.f
    public final void Q(l0.a aVar) {
        rd.m.e(aVar, "listener");
        this.f10474v.remove(aVar);
    }

    @Override // a0.g, androidx.lifecycle.t
    public androidx.lifecycle.m S0() {
        return super.S0();
    }

    @Override // androidx.lifecycle.y0
    public x0 U() {
        if (getApplication() == null) {
            throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
        }
        x0();
        x0 x0Var = this.f10467f;
        rd.m.b(x0Var);
        return x0Var;
    }

    @Override // android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        B0();
        e eVar = this.f10468g;
        View decorView = getWindow().getDecorView();
        rd.m.d(decorView, "getDecorView(...)");
        eVar.S(decorView);
        super.addContentView(view, layoutParams);
    }

    @Override // m0.o
    public void addMenuProvider(m0.u uVar) {
        rd.m.e(uVar, "provider");
        this.f10465d.c(uVar);
    }

    @Override // d.k0
    public final j0 d() {
        return (j0) this.D.getValue();
    }

    @Override // l1.i
    public final l1.f e0() {
        return this.f10466e.b();
    }

    @Override // b0.e
    public final void i(l0.a aVar) {
        rd.m.e(aVar, "listener");
        this.f10473u.remove(aVar);
    }

    @Override // f.g
    public final f.f l() {
        return this.f10472t;
    }

    @Override // android.app.Activity
    protected void onActivityResult(int i10, int i11, Intent intent) {
        if (this.f10472t.f(i10, i11, intent)) {
            return;
        }
        super.onActivityResult(i10, i11, intent);
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        d().r();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        rd.m.e(configuration, "newConfig");
        super.onConfigurationChanged(configuration);
        Iterator it = this.f10473u.iterator();
        rd.m.d(it, "iterator(...)");
        while (it.hasNext()) {
            ((l0.a) it.next()).accept(configuration);
        }
    }

    @Override // a0.g, android.app.Activity
    protected void onCreate(Bundle bundle) {
        this.f10466e.d(bundle);
        this.f10464c.c(this);
        super.onCreate(bundle);
        androidx.lifecycle.h0.INSTANCE.c(this);
        int i10 = this.f10470r;
        if (i10 != 0) {
            setContentView(i10);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onCreatePanelMenu(int i10, Menu menu) {
        rd.m.e(menu, "menu");
        if (i10 != 0) {
            return true;
        }
        super.onCreatePanelMenu(i10, menu);
        this.f10465d.f(menu, getMenuInflater());
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i10, MenuItem menuItem) {
        rd.m.e(menuItem, "item");
        if (super.onMenuItemSelected(i10, menuItem)) {
            return true;
        }
        if (i10 == 0) {
            return this.f10465d.h(menuItem);
        }
        return false;
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean z10) {
        if (this.A) {
            return;
        }
        Iterator it = this.f10476x.iterator();
        rd.m.d(it, "iterator(...)");
        while (it.hasNext()) {
            ((l0.a) it.next()).accept(new a0.h(z10));
        }
    }

    @Override // android.app.Activity
    protected void onNewIntent(Intent intent) {
        rd.m.e(intent, "intent");
        super.onNewIntent(intent);
        Iterator it = this.f10475w.iterator();
        rd.m.d(it, "iterator(...)");
        while (it.hasNext()) {
            ((l0.a) it.next()).accept(intent);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i10, Menu menu) {
        rd.m.e(menu, "menu");
        this.f10465d.g(menu);
        super.onPanelClosed(i10, menu);
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean z10) {
        if (this.B) {
            return;
        }
        Iterator it = this.f10477y.iterator();
        rd.m.d(it, "iterator(...)");
        while (it.hasNext()) {
            ((l0.a) it.next()).accept(new a0.s(z10));
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onPreparePanel(int i10, View view, Menu menu) {
        rd.m.e(menu, "menu");
        if (i10 != 0) {
            return true;
        }
        super.onPreparePanel(i10, view, menu);
        this.f10465d.i(menu);
        return true;
    }

    @Override // android.app.Activity, a0.b.e
    public void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        rd.m.e(strArr, "permissions");
        rd.m.e(iArr, "grantResults");
        if (this.f10472t.f(i10, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr)) || Build.VERSION.SDK_INT < 23) {
            return;
        }
        super.onRequestPermissionsResult(i10, strArr, iArr);
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        d dVar;
        Object objH0 = H0();
        x0 x0VarA = this.f10467f;
        if (x0VarA == null && (dVar = (d) getLastNonConfigurationInstance()) != null) {
            x0VarA = dVar.a();
        }
        if (x0VarA == null && objH0 == null) {
            return null;
        }
        d dVar2 = new d();
        dVar2.b(objH0);
        dVar2.c(x0VarA);
        return dVar2;
    }

    @Override // a0.g, android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
        rd.m.e(bundle, "outState");
        if (S0() instanceof androidx.lifecycle.v) {
            androidx.lifecycle.m mVarS0 = S0();
            rd.m.c(mVarS0, "null cannot be cast to non-null type androidx.lifecycle.LifecycleRegistry");
            ((androidx.lifecycle.v) mVarS0).n(m.b.f2653c);
        }
        super.onSaveInstanceState(bundle);
        this.f10466e.e(bundle);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public void onTrimMemory(int i10) {
        super.onTrimMemory(i10);
        Iterator it = this.f10474v.iterator();
        rd.m.d(it, "iterator(...)");
        while (it.hasNext()) {
            ((l0.a) it.next()).accept(Integer.valueOf(i10));
        }
    }

    @Override // android.app.Activity
    protected void onUserLeaveHint() {
        super.onUserLeaveHint();
        Iterator it = this.f10478z.iterator();
        rd.m.d(it, "iterator(...)");
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
    }

    public void q0(m0.u uVar, androidx.lifecycle.t tVar) {
        rd.m.e(uVar, "provider");
        rd.m.e(tVar, "owner");
        this.f10465d.d(uVar, tVar);
    }

    @Override // m0.o
    public void removeMenuProvider(m0.u uVar) {
        rd.m.e(uVar, "provider");
        this.f10465d.j(uVar);
    }

    @Override // android.app.Activity
    public void reportFullyDrawn() {
        try {
            if (p1.a.d()) {
                p1.a.a("reportFullyDrawn() for ComponentActivity");
            }
            super.reportFullyDrawn();
            A0().b();
            p1.a.b();
        } catch (Throwable th2) {
            p1.a.b();
            throw th2;
        }
    }

    @Override // android.app.Activity
    public void setContentView(int i10) {
        B0();
        e eVar = this.f10468g;
        View decorView = getWindow().getDecorView();
        rd.m.d(decorView, "getDecorView(...)");
        eVar.S(decorView);
        super.setContentView(i10);
    }

    @Override // android.app.Activity
    public void startActivityForResult(Intent intent, int i10) {
        rd.m.e(intent, "intent");
        super.startActivityForResult(intent, i10);
    }

    @Override // android.app.Activity
    public void startIntentSenderForResult(IntentSender intentSender, int i10, Intent intent, int i11, int i12, int i13) throws IntentSender.SendIntentException {
        rd.m.e(intentSender, "intent");
        super.startIntentSenderForResult(intentSender, i10, intent, i11, i12, i13);
    }

    @Override // a0.p
    public final void t(l0.a aVar) {
        rd.m.e(aVar, "listener");
        this.f10477y.remove(aVar);
    }

    public final void t0(e.b bVar) {
        rd.m.e(bVar, "listener");
        this.f10464c.a(bVar);
    }

    public final void u0(l0.a aVar) {
        rd.m.e(aVar, "listener");
        this.f10475w.add(aVar);
    }

    @Override // m0.o
    public void addMenuProvider(m0.u uVar, androidx.lifecycle.t tVar, m.b bVar) {
        rd.m.e(uVar, "provider");
        rd.m.e(tVar, "owner");
        rd.m.e(bVar, "state");
        this.f10465d.e(uVar, tVar, bVar);
    }

    @Override // android.app.Activity
    public void startActivityForResult(Intent intent, int i10, Bundle bundle) {
        rd.m.e(intent, "intent");
        super.startActivityForResult(intent, i10, bundle);
    }

    @Override // android.app.Activity
    public void startIntentSenderForResult(IntentSender intentSender, int i10, Intent intent, int i11, int i12, int i13, Bundle bundle) throws IntentSender.SendIntentException {
        rd.m.e(intentSender, "intent");
        super.startIntentSenderForResult(intentSender, i10, intent, i11, i12, i13, bundle);
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean z10, Configuration configuration) {
        rd.m.e(configuration, "newConfig");
        this.A = true;
        try {
            super.onMultiWindowModeChanged(z10, configuration);
            this.A = false;
            Iterator it = this.f10476x.iterator();
            rd.m.d(it, "iterator(...)");
            while (it.hasNext()) {
                ((l0.a) it.next()).accept(new a0.h(z10, configuration));
            }
        } catch (Throwable th2) {
            this.A = false;
            throw th2;
        }
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean z10, Configuration configuration) {
        rd.m.e(configuration, "newConfig");
        this.B = true;
        try {
            super.onPictureInPictureModeChanged(z10, configuration);
            this.B = false;
            Iterator it = this.f10477y.iterator();
            rd.m.d(it, "iterator(...)");
            while (it.hasNext()) {
                ((l0.a) it.next()).accept(new a0.s(z10, configuration));
            }
        } catch (Throwable th2) {
            this.B = false;
            throw th2;
        }
    }

    @Override // android.app.Activity
    public void setContentView(View view) {
        B0();
        e eVar = this.f10468g;
        View decorView = getWindow().getDecorView();
        rd.m.d(decorView, "getDecorView(...)");
        eVar.S(decorView);
        super.setContentView(view);
    }

    @Override // android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        B0();
        e eVar = this.f10468g;
        View decorView = getWindow().getDecorView();
        rd.m.d(decorView, "getDecorView(...)");
        eVar.S(decorView);
        super.setContentView(view, layoutParams);
    }
}
