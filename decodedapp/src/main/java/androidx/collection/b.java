package androidx.collection;

import ed.q;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Set;
import rd.m;

/* JADX INFO: loaded from: classes.dex */
public final class b implements Collection, Set, sd.a, sd.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int[] f1365a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Object[] f1366b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f1367c;

    private final class a extends e {
        public a() {
            super(b.this.f());
        }

        @Override // androidx.collection.e
        protected Object c(int i10) {
            return b.this.l(i10);
        }

        @Override // androidx.collection.e
        protected void d(int i10) {
            b.this.g(i10);
        }
    }

    public b() {
        this(0, 1, null);
    }

    @Override // java.util.Collection, java.util.Set
    public boolean add(Object obj) {
        int i10;
        int iC;
        int iF = f();
        if (obj == null) {
            iC = d.d(this);
            i10 = 0;
        } else {
            int iHashCode = obj.hashCode();
            i10 = iHashCode;
            iC = d.c(this, obj, iHashCode);
        }
        if (iC >= 0) {
            return false;
        }
        int i11 = ~iC;
        if (iF >= d().length) {
            int i12 = 8;
            if (iF >= 8) {
                i12 = (iF >> 1) + iF;
            } else if (iF < 4) {
                i12 = 4;
            }
            int[] iArrD = d();
            Object[] objArrC = c();
            d.a(this, i12);
            if (iF != f()) {
                throw new ConcurrentModificationException();
            }
            if (!(d().length == 0)) {
                ed.j.l(iArrD, d(), 0, 0, iArrD.length, 6, null);
                ed.j.m(objArrC, c(), 0, 0, objArrC.length, 6, null);
            }
        }
        if (i11 < iF) {
            int i13 = i11 + 1;
            ed.j.h(d(), d(), i13, i11, iF);
            ed.j.j(c(), c(), i13, i11, iF);
        }
        if (iF != f() || i11 >= d().length) {
            throw new ConcurrentModificationException();
        }
        d()[i11] = i10;
        c()[i11] = obj;
        j(f() + 1);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean addAll(Collection collection) {
        m.e(collection, "elements");
        b(f() + collection.size());
        Iterator it = collection.iterator();
        boolean zAdd = false;
        while (it.hasNext()) {
            zAdd |= add(it.next());
        }
        return zAdd;
    }

    public final void b(int i10) {
        int iF = f();
        if (d().length < i10) {
            int[] iArrD = d();
            Object[] objArrC = c();
            d.a(this, i10);
            if (f() > 0) {
                ed.j.l(iArrD, d(), 0, 0, f(), 6, null);
                ed.j.m(objArrC, c(), 0, 0, f(), 6, null);
            }
        }
        if (f() != iF) {
            throw new ConcurrentModificationException();
        }
    }

    public final Object[] c() {
        return this.f1366b;
    }

    @Override // java.util.Collection, java.util.Set
    public void clear() {
        if (f() != 0) {
            i(r.a.f25263a);
            h(r.a.f25265c);
            j(0);
        }
        if (f() != 0) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean containsAll(Collection collection) {
        m.e(collection, "elements");
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public final int[] d() {
        return this.f1365a;
    }

    public int e() {
        return this.f1367c;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Set) || size() != ((Set) obj).size()) {
            return false;
        }
        try {
            int iF = f();
            for (int i10 = 0; i10 < iF; i10++) {
                if (!((Set) obj).contains(l(i10))) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    public final int f() {
        return this.f1367c;
    }

    public final Object g(int i10) {
        int i11;
        Object[] objArr;
        int iF = f();
        Object obj = c()[i10];
        if (iF <= 1) {
            clear();
            return obj;
        }
        int i12 = iF - 1;
        if (d().length <= 8 || f() >= d().length / 3) {
            if (i10 < i12) {
                int i13 = i10 + 1;
                ed.j.h(d(), d(), i10, i13, iF);
                ed.j.j(c(), c(), i10, i13, iF);
            }
            c()[i12] = null;
        } else {
            int iF2 = f() > 8 ? f() + (f() >> 1) : 8;
            int[] iArrD = d();
            Object[] objArrC = c();
            d.a(this, iF2);
            if (i10 > 0) {
                ed.j.l(iArrD, d(), 0, 0, i10, 6, null);
                objArr = objArrC;
                ed.j.m(objArr, c(), 0, 0, i10, 6, null);
                i11 = i10;
            } else {
                i11 = i10;
                objArr = objArrC;
            }
            if (i11 < i12) {
                int i14 = i11 + 1;
                ed.j.h(iArrD, d(), i11, i14, iF);
                ed.j.j(objArr, c(), i11, i14, iF);
            }
        }
        if (iF != f()) {
            throw new ConcurrentModificationException();
        }
        j(i12);
        return obj;
    }

    public final void h(Object[] objArr) {
        m.e(objArr, "<set-?>");
        this.f1366b = objArr;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        int[] iArrD = d();
        int iF = f();
        int i10 = 0;
        for (int i11 = 0; i11 < iF; i11++) {
            i10 += iArrD[i11];
        }
        return i10;
    }

    public final void i(int[] iArr) {
        m.e(iArr, "<set-?>");
        this.f1365a = iArr;
    }

    public final int indexOf(Object obj) {
        return obj == null ? d.d(this) : d.c(this, obj, obj.hashCode());
    }

    @Override // java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return f() <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        return new a();
    }

    public final void j(int i10) {
        this.f1367c = i10;
    }

    public final Object l(int i10) {
        return c()[i10];
    }

    @Override // java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf < 0) {
            return false;
        }
        g(iIndexOf);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean removeAll(Collection collection) {
        m.e(collection, "elements");
        Iterator it = collection.iterator();
        boolean zRemove = false;
        while (it.hasNext()) {
            zRemove |= remove(it.next());
        }
        return zRemove;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean retainAll(Collection collection) {
        m.e(collection, "elements");
        boolean z10 = false;
        for (int iF = f() - 1; -1 < iF; iF--) {
            if (!q.T(collection, c()[iF])) {
                g(iF);
                z10 = true;
            }
        }
        return z10;
    }

    @Override // java.util.Collection, java.util.Set
    public final /* bridge */ int size() {
        return e();
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray() {
        return ed.j.p(this.f1366b, 0, this.f1367c);
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(f() * 14);
        sb2.append('{');
        int iF = f();
        for (int i10 = 0; i10 < iF; i10++) {
            if (i10 > 0) {
                sb2.append(", ");
            }
            Object objL = l(i10);
            if (objL != this) {
                sb2.append(objL);
            } else {
                sb2.append("(this Set)");
            }
        }
        sb2.append('}');
        String string = sb2.toString();
        m.d(string, "StringBuilder(capacity).…builderAction).toString()");
        return string;
    }

    public b(int i10) {
        this.f1365a = r.a.f25263a;
        this.f1366b = r.a.f25265c;
        if (i10 > 0) {
            d.a(this, i10);
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] objArr) {
        m.e(objArr, "array");
        Object[] objArrA = c.a(objArr, this.f1367c);
        ed.j.j(this.f1366b, objArrA, 0, 0, this.f1367c);
        m.d(objArrA, "result");
        return objArrA;
    }

    public /* synthetic */ b(int i10, int i11, rd.h hVar) {
        this((i11 & 1) != 0 ? 0 : i10);
    }
}
