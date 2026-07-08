package fd;

import java.util.Collection;
import java.util.Iterator;
import rd.m;

/* JADX INFO: loaded from: classes3.dex */
public final class g extends ed.e implements Collection, sd.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d f12974a;

    public g(d dVar) {
        m.e(dVar, "backing");
        this.f12974a = dVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean addAll(Collection collection) {
        m.e(collection, "elements");
        throw new UnsupportedOperationException();
    }

    @Override // ed.e
    public int b() {
        return this.f12974a.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public void clear() {
        this.f12974a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        return this.f12974a.containsValue(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        return this.f12974a.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return this.f12974a.c0();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean remove(Object obj) {
        return this.f12974a.a0(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean removeAll(Collection collection) {
        m.e(collection, "elements");
        this.f12974a.n();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean retainAll(Collection collection) {
        m.e(collection, "elements");
        this.f12974a.n();
        return super.retainAll(collection);
    }
}
