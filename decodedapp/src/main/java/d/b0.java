package d;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f10413a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final CopyOnWriteArrayList f10414b = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private qd.a f10415c;

    public b0(boolean z10) {
        this.f10413a = z10;
    }

    public final void a(d dVar) {
        rd.m.e(dVar, "cancellable");
        this.f10414b.add(dVar);
    }

    public final qd.a b() {
        return this.f10415c;
    }

    public abstract void c();

    public abstract void d();

    public abstract void e(c cVar);

    public abstract void f(c cVar);

    public final boolean g() {
        return this.f10413a;
    }

    public final void h() {
        Iterator it = this.f10414b.iterator();
        while (it.hasNext()) {
            ((d) it.next()).cancel();
        }
    }

    public final void i(d dVar) {
        rd.m.e(dVar, "cancellable");
        this.f10414b.remove(dVar);
    }

    public final void j(boolean z10) {
        this.f10413a = z10;
        qd.a aVar = this.f10415c;
        if (aVar != null) {
            aVar.a();
        }
    }

    public final void k(qd.a aVar) {
        this.f10415c = aVar;
    }
}
