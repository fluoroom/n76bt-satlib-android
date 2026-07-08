package s9;

import j$.util.Map;
import j$.util.Objects;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.SortedMap;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;
import s9.j;

/* JADX INFO: loaded from: classes3.dex */
public abstract class l implements Map, Serializable, j$.util.Map {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final Map.Entry[] f27045d = new Map.Entry[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private transient m f27046a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private transient m f27047b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private transient j f27048c;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Comparator f27049a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object[] f27050b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f27051c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        boolean f27052d = false;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        C0371a f27053e;

        /* JADX INFO: renamed from: s9.l$a$a, reason: collision with other inner class name */
        static final class C0371a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final Object f27054a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final Object f27055b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final Object f27056c;

            C0371a(Object obj, Object obj2, Object obj3) {
                this.f27054a = obj;
                this.f27055b = obj2;
                this.f27056c = obj3;
            }

            IllegalArgumentException a() {
                return new IllegalArgumentException("Multiple entries with same key: " + this.f27054a + "=" + this.f27055b + " and " + this.f27054a + "=" + this.f27056c);
            }
        }

        a(int i10) {
            this.f27050b = new Object[i10 * 2];
        }

        private l b(boolean z10) {
            Object[] objArrE;
            C0371a c0371a;
            C0371a c0371a2;
            if (z10 && (c0371a2 = this.f27053e) != null) {
                throw c0371a2.a();
            }
            int length = this.f27051c;
            if (this.f27049a == null) {
                objArrE = this.f27050b;
            } else {
                if (this.f27052d) {
                    this.f27050b = Arrays.copyOf(this.f27050b, length * 2);
                }
                objArrE = this.f27050b;
                if (!z10) {
                    objArrE = e(objArrE, this.f27051c);
                    if (objArrE.length < this.f27050b.length) {
                        length = objArrE.length >>> 1;
                    }
                }
                i(objArrE, length, this.f27049a);
            }
            this.f27052d = true;
            w wVarK = w.k(length, objArrE, this);
            if (!z10 || (c0371a = this.f27053e) == null) {
                return wVarK;
            }
            throw c0371a.a();
        }

        private void d(int i10) {
            int i11 = i10 * 2;
            Object[] objArr = this.f27050b;
            if (i11 > objArr.length) {
                this.f27050b = Arrays.copyOf(objArr, j.b.c(objArr.length, i11));
                this.f27052d = false;
            }
        }

        private Object[] e(Object[] objArr, int i10) {
            HashSet hashSet = new HashSet();
            BitSet bitSet = new BitSet();
            for (int i11 = i10 - 1; i11 >= 0; i11--) {
                Object obj = objArr[i11 * 2];
                Objects.requireNonNull(obj);
                if (!hashSet.add(obj)) {
                    bitSet.set(i11);
                }
            }
            if (bitSet.isEmpty()) {
                return objArr;
            }
            Object[] objArr2 = new Object[(i10 - bitSet.cardinality()) * 2];
            int i12 = 0;
            int i13 = 0;
            while (i12 < i10 * 2) {
                if (bitSet.get(i12 >>> 1)) {
                    i12 += 2;
                } else {
                    int i14 = i13 + 1;
                    int i15 = i12 + 1;
                    Object obj2 = objArr[i12];
                    Objects.requireNonNull(obj2);
                    objArr2[i13] = obj2;
                    i13 += 2;
                    i12 += 2;
                    Object obj3 = objArr[i15];
                    Objects.requireNonNull(obj3);
                    objArr2[i14] = obj3;
                }
            }
            return objArr2;
        }

        static void i(Object[] objArr, int i10, Comparator comparator) {
            Map.Entry[] entryArr = new Map.Entry[i10];
            for (int i11 = 0; i11 < i10; i11++) {
                int i12 = i11 * 2;
                Object obj = objArr[i12];
                Objects.requireNonNull(obj);
                Object obj2 = objArr[i12 + 1];
                Objects.requireNonNull(obj2);
                entryArr[i11] = new AbstractMap.SimpleImmutableEntry(obj, obj2);
            }
            Arrays.sort(entryArr, 0, i10, t.a(comparator).b(r.e()));
            for (int i13 = 0; i13 < i10; i13++) {
                int i14 = i13 * 2;
                objArr[i14] = entryArr[i13].getKey();
                objArr[i14 + 1] = entryArr[i13].getValue();
            }
        }

