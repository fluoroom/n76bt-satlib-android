package ed;

import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class i0 implements Iterator, sd.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Iterator f11770a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f11771b;

    public i0(Iterator it) {
        rd.m.e(it, "iterator");
        this.f11770a = it;
    }

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final g0 next() {
        int i10 = this.f11771b;
        this.f11771b = i10 + 1;
        if (i10 < 0) {
            s.u();
        }
        return new g0(i10, this.f11770a.next());
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f11770a.hasNext();
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
