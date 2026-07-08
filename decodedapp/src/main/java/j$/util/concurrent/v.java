package j$.util.concurrent;

import j$.util.u0;
import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* JADX INFO: loaded from: classes2.dex */
public final class v implements u0 {

    /* JADX INFO: renamed from: a */
    public long f17777a;

    /* JADX INFO: renamed from: b */
    public final long f17778b;

    /* JADX INFO: renamed from: c */
    public final double f17779c;

    /* JADX INFO: renamed from: d */
    public final double f17780d;

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return 17728;
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        j$.util.c.a(this, consumer);
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
        return j$.util.c.f(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final Comparator getComparator() {
        throw new IllegalStateException();
    }

    public v(long j10, long j11, double d10, double d11) {
        this.f17777a = j10;
        this.f17778b = j11;
        this.f17779c = d10;
        this.f17780d = d11;
    }

    @Override // j$.util.u0, j$.util.d1, j$.util.Spliterator
    /* JADX INFO: renamed from: a */
    public final v trySplit() {
        long j10 = this.f17777a;
        long j11 = (this.f17778b + j10) >>> 1;
        if (j11 <= j10) {
            return null;
        }
        this.f17777a = j11;
        return new v(j10, j11, this.f17779c, this.f17780d);
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        return this.f17778b - this.f17777a;
    }

    @Override // j$.util.d1
    public final boolean tryAdvance(DoubleConsumer doubleConsumer) {
        doubleConsumer.getClass();
        long j10 = this.f17777a;
        if (j10 >= this.f17778b) {
            return false;
        }
        doubleConsumer.accept(ThreadLocalRandom.current().a(this.f17779c, this.f17780d));
        this.f17777a = j10 + 1;
        return true;
    }

    @Override // j$.util.d1
    public final void forEachRemaining(DoubleConsumer doubleConsumer) {
        doubleConsumer.getClass();
        long j10 = this.f17777a;
        long j11 = this.f17778b;
        if (j10 < j11) {
            this.f17777a = j11;
            ThreadLocalRandom threadLocalRandomCurrent = ThreadLocalRandom.current();
            do {
                doubleConsumer.accept(threadLocalRandomCurrent.a(this.f17779c, this.f17780d));
                j10++;
            } while (j10 < j11);
        }
    }
}
