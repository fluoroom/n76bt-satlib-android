package j$.util.stream;

import java.util.function.DoublePredicate;

/* JADX INFO: loaded from: classes2.dex */
public final class p8 extends e5 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f18125b;

    public p8(d6 d6Var, l5 l5Var) {
        super(l5Var);
        this.f18125b = true;
    }

    @Override // j$.util.stream.e5, j$.util.stream.l5
    public final void c(long j10) {
        this.f17969a.c(-1L);
    }

    @Override // j$.util.stream.i5, j$.util.stream.l5
    public final void accept(double d10) {
        if (this.f18125b) {
            DoublePredicate doublePredicate = null;
            doublePredicate.test(d10);
            throw null;
        }
    }

    @Override // j$.util.stream.e5, j$.util.stream.l5
    public final boolean e() {
        return !this.f18125b || this.f17969a.e();
    }
}
