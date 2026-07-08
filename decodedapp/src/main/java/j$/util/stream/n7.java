package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* JADX INFO: loaded from: classes2.dex */
public final class n7 extends a7 implements j$.util.a1 {
    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        j$.util.c.c(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return j$.util.c.h(this, consumer);
    }

    @Override // j$.util.stream.a7
    public final a7 e(Spliterator spliterator) {
        return new n7(this.f17905b, spliterator, this.f17904a);
    }

    @Override // j$.util.stream.a7
    public final void d() {
        s6 s6Var = new s6();
        this.f17911h = s6Var;
        Objects.requireNonNull(s6Var);
        this.f17908e = this.f17905b.G0(new m7(s6Var, 1));
        this.f17909f = new j$.util.q(12, this);
    }

    @Override // j$.util.stream.a7, j$.util.Spliterator
    public final Spliterator trySplit() {
        return (j$.util.a1) super.trySplit();
    }

    @Override // j$.util.stream.a7, j$.util.Spliterator
    public final j$.util.a1 trySplit() {
        return (j$.util.a1) super.trySplit();
    }

    @Override // j$.util.stream.a7, j$.util.Spliterator
    public final j$.util.d1 trySplit() {
        return (j$.util.a1) super.trySplit();
    }

    @Override // j$.util.d1
    public final boolean tryAdvance(LongConsumer longConsumer) {
        long j10;
        Objects.requireNonNull(longConsumer);
        boolean zA = a();
        if (zA) {
            s6 s6Var = (s6) this.f17911h;
            long j11 = this.f17910g;
            int iR = s6Var.r(j11);
            if (s6Var.f17936c == 0 && iR == 0) {
                j10 = ((long[]) s6Var.f18198e)[(int) j11];
            } else {
                j10 = ((long[][]) s6Var.f18199f)[iR][(int) (j11 - s6Var.f17937d[iR])];
            }
            longConsumer.accept(j10);
        }
        return zA;
    }

    @Override // j$.util.d1
    public final void forEachRemaining(LongConsumer longConsumer) {
        if (this.f17911h == null && !this.f17912i) {
            Objects.requireNonNull(longConsumer);
            c();
            Objects.requireNonNull(longConsumer);
            m7 m7Var = new m7(longConsumer, 0);
            this.f17905b.F0(this.f17907d, m7Var);
            this.f17912i = true;
            return;
        }
        while (tryAdvance(longConsumer)) {
        }
    }
}
