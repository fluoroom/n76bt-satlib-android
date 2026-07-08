package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* JADX INFO: loaded from: classes2.dex */
public final class w7 extends x7 implements j$.util.a1, LongConsumer {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f18239f;

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return j$.com.android.tools.r8.a.d(this, longConsumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        j$.util.c.c(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return j$.util.c.h(this, consumer);
    }

    @Override // j$.util.stream.a8
    public final Spliterator b(Spliterator spliterator) {
        return new w7((j$.util.a1) spliterator, this);
    }

    @Override // j$.util.stream.x7
    public final void g(Object obj) {
        ((LongConsumer) obj).accept(this.f18239f);
    }

    @Override // java.util.function.LongConsumer
    public final void accept(long j10) {
        this.f18239f = j10;
    }

    @Override // j$.util.stream.x7
    public final e7 i(int i10) {
        return new d7(i10);
    }
}
