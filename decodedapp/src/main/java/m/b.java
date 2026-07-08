package m;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class b implements Iterable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    c f20713a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private c f20714b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final WeakHashMap f20715c = new WeakHashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f20716d = 0;

    static class a extends e {
        a(c cVar, c cVar2) {
            super(cVar, cVar2);
        }

        @Override // m.b.e
        c c(c cVar) {
            return cVar.f20720d;
        }

        @Override // m.b.e
        c d(c cVar) {
            return cVar.f20719c;
        }
    }

    /* JADX INFO: renamed from: m.b$b, reason: collision with other inner class name */
    private static class C0279b extends e {
        C0279b(c cVar, c cVar2) {
            super(cVar, cVar2);
        }

        @Override // m.b.e
        c c(c cVar) {
            return cVar.f20719c;
        }

        @Override // m.b.e
        c d(c cVar) {
            return cVar.f20720d;
        }
    }

    static class c implements Map.Entry {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Object f20717a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Object f20718b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        c f20719c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        c f20720d;

        c(Object obj, Object obj2) {
            this.f20717a = obj;
            this.f20718b = obj2;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f20717a.equals(cVar.f20717a) && this.f20718b.equals(cVar.f20718b);
        }

        @Override // java.util.Map.Entry
        public Object getKey() {
            return this.f20717a;
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            return this.f20718b;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            return this.f20717a.hashCode() ^ this.f20718b.hashCode();
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            throw new UnsupportedOperationException("An entry modification is not supported");
        }

        public String toString() {
            return this.f20717a + "=" + this.f20718b;
        }
    }

    public class d extends f implements Iterator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private c f20721a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f20722b = true;

        d() {
        }

        @Override // m.b.f
        void a(c cVar) {
            c cVar2 = this.f20721a;
            if (cVar == cVar2) {
                c cVar3 = cVar2.f20720d;
                this.f20721a = cVar3;
                this.f20722b = cVar3 == null;
            }
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public Map.Entry next() {
            if (this.f20722b) {
                this.f20722b = false;
                this.f20721a = b.this.f20713a;
            } else {
                c cVar = this.f20721a;
                this.f20721a = cVar != null ? cVar.f20719c : null;
            }
            return this.f20721a;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f20722b) {
                return b.this.f20713a != null;
            }
            c cVar = this.f20721a;
            return (cVar == null || cVar.f20719c == null) ? false : true;
        }
    }

    private static abstract class e extends f implements Iterator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        c f20724a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        c f20725b;

        e(c cVar, c cVar2) {
            this.f20724a = cVar2;
            this.f20725b = cVar;
        }

        private c f() {
            c cVar = this.f20725b;
            c cVar2 = this.f20724a;
            if (cVar == cVar2 || cVar2 == null) {
                return null;
            }
            return d(cVar);
        }

        @Override // m.b.f
        public void a(c cVar) {
            if (this.f20724a == cVar && cVar == this.f20725b) {
                this.f20725b = null;
                this.f20724a = null;
            }
            c cVar2 = this.f20724a;
            if (cVar2 == cVar) {
                this.f20724a = c(cVar2);
            }
            if (this.f20725b == cVar) {
                this.f20725b = f();
            }
        }

        abstract c c(c cVar);

        abstract c d(c cVar);

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Map.Entry next() {
            c cVar = this.f20725b;
            this.f20725b = f();
            return cVar;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f20725b != null;
        }
    }

    public static abstract class f {
        abstract void a(c cVar);
    }

    public Map.Entry b() {
        return this.f20713a;
    }

    protected c c(Object obj) {
        c cVar = this.f20713a;
        while (cVar != null && !cVar.f20717a.equals(obj)) {
            cVar = cVar.f20719c;
        }
        return cVar;
    }

    public d d() {
        d dVar = new d();
        this.f20715c.put(dVar, Boolean.FALSE);
        return dVar;
    }

    public Iterator descendingIterator() {
        C0279b c0279b = new C0279b(this.f20714b, this.f20713a);
        this.f20715c.put(c0279b, Boolean.FALSE);
        return c0279b;
    }

    public Map.Entry e() {
        return this.f20714b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (size() != bVar.size()) {
            return false;
        }
        Iterator it = iterator();
        Iterator it2 = bVar.iterator();
        while (it.hasNext() && it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object next = it2.next();
            if ((entry == null && next != null) || (entry != null && !entry.equals(next))) {
                return false;
            }
        }
        return (it.hasNext() || it2.hasNext()) ? false : true;
    }

    c f(Object obj, Object obj2) {
        c cVar = new c(obj, obj2);
        this.f20716d++;
        c cVar2 = this.f20714b;
        if (cVar2 == null) {
            this.f20713a = cVar;
            this.f20714b = cVar;
            return cVar;
        }
        cVar2.f20719c = cVar;
        cVar.f20720d = cVar2;
        this.f20714b = cVar;
        return cVar;
    }

    public Object g(Object obj, Object obj2) {
        c cVarC = c(obj);
        if (cVarC != null) {
            return cVarC.f20718b;
        }
        f(obj, obj2);
        return null;
    }

    public Object h(Object obj) {
        c cVarC = c(obj);
        if (cVarC == null) {
            return null;
        }
        this.f20716d--;
        if (!this.f20715c.isEmpty()) {
            Iterator it = this.f20715c.keySet().iterator();
            while (it.hasNext()) {
                ((f) it.next()).a(cVarC);
            }
        }
        c cVar = cVarC.f20720d;
        if (cVar != null) {
            cVar.f20719c = cVarC.f20719c;
        } else {
            this.f20713a = cVarC.f20719c;
        }
        c cVar2 = cVarC.f20719c;
        if (cVar2 != null) {
            cVar2.f20720d = cVar;
        } else {
            this.f20714b = cVar;
        }
        cVarC.f20719c = null;
        cVarC.f20720d = null;
        return cVarC.f20718b;
    }

    public int hashCode() {
        Iterator it = iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            iHashCode += ((Map.Entry) it.next()).hashCode();
        }
        return iHashCode;
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        a aVar = new a(this.f20713a, this.f20714b);
        this.f20715c.put(aVar, Boolean.FALSE);
        return aVar;
    }

    public int size() {
        return this.f20716d;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("[");
        Iterator it = iterator();
        while (it.hasNext()) {
            sb2.append(((Map.Entry) it.next()).toString());
            if (it.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append("]");
        return sb2.toString();
    }
}
