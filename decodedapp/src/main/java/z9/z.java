package z9;

import j$.util.Objects;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class z extends AbstractMap implements Serializable {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final Comparator f33072r = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Comparator f33073a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f33074b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    e f33075c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f33076d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    int f33077e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final e f33078f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private b f33079g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private c f33080h;

    class a implements Comparator {
        a() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(Comparable comparable, Comparable comparable2) {
            return comparable.compareTo(comparable2);
        }
    }

    class b extends AbstractSet {

        class a extends d {
            a() {
                super();
            }

            @Override // java.util.Iterator
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public Map.Entry next() {
                return a();
            }
        }

        b() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            z.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return (obj instanceof Map.Entry) && z.this.c((Map.Entry) obj) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return new a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            e eVarC;
            if (!(obj instanceof Map.Entry) || (eVarC = z.this.c((Map.Entry) obj)) == null) {
                return false;
            }
            z.this.f(eVarC, true);
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return z.this.f33076d;
        }
    }

    final class c extends AbstractSet {

        class a extends d {
            a() {
                super();
            }

            @Override // java.util.Iterator
            public Object next() {
                return a().f33094f;
            }
        }

        c() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            z.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return z.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return new a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            return z.this.g(obj) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return z.this.f33076d;
        }
    }

    private abstract class d implements Iterator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        e f33085a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        e f33086b = null;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f33087c;

        d() {
            this.f33085a = z.this.f33078f.f33092d;
            this.f33087c = z.this.f33077e;
        }

        final e a() {
            e eVar = this.f33085a;
            z zVar = z.this;
            if (eVar == zVar.f33078f) {
                throw new NoSuchElementException();
            }
            if (zVar.f33077e != this.f33087c) {
                throw new ConcurrentModificationException();
            }
            this.f33085a = eVar.f33092d;
            this.f33086b = eVar;
            return eVar;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f33085a != z.this.f33078f;
        }

        @Override // java.util.Iterator
        public final void remove() {
            e eVar = this.f33086b;
            if (eVar == null) {
                throw new IllegalStateException();
            }
            z.this.f(eVar, true);
            this.f33086b = null;
            this.f33087c = z.this.f33077e;
        }
    }

    public z() {
        this(f33072r, true);
    }

    private static boolean a(Object obj, Object obj2) {
        return Objects.equals(obj, obj2);
    }

    private void e(e eVar, boolean z10) {
        while (eVar != null) {
            e eVar2 = eVar.f33090b;
            e eVar3 = eVar.f33091c;
            int i10 = eVar2 != null ? eVar2.f33097r : 0;
            int i11 = eVar3 != null ? eVar3.f33097r : 0;
            int i12 = i10 - i11;
            if (i12 == -2) {
                e eVar4 = eVar3.f33090b;
                e eVar5 = eVar3.f33091c;
                int i13 = (eVar4 != null ? eVar4.f33097r : 0) - (eVar5 != null ? eVar5.f33097r : 0);
                if (i13 == -1 || (i13 == 0 && !z10)) {
                    i(eVar);
                } else {
                    j(eVar3);
                    i(eVar);
                }
                if (z10) {
                    return;
                }
            } else if (i12 == 2) {
                e eVar6 = eVar2.f33090b;
                e eVar7 = eVar2.f33091c;
                int i14 = (eVar6 != null ? eVar6.f33097r : 0) - (eVar7 != null ? eVar7.f33097r : 0);
                if (i14 == 1 || (i14 == 0 && !z10)) {
                    j(eVar);
                } else {
                    i(eVar2);
                    j(eVar);
                }
                if (z10) {
                    return;
                }
            } else if (i12 == 0) {
                eVar.f33097r = i10 + 1;
                if (z10) {
                    return;
                }
            } else {
                eVar.f33097r = Math.max(i10, i11) + 1;
                if (!z10) {
                    return;
                }
            }
            eVar = eVar.f33089a;
        }
    }

    private void h(e eVar, e eVar2) {
        e eVar3 = eVar.f33089a;
        eVar.f33089a = null;
        if (eVar2 != null) {
            eVar2.f33089a = eVar3;
        }
        if (eVar3 == null) {
            this.f33075c = eVar2;
        } else if (eVar3.f33090b == eVar) {
            eVar3.f33090b = eVar2;
        } else {
            eVar3.f33091c = eVar2;
        }
    }

    private void i(e eVar) {
        e eVar2 = eVar.f33090b;
        e eVar3 = eVar.f33091c;
        e eVar4 = eVar3.f33090b;
        e eVar5 = eVar3.f33091c;
        eVar.f33091c = eVar4;
        if (eVar4 != null) {
            eVar4.f33089a = eVar;
        }
        h(eVar, eVar3);
        eVar3.f33090b = eVar;
        eVar.f33089a = eVar3;
        int iMax = Math.max(eVar2 != null ? eVar2.f33097r : 0, eVar4 != null ? eVar4.f33097r : 0) + 1;
        eVar.f33097r = iMax;
        eVar3.f33097r = Math.max(iMax, eVar5 != null ? eVar5.f33097r : 0) + 1;
    }

    private void j(e eVar) {
        e eVar2 = eVar.f33090b;
        e eVar3 = eVar.f33091c;
        e eVar4 = eVar2.f33090b;
        e eVar5 = eVar2.f33091c;
        eVar.f33090b = eVar5;
        if (eVar5 != null) {
            eVar5.f33089a = eVar;
        }
        h(eVar, eVar2);
        eVar2.f33091c = eVar;
        eVar.f33089a = eVar2;
        int iMax = Math.max(eVar3 != null ? eVar3.f33097r : 0, eVar5 != null ? eVar5.f33097r : 0) + 1;
        eVar.f33097r = iMax;
        eVar2.f33097r = Math.max(iMax, eVar4 != null ? eVar4.f33097r : 0) + 1;
    }

    e b(Object obj, boolean z10) {
        int iCompareTo;
        e eVar;
        Comparator comparator = this.f33073a;
        e eVar2 = this.f33075c;
        if (eVar2 != null) {
            Comparable comparable = comparator == f33072r ? (Comparable) obj : null;
            while (true) {
                iCompareTo = comparable != null ? comparable.compareTo(eVar2.f33094f) : comparator.compare(obj, eVar2.f33094f);
                if (iCompareTo == 0) {
                    return eVar2;
                }
                e eVar3 = iCompareTo < 0 ? eVar2.f33090b : eVar2.f33091c;
                if (eVar3 == null) {
                    break;
                }
                eVar2 = eVar3;
            }
        } else {
            iCompareTo = 0;
        }
        e eVar4 = eVar2;
        if (!z10) {
            return null;
        }
        e eVar5 = this.f33078f;
        if (eVar4 != null) {
            eVar = new e(this.f33074b, eVar4, obj, eVar5, eVar5.f33093e);
            if (iCompareTo < 0) {
                eVar4.f33090b = eVar;
            } else {
                eVar4.f33091c = eVar;
            }
            e(eVar4, true);
        } else {
            if (comparator == f33072r && !(obj instanceof Comparable)) {
                throw new ClassCastException(obj.getClass().getName() + " is not Comparable");
            }
            eVar = new e(this.f33074b, eVar4, obj, eVar5, eVar5.f33093e);
            this.f33075c = eVar;
        }
        this.f33076d++;
        this.f33077e++;
        return eVar;
    }

    e c(Map.Entry entry) {
        e eVarD = d(entry.getKey());
        if (eVarD == null || !a(eVarD.f33096h, entry.getValue())) {
            return null;
        }
        return eVarD;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        this.f33075c = null;
        this.f33076d = 0;
        this.f33077e++;
        e eVar = this.f33078f;
        eVar.f33093e = eVar;
        eVar.f33092d = eVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        return d(obj) != null;
    }

    e d(Object obj) {
        if (obj != null) {
            try {
                return b(obj, false);
            } catch (ClassCastException unused) {
            }
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set entrySet() {
        b bVar = this.f33079g;
        if (bVar != null) {
            return bVar;
        }
        b bVar2 = new b();
        this.f33079g = bVar2;
        return bVar2;
    }

    void f(e eVar, boolean z10) {
        int i10;
        if (z10) {
            e eVar2 = eVar.f33093e;
            eVar2.f33092d = eVar.f33092d;
            eVar.f33092d.f33093e = eVar2;
        }
        e eVar3 = eVar.f33090b;
        e eVar4 = eVar.f33091c;
        e eVar5 = eVar.f33089a;
        int i11 = 0;
        if (eVar3 == null || eVar4 == null) {
            if (eVar3 != null) {
                h(eVar, eVar3);
                eVar.f33090b = null;
            } else if (eVar4 != null) {
                h(eVar, eVar4);
                eVar.f33091c = null;
            } else {
                h(eVar, null);
            }
            e(eVar5, false);
            this.f33076d--;
            this.f33077e++;
            return;
        }
        e eVarB = eVar3.f33097r > eVar4.f33097r ? eVar3.b() : eVar4.a();
        f(eVarB, false);
        e eVar6 = eVar.f33090b;
        if (eVar6 != null) {
            i10 = eVar6.f33097r;
            eVarB.f33090b = eVar6;
            eVar6.f33089a = eVarB;
            eVar.f33090b = null;
        } else {
            i10 = 0;
        }
        e eVar7 = eVar.f33091c;
        if (eVar7 != null) {
            i11 = eVar7.f33097r;
            eVarB.f33091c = eVar7;
            eVar7.f33089a = eVarB;
            eVar.f33091c = null;
        }
        eVarB.f33097r = Math.max(i10, i11) + 1;
        h(eVar, eVarB);
    }

    e g(Object obj) {
        e eVarD = d(obj);
        if (eVarD != null) {
            f(eVarD, true);
        }
        return eVarD;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object get(Object obj) {
        e eVarD = d(obj);
        if (eVarD != null) {
            return eVarD.f33096h;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set keySet() {
        c cVar = this.f33080h;
        if (cVar != null) {
            return cVar;
        }
        c cVar2 = new c();
        this.f33080h = cVar2;
        return cVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object put(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException("key == null");
        }
        if (obj2 == null && !this.f33074b) {
            throw new NullPointerException("value == null");
        }
        e eVarB = b(obj, true);
        Object obj3 = eVarB.f33096h;
        eVarB.f33096h = obj2;
        return obj3;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object remove(Object obj) {
        e eVarG = g(obj);
        if (eVarG != null) {
            return eVarG.f33096h;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.f33076d;
    }

    public z(boolean z10) {
        this(f33072r, z10);
    }

    public z(Comparator comparator, boolean z10) {
        this.f33076d = 0;
        this.f33077e = 0;
        this.f33073a = comparator == null ? f33072r : comparator;
        this.f33074b = z10;
        this.f33078f = new e(z10);
    }

    static final class e implements Map.Entry {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        e f33089a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        e f33090b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        e f33091c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        e f33092d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        e f33093e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final Object f33094f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final boolean f33095g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f33096h;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f33097r;

        e(boolean z10) {
            this.f33094f = null;
            this.f33095g = z10;
            this.f33093e = this;
            this.f33092d = this;
        }

        public e a() {
            e eVar = this;
            for (e eVar2 = this.f33090b; eVar2 != null; eVar2 = eVar2.f33090b) {
                eVar = eVar2;
            }
            return eVar;
        }

        public e b() {
            e eVar = this;
            for (e eVar2 = this.f33091c; eVar2 != null; eVar2 = eVar2.f33091c) {
                eVar = eVar2;
            }
            return eVar;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                Object obj2 = this.f33094f;
                if (obj2 != null ? obj2.equals(entry.getKey()) : entry.getKey() == null) {
                    Object obj3 = this.f33096h;
                    if (obj3 == null) {
                        if (entry.getValue() == null) {
                            return true;
                        }
                    } else if (obj3.equals(entry.getValue())) {
                        return true;
                    }
                }
            }
            return false;
        }

        @Override // java.util.Map.Entry
        public Object getKey() {
            return this.f33094f;
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            return this.f33096h;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            Object obj = this.f33094f;
            int iHashCode = obj == null ? 0 : obj.hashCode();
            Object obj2 = this.f33096h;
            return iHashCode ^ (obj2 != null ? obj2.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            if (obj == null && !this.f33095g) {
                throw new NullPointerException("value == null");
            }
            Object obj2 = this.f33096h;
            this.f33096h = obj;
            return obj2;
        }

        public String toString() {
            return this.f33094f + "=" + this.f33096h;
        }

        e(boolean z10, e eVar, Object obj, e eVar2, e eVar3) {
            this.f33089a = eVar;
            this.f33094f = obj;
            this.f33095g = z10;
            this.f33097r = 1;
            this.f33092d = eVar2;
            this.f33093e = eVar3;
            eVar3.f33092d = this;
            eVar2.f33093e = this;
        }
    }
}
