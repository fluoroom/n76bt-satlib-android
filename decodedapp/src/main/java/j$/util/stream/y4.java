package j$.util.stream;

import j$.util.Objects;
import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;

/* JADX INFO: loaded from: classes2.dex */
public final class y4 extends h5 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f18252b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f18253c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f18254d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ a f18255e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y4(u0 u0Var, l5 l5Var) {
        super(l5Var);
        this.f18255e = u0Var;
        l5 l5Var2 = this.f18003a;
        Objects.requireNonNull(l5Var2);
        this.f18254d = new j$.util.i0(l5Var2, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y4(w wVar, l5 l5Var) {
        super(l5Var);
        this.f18255e = wVar;
        l5 l5Var2 = this.f18003a;
        Objects.requireNonNull(l5Var2);
        this.f18254d = new j$.util.e0(l5Var2, 1);
    }

    @Override // j$.util.stream.h5, j$.util.stream.l5
    public final void c(long j10) {
        switch (this.f18252b) {
            case 0:
                this.f18003a.c(-1L);
                break;
            case 1:
                this.f18003a.c(-1L);
                break;
            default:
                this.f18003a.c(-1L);
                break;
        }
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final void n(Object obj) throws Exception {
        switch (this.f18252b) {
            case 0:
                j$.util.m0 m0Var = (j$.util.m0) this.f18254d;
                m1 m1Var = (m1) ((j$.util.q) ((f1) this.f18255e).f17977t).apply(obj);
                if (m1Var != null) {
                    try {
                        if (!this.f18253c) {
                            m1Var.sequential().forEach(m0Var);
                        } else {
                            j$.util.a1 a1VarSpliterator = m1Var.sequential().spliterator();
                            while (!this.f18003a.e() && a1VarSpliterator.tryAdvance((LongConsumer) m0Var)) {
                            }
                        }
                    } catch (Throwable th2) {
                        try {
                            m1Var.close();
                            break;
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                        }
                        throw th2;
                    }
                    break;
                }
                if (m1Var != null) {
                    m1Var.close();
                    return;
                }
                return;
            case 1:
                j$.util.i0 i0Var = (j$.util.i0) this.f18254d;
                IntStream intStream = (IntStream) ((j$.util.q) ((u0) this.f18255e).f18191t).apply(obj);
                if (intStream != null) {
                    try {
                        if (!this.f18253c) {
                            intStream.sequential().forEach(i0Var);
                        } else {
                            j$.util.x0 x0VarSpliterator = intStream.sequential().spliterator();
                            while (!this.f18003a.e() && x0VarSpliterator.tryAdvance((IntConsumer) i0Var)) {
                            }
                        }
                    } catch (Throwable th4) {
                        try {
                            intStream.close();
                            break;
                        } catch (Throwable th5) {
                            th4.addSuppressed(th5);
                        }
                        throw th4;
                    }
                    break;
                }
                if (intStream != null) {
                    intStream.close();
                    return;
                }
                return;
            default:
                j$.util.e0 e0Var = (j$.util.e0) this.f18254d;
                d0 d0Var = (d0) ((j$.util.q) ((w) this.f18255e).f18230t).apply(obj);
                if (d0Var != null) {
                    try {
                        if (!this.f18253c) {
                            d0Var.sequential().forEach(e0Var);
                        } else {
                            j$.util.u0 u0VarSpliterator = d0Var.sequential().spliterator();
                            while (!this.f18003a.e() && u0VarSpliterator.tryAdvance((DoubleConsumer) e0Var)) {
                            }
                        }
                    } catch (Throwable th6) {
                        try {
                            d0Var.close();
                            break;
                        } catch (Throwable th7) {
                            th6.addSuppressed(th7);
                        }
                        throw th6;
                    }
                    break;
                }
                if (d0Var != null) {
                    d0Var.close();
                    return;
                }
                return;
        }
    }

    @Override // j$.util.stream.h5, j$.util.stream.l5
    public final boolean e() {
        switch (this.f18252b) {
            case 0:
                this.f18253c = true;
                break;
            case 1:
                this.f18253c = true;
                break;
            default:
                this.f18253c = true;
                break;
        }
        return this.f18003a.e();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y4(f1 f1Var, l5 l5Var) {
        super(l5Var);
        this.f18255e = f1Var;
        l5 l5Var2 = this.f18003a;
        Objects.requireNonNull(l5Var2);
        this.f18254d = new j$.util.m0(l5Var2, 1);
    }
}
