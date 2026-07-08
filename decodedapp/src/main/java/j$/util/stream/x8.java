package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.LongConsumer;
import java.util.function.LongPredicate;

/* JADX INFO: loaded from: classes2.dex */
public final class x8 extends z8 implements LongConsumer, j$.util.a1 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f18248e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f18249f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x8(Spliterator spliterator, int i10) {
        super(spliterator);
        this.f18249f = i10;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x8(Spliterator spliterator, z8 z8Var, int i10) {
        super(spliterator, z8Var);
        this.f18249f = i10;
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return j$.com.android.tools.r8.a.d(this, longConsumer);
    }

    @Override // j$.util.stream.z8, j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        j$.util.c.c(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return j$.util.c.h(this, consumer);
    }

    @Override // j$.util.d1
    public final void forEachRemaining(LongConsumer longConsumer) {
        while (tryAdvance(longConsumer)) {
        }
    }

    @Override // java.util.function.LongConsumer
    public final void accept(long j10) {
        this.f18294d = (this.f18294d + 1) & 63;
        this.f18248e = j10;
    }

    @Override // j$.util.stream.z8
    public final Spliterator b(Spliterator spliterator) {
        switch (this.f18249f) {
            case 0:
                return new x8((j$.util.a1) spliterator, this, 0);
            default:
                return new x8((j$.util.a1) spliterator, this, 1);
        }
    }

    @Override // j$.util.stream.z8, j$.util.Spliterator
    public /* bridge */ /* synthetic */ Spliterator trySplit() {
        switch (this.f18249f) {
            case 1:
                return trySplit();
            default:
                return super.trySplit();
        }
    }

    @Override // j$.util.stream.z8, j$.util.Spliterator
    public /* bridge */ /* synthetic */ j$.util.d1 trySplit() {
        switch (this.f18249f) {
            case 1:
                return trySplit();
            default:
                return super.trySplit();
        }
    }

    @Override // j$.util.a1
    public final boolean tryAdvance(LongConsumer longConsumer) {
        switch (this.f18249f) {
            case 0:
                boolean z10 = this.f18293c;
                Spliterator spliterator = this.f18291a;
                if (z10) {
                    this.f18293c = false;
                    boolean zTryAdvance = ((j$.util.a1) spliterator).tryAdvance((LongConsumer) this);
                    if (zTryAdvance && a()) {
                        LongPredicate longPredicate = null;
                        longPredicate.test(this.f18248e);
                        throw null;
                    }
                    if (!zTryAdvance) {
                        return zTryAdvance;
                    }
                    longConsumer.accept(this.f18248e);
                    return zTryAdvance;
                }
                return ((j$.util.a1) spliterator).tryAdvance(longConsumer);
            default:
                if (this.f18293c && a() && ((j$.util.a1) this.f18291a).tryAdvance((LongConsumer) this)) {
                    LongPredicate longPredicate2 = null;
                    longPredicate2.test(this.f18248e);
                    throw null;
                }
                this.f18293c = false;
                return false;
        }
    }

    @Override // j$.util.stream.z8, j$.util.Spliterator
    public j$.util.a1 trySplit() {
        switch (this.f18249f) {
            case 1:
                if (this.f18292b.get()) {
                    return null;
                }
                return (j$.util.a1) super.trySplit();
            default:
                return super.trySplit();
        }
    }

    @Override // j$.util.d1
    public /* bridge */ /* synthetic */ boolean tryAdvance(Object obj) {
        switch (this.f18249f) {
            case 1:
                tryAdvance((LongConsumer) obj);
                return false;
            default:
                return tryAdvance((LongConsumer) obj);
        }
    }
}
