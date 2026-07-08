package j$.util.concurrent;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes2.dex */
public final class d extends a implements Iterator {
    @Override // java.util.Iterator
    public final Object next() {
        l lVar = this.f17757b;
        if (lVar == null) {
            throw new NoSuchElementException();
        }
        Object obj = lVar.f17749b;
        Object obj2 = lVar.f17750c;
        this.f17737j = lVar;
        a();
        return new k(obj, obj2, this.f17736i);
    }
}
