package j$.util.stream;

import j$.util.Spliterator;
import java.util.Deque;
import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;

/* JADX INFO: loaded from: classes2.dex */
public abstract class h3 extends j3 implements j$.util.d1 {
    @Override // j$.util.d1
    public final boolean tryAdvance(Object obj) {
        f2 f2Var;
        if (!c()) {
            return false;
        }
        boolean zTryAdvance = ((j$.util.d1) this.f18031d).tryAdvance(obj);
        if (!zTryAdvance) {
            if (this.f18030c == null && (f2Var = (f2) j3.a(this.f18032e)) != null) {
                j$.util.d1 d1VarSpliterator = f2Var.spliterator();
                this.f18031d = d1VarSpliterator;
                return d1VarSpliterator.tryAdvance(obj);
            }
            this.f18028a = null;
        }
        return zTryAdvance;
    }

    @Override // j$.util.d1
    public final void forEachRemaining(Object obj) {
        if (this.f18028a == null) {
            return;
        }
        if (this.f18031d == null) {
            Spliterator spliterator = this.f18030c;
            if (spliterator == null) {
                Deque dequeB = b();
                while (true) {
                    f2 f2Var = (f2) j3.a(dequeB);
                    if (f2Var != null) {
                        f2Var.g(obj);
                    } else {
                        this.f18028a = null;
                        return;
                    }
                }
            } else {
                ((j$.util.d1) spliterator).forEachRemaining(obj);
            }
        } else {
            while (tryAdvance(obj)) {
            }
        }
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(IntConsumer intConsumer) {
        forEachRemaining((Object) intConsumer);
    }

    public /* bridge */ /* synthetic */ boolean tryAdvance(IntConsumer intConsumer) {
        return tryAdvance((Object) intConsumer);
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(LongConsumer longConsumer) {
        forEachRemaining((Object) longConsumer);
    }

    public /* bridge */ /* synthetic */ boolean tryAdvance(LongConsumer longConsumer) {
        return tryAdvance((Object) longConsumer);
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(DoubleConsumer doubleConsumer) {
        forEachRemaining((Object) doubleConsumer);
    }

    public /* bridge */ /* synthetic */ boolean tryAdvance(DoubleConsumer doubleConsumer) {
        return tryAdvance((Object) doubleConsumer);
    }
}
