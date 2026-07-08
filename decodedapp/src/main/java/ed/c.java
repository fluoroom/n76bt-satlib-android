package ed;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class c implements Iterator, sd.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f11747a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Object f11748b;

    private final boolean f() {
        this.f11747a = 3;
        c();
        return this.f11747a == 1;
    }

    protected abstract void c();

    protected final void d() {
        this.f11747a = 2;
    }

    protected final void e(Object obj) {
        this.f11748b = obj;
        this.f11747a = 1;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        int i10 = this.f11747a;
        if (i10 == 0) {
            return f();
        }
        if (i10 == 1) {
            return true;
        }
        if (i10 == 2) {
            return false;
        }
        throw new IllegalArgumentException("hasNext called when the iterator is in the FAILED state.");
    }

    @Override // java.util.Iterator
    public Object next() {
        int i10 = this.f11747a;
        if (i10 == 1) {
            this.f11747a = 0;
            return this.f11748b;
        }
        if (i10 == 2 || !f()) {
            throw new NoSuchElementException();
        }
        this.f11747a = 0;
        return this.f11748b;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
