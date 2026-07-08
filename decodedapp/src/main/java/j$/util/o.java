package j$.util;

import java.util.ListIterator;
import java.util.function.Consumer;

/* JADX INFO: loaded from: classes2.dex */
public final class o implements ListIterator, z {

    /* JADX INFO: renamed from: a */
    public final ListIterator f17855a;

    public o(p pVar, int i10) {
        this.f17855a = pVar.f17857b.listIterator(i10);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f17855a.hasNext();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        return this.f17855a.next();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f17855a.hasPrevious();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        return this.f17855a.previous();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f17855a.nextIndex();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f17855a.previousIndex();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator, j$.util.z
    public final void forEachRemaining(Consumer consumer) {
        c.q(this.f17855a, consumer);
    }
}
