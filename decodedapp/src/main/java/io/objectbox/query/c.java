package io.objectbox.query;

import fc.d;
import io.objectbox.BoxStore;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: classes3.dex */
class c implements fc.b, Runnable {

    /* JADX INFO: renamed from: s */
    public static boolean f17414s = false;

    /* JADX INFO: renamed from: a */
    private final Query f17415a;

    /* JADX INFO: renamed from: b */
    private final io.objectbox.a f17416b;

    /* JADX INFO: renamed from: c */
    private final Set f17417c = new CopyOnWriteArraySet();

    /* JADX INFO: renamed from: d */
    private final Deque f17418d = new ArrayDeque();

    /* JADX INFO: renamed from: e */
    private volatile boolean f17419e = false;

    /* JADX INFO: renamed from: f */
    private volatile boolean f17420f = false;

    /* JADX INFO: renamed from: g */
    private final b f17421g = new b();

    /* JADX INFO: renamed from: h */
    private fc.a f17422h;

    /* JADX INFO: renamed from: r */
    private d f17423r;

    private static class b implements fc.a {
        private b() {
        }

        @Override // fc.a
        /* JADX INFO: renamed from: a */
        public void Q0(List list) {
        }

        /* synthetic */ b(a aVar) {
            this();
        }
    }

    c(Query query, io.objectbox.a aVar) {
        this.f17415a = query;
        this.f17416b = aVar;
    }

    private static void e(String str) {
        if (f17414s) {
            System.out.println("QueryPublisher: " + str);
        }
    }

    private void g(fc.a aVar) {
        synchronized (this.f17418d) {
            try {
                if (this.f17420f) {
                    return;
                }
                this.f17418d.add(aVar);
                if (!this.f17419e) {
                    this.f17419e = true;
                    this.f17416b.j().x0(this);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // fc.b
    public synchronized void a(fc.a aVar, Object obj) {
        fc.c.a(this.f17417c, aVar);
        if (this.f17417c.isEmpty()) {
            this.f17423r.cancel();
            this.f17423r = null;
        }
    }

    @Override // fc.b
    public void b(fc.a aVar, Object obj) {
        g(aVar);
    }

    @Override // fc.b
    public synchronized void c(fc.a aVar, Object obj) {
        try {
            BoxStore boxStoreJ = this.f17416b.j();
            if (this.f17422h == null) {
                this.f17422h = new fc.a() { // from class: io.objectbox.query.b
                    @Override // fc.a
                    public final void Q0(Object obj2) {
                        this.f17413a.f();
                    }
                };
            }
            if (this.f17417c.isEmpty()) {
                if (this.f17423r != null) {
                    throw new IllegalStateException("Existing subscription found");
                }
                this.f17423r = boxStoreJ.F0(this.f17416b.h()).h().g().e(this.f17422h);
            }
            this.f17417c.add(aVar);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public void f() {
        g(this.f17421g);
    }

    void h() {
        this.f17420f = true;
        synchronized (this) {
            while (this.f17419e) {
                try {
                    wait();
                } catch (InterruptedException e10) {
                    if (this.f17419e) {
                        throw new RuntimeException("Interrupted while waiting for publisher to finish", e10);
                    }
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:99:0x003a, code lost:
    
        r6.f17419e = false;
     */
    /* JADX WARN: Removed duplicated region for block: B:138:0x009c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void run() {
        /*
            r6 = this;
            java.lang.String r0 = "started"
            e(r0)
        L5:
            r0 = 0
            boolean r1 = r6.f17420f     // Catch: java.lang.Throwable -> L68
            if (r1 != 0) goto L84
            java.lang.String r1 = "checking for observers"
            e(r1)     // Catch: java.lang.Throwable -> L68
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L68
            r1.<init>()     // Catch: java.lang.Throwable -> L68
            java.util.Deque r2 = r6.f17418d     // Catch: java.lang.Throwable -> L68
            monitor-enter(r2)     // Catch: java.lang.Throwable -> L68
            r3 = 0
        L18:
            java.util.Deque r4 = r6.f17418d     // Catch: java.lang.Throwable -> L30
            java.lang.Object r4 = r4.poll()     // Catch: java.lang.Throwable -> L30
            fc.a r4 = (fc.a) r4     // Catch: java.lang.Throwable -> L30
            if (r4 == 0) goto L32
            io.objectbox.query.c$b r5 = r6.f17421g     // Catch: java.lang.Throwable -> L30
            boolean r5 = r5.equals(r4)     // Catch: java.lang.Throwable -> L30
            if (r5 == 0) goto L2c
            r3 = 1
            goto L18
        L2c:
            r1.add(r4)     // Catch: java.lang.Throwable -> L30
            goto L18
        L30:
            r1 = move-exception
            goto L82
        L32:
            if (r3 != 0) goto L3e
            boolean r4 = r1.isEmpty()     // Catch: java.lang.Throwable -> L30
            if (r4 == 0) goto L3e
            r6.f17419e = r0     // Catch: java.lang.Throwable -> L30
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L30
            goto L84
        L3e:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L30
            java.lang.String r2 = "running query"
            e(r2)     // Catch: java.lang.Throwable -> L68
            boolean r2 = r6.f17420f     // Catch: java.lang.Throwable -> L68
            if (r2 == 0) goto L49
            goto L84
        L49:
            io.objectbox.query.Query r2 = r6.f17415a     // Catch: java.lang.Throwable -> L68
            java.util.List r2 = r2.x()     // Catch: java.lang.Throwable -> L68
            java.lang.String r4 = "notifying observers"
            e(r4)     // Catch: java.lang.Throwable -> L68
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L68
        L58:
            boolean r4 = r1.hasNext()     // Catch: java.lang.Throwable -> L68
            if (r4 == 0) goto L6a
            java.lang.Object r4 = r1.next()     // Catch: java.lang.Throwable -> L68
            fc.a r4 = (fc.a) r4     // Catch: java.lang.Throwable -> L68
            r4.Q0(r2)     // Catch: java.lang.Throwable -> L68
            goto L58
        L68:
            r1 = move-exception
            goto L94
        L6a:
            if (r3 == 0) goto L5
            java.util.Set r1 = r6.f17417c     // Catch: java.lang.Throwable -> L68
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L68
        L72:
            boolean r3 = r1.hasNext()     // Catch: java.lang.Throwable -> L68
            if (r3 == 0) goto L5
            java.lang.Object r3 = r1.next()     // Catch: java.lang.Throwable -> L68
            fc.a r3 = (fc.a) r3     // Catch: java.lang.Throwable -> L68
            r3.Q0(r2)     // Catch: java.lang.Throwable -> L68
            goto L72
        L82:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L30
            throw r1     // Catch: java.lang.Throwable -> L68
        L84:
            java.lang.String r1 = "stopped"
            e(r1)
            r6.f17419e = r0
            monitor-enter(r6)
            r6.notifyAll()     // Catch: java.lang.Throwable -> L91
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L91
            return
        L91:
            r0 = move-exception
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L91
            throw r0
        L94:
            java.lang.String r2 = "stopped"
            e(r2)
            r6.f17419e = r0
            monitor-enter(r6)
            r6.notifyAll()     // Catch: java.lang.Throwable -> La1
            monitor-exit(r6)     // Catch: java.lang.Throwable -> La1
            throw r1
        La1:
            r0 = move-exception
            monitor-exit(r6)     // Catch: java.lang.Throwable -> La1
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: io.objectbox.query.c.run():void");
    }
}
