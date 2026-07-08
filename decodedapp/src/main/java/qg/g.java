package qg;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
final class g implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final qd.a f25192a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final qd.l f25193b;

    public static final class a implements Iterator, sd.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Object f25194a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f25195b = -2;

        a() {
        }

        private final void c() {
            Object objL;
            if (this.f25195b == -2) {
                objL = g.this.f25192a.a();
            } else {
                qd.l lVar = g.this.f25193b;
                Object obj = this.f25194a;
                rd.m.b(obj);
                objL = lVar.l(obj);
            }
            this.f25194a = objL;
            this.f25195b = objL == null ? 0 : 1;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f25195b < 0) {
                c();
            }
            return this.f25195b == 1;
        }

        @Override // java.util.Iterator
        public Object next() {
            if (this.f25195b < 0) {
                c();
            }
            if (this.f25195b == 0) {
                throw new NoSuchElementException();
            }
            Object obj = this.f25194a;
            rd.m.c(obj, "null cannot be cast to non-null type T of kotlin.sequences.GeneratorSequence");
            this.f25195b = -1;
            return obj;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public g(qd.a aVar, qd.l lVar) {
        rd.m.e(aVar, "getInitialValue");
        rd.m.e(lVar, "getNextValue");
        this.f25192a = aVar;
        this.f25193b = lVar;
    }

    @Override // qg.h
    public Iterator iterator() {
        return new a();
    }
}
