package fd;

import ed.j;
import ed.q;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import rd.m;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends ed.f implements List, RandomAccess, Serializable, sd.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final C0179b f12932d = new C0179b(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final b f12933e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Object[] f12934a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f12935b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f12936c;

    public static final class a extends ed.f implements List, RandomAccess, Serializable, sd.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Object[] f12937a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f12938b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f12939c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final a f12940d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final b f12941e;

        /* JADX INFO: renamed from: fd.b$a$a, reason: collision with other inner class name */
        private static final class C0178a implements ListIterator, sd.a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final a f12942a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private int f12943b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private int f12944c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private int f12945d;

            public C0178a(a aVar, int i10) {
                m.e(aVar, "list");
                this.f12942a = aVar;
                this.f12943b = i10;
                this.f12944c = -1;
                this.f12945d = ((AbstractList) aVar).modCount;
            }

            private final void c() {
                if (((AbstractList) this.f12942a.f12941e).modCount != this.f12945d) {
                    throw new ConcurrentModificationException();
                }
            }

            @Override // java.util.ListIterator
            public void add(Object obj) {
                c();
                a aVar = this.f12942a;
                int i10 = this.f12943b;
                this.f12943b = i10 + 1;
                aVar.add(i10, obj);
                this.f12944c = -1;
                this.f12945d = ((AbstractList) this.f12942a).modCount;
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public boolean hasNext() {
                return this.f12943b < this.f12942a.f12939c;
            }

            @Override // java.util.ListIterator
            public boolean hasPrevious() {
                return this.f12943b > 0;
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public Object next() {
                c();
                if (this.f12943b >= this.f12942a.f12939c) {
                    throw new NoSuchElementException();
                }
                int i10 = this.f12943b;
                this.f12943b = i10 + 1;
                this.f12944c = i10;
                return this.f12942a.f12937a[this.f12942a.f12938b + this.f12944c];
            }

            @Override // java.util.ListIterator
            public int nextIndex() {
                return this.f12943b;
            }

            @Override // java.util.ListIterator
            public Object previous() {
                c();
                int i10 = this.f12943b;
                if (i10 <= 0) {
                    throw new NoSuchElementException();
                }
                int i11 = i10 - 1;
                this.f12943b = i11;
                this.f12944c = i11;
                return this.f12942a.f12937a[this.f12942a.f12938b + this.f12944c];
            }

            @Override // java.util.ListIterator
            public int previousIndex() {
                return this.f12943b - 1;
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public void remove() {
                c();
                int i10 = this.f12944c;
                if (i10 == -1) {
                    throw new IllegalStateException("Call next() or previous() before removing element from the iterator.");
                }
                this.f12942a.c(i10);
                this.f12943b = this.f12944c;
                this.f12944c = -1;
                this.f12945d = ((AbstractList) this.f12942a).modCount;
            }

            @Override // java.util.ListIterator
            public void set(Object obj) {
                c();
                int i10 = this.f12944c;
                if (i10 == -1) {
                    throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.");
                }
                this.f12942a.set(i10, obj);
            }
        }

        public a(Object[] objArr, int i10, int i11, a aVar, b bVar) {
            m.e(objArr, "backing");
            m.e(bVar, "root");
            this.f12937a = objArr;
            this.f12938b = i10;
            this.f12939c = i11;
            this.f12940d = aVar;
            this.f12941e = bVar;
            ((AbstractList) this).modCount = ((AbstractList) bVar).modCount;
        }

        private final int A(int i10, int i11, Collection collection, boolean z10) {
            a aVar = this.f12940d;
            int iA = aVar != null ? aVar.A(i10, i11, collection, z10) : this.f12941e.O(i10, i11, collection, z10);
            if (iA > 0) {
                s();
            }
            this.f12939c -= iA;
            return iA;
        }

        private final void i(int i10, Collection collection, int i11) {
            s();
            a aVar = this.f12940d;
            if (aVar != null) {
                aVar.i(i10, collection, i11);
            } else {
                this.f12941e.p(i10, collection, i11);
            }
            this.f12937a = this.f12941e.f12934a;
            this.f12939c += i11;
        }

        private final void j(int i10, Object obj) {
            s();
            a aVar = this.f12940d;
            if (aVar != null) {
                aVar.j(i10, obj);
            } else {
                this.f12941e.q(i10, obj);
            }
            this.f12937a = this.f12941e.f12934a;
            this.f12939c++;
        }

        private final void l() {
            if (((AbstractList) this.f12941e).modCount != ((AbstractList) this).modCount) {
                throw new ConcurrentModificationException();
            }
        }

        private final void o() {
            if (q()) {
                throw new UnsupportedOperationException();
            }
        }

        private final boolean p(List list) {
            return fd.c.h(this.f12937a, this.f12938b, this.f12939c, list);
        }

        private final boolean q() {
            return this.f12941e.f12936c;
        }

        private final void s() {
            ((AbstractList) this).modCount++;
        }

        private final Object t(int i10) {
            s();
            a aVar = this.f12940d;
            this.f12939c--;
            return aVar != null ? aVar.t(i10) : this.f12941e.L(i10);
        }

        private final void z(int i10, int i11) {
            if (i11 > 0) {
                s();
            }
            a aVar = this.f12940d;
            if (aVar != null) {
                aVar.z(i10, i11);
            } else {
                this.f12941e.N(i10, i11);
            }
            this.f12939c -= i11;
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean add(Object obj) {
            o();
            l();
            j(this.f12938b + this.f12939c, obj);
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean addAll(Collection collection) {
            m.e(collection, "elements");
            o();
            l();
            int size = collection.size();
            i(this.f12938b + this.f12939c, collection, size);
            return size > 0;
        }

        @Override // ed.f
        public int b() {
            l();
            return this.f12939c;
        }

        @Override // ed.f
        public Object c(int i10) {
            o();
            l();
            ed.d.f11750a.b(i10, this.f12939c);
            return t(this.f12938b + i10);
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public void clear() {
            o();
            l();
            z(this.f12938b, this.f12939c);
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public boolean equals(Object obj) {
            l();
            if (obj != this) {
                return (obj instanceof List) && p((List) obj);
            }
            return true;
        }

        @Override // java.util.AbstractList, java.util.List
        public Object get(int i10) {
            l();
            ed.d.f11750a.b(i10, this.f12939c);
            return this.f12937a[this.f12938b + i10];
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public int hashCode() {
            l();
            return fd.c.i(this.f12937a, this.f12938b, this.f12939c);
        }

        @Override // java.util.AbstractList, java.util.List
        public int indexOf(Object obj) {
            l();
            for (int i10 = 0; i10 < this.f12939c; i10++) {
                if (m.a(this.f12937a[this.f12938b + i10], obj)) {
                    return i10;
                }
            }
            return -1;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean isEmpty() {
            l();
            return this.f12939c == 0;
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
        public Iterator iterator() {
            return listIterator(0);
        }

        @Override // java.util.AbstractList, java.util.List
        public int lastIndexOf(Object obj) {
            l();
            for (int i10 = this.f12939c - 1; i10 >= 0; i10--) {
                if (m.a(this.f12937a[this.f12938b + i10], obj)) {
                    return i10;
                }
            }
            return -1;
        }

        @Override // java.util.AbstractList, java.util.List
        public ListIterator listIterator() {
            return listIterator(0);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean remove(Object obj) {
            o();
            l();
            int iIndexOf = indexOf(obj);
            if (iIndexOf >= 0) {
                c(iIndexOf);
            }
            return iIndexOf >= 0;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean removeAll(Collection collection) {
            m.e(collection, "elements");
            o();
            l();
            return A(this.f12938b, this.f12939c, collection, false) > 0;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean retainAll(Collection collection) {
            m.e(collection, "elements");
            o();
            l();
            return A(this.f12938b, this.f12939c, collection, true) > 0;
        }

        @Override // java.util.AbstractList, java.util.List
        public Object set(int i10, Object obj) {
            o();
            l();
            ed.d.f11750a.b(i10, this.f12939c);
            Object[] objArr = this.f12937a;
            int i11 = this.f12938b;
            Object obj2 = objArr[i11 + i10];
            objArr[i11 + i10] = obj;
            return obj2;
        }

        @Override // java.util.AbstractList, java.util.List
        public List subList(int i10, int i11) {
            ed.d.f11750a.d(i10, i11, this.f12939c);
            return new a(this.f12937a, this.f12938b + i10, i11 - i10, this, this.f12941e);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public Object[] toArray(Object[] objArr) {
            m.e(objArr, "array");
            l();
            int length = objArr.length;
            int i10 = this.f12939c;
            if (length >= i10) {
                Object[] objArr2 = this.f12937a;
                int i11 = this.f12938b;
                j.j(objArr2, objArr, 0, i11, i10 + i11);
                return q.f(this.f12939c, objArr);
            }
            Object[] objArr3 = this.f12937a;
            int i12 = this.f12938b;
            Object[] objArrCopyOfRange = Arrays.copyOfRange(objArr3, i12, i10 + i12, objArr.getClass());
            m.d(objArrCopyOfRange, "copyOfRange(...)");
            return objArrCopyOfRange;
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            l();
            return fd.c.j(this.f12937a, this.f12938b, this.f12939c, this);
        }

        @Override // java.util.AbstractList, java.util.List
        public ListIterator listIterator(int i10) {
            l();
            ed.d.f11750a.c(i10, this.f12939c);
            return new C0178a(this, i10);
        }

        @Override // java.util.AbstractList, java.util.List
        public void add(int i10, Object obj) {
            o();
            l();
            ed.d.f11750a.c(i10, this.f12939c);
            j(this.f12938b + i10, obj);
        }

        @Override // java.util.AbstractList, java.util.List
        public boolean addAll(int i10, Collection collection) {
            m.e(collection, "elements");
            o();
            l();
            ed.d.f11750a.c(i10, this.f12939c);
            int size = collection.size();
            i(this.f12938b + i10, collection, size);
            return size > 0;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public Object[] toArray() {
            l();
            Object[] objArr = this.f12937a;
            int i10 = this.f12938b;
            return j.p(objArr, i10, this.f12939c + i10);
        }
    }

    /* JADX INFO: renamed from: fd.b$b, reason: collision with other inner class name */
    private static final class C0179b {
        public /* synthetic */ C0179b(rd.h hVar) {
            this();
        }

        private C0179b() {
        }
    }

    private static final class c implements ListIterator, sd.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final b f12946a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f12947b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f12948c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f12949d;

        public c(b bVar, int i10) {
            m.e(bVar, "list");
            this.f12946a = bVar;
            this.f12947b = i10;
            this.f12948c = -1;
            this.f12949d = ((AbstractList) bVar).modCount;
        }

        private final void c() {
            if (((AbstractList) this.f12946a).modCount != this.f12949d) {
                throw new ConcurrentModificationException();
            }
        }

        @Override // java.util.ListIterator
        public void add(Object obj) {
            c();
            b bVar = this.f12946a;
            int i10 = this.f12947b;
            this.f12947b = i10 + 1;
            bVar.add(i10, obj);
            this.f12948c = -1;
            this.f12949d = ((AbstractList) this.f12946a).modCount;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.f12947b < this.f12946a.f12935b;
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.f12947b > 0;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public Object next() {
            c();
            if (this.f12947b >= this.f12946a.f12935b) {
                throw new NoSuchElementException();
            }
            int i10 = this.f12947b;
            this.f12947b = i10 + 1;
            this.f12948c = i10;
            return this.f12946a.f12934a[this.f12948c];
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.f12947b;
        }

        @Override // java.util.ListIterator
        public Object previous() {
            c();
            int i10 = this.f12947b;
            if (i10 <= 0) {
                throw new NoSuchElementException();
            }
            int i11 = i10 - 1;
            this.f12947b = i11;
            this.f12948c = i11;
            return this.f12946a.f12934a[this.f12948c];
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.f12947b - 1;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            c();
            int i10 = this.f12948c;
            if (i10 == -1) {
                throw new IllegalStateException("Call next() or previous() before removing element from the iterator.");
            }
            this.f12946a.c(i10);
            this.f12947b = this.f12948c;
            this.f12948c = -1;
            this.f12949d = ((AbstractList) this.f12946a).modCount;
        }

        @Override // java.util.ListIterator
        public void set(Object obj) {
            c();
            int i10 = this.f12948c;
            if (i10 == -1) {
                throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.");
            }
            this.f12946a.set(i10, obj);
        }
    }

    static {
        b bVar = new b(0);
        bVar.f12936c = true;
        f12933e = bVar;
    }

    public b(int i10) {
        this.f12934a = fd.c.d(i10);
    }

    private final void A(int i10) {
        if (i10 < 0) {
            throw new OutOfMemoryError();
        }
        Object[] objArr = this.f12934a;
        if (i10 > objArr.length) {
            this.f12934a = fd.c.e(this.f12934a, ed.d.f11750a.e(objArr.length, i10));
        }
    }

    private final void C(int i10) {
        A(this.f12935b + i10);
    }

    private final void D(int i10, int i11) {
        C(i11);
        Object[] objArr = this.f12934a;
        j.j(objArr, objArr, i10 + i11, i10, this.f12935b);
        this.f12935b += i11;
    }

    private final void K() {
        ((AbstractList) this).modCount++;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object L(int i10) {
        K();
        Object[] objArr = this.f12934a;
        Object obj = objArr[i10];
        j.j(objArr, objArr, i10, i10 + 1, this.f12935b);
        fd.c.f(this.f12934a, this.f12935b - 1);
        this.f12935b--;
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void N(int i10, int i11) {
        if (i11 > 0) {
            K();
        }
        Object[] objArr = this.f12934a;
        j.j(objArr, objArr, i10, i10 + i11, this.f12935b);
        Object[] objArr2 = this.f12934a;
        int i12 = this.f12935b;
        fd.c.g(objArr2, i12 - i11, i12);
        this.f12935b -= i11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int O(int i10, int i11, Collection collection, boolean z10) {
        int i12 = 0;
        int i13 = 0;
        while (i12 < i11) {
            int i14 = i10 + i12;
            if (collection.contains(this.f12934a[i14]) == z10) {
                Object[] objArr = this.f12934a;
                i12++;
                objArr[i13 + i10] = objArr[i14];
                i13++;
            } else {
                i12++;
            }
        }
        int i15 = i11 - i13;
        Object[] objArr2 = this.f12934a;
        j.j(objArr2, objArr2, i10 + i13, i11 + i10, this.f12935b);
        Object[] objArr3 = this.f12934a;
        int i16 = this.f12935b;
        fd.c.g(objArr3, i16 - i15, i16);
        if (i15 > 0) {
            K();
        }
        this.f12935b -= i15;
        return i15;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void p(int i10, Collection collection, int i11) {
        K();
        D(i10, i11);
        Iterator it = collection.iterator();
        for (int i12 = 0; i12 < i11; i12++) {
            this.f12934a[i10 + i12] = it.next();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void q(int i10, Object obj) {
        K();
        D(i10, 1);
        this.f12934a[i10] = obj;
    }

    private final void t() {
        if (this.f12936c) {
            throw new UnsupportedOperationException();
        }
    }

    private final boolean z(List list) {
        return fd.c.h(this.f12934a, 0, this.f12935b, list);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(Object obj) {
        t();
        q(this.f12935b, obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection collection) {
        m.e(collection, "elements");
        t();
        int size = collection.size();
        p(this.f12935b, collection, size);
        return size > 0;
    }

    @Override // ed.f
    public int b() {
        return this.f12935b;
    }

    @Override // ed.f
    public Object c(int i10) {
        t();
        ed.d.f11750a.b(i10, this.f12935b);
        return L(i10);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        t();
        N(0, this.f12935b);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof List) && z((List) obj);
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public Object get(int i10) {
        ed.d.f11750a.b(i10, this.f12935b);
        return this.f12934a[i10];
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        return fd.c.i(this.f12934a, 0, this.f12935b);
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        for (int i10 = 0; i10 < this.f12935b; i10++) {
            if (m.a(this.f12934a[i10], obj)) {
                return i10;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        return this.f12935b == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.List
    public int lastIndexOf(Object obj) {
        for (int i10 = this.f12935b - 1; i10 >= 0; i10--) {
            if (m.a(this.f12934a[i10], obj)) {
                return i10;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        t();
        int iIndexOf = indexOf(obj);
        if (iIndexOf >= 0) {
            c(iIndexOf);
        }
        return iIndexOf >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(Collection collection) {
        m.e(collection, "elements");
        t();
        return O(0, this.f12935b, collection, false) > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean retainAll(Collection collection) {
        m.e(collection, "elements");
        t();
        return O(0, this.f12935b, collection, true) > 0;
    }

    public final List s() {
        t();
        this.f12936c = true;
        return this.f12935b > 0 ? this : f12933e;
    }

    @Override // java.util.AbstractList, java.util.List
    public Object set(int i10, Object obj) {
        t();
        ed.d.f11750a.b(i10, this.f12935b);
        Object[] objArr = this.f12934a;
        Object obj2 = objArr[i10];
        objArr[i10] = obj;
        return obj2;
    }

    @Override // java.util.AbstractList, java.util.List
    public List subList(int i10, int i11) {
        ed.d.f11750a.d(i10, i11, this.f12935b);
        return new a(this.f12934a, i10, i11 - i10, null, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public Object[] toArray(Object[] objArr) {
        m.e(objArr, "array");
        int length = objArr.length;
        int i10 = this.f12935b;
        if (length >= i10) {
            j.j(this.f12934a, objArr, 0, 0, i10);
            return q.f(this.f12935b, objArr);
        }
        Object[] objArrCopyOfRange = Arrays.copyOfRange(this.f12934a, 0, i10, objArr.getClass());
        m.d(objArrCopyOfRange, "copyOfRange(...)");
        return objArrCopyOfRange;
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        return fd.c.j(this.f12934a, 0, this.f12935b, this);
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator listIterator(int i10) {
        ed.d.f11750a.c(i10, this.f12935b);
        return new c(this, i10);
    }

    public /* synthetic */ b(int i10, int i11, rd.h hVar) {
        this((i11 & 1) != 0 ? 10 : i10);
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i10, Object obj) {
        t();
        ed.d.f11750a.c(i10, this.f12935b);
        q(i10, obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int i10, Collection collection) {
        m.e(collection, "elements");
        t();
        ed.d.f11750a.c(i10, this.f12935b);
        int size = collection.size();
        p(i10, collection, size);
        return size > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public Object[] toArray() {
        return j.p(this.f12934a, 0, this.f12935b);
    }
}
