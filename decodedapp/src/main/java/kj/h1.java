package kj;

import java.util.Map;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: loaded from: classes3.dex */
class h1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final r0 f20114a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile Map f20116c = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ReentrantReadWriteLock f20115b = new ReentrantReadWriteLock();

    h1(r0 r0Var) {
        this.f20114a = r0Var;
    }

    g a(r0 r0Var) {
        this.f20115b.readLock().lock();
        this.f20115b.readLock().unlock();
        return null;
    }
}
