package j$.util.stream;

import j$.util.Objects;
import java.util.Comparator;
import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;

/* JADX INFO: loaded from: classes2.dex */
public abstract class t6 implements j$.util.d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f18173a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f18174b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f18175c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f18176d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f18177e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ u6 f18178f;

    public abstract void a(int i10, Object obj, Object obj2);

    public abstract j$.util.d1 b(Object obj, int i10, int i11);

    public abstract j$.util.d1 c(int i10, int i11, int i12, int i13);

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return 16464;
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return j$.util.c.d(this);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i10) {
        return j$.util.c.e(this, i10);
    }

    @Override // j$.util.Spliterator
    public final Comparator getComparator() {
        throw new IllegalStateException();
    }

    public t6(u6 u6Var, int i10, int i11, int i12, int i13) {
        this.f18178f = u6Var;
        this.f18173a = i10;
        this.f18174b = i11;
        this.f18175c = i12;
        this.f18176d = i13;
        Object[] objArr = u6Var.f18199f;
        this.f18177e = objArr == null ? u6Var.f18198e : objArr[i10];
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        int i10 = this.f18173a;
        int i11 = this.f18176d;
        int i12 = this.f18174b;
        if (i10 == i12) {
            return ((long) i11) - ((long) this.f18175c);
        }
        long[] jArr = this.f18178f.f17937d;
        return ((jArr[i12] + ((long) i11)) - jArr[i10]) - ((long) this.f18175c);
    }

    @Override // j$.util.d1
    public final boolean tryAdvance(Object obj) {
        Objects.requireNonNull(obj);
        int i10 = this.f18173a;
        int i11 = this.f18174b;
        if (i10 >= i11 && (i10 != i11 || this.f18175c >= this.f18176d)) {
            return false;
        }
        Object obj2 = this.f18177e;
        int i12 = this.f18175c;
        this.f18175c = i12 + 1;
        a(i12, obj2, obj);
        int i13 = this.f18175c;
        Object obj3 = this.f18177e;
        u6 u6Var = this.f18178f;
        if (i13 == u6Var.q(obj3)) {
            this.f18175c = 0;
            int i14 = this.f18173a + 1;
            this.f18173a = i14;
            Object[] objArr = u6Var.f18199f;
            if (objArr != null && i14 <= i11) {
                this.f18177e = objArr[i14];
            }
        }
        return true;
    }

    @Override // j$.util.d1
    public final void forEachRemaining(Object obj) {
        u6 u6Var;
        Objects.requireNonNull(obj);
        int i10 = this.f18173a;
        int i11 = this.f18176d;
        int i12 = this.f18174b;
        if (i10 < i12 || (i10 == i12 && this.f18175c < i11)) {
            int i13 = this.f18175c;
            while (true) {
                u6Var = this.f18178f;
                if (i10 >= i12) {
                    break;
                }
                Object obj2 = u6Var.f18199f[i10];
                u6Var.p(obj2, i13, u6Var.q(obj2), obj);
                i10++;
                i13 = 0;
            }
            u6Var.p(this.f18173a == i12 ? this.f18177e : u6Var.f18199f[i12], i13, i11, obj);
            this.f18173a = i12;
            this.f18175c = i11;
        }
    }

    @Override // j$.util.Spliterator
    public final j$.util.d1 trySplit() {
        int i10 = this.f18173a;
        int i11 = this.f18174b;
        if (i10 < i11) {
            int i12 = i11 - 1;
            int i13 = this.f18175c;
            u6 u6Var = this.f18178f;
            j$.util.d1 d1VarC = c(i10, i12, i13, u6Var.q(u6Var.f18199f[i12]));
            this.f18173a = i11;
            this.f18175c = 0;
            this.f18177e = u6Var.f18199f[i11];
            return d1VarC;
        }
        if (i10 != i11) {
            return null;
        }
        int i14 = this.f18175c;
        int i15 = (this.f18176d - i14) / 2;
        if (i15 == 0) {
            return null;
        }
        j$.util.d1 d1VarB = b(this.f18177e, i14, i15);
        this.f18175c += i15;
        return d1VarB;
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(IntConsumer intConsumer) {
        forEachRemaining((Object) intConsumer);
    }

    public /* bridge */ /* synthetic */ boolean tryAdvance(IntConsumer intConsumer) {
        return tryAdvance((Object) intConsumer);
    }

    @Override // j$.util.d1, j$.util.Spliterator
    public /* bridge */ /* synthetic */ j$.util.x0 trySplit() {
        return (j$.util.x0) trySplit();
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(LongConsumer longConsumer) {
        forEachRemaining((Object) longConsumer);
    }

    public /* bridge */ /* synthetic */ boolean tryAdvance(LongConsumer longConsumer) {
        return tryAdvance((Object) longConsumer);
    }

    @Override // j$.util.d1, j$.util.Spliterator
    public /* bridge */ /* synthetic */ j$.util.a1 trySplit() {
        return (j$.util.a1) trySplit();
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(DoubleConsumer doubleConsumer) {
        forEachRemaining((Object) doubleConsumer);
    }

    public /* bridge */ /* synthetic */ boolean tryAdvance(DoubleConsumer doubleConsumer) {
        return tryAdvance((Object) doubleConsumer);
    }

    @Override // j$.util.d1, j$.util.Spliterator
    public /* bridge */ /* synthetic */ j$.util.u0 trySplit() {
        return (j$.util.u0) trySplit();
    }
}
