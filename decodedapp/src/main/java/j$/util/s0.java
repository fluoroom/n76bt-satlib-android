package j$.util;

import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class s0 implements u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Spliterator.OfDouble f17876a;

    public /* synthetic */ s0(Spliterator.OfDouble ofDouble) {
        this.f17876a = ofDouble;
    }

    public static /* synthetic */ u0 a(Spliterator.OfDouble ofDouble) {
        if (ofDouble == null) {
            return null;
        }
        return ofDouble instanceof t0 ? ((t0) ofDouble).f18295a : new s0(ofDouble);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ int characteristics() {
        return this.f17876a.characteristics();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        Spliterator.OfDouble ofDouble = this.f17876a;
        if (obj instanceof s0) {
            obj = ((s0) obj).f17876a;
        }
        return ofDouble.equals(obj);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long estimateSize() {
        return this.f17876a.estimateSize();
    }

    @Override // j$.util.d1
    public final /* synthetic */ void forEachRemaining(Object obj) {
        this.f17876a.forEachRemaining(obj);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        this.f17876a.forEachRemaining((Consumer<? super Double>) consumer);
    }

    @Override // j$.util.u0
    public final /* synthetic */ void forEachRemaining(DoubleConsumer doubleConsumer) {
        this.f17876a.forEachRemaining(doubleConsumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ java.util.Comparator getComparator() {
        return this.f17876a.getComparator();
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return this.f17876a.getExactSizeIfKnown();
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i10) {
        return this.f17876a.hasCharacteristics(i10);
    }

    public final /* synthetic */ int hashCode() {
        return this.f17876a.hashCode();
    }

    @Override // j$.util.d1
    public final /* synthetic */ boolean tryAdvance(Object obj) {
        return this.f17876a.tryAdvance(obj);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return this.f17876a.tryAdvance((Consumer<? super Double>) consumer);
    }

    @Override // j$.util.u0
    public final /* synthetic */ boolean tryAdvance(DoubleConsumer doubleConsumer) {
        return this.f17876a.tryAdvance(doubleConsumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ Spliterator trySplit() {
        return e1.a(this.f17876a.trySplit());
    }

    @Override // j$.util.d1, j$.util.Spliterator
    public final /* synthetic */ d1 trySplit() {
        return b1.a(this.f17876a.trySplit());
    }

    @Override // j$.util.u0, j$.util.d1, j$.util.Spliterator
    public final /* synthetic */ u0 trySplit() {
        return a(this.f17876a.trySplit());
    }
}
