package j$.util;

import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import java.util.Iterator;
import java.util.function.Consumer;

/* JADX INFO: loaded from: classes2.dex */
public class q1 implements Spliterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.util.Collection f17864a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Iterator f17865b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f17866c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f17867d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f17868e;

    @Override // j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return c.d(this);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i10) {
        return c.e(this, i10);
    }

    public q1(java.util.Collection collection, int i10) {
        this.f17864a = collection;
        this.f17866c = (i10 & 4096) == 0 ? i10 | 16448 : i10;
    }

    @Override // j$.util.Spliterator
    public final Spliterator trySplit() {
        long size;
        Iterator it = this.f17865b;
        if (it == null) {
            it = this.f17864a.iterator();
            this.f17865b = it;
            size = this.f17864a.size();
            this.f17867d = size;
        } else {
            size = this.f17867d;
        }
        if (size <= 1 || !it.hasNext()) {
            return null;
        }
        int i10 = this.f17868e + WXMediaMessage.DESCRIPTION_LENGTH_LIMIT;
        if (i10 > size) {
            i10 = (int) size;
        }
        if (i10 > 33554432) {
            i10 = 33554432;
        }
        Object[] objArr = new Object[i10];
        int i11 = 0;
        do {
            objArr[i11] = it.next();
            i11++;
            if (i11 >= i10) {
                break;
            }
        } while (it.hasNext());
        this.f17868e = i11;
        long j10 = this.f17867d;
        if (j10 != Long.MAX_VALUE) {
            this.f17867d = j10 - ((long) i11);
        }
        return new j1(objArr, 0, i11, this.f17866c);
    }

    @Override // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        consumer.getClass();
        Iterator it = this.f17865b;
        if (it == null) {
            it = this.f17864a.iterator();
            this.f17865b = it;
            this.f17867d = this.f17864a.size();
        }
        c.q(it, consumer);
    }

    @Override // j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer) {
        consumer.getClass();
        if (this.f17865b == null) {
            this.f17865b = this.f17864a.iterator();
            this.f17867d = this.f17864a.size();
        }
        if (!this.f17865b.hasNext()) {
            return false;
        }
        consumer.accept(this.f17865b.next());
        return true;
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        if (this.f17865b == null) {
            this.f17865b = this.f17864a.iterator();
            long size = this.f17864a.size();
            this.f17867d = size;
            return size;
        }
        return this.f17867d;
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return this.f17866c;
    }

    @Override // j$.util.Spliterator
    public java.util.Comparator getComparator() {
        if (c.e(this, 4)) {
            return null;
        }
        throw new IllegalStateException();
    }
}
