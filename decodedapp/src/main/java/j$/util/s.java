package j$.util;

import java.util.function.Consumer;

/* JADX INFO: loaded from: classes2.dex */
public final class s implements Spliterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Spliterator f17875a;

    public s(Spliterator spliterator) {
        this.f17875a = spliterator;
    }

    @Override // j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer) {
        Objects.requireNonNull(consumer);
        return this.f17875a.tryAdvance(new q(0, consumer));
    }

    @Override // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        Objects.requireNonNull(consumer);
        this.f17875a.forEachRemaining(new q(0, consumer));
    }

    @Override // j$.util.Spliterator
    public final Spliterator trySplit() {
        Spliterator spliteratorTrySplit = this.f17875a.trySplit();
        if (spliteratorTrySplit == null) {
            return null;
        }
        return new s(spliteratorTrySplit);
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        return this.f17875a.estimateSize();
    }

    @Override // j$.util.Spliterator
    public final long getExactSizeIfKnown() {
        return this.f17875a.getExactSizeIfKnown();
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return this.f17875a.characteristics();
    }

    @Override // j$.util.Spliterator
    public final boolean hasCharacteristics(int i10) {
        return this.f17875a.hasCharacteristics(i10);
    }

    @Override // j$.util.Spliterator
    public final java.util.Comparator getComparator() {
        return this.f17875a.getComparator();
    }
}
