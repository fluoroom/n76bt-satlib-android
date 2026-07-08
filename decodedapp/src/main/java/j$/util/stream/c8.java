package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import java.util.function.Consumer;

/* JADX INFO: loaded from: classes2.dex */
public final class c8 extends a7 {
    @Override // j$.util.stream.a7
    public final a7 e(Spliterator spliterator) {
        return new c8(this.f17905b, spliterator, this.f17904a);
    }

    @Override // j$.util.stream.a7
    public final void d() {
        v6 v6Var = new v6();
        this.f17911h = v6Var;
        Objects.requireNonNull(v6Var);
        this.f17908e = this.f17905b.G0(new b8(v6Var, 0));
        this.f17909f = new j$.util.q(13, this);
    }

    @Override // j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer) {
        Object obj;
        Objects.requireNonNull(consumer);
        boolean zA = a();
        if (!zA) {
            return zA;
        }
        v6 v6Var = (v6) this.f17911h;
        long j10 = this.f17910g;
        if (v6Var.f17936c != 0) {
            if (j10 >= v6Var.count()) {
                throw new IndexOutOfBoundsException(Long.toString(j10));
            }
            for (int i10 = 0; i10 <= v6Var.f17936c; i10++) {
                long j11 = v6Var.f17937d[i10];
                Object[] objArr = v6Var.f18225f[i10];
                if (j10 < ((long) objArr.length) + j11) {
                    obj = objArr[(int) (j10 - j11)];
                }
            }
            throw new IndexOutOfBoundsException(Long.toString(j10));
        }
        if (j10 < v6Var.f17935b) {
            obj = v6Var.f18224e[(int) j10];
        } else {
            throw new IndexOutOfBoundsException(Long.toString(j10));
        }
        consumer.n(obj);
        return zA;
    }

    @Override // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        if (this.f17911h == null && !this.f17912i) {
            Objects.requireNonNull(consumer);
            c();
            Objects.requireNonNull(consumer);
            b8 b8Var = new b8(consumer, 1);
            this.f17905b.F0(this.f17907d, b8Var);
            this.f17912i = true;
            return;
        }
        while (tryAdvance(consumer)) {
        }
    }
}
