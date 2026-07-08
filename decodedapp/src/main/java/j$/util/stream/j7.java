package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* JADX INFO: loaded from: classes2.dex */
public final class j7 extends a7 implements j$.util.u0 {
    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        j$.util.c.a(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return j$.util.c.f(this, consumer);
    }

    @Override // j$.util.stream.a7
    public final a7 e(Spliterator spliterator) {
        return new j7(this.f17905b, spliterator, this.f17904a);
    }

    @Override // j$.util.stream.a7
    public final void d() {
        o6 o6Var = new o6();
        this.f17911h = o6Var;
        Objects.requireNonNull(o6Var);
        this.f17908e = this.f17905b.G0(new i7(o6Var, 1));
        this.f17909f = new j$.util.q(10, this);
    }

    @Override // j$.util.stream.a7, j$.util.Spliterator
    public final Spliterator trySplit() {
        return (j$.util.u0) super.trySplit();
    }

    @Override // j$.util.stream.a7, j$.util.Spliterator
    public final j$.util.d1 trySplit() {
        return (j$.util.u0) super.trySplit();
    }

    @Override // j$.util.stream.a7, j$.util.Spliterator
    public final j$.util.u0 trySplit() {
        return (j$.util.u0) super.trySplit();
    }

    @Override // j$.util.d1
    public final boolean tryAdvance(DoubleConsumer doubleConsumer) {
        double d10;
        Objects.requireNonNull(doubleConsumer);
        boolean zA = a();
        if (zA) {
            o6 o6Var = (o6) this.f17911h;
            long j10 = this.f17910g;
            int iR = o6Var.r(j10);
            if (o6Var.f17936c == 0 && iR == 0) {
                d10 = ((double[]) o6Var.f18198e)[(int) j10];
            } else {
                d10 = ((double[][]) o6Var.f18199f)[iR][(int) (j10 - o6Var.f17937d[iR])];
            }
            doubleConsumer.accept(d10);
        }
        return zA;
    }

    @Override // j$.util.d1
    public final void forEachRemaining(DoubleConsumer doubleConsumer) {
        if (this.f17911h == null && !this.f17912i) {
            Objects.requireNonNull(doubleConsumer);
            c();
            Objects.requireNonNull(doubleConsumer);
            i7 i7Var = new i7(doubleConsumer, 0);
            this.f17905b.F0(this.f17907d, i7Var);
            this.f17912i = true;
            return;
        }
        while (tryAdvance(doubleConsumer)) {
        }
    }
}
