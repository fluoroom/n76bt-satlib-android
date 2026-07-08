package j$.util.stream;

import java.util.function.DoubleConsumer;
import java.util.function.DoubleFunction;
import java.util.function.DoublePredicate;
import java.util.function.DoubleToIntFunction;
import java.util.function.DoubleToLongFunction;
import java.util.function.DoubleUnaryOperator;

/* JADX INFO: loaded from: classes2.dex */
public final class q extends e5 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f18126b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a f18127c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(a aVar, l5 l5Var, int i10) {
        super(l5Var);
        this.f18126b = i10;
        this.f18127c = aVar;
    }

    @Override // j$.util.stream.e5, j$.util.stream.l5
    public void c(long j10) {
        switch (this.f18126b) {
            case 4:
                this.f17969a.c(-1L);
                break;
            default:
                super.c(j10);
                break;
        }
    }

    @Override // j$.util.stream.i5, j$.util.stream.l5
    public final void accept(double d10) {
        switch (this.f18126b) {
            case 0:
                this.f17969a.accept(((DoubleFunction) ((r) this.f18127c).f18134t).apply(d10));
                return;
            case 1:
                ((s) this.f18127c).getClass();
                DoubleUnaryOperator doubleUnaryOperator = null;
                doubleUnaryOperator.applyAsDouble(d10);
                throw null;
            case 2:
                ((t) this.f18127c).getClass();
                DoubleToIntFunction doubleToIntFunction = null;
                doubleToIntFunction.applyAsInt(d10);
                throw null;
            case 3:
                ((u) this.f18127c).getClass();
                DoubleToLongFunction doubleToLongFunction = null;
                doubleToLongFunction.applyAsLong(d10);
                throw null;
            case 4:
                ((s) this.f18127c).getClass();
                DoublePredicate doublePredicate = null;
                doublePredicate.test(d10);
                throw null;
            default:
                ((DoubleConsumer) ((w) this.f18127c).f18230t).accept(d10);
                this.f17969a.accept(d10);
                return;
        }
    }
}
