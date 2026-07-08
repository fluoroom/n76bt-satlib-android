package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;
import java.util.function.Predicate;

/* JADX INFO: loaded from: classes2.dex */
public final class y8 extends z8 implements Consumer {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Predicate f18280e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f18281f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f18282g;

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y8(Spliterator spliterator, Predicate predicate, int i10) {
        super(spliterator);
        this.f18282g = i10;
        this.f18280e = predicate;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y8(Spliterator spliterator, y8 y8Var, int i10) {
        super(spliterator, y8Var);
        this.f18282g = i10;
        this.f18280e = y8Var.f18280e;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        this.f18294d = (this.f18294d + 1) & 63;
        this.f18281f = obj;
    }

    @Override // j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer) {
        boolean zTryAdvance;
        boolean zTest;
        switch (this.f18282g) {
            case 0:
                boolean z10 = this.f18293c;
                Spliterator spliterator = this.f18291a;
                if (z10) {
                    boolean z11 = false;
                    this.f18293c = false;
                    while (true) {
                        zTryAdvance = spliterator.tryAdvance(this);
                        if (zTryAdvance && a() && this.f18280e.test(this.f18281f)) {
                            z11 = true;
                        }
                    }
                    if (!zTryAdvance) {
                        return zTryAdvance;
                    }
                    if (z11) {
                        this.f18292b.set(true);
                    }
                    consumer.accept(this.f18281f);
                    return zTryAdvance;
                }
                return spliterator.tryAdvance(consumer);
            default:
                if (this.f18293c && a() && this.f18291a.tryAdvance(this)) {
                    zTest = this.f18280e.test(this.f18281f);
                    if (zTest) {
                        consumer.accept(this.f18281f);
                        return true;
                    }
                } else {
                    zTest = true;
                }
                this.f18293c = false;
                if (!zTest) {
                    this.f18292b.set(true);
                }
                return false;
        }
    }

    @Override // j$.util.stream.z8, j$.util.Spliterator
    public Spliterator trySplit() {
        switch (this.f18282g) {
            case 1:
                if (!this.f18292b.get()) {
                    break;
                }
                break;
        }
        return super.trySplit();
    }

    @Override // j$.util.stream.z8
    public final Spliterator b(Spliterator spliterator) {
        switch (this.f18282g) {
            case 0:
                return new y8(spliterator, this, 0);
            default:
                return new y8(spliterator, this, 1);
        }
    }
}
