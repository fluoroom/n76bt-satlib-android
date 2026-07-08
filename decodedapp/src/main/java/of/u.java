package of;

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
import of.h;

/* JADX INFO: loaded from: classes3.dex */
abstract class u extends AbstractMap {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f23503a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List f23504b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Map f23505c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f23506d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private volatile e f23507e;

    static class a extends u {
        a(int i10) {
            super(i10, null);
        }

        @Override // of.u
        public void m() {
            if (!l()) {
                for (int i10 = 0; i10 < i(); i10++) {
                    Map.Entry entryH = h(i10);
                    if (((h.b) entryH.getKey()).b()) {
                        entryH.setValue(DesugarCollections.unmodifiableList((List) entryH.getValue()));
                    }
                }
                for (Map.Entry entry : j()) {
                    if (((h.b) entry.getKey()).b()) {
                        entry.setValue(DesugarCollections.unmodifiableList((List) entry.getValue()));
                    }
                }
            }
            super.m();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
            return super.o((h.b) obj, obj2);
        }
    }

    private static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final Iterator f23508a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final Iterable f23509b = new C0319b();

        static class a implements Iterator {
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

        /* JADX INFO: renamed from: of.u$b$b, reason: collision with other inner class name */
        static class C0319b implements Iterable {
            C0319b() {
            }

            @Override // java.lang.Iterable
            public Iterator iterator() {
                return b.f23508a;
            }
        }

        static Iterable b() {
            return f23509b;
        }
    }

    private class c implements Comparable, Map.Entry {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Comparable f23510a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Object f23511b;

        c(u uVar, Map.Entry entry) {
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
            return this.f23510a;
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
            return d(this.f23510a, entry.getKey()) && d(this.f23511b, entry.getValue());
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            return this.f23511b;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            Comparable comparable = this.f23510a;
            int iHashCode = comparable == null ? 0 : comparable.hashCode();
            Object obj = this.f23511b;
            return iHashCode ^ (obj != null ? obj.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            u.this.f();
            Object obj2 = this.f23511b;
            this.f23511b = obj;
            return obj2;
        }

        public String toString() {
            String strValueOf = String.valueOf(this.f23510a);
            String strValueOf2 = String.valueOf(this.f23511b);
            StringBuilder sb2 = new StringBuilder(strValueOf.length() + 1 + strValueOf2.length());
            sb2.append(strValueOf);
            sb2.append("=");
            sb2.append(strValueOf2);
            return sb2.toString();
        }

        c(Comparable comparable, Object obj) {
            this.f23510a = comparable;
            this.f23511b = obj;
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
            u.this.o((Comparable) entry.getKey(), entry.getValue());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            u.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = u.this.get(entry.getKey());
            Object value = entry.getValue();
            if (obj2 != value) {
                return obj2 != null && obj2.equals(value);
            }
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return new d(u.this, null);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            if (!contains(entry)) {
                return false;
            }
            u.this.remove(entry.getKey());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return u.this.size();
        }

        /* synthetic */ e(u uVar, a aVar) {
            this();
        }
    }

    /* synthetic */ u(int i10, a aVar) {
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
            java.util.List r0 = r4.f23504b
            int r0 = r0.size()
            int r1 = r0 + (-1)
            if (r1 < 0) goto L23
            java.util.List r2 = r4.f23504b
            java.lang.Object r2 = r2.get(r1)
            of.u$c r2 = (of.u.c) r2
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
            java.util.List r3 = r4.f23504b
            java.lang.Object r3 = r3.get(r2)
            of.u$c r3 = (of.u.c) r3
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
        throw new UnsupportedOperationException("Method not decompiled: of.u.e(java.lang.Comparable):int");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        if (this.f23506d) {
            throw new UnsupportedOperationException();
        }
    }

    private void g() {
        f();
        if (!this.f23504b.isEmpty() || (this.f23504b instanceof ArrayList)) {
            return;
        }
        this.f23504b = new ArrayList(this.f23503a);
    }

