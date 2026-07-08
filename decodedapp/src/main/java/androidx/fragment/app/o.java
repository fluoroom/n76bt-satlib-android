package androidx.fragment.app;

import android.animation.Animator;
import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.lifecycle.a1;
import androidx.lifecycle.m;
import androidx.lifecycle.p0;
import androidx.lifecycle.v0;
import androidx.lifecycle.x0;
import androidx.lifecycle.y0;
import androidx.lifecycle.z0;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public abstract class o implements ComponentCallbacks, View.OnCreateContextMenuListener, androidx.lifecycle.t, y0, androidx.lifecycle.k, l1.i {

    /* JADX INFO: renamed from: n0 */
    static final Object f2373n0 = new Object();
    boolean A;
    boolean B;
    boolean C;
    int D;
    w E;
    t F;
    o H;
    int I;
    int J;
    String K;
    boolean L;
    boolean M;
    boolean N;
    boolean O;
    boolean P;
    private boolean R;
    ViewGroup S;
    View T;
    boolean U;
    j W;
    Handler X;
    boolean Z;

    /* JADX INFO: renamed from: a0 */
    LayoutInflater f2375a0;

    /* JADX INFO: renamed from: b */
    Bundle f2376b;

    /* JADX INFO: renamed from: b0 */
    boolean f2377b0;

    /* JADX INFO: renamed from: c */
    SparseArray f2378c;

    /* JADX INFO: renamed from: c0 */
    public String f2379c0;

    /* JADX INFO: renamed from: d */
    Bundle f2380d;

    /* JADX INFO: renamed from: e */
    Boolean f2382e;

    /* JADX INFO: renamed from: e0 */
    androidx.lifecycle.v f2383e0;

    /* JADX INFO: renamed from: f0 */
    h0 f2385f0;

    /* JADX INFO: renamed from: g */
    Bundle f2386g;

    /* JADX INFO: renamed from: h */
    o f2388h;

    /* JADX INFO: renamed from: h0 */
    v0.c f2389h0;

    /* JADX INFO: renamed from: i0 */
    l1.h f2390i0;

    /* JADX INFO: renamed from: j0 */
    private int f2391j0;

    /* JADX INFO: renamed from: s */
    int f2396s;

    /* JADX INFO: renamed from: u */
    boolean f2398u;

    /* JADX INFO: renamed from: v */
    boolean f2399v;

    /* JADX INFO: renamed from: w */
    boolean f2400w;

    /* JADX INFO: renamed from: x */
    boolean f2401x;

    /* JADX INFO: renamed from: y */
    boolean f2402y;

    /* JADX INFO: renamed from: z */
    boolean f2403z;

    /* JADX INFO: renamed from: a */
    int f2374a = -1;

    /* JADX INFO: renamed from: f */
    String f2384f = UUID.randomUUID().toString();

    /* JADX INFO: renamed from: r */
    String f2395r = null;

    /* JADX INFO: renamed from: t */
    private Boolean f2397t = null;
    w G = new x();
    boolean Q = true;
    boolean V = true;
    Runnable Y = new b();

    /* JADX INFO: renamed from: d0 */
    m.b f2381d0 = m.b.f2655e;

    /* JADX INFO: renamed from: g0 */
    androidx.lifecycle.b0 f2387g0 = new androidx.lifecycle.b0();

    /* JADX INFO: renamed from: k0 */
    private final AtomicInteger f2392k0 = new AtomicInteger();

    /* JADX INFO: renamed from: l0 */
    private final ArrayList f2393l0 = new ArrayList();

    /* JADX INFO: renamed from: m0 */
    private final l f2394m0 = new c();

    class a extends f.c {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ AtomicReference f2404a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ g.a f2405b;

        a(AtomicReference atomicReference, g.a aVar) {
            this.f2404a = atomicReference;
            this.f2405b = aVar;
        }

        @Override // f.c
        public void b(Object obj, a0.c cVar) {
            f.c cVar2 = (f.c) this.f2404a.get();
            if (cVar2 == null) {
                throw new IllegalStateException("Operation cannot be started before fragment is in created state");
            }
            cVar2.b(obj, cVar);
        }

        @Override // f.c
        public void c() {
            f.c cVar = (f.c) this.f2404a.getAndSet(null);
            if (cVar != null) {
                cVar.c();
            }
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            o.this.R3();
        }
    }

    class c extends l {
        c() {
            super(null);
        }

        @Override // androidx.fragment.app.o.l
        void a() {
            o.this.f2390i0.c();
            androidx.lifecycle.l0.c(o.this);
            Bundle bundle = o.this.f2376b;
            o.this.f2390i0.d(bundle != null ? bundle.getBundle("registryState") : null);
        }
    }

    class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            o.this.Y0(false);
        }
    }

    class e implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ m0 f2410a;

        e(m0 m0Var) {
            this.f2410a = m0Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f2410a.y()) {
                this.f2410a.n();
            }
        }
    }

    class f extends y0.g {
        f() {
        }

        @Override // y0.g
        public View c(int i10) {
            View view = o.this.T;
            if (view != null) {
                return view.findViewById(i10);
            }
            throw new IllegalStateException("Fragment " + o.this + " does not have a view");
        }

        @Override // y0.g
        public boolean e() {
            return o.this.T != null;
        }
    }

    class g implements androidx.lifecycle.q {
        g() {
        }

        @Override // androidx.lifecycle.q
        public void k(androidx.lifecycle.t tVar, m.a aVar) {
            View view;
            if (aVar != m.a.ON_STOP || (view = o.this.T) == null) {
                return;
            }
            view.cancelPendingInputEvents();
        }
    }

    class h implements n.a {
        h() {
        }

        @Override // n.a
        /* JADX INFO: renamed from: a */
        public f.f apply(Void r32) {
            o oVar = o.this;
            Object obj = oVar.F;
            return obj instanceof f.g ? ((f.g) obj).l() : oVar.v3().l();
        }
    }

    class i extends l {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ n.a f2415a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ AtomicReference f2416b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ g.a f2417c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ f.b f2418d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(n.a aVar, AtomicReference atomicReference, g.a aVar2, f.b bVar) {
            super(null);
            this.f2415a = aVar;
            this.f2416b = atomicReference;
            this.f2417c = aVar2;
            this.f2418d = bVar;
        }

        @Override // androidx.fragment.app.o.l
        void a() {
            String strD1 = o.this.d1();
            this.f2416b.set(((f.f) this.f2415a.apply(null)).n(strD1, o.this, this.f2417c, this.f2418d));
        }
    }

    static class j {

        /* JADX INFO: renamed from: a */
        View f2420a;

        /* JADX INFO: renamed from: b */
        boolean f2421b;

        /* JADX INFO: renamed from: c */
        int f2422c;

        /* JADX INFO: renamed from: d */
        int f2423d;

        /* JADX INFO: renamed from: e */
        int f2424e;

        /* JADX INFO: renamed from: f */
        int f2425f;

        /* JADX INFO: renamed from: g */
        int f2426g;

        /* JADX INFO: renamed from: h */
        ArrayList f2427h;

        /* JADX INFO: renamed from: i */
        ArrayList f2428i;

        /* JADX INFO: renamed from: j */
        Object f2429j = null;

        /* JADX INFO: renamed from: k */
        Object f2430k;

        /* JADX INFO: renamed from: l */
        Object f2431l;

        /* JADX INFO: renamed from: m */
        Object f2432m;

        /* JADX INFO: renamed from: n */
        Object f2433n;

        /* JADX INFO: renamed from: o */
        Object f2434o;

        /* JADX INFO: renamed from: p */
        Boolean f2435p;

        /* JADX INFO: renamed from: q */
        Boolean f2436q;

        /* JADX INFO: renamed from: r */
        float f2437r;

        /* JADX INFO: renamed from: s */
        View f2438s;

        /* JADX INFO: renamed from: t */
        boolean f2439t;

        j() {
            Object obj = o.f2373n0;
            this.f2430k = obj;
            this.f2431l = null;
            this.f2432m = obj;
            this.f2433n = null;
            this.f2434o = obj;
            this.f2437r = 1.0f;
            this.f2438s = null;
        }
    }

    public static class k extends RuntimeException {
        public k(String str, Exception exc) {
            super(str, exc);
        }
    }

    private static abstract class l {
        private l() {
        }

        abstract void a();

        /* synthetic */ l(b bVar) {
            this();
        }
    }

    public o() {
        W1();
    }

    private void B3() {
        if (w.J0(3)) {
            Log.d("FragmentManager", "moveto RESTORE_VIEW_STATE: " + this);
        }
        if (this.T != null) {
            Bundle bundle = this.f2376b;
            C3(bundle != null ? bundle.getBundle("savedInstanceState") : null);
        }
        this.f2376b = null;
    }

    private o Q1(boolean z10) {
        String str;
        if (z10) {
            z0.c.h(this);
        }
        o oVar = this.f2388h;
        if (oVar != null) {
            return oVar;
        }
        w wVar = this.E;
        if (wVar == null || (str = this.f2395r) == null) {
            return null;
        }
        return wVar.g0(str);
    }

    private void W1() {
        this.f2383e0 = new androidx.lifecycle.v(this);
        this.f2390i0 = l1.h.a(this);
        this.f2389h0 = null;
        if (this.f2393l0.contains(this.f2394m0)) {
            return;
        }
        t3(this.f2394m0);
    }

    public static /* synthetic */ void X0(o oVar) {
        oVar.f2385f0.e(oVar.f2380d);
        oVar.f2380d = null;
    }

    public static o Y1(Context context, String str) {
        return Z1(context, str, null);
    }

    public static o Z1(Context context, String str, Bundle bundle) {
        try {
            o oVar = (o) s.d(context.getClassLoader(), str).getConstructor(null).newInstance(null);
            if (bundle == null) {
                return oVar;
            }
            bundle.setClassLoader(oVar.getClass().getClassLoader());
            oVar.E3(bundle);
            return oVar;
        } catch (IllegalAccessException e10) {
            throw new k("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e10);
        } catch (InstantiationException e11) {
            throw new k("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e11);
        } catch (NoSuchMethodException e12) {
            throw new k("Unable to instantiate fragment " + str + ": could not find Fragment constructor", e12);
        } catch (InvocationTargetException e13) {
            throw new k("Unable to instantiate fragment " + str + ": calling Fragment constructor caused an exception", e13);
        }
    }

    private j b1() {
        if (this.W == null) {
            this.W = new j();
        }
        return this.W;
    }

    private f.c q3(g.a aVar, n.a aVar2, f.b bVar) {
        if (this.f2374a <= 1) {
            AtomicReference atomicReference = new AtomicReference();
            t3(new i(aVar2, atomicReference, aVar, bVar));
            return new a(atomicReference, aVar);
        }
        throw new IllegalStateException("Fragment " + this + " is attempting to registerForActivityResult after being created. Fragments must call registerForActivityResult() before they are created (i.e. initialization, onAttach(), or onCreate()).");
    }

    private void t3(l lVar) {
        if (this.f2374a >= 0) {
            lVar.a();
        } else {
            this.f2393l0.add(lVar);
        }
    }

    private int y1() {
        m.b bVar = this.f2381d0;
        return (bVar == m.b.f2652b || this.H == null) ? bVar.ordinal() : Math.min(bVar.ordinal(), this.H.y1());
    }

    @Override // androidx.lifecycle.k
    public v0.c A() {
        Application application;
        if (this.E == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        }
        if (this.f2389h0 == null) {
            Context applicationContext = x3().getApplicationContext();
            while (true) {
                if (!(applicationContext instanceof ContextWrapper)) {
                    application = null;
                    break;
                }
                if (applicationContext instanceof Application) {
                    application = (Application) applicationContext;
                    break;
                }
                applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
            }
            if (application == null && w.J0(3)) {
                Log.d("FragmentManager", "Could not find Application instance from Context " + x3().getApplicationContext() + ", you will need CreationExtras to use AndroidViewModel with the default ViewModelProvider.Factory");
            }
            this.f2389h0 = new p0(application, this, i1());
        }
        return this.f2389h0;
    }

    public final o A1() {
        return this.H;
    }

    public LayoutInflater A2(Bundle bundle) {
        return w1(bundle);
    }

    void A3() {
        Bundle bundle;
        Bundle bundle2 = this.f2376b;
        if (bundle2 == null || (bundle = bundle2.getBundle("childFragmentManager")) == null) {
            return;
        }
        this.G.h1(bundle);
        this.G.C();
    }

    @Override // androidx.lifecycle.k
    public e1.a B() {
        Application application;
        Context applicationContext = x3().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            }
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            }
            applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
        }
        if (application == null && w.J0(3)) {
            Log.d("FragmentManager", "Could not find Application instance from Context " + x3().getApplicationContext() + ", you will not be able to use AndroidViewModel with the default ViewModelProvider.Factory");
        }
        e1.b bVar = new e1.b();
        if (application != null) {
            bVar.c(v0.a.f2702g, application);
        }
        bVar.c(androidx.lifecycle.l0.f2645a, this);
        bVar.c(androidx.lifecycle.l0.f2646b, this);
        if (i1() != null) {
            bVar.c(androidx.lifecycle.l0.f2647c, i1());
        }
        return bVar;
    }

    public final w B1() {
        w wVar = this.E;
        if (wVar != null) {
            return wVar;
        }
        throw new IllegalStateException("Fragment " + this + " not associated with a fragment manager.");
    }

    public void B2(boolean z10) {
    }

    boolean C1() {
        j jVar = this.W;
        if (jVar == null) {
            return false;
        }
        return jVar.f2421b;
    }

    public void C2(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        this.R = true;
    }

    final void C3(Bundle bundle) {
        SparseArray<Parcelable> sparseArray = this.f2378c;
        if (sparseArray != null) {
            this.T.restoreHierarchyState(sparseArray);
            this.f2378c = null;
        }
        this.R = false;
        R2(bundle);
        if (this.R) {
            if (this.T != null) {
                this.f2385f0.a(m.a.ON_CREATE);
            }
        } else {
            throw new o0("Fragment " + this + " did not call through to super.onViewStateRestored()");
        }
    }

    int D1() {
        j jVar = this.W;
        if (jVar == null) {
            return 0;
        }
        return jVar.f2424e;
    }

    public void D2(Context context, AttributeSet attributeSet, Bundle bundle) {
        this.R = true;
        t tVar = this.F;
        Activity activityF = tVar == null ? null : tVar.f();
        if (activityF != null) {
            this.R = false;
            C2(activityF, attributeSet, bundle);
        }
    }

    void D3(int i10, int i11, int i12, int i13) {
        if (this.W == null && i10 == 0 && i11 == 0 && i12 == 0 && i13 == 0) {
            return;
        }
        b1().f2422c = i10;
        b1().f2423d = i11;
        b1().f2424e = i12;
        b1().f2425f = i13;
    }

    int E1() {
        j jVar = this.W;
        if (jVar == null) {
            return 0;
        }
        return jVar.f2425f;
    }

    public void E2(boolean z10) {
    }

    public void E3(Bundle bundle) {
        if (this.E != null && i2()) {
            throw new IllegalStateException("Fragment already added and state has been saved");
        }
        this.f2386g = bundle;
    }

    float F1() {
        j jVar = this.W;
        if (jVar == null) {
            return 1.0f;
        }
        return jVar.f2437r;
    }

    public boolean F2(MenuItem menuItem) {
        return false;
    }

    void F3(View view) {
        b1().f2438s = view;
    }

    public Object G1() {
        j jVar = this.W;
        if (jVar == null) {
            return null;
        }
        Object obj = jVar.f2432m;
        return obj == f2373n0 ? p1() : obj;
    }

    public void G2(Menu menu) {
    }

    public void G3(boolean z10) {
        if (this.P != z10) {
            this.P = z10;
            if (!a2() || c2()) {
                return;
            }
            this.F.r();
        }
    }

    public final Resources H1() {
        return x3().getResources();
    }

    public void H2() {
        this.R = true;
    }

    public void H3(boolean z10) {
        if (this.Q != z10) {
            this.Q = z10;
            if (this.P && a2() && !c2()) {
                this.F.r();
            }
        }
    }

    public Object I1() {
        j jVar = this.W;
        if (jVar == null) {
            return null;
        }
        Object obj = jVar.f2430k;
        return obj == f2373n0 ? m1() : obj;
    }

    public void I2(boolean z10) {
    }

    void I3(int i10) {
        if (this.W == null && i10 == 0) {
            return;
        }
        b1();
        this.W.f2426g = i10;
    }

    public Object J1() {
        j jVar = this.W;
        if (jVar == null) {
            return null;
        }
        return jVar.f2433n;
    }

    public void J2(Menu menu) {
    }

    void J3(boolean z10) {
        if (this.W == null) {
            return;
        }
        b1().f2421b = z10;
    }

    public Object K1() {
        j jVar = this.W;
        if (jVar == null) {
            return null;
        }
        Object obj = jVar.f2434o;
        return obj == f2373n0 ? J1() : obj;
    }

    public void K2(boolean z10) {
    }

    void K3(float f10) {
        b1().f2437r = f10;
    }

    ArrayList L1() {
        ArrayList arrayList;
        j jVar = this.W;
        return (jVar == null || (arrayList = jVar.f2427h) == null) ? new ArrayList() : arrayList;
    }

    public void L2(int i10, String[] strArr, int[] iArr) {
    }

    void L3(ArrayList arrayList, ArrayList arrayList2) {
        b1();
        j jVar = this.W;
        jVar.f2427h = arrayList;
        jVar.f2428i = arrayList2;
    }

    ArrayList M1() {
        ArrayList arrayList;
        j jVar = this.W;
        return (jVar == null || (arrayList = jVar.f2428i) == null) ? new ArrayList() : arrayList;
    }

    public void M2() {
        this.R = true;
    }

    public void M3(boolean z10) {
        z0.c.i(this, z10);
        if (!this.V && z10 && this.f2374a < 5 && this.E != null && a2() && this.f2377b0) {
            w wVar = this.E;
            wVar.W0(wVar.w(this));
        }
        this.V = z10;
        this.U = this.f2374a < 5 && !z10;
        if (this.f2376b != null) {
            this.f2382e = Boolean.valueOf(z10);
        }
    }

    public final String N1(int i10) {
        return H1().getString(i10);
    }

    public void N2(Bundle bundle) {
    }

    public boolean N3(String str) {
        t tVar = this.F;
        if (tVar != null) {
            return tVar.p(str);
        }
        return false;
    }

    public final String O1(int i10, Object... objArr) {
        return H1().getString(i10, objArr);
    }

    public void O2() {
        this.R = true;
    }

    public void O3(Intent intent) {
        P3(intent, null);
    }

    public final String P1() {
        return this.K;
    }

    public void P2() {
        this.R = true;
    }

    public void P3(Intent intent, Bundle bundle) {
        t tVar = this.F;
        if (tVar != null) {
            tVar.q(this, intent, -1, bundle);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    public void Q2(View view, Bundle bundle) {
    }

    public void Q3(Intent intent, int i10, Bundle bundle) {
        if (this.F != null) {
            B1().S0(this, intent, i10, bundle);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    public final CharSequence R1(int i10) {
        return H1().getText(i10);
    }

    public void R2(Bundle bundle) {
        this.R = true;
    }

    public void R3() {
        if (this.W == null || !b1().f2439t) {
            return;
        }
        if (this.F == null) {
            b1().f2439t = false;
        } else if (Looper.myLooper() != this.F.j().getLooper()) {
            this.F.j().postAtFrontOfQueue(new d());
        } else {
            Y0(true);
        }
    }

    @Override // androidx.lifecycle.t
    public androidx.lifecycle.m S0() {
        return this.f2383e0;
    }

    public boolean S1() {
        return this.V;
    }

    void S2(Bundle bundle) {
        this.G.U0();
        this.f2374a = 3;
        this.R = false;
        l2(bundle);
        if (this.R) {
            B3();
            this.G.y();
        } else {
            throw new o0("Fragment " + this + " did not call through to super.onActivityCreated()");
        }
    }

    public View T1() {
        return this.T;
    }

    void T2() {
        Iterator it = this.f2393l0.iterator();
        while (it.hasNext()) {
            ((l) it.next()).a();
        }
        this.f2393l0.clear();
        this.G.m(this.F, Z0(), this);
        this.f2374a = 0;
        this.R = false;
        o2(this.F.g());
        if (this.R) {
            this.E.I(this);
            this.G.z();
        } else {
            throw new o0("Fragment " + this + " did not call through to super.onAttach()");
        }
    }

    @Override // androidx.lifecycle.y0
    public x0 U() {
        if (this.E == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        }
        if (y1() != m.b.f2652b.ordinal()) {
            return this.E.E0(this);
        }
        throw new IllegalStateException("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
    }

    public androidx.lifecycle.t U1() {
        h0 h0Var = this.f2385f0;
        if (h0Var != null) {
            return h0Var;
        }
        throw new IllegalStateException("Can't access the Fragment View's LifecycleOwner for " + this + " when getView() is null i.e., before onCreateView() or after onDestroyView()");
    }

    void U2(Configuration configuration) {
        onConfigurationChanged(configuration);
    }

    public androidx.lifecycle.z V1() {
        return this.f2387g0;
    }

    boolean V2(MenuItem menuItem) {
        if (this.L) {
            return false;
        }
        if (q2(menuItem)) {
            return true;
        }
        return this.G.B(menuItem);
    }

    void W2(Bundle bundle) {
        this.G.U0();
        this.f2374a = 1;
        this.R = false;
        this.f2383e0.a(new g());
        r2(bundle);
        this.f2377b0 = true;
        if (this.R) {
            this.f2383e0.i(m.a.ON_CREATE);
            return;
        }
        throw new o0("Fragment " + this + " did not call through to super.onCreate()");
    }

    void X1() {
        W1();
        this.f2379c0 = this.f2384f;
        this.f2384f = UUID.randomUUID().toString();
        this.f2398u = false;
        this.f2399v = false;
        this.f2402y = false;
        this.f2403z = false;
        this.B = false;
        this.D = 0;
        this.E = null;
        this.G = new x();
        this.F = null;
        this.I = 0;
        this.J = 0;
        this.K = null;
        this.L = false;
        this.M = false;
    }

    boolean X2(Menu menu, MenuInflater menuInflater) {
        boolean z10 = false;
        if (this.L) {
            return false;
        }
        if (this.P && this.Q) {
            u2(menu, menuInflater);
            z10 = true;
        }
        return this.G.D(menu, menuInflater) | z10;
    }

    void Y0(boolean z10) {
        ViewGroup viewGroup;
        w wVar;
        j jVar = this.W;
        if (jVar != null) {
            jVar.f2439t = false;
        }
        if (this.T == null || (viewGroup = this.S) == null || (wVar = this.E) == null) {
            return;
        }
        m0 m0VarU = m0.u(viewGroup, wVar);
        m0VarU.z();
        if (z10) {
            this.F.j().post(new e(m0VarU));
        } else {
            m0VarU.n();
        }
        Handler handler = this.X;
        if (handler != null) {
            handler.removeCallbacks(this.Y);
            this.X = null;
        }
    }

    void Y2(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.G.U0();
        this.C = true;
        this.f2385f0 = new h0(this, U(), new Runnable() { // from class: y0.b
            @Override // java.lang.Runnable
            public final void run() {
                androidx.fragment.app.o.X0(this.f32268a);
            }
        });
        View viewV2 = v2(layoutInflater, viewGroup, bundle);
        this.T = viewV2;
        if (viewV2 == null) {
            if (this.f2385f0.c()) {
                throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
            }
            this.f2385f0 = null;
            return;
        }
        this.f2385f0.b();
        if (w.J0(3)) {
            Log.d("FragmentManager", "Setting ViewLifecycleOwner on View " + this.T + " for Fragment " + this);
        }
        z0.a(this.T, this.f2385f0);
        a1.a(this.T, this.f2385f0);
        l1.m.a(this.T, this.f2385f0);
        this.f2387g0.n(this.f2385f0);
    }

    y0.g Z0() {
        return new f();
    }

    void Z2() {
        this.G.E();
        this.f2383e0.i(m.a.ON_DESTROY);
        this.f2374a = 0;
        this.R = false;
        this.f2377b0 = false;
        w2();
        if (this.R) {
            return;
        }
        throw new o0("Fragment " + this + " did not call through to super.onDestroy()");
    }

    public void a1(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString(this.I));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString(this.J));
        printWriter.print(" mTag=");
        printWriter.println(this.K);
        printWriter.print(str);
        printWriter.print("mState=");
        printWriter.print(this.f2374a);
        printWriter.print(" mWho=");
        printWriter.print(this.f2384f);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.D);
        printWriter.print(str);
        printWriter.print("mAdded=");
        printWriter.print(this.f2398u);
        printWriter.print(" mRemoving=");
        printWriter.print(this.f2399v);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.f2402y);
        printWriter.print(" mInLayout=");
        printWriter.println(this.f2403z);
        printWriter.print(str);
        printWriter.print("mHidden=");
        printWriter.print(this.L);
        printWriter.print(" mDetached=");
        printWriter.print(this.M);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.Q);
        printWriter.print(" mHasMenu=");
        printWriter.println(this.P);
        printWriter.print(str);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.N);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.V);
        if (this.E != null) {
            printWriter.print(str);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.E);
        }
        if (this.F != null) {
            printWriter.print(str);
            printWriter.print("mHost=");
            printWriter.println(this.F);
        }
        if (this.H != null) {
            printWriter.print(str);
            printWriter.print("mParentFragment=");
            printWriter.println(this.H);
        }
        if (this.f2386g != null) {
            printWriter.print(str);
            printWriter.print("mArguments=");
            printWriter.println(this.f2386g);
        }
        if (this.f2376b != null) {
            printWriter.print(str);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.f2376b);
        }
        if (this.f2378c != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.f2378c);
        }
        if (this.f2380d != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewRegistryState=");
            printWriter.println(this.f2380d);
        }
        o oVarQ1 = Q1(false);
        if (oVarQ1 != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(oVarQ1);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.f2396s);
        }
        printWriter.print(str);
        printWriter.print("mPopDirection=");
        printWriter.println(C1());
        if (l1() != 0) {
            printWriter.print(str);
            printWriter.print("getEnterAnim=");
            printWriter.println(l1());
        }
        if (o1() != 0) {
            printWriter.print(str);
            printWriter.print("getExitAnim=");
            printWriter.println(o1());
        }
        if (D1() != 0) {
            printWriter.print(str);
            printWriter.print("getPopEnterAnim=");
            printWriter.println(D1());
        }
        if (E1() != 0) {
            printWriter.print(str);
            printWriter.print("getPopExitAnim=");
            printWriter.println(E1());
        }
        if (this.S != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.S);
        }
        if (this.T != null) {
            printWriter.print(str);
            printWriter.print("mView=");
            printWriter.println(this.T);
        }
        if (h1() != null) {
            printWriter.print(str);
            printWriter.print("mAnimatingAway=");
            printWriter.println(h1());
        }
        if (k1() != null) {
            androidx.loader.app.a.b(this).a(str, fileDescriptor, printWriter, strArr);
        }
        printWriter.print(str);
        printWriter.println("Child " + this.G + ":");
        this.G.X(str + "  ", fileDescriptor, printWriter, strArr);
    }

    public final boolean a2() {
        return this.F != null && this.f2398u;
    }

    void a3() {
        this.G.F();
        if (this.T != null && this.f2385f0.S0().b().d(m.b.f2653c)) {
            this.f2385f0.a(m.a.ON_DESTROY);
        }
        this.f2374a = 1;
        this.R = false;
        y2();
        if (this.R) {
            androidx.loader.app.a.b(this).d();
            this.C = false;
        } else {
            throw new o0("Fragment " + this + " did not call through to super.onDestroyView()");
        }
    }

    public final boolean b2() {
        return this.M;
    }

    void b3() {
        this.f2374a = -1;
        this.R = false;
        z2();
        this.f2375a0 = null;
        if (this.R) {
            if (this.G.I0()) {
                return;
            }
            this.G.E();
            this.G = new x();
            return;
        }
        throw new o0("Fragment " + this + " did not call through to super.onDetach()");
    }

    o c1(String str) {
        return str.equals(this.f2384f) ? this : this.G.k0(str);
    }

    public final boolean c2() {
        if (this.L) {
            return true;
        }
        w wVar = this.E;
        return wVar != null && wVar.M0(this.H);
    }

    LayoutInflater c3(Bundle bundle) {
        LayoutInflater layoutInflaterA2 = A2(bundle);
        this.f2375a0 = layoutInflaterA2;
        return layoutInflaterA2;
    }

    String d1() {
        return "fragment_" + this.f2384f + "_rq#" + this.f2392k0.getAndIncrement();
    }

    final boolean d2() {
        return this.D > 0;
    }

    void d3() {
        onLowMemory();
    }

    @Override // l1.i
    public final l1.f e0() {
        return this.f2390i0.b();
    }

    public final p e1() {
        t tVar = this.F;
        if (tVar == null) {
            return null;
        }
        return (p) tVar.f();
    }

    public final boolean e2() {
        if (!this.Q) {
            return false;
        }
        w wVar = this.E;
        return wVar == null || wVar.N0(this.H);
    }

    void e3(boolean z10) {
        E2(z10);
    }

    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    public boolean f1() {
        Boolean bool;
        j jVar = this.W;
        if (jVar == null || (bool = jVar.f2436q) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    boolean f2() {
        j jVar = this.W;
        if (jVar == null) {
            return false;
        }
        return jVar.f2439t;
    }

    boolean f3(MenuItem menuItem) {
        if (this.L) {
            return false;
        }
        if (this.P && this.Q && F2(menuItem)) {
            return true;
        }
        return this.G.K(menuItem);
    }

    public boolean g1() {
        Boolean bool;
        j jVar = this.W;
        if (jVar == null || (bool = jVar.f2435p) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public final boolean g2() {
        return this.f2399v;
    }

    void g3(Menu menu) {
        if (this.L) {
            return;
        }
        if (this.P && this.Q) {
            G2(menu);
        }
        this.G.L(menu);
    }

    View h1() {
        j jVar = this.W;
        if (jVar == null) {
            return null;
        }
        return jVar.f2420a;
    }

    public final boolean h2() {
        return this.f2374a >= 7;
    }

    void h3() {
        this.G.N();
        if (this.T != null) {
            this.f2385f0.a(m.a.ON_PAUSE);
        }
        this.f2383e0.i(m.a.ON_PAUSE);
        this.f2374a = 6;
        this.R = false;
        H2();
        if (this.R) {
            return;
        }
        throw new o0("Fragment " + this + " did not call through to super.onPause()");
    }

    public final int hashCode() {
        return super.hashCode();
    }

    public final Bundle i1() {
        return this.f2386g;
    }

    public final boolean i2() {
        w wVar = this.E;
        if (wVar == null) {
            return false;
        }
        return wVar.Q0();
    }

    void i3(boolean z10) {
        I2(z10);
    }

    public final w j1() {
        if (this.F != null) {
            return this.G;
        }
        throw new IllegalStateException("Fragment " + this + " has not been attached yet.");
    }

    public final boolean j2() {
        View view;
        return (!a2() || c2() || (view = this.T) == null || view.getWindowToken() == null || this.T.getVisibility() != 0) ? false : true;
    }

    boolean j3(Menu menu) {
        boolean z10 = false;
        if (this.L) {
            return false;
        }
        if (this.P && this.Q) {
            J2(menu);
            z10 = true;
        }
        return this.G.P(menu) | z10;
    }

    public Context k1() {
        t tVar = this.F;
        if (tVar == null) {
            return null;
        }
        return tVar.g();
    }

    void k2() {
        this.G.U0();
    }

    void k3() {
        boolean zO0 = this.E.O0(this);
        Boolean bool = this.f2397t;
        if (bool == null || bool.booleanValue() != zO0) {
            this.f2397t = Boolean.valueOf(zO0);
            K2(zO0);
            this.G.Q();
        }
    }

    int l1() {
        j jVar = this.W;
        if (jVar == null) {
            return 0;
        }
        return jVar.f2422c;
    }

    public void l2(Bundle bundle) {
        this.R = true;
    }

    void l3() {
        this.G.U0();
        this.G.b0(true);
        this.f2374a = 7;
        this.R = false;
        M2();
        if (!this.R) {
            throw new o0("Fragment " + this + " did not call through to super.onResume()");
        }
        androidx.lifecycle.v vVar = this.f2383e0;
        m.a aVar = m.a.ON_RESUME;
        vVar.i(aVar);
        if (this.T != null) {
            this.f2385f0.a(aVar);
        }
        this.G.R();
    }

    public Object m1() {
        j jVar = this.W;
        if (jVar == null) {
            return null;
        }
        return jVar.f2429j;
    }

    public void m2(int i10, int i11, Intent intent) {
        if (w.J0(2)) {
            Log.v("FragmentManager", "Fragment " + this + " received the following in onActivityResult(): requestCode: " + i10 + " resultCode: " + i11 + " data: " + intent);
        }
    }

    void m3(Bundle bundle) {
        N2(bundle);
    }

    a0.v n1() {
        j jVar = this.W;
        if (jVar == null) {
            return null;
        }
        jVar.getClass();
        return null;
    }

    public void n2(Activity activity) {
        this.R = true;
    }

    void n3() {
        this.G.U0();
        this.G.b0(true);
        this.f2374a = 5;
        this.R = false;
        O2();
        if (!this.R) {
            throw new o0("Fragment " + this + " did not call through to super.onStart()");
        }
        androidx.lifecycle.v vVar = this.f2383e0;
        m.a aVar = m.a.ON_START;
        vVar.i(aVar);
        if (this.T != null) {
            this.f2385f0.a(aVar);
        }
        this.G.S();
    }

    int o1() {
        j jVar = this.W;
        if (jVar == null) {
            return 0;
        }
        return jVar.f2423d;
    }

    public void o2(Context context) {
        this.R = true;
        t tVar = this.F;
        Activity activityF = tVar == null ? null : tVar.f();
        if (activityF != null) {
            this.R = false;
            n2(activityF);
        }
    }

    void o3() {
        this.G.U();
        if (this.T != null) {
            this.f2385f0.a(m.a.ON_STOP);
        }
        this.f2383e0.i(m.a.ON_STOP);
        this.f2374a = 4;
        this.R = false;
        P2();
        if (this.R) {
            return;
        }
        throw new o0("Fragment " + this + " did not call through to super.onStop()");
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        this.R = true;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        v3().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        this.R = true;
    }

    public Object p1() {
        j jVar = this.W;
        if (jVar == null) {
            return null;
        }
        return jVar.f2431l;
    }

    public void p2(o oVar) {
    }

    void p3() {
        Bundle bundle = this.f2376b;
        Q2(this.T, bundle != null ? bundle.getBundle("savedInstanceState") : null);
        this.G.V();
    }

    a0.v q1() {
        j jVar = this.W;
        if (jVar == null) {
            return null;
        }
        jVar.getClass();
        return null;
    }

    public boolean q2(MenuItem menuItem) {
        return false;
    }

    View r1() {
        j jVar = this.W;
        if (jVar == null) {
            return null;
        }
        return jVar.f2438s;
    }

    public void r2(Bundle bundle) {
        this.R = true;
        A3();
        if (this.G.P0(1)) {
            return;
        }
        this.G.C();
    }

    public final f.c r3(g.a aVar, f.b bVar) {
        return q3(aVar, new h(), bVar);
    }

    public final w s1() {
        return this.E;
    }

    public Animation s2(int i10, boolean z10, int i11) {
        return null;
    }

    public void s3(View view) {
        view.setOnCreateContextMenuListener(this);
    }

    public void startActivityForResult(Intent intent, int i10) {
        Q3(intent, i10, null);
    }

    public final Object t1() {
        t tVar = this.F;
        if (tVar == null) {
            return null;
        }
        return tVar.m();
    }

    public Animator t2(int i10, boolean z10, int i11) {
        return null;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append(getClass().getSimpleName());
        sb2.append("{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append("}");
        sb2.append(" (");
        sb2.append(this.f2384f);
        if (this.I != 0) {
            sb2.append(" id=0x");
            sb2.append(Integer.toHexString(this.I));
        }
        if (this.K != null) {
            sb2.append(" tag=");
            sb2.append(this.K);
        }
        sb2.append(")");
        return sb2.toString();
    }

    public final int u1() {
        return this.I;
    }

    public void u2(Menu menu, MenuInflater menuInflater) {
    }

    public final void u3(String[] strArr, int i10) {
        if (this.F != null) {
            B1().R0(this, strArr, i10);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    public final LayoutInflater v1() {
        LayoutInflater layoutInflater = this.f2375a0;
        return layoutInflater == null ? c3(null) : layoutInflater;
    }

    public View v2(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i10 = this.f2391j0;
        if (i10 != 0) {
            return layoutInflater.inflate(i10, viewGroup, false);
        }
        return null;
    }

    public final p v3() {
        p pVarE1 = e1();
        if (pVarE1 != null) {
            return pVarE1;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to an activity.");
    }

    public LayoutInflater w1(Bundle bundle) {
        t tVar = this.F;
        if (tVar == null) {
            throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
        }
        LayoutInflater layoutInflaterN = tVar.n();
        m0.n.a(layoutInflaterN, this.G.x0());
        return layoutInflaterN;
    }

    public void w2() {
        this.R = true;
    }

    public final Bundle w3() {
        Bundle bundleI1 = i1();
        if (bundleI1 != null) {
            return bundleI1;
        }
        throw new IllegalStateException("Fragment " + this + " does not have any arguments.");
    }

    public androidx.loader.app.a x1() {
        return androidx.loader.app.a.b(this);
    }

    public void x2() {
    }

    public final Context x3() {
        Context contextK1 = k1();
        if (contextK1 != null) {
            return contextK1;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to a context.");
    }

    public void y2() {
        this.R = true;
    }

    public final w y3() {
        return B1();
    }

    int z1() {
        j jVar = this.W;
        if (jVar == null) {
            return 0;
        }
        return jVar.f2426g;
    }

    public void z2() {
        this.R = true;
    }

    public final View z3() {
        View viewT1 = T1();
        if (viewT1 != null) {
            return viewT1;
        }
        throw new IllegalStateException("Fragment " + this + " did not return a View from onCreateView() or this was called before onCreateView().");
    }
}
