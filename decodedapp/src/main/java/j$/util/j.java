package j$.util;

import j$.util.Map;
import j$.util.concurrent.ConcurrentMap;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.concurrent.ConcurrentMap;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

/* JADX INFO: loaded from: classes2.dex */
public final class j implements java.util.Map, Serializable, Map {
    private static final long serialVersionUID = 1978198479659022715L;

    /* JADX INFO: renamed from: a */
    public final java.util.Map f17834a;

    /* JADX INFO: renamed from: b */
    public final j f17835b = this;

    /* JADX INFO: renamed from: c */
    public transient l f17836c;

    /* JADX INFO: renamed from: d */
    public transient l f17837d;

    /* JADX INFO: renamed from: e */
    public transient h f17838e;

    public j(java.util.Map map) {
        this.f17834a = (java.util.Map) Objects.requireNonNull(map);
    }

    @Override // java.util.Map
    public final int size() {
        int size;
        synchronized (this.f17835b) {
            size = this.f17834a.size();
        }
        return size;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        boolean zIsEmpty;
        synchronized (this.f17835b) {
            zIsEmpty = this.f17834a.isEmpty();
        }
        return zIsEmpty;
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        boolean zContainsKey;
        synchronized (this.f17835b) {
            zContainsKey = this.f17834a.containsKey(obj);
        }
        return zContainsKey;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        boolean zContainsValue;
        synchronized (this.f17835b) {
            zContainsValue = this.f17834a.containsValue(obj);
        }
        return zContainsValue;
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        Object obj2;
        synchronized (this.f17835b) {
            obj2 = this.f17834a.get(obj);
        }
        return obj2;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        Object objPut;
        synchronized (this.f17835b) {
            objPut = this.f17834a.put(obj, obj2);
        }
        return objPut;
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        Object objRemove;
        synchronized (this.f17835b) {
            objRemove = this.f17834a.remove(obj);
        }
        return objRemove;
    }

    @Override // java.util.Map
    public final void putAll(java.util.Map map) {
        synchronized (this.f17835b) {
            this.f17834a.putAll(map);
        }
    }

    @Override // java.util.Map
    public final void clear() {
        synchronized (this.f17835b) {
            this.f17834a.clear();
        }
    }

