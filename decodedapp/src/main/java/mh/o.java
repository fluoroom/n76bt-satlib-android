package mh;

import dd.d0;
import java.io.Closeable;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import mh.c;
import mh.o;
import mh.u;
import rd.b0;

/* JADX INFO: loaded from: classes3.dex */
public final class o implements Closeable {
    public static final b L = new b(null);
    private static final z M;
    private long A;
    private final mh.c B;
    private final z C;
    private z D;
    private final nh.a E;
    private long F;
    private long G;
    private final jh.a H;
    private final w I;
    private final d J;
    private final Set K;

    /* JADX INFO: renamed from: a */
    private final boolean f22168a;

    /* JADX INFO: renamed from: b */
    private final c f22169b;

    /* JADX INFO: renamed from: c */
    private final Map f22170c;

    /* JADX INFO: renamed from: d */
    private final String f22171d;

    /* JADX INFO: renamed from: e */
    private int f22172e;

    /* JADX INFO: renamed from: f */
    private int f22173f;

    /* JADX INFO: renamed from: g */
    private boolean f22174g;

    /* JADX INFO: renamed from: h */
    private final ih.d f22175h;

    /* JADX INFO: renamed from: r */
    private final ih.c f22176r;

    /* JADX INFO: renamed from: s */
    private final ih.c f22177s;

    /* JADX INFO: renamed from: t */
    private final ih.c f22178t;

    /* JADX INFO: renamed from: u */
    private final y f22179u;

    /* JADX INFO: renamed from: v */
    private long f22180v;

    /* JADX INFO: renamed from: w */
    private long f22181w;

    /* JADX INFO: renamed from: x */
    private long f22182x;

    /* JADX INFO: renamed from: y */
    private long f22183y;

    /* JADX INFO: renamed from: z */
    private long f22184z;

    public static final class a {

        /* JADX INFO: renamed from: a */
        private boolean f22185a;

        /* JADX INFO: renamed from: b */
        private final ih.d f22186b;

        /* JADX INFO: renamed from: c */
        public jh.a f22187c;

        /* JADX INFO: renamed from: d */
        public String f22188d;

        /* JADX INFO: renamed from: e */
        private c f22189e;

        /* JADX INFO: renamed from: f */
        private y f22190f;

        /* JADX INFO: renamed from: g */
        private int f22191g;

        /* JADX INFO: renamed from: h */
        private mh.c f22192h;

        public a(boolean z10, ih.d dVar) {
            rd.m.e(dVar, "taskRunner");
            this.f22185a = z10;
            this.f22186b = dVar;
            this.f22189e = c.f22194b;
            this.f22190f = y.f22271b;
            this.f22192h = c.a.f22107a;
        }

        public final o a() {
            return new o(this);
        }

        public final a b(mh.c cVar) {
            rd.m.e(cVar, "flowControlListener");
            this.f22192h = cVar;
            return this;
        }

        public final boolean c() {
            return this.f22185a;
        }

        public final String d() {
            String str = this.f22188d;
            if (str != null) {
                return str;
            }
            rd.m.o("connectionName");
            return null;
        }

        public final mh.c e() {
            return this.f22192h;
        }

        public final c f() {
            return this.f22189e;
        }

        public final int g() {
            return this.f22191g;
        }

        public final y h() {
            return this.f22190f;
        }

        public final jh.a i() {
            jh.a aVar = this.f22187c;
            if (aVar != null) {
                return aVar;
            }
            rd.m.o("socket");
            return null;
        }

        public final ih.d j() {
            return this.f22186b;
        }

        public final a k(c cVar) {
            rd.m.e(cVar, "listener");
            this.f22189e = cVar;
            return this;
        }

        public final a l(int i10) {
            this.f22191g = i10;
            return this;
        }

        public final void m(String str) {
            rd.m.e(str, "<set-?>");
            this.f22188d = str;
        }

        public final void n(jh.a aVar) {
            rd.m.e(aVar, "<set-?>");
            this.f22187c = aVar;
        }

