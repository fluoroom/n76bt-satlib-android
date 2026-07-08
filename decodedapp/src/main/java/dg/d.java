package dg;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes3.dex */
public class d implements k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Lock f11062b;

    public d(Lock lock) {
        rd.m.e(lock, "lock");
        this.f11062b = lock;
    }

    protected final Lock a() {
        return this.f11062b;
    }

    @Override // dg.k
    public void lock() {
        this.f11062b.lock();
    }

    @Override // dg.k
    public void unlock() {
        this.f11062b.unlock();
    }

    public /* synthetic */ d(Lock lock, int i10, rd.h hVar) {
        this((i10 & 1) != 0 ? new ReentrantLock() : lock);
    }
}
