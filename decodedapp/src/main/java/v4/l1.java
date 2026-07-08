package v4;

import android.bluetooth.BluetoothDevice;
import android.graphics.Bitmap;
import android.location.Location;
import android.os.Handler;
import android.os.Looper;
import com.dw.ht.Cfg;
import com.dw.ht.IGateService;
import com.dw.ht.Main;
import com.dw.util.concurrent.a;
import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.ConcurrentLinkedQueue;
import p3.b;
import v4.a0;
import v4.a2;
import v4.n0;
import w4.c;
import w5.a;
import xdsopl.robot36.a;

/* JADX INFO: loaded from: classes.dex */
public abstract class l1 implements n0 {
    private static boolean P = false;
    protected volatile l A;
    protected k0 B;
    protected boolean C;
    protected final long D;
    private int E;
    private final Runnable F;
    private final Object G;
    protected boolean H;
    protected d0 I;
    protected d0 J;
    private Location K;
    private y4.b L;
    private final ConcurrentLinkedQueue M;
    private final Runnable N;
    protected final Runnable O;

    /* JADX INFO: renamed from: a */
    protected final Handler f29943a;

    /* JADX INFO: renamed from: b */
    protected final g3.c f29944b;

    /* JADX INFO: renamed from: e */
    public int f29947e;

    /* JADX INFO: renamed from: f */
    private xdsopl.robot36.a f29948f;

    /* JADX INFO: renamed from: h */
    private volatile d f29950h;

    /* JADX INFO: renamed from: r */
    public final mi.c f29951r;

    /* JADX INFO: renamed from: t */
    protected w4.c[] f29953t;

    /* JADX INFO: renamed from: u */
    private h f29954u;

    /* JADX INFO: renamed from: y */
    protected volatile n0.c f29958y;

    /* JADX INFO: renamed from: z */
    protected volatile n0.c f29959z;

    /* JADX INFO: renamed from: c */
    protected final ConcurrentLinkedQueue f29945c = new ConcurrentLinkedQueue();

    /* JADX INFO: renamed from: d */
    public final r1 f29946d = new r1(this);

    /* JADX INFO: renamed from: g */
    private boolean f29949g = false;

    /* JADX INFO: renamed from: s */
    private final Object f29952s = new Object();

    /* JADX INFO: renamed from: v */
    private final Runnable f29955v = new Runnable() { // from class: v4.e1
        @Override // java.lang.Runnable
        public final void run() {
            l1.C(this.f29851a);
        }
    };

    /* JADX INFO: renamed from: w */
    private final Runnable f29956w = new Runnable() { // from class: v4.f1
        @Override // java.lang.Runnable
        public final void run() {
            l1.E(this.f29864a);
        }
    };

