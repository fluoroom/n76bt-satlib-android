package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import java.util.function.BiConsumer;
import java.util.function.IntBinaryOperator;
import java.util.function.IntConsumer;
import java.util.function.IntFunction;
import java.util.function.ObjIntConsumer;
import java.util.function.Supplier;

/* JADX INFO: loaded from: classes2.dex */
public abstract class a1 extends a implements IntStream {
    @Override // j$.util.stream.IntStream
    public final j$.util.c0 findAny() {
        return (j$.util.c0) I0(g0.f17987d);
    }

    @Override // j$.util.stream.IntStream
    public final j$.util.c0 findFirst() {
        return (j$.util.c0) I0(g0.f17986c);
    }

    @Override // j$.util.stream.IntStream
    public final IntStream sorted() {
        return new e6(this, y6.f18268q | y6.f18266o, 0);
    }

    @Override // j$.util.stream.IntStream
    public void forEach(IntConsumer intConsumer) {
        Objects.requireNonNull(intConsumer);
        I0(new n0(intConsumer, false));
    }

    @Override // j$.util.stream.IntStream
    public void forEachOrdered(IntConsumer intConsumer) {
        Objects.requireNonNull(intConsumer);
        I0(new n0(intConsumer, true));
    }

    public static j$.util.x0 U0(Spliterator spliterator) {
        if (spliterator instanceof j$.util.x0) {
            return (j$.util.x0) spliterator;
        }
        if (i8.f18022a) {
            i8.a(a.class, "using IntStream.adapt(Spliterator<Integer> s)");
            throw null;
        }
        throw new UnsupportedOperationException("IntStream.adapt(Spliterator<Integer> s)");
    }

    @Override // j$.util.stream.a
    public final z6 M0() {
        return z6.INT_VALUE;
    }

    @Override // j$.util.stream.a
    public final g2 K0(a aVar, Spliterator spliterator, boolean z10, IntFunction intFunction) {
        return v3.c0(aVar, spliterator, z10);
    }

    @Override // j$.util.stream.a
    public final Spliterator T0(a aVar, Supplier supplier, boolean z10) {
        return new l7(aVar, supplier, z10);
    }

    @Override // j$.util.stream.a
    public final boolean L0(Spliterator spliterator, l5 l5Var) {
        IntConsumer i0Var;
        boolean zE;
        j$.util.x0 x0VarU0 = U0(spliterator);
        if (l5Var instanceof IntConsumer) {
            i0Var = (IntConsumer) l5Var;
        } else {
            if (i8.f18022a) {
                i8.a(a.class, "using IntStream.adapt(Sink<Integer> s)");
                throw null;
            }
            Objects.requireNonNull(l5Var);
            i0Var = new j$.util.i0(l5Var, 1);
        }
        do {
            zE = l5Var.e();
            if (zE) {
                break;
            }
        } while (x0VarU0.tryAdvance(i0Var));
        return zE;
    }

    @Override // j$.util.stream.v3
    public final y1 A0(long j10, IntFunction intFunction) {
        return v3.s0(j10);
    }

    @Override // j$.util.stream.g
    public final j$.util.l0 iterator() {
        j$.util.x0 x0VarSpliterator = spliterator();
        Objects.requireNonNull(x0VarSpliterator);
        return new j$.util.g1(x0VarSpliterator);
    }

    @Override // j$.util.stream.a, j$.util.stream.g
    public final j$.util.x0 spliterator() {
        return U0(super.spliterator());
    }

    @Override // j$.util.stream.IntStream
    public final m1 asLongStream() {
        return new u(this, 0, 1);
    }

    @Override // j$.util.stream.IntStream
    public final d0 asDoubleStream() {
        return new s(this, 0, 3);
    }

    @Override // j$.util.stream.IntStream
    public final Stream boxed() {
        return new r(this, 0, new o(16), 1);
    }

    @Override // j$.util.stream.IntStream
    public final IntStream e() {
        Objects.requireNonNull(null);
        return new t(this, y6.f18267p | y6.f18265n, 1);
    }

    @Override // j$.util.stream.IntStream
    public final Stream mapToObj(IntFunction intFunction) {
        Objects.requireNonNull(intFunction);
        return new r(this, y6.f18267p | y6.f18265n, intFunction, 1);
    }

    @Override // j$.util.stream.IntStream
    public final m1 k() {
        Objects.requireNonNull(null);
        return new u(this, y6.f18267p | y6.f18265n, 2);
    }

