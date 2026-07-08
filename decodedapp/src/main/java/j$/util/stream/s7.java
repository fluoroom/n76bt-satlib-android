package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import java.util.Comparator;
import java.util.function.Consumer;

/* JADX INFO: loaded from: classes2.dex */
public final class s7 extends t7 implements Spliterator {
    @Override // j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return j$.util.c.d(this);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i10) {
        return j$.util.c.e(this, i10);
    }

    @Override // j$.util.Spliterator
    public final Comparator getComparator() {
        throw new IllegalStateException();
    }

    public s7(Spliterator spliterator, long j10, long j11) {
        super(spliterator, j10, j11, 0L, Math.min(spliterator.estimateSize(), j11));
    }

    @Override // j$.util.stream.t7
    public final Spliterator a(Spliterator spliterator, long j10, long j11, long j12, long j13) {
        return new s7(spliterator, j10, j11, j12, j13);
    }

    @Override // j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer) {
        long j10;
        Objects.requireNonNull(consumer);
        long j11 = this.f18183e;
        long j12 = this.f18179a;
        if (j12 >= j11) {
            return false;
        }
        while (true) {
            j10 = this.f18182d;
            if (j12 <= j10) {
                break;
            }
            this.f18181c.tryAdvance(new b1(19));
            this.f18182d++;
        }
        if (j10 >= this.f18183e) {
            return false;
        }
        this.f18182d = j10 + 1;
        return this.f18181c.tryAdvance(consumer);
    }

    @Override // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        Objects.requireNonNull(consumer);
        long j10 = this.f18183e;
        long j11 = this.f18179a;
        if (j11 >= j10) {
            return;
        }
        long j12 = this.f18182d;
        if (j12 >= j10) {
            return;
        }
        if (j12 >= j11 && this.f18181c.estimateSize() + j12 <= this.f18180b) {
            this.f18181c.forEachRemaining(consumer);
            this.f18182d = this.f18183e;
            return;
        }
        while (j11 > this.f18182d) {
            this.f18181c.tryAdvance(new b1(20));
            this.f18182d++;
        }
        while (this.f18182d < this.f18183e) {
            this.f18181c.tryAdvance(consumer);
            this.f18182d++;
        }
    }
}
