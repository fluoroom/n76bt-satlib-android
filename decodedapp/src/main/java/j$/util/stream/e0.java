package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.Predicate;
import java.util.function.Supplier;

/* JADX INFO: loaded from: classes2.dex */
public final class e0 implements g8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f17960a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f17961b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Predicate f17962c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Supplier f17963d;

    public e0(boolean z10, z6 z6Var, Object obj, Predicate predicate, Supplier supplier) {
        this.f17960a = (z10 ? 0 : y6.f18269r) | y6.f18272u;
        this.f17961b = obj;
        this.f17962c = predicate;
        this.f17963d = supplier;
    }

    @Override // j$.util.stream.g8
    public final int v() {
        return this.f17960a;
    }

    @Override // j$.util.stream.g8
    public final Object f(a aVar, Spliterator spliterator) {
        h8 h8Var = (h8) this.f17963d.get();
        aVar.F0(spliterator, h8Var);
        Object obj = h8Var.get();
        return obj != null ? obj : this.f17961b;
    }

    @Override // j$.util.stream.g8
    public final Object i(v3 v3Var, Spliterator spliterator) {
        a aVar = (a) v3Var;
        return new k0(this, y6.ORDERED.l(aVar.f17893m), aVar, spliterator).invoke();
    }
}
