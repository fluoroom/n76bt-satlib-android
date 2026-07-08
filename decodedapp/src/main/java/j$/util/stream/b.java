package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public abstract class b extends d {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final AtomicReference f17920h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public volatile boolean f17921i;

    public abstract Object h();

    public b(v3 v3Var, Spliterator spliterator) {
        super(v3Var, spliterator);
        this.f17920h = new AtomicReference(null);
    }

    public b(b bVar, Spliterator spliterator) {
        super(bVar, spliterator);
        this.f17920h = bVar.f17920h;
    }

    @Override // j$.util.stream.d, java.util.concurrent.CountedCompleter
    public final void compute() {
        Object objH;
        Spliterator spliteratorTrySplit;
        Spliterator spliterator = this.f17946b;
        long jEstimateSize = spliterator.estimateSize();
        long jE = this.f17947c;
        if (jE == 0) {
            jE = d.e(jEstimateSize);
            this.f17947c = jE;
        }
        AtomicReference atomicReference = this.f17920h;
        boolean z10 = false;
        b bVar = this;
        while (true) {
            objH = atomicReference.get();
            if (objH != null) {
                break;
            }
            boolean z11 = bVar.f17921i;
            if (!z11) {
                CountedCompleter<?> completer = bVar.getCompleter();
                while (true) {
                    b bVar2 = (b) ((d) completer);
                    if (z11 || bVar2 == null) {
                        break;
                    }
                    z11 = bVar2.f17921i;
                    completer = bVar2.getCompleter();
                }
            }
            if (z11) {
                objH = bVar.h();
                break;
            }
            if (jEstimateSize <= jE || (spliteratorTrySplit = spliterator.trySplit()) == null) {
                break;
            }
            b bVar3 = (b) bVar.c(spliteratorTrySplit);
            bVar.f17948d = bVar3;
            b bVar4 = (b) bVar.c(spliterator);
            bVar.f17949e = bVar4;
            bVar.setPendingCount(1);
            if (z10) {
                spliterator = spliteratorTrySplit;
                bVar = bVar3;
                bVar3 = bVar4;
            } else {
                bVar = bVar4;
            }
            z10 = !z10;
            bVar3.fork();
            jEstimateSize = spliterator.estimateSize();
        }
        objH = bVar.a();
        bVar.d(objH);
        bVar.tryComplete();
    }

    @Override // j$.util.stream.d
    public final void d(Object obj) {
        if (!b()) {
            this.f17950f = obj;
        } else if (obj != null) {
            AtomicReference atomicReference = this.f17920h;
            while (!atomicReference.compareAndSet(null, obj) && atomicReference.get() == null) {
            }
        }
    }

    @Override // j$.util.stream.d, java.util.concurrent.CountedCompleter, java.util.concurrent.ForkJoinTask
    public final Object getRawResult() {
        return i();
    }

    public final Object i() {
        if (b()) {
            Object obj = this.f17920h.get();
            return obj == null ? h() : obj;
        }
        return this.f17950f;
    }

    public void f() {
        this.f17921i = true;
    }

    public final void g() {
        b bVar = this;
        for (b bVar2 = (b) ((d) getCompleter()); bVar2 != null; bVar2 = (b) ((d) bVar2.getCompleter())) {
            if (bVar2.f17948d == bVar) {
                b bVar3 = (b) bVar2.f17949e;
                if (!bVar3.f17921i) {
                    bVar3.f();
                }
            }
            bVar = bVar2;
        }
    }
}
