package j$.util.stream;

import j$.util.Objects;
import j$.util.function.Consumer$CC;
import j$.util.stream.Stream;
import java.util.function.Consumer;

/* JADX INFO: loaded from: classes2.dex */
public final class f8 extends e8 implements Stream.Builder {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f17984b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public v6 f17985c;

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.stream.Stream.Builder, java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final void n(Object obj) {
        int i10 = this.f17972a;
        if (i10 == 0) {
            this.f17984b = obj;
            this.f17972a = i10 + 1;
        } else {
            if (i10 > 0) {
                if (this.f17985c == null) {
                    v6 v6Var = new v6();
                    this.f17985c = v6Var;
                    v6Var.n(this.f17984b);
                    this.f17972a++;
                }
                this.f17985c.n(obj);
                return;
            }
            throw new IllegalStateException();
        }
    }

    @Override // j$.util.stream.Stream.Builder
    public final Stream build() {
        int i10 = this.f17972a;
        if (i10 >= 0) {
            this.f17972a = (-i10) - 1;
            return i10 < 2 ? v3.E0(this, false) : v3.E0(this.f17985c.spliterator(), false);
        }
        throw new IllegalStateException();
    }

    @Override // j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer) {
        Objects.requireNonNull(consumer);
        if (this.f17972a != -2) {
            return false;
        }
        consumer.n(this.f17984b);
        this.f17972a = -1;
        return true;
    }

    @Override // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        Objects.requireNonNull(consumer);
        if (this.f17972a == -2) {
            consumer.n(this.f17984b);
            this.f17972a = -1;
        }
    }
}
