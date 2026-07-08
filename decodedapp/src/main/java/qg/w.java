package qg;

import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class w implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final h f25216a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final qd.l f25217b;

    public static final class a implements Iterator, sd.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Iterator f25218a;

        a() {
            this.f25218a = w.this.f25216a.iterator();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f25218a.hasNext();
        }

        @Override // java.util.Iterator
        public Object next() {
            return w.this.f25217b.l(this.f25218a.next());
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public w(h hVar, qd.l lVar) {
        rd.m.e(hVar, "sequence");
        rd.m.e(lVar, "transformer");
        this.f25216a = hVar;
        this.f25217b = lVar;
    }

    public final h d(qd.l lVar) {
        rd.m.e(lVar, "iterator");
        return new f(this.f25216a, this.f25217b, lVar);
    }

    @Override // qg.h
    public Iterator iterator() {
        return new a();
    }
}
