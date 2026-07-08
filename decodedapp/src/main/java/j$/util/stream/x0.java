package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.IntConsumer;

/* JADX INFO: loaded from: classes2.dex */
public final class x0 extends a1 {
    @Override // j$.util.stream.a, j$.util.stream.g
    public final IntStream sequential() {
        this.f17888h.f17898r = false;
        return this;
    }

    @Override // j$.util.stream.a, j$.util.stream.g
    public final IntStream parallel() {
        this.f17888h.f17898r = true;
        return this;
    }

    @Override // j$.util.stream.a1, j$.util.stream.IntStream
    public final void forEach(IntConsumer intConsumer) {
        if (this.f17888h.f17898r) {
            super.forEach(intConsumer);
        } else {
            a1.U0(S0()).forEachRemaining(intConsumer);
        }
    }

    @Override // j$.util.stream.a1, j$.util.stream.IntStream
    public final void forEachOrdered(IntConsumer intConsumer) {
        if (this.f17888h.f17898r) {
            super.forEachOrdered(intConsumer);
        } else {
            a1.U0(S0()).forEachRemaining(intConsumer);
        }
    }

    @Override // j$.util.stream.g
    public final g unordered() {
        return !y6.ORDERED.l(this.f17893m) ? this : new t(this, y6.f18269r, 2);
    }

    @Override // j$.util.stream.a, j$.util.stream.g
    public final /* bridge */ /* synthetic */ Spliterator spliterator() {
        return spliterator();
    }

    @Override // j$.util.stream.a
    public final boolean P0() {
        throw new UnsupportedOperationException();
    }

    @Override // j$.util.stream.a
    public final l5 Q0(int i10, l5 l5Var) {
        throw new UnsupportedOperationException();
    }
}
