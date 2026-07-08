package j$.util.stream;

import j$.util.Spliterator;
import j$.util.stream.IntStream;
import java.util.Iterator;
import java.util.function.BiConsumer;
import java.util.function.LongBinaryOperator;
import java.util.function.LongConsumer;
import java.util.function.LongFunction;
import java.util.function.ObjLongConsumer;
import java.util.function.Supplier;
import java.util.stream.LongStream;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class k1 implements m1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ LongStream f18047a;

    public /* synthetic */ k1(LongStream longStream) {
        this.f18047a = longStream;
    }

    public static /* synthetic */ m1 f(LongStream longStream) {
        if (longStream == null) {
            return null;
        }
        return longStream instanceof l1 ? ((l1) longStream).f18066a : new k1(longStream);
    }

    @Override // j$.util.stream.m1
    public final /* synthetic */ IntStream A() {
        return IntStream.VivifiedWrapper.convert(this.f18047a.mapToInt(null));
    }

    @Override // j$.util.stream.m1
    public final /* synthetic */ m1 a() {
        return f(this.f18047a.takeWhile(null));
    }

    @Override // j$.util.stream.m1
    public final /* synthetic */ d0 asDoubleStream() {
        return b0.f(this.f18047a.asDoubleStream());
    }

    @Override // j$.util.stream.m1
    public final /* synthetic */ j$.util.b0 average() {
        return j$.util.c.j(this.f18047a.average());
    }

    @Override // j$.util.stream.m1
    public final /* synthetic */ m1 b() {
        return f(this.f18047a.filter(null));
    }

    @Override // j$.util.stream.m1
    public final /* synthetic */ Stream boxed() {
        return w6.f(this.f18047a.boxed());
    }

    @Override // j$.util.stream.m1
    public final /* synthetic */ m1 c() {
        return f(this.f18047a.dropWhile(null));
    }

    @Override // java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        this.f18047a.close();
    }

    @Override // j$.util.stream.m1
    public final /* synthetic */ Object collect(Supplier supplier, ObjLongConsumer objLongConsumer, BiConsumer biConsumer) {
        return this.f18047a.collect(supplier, objLongConsumer, biConsumer);
    }

    @Override // j$.util.stream.m1
    public final /* synthetic */ long count() {
        return this.f18047a.count();
    }

    @Override // j$.util.stream.m1
    public final /* synthetic */ m1 distinct() {
        return f(this.f18047a.distinct());
    }

    @Override // j$.util.stream.m1
    public final /* synthetic */ m1 e() {
        return f(this.f18047a.map(null));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        LongStream longStream = this.f18047a;
        if (obj instanceof k1) {
            obj = ((k1) obj).f18047a;
        }
        return longStream.equals(obj);
    }

    @Override // j$.util.stream.m1
    public final /* synthetic */ j$.util.d0 findAny() {
        return j$.util.c.l(this.f18047a.findAny());
    }

    @Override // j$.util.stream.m1
    public final /* synthetic */ j$.util.d0 findFirst() {
        return j$.util.c.l(this.f18047a.findFirst());
    }

    @Override // j$.util.stream.m1
    public final /* synthetic */ void forEach(LongConsumer longConsumer) {
        this.f18047a.forEach(longConsumer);
    }

    @Override // j$.util.stream.m1
    public final /* synthetic */ void forEachOrdered(LongConsumer longConsumer) {
        this.f18047a.forEachOrdered(longConsumer);
    }

    public final /* synthetic */ int hashCode() {
        return this.f18047a.hashCode();
    }

    @Override // j$.util.stream.g
    public final /* synthetic */ boolean isParallel() {
        return this.f18047a.isParallel();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.PrimitiveIterator$OfLong] */
    @Override // j$.util.stream.m1, j$.util.stream.g
    public final /* synthetic */ j$.util.p0 iterator() {
        ?? it = this.f18047a.iterator();
        if (it == 0) {
            return null;
        }
        return it instanceof j$.util.o0 ? ((j$.util.o0) it).f17856a : new j$.util.n0(it);
    }

    @Override // j$.util.stream.g
    public final /* synthetic */ Iterator iterator() {
        return this.f18047a.iterator();
    }

    @Override // j$.util.stream.m1
    public final /* synthetic */ d0 j() {
        return b0.f(this.f18047a.mapToDouble(null));
    }

    @Override // j$.util.stream.m1
    public final /* synthetic */ m1 limit(long j10) {
        return f(this.f18047a.limit(j10));
    }

    @Override // j$.util.stream.m1
    public final /* synthetic */ boolean m() {
        return this.f18047a.noneMatch(null);
    }

    @Override // j$.util.stream.m1
    public final /* synthetic */ Stream mapToObj(LongFunction longFunction) {
        return w6.f(this.f18047a.mapToObj(longFunction));
    }

    @Override // j$.util.stream.m1
    public final /* synthetic */ j$.util.d0 max() {
        return j$.util.c.l(this.f18047a.max());
    }

    @Override // j$.util.stream.m1
    public final /* synthetic */ j$.util.d0 min() {
        return j$.util.c.l(this.f18047a.min());
    }

    @Override // j$.util.stream.g
    public final /* synthetic */ g onClose(Runnable runnable) {
        return e.f(this.f18047a.onClose(runnable));
    }

    @Override // j$.util.stream.g
    public final /* synthetic */ g parallel() {
        return e.f(this.f18047a.parallel());
    }

    @Override // j$.util.stream.m1, j$.util.stream.g
    public final /* synthetic */ m1 parallel() {
        return f(this.f18047a.parallel());
    }

    @Override // j$.util.stream.m1
    public final /* synthetic */ m1 peek(LongConsumer longConsumer) {
        return f(this.f18047a.peek(longConsumer));
    }

    @Override // j$.util.stream.m1
    public final /* synthetic */ boolean q() {
        return this.f18047a.anyMatch(null);
    }

    @Override // j$.util.stream.m1
    public final /* synthetic */ long reduce(long j10, LongBinaryOperator longBinaryOperator) {
        return this.f18047a.reduce(j10, longBinaryOperator);
    }

    @Override // j$.util.stream.m1
    public final /* synthetic */ j$.util.d0 reduce(LongBinaryOperator longBinaryOperator) {
        return j$.util.c.l(this.f18047a.reduce(longBinaryOperator));
    }

    @Override // j$.util.stream.g
    public final /* synthetic */ g sequential() {
        return e.f(this.f18047a.sequential());
    }

    @Override // j$.util.stream.m1, j$.util.stream.g
    public final /* synthetic */ m1 sequential() {
        return f(this.f18047a.sequential());
    }

    @Override // j$.util.stream.m1
    public final /* synthetic */ m1 skip(long j10) {
        return f(this.f18047a.skip(j10));
    }

    @Override // j$.util.stream.m1
    public final /* synthetic */ m1 sorted() {
        return f(this.f18047a.sorted());
    }

    @Override // j$.util.stream.g
    public final /* synthetic */ Spliterator spliterator() {
        return j$.util.e1.a(this.f18047a.spliterator());
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.Spliterator$OfLong] */
    @Override // j$.util.stream.m1, j$.util.stream.g
    public final /* synthetic */ j$.util.a1 spliterator() {
        return j$.util.y0.a(this.f18047a.spliterator());
    }

    @Override // j$.util.stream.m1
    public final /* synthetic */ long sum() {
        return this.f18047a.sum();
    }

    @Override // j$.util.stream.m1
    public final /* synthetic */ long[] toArray() {
        return this.f18047a.toArray();
    }

    @Override // j$.util.stream.g
    public final /* synthetic */ g unordered() {
        return e.f(this.f18047a.unordered());
    }

    @Override // j$.util.stream.m1
    public final /* synthetic */ boolean w() {
        return this.f18047a.allMatch(null);
    }

    @Override // j$.util.stream.m1
    public final j$.util.a0 summaryStatistics() {
        this.f18047a.summaryStatistics();
        throw new Error("Java 8+ API desugaring (library desugaring) cannot convert from java.util.LongSummaryStatistics");
    }

    @Override // j$.util.stream.m1
    public final m1 d(j$.util.q qVar) {
        LongStream longStream = this.f18047a;
        j$.util.q qVar2 = new j$.util.q(7);
        qVar2.f17863b = qVar;
        return f(longStream.flatMap(qVar2));
    }
}
