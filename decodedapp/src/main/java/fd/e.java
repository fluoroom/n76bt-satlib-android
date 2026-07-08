package fd;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import rd.m;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d f12972a;

    public e(d dVar) {
        m.e(dVar, "backing");
        this.f12972a = dVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean addAll(Collection collection) {
        m.e(collection, "elements");
        throw new UnsupportedOperationException();
    }

    @Override // ed.g
    public int b() {
        return this.f12972a.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.f12972a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean containsAll(Collection collection) {
        m.e(collection, "elements");
        return this.f12972a.p(collection);
    }

    @Override // fd.a
    public boolean d(Map.Entry entry) {
        m.e(entry, "element");
        return this.f12972a.q(entry);
    }

    @Override // fd.a
    public boolean e(Map.Entry entry) {
        m.e(entry, "element");
        return this.f12972a.W(entry);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public boolean add(Map.Entry entry) {
        m.e(entry, "element");
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return this.f12972a.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        return this.f12972a.v();
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean removeAll(Collection collection) {
        m.e(collection, "elements");
        this.f12972a.n();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean retainAll(Collection collection) {
        m.e(collection, "elements");
        this.f12972a.n();
        return super.retainAll(collection);
    }
}
