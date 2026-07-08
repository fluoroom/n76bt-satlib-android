package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Supplier;

/* JADX INFO: loaded from: classes2.dex */
public final class u1 extends b {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final j$.util.concurrent.t f18192j;

    public u1(j$.util.concurrent.t tVar, a aVar, Spliterator spliterator) {
        super(aVar, spliterator);
        this.f18192j = tVar;
    }

    public u1(u1 u1Var, Spliterator spliterator) {
        super(u1Var, spliterator);
        this.f18192j = u1Var.f18192j;
    }

    @Override // j$.util.stream.d
    public final d c(Spliterator spliterator) {
        return new u1(this, spliterator);
    }

    @Override // j$.util.stream.d
    public final Object a() {
        v3 v3Var = this.f17945a;
        s1 s1Var = (s1) ((Supplier) this.f18192j.f17776c).get();
        v3Var.F0(this.f17946b, s1Var);
        boolean z10 = s1Var.f18159b;
        if (z10 == ((t1) this.f18192j.f17775b).f18170b) {
            Boolean boolValueOf = Boolean.valueOf(z10);
            AtomicReference atomicReference = this.f17920h;
            while (!atomicReference.compareAndSet(null, boolValueOf) && atomicReference.get() == null) {
            }
        }
        return null;
    }

    @Override // j$.util.stream.b
    public final Object h() {
        return Boolean.valueOf(!((t1) this.f18192j.f17775b).f18170b);
    }
}
