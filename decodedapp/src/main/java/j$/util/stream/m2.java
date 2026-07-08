package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;
import java.util.function.BinaryOperator;
import java.util.function.LongFunction;

/* JADX INFO: loaded from: classes2.dex */
public class m2 extends d {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final v3 f18076h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final LongFunction f18077i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final BinaryOperator f18078j;

    @Override // j$.util.stream.d, java.util.concurrent.CountedCompleter
    public final void onCompletion(CountedCompleter countedCompleter) {
        d dVar = this.f17948d;
        if (dVar != null) {
            this.f17950f = (g2) this.f18078j.apply((g2) ((m2) dVar).f17950f, (g2) ((m2) this.f17949e).f17950f);
        }
        super.onCompletion(countedCompleter);
    }

    public m2(v3 v3Var, Spliterator spliterator, LongFunction longFunction, BinaryOperator binaryOperator) {
        super(v3Var, spliterator);
        this.f18076h = v3Var;
        this.f18077i = longFunction;
        this.f18078j = binaryOperator;
    }

    public m2(m2 m2Var, Spliterator spliterator) {
        super(m2Var, spliterator);
        this.f18076h = m2Var.f18076h;
        this.f18077i = m2Var.f18077i;
        this.f18078j = m2Var.f18078j;
    }

    @Override // j$.util.stream.d
    public d c(Spliterator spliterator) {
        return new m2(this, spliterator);
    }

    @Override // j$.util.stream.d
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public final g2 a() {
        y1 y1Var = (y1) this.f18077i.apply(this.f18076h.k0(this.f17946b));
        this.f18076h.F0(this.f17946b, y1Var);
        return y1Var.build();
    }
}
