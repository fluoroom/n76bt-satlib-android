package df;

import ie.h;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
final class f implements ie.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final mf.c f10964a;

    public f(mf.c cVar) {
        rd.m.e(cVar, "fqNameToMatch");
        this.f10964a = cVar;
    }

    @Override // ie.h
    public boolean H(mf.c cVar) {
        return h.b.b(this, cVar);
    }

    @Override // ie.h
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public e a(mf.c cVar) {
        rd.m.e(cVar, "fqName");
        if (rd.m.a(cVar, this.f10964a)) {
            return e.f10957a;
        }
        return null;
    }

    @Override // ie.h
    public boolean isEmpty() {
        return false;
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return ed.q.k().iterator();
    }
}