    @Override // j$.util.stream.IntStream
    public final d0 g() {
        Objects.requireNonNull(null);
        return new s(this, y6.f18267p | y6.f18265n, 4);
    }

    @Override // j$.util.stream.IntStream
    public final int reduce(int i10, IntBinaryOperator intBinaryOperator) {
        Objects.requireNonNull(intBinaryOperator);
        return ((Integer) I0(new l4(z6.INT_VALUE, intBinaryOperator, i10))).intValue();
    }

    @Override // j$.util.stream.IntStream
    public final IntStream r(l0 l0Var) {
        Objects.requireNonNull(l0Var);
        return new u0(this, y6.f18267p | y6.f18265n | y6.f18271t, l0Var, 1);
    }

    @Override // j$.util.stream.IntStream
    public final j$.util.c0 reduce(IntBinaryOperator intBinaryOperator) {
        Objects.requireNonNull(intBinaryOperator);
        return (j$.util.c0) I0(new y3(z6.INT_VALUE, intBinaryOperator, 3));
    }

    @Override // j$.util.stream.IntStream
    public final IntStream b() {
        Objects.requireNonNull(null);
        return new t(this, y6.f18271t, 3);
    }

    @Override // j$.util.stream.IntStream
    public final IntStream peek(IntConsumer intConsumer) {
        Objects.requireNonNull(intConsumer);
        return new u0(this, intConsumer);
    }

    @Override // j$.util.stream.IntStream
    public final IntStream limit(long j10) {
        if (j10 < 0) {
            throw new IllegalArgumentException(Long.toString(j10));
        }
        return v3.x0(this, 0L, j10);
    }

    @Override // j$.util.stream.IntStream
    public final IntStream skip(long j10) {
        if (j10 >= 0) {
            return j10 == 0 ? this : v3.x0(this, j10, -1L);
        }
        throw new IllegalArgumentException(Long.toString(j10));
    }

    @Override // j$.util.stream.IntStream
    public final IntStream a() {
        int i10 = a9.f17918a;
        Objects.requireNonNull(null);
        return new e6(this, a9.f17918a, 1);
    }

    @Override // j$.util.stream.IntStream
    public final IntStream c() {
        int i10 = a9.f17918a;
        Objects.requireNonNull(null);
        return new e6(this, a9.f17919b, 2);
    }

    @Override // j$.util.stream.IntStream
    public final long count() {
        return ((Long) I0(new c4(3))).longValue();
    }

    @Override // j$.util.stream.IntStream
    public final IntStream distinct() {
        return ((d5) boxed()).distinct().mapToInt(new o(15));
    }

    @Override // j$.util.stream.IntStream
    public final int sum() {
        return reduce(0, new o(20));
    }

    @Override // j$.util.stream.IntStream
    public final j$.util.c0 min() {
        return reduce(new o(17));
    }

    @Override // j$.util.stream.IntStream
    public final j$.util.c0 max() {
        return reduce(new o(21));
    }

    @Override // j$.util.stream.IntStream
    public final j$.util.b0 average() {
        long j10 = ((long[]) collect(new o(22), new o(23), new o(24)))[0];
        return j10 > 0 ? new j$.util.b0(r0[1] / j10) : j$.util.b0.f17704c;
    }

    @Override // j$.util.stream.IntStream
    public final j$.util.y summaryStatistics() {
        return (j$.util.y) collect(new j$.time.format.b(12), new o(18), new o(19));
    }

    @Override // j$.util.stream.IntStream
    public final Object collect(Supplier supplier, ObjIntConsumer objIntConsumer, BiConsumer biConsumer) {
        Objects.requireNonNull(biConsumer);
        p pVar = new p(biConsumer, 1);
        Objects.requireNonNull(supplier);
        Objects.requireNonNull(objIntConsumer);
        Objects.requireNonNull(pVar);
        return I0(new a4(z6.INT_VALUE, pVar, objIntConsumer, supplier, 4));
    }

    @Override // j$.util.stream.IntStream
    public final boolean x() {
        return ((Boolean) I0(v3.w0(t1.ANY))).booleanValue();
    }

    @Override // j$.util.stream.IntStream
    public final boolean p() {
        return ((Boolean) I0(v3.w0(t1.ALL))).booleanValue();
    }

    @Override // j$.util.stream.IntStream
    public final boolean s() {
        return ((Boolean) I0(v3.w0(t1.NONE))).booleanValue();
    }

    @Override // j$.util.stream.IntStream
    public final int[] toArray() {
        return (int[]) v3.o0((c2) J0(new o(14))).b();
    }
}
