package x2;

import androidx.lifecycle.d0;
import androidx.lifecycle.m;
import androidx.lifecycle.t;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
final class k implements j, androidx.lifecycle.s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Set f31555a = new HashSet();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final androidx.lifecycle.m f31556b;

    k(androidx.lifecycle.m mVar) {
        this.f31556b = mVar;
        mVar.a(this);
    }

    @Override // x2.j
    public void a(l lVar) {
        this.f31555a.remove(lVar);
    }

    @Override // x2.j
    public void b(l lVar) {
        this.f31555a.add(lVar);
        if (this.f31556b.b() == m.b.f2651a) {
            lVar.f();
        } else if (this.f31556b.b().d(m.b.f2654d)) {
            lVar.b();
        } else {
            lVar.g();
        }
    }

    @d0(m.a.ON_DESTROY)
    public void onDestroy(t tVar) {
        Iterator it = e3.l.j(this.f31555a).iterator();
        while (it.hasNext()) {
            ((l) it.next()).f();
        }
        tVar.S0().d(this);
    }

    @d0(m.a.ON_START)
    public void onStart(t tVar) {
        Iterator it = e3.l.j(this.f31555a).iterator();
        while (it.hasNext()) {
            ((l) it.next()).b();
        }
    }

    @d0(m.a.ON_STOP)
    public void onStop(t tVar) {
        Iterator it = e3.l.j(this.f31555a).iterator();
        while (it.hasNext()) {
            ((l) it.next()).g();
        }
    }
}
