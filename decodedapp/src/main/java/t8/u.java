package t8;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
final class u implements Executor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Handler f27632a = new m8.a(Looper.getMainLooper());

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f27632a.post(runnable);
    }
}
