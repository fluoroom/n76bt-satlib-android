package j$.util;

import java.util.NoSuchElementException;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* JADX INFO: loaded from: classes2.dex */
public final class i1 implements h0, DoubleConsumer, z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f17831a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public double f17832b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ u0 f17833c;

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return j$.com.android.tools.r8.a.b(this, doubleConsumer);
    }

    @Override // j$.util.q0
    public final void forEachRemaining(DoubleConsumer doubleConsumer) {
        Objects.requireNonNull(doubleConsumer);
        while (hasNext()) {
            doubleConsumer.accept(nextDouble());
        }
    }

    @Override // java.util.Iterator
    public final Double next() {
        if (u1.f18301a) {
            u1.a(i1.class, "{0} calling PrimitiveIterator.OfDouble.nextLong()");
            throw null;
        }
        return Double.valueOf(nextDouble());
    }

    @Override // j$.util.h0, java.util.Iterator, j$.util.z
    public final void forEachRemaining(Consumer consumer) {
        if (consumer instanceof DoubleConsumer) {
            forEachRemaining((DoubleConsumer) consumer);
            return;
        }
        Objects.requireNonNull(consumer);
        if (u1.f18301a) {
            u1.a(i1.class, "{0} calling PrimitiveIterator.OfDouble.forEachRemainingDouble(action::accept)");
            throw null;
        }
        Objects.requireNonNull(consumer);
        forEachRemaining((DoubleConsumer) new e0(consumer, 0));
    }

    public i1(u0 u0Var) {
        this.f17833c = u0Var;
    }

    @Override // java.util.function.DoubleConsumer
    public final void accept(double d10) {
        this.f17831a = true;
        this.f17832b = d10;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (!this.f17831a) {
            this.f17833c.tryAdvance((DoubleConsumer) this);
        }
        return this.f17831a;
    }

    @Override // j$.util.h0
    public final double nextDouble() {
        if (!this.f17831a && !hasNext()) {
            throw new NoSuchElementException();
        }
        this.f17831a = false;
        return this.f17832b;
    }
}