        public l a() {
            return c();
        }

        public l c() {
            return b(true);
        }

        public a f(Object obj, Object obj2) {
            d(this.f27051c + 1);
            c.a(obj, obj2);
            Object[] objArr = this.f27050b;
            int i10 = this.f27051c;
            objArr[i10 * 2] = obj;
            objArr[(i10 * 2) + 1] = obj2;
            this.f27051c = i10 + 1;
            return this;
        }

        public a g(Map.Entry entry) {
            return f(entry.getKey(), entry.getValue());
        }

        public a h(Iterable iterable) {
            if (iterable instanceof Collection) {
                d(this.f27051c + ((Collection) iterable).size());
            }
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                g((Map.Entry) it.next());
            }
            return this;
        }
    }

    l() {
    }

    public static l a(Iterable iterable) {
        a aVar = new a(iterable instanceof Collection ? ((Collection) iterable).size() : 4);
        aVar.h(iterable);
        return aVar.a();
    }

    public static l b(Map map) {
        if ((map instanceof l) && !(map instanceof SortedMap)) {
            l lVar = (l) map;
            if (!lVar.g()) {
                return lVar;
            }
        }
        return a(map.entrySet());
    }

    public static l i() {
        return w.f27082h;
    }

    abstract m c();

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ Object compute(Object obj, BiFunction biFunction) {
        return Map.CC.$default$compute(this, obj, biFunction);
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ Object computeIfAbsent(Object obj, Function function) {
        return Map.CC.$default$computeIfAbsent(this, obj, function);
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ Object computeIfPresent(Object obj, BiFunction biFunction) {
        return Map.CC.$default$computeIfPresent(this, obj, biFunction);
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return values().contains(obj);
    }

    abstract m d();

    abstract j e();

    @Override // java.util.Map
    public boolean equals(Object obj) {
        return r.b(this, obj);
    }

    @Override // java.util.Map
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public m entrySet() {
        m mVar = this.f27046a;
        if (mVar != null) {
            return mVar;
        }
        m mVarC = c();
        this.f27046a = mVarC;
        return mVarC;
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ void forEach(BiConsumer biConsumer) {
        Map.CC.$default$forEach(this, biConsumer);
    }

    abstract boolean g();

    @Override // java.util.Map
    public abstract Object get(Object obj);

    @Override // java.util.Map, j$.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    @Override // java.util.Map
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public m keySet() {
        m mVar = this.f27047b;
        if (mVar != null) {
            return mVar;
        }
        m mVarD = d();
        this.f27047b = mVarD;
        return mVarD;
    }

    @Override // java.util.Map
    public int hashCode() {
        return y.b(entrySet());
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public j values() {
        j jVar = this.f27048c;
        if (jVar != null) {
            return jVar;
        }
        j jVarE = e();
        this.f27048c = jVarE;
        return jVarE;
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ Object merge(Object obj, Object obj2, BiFunction biFunction) {
        return Map.CC.$default$merge(this, obj, obj2, biFunction);
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final void putAll(java.util.Map map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ Object putIfAbsent(Object obj, Object obj2) {
        return Map.CC.$default$putIfAbsent(this, obj, obj2);
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ boolean remove(Object obj, Object obj2) {
        return Map.CC.$default$remove(this, obj, obj2);
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ Object replace(Object obj, Object obj2) {
        return Map.CC.$default$replace(this, obj, obj2);
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ void replaceAll(BiFunction biFunction) {
        Map.CC.$default$replaceAll(this, biFunction);
    }

    public String toString() {
        return r.d(this);
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ boolean replace(Object obj, Object obj2, Object obj3) {
        return Map.CC.$default$replace(this, obj, obj2, obj3);
    }
}
