package j$.util;

import java.util.PrimitiveIterator;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class f0 implements h0, z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ PrimitiveIterator.OfDouble f17801a;

    public /* synthetic */ f0(PrimitiveIterator.OfDouble ofDouble) {
        this.f17801a = ofDouble;
    }

    public final /* synthetic */ boolean equals(Object obj) {
        PrimitiveIterator.OfDouble ofDouble = this.f17801a;
        if (obj instanceof f0) {
            obj = ((f0) obj).f17801a;
        }
        return ofDouble.equals(obj);
    }

    @Override // j$.util.q0
    public final /* synthetic */ void forEachRemaining(Object obj) {
        this.f17801a.forEachRemaining(obj);
    }

    @Override // j$.util.h0, java.util.Iterator, j$.util.z
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        this.f17801a.forEachRemaining((Consumer<? super Double>) consumer);
    }

    @Override // j$.util.h0
    public final /* synthetic */ void forEachRemaining(DoubleConsumer doubleConsumer) {
        this.f17801a.forEachRemaining(doubleConsumer);
    }

    @Override // java.util.Iterator
    public final /* synthetic */ boolean hasNext() {
        return this.f17801a.hasNext();
    }

    public final /* synthetic */ int hashCode() {
        return this.f17801a.hashCode();
    }

    @Override // j$.util.h0, java.util.Iterator
    public final /* synthetic */ Double next() {
        return this.f17801a.next();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        return this.f17801a.next();
    }

    @Override // j$.util.h0
    public final /* synthetic */ double nextDouble() {
        return this.f17801a.nextDouble();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ void remove() {
        this.f17801a.remove();
    }
}
