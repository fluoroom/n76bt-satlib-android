package ki;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a implements Map {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected Map f19960a;

    protected a(Map map) {
        this.f19960a = map;
    }

    protected abstract Collection a();

    @Override // java.util.Map
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public synchronized Collection get(Object obj) {
        return (Collection) this.f19960a.get(obj);
    }

    @Override // java.util.Map
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public synchronized Collection put(Object obj, Collection collection) {
        return (Collection) this.f19960a.put(obj, collection);
    }

    @Override // java.util.Map
    public synchronized void clear() {
        this.f19960a.clear();
    }

    @Override // java.util.Map
    public synchronized boolean containsKey(Object obj) {
        return this.f19960a.containsKey(obj);
    }

    @Override // java.util.Map
    public synchronized boolean containsValue(Object obj) {
        return this.f19960a.containsValue(obj);
    }

    public synchronized int d(Object obj, Object obj2) {
        Collection collectionA;
        try {
            collectionA = (Collection) this.f19960a.get(obj);
            if (collectionA == null) {
                collectionA = a();
                this.f19960a.put(obj, collectionA);
            }
            collectionA.add(obj2);
        } catch (Throwable th2) {
            throw th2;
        }
        return collectionA.size();
    }

    @Override // java.util.Map
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public synchronized Collection remove(Object obj) {
        return (Collection) this.f19960a.remove(obj);
    }

    @Override // java.util.Map
    public synchronized Set entrySet() {
        return this.f19960a.entrySet();
    }

    @Override // java.util.Map
    public synchronized boolean equals(Object obj) {
        return this.f19960a.equals(obj);
    }

    @Override // java.util.Map
    public synchronized int hashCode() {
        return this.f19960a.hashCode();
    }

    @Override // java.util.Map
    public synchronized boolean isEmpty() {
        return this.f19960a.isEmpty();
    }

    @Override // java.util.Map
    public synchronized Set keySet() {
        return this.f19960a.keySet();
    }

    @Override // java.util.Map
    public void putAll(Map map) {
        this.f19960a.putAll(map);
    }

    @Override // java.util.Map
    public synchronized int size() {
        return this.f19960a.size();
    }

    @Override // java.util.Map
    public synchronized Collection values() {
        return this.f19960a.values();
    }
}
