package a6;

import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes.dex */
public abstract class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static AtomicLong f353a = new AtomicLong(1);

    public static long a() {
        return f353a.getAndIncrement();
    }
}
