package j$.util.concurrent;

import j$.util.x0;
import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: loaded from: classes2.dex */
public final class w implements x0 {

    /* JADX INFO: renamed from: a */
    public long f17781a;

    /* JADX INFO: renamed from: b */
    public final long f17782b;

    /* JADX INFO: renamed from: c */
    public final int f17783c;

    /* JADX INFO: renamed from: d */
    public final int f17784d;

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return 17728;
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        j$.util.c.b(this, consumer);
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
        return j$.util.c.g(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final Comparator getComparator() {
        throw new IllegalStateException();
    }

    public w(long j10, long j11, int i10, int i11) {
        this.f17781a = j10;
        this.f17782b = j11;
        this.f17783c = i10;
        this.f17784d = i11;
    }

    @Override // j$.util.x0, j$.util.d1, j$.util.Spliterator
    /* JADX INFO: renamed from: a */
    public final w trySplit() {
        long j10 = this.f17781a;
        long j11 = (this.f17782b + j10) >>> 1;
        if (j11 <= j10) {
            return null;
        }
        this.f17781a = j11;
        return new w(j10, j11, this.f17783c, this.f17784d);
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        return this.f17782b - this.f17781a;
    }

    @Override // j$.util.d1
    public final boolean tryAdvance(IntConsumer intConsumer) {
        intConsumer.getClass();
        long j10 = this.f17781a;
        if (j10 >= this.f17782b) {
            return false;
        }
        intConsumer.accept(ThreadLocalRandom.current().b(this.f17783c, this.f17784d));
        this.f17781a = j10 + 1;
        return true;
    }

    @Override // j$.util.d1
    public final void forEachRemaining(IntConsumer intConsumer) {
        intConsumer.getClass();
        long j10 = this.f17781a;
        long j11 = this.f17782b;
        if (j10 < j11) {
            this.f17781a = j11;
            ThreadLocalRandom threadLocalRandomCurrent = ThreadLocalRandom.current();
            do {
                intConsumer.accept(threadLocalRandomCurrent.b(this.f17783c, this.f17784d));
                j10++;
            } while (j10 < j11);
        }
    }
}
