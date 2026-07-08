package androidx.transition;

import android.graphics.Rect;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.transition.k;
import i0.d;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class e extends androidx.fragment.app.g0 {

    class a extends k.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Rect f3362a;

        a(Rect rect) {
            this.f3362a = rect;
        }
    }

    class b implements k.i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f3364a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ArrayList f3365b;

        b(View view, ArrayList arrayList) {
            this.f3364a = view;
            this.f3365b = arrayList;
        }

        @Override // androidx.transition.k.i
        public void c(k kVar) {
            kVar.g0(this);
            kVar.d(this);
        }

        @Override // androidx.transition.k.i
        public void d(k kVar) {
        }

        @Override // androidx.transition.k.i
        public /* synthetic */ void f(k kVar, boolean z10) {
            m.a(this, kVar, z10);
        }

        @Override // androidx.transition.k.i
        public void g(k kVar) {
            kVar.g0(this);
            this.f3364a.setVisibility(8);
            int size = this.f3365b.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((View) this.f3365b.get(i10)).setVisibility(0);
            }
        }

        @Override // androidx.transition.k.i
        public void j(k kVar) {
        }

        @Override // androidx.transition.k.i
        public /* synthetic */ void k(k kVar, boolean z10) {
            m.b(this, kVar, z10);
        }

        @Override // androidx.transition.k.i
        public void l(k kVar) {
        }
    }

    class c extends t {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f3367a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ArrayList f3368b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Object f3369c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ ArrayList f3370d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ Object f3371e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ ArrayList f3372f;

        c(Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2, Object obj3, ArrayList arrayList3) {
            this.f3367a = obj;
            this.f3368b = arrayList;
            this.f3369c = obj2;
            this.f3370d = arrayList2;
            this.f3371e = obj3;
            this.f3372f = arrayList3;
        }

        @Override // androidx.transition.t, androidx.transition.k.i
        public void c(k kVar) {
            Object obj = this.f3367a;
            if (obj != null) {
                e.this.E(obj, this.f3368b, null);
            }
            Object obj2 = this.f3369c;
            if (obj2 != null) {
                e.this.E(obj2, this.f3370d, null);
            }
            Object obj3 = this.f3371e;
            if (obj3 != null) {
                e.this.E(obj3, this.f3372f, null);
            }
        }

        @Override // androidx.transition.t, androidx.transition.k.i
        public void g(k kVar) {
            kVar.g0(this);
        }
    }

    class d implements k.i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Runnable f3374a;

        d(Runnable runnable) {
            this.f3374a = runnable;
        }

        @Override // androidx.transition.k.i
        public void c(k kVar) {
        }

        @Override // androidx.transition.k.i
        public void d(k kVar) {
        }

        @Override // androidx.transition.k.i
        public /* synthetic */ void f(k kVar, boolean z10) {
            m.a(this, kVar, z10);
        }

        @Override // androidx.transition.k.i
        public void g(k kVar) {
            this.f3374a.run();
        }

        @Override // androidx.transition.k.i
        public void j(k kVar) {
        }

        @Override // androidx.transition.k.i
        public /* synthetic */ void k(k kVar, boolean z10) {
            m.b(this, kVar, z10);
        }

        @Override // androidx.transition.k.i
        public void l(k kVar) {
        }
    }

    /* JADX INFO: renamed from: androidx.transition.e$e, reason: collision with other inner class name */
    class C0048e extends k.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Rect f3376a;

        C0048e(Rect rect) {
            this.f3376a = rect;
        }
    }

    public static /* synthetic */ void C(Runnable runnable, k kVar, Runnable runnable2) {
        if (runnable != null) {
            runnable.run();
        } else {
            kVar.cancel();
            runnable2.run();
        }
    }

    private static boolean D(k kVar) {
        return (androidx.fragment.app.g0.l(kVar.J()) && androidx.fragment.app.g0.l(kVar.K()) && androidx.fragment.app.g0.l(kVar.L())) ? false : true;
    }

    @Override // androidx.fragment.app.g0
    public void A(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        x xVar = (x) obj;
        if (xVar != null) {
            xVar.M().clear();
            xVar.M().addAll(arrayList2);
            E(xVar, arrayList, arrayList2);
        }
    }

    @Override // androidx.fragment.app.g0
    public Object B(Object obj) {
        if (obj == null) {
            return null;
        }
        x xVar = new x();
        xVar.w0((k) obj);
        return xVar;
    }

    public void E(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        k kVar = (k) obj;
        int i10 = 0;
        if (kVar instanceof x) {
            x xVar = (x) kVar;
            int iZ0 = xVar.z0();
            while (i10 < iZ0) {
                E(xVar.y0(i10), arrayList, arrayList2);
                i10++;
            }
            return;
        }
        if (D(kVar)) {
            return;
        }
        List listM = kVar.M();
        if (listM.size() == arrayList.size() && listM.containsAll(arrayList)) {
            int size = arrayList2 == null ? 0 : arrayList2.size();
            while (i10 < size) {
                kVar.f((View) arrayList2.get(i10));
                i10++;
            }
            for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                kVar.h0((View) arrayList.get(size2));
            }
        }
    }

    @Override // androidx.fragment.app.g0
    public void a(Object obj, View view) {
        if (obj != null) {
            ((k) obj).f(view);
        }
    }

    @Override // androidx.fragment.app.g0
    public void b(Object obj, ArrayList arrayList) {
        k kVar = (k) obj;
        if (kVar == null) {
            return;
        }
        int i10 = 0;
        if (kVar instanceof x) {
            x xVar = (x) kVar;
            int iZ0 = xVar.z0();
            while (i10 < iZ0) {
                b(xVar.y0(i10), arrayList);
                i10++;
            }
            return;
        }
        if (D(kVar) || !androidx.fragment.app.g0.l(kVar.M())) {
            return;
        }
        int size = arrayList.size();
        while (i10 < size) {
            kVar.f((View) arrayList.get(i10));
            i10++;
        }
    }

    @Override // androidx.fragment.app.g0
    public void c(Object obj) {
        ((w) obj).h();
    }

    @Override // androidx.fragment.app.g0
    public void d(Object obj, Runnable runnable) {
        ((w) obj).i(runnable);
    }

    @Override // androidx.fragment.app.g0
    public void e(ViewGroup viewGroup, Object obj) {
        u.a(viewGroup, (k) obj);
    }

    @Override // androidx.fragment.app.g0
    public boolean g(Object obj) {
        return obj instanceof k;
    }

    @Override // androidx.fragment.app.g0
    public Object h(Object obj) {
        if (obj != null) {
            return ((k) obj).clone();
        }
        return null;
    }

    @Override // androidx.fragment.app.g0
    public Object j(ViewGroup viewGroup, Object obj) {
        return u.b(viewGroup, (k) obj);
    }

    @Override // androidx.fragment.app.g0
    public boolean m() {
        return true;
    }

    @Override // androidx.fragment.app.g0
    public boolean n(Object obj) {
        boolean zR = ((k) obj).R();
        if (!zR) {
            Log.v("FragmentManager", "Predictive back not available for AndroidX Transition " + obj + ". Please enable seeking support for the designated transition by overriding isSeekingSupported().");
        }
        return zR;
    }

    @Override // androidx.fragment.app.g0
    public Object o(Object obj, Object obj2, Object obj3) {
        k kVarF0 = (k) obj;
        k kVar = (k) obj2;
        k kVar2 = (k) obj3;
        if (kVarF0 != null && kVar != null) {
            kVarF0 = new x().w0(kVarF0).w0(kVar).F0(1);
        } else if (kVarF0 == null) {
            kVarF0 = kVar != null ? kVar : null;
        }
        if (kVar2 == null) {
            return kVarF0;
        }
        x xVar = new x();
        if (kVarF0 != null) {
            xVar.w0(kVarF0);
        }
        xVar.w0(kVar2);
        return xVar;
    }

    @Override // androidx.fragment.app.g0
    public Object p(Object obj, Object obj2, Object obj3) {
        x xVar = new x();
        if (obj != null) {
            xVar.w0((k) obj);
        }
        if (obj2 != null) {
            xVar.w0((k) obj2);
        }
        if (obj3 != null) {
            xVar.w0((k) obj3);
        }
        return xVar;
    }

    @Override // androidx.fragment.app.g0
    public void r(Object obj, View view, ArrayList arrayList) {
        ((k) obj).d(new b(view, arrayList));
    }

    @Override // androidx.fragment.app.g0
    public void s(Object obj, Object obj2, ArrayList arrayList, Object obj3, ArrayList arrayList2, Object obj4, ArrayList arrayList3) {
        ((k) obj).d(new c(obj2, arrayList, obj3, arrayList2, obj4, arrayList3));
    }

    @Override // androidx.fragment.app.g0
    public void t(Object obj, float f10) {
        w wVar = (w) obj;
        if (wVar.a()) {
            long jM = (long) (f10 * wVar.m());
            if (jM == 0) {
                jM = 1;
            }
            if (jM == wVar.m()) {
                jM = wVar.m() - 1;
            }
            wVar.e(jM);
        }
    }

    @Override // androidx.fragment.app.g0
    public void u(Object obj, Rect rect) {
        if (obj != null) {
            ((k) obj).n0(new C0048e(rect));
        }
    }

    @Override // androidx.fragment.app.g0
    public void v(Object obj, View view) {
        if (view != null) {
            Rect rect = new Rect();
            k(view, rect);
            ((k) obj).n0(new a(rect));
        }
    }

    @Override // androidx.fragment.app.g0
    public void w(androidx.fragment.app.o oVar, Object obj, i0.d dVar, Runnable runnable) {
        x(oVar, obj, dVar, null, runnable);
    }

    @Override // androidx.fragment.app.g0
    public void x(androidx.fragment.app.o oVar, Object obj, i0.d dVar, final Runnable runnable, final Runnable runnable2) {
        final k kVar = (k) obj;
        dVar.c(new d.a() { // from class: androidx.transition.d
            @Override // i0.d.a
            public final void onCancel() {
                e.C(runnable, kVar, runnable2);
            }
        });
        kVar.d(new d(runnable2));
    }

    @Override // androidx.fragment.app.g0
    public void z(Object obj, View view, ArrayList arrayList) {
        x xVar = (x) obj;
        List listM = xVar.M();
        listM.clear();
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            androidx.fragment.app.g0.f(listM, (View) arrayList.get(i10));
        }
        listM.add(view);
        arrayList.add(view);
        b(xVar, arrayList);
    }
}
