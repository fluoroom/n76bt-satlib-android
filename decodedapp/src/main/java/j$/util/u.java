package j$.util;

import j$.util.Map;
import java.io.Serializable;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

/* JADX INFO: loaded from: classes2.dex */
public final class u implements java.util.Map, Serializable, Map {
    private static final long serialVersionUID = -1034234728574286014L;

    /* JADX INFO: renamed from: a */
    public final java.util.Map f18297a;

    /* JADX INFO: renamed from: b */
    public transient java.util.Set f18298b;

    /* JADX INFO: renamed from: c */
    public transient t f18299c;

    /* JADX INFO: renamed from: d */
    public transient java.util.Collection f18300d;

    public u(java.util.Map map) {
        map.getClass();
        this.f18297a = map;
    }

    @Override // java.util.Map
    public final int size() {
        return this.f18297a.size();
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f18297a.isEmpty();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return this.f18297a.containsKey(obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return this.f18297a.containsValue(obj);
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        return this.f18297a.get(obj);
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final void putAll(java.util.Map map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final java.util.Set keySet() {
        if (this.f18298b == null) {
            this.f18298b = DesugarCollections.unmodifiableSet(this.f18297a.keySet());
        }
        return this.f18298b;
    }

    @Override // java.util.Map
    public final java.util.Set entrySet() {
        if (this.f18299c == null) {
            this.f18299c = new t(this.f18297a.entrySet());
        }
        return this.f18299c;
    }

    @Override // java.util.Map
    public final java.util.Collection values() {
        if (this.f18300d == null) {
            this.f18300d = DesugarCollections.unmodifiableCollection(this.f18297a.values());
        }
        return this.f18300d;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        return obj == this || this.f18297a.equals(obj);
    }

    @Override // java.util.Map
    public final int hashCode() {
        return this.f18297a.hashCode();
    }

    public final String toString() {
        return this.f18297a.toString();
    }

    @Override // java.util.Map, j$.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        return Map.EL.b(this.f18297a, obj, obj2);
    }

    @Override // java.util.Map, j$.util.Map
    public final void forEach(BiConsumer biConsumer) {
        Map.EL.a(this.f18297a, biConsumer);
    }

    @Override // java.util.Map, j$.util.Map
    public final void replaceAll(BiFunction biFunction) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map, j$.util.Map
    public final Object putIfAbsent(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map, j$.util.Map
    public final boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map, j$.util.Map
    public final boolean replace(Object obj, Object obj2, Object obj3) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map, j$.util.Map
    public final Object replace(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map, j$.util.Map
    public final Object computeIfAbsent(Object obj, Function function) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map, j$.util.Map
    public final Object computeIfPresent(Object obj, BiFunction biFunction) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map, j$.util.Map
    public final Object compute(Object obj, BiFunction biFunction) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map, j$.util.Map
    public final Object merge(Object obj, Object obj2, BiFunction biFunction) {
        throw new UnsupportedOperationException();
    }
}
