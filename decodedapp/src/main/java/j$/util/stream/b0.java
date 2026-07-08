package j$.util.stream;

import j$.util.Spliterator;
import j$.util.stream.IntStream;
import java.util.Iterator;
import java.util.function.BiConsumer;
import java.util.function.DoubleBinaryOperator;
import java.util.function.DoubleConsumer;
import java.util.function.DoubleFunction;
import java.util.function.ObjDoubleConsumer;
import java.util.function.Supplier;
import java.util.stream.DoubleStream;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class b0 implements d0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ DoubleStream f17922a;

    public /* synthetic */ b0(DoubleStream doubleStream) {
        this.f17922a = doubleStream;
    }

    public static /* synthetic */ d0 f(DoubleStream doubleStream) {
        if (doubleStream == null) {
            return null;
        }
        return doubleStream instanceof c0 ? ((c0) doubleStream).f17938a : new b0(doubleStream);
    }

    @Override // j$.util.stream.d0
    public final /* synthetic */ boolean B() {
        return this.f17922a.noneMatch(null);
    }

    @Override // j$.util.stream.d0
    public final /* synthetic */ d0 a() {
        return f(this.f17922a.takeWhile(null));
    }

    @Override // j$.util.stream.d0
    public final /* synthetic */ j$.util.b0 average() {
        return j$.util.c.j(this.f17922a.average());
    }

    @Override // j$.util.stream.d0
    public final /* synthetic */ d0 b() {
        return f(this.f17922a.filter(null));
    }

    @Override // j$.util.stream.d0
    public final /* synthetic */ Stream boxed() {
        return w6.f(this.f17922a.boxed());
    }

    @Override // j$.util.stream.d0
    public final /* synthetic */ d0 c() {
        return f(this.f17922a.dropWhile(null));
    }

    @Override // java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        this.f17922a.close();
    }

    @Override // j$.util.stream.d0
    public final /* synthetic */ Object collect(Supplier supplier, ObjDoubleConsumer objDoubleConsumer, BiConsumer biConsumer) {
        return this.f17922a.collect(supplier, objDoubleConsumer, biConsumer);
    }

    @Override // j$.util.stream.d0
    public final /* synthetic */ long count() {
        return this.f17922a.count();
    }

    @Override // j$.util.stream.d0
    public final /* synthetic */ d0 distinct() {
        return f(this.f17922a.distinct());
    }

    @Override // j$.util.stream.d0
    public final /* synthetic */ d0 e() {
        return f(this.f17922a.map(null));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        DoubleStream doubleStream = this.f17922a;
        if (obj instanceof b0) {
            obj = ((b0) obj).f17922a;
        }
        return doubleStream.equals(obj);
    }

    @Override // j$.util.stream.d0
    public final /* synthetic */ j$.util.b0 findAny() {
        return j$.util.c.j(this.f17922a.findAny());
    }

    @Override // j$.util.stream.d0
    public final /* synthetic */ j$.util.b0 findFirst() {
        return j$.util.c.j(this.f17922a.findFirst());
    }

    @Override // j$.util.stream.d0
    public final /* synthetic */ void forEach(DoubleConsumer doubleConsumer) {
        this.f17922a.forEach(doubleConsumer);
    }

    @Override // j$.util.stream.d0
    public final /* synthetic */ void forEachOrdered(DoubleConsumer doubleConsumer) {
        this.f17922a.forEachOrdered(doubleConsumer);
    }

    public final /* synthetic */ int hashCode() {
        return this.f17922a.hashCode();
    }

    @Override // j$.util.stream.g
    public final /* synthetic */ boolean isParallel() {
        return this.f17922a.isParallel();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.PrimitiveIterator$OfDouble] */
    @Override // j$.util.stream.d0, j$.util.stream.g
    public final /* synthetic */ j$.util.h0 iterator() {
        ?? it = this.f17922a.iterator();
        if (it == 0) {
            return null;
        }
        return it instanceof j$.util.g0 ? ((j$.util.g0) it).f17819a : new j$.util.f0(it);
    }

    @Override // j$.util.stream.g
    public final /* synthetic */ Iterator iterator() {
        return this.f17922a.iterator();
    }

    @Override // j$.util.stream.d0
    public final /* synthetic */ d0 limit(long j10) {
        return f(this.f17922a.limit(j10));
    }

    @Override // j$.util.stream.d0
    public final /* synthetic */ Stream mapToObj(DoubleFunction doubleFunction) {
        return w6.f(this.f17922a.mapToObj(doubleFunction));
    }

    @Override // j$.util.stream.d0
    public final /* synthetic */ j$.util.b0 max() {
        return j$.util.c.j(this.f17922a.max());
    }

    @Override // j$.util.stream.d0
    public final /* synthetic */ j$.util.b0 min() {
        return j$.util.c.j(this.f17922a.min());
    }

    @Override // j$.util.stream.d0
    public final /* synthetic */ boolean o() {
        return this.f17922a.anyMatch(null);
    }

    @Override // j$.util.stream.g
    public final /* synthetic */ g onClose(Runnable runnable) {
        return e.f(this.f17922a.onClose(runnable));
    }

    @Override // j$.util.stream.d0, j$.util.stream.g
    public final /* synthetic */ d0 parallel() {
        return f(this.f17922a.parallel());
    }

    @Override // j$.util.stream.g
    public final /* synthetic */ g parallel() {
        return e.f(this.f17922a.parallel());
    }

    @Override // j$.util.stream.d0
    public final /* synthetic */ d0 peek(DoubleConsumer doubleConsumer) {
        return f(this.f17922a.peek(doubleConsumer));
    }

    @Override // j$.util.stream.d0
    public final /* synthetic */ double reduce(double d10, DoubleBinaryOperator doubleBinaryOperator) {
        return this.f17922a.reduce(d10, doubleBinaryOperator);
    }

    @Override // j$.util.stream.d0
    public final /* synthetic */ j$.util.b0 reduce(DoubleBinaryOperator doubleBinaryOperator) {
        return j$.util.c.j(this.f17922a.reduce(doubleBinaryOperator));
    }

    @Override // j$.util.stream.d0, j$.util.stream.g
    public final /* synthetic */ d0 sequential() {
        return f(this.f17922a.sequential());
    }

    @Override // j$.util.stream.g
    public final /* synthetic */ g sequential() {
        return e.f(this.f17922a.sequential());
    }

    @Override // j$.util.stream.d0
    public final /* synthetic */ d0 skip(long j10) {
        return f(this.f17922a.skip(j10));
    }

    @Override // j$.util.stream.d0
    public final /* synthetic */ d0 sorted() {
        return f(this.f17922a.sorted());
    }

    @Override // j$.util.stream.g
    public final /* synthetic */ Spliterator spliterator() {
        return j$.util.e1.a(this.f17922a.spliterator());
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.Spliterator$OfDouble] */
    @Override // j$.util.stream.d0, j$.util.stream.g
    public final /* synthetic */ j$.util.u0 spliterator() {
        return j$.util.s0.a(this.f17922a.spliterator());
    }

    @Override // j$.util.stream.d0
    public final /* synthetic */ double sum() {
        return this.f17922a.sum();
    }

    @Override // j$.util.stream.d0
    public final /* synthetic */ boolean t() {
        return this.f17922a.allMatch(null);
    }

    @Override // j$.util.stream.d0
    public final /* synthetic */ double[] toArray() {
        return this.f17922a.toArray();
    }

    @Override // j$.util.stream.d0
    public final /* synthetic */ m1 u() {
        return k1.f(this.f17922a.mapToLong(null));
    }

    @Override // j$.util.stream.g
    public final /* synthetic */ g unordered() {
        return e.f(this.f17922a.unordered());
    }

    @Override // j$.util.stream.d0
    public final /* synthetic */ IntStream z() {
        return IntStream.VivifiedWrapper.convert(this.f17922a.mapToInt(null));
    }

    @Override // j$.util.stream.d0
    public final j$.util.x summaryStatistics() {
        this.f17922a.summaryStatistics();
        throw new Error("Java 8+ API desugaring (library desugaring) cannot convert from java.util.DoubleSummaryStatistics");
    }

    @Override // j$.util.stream.d0
    public final d0 d(j$.util.q qVar) {
        DoubleStream doubleStream = this.f17922a;
        j$.util.q qVar2 = new j$.util.q(5);
        qVar2.f17863b = qVar;
        return f(doubleStream.flatMap(qVar2));
    }
}
