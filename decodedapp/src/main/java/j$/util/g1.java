package j$.util;

import java.util.NoSuchElementException;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: loaded from: classes2.dex */
public final class g1 implements l0, IntConsumer, z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f17820a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f17821b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ x0 f17822c;

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return j$.com.android.tools.r8.a.c(this, intConsumer);
    }

    @Override // j$.util.q0
    public final void forEachRemaining(IntConsumer intConsumer) {
        Objects.requireNonNull(intConsumer);
        while (hasNext()) {
            intConsumer.accept(nextInt());
        }
    }

    @Override // java.util.Iterator
    public final Integer next() {
        if (u1.f18301a) {
            u1.a(g1.class, "{0} calling PrimitiveIterator.OfInt.nextInt()");
            throw null;
        }
        return Integer.valueOf(nextInt());
    }

    @Override // j$.util.l0, java.util.Iterator, j$.util.z
    public final void forEachRemaining(Consumer consumer) {
        if (consumer instanceof IntConsumer) {
            forEachRemaining((IntConsumer) consumer);
            return;
        }
        Objects.requireNonNull(consumer);
        if (u1.f18301a) {
            u1.a(g1.class, "{0} calling PrimitiveIterator.OfInt.forEachRemainingInt(action::accept)");
            throw null;
        }
        Objects.requireNonNull(consumer);
        forEachRemaining((IntConsumer) new i0(consumer, 0));
    }

    public g1(x0 x0Var) {
        this.f17822c = x0Var;
    }

    @Override // java.util.function.IntConsumer
    public final void accept(int i10) {
        this.f17820a = true;
        this.f17821b = i10;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (!this.f17820a) {
            this.f17822c.tryAdvance((IntConsumer) this);
        }
        return this.f17820a;
    }

    @Override // j$.util.l0
    public final int nextInt() {
        if (!this.f17820a && !hasNext()) {
            throw new NoSuchElementException();
        }
        this.f17820a = false;
        return this.f17821b;
    }
}
