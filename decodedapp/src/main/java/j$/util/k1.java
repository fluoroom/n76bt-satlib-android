package j$.util;

import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* JADX INFO: loaded from: classes2.dex */
public final class k1 implements u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double[] f17845a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f17846b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f17847c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f17848d;

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        c.a(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return c.d(this);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i10) {
        return c.e(this, i10);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return c.f(this, consumer);
    }

    public k1(double[] dArr, int i10, int i11, int i12) {
        this.f17845a = dArr;
        this.f17846b = i10;
        this.f17847c = i11;
        this.f17848d = i12 | 16448;
    }

    @Override // j$.util.d1, j$.util.Spliterator
    public final u0 trySplit() {
        int i10 = this.f17846b;
        int i11 = (this.f17847c + i10) >>> 1;
        if (i10 >= i11) {
            return null;
        }
        this.f17846b = i11;
        return new k1(this.f17845a, i10, i11, this.f17848d);
    }

    @Override // j$.util.d1
    public final void forEachRemaining(DoubleConsumer doubleConsumer) {
        int i10;
        doubleConsumer.getClass();
        double[] dArr = this.f17845a;
        int length = dArr.length;
        int i11 = this.f17847c;
        if (length < i11 || (i10 = this.f17846b) < 0) {
            return;
        }
        this.f17846b = i11;
        if (i10 < i11) {
            do {
                doubleConsumer.accept(dArr[i10]);
                i10++;
            } while (i10 < i11);
        }
    }

    @Override // j$.util.d1
    public final boolean tryAdvance(DoubleConsumer doubleConsumer) {
        doubleConsumer.getClass();
        int i10 = this.f17846b;
        if (i10 < 0 || i10 >= this.f17847c) {
            return false;
        }
        this.f17846b = i10 + 1;
        doubleConsumer.accept(this.f17845a[i10]);
        return true;
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        return this.f17847c - this.f17846b;
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return this.f17848d;
    }

    @Override // j$.util.Spliterator
    public final java.util.Comparator getComparator() {
        if (c.e(this, 4)) {
            return null;
        }
        throw new IllegalStateException();
    }
}
