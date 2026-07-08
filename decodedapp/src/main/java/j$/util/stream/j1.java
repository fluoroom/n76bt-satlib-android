package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import java.util.function.BiConsumer;
import java.util.function.IntFunction;
import java.util.function.LongBinaryOperator;
import java.util.function.LongConsumer;
import java.util.function.LongFunction;
import java.util.function.ObjLongConsumer;
import java.util.function.Supplier;

/* JADX INFO: loaded from: classes2.dex */
public abstract class j1 extends a implements m1 {
    @Override // j$.util.stream.m1
    public final j$.util.d0 findAny() {
        return (j$.util.d0) I0(h0.f17997d);
    }

    @Override // j$.util.stream.m1
    public final j$.util.d0 findFirst() {
        return (j$.util.d0) I0(h0.f17996c);
    }

    @Override // j$.util.stream.m1
    public final m1 sorted() {
        return new f6(this, y6.f18268q | y6.f18266o, 0);
    }

    public void forEach(LongConsumer longConsumer) {
        Objects.requireNonNull(longConsumer);
        I0(new o0(longConsumer, false));
    }

    public void forEachOrdered(LongConsumer longConsumer) {
        Objects.requireNonNull(longConsumer);
        I0(new o0(longConsumer, true));
    }

    public static j$.util.a1 U0(Spliterator spliterator) {
        if (spliterator instanceof j$.util.a1) {
            return (j$.util.a1) spliterator;
        }
        if (i8.f18022a) {
            i8.a(a.class, "using LongStream.adapt(Spliterator<Long> s)");
            throw null;
        }
        throw new UnsupportedOperationException("LongStream.adapt(Spliterator<Long> s)");
    }

    @Override // j$.util.stream.a
    public final z6 M0() {
        return z6.LONG_VALUE;
    }

    @Override // j$.util.stream.a
    public final g2 K0(a aVar, Spliterator spliterator, boolean z10, IntFunction intFunction) {
        return v3.d0(aVar, spliterator, z10);
    }

    @Override // j$.util.stream.a
    public final Spliterator T0(a aVar, Supplier supplier, boolean z10) {
        return new n7(aVar, supplier, z10);
    }

    @Override // j$.util.stream.a
    public final boolean L0(Spliterator spliterator, l5 l5Var) {
        LongConsumer m0Var;
        boolean zE;
        j$.util.a1 a1VarU0 = U0(spliterator);
        if (l5Var instanceof LongConsumer) {
            m0Var = (LongConsumer) l5Var;
        } else {
            if (i8.f18022a) {
                i8.a(a.class, "using LongStream.adapt(Sink<Long> s)");
                throw null;
            }
            Objects.requireNonNull(l5Var);
            m0Var = new j$.util.m0(l5Var, 1);
        }
        do {
            zE = l5Var.e();
            if (zE) {
                break;
            }
        } while (a1VarU0.tryAdvance(m0Var));
        return zE;
    }

    @Override // j$.util.stream.v3
    public final y1 A0(long j10, IntFunction intFunction) {
        return v3.t0(j10);
    }

    @Override // j$.util.stream.g
    public final j$.util.p0 iterator() {
        j$.util.a1 a1VarSpliterator = spliterator();
        Objects.requireNonNull(a1VarSpliterator);
        return new j$.util.h1(a1VarSpliterator);
    }

    @Override // j$.util.stream.a, j$.util.stream.g
    public final j$.util.a1 spliterator() {
        return U0(super.spliterator());
    }

    @Override // j$.util.stream.m1
    public final d0 asDoubleStream() {
        return new s(this, y6.f18265n, 5);
    }

    @Override // j$.util.stream.m1
    public final Stream boxed() {
        return new r(this, 0, new b1(0), 2);
    }

    @Override // j$.util.stream.m1
    public final m1 e() {
        Objects.requireNonNull(null);
        return new u(this, y6.f18267p | y6.f18265n, 3);
    }

    @Override // j$.util.stream.m1
    public final Stream mapToObj(LongFunction longFunction) {
        Objects.requireNonNull(longFunction);
        return new r(this, y6.f18267p | y6.f18265n, longFunction, 2);
    }

    @Override // j$.util.stream.m1
    public final IntStream A() {
        Objects.requireNonNull(null);
        return new t(this, y6.f18267p | y6.f18265n, 4);
    }

