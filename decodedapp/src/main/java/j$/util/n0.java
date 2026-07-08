package j$.util;

import java.util.PrimitiveIterator;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class n0 implements p0, z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ PrimitiveIterator.OfLong f17854a;

    public /* synthetic */ n0(PrimitiveIterator.OfLong ofLong) {
        this.f17854a = ofLong;
    }

    public final /* synthetic */ boolean equals(Object obj) {
        PrimitiveIterator.OfLong ofLong = this.f17854a;
        if (obj instanceof n0) {
            obj = ((n0) obj).f17854a;
        }
        return ofLong.equals(obj);
    }

    @Override // j$.util.q0
    public final /* synthetic */ void forEachRemaining(Object obj) {
        this.f17854a.forEachRemaining(obj);
    }

    @Override // j$.util.p0, java.util.Iterator, j$.util.z
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        this.f17854a.forEachRemaining((Consumer<? super Long>) consumer);
    }

    @Override // j$.util.p0
    public final /* synthetic */ void forEachRemaining(LongConsumer longConsumer) {
        this.f17854a.forEachRemaining(longConsumer);
    }

    @Override // java.util.Iterator
    public final /* synthetic */ boolean hasNext() {
        return this.f17854a.hasNext();
    }

    public final /* synthetic */ int hashCode() {
        return this.f17854a.hashCode();
    }

    @Override // j$.util.p0, java.util.Iterator
    public final /* synthetic */ Long next() {
        return this.f17854a.next();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        return this.f17854a.next();
    }

    @Override // j$.util.p0
    public final /* synthetic */ long nextLong() {
        return this.f17854a.nextLong();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ void remove() {
        this.f17854a.remove();
    }
}
