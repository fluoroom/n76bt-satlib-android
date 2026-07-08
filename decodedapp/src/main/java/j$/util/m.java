package j$.util;

import java.util.Iterator;
import java.util.Map;
import java.util.function.Consumer;

/* JADX INFO: loaded from: classes2.dex */
public final class m implements Iterator, z {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f17849a = 0;

    /* JADX INFO: renamed from: b */
    public final Iterator f17850b;

    public m(n nVar) {
        this.f17850b = nVar.f17853a.iterator();
    }

    public m(t tVar) {
        this.f17850b = tVar.f17853a.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f17849a) {
        }
        return this.f17850b.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f17849a) {
            case 0:
                return this.f17850b.next();
            default:
                return new r((Map.Entry) this.f17850b.next());
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f17849a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Iterator, j$.util.z
    public final void forEachRemaining(Consumer consumer) {
        switch (this.f17849a) {
            case 0:
                c.q(this.f17850b, consumer);
                break;
            default:
                c.q(this.f17850b, new q(0, consumer));
                break;
        }
    }
}
