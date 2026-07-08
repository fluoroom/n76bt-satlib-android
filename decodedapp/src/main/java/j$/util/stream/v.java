package j$.util.stream;

import j$.util.Objects;
import java.util.function.DoubleConsumer;

/* JADX INFO: loaded from: classes2.dex */
public final class v extends e5 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f18207b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j$.util.e0 f18208c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ w f18209d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(w wVar, l5 l5Var) {
        super(l5Var);
        this.f18209d = wVar;
        l5 l5Var2 = this.f17969a;
        Objects.requireNonNull(l5Var2);
        this.f18208c = new j$.util.e0(l5Var2, 1);
    }

    @Override // j$.util.stream.e5, j$.util.stream.l5
    public final void c(long j10) {
        this.f17969a.c(-1L);
    }

    @Override // j$.util.stream.i5, j$.util.stream.l5
    public final void accept(double d10) throws Exception {
        d0 d0Var = (d0) ((j$.util.q) this.f18209d.f18230t).apply(d10);
        if (d0Var != null) {
            try {
                boolean z10 = this.f18207b;
                j$.util.e0 e0Var = this.f18208c;
                if (!z10) {
                    d0Var.sequential().forEach(e0Var);
                } else {
                    j$.util.u0 u0VarSpliterator = d0Var.sequential().spliterator();
                    while (!this.f17969a.e() && u0VarSpliterator.tryAdvance((DoubleConsumer) e0Var)) {
                    }
                }
            } catch (Throwable th2) {
                try {
                    d0Var.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        }
        if (d0Var != null) {
            d0Var.close();
        }
    }

    @Override // j$.util.stream.e5, j$.util.stream.l5
    public final boolean e() {
        this.f18207b = true;
        return this.f17969a.e();
    }
}
