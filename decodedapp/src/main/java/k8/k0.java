package k8;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
abstract class k0 extends s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f19504a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f19505b;

    protected k0(int i10, int i11) {
        i0.b(i11, i10, "index");
        this.f19504a = i10;
        this.f19505b = i11;
    }

    protected abstract Object a(int i10);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f19505b < this.f19504a;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f19505b > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f19505b;
        this.f19505b = i10 + 1;
        return a(i10);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f19505b;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f19505b - 1;
        this.f19505b = i10;
        return a(i10);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f19505b - 1;
    }
}
