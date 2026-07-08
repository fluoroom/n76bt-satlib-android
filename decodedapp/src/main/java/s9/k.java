package s9;

import j$.util.List;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import java.util.function.UnaryOperator;
import s9.j;

/* JADX INFO: loaded from: classes3.dex */
public abstract class k extends j implements List, RandomAccess, j$.util.List {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final c0 f27040b = new b(v.f27079e, 0);

    public static final class a extends j.a {
        public a() {
            this(4);
        }

        @Override // s9.j.b
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public a a(Object obj) {
            super.d(obj);
            return this;
        }

        public a g(Iterable iterable) {
            super.b(iterable);
            return this;
        }

        public k h() {
            this.f27039c = true;
            return k.i(this.f27037a, this.f27038b);
        }

        a(int i10) {
            super(i10);
        }
    }

    static class b extends s9.a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final k f27041c;

        b(k kVar, int i10) {
            super(kVar.size(), i10);
            this.f27041c = kVar;
        }

        @Override // s9.a
        protected Object a(int i10) {
            return this.f27041c.get(i10);
        }
    }

    class c extends k {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final transient int f27042c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final transient int f27043d;

        c(int i10, int i11) {
            this.f27042c = i10;
            this.f27043d = i11;
        }

        @Override // s9.k, java.util.List
        /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
        public k subList(int i10, int i11) {
            r9.l.s(i10, i11, this.f27043d);
            k kVar = k.this;
            int i12 = this.f27042c;
            return kVar.subList(i10 + i12, i11 + i12);
        }

        @Override // s9.j
        Object[] d() {
            return k.this.d();
        }

        @Override // s9.j
        int e() {
            return k.this.f() + this.f27042c + this.f27043d;
        }

        @Override // s9.j
        int f() {
            return k.this.f() + this.f27042c;
        }

        @Override // s9.j
        boolean g() {
            return true;
        }

        @Override // java.util.List
        public Object get(int i10) {
            r9.l.l(i10, this.f27043d);
            return k.this.get(i10 + this.f27042c);
        }

        @Override // s9.k, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
        public /* bridge */ /* synthetic */ Iterator iterator() {
            return super.iterator();
        }

        @Override // s9.k, java.util.List
        public /* bridge */ /* synthetic */ ListIterator listIterator() {
            return super.listIterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f27043d;
        }

        @Override // s9.k, java.util.List
        public /* bridge */ /* synthetic */ ListIterator listIterator(int i10) {
            return super.listIterator(i10);
        }
    }

    k() {
    }

    public static k A(Object obj, Object obj2) {
        return l(obj, obj2);
    }

    public static k C(Object obj, Object obj2, Object obj3) {
        return l(obj, obj2, obj3);
    }

    static k h(Object[] objArr) {
        return i(objArr, objArr.length);
    }

    static k i(Object[] objArr, int i10) {
        return i10 == 0 ? t() : new v(objArr, i10);
    }

    public static a j() {
        return new a();
    }

    private static k l(Object... objArr) {
        return h(s.b(objArr));
    }

    public static k o(Collection collection) {
        if (!(collection instanceof j)) {
            return l(collection.toArray());
        }
        k kVarB = ((j) collection).b();
        return kVarB.g() ? h(kVarB.toArray()) : kVarB;
    }

    public static k t() {
        return v.f27079e;
    }

    public static k z(Object obj) {
        return l(obj);
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: D */
    public k subList(int i10, int i11) {
        r9.l.s(i10, i11, size());
        int i12 = i11 - i10;
        return i12 == size() ? this : i12 == 0 ? t() : K(i10, i11);
    }

    k K(int i10, int i11) {
        return new c(i10, i11 - i10);
    }

    @Override // java.util.List
    public final void add(int i10, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final boolean addAll(int i10, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // s9.j
    int c(Object[] objArr, int i10) {
        int size = size();
        for (int i11 = 0; i11 < size; i11++) {
            objArr[i10 + i11] = get(i11);
        }
        return i10 + size;
    }

    @Override // s9.j, java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        return p.b(this, obj);
    }

    @Override // java.util.Collection, java.util.List
    public int hashCode() {
        int size = size();
        int i10 = 1;
        for (int i11 = 0; i11 < size; i11++) {
            i10 = ~(~((i10 * 31) + get(i11).hashCode()));
        }
        return i10;
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        return p.c(this, obj);
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        return p.e(this, obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public b0 iterator() {
        return listIterator();
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public c0 listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final Object remove(int i10) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List, j$.util.List
    public /* synthetic */ void replaceAll(UnaryOperator unaryOperator) {
        List.CC.$default$replaceAll(this, unaryOperator);
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public c0 listIterator(int i10) {
        r9.l.q(i10, size());
        return isEmpty() ? f27040b : new b(this, i10);
    }

    @Override // java.util.List
    public final Object set(int i10, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List, j$.util.List
    public /* synthetic */ void sort(Comparator comparator) {
        List.CC.$default$sort(this, comparator);
    }

    @Override // s9.j
    public final k b() {
        return this;
    }
}
