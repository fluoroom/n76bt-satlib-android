package ie;

import ie.h;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class i implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f16057a;

    public i(List list) {
        rd.m.e(list, "annotations");
        this.f16057a = list;
    }

    @Override // ie.h
    public boolean H(mf.c cVar) {
        return h.b.b(this, cVar);
    }

    @Override // ie.h
    public c a(mf.c cVar) {
        return h.b.a(this, cVar);
    }

    @Override // ie.h
    public boolean isEmpty() {
        return this.f16057a.isEmpty();
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return this.f16057a.iterator();
    }

    public String toString() {
        return this.f16057a.toString();
    }
}
