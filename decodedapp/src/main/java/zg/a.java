package zg;

import androidx.appcompat.widget.ActivityChooserView;
import dd.d0;
import dd.o;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import rd.b0;
import tg.h0;
import xg.u;
import xg.x;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements Executor, Closeable {

    /* JADX INFO: renamed from: h */
    public static final C0450a f33271h = new C0450a(null);

    /* JADX INFO: renamed from: r */
    private static final /* synthetic */ AtomicLongFieldUpdater f33272r = AtomicLongFieldUpdater.newUpdater(a.class, "parkedWorkersStack$volatile");

    /* JADX INFO: renamed from: s */
    private static final /* synthetic */ AtomicLongFieldUpdater f33273s = AtomicLongFieldUpdater.newUpdater(a.class, "controlState$volatile");

    /* JADX INFO: renamed from: t */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f33274t = AtomicIntegerFieldUpdater.newUpdater(a.class, "_isTerminated$volatile");

    /* JADX INFO: renamed from: u */
    public static final x f33275u = new x("NOT_IN_STACK");
    private volatile /* synthetic */ int _isTerminated$volatile;

    /* JADX INFO: renamed from: a */
    public final int f33276a;

    /* JADX INFO: renamed from: b */
    public final int f33277b;

    /* JADX INFO: renamed from: c */
    public final long f33278c;
    private volatile /* synthetic */ long controlState$volatile;

    /* JADX INFO: renamed from: d */
    public final String f33279d;

    /* JADX INFO: renamed from: e */
    public final zg.d f33280e;

    /* JADX INFO: renamed from: f */
    public final zg.d f33281f;

    /* JADX INFO: renamed from: g */
    public final u f33282g;
    private volatile /* synthetic */ long parkedWorkersStack$volatile;

    /* JADX INFO: renamed from: zg.a$a */
    public static final class C0450a {
        public /* synthetic */ C0450a(rd.h hVar) {
            this();
        }

        private C0450a() {
        }
    }

    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f33283a;

        static {
            int[] iArr = new int[d.values().length];
            try {
                iArr[d.f33295c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[d.f33294b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[d.f33293a.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[d.f33296d.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[d.f33297e.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f33283a = iArr;
        }
    }

    public static final class d extends Enum {

        /* JADX INFO: renamed from: a */
        public static final d f33293a = new d("CPU_ACQUIRED", 0);

        /* JADX INFO: renamed from: b */
        public static final d f33294b = new d("BLOCKING", 1);

        /* JADX INFO: renamed from: c */
        public static final d f33295c = new d("PARKING", 2);

        /* JADX INFO: renamed from: d */
        public static final d f33296d = new d("DORMANT", 3);

        /* JADX INFO: renamed from: e */
        public static final d f33297e = new d("TERMINATED", 4);

        /* JADX INFO: renamed from: f */
        private static final /* synthetic */ d[] f33298f;

        /* JADX INFO: renamed from: g */
        private static final /* synthetic */ kd.a f33299g;

        static {
            d[] dVarArrA = a();
            f33298f = dVarArrA;
            f33299g = kd.b.a(dVarArrA);
        }

        private d(String str, int i10) {
            super(str, i10);
        }

        private static final /* synthetic */ d[] a() {
            return new d[]{f33293a, f33294b, f33295c, f33296d, f33297e};
        }

        public static d valueOf(String str) {
            return (d) Enum.valueOf(d.class, str);
        }

        public static d[] values() {
            return (d[]) f33298f.clone();
        }
    }

    public a(int i10, int i11, long j10, String str) {
        this.f33276a = i10;
        this.f33277b = i11;
        this.f33278c = j10;
        this.f33279d = str;
        if (i10 < 1) {
            throw new IllegalArgumentException(("Core pool size " + i10 + " should be at least 1").toString());
        }
        if (i11 < i10) {
            throw new IllegalArgumentException(("Max pool size " + i11 + " should be greater than or equals to core pool size " + i10).toString());
        }
        if (i11 > 2097150) {
            throw new IllegalArgumentException(("Max pool size " + i11 + " should not exceed maximal supported number of threads 2097150").toString());
        }
        if (j10 > 0) {
            this.f33280e = new zg.d();
            this.f33281f = new zg.d();
            this.f33282g = new u((i10 + 1) * 2);
            this.controlState$volatile = ((long) i10) << 42;
            return;
        }
        throw new IllegalArgumentException(("Idle worker keep alive time " + j10 + " must be positive").toString());
    }

    private final c G() {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f33272r;
        while (true) {
            long j10 = atomicLongFieldUpdater.get(this);
            c cVar = (c) this.f33282g.b((int) (2097151 & j10));
            if (cVar == null) {
                return null;
            }
            long j11 = (2097152 + j10) & (-2097152);
            int iX = x(cVar);
            if (iX >= 0 && f33272r.compareAndSet(this, j10, ((long) iX) | j11)) {
                cVar.o(f33275u);
                return cVar;
            }
        }
    }

    private final boolean c(h hVar) {
        return hVar.f33310b ? this.f33281f.a(hVar) : this.f33280e.a(hVar);
    }

    private final void h0(long j10) {
        if (w0() || u0(j10)) {
            return;
        }
        w0();
    }

    private final int k() {
        synchronized (this.f33282g) {
            try {
                if (isTerminated()) {
                    return -1;
                }
                long j10 = f33273s.get(this);
                int i10 = (int) (j10 & 2097151);
                int iB = xd.d.b(i10 - ((int) ((j10 & 4398044413952L) >> 21)), 0);
                if (iB >= this.f33276a) {
                    return 0;
                }
                if (i10 >= this.f33277b) {
                    return 0;
                }
                int i11 = ((int) (s().get(this) & 2097151)) + 1;
                if (i11 <= 0 || this.f33282g.b(i11) != null) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                c cVar = new c(this, i11);
                this.f33282g.c(i11, cVar);
                if (i11 != ((int) (2097151 & f33273s.incrementAndGet(this)))) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                int i12 = iB + 1;
                cVar.start();
                return i12;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private final c n() {
        Thread threadCurrentThread = Thread.currentThread();
        c cVar = threadCurrentThread instanceof c ? (c) threadCurrentThread : null;
        if (cVar == null || !rd.m.a(a.this, this)) {
            return null;
        }
        return cVar;
    }

    public static /* synthetic */ void r(a aVar, Runnable runnable, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        if ((i10 & 4) != 0) {
            z11 = false;
        }
        aVar.q(runnable, z10, z11);
    }

    public static final /* synthetic */ AtomicLongFieldUpdater s() {
        return f33273s;
    }

    private final h t0(c cVar, h hVar, boolean z10) {
        d dVar;
        if (cVar == null || (dVar = cVar.f33287c) == d.f33297e) {
            return hVar;
        }
        if (!hVar.f33310b && dVar == d.f33294b) {
            return hVar;
        }
        cVar.f33291g = true;
        return cVar.f33285a.a(hVar, z10);
    }

    private final boolean u0(long j10) {
        if (xd.d.b(((int) (2097151 & j10)) - ((int) ((j10 & 4398044413952L) >> 21)), 0) < this.f33276a) {
            int iK = k();
            if (iK == 1 && this.f33276a > 1) {
                k();
            }
            if (iK > 0) {
                return true;
            }
        }
        return false;
    }

    static /* synthetic */ boolean v0(a aVar, long j10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = f33273s.get(aVar);
        }
        return aVar.u0(j10);
    }

    private final boolean w0() {
        c cVarG;
        do {
            cVarG = G();
            if (cVarG == null) {
                return false;
            }
        } while (!c.f33284r.compareAndSet(cVarG, -1, 0));
        LockSupport.unpark(cVarG);
        return true;
    }

    private final int x(c cVar) {
        Object objG = cVar.g();
        while (objG != f33275u) {
            if (objG == null) {
                return 0;
            }
            c cVar2 = (c) objG;
            int iF = cVar2.f();
            if (iF != 0) {
                return iF;
            }
            objG = cVar2.g();
        }
        return -1;
    }

    public final boolean H(c cVar) {
        long j10;
        int iF;
        if (cVar.g() != f33275u) {
            return false;
        }
        AtomicLongFieldUpdater atomicLongFieldUpdater = f33272r;
        do {
            j10 = atomicLongFieldUpdater.get(this);
            iF = cVar.f();
            cVar.o(this.f33282g.b((int) (2097151 & j10)));
        } while (!f33272r.compareAndSet(this, j10, ((2097152 + j10) & (-2097152)) | ((long) iF)));
        return true;
    }

    public final void T(c cVar, int i10, int i11) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f33272r;
        while (true) {
            long j10 = atomicLongFieldUpdater.get(this);
            int iX = (int) (2097151 & j10);
            long j11 = (2097152 + j10) & (-2097152);
            if (iX == i10) {
                iX = i11 == 0 ? x(cVar) : i11;
            }
            if (iX >= 0 && f33272r.compareAndSet(this, j10, j11 | ((long) iX))) {
                return;
            }
        }
    }

    public final void W(h hVar) {
        try {
            hVar.run();
        } catch (Throwable th2) {
            try {
                Thread threadCurrentThread = Thread.currentThread();
                threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, th2);
            } finally {
                tg.c.a();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:68:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void X(long r8) throws java.lang.InterruptedException {
        /*
            r7 = this;
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = w()
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r7, r1, r2)
            if (r0 != 0) goto Ld
            return
        Ld:
            zg.a$c r0 = r7.n()
            xg.u r1 = r7.f33282g
            monitor-enter(r1)
            java.util.concurrent.atomic.AtomicLongFieldUpdater r3 = a()     // Catch: java.lang.Throwable -> L8f
            long r3 = r3.get(r7)     // Catch: java.lang.Throwable -> L8f
            r5 = 2097151(0x1fffff, double:1.0361303E-317)
            long r3 = r3 & r5
            int r4 = (int) r3
            monitor-exit(r1)
            if (r2 > r4) goto L4d
            r1 = 1
        L25:
            xg.u r3 = r7.f33282g
            java.lang.Object r3 = r3.b(r1)
            rd.m.b(r3)
            zg.a$c r3 = (zg.a.c) r3
            if (r3 == r0) goto L48
        L32:
            java.lang.Thread$State r5 = r3.getState()
            java.lang.Thread$State r6 = java.lang.Thread.State.TERMINATED
            if (r5 == r6) goto L41
            java.util.concurrent.locks.LockSupport.unpark(r3)
            r3.join(r8)
            goto L32
        L41:
            zg.m r3 = r3.f33285a
            zg.d r5 = r7.f33281f
            r3.j(r5)
        L48:
            if (r1 == r4) goto L4d
            int r1 = r1 + 1
            goto L25
        L4d:
            zg.d r8 = r7.f33281f
            r8.b()
            zg.d r8 = r7.f33280e
            r8.b()
        L57:
            if (r0 == 0) goto L5f
            zg.h r8 = r0.e(r2)
            if (r8 != 0) goto L8b
        L5f:
            zg.d r8 = r7.f33280e
            java.lang.Object r8 = r8.e()
            zg.h r8 = (zg.h) r8
            if (r8 != 0) goto L8b
            zg.d r8 = r7.f33281f
            java.lang.Object r8 = r8.e()
            zg.h r8 = (zg.h) r8
            if (r8 != 0) goto L8b
            if (r0 == 0) goto L7a
            zg.a$d r8 = zg.a.d.f33297e
            r0.r(r8)
        L7a:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r8 = v()
            r0 = 0
            r8.set(r7, r0)
            java.util.concurrent.atomic.AtomicLongFieldUpdater r8 = s()
            r8.set(r7, r0)
            return
        L8b:
            r7.W(r8)
            goto L57
        L8f:
            r8 = move-exception
            monitor-exit(r1)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: zg.a.X(long):void");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws InterruptedException {
        X(10000L);
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        r(this, runnable, false, false, 6, null);
    }

    public final boolean isTerminated() {
        return f33274t.get(this) == 1;
    }

    public final h l(Runnable runnable, boolean z10) {
        long jA = j.f33317f.a();
        if (!(runnable instanceof h)) {
            return j.b(runnable, jA, z10);
        }
        h hVar = (h) runnable;
        hVar.f33309a = jA;
        hVar.f33310b = z10;
        return hVar;
    }

    public final void p0() {
        if (w0() || v0(this, 0L, 1, null)) {
            return;
        }
        w0();
    }

    public final void q(Runnable runnable, boolean z10, boolean z11) {
        tg.c.a();
        h hVarL = l(runnable, z10);
        boolean z12 = hVarL.f33310b;
        long jAddAndGet = z12 ? f33273s.addAndGet(this, 2097152L) : 0L;
        h hVarT0 = t0(n(), hVarL, z11);
        if (hVarT0 != null && !c(hVarT0)) {
            throw new RejectedExecutionException(this.f33279d + " was terminated");
        }
        if (z12) {
            h0(jAddAndGet);
        } else {
            p0();
        }
    }

    public String toString() {
        ArrayList arrayList = new ArrayList();
        int iA = this.f33282g.a();
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        for (int i15 = 1; i15 < iA; i15++) {
            c cVar = (c) this.f33282g.b(i15);
            if (cVar != null) {
                int i16 = cVar.f33285a.i();
                int i17 = b.f33283a[cVar.f33287c.ordinal()];
                if (i17 == 1) {
                    i12++;
                } else if (i17 == 2) {
                    i11++;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(i16);
                    sb2.append('b');
                    arrayList.add(sb2.toString());
                } else if (i17 == 3) {
                    i10++;
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(i16);
                    sb3.append('c');
                    arrayList.add(sb3.toString());
                } else if (i17 == 4) {
                    i13++;
                    if (i16 > 0) {
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append(i16);
                        sb4.append('d');
                        arrayList.add(sb4.toString());
                    }
                } else {
                    if (i17 != 5) {
                        throw new o();
                    }
                    i14++;
                }
            }
        }
        long j10 = f33273s.get(this);
        return this.f33279d + '@' + h0.b(this) + "[Pool Size {core = " + this.f33276a + ", max = " + this.f33277b + "}, Worker States {CPU = " + i10 + ", blocking = " + i11 + ", parked = " + i12 + ", dormant = " + i13 + ", terminated = " + i14 + "}, running workers queues = " + arrayList + ", global CPU queue size = " + this.f33280e.c() + ", global blocking queue size = " + this.f33281f.c() + ", Control State {created workers= " + ((int) (2097151 & j10)) + ", blocking tasks = " + ((int) ((4398044413952L & j10) >> 21)) + ", CPUs acquired = " + (this.f33276a - ((int) ((9223367638808264704L & j10) >> 42))) + "}]";
    }

    public final class c extends Thread {

        /* JADX INFO: renamed from: r */
        private static final /* synthetic */ AtomicIntegerFieldUpdater f33284r = AtomicIntegerFieldUpdater.newUpdater(c.class, "workerCtl$volatile");

        /* JADX INFO: renamed from: a */
        public final m f33285a;

        /* JADX INFO: renamed from: b */
        private final b0 f33286b;

        /* JADX INFO: renamed from: c */
        public d f33287c;

        /* JADX INFO: renamed from: d */
        private long f33288d;

        /* JADX INFO: renamed from: e */
        private long f33289e;

        /* JADX INFO: renamed from: f */
        private int f33290f;

        /* JADX INFO: renamed from: g */
        public boolean f33291g;
        private volatile int indexInArray;
        private volatile Object nextParkedWorker;
        private volatile /* synthetic */ int workerCtl$volatile;

        private c() {
            setDaemon(true);
            setContextClassLoader(a.this.getClass().getClassLoader());
            this.f33285a = new m();
            this.f33286b = new b0();
            this.f33287c = d.f33296d;
            this.nextParkedWorker = a.f33275u;
            int iNanoTime = (int) System.nanoTime();
            this.f33290f = iNanoTime == 0 ? 42 : iNanoTime;
        }

        private final void b(h hVar) {
            this.f33288d = 0L;
            if (this.f33287c == d.f33295c) {
                this.f33287c = d.f33294b;
            }
            if (!hVar.f33310b) {
                a.this.W(hVar);
                return;
            }
            if (r(d.f33294b)) {
                a.this.p0();
            }
            a.this.W(hVar);
            a.s().addAndGet(a.this, -2097152L);
            if (this.f33287c != d.f33297e) {
                this.f33287c = d.f33296d;
            }
        }

        private final h c(boolean z10) {
            h hVarL;
            h hVarL2;
            if (z10) {
                boolean z11 = j(a.this.f33276a * 2) == 0;
                if (z11 && (hVarL2 = l()) != null) {
                    return hVarL2;
                }
                h hVarK = this.f33285a.k();
                if (hVarK != null) {
                    return hVarK;
                }
                if (!z11 && (hVarL = l()) != null) {
                    return hVarL;
                }
            } else {
                h hVarL3 = l();
                if (hVarL3 != null) {
                    return hVarL3;
                }
            }
            return s(3);
        }

        private final h d() {
            h hVarL = this.f33285a.l();
            if (hVarL != null) {
                return hVarL;
            }
            h hVar = (h) a.this.f33281f.e();
            return hVar == null ? s(1) : hVar;
        }

        private final boolean i() {
            return this.nextParkedWorker != a.f33275u;
        }

        private final void k() {
            if (this.f33288d == 0) {
                this.f33288d = System.nanoTime() + a.this.f33278c;
            }
            LockSupport.parkNanos(a.this.f33278c);
            if (System.nanoTime() - this.f33288d >= 0) {
                this.f33288d = 0L;
                t();
            }
        }

        private final h l() {
            if (j(2) == 0) {
                h hVar = (h) a.this.f33280e.e();
                return hVar != null ? hVar : (h) a.this.f33281f.e();
            }
            h hVar2 = (h) a.this.f33281f.e();
            return hVar2 != null ? hVar2 : (h) a.this.f33280e.e();
        }

        private final void m() {
            loop0: while (true) {
                boolean z10 = false;
                while (!a.this.isTerminated() && this.f33287c != d.f33297e) {
                    h hVarE = e(this.f33291g);
                    if (hVarE != null) {
                        this.f33289e = 0L;
                        b(hVarE);
                    } else {
                        this.f33291g = false;
                        if (this.f33289e == 0) {
                            q();
                        } else if (z10) {
                            r(d.f33295c);
                            Thread.interrupted();
                            LockSupport.parkNanos(this.f33289e);
                            this.f33289e = 0L;
                        } else {
                            z10 = true;
                        }
                    }
                }
                break loop0;
            }
            r(d.f33297e);
        }

        private final boolean p() {
            long j10;
            if (this.f33287c == d.f33293a) {
                return true;
            }
            a aVar = a.this;
            AtomicLongFieldUpdater atomicLongFieldUpdaterS = a.s();
            do {
                j10 = atomicLongFieldUpdaterS.get(aVar);
                if (((int) ((9223367638808264704L & j10) >> 42)) == 0) {
                    return false;
                }
            } while (!a.s().compareAndSet(aVar, j10, j10 - 4398046511104L));
            this.f33287c = d.f33293a;
            return true;
        }

        private final void q() {
            if (!i()) {
                a.this.H(this);
                return;
            }
            f33284r.set(this, -1);
            while (i() && f33284r.get(this) == -1 && !a.this.isTerminated() && this.f33287c != d.f33297e) {
                r(d.f33295c);
                Thread.interrupted();
                k();
            }
        }

        private final h s(int i10) {
            int i11 = (int) (a.s().get(a.this) & 2097151);
            if (i11 < 2) {
                return null;
            }
            int iJ = j(i11);
            a aVar = a.this;
            long jMin = Long.MAX_VALUE;
            for (int i12 = 0; i12 < i11; i12++) {
                iJ++;
                if (iJ > i11) {
                    iJ = 1;
                }
                c cVar = (c) aVar.f33282g.b(iJ);
                if (cVar != null && cVar != this) {
                    long jR = cVar.f33285a.r(i10, this.f33286b);
                    if (jR == -1) {
                        b0 b0Var = this.f33286b;
                        h hVar = (h) b0Var.f25935a;
                        b0Var.f25935a = null;
                        return hVar;
                    }
                    if (jR > 0) {
                        jMin = Math.min(jMin, jR);
                    }
                }
            }
            if (jMin == Long.MAX_VALUE) {
                jMin = 0;
            }
            this.f33289e = jMin;
            return null;
        }

        private final void t() {
            a aVar = a.this;
            synchronized (aVar.f33282g) {
                try {
                    if (aVar.isTerminated()) {
                        return;
                    }
                    if (((int) (a.s().get(aVar) & 2097151)) <= aVar.f33276a) {
                        return;
                    }
                    if (f33284r.compareAndSet(this, -1, 1)) {
                        int i10 = this.indexInArray;
                        n(0);
                        aVar.T(this, i10, 0);
                        int andDecrement = (int) (2097151 & a.s().getAndDecrement(aVar));
                        if (andDecrement != i10) {
                            Object objB = aVar.f33282g.b(andDecrement);
                            rd.m.b(objB);
                            c cVar = (c) objB;
                            aVar.f33282g.c(i10, cVar);
                            cVar.n(i10);
                            aVar.T(cVar, andDecrement, i10);
                        }
                        aVar.f33282g.c(andDecrement, null);
                        d0 d0Var = d0.f10897a;
                        this.f33287c = d.f33297e;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        public final h e(boolean z10) {
            return p() ? c(z10) : d();
        }

        public final int f() {
            return this.indexInArray;
        }

        public final Object g() {
            return this.nextParkedWorker;
        }

        public final int j(int i10) {
            int i11 = this.f33290f;
            int i12 = i11 ^ (i11 << 13);
            int i13 = i12 ^ (i12 >> 17);
            int i14 = i13 ^ (i13 << 5);
            this.f33290f = i14;
            int i15 = i10 - 1;
            return (i15 & i10) == 0 ? i14 & i15 : (i14 & ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED) % i10;
        }

        public final void n(int i10) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(a.this.f33279d);
            sb2.append("-worker-");
            sb2.append(i10 == 0 ? "TERMINATED" : String.valueOf(i10));
            setName(sb2.toString());
            this.indexInArray = i10;
        }

        public final void o(Object obj) {
            this.nextParkedWorker = obj;
        }

        public final boolean r(d dVar) {
            d dVar2 = this.f33287c;
            boolean z10 = dVar2 == d.f33293a;
            if (z10) {
                a.s().addAndGet(a.this, 4398046511104L);
            }
            if (dVar2 != dVar) {
                this.f33287c = dVar;
            }
            return z10;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            m();
        }

        public c(a aVar, int i10) {
            this();
            n(i10);
        }
    }
}
