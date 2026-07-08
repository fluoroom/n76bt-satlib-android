package qg;

import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements h, c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final h f25173a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f25174b;

    public static final class a implements Iterator, sd.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Iterator f25175a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f25176b;

        a(b bVar) {
            this.f25175a = bVar.f25173a.iterator();
            this.f25176b = bVar.f25174b;
        }

        private final void c() {
            while (this.f25176b > 0 && this.f25175a.hasNext()) {
                this.f25175a.next();
                this.f25176b--;
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            c();
            return this.f25175a.hasNext();
        }

        @Override // java.util.Iterator
        public Object next() {
            c();
            return this.f25175a.next();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public b(h hVar, int i10) {
        rd.m.e(hVar, "sequence");
        this.f25173a = hVar;
        this.f25174b = i10;
        if (i10 >= 0) {
            return;
        }
        throw new IllegalArgumentException(("count must be non-negative, but was " + i10 + '.').toString());
    }

    @Override // qg.c
    public h a(int i10) {
        int i11 = this.f25174b + i10;
        return i11 < 0 ? new b(this, i10) : new b(this.f25173a, i11);
    }

    @Override // qg.h
    public Iterator iterator() {
        return new a(this);
    }
}
