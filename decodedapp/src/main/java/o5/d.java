package o5;

import android.os.SystemClock;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final AtomicInteger f23193a = new AtomicInteger(0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static long f23194b;

    public static boolean a() {
        return f23193a.get() > 0 || SystemClock.elapsedRealtime() - f23194b < 100;
    }

    public static void b() {
        f23193a.incrementAndGet();
    }

    public static void c() {
        int iDecrementAndGet = f23193a.decrementAndGet();
        if (iDecrementAndGet < 0) {
            throw new IllegalStateException("启动和停止数量不同");
        }
        if (iDecrementAndGet == 0) {
            f23194b = SystemClock.elapsedRealtime();
        }
    }
}
