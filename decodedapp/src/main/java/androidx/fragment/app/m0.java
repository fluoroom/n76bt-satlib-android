package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes.dex */
public abstract class m0 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f2320g = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ViewGroup f2321a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f2322b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List f2323c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f2324d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f2325e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f2326f;

    public static final class a {
        public /* synthetic */ a(rd.h hVar) {
            this();
        }

        public final m0 a(ViewGroup viewGroup, w wVar) {
            rd.m.e(viewGroup, "container");
            rd.m.e(wVar, "fragmentManager");
            n0 n0VarB0 = wVar.B0();
            rd.m.d(n0VarB0, "fragmentManager.specialEffectsControllerFactory");
            return b(viewGroup, n0VarB0);
        }

        public final m0 b(ViewGroup viewGroup, n0 n0Var) {
            rd.m.e(viewGroup, "container");
            rd.m.e(n0Var, "factory");
            int i10 = x0.b.f31538b;
            Object tag = viewGroup.getTag(i10);
            if (tag instanceof m0) {
                return (m0) tag;
            }
            m0 m0VarA = n0Var.a(viewGroup);
            rd.m.d(m0VarA, "factory.createController(container)");
            viewGroup.setTag(i10, m0VarA);
            return m0VarA;
        }

        private a() {
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final boolean f2327a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f2328b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f2329c;

        public final void a(ViewGroup viewGroup) {
            rd.m.e(viewGroup, "container");
            if (!this.f2329c) {
                c(viewGroup);
            }
            this.f2329c = true;
        }

        public boolean b() {
            return this.f2327a;
        }

        public abstract void c(ViewGroup viewGroup);

        public abstract void d(ViewGroup viewGroup);

        public void e(d.c cVar, ViewGroup viewGroup) {
            rd.m.e(cVar, "backEvent");
            rd.m.e(viewGroup, "container");
        }

        public void f(ViewGroup viewGroup) {
            rd.m.e(viewGroup, "container");
        }

        public final void g(ViewGroup viewGroup) {
            rd.m.e(viewGroup, "container");
            if (!this.f2328b) {
                f(viewGroup);
            }
            this.f2328b = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class c extends d {

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private final b0 f2330l;

        /* JADX WARN: Illegal instructions before constructor call */
        public c(d.b bVar, d.a aVar, b0 b0Var) {
            rd.m.e(bVar, "finalState");
            rd.m.e(aVar, "lifecycleImpact");
            rd.m.e(b0Var, "fragmentStateManager");
            o oVarK = b0Var.k();
            rd.m.d(oVarK, "fragmentStateManager.fragment");
            super(bVar, aVar, oVarK);
            this.f2330l = b0Var;
        }

        @Override // androidx.fragment.app.m0.d
        public void d() {
            super.d();
            h().f2400w = false;
            this.f2330l.m();
        }

        @Override // androidx.fragment.app.m0.d
        public void p() {
            if (n()) {
                return;
            }
            super.p();
            if (i() != d.a.ADDING) {
                if (i() == d.a.REMOVING) {
                    o oVarK = this.f2330l.k();
                    rd.m.d(oVarK, "fragmentStateManager.fragment");
                    View viewZ3 = oVarK.z3();
                    rd.m.d(viewZ3, "fragment.requireView()");
                    if (w.J0(2)) {
                        Log.v("FragmentManager", "Clearing focus " + viewZ3.findFocus() + " on view " + viewZ3 + " for Fragment " + oVarK);
                    }
                    viewZ3.clearFocus();
                    return;
                }
                return;
            }
            o oVarK2 = this.f2330l.k();
            rd.m.d(oVarK2, "fragmentStateManager.fragment");
            View viewFindFocus = oVarK2.T.findFocus();
            if (viewFindFocus != null) {
                oVarK2.F3(viewFindFocus);
                if (w.J0(2)) {
                    Log.v("FragmentManager", "requestFocus: Saved focused view " + viewFindFocus + " for Fragment " + oVarK2);
                }
            }
            View viewZ32 = h().z3();
            rd.m.d(viewZ32, "this.fragment.requireView()");
            if (viewZ32.getParent() == null) {
                if (w.J0(2)) {
                    Log.v("FragmentManager", "Adding fragment " + oVarK2 + " view " + viewZ32 + " to container in onStart");
                }
                this.f2330l.b();
                viewZ32.setAlpha(0.0f);
            }
            if (viewZ32.getAlpha() == 0.0f && viewZ32.getVisibility() == 0) {
                if (w.J0(2)) {
                    Log.v("FragmentManager", "Making view " + viewZ32 + " INVISIBLE in onStart");
                }
                viewZ32.setVisibility(4);
            }
            viewZ32.setAlpha(oVarK2.F1());
            if (w.J0(2)) {
                Log.v("FragmentManager", "Setting view alpha to " + oVarK2.F1() + " in onStart");
            }
        }
    }

    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private b f2331a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private a f2332b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final o f2333c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final List f2334d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f2335e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f2336f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private boolean f2337g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private boolean f2338h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private boolean f2339i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private final List f2340j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private final List f2341k;

        public enum a {
            NONE,
            ADDING,
            REMOVING
        }

        public enum b {
            REMOVED,
            VISIBLE,
            GONE,
            INVISIBLE;


            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f2346a = new a(null);

            public static final class a {
                public /* synthetic */ a(rd.h hVar) {
                    this();
                }

                public final b a(View view) {
                    rd.m.e(view, "<this>");
                    return (view.getAlpha() == 0.0f && view.getVisibility() == 0) ? b.INVISIBLE : b(view.getVisibility());
                }

                public final b b(int i10) {
                    if (i10 == 0) {
                        return b.VISIBLE;
                    }
                    if (i10 == 4) {
                        return b.INVISIBLE;
                    }
                    if (i10 == 8) {
                        return b.GONE;
                    }
                    throw new IllegalArgumentException("Unknown visibility " + i10);
                }

                private a() {
                }
            }

            /* JADX INFO: renamed from: androidx.fragment.app.m0$d$b$b, reason: collision with other inner class name */
            public /* synthetic */ class C0033b {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final /* synthetic */ int[] f2352a;

                static {
                    int[] iArr = new int[b.values().length];
                    try {
                        iArr[b.REMOVED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[b.VISIBLE.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[b.GONE.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[b.INVISIBLE.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    f2352a = iArr;
                }
            }

            public static final b e(int i10) {
                return f2346a.b(i10);
            }

            public final void d(View view, ViewGroup viewGroup) {
                rd.m.e(view, "view");
                rd.m.e(viewGroup, "container");
                if (w.J0(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Calling apply state");
                }
                int i10 = C0033b.f2352a[ordinal()];
                if (i10 == 1) {
                    ViewParent parent = view.getParent();
                    ViewGroup viewGroup2 = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                    if (viewGroup2 != null) {
                        if (w.J0(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Removing view " + view + " from container " + viewGroup2);
                        }
                        viewGroup2.removeView(view);
                        return;
                    }
                    return;
                }
                if (i10 == 2) {
                    if (w.J0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to VISIBLE");
                    }
                    ViewParent parent2 = view.getParent();
                    if ((parent2 instanceof ViewGroup ? (ViewGroup) parent2 : null) == null) {
                        if (w.J0(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Adding view " + view + " to Container " + viewGroup);
                        }
                        viewGroup.addView(view);
                    }
                    view.setVisibility(0);
                    return;
                }
                if (i10 == 3) {
                    if (w.J0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to GONE");
                    }
                    view.setVisibility(8);
                    return;
                }
                if (i10 != 4) {
                    return;
                }
                if (w.J0(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to INVISIBLE");
                }
                view.setVisibility(4);
            }
        }

        public /* synthetic */ class c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f2353a;

            static {
                int[] iArr = new int[a.values().length];
                try {
                    iArr[a.ADDING.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[a.REMOVING.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[a.NONE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f2353a = iArr;
            }
        }

        public d(b bVar, a aVar, o oVar) {
            rd.m.e(bVar, "finalState");
            rd.m.e(aVar, "lifecycleImpact");
            rd.m.e(oVar, "fragment");
            this.f2331a = bVar;
            this.f2332b = aVar;
            this.f2333c = oVar;
            this.f2334d = new ArrayList();
            this.f2339i = true;
            ArrayList arrayList = new ArrayList();
            this.f2340j = arrayList;
            this.f2341k = arrayList;
        }

        public final void a(Runnable runnable) {
            rd.m.e(runnable, "listener");
            this.f2334d.add(runnable);
        }

        public final void b(b bVar) {
            rd.m.e(bVar, "effect");
            this.f2340j.add(bVar);
        }

        public final void c(ViewGroup viewGroup) {
            rd.m.e(viewGroup, "container");
            this.f2338h = false;
            if (this.f2335e) {
                return;
            }
            this.f2335e = true;
            if (this.f2340j.isEmpty()) {
                d();
                return;
            }
            Iterator it = ed.q.H0(this.f2341k).iterator();
            while (it.hasNext()) {
                ((b) it.next()).a(viewGroup);
            }
        }

        public void d() {
            this.f2338h = false;
            if (this.f2336f) {
                return;
            }
            if (w.J0(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: " + this + " has called complete.");
            }
            this.f2336f = true;
            Iterator it = this.f2334d.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
        }

        public final void e(b bVar) {
            rd.m.e(bVar, "effect");
            if (this.f2340j.remove(bVar) && this.f2340j.isEmpty()) {
                d();
            }
        }

        public final List f() {
            return this.f2341k;
        }

        public final b g() {
            return this.f2331a;
        }

        public final o h() {
            return this.f2333c;
        }

        public final a i() {
            return this.f2332b;
        }

        public final boolean j() {
            return this.f2339i;
        }

        public final boolean k() {
            return this.f2335e;
        }

        public final boolean l() {
            return this.f2336f;
        }

        public final boolean m() {
            return this.f2337g;
        }

        public final boolean n() {
            return this.f2338h;
        }

        public final void o(b bVar, a aVar) {
            rd.m.e(bVar, "finalState");
            rd.m.e(aVar, "lifecycleImpact");
            int i10 = c.f2353a[aVar.ordinal()];
            if (i10 == 1) {
                if (this.f2331a == b.REMOVED) {
                    if (w.J0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: For fragment " + this.f2333c + " mFinalState = REMOVED -> VISIBLE. mLifecycleImpact = " + this.f2332b + " to ADDING.");
                    }
                    this.f2331a = b.VISIBLE;
                    this.f2332b = a.ADDING;
                    this.f2339i = true;
                    return;
                }
                return;
            }
            if (i10 == 2) {
                if (w.J0(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + this.f2333c + " mFinalState = " + this.f2331a + " -> REMOVED. mLifecycleImpact  = " + this.f2332b + " to REMOVING.");
                }
                this.f2331a = b.REMOVED;
                this.f2332b = a.REMOVING;
                this.f2339i = true;
                return;
            }
            if (i10 == 3 && this.f2331a != b.REMOVED) {
                if (w.J0(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + this.f2333c + " mFinalState = " + this.f2331a + " -> " + bVar + '.');
                }
                this.f2331a = bVar;
            }
        }

        public void p() {
            this.f2338h = true;
        }

        public final void q(boolean z10) {
            this.f2339i = z10;
        }

        public final void r(boolean z10) {
            this.f2337g = z10;
        }

        public String toString() {
            return "Operation {" + Integer.toHexString(System.identityHashCode(this)) + "} {finalState = " + this.f2331a + " lifecycleImpact = " + this.f2332b + " fragment = " + this.f2333c + '}';
        }
    }

    public /* synthetic */ class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f2354a;

        static {
            int[] iArr = new int[d.a.values().length];
            try {
                iArr[d.a.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f2354a = iArr;
        }
    }

    public m0(ViewGroup viewGroup) {
        rd.m.e(viewGroup, "container");
        this.f2321a = viewGroup;
        this.f2322b = new ArrayList();
        this.f2323c = new ArrayList();
    }

    private final void B(List list) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((d) list.get(i10)).p();
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ed.q.A(arrayList, ((d) it.next()).f());
        }
        List listH0 = ed.q.H0(ed.q.M0(arrayList));
        int size2 = listH0.size();
        for (int i11 = 0; i11 < size2; i11++) {
            ((b) listH0.get(i11)).g(this.f2321a);
        }
    }

    private final void C() {
        for (d dVar : this.f2322b) {
            if (dVar.i() == d.a.ADDING) {
                View viewZ3 = dVar.h().z3();
                rd.m.d(viewZ3, "fragment.requireView()");
                dVar.o(d.b.f2346a.b(viewZ3.getVisibility()), d.a.NONE);
            }
        }
    }

    private final void g(d.b bVar, d.a aVar, b0 b0Var) {
        synchronized (this.f2322b) {
            try {
                o oVarK = b0Var.k();
                rd.m.d(oVarK, "fragmentStateManager.fragment");
                d dVarO = o(oVarK);
                if (dVarO == null) {
                    if (b0Var.k().f2400w || b0Var.k().f2399v) {
                        o oVarK2 = b0Var.k();
                        rd.m.d(oVarK2, "fragmentStateManager.fragment");
                        dVarO = p(oVarK2);
                    } else {
                        dVarO = null;
                    }
                }
                if (dVarO != null) {
                    dVarO.o(bVar, aVar);
                    return;
                }
                final c cVar = new c(bVar, aVar, b0Var);
                this.f2322b.add(cVar);
                cVar.a(new Runnable() { // from class: androidx.fragment.app.k0
                    @Override // java.lang.Runnable
                    public final void run() {
                        m0.h(this.f2313a, cVar);
                    }
                });
                cVar.a(new Runnable() { // from class: androidx.fragment.app.l0
                    @Override // java.lang.Runnable
                    public final void run() {
                        m0.i(this.f2317a, cVar);
                    }
                });
                dd.d0 d0Var = dd.d0.f10897a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(m0 m0Var, c cVar) {
        rd.m.e(m0Var, "this$0");
        rd.m.e(cVar, "$operation");
        if (m0Var.f2322b.contains(cVar)) {
            d.b bVarG = cVar.g();
            View view = cVar.h().T;
            rd.m.d(view, "operation.fragment.mView");
            bVarG.d(view, m0Var.f2321a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(m0 m0Var, c cVar) {
        rd.m.e(m0Var, "this$0");
        rd.m.e(cVar, "$operation");
        m0Var.f2322b.remove(cVar);
        m0Var.f2323c.remove(cVar);
    }

    private final d o(o oVar) {
        Object next;
        Iterator it = this.f2322b.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            d dVar = (d) next;
            if (rd.m.a(dVar.h(), oVar) && !dVar.k()) {
                break;
            }
        }
        return (d) next;
    }

    private final d p(o oVar) {
        Object next;
        Iterator it = this.f2323c.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            d dVar = (d) next;
            if (rd.m.a(dVar.h(), oVar) && !dVar.k()) {
                break;
            }
        }
        return (d) next;
    }

    public static final m0 u(ViewGroup viewGroup, w wVar) {
        return f2320g.a(viewGroup, wVar);
    }

    public static final m0 v(ViewGroup viewGroup, n0 n0Var) {
        return f2320g.b(viewGroup, n0Var);
    }

    private final boolean w(List list) {
        boolean z10;
        Iterator it = list.iterator();
        loop0: while (true) {
            z10 = true;
            while (it.hasNext()) {
                d dVar = (d) it.next();
                if (!dVar.f().isEmpty()) {
                    List listF = dVar.f();
                    if (!d.h0.a(listF) || !listF.isEmpty()) {
                        Iterator it2 = listF.iterator();
                        while (it2.hasNext()) {
                            if (!((b) it2.next()).b()) {
                                break;
                            }
                        }
                    }
                }
                z10 = false;
            }
            break loop0;
        }
        if (z10) {
            ArrayList arrayList = new ArrayList();
            Iterator it3 = list.iterator();
            while (it3.hasNext()) {
                ed.q.A(arrayList, ((d) it3.next()).f());
            }
            if (!arrayList.isEmpty()) {
                return true;
            }
        }
        return false;
    }

    private final boolean x(List list) {
        Iterator it = list.iterator();
        boolean z10 = true;
        while (it.hasNext()) {
            if (!((d) it.next()).h().f2400w) {
                z10 = false;
            }
        }
        return z10;
    }

    public final void A(d.c cVar) {
        rd.m.e(cVar, "backEvent");
        if (w.J0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Processing Progress " + cVar.a());
        }
        List list = this.f2323c;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ed.q.A(arrayList, ((d) it.next()).f());
        }
        List listH0 = ed.q.H0(ed.q.M0(arrayList));
        int size = listH0.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((b) listH0.get(i10)).e(cVar, this.f2321a);
        }
    }

    public final void D(boolean z10) {
        this.f2325e = z10;
    }

    public final void c(d dVar) {
        rd.m.e(dVar, "operation");
        if (dVar.j()) {
            d.b bVarG = dVar.g();
            View viewZ3 = dVar.h().z3();
            rd.m.d(viewZ3, "operation.fragment.requireView()");
            bVarG.d(viewZ3, this.f2321a);
            dVar.q(false);
        }
    }

    public abstract void d(List list, boolean z10);

    public void e(List list) {
        rd.m.e(list, "operations");
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ed.q.A(arrayList, ((d) it.next()).f());
        }
        List listH0 = ed.q.H0(ed.q.M0(arrayList));
        int size = listH0.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((b) listH0.get(i10)).d(this.f2321a);
        }
        int size2 = list.size();
        for (int i11 = 0; i11 < size2; i11++) {
            c((d) list.get(i11));
        }
        List listH02 = ed.q.H0(list);
        int size3 = listH02.size();
        for (int i12 = 0; i12 < size3; i12++) {
            d dVar = (d) listH02.get(i12);
            if (dVar.f().isEmpty()) {
                dVar.d();
            }
        }
    }

    public final void f() {
        if (w.J0(3)) {
            Log.d("FragmentManager", "SpecialEffectsController: Completing Back ");
        }
        B(this.f2323c);
        e(this.f2323c);
    }

    public final void j(d.b bVar, b0 b0Var) {
        rd.m.e(bVar, "finalState");
        rd.m.e(b0Var, "fragmentStateManager");
        if (w.J0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing add operation for fragment " + b0Var.k());
        }
        g(bVar, d.a.ADDING, b0Var);
    }

    public final void k(b0 b0Var) {
        rd.m.e(b0Var, "fragmentStateManager");
        if (w.J0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing hide operation for fragment " + b0Var.k());
        }
        g(d.b.GONE, d.a.NONE, b0Var);
    }

    public final void l(b0 b0Var) {
        rd.m.e(b0Var, "fragmentStateManager");
        if (w.J0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing remove operation for fragment " + b0Var.k());
        }
        g(d.b.REMOVED, d.a.REMOVING, b0Var);
    }

    public final void m(b0 b0Var) {
        rd.m.e(b0Var, "fragmentStateManager");
        if (w.J0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing show operation for fragment " + b0Var.k());
        }
        g(d.b.VISIBLE, d.a.NONE, b0Var);
    }

    public final void n() {
        boolean z10;
        if (this.f2326f) {
            return;
        }
        if (!this.f2321a.isAttachedToWindow()) {
            q();
            this.f2325e = false;
            return;
        }
        synchronized (this.f2322b) {
            try {
                List<d> listK0 = ed.q.K0(this.f2323c);
                this.f2323c.clear();
                Iterator it = listK0.iterator();
                while (true) {
                    z10 = true;
                    if (!it.hasNext()) {
                        break;
                    }
                    d dVar = (d) it.next();
                    if (this.f2322b.isEmpty() || !dVar.h().f2400w) {
                        z10 = false;
                    }
                    dVar.r(z10);
                }
                for (d dVar2 : listK0) {
                    if (this.f2324d) {
                        if (w.J0(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Completing non-seekable operation " + dVar2);
                        }
                        dVar2.d();
                    } else {
                        if (w.J0(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Cancelling operation " + dVar2);
                        }
                        dVar2.c(this.f2321a);
                    }
                    this.f2324d = false;
                    if (!dVar2.l()) {
                        this.f2323c.add(dVar2);
                    }
                }
                if (!this.f2322b.isEmpty()) {
                    C();
                    List listK02 = ed.q.K0(this.f2322b);
                    if (listK02.isEmpty()) {
                        return;
                    }
                    this.f2322b.clear();
                    this.f2323c.addAll(listK02);
                    if (w.J0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Executing pending operations");
                    }
                    d(listK02, this.f2325e);
                    boolean zW = w(listK02);
                    boolean zX = x(listK02);
                    if (!zX || zW) {
                        z10 = false;
                    }
                    this.f2324d = z10;
                    if (w.J0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Operation seekable = " + zW + " \ntransition = " + zX);
                    }
                    if (!zX) {
                        B(listK02);
                        e(listK02);
                    } else if (zW) {
                        B(listK02);
                        int size = listK02.size();
                        for (int i10 = 0; i10 < size; i10++) {
                            c((d) listK02.get(i10));
                        }
                    }
                    this.f2325e = false;
                    if (w.J0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Finished executing pending operations");
                    }
                }
                dd.d0 d0Var = dd.d0.f10897a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void q() {
        if (w.J0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Forcing all operations to complete");
        }
        boolean zIsAttachedToWindow = this.f2321a.isAttachedToWindow();
        synchronized (this.f2322b) {
            try {
                C();
                B(this.f2322b);
                List<d> listK0 = ed.q.K0(this.f2323c);
                Iterator it = listK0.iterator();
                while (it.hasNext()) {
                    ((d) it.next()).r(false);
                }
                for (d dVar : listK0) {
                    if (w.J0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: " + (zIsAttachedToWindow ? "" : "Container " + this.f2321a + " is not attached to window. ") + "Cancelling running operation " + dVar);
                    }
                    dVar.c(this.f2321a);
                }
                List<d> listK02 = ed.q.K0(this.f2322b);
                Iterator it2 = listK02.iterator();
                while (it2.hasNext()) {
                    ((d) it2.next()).r(false);
                }
                for (d dVar2 : listK02) {
                    if (w.J0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: " + (zIsAttachedToWindow ? "" : "Container " + this.f2321a + " is not attached to window. ") + "Cancelling pending operation " + dVar2);
                    }
                    dVar2.c(this.f2321a);
                }
                dd.d0 d0Var = dd.d0.f10897a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void r() {
        if (this.f2326f) {
            if (w.J0(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: Forcing postponed operations");
            }
            this.f2326f = false;
            n();
        }
    }

    public final d.a s(b0 b0Var) {
        rd.m.e(b0Var, "fragmentStateManager");
        o oVarK = b0Var.k();
        rd.m.d(oVarK, "fragmentStateManager.fragment");
        d dVarO = o(oVarK);
        d.a aVarI = dVarO != null ? dVarO.i() : null;
        d dVarP = p(oVarK);
        d.a aVarI2 = dVarP != null ? dVarP.i() : null;
        int i10 = aVarI == null ? -1 : e.f2354a[aVarI.ordinal()];
        return (i10 == -1 || i10 == 1) ? aVarI2 : aVarI;
    }

    public final ViewGroup t() {
        return this.f2321a;
    }

    public final boolean y() {
        return !this.f2322b.isEmpty();
    }

    public final void z() {
        Object objPrevious;
        synchronized (this.f2322b) {
            try {
                C();
                List list = this.f2322b;
                ListIterator listIterator = list.listIterator(list.size());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        objPrevious = null;
                        break;
                    }
                    objPrevious = listIterator.previous();
                    d dVar = (d) objPrevious;
                    d.b.a aVar = d.b.f2346a;
                    View view = dVar.h().T;
                    rd.m.d(view, "operation.fragment.mView");
                    d.b bVarA = aVar.a(view);
                    d.b bVarG = dVar.g();
                    d.b bVar = d.b.VISIBLE;
                    if (bVarG == bVar && bVarA != bVar) {
                        break;
                    }
                }
                d dVar2 = (d) objPrevious;
                o oVarH = dVar2 != null ? dVar2.h() : null;
                this.f2326f = oVarH != null ? oVarH.f2() : false;
                dd.d0 d0Var = dd.d0.f10897a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
