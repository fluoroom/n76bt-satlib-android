package jh;

import dd.d0;
import java.lang.ref.Reference;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import jh.m;

/* JADX INFO: loaded from: classes3.dex */
public final class o {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f18826g = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f18827a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final g f18828b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f18829c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ih.c f18830d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final b f18831e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ConcurrentLinkedQueue f18832f;

    public static final class a {
        public /* synthetic */ a(rd.h hVar) {
            this();
        }

        private a() {
        }
    }

    public static final class b extends ih.a {
        b(String str) {
            super(str, false, 2, null);
        }

        @Override // ih.a
        public long f() {
            return o.this.b(System.nanoTime());
        }
    }

    public o(ih.d dVar, int i10, long j10, TimeUnit timeUnit, g gVar) {
        rd.m.e(dVar, "taskRunner");
        rd.m.e(timeUnit, "timeUnit");
        rd.m.e(gVar, "connectionListener");
        this.f18827a = i10;
        this.f18828b = gVar;
        this.f18829c = timeUnit.toNanos(j10);
        this.f18830d = dVar.k();
        this.f18831e = new b(fh.p.f13110c + " ConnectionPool connection closer");
        this.f18832f = new ConcurrentLinkedQueue();
        if (j10 > 0) {
            return;
        }
        throw new IllegalArgumentException(("keepAliveDuration <= 0: " + j10).toString());
    }

    private final int e(n nVar, long j10) {
        if (fh.p.f13109b && !Thread.holdsLock(nVar)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + nVar);
        }
        List listG = nVar.g();
        int i10 = 0;
        while (i10 < listG.size()) {
            Reference reference = (Reference) listG.get(i10);
            if (reference.get() != null) {
                i10++;
            } else {
                rd.m.c(reference, "null cannot be cast to non-null type okhttp3.internal.connection.RealCall.CallReference");
                okhttp3.internal.platform.c.f23684a.e().n("A connection to " + nVar.t().a().l() + " was leaked. Did you forget to close a response body?", ((m.b) reference).a());
                listG.remove(i10);
                if (listG.isEmpty()) {
                    nVar.v(j10 - this.f18829c);
                    return 0;
                }
            }
        }
        return listG.size();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0032 A[Catch: all -> 0x0030, TryCatch #0 {all -> 0x0030, blocks: (B:9:0x0029, B:14:0x0032, B:17:0x0039), top: B:38:0x0029 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final jh.n a(boolean r6, eh.a r7, jh.m r8, java.util.List r9, boolean r10) {
        /*
            r5 = this;
            java.lang.String r0 = "address"
            rd.m.e(r7, r0)
            java.lang.String r0 = "call"
            rd.m.e(r8, r0)
            java.util.concurrent.ConcurrentLinkedQueue r0 = r5.f18832f
            java.util.Iterator r0 = r0.iterator()
            java.lang.String r1 = "iterator(...)"
            rd.m.d(r0, r1)
        L15:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L6c
            java.lang.Object r1 = r0.next()
            jh.n r1 = (jh.n) r1
            rd.m.b(r1)
            monitor-enter(r1)
            r2 = 1
            r3 = 0
            if (r10 == 0) goto L32
            boolean r4 = r1.q()     // Catch: java.lang.Throwable -> L30
            if (r4 != 0) goto L32
            goto L3d
        L30:
            r6 = move-exception
            goto L6a
        L32:
            boolean r4 = r1.o(r7, r9)     // Catch: java.lang.Throwable -> L30
            if (r4 != 0) goto L39
            goto L3d
        L39:
            r8.d(r1)     // Catch: java.lang.Throwable -> L30
            r3 = 1
        L3d:
            monitor-exit(r1)
            if (r3 == 0) goto L15
            boolean r3 = r1.p(r6)
            if (r3 == 0) goto L47
            return r1
        L47:
            monitor-enter(r1)
            boolean r3 = r1.k()     // Catch: java.lang.Throwable -> L67
            r1.w(r2)     // Catch: java.lang.Throwable -> L67
            java.net.Socket r2 = r8.A()     // Catch: java.lang.Throwable -> L67
            monitor-exit(r1)
            if (r2 == 0) goto L5f
            fh.p.h(r2)
            jh.g r2 = r5.f18828b
            r2.f(r1)
            goto L15
        L5f:
            if (r3 != 0) goto L15
            jh.g r2 = r5.f18828b
            r2.h(r1)
            goto L15
        L67:
            r6 = move-exception
            monitor-exit(r1)
            throw r6
        L6a:
            monitor-exit(r1)
            throw r6
        L6c:
            r6 = 0
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: jh.o.a(boolean, eh.a, jh.m, java.util.List, boolean):jh.n");
    }

    public final long b(long j10) {
        long j11 = (j10 - this.f18829c) + 1;
        Iterator it = this.f18832f.iterator();
        rd.m.d(it, "iterator(...)");
        n nVar = null;
        long j12 = Long.MAX_VALUE;
        int i10 = 0;
        n nVar2 = null;
        n nVar3 = null;
        int i11 = 0;
        while (it.hasNext()) {
            n nVar4 = (n) it.next();
            rd.m.b(nVar4);
            synchronized (nVar4) {
                if (e(nVar4, j10) > 0) {
                    i11++;
                } else {
                    long j13 = nVar4.j();
                    if (j13 < j11) {
                        nVar2 = nVar4;
                        j11 = j13;
                    }
                    i10++;
                    if (j13 < j12) {
                        nVar3 = nVar4;
                        j12 = j13;
                    }
                }
                d0 d0Var = d0.f10897a;
            }
        }
        if (nVar2 != null) {
            nVar = nVar2;
        } else if (i10 > this.f18827a) {
            j11 = j12;
            nVar = nVar3;
        } else {
            j11 = -1;
        }
        if (nVar == null) {
            if (nVar3 != null) {
                return (j12 + this.f18829c) - j10;
            }
            if (i11 > 0) {
                return this.f18829c;
            }
            return -1L;
        }
        synchronized (nVar) {
            if (!nVar.g().isEmpty()) {
                return 0L;
            }
            if (nVar.j() != j11) {
                return 0L;
            }
            nVar.w(true);
            this.f18832f.remove(nVar);
            fh.p.h(nVar.x());
            this.f18828b.f(nVar);
            if (this.f18832f.isEmpty()) {
                this.f18830d.a();
            }
            return 0L;
        }
    }

    public final boolean c(n nVar) {
        rd.m.e(nVar, "connection");
        if (fh.p.f13109b && !Thread.holdsLock(nVar)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + nVar);
        }
        if (!nVar.k() && this.f18827a != 0) {
            g();
            return false;
        }
        nVar.w(true);
        this.f18832f.remove(nVar);
        if (this.f18832f.isEmpty()) {
            this.f18830d.a();
        }
        return true;
    }

    public final g d() {
        return this.f18828b;
    }

    public final void f(n nVar) {
        rd.m.e(nVar, "connection");
        if (!fh.p.f13109b || Thread.holdsLock(nVar)) {
            this.f18832f.add(nVar);
            g();
            return;
        }
        throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + nVar);
    }

    public final void g() {
        ih.c.m(this.f18830d, this.f18831e, 0L, 2, null);
    }
}
