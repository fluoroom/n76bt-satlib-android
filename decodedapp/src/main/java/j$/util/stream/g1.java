package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.LongConsumer;

/* JADX INFO: loaded from: classes2.dex */
public final class g1 extends j1 {
    @Override // j$.util.stream.a, j$.util.stream.g
    public final m1 sequential() {
        this.f17888h.f17898r = false;
        return this;
    }

    @Override // j$.util.stream.a, j$.util.stream.g
    public final m1 parallel() {
        this.f17888h.f17898r = true;
        return this;
    }

    @Override // j$.util.stream.j1, j$.util.stream.m1
    public final void forEach(LongConsumer longConsumer) {
        if (this.f17888h.f17898r) {
            super.forEach(longConsumer);
        } else {
            j1.U0(S0()).forEachRemaining(longConsumer);
        }
    }

    @Override // j$.util.stream.j1, j$.util.stream.m1
    public final void forEachOrdered(LongConsumer longConsumer) {
        if (this.f17888h.f17898r) {
            super.forEachOrdered(longConsumer);
        } else {
            j1.U0(S0()).forEachRemaining(longConsumer);
        }
    }

    @Override // j$.util.stream.g
    public final g unordered() {
        return !y6.ORDERED.l(this.f17893m) ? this : new u(this, y6.f18269r, 4);
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
