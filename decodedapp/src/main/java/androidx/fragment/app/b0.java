package androidx.fragment.app;

import android.app.Activity;
import android.content.res.Resources;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.fragment.app.m0;
import androidx.lifecycle.m;
import androidx.lifecycle.y0;

/* JADX INFO: loaded from: classes.dex */
class b0 {

    /* JADX INFO: renamed from: a */
    private final v f2173a;

    /* JADX INFO: renamed from: b */
    private final c0 f2174b;

    /* JADX INFO: renamed from: c */
    private final o f2175c;

    /* JADX INFO: renamed from: d */
    private boolean f2176d = false;

    /* JADX INFO: renamed from: e */
    private int f2177e = -1;

    class a implements View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ View f2178a;

        a(View view) {
            this.f2178a = view;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            this.f2178a.removeOnAttachStateChangeListener(this);
            m0.o0.j0(this.f2178a);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    static /* synthetic */ class b {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f2180a;

        static {
            int[] iArr = new int[m.b.values().length];
            f2180a = iArr;
            try {
                iArr[m.b.f2655e.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2180a[m.b.f2654d.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2180a[m.b.f2653c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f2180a[m.b.f2652b.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    b0(v vVar, c0 c0Var, o oVar) {
        this.f2173a = vVar;
        this.f2174b = c0Var;
        this.f2175c = oVar;
    }

    private boolean l(View view) {
        if (view == this.f2175c.T) {
            return true;
        }
        for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
            if (parent == this.f2175c.T) {
                return true;
            }
        }
        return false;
    }

    void a() {
        if (w.J0(3)) {
            Log.d("FragmentManager", "moveto ACTIVITY_CREATED: " + this.f2175c);
        }
        Bundle bundle = this.f2175c.f2376b;
        Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
        this.f2175c.S2(bundle2);
        this.f2173a.a(this.f2175c, bundle2, false);
    }

    void b() {
        o oVarM0 = w.m0(this.f2175c.S);
        o oVarA1 = this.f2175c.A1();
        if (oVarM0 != null && !oVarM0.equals(oVarA1)) {
            o oVar = this.f2175c;
            z0.c.k(oVar, oVarM0, oVar.J);
        }
        int iJ = this.f2174b.j(this.f2175c);
        o oVar2 = this.f2175c;
        oVar2.S.addView(oVar2.T, iJ);
    }

    void c() {
        if (w.J0(3)) {
            Log.d("FragmentManager", "moveto ATTACHED: " + this.f2175c);
        }
        o oVar = this.f2175c;
        o oVar2 = oVar.f2388h;
        b0 b0VarN = null;
        if (oVar2 != null) {
            b0 b0VarN2 = this.f2174b.n(oVar2.f2384f);
            if (b0VarN2 == null) {
                throw new IllegalStateException("Fragment " + this.f2175c + " declared target fragment " + this.f2175c.f2388h + " that does not belong to this FragmentManager!");
            }
            o oVar3 = this.f2175c;
            oVar3.f2395r = oVar3.f2388h.f2384f;
            oVar3.f2388h = null;
            b0VarN = b0VarN2;
        } else {
            String str = oVar.f2395r;
            if (str != null && (b0VarN = this.f2174b.n(str)) == null) {
                throw new IllegalStateException("Fragment " + this.f2175c + " declared target fragment " + this.f2175c.f2395r + " that does not belong to this FragmentManager!");
            }
        }
        if (b0VarN != null) {
            b0VarN.m();
        }
        o oVar4 = this.f2175c;
        oVar4.F = oVar4.E.w0();
        o oVar5 = this.f2175c;
        oVar5.H = oVar5.E.z0();
        this.f2173a.g(this.f2175c, false);
        this.f2175c.T2();
        this.f2173a.b(this.f2175c, false);
    }

    int d() {
        o oVar = this.f2175c;
        if (oVar.E == null) {
            return oVar.f2374a;
        }
        int iMin = this.f2177e;
        int i10 = b.f2180a[oVar.f2381d0.ordinal()];
        if (i10 != 1) {
            iMin = i10 != 2 ? i10 != 3 ? i10 != 4 ? Math.min(iMin, -1) : Math.min(iMin, 0) : Math.min(iMin, 1) : Math.min(iMin, 5);
        }
        o oVar2 = this.f2175c;
        if (oVar2.f2402y) {
            if (oVar2.f2403z) {
                iMin = Math.max(this.f2177e, 2);
                View view = this.f2175c.T;
                if (view != null && view.getParent() == null) {
                    iMin = Math.min(iMin, 2);
                }
            } else {
                iMin = this.f2177e < 4 ? Math.min(iMin, oVar2.f2374a) : Math.min(iMin, 1);
            }
        }
        o oVar3 = this.f2175c;
        if (oVar3.A && oVar3.S == null) {
            iMin = Math.min(iMin, 4);
        }
        if (!this.f2175c.f2398u) {
            iMin = Math.min(iMin, 1);
        }
        o oVar4 = this.f2175c;
        ViewGroup viewGroup = oVar4.S;
        m0.d.a aVarS = viewGroup != null ? m0.u(viewGroup, oVar4.B1()).s(this) : null;
        if (aVarS == m0.d.a.ADDING) {
            iMin = Math.min(iMin, 6);
        } else if (aVarS == m0.d.a.REMOVING) {
            iMin = Math.max(iMin, 3);
        } else {
            o oVar5 = this.f2175c;
            if (oVar5.f2399v) {
                iMin = oVar5.d2() ? Math.min(iMin, 1) : Math.min(iMin, -1);
            }
        }
        o oVar6 = this.f2175c;
        if (oVar6.U && oVar6.f2374a < 5) {
            iMin = Math.min(iMin, 4);
        }
        if (this.f2175c.f2400w) {
            iMin = Math.max(iMin, 3);
        }
        if (w.J0(2)) {
            Log.v("FragmentManager", "computeExpectedState() of " + iMin + " for " + this.f2175c);
        }
        return iMin;
    }

    void e() {
        if (w.J0(3)) {
            Log.d("FragmentManager", "moveto CREATED: " + this.f2175c);
        }
        Bundle bundle = this.f2175c.f2376b;
        Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
        o oVar = this.f2175c;
        if (oVar.f2377b0) {
            oVar.f2374a = 1;
            oVar.A3();
        } else {
            this.f2173a.h(oVar, bundle2, false);
            this.f2175c.W2(bundle2);
            this.f2173a.c(this.f2175c, bundle2, false);
        }
    }

    void f() {
        String resourceName;
        if (this.f2175c.f2402y) {
            return;
        }
        if (w.J0(3)) {
            Log.d("FragmentManager", "moveto CREATE_VIEW: " + this.f2175c);
        }
        Bundle bundle = this.f2175c.f2376b;
        ViewGroup viewGroup = null;
        Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
        LayoutInflater layoutInflaterC3 = this.f2175c.c3(bundle2);
        o oVar = this.f2175c;
        ViewGroup viewGroup2 = oVar.S;
        if (viewGroup2 != null) {
            viewGroup = viewGroup2;
        } else {
            int i10 = oVar.J;
            if (i10 != 0) {
                if (i10 == -1) {
                    throw new IllegalArgumentException("Cannot create fragment " + this.f2175c + " for a container view with no id");
                }
                viewGroup = (ViewGroup) oVar.E.s0().c(this.f2175c.J);
                if (viewGroup == null) {
                    o oVar2 = this.f2175c;
                    if (!oVar2.B && !oVar2.A) {
                        try {
                            resourceName = oVar2.H1().getResourceName(this.f2175c.J);
                        } catch (Resources.NotFoundException unused) {
                            resourceName = "unknown";
                        }
                        throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(this.f2175c.J) + " (" + resourceName + ") for fragment " + this.f2175c);
                    }
                } else if (!(viewGroup instanceof FragmentContainerView)) {
                    z0.c.j(this.f2175c, viewGroup);
                }
            }
        }
        o oVar3 = this.f2175c;
        oVar3.S = viewGroup;
        oVar3.Y2(layoutInflaterC3, viewGroup, bundle2);
        if (this.f2175c.T != null) {
            if (w.J0(3)) {
                Log.d("FragmentManager", "moveto VIEW_CREATED: " + this.f2175c);
            }
            this.f2175c.T.setSaveFromParentEnabled(false);
            o oVar4 = this.f2175c;
            oVar4.T.setTag(x0.b.f31537a, oVar4);
            if (viewGroup != null) {
                b();
            }
            o oVar5 = this.f2175c;
            if (oVar5.L) {
                oVar5.T.setVisibility(8);
            }
            if (this.f2175c.T.isAttachedToWindow()) {
                m0.o0.j0(this.f2175c.T);
            } else {
                View view = this.f2175c.T;
                view.addOnAttachStateChangeListener(new a(view));
            }
            this.f2175c.p3();
            v vVar = this.f2173a;
            o oVar6 = this.f2175c;
            vVar.m(oVar6, oVar6.T, bundle2, false);
            int visibility = this.f2175c.T.getVisibility();
            this.f2175c.K3(this.f2175c.T.getAlpha());
            o oVar7 = this.f2175c;
            if (oVar7.S != null && visibility == 0) {
                View viewFindFocus = oVar7.T.findFocus();
                if (viewFindFocus != null) {
                    this.f2175c.F3(viewFindFocus);
                    if (w.J0(2)) {
                        Log.v("FragmentManager", "requestFocus: Saved focused view " + viewFindFocus + " for Fragment " + this.f2175c);
                    }
                }
                this.f2175c.T.setAlpha(0.0f);
            }
        }
        this.f2175c.f2374a = 2;
    }

    void g() {
        o oVarF;
        if (w.J0(3)) {
            Log.d("FragmentManager", "movefrom CREATED: " + this.f2175c);
        }
        o oVar = this.f2175c;
        boolean zIsChangingConfigurations = true;
        boolean z10 = oVar.f2399v && !oVar.d2();
        if (z10) {
            o oVar2 = this.f2175c;
            if (!oVar2.f2401x) {
                this.f2174b.B(oVar2.f2384f, null);
            }
        }
        if (!z10 && !this.f2174b.p().q(this.f2175c)) {
            String str = this.f2175c.f2395r;
            if (str != null && (oVarF = this.f2174b.f(str)) != null && oVarF.N) {
                this.f2175c.f2388h = oVarF;
            }
            this.f2175c.f2374a = 0;
            return;
        }
        t tVar = this.f2175c.F;
        if (tVar instanceof y0) {
            zIsChangingConfigurations = this.f2174b.p().n();
        } else if (tVar.g() instanceof Activity) {
            zIsChangingConfigurations = true ^ ((Activity) tVar.g()).isChangingConfigurations();
        }
        if ((z10 && !this.f2175c.f2401x) || zIsChangingConfigurations) {
            this.f2174b.p().f(this.f2175c, false);
        }
        this.f2175c.Z2();
        this.f2173a.d(this.f2175c, false);
        for (b0 b0Var : this.f2174b.k()) {
            if (b0Var != null) {
                o oVarK = b0Var.k();
                if (this.f2175c.f2384f.equals(oVarK.f2395r)) {
                    oVarK.f2388h = this.f2175c;
                    oVarK.f2395r = null;
                }
            }
        }
        o oVar3 = this.f2175c;
        String str2 = oVar3.f2395r;
        if (str2 != null) {
            oVar3.f2388h = this.f2174b.f(str2);
        }
        this.f2174b.s(this);
    }

    void h() {
        View view;
        if (w.J0(3)) {
            Log.d("FragmentManager", "movefrom CREATE_VIEW: " + this.f2175c);
        }
        o oVar = this.f2175c;
        ViewGroup viewGroup = oVar.S;
        if (viewGroup != null && (view = oVar.T) != null) {
            viewGroup.removeView(view);
        }
        this.f2175c.a3();
        this.f2173a.n(this.f2175c, false);
        o oVar2 = this.f2175c;
        oVar2.S = null;
        oVar2.T = null;
        oVar2.f2385f0 = null;
        oVar2.f2387g0.n(null);
        this.f2175c.f2403z = false;
    }

    void i() {
        if (w.J0(3)) {
            Log.d("FragmentManager", "movefrom ATTACHED: " + this.f2175c);
        }
        this.f2175c.b3();
        this.f2173a.e(this.f2175c, false);
        o oVar = this.f2175c;
        oVar.f2374a = -1;
        oVar.F = null;
        oVar.H = null;
        oVar.E = null;
        if ((!oVar.f2399v || oVar.d2()) && !this.f2174b.p().q(this.f2175c)) {
            return;
        }
        if (w.J0(3)) {
            Log.d("FragmentManager", "initState called for fragment: " + this.f2175c);
        }
        this.f2175c.X1();
    }

    void j() {
        o oVar = this.f2175c;
        if (oVar.f2402y && oVar.f2403z && !oVar.C) {
            if (w.J0(3)) {
                Log.d("FragmentManager", "moveto CREATE_VIEW: " + this.f2175c);
            }
            Bundle bundle = this.f2175c.f2376b;
            Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
            o oVar2 = this.f2175c;
            oVar2.Y2(oVar2.c3(bundle2), null, bundle2);
            View view = this.f2175c.T;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                o oVar3 = this.f2175c;
                oVar3.T.setTag(x0.b.f31537a, oVar3);
                o oVar4 = this.f2175c;
                if (oVar4.L) {
                    oVar4.T.setVisibility(8);
                }
                this.f2175c.p3();
                v vVar = this.f2173a;
                o oVar5 = this.f2175c;
                vVar.m(oVar5, oVar5.T, bundle2, false);
                this.f2175c.f2374a = 2;
            }
        }
    }

    o k() {
        return this.f2175c;
    }

    void m() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        if (this.f2176d) {
            if (w.J0(2)) {
                Log.v("FragmentManager", "Ignoring re-entrant call to moveToExpectedState() for " + k());
                return;
            }
            return;
        }
        try {
            this.f2176d = true;
            boolean z10 = false;
            while (true) {
                int iD = d();
                o oVar = this.f2175c;
                int i10 = oVar.f2374a;
                if (iD == i10) {
                    if (!z10 && i10 == -1 && oVar.f2399v && !oVar.d2() && !this.f2175c.f2401x) {
                        if (w.J0(3)) {
                            Log.d("FragmentManager", "Cleaning up state of never attached fragment: " + this.f2175c);
                        }
                        this.f2174b.p().f(this.f2175c, true);
                        this.f2174b.s(this);
                        if (w.J0(3)) {
                            Log.d("FragmentManager", "initState called for fragment: " + this.f2175c);
                        }
                        this.f2175c.X1();
                    }
                    o oVar2 = this.f2175c;
                    if (oVar2.Z) {
                        if (oVar2.T != null && (viewGroup = oVar2.S) != null) {
                            m0 m0VarU = m0.u(viewGroup, oVar2.B1());
                            if (this.f2175c.L) {
                                m0VarU.k(this);
                            } else {
                                m0VarU.m(this);
                            }
                        }
                        o oVar3 = this.f2175c;
                        w wVar = oVar3.E;
                        if (wVar != null) {
                            wVar.H0(oVar3);
                        }
                        o oVar4 = this.f2175c;
                        oVar4.Z = false;
                        oVar4.B2(oVar4.L);
                        this.f2175c.G.J();
                    }
                    this.f2176d = false;
                    return;
                }
                if (iD <= i10) {
                    switch (i10 - 1) {
                        case -1:
                            i();
                            break;
                        case 0:
                            if (oVar.f2401x && this.f2174b.q(oVar.f2384f) == null) {
                                this.f2174b.B(this.f2175c.f2384f, q());
                            }
                            g();
                            break;
                        case 1:
                            h();
                            this.f2175c.f2374a = 1;
                            break;
                        case 2:
                            oVar.f2403z = false;
                            oVar.f2374a = 2;
                            break;
                        case 3:
                            if (w.J0(3)) {
                                Log.d("FragmentManager", "movefrom ACTIVITY_CREATED: " + this.f2175c);
                            }
                            o oVar5 = this.f2175c;
                            if (oVar5.f2401x) {
                                this.f2174b.B(oVar5.f2384f, q());
                            } else if (oVar5.T != null && oVar5.f2378c == null) {
                                r();
                            }
                            o oVar6 = this.f2175c;
                            if (oVar6.T != null && (viewGroup2 = oVar6.S) != null) {
                                m0.u(viewGroup2, oVar6.B1()).l(this);
                            }
                            this.f2175c.f2374a = 3;
                            break;
                        case 4:
                            u();
                            break;
                        case 5:
                            oVar.f2374a = 5;
                            break;
                        case 6:
                            n();
                            break;
                    }
                } else {
                    switch (i10 + 1) {
                        case 0:
                            c();
                            break;
                        case 1:
                            e();
                            break;
                        case 2:
                            j();
                            f();
                            break;
                        case 3:
                            a();
                            break;
                        case 4:
                            if (oVar.T != null && (viewGroup3 = oVar.S) != null) {
                                m0.u(viewGroup3, oVar.B1()).j(m0.d.b.e(this.f2175c.T.getVisibility()), this);
                            }
                            this.f2175c.f2374a = 4;
                            break;
                        case 5:
                            t();
                            break;
                        case 6:
                            oVar.f2374a = 6;
                            break;
                        case 7:
                            p();
                            break;
                    }
                }
                z10 = true;
            }
        } catch (Throwable th2) {
            this.f2176d = false;
            throw th2;
        }
    }

    void n() {
        if (w.J0(3)) {
            Log.d("FragmentManager", "movefrom RESUMED: " + this.f2175c);
        }
        this.f2175c.h3();
        this.f2173a.f(this.f2175c, false);
    }

    void o(ClassLoader classLoader) {
        Bundle bundle = this.f2175c.f2376b;
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(classLoader);
        if (this.f2175c.f2376b.getBundle("savedInstanceState") == null) {
            this.f2175c.f2376b.putBundle("savedInstanceState", new Bundle());
        }
        try {
            o oVar = this.f2175c;
            oVar.f2378c = oVar.f2376b.getSparseParcelableArray("viewState");
            o oVar2 = this.f2175c;
            oVar2.f2380d = oVar2.f2376b.getBundle("viewRegistryState");
            a0 a0Var = (a0) this.f2175c.f2376b.getParcelable("state");
            if (a0Var != null) {
                o oVar3 = this.f2175c;
                oVar3.f2395r = a0Var.f2156v;
                oVar3.f2396s = a0Var.f2157w;
                Boolean bool = oVar3.f2382e;
                if (bool != null) {
                    oVar3.V = bool.booleanValue();
                    this.f2175c.f2382e = null;
                } else {
                    oVar3.V = a0Var.f2158x;
                }
            }
            o oVar4 = this.f2175c;
            if (oVar4.V) {
                return;
            }
            oVar4.U = true;
        } catch (BadParcelableException e10) {
            throw new IllegalStateException("Failed to restore view hierarchy state for fragment " + k(), e10);
        }
    }

    void p() {
        if (w.J0(3)) {
            Log.d("FragmentManager", "moveto RESUMED: " + this.f2175c);
        }
        View viewR1 = this.f2175c.r1();
        if (viewR1 != null && l(viewR1)) {
            boolean zRequestFocus = viewR1.requestFocus();
            if (w.J0(2)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("requestFocus: Restoring focused view ");
                sb2.append(viewR1);
                sb2.append(" ");
                sb2.append(zRequestFocus ? "succeeded" : "failed");
                sb2.append(" on Fragment ");
                sb2.append(this.f2175c);
                sb2.append(" resulting in focused view ");
                sb2.append(this.f2175c.T.findFocus());
                Log.v("FragmentManager", sb2.toString());
            }
        }
        this.f2175c.F3(null);
        this.f2175c.l3();
        this.f2173a.i(this.f2175c, false);
        this.f2174b.B(this.f2175c.f2384f, null);
        o oVar = this.f2175c;
        oVar.f2376b = null;
        oVar.f2378c = null;
        oVar.f2380d = null;
    }

    Bundle q() {
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        o oVar = this.f2175c;
        if (oVar.f2374a == -1 && (bundle = oVar.f2376b) != null) {
            bundle2.putAll(bundle);
        }
        bundle2.putParcelable("state", new a0(this.f2175c));
        if (this.f2175c.f2374a > 0) {
            Bundle bundle3 = new Bundle();
            this.f2175c.m3(bundle3);
            if (!bundle3.isEmpty()) {
                bundle2.putBundle("savedInstanceState", bundle3);
            }
            this.f2173a.j(this.f2175c, bundle3, false);
            Bundle bundle4 = new Bundle();
            this.f2175c.f2390i0.e(bundle4);
            if (!bundle4.isEmpty()) {
                bundle2.putBundle("registryState", bundle4);
            }
            Bundle bundleJ1 = this.f2175c.G.j1();
            if (!bundleJ1.isEmpty()) {
                bundle2.putBundle("childFragmentManager", bundleJ1);
            }
            if (this.f2175c.T != null) {
                r();
            }
            SparseArray<? extends Parcelable> sparseArray = this.f2175c.f2378c;
            if (sparseArray != null) {
                bundle2.putSparseParcelableArray("viewState", sparseArray);
            }
            Bundle bundle5 = this.f2175c.f2380d;
            if (bundle5 != null) {
                bundle2.putBundle("viewRegistryState", bundle5);
            }
        }
        Bundle bundle6 = this.f2175c.f2386g;
        if (bundle6 != null) {
            bundle2.putBundle("arguments", bundle6);
        }
        return bundle2;
    }

    void r() {
        if (this.f2175c.T == null) {
            return;
        }
        if (w.J0(2)) {
            Log.v("FragmentManager", "Saving view state for fragment " + this.f2175c + " with view " + this.f2175c.T);
        }
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        this.f2175c.T.saveHierarchyState(sparseArray);
        if (sparseArray.size() > 0) {
            this.f2175c.f2378c = sparseArray;
        }
        Bundle bundle = new Bundle();
        this.f2175c.f2385f0.f(bundle);
        if (bundle.isEmpty()) {
            return;
        }
        this.f2175c.f2380d = bundle;
    }

    void s(int i10) {
        this.f2177e = i10;
    }

    void t() {
        if (w.J0(3)) {
            Log.d("FragmentManager", "moveto STARTED: " + this.f2175c);
        }
        this.f2175c.n3();
        this.f2173a.k(this.f2175c, false);
    }

    void u() {
        if (w.J0(3)) {
            Log.d("FragmentManager", "movefrom STARTED: " + this.f2175c);
        }
        this.f2175c.o3();
        this.f2173a.l(this.f2175c, false);
    }

    b0(v vVar, c0 c0Var, ClassLoader classLoader, s sVar, Bundle bundle) {
        this.f2173a = vVar;
        this.f2174b = c0Var;
        o oVarB = ((a0) bundle.getParcelable("state")).b(sVar, classLoader);
        this.f2175c = oVarB;
        oVarB.f2376b = bundle;
        Bundle bundle2 = bundle.getBundle("arguments");
        if (bundle2 != null) {
            bundle2.setClassLoader(classLoader);
        }
        oVarB.E3(bundle2);
        if (w.J0(2)) {
            Log.v("FragmentManager", "Instantiated fragment " + oVarB);
        }
    }

    b0(v vVar, c0 c0Var, o oVar, Bundle bundle) {
        this.f2173a = vVar;
        this.f2174b = c0Var;
        this.f2175c = oVar;
        oVar.f2378c = null;
        oVar.f2380d = null;
        oVar.D = 0;
        oVar.f2403z = false;
        oVar.f2398u = false;
        o oVar2 = oVar.f2388h;
        oVar.f2395r = oVar2 != null ? oVar2.f2384f : null;
        oVar.f2388h = null;
        oVar.f2376b = bundle;
        oVar.f2386g = bundle.getBundle("arguments");
    }
}
