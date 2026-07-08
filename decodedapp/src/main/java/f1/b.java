package f1;

import hd.i;
import rd.m;
import tg.d0;
import tg.j1;

/* JADX INFO: loaded from: classes.dex */
public final class b implements AutoCloseable, d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i f12765a;

    public b(i iVar) {
        m.e(iVar, "coroutineContext");
        this.f12765a = iVar;
    }

    @Override // tg.d0
    public i G() {
        return this.f12765a;
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        j1.d(G(), null, 1, null);
    }
}
