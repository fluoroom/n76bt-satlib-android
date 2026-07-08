package m0;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class j0 implements Iterator, sd.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final qd.l f20838a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f20839b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Iterator f20840c;

    public j0(Iterator it, qd.l lVar) {
        this.f20838a = lVar;
        this.f20840c = it;
    }

    private final void c(Object obj) {
        Iterator it = (Iterator) this.f20838a.l(obj);
        if (it != null && it.hasNext()) {
            this.f20839b.add(this.f20840c);
            this.f20840c = it;
        } else {
            while (!this.f20840c.hasNext() && !this.f20839b.isEmpty()) {
                this.f20840c = (Iterator) ed.q.k0(this.f20839b);
                ed.q.E(this.f20839b);
            }
        }
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f20840c.hasNext();
    }

    @Override // java.util.Iterator
    public Object next() {
        Object next = this.f20840c.next();
        c(next);
        return next;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
