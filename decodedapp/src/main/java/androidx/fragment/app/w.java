package androidx.fragment.app;

import a0.s;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.d0;
import androidx.fragment.app.w;
import androidx.lifecycle.m;
import androidx.lifecycle.x0;
import androidx.lifecycle.y0;
import f.h;
import j$.util.DesugarCollections;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import l1.f;
import z0.c;

/* JADX INFO: loaded from: classes.dex */
public abstract class w {
    private static boolean U = false;
    static boolean V = true;
    o A;
    private f.c F;
    private f.c G;
    private f.c H;
    private boolean J;
    private boolean K;
    private boolean L;
    private boolean M;
    private boolean N;
    private ArrayList O;
    private ArrayList P;
    private ArrayList Q;
    private z R;
    private c.C0442c S;

    /* JADX INFO: renamed from: b */
    private boolean f2461b;

    /* JADX INFO: renamed from: e */
    private ArrayList f2464e;

    /* JADX INFO: renamed from: g */
    private d.j0 f2466g;

    /* JADX INFO: renamed from: x */
    private t f2483x;

    /* JADX INFO: renamed from: y */
    private y0.g f2484y;

    /* JADX INFO: renamed from: z */
    private o f2485z;

    /* JADX INFO: renamed from: a */
    private final ArrayList f2460a = new ArrayList();

    /* JADX INFO: renamed from: c */
    private final c0 f2462c = new c0();

    /* JADX INFO: renamed from: d */
    ArrayList f2463d = new ArrayList();

    /* JADX INFO: renamed from: f */
    private final u f2465f = new u(this);

    /* JADX INFO: renamed from: h */
    androidx.fragment.app.a f2467h = null;

    /* JADX INFO: renamed from: i */
    boolean f2468i = false;

    /* JADX INFO: renamed from: j */
    private final d.b0 f2469j = new b(false);

    /* JADX INFO: renamed from: k */
    private final AtomicInteger f2470k = new AtomicInteger();

    /* JADX INFO: renamed from: l */
    private final Map f2471l = DesugarCollections.synchronizedMap(new HashMap());

    /* JADX INFO: renamed from: m */
    private final Map f2472m = DesugarCollections.synchronizedMap(new HashMap());

    /* JADX INFO: renamed from: n */
    private final Map f2473n = DesugarCollections.synchronizedMap(new HashMap());

    /* JADX INFO: renamed from: o */
    ArrayList f2474o = new ArrayList();

    /* JADX INFO: renamed from: p */
    private final v f2475p = new v(this);

    /* JADX INFO: renamed from: q */
    private final CopyOnWriteArrayList f2476q = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: r */
    private final l0.a f2477r = new l0.a() { // from class: y0.h
        @Override // l0.a
        public final void accept(Object obj) {
            w.f(this.f32273a, (Configuration) obj);
        }
    };

    /* JADX INFO: renamed from: s */
    private final l0.a f2478s = new l0.a() { // from class: y0.i
        @Override // l0.a
        public final void accept(Object obj) {
            w.a(this.f32274a, (Integer) obj);
        }
    };

    /* JADX INFO: renamed from: t */
    private final l0.a f2479t = new l0.a() { // from class: y0.j
        @Override // l0.a
        public final void accept(Object obj) {
            w.e(this.f32275a, (a0.h) obj);
        }
    };

    /* JADX INFO: renamed from: u */
    private final l0.a f2480u = new l0.a() { // from class: y0.k
        @Override // l0.a
        public final void accept(Object obj) {
            w.d(this.f32276a, (s) obj);
        }
    };

    /* JADX INFO: renamed from: v */
    private final m0.u f2481v = new c();

    /* JADX INFO: renamed from: w */
    int f2482w = -1;
    private s B = null;
    private s C = new d();
    private n0 D = null;
    private n0 E = new e();
    ArrayDeque I = new ArrayDeque();
    private Runnable T = new f();

    class a implements f.b {
        a() {
        }

