package ed;

import java.util.AbstractList;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
public final class i extends f {

    /* JADX INFO: renamed from: d */
    public static final a f11765d = new a(null);

    /* JADX INFO: renamed from: e */
    private static final Object[] f11766e = new Object[0];

    /* JADX INFO: renamed from: a */
    private int f11767a;

    /* JADX INFO: renamed from: b */
    private Object[] f11768b = f11766e;

    /* JADX INFO: renamed from: c */
    private int f11769c;

    public static final class a {
        public /* synthetic */ a(rd.h hVar) {
            this();
        }

        private a() {
        }
    }

    private final void d(int i10, Collection collection) {
        Iterator it = collection.iterator();
        int length = this.f11768b.length;
        while (i10 < length && it.hasNext()) {
            this.f11768b[i10] = it.next();
            i10++;
        }
        int i11 = this.f11767a;
        for (int i12 = 0; i12 < i11 && it.hasNext(); i12++) {
            this.f11768b[i12] = it.next();
        }
        this.f11769c = size() + collection.size();
    }

    private final void e(int i10) {
        Object[] objArr = new Object[i10];
        Object[] objArr2 = this.f11768b;
        m.j(objArr2, objArr, 0, this.f11767a, objArr2.length);
        Object[] objArr3 = this.f11768b;
        int length = objArr3.length;
        int i11 = this.f11767a;
        m.j(objArr3, objArr, length - i11, 0, i11);
        this.f11767a = 0;
        this.f11768b = objArr;
    }

    private final int f(int i10) {
        return i10 == 0 ? o.H(this.f11768b) : i10 - 1;
    }

    private final void g(int i10) {
        if (i10 < 0) {
            throw new IllegalStateException("Deque is too big.");
        }
        Object[] objArr = this.f11768b;
        if (i10 <= objArr.length) {
            return;
        }
        if (objArr == f11766e) {
            this.f11768b = new Object[xd.d.b(i10, 10)];
        } else {
            e(d.f11750a.e(objArr.length, i10));
        }
    }

    private final int h(int i10) {
        if (i10 == o.H(this.f11768b)) {
            return 0;
        }
        return i10 + 1;
    }

    private final int i(int i10) {
        return i10 < 0 ? i10 + this.f11768b.length : i10;
    }

    private final void j(int i10, int i11) {
        if (i10 < i11) {
            m.r(this.f11768b, null, i10, i11);
            return;
        }
        Object[] objArr = this.f11768b;
        m.r(objArr, null, i10, objArr.length);
        m.r(this.f11768b, null, 0, i11);
    }

    private final int l(int i10) {
        Object[] objArr = this.f11768b;
        return i10 >= objArr.length ? i10 - objArr.length : i10;
    }

    private final void o() {
        ((AbstractList) this).modCount++;
    }

    private final void q(int i10, int i11) {
        int iL = l(this.f11767a + (i10 - 1));
        int iL2 = l(this.f11767a + (i11 - 1));
        while (i10 > 0) {
            int i12 = iL + 1;
            int iMin = Math.min(i10, Math.min(i12, iL2 + 1));
            Object[] objArr = this.f11768b;
            int i13 = iL2 - iMin;
            int i14 = iL - iMin;
            m.j(objArr, objArr, i13 + 1, i14 + 1, i12);
            iL = i(i14);
            iL2 = i(i13);
            i10 -= iMin;
        }
    }

