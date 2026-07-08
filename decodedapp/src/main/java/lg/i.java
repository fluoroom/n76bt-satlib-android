package lg;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
public final class i extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i f20597a = new i();

    public static final class a implements Iterator, sd.a {
        a() {
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public Void next() {
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return false;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    private i() {
        super(null);
    }

    @Override // lg.c
    public int b() {
        return 0;
    }

    @Override // lg.c
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Void get(int i10) {
        return null;
    }

    @Override // lg.c
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void c(int i10, Void r22) {
        rd.m.e(r22, "value");
        throw new IllegalStateException();
    }

    @Override // lg.c, java.lang.Iterable
    public Iterator iterator() {
        return new a();
    }
}
