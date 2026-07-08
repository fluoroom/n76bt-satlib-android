package ed;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes3.dex */
final class q0 extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f11776a;

    public static final class a implements ListIterator, sd.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ListIterator f11777a;

        a(int i10) {
            this.f11777a = q0.this.f11776a.listIterator(y.O(q0.this, i10));
        }

        @Override // java.util.ListIterator
        public void add(Object obj) {
            this.f11777a.add(obj);
            this.f11777a.previous();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.f11777a.hasPrevious();
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.f11777a.hasNext();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public Object next() {
            return this.f11777a.previous();
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return y.N(q0.this, this.f11777a.previousIndex());
        }

        @Override // java.util.ListIterator
        public Object previous() {
            return this.f11777a.next();
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return y.N(q0.this, this.f11777a.nextIndex());
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            this.f11777a.remove();
        }

        @Override // java.util.ListIterator
        public void set(Object obj) {
            this.f11777a.set(obj);
        }
    }

    public q0(List list) {
        rd.m.e(list, "delegate");
        this.f11776a = list;
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i10, Object obj) {
        this.f11776a.add(y.O(this, i10), obj);
    }

    @Override // ed.f
    public int b() {
        return this.f11776a.size();
    }

    @Override // ed.f
    public Object c(int i10) {
        return this.f11776a.remove(y.M(this, i10));
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        this.f11776a.clear();
    }

    @Override // java.util.AbstractList, java.util.List
    public Object get(int i10) {
        return this.f11776a.get(y.M(this, i10));
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.List
    public Object set(int i10, Object obj) {
        return this.f11776a.set(y.M(this, i10), obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator listIterator(int i10) {
        return new a(i10);
    }
}
