package tg;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: loaded from: classes3.dex */
public final class l extends s {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f27831c = AtomicIntegerFieldUpdater.newUpdater(l.class, "_resumed$volatile");
    private volatile /* synthetic */ int _resumed$volatile;

    public l(hd.e eVar, Throwable th2, boolean z10) {
        if (th2 == null) {
            th2 = new CancellationException("Continuation " + eVar + " was cancelled normally");
        }
        super(th2, z10);
    }

    public final boolean e() {
        return f27831c.compareAndSet(this, 0, 1);
    }
}
