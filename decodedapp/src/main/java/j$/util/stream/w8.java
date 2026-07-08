package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;
import java.util.function.IntPredicate;

/* JADX INFO: loaded from: classes2.dex */
public final class w8 extends z8 implements IntConsumer, j$.util.x0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f18240e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f18241f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w8(Spliterator spliterator, int i10) {
        super(spliterator);
        this.f18241f = i10;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w8(Spliterator spliterator, z8 z8Var, int i10) {
        super(spliterator, z8Var);
        this.f18241f = i10;
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return j$.com.android.tools.r8.a.c(this, intConsumer);
    }

    @Override // j$.util.stream.z8, j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        j$.util.c.b(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return j$.util.c.g(this, consumer);
    }

    @Override // j$.util.d1
    public final void forEachRemaining(IntConsumer intConsumer) {
        while (tryAdvance(intConsumer)) {
        }
    }

    @Override // java.util.function.IntConsumer
    public final void accept(int i10) {
        this.f18294d = (this.f18294d + 1) & 63;
        this.f18240e = i10;
    }

    @Override // j$.util.stream.z8
    public final Spliterator b(Spliterator spliterator) {
        switch (this.f18241f) {
            case 0:
                return new w8((j$.util.x0) spliterator, this, 0);
            default:
                return new w8((j$.util.x0) spliterator, this, 1);
        }
    }

    @Override // j$.util.stream.z8, j$.util.Spliterator
    public /* bridge */ /* synthetic */ Spliterator trySplit() {
        switch (this.f18241f) {
            case 1:
                return trySplit();
            default:
                return super.trySplit();
        }
    }

    @Override // j$.util.stream.z8, j$.util.Spliterator
    public /* bridge */ /* synthetic */ j$.util.d1 trySplit() {
        switch (this.f18241f) {
            case 1:
                return trySplit();
            default:
                return super.trySplit();
        }
    }

    @Override // j$.util.x0
    public final boolean tryAdvance(IntConsumer intConsumer) {
        switch (this.f18241f) {
            case 0:
                boolean z10 = this.f18293c;
                Spliterator spliterator = this.f18291a;
                if (z10) {
                    this.f18293c = false;
                    boolean zTryAdvance = ((j$.util.x0) spliterator).tryAdvance((IntConsumer) this);
                    if (zTryAdvance && a()) {
                        IntPredicate intPredicate = null;
                        intPredicate.test(this.f18240e);
                        throw null;
                    }
                    if (!zTryAdvance) {
                        return zTryAdvance;
                    }
                    intConsumer.accept(this.f18240e);
                    return zTryAdvance;
                }
                return ((j$.util.x0) spliterator).tryAdvance(intConsumer);
            default:
                if (this.f18293c && a() && ((j$.util.x0) this.f18291a).tryAdvance((IntConsumer) this)) {
                    IntPredicate intPredicate2 = null;
                    intPredicate2.test(this.f18240e);
                    throw null;
                }
                this.f18293c = false;
                return false;
        }
    }

    @Override // j$.util.stream.z8, j$.util.Spliterator
    public j$.util.x0 trySplit() {
        switch (this.f18241f) {
            case 1:
                if (this.f18292b.get()) {
                    return null;
                }
                return (j$.util.x0) super.trySplit();
            default:
                return super.trySplit();
        }
    }

    @Override // j$.util.d1
    public /* bridge */ /* synthetic */ boolean tryAdvance(Object obj) {
        switch (this.f18241f) {
            case 1:
                tryAdvance((IntConsumer) obj);
                return false;
            default:
                return tryAdvance((IntConsumer) obj);
        }
    }
}
