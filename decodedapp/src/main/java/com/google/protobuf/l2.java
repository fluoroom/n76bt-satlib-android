package com.google.protobuf;

import com.google.protobuf.e0;
import j$.util.DesugarCollections;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes3.dex */
abstract class l2 extends AbstractMap {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f9137a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List f9138b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Map f9139c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f9140d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private volatile e f9141e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Map f9142f;

    class a extends l2 {
        a(int i10) {
            super(i10, null);
        }

        @Override // com.google.protobuf.l2
        public void n() {
            if (!m()) {
                for (int i10 = 0; i10 < i(); i10++) {
                    Map.Entry entryH = h(i10);
                    if (((e0.c) entryH.getKey()).b()) {
                        entryH.setValue(DesugarCollections.unmodifiableList((List) entryH.getValue()));
                    }
                }
                for (Map.Entry entry : k()) {
                    if (((e0.c) entry.getKey()).b()) {
                        entry.setValue(DesugarCollections.unmodifiableList((List) entry.getValue()));
                    }
                }
            }
            super.n();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
            return super.p((Comparable) obj, obj2);
        }
    }

    private static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final Iterator f9143a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final Iterable f9144b = new C0136b();

        class a implements Iterator {
            a() {
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return false;
            }

            @Override // java.util.Iterator
            public Object next() {
                throw new NoSuchElementException();
            }

            @Override // java.util.Iterator
            public void remove() {
                throw new UnsupportedOperationException();
            }
        }

        /* JADX INFO: renamed from: com.google.protobuf.l2$b$b, reason: collision with other inner class name */
        class C0136b implements Iterable {
            C0136b() {
            }

            @Override // java.lang.Iterable
            public Iterator iterator() {
                return b.f9143a;
            }
        }

