package j$.util;

import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class v0 implements x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Spliterator.OfInt f18302a;

    public /* synthetic */ v0(Spliterator.OfInt ofInt) {
        this.f18302a = ofInt;
    }

    public static /* synthetic */ x0 a(Spliterator.OfInt ofInt) {
        if (ofInt == null) {
            return null;
        }
        return ofInt instanceof w0 ? ((w0) ofInt).f18303a : new v0(ofInt);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ int characteristics() {
        return this.f18302a.characteristics();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        Spliterator.OfInt ofInt = this.f18302a;
        if (obj instanceof v0) {
            obj = ((v0) obj).f18302a;
        }
        return ofInt.equals(obj);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long estimateSize() {
        return this.f18302a.estimateSize();
    }

    @Override // j$.util.d1
    public final /* synthetic */ void forEachRemaining(Object obj) {
        this.f18302a.forEachRemaining(obj);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        this.f18302a.forEachRemaining((Consumer<? super Integer>) consumer);
    }

    @Override // j$.util.x0
    public final /* synthetic */ void forEachRemaining(IntConsumer intConsumer) {
        this.f18302a.forEachRemaining(intConsumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ java.util.Comparator getComparator() {
        return this.f18302a.getComparator();
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return this.f18302a.getExactSizeIfKnown();
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i10) {
        return this.f18302a.hasCharacteristics(i10);
    }

    public final /* synthetic */ int hashCode() {
        return this.f18302a.hashCode();
    }

    @Override // j$.util.d1
    public final /* synthetic */ boolean tryAdvance(Object obj) {
        return this.f18302a.tryAdvance(obj);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return this.f18302a.tryAdvance((Consumer<? super Integer>) consumer);
    }

    @Override // j$.util.x0
    public final /* synthetic */ boolean tryAdvance(IntConsumer intConsumer) {
        return this.f18302a.tryAdvance(intConsumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ Spliterator trySplit() {
        return e1.a(this.f18302a.trySplit());
    }

    @Override // j$.util.d1, j$.util.Spliterator
    public final /* synthetic */ d1 trySplit() {
        return b1.a(this.f18302a.trySplit());
    }

    @Override // j$.util.x0, j$.util.d1, j$.util.Spliterator
    public final /* synthetic */ x0 trySplit() {
        return a(this.f18302a.trySplit());
    }
}