    @Override // j$.util.stream.m1
    public final d0 j() {
        Objects.requireNonNull(null);
        return new s(this, y6.f18267p | y6.f18265n, 6);
    }

    @Override // j$.util.stream.m1
    public final m1 d(j$.util.q qVar) {
        Objects.requireNonNull(qVar);
        return new f1(this, y6.f18267p | y6.f18265n | y6.f18271t, qVar, 0);
    }

    @Override // j$.util.stream.m1
    public final m1 b() {
        Objects.requireNonNull(null);
        return new u(this, y6.f18271t, 5);
    }

    @Override // j$.util.stream.m1
    public final m1 peek(LongConsumer longConsumer) {
        Objects.requireNonNull(longConsumer);
        return new f1(this, longConsumer);
    }

    @Override // j$.util.stream.m1
    public final m1 limit(long j10) {
        if (j10 < 0) {
            throw new IllegalArgumentException(Long.toString(j10));
        }
        return v3.z0(this, 0L, j10);
    }

    @Override // j$.util.stream.m1
    public final m1 skip(long j10) {
        if (j10 >= 0) {
            return j10 == 0 ? this : v3.z0(this, j10, -1L);
        }
        throw new IllegalArgumentException(Long.toString(j10));
    }

    @Override // j$.util.stream.m1
    public final m1 a() {
        int i10 = a9.f17918a;
        Objects.requireNonNull(null);
        return new f6(this, a9.f17918a, 1);
    }

    @Override // j$.util.stream.m1
    public final m1 c() {
        int i10 = a9.f17918a;
        Objects.requireNonNull(null);
        return new f6(this, a9.f17919b, 2);
    }

    @Override // j$.util.stream.m1
    public final m1 distinct() {
        return ((d5) boxed()).distinct().mapToLong(new o(27));
    }

    @Override // j$.util.stream.m1
    public final long sum() {
        return reduce(0L, new b1(5));
    }

    @Override // j$.util.stream.m1
    public final j$.util.d0 min() {
        return reduce(new o(26));
    }

    @Override // j$.util.stream.m1
    public final j$.util.d0 max() {
        return reduce(new b1(4));
    }

    @Override // j$.util.stream.m1
    public final j$.util.b0 average() {
        long j10 = ((long[]) collect(new b1(1), new b1(2), new b1(3)))[0];
        return j10 > 0 ? new j$.util.b0(r0[1] / j10) : j$.util.b0.f17704c;
    }

    @Override // j$.util.stream.m1
    public final long reduce(long j10, LongBinaryOperator longBinaryOperator) {
        Objects.requireNonNull(longBinaryOperator);
        return ((Long) I0(new w3(z6.LONG_VALUE, longBinaryOperator, j10))).longValue();
    }

    @Override // j$.util.stream.m1
    public final j$.util.a0 summaryStatistics() {
        return (j$.util.a0) collect(new j$.time.format.b(13), new o(25), new o(28));
    }

    @Override // j$.util.stream.m1
    public final Object collect(Supplier supplier, ObjLongConsumer objLongConsumer, BiConsumer biConsumer) {
        Objects.requireNonNull(biConsumer);
        p pVar = new p(biConsumer, 2);
        Objects.requireNonNull(supplier);
        Objects.requireNonNull(objLongConsumer);
        Objects.requireNonNull(pVar);
        return I0(new a4(z6.LONG_VALUE, pVar, objLongConsumer, supplier, 0));
    }

    @Override // j$.util.stream.m1
    public final boolean q() {
        return ((Boolean) I0(v3.y0(t1.ANY))).booleanValue();
    }

    @Override // j$.util.stream.m1
    public final j$.util.d0 reduce(LongBinaryOperator longBinaryOperator) {
        Objects.requireNonNull(longBinaryOperator);
        return (j$.util.d0) I0(new y3(z6.LONG_VALUE, longBinaryOperator, 0));
    }

    @Override // j$.util.stream.m1
    public final boolean w() {
        return ((Boolean) I0(v3.y0(t1.ALL))).booleanValue();
    }

    @Override // j$.util.stream.m1
    public final boolean m() {
        return ((Boolean) I0(v3.y0(t1.NONE))).booleanValue();
    }

    @Override // j$.util.stream.m1
    public final long[] toArray() {
        return (long[]) v3.p0((e2) J0(new o(29))).b();
    }

    @Override // j$.util.stream.m1
    public final long count() {
        return ((Long) I0(new c4(0))).longValue();
    }
}
