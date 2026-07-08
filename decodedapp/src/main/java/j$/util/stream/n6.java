package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterators;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* JADX INFO: loaded from: classes2.dex */
public final class n6 extends t6 implements j$.util.u0 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ o6 f18102g;

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        j$.util.c.a(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return j$.util.c.f(this, consumer);
    }

    @Override // j$.util.stream.t6
    public final void a(int i10, Object obj, Object obj2) {
        ((DoubleConsumer) obj2).accept(((double[]) obj)[i10]);
    }

    @Override // j$.util.stream.t6
    public final j$.util.d1 b(Object obj, int i10, int i11) {
        double[] dArr = (double[]) obj;
        int i12 = i11 + i10;
        Spliterators.a(((double[]) Objects.requireNonNull(dArr)).length, i10, i12);
        return new j$.util.k1(dArr, i10, i12, 1040);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n6(o6 o6Var, int i10, int i11, int i12, int i13) {
        super(o6Var, i10, i11, i12, i13);
        this.f18102g = o6Var;
    }

    @Override // j$.util.stream.t6
    public final j$.util.d1 c(int i10, int i11, int i12, int i13) {
        return new n6(this.f18102g, i10, i11, i12, i13);
    }
}
