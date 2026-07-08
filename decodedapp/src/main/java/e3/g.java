package e3;

import android.os.SystemClock;

/* JADX INFO: loaded from: classes.dex */
public abstract class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final double f11421a = 1.0d / Math.pow(10.0d, 6.0d);

    public static double a(long j10) {
        return (b() - j10) * f11421a;
    }

    public static long b() {
        return SystemClock.elapsedRealtimeNanos();
    }
}
