package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterators;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* JADX INFO: loaded from: classes2.dex */
public final class r6 extends t6 implements j$.util.a1 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ s6 f18152g;

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        j$.util.c.c(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return j$.util.c.h(this, consumer);
    }

    @Override // j$.util.stream.t6
    public final void a(int i10, Object obj, Object obj2) {
        ((LongConsumer) obj2).accept(((long[]) obj)[i10]);
    }

    @Override // j$.util.stream.t6
    public final j$.util.d1 b(Object obj, int i10, int i11) {
        long[] jArr = (long[]) obj;
        int i12 = i11 + i10;
        Spliterators.a(((long[]) Objects.requireNonNull(jArr)).length, i10, i12);
        return new j$.util.r1(jArr, i10, i12, 1040);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r6(s6 s6Var, int i10, int i11, int i12, int i13) {
        super(s6Var, i10, i11, i12, i13);
        this.f18152g = s6Var;
    }

    @Override // j$.util.stream.t6
    public final j$.util.d1 c(int i10, int i11, int i12, int i13) {
        return new r6(this.f18152g, i10, i11, i12, i13);
    }
}