    @Override // java.util.Map
    public final java.util.Set keySet() {
        l lVar;
        synchronized (this.f17835b) {
            try {
                if (this.f17836c == null) {
                    this.f17836c = new l(this.f17834a.keySet(), this.f17835b);
                }
                lVar = this.f17836c;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return lVar;
    }

    @Override // java.util.Map
    public final java.util.Set entrySet() {
        l lVar;
        synchronized (this.f17835b) {
            try {
                if (this.f17837d == null) {
                    this.f17837d = new l(this.f17834a.entrySet(), this.f17835b);
                }
                lVar = this.f17837d;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return lVar;
    }

    @Override // java.util.Map
    public final java.util.Collection values() {
        h hVar;
        synchronized (this.f17835b) {
            try {
                if (this.f17838e == null) {
                    this.f17838e = new h(this.f17834a.values(), this.f17835b);
                }
                hVar = this.f17838e;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return hVar;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        boolean zEquals;
        if (this == obj) {
            return true;
        }
        synchronized (this.f17835b) {
            zEquals = this.f17834a.equals(obj);
        }
        return zEquals;
    }

    @Override // java.util.Map
    public final int hashCode() {
        int iHashCode;
        synchronized (this.f17835b) {
            iHashCode = this.f17834a.hashCode();
        }
        return iHashCode;
    }

    public final String toString() {
        String string;
        synchronized (this.f17835b) {
            string = this.f17834a.toString();
        }
        return string;
    }

    @Override // java.util.Map, j$.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        Object objB;
        synchronized (this.f17835b) {
            objB = Map.EL.b(this.f17834a, obj, obj2);
        }
        return objB;
    }

    @Override // java.util.Map, j$.util.Map
    public final void forEach(BiConsumer biConsumer) {
        synchronized (this.f17835b) {
            Map.EL.a(this.f17834a, biConsumer);
        }
    }

    @Override // java.util.Map, j$.util.Map
    public final void replaceAll(BiFunction biFunction) {
        synchronized (this.f17835b) {
            java.util.Map map = this.f17834a;
            if (map instanceof Map) {
                ((Map) map).replaceAll(biFunction);
            } else if (map instanceof ConcurrentMap) {
                ConcurrentMap.CC.$default$replaceAll((java.util.concurrent.ConcurrentMap) map, biFunction);
            } else {
                Map.CC.$default$replaceAll(map, biFunction);
            }
        }
    }

    @Override // java.util.Map, j$.util.Map
    public final Object putIfAbsent(Object obj, Object obj2) {
        Object objPutIfAbsent;
        synchronized (this.f17835b) {
            objPutIfAbsent = Map.EL.putIfAbsent(this.f17834a, obj, obj2);
        }
        return objPutIfAbsent;
    }

    @Override // java.util.Map, j$.util.Map
    public final boolean remove(Object obj, Object obj2) {
        boolean zRemove;
        synchronized (this.f17835b) {
            java.util.Map map = this.f17834a;
            zRemove = map instanceof Map ? ((Map) map).remove(obj, obj2) : Map.CC.$default$remove(map, obj, obj2);
        }
        return zRemove;
    }

    @Override // java.util.Map, j$.util.Map
    public final boolean replace(Object obj, Object obj2, Object obj3) {
        boolean zReplace;
        synchronized (this.f17835b) {
            java.util.Map map = this.f17834a;
            zReplace = map instanceof Map ? ((Map) map).replace(obj, obj2, obj3) : Map.CC.$default$replace(map, obj, obj2, obj3);
        }
        return zReplace;
    }

    @Override // java.util.Map, j$.util.Map
    public final Object replace(Object obj, Object obj2) {
        Object objReplace;
        synchronized (this.f17835b) {
            java.util.Map map = this.f17834a;
            objReplace = map instanceof Map ? ((Map) map).replace(obj, obj2) : Map.CC.$default$replace(map, obj, obj2);
        }
        return objReplace;
    }

    @Override // java.util.Map, j$.util.Map
    public final Object computeIfAbsent(Object obj, Function function) {
        Object objComputeIfAbsent;
        synchronized (this.f17835b) {
            objComputeIfAbsent = Map.EL.computeIfAbsent(this.f17834a, obj, function);
        }
        return objComputeIfAbsent;
    }

    @Override // java.util.Map, j$.util.Map
    public final Object computeIfPresent(Object obj, BiFunction biFunction) {
        Object objComputeIfPresent;
        synchronized (this.f17835b) {
            java.util.Map map = this.f17834a;
            objComputeIfPresent = map instanceof Map ? ((Map) map).computeIfPresent(obj, biFunction) : map instanceof java.util.concurrent.ConcurrentMap ? ConcurrentMap.CC.$default$computeIfPresent((java.util.concurrent.ConcurrentMap) map, obj, biFunction) : Map.CC.$default$computeIfPresent(map, obj, biFunction);
        }
        return objComputeIfPresent;
    }

    @Override // java.util.Map, j$.util.Map
    public final Object compute(Object obj, BiFunction biFunction) {
        Object objCompute;
        synchronized (this.f17835b) {
            java.util.Map map = this.f17834a;
            objCompute = map instanceof Map ? ((Map) map).compute(obj, biFunction) : map instanceof java.util.concurrent.ConcurrentMap ? ConcurrentMap.CC.$default$compute((java.util.concurrent.ConcurrentMap) map, obj, biFunction) : Map.CC.$default$compute(map, obj, biFunction);
        }
        return objCompute;
    }

    @Override // java.util.Map, j$.util.Map
    public final Object merge(Object obj, Object obj2, BiFunction biFunction) {
        Object objMerge;
        synchronized (this.f17835b) {
            java.util.Map map = this.f17834a;
            objMerge = map instanceof Map ? ((Map) map).merge(obj, obj2, biFunction) : map instanceof java.util.concurrent.ConcurrentMap ? ConcurrentMap.CC.$default$merge((java.util.concurrent.ConcurrentMap) map, obj, obj2, biFunction) : Map.CC.$default$merge(map, obj, obj2, biFunction);
        }
        return objMerge;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        synchronized (this.f17835b) {
            objectOutputStream.defaultWriteObject();
        }
    }
}
