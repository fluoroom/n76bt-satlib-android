package rd;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
final class b implements Iterator, sd.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object[] f25933a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f25934b;

    public b(Object[] objArr) {
        m.e(objArr, "array");
        this.f25933a = objArr;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f25934b < this.f25933a.length;
    }

    @Override // java.util.Iterator
    public Object next() {
        try {
            Object[] objArr = this.f25933a;
            int i10 = this.f25934b;
            this.f25934b = i10 + 1;
            return objArr[i10];
        } catch (ArrayIndexOutOfBoundsException e10) {
            this.f25934b--;
            throw new NoSuchElementException(e10.getMessage());
        }
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
