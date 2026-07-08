package j$.util.concurrent;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes2.dex */
public final class h extends a implements Iterator, Enumeration {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f17742k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(l[] lVarArr, int i10, int i11, ConcurrentHashMap concurrentHashMap, int i12) {
        super(lVarArr, i10, i11, concurrentHashMap);
        this.f17742k = i12;
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f17742k) {
            case 0:
                l lVar = this.f17757b;
                if (lVar == null) {
                    throw new NoSuchElementException();
                }
                Object obj = lVar.f17749b;
                this.f17737j = lVar;
                a();
                return obj;
            default:
                l lVar2 = this.f17757b;
                if (lVar2 == null) {
                    throw new NoSuchElementException();
                }
                Object obj2 = lVar2.f17750c;
                this.f17737j = lVar2;
                a();
                return obj2;
        }
    }

    @Override // java.util.Enumeration
    public final Object nextElement() {
        switch (this.f17742k) {
        }
        return next();
    }
}
