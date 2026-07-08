package qg;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
public final class v implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final h f25210a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final qd.l f25211b;

    public static final class a implements Iterator, sd.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Iterator f25212a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f25213b = -1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Object f25214c;

        a() {
            this.f25212a = v.this.f25210a.iterator();
        }

        private final void c() {
            if (this.f25212a.hasNext()) {
                Object next = this.f25212a.next();
                if (((Boolean) v.this.f25211b.l(next)).booleanValue()) {
                    this.f25213b = 1;
                    this.f25214c = next;
                    return;
                }
            }
            this.f25213b = 0;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f25213b == -1) {
                c();
            }
            return this.f25213b == 1;
        }

        @Override // java.util.Iterator
        public Object next() {
            if (this.f25213b == -1) {
                c();
            }
            if (this.f25213b == 0) {
                throw new NoSuchElementException();
            }
            Object obj = this.f25214c;
            this.f25214c = null;
            this.f25213b = -1;
            return obj;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public v(h hVar, qd.l lVar) {
        rd.m.e(hVar, "sequence");
        rd.m.e(lVar, "predicate");
        this.f25210a = hVar;
        this.f25211b = lVar;
    }

    @Override // qg.h
    public Iterator iterator() {
        return new a();
    }
}
