package j$.util;

import java.util.function.Consumer;

/* JADX INFO: loaded from: classes2.dex */
public final class j1 implements Spliterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object[] f17840a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f17841b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f17842c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f17843d;

    @Override // j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return c.d(this);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i10) {
        return c.e(this, i10);
    }

    public j1(Object[] objArr, int i10, int i11, int i12) {
        this.f17840a = objArr;
        this.f17841b = i10;
        this.f17842c = i11;
        this.f17843d = i12 | 16448;
    }

    @Override // j$.util.Spliterator
    public final Spliterator trySplit() {
        int i10 = this.f17841b;
        int i11 = (this.f17842c + i10) >>> 1;
        if (i10 >= i11) {
            return null;
        }
        this.f17841b = i11;
        return new j1(this.f17840a, i10, i11, this.f17843d);
    }

    @Override // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        int i10;
        consumer.getClass();
        Object[] objArr = this.f17840a;
        int length = objArr.length;
        int i11 = this.f17842c;
        if (length < i11 || (i10 = this.f17841b) < 0) {
            return;
        }
        this.f17841b = i11;
        if (i10 < i11) {
            do {
                consumer.accept(objArr[i10]);
                i10++;
            } while (i10 < i11);
        }
    }

    @Override // j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer) {
        consumer.getClass();
        int i10 = this.f17841b;
        if (i10 < 0 || i10 >= this.f17842c) {
            return false;
        }
        this.f17841b = i10 + 1;
        consumer.accept(this.f17840a[i10]);
        return true;
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        return this.f17842c - this.f17841b;
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return this.f17843d;
    }

    @Override // j$.util.Spliterator
    public final java.util.Comparator getComparator() {
        if (c.e(this, 4)) {
            return null;
        }
        throw new IllegalStateException();
    }
}
