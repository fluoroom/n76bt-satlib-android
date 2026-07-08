package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;
import java.util.concurrent.ForkJoinPool;

/* JADX INFO: loaded from: classes2.dex */
public abstract class d extends CountedCompleter {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f17944g = ForkJoinPool.getCommonPoolParallelism() << 2;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v3 f17945a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Spliterator f17946b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f17947c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public d f17948d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public d f17949e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f17950f;

    public abstract Object a();

    public abstract d c(Spliterator spliterator);

    public d(v3 v3Var, Spliterator spliterator) {
        super(null);
        this.f17945a = v3Var;
        this.f17946b = spliterator;
        this.f17947c = 0L;
    }

    public d(d dVar, Spliterator spliterator) {
        super(dVar);
        this.f17946b = spliterator;
        this.f17945a = dVar.f17945a;
        this.f17947c = dVar.f17947c;
    }

    public static long e(long j10) {
        long j11 = j10 / ((long) f17944g);
        if (j11 > 0) {
            return j11;
        }
        return 1L;
    }

    @Override // java.util.concurrent.CountedCompleter, java.util.concurrent.ForkJoinTask
    public Object getRawResult() {
        return this.f17950f;
    }

    @Override // java.util.concurrent.CountedCompleter, java.util.concurrent.ForkJoinTask
    public final void setRawResult(Object obj) {
        if (obj != null) {
            throw new IllegalStateException();
        }
    }

    public void d(Object obj) {
        this.f17950f = obj;
    }

    public final boolean b() {
        return ((d) getCompleter()) == null;
    }

    @Override // java.util.concurrent.CountedCompleter
    public void compute() {
        Spliterator spliteratorTrySplit;
        Spliterator spliterator = this.f17946b;
        long jEstimateSize = spliterator.estimateSize();
        long jE = this.f17947c;
        if (jE == 0) {
            jE = e(jEstimateSize);
            this.f17947c = jE;
        }
        boolean z10 = false;
        d dVar = this;
        while (jEstimateSize > jE && (spliteratorTrySplit = spliterator.trySplit()) != null) {
            d dVarC = dVar.c(spliteratorTrySplit);
            dVar.f17948d = dVarC;
            d dVarC2 = dVar.c(spliterator);
            dVar.f17949e = dVarC2;
            dVar.setPendingCount(1);
            if (z10) {
                spliterator = spliteratorTrySplit;
                dVar = dVarC;
                dVarC = dVarC2;
            } else {
                dVar = dVarC2;
            }
            z10 = !z10;
            dVarC.fork();
            jEstimateSize = spliterator.estimateSize();
        }
        dVar.d(dVar.a());
        dVar.tryComplete();
    }

    @Override // java.util.concurrent.CountedCompleter
    public void onCompletion(CountedCompleter countedCompleter) {
        this.f17946b = null;
        this.f17949e = null;
        this.f17948d = null;
    }
}
