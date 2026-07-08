package androidx.fragment.app;

import android.os.Bundle;
import android.view.View;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final w f2458a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final CopyOnWriteArrayList f2459b;

    public v(w wVar) {
        rd.m.e(wVar, "fragmentManager");
        this.f2458a = wVar;
        this.f2459b = new CopyOnWriteArrayList();
    }

    public final void a(o oVar, Bundle bundle, boolean z10) {
        rd.m.e(oVar, "f");
        o oVarZ0 = this.f2458a.z0();
        if (oVarZ0 != null) {
            w wVarB1 = oVarZ0.B1();
            rd.m.d(wVarB1, "parent.getParentFragmentManager()");
            wVarB1.y0().a(oVar, bundle, true);
        }
        Iterator it = this.f2459b.iterator();
        if (it.hasNext()) {
            android.support.v4.media.session.b.a(it.next());
            if (!z10) {
                throw null;
            }
            throw null;
        }
    }

    public final void b(o oVar, boolean z10) {
        rd.m.e(oVar, "f");
        this.f2458a.w0().g();
        o oVarZ0 = this.f2458a.z0();
        if (oVarZ0 != null) {
            w wVarB1 = oVarZ0.B1();
            rd.m.d(wVarB1, "parent.getParentFragmentManager()");
            wVarB1.y0().b(oVar, true);
        }
        Iterator it = this.f2459b.iterator();
        if (it.hasNext()) {
            android.support.v4.media.session.b.a(it.next());
            if (!z10) {
                throw null;
            }
            throw null;
        }
    }

    public final void c(o oVar, Bundle bundle, boolean z10) {
        rd.m.e(oVar, "f");
        o oVarZ0 = this.f2458a.z0();
        if (oVarZ0 != null) {
            w wVarB1 = oVarZ0.B1();
            rd.m.d(wVarB1, "parent.getParentFragmentManager()");
            wVarB1.y0().c(oVar, bundle, true);
        }
        Iterator it = this.f2459b.iterator();
        if (it.hasNext()) {
            android.support.v4.media.session.b.a(it.next());
            if (!z10) {
                throw null;
            }
            throw null;
        }
    }

    public final void d(o oVar, boolean z10) {
        rd.m.e(oVar, "f");
        o oVarZ0 = this.f2458a.z0();
        if (oVarZ0 != null) {
            w wVarB1 = oVarZ0.B1();
            rd.m.d(wVarB1, "parent.getParentFragmentManager()");
            wVarB1.y0().d(oVar, true);
        }
        Iterator it = this.f2459b.iterator();
        if (it.hasNext()) {
            android.support.v4.media.session.b.a(it.next());
            if (!z10) {
                throw null;
            }
            throw null;
        }
    }

    public final void e(o oVar, boolean z10) {
        rd.m.e(oVar, "f");
        o oVarZ0 = this.f2458a.z0();
        if (oVarZ0 != null) {
            w wVarB1 = oVarZ0.B1();
            rd.m.d(wVarB1, "parent.getParentFragmentManager()");
            wVarB1.y0().e(oVar, true);
        }
        Iterator it = this.f2459b.iterator();
        if (it.hasNext()) {
            android.support.v4.media.session.b.a(it.next());
            if (!z10) {
                throw null;
            }
            throw null;
        }
    }

    public final void f(o oVar, boolean z10) {
        rd.m.e(oVar, "f");
        o oVarZ0 = this.f2458a.z0();
        if (oVarZ0 != null) {
            w wVarB1 = oVarZ0.B1();
            rd.m.d(wVarB1, "parent.getParentFragmentManager()");
            wVarB1.y0().f(oVar, true);
        }
        Iterator it = this.f2459b.iterator();
        if (it.hasNext()) {
            android.support.v4.media.session.b.a(it.next());
            if (!z10) {
                throw null;
            }
            throw null;
        }
    }

    public final void g(o oVar, boolean z10) {
        rd.m.e(oVar, "f");
        this.f2458a.w0().g();
        o oVarZ0 = this.f2458a.z0();
        if (oVarZ0 != null) {
            w wVarB1 = oVarZ0.B1();
            rd.m.d(wVarB1, "parent.getParentFragmentManager()");
            wVarB1.y0().g(oVar, true);
        }
        Iterator it = this.f2459b.iterator();
        if (it.hasNext()) {
            android.support.v4.media.session.b.a(it.next());
            if (!z10) {
                throw null;
            }
            throw null;
        }
    }

    public final void h(o oVar, Bundle bundle, boolean z10) {
        rd.m.e(oVar, "f");
        o oVarZ0 = this.f2458a.z0();
        if (oVarZ0 != null) {
            w wVarB1 = oVarZ0.B1();
            rd.m.d(wVarB1, "parent.getParentFragmentManager()");
            wVarB1.y0().h(oVar, bundle, true);
        }
        Iterator it = this.f2459b.iterator();
        if (it.hasNext()) {
            android.support.v4.media.session.b.a(it.next());
            if (!z10) {
                throw null;
            }
            throw null;
        }
    }

    public final void i(o oVar, boolean z10) {
        rd.m.e(oVar, "f");
        o oVarZ0 = this.f2458a.z0();
        if (oVarZ0 != null) {
            w wVarB1 = oVarZ0.B1();
            rd.m.d(wVarB1, "parent.getParentFragmentManager()");
            wVarB1.y0().i(oVar, true);
        }
        Iterator it = this.f2459b.iterator();
        if (it.hasNext()) {
            android.support.v4.media.session.b.a(it.next());
            if (!z10) {
                throw null;
            }
            throw null;
        }
    }

    public final void j(o oVar, Bundle bundle, boolean z10) {
        rd.m.e(oVar, "f");
        rd.m.e(bundle, "outState");
        o oVarZ0 = this.f2458a.z0();
        if (oVarZ0 != null) {
            w wVarB1 = oVarZ0.B1();
            rd.m.d(wVarB1, "parent.getParentFragmentManager()");
            wVarB1.y0().j(oVar, bundle, true);
        }
        Iterator it = this.f2459b.iterator();
        if (it.hasNext()) {
            android.support.v4.media.session.b.a(it.next());
            if (!z10) {
                throw null;
            }
            throw null;
        }
    }

    public final void k(o oVar, boolean z10) {
        rd.m.e(oVar, "f");
        o oVarZ0 = this.f2458a.z0();
        if (oVarZ0 != null) {
            w wVarB1 = oVarZ0.B1();
            rd.m.d(wVarB1, "parent.getParentFragmentManager()");
            wVarB1.y0().k(oVar, true);
        }
        Iterator it = this.f2459b.iterator();
        if (it.hasNext()) {
            android.support.v4.media.session.b.a(it.next());
            if (!z10) {
                throw null;
            }
            throw null;
        }
    }

    public final void l(o oVar, boolean z10) {
        rd.m.e(oVar, "f");
        o oVarZ0 = this.f2458a.z0();
        if (oVarZ0 != null) {
            w wVarB1 = oVarZ0.B1();
            rd.m.d(wVarB1, "parent.getParentFragmentManager()");
            wVarB1.y0().l(oVar, true);
        }
        Iterator it = this.f2459b.iterator();
        if (it.hasNext()) {
            android.support.v4.media.session.b.a(it.next());
            if (!z10) {
                throw null;
            }
            throw null;
        }
    }

    public final void m(o oVar, View view, Bundle bundle, boolean z10) {
        rd.m.e(oVar, "f");
        rd.m.e(view, "v");
        o oVarZ0 = this.f2458a.z0();
        if (oVarZ0 != null) {
            w wVarB1 = oVarZ0.B1();
            rd.m.d(wVarB1, "parent.getParentFragmentManager()");
            wVarB1.y0().m(oVar, view, bundle, true);
        }
        Iterator it = this.f2459b.iterator();
        if (it.hasNext()) {
            android.support.v4.media.session.b.a(it.next());
            if (!z10) {
                throw null;
            }
            throw null;
        }
    }

    public final void n(o oVar, boolean z10) {
        rd.m.e(oVar, "f");
        o oVarZ0 = this.f2458a.z0();
        if (oVarZ0 != null) {
            w wVarB1 = oVarZ0.B1();
            rd.m.d(wVarB1, "parent.getParentFragmentManager()");
            wVarB1.y0().n(oVar, true);
        }
        Iterator it = this.f2459b.iterator();
        if (it.hasNext()) {
            android.support.v4.media.session.b.a(it.next());
            if (!z10) {
                throw null;
            }
            throw null;
        }
    }
}
