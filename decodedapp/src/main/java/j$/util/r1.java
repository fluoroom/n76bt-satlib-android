package j$.util;

import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* JADX INFO: loaded from: classes2.dex */
public final class r1 implements a1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long[] f17871a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f17872b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f17873c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f17874d;

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        c.c(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return c.d(this);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i10) {
        return c.e(this, i10);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return c.h(this, consumer);
    }

    public r1(long[] jArr, int i10, int i11, int i12) {
        this.f17871a = jArr;
        this.f17872b = i10;
        this.f17873c = i11;
        this.f17874d = i12 | 16448;
    }

    @Override // j$.util.d1, j$.util.Spliterator
    public final a1 trySplit() {
        int i10 = this.f17872b;
        int i11 = (this.f17873c + i10) >>> 1;
        if (i10 >= i11) {
            return null;
        }
        this.f17872b = i11;
        return new r1(this.f17871a, i10, i11, this.f17874d);
    }

    @Override // j$.util.d1
    public final void forEachRemaining(LongConsumer longConsumer) {
        int i10;
        longConsumer.getClass();
        long[] jArr = this.f17871a;
        int length = jArr.length;
        int i11 = this.f17873c;
        if (length < i11 || (i10 = this.f17872b) < 0) {
            return;
        }
        this.f17872b = i11;
        if (i10 < i11) {
            do {
                longConsumer.accept(jArr[i10]);
                i10++;
            } while (i10 < i11);
        }
    }

    @Override // j$.util.d1
    public final boolean tryAdvance(LongConsumer longConsumer) {
        longConsumer.getClass();
        int i10 = this.f17872b;
        if (i10 < 0 || i10 >= this.f17873c) {
            return false;
        }
        this.f17872b = i10 + 1;
        longConsumer.accept(this.f17871a[i10]);
        return true;
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        return this.f17873c - this.f17872b;
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return this.f17874d;
    }

    @Override // j$.util.Spliterator
    public final java.util.Comparator getComparator() {
        if (c.e(this, 4)) {
            return null;
        }
        throw new IllegalStateException();
    }
}