    /* JADX INFO: renamed from: x */
    private final Runnable f29957x = new Runnable() { // from class: v4.g1
        @Override // java.lang.Runnable
        public final void run() {
            l1.B(this.f29867a);
        }
    };

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (l1.this.f29958y == n0.c.Sending) {
                l1.this.a1(n0.c.Connected, h.TxTimeout);
            }
            l1.this.p1();
        }
    }

    class b implements a.b {
        b() {
        }

        @Override // xdsopl.robot36.a.b
        public void a(boolean z10, int i10) {
            s3.b.b("Link", String.format(Locale.getDefault(), "onModeChanged(detected:%s,  mode:%d)", Boolean.valueOf(z10), Integer.valueOf(i10)));
            l1 l1Var = l1.this;
            l1Var.f29943a.post(l1Var.f29957x);
            l1.this.k1(z10);
        }

        @Override // xdsopl.robot36.a.b
        public void b(Bitmap bitmap, boolean z10) throws Throwable {
            l1.this.D0(bitmap, z10);
        }
    }

    static /* synthetic */ class c {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f29962a;

        /* JADX INFO: renamed from: b */
        static final /* synthetic */ int[] f29963b;

        /* JADX INFO: renamed from: c */
        static final /* synthetic */ int[] f29964c;

        static {
            int[] iArr = new int[m1.values().length];
            f29964c = iArr;
            try {
                iArr[m1.APRS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            int[] iArr2 = new int[v.values().length];
            f29963b = iArr2;
            try {
                iArr2[v.WRITE_BSS_SETTINGS.ordinal()] = 1;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f29963b[v.FREQ_MODE_SET_PAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr3 = new int[n0.c.values().length];
            f29962a = iArr3;
            try {
                iArr3[n0.c.ConnectionFailed.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f29962a[n0.c.Interrupted.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f29962a[n0.c.Connected.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f29962a[n0.c.Idle.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static class d implements a.c {

        /* JADX INFO: renamed from: a */
        private final b6.d f29965a = new b6.d(64000);

        @Override // xdsopl.robot36.a.c
        public int P(short[] sArr, int i10, int i11) {
            try {
                this.f29965a.i(i11, 0L);
            } catch (InterruptedException e10) {
                e10.printStackTrace();
            }
            return this.f29965a.l(sArr, i10, i11);
        }

        public int a(short[] sArr, int i10, int i11) {
            return this.f29965a.o(sArr, i10, i11);
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f29965a.j();
        }

        @Override // xdsopl.robot36.a.c
        public int j() {
            return 32000;
        }
    }

    public enum e {
        RX_CHANEL_CHANGED,
        RX_START,
        RX_STOP,
        CONTROL_LINK_STATUS_CHANGED,
        AUDIO_LINK_STATUS_CHANGED,
        DELAY_CHANGED,
        SETTINGS_CHANGED,
        HAVE_UPDATE_FIRMWARE,
        BATTERY_VOLTAGE_CHANGED,
        SETTINGS_SYNCING_COMPLETE
    }

    public static class f {

        /* JADX INFO: renamed from: a */
        public final e f29977a;

        /* JADX INFO: renamed from: b */
        public final l1 f29978b;

        public f(l1 l1Var, e eVar) {
            this.f29977a = eVar;
            this.f29978b = l1Var;
        }
    }

    public static class g {

        /* JADX INFO: renamed from: a */
        public final l1 f29979a;

        public g(l1 l1Var) {
            this.f29979a = l1Var;
        }
    }

    public enum h {
        UnableToRecord,
        TxTimeout,
        NotInChannel,
        LinkInterrupted,
        ChannelIsOccupied,
        Unauthenticated,
        Unknown
    }

    l1(long j10) {
        n0.c cVar = n0.c.Idle;
        this.f29958y = cVar;
        this.f29959z = cVar;
        this.B = new k0();
        this.E = 10;
        this.F = new a();
        this.G = new Object();
        this.I = null;
        this.J = null;
        this.L = new y4.b();
        this.M = new ConcurrentLinkedQueue();
        this.N = new Runnable() { // from class: v4.h1
            @Override // java.lang.Runnable
            public final void run() {
                l1.D(this.f29876a);
            }
        };
        this.O = new Runnable() { // from class: v4.i1
            @Override // java.lang.Runnable
            public final void run() {
                l1.F(this.f29902a);
            }
        };
        this.D = j10;
        this.f29943a = new Handler(Looper.getMainLooper());
        this.f29944b = g3.c.H();
        mi.d dVarB = mi.c.b();
        dVarB.d(false);
        this.f29951r = dVarB.a();
    }

    public static /* synthetic */ void B(l1 l1Var) {
        Iterator it = l1Var.f29945c.iterator();
        while (it.hasNext()) {
            ((n0.d) it.next()).h0(l1Var);
        }
    }

    public static /* synthetic */ void C(l1 l1Var) {
        Iterator it = l1Var.f29945c.iterator();
        while (it.hasNext()) {
            ((n0.d) it.next()).o0(l1Var);
        }
    }

    public static /* synthetic */ void D(l1 l1Var) {
        Iterator it = l1Var.M.iterator();
        while (it.hasNext()) {
            ((n0.b) it.next()).r(l1Var.L);
        }
    }

    public static /* synthetic */ void E(l1 l1Var) {
        Iterator it = l1Var.f29945c.iterator();
        while (it.hasNext()) {
            ((n0.d) it.next()).W0(l1Var);
        }
    }

    public static /* synthetic */ void F(l1 l1Var) {
        if (l1Var.n() && !l1Var.d().t(a0.d.FreqScanStatusChangedNotification)) {
            l1Var.a(v.FREQ_MODE_GET_STATUS, new byte[0]);
        }
    }

    public static /* synthetic */ void G(l1 l1Var, com.dw.util.concurrent.a aVar) {
        if (l1Var.A == aVar) {
            l1Var.A = null;
            if (l1Var.f29958y == n0.c.Sending) {
                l1Var.a1(n0.c.Connected, ((l) aVar).B());
            }
        }
    }

    public static /* synthetic */ void H(l1 l1Var) {
        Iterator it = l1Var.f29945c.iterator();
        while (it.hasNext()) {
            ((n0.d) it.next()).i0(l1Var);
        }
    }

    public static long W(String str) {
        try {
            return Long.parseLong(str.replaceAll(":", ""), 16);
        } catch (NumberFormatException unused) {
            return 0L;
        }
    }

    public static boolean l0(long j10) {
        return j10 > 0 && j10 <= 281474976710655L;
    }

    public static boolean m0(long j10) {
        return l0(j10) || y0(j10);
    }

    public static boolean r0(long j10) {
        return j10 >= 28147497671065500L;
    }

    public static boolean y0(long j10) {
        return 281474976710910L <= j10 && j10 < 281474976711164L;
    }

    public void A0() {
        this.f29943a.post(new Runnable() { // from class: v4.j1
            @Override // java.lang.Runnable
            public final void run() {
                l1.H(this.f29910a);
            }
        });
        mi.c.e().m(new f(this, e.SETTINGS_CHANGED));
    }

    public void B0() {
        synchronized (this.f29952s) {
            this.f29952s.notifyAll();
        }
    }

    public void D0(Bitmap bitmap, boolean z10) throws Throwable {
        s3.b.b("Link", "onReceived image");
        r0 r0VarZ = Z();
        if (r0VarZ != null) {
            r0VarZ.f();
        }
        d5.g.t(q(), c0(), 1, bitmap);
    }

    protected void E0(byte[] bArr) {
        y4.b bVar = this.L;
        this.f29943a.removeCallbacks(this.O);
        y4.b bVar2 = new y4.b(bArr);
        this.L = bVar2;
        y4.c cVarB = bVar.b();
        y4.c cVar = y4.c.f32399b;
        if (cVarB != cVar && bVar2.b() == cVar) {
            com.dw.ht.satellite.b.P(0);
        }
        if (this.M.isEmpty()) {
            return;
        }
        if (!bVar.equals(bVar2)) {
            H0(this.N);
        }
        y4.c cVarB2 = bVar2.b();
        if (this.L.g() && (cVarB2 == y4.c.f32401d || cVarB2 == y4.c.f32400c)) {
            I0(this.O, 100L);
        } else if (cVarB2 == cVar) {
            I0(this.O, 5000L);
        } else {
            I0(this.O, 500L);
        }
    }

    void H0(Runnable runnable) {
        this.f29943a.removeCallbacks(runnable);
        this.f29943a.post(runnable);
    }

    void I0(Runnable runnable, long j10) {
        this.f29943a.removeCallbacks(runnable);
        this.f29943a.postDelayed(runnable, j10);
    }

    public void J(x... xVarArr) {
        if (d().t(a0.d.BatchNotificationRegistration)) {
            byte[] bArr = new byte[xVarArr.length];
            for (int i10 = 0; i10 < xVarArr.length; i10++) {
                bArr[i10] = (byte) xVarArr[i10].ordinal();
            }
            a(v.CANCEL_NOTIFICATION, bArr);
            return;
        }
        for (x xVar : xVarArr) {
            a(v.CANCEL_NOTIFICATION, (byte) xVar.ordinal());
        }
    }

    public void J0(x... xVarArr) {
        if (d().t(a0.d.BatchNotificationRegistration)) {
            byte[] bArr = new byte[xVarArr.length];
            for (int i10 = 0; i10 < xVarArr.length; i10++) {
                bArr[i10] = (byte) xVarArr[i10].ordinal();
            }
            a(v.REGISTER_NOTIFICATION, bArr);
            return;
        }
        for (x xVar : xVarArr) {
            a(v.REGISTER_NOTIFICATION, (byte) xVar.ordinal());
        }
    }

    protected void K() {
        if (this.C) {
            throw new IllegalStateException("此连接已经销毁");
        }
    }

    public void K0(Location location, int i10, boolean z10, boolean z11) {
        L0(location, i10, z10, z11, null);
    }

    public abstract void L(boolean z10);

    public void L0(Location location, int i10, boolean z10, boolean z11, s sVar) {
        w5.h hVarA;
        q qVarT = T();
        if (z11 || !k0()) {
            w5.d dVar = new w5.d();
            dVar.f31252c = qVarT.w();
            dVar.f31257h = Double.valueOf(location.getLongitude());
            dVar.f31256g = Double.valueOf(location.getLatitude());
            dVar.f31255f = qVarT.u();
            dVar.f31258r = qVarT.y();
            dVar.C = true;
            if (qVarT.s()) {
                dVar.f31260t = qVarT.E();
            }
            if (qVarT.z()) {
                dVar.f31259s = d().f29641h;
            }
            if (sVar == s.f30104d) {
                sVar = null;
            }
            hVarA = dVar;
        } else {
            hVarA = o5.b.a(location, this);
            if (sVar == s.f30104d) {
                sVar = s.f30103c;
            }
        }
        Q0(hVarA, i10, z10, sVar);
    }

    public x4.a M(boolean z10) {
        return null;
    }

    public void M0(Location location, s sVar) {
        L0(location, 100000, true, false, sVar);
    }

    protected m5.j N(BluetoothDevice bluetoothDevice) {
        return new m5.j(this, bluetoothDevice);
    }

    public void N0(String str, String str2, s sVar) {
        w5.a aVarA = new a.C0414a().d(str2).f(Cfg.j()).h(U()).e(str).g(Q()).a();
        if (!Cfg.f5478b) {
            S0(aVarA, sVar);
        } else {
            if (this.A != null) {
                return;
            }
            m1(new m5.a(this, aVarA));
        }
    }

    public abstract void O(boolean z10);

    public void O0(w5.h hVar) {
        Q0(hVar, 100000, true, null);
    }

    public boolean P(c.a aVar) {
        return a(v.DO_PROG_FUNC, (byte) (aVar.d() >> 8), (byte) aVar.d());
    }

    public void P0(w5.h hVar, int i10, boolean z10) {
        R0(hVar, i10, z10, false, null);
    }

    public String Q() {
        int iY = T().y();
        if (iY <= 0 || iY >= 9) {
            return null;
        }
        return "WIDE" + iY + "-" + iY;
    }

    public void Q0(w5.h hVar, int i10, boolean z10, s sVar) {
        R0(hVar, i10, z10, false, sVar);
    }

    public n0.c R() {
        return this.f29958y;
    }

    public void R0(w5.h hVar, int i10, boolean z10, boolean z11, s sVar) {
        b0().x(hVar, i10, z10, sVar);
        if (z11 || !(hVar instanceof w5.a)) {
            return;
        }
        IGateService.INSTANCE.d((w5.a) hVar);
    }

    public h S() {
        return this.f29954u;
    }

    public void S0(w5.h hVar, s sVar) {
        Q0(hVar, 100000, true, sVar);
    }

    public q T() {
        return com.dw.ht.user.b.f6853a.b();
    }

    public boolean T0(String str, String str2, m1 m1Var, s sVar) {
        Location locationC;
        if (c.f29964c[m1Var.ordinal()] == 1) {
            if (sVar == s.f30104d) {
                sVar = s.f30103c;
            }
            N0(str, str2, sVar);
        } else {
            if (w5.d.p(str) < 0 || w5.d.p(str2) < 0) {
                return false;
            }
            q qVarT = T();
            w5.d dVar = new w5.d();
            dVar.f31252c = qVarT.w();
            dVar.f31253d = str;
            dVar.f31255f = str2;
            if (qVarT.s()) {
                dVar.f31260t = qVarT.E();
            }
            if (qVarT.r() && (locationC = o5.g.C(Main.f5555g)) != null) {
                dVar.f31256g = Double.valueOf(locationC.getLatitude());
                dVar.f31257h = Double.valueOf(locationC.getLongitude());
            }
            dVar.f31258r = qVarT.y();
            if (sVar == s.f30104d) {
                sVar = null;
            }
            S0(dVar, sVar);
        }
        return true;
    }

    public String U() {
        String strL = T().l();
        return !strL.isEmpty() ? strL : Cfg.s();
    }

    public void U0(String str) {
        if (this.A != null) {
            return;
        }
        m1(new m5.e(this, str));
    }

    public d5.a V(int i10) {
        return null;
    }

    public boolean V0(short s10) {
        return X0((short) 1, s10);
    }

    public boolean W0(c1 c1Var, byte... bArr) {
        this.E = 20;
        if (!this.f29944b.F() || this.f29944b.I() > this.E) {
            return false;
        }
        this.f29944b.K(3, c1Var.ordinal(), bArr);
        return true;
    }

    public y4.b X() {
        return this.L;
    }

    public boolean X0(short s10, short... sArr) {
        return false;
    }

    public k0 Y() {
        return this.B;
    }

    public void Y0(String str) {
        if (this.A != null) {
            return;
        }
        m1(new m5.g(this, str));
    }

    public abstract r0 Z();

    public void Z0(n0.c cVar) {
        a1(cVar, null);
    }

    @Override // v4.n0, e5.a.f
    public boolean a(v vVar, byte... bArr) {
        if (!this.f29944b.F() || this.f29944b.I() > this.E) {
            return false;
        }
        int i10 = c.f29963b[vVar.ordinal()];
        if (i10 == 1) {
            A0();
        } else if (i10 == 2) {
            I0(this.O, 100L);
        }
        this.f29944b.K(2, vVar.ordinal(), bArr);
        return true;
    }

    public Long[] a0() {
        return null;
    }

    public void a1(n0.c cVar, h hVar) {
        int i10;
        synchronized (this) {
            try {
                if (this.f29958y == cVar) {
                    return;
                }
                if (this.f29958y.e(cVar)) {
                    if (hVar == null && ((i10 = c.f29962a[cVar.ordinal()]) == 1 || i10 == 2 || i10 == 3 || i10 == 4)) {
                        hVar = this.f29954u;
                    }
                    this.f29954u = hVar;
                    this.f29958y = cVar;
                    this.f29943a.removeCallbacks(this.f29955v);
                    if (this.f29943a.getLooper().getThread() == Thread.currentThread()) {
                        this.f29955v.run();
                    } else {
                        this.f29943a.post(this.f29955v);
                    }
                    B0();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // v4.n0
    public boolean b(v vVar, q0 q0Var) {
        return a(vVar, q0Var.a(d().f29640g));
    }

    public abstract y1 b0();

    public final void b1(q qVar) {
        c1(qVar, false);
    }

    public boolean c(int i10, int i11, byte... bArr) {
        if (!this.f29944b.F() || this.f29944b.I() > this.E) {
            return false;
        }
        this.f29944b.K(i10, i11, bArr);
        return true;
    }

    public int c0() {
        return 0;
    }

    public void c1(q qVar, boolean z10) {
        if (d().f29640g >= 136) {
            a(v.WRITE_BSS_SETTINGS, qVar.n());
        } else if (d().f29640g >= 50) {
            a(v.WRITE_BSS_SETTINGS, Arrays.copyOfRange(qVar.n(), 0, q.f30039z.b()));
        } else {
            a(v.WRITE_BSS_SETTINGS, Arrays.copyOfRange(qVar.n(), 0, q.f30039z.a()));
        }
    }

    @Override // v4.n0, e5.a.f
    public abstract a0 d();

    public d0 d0() {
        return this.I;
    }

    @Override // v4.n0
    public void destroy() {
        h(false);
        xdsopl.robot36.a aVar = this.f29948f;
        if (aVar != null) {
            aVar.i();
        }
        if (this.f29950h != null) {
            try {
                this.f29950h.close();
            } catch (IOException e10) {
                e10.printStackTrace();
            }
        }
        this.f29945c.clear();
        this.f29951r.r();
        this.C = true;
    }

    public d e0() {
        if (this.f29950h == null) {
            synchronized (this) {
                try {
                    if (this.f29950h == null) {
                        this.f29950h = new d();
                    }
                } finally {
                }
            }
        }
        return this.f29950h;
    }

    protected boolean e1(n0.c cVar) {
        synchronized (this) {
            try {
                if (this.f29959z == cVar) {
                    return false;
                }
                if (!this.f29959z.e(cVar)) {
                    return false;
                }
                this.f29959z = cVar;
                int[] iArr = c.f29962a;
                int i10 = iArr[cVar.ordinal()];
                if (i10 == 1 || i10 == 2) {
                    this.B = new k0();
                } else if (i10 == 3) {
                    this.K = null;
                }
                this.f29951r.m(e.CONTROL_LINK_STATUS_CHANGED);
                C0();
                this.f29943a.removeCallbacks(this.f29956w);
                if (this.f29943a.getLooper().getThread() == Thread.currentThread()) {
                    this.f29956w.run();
                } else {
                    this.f29943a.post(this.f29956w);
                }
                if (iArr[cVar.ordinal()] == 3 && t0() && n0()) {
                    a(v.SET_IS_DIGITAL_SIGNAL, 1);
                }
                B0();
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public abstract CharSequence f0();

    @Override // v4.n0
    public void g(n0.b bVar) {
        this.M.remove(bVar);
    }

    public Boolean g0() {
        return Boolean.TRUE;
    }

    public abstract void g1(a0.e eVar);

    @Override // v4.n0
    public abstract String getName();

    @Override // v4.n0
    public void h(boolean z10) {
        O(z10);
        this.f29944b.x();
        e1(n0.c.Idle);
        s3.b.c("Link", "disconnect", new Exception());
    }

    public d0 h0() {
        d0 d0Var = this.J;
        return d0Var != null ? d0Var : d0();
    }

    public abstract boolean h1(a2.a aVar);

    @Override // v4.n0
    public abstract boolean i();

    public long i0() {
        return 0L;
    }

    public void i1(boolean z10) {
        if (this.H == z10) {
            return;
        }
        this.H = z10;
        mi.c.e().m(new g(this));
    }

    @Override // v4.n0
    public boolean isDestroyed() {
        return this.C;
    }

    @Override // v4.n0
    public w4.c[] j() {
        return this.f29953t;
    }

    public abstract boolean j0();

    public boolean j1(long j10, int i10) {
        return true;
    }

    @Override // v4.n0
    public void k(n0.d dVar) {
        this.f29945c.add(dVar);
    }

    public boolean k0() {
        q qVarT = T();
        if (Cfg.V()) {
            return qVarT.A() || Cfg.Z();
        }
        return false;
    }

    public void k1(boolean z10) {
        r0 r0VarZ;
        if (this.f29949g == z10) {
            return;
        }
        this.f29949g = z10;
        v(false);
        if (n0()) {
            a(v.SET_IS_DIGITAL_SIGNAL, z10 ? (byte) 1 : (byte) 0);
        }
        if (!z10 || (r0VarZ = Z()) == null) {
            return;
        }
        r0VarZ.o();
    }

    @Override // v4.n0
    public n0.c l() {
        return this.f29959z;
    }

    public boolean m1(l lVar) {
        return n1(lVar, false);
    }

    @Override // v4.n0
    public boolean n() {
        return this.f29944b.F();
    }

    public boolean n0() {
        return false;
    }

    public boolean n1(l lVar, boolean z10) {
        l lVar2 = this.A;
        if (lVar2 != null && lVar2.isAlive() && !lVar2.isCancelled()) {
            return false;
        }
        this.A = lVar;
        this.A.start();
        this.A.addOnStopListener(new a.InterfaceC0105a() { // from class: v4.d1
            @Override // com.dw.util.concurrent.a.InterfaceC0105a
            public final void i(com.dw.util.concurrent.a aVar) {
                l1 l1Var = this.f29841a;
                l1Var.f29943a.post(new Runnable() { // from class: v4.k1
                    @Override // java.lang.Runnable
                    public final void run() {
                        l1.G(l1Var, aVar);
                    }
                });
            }
        });
        Z0(n0.c.Sending);
        return true;
    }

    public boolean o0() {
        return false;
    }

    public b.a o1(BluetoothDevice bluetoothDevice) {
        if (!w0() || !i()) {
            return null;
        }
        l lVar = this.A;
        if (lVar != null && lVar.isAlive()) {
            return null;
        }
        m5.j jVarN = N(bluetoothDevice);
        this.f29943a.removeCallbacks(this.F);
        if (i0() > 0) {
            this.f29943a.postDelayed(this.F, i0());
        }
        m1(jVarN);
        return jVarN;
    }

    @Override // v4.n0
    public void p(Location location) {
        if (n()) {
            Location location2 = this.K;
            if (location2 != null && location2.getTime() == location.getTime() && location2.getLatitude() == location.getLatitude() && location2.getLongitude() == location.getLongitude() && location2.getAltitude() == location.getAltitude() && location2.getSpeed() == location.getSpeed() && location2.getBearing() == location.getBearing()) {
                return;
            }
            this.K = location;
            int iK = d().k();
            if (iK >= 49) {
                a(v.SET_POSITION, b2.f29730a.g(location, iK >= 133));
            } else {
                a(v.SET_POSITION, b2.f29730a.f(location));
            }
        }
    }

    public boolean p0() {
        return this.H;
    }

    public void p1() {
        l lVar = this.A;
        if (lVar != null) {
            lVar.cancel();
        }
        this.A = null;
        if (this.f29958y == n0.c.Sending) {
            Z0(n0.c.Connected);
        }
    }

    @Override // v4.n0
    public long q() {
        return this.D;
    }

    public boolean q0() {
        return this.A != null;
    }

    public abstract boolean q1(int i10, long j10);

    @Override // v4.n0
    public void r(n0.d dVar) {
        this.f29945c.remove(dVar);
    }

    public void r1(long j10) {
        if (j10 <= 0) {
            throw new IllegalArgumentException("超时时间为0，如果等待同时数据改变会导致状态丢失");
        }
        synchronized (this.f29952s) {
            this.f29952s.wait(j10);
        }
    }

    @Override // v4.n0
    public r1 s() {
        return this.f29946d;
    }

    public abstract boolean s0();

    public abstract boolean s1(byte[] bArr, int i10, int i11, long j10);

    public boolean t0() {
        return this.f29949g;
    }

    public String toString() {
        return getName();
    }

    @Override // v4.n0
    public xdsopl.robot36.a u() {
        return this.f29948f;
    }

    public boolean u0(boolean z10, s sVar) {
        return true;
    }

    @Override // v4.n0
    public abstract void v(boolean z10);

    public boolean v0() {
        return n();
    }

    public boolean w0() {
        return true;
    }

    @Override // v4.n0
    public void x(n0.b bVar) {
        this.M.add(bVar);
        bVar.r(this.L);
        H0(this.O);
    }

    public boolean x0() {
        return true;
    }

    @Override // v4.n0
    public mi.c z() {
        return this.f29951r;
    }

    public xdsopl.robot36.a z0() {
        if (this.f29948f == null) {
            synchronized (this.G) {
                try {
                    if (!P && this.f29948f == null) {
                        this.f29948f = new xdsopl.robot36.a(Main.f5555g, new b(), e0());
                    }
                } catch (Throwable th2) {
                    th2.printStackTrace();
                    P = true;
                } finally {
                }
            }
        }
        return this.f29948f;
    }

    protected void C0() {
    }

    public void F0(long j10) {
    }

    public void G0(long j10) {
    }

    public void f1(int i10) {
    }

    public void l1(Boolean bool) {
    }

    public void d1(int i10, d5.a aVar) {
    }
}
