package com.google.protobuf;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public class b1 extends d1 implements s1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile boolean f8881a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile d f8882b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private c f8883c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private List f8884d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final a f8885e;

    private interface a {
        i1 a(Object obj, Object obj2);

        i1 b();

        void c(i1 i1Var, Map map);
    }

    private static class b implements a {
        public b(z0 z0Var) {
        }

        @Override // com.google.protobuf.b1.a
        public i1 a(Object obj, Object obj2) {
            throw null;
        }

        @Override // com.google.protobuf.b1.a
        public i1 b() {
            return null;
        }

        @Override // com.google.protobuf.b1.a
        public void c(i1 i1Var, Map map) {
            android.support.v4.media.session.b.a(i1Var);
            throw null;
        }
    }

    static class c implements Map {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final s1 f8886a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Map f8887b;

        private static class a implements Collection {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final s1 f8888a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final Collection f8889b;

            a(s1 s1Var, Collection collection) {
                this.f8888a = s1Var;
                this.f8889b = collection;
            }

            @Override // java.util.Collection
            public boolean add(Object obj) {
                throw new UnsupportedOperationException();
            }

            @Override // java.util.Collection
            public boolean addAll(Collection collection) {
                throw new UnsupportedOperationException();
            }

            @Override // java.util.Collection
            public void clear() {
                this.f8888a.a();
                this.f8889b.clear();
            }

            @Override // java.util.Collection
            public boolean contains(Object obj) {
                return this.f8889b.contains(obj);
            }

            @Override // java.util.Collection
            public boolean containsAll(Collection collection) {
                return this.f8889b.containsAll(collection);
            }

            @Override // java.util.Collection
            public boolean equals(Object obj) {
                return this.f8889b.equals(obj);
            }

            @Override // java.util.Collection
            public int hashCode() {
                return this.f8889b.hashCode();
            }

            @Override // java.util.Collection
            public boolean isEmpty() {
                return this.f8889b.isEmpty();
            }

            @Override // java.util.Collection, java.lang.Iterable
            public Iterator iterator() {
                return new b(this.f8888a, this.f8889b.iterator());
            }

            @Override // java.util.Collection
            public boolean remove(Object obj) {
                this.f8888a.a();
                return this.f8889b.remove(obj);
            }

            @Override // java.util.Collection
            public boolean removeAll(Collection collection) {
                this.f8888a.a();
                return this.f8889b.removeAll(collection);
            }

            @Override // java.util.Collection
            public boolean retainAll(Collection collection) {
                this.f8888a.a();
                return this.f8889b.retainAll(collection);
            }

            @Override // java.util.Collection
            public int size() {
                return this.f8889b.size();
            }

            @Override // java.util.Collection
            public Object[] toArray() {
                return this.f8889b.toArray();
            }

            public String toString() {
                return this.f8889b.toString();
            }

            @Override // java.util.Collection
            public Object[] toArray(Object[] objArr) {
                return this.f8889b.toArray(objArr);
            }
        }

        private static class b implements Iterator {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final s1 f8890a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final Iterator f8891b;

            b(s1 s1Var, Iterator it) {
                this.f8890a = s1Var;
                this.f8891b = it;
            }

            public boolean equals(Object obj) {
                return this.f8891b.equals(obj);
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f8891b.hasNext();
            }

            public int hashCode() {
                return this.f8891b.hashCode();
            }

            @Override // java.util.Iterator
            public Object next() {
                return this.f8891b.next();
            }

            @Override // java.util.Iterator
            public void remove() {
                this.f8890a.a();
                this.f8891b.remove();
            }

            public String toString() {
                return this.f8891b.toString();
            }
        }

        /* JADX INFO: renamed from: com.google.protobuf.b1$c$c, reason: collision with other inner class name */
        private static class C0134c implements Set {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final s1 f8892a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final Set f8893b;

            C0134c(s1 s1Var, Set set) {
                this.f8892a = s1Var;
                this.f8893b = set;
            }

            @Override // java.util.Set, java.util.Collection
            public boolean add(Object obj) {
                this.f8892a.a();
                return this.f8893b.add(obj);
            }

            @Override // java.util.Set, java.util.Collection
            public boolean addAll(Collection collection) {
                this.f8892a.a();
                return this.f8893b.addAll(collection);
            }

            @Override // java.util.Set, java.util.Collection
            public void clear() {
                this.f8892a.a();
                this.f8893b.clear();
            }

            @Override // java.util.Set, java.util.Collection
            public boolean contains(Object obj) {
                return this.f8893b.contains(obj);
            }

            @Override // java.util.Set, java.util.Collection
            public boolean containsAll(Collection collection) {
                return this.f8893b.containsAll(collection);
            }

            @Override // java.util.Set, java.util.Collection
            public boolean equals(Object obj) {
                return this.f8893b.equals(obj);
            }

            @Override // java.util.Set, java.util.Collection
            public int hashCode() {
                return this.f8893b.hashCode();
            }

            @Override // java.util.Set, java.util.Collection
            public boolean isEmpty() {
                return this.f8893b.isEmpty();
            }

            @Override // java.util.Set, java.util.Collection, java.lang.Iterable
            public Iterator iterator() {
                return new b(this.f8892a, this.f8893b.iterator());
            }

            @Override // java.util.Set, java.util.Collection
            public boolean remove(Object obj) {
                this.f8892a.a();
                return this.f8893b.remove(obj);
            }

            @Override // java.util.Set, java.util.Collection
            public boolean removeAll(Collection collection) {
                this.f8892a.a();
                return this.f8893b.removeAll(collection);
            }

            @Override // java.util.Set, java.util.Collection
            public boolean retainAll(Collection collection) {
                this.f8892a.a();
                return this.f8893b.retainAll(collection);
            }

            @Override // java.util.Set, java.util.Collection
            public int size() {
                return this.f8893b.size();
            }

            @Override // java.util.Set, java.util.Collection
            public Object[] toArray() {
                return this.f8893b.toArray();
            }

            public String toString() {
                return this.f8893b.toString();
            }

            @Override // java.util.Set, java.util.Collection
            public Object[] toArray(Object[] objArr) {
                return this.f8893b.toArray(objArr);
            }
        }

        c(s1 s1Var, Map map) {
            this.f8886a = s1Var;
            this.f8887b = map;
        }

        @Override // java.util.Map
        public void clear() {
            this.f8886a.a();
            this.f8887b.clear();
        }

        @Override // java.util.Map
        public boolean containsKey(Object obj) {
            return this.f8887b.containsKey(obj);
        }

        @Override // java.util.Map
        public boolean containsValue(Object obj) {
            return this.f8887b.containsValue(obj);
        }

        @Override // java.util.Map
        public Set entrySet() {
            return new C0134c(this.f8886a, this.f8887b.entrySet());
        }

        @Override // java.util.Map
        public boolean equals(Object obj) {
            return this.f8887b.equals(obj);
        }

        @Override // java.util.Map
        public Object get(Object obj) {
            return this.f8887b.get(obj);
        }

        @Override // java.util.Map
        public int hashCode() {
            return this.f8887b.hashCode();
        }

        @Override // java.util.Map
        public boolean isEmpty() {
            return this.f8887b.isEmpty();
        }

        @Override // java.util.Map
        public Set keySet() {
            return new C0134c(this.f8886a, this.f8887b.keySet());
        }

        @Override // java.util.Map
        public Object put(Object obj, Object obj2) {
            this.f8886a.a();
            o0.a(obj);
            o0.a(obj2);
            return this.f8887b.put(obj, obj2);
        }

        @Override // java.util.Map
        public void putAll(Map map) {
            this.f8886a.a();
            for (Object obj : map.keySet()) {
                o0.a(obj);
                o0.a(map.get(obj));
            }
            this.f8887b.putAll(map);
        }

        @Override // java.util.Map
        public Object remove(Object obj) {
            this.f8886a.a();
            return this.f8887b.remove(obj);
        }

        @Override // java.util.Map
        public int size() {
            return this.f8887b.size();
        }

        public String toString() {
            return this.f8887b.toString();
        }

        @Override // java.util.Map
        public Collection values() {
            return new a(this.f8886a, this.f8887b.values());
        }
    }

    private enum d {
        MAP,
        LIST,
        BOTH
    }

    private b1(a aVar, d dVar, Map map) {
        this.f8885e = aVar;
        this.f8881a = true;
        this.f8882b = dVar;
        this.f8883c = new c(this, map);
        this.f8884d = null;
    }

    private i1 e(Object obj, Object obj2) {
        return this.f8885e.a(obj, obj2);
    }

    private c f(List list) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            h((i1) it.next(), linkedHashMap);
        }
        return new c(this, linkedHashMap);
    }

    private List g(c cVar) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : cVar.entrySet()) {
            arrayList.add(e(entry.getKey(), entry.getValue()));
        }
        return arrayList;
    }

    private void h(i1 i1Var, Map map) {
        this.f8885e.c(i1Var, map);
    }

    public static b1 o(z0 z0Var) {
        return new b1(z0Var, d.MAP, new LinkedHashMap());
    }

    @Override // com.google.protobuf.s1
    public void a() {
        if (!l()) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // com.google.protobuf.d1
    List b() {
        d dVar = this.f8882b;
        d dVar2 = d.MAP;
        if (dVar == dVar2) {
            synchronized (this) {
                try {
                    if (this.f8882b == dVar2) {
                        this.f8884d = g(this.f8883c);
                        this.f8882b = d.BOTH;
                    }
                } finally {
                }
            }
        }
        return DesugarCollections.unmodifiableList(this.f8884d);
    }

    @Override // com.google.protobuf.d1
    i1 c() {
        return this.f8885e.b();
    }

    @Override // com.google.protobuf.d1
    List d() {
        d dVar = this.f8882b;
        d dVar2 = d.LIST;
        if (dVar != dVar2) {
            if (this.f8882b == d.MAP) {
                this.f8884d = g(this.f8883c);
            }
            this.f8883c = null;
            this.f8882b = dVar2;
        }
        return this.f8884d;
    }

    public boolean equals(Object obj) {
        if (obj instanceof b1) {
            return c1.k(j(), ((b1) obj).j());
        }
        return false;
    }

    public int hashCode() {
        return c1.a(j());
    }

    public b1 i() {
        return new b1(this.f8885e, d.MAP, c1.g(j()));
    }

    public Map j() {
        d dVar = this.f8882b;
        d dVar2 = d.LIST;
        if (dVar == dVar2) {
            synchronized (this) {
                try {
                    if (this.f8882b == dVar2) {
                        this.f8883c = f(this.f8884d);
                        this.f8882b = d.BOTH;
                    }
                } finally {
                }
            }
        }
        return DesugarCollections.unmodifiableMap(this.f8883c);
    }

    public Map k() {
        d dVar = this.f8882b;
        d dVar2 = d.MAP;
        if (dVar != dVar2) {
            if (this.f8882b == d.LIST) {
                this.f8883c = f(this.f8884d);
            }
            this.f8884d = null;
            this.f8882b = dVar2;
        }
        return this.f8883c;
    }

    public boolean l() {
        return this.f8881a;
    }

    public void m() {
        this.f8881a = false;
    }

    public void n(b1 b1Var) {
        k().putAll(c1.g(b1Var.j()));
    }

    private b1(z0 z0Var, d dVar, Map map) {
        this(new b(z0Var), dVar, map);
    }
}
