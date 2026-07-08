package j$.util.stream;

import j$.util.Spliterator;
import java.util.ArrayDeque;
import java.util.Comparator;
import java.util.Deque;

/* JADX INFO: loaded from: classes2.dex */
public abstract class j3 implements Spliterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public g2 f18028a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f18029b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Spliterator f18030c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Spliterator f18031d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Deque f18032e;

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return 64;
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return j$.util.c.d(this);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i10) {
        return j$.util.c.e(this, i10);
    }

    @Override // j$.util.Spliterator
    public final Comparator getComparator() {
        throw new IllegalStateException();
    }

    public j3(g2 g2Var) {
        this.f18028a = g2Var;
    }

    public final Deque b() {
        ArrayDeque arrayDeque = new ArrayDeque(8);
        int iO = this.f18028a.o();
        while (true) {
            iO--;
            if (iO < this.f18029b) {
                return arrayDeque;
            }
            arrayDeque.addFirst(this.f18028a.a(iO));
        }
    }

    public static g2 a(Deque deque) {
        while (true) {
            ArrayDeque arrayDeque = (ArrayDeque) deque;
            g2 g2Var = (g2) arrayDeque.pollFirst();
            if (g2Var == null) {
                return null;
            }
            if (g2Var.o() != 0) {
                for (int iO = g2Var.o() - 1; iO >= 0; iO--) {
                    arrayDeque.addFirst(g2Var.a(iO));
                }
            } else if (g2Var.count() > 0) {
                return g2Var;
            }
        }
    }

    public final boolean c() {
        if (this.f18028a == null) {
            return false;
        }
        if (this.f18031d != null) {
            return true;
        }
        Spliterator spliterator = this.f18030c;
        if (spliterator == null) {
            Deque dequeB = b();
            this.f18032e = dequeB;
            g2 g2VarA = a(dequeB);
            if (g2VarA != null) {
                this.f18031d = g2VarA.spliterator();
                return true;
            }
            this.f18028a = null;
            return false;
        }
        this.f18031d = spliterator;
        return true;
    }

    @Override // j$.util.Spliterator
    public final Spliterator trySplit() {
        g2 g2Var = this.f18028a;
        if (g2Var == null || this.f18031d != null) {
            return null;
        }
        Spliterator spliterator = this.f18030c;
        if (spliterator != null) {
            return spliterator.trySplit();
        }
        if (this.f18029b < g2Var.o() - 1) {
            g2 g2Var2 = this.f18028a;
            int i10 = this.f18029b;
            this.f18029b = i10 + 1;
            return g2Var2.a(i10).spliterator();
        }
        g2 g2VarA = this.f18028a.a(this.f18029b);
        this.f18028a = g2VarA;
        if (g2VarA.o() == 0) {
            Spliterator spliterator2 = this.f18028a.spliterator();
            this.f18030c = spliterator2;
            return spliterator2.trySplit();
        }
        g2 g2Var3 = this.f18028a;
        this.f18029b = 1;
        return g2Var3.a(0).spliterator();
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        long jCount = 0;
        if (this.f18028a == null) {
            return 0L;
        }
        Spliterator spliterator = this.f18030c;
        if (spliterator != null) {
            return spliterator.estimateSize();
        }
        for (int i10 = this.f18029b; i10 < this.f18028a.o(); i10++) {
            jCount += this.f18028a.a(i10).count();
        }
        return jCount;
    }

    @Override // j$.util.Spliterator
    public /* bridge */ /* synthetic */ j$.util.d1 trySplit() {
        return (j$.util.d1) trySplit();
    }

    @Override // j$.util.Spliterator
    public /* bridge */ /* synthetic */ j$.util.x0 trySplit() {
        return (j$.util.x0) trySplit();
    }

    @Override // j$.util.Spliterator
    public /* bridge */ /* synthetic */ j$.util.a1 trySplit() {
        return (j$.util.a1) trySplit();
    }

    @Override // j$.util.Spliterator
    public /* bridge */ /* synthetic */ j$.util.u0 trySplit() {
        return (j$.util.u0) trySplit();
    }
}
