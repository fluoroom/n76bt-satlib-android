package qg;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
public final class e implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final h f25178a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f25179b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final qd.l f25180c;

    public static final class a implements Iterator, sd.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Iterator f25181a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f25182b = -1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Object f25183c;

        a() {
            this.f25181a = e.this.f25178a.iterator();
        }

        private final void c() {
            while (this.f25181a.hasNext()) {
                Object next = this.f25181a.next();
                if (((Boolean) e.this.f25180c.l(next)).booleanValue() == e.this.f25179b) {
                    this.f25183c = next;
                    this.f25182b = 1;
                    return;
                }
            }
            this.f25182b = 0;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f25182b == -1) {
                c();
            }
            return this.f25182b == 1;
        }

        @Override // java.util.Iterator
        public Object next() {
            if (this.f25182b == -1) {
                c();
            }
            if (this.f25182b == 0) {
                throw new NoSuchElementException();
            }
            Object obj = this.f25183c;
            this.f25183c = null;
            this.f25182b = -1;
            return obj;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public e(h hVar, boolean z10, qd.l lVar) {
        rd.m.e(hVar, "sequence");
        rd.m.e(lVar, "predicate");
        this.f25178a = hVar;
        this.f25179b = z10;
        this.f25180c = lVar;
    }

    @Override // qg.h
    public Iterator iterator() {
        return new a();
    }
}
