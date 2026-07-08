package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.Consumer$CC;
import java.util.concurrent.CountedCompleter;
import java.util.function.Consumer;

/* JADX INFO: loaded from: classes2.dex */
public abstract class r3 extends CountedCompleter implements l5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Spliterator f18142a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v3 f18143b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f18144c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f18145d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f18146e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f18147f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f18148g;

    public abstract r3 a(Spliterator spliterator, long j10, long j11);

    public /* synthetic */ void accept(double d10) {
        v3.C();
        throw null;
    }

    public /* synthetic */ void accept(int i10) {
        v3.J();
        throw null;
    }

    public /* synthetic */ void accept(long j10) {
        v3.K();
        throw null;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.stream.l5
    public final /* synthetic */ boolean e() {
        return false;
    }

    @Override // j$.util.stream.l5
    public final /* synthetic */ void end() {
    }

    public r3(Spliterator spliterator, v3 v3Var, int i10) {
        this.f18142a = spliterator;
        this.f18143b = v3Var;
        this.f18144c = d.e(spliterator.estimateSize());
        this.f18145d = 0L;
        this.f18146e = i10;
    }

    public r3(r3 r3Var, Spliterator spliterator, long j10, long j11, int i10) {
        super(r3Var);
        this.f18142a = spliterator;
        this.f18143b = r3Var.f18143b;
        this.f18144c = r3Var.f18144c;
        this.f18145d = j10;
        this.f18146e = j11;
        if (j10 < 0 || j11 < 0 || (j10 + j11) - 1 >= i10) {
            throw new IllegalArgumentException(String.format("offset and length interval [%d, %d + %d) is not within array size interval [0, %d)", Long.valueOf(j10), Long.valueOf(j10), Long.valueOf(j11), Integer.valueOf(i10)));
        }
    }

    @Override // java.util.concurrent.CountedCompleter
    public final void compute() {
        Spliterator spliteratorTrySplit;
        Spliterator spliterator = this.f18142a;
        r3 r3VarA = this;
        while (spliterator.estimateSize() > r3VarA.f18144c && (spliteratorTrySplit = spliterator.trySplit()) != null) {
            r3VarA.setPendingCount(1);
            long jEstimateSize = spliteratorTrySplit.estimateSize();
            r3 r3Var = r3VarA;
            r3Var.a(spliteratorTrySplit, r3VarA.f18145d, jEstimateSize).fork();
            r3VarA = r3Var.a(spliterator, r3Var.f18145d + jEstimateSize, r3Var.f18146e - jEstimateSize);
        }
        r3 r3Var2 = r3VarA;
        r3Var2.f18143b.F0(spliterator, r3Var2);
        r3Var2.propagateCompletion();
    }

    @Override // j$.util.stream.l5
    public final void c(long j10) {
        long j11 = this.f18146e;
        if (j10 > j11) {
            throw new IllegalStateException("size passed to Sink.begin exceeds array length");
        }
        int i10 = (int) this.f18145d;
        this.f18147f = i10;
        this.f18148g = i10 + ((int) j11);
    }
}
