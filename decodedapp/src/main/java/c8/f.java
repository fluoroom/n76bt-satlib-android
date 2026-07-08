package c8;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
final class f implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ a f4479a;

    f(a aVar) {
        this.f4479a = aVar;
    }

    @Override // c8.e
    public final void a(c cVar) {
        this.f4479a.f4474a = cVar;
        Iterator it = this.f4479a.f4476c.iterator();
        while (it.hasNext()) {
            ((m) it.next()).a(this.f4479a.f4474a);
        }
        this.f4479a.f4476c.clear();
        this.f4479a.f4475b = null;
    }
}
