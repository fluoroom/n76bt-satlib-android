package zg;

import java.util.concurrent.Executor;
import tg.a0;
import tg.y0;
import xg.y;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends y0 implements Executor {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f33300d = new b();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final a0 f33301e = a0.u0(k.f33318c, xg.a0.e("kotlinx.coroutines.io.parallelism", xd.d.b(64, y.a()), 0, 0, 12, null), null, 2, null);

    private b() {
    }

    @Override // tg.a0
    public void G(hd.i iVar, Runnable runnable) {
        f33301e.G(iVar, runnable);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO");
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        G(hd.j.f15243a, runnable);
    }

    @Override // tg.a0
    public a0 t0(int i10, String str) {
        return k.f33318c.t0(i10, str);
    }

    @Override // tg.a0
    public String toString() {
        return "Dispatchers.IO";
    }
}
