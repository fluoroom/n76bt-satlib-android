package j$.util;

import j$.util.Spliterator;
import java.util.Spliterator;
import java.util.function.Consumer;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class c1 implements Spliterator.OfPrimitive {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d1 f17713a;

    public /* synthetic */ c1(d1 d1Var) {
        this.f17713a = d1Var;
    }

    public static /* synthetic */ Spliterator.OfPrimitive a(d1 d1Var) {
        if (d1Var == null) {
            return null;
        }
        return d1Var instanceof b1 ? ((b1) d1Var).f17707a : d1Var instanceof u0 ? t0.a((u0) d1Var) : d1Var instanceof x0 ? w0.a((x0) d1Var) : d1Var instanceof a1 ? z0.a((a1) d1Var) : new c1(d1Var);
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ int characteristics() {
        return this.f17713a.characteristics();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        d1 d1Var = this.f17713a;
        if (obj instanceof c1) {
            obj = ((c1) obj).f17713a;
        }
        return d1Var.equals(obj);
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ long estimateSize() {
        return this.f17713a.estimateSize();
    }

    @Override // java.util.Spliterator.OfPrimitive
    public final /* synthetic */ void forEachRemaining(Object obj) {
        this.f17713a.forEachRemaining(obj);
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        this.f17713a.forEachRemaining(consumer);
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ java.util.Comparator getComparator() {
        return this.f17713a.getComparator();
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return this.f17713a.getExactSizeIfKnown();
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i10) {
        return this.f17713a.hasCharacteristics(i10);
    }

    public final /* synthetic */ int hashCode() {
        return this.f17713a.hashCode();
    }

    @Override // java.util.Spliterator.OfPrimitive
    public final /* synthetic */ boolean tryAdvance(Object obj) {
        return this.f17713a.tryAdvance(obj);
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return this.f17713a.tryAdvance(consumer);
    }

    @Override // java.util.Spliterator.OfPrimitive, java.util.Spliterator
    public final /* synthetic */ Spliterator.OfPrimitive trySplit() {
        return a(this.f17713a.trySplit());
    }

    @Override // java.util.Spliterator.OfPrimitive, java.util.Spliterator
    public final /* synthetic */ java.util.Spliterator trySplit() {
        return Spliterator.Wrapper.convert(this.f17713a.trySplit());
    }
}
