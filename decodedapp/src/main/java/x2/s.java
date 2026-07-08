package x2;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class s implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Set f31599a = Collections.newSetFromMap(new WeakHashMap());

    @Override // x2.l
    public void b() {
        Iterator it = e3.l.j(this.f31599a).iterator();
        while (it.hasNext()) {
            ((b3.h) it.next()).b();
        }
    }

    @Override // x2.l
    public void f() {
        Iterator it = e3.l.j(this.f31599a).iterator();
        while (it.hasNext()) {
            ((b3.h) it.next()).f();
        }
    }

    @Override // x2.l
    public void g() {
        Iterator it = e3.l.j(this.f31599a).iterator();
        while (it.hasNext()) {
            ((b3.h) it.next()).g();
        }
    }

    public void l() {
        this.f31599a.clear();
    }

    public List m() {
        return e3.l.j(this.f31599a);
    }

    public void n(b3.h hVar) {
        this.f31599a.add(hVar);
    }

    public void o(b3.h hVar) {
        this.f31599a.remove(hVar);
    }
}