    private final void s(int i10, int i11) {
        int iL = l(this.f11767a + i11);
        int iL2 = l(this.f11767a + i10);
        int size = size();
        while (true) {
            size -= i11;
            if (size <= 0) {
                return;
            }
            Object[] objArr = this.f11768b;
            i11 = Math.min(size, Math.min(objArr.length - iL, objArr.length - iL2));
            Object[] objArr2 = this.f11768b;
            int i12 = iL + i11;
            m.j(objArr2, objArr2, iL2, iL, i12);
            iL = l(i12);
            iL2 = l(iL2 + i11);
        }
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(Object obj) {
        addLast(obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection collection) {
        rd.m.e(collection, "elements");
        if (collection.isEmpty()) {
            return false;
        }
        o();
        g(size() + collection.size());
        d(l(this.f11767a + size()), collection);
        return true;
    }

    public final void addFirst(Object obj) {
        o();
        g(size() + 1);
        int iF = f(this.f11767a);
        this.f11767a = iF;
        this.f11768b[iF] = obj;
        this.f11769c = size() + 1;
    }

    public final void addLast(Object obj) {
        o();
        g(size() + 1);
        this.f11768b[l(this.f11767a + size())] = obj;
        this.f11769c = size() + 1;
    }

    @Override // ed.f
    public int b() {
        return this.f11769c;
    }

    @Override // ed.f
    public Object c(int i10) {
        d.f11750a.b(i10, size());
        if (i10 == s.m(this)) {
            return removeLast();
        }
        if (i10 == 0) {
            return removeFirst();
        }
        o();
        int iL = l(this.f11767a + i10);
        Object obj = this.f11768b[iL];
        if (i10 < (size() >> 1)) {
            int i11 = this.f11767a;
            if (iL >= i11) {
                Object[] objArr = this.f11768b;
                m.j(objArr, objArr, i11 + 1, i11, iL);
            } else {
                Object[] objArr2 = this.f11768b;
                m.j(objArr2, objArr2, 1, 0, iL);
                Object[] objArr3 = this.f11768b;
                objArr3[0] = objArr3[objArr3.length - 1];
                int i12 = this.f11767a;
                m.j(objArr3, objArr3, i12 + 1, i12, objArr3.length - 1);
            }
            Object[] objArr4 = this.f11768b;
            int i13 = this.f11767a;
            objArr4[i13] = null;
            this.f11767a = h(i13);
        } else {
            int iL2 = l(this.f11767a + s.m(this));
            if (iL <= iL2) {
                Object[] objArr5 = this.f11768b;
                m.j(objArr5, objArr5, iL, iL + 1, iL2 + 1);
            } else {
                Object[] objArr6 = this.f11768b;
                m.j(objArr6, objArr6, iL, iL + 1, objArr6.length);
                Object[] objArr7 = this.f11768b;
                objArr7[objArr7.length - 1] = objArr7[0];
                m.j(objArr7, objArr7, 0, 1, iL2 + 1);
            }
            this.f11768b[iL2] = null;
        }
        this.f11769c = size() - 1;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        if (!isEmpty()) {
            o();
            j(this.f11767a, l(this.f11767a + size()));
        }
        this.f11767a = 0;
        this.f11769c = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public Object get(int i10) {
        d.f11750a.b(i10, size());
        return this.f11768b[l(this.f11767a + i10)];
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        int i10;
        int iL = l(this.f11767a + size());
        int length = this.f11767a;
        if (length < iL) {
            while (length < iL) {
                if (rd.m.a(obj, this.f11768b[length])) {
                    i10 = this.f11767a;
                } else {
                    length++;
                }
            }
            return -1;
        }
        if (length < iL) {
            return -1;
        }
        int length2 = this.f11768b.length;
        while (true) {
            if (length >= length2) {
                for (int i11 = 0; i11 < iL; i11++) {
                    if (rd.m.a(obj, this.f11768b[i11])) {
                        length = i11 + this.f11768b.length;
                        i10 = this.f11767a;
                    }
                }
                return -1;
            }
            if (rd.m.a(obj, this.f11768b[length])) {
                i10 = this.f11767a;
                break;
            }
            length++;
        }
        return length - i10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public int lastIndexOf(Object obj) {
        int iH;
        int i10;
        int iL = l(this.f11767a + size());
        int i11 = this.f11767a;
        if (i11 < iL) {
            iH = iL - 1;
            if (i11 <= iH) {
                while (!rd.m.a(obj, this.f11768b[iH])) {
                    if (iH != i11) {
                        iH--;
                    }
                }
                i10 = this.f11767a;
                return iH - i10;
            }
            return -1;
        }
        if (i11 > iL) {
            int i12 = iL - 1;
            while (true) {
                if (-1 >= i12) {
                    iH = o.H(this.f11768b);
                    int i13 = this.f11767a;
                    if (i13 <= iH) {
                        while (!rd.m.a(obj, this.f11768b[iH])) {
                            if (iH != i13) {
                                iH--;
                            }
                        }
                        i10 = this.f11767a;
                    }
                } else {
                    if (rd.m.a(obj, this.f11768b[i12])) {
                        iH = i12 + this.f11768b.length;
                        i10 = this.f11767a;
                        break;
                    }
                    i12--;
                }
            }
            return iH - i10;
        }
        return -1;
    }

    public final Object p() {
        if (isEmpty()) {
            return null;
        }
        return removeFirst();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf == -1) {
            return false;
        }
        c(iIndexOf);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(Collection collection) {
        int iL;
        rd.m.e(collection, "elements");
        boolean z10 = false;
        z10 = false;
        z10 = false;
        if (!isEmpty() && this.f11768b.length != 0) {
            int iL2 = l(this.f11767a + size());
            int i10 = this.f11767a;
            if (i10 < iL2) {
                iL = i10;
                while (i10 < iL2) {
                    Object obj = this.f11768b[i10];
                    if (collection.contains(obj)) {
                        z10 = true;
                    } else {
                        this.f11768b[iL] = obj;
                        iL++;
                    }
                    i10++;
                }
                m.r(this.f11768b, null, iL, iL2);
            } else {
                int length = this.f11768b.length;
                int i11 = i10;
                boolean z11 = false;
                while (i10 < length) {
                    Object[] objArr = this.f11768b;
                    Object obj2 = objArr[i10];
                    objArr[i10] = null;
                    if (collection.contains(obj2)) {
                        z11 = true;
                    } else {
                        this.f11768b[i11] = obj2;
                        i11++;
                    }
                    i10++;
                }
                iL = l(i11);
                for (int i12 = 0; i12 < iL2; i12++) {
                    Object[] objArr2 = this.f11768b;
                    Object obj3 = objArr2[i12];
                    objArr2[i12] = null;
                    if (collection.contains(obj3)) {
                        z11 = true;
                    } else {
                        this.f11768b[iL] = obj3;
                        iL = h(iL);
                    }
                }
                z10 = z11;
            }
            if (z10) {
                o();
                this.f11769c = i(iL - this.f11767a);
            }
        }
        return z10;
    }

    public final Object removeFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        o();
        Object[] objArr = this.f11768b;
        int i10 = this.f11767a;
        Object obj = objArr[i10];
        objArr[i10] = null;
        this.f11767a = h(i10);
        this.f11769c = size() - 1;
        return obj;
    }

    public final Object removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        o();
        int iL = l(this.f11767a + s.m(this));
        Object[] objArr = this.f11768b;
        Object obj = objArr[iL];
        objArr[iL] = null;
        this.f11769c = size() - 1;
        return obj;
    }

    @Override // java.util.AbstractList
    protected void removeRange(int i10, int i11) {
        d.f11750a.d(i10, i11, size());
        int i12 = i11 - i10;
        if (i12 == 0) {
            return;
        }
        if (i12 == size()) {
            clear();
            return;
        }
        if (i12 == 1) {
            c(i10);
            return;
        }
        o();
        if (i10 < size() - i11) {
            q(i10, i11);
            int iL = l(this.f11767a + i12);
            j(this.f11767a, iL);
            this.f11767a = iL;
        } else {
            s(i10, i11);
            int iL2 = l(this.f11767a + size());
            j(i(iL2 - i12), iL2);
        }
        this.f11769c = size() - i12;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean retainAll(Collection collection) {
        int iL;
        rd.m.e(collection, "elements");
        boolean z10 = false;
        z10 = false;
        z10 = false;
        if (!isEmpty() && this.f11768b.length != 0) {
            int iL2 = l(this.f11767a + size());
            int i10 = this.f11767a;
            if (i10 < iL2) {
                iL = i10;
                while (i10 < iL2) {
                    Object obj = this.f11768b[i10];
                    if (collection.contains(obj)) {
                        this.f11768b[iL] = obj;
                        iL++;
                    } else {
                        z10 = true;
                    }
                    i10++;
                }
                m.r(this.f11768b, null, iL, iL2);
            } else {
                int length = this.f11768b.length;
                int i11 = i10;
                boolean z11 = false;
                while (i10 < length) {
                    Object[] objArr = this.f11768b;
                    Object obj2 = objArr[i10];
                    objArr[i10] = null;
                    if (collection.contains(obj2)) {
                        this.f11768b[i11] = obj2;
                        i11++;
                    } else {
                        z11 = true;
                    }
                    i10++;
                }
                iL = l(i11);
                for (int i12 = 0; i12 < iL2; i12++) {
                    Object[] objArr2 = this.f11768b;
                    Object obj3 = objArr2[i12];
                    objArr2[i12] = null;
                    if (collection.contains(obj3)) {
                        this.f11768b[iL] = obj3;
                        iL = h(iL);
                    } else {
                        z11 = true;
                    }
                }
                z10 = z11;
            }
            if (z10) {
                o();
                this.f11769c = i(iL - this.f11767a);
            }
        }
        return z10;
    }

    @Override // java.util.AbstractList, java.util.List
    public Object set(int i10, Object obj) {
        d.f11750a.b(i10, size());
        int iL = l(this.f11767a + i10);
        Object[] objArr = this.f11768b;
        Object obj2 = objArr[iL];
        objArr[iL] = obj;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public Object[] toArray(Object[] objArr) {
        rd.m.e(objArr, "array");
        if (objArr.length < size()) {
            objArr = k.a(objArr, size());
        }
        Object[] objArr2 = objArr;
        int iL = l(this.f11767a + size());
        int i10 = this.f11767a;
        if (i10 < iL) {
            m.m(this.f11768b, objArr2, 0, i10, iL, 2, null);
        } else if (!isEmpty()) {
            Object[] objArr3 = this.f11768b;
            m.j(objArr3, objArr2, 0, this.f11767a, objArr3.length);
            Object[] objArr4 = this.f11768b;
            m.j(objArr4, objArr2, objArr4.length - this.f11767a, 0, iL);
        }
        return r.f(size(), objArr2);
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i10, Object obj) {
        d.f11750a.c(i10, size());
        if (i10 == size()) {
            addLast(obj);
            return;
        }
        if (i10 == 0) {
            addFirst(obj);
            return;
        }
        o();
        g(size() + 1);
        int iL = l(this.f11767a + i10);
        if (i10 < ((size() + 1) >> 1)) {
            int iF = f(iL);
            int iF2 = f(this.f11767a);
            int i11 = this.f11767a;
            if (iF >= i11) {
                Object[] objArr = this.f11768b;
                objArr[iF2] = objArr[i11];
                m.j(objArr, objArr, i11, i11 + 1, iF + 1);
            } else {
                Object[] objArr2 = this.f11768b;
                m.j(objArr2, objArr2, i11 - 1, i11, objArr2.length);
                Object[] objArr3 = this.f11768b;
                objArr3[objArr3.length - 1] = objArr3[0];
                m.j(objArr3, objArr3, 0, 1, iF + 1);
            }
            this.f11768b[iF] = obj;
            this.f11767a = iF2;
        } else {
            int iL2 = l(this.f11767a + size());
            if (iL < iL2) {
                Object[] objArr4 = this.f11768b;
                m.j(objArr4, objArr4, iL + 1, iL, iL2);
            } else {
                Object[] objArr5 = this.f11768b;
                m.j(objArr5, objArr5, 1, 0, iL2);
                Object[] objArr6 = this.f11768b;
                objArr6[0] = objArr6[objArr6.length - 1];
                m.j(objArr6, objArr6, iL + 1, iL, objArr6.length - 1);
            }
            this.f11768b[iL] = obj;
        }
        this.f11769c = size() + 1;
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int i10, Collection collection) {
        rd.m.e(collection, "elements");
        d.f11750a.c(i10, size());
        if (collection.isEmpty()) {
            return false;
        }
        if (i10 == size()) {
            return addAll(collection);
        }
        o();
        g(size() + collection.size());
        int iL = l(this.f11767a + size());
        int iL2 = l(this.f11767a + i10);
        int size = collection.size();
        if (i10 < ((size() + 1) >> 1)) {
            int i11 = this.f11767a;
            int length = i11 - size;
            if (iL2 < i11) {
                Object[] objArr = this.f11768b;
                m.j(objArr, objArr, length, i11, objArr.length);
                if (size >= iL2) {
                    Object[] objArr2 = this.f11768b;
                    m.j(objArr2, objArr2, objArr2.length - size, 0, iL2);
                } else {
                    Object[] objArr3 = this.f11768b;
                    m.j(objArr3, objArr3, objArr3.length - size, 0, size);
                    Object[] objArr4 = this.f11768b;
                    m.j(objArr4, objArr4, 0, size, iL2);
                }
            } else if (length >= 0) {
                Object[] objArr5 = this.f11768b;
                m.j(objArr5, objArr5, length, i11, iL2);
            } else {
                Object[] objArr6 = this.f11768b;
                length += objArr6.length;
                int i12 = iL2 - i11;
                int length2 = objArr6.length - length;
                if (length2 >= i12) {
                    m.j(objArr6, objArr6, length, i11, iL2);
                } else {
                    m.j(objArr6, objArr6, length, i11, i11 + length2);
                    Object[] objArr7 = this.f11768b;
                    m.j(objArr7, objArr7, 0, this.f11767a + length2, iL2);
                }
            }
            this.f11767a = length;
            d(i(iL2 - size), collection);
        } else {
            int i13 = iL2 + size;
            if (iL2 < iL) {
                int i14 = size + iL;
                Object[] objArr8 = this.f11768b;
                if (i14 <= objArr8.length) {
                    m.j(objArr8, objArr8, i13, iL2, iL);
                } else if (i13 >= objArr8.length) {
                    m.j(objArr8, objArr8, i13 - objArr8.length, iL2, iL);
                } else {
                    int length3 = iL - (i14 - objArr8.length);
                    m.j(objArr8, objArr8, 0, length3, iL);
                    Object[] objArr9 = this.f11768b;
                    m.j(objArr9, objArr9, i13, iL2, length3);
                }
            } else {
                Object[] objArr10 = this.f11768b;
                m.j(objArr10, objArr10, size, 0, iL);
                Object[] objArr11 = this.f11768b;
                if (i13 >= objArr11.length) {
                    m.j(objArr11, objArr11, i13 - objArr11.length, iL2, objArr11.length);
                } else {
                    m.j(objArr11, objArr11, 0, objArr11.length - size, objArr11.length);
                    Object[] objArr12 = this.f11768b;
                    m.j(objArr12, objArr12, i13, iL2, objArr12.length - size);
                }
            }
            d(iL2, collection);
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public Object[] toArray() {
        return toArray(new Object[size()]);
    }
}
