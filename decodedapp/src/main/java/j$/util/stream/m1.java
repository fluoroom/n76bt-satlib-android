package j$.util.stream;

import java.util.function.BiConsumer;
import java.util.function.LongBinaryOperator;
import java.util.function.LongConsumer;
import java.util.function.LongFunction;
import java.util.function.ObjLongConsumer;
import java.util.function.Supplier;

/* JADX INFO: loaded from: classes2.dex */
public interface m1 extends g {
    IntStream A();

    m1 a();

    d0 asDoubleStream();

    j$.util.b0 average();

    m1 b();

    Stream boxed();

    m1 c();

    Object collect(Supplier supplier, ObjLongConsumer objLongConsumer, BiConsumer biConsumer);

    long count();

    m1 d(j$.util.q qVar);

    m1 distinct();

    m1 e();

    j$.util.d0 findAny();

    j$.util.d0 findFirst();

    void forEach(LongConsumer longConsumer);

    void forEachOrdered(LongConsumer longConsumer);

    @Override // j$.util.stream.g
    j$.util.p0 iterator();

    d0 j();

    m1 limit(long j10);

    boolean m();

    Stream mapToObj(LongFunction longFunction);

    j$.util.d0 max();

    j$.util.d0 min();

    @Override // j$.util.stream.g
    m1 parallel();

    m1 peek(LongConsumer longConsumer);

    boolean q();

    long reduce(long j10, LongBinaryOperator longBinaryOperator);

    j$.util.d0 reduce(LongBinaryOperator longBinaryOperator);

    @Override // j$.util.stream.g
    m1 sequential();

    m1 skip(long j10);

    m1 sorted();

    @Override // j$.util.stream.g
    j$.util.a1 spliterator();

    long sum();

    j$.util.a0 summaryStatistics();

    long[] toArray();

    boolean w();
}
