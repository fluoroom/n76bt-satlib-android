package fd;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import rd.m;

/* JADX INFO: loaded from: classes3.dex */
public final class h extends ed.g implements Set, Serializable, sd.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final a f12975b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final h f12976c = new h(d.f12950w.e());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d f12977a;

    private static final class a {
        public /* synthetic */ a(rd.h hVar) {
            this();
        }

        private a() {
        }
    }

    public h(d dVar) {
        m.e(dVar, "backing");
        this.f12977a = dVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(Object obj) {
        return this.f12977a.j(obj) >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean addAll(Collection collection) {
        m.e(collection, "elements");
        this.f12977a.n();
        return super.addAll(collection);
    }

    @Override // ed.g
    public int b() {
        return this.f12977a.size();
    }

    public final Set c() {
        this.f12977a.l();
        return size() > 0 ? this : f12976c;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.f12977a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return this.f12977a.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return this.f12977a.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        return this.f12977a.N();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        return this.f12977a.Z(obj);
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean removeAll(Collection collection) {
        m.e(collection, "elements");
        this.f12977a.n();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean retainAll(Collection collection) {
        m.e(collection, "elements");
        this.f12977a.n();
        return super.retainAll(collection);
    }

    public h() {
        this(new d());
    }
}
