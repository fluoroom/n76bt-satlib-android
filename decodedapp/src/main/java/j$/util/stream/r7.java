package j$.util.stream;

import j$.util.Objects;
import java.util.Comparator;
import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;

/* JADX INFO: loaded from: classes2.dex */
public abstract class r7 extends t7 implements j$.util.d1 {
    public abstract Object b();

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

    public r7(j$.util.d1 d1Var, long j10, long j11) {
        super(d1Var, j10, j11, 0L, Math.min(d1Var.estimateSize(), j11));
    }

    @Override // j$.util.d1
    public final boolean tryAdvance(Object obj) {
        long j10;
        Objects.requireNonNull(obj);
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
            ((j$.util.d1) this.f18181c).tryAdvance(b());
            this.f18182d++;
        }
        if (j10 >= this.f18183e) {
            return false;
        }
        this.f18182d = j10 + 1;
        return ((j$.util.d1) this.f18181c).tryAdvance(obj);
    }

    @Override // j$.util.d1
    public final void forEachRemaining(Object obj) {
        Objects.requireNonNull(obj);
        long j10 = this.f18183e;
        long j11 = this.f18179a;
        if (j11 >= j10) {
            return;
        }
        long j12 = this.f18182d;
        if (j12 >= j10) {
            return;
        }
        if (j12 >= j11 && ((j$.util.d1) this.f18181c).estimateSize() + j12 <= this.f18180b) {
            ((j$.util.d1) this.f18181c).forEachRemaining(obj);
            this.f18182d = this.f18183e;
            return;
        }
        while (j11 > this.f18182d) {
            ((j$.util.d1) this.f18181c).tryAdvance(b());
            this.f18182d++;
        }
        while (this.f18182d < this.f18183e) {
            ((j$.util.d1) this.f18181c).tryAdvance(obj);
            this.f18182d++;
        }
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(IntConsumer intConsumer) {
        forEachRemaining((Object) intConsumer);
    }

    public /* bridge */ /* synthetic */ boolean tryAdvance(IntConsumer intConsumer) {
        return tryAdvance((Object) intConsumer);
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(LongConsumer longConsumer) {
        forEachRemaining((Object) longConsumer);
    }

    public /* bridge */ /* synthetic */ boolean tryAdvance(LongConsumer longConsumer) {
        return tryAdvance((Object) longConsumer);
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(DoubleConsumer doubleConsumer) {
        forEachRemaining((Object) doubleConsumer);
    }

    public /* bridge */ /* synthetic */ boolean tryAdvance(DoubleConsumer doubleConsumer) {
        return tryAdvance((Object) doubleConsumer);
    }
}
