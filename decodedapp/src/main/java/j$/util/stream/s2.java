package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import j$.util.Spliterators;
import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.IntFunction;

/* JADX INFO: loaded from: classes2.dex */
public class s2 implements a2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double[] f18160a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f18161b;

    @Override // j$.util.stream.g2
    public final /* synthetic */ void forEach(Consumer consumer) {
        v3.P(this, consumer);
    }

    @Override // j$.util.stream.g2
    public final /* synthetic */ g2 i(long j10, long j11, IntFunction intFunction) {
        return v3.S(this, j10, j11);
    }

    @Override // j$.util.stream.g2
    public final /* synthetic */ Object[] m(IntFunction intFunction) {
        return v3.L(this, intFunction);
    }

    @Override // j$.util.stream.g2
    public final /* synthetic */ int o() {
        return 0;
    }

    @Override // j$.util.stream.g2
    public final /* bridge */ /* synthetic */ g2 a(int i10) {
        a(i10);
        throw null;
    }

    @Override // j$.util.stream.f2, j$.util.stream.g2
    public final f2 a(int i10) {
        throw new IndexOutOfBoundsException();
    }

    @Override // j$.util.stream.g2
    public final /* synthetic */ void k(Object[] objArr, int i10) {
        v3.M(this, (Double[]) objArr, i10);
    }

    @Override // j$.util.stream.f2
    public final void f(int i10, Object obj) {
        int i11 = this.f18161b;
        System.arraycopy(this.f18160a, 0, (double[]) obj, i10, i11);
    }

    @Override // j$.util.stream.f2
    public final void g(Object obj) {
        DoubleConsumer doubleConsumer = (DoubleConsumer) obj;
        for (int i10 = 0; i10 < this.f18161b; i10++) {
            doubleConsumer.accept(this.f18160a[i10]);
        }
    }

    public s2(long j10) {
        if (j10 >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.f18160a = new double[(int) j10];
        this.f18161b = 0;
    }

    public s2(double[] dArr) {
        this.f18160a = dArr;
        this.f18161b = dArr.length;
    }

    @Override // j$.util.stream.g2
    public final Spliterator spliterator() {
        int i10 = this.f18161b;
        double[] dArr = this.f18160a;
        Spliterators.a(((double[]) Objects.requireNonNull(dArr)).length, 0, i10);
        return new j$.util.k1(dArr, 0, i10, 1040);
    }

    @Override // j$.util.stream.f2, j$.util.stream.g2
    public final j$.util.d1 spliterator() {
        int i10 = this.f18161b;
        double[] dArr = this.f18160a;
        Spliterators.a(((double[]) Objects.requireNonNull(dArr)).length, 0, i10);
        return new j$.util.k1(dArr, 0, i10, 1040);
    }

    @Override // j$.util.stream.f2
    public final Object b() {
        double[] dArr = this.f18160a;
        int length = dArr.length;
        int i10 = this.f18161b;
        return length == i10 ? dArr : Arrays.copyOf(dArr, i10);
    }

    @Override // j$.util.stream.g2
    public final long count() {
        return this.f18161b;
    }

    public String toString() {
        double[] dArr = this.f18160a;
        return String.format("DoubleArrayNode[%d][%s]", Integer.valueOf(dArr.length - this.f18161b), Arrays.toString(dArr));
    }
}
