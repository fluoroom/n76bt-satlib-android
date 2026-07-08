package j$.util.stream;

import j$.util.Spliterator;
import java.util.Comparator;

/* JADX INFO: loaded from: classes2.dex */
public abstract class e8 implements Spliterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f17972a;

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return 17488;
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return j$.util.c.d(this);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i10) {
        return j$.util.c.e(this, i10);
    }

    @Override // j$.util.Spliterator
    public final Spliterator trySplit() {
        return null;
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        return (-this.f17972a) - 1;
    }

    @Override // j$.util.Spliterator
    public final Comparator getComparator() {
        throw new IllegalStateException();
    }
}
