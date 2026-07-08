package s9;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
abstract class a extends c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f27027a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f27028b;

    protected a(int i10) {
        this(i10, 0);
    }

    protected abstract Object a(int i10);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f27028b < this.f27027a;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f27028b > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f27028b;
        this.f27028b = i10 + 1;
        return a(i10);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f27028b;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f27028b - 1;
        this.f27028b = i10;
        return a(i10);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f27028b - 1;
    }

    protected a(int i10, int i11) {
        r9.l.q(i11, i10);
        this.f27027a = i10;
        this.f27028b = i11;
    }
}
