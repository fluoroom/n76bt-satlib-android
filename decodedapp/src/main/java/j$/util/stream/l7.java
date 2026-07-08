package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: loaded from: classes2.dex */
public final class l7 extends a7 implements j$.util.x0 {
    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        j$.util.c.b(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return j$.util.c.g(this, consumer);
    }

    @Override // j$.util.stream.a7
    public final a7 e(Spliterator spliterator) {
        return new l7(this.f17905b, spliterator, this.f17904a);
    }

    @Override // j$.util.stream.a7
    public final void d() {
        q6 q6Var = new q6();
        this.f17911h = q6Var;
        Objects.requireNonNull(q6Var);
        this.f17908e = this.f17905b.G0(new k7(q6Var, 1));
        this.f17909f = new j$.util.q(11, this);
    }

    @Override // j$.util.stream.a7, j$.util.Spliterator
    public final Spliterator trySplit() {
        return (j$.util.x0) super.trySplit();
    }

    @Override // j$.util.stream.a7, j$.util.Spliterator
    public final j$.util.d1 trySplit() {
        return (j$.util.x0) super.trySplit();
    }

    @Override // j$.util.stream.a7, j$.util.Spliterator
    public final j$.util.x0 trySplit() {
        return (j$.util.x0) super.trySplit();
    }

    @Override // j$.util.d1
    public final boolean tryAdvance(IntConsumer intConsumer) {
        int i10;
        Objects.requireNonNull(intConsumer);
        boolean zA = a();
        if (zA) {
            q6 q6Var = (q6) this.f17911h;
            long j10 = this.f17910g;
            int iR = q6Var.r(j10);
            if (q6Var.f17936c == 0 && iR == 0) {
                i10 = ((int[]) q6Var.f18198e)[(int) j10];
            } else {
                i10 = ((int[][]) q6Var.f18199f)[iR][(int) (j10 - q6Var.f17937d[iR])];
            }
            intConsumer.accept(i10);
        }
        return zA;
    }

    @Override // j$.util.d1
    public final void forEachRemaining(IntConsumer intConsumer) {
        if (this.f17911h == null && !this.f17912i) {
            Objects.requireNonNull(intConsumer);
            c();
            Objects.requireNonNull(intConsumer);
            k7 k7Var = new k7(intConsumer, 0);
            this.f17905b.F0(this.f17907d, k7Var);
            this.f17912i = true;
            return;
        }
        while (tryAdvance(intConsumer)) {
        }
    }
}
