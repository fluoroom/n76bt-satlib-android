package d;

import android.os.Build;
import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.m;
import d.j0;
import java.util.Iterator;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes.dex */
public final class j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Runnable f10435a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final l0.a f10436b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ed.i f10437c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private b0 f10438d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private OnBackInvokedCallback f10439e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private OnBackInvokedDispatcher f10440f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f10441g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f10442h;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f10443a = new a();

        private a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(qd.a aVar) {
            aVar.a();
        }

        public final OnBackInvokedCallback b(final qd.a aVar) {
            rd.m.e(aVar, "onBackInvoked");
            return new OnBackInvokedCallback() { // from class: d.i0
                @Override // android.window.OnBackInvokedCallback
                public final void onBackInvoked() {
                    j0.a.c(aVar);
                }
            };
        }

        public final void d(Object obj, int i10, Object obj2) {
            rd.m.e(obj, "dispatcher");
            rd.m.e(obj2, "callback");
            ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(i10, (OnBackInvokedCallback) obj2);
        }

        public final void e(Object obj, Object obj2) {
            rd.m.e(obj, "dispatcher");
            rd.m.e(obj2, "callback");
            ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f10444a = new b();

        public static final class a implements OnBackAnimationCallback {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ qd.l f10445a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ qd.l f10446b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ qd.a f10447c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ qd.a f10448d;

            a(qd.l lVar, qd.l lVar2, qd.a aVar, qd.a aVar2) {
                this.f10445a = lVar;
                this.f10446b = lVar2;
                this.f10447c = aVar;
                this.f10448d = aVar2;
            }

            @Override // android.window.OnBackAnimationCallback
            public void onBackCancelled() {
                this.f10448d.a();
            }

            @Override // android.window.OnBackInvokedCallback
            public void onBackInvoked() {
                this.f10447c.a();
            }

            @Override // android.window.OnBackAnimationCallback
            public void onBackProgressed(BackEvent backEvent) {
                rd.m.e(backEvent, "backEvent");
                this.f10446b.l(new d.c(backEvent));
            }

            @Override // android.window.OnBackAnimationCallback
            public void onBackStarted(BackEvent backEvent) {
                rd.m.e(backEvent, "backEvent");
                this.f10445a.l(new d.c(backEvent));
            }
        }

        private b() {
        }

        public final OnBackInvokedCallback a(qd.l lVar, qd.l lVar2, qd.a aVar, qd.a aVar2) {
            rd.m.e(lVar, "onBackStarted");
            rd.m.e(lVar2, "onBackProgressed");
            rd.m.e(aVar, "onBackInvoked");
            rd.m.e(aVar2, "onBackCancelled");
            return new a(lVar, lVar2, aVar, aVar2);
        }
    }

    private final class c implements androidx.lifecycle.q, d.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final androidx.lifecycle.m f10449a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final b0 f10450b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private d.d f10451c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ j0 f10452d;

        public c(j0 j0Var, androidx.lifecycle.m mVar, b0 b0Var) {
            rd.m.e(mVar, "lifecycle");
            rd.m.e(b0Var, "onBackPressedCallback");
            this.f10452d = j0Var;
            this.f10449a = mVar;
            this.f10450b = b0Var;
            mVar.a(this);
        }

        @Override // d.d
        public void cancel() {
            this.f10449a.d(this);
            this.f10450b.i(this);
            d.d dVar = this.f10451c;
            if (dVar != null) {
                dVar.cancel();
            }
            this.f10451c = null;
        }

        @Override // androidx.lifecycle.q
        public void k(androidx.lifecycle.t tVar, m.a aVar) {
            rd.m.e(tVar, "source");
            rd.m.e(aVar, "event");
            if (aVar == m.a.ON_START) {
                this.f10451c = this.f10452d.p(this.f10450b);
                return;
            }
            if (aVar != m.a.ON_STOP) {
                if (aVar == m.a.ON_DESTROY) {
                    cancel();
                }
            } else {
                d.d dVar = this.f10451c;
                if (dVar != null) {
                    dVar.cancel();
                }
            }
        }
    }

    private final class d implements d.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final b0 f10453a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ j0 f10454b;

        public d(j0 j0Var, b0 b0Var) {
            rd.m.e(b0Var, "onBackPressedCallback");
            this.f10454b = j0Var;
            this.f10453a = b0Var;
        }

        @Override // d.d
        public void cancel() {
            this.f10454b.f10437c.remove(this.f10453a);
            if (rd.m.a(this.f10454b.f10438d, this.f10453a)) {
                this.f10453a.c();
                this.f10454b.f10438d = null;
            }
            this.f10453a.i(this);
            qd.a aVarB = this.f10453a.b();
            if (aVarB != null) {
                aVarB.a();
            }
            this.f10453a.k(null);
        }
    }

    /* synthetic */ class e extends rd.l implements qd.a {
        e(Object obj) {
            super(0, obj, j0.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0);
        }

        @Override // qd.a
        public /* bridge */ /* synthetic */ Object a() {
            p();
            return dd.d0.f10897a;
        }

        public final void p() {
            ((j0) this.f25940b).w();
        }
    }

    /* synthetic */ class f extends rd.l implements qd.a {
        f(Object obj) {
            super(0, obj, j0.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0);
        }

        @Override // qd.a
        public /* bridge */ /* synthetic */ Object a() {
            p();
            return dd.d0.f10897a;
        }

        public final void p() {
            ((j0) this.f25940b).w();
        }
    }

    public j0(Runnable runnable, l0.a aVar) {
        this.f10435a = runnable;
        this.f10436b = aVar;
        this.f10437c = new ed.i();
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 33) {
            this.f10439e = i10 >= 34 ? b.f10444a.a(new qd.l() { // from class: d.c0
                @Override // qd.l
                public final Object l(Object obj) {
                    return j0.f(this.f10422a, (c) obj);
                }
            }, new qd.l() { // from class: d.d0
                @Override // qd.l
                public final Object l(Object obj) {
                    return j0.g(this.f10423a, (c) obj);
                }
            }, new qd.a() { // from class: d.e0
                @Override // qd.a
                public final Object a() {
                    return j0.h(this.f10425a);
                }
            }, new qd.a() { // from class: d.f0
                @Override // qd.a
                public final Object a() {
                    return j0.i(this.f10427a);
                }
            }) : a.f10443a.b(new qd.a() { // from class: d.g0
                @Override // qd.a
                public final Object a() {
                    return j0.j(this.f10430a);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final dd.d0 f(j0 j0Var, d.c cVar) {
        rd.m.e(cVar, "backEvent");
        j0Var.t(cVar);
        return dd.d0.f10897a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final dd.d0 g(j0 j0Var, d.c cVar) {
        rd.m.e(cVar, "backEvent");
        j0Var.s(cVar);
        return dd.d0.f10897a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final dd.d0 h(j0 j0Var) {
        j0Var.r();
        return dd.d0.f10897a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final dd.d0 i(j0 j0Var) {
        j0Var.q();
        return dd.d0.f10897a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final dd.d0 j(j0 j0Var) {
        j0Var.r();
        return dd.d0.f10897a;
    }

    private final void q() {
        Object objPrevious;
        b0 b0Var = this.f10438d;
        if (b0Var == null) {
            ed.i iVar = this.f10437c;
            ListIterator<E> listIterator = iVar.listIterator(iVar.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    objPrevious = null;
                    break;
                } else {
                    objPrevious = listIterator.previous();
                    if (((b0) objPrevious).g()) {
                        break;
                    }
                }
            }
            b0Var = (b0) objPrevious;
        }
        this.f10438d = null;
        if (b0Var != null) {
            b0Var.c();
        }
    }

    private final void s(d.c cVar) {
        Object objPrevious;
        b0 b0Var = this.f10438d;
        if (b0Var == null) {
            ed.i iVar = this.f10437c;
            ListIterator<E> listIterator = iVar.listIterator(iVar.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    objPrevious = null;
                    break;
                } else {
                    objPrevious = listIterator.previous();
                    if (((b0) objPrevious).g()) {
                        break;
                    }
                }
            }
            b0Var = (b0) objPrevious;
        }
        if (b0Var != null) {
            b0Var.e(cVar);
        }
    }

    private final void t(d.c cVar) {
        Object objPrevious;
        ed.i iVar = this.f10437c;
        ListIterator<E> listIterator = iVar.listIterator(iVar.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                objPrevious = null;
                break;
            } else {
                objPrevious = listIterator.previous();
                if (((b0) objPrevious).g()) {
                    break;
                }
            }
        }
        b0 b0Var = (b0) objPrevious;
        if (this.f10438d != null) {
            q();
        }
        this.f10438d = b0Var;
        if (b0Var != null) {
            b0Var.f(cVar);
        }
    }

    private final void v(boolean z10) {
        OnBackInvokedDispatcher onBackInvokedDispatcher = this.f10440f;
        OnBackInvokedCallback onBackInvokedCallback = this.f10439e;
        if (onBackInvokedDispatcher == null || onBackInvokedCallback == null) {
            return;
        }
        if (z10 && !this.f10441g) {
            a.f10443a.d(onBackInvokedDispatcher, 0, onBackInvokedCallback);
            this.f10441g = true;
        } else {
            if (z10 || !this.f10441g) {
                return;
            }
            a.f10443a.e(onBackInvokedDispatcher, onBackInvokedCallback);
            this.f10441g = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void w() {
        boolean z10 = this.f10442h;
        ed.i iVar = this.f10437c;
        boolean z11 = false;
        if (!h0.a(iVar) || !iVar.isEmpty()) {
            Iterator<E> it = iVar.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (((b0) it.next()).g()) {
                    z11 = true;
                    break;
                }
            }
        }
        this.f10442h = z11;
        if (z11 != z10) {
            l0.a aVar = this.f10436b;
            if (aVar != null) {
                aVar.accept(Boolean.valueOf(z11));
            }
            if (Build.VERSION.SDK_INT >= 33) {
                v(z11);
            }
        }
    }

    public final void o(androidx.lifecycle.t tVar, b0 b0Var) {
        rd.m.e(tVar, "owner");
        rd.m.e(b0Var, "onBackPressedCallback");
        androidx.lifecycle.m mVarS0 = tVar.S0();
        if (mVarS0.b() == m.b.f2651a) {
            return;
        }
        b0Var.a(new c(this, mVarS0, b0Var));
        w();
        b0Var.k(new e(this));
    }

    public final d.d p(b0 b0Var) {
        rd.m.e(b0Var, "onBackPressedCallback");
        this.f10437c.add(b0Var);
        d dVar = new d(this, b0Var);
        b0Var.a(dVar);
        w();
        b0Var.k(new f(this));
        return dVar;
    }

    public final void r() {
        Object objPrevious;
        b0 b0Var = this.f10438d;
        if (b0Var == null) {
            ed.i iVar = this.f10437c;
            ListIterator<E> listIterator = iVar.listIterator(iVar.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    objPrevious = null;
                    break;
                } else {
                    objPrevious = listIterator.previous();
                    if (((b0) objPrevious).g()) {
                        break;
                    }
                }
            }
            b0Var = (b0) objPrevious;
        }
        this.f10438d = null;
        if (b0Var != null) {
            b0Var.d();
            return;
        }
        Runnable runnable = this.f10435a;
        if (runnable != null) {
            runnable.run();
        }
    }

    public final void u(OnBackInvokedDispatcher onBackInvokedDispatcher) {
        rd.m.e(onBackInvokedDispatcher, "invoker");
        this.f10440f = onBackInvokedDispatcher;
        v(this.f10442h);
    }

    public j0(Runnable runnable) {
        this(runnable, null);
    }
}
