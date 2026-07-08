package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* JADX INFO: loaded from: classes2.dex */
public final class u7 extends x7 implements j$.util.u0, DoubleConsumer {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public double f18200f;

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return j$.com.android.tools.r8.a.b(this, doubleConsumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        j$.util.c.a(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return j$.util.c.f(this, consumer);
    }

    @Override // j$.util.stream.a8
    public final Spliterator b(Spliterator spliterator) {
        return new u7((j$.util.u0) spliterator, this);
    }

    @Override // j$.util.stream.x7
    public final void g(Object obj) {
        ((DoubleConsumer) obj).accept(this.f18200f);
    }

    @Override // java.util.function.DoubleConsumer
    public final void accept(double d10) {
        this.f18200f = d10;
    }

    @Override // j$.util.stream.x7
    public final e7 i(int i10) {
        return new b7(i10);
    }
}
