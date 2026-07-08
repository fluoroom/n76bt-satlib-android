package uc;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes3.dex */
public final class g extends AtomicLong implements ThreadFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final String f29075a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final int f29076b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final boolean f29077c;

    static final class a extends Thread implements f {
        a(Runnable runnable, String str) {
            super(runnable, str);
        }
    }

    public g(String str) {
        this(str, 5, false);
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        String str = this.f29075a + '-' + incrementAndGet();
        Thread aVar = this.f29077c ? new a(runnable, str) : new Thread(runnable, str);
        aVar.setPriority(this.f29076b);
        aVar.setDaemon(true);
        return aVar;
    }

    @Override // java.util.concurrent.atomic.AtomicLong
    public String toString() {
        return "RxThreadFactory[" + this.f29075a + "]";
    }

    public g(String str, int i10) {
        this(str, i10, false);
    }

    public g(String str, int i10, boolean z10) {
        this.f29075a = str;
        this.f29076b = i10;
        this.f29077c = z10;
    }
}
