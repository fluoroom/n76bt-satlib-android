package j$.util.stream;

import j$.util.Spliterator;
import j$.util.concurrent.ConcurrentHashMap;
import j$.util.function.Consumer$CC;
import java.util.Comparator;
import java.util.function.Consumer;

/* JADX INFO: loaded from: classes2.dex */
public final class h7 implements Spliterator, Consumer {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Object f18005d = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Spliterator f18006a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f18007b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f18008c;

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return j$.util.c.d(this);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i10) {
        return j$.util.c.e(this, i10);
    }

    public h7(Spliterator spliterator, ConcurrentHashMap concurrentHashMap) {
        this.f18006a = spliterator;
        this.f18007b = concurrentHashMap;
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final void n(Object obj) {
        this.f18008c = obj;
    }

    @Override // j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer) {
        while (this.f18006a.tryAdvance(this)) {
            Object obj = this.f18008c;
            if (obj == null) {
                obj = f18005d;
            }
            if (this.f18007b.putIfAbsent(obj, Boolean.TRUE) == null) {
                consumer.n(this.f18008c);
                this.f18008c = null;
                return true;
            }
        }
        return false;
    }

    @Override // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        this.f18006a.forEachRemaining(new j$.util.concurrent.t(8, this, consumer));
    }

    @Override // j$.util.Spliterator
    public final Spliterator trySplit() {
        Spliterator spliteratorTrySplit = this.f18006a.trySplit();
        if (spliteratorTrySplit != null) {
            return new h7(spliteratorTrySplit, this.f18007b);
        }
        return null;
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        return this.f18006a.estimateSize();
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return (this.f18006a.characteristics() & (-16469)) | 1;
    }

    @Override // j$.util.Spliterator
    public final Comparator getComparator() {
        return this.f18006a.getComparator();
    }
}
