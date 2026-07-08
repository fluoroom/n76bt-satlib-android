package kc;

/* JADX INFO: loaded from: classes3.dex */
public abstract class c {
    public static b a() {
        return nc.c.INSTANCE;
    }

    public static b b(Runnable runnable) {
        oc.b.c(runnable, "run is null");
        return new e(runnable);
    }
}
