package x2;

import android.util.Log;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Set f31569a = Collections.newSetFromMap(new WeakHashMap());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Set f31570b = new HashSet();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f31571c;

    public boolean a(a3.c cVar) {
        boolean z10 = true;
        if (cVar == null) {
            return true;
        }
        boolean zRemove = this.f31569a.remove(cVar);
        if (!this.f31570b.remove(cVar) && !zRemove) {
            z10 = false;
        }
        if (z10) {
            cVar.clear();
        }
        return z10;
    }

    public void b() {
        Iterator it = e3.l.j(this.f31569a).iterator();
        while (it.hasNext()) {
            a((a3.c) it.next());
        }
        this.f31570b.clear();
    }

    public void c() {
        this.f31571c = true;
        for (a3.c cVar : e3.l.j(this.f31569a)) {
            if (cVar.isRunning() || cVar.k()) {
                cVar.clear();
                this.f31570b.add(cVar);
            }
        }
    }

    public void d() {
        this.f31571c = true;
        for (a3.c cVar : e3.l.j(this.f31569a)) {
            if (cVar.isRunning()) {
                cVar.d();
                this.f31570b.add(cVar);
            }
        }
    }

    public void e() {
        for (a3.c cVar : e3.l.j(this.f31569a)) {
            if (!cVar.k() && !cVar.g()) {
                cVar.clear();
                if (this.f31571c) {
                    this.f31570b.add(cVar);
                } else {
                    cVar.i();
                }
            }
        }
    }

    public void f() {
        this.f31571c = false;
        for (a3.c cVar : e3.l.j(this.f31569a)) {
            if (!cVar.k() && !cVar.isRunning()) {
                cVar.i();
            }
        }
        this.f31570b.clear();
    }

    public void g(a3.c cVar) {
        this.f31569a.add(cVar);
        if (!this.f31571c) {
            cVar.i();
            return;
        }
        cVar.clear();
        if (Log.isLoggable("RequestTracker", 2)) {
            Log.v("RequestTracker", "Paused, delaying request");
        }
        this.f31570b.add(cVar);
    }

    public String toString() {
        return super.toString() + "{numRequests=" + this.f31569a.size() + ", isPaused=" + this.f31571c + "}";
    }
}
