package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class k0 extends b {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e0 f18045j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f18046k;

    public k0(e0 e0Var, boolean z10, a aVar, Spliterator spliterator) {
        super(aVar, spliterator);
        this.f18046k = z10;
        this.f18045j = e0Var;
    }

    public k0(k0 k0Var, Spliterator spliterator) {
        super(k0Var, spliterator);
        this.f18046k = k0Var.f18046k;
        this.f18045j = k0Var.f18045j;
    }

    @Override // j$.util.stream.d
    public final d c(Spliterator spliterator) {
        return new k0(this, spliterator);
    }

    @Override // j$.util.stream.b
    public final Object h() {
        return this.f18045j.f17961b;
    }

    @Override // j$.util.stream.d
    public final Object a() {
        v3 v3Var = this.f17945a;
        h8 h8Var = (h8) this.f18045j.f17963d.get();
        v3Var.F0(this.f17946b, h8Var);
        Object obj = h8Var.get();
        if (this.f18046k) {
            if (obj != null) {
                d dVar = this;
                while (dVar != null) {
                    d dVar2 = (d) dVar.getCompleter();
                    if (dVar2 != null && dVar2.f17948d != dVar) {
                        g();
                        return obj;
                    }
                    dVar = dVar2;
                }
                AtomicReference atomicReference = this.f17920h;
                while (!atomicReference.compareAndSet(null, obj) && atomicReference.get() == null) {
                }
                return obj;
            }
        } else if (obj != null) {
            AtomicReference atomicReference2 = this.f17920h;
            while (!atomicReference2.compareAndSet(null, obj) && atomicReference2.get() == null) {
            }
        }
        return null;
    }

    @Override // j$.util.stream.d, java.util.concurrent.CountedCompleter
    public final void onCompletion(CountedCompleter countedCompleter) {
        if (this.f18046k) {
            k0 k0Var = (k0) this.f17948d;
            k0 k0Var2 = null;
            while (true) {
                if (k0Var != k0Var2) {
                    Object objI = k0Var.i();
                    if (objI != null && this.f18045j.f17962c.test(objI)) {
                        d(objI);
                        d dVar = this;
                        while (true) {
                            if (dVar != null) {
                                d dVar2 = (d) dVar.getCompleter();
                                if (dVar2 != null && dVar2.f17948d != dVar) {
                                    g();
                                    break;
                                }
                                dVar = dVar2;
                            } else {
                                AtomicReference atomicReference = this.f17920h;
                                while (!atomicReference.compareAndSet(null, objI) && atomicReference.get() == null) {
                                }
                            }
                        }
                    } else {
                        k0Var2 = k0Var;
                        k0Var = (k0) this.f17949e;
                    }
                } else {
                    break;
                }
            }
        }
        super.onCompletion(countedCompleter);
    }
}
