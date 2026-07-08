package qg;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
public final class f implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final h f25185a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final qd.l f25186b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final qd.l f25187c;

    public static final class a implements Iterator, sd.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Iterator f25188a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Iterator f25189b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f25190c;

        a() {
            this.f25188a = f.this.f25185a.iterator();
        }

        private final boolean c() {
            Iterator it = this.f25189b;
            if (it != null && it.hasNext()) {
                this.f25190c = 1;
                return true;
            }
            while (this.f25188a.hasNext()) {
                Iterator it2 = (Iterator) f.this.f25187c.l(f.this.f25186b.l(this.f25188a.next()));
                if (it2.hasNext()) {
                    this.f25189b = it2;
                    this.f25190c = 1;
                    return true;
                }
            }
            this.f25190c = 2;
            this.f25189b = null;
            return false;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            int i10 = this.f25190c;
            if (i10 == 1) {
                return true;
            }
            if (i10 == 2) {
                return false;
            }
            return c();
        }

        @Override // java.util.Iterator
        public Object next() {
            int i10 = this.f25190c;
            if (i10 == 2) {
                throw new NoSuchElementException();
            }
            if (i10 == 0 && !c()) {
                throw new NoSuchElementException();
            }
            this.f25190c = 0;
            Iterator it = this.f25189b;
            rd.m.b(it);
            return it.next();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public f(h hVar, qd.l lVar, qd.l lVar2) {
        rd.m.e(hVar, "sequence");
        rd.m.e(lVar, "transformer");
        rd.m.e(lVar2, "iterator");
        this.f25185a = hVar;
        this.f25186b = lVar;
        this.f25187c = lVar2;
    }

    @Override // qg.h
    public Iterator iterator() {
        return new a();
    }
}
