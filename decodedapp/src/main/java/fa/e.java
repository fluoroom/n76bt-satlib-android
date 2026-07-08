package fa;

import java.util.Collection;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: loaded from: classes3.dex */
public class e extends fa.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b f12905b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final androidx.collection.h f12906c = new androidx.collection.h(5);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ReadWriteLock f12907d = new ReentrantReadWriteLock();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Executor f12908e = Executors.newCachedThreadPool();

    private class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f12909a;

        public a(int i10) {
            this.f12909a = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Thread.sleep((long) ((Math.random() * 500.0d) + 500.0d));
            } catch (InterruptedException unused) {
            }
            e.this.i(this.f12909a);
        }
    }

    public e(b bVar) {
        this.f12905b = bVar;
    }

    private void h() {
        this.f12906c.evictAll();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Set i(int i10) {
        this.f12907d.readLock().lock();
        Set setB = (Set) this.f12906c.get(Integer.valueOf(i10));
        this.f12907d.readLock().unlock();
        if (setB == null) {
            this.f12907d.writeLock().lock();
            setB = (Set) this.f12906c.get(Integer.valueOf(i10));
            if (setB == null) {
                setB = this.f12905b.b(i10);
                this.f12906c.put(Integer.valueOf(i10), setB);
            }
            this.f12907d.writeLock().unlock();
        }
        return setB;
    }

    @Override // fa.b
    public Set b(float f10) {
        int i10 = (int) f10;
        Set setI = i(i10);
        int i11 = i10 + 1;
        if (this.f12906c.get(Integer.valueOf(i11)) == null) {
            this.f12908e.execute(new a(i11));
        }
        int i12 = i10 - 1;
        if (this.f12906c.get(Integer.valueOf(i12)) == null) {
            this.f12908e.execute(new a(i12));
        }
        return setI;
    }

    @Override // fa.b
    public boolean c(Collection collection) {
        boolean zC = this.f12905b.c(collection);
        if (zC) {
            h();
        }
        return zC;
    }

    @Override // fa.b
    public void d() {
        this.f12905b.d();
        h();
    }

    @Override // fa.b
    public int e() {
        return this.f12905b.e();
    }
}
