package j$.util.stream;

import j$.util.Spliterator;

/* JADX INFO: loaded from: classes2.dex */
public abstract class t7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f18179a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f18180b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Spliterator f18181c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f18182d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f18183e;

    public abstract Spliterator a(Spliterator spliterator, long j10, long j11, long j12, long j13);

    public t7(Spliterator spliterator, long j10, long j11, long j12, long j13) {
        this.f18181c = spliterator;
        this.f18179a = j10;
        this.f18180b = j11;
        this.f18182d = j12;
        this.f18183e = j13;
    }

    public final Spliterator trySplit() {
        long j10 = this.f18183e;
        if (this.f18179a >= j10 || this.f18182d >= j10) {
            return null;
        }
        while (true) {
            Spliterator spliteratorTrySplit = this.f18181c.trySplit();
            if (spliteratorTrySplit == null) {
                return null;
            }
            long jEstimateSize = spliteratorTrySplit.estimateSize() + this.f18182d;
            long jMin = Math.min(jEstimateSize, this.f18180b);
            long j11 = this.f18179a;
            if (j11 >= jMin) {
                this.f18182d = jMin;
            } else {
                long j12 = this.f18180b;
                if (jMin >= j12) {
                    this.f18181c = spliteratorTrySplit;
                    this.f18183e = jMin;
                } else {
                    long j13 = this.f18182d;
                    if (j13 >= j11 && jEstimateSize <= j12) {
                        this.f18182d = jMin;
                        return spliteratorTrySplit;
                    }
                    this.f18182d = jMin;
                    return a(spliteratorTrySplit, j11, j12, j13, jMin);
                }
            }
        }
    }

    public final long estimateSize() {
        long j10 = this.f18183e;
        long j11 = this.f18179a;
        if (j11 < j10) {
            return j10 - Math.max(j11, this.f18182d);
        }
        return 0L;
    }

    public final int characteristics() {
        return this.f18181c.characteristics();
    }

    /* JADX INFO: renamed from: trySplit, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ j$.util.d1 m1202trySplit() {
        return (j$.util.d1) trySplit();
    }

    /* JADX INFO: renamed from: trySplit, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ j$.util.x0 m1204trySplit() {
        return (j$.util.x0) trySplit();
    }

    /* JADX INFO: renamed from: trySplit, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ j$.util.a1 m1201trySplit() {
        return (j$.util.a1) trySplit();
    }

    /* JADX INFO: renamed from: trySplit, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ j$.util.u0 m1203trySplit() {
        return (j$.util.u0) trySplit();
    }
}
