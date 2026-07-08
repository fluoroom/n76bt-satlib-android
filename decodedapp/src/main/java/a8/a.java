package a8;

import android.os.Handler;
import android.os.Looper;
import i8.f;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public class a implements Executor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Handler f365a;

    public a(Looper looper) {
        this.f365a = new f(looper);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f365a.post(runnable);
    }
}
