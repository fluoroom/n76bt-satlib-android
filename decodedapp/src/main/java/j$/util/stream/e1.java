package j$.util.stream;

import j$.util.Objects;
import java.util.function.LongConsumer;

/* JADX INFO: loaded from: classes2.dex */
public final class e1 extends g5 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f17964b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j$.util.m0 f17965c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f1 f17966d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(f1 f1Var, l5 l5Var) {
        super(l5Var);
        this.f17966d = f1Var;
        l5 l5Var2 = this.f17991a;
        Objects.requireNonNull(l5Var2);
        this.f17965c = new j$.util.m0(l5Var2, 1);
    }

    @Override // j$.util.stream.g5, j$.util.stream.l5
    public final void c(long j10) {
        this.f17991a.c(-1L);
    }

    @Override // j$.util.stream.k5, j$.util.stream.l5
    public final void accept(long j10) throws Exception {
        m1 m1Var = (m1) ((j$.util.q) this.f17966d.f17977t).apply(j10);
        if (m1Var != null) {
            try {
                boolean z10 = this.f17964b;
                j$.util.m0 m0Var = this.f17965c;
                if (!z10) {
                    m1Var.sequential().forEach(m0Var);
                } else {
                    j$.util.a1 a1VarSpliterator = m1Var.sequential().spliterator();
                    while (!this.f17991a.e() && a1VarSpliterator.tryAdvance((LongConsumer) m0Var)) {
                    }
                }
            } catch (Throwable th2) {
                try {
                    m1Var.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        }
        if (m1Var != null) {
            m1Var.close();
        }
    }

    @Override // j$.util.stream.g5, j$.util.stream.l5
    public final boolean e() {
        this.f17964b = true;
        return this.f17991a.e();
    }
}
