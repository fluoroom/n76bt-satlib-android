package j$.util;

import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: loaded from: classes2.dex */
public final class p1 implements x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int[] f17858a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f17859b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f17860c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f17861d;

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        c.b(this, consumer);
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
        return c.g(this, consumer);
    }

    public p1(int[] iArr, int i10, int i11, int i12) {
        this.f17858a = iArr;
        this.f17859b = i10;
        this.f17860c = i11;
        this.f17861d = i12 | 16448;
    }

    @Override // j$.util.d1, j$.util.Spliterator
    public final x0 trySplit() {
        int i10 = this.f17859b;
        int i11 = (this.f17860c + i10) >>> 1;
        if (i10 >= i11) {
            return null;
        }
        this.f17859b = i11;
        return new p1(this.f17858a, i10, i11, this.f17861d);
    }

    @Override // j$.util.d1
    public final void forEachRemaining(IntConsumer intConsumer) {
        int i10;
        intConsumer.getClass();
        int[] iArr = this.f17858a;
        int length = iArr.length;
        int i11 = this.f17860c;
        if (length < i11 || (i10 = this.f17859b) < 0) {
            return;
        }
        this.f17859b = i11;
        if (i10 < i11) {
            do {
                intConsumer.accept(iArr[i10]);
                i10++;
            } while (i10 < i11);
        }
    }

    @Override // j$.util.d1
    public final boolean tryAdvance(IntConsumer intConsumer) {
        intConsumer.getClass();
        int i10 = this.f17859b;
        if (i10 < 0 || i10 >= this.f17860c) {
            return false;
        }
        this.f17859b = i10 + 1;
        intConsumer.accept(this.f17858a[i10]);
        return true;
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        return this.f17860c - this.f17859b;
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return this.f17861d;
    }

    @Override // j$.util.Spliterator
    public final java.util.Comparator getComparator() {
        if (c.e(this, 4)) {
            return null;
        }
        throw new IllegalStateException();
    }
}
