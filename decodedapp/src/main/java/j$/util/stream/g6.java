package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import java.util.Arrays;
import java.util.Comparator;
import java.util.function.IntFunction;

/* JADX INFO: loaded from: classes2.dex */
public final class g6 extends b5 {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final boolean f17992s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Comparator f17993t;

    public g6(d5 d5Var) {
        super(d5Var, y6.f18268q | y6.f18266o);
        this.f17992s = true;
        this.f17993t = j$.util.f.INSTANCE;
    }

    public g6(d5 d5Var, Comparator comparator) {
        super(d5Var, y6.f18268q | y6.f18267p);
        this.f17992s = false;
        this.f17993t = (Comparator) Objects.requireNonNull(comparator);
    }

    @Override // j$.util.stream.a
    public final l5 Q0(int i10, l5 l5Var) {
        Objects.requireNonNull(l5Var);
        if (y6.SORTED.l(i10) && this.f17992s) {
            return l5Var;
        }
        if (y6.SIZED.l(i10)) {
            return new l6(l5Var, this.f17993t);
        }
        return new h6(l5Var, this.f17993t);
    }

    @Override // j$.util.stream.a
    public final g2 N0(v3 v3Var, Spliterator spliterator, IntFunction intFunction) {
        if (y6.SORTED.l(((a) v3Var).f17893m) && this.f17992s) {
            return v3Var.j0(spliterator, false, intFunction);
        }
        Object[] objArrM = v3Var.j0(spliterator, true, intFunction).m(intFunction);
        Arrays.sort(objArrM, this.f17993t);
        return new j2(objArrM);
    }
}
