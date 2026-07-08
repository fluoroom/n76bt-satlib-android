package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.DoubleBinaryOperator;
import java.util.function.DoubleConsumer;
import java.util.function.DoubleFunction;
import java.util.function.IntFunction;
import java.util.function.ObjDoubleConsumer;
import java.util.function.Supplier;

/* JADX INFO: loaded from: classes2.dex */
public abstract class a0 extends a implements d0 {
    @Override // j$.util.stream.d0
    public final j$.util.b0 findAny() {
        return (j$.util.b0) I0(f0.f17975d);
    }

    @Override // j$.util.stream.d0
    public final j$.util.b0 findFirst() {
        return (j$.util.b0) I0(f0.f17974c);
    }

    @Override // j$.util.stream.d0
    public final d0 sorted() {
        return new d6(this, y6.f18268q | y6.f18266o, 0);
    }

    public static j$.util.u0 U0(Spliterator spliterator) {
        if (spliterator instanceof j$.util.u0) {
            return (j$.util.u0) spliterator;
        }
        if (i8.f18022a) {
            i8.a(a.class, "using DoubleStream.adapt(Spliterator<Double> s)");
            throw null;
        }
        throw new UnsupportedOperationException("DoubleStream.adapt(Spliterator<Double> s)");
    }

    @Override // j$.util.stream.d0
    public void forEach(DoubleConsumer doubleConsumer) {
        Objects.requireNonNull(doubleConsumer);
        I0(new m0(doubleConsumer, false));
    }

    @Override // j$.util.stream.d0
    public void forEachOrdered(DoubleConsumer doubleConsumer) {
        Objects.requireNonNull(doubleConsumer);
        I0(new m0(doubleConsumer, true));
    }

    @Override // j$.util.stream.a
    public final z6 M0() {
        return z6.DOUBLE_VALUE;
    }

    @Override // j$.util.stream.a
    public final g2 K0(a aVar, Spliterator spliterator, boolean z10, IntFunction intFunction) {
        return v3.b0(aVar, spliterator, z10);
    }

    @Override // j$.util.stream.a
    public final Spliterator T0(a aVar, Supplier supplier, boolean z10) {
        return new j7(aVar, supplier, z10);
    }

    @Override // j$.util.stream.a
    public final boolean L0(Spliterator spliterator, l5 l5Var) {
        DoubleConsumer e0Var;
        boolean zE;
        j$.util.u0 u0VarU0 = U0(spliterator);
        if (l5Var instanceof DoubleConsumer) {
            e0Var = (DoubleConsumer) l5Var;
        } else {
            if (i8.f18022a) {
                i8.a(a.class, "using DoubleStream.adapt(Sink<Double> s)");
                throw null;
            }
            Objects.requireNonNull(l5Var);
            e0Var = new j$.util.e0(l5Var, 1);
        }
        do {
            zE = l5Var.e();
            if (zE) {
                break;
            }
        } while (u0VarU0.tryAdvance(e0Var));
        return zE;
    }

    @Override // j$.util.stream.v3
    public final y1 A0(long j10, IntFunction intFunction) {
        return v3.h0(j10);
    }

    @Override // j$.util.stream.g
    public final j$.util.h0 iterator() {
        j$.util.u0 u0VarSpliterator = spliterator();
        Objects.requireNonNull(u0VarSpliterator);
        return new j$.util.i1(u0VarSpliterator);
    }

    @Override // j$.util.stream.a, j$.util.stream.g
    public final j$.util.u0 spliterator() {
        return U0(super.spliterator());
    }

    @Override // j$.util.stream.d0
    public final Stream boxed() {
        return new r(this, 0, new j$.time.format.b(29), 0);
    }

    @Override // j$.util.stream.d0
    public final d0 e() {
        Objects.requireNonNull(null);
        return new s(this, y6.f18267p | y6.f18265n, 0);
    }

    @Override // j$.util.stream.d0
    public final Stream mapToObj(DoubleFunction doubleFunction) {
        Objects.requireNonNull(doubleFunction);
        return new r(this, y6.f18267p | y6.f18265n, doubleFunction, 0);
    }

    @Override // j$.util.stream.d0
    public final IntStream z() {
        Objects.requireNonNull(null);
        return new t(this, y6.f18267p | y6.f18265n, 0);
    }

    @Override // j$.util.stream.d0
    public final m1 u() {
        Objects.requireNonNull(null);
        return new u(this, y6.f18267p | y6.f18265n, 0);
    }

    @Override // j$.util.stream.d0
    public final d0 d(j$.util.q qVar) {
        Objects.requireNonNull(qVar);
        return new w(this, y6.f18267p | y6.f18265n | y6.f18271t, qVar, 0);
    }

