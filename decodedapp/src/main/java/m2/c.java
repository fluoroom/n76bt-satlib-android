package m2;

import e3.k;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes.dex */
final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f20925a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b f20926b = new b();

    private static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Lock f20927a = new ReentrantLock();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f20928b;

        a() {
        }
    }

    private static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Queue f20929a = new ArrayDeque();

        b() {
        }

        a a() {
            a aVar;
            synchronized (this.f20929a) {
                aVar = (a) this.f20929a.poll();
            }
            return aVar == null ? new a() : aVar;
        }

        void b(a aVar) {
            synchronized (this.f20929a) {
                try {
                    if (this.f20929a.size() < 10) {
                        this.f20929a.offer(aVar);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    c() {
    }

    void a(String str) {
        a aVarA;
        synchronized (this) {
            try {
                aVarA = (a) this.f20925a.get(str);
                if (aVarA == null) {
                    aVarA = this.f20926b.a();
                    this.f20925a.put(str, aVarA);
                }
                aVarA.f20928b++;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        aVarA.f20927a.lock();
    }

    void b(String str) {
        a aVar;
        synchronized (this) {
            try {
                aVar = (a) k.e((a) this.f20925a.get(str));
                int i10 = aVar.f20928b;
                if (i10 < 1) {
                    throw new IllegalStateException("Cannot release a lock that is not held, safeKey: " + str + ", interestedThreads: " + aVar.f20928b);
                }
                int i11 = i10 - 1;
                aVar.f20928b = i11;
                if (i11 == 0) {
                    a aVar2 = (a) this.f20925a.remove(str);
                    if (!aVar2.equals(aVar)) {
                        throw new IllegalStateException("Removed the wrong lock, expected to remove: " + aVar + ", but actually removed: " + aVar2 + ", safeKey: " + str);
                    }
                    this.f20926b.b(aVar2);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        aVar.f20927a.unlock();
    }
}
