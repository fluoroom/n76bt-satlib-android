package androidx.transition;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public abstract class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static k f3451a = new androidx.transition.a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static ThreadLocal f3452b = new ThreadLocal();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static ArrayList f3453c = new ArrayList();

    private static class a implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        k f3454a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        ViewGroup f3455b;

        /* JADX INFO: renamed from: androidx.transition.u$a$a, reason: collision with other inner class name */
        class C0049a extends t {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ androidx.collection.a f3456a;

            C0049a(androidx.collection.a aVar) {
                this.f3456a = aVar;
            }

            @Override // androidx.transition.t, androidx.transition.k.i
            public void g(k kVar) {
                ((ArrayList) this.f3456a.get(a.this.f3455b)).remove(kVar);
                kVar.g0(this);
            }
        }

        a(k kVar, ViewGroup viewGroup) {
            this.f3454a = kVar;
            this.f3455b = viewGroup;
        }

        private void a() {
            this.f3455b.getViewTreeObserver().removeOnPreDrawListener(this);
            this.f3455b.removeOnAttachStateChangeListener(this);
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            a();
            if (!u.f3453c.remove(this.f3455b)) {
                return true;
            }
            androidx.collection.a aVarC = u.c();
            ArrayList arrayList = (ArrayList) aVarC.get(this.f3455b);
            ArrayList arrayList2 = null;
            if (arrayList == null) {
                arrayList = new ArrayList();
                aVarC.put(this.f3455b, arrayList);
            } else if (arrayList.size() > 0) {
                arrayList2 = new ArrayList(arrayList);
            }
            arrayList.add(this.f3454a);
            this.f3454a.d(new C0049a(aVarC));
            this.f3454a.o(this.f3455b, false);
            if (arrayList2 != null) {
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    ((k) it.next()).i0(this.f3455b);
                }
            }
            this.f3454a.e0(this.f3455b);
            return true;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            a();
            u.f3453c.remove(this.f3455b);
            ArrayList arrayList = (ArrayList) u.c().get(this.f3455b);
            if (arrayList != null && arrayList.size() > 0) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((k) it.next()).i0(this.f3455b);
                }
            }
            this.f3454a.p(true);
        }
    }

    public static void a(ViewGroup viewGroup, k kVar) {
        if (f3453c.contains(viewGroup) || !viewGroup.isLaidOut()) {
            return;
        }
        f3453c.add(viewGroup);
        if (kVar == null) {
            kVar = f3451a;
        }
        k kVarClone = kVar.clone();
        e(viewGroup, kVarClone);
        j.b(viewGroup, null);
        d(viewGroup, kVarClone);
    }

    public static w b(ViewGroup viewGroup, k kVar) {
        if (f3453c.contains(viewGroup) || !viewGroup.isLaidOut() || Build.VERSION.SDK_INT < 34) {
            return null;
        }
        if (!kVar.R()) {
            throw new IllegalArgumentException("The Transition must support seeking.");
        }
        f3453c.add(viewGroup);
        k kVarClone = kVar.clone();
        x xVar = new x();
        xVar.w0(kVarClone);
        e(viewGroup, xVar);
        j.b(viewGroup, null);
        d(viewGroup, xVar);
        viewGroup.invalidate();
        return xVar.v();
    }

    static androidx.collection.a c() {
        androidx.collection.a aVar;
        WeakReference weakReference = (WeakReference) f3452b.get();
        if (weakReference != null && (aVar = (androidx.collection.a) weakReference.get()) != null) {
            return aVar;
        }
        androidx.collection.a aVar2 = new androidx.collection.a();
        f3452b.set(new WeakReference(aVar2));
        return aVar2;
    }

    private static void d(ViewGroup viewGroup, k kVar) {
        if (kVar == null || viewGroup == null) {
            return;
        }
        a aVar = new a(kVar, viewGroup);
        viewGroup.addOnAttachStateChangeListener(aVar);
        viewGroup.getViewTreeObserver().addOnPreDrawListener(aVar);
    }

    private static void e(ViewGroup viewGroup, k kVar) {
        ArrayList arrayList = (ArrayList) c().get(viewGroup);
        if (arrayList != null && arrayList.size() > 0) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((k) it.next()).d0(viewGroup);
            }
        }
        if (kVar != null) {
            kVar.o(viewGroup, true);
        }
        j.a(viewGroup);
    }
}
