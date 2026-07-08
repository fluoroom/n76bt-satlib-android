package j$.util.stream;

import java.util.function.IntPredicate;

/* JADX INFO: loaded from: classes2.dex */
public final class l8 extends f5 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f18072b;

    public l8(e6 e6Var, l5 l5Var) {
        super(l5Var);
        this.f18072b = true;
    }

    @Override // j$.util.stream.f5, j$.util.stream.l5
    public final void c(long j10) {
        this.f17981a.c(-1L);
    }

    @Override // j$.util.stream.j5, j$.util.stream.l5
    public final void accept(int i10) {
        if (this.f18072b) {
            IntPredicate intPredicate = null;
            intPredicate.test(i10);
            throw null;
        }
    }

    @Override // j$.util.stream.f5, j$.util.stream.l5
    public final boolean e() {
        return !this.f18072b || this.f17981a.e();
    }
}