        public final a o(jh.a aVar, String str) {
            String str2;
            rd.m.e(aVar, "socket");
            rd.m.e(str, "peerName");
            n(aVar);
            if (this.f22185a) {
                str2 = fh.p.f13110c + ' ' + str;
            } else {
                str2 = "MockWebServer " + str;
            }
            m(str2);
            return this;
        }
    }

    public static final class b {
        public /* synthetic */ b(rd.h hVar) {
            this();
        }

        public final z a() {
            return o.M;
        }

        private b() {
        }
    }

    public static abstract class c {

        /* JADX INFO: renamed from: a */
        public static final b f22193a = new b(null);

        /* JADX INFO: renamed from: b */
        public static final c f22194b = new a();

        public static final class a extends c {
            a() {
            }

            @Override // mh.o.c
            public void b(v vVar) {
                rd.m.e(vVar, "stream");
                vVar.f(mh.b.f22098s, null);
            }
        }

        public static final class b {
            public /* synthetic */ b(rd.h hVar) {
                this();
            }

            private b() {
            }
        }

        public void a(o oVar, z zVar) {
            rd.m.e(oVar, "connection");
            rd.m.e(zVar, "settings");
        }

        public abstract void b(v vVar);
    }

    static {
        z zVar = new z();
        zVar.h(4, 65535);
        zVar.h(5, 16384);
        M = zVar;
    }

    public o(a aVar) {
        rd.m.e(aVar, "builder");
        boolean zC = aVar.c();
        this.f22168a = zC;
        this.f22169b = aVar.f();
        this.f22170c = new LinkedHashMap();
        String strD = aVar.d();
        this.f22171d = strD;
        this.f22173f = aVar.c() ? 3 : 2;
        ih.d dVarJ = aVar.j();
        this.f22175h = dVarJ;
        ih.c cVarK = dVarJ.k();
        this.f22176r = cVarK;
        this.f22177s = dVarJ.k();
        this.f22178t = dVarJ.k();
        this.f22179u = aVar.h();
        this.B = aVar.e();
        z zVar = new z();
        if (aVar.c()) {
            zVar.h(4, 16777216);
        }
        this.C = zVar;
        this.D = M;
        this.E = new nh.a(0);
        this.G = this.D.c();
        jh.a aVarI = aVar.i();
        this.H = aVarI;
        this.I = new w(aVarI.a(), zC);
        this.J = new d(this, new u(aVarI.getSource(), zC));
        this.K = new LinkedHashSet();
        if (aVar.g() != 0) {
            final long nanos = TimeUnit.MILLISECONDS.toNanos(aVar.g());
            cVarK.l(strD + " ping", nanos, new qd.a() { // from class: mh.g
                @Override // qd.a
                public final Object a() {
                    return Long.valueOf(o.s(this.f22144a, nanos));
                }
            });
        }
    }

    private final v L0(int i10, List list, boolean z10) throws Throwable {
        Throwable th2;
        boolean z11 = !z10;
        synchronized (this.I) {
            try {
                try {
                    synchronized (this) {
                        try {
                            if (this.f22173f > 1073741823) {
                                try {
                                    b1(mh.b.f22098s);
                                } catch (Throwable th3) {
                                    th2 = th3;
                                }
                            }
                            try {
                                if (this.f22174g) {
                                    throw new mh.a();
                                }
                                int i11 = this.f22173f;
                                this.f22173f = i11 + 2;
                                v vVar = new v(i11, this, z11, false, null);
                                boolean z12 = !z10 || this.F >= this.G || vVar.s() >= vVar.r();
                                if (vVar.v()) {
                                    this.f22170c.put(Integer.valueOf(i11), vVar);
                                }
                                d0 d0Var = d0.f10897a;
                                if (i10 == 0) {
                                    this.I.l(z11, i11, list);
                                } else {
                                    if (this.f22168a) {
                                        throw new IllegalArgumentException("client streams shouldn't have associated stream IDs");
                                    }
                                    this.I.n(i10, i11, list);
                                }
                                if (z12) {
                                    this.I.flush();
                                }
                                return vVar;
                            } catch (Throwable th4) {
                                th = th4;
                            }
                        } catch (Throwable th5) {
                            th = th5;
                        }
                        th2 = th;
                        throw th2;
                    }
                } catch (Throwable th6) {
                    th = th6;
                    throw th;
                }
            } catch (Throwable th7) {
                th = th7;
                throw th;
            }
        }
    }

