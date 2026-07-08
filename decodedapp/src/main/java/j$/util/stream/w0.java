package j$.util.stream;

import j$.util.Objects;
import java.util.function.IntConsumer;

/* JADX INFO: loaded from: classes2.dex */
public final class w0 extends f5 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f18231b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j$.util.i0 f18232c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ u0 f18233d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(u0 u0Var, l5 l5Var) {
        super(l5Var);
        this.f18233d = u0Var;
        l5 l5Var2 = this.f17981a;
        Objects.requireNonNull(l5Var2);
        this.f18232c = new j$.util.i0(l5Var2, 1);
    }

    @Override // j$.util.stream.f5, j$.util.stream.l5
    public final void c(long j10) {
        this.f17981a.c(-1L);
    }

    @Override // j$.util.stream.j5, j$.util.stream.l5
    public final void accept(int i10) throws Exception {
        IntStream intStream = (IntStream) ((l0) this.f18233d.f18191t).apply(i10);
        if (intStream != null) {
            try {
                boolean z10 = this.f18231b;
                j$.util.i0 i0Var = this.f18232c;
                if (!z10) {
                    intStream.sequential().forEach(i0Var);
                } else {
                    j$.util.x0 x0VarSpliterator = intStream.sequential().spliterator();
                    while (!this.f17981a.e() && x0VarSpliterator.tryAdvance((IntConsumer) i0Var)) {
                    }
                }
            } catch (Throwable th2) {
                try {
                    intStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        }
        if (intStream != null) {
            intStream.close();
        }
    }

    @Override // j$.util.stream.f5, j$.util.stream.l5
    public final boolean e() {
        this.f18231b = true;
        return this.f17981a.e();
    }
}
