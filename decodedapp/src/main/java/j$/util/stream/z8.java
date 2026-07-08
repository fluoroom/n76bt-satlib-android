package j$.util.stream;

import j$.util.Spliterator;
import java.util.Comparator;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Consumer;

/* JADX INFO: loaded from: classes2.dex */
public abstract class z8 implements Spliterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Spliterator f18291a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f18292b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f18293c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f18294d;

    public abstract Spliterator b(Spliterator spliterator);

    @Override // j$.util.Spliterator
    public final long getExactSizeIfKnown() {
        return -1L;
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i10) {
        return j$.util.c.e(this, i10);
    }

    @Override // j$.util.Spliterator
    public void forEachRemaining(Consumer consumer) {
        while (tryAdvance(consumer)) {
        }
    }

    public z8(Spliterator spliterator) {
        this.f18293c = true;
        this.f18291a = spliterator;
        this.f18292b = new AtomicBoolean();
    }

    public z8(Spliterator spliterator, z8 z8Var) {
        this.f18293c = true;
        this.f18291a = spliterator;
        z8Var.getClass();
        this.f18292b = z8Var.f18292b;
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        return this.f18291a.estimateSize();
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return this.f18291a.characteristics() & (-16449);
    }

    @Override // j$.util.Spliterator
    public final Comparator getComparator() {
        return this.f18291a.getComparator();
    }

    @Override // j$.util.Spliterator
    public Spliterator trySplit() {
        Spliterator spliteratorTrySplit = this.f18291a.trySplit();
        if (spliteratorTrySplit != null) {
            return b(spliteratorTrySplit);
        }
        return null;
    }

    public final boolean a() {
        return (this.f18294d == 0 && this.f18292b.get()) ? false : true;
    }

    @Override // j$.util.Spliterator
    public /* bridge */ /* synthetic */ j$.util.x0 trySplit() {
        return (j$.util.x0) trySplit();
    }

    @Override // j$.util.Spliterator
    public /* bridge */ /* synthetic */ j$.util.a1 trySplit() {
        return (j$.util.a1) trySplit();
    }

    @Override // j$.util.Spliterator
    public /* bridge */ /* synthetic */ j$.util.d1 trySplit() {
        return (j$.util.d1) trySplit();
    }

    @Override // j$.util.Spliterator
    public /* bridge */ /* synthetic */ j$.util.u0 trySplit() {
        return (j$.util.u0) trySplit();
    }
}
