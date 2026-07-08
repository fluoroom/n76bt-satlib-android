package androidx.collection;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public abstract class e implements Iterator, sd.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f1369a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f1370b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f1371c;

    public e(int i10) {
        this.f1369a = i10;
    }

    protected abstract Object c(int i10);

    protected abstract void d(int i10);

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f1370b < this.f1369a;
    }

    @Override // java.util.Iterator
    public Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Object objC = c(this.f1370b);
        this.f1370b++;
        this.f1371c = true;
        return objC;
    }

    @Override // java.util.Iterator
    public void remove() {
        if (!this.f1371c) {
            throw new IllegalStateException("Call next() before removing an element.");
        }
        int i10 = this.f1370b - 1;
        this.f1370b = i10;
        d(i10);
        this.f1369a--;
        this.f1371c = false;
    }
}
