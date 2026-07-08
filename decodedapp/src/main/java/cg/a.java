package cg;

import ie.h;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class a implements ie.h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final /* synthetic */ yd.j[] f4774b = {rd.c0.f(new rd.w(a.class, "annotations", "getAnnotations()Ljava/util/List;", 0))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final dg.i f4775a;

    public a(dg.n nVar, qd.a aVar) {
        rd.m.e(nVar, "storageManager");
        rd.m.e(aVar, "compute");
        this.f4775a = nVar.d(aVar);
    }

    private final List b() {
        return (List) dg.m.a(this.f4775a, this, f4774b[0]);
    }

    @Override // ie.h
    public boolean H(mf.c cVar) {
        return h.b.b(this, cVar);
    }

    @Override // ie.h
    public ie.c a(mf.c cVar) {
        return h.b.a(this, cVar);
    }

    @Override // ie.h
    public boolean isEmpty() {
        return b().isEmpty();
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return b().iterator();
    }
}
