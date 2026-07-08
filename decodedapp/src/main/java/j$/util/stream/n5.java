package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.IntFunction;

/* JADX INFO: loaded from: classes2.dex */
public final class n5 extends b5 {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ long f18100s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ long f18101t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n5(d5 d5Var, int i10, long j10, long j11) {
        super(d5Var, i10);
        this.f18100s = j10;
        this.f18101t = j11;
    }

    @Override // j$.util.stream.a
    public final Spliterator O0(a aVar, Spliterator spliterator) {
        long jK0 = aVar.k0(spliterator);
        if (jK0 > 0 && spliterator.hasCharacteristics(16384)) {
            Spliterator spliteratorH0 = aVar.H0(spliterator);
            long j10 = this.f18100s;
            return new s7(spliteratorH0, j10, v3.Z(j10, this.f18101t));
        }
        if (y6.ORDERED.l(aVar.f17893m)) {
            return ((g2) new v5(this, aVar, spliterator, new b1(7), this.f18100s, this.f18101t).invoke()).spliterator();
        }
        Spliterator spliteratorH02 = aVar.H0(spliterator);
        long j11 = this.f18100s;
        long j12 = this.f18101t;
        if (j11 <= jK0) {
            long jMin = jK0 - j11;
            if (j12 >= 0) {
                jMin = Math.min(j12, jMin);
            }
            j12 = jMin;
            j11 = 0;
        }
        return new y7(spliteratorH02, j11, j12);
    }

    @Override // j$.util.stream.a
    public final g2 N0(v3 v3Var, Spliterator spliterator, IntFunction intFunction) {
        long jMin;
        long j10;
        long jK0 = v3Var.k0(spliterator);
        if (jK0 > 0 && spliterator.hasCharacteristics(16384)) {
            a aVar = (a) v3Var;
            while (aVar.f17892l > 0) {
                aVar = aVar.f17889i;
            }
            return v3.a0(v3Var, v3.X(aVar.M0(), spliterator, this.f18100s, this.f18101t), true, intFunction);
        }
        if (!y6.ORDERED.l(((a) v3Var).f17893m)) {
            Spliterator spliteratorH0 = v3Var.H0(spliterator);
            long j11 = this.f18100s;
            long j12 = this.f18101t;
            if (j11 <= jK0) {
                long j13 = jK0 - j11;
                jMin = j12 >= 0 ? Math.min(j12, j13) : j13;
                j10 = 0;
            } else {
                jMin = j12;
                j10 = j11;
            }
            return v3.a0(this, new y7(spliteratorH0, j10, jMin), true, intFunction);
        }
        return (g2) new v5(this, v3Var, spliterator, intFunction, this.f18100s, this.f18101t).invoke();
    }

    @Override // j$.util.stream.a
    public final l5 Q0(int i10, l5 l5Var) {
        return new m5(this, l5Var);
    }
}
