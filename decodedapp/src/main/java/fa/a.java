package fa;

import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ReadWriteLock f12896a = new ReentrantReadWriteLock();

    @Override // fa.b
    public void lock() {
        this.f12896a.writeLock().lock();
    }

    @Override // fa.b
    public void unlock() {
        this.f12896a.writeLock().unlock();
    }
}