        @Override // f.b
        /* JADX INFO: renamed from: b */
        public void a(Map map) {
            String[] strArr = (String[]) map.keySet().toArray(new String[0]);
            ArrayList arrayList = new ArrayList(map.values());
            int[] iArr = new int[arrayList.size()];
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                iArr[i10] = ((Boolean) arrayList.get(i10)).booleanValue() ? 0 : -1;
            }
            k kVar = (k) w.this.I.pollFirst();
            if (kVar == null) {
                Log.w("FragmentManager", "No permissions were requested for " + this);
                return;
            }
            String str = kVar.f2496a;
            int i11 = kVar.f2497b;
            o oVarI = w.this.f2462c.i(str);
            if (oVarI != null) {
                oVarI.L2(i11, strArr, iArr);
                return;
            }
            Log.w("FragmentManager", "Permission request result delivered for unknown Fragment " + str);
        }
    }

    class b extends d.b0 {
        b(boolean z10) {
            super(z10);
        }

        @Override // d.b0
        public void c() {
            if (w.J0(3)) {
                Log.d("FragmentManager", "handleOnBackCancelled. PREDICTIVE_BACK = " + w.V + " fragment manager " + w.this);
            }
            if (w.V) {
                w.this.p();
            }
        }

        @Override // d.b0
        public void d() {
            if (w.J0(3)) {
                Log.d("FragmentManager", "handleOnBackPressed. PREDICTIVE_BACK = " + w.V + " fragment manager " + w.this);
            }
            w.this.F0();
        }

        @Override // d.b0
        public void e(d.c cVar) {
            if (w.J0(2)) {
                Log.v("FragmentManager", "handleOnBackProgressed. PREDICTIVE_BACK = " + w.V + " fragment manager " + w.this);
            }
            w wVar = w.this;
            if (wVar.f2467h != null) {
                Iterator it = wVar.v(new ArrayList(Collections.singletonList(w.this.f2467h)), 0, 1).iterator();
                while (it.hasNext()) {
                    ((m0) it.next()).A(cVar);
                }
                Iterator it2 = w.this.f2474o.iterator();
                if (it2.hasNext()) {
                    android.support.v4.media.session.b.a(it2.next());
                    throw null;
                }
            }
        }

        @Override // d.b0
        public void f(d.c cVar) {
            if (w.J0(3)) {
                Log.d("FragmentManager", "handleOnBackStarted. PREDICTIVE_BACK = " + w.V + " fragment manager " + w.this);
            }
            if (w.V) {
                w.this.Y();
                w.this.d1();
            }
        }
    }

    class c implements m0.u {
        c() {
        }

        @Override // m0.u
        public void E0(Menu menu, MenuInflater menuInflater) {
            w.this.D(menu, menuInflater);
        }

        @Override // m0.u
        public void K0(Menu menu) {
            w.this.P(menu);
        }

        @Override // m0.u
        public boolean v(MenuItem menuItem) {
            return w.this.K(menuItem);
        }

        @Override // m0.u
        public void z0(Menu menu) {
            w.this.L(menu);
        }
    }

    class d extends s {
        d() {
        }

        @Override // androidx.fragment.app.s
        public o a(ClassLoader classLoader, String str) {
            return w.this.w0().b(w.this.w0().g(), str, null);
        }
    }

    class e implements n0 {
        e() {
        }

        @Override // androidx.fragment.app.n0
        public m0 a(ViewGroup viewGroup) {
            return new androidx.fragment.app.e(viewGroup);
        }
    }

    class f implements Runnable {
        f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            w.this.b0(true);
        }
    }

    class g implements y0.n {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ o f2492a;

        g(o oVar) {
            this.f2492a = oVar;
        }

        @Override // y0.n
        public void a(w wVar, o oVar) {
            this.f2492a.p2(oVar);
        }
    }

    class h implements f.b {
        h() {
        }

        @Override // f.b
        /* JADX INFO: renamed from: b */
        public void a(f.a aVar) {
            k kVar = (k) w.this.I.pollLast();
            if (kVar == null) {
                Log.w("FragmentManager", "No Activities were started for result for " + this);
                return;
            }
            String str = kVar.f2496a;
            int i10 = kVar.f2497b;
            o oVarI = w.this.f2462c.i(str);
            if (oVarI != null) {
                oVarI.m2(i10, aVar.c(), aVar.b());
                return;
            }
            Log.w("FragmentManager", "Activity result delivered for unknown Fragment " + str);
        }
    }

    class i implements f.b {
        i() {
        }

        @Override // f.b
        /* JADX INFO: renamed from: b */
        public void a(f.a aVar) {
            k kVar = (k) w.this.I.pollFirst();
            if (kVar == null) {
                Log.w("FragmentManager", "No IntentSenders were started for " + this);
                return;
            }
            String str = kVar.f2496a;
            int i10 = kVar.f2497b;
            o oVarI = w.this.f2462c.i(str);
            if (oVarI != null) {
                oVarI.m2(i10, aVar.c(), aVar.b());
                return;
            }
            Log.w("FragmentManager", "Intent Sender result delivered for unknown Fragment " + str);
        }
    }

    static class j extends g.a {
        j() {
        }

        @Override // g.a
        /* JADX INFO: renamed from: d */
        public Intent a(Context context, f.h hVar) {
            Bundle bundleExtra;
            Intent intent = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
            Intent intentB = hVar.b();
            if (intentB != null && (bundleExtra = intentB.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) != null) {
                intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundleExtra);
                intentB.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                if (intentB.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false)) {
                    hVar = new h.a(hVar.f()).b(null).c(hVar.e(), hVar.c()).a();
                }
            }
            intent.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", hVar);
            if (w.J0(2)) {
                Log.v("FragmentManager", "CreateIntent created the following intent: " + intent);
            }
            return intent;
        }

        @Override // g.a
        /* JADX INFO: renamed from: e */
        public f.a c(int i10, Intent intent) {
            return new f.a(i10, intent);
        }
    }

    interface l {
        boolean a(ArrayList arrayList, ArrayList arrayList2);
    }

    private class m implements l {

        /* JADX INFO: renamed from: a */
        final String f2498a;

        /* JADX INFO: renamed from: b */
        final int f2499b;

        /* JADX INFO: renamed from: c */
        final int f2500c;

        m(String str, int i10, int i11) {
            this.f2498a = str;
            this.f2499b = i10;
            this.f2500c = i11;
        }

        @Override // androidx.fragment.app.w.l
        public boolean a(ArrayList arrayList, ArrayList arrayList2) {
            o oVar = w.this.A;
            if (oVar == null || this.f2499b >= 0 || this.f2498a != null || !oVar.j1().Y0()) {
                return w.this.b1(arrayList, arrayList2, this.f2498a, this.f2499b, this.f2500c);
            }
            return false;
        }
    }

    class n implements l {
        n() {
        }

        @Override // androidx.fragment.app.w.l
        public boolean a(ArrayList arrayList, ArrayList arrayList2) {
            boolean zC1 = w.this.c1(arrayList, arrayList2);
            if (!w.this.f2474o.isEmpty() && arrayList.size() > 0) {
                ((Boolean) arrayList2.get(arrayList.size() - 1)).booleanValue();
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    linkedHashSet.addAll(w.this.o0((androidx.fragment.app.a) it.next()));
                }
                Iterator it2 = w.this.f2474o.iterator();
                while (it2.hasNext()) {
                    android.support.v4.media.session.b.a(it2.next());
                    Iterator it3 = linkedHashSet.iterator();
                    if (it3.hasNext()) {
                        throw null;
                    }
                }
            }
            return zC1;
        }
    }

    static o D0(View view) {
        Object tag = view.getTag(x0.b.f31537a);
        if (tag instanceof o) {
            return (o) tag;
        }
        return null;
    }

    public static boolean J0(int i10) {
        return U || Log.isLoggable("FragmentManager", i10);
    }

    private boolean K0(o oVar) {
        return (oVar.P && oVar.Q) || oVar.G.q();
    }

    private boolean L0() {
        o oVar = this.f2485z;
        if (oVar == null) {
            return true;
        }
        return oVar.a2() && this.f2485z.B1().L0();
    }

    private void M(o oVar) {
        if (oVar == null || !oVar.equals(g0(oVar.f2384f))) {
            return;
        }
        oVar.k3();
    }

    private void T(int i10) {
        try {
            this.f2461b = true;
            this.f2462c.d(i10);
            T0(i10, false);
            Iterator it = u().iterator();
            while (it.hasNext()) {
                ((m0) it.next()).q();
            }
            this.f2461b = false;
            b0(true);
        } catch (Throwable th2) {
            this.f2461b = false;
            throw th2;
        }
    }

    private void W() {
        if (this.N) {
            this.N = false;
            q1();
        }
    }

    public void Y() {
        Iterator it = u().iterator();
        while (it.hasNext()) {
            ((m0) it.next()).q();
        }
    }

    public static /* synthetic */ void a(w wVar, Integer num) {
        if (wVar.L0() && num.intValue() == 80) {
            wVar.G(false);
        }
    }

    private void a0(boolean z10) {
        if (this.f2461b) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        }
        if (this.f2483x == null) {
            if (!this.M) {
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
            throw new IllegalStateException("FragmentManager has been destroyed");
        }
        if (Looper.myLooper() != this.f2483x.j().getLooper()) {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
        if (!z10) {
            r();
        }
        if (this.O == null) {
            this.O = new ArrayList();
            this.P = new ArrayList();
        }
    }

    private boolean a1(String str, int i10, int i11) {
        b0(false);
        a0(true);
        o oVar = this.A;
        if (oVar != null && i10 < 0 && str == null && oVar.j1().Y0()) {
            return true;
        }
        boolean zB1 = b1(this.O, this.P, str, i10, i11);
        if (zB1) {
            this.f2461b = true;
            try {
                f1(this.O, this.P);
            } finally {
                s();
            }
        }
        s1();
        W();
        this.f2462c.b();
        return zB1;
    }

    public static /* synthetic */ void c(w wVar) {
        Iterator it = wVar.f2474o.iterator();
        if (it.hasNext()) {
            android.support.v4.media.session.b.a(it.next());
            throw null;
        }
    }

    public static /* synthetic */ void d(w wVar, a0.s sVar) {
        if (wVar.L0()) {
            wVar.O(sVar.a(), false);
        }
    }

    private static void d0(ArrayList arrayList, ArrayList arrayList2, int i10, int i11) {
        while (i10 < i11) {
            androidx.fragment.app.a aVar = (androidx.fragment.app.a) arrayList.get(i10);
            if (((Boolean) arrayList2.get(i10)).booleanValue()) {
                aVar.u(-1);
                aVar.A();
            } else {
                aVar.u(1);
                aVar.z();
            }
            i10++;
        }
    }

    public static /* synthetic */ void e(w wVar, a0.h hVar) {
        if (wVar.L0()) {
            wVar.H(hVar.a(), false);
        }
    }

    private void e0(ArrayList arrayList, ArrayList arrayList2, int i10, int i11) {
        boolean z10 = ((androidx.fragment.app.a) arrayList.get(i10)).f2207r;
        ArrayList arrayList3 = this.Q;
        if (arrayList3 == null) {
            this.Q = new ArrayList();
        } else {
            arrayList3.clear();
        }
        this.Q.addAll(this.f2462c.o());
        o oVarA0 = A0();
        boolean z11 = false;
        for (int i12 = i10; i12 < i11; i12++) {
            androidx.fragment.app.a aVar = (androidx.fragment.app.a) arrayList.get(i12);
            oVarA0 = !((Boolean) arrayList2.get(i12)).booleanValue() ? aVar.B(this.Q, oVarA0) : aVar.E(this.Q, oVarA0);
            z11 = z11 || aVar.f2198i;
        }
        this.Q.clear();
        if (!z10 && this.f2482w >= 1) {
            for (int i13 = i10; i13 < i11; i13++) {
                Iterator it = ((androidx.fragment.app.a) arrayList.get(i13)).f2192c.iterator();
                while (it.hasNext()) {
                    o oVar = ((d0.a) it.next()).f2210b;
                    if (oVar != null && oVar.E != null) {
                        this.f2462c.r(w(oVar));
                    }
                }
            }
        }
        d0(arrayList, arrayList2, i10, i11);
        boolean zBooleanValue = ((Boolean) arrayList2.get(i11 - 1)).booleanValue();
        if (z11 && !this.f2474o.isEmpty()) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                linkedHashSet.addAll(o0((androidx.fragment.app.a) it2.next()));
            }
            if (this.f2467h == null) {
                Iterator it3 = this.f2474o.iterator();
                while (it3.hasNext()) {
                    android.support.v4.media.session.b.a(it3.next());
                    Iterator it4 = linkedHashSet.iterator();
                    if (it4.hasNext()) {
                        throw null;
                    }
                }
                Iterator it5 = this.f2474o.iterator();
                while (it5.hasNext()) {
                    android.support.v4.media.session.b.a(it5.next());
                    Iterator it6 = linkedHashSet.iterator();
                    if (it6.hasNext()) {
                        throw null;
                    }
                }
            }
        }
        for (int i14 = i10; i14 < i11; i14++) {
            androidx.fragment.app.a aVar2 = (androidx.fragment.app.a) arrayList.get(i14);
            if (zBooleanValue) {
                for (int size = aVar2.f2192c.size() - 1; size >= 0; size--) {
                    o oVar2 = ((d0.a) aVar2.f2192c.get(size)).f2210b;
                    if (oVar2 != null) {
                        w(oVar2).m();
                    }
                }
            } else {
                Iterator it7 = aVar2.f2192c.iterator();
                while (it7.hasNext()) {
                    o oVar3 = ((d0.a) it7.next()).f2210b;
                    if (oVar3 != null) {
                        w(oVar3).m();
                    }
                }
            }
        }
        T0(this.f2482w, true);
        for (m0 m0Var : v(arrayList, i10, i11)) {
            m0Var.D(zBooleanValue);
            m0Var.z();
            m0Var.n();
        }
        while (i10 < i11) {
            androidx.fragment.app.a aVar3 = (androidx.fragment.app.a) arrayList.get(i10);
            if (((Boolean) arrayList2.get(i10)).booleanValue() && aVar3.f2142v >= 0) {
                aVar3.f2142v = -1;
            }
            aVar3.D();
            i10++;
        }
        if (z11) {
            g1();
        }
    }

    public static /* synthetic */ void f(w wVar, Configuration configuration) {
        if (wVar.L0()) {
            wVar.A(configuration, false);
        }
    }

    private void f1(ArrayList arrayList, ArrayList arrayList2) {
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList.size() != arrayList2.size()) {
            throw new IllegalStateException("Internal error with the back stack records");
        }
        int size = arrayList.size();
        int i10 = 0;
        int i11 = 0;
        while (i10 < size) {
            if (!((androidx.fragment.app.a) arrayList.get(i10)).f2207r) {
                if (i11 != i10) {
                    e0(arrayList, arrayList2, i11, i10);
                }
                i11 = i10 + 1;
                if (((Boolean) arrayList2.get(i10)).booleanValue()) {
                    while (i11 < size && ((Boolean) arrayList2.get(i11)).booleanValue() && !((androidx.fragment.app.a) arrayList.get(i11)).f2207r) {
                        i11++;
                    }
                }
                e0(arrayList, arrayList2, i10, i11);
                i10 = i11 - 1;
            }
            i10++;
        }
        if (i11 != size) {
            e0(arrayList, arrayList2, i11, size);
        }
    }

    private void g1() {
        if (this.f2474o.size() <= 0) {
            return;
        }
        android.support.v4.media.session.b.a(this.f2474o.get(0));
        throw null;
    }

    private int h0(String str, int i10, boolean z10) {
        if (this.f2463d.isEmpty()) {
            return -1;
        }
        if (str == null && i10 < 0) {
            if (z10) {
                return 0;
            }
            return this.f2463d.size() - 1;
        }
        int size = this.f2463d.size() - 1;
        while (size >= 0) {
            androidx.fragment.app.a aVar = (androidx.fragment.app.a) this.f2463d.get(size);
            if ((str != null && str.equals(aVar.C())) || (i10 >= 0 && i10 == aVar.f2142v)) {
                break;
            }
            size--;
        }
        if (size < 0) {
            return size;
        }
        if (!z10) {
            if (size == this.f2463d.size() - 1) {
                return -1;
            }
            return size + 1;
        }
        while (size > 0) {
            androidx.fragment.app.a aVar2 = (androidx.fragment.app.a) this.f2463d.get(size - 1);
            if ((str == null || !str.equals(aVar2.C())) && (i10 < 0 || i10 != aVar2.f2142v)) {
                break;
            }
            size--;
        }
        return size;
    }

    static int i1(int i10) {
        if (i10 == 4097) {
            return 8194;
        }
        if (i10 == 8194) {
            return 4097;
        }
        if (i10 == 8197) {
            return 4100;
        }
        if (i10 != 4099) {
            return i10 != 4100 ? 0 : 8197;
        }
        return 4099;
    }

    public static w l0(View view) {
        p pVar;
        o oVarM0 = m0(view);
        if (oVarM0 != null) {
            if (oVarM0.a2()) {
                return oVarM0.j1();
            }
            throw new IllegalStateException("The Fragment " + oVarM0 + " that owns View " + view + " has already been destroyed. Nested fragments should always use the child FragmentManager.");
        }
        Context context = view.getContext();
        while (true) {
            if (!(context instanceof ContextWrapper)) {
                pVar = null;
                break;
            }
            if (context instanceof p) {
                pVar = (p) context;
                break;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        if (pVar != null) {
            return pVar.N0();
        }
        throw new IllegalStateException("View " + view + " is not within a subclass of FragmentActivity.");
    }

    static o m0(View view) {
        while (view != null) {
            o oVarD0 = D0(view);
            if (oVarD0 != null) {
                return oVarD0;
            }
            Object parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        return null;
    }

    private void n0() {
        Iterator it = u().iterator();
        while (it.hasNext()) {
            ((m0) it.next()).r();
        }
    }

    private void o1(o oVar) {
        ViewGroup viewGroupT0 = t0(oVar);
        if (viewGroupT0 == null || oVar.l1() + oVar.o1() + oVar.D1() + oVar.E1() <= 0) {
            return;
        }
        int i10 = x0.b.f31539c;
        if (viewGroupT0.getTag(i10) == null) {
            viewGroupT0.setTag(i10, oVar);
        }
        ((o) viewGroupT0.getTag(i10)).J3(oVar.C1());
    }

    private boolean p0(ArrayList arrayList, ArrayList arrayList2) {
        synchronized (this.f2460a) {
            if (this.f2460a.isEmpty()) {
                return false;
            }
            try {
                int size = this.f2460a.size();
                boolean zA = false;
                for (int i10 = 0; i10 < size; i10++) {
                    zA |= ((l) this.f2460a.get(i10)).a(arrayList, arrayList2);
                }
                return zA;
            } finally {
                this.f2460a.clear();
                this.f2483x.j().removeCallbacks(this.T);
            }
        }
    }

    private void q1() {
        Iterator it = this.f2462c.k().iterator();
        while (it.hasNext()) {
            W0((b0) it.next());
        }
    }

    private void r() {
        if (Q0()) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
    }

    private z r0(o oVar) {
        return this.R.j(oVar);
    }

    private void r1(RuntimeException runtimeException) {
        Log.e("FragmentManager", runtimeException.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new j0("FragmentManager"));
        t tVar = this.f2483x;
        if (tVar != null) {
            try {
                tVar.k("  ", null, printWriter, new String[0]);
                throw runtimeException;
            } catch (Exception e10) {
                Log.e("FragmentManager", "Failed dumping state", e10);
                throw runtimeException;
            }
        }
        try {
            X("  ", null, printWriter, new String[0]);
            throw runtimeException;
        } catch (Exception e11) {
            Log.e("FragmentManager", "Failed dumping state", e11);
            throw runtimeException;
        }
    }

    private void s() {
        this.f2461b = false;
        this.P.clear();
        this.O.clear();
    }

    private void s1() {
        synchronized (this.f2460a) {
            try {
                if (!this.f2460a.isEmpty()) {
                    this.f2469j.j(true);
                    if (J0(3)) {
                        Log.d("FragmentManager", "FragmentManager " + this + " enabling OnBackPressedCallback, caused by non-empty pending actions");
                    }
                    return;
                }
                boolean z10 = q0() > 0 && O0(this.f2485z);
                if (J0(3)) {
                    Log.d("FragmentManager", "OnBackPressedCallback for FragmentManager " + this + " enabled state is " + z10);
                }
                this.f2469j.j(z10);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private void t() {
        t tVar = this.f2483x;
        if (tVar instanceof y0 ? this.f2462c.p().n() : tVar.g() instanceof Activity ? !((Activity) this.f2483x.g()).isChangingConfigurations() : true) {
            Iterator it = this.f2471l.values().iterator();
            while (it.hasNext()) {
                Iterator it2 = ((androidx.fragment.app.c) it.next()).f2181a.iterator();
                while (it2.hasNext()) {
                    this.f2462c.p().g((String) it2.next(), false);
                }
            }
        }
    }

    private ViewGroup t0(o oVar) {
        ViewGroup viewGroup = oVar.S;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (oVar.J > 0 && this.f2484y.e()) {
            View viewC = this.f2484y.c(oVar.J);
            if (viewC instanceof ViewGroup) {
                return (ViewGroup) viewC;
            }
        }
        return null;
    }

    private Set u() {
        HashSet hashSet = new HashSet();
        Iterator it = this.f2462c.k().iterator();
        while (it.hasNext()) {
            ViewGroup viewGroup = ((b0) it.next()).k().S;
            if (viewGroup != null) {
                hashSet.add(m0.v(viewGroup, B0()));
            }
        }
        return hashSet;
    }

    void A(Configuration configuration, boolean z10) {
        if (z10 && (this.f2483x instanceof b0.e)) {
            r1(new IllegalStateException("Do not call dispatchConfigurationChanged() on host. Host implements OnConfigurationChangedProvider and automatically dispatches configuration changes to fragments."));
        }
        for (o oVar : this.f2462c.o()) {
            if (oVar != null) {
                oVar.U2(configuration);
                if (z10) {
                    oVar.G.A(configuration, true);
                }
            }
        }
    }

    public o A0() {
        return this.A;
    }

    boolean B(MenuItem menuItem) {
        if (this.f2482w < 1) {
            return false;
        }
        for (o oVar : this.f2462c.o()) {
            if (oVar != null && oVar.V2(menuItem)) {
                return true;
            }
        }
        return false;
    }

    n0 B0() {
        n0 n0Var = this.D;
        if (n0Var != null) {
            return n0Var;
        }
        o oVar = this.f2485z;
        return oVar != null ? oVar.E.B0() : this.E;
    }

    void C() {
        this.K = false;
        this.L = false;
        this.R.p(false);
        T(1);
    }

    public c.C0442c C0() {
        return this.S;
    }

    boolean D(Menu menu, MenuInflater menuInflater) {
        if (this.f2482w < 1) {
            return false;
        }
        ArrayList arrayList = null;
        boolean z10 = false;
        for (o oVar : this.f2462c.o()) {
            if (oVar != null && N0(oVar) && oVar.X2(menu, menuInflater)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(oVar);
                z10 = true;
            }
        }
        if (this.f2464e != null) {
            for (int i10 = 0; i10 < this.f2464e.size(); i10++) {
                o oVar2 = (o) this.f2464e.get(i10);
                if (arrayList == null || !arrayList.contains(oVar2)) {
                    oVar2.x2();
                }
            }
        }
        this.f2464e = arrayList;
        return z10;
    }

    void E() {
        this.M = true;
        b0(true);
        Y();
        t();
        T(-1);
        Object obj = this.f2483x;
        if (obj instanceof b0.f) {
            ((b0.f) obj).Q(this.f2478s);
        }
        Object obj2 = this.f2483x;
        if (obj2 instanceof b0.e) {
            ((b0.e) obj2).i(this.f2477r);
        }
        Object obj3 = this.f2483x;
        if (obj3 instanceof a0.o) {
            ((a0.o) obj3).E(this.f2479t);
        }
        Object obj4 = this.f2483x;
        if (obj4 instanceof a0.p) {
            ((a0.p) obj4).t(this.f2480u);
        }
        Object obj5 = this.f2483x;
        if ((obj5 instanceof m0.o) && this.f2485z == null) {
            ((m0.o) obj5).removeMenuProvider(this.f2481v);
        }
        this.f2483x = null;
        this.f2484y = null;
        this.f2485z = null;
        if (this.f2466g != null) {
            this.f2469j.h();
            this.f2466g = null;
        }
        f.c cVar = this.F;
        if (cVar != null) {
            cVar.c();
            this.G.c();
            this.H.c();
        }
    }

    x0 E0(o oVar) {
        return this.R.m(oVar);
    }

    void F() {
        T(1);
    }

    void F0() {
        this.f2468i = true;
        b0(true);
        this.f2468i = false;
        if (!V || this.f2467h == null) {
            if (this.f2469j.g()) {
                if (J0(3)) {
                    Log.d("FragmentManager", "Calling popBackStackImmediate via onBackPressed callback");
                }
                Y0();
                return;
            } else {
                if (J0(3)) {
                    Log.d("FragmentManager", "Calling onBackPressed via onBackPressed callback");
                }
                this.f2466g.r();
                return;
            }
        }
        if (!this.f2474o.isEmpty()) {
            LinkedHashSet linkedHashSet = new LinkedHashSet(o0(this.f2467h));
            Iterator it = this.f2474o.iterator();
            while (it.hasNext()) {
                android.support.v4.media.session.b.a(it.next());
                Iterator it2 = linkedHashSet.iterator();
                if (it2.hasNext()) {
                    throw null;
                }
            }
        }
        Iterator it3 = this.f2467h.f2192c.iterator();
        while (it3.hasNext()) {
            o oVar = ((d0.a) it3.next()).f2210b;
            if (oVar != null) {
                oVar.f2400w = false;
            }
        }
        Iterator it4 = v(new ArrayList(Collections.singletonList(this.f2467h)), 0, 1).iterator();
        while (it4.hasNext()) {
            ((m0) it4.next()).f();
        }
        Iterator it5 = this.f2467h.f2192c.iterator();
        while (it5.hasNext()) {
            o oVar2 = ((d0.a) it5.next()).f2210b;
            if (oVar2 != null && oVar2.S == null) {
                w(oVar2).m();
            }
        }
        this.f2467h = null;
        s1();
        if (J0(3)) {
            Log.d("FragmentManager", "Op is being set to null");
            Log.d("FragmentManager", "OnBackPressedCallback enabled=" + this.f2469j.g() + " for  FragmentManager " + this);
        }
    }

    void G(boolean z10) {
        if (z10 && (this.f2483x instanceof b0.f)) {
            r1(new IllegalStateException("Do not call dispatchLowMemory() on host. Host implements OnTrimMemoryProvider and automatically dispatches low memory callbacks to fragments."));
        }
        for (o oVar : this.f2462c.o()) {
            if (oVar != null) {
                oVar.d3();
                if (z10) {
                    oVar.G.G(true);
                }
            }
        }
    }

    void G0(o oVar) {
        if (J0(2)) {
            Log.v("FragmentManager", "hide: " + oVar);
        }
        if (oVar.L) {
            return;
        }
        oVar.L = true;
        oVar.Z = true ^ oVar.Z;
        o1(oVar);
    }

    void H(boolean z10, boolean z11) {
        if (z11 && (this.f2483x instanceof a0.o)) {
            r1(new IllegalStateException("Do not call dispatchMultiWindowModeChanged() on host. Host implements OnMultiWindowModeChangedProvider and automatically dispatches multi-window mode changes to fragments."));
        }
        for (o oVar : this.f2462c.o()) {
            if (oVar != null) {
                oVar.e3(z10);
                if (z11) {
                    oVar.G.H(z10, true);
                }
            }
        }
    }

    void H0(o oVar) {
        if (oVar.f2398u && K0(oVar)) {
            this.J = true;
        }
    }

    void I(o oVar) {
        Iterator it = this.f2476q.iterator();
        while (it.hasNext()) {
            ((y0.n) it.next()).a(this, oVar);
        }
    }

    public boolean I0() {
        return this.M;
    }

    void J() {
        for (o oVar : this.f2462c.l()) {
            if (oVar != null) {
                oVar.B2(oVar.c2());
                oVar.G.J();
            }
        }
    }

    boolean K(MenuItem menuItem) {
        if (this.f2482w < 1) {
            return false;
        }
        for (o oVar : this.f2462c.o()) {
            if (oVar != null && oVar.f3(menuItem)) {
                return true;
            }
        }
        return false;
    }

    void L(Menu menu) {
        if (this.f2482w < 1) {
            return;
        }
        for (o oVar : this.f2462c.o()) {
            if (oVar != null) {
                oVar.g3(menu);
            }
        }
    }

    boolean M0(o oVar) {
        if (oVar == null) {
            return false;
        }
        return oVar.c2();
    }

    void N() {
        T(5);
    }

    boolean N0(o oVar) {
        if (oVar == null) {
            return true;
        }
        return oVar.e2();
    }

    void O(boolean z10, boolean z11) {
        if (z11 && (this.f2483x instanceof a0.p)) {
            r1(new IllegalStateException("Do not call dispatchPictureInPictureModeChanged() on host. Host implements OnPictureInPictureModeChangedProvider and automatically dispatches picture-in-picture mode changes to fragments."));
        }
        for (o oVar : this.f2462c.o()) {
            if (oVar != null) {
                oVar.i3(z10);
                if (z11) {
                    oVar.G.O(z10, true);
                }
            }
        }
    }

    boolean O0(o oVar) {
        if (oVar == null) {
            return true;
        }
        w wVar = oVar.E;
        return oVar.equals(wVar.A0()) && O0(wVar.f2485z);
    }

    boolean P(Menu menu) {
        boolean z10 = false;
        if (this.f2482w < 1) {
            return false;
        }
        for (o oVar : this.f2462c.o()) {
            if (oVar != null && N0(oVar) && oVar.j3(menu)) {
                z10 = true;
            }
        }
        return z10;
    }

    boolean P0(int i10) {
        return this.f2482w >= i10;
    }

    void Q() {
        s1();
        M(this.A);
    }

    public boolean Q0() {
        return this.K || this.L;
    }

    void R() {
        this.K = false;
        this.L = false;
        this.R.p(false);
        T(7);
    }

    void R0(o oVar, String[] strArr, int i10) {
        if (this.H == null) {
            this.f2483x.o(oVar, strArr, i10);
            return;
        }
        this.I.addLast(new k(oVar.f2384f, i10));
        this.H.a(strArr);
    }

    void S() {
        this.K = false;
        this.L = false;
        this.R.p(false);
        T(5);
    }

    void S0(o oVar, Intent intent, int i10, Bundle bundle) {
        if (this.F == null) {
            this.f2483x.q(oVar, intent, i10, bundle);
            return;
        }
        this.I.addLast(new k(oVar.f2384f, i10));
        if (bundle != null) {
            intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
        }
        this.F.a(intent);
    }

    void T0(int i10, boolean z10) {
        t tVar;
        if (this.f2483x == null && i10 != -1) {
            throw new IllegalStateException("No activity");
        }
        if (z10 || i10 != this.f2482w) {
            this.f2482w = i10;
            this.f2462c.t();
            q1();
            if (this.J && (tVar = this.f2483x) != null && this.f2482w == 7) {
                tVar.r();
                this.J = false;
            }
        }
    }

    void U() {
        this.L = true;
        this.R.p(true);
        T(4);
    }

    void U0() {
        if (this.f2483x == null) {
            return;
        }
        this.K = false;
        this.L = false;
        this.R.p(false);
        for (o oVar : this.f2462c.o()) {
            if (oVar != null) {
                oVar.k2();
            }
        }
    }

    void V() {
        T(2);
    }

    public final void V0(FragmentContainerView fragmentContainerView) {
        View view;
        for (b0 b0Var : this.f2462c.k()) {
            o oVarK = b0Var.k();
            if (oVarK.J == fragmentContainerView.getId() && (view = oVarK.T) != null && view.getParent() == null) {
                oVarK.S = fragmentContainerView;
                b0Var.b();
                b0Var.m();
            }
        }
    }

    void W0(b0 b0Var) {
        o oVarK = b0Var.k();
        if (oVarK.U) {
            if (this.f2461b) {
                this.N = true;
            } else {
                oVarK.U = false;
                b0Var.m();
            }
        }
    }

    public void X(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        String str2 = str + "    ";
        this.f2462c.e(str, fileDescriptor, printWriter, strArr);
        ArrayList arrayList = this.f2464e;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i10 = 0; i10 < size; i10++) {
                o oVar = (o) this.f2464e.get(i10);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i10);
                printWriter.print(": ");
                printWriter.println(oVar.toString());
            }
        }
        int size2 = this.f2463d.size();
        if (size2 > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i11 = 0; i11 < size2; i11++) {
                androidx.fragment.app.a aVar = (androidx.fragment.app.a) this.f2463d.get(i11);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i11);
                printWriter.print(": ");
                printWriter.println(aVar.toString());
                aVar.x(str2, printWriter);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.f2470k.get());
        synchronized (this.f2460a) {
            try {
                int size3 = this.f2460a.size();
                if (size3 > 0) {
                    printWriter.print(str);
                    printWriter.println("Pending Actions:");
                    for (int i12 = 0; i12 < size3; i12++) {
                        l lVar = (l) this.f2460a.get(i12);
                        printWriter.print(str);
                        printWriter.print("  #");
                        printWriter.print(i12);
                        printWriter.print(": ");
                        printWriter.println(lVar);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.f2483x);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.f2484y);
        if (this.f2485z != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.f2485z);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.f2482w);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.K);
        printWriter.print(" mStopped=");
        printWriter.print(this.L);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.M);
        if (this.J) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.J);
        }
    }

    void X0(int i10, int i11, boolean z10) {
        if (i10 >= 0) {
            Z(new m(null, i10, i11), z10);
            return;
        }
        throw new IllegalArgumentException("Bad id: " + i10);
    }

    public boolean Y0() {
        return a1(null, -1, 0);
    }

    void Z(l lVar, boolean z10) {
        if (!z10) {
            if (this.f2483x == null) {
                if (!this.M) {
                    throw new IllegalStateException("FragmentManager has not been attached to a host.");
                }
                throw new IllegalStateException("FragmentManager has been destroyed");
            }
            r();
        }
        synchronized (this.f2460a) {
            try {
                if (this.f2483x == null) {
                    if (!z10) {
                        throw new IllegalStateException("Activity has been destroyed");
                    }
                } else {
                    this.f2460a.add(lVar);
                    k1();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public boolean Z0(int i10, int i11) {
        if (i10 >= 0) {
            return a1(null, i10, i11);
        }
        throw new IllegalArgumentException("Bad id: " + i10);
    }

    boolean b0(boolean z10) {
        androidx.fragment.app.a aVar;
        a0(z10);
        boolean z11 = false;
        if (!this.f2468i && (aVar = this.f2467h) != null) {
            aVar.f2141u = false;
            aVar.v();
            if (J0(3)) {
                Log.d("FragmentManager", "Reversing mTransitioningOp " + this.f2467h + " as part of execPendingActions for actions " + this.f2460a);
            }
            this.f2467h.w(false, false);
            this.f2460a.add(0, this.f2467h);
            Iterator it = this.f2467h.f2192c.iterator();
            while (it.hasNext()) {
                o oVar = ((d0.a) it.next()).f2210b;
                if (oVar != null) {
                    oVar.f2400w = false;
                }
            }
            this.f2467h = null;
        }
        while (p0(this.O, this.P)) {
            z11 = true;
            this.f2461b = true;
            try {
                f1(this.O, this.P);
            } finally {
                s();
            }
        }
        s1();
        W();
        this.f2462c.b();
        return z11;
    }

    boolean b1(ArrayList arrayList, ArrayList arrayList2, String str, int i10, int i11) {
        int iH0 = h0(str, i10, (i11 & 1) != 0);
        if (iH0 < 0) {
            return false;
        }
        for (int size = this.f2463d.size() - 1; size >= iH0; size--) {
            arrayList.add((androidx.fragment.app.a) this.f2463d.remove(size));
            arrayList2.add(Boolean.TRUE);
        }
        return true;
    }

    void c0(l lVar, boolean z10) {
        if (z10 && (this.f2483x == null || this.M)) {
            return;
        }
        a0(z10);
        androidx.fragment.app.a aVar = this.f2467h;
        boolean z11 = false;
        if (aVar != null) {
            aVar.f2141u = false;
            aVar.v();
            if (J0(3)) {
                Log.d("FragmentManager", "Reversing mTransitioningOp " + this.f2467h + " as part of execSingleAction for action " + lVar);
            }
            this.f2467h.w(false, false);
            boolean zA = this.f2467h.a(this.O, this.P);
            Iterator it = this.f2467h.f2192c.iterator();
            while (it.hasNext()) {
                o oVar = ((d0.a) it.next()).f2210b;
                if (oVar != null) {
                    oVar.f2400w = false;
                }
            }
            this.f2467h = null;
            z11 = zA;
        }
        boolean zA2 = lVar.a(this.O, this.P);
        if (z11 || zA2) {
            this.f2461b = true;
            try {
                f1(this.O, this.P);
            } finally {
                s();
            }
        }
        s1();
        W();
        this.f2462c.b();
    }

    boolean c1(ArrayList arrayList, ArrayList arrayList2) {
        if (J0(2)) {
            Log.v("FragmentManager", "FragmentManager has the following pending actions inside of prepareBackStackState: " + this.f2460a);
        }
        if (this.f2463d.isEmpty()) {
            Log.i("FragmentManager", "Ignoring call to start back stack pop because the back stack is empty.");
            return false;
        }
        ArrayList arrayList3 = this.f2463d;
        androidx.fragment.app.a aVar = (androidx.fragment.app.a) arrayList3.get(arrayList3.size() - 1);
        this.f2467h = aVar;
        Iterator it = aVar.f2192c.iterator();
        while (it.hasNext()) {
            o oVar = ((d0.a) it.next()).f2210b;
            if (oVar != null) {
                oVar.f2400w = true;
            }
        }
        return b1(arrayList, arrayList2, null, -1, 0);
    }

    void d1() {
        Z(new n(), false);
    }

    void e1(o oVar) {
        if (J0(2)) {
            Log.v("FragmentManager", "remove: " + oVar + " nesting=" + oVar.D);
        }
        boolean zD2 = oVar.d2();
        if (oVar.M && zD2) {
            return;
        }
        this.f2462c.u(oVar);
        if (K0(oVar)) {
            this.J = true;
        }
        oVar.f2399v = true;
        o1(oVar);
    }

    public boolean f0() {
        boolean zB0 = b0(true);
        n0();
        return zB0;
    }

    o g0(String str) {
        return this.f2462c.f(str);
    }

    void h1(Parcelable parcelable) {
        b0 b0Var;
        Bundle bundle;
        Bundle bundle2;
        if (parcelable == null) {
            return;
        }
        Bundle bundle3 = (Bundle) parcelable;
        for (String str : bundle3.keySet()) {
            if (str.startsWith("result_") && (bundle2 = bundle3.getBundle(str)) != null) {
                bundle2.setClassLoader(this.f2483x.g().getClassLoader());
                this.f2472m.put(str.substring(7), bundle2);
            }
        }
        HashMap map = new HashMap();
        for (String str2 : bundle3.keySet()) {
            if (str2.startsWith("fragment_") && (bundle = bundle3.getBundle(str2)) != null) {
                bundle.setClassLoader(this.f2483x.g().getClassLoader());
                map.put(str2.substring(9), bundle);
            }
        }
        this.f2462c.x(map);
        y yVar = (y) bundle3.getParcelable("state");
        if (yVar == null) {
            return;
        }
        this.f2462c.v();
        Iterator it = yVar.f2503a.iterator();
        while (it.hasNext()) {
            Bundle bundleB = this.f2462c.B((String) it.next(), null);
            if (bundleB != null) {
                o oVarI = this.R.i(((a0) bundleB.getParcelable("state")).f2145b);
                if (oVarI != null) {
                    if (J0(2)) {
                        Log.v("FragmentManager", "restoreSaveState: re-attaching retained " + oVarI);
                    }
                    b0Var = new b0(this.f2475p, this.f2462c, oVarI, bundleB);
                } else {
                    b0Var = new b0(this.f2475p, this.f2462c, this.f2483x.g().getClassLoader(), u0(), bundleB);
                }
                o oVarK = b0Var.k();
                oVarK.f2376b = bundleB;
                oVarK.E = this;
                if (J0(2)) {
                    Log.v("FragmentManager", "restoreSaveState: active (" + oVarK.f2384f + "): " + oVarK);
                }
                b0Var.o(this.f2483x.g().getClassLoader());
                this.f2462c.r(b0Var);
                b0Var.s(this.f2482w);
            }
        }
        for (o oVar : this.R.l()) {
            if (!this.f2462c.c(oVar.f2384f)) {
                if (J0(2)) {
                    Log.v("FragmentManager", "Discarding retained Fragment " + oVar + " that was not found in the set of active Fragments " + yVar.f2503a);
                }
                this.R.o(oVar);
                oVar.E = this;
                b0 b0Var2 = new b0(this.f2475p, this.f2462c, oVar);
                b0Var2.s(1);
                b0Var2.m();
                oVar.f2399v = true;
                b0Var2.m();
            }
        }
        this.f2462c.w(yVar.f2504b);
        if (yVar.f2505c != null) {
            this.f2463d = new ArrayList(yVar.f2505c.length);
            int i10 = 0;
            while (true) {
                androidx.fragment.app.b[] bVarArr = yVar.f2505c;
                if (i10 >= bVarArr.length) {
                    break;
                }
                androidx.fragment.app.a aVarC = bVarArr[i10].c(this);
                if (J0(2)) {
                    Log.v("FragmentManager", "restoreAllState: back stack #" + i10 + " (index " + aVarC.f2142v + "): " + aVarC);
                    PrintWriter printWriter = new PrintWriter(new j0("FragmentManager"));
                    aVarC.y("  ", printWriter, false);
                    printWriter.close();
                }
                this.f2463d.add(aVarC);
                i10++;
            }
        } else {
            this.f2463d = new ArrayList();
        }
        this.f2470k.set(yVar.f2506d);
        String str3 = yVar.f2507e;
        if (str3 != null) {
            o oVarG0 = g0(str3);
            this.A = oVarG0;
            M(oVarG0);
        }
        ArrayList arrayList = yVar.f2508f;
        if (arrayList != null) {
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                this.f2471l.put((String) arrayList.get(i11), (androidx.fragment.app.c) yVar.f2509g.get(i11));
            }
        }
        this.I = new ArrayDeque(yVar.f2510h);
    }

    void i(androidx.fragment.app.a aVar) {
        this.f2463d.add(aVar);
    }

    public o i0(int i10) {
        return this.f2462c.g(i10);
    }

    b0 j(o oVar) {
        String str = oVar.f2379c0;
        if (str != null) {
            z0.c.f(oVar, str);
        }
        if (J0(2)) {
            Log.v("FragmentManager", "add: " + oVar);
        }
        b0 b0VarW = w(oVar);
        oVar.E = this;
        this.f2462c.r(b0VarW);
        if (!oVar.M) {
            this.f2462c.a(oVar);
            oVar.f2399v = false;
            if (oVar.T == null) {
                oVar.Z = false;
            }
            if (K0(oVar)) {
                this.J = true;
            }
        }
        return b0VarW;
    }

    public o j0(String str) {
        return this.f2462c.h(str);
    }

    public Bundle j1() {
        androidx.fragment.app.b[] bVarArr;
        Bundle bundle = new Bundle();
        n0();
        Y();
        b0(true);
        this.K = true;
        this.R.p(true);
        ArrayList arrayListY = this.f2462c.y();
        HashMap mapM = this.f2462c.m();
        if (!mapM.isEmpty()) {
            ArrayList arrayListZ = this.f2462c.z();
            int size = this.f2463d.size();
            if (size > 0) {
                bVarArr = new androidx.fragment.app.b[size];
                for (int i10 = 0; i10 < size; i10++) {
                    bVarArr[i10] = new androidx.fragment.app.b((androidx.fragment.app.a) this.f2463d.get(i10));
                    if (J0(2)) {
                        Log.v("FragmentManager", "saveAllState: adding back stack #" + i10 + ": " + this.f2463d.get(i10));
                    }
                }
            } else {
                bVarArr = null;
            }
            y yVar = new y();
            yVar.f2503a = arrayListY;
            yVar.f2504b = arrayListZ;
            yVar.f2505c = bVarArr;
            yVar.f2506d = this.f2470k.get();
            o oVar = this.A;
            if (oVar != null) {
                yVar.f2507e = oVar.f2384f;
            }
            yVar.f2508f.addAll(this.f2471l.keySet());
            yVar.f2509g.addAll(this.f2471l.values());
            yVar.f2510h = new ArrayList(this.I);
            bundle.putParcelable("state", yVar);
            for (String str : this.f2472m.keySet()) {
                bundle.putBundle("result_" + str, (Bundle) this.f2472m.get(str));
            }
            for (String str2 : mapM.keySet()) {
                bundle.putBundle("fragment_" + str2, (Bundle) mapM.get(str2));
            }
        } else if (J0(2)) {
            Log.v("FragmentManager", "saveAllState: no fragments!");
            return bundle;
        }
        return bundle;
    }

    public void k(y0.n nVar) {
        this.f2476q.add(nVar);
    }

    o k0(String str) {
        return this.f2462c.i(str);
    }

    void k1() {
        synchronized (this.f2460a) {
            try {
                if (this.f2460a.size() == 1) {
                    this.f2483x.j().removeCallbacks(this.T);
                    this.f2483x.j().post(this.T);
                    s1();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    int l() {
        return this.f2470k.getAndIncrement();
    }

    void l1(o oVar, boolean z10) {
        ViewGroup viewGroupT0 = t0(oVar);
        if (viewGroupT0 == null || !(viewGroupT0 instanceof FragmentContainerView)) {
            return;
        }
        ((FragmentContainerView) viewGroupT0).setDrawDisappearingViewsLast(!z10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    void m(t tVar, y0.g gVar, o oVar) {
        String str;
        if (this.f2483x != null) {
            throw new IllegalStateException("Already attached");
        }
        this.f2483x = tVar;
        this.f2484y = gVar;
        this.f2485z = oVar;
        if (oVar != null) {
            k(new g(oVar));
        } else if (tVar instanceof y0.n) {
            k((y0.n) tVar);
        }
        if (this.f2485z != null) {
            s1();
        }
        if (tVar instanceof d.k0) {
            d.k0 k0Var = (d.k0) tVar;
            d.j0 j0VarD = k0Var.d();
            this.f2466g = j0VarD;
            androidx.lifecycle.t tVar2 = k0Var;
            if (oVar != null) {
                tVar2 = oVar;
            }
            j0VarD.o(tVar2, this.f2469j);
        }
        if (oVar != null) {
            this.R = oVar.E.r0(oVar);
        } else if (tVar instanceof y0) {
            this.R = z.k(((y0) tVar).U());
        } else {
            this.R = new z(false);
        }
        this.R.p(Q0());
        this.f2462c.A(this.R);
        Object obj = this.f2483x;
        if ((obj instanceof l1.i) && oVar == null) {
            l1.f fVarE0 = ((l1.i) obj).e0();
            fVarE0.c("android:support:fragments", new f.b() { // from class: y0.l
                @Override // l1.f.b
                public final Bundle a() {
                    return this.f32277a.j1();
                }
            });
            Bundle bundleA = fVarE0.a("android:support:fragments");
            if (bundleA != null) {
                h1(bundleA);
            }
        }
        Object obj2 = this.f2483x;
        if (obj2 instanceof f.g) {
            f.f fVarL = ((f.g) obj2).l();
            if (oVar != null) {
                str = oVar.f2384f + ":";
            } else {
                str = "";
            }
            String str2 = "FragmentManager:" + str;
            this.F = fVarL.o(str2 + "StartActivityForResult", new g.e(), new h());
            this.G = fVarL.o(str2 + "StartIntentSenderForResult", new j(), new i());
            this.H = fVarL.o(str2 + "RequestPermissions", new g.d(), new a());
        }
        Object obj3 = this.f2483x;
        if (obj3 instanceof b0.e) {
            ((b0.e) obj3).H(this.f2477r);
        }
        Object obj4 = this.f2483x;
        if (obj4 instanceof b0.f) {
            ((b0.f) obj4).J(this.f2478s);
        }
        Object obj5 = this.f2483x;
        if (obj5 instanceof a0.o) {
            ((a0.o) obj5).I(this.f2479t);
        }
        Object obj6 = this.f2483x;
        if (obj6 instanceof a0.p) {
            ((a0.p) obj6).L(this.f2480u);
        }
        Object obj7 = this.f2483x;
        if ((obj7 instanceof m0.o) && oVar == null) {
            ((m0.o) obj7).addMenuProvider(this.f2481v);
        }
    }

    void m1(o oVar, m.b bVar) {
        if (oVar.equals(g0(oVar.f2384f)) && (oVar.F == null || oVar.E == this)) {
            oVar.f2381d0 = bVar;
            return;
        }
        throw new IllegalArgumentException("Fragment " + oVar + " is not an active fragment of FragmentManager " + this);
    }

    void n(o oVar) {
        if (J0(2)) {
            Log.v("FragmentManager", "attach: " + oVar);
        }
        if (oVar.M) {
            oVar.M = false;
            if (oVar.f2398u) {
                return;
            }
            this.f2462c.a(oVar);
            if (J0(2)) {
                Log.v("FragmentManager", "add from attach: " + oVar);
            }
            if (K0(oVar)) {
                this.J = true;
            }
        }
    }

    void n1(o oVar) {
        if (oVar == null || (oVar.equals(g0(oVar.f2384f)) && (oVar.F == null || oVar.E == this))) {
            o oVar2 = this.A;
            this.A = oVar;
            M(oVar2);
            M(this.A);
            return;
        }
        throw new IllegalArgumentException("Fragment " + oVar + " is not an active fragment of FragmentManager " + this);
    }

    public d0 o() {
        return new androidx.fragment.app.a(this);
    }

    Set o0(androidx.fragment.app.a aVar) {
        HashSet hashSet = new HashSet();
        for (int i10 = 0; i10 < aVar.f2192c.size(); i10++) {
            o oVar = ((d0.a) aVar.f2192c.get(i10)).f2210b;
            if (oVar != null && aVar.f2198i) {
                hashSet.add(oVar);
            }
        }
        return hashSet;
    }

    void p() {
        if (J0(3)) {
            Log.d("FragmentManager", "cancelBackStackTransition for transition " + this.f2467h);
        }
        androidx.fragment.app.a aVar = this.f2467h;
        if (aVar != null) {
            aVar.f2141u = false;
            aVar.v();
            this.f2467h.r(true, new Runnable() { // from class: y0.m
                @Override // java.lang.Runnable
                public final void run() {
                    w.c(this.f32278a);
                }
            });
            this.f2467h.h();
            this.f2468i = true;
            f0();
            this.f2468i = false;
            this.f2467h = null;
        }
    }

    void p1(o oVar) {
        if (J0(2)) {
            Log.v("FragmentManager", "show: " + oVar);
        }
        if (oVar.L) {
            oVar.L = false;
            oVar.Z = !oVar.Z;
        }
    }

    boolean q() {
        boolean zK0 = false;
        for (o oVar : this.f2462c.l()) {
            if (oVar != null) {
                zK0 = K0(oVar);
            }
            if (zK0) {
                return true;
            }
        }
        return false;
    }

    public int q0() {
        return this.f2463d.size() + (this.f2467h != null ? 1 : 0);
    }

    y0.g s0() {
        return this.f2484y;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("FragmentManager{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append(" in ");
        o oVar = this.f2485z;
        if (oVar != null) {
            sb2.append(oVar.getClass().getSimpleName());
            sb2.append("{");
            sb2.append(Integer.toHexString(System.identityHashCode(this.f2485z)));
            sb2.append("}");
        } else {
            t tVar = this.f2483x;
            if (tVar != null) {
                sb2.append(tVar.getClass().getSimpleName());
                sb2.append("{");
                sb2.append(Integer.toHexString(System.identityHashCode(this.f2483x)));
                sb2.append("}");
            } else {
                sb2.append("null");
            }
        }
        sb2.append("}}");
        return sb2.toString();
    }

    public s u0() {
        s sVar = this.B;
        if (sVar != null) {
            return sVar;
        }
        o oVar = this.f2485z;
        return oVar != null ? oVar.E.u0() : this.C;
    }

    Set v(ArrayList arrayList, int i10, int i11) {
        ViewGroup viewGroup;
        HashSet hashSet = new HashSet();
        while (i10 < i11) {
            Iterator it = ((androidx.fragment.app.a) arrayList.get(i10)).f2192c.iterator();
            while (it.hasNext()) {
                o oVar = ((d0.a) it.next()).f2210b;
                if (oVar != null && (viewGroup = oVar.S) != null) {
                    hashSet.add(m0.u(viewGroup, this));
                }
            }
            i10++;
        }
        return hashSet;
    }

    public List v0() {
        return this.f2462c.o();
    }

    b0 w(o oVar) {
        b0 b0VarN = this.f2462c.n(oVar.f2384f);
        if (b0VarN != null) {
            return b0VarN;
        }
        b0 b0Var = new b0(this.f2475p, this.f2462c, oVar);
        b0Var.o(this.f2483x.g().getClassLoader());
        b0Var.s(this.f2482w);
        return b0Var;
    }

    public t w0() {
        return this.f2483x;
    }

    void x(o oVar) {
        if (J0(2)) {
            Log.v("FragmentManager", "detach: " + oVar);
        }
        if (oVar.M) {
            return;
        }
        oVar.M = true;
        if (oVar.f2398u) {
            if (J0(2)) {
                Log.v("FragmentManager", "remove from detach: " + oVar);
            }
            this.f2462c.u(oVar);
            if (K0(oVar)) {
                this.J = true;
            }
            o1(oVar);
        }
    }

    LayoutInflater.Factory2 x0() {
        return this.f2465f;
    }

    void y() {
        this.K = false;
        this.L = false;
        this.R.p(false);
        T(4);
    }

    v y0() {
        return this.f2475p;
    }

    void z() {
        this.K = false;
        this.L = false;
        this.R.p(false);
        T(0);
    }

    o z0() {
        return this.f2485z;
    }

    static class k implements Parcelable {
        public static final Parcelable.Creator<k> CREATOR = new a();

        /* JADX INFO: renamed from: a */
        String f2496a;

        /* JADX INFO: renamed from: b */
        int f2497b;

        class a implements Parcelable.Creator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a */
            public k createFromParcel(Parcel parcel) {
                return new k(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b */
            public k[] newArray(int i10) {
                return new k[i10];
            }
        }

        k(String str, int i10) {
            this.f2496a = str;
            this.f2497b = i10;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeString(this.f2496a);
            parcel.writeInt(this.f2497b);
        }

        k(Parcel parcel) {
            this.f2496a = parcel.readString();
            this.f2497b = parcel.readInt();
        }
    }
}
