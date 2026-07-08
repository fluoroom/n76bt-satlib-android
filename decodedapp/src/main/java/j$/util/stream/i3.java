package j$.util.stream;

import j$.util.Spliterator;
import java.util.Deque;
import java.util.function.Consumer;

/* JADX INFO: loaded from: classes2.dex */
public final class i3 extends j3 {
    @Override // j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer) {
        g2 g2VarA;
        if (!c()) {
            return false;
        }
        boolean zTryAdvance = this.f18031d.tryAdvance(consumer);
        if (!zTryAdvance) {
            if (this.f18030c == null && (g2VarA = j3.a(this.f18032e)) != null) {
                Spliterator spliterator = g2VarA.spliterator();
                this.f18031d = spliterator;
                return spliterator.tryAdvance(consumer);
            }
            this.f18028a = null;
        }
        return zTryAdvance;
    }

    @Override // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        if (this.f18028a == null) {
            return;
        }
        if (this.f18031d == null) {
            Spliterator spliterator = this.f18030c;
            if (spliterator == null) {
                Deque dequeB = b();
                while (true) {
                    g2 g2VarA = j3.a(dequeB);
                    if (g2VarA != null) {
                        g2VarA.forEach(consumer);
                    } else {
                        this.f18028a = null;
                        return;
                    }
                }
            } else {
                spliterator.forEachRemaining(consumer);
            }
        } else {
            while (tryAdvance(consumer)) {
            }
        }
    }
}
