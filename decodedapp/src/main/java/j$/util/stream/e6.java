package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import java.util.Arrays;
import java.util.function.IntFunction;

/* JADX INFO: loaded from: classes2.dex */
public final class e6 extends y0 implements r8 {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f17970s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e6(a aVar, int i10, int i11) {
        super(aVar, i10);
        this.f17970s = i11;
    }

    @Override // j$.util.stream.a
    public Spliterator O0(a aVar, Spliterator spliterator) {
        switch (this.f17970s) {
            case 1:
                return y6.ORDERED.l(aVar.f17893m) ? N0(aVar, spliterator, new b1(21)).spliterator() : new w8((j$.util.x0) aVar.H0(spliterator), 1);
            case 2:
                return y6.ORDERED.l(aVar.f17893m) ? N0(aVar, spliterator, new b1(22)).spliterator() : new w8((j$.util.x0) aVar.H0(spliterator), 0);
            default:
                return super.O0(aVar, spliterator);
        }
    }

    @Override // j$.util.stream.a
    public final g2 N0(v3 v3Var, Spliterator spliterator, IntFunction intFunction) {
        switch (this.f17970s) {
            case 0:
                if (y6.SORTED.l(((a) v3Var).f17893m)) {
                    return v3Var.j0(spliterator, false, intFunction);
                }
                int[] iArr = (int[]) ((c2) v3Var.j0(spliterator, true, intFunction)).b();
                Arrays.sort(iArr);
                return new b3(iArr);
            case 1:
                return (g2) new u8(this, v3Var, spliterator, intFunction).invoke();
            default:
                return (g2) new t8(this, v3Var, spliterator, intFunction).invoke();
        }
    }

    @Override // j$.util.stream.a
    public final l5 Q0(int i10, l5 l5Var) {
        switch (this.f17970s) {
            case 0:
                Objects.requireNonNull(l5Var);
                if (y6.SORTED.l(i10)) {
                    return l5Var;
                }
                return y6.SIZED.l(i10) ? new j6(l5Var) : new b6(l5Var);
            case 1:
                return new l8(this, l5Var);
            default:
                return new m8(this, l5Var, false);
        }
    }

    @Override // j$.util.stream.r8
    public s8 h(y1 y1Var, boolean z10) {
        return new m8(this, y1Var, z10);
    }
}
