package io.objectbox;

import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Collections;
import java.util.Deque;
import java.util.Iterator;
import java.util.Set;
import ki.c;

/* JADX INFO: loaded from: classes3.dex */
class d implements fc.b, Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final BoxStore f17376a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final ki.c f17377b = ki.c.f(c.b.THREAD_SAFE);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Deque f17378c = new ArrayDeque();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    volatile boolean f17379d;

    private static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final fc.a f17380a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int[] f17381b;

        a(fc.a aVar, int[] iArr) {
            this.f17380a = aVar;
            this.f17381b = iArr;
        }
    }

    d(BoxStore boxStore) {
        this.f17376a = boxStore;
    }

    private void d(Class cls) {
        RuntimeException runtimeException = new RuntimeException("Observer failed while processing data for " + cls + ". Consider using an ErrorObserver");
        runtimeException.printStackTrace();
        throw runtimeException;
    }

    private void f(fc.a aVar, int[] iArr) {
        synchronized (this.f17378c) {
            try {
                this.f17378c.add(new a(aVar, iArr));
                if (!this.f17379d) {
                    this.f17379d = true;
                    this.f17376a.x0(this);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private void g(fc.a aVar, int i10) {
        fc.c.a((Set) this.f17377b.get(Integer.valueOf(i10)), aVar);
    }

    @Override // fc.b
    public void a(fc.a aVar, Object obj) {
        if (obj != null) {
            g(aVar, this.f17376a.X((Class) obj));
            return;
        }
        for (int i10 : this.f17376a.x()) {
            g(aVar, i10);
        }
    }

    @Override // fc.b
    public void b(fc.a aVar, Object obj) {
        f(aVar, obj != null ? new int[]{this.f17376a.X((Class) obj)} : this.f17376a.x());
    }

    @Override // fc.b
    public void c(fc.a aVar, Object obj) {
        if (obj != null) {
            this.f17377b.d(Integer.valueOf(this.f17376a.X((Class) obj)), aVar);
            return;
        }
        for (int i10 : this.f17376a.x()) {
            this.f17377b.d(Integer.valueOf(i10), aVar);
        }
    }

    void e(int[] iArr) {
        f(null, iArr);
    }

    @Override // java.lang.Runnable
    public void run() {
        a aVar;
        while (true) {
            try {
            } catch (Throwable th2) {
                this.f17379d = false;
                throw th2;
            }
            synchronized (this.f17378c) {
                aVar = (a) this.f17378c.pollFirst();
                if (aVar == null) {
                    this.f17379d = false;
                    this.f17379d = false;
                    return;
                }
                this.f17379d = false;
                throw th2;
            }
            for (int i10 : aVar.f17381b) {
                Collection collectionSingletonList = aVar.f17380a != null ? Collections.singletonList(aVar.f17380a) : this.f17377b.get(Integer.valueOf(i10));
                if (collectionSingletonList != null && !collectionSingletonList.isEmpty()) {
                    Class clsT = this.f17376a.T(i10);
                    try {
                        Iterator it = collectionSingletonList.iterator();
                        while (it.hasNext()) {
                            ((fc.a) it.next()).Q0(clsT);
                        }
                    } catch (RuntimeException unused) {
                        d(clsT);
                    }
                }
            }
        }
    }
}
