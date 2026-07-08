package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.DoublePredicate;

/* JADX INFO: loaded from: classes2.dex */
public final class v8 extends z8 implements DoubleConsumer, j$.util.u0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public double f18227e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f18228f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v8(Spliterator spliterator, int i10) {
        super(spliterator);
        this.f18228f = i10;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v8(Spliterator spliterator, z8 z8Var, int i10) {
        super(spliterator, z8Var);
        this.f18228f = i10;
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return j$.com.android.tools.r8.a.b(this, doubleConsumer);
    }

    @Override // j$.util.stream.z8, j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        j$.util.c.a(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return j$.util.c.f(this, consumer);
    }

    @Override // j$.util.d1
    public final void forEachRemaining(DoubleConsumer doubleConsumer) {
        while (tryAdvance(doubleConsumer)) {
        }
    }

    @Override // java.util.function.DoubleConsumer
    public final void accept(double d10) {
        this.f18294d = (this.f18294d + 1) & 63;
        this.f18227e = d10;
    }

    @Override // j$.util.stream.z8
    public final Spliterator b(Spliterator spliterator) {
        switch (this.f18228f) {
            case 0:
                return new v8((j$.util.u0) spliterator, this, 0);
            default:
                return new v8((j$.util.u0) spliterator, this, 1);
        }
    }

    @Override // j$.util.stream.z8, j$.util.Spliterator
    public /* bridge */ /* synthetic */ Spliterator trySplit() {
        switch (this.f18228f) {
            case 1:
                return trySplit();
            default:
                return super.trySplit();
        }
    }

    @Override // j$.util.stream.z8, j$.util.Spliterator
    public /* bridge */ /* synthetic */ j$.util.d1 trySplit() {
        switch (this.f18228f) {
            case 1:
                return trySplit();
            default:
                return super.trySplit();
        }
    }

    @Override // j$.util.u0
    public final boolean tryAdvance(DoubleConsumer doubleConsumer) {
        switch (this.f18228f) {
            case 0:
                boolean z10 = this.f18293c;
                Spliterator spliterator = this.f18291a;
                if (z10) {
                    this.f18293c = false;
                    boolean zTryAdvance = ((j$.util.u0) spliterator).tryAdvance((DoubleConsumer) this);
                    if (zTryAdvance && a()) {
                        DoublePredicate doublePredicate = null;
                        doublePredicate.test(this.f18227e);
                        throw null;
                    }
                    if (!zTryAdvance) {
                        return zTryAdvance;
                    }
                    doubleConsumer.accept(this.f18227e);
                    return zTryAdvance;
                }
                return ((j$.util.u0) spliterator).tryAdvance(doubleConsumer);
            default:
                if (this.f18293c && a() && ((j$.util.u0) this.f18291a).tryAdvance((DoubleConsumer) this)) {
                    DoublePredicate doublePredicate2 = null;
                    doublePredicate2.test(this.f18227e);
                    throw null;
                }
                this.f18293c = false;
                return false;
        }
    }

    @Override // j$.util.stream.z8, j$.util.Spliterator
    public j$.util.u0 trySplit() {
        switch (this.f18228f) {
            case 1:
                if (this.f18292b.get()) {
                    return null;
                }
                return (j$.util.u0) super.trySplit();
            default:
                return super.trySplit();
        }
    }

    @Override // j$.util.d1
    public /* bridge */ /* synthetic */ boolean tryAdvance(Object obj) {
        switch (this.f18228f) {
            case 1:
                tryAdvance((DoubleConsumer) obj);
                return false;
            default:
                return tryAdvance((DoubleConsumer) obj);
        }
    }
}