    public static final d0 N0(o oVar, int i10, vh.e eVar, int i11, boolean z10) {
        try {
            boolean zB = oVar.f22179u.b(i10, eVar, i11, z10);
            if (zB) {
                oVar.I.q(i10, mh.b.f22099t);
            }
            if (zB || z10) {
                synchronized (oVar) {
                    oVar.K.remove(Integer.valueOf(i10));
                    d0 d0Var = d0.f10897a;
                }
            }
        } catch (IOException unused) {
        }
        return d0.f10897a;
    }

    public static final d0 P0(o oVar, int i10, List list, boolean z10) {
        boolean zD = oVar.f22179u.d(i10, list, z10);
        if (zD) {
            try {
                oVar.I.q(i10, mh.b.f22099t);
            } catch (IOException unused) {
            }
        }
        if (zD || z10) {
            synchronized (oVar) {
                oVar.K.remove(Integer.valueOf(i10));
                d0 d0Var = d0.f10897a;
            }
        }
        return d0.f10897a;
    }

    public static final d0 R0(o oVar, int i10, List list) {
        if (oVar.f22179u.c(i10, list)) {
            try {
                oVar.I.q(i10, mh.b.f22099t);
                synchronized (oVar) {
                    oVar.K.remove(Integer.valueOf(i10));
                    d0 d0Var = d0.f10897a;
                }
            } catch (IOException unused) {
            }
        }
        return d0.f10897a;
    }

    public static final d0 T0(o oVar, int i10, mh.b bVar) {
        oVar.f22179u.a(i10, bVar);
        synchronized (oVar) {
            oVar.K.remove(Integer.valueOf(i10));
        }
        return d0.f10897a;
    }

    public static final d0 X0(o oVar) {
        oVar.h1(false, 2, 0);
        return d0.f10897a;
    }

    public static /* synthetic */ void d1(o oVar, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        oVar.c1(z10);
    }

    public static final d0 j1(o oVar, int i10, mh.b bVar) {
        try {
            oVar.i1(i10, bVar);
        } catch (IOException e10) {
            oVar.x0(e10);
        }
        return d0.f10897a;
    }

    public static final d0 l1(o oVar, int i10, long j10) {
        try {
            oVar.I.b(i10, j10);
        } catch (IOException e10) {
            oVar.x0(e10);
        }
        return d0.f10897a;
    }

    public static final long s(o oVar, long j10) {
        boolean z10;
        synchronized (oVar) {
            long j11 = oVar.f22181w;
            long j12 = oVar.f22180v;
            if (j11 < j12) {
                z10 = true;
            } else {
                oVar.f22180v = j12 + 1;
                z10 = false;
            }
        }
        if (z10) {
            oVar.x0(null);
            return -1L;
        }
        oVar.h1(false, 1, 0);
        return j10;
    }

    public final void x0(IOException iOException) {
        mh.b bVar = mh.b.f22092d;
        w0(bVar, bVar, iOException);
    }

    public final mh.c A0() {
        return this.B;
    }

    public final int B0() {
        return this.f22172e;
    }

    public final c C0() {
        return this.f22169b;
    }

    public final int D0() {
        return this.f22173f;
    }

    public final z E0() {
        return this.C;
    }

    public final z F0() {
        return this.D;
    }

    public final v G0(int i10) {
        v vVar;
        synchronized (this) {
            vVar = (v) this.f22170c.get(Integer.valueOf(i10));
        }
        return vVar;
    }

    public final Map H0() {
        return this.f22170c;
    }

    public final long I0() {
        return this.G;
    }

    public final w J0() {
        return this.I;
    }

    public final boolean K0(long j10) {
        synchronized (this) {
            if (this.f22174g) {
                return false;
            }
            if (this.f22183y < this.f22182x) {
                if (j10 >= this.A) {
                    return false;
                }
            }
            return true;
        }
    }