    @Override // j$.util.stream.d0
    public final d0 b() {
        Objects.requireNonNull(null);
        return new s(this, y6.f18271t, 2);
    }

    @Override // j$.util.stream.d0
    public final d0 peek(DoubleConsumer doubleConsumer) {
        Objects.requireNonNull(doubleConsumer);
        return new w(this, doubleConsumer);
    }

    @Override // j$.util.stream.d0
    public final d0 limit(long j10) {
        if (j10 < 0) {
            throw new IllegalArgumentException(Long.toString(j10));
        }
        return v3.v0(this, 0L, j10);
    }

    @Override // j$.util.stream.d0
    public final d0 skip(long j10) {
        if (j10 >= 0) {
            return j10 == 0 ? this : v3.v0(this, j10, -1L);
        }
        throw new IllegalArgumentException(Long.toString(j10));
    }

    @Override // j$.util.stream.d0
    public final d0 a() {
        int i10 = a9.f17918a;
        Objects.requireNonNull(null);
        return new d6(this, a9.f17918a, 1);
    }

    @Override // j$.util.stream.d0
    public final d0 c() {
        int i10 = a9.f17918a;
        Objects.requireNonNull(null);
        return new d6(this, a9.f17919b, 2);
    }

    @Override // j$.util.stream.d0
    public final d0 distinct() {
        return ((d5) boxed()).distinct().mapToDouble(new o(0));
    }

    @Override // j$.util.stream.d0
    public final double sum() {
        double[] dArr = (double[]) collect(new o(3), new o(4), new j$.time.format.b(22));
        Set set = Collectors.f17883a;
        double d10 = dArr[0] + dArr[1];
        double d11 = dArr[dArr.length - 1];
        return (Double.isNaN(d10) && Double.isInfinite(d11)) ? d11 : d10;
    }

    @Override // j$.util.stream.d0
    public final j$.util.b0 min() {
        return reduce(new j$.time.format.b(23));
    }

    @Override // j$.util.stream.d0
    public final j$.util.b0 max() {
        return reduce(new o(2));
    }

    @Override // j$.util.stream.d0
    public final j$.util.b0 average() {
        double[] dArr = (double[]) collect(new j$.time.format.b(24), new j$.time.format.b(25), new j$.time.format.b(26));
        if (dArr[2] <= 0.0d) {
            return j$.util.b0.f17704c;
        }
        Set set = Collectors.f17883a;
        double d10 = dArr[0] + dArr[1];
        double d11 = dArr[dArr.length - 1];
        if (Double.isNaN(d10) && Double.isInfinite(d11)) {
            d10 = d11;
        }
        return new j$.util.b0(d10 / dArr[2]);
    }

    @Override // j$.util.stream.d0
    public final j$.util.x summaryStatistics() {
        return (j$.util.x) collect(new j$.time.format.b(9), new j$.time.format.b(27), new j$.time.format.b(28));
    }

    @Override // j$.util.stream.d0
    public final Object collect(Supplier supplier, ObjDoubleConsumer objDoubleConsumer, BiConsumer biConsumer) {
        Objects.requireNonNull(biConsumer);
        p pVar = new p(biConsumer, 0);
        Objects.requireNonNull(supplier);
        Objects.requireNonNull(objDoubleConsumer);
        Objects.requireNonNull(pVar);
        return I0(new a4(z6.DOUBLE_VALUE, pVar, objDoubleConsumer, supplier, 1));
    }

    @Override // j$.util.stream.d0
    public final boolean o() {
        return ((Boolean) I0(v3.u0(t1.ANY))).booleanValue();
    }

    @Override // j$.util.stream.d0
    public final boolean t() {
        return ((Boolean) I0(v3.u0(t1.ALL))).booleanValue();
    }

    @Override // j$.util.stream.d0
    public final boolean B() {
        return ((Boolean) I0(v3.u0(t1.NONE))).booleanValue();
    }

    @Override // j$.util.stream.d0
    public final double[] toArray() {
        return (double[]) v3.n0((a2) J0(new o(1))).b();
    }

    @Override // j$.util.stream.d0
    public final double reduce(double d10, DoubleBinaryOperator doubleBinaryOperator) {
        Objects.requireNonNull(doubleBinaryOperator);
        return ((Double) I0(new e4(z6.DOUBLE_VALUE, doubleBinaryOperator, d10))).doubleValue();
    }

    @Override // j$.util.stream.d0
    public final j$.util.b0 reduce(DoubleBinaryOperator doubleBinaryOperator) {
        Objects.requireNonNull(doubleBinaryOperator);
        return (j$.util.b0) I0(new y3(z6.DOUBLE_VALUE, doubleBinaryOperator, 1));
    }

    @Override // j$.util.stream.d0
    public final long count() {
        return ((Long) I0(new c4(1))).longValue();
    }
}
