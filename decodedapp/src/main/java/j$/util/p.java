package j$.util;

import java.util.ListIterator;
import java.util.RandomAccess;
import java.util.function.UnaryOperator;

/* JADX INFO: loaded from: classes2.dex */
public class p extends n implements java.util.List, List {
    private static final long serialVersionUID = -283967356065247728L;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.util.List f17857b;

    public p(java.util.List list) {
        super(list);
        this.f17857b = list;
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        return obj == this || this.f17857b.equals(obj);
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        return this.f17857b.hashCode();
    }

    @Override // java.util.List
    public final Object get(int i10) {
        return this.f17857b.get(i10);
    }

    @Override // java.util.List
    public final Object set(int i10, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final void add(int i10, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final Object remove(int i10) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        return this.f17857b.indexOf(obj);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        return this.f17857b.lastIndexOf(obj);
    }

    @Override // java.util.List
    public final boolean addAll(int i10, java.util.Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List, j$.util.List
    public final void replaceAll(UnaryOperator unaryOperator) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List, j$.util.List
    public final void sort(java.util.Comparator comparator) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return new o(this, 0);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i10) {
        return new o(this, i10);
    }

    @Override // java.util.List
    public java.util.List subList(int i10, int i11) {
        return new p(this.f17857b.subList(i10, i11));
    }

    private Object readResolve() {
        java.util.List list = this.f17857b;
        return list instanceof RandomAccess ? new v(list) : this;
    }
}