    public final v M0(List list, boolean z10) {
        rd.m.e(list, "requestHeaders");
        return L0(0, list, z10);
    }

    public final void O0(final int i10, vh.g gVar, final int i11, final boolean z10) {
        rd.m.e(gVar, "source");
        final vh.e eVar = new vh.e();
        long j10 = i11;
        gVar.l0(j10);
        gVar.N(eVar, j10);
        ih.c.d(this.f22177s, this.f22171d + '[' + i10 + "] onData", 0L, false, new qd.a() { // from class: mh.k
            @Override // qd.a
            public final Object a() {
                return o.N0(this.f22153a, i10, eVar, i11, z10);
            }
        }, 6, null);
    }

    public final void Q0(final int i10, final List list, final boolean z10) {
        rd.m.e(list, "requestHeaders");
        ih.c.d(this.f22177s, this.f22171d + '[' + i10 + "] onHeaders", 0L, false, new qd.a() { // from class: mh.n
            @Override // qd.a
            public final Object a() {
                return o.P0(this.f22164a, i10, list, z10);
            }
        }, 6, null);
    }

    public final void S0(final int i10, final List list) {
        rd.m.e(list, "requestHeaders");
        synchronized (this) {
            if (this.K.contains(Integer.valueOf(i10))) {
                k1(i10, mh.b.f22092d);
                return;
            }
            this.K.add(Integer.valueOf(i10));
            ih.c.d(this.f22177s, this.f22171d + '[' + i10 + "] onRequest", 0L, false, new qd.a() { // from class: mh.l
                @Override // qd.a
                public final Object a() {
                    return o.R0(this.f22158a, i10, list);
                }
            }, 6, null);
        }
    }

    public final void U0(final int i10, final mh.b bVar) {
        rd.m.e(bVar, "errorCode");
        ih.c.d(this.f22177s, this.f22171d + '[' + i10 + "] onReset", 0L, false, new qd.a() { // from class: mh.m
            @Override // qd.a
            public final Object a() {
                return o.T0(this.f22161a, i10, bVar);
            }
        }, 6, null);
    }

    public final boolean V0(int i10) {
        return i10 != 0 && (i10 & 1) == 0;
    }

    public final v W0(int i10) {
        v vVar;
        synchronized (this) {
            vVar = (v) this.f22170c.remove(Integer.valueOf(i10));
            rd.m.c(this, "null cannot be cast to non-null type java.lang.Object");
            notifyAll();
        }
        return vVar;
    }

    public final void Y0() {
        synchronized (this) {
            long j10 = this.f22183y;
            long j11 = this.f22182x;
            if (j10 < j11) {
                return;
            }
            this.f22182x = j11 + 1;
            this.A = System.nanoTime() + ((long) 1000000000);
            d0 d0Var = d0.f10897a;
            ih.c.d(this.f22176r, this.f22171d + " ping", 0L, false, new qd.a() { // from class: mh.i
                @Override // qd.a
                public final Object a() {
                    return o.X0(this.f22149a);
                }
            }, 6, null);
        }
    }

    public final void Z0(int i10) {
        this.f22172e = i10;
    }

    public final void a1(z zVar) {
        rd.m.e(zVar, "<set-?>");
        this.D = zVar;
    }

    public final void b1(mh.b bVar) {
        rd.m.e(bVar, "statusCode");
        synchronized (this.I) {
            synchronized (this) {
                if (this.f22174g) {
                    return;
                }
                this.f22174g = true;
                int i10 = this.f22172e;
                d0 d0Var = d0.f10897a;
                this.I.k(i10, bVar, fh.m.f13103a);
            }
        }
    }

    public final void c1(boolean z10) {
        if (z10) {
            this.I.A();
            this.I.r(this.C);
            if (this.C.c() != 65535) {
                this.I.b(0, r9 - 65535);
            }
        }
        ih.c.d(this.f22175h.k(), this.f22171d, 0L, false, this.J, 6, null);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        w0(mh.b.f22091c, mh.b.f22099t, null);
    }

