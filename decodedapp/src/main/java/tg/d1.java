package tg;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: loaded from: classes3.dex */
final class d1 extends k1 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f27805f = AtomicIntegerFieldUpdater.newUpdater(d1.class, "_invoked$volatile");
    private volatile /* synthetic */ int _invoked$volatile;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final qd.l f27806e;

    public d1(qd.l lVar) {
        this.f27806e = lVar;
    }

    @Override // tg.k1
    public boolean v() {
        return true;
    }

    @Override // tg.k1
    public void w(Throwable th2) {
        if (f27805f.compareAndSet(this, 0, 1)) {
            this.f27806e.l(th2);
        }
    }
}
