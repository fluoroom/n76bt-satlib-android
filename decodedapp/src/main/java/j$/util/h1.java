package j$.util;

import java.util.NoSuchElementException;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* JADX INFO: loaded from: classes2.dex */
public final class h1 implements p0, LongConsumer, z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f17825a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f17826b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a1 f17827c;

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return j$.com.android.tools.r8.a.d(this, longConsumer);
    }

    @Override // j$.util.q0
    public final void forEachRemaining(LongConsumer longConsumer) {
        Objects.requireNonNull(longConsumer);
        while (hasNext()) {
            longConsumer.accept(nextLong());
        }
    }

    @Override // java.util.Iterator
    public final Long next() {
        if (u1.f18301a) {
            u1.a(h1.class, "{0} calling PrimitiveIterator.OfLong.nextLong()");
            throw null;
        }
        return Long.valueOf(nextLong());
    }

    @Override // j$.util.p0, java.util.Iterator, j$.util.z
    public final void forEachRemaining(Consumer consumer) {
        if (consumer instanceof LongConsumer) {
            forEachRemaining((LongConsumer) consumer);
            return;
        }
        Objects.requireNonNull(consumer);
        if (u1.f18301a) {
            u1.a(h1.class, "{0} calling PrimitiveIterator.OfLong.forEachRemainingLong(action::accept)");
            throw null;
        }
        Objects.requireNonNull(consumer);
        forEachRemaining((LongConsumer) new m0(consumer, 0));
    }

    public h1(a1 a1Var) {
        this.f17827c = a1Var;
    }

    @Override // java.util.function.LongConsumer
    public final void accept(long j10) {
        this.f17825a = true;
        this.f17826b = j10;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (!this.f17825a) {
            this.f17827c.tryAdvance((LongConsumer) this);
        }
        return this.f17825a;
    }

    @Override // j$.util.p0
    public final long nextLong() {
        if (!this.f17825a && !hasNext()) {
            throw new NoSuchElementException();
        }
        this.f17825a = false;
        return this.f17826b;
    }
}
