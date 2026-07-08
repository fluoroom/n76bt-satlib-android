package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.IntFunction;
import java.util.function.Predicate;

/* JADX INFO: loaded from: classes2.dex */
public final class j8 extends b5 implements r8 {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f18038s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Predicate f18039t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j8(d5 d5Var, int i10, Predicate predicate, int i11) {
        super(d5Var, i10);
        this.f18038s = i11;
        this.f18039t = predicate;
    }

    @Override // j$.util.stream.a
    public final Spliterator O0(a aVar, Spliterator spliterator) {
        switch (this.f18038s) {
            case 0:
                return y6.ORDERED.l(aVar.f17893m) ? N0(aVar, spliterator, new b1(7)).spliterator() : new y8(aVar.H0(spliterator), this.f18039t, 1);
            default:
                return y6.ORDERED.l(aVar.f17893m) ? N0(aVar, spliterator, new b1(7)).spliterator() : new y8(aVar.H0(spliterator), this.f18039t, 0);
        }
    }

    @Override // j$.util.stream.a
    public final g2 N0(v3 v3Var, Spliterator spliterator, IntFunction intFunction) {
        switch (this.f18038s) {
            case 0:
                return (g2) new u8(this, v3Var, spliterator, intFunction).invoke();
            default:
                return (g2) new t8(this, v3Var, spliterator, intFunction).invoke();
        }
    }

    @Override // j$.util.stream.a
    public final l5 Q0(int i10, l5 l5Var) {
        switch (this.f18038s) {
            case 0:
                return new l(this, l5Var);
            default:
                return new k8(this, l5Var, false);
        }
    }

    @Override // j$.util.stream.r8
    public s8 h(y1 y1Var, boolean z10) {
        return new k8(this, y1Var, z10);
    }
}
