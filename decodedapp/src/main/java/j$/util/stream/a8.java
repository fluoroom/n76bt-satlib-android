package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes2.dex */
public abstract class a8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Spliterator f17913a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f17914b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f17915c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f17916d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AtomicLong f17917e;

    public abstract Spliterator b(Spliterator spliterator);

    public a8(Spliterator spliterator, long j10, long j11) {
        this.f17913a = spliterator;
        this.f17914b = j11 < 0;
        this.f17916d = j11 >= 0 ? j11 : 0L;
        this.f17915c = 128;
        this.f17917e = new AtomicLong(j11 >= 0 ? j10 + j11 : j10);
    }

    public a8(Spliterator spliterator, a8 a8Var) {
        this.f17913a = spliterator;
        this.f17914b = a8Var.f17914b;
        this.f17917e = a8Var.f17917e;
        this.f17916d = a8Var.f17916d;
        this.f17915c = a8Var.f17915c;
    }

    public final long a(long j10) {
        long j11;
        boolean z10;
        long jMin;
        do {
            j11 = this.f17917e.get();
            z10 = this.f17914b;
            if (j11 != 0) {
                jMin = Math.min(j11, j10);
                if (jMin <= 0) {
                    break;
                }
            } else {
                if (z10) {
                    return j10;
                }
                return 0L;
            }
        } while (!this.f17917e.compareAndSet(j11, j11 - jMin));
        if (z10) {
            return Math.max(j10 - jMin, 0L);
        }
        long j12 = this.f17916d;
        return j11 > j12 ? Math.max(jMin - (j11 - j12), 0L) : jMin;
    }

    public final z7 f() {
        if (this.f17917e.get() > 0) {
            return z7.MAYBE_MORE;
        }
        return this.f17914b ? z7.UNLIMITED : z7.NO_MORE;
    }

    public final Spliterator trySplit() {
        Spliterator spliteratorTrySplit;
        if (this.f17917e.get() == 0 || (spliteratorTrySplit = this.f17913a.trySplit()) == null) {
            return null;
        }
        return b(spliteratorTrySplit);
    }

    public final long estimateSize() {
        return this.f17913a.estimateSize();
    }

    public final int characteristics() {
        return this.f17913a.characteristics() & (-16465);
    }

    /* JADX INFO: renamed from: trySplit, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ j$.util.d1 m1198trySplit() {
        return (j$.util.d1) trySplit();
    }

    /* JADX INFO: renamed from: trySplit, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ j$.util.x0 m1200trySplit() {
        return (j$.util.x0) trySplit();
    }

    /* JADX INFO: renamed from: trySplit, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ j$.util.a1 m1197trySplit() {
        return (j$.util.a1) trySplit();
    }

    /* JADX INFO: renamed from: trySplit, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ j$.util.u0 m1199trySplit() {
        return (j$.util.u0) trySplit();
    }
}
