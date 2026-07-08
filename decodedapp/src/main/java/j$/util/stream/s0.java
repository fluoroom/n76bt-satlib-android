package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;

/* JADX INFO: loaded from: classes2.dex */
public final class s0 extends CountedCompleter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Spliterator f18154a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l5 f18155b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v3 f18156c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f18157d;

    public s0(v3 v3Var, Spliterator spliterator, l5 l5Var) {
        super(null);
        this.f18155b = l5Var;
        this.f18156c = v3Var;
        this.f18154a = spliterator;
        this.f18157d = 0L;
    }

    public s0(s0 s0Var, Spliterator spliterator) {
        super(s0Var);
        this.f18154a = spliterator;
        this.f18155b = s0Var.f18155b;
        this.f18157d = s0Var.f18157d;
        this.f18156c = s0Var.f18156c;
    }

    @Override // java.util.concurrent.CountedCompleter
    public final void compute() {
        Spliterator spliteratorTrySplit;
        Spliterator spliterator = this.f18154a;
        long jEstimateSize = spliterator.estimateSize();
        long jE = this.f18157d;
        if (jE == 0) {
            jE = d.e(jEstimateSize);
            this.f18157d = jE;
        }
        boolean zL = y6.SHORT_CIRCUIT.l(((a) this.f18156c).f17893m);
        l5 l5Var = this.f18155b;
        boolean z10 = false;
        s0 s0Var = this;
        while (true) {
            if (zL && l5Var.e()) {
                break;
            }
            if (jEstimateSize <= jE || (spliteratorTrySplit = spliterator.trySplit()) == null) {
                break;
            }
            s0 s0Var2 = new s0(s0Var, spliteratorTrySplit);
            s0Var.addToPendingCount(1);
            if (z10) {
                spliterator = spliteratorTrySplit;
            } else {
                s0 s0Var3 = s0Var;
                s0Var = s0Var2;
                s0Var2 = s0Var3;
            }
            z10 = !z10;
            s0Var.fork();
            s0Var = s0Var2;
            jEstimateSize = spliterator.estimateSize();
        }
        s0Var.f18156c.f0(spliterator, l5Var);
        s0Var.f18154a = null;
        s0Var.propagateCompletion();
    }
}
