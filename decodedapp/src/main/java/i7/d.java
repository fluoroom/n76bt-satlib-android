package i7;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public class d implements Iterator, Iterable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object[] f15875a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f15876b = 0;

    public d(Object[] objArr) {
        this.f15875a = objArr;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f15876b < this.f15875a.length;
    }

    @Override // java.util.Iterator
    public Object next() {
        int i10 = this.f15876b;
        Object[] objArr = this.f15875a;
        if (i10 >= objArr.length) {
            throw new NoSuchElementException();
        }
        this.f15876b = i10 + 1;
        return objArr[i10];
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return this;
    }
}