    public final void e1(long j10) {
        synchronized (this) {
            try {
                nh.a.c(this.E, j10, 0L, 2, null);
                long jA = this.E.a();
                if (jA >= this.C.c() / 2) {
                    m1(0, jA);
                    nh.a.c(this.E, 0L, jA, 1, null);
                }
                this.B.a(this.E);
                d0 d0Var = d0.f10897a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x003a, code lost:
    
        r3 = java.lang.Math.min((int) java.lang.Math.min(r12, r5 - r3), r8.I.i0());
        r6 = r3;
        r8.F += r6;
        r4 = dd.d0.f10897a;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f1(int r9, boolean r10, vh.e r11, long r12) {
        /*
            r8 = this;
            r0 = 0
            r1 = 0
            int r3 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r3 != 0) goto Ld
            mh.w r12 = r8.I
            r12.m(r10, r9, r11, r0)
            return
        Ld:
            int r3 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r3 <= 0) goto L71
            monitor-enter(r8)
        L12:
            long r3 = r8.F     // Catch: java.lang.Throwable -> L2f java.lang.InterruptedException -> L62
            long r5 = r8.G     // Catch: java.lang.Throwable -> L2f java.lang.InterruptedException -> L62
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 < 0) goto L39
            java.util.Map r3 = r8.f22170c     // Catch: java.lang.Throwable -> L2f java.lang.InterruptedException -> L62
            java.lang.Integer r4 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.Throwable -> L2f java.lang.InterruptedException -> L62
            boolean r3 = r3.containsKey(r4)     // Catch: java.lang.Throwable -> L2f java.lang.InterruptedException -> L62
            if (r3 == 0) goto L31
            java.lang.String r3 = "null cannot be cast to non-null type java.lang.Object"
            rd.m.c(r8, r3)     // Catch: java.lang.Throwable -> L2f java.lang.InterruptedException -> L62
            r8.wait()     // Catch: java.lang.Throwable -> L2f java.lang.InterruptedException -> L62
            goto L12
        L2f:
            r9 = move-exception
            goto L6f
        L31:
            java.io.IOException r9 = new java.io.IOException     // Catch: java.lang.Throwable -> L2f java.lang.InterruptedException -> L62
            java.lang.String r10 = "stream closed"
            r9.<init>(r10)     // Catch: java.lang.Throwable -> L2f java.lang.InterruptedException -> L62
            throw r9     // Catch: java.lang.Throwable -> L2f java.lang.InterruptedException -> L62
        L39:
            long r5 = r5 - r3
            long r3 = java.lang.Math.min(r12, r5)     // Catch: java.lang.Throwable -> L2f
            int r4 = (int) r3     // Catch: java.lang.Throwable -> L2f
            mh.w r3 = r8.I     // Catch: java.lang.Throwable -> L2f
            int r3 = r3.i0()     // Catch: java.lang.Throwable -> L2f
            int r3 = java.lang.Math.min(r4, r3)     // Catch: java.lang.Throwable -> L2f
            long r4 = r8.F     // Catch: java.lang.Throwable -> L2f
            long r6 = (long) r3     // Catch: java.lang.Throwable -> L2f
            long r4 = r4 + r6
            r8.F = r4     // Catch: java.lang.Throwable -> L2f
            dd.d0 r4 = dd.d0.f10897a     // Catch: java.lang.Throwable -> L2f
            monitor-exit(r8)
            long r12 = r12 - r6
            mh.w r4 = r8.I
            if (r10 == 0) goto L5d
            int r5 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r5 != 0) goto L5d
            r5 = 1
            goto L5e
        L5d:
            r5 = 0
        L5e:
            r4.m(r5, r9, r11, r3)
            goto Ld
        L62:
            java.lang.Thread r9 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L2f
            r9.interrupt()     // Catch: java.lang.Throwable -> L2f
            java.io.InterruptedIOException r9 = new java.io.InterruptedIOException     // Catch: java.lang.Throwable -> L2f
            r9.<init>()     // Catch: java.lang.Throwable -> L2f
            throw r9     // Catch: java.lang.Throwable -> L2f
        L6f:
            monitor-exit(r8)
            throw r9
        L71:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: mh.o.f1(int, boolean, vh.e, long):void");
    }

    public final void flush() {
        this.I.flush();
    }

    public final void g1(int i10, boolean z10, List list) {
        rd.m.e(list, "alternating");
        this.I.l(z10, i10, list);
    }

    public final void h1(boolean z10, int i10, int i11) {
        try {
            this.I.d(z10, i10, i11);
        } catch (IOException e10) {
            x0(e10);
        }
    }

    public final void i1(int i10, mh.b bVar) {
        rd.m.e(bVar, "statusCode");
        this.I.q(i10, bVar);
    }

    public final void k1(final int i10, final mh.b bVar) {
        rd.m.e(bVar, "errorCode");
        ih.c.d(this.f22176r, this.f22171d + '[' + i10 + "] writeSynReset", 0L, false, new qd.a() { // from class: mh.j
            @Override // qd.a
            public final Object a() {
                return o.j1(this.f22150a, i10, bVar);
            }
        }, 6, null);
    }

    public final void m1(final int i10, final long j10) {
        ih.c.d(this.f22176r, this.f22171d + '[' + i10 + "] windowUpdate", 0L, false, new qd.a() { // from class: mh.h
            @Override // qd.a
            public final Object a() {
                return o.l1(this.f22146a, i10, j10);
            }
        }, 6, null);
    }

    public final void w0(mh.b bVar, mh.b bVar2, IOException iOException) {
        int i10;
        Object[] array;
        rd.m.e(bVar, "connectionCode");
        rd.m.e(bVar2, "streamCode");
        if (fh.p.f13109b && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        try {
            b1(bVar);
        } catch (IOException unused) {
        }
        synchronized (this) {
            try {
                if (this.f22170c.isEmpty()) {
                    array = null;
                } else {
                    array = this.f22170c.values().toArray(new v[0]);
                    this.f22170c.clear();
                }
                d0 d0Var = d0.f10897a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        v[] vVarArr = (v[]) array;
        if (vVarArr != null) {
            for (v vVar : vVarArr) {
                try {
                    vVar.f(bVar2, iOException);
                } catch (IOException unused2) {
                }
            }
        }
        try {
            this.I.close();
        } catch (IOException unused3) {
        }
        try {
            this.H.cancel();
        } catch (IOException unused4) {
        }
        this.f22176r.q();
        this.f22177s.q();
        this.f22178t.q();
    }

    public final boolean y0() {
        return this.f22168a;
    }

    public final String z0() {
        return this.f22171d;
    }

    public final class d implements u.c, qd.a {

        /* JADX INFO: renamed from: a */
        private final u f22195a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ o f22196b;

        public d(o oVar, u uVar) {
            rd.m.e(uVar, "reader");
            this.f22196b = oVar;
            this.f22195a = uVar;
        }

        public static final d0 B(o oVar, int i10, int i11) {
            oVar.h1(true, i10, i11);
            return d0.f10897a;
        }

        public static final d0 C(d dVar, boolean z10, z zVar) {
            dVar.x(z10, zVar);
            return d0.f10897a;
        }

        public static final d0 y(o oVar, b0 b0Var) {
            oVar.C0().a(oVar, (z) b0Var.f25935a);
            return d0.f10897a;
        }

        public static final d0 z(o oVar, v vVar) {
            try {
                oVar.C0().b(vVar);
            } catch (IOException e10) {
                okhttp3.internal.platform.c.f23684a.e().m("Http2Connection.Listener failure for " + oVar.z0(), 4, e10);
                try {
                    vVar.f(mh.b.f22092d, e10);
                } catch (IOException unused) {
                }
            }
            return d0.f10897a;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v0, types: [mh.b] */
        /* JADX WARN: Type inference failed for: r0v3 */
        /* JADX WARN: Type inference failed for: r0v5, types: [java.io.Closeable, mh.u] */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        public void A() throws Throwable {
            mh.b bVar;
            mh.b bVar2;
            mh.b bVar3 = mh.b.f22093e;
            IOException e10 = null;
            try {
                try {
                    this.f22195a.e(this);
                    while (this.f22195a.c(false, this)) {
                    }
                    bVar2 = mh.b.f22091c;
                } catch (IOException e11) {
                    e10 = e11;
                } catch (Throwable th2) {
                    th = th2;
                    bVar = bVar3;
                    this.f22196b.w0(bVar, bVar3, e10);
                    fh.m.f(this.f22195a);
                    throw th;
                }
                try {
                    this.f22196b.w0(bVar2, mh.b.f22099t, null);
                    bVar = bVar2;
                } catch (IOException e12) {
                    e10 = e12;
                    mh.b bVar4 = mh.b.f22092d;
                    o oVar = this.f22196b;
                    oVar.w0(bVar4, bVar4, e10);
                    bVar = oVar;
                }
                bVar3 = this.f22195a;
                fh.m.f(bVar3);
            } catch (Throwable th3) {
                th = th3;
                this.f22196b.w0(bVar, bVar3, e10);
                fh.m.f(this.f22195a);
                throw th;
            }
        }

        @Override // qd.a
        public /* bridge */ /* synthetic */ Object a() throws Throwable {
            A();
            return d0.f10897a;
        }

        @Override // mh.u.c
        public void b(int i10, long j10) {
            if (i10 == 0) {
                o oVar = this.f22196b;
                synchronized (oVar) {
                    oVar.G = oVar.I0() + j10;
                    rd.m.c(oVar, "null cannot be cast to non-null type java.lang.Object");
                    oVar.notifyAll();
                    d0 d0Var = d0.f10897a;
                }
                return;
            }
            v vVarG0 = this.f22196b.G0(i10);
            if (vVarG0 != null) {
                synchronized (vVarG0) {
                    vVarG0.c(j10);
                    d0 d0Var2 = d0.f10897a;
                }
            }
        }

        @Override // mh.u.c
        public void d(boolean z10, final int i10, final int i11) {
            if (!z10) {
                ih.c cVar = this.f22196b.f22176r;
                String str = this.f22196b.z0() + " ping";
                final o oVar = this.f22196b;
                ih.c.d(cVar, str, 0L, false, new qd.a() { // from class: mh.p
                    @Override // qd.a
                    public final Object a() {
                        return o.d.B(oVar, i10, i11);
                    }
                }, 6, null);
                return;
            }
            o oVar2 = this.f22196b;
            synchronized (oVar2) {
                try {
                    if (i10 == 1) {
                        oVar2.f22181w++;
                    } else if (i10 != 2) {
                        if (i10 == 3) {
                            oVar2.f22184z++;
                            rd.m.c(oVar2, "null cannot be cast to non-null type java.lang.Object");
                            oVar2.notifyAll();
                        }
                        d0 d0Var = d0.f10897a;
                    } else {
                        oVar2.f22183y++;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // mh.u.c
        public void i(int i10, int i11, List list) {
            rd.m.e(list, "requestHeaders");
            this.f22196b.S0(i11, list);
        }

        @Override // mh.u.c
        public void m(final boolean z10, final z zVar) {
            rd.m.e(zVar, "settings");
            ih.c.d(this.f22196b.f22176r, this.f22196b.z0() + " applyAndAckSettings", 0L, false, new qd.a() { // from class: mh.r
                @Override // qd.a
                public final Object a() {
                    return o.d.C(this.f22202a, z10, zVar);
                }
            }, 6, null);
        }

        @Override // mh.u.c
        public void n(int i10, mh.b bVar) {
            rd.m.e(bVar, "errorCode");
            if (this.f22196b.V0(i10)) {
                this.f22196b.U0(i10, bVar);
                return;
            }
            v vVarW0 = this.f22196b.W0(i10);
            if (vVarW0 != null) {
                vVarW0.A(bVar);
            }
        }

        @Override // mh.u.c
        public void o(boolean z10, int i10, int i11, List list) {
            rd.m.e(list, "headerBlock");
            if (this.f22196b.V0(i10)) {
                this.f22196b.Q0(i10, list, z10);
                return;
            }
            final o oVar = this.f22196b;
            synchronized (oVar) {
                v vVarG0 = oVar.G0(i10);
                if (vVarG0 != null) {
                    d0 d0Var = d0.f10897a;
                    vVarG0.z(fh.p.s(list), z10);
                    return;
                }
                if (oVar.f22174g) {
                    return;
                }
                if (i10 <= oVar.B0()) {
                    return;
                }
                if (i10 % 2 == oVar.D0() % 2) {
                    return;
                }
                final v vVar = new v(i10, oVar, false, z10, fh.p.s(list));
                oVar.Z0(i10);
                oVar.H0().put(Integer.valueOf(i10), vVar);
                ih.c.d(oVar.f22175h.k(), oVar.z0() + '[' + i10 + "] onStream", 0L, false, new qd.a() { // from class: mh.q
                    @Override // qd.a
                    public final Object a() {
                        return o.d.z(oVar, vVar);
                    }
                }, 6, null);
            }
        }

        @Override // mh.u.c
        public void p(boolean z10, int i10, vh.g gVar, int i11) {
            rd.m.e(gVar, "source");
            if (this.f22196b.V0(i10)) {
                this.f22196b.O0(i10, gVar, i11, z10);
                return;
            }
            v vVarG0 = this.f22196b.G0(i10);
            if (vVarG0 == null) {
                this.f22196b.k1(i10, mh.b.f22092d);
                long j10 = i11;
                this.f22196b.e1(j10);
                gVar.skip(j10);
                return;
            }
            vVarG0.y(gVar, i11);
            if (z10) {
                vVarG0.z(eh.y.f12618c, true);
            }
        }

        @Override // mh.u.c
        public void q(int i10, mh.b bVar, vh.h hVar) {
            int i11;
            Object[] array;
            rd.m.e(bVar, "errorCode");
            rd.m.e(hVar, "debugData");
            hVar.Q();
            o oVar = this.f22196b;
            synchronized (oVar) {
                array = oVar.H0().values().toArray(new v[0]);
                oVar.f22174g = true;
                d0 d0Var = d0.f10897a;
            }
            for (v vVar : (v[]) array) {
                if (vVar.m() > i10 && vVar.u()) {
                    vVar.A(mh.b.f22098s);
                    this.f22196b.W0(vVar.m());
                }
            }
        }

        public final void x(boolean z10, z zVar) {
            long jC;
            int i10;
            v[] vVarArr;
            z zVar2 = zVar;
            rd.m.e(zVar2, "settings");
            final b0 b0Var = new b0();
            w wVarJ0 = this.f22196b.J0();
            final o oVar = this.f22196b;
            synchronized (wVarJ0) {
                synchronized (oVar) {
                    try {
                        z zVarF0 = oVar.F0();
                        if (!z10) {
                            z zVar3 = new z();
                            zVar3.g(zVarF0);
                            zVar3.g(zVar2);
                            zVar2 = zVar3;
                        }
                        b0Var.f25935a = zVar2;
                        jC = ((long) zVar2.c()) - ((long) zVarF0.c());
                        vVarArr = (jC == 0 || oVar.H0().isEmpty()) ? null : (v[]) oVar.H0().values().toArray(new v[0]);
                        oVar.a1((z) b0Var.f25935a);
                        ih.c.d(oVar.f22178t, oVar.z0() + " onSettings", 0L, false, new qd.a() { // from class: mh.s
                            @Override // qd.a
                            public final Object a() {
                                return o.d.y(oVar, b0Var);
                            }
                        }, 6, null);
                        d0 d0Var = d0.f10897a;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                try {
                    oVar.J0().a((z) b0Var.f25935a);
                } catch (IOException e10) {
                    oVar.x0(e10);
                }
                d0 d0Var2 = d0.f10897a;
            }
            if (vVarArr != null) {
                for (v vVar : vVarArr) {
                    synchronized (vVar) {
                        vVar.c(jC);
                        d0 d0Var3 = d0.f10897a;
                    }
                }
            }
        }

        @Override // mh.u.c
        public void e() {
        }

        @Override // mh.u.c
        public void g(int i10, int i11, int i12, boolean z10) {
        }
    }
}
