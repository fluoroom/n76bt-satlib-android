package xc;

import java.util.concurrent.CountDownLatch;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends CountDownLatch implements mc.c, mc.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Throwable f31964a;

    public d() {
        super(1);
    }

    @Override // mc.c
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void accept(Throwable th2) {
        this.f31964a = th2;
        countDown();
    }

    @Override // mc.a
    public void run() {
        countDown();
    }
}
