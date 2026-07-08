package lg;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
public final class o extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f20606a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f20607b;

    public static final class a implements Iterator, sd.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f20608a = true;

        a() {
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f20608a;
        }

        @Override // java.util.Iterator
        public Object next() {
            if (!this.f20608a) {
                throw new NoSuchElementException();
            }
            this.f20608a = false;
            return o.this.d();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(Object obj, int i10) {
        super(null);
        rd.m.e(obj, "value");
        this.f20606a = obj;
        this.f20607b = i10;
    }

    @Override // lg.c
    public int b() {
        return 1;
    }

    @Override // lg.c
    public void c(int i10, Object obj) {
        rd.m.e(obj, "value");
        throw new IllegalStateException();
    }

    public final Object d() {
        return this.f20606a;
    }

    @Override // lg.c
    public Object get(int i10) {
        if (i10 == this.f20607b) {
            return this.f20606a;
        }
        return null;
    }

    public final int getIndex() {
        return this.f20607b;
    }

    @Override // lg.c, java.lang.Iterable
    public Iterator iterator() {
        return new a();
    }
}
