package j$.util.stream;

import java.util.function.IntConsumer;
import java.util.function.IntFunction;
import java.util.function.IntPredicate;
import java.util.function.IntToDoubleFunction;
import java.util.function.IntToLongFunction;
import java.util.function.IntUnaryOperator;

/* JADX INFO: loaded from: classes2.dex */
public final class t0 extends f5 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f18166b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a f18167c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t0(a aVar, l5 l5Var, int i10) {
        super(l5Var);
        this.f18166b = i10;
        this.f18167c = aVar;
    }

    @Override // j$.util.stream.f5, j$.util.stream.l5
    public void c(long j10) {
        switch (this.f18166b) {
            case 5:
                this.f17981a.c(-1L);
                break;
            default:
                super.c(j10);
                break;
        }
    }

    @Override // j$.util.stream.j5, j$.util.stream.l5
    public final void accept(int i10) {
        switch (this.f18166b) {
            case 0:
                this.f17981a.accept(((IntFunction) ((r) this.f18167c).f18134t).apply(i10));
                return;
            case 1:
                ((IntConsumer) ((u0) this.f18167c).f18191t).accept(i10);
                this.f17981a.accept(i10);
                return;
            case 2:
                ((t) this.f18167c).getClass();
                IntUnaryOperator intUnaryOperator = null;
                intUnaryOperator.applyAsInt(i10);
                throw null;
            case 3:
                ((u) this.f18167c).getClass();
                IntToLongFunction intToLongFunction = null;
                intToLongFunction.applyAsLong(i10);
                throw null;
            case 4:
                ((s) this.f18167c).getClass();
                IntToDoubleFunction intToDoubleFunction = null;
                intToDoubleFunction.applyAsDouble(i10);
                throw null;
            default:
                ((t) this.f18167c).getClass();
                IntPredicate intPredicate = null;
                intPredicate.test(i10);
                throw null;
        }
    }
}
