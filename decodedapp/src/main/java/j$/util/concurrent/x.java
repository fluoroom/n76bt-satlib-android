package j$.util.concurrent;

import j$.util.a1;
import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* JADX INFO: loaded from: classes2.dex */
public final class x implements a1 {

    /* JADX INFO: renamed from: a */
    public long f17785a;

    /* JADX INFO: renamed from: b */
    public final long f17786b;

    /* JADX INFO: renamed from: c */
    public final long f17787c;

    /* JADX INFO: renamed from: d */
    public final long f17788d;

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return 17728;
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        j$.util.c.c(this, consumer);
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
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return j$.util.c.h(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final Comparator getComparator() {
        throw new IllegalStateException();
    }

    public x(long j10, long j11, long j12, long j13) {
        this.f17785a = j10;
        this.f17786b = j11;
        this.f17787c = j12;
        this.f17788d = j13;
    }

    @Override // j$.util.d1, j$.util.Spliterator
    /* JADX INFO: renamed from: a */
    public final x trySplit() {
        long j10 = this.f17785a;
        long j11 = (this.f17786b + j10) >>> 1;
        if (j11 <= j10) {
            return null;
        }
        this.f17785a = j11;
        return new x(j10, j11, this.f17787c, this.f17788d);
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        return this.f17786b - this.f17785a;
    }

    @Override // j$.util.d1
    public final boolean tryAdvance(LongConsumer longConsumer) {
        longConsumer.getClass();
        long j10 = this.f17785a;
        if (j10 >= this.f17786b) {
            return false;
        }
        longConsumer.accept(ThreadLocalRandom.current().c(this.f17787c, this.f17788d));
        this.f17785a = j10 + 1;
        return true;
    }

    @Override // j$.util.d1
    public final void forEachRemaining(LongConsumer longConsumer) {
        longConsumer.getClass();
        long j10 = this.f17785a;
        long j11 = this.f17786b;
        if (j10 < j11) {
            this.f17785a = j11;
            ThreadLocalRandom threadLocalRandomCurrent = ThreadLocalRandom.current();
            do {
                longConsumer.accept(threadLocalRandomCurrent.c(this.f17787c, this.f17788d));
                j10++;
            } while (j10 < j11);
        }
    }
}
