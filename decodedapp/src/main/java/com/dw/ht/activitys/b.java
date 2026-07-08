package com.dw.ht.activitys;

/* JADX INFO: loaded from: classes.dex */
public class b implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f5619b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f5620a;

    public interface a {
        void F();

        void o();
    }

    public b(a aVar) {
        this.f5620a = aVar;
    }

    public void a() {
        f5619b = 0;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i10 = f5619b + 1;
        f5619b = i10;
        if (i10 <= 30) {
            this.f5620a.o();
        } else {
            a();
            this.f5620a.F();
        }
    }
}