        static Iterable b() {
            return f9144b;
        }
    }

    private class c implements Map.Entry, Comparable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Comparable f9145a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Object f9146b;

        c(l2 l2Var, Map.Entry entry) {
            this((Comparable) entry.getKey(), entry.getValue());
        }

        private boolean d(Object obj, Object obj2) {
            return obj == null ? obj2 == null : obj.equals(obj2);
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(c cVar) {
            return getKey().compareTo(cVar.getKey());
        }

        @Override // java.util.Map.Entry
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Comparable getKey() {
            return this.f9145a;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return d(this.f9145a, entry.getKey()) && d(this.f9146b, entry.getValue());
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            return this.f9146b;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            Comparable comparable = this.f9145a;
            int iHashCode = comparable == null ? 0 : comparable.hashCode();
            Object obj = this.f9146b;
            return iHashCode ^ (obj != null ? obj.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            l2.this.f();
            Object obj2 = this.f9146b;
            this.f9146b = obj;
            return obj2;
        }

        public String toString() {
            return this.f9145a + "=" + this.f9146b;
        }

        c(Comparable comparable, Object obj) {
            this.f9145a = comparable;
            this.f9146b = obj;
        }
    }

    private class e extends AbstractSet {
        private e() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public boolean add(Map.Entry entry) {
            if (contains(entry)) {
                return false;
            }
            l2.this.p((Comparable) entry.getKey(), entry.getValue());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            l2.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = l2.this.get(entry.getKey());
            Object value = entry.getValue();
            if (obj2 != value) {
                return obj2 != null && obj2.equals(value);
            }
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return new d(l2.this, null);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            if (!contains(entry)) {
                return false;
            }
            l2.this.remove(entry.getKey());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return l2.this.size();
        }

        /* synthetic */ e(l2 l2Var, a aVar) {
            this();
        }
    }

    /* synthetic */ l2(int i10, a aVar) {
        this(i10);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private int e(java.lang.Comparable r5) {
        /*
            r4 = this;
            java.util.List r0 = r4.f9138b
            int r0 = r0.size()
            int r1 = r0 + (-1)
            if (r1 < 0) goto L23
            java.util.List r2 = r4.f9138b
            java.lang.Object r2 = r2.get(r1)
            com.google.protobuf.l2$c r2 = (com.google.protobuf.l2.c) r2
            java.lang.Comparable r2 = r2.getKey()
            int r2 = r5.compareTo(r2)
            if (r2 <= 0) goto L20
            int r0 = r0 + 1
        L1e:
            int r5 = -r0
            return r5
        L20:
            if (r2 != 0) goto L23
            return r1
        L23:
            r0 = 0
        L24:
            if (r0 > r1) goto L47
            int r2 = r0 + r1
            int r2 = r2 / 2
            java.util.List r3 = r4.f9138b
            java.lang.Object r3 = r3.get(r2)
            com.google.protobuf.l2$c r3 = (com.google.protobuf.l2.c) r3
            java.lang.Comparable r3 = r3.getKey()
            int r3 = r5.compareTo(r3)
            if (r3 >= 0) goto L40
            int r2 = r2 + (-1)
            r1 = r2
            goto L24
        L40:
            if (r3 <= 0) goto L46
            int r2 = r2 + 1
            r0 = r2
            goto L24
        L46:
            return r2
        L47:
            int r0 = r0 + 1
            goto L1e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.l2.e(java.lang.Comparable):int");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        if (this.f9140d) {
            throw new UnsupportedOperationException();
        }
    }

    private void g() {
        f();
        if (!this.f9138b.isEmpty() || (this.f9138b instanceof ArrayList)) {
            return;
        }
        this.f9138b = new ArrayList(this.f9137a);
    }

    private SortedMap l() {
        f();
        if (this.f9139c.isEmpty() && !(this.f9139c instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f9139c = treeMap;
            this.f9142f = treeMap.descendingMap();
        }
        return (SortedMap) this.f9139c;
    }

    static l2 o(int i10) {
        return new a(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object q(int i10) {
        f();
        Object value = ((c) this.f9138b.remove(i10)).getValue();
        if (!this.f9139c.isEmpty()) {
            Iterator it = l().entrySet().iterator();
            this.f9138b.add(new c(this, (Map.Entry) it.next()));
            it.remove();
        }
        return value;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        f();
        if (!this.f9138b.isEmpty()) {
            this.f9138b.clear();
        }
        if (this.f9139c.isEmpty()) {
            return;
        }
        this.f9139c.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return e(comparable) >= 0 || this.f9139c.containsKey(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set entrySet() {
        if (this.f9141e == null) {
            this.f9141e = new e(this, null);
        }
        return this.f9141e;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l2)) {
            return super.equals(obj);
        }
        l2 l2Var = (l2) obj;
        int size = size();
        if (size != l2Var.size()) {
            return false;
        }
        int i10 = i();
        if (i10 != l2Var.i()) {
            return entrySet().equals(l2Var.entrySet());
        }
        for (int i11 = 0; i11 < i10; i11++) {
            if (!h(i11).equals(l2Var.h(i11))) {
                return false;
            }
        }
        if (i10 != size) {
            return this.f9139c.equals(l2Var.f9139c);
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iE = e(comparable);
        return iE >= 0 ? ((c) this.f9138b.get(iE)).getValue() : this.f9139c.get(comparable);
    }

    public Map.Entry h(int i10) {
        return (Map.Entry) this.f9138b.get(i10);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        int i10 = i();
        int iHashCode = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            iHashCode += ((c) this.f9138b.get(i11)).hashCode();
        }
        return j() > 0 ? iHashCode + this.f9139c.hashCode() : iHashCode;
    }

    public int i() {
        return this.f9138b.size();
    }

    public int j() {
        return this.f9139c.size();
    }

    public Iterable k() {
        return this.f9139c.isEmpty() ? b.b() : this.f9139c.entrySet();
    }

    public boolean m() {
        return this.f9140d;
    }

    public void n() {
        if (this.f9140d) {
            return;
        }
        this.f9139c = this.f9139c.isEmpty() ? Collections.EMPTY_MAP : DesugarCollections.unmodifiableMap(this.f9139c);
        this.f9142f = this.f9142f.isEmpty() ? Collections.EMPTY_MAP : DesugarCollections.unmodifiableMap(this.f9142f);
        this.f9140d = true;
    }

    public Object p(Comparable comparable, Object obj) {
        f();
        int iE = e(comparable);
        if (iE >= 0) {
            return ((c) this.f9138b.get(iE)).setValue(obj);
        }
        g();
        int i10 = -(iE + 1);
        if (i10 >= this.f9137a) {
            return l().put(comparable, obj);
        }
        int size = this.f9138b.size();
        int i11 = this.f9137a;
        if (size == i11) {
            c cVar = (c) this.f9138b.remove(i11 - 1);
            l().put(cVar.getKey(), cVar.getValue());
        }
        this.f9138b.add(i10, new c(comparable, obj));
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object remove(Object obj) {
        f();
        Comparable comparable = (Comparable) obj;
        int iE = e(comparable);
        if (iE >= 0) {
            return q(iE);
        }
        if (this.f9139c.isEmpty()) {
            return null;
        }
        return this.f9139c.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.f9138b.size() + this.f9139c.size();
    }

    private class d implements Iterator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f9148a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f9149b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Iterator f9150c;

        private d() {
            this.f9148a = -1;
        }

        private Iterator a() {
            if (this.f9150c == null) {
                this.f9150c = l2.this.f9139c.entrySet().iterator();
            }
            return this.f9150c;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public Map.Entry next() {
            this.f9149b = true;
            int i10 = this.f9148a + 1;
            this.f9148a = i10;
            return i10 < l2.this.f9138b.size() ? (Map.Entry) l2.this.f9138b.get(this.f9148a) : (Map.Entry) a().next();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f9148a + 1 < l2.this.f9138b.size() || (!l2.this.f9139c.isEmpty() && a().hasNext());
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.f9149b) {
                throw new IllegalStateException("remove() was called before next()");
            }
            this.f9149b = false;
            l2.this.f();
            if (this.f9148a >= l2.this.f9138b.size()) {
                a().remove();
                return;
            }
            l2 l2Var = l2.this;
            int i10 = this.f9148a;
            this.f9148a = i10 - 1;
            l2Var.q(i10);
        }

        /* synthetic */ d(l2 l2Var, a aVar) {
            this();
        }
    }

    private l2(int i10) {
        this.f9137a = i10;
        this.f9138b = Collections.EMPTY_LIST;
        Map map = Collections.EMPTY_MAP;
        this.f9139c = map;
        this.f9142f = map;
    }
}