    private SortedMap k() {
        f();
        if (this.f23505c.isEmpty() && !(this.f23505c instanceof TreeMap)) {
            this.f23505c = new TreeMap();
        }
        return (SortedMap) this.f23505c;
    }

    static u n(int i10) {
        return new a(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object p(int i10) {
        f();
        Object value = ((c) this.f23504b.remove(i10)).getValue();
        if (!this.f23505c.isEmpty()) {
            Iterator it = k().entrySet().iterator();
            this.f23504b.add(new c(this, (Map.Entry) it.next()));
            it.remove();
        }
        return value;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        f();
        if (!this.f23504b.isEmpty()) {
            this.f23504b.clear();
        }
        if (this.f23505c.isEmpty()) {
            return;
        }
        this.f23505c.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return e(comparable) >= 0 || this.f23505c.containsKey(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set entrySet() {
        if (this.f23507e == null) {
            this.f23507e = new e(this, null);
        }
        return this.f23507e;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iE = e(comparable);
        return iE >= 0 ? ((c) this.f23504b.get(iE)).getValue() : this.f23505c.get(comparable);
    }

    public Map.Entry h(int i10) {
        return (Map.Entry) this.f23504b.get(i10);
    }

    public int i() {
        return this.f23504b.size();
    }

    public Iterable j() {
        return this.f23505c.isEmpty() ? b.b() : this.f23505c.entrySet();
    }

    public boolean l() {
        return this.f23506d;
    }

    public void m() {
        if (this.f23506d) {
            return;
        }
        this.f23505c = this.f23505c.isEmpty() ? Collections.EMPTY_MAP : DesugarCollections.unmodifiableMap(this.f23505c);
        this.f23506d = true;
    }

    public Object o(Comparable comparable, Object obj) {
        f();
        int iE = e(comparable);
        if (iE >= 0) {
            return ((c) this.f23504b.get(iE)).setValue(obj);
        }
        g();
        int i10 = -(iE + 1);
        if (i10 >= this.f23503a) {
            return k().put(comparable, obj);
        }
        int size = this.f23504b.size();
        int i11 = this.f23503a;
        if (size == i11) {
            c cVar = (c) this.f23504b.remove(i11 - 1);
            k().put(cVar.getKey(), cVar.getValue());
        }
        this.f23504b.add(i10, new c(comparable, obj));
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object remove(Object obj) {
        f();
        Comparable comparable = (Comparable) obj;
        int iE = e(comparable);
        if (iE >= 0) {
            return p(iE);
        }
        if (this.f23505c.isEmpty()) {
            return null;
        }
        return this.f23505c.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.f23504b.size() + this.f23505c.size();
    }

    private class d implements Iterator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f23513a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f23514b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Iterator f23515c;

        private d() {
            this.f23513a = -1;
        }

        private Iterator a() {
            if (this.f23515c == null) {
                this.f23515c = u.this.f23505c.entrySet().iterator();
            }
            return this.f23515c;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public Map.Entry next() {
            this.f23514b = true;
            int i10 = this.f23513a + 1;
            this.f23513a = i10;
            return i10 < u.this.f23504b.size() ? (Map.Entry) u.this.f23504b.get(this.f23513a) : (Map.Entry) a().next();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f23513a + 1 < u.this.f23504b.size() || a().hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.f23514b) {
                throw new IllegalStateException("remove() was called before next()");
            }
            this.f23514b = false;
            u.this.f();
            if (this.f23513a >= u.this.f23504b.size()) {
                a().remove();
                return;
            }
            u uVar = u.this;
            int i10 = this.f23513a;
            this.f23513a = i10 - 1;
            uVar.p(i10);
        }

        /* synthetic */ d(u uVar, a aVar) {
            this();
        }
    }

    private u(int i10) {
        this.f23503a = i10;
        this.f23504b = Collections.EMPTY_LIST;
        this.f23505c = Collections.EMPTY_MAP;
    }
}
