package v4;

import android.content.Context;
import android.location.Location;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import android.widget.Toast;
import com.benshikj.ht.R;
import com.benshikj.ht.rpc.Dm;
import com.benshikj.ht.rpc.Im;
import com.dw.ht.Cfg;
import com.dw.ht.LocationShareService;
import com.dw.ht.Main;
import com.dw.ht.alarms.AlarmService;
import com.dw.ht.entitys.ChannelBond;
import com.dw.ht.entitys.IIChannel;
import com.dw.ht.entitys.LinkSettings;
import com.dw.ht.entitys.RegionBind;
import com.dw.ht.ii.IIService;
import com.dw.ht.k0;
import com.facebook.stetho.websocket.CloseCodes;
import d5.a;
import e5.a;
import g3.a;
import g3.b;
import g3.c;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import org.greenrobot.eventbus.ThreadMode;
import org.msgpack.core.MessagePack;
import v4.a0;
import v4.a2;
import v4.l1;
import v4.n0;
import v4.u;

/* JADX INFO: loaded from: classes.dex */
public abstract class c0 extends l1 implements a.f {
    private a.g A0;
    private int B0;
    private final Object C0;
    l D0;
    private byte[] E0;
    private Dm.DeviceID F0;
    private final Runnable G0;
    protected final Runnable H0;
    private final Runnable I0;
    public final v4.n Q;
    protected final r[] R;
    private final LinkSettings S;
    private String[] T;
    protected final Object U;
    private final ArrayList V;
    private final a2 W;
    protected int X;
    protected boolean Y;
    protected volatile t Z;

    /* JADX INFO: renamed from: a0 */
    protected fc.d f29750a0;

    /* JADX INFO: renamed from: b0 */
    protected List f29751b0;

    /* JADX INFO: renamed from: c0 */
    protected List f29752c0;

    /* JADX INFO: renamed from: d0 */
    protected final Runnable f29753d0;

    /* JADX INFO: renamed from: e0 */
    protected final Runnable f29754e0;

    /* JADX INFO: renamed from: f0 */
    private boolean f29755f0;

    /* JADX INFO: renamed from: g0 */
    private boolean f29756g0;

    /* JADX INFO: renamed from: h0 */
    private Handler f29757h0;

    /* JADX INFO: renamed from: i0 */
    protected final Handler f29758i0;

    /* JADX INFO: renamed from: j0 */
    long f29759j0;

    /* JADX INFO: renamed from: k0 */
    int f29760k0;

    /* JADX INFO: renamed from: l0 */
    io.objectbox.a f29761l0;

    /* JADX INFO: renamed from: m0 */
    y1 f29762m0;

    /* JADX INFO: renamed from: n0 */
    private e5.a f29763n0;

    /* JADX INFO: renamed from: o0 */
    private boolean f29764o0;

    /* JADX INFO: renamed from: p0 */
    private final BitSet f29765p0;

    /* JADX INFO: renamed from: q0 */
    private final BitSet f29766q0;

    /* JADX INFO: renamed from: r0 */
    protected boolean f29767r0;

    /* JADX INFO: renamed from: s0 */
    private final v4.q f29768s0;

    /* JADX INFO: renamed from: t0 */
    protected String f29769t0;

    /* JADX INFO: renamed from: u0 */
    private boolean f29770u0;

    /* JADX INFO: renamed from: v0 */
    private long f29771v0;

    /* JADX INFO: renamed from: w0 */
    private r f29772w0;

    /* JADX INFO: renamed from: x0 */
    private r f29773x0;

    /* JADX INFO: renamed from: y0 */
    private int f29774y0;

    /* JADX INFO: renamed from: z0 */
    private boolean f29775z0;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f29776a;

        /* JADX INFO: renamed from: b */
        static final /* synthetic */ int[] f29777b;

        /* JADX INFO: renamed from: c */
        static final /* synthetic */ int[] f29778c;

        /* JADX INFO: renamed from: d */
        static final /* synthetic */ int[] f29779d;

        /* JADX INFO: renamed from: e */
        static final /* synthetic */ int[] f29780e;

        static {
            int[] iArr = new int[x.values().length];
            f29780e = iArr;
            try {
                iArr[x.FREQ_SCAN_STATUS_CHANGED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f29780e[x.BSS_SETTINGS_CHANGED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f29780e[x.RINGING_STOPPED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f29780e[x.HT_STATUS_CHANGED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f29780e[x.POSITION_CHANGED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f29780e[x.HT_SETTINGS_CHANGED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f29780e[x.HT_CH_CHANGED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f29780e[x.DATA_RXD.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f29780e[x.DATA_TXD.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            int[] iArr2 = new int[v.values().length];
            f29779d = iArr2;
            try {
                iArr2[v.GET_PF.ordinal()] = 1;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f29779d[v.HT_SEND_DATA.ordinal()] = 2;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f29779d[v.GET_APRS_PATH.ordinal()] = 3;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f29779d[v.READ_RF_CH.ordinal()] = 4;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f29779d[v.FREQ_MODE_GET_STATUS.ordinal()] = 5;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f29779d[v.READ_SETTINGS.ordinal()] = 6;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f29779d[v.READ_REGION_NAME.ordinal()] = 7;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f29779d[v.READ_BSS_SETTINGS.ordinal()] = 8;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f29779d[v.READ_FREQ_RANGE.ordinal()] = 9;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f29779d[v.SET_APRS_PATH.ordinal()] = 10;
            } catch (NoSuchFieldError unused19) {
            }
            int[] iArr3 = new int[n0.c.values().length];
            f29778c = iArr3;
            try {
                iArr3[n0.c.Idle.ordinal()] = 1;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f29778c[n0.c.ConnectionFailed.ordinal()] = 2;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f29778c[n0.c.Connecting.ordinal()] = 3;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f29778c[n0.c.Interrupted.ordinal()] = 4;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f29778c[n0.c.Connected.ordinal()] = 5;
            } catch (NoSuchFieldError unused24) {
            }
            int[] iArr4 = new int[c.EnumC0195c.values().length];
            f29777b = iArr4;
            try {
                iArr4[c.EnumC0195c.PACKET.ordinal()] = 1;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f29777b[c.EnumC0195c.CONNECTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                f29777b[c.EnumC0195c.DISCONNECTED.ordinal()] = 3;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                f29777b[c.EnumC0195c.ERROR.ordinal()] = 4;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                f29777b[c.EnumC0195c.STREAM.ordinal()] = 5;
            } catch (NoSuchFieldError unused29) {
            }
            int[] iArr5 = new int[b.a.values().length];
            f29776a = iArr5;
            try {
                iArr5[b.a.CONNECTION_FAILED.ordinal()] = 1;
            } catch (NoSuchFieldError unused30) {
            }
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!c0.this.n() && c0.this.Y) {
                for (l1 l1Var : u.w().A()) {
                    if ((l1Var instanceof v4.o) && ((v4.o) l1Var).b3()) {
                        c0.this.f29943a.postDelayed(this, 2000L);
                        return;
                    }
                }
                c0.this.v(false);
                c0.this.f29943a.postDelayed(this, 20000L);
            }
        }
    }

    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (c0.this.n()) {
                c0.this.f29943a.removeCallbacks(this);
                c0.this.f29943a.postDelayed(this, 60000L);
                c0.this.x2(w.BATTERY_VOLTAGE);
            }
        }
    }

    class d extends Handler {
        d(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (c0.this.f29757h0 != null) {
                c0.this.f29757h0.dispatchMessage(message);
            }
            int i10 = a.f29777b[c.EnumC0195c.d(message.what).ordinal()];
            if (i10 == 1) {
                c0.this.h2(message);
                return;
            }
            if (i10 == 2) {
                c0.this.Q.N();
                return;
            }
            if (i10 != 3) {
                if (i10 != 4) {
                    return;
                }
                if (a.f29776a[((g3.b) message.obj).c().ordinal()] != 1) {
                    return;
                }
                c0.this.e1(n0.c.ConnectionFailed);
                return;
            }
            c0.this.e1(n0.c.Interrupted);
            c0 c0Var = c0.this;
            if (c0Var.Y) {
                c0Var.f29943a.removeCallbacks(c0Var.f29753d0);
                c0 c0Var2 = c0.this;
                c0Var2.f29943a.postDelayed(c0Var2.f29753d0, 2000L);
            }
        }
    }

    class e implements a0.c {
        e() {
        }

        @Override // v4.a0.c
        public void a() {
            c0.this.f29951r.m(l1.e.HAVE_UPDATE_FIRMWARE);
        }

        @Override // v4.a0.c
        public void b() {
            c0.this.h(true);
        }

        @Override // v4.a0.c
        public void c() {
            c0.this.r2();
        }

        @Override // v4.a0.c
        public void d() {
            c0.this.f29951r.m(l1.e.BATTERY_VOLTAGE_CHANGED);
        }
    }

    class f extends e5.a {
        f(Context context, a.f fVar) {
            super(context, fVar);
        }

        @Override // e5.a
        protected void g(a.d dVar, CharSequence charSequence) {
            super.g(dVar, charSequence);
            c0.this.f29763n0 = null;
            c0.this.A0 = f();
        }

        @Override // e5.a
        protected void h(a.d dVar, CharSequence charSequence) {
            super.h(dVar, charSequence);
            c0.this.E2(2);
            c0.this.f29763n0 = null;
            Dm.DeviceID deviceIDR1 = c0.this.R1();
            c0.this.M2(((deviceIDR1 != null ? deviceIDR1.toString() : e()) + "\nDRT: " + this.f11441e) + "\nEC: " + dVar.f11456a);
        }

        @Override // e5.a
        protected void k() {
            super.k();
            c0.this.E2(1);
            c0.this.a(v.UNLOCK, new byte[0]);
            c0.this.f29763n0 = null;
        }
    }

    class g implements Runnable {
        g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (c0.this.n()) {
                c0 c0Var = c0.this;
                boolean z10 = c0Var.Y;
                c0Var.h(true);
                Toast.makeText(com.dw.ht.o.d().e(), R.string.set_sync_failed, 1).show();
                c0.this.I2(z10);
            }
        }
    }

    class h implements Runnable {
        h() {
        }

        @Override // java.lang.Runnable
        public void run() {
            s3.b.b("DeviceLink", "sync retry");
            c0.this.O2();
        }
    }

    class i implements Runnable {
        i() {
        }

        @Override // java.lang.Runnable
        public void run() {
            c0 c0Var = c0.this;
            if (c0Var.X == 2) {
                c0Var.h(true);
            }
        }
    }

    class j implements Runnable {
        j() {
        }

        @Override // java.lang.Runnable
        public void run() {
            c0.this.p2();
        }
    }

    public static class k {

        /* JADX INFO: renamed from: a */
        public r f29790a;

        /* JADX INFO: renamed from: b */
        public int f29791b;

        public k(int i10, r rVar) {
            this.f29791b = i10;
            this.f29790a = rVar;
        }
    }

    private class l implements q0 {
        private l() {
        }

        @Override // v4.q0
        public /* synthetic */ byte[] a(int i10) {
            return p0.b(this, i10);
        }

        @Override // v4.q0
        public byte[] b() {
            byte[] bArr = new byte[6];
            a6.v vVar = new a6.v(bArr);
            a6.c cVar = new a6.c(0);
            int i10 = 0;
            while (i10 < 16) {
                if (c0.this.i2(i10)) {
                    cVar.c(i10);
                }
                i10++;
            }
            vVar.n(cVar.b(), 16);
            vVar.p(IIService.i() && com.dw.ht.k0.c());
            vVar.p(false);
            cVar.e(0);
            while (i10 < 30) {
                if (c0.this.i2(i10)) {
                    cVar.c(i10 - 16);
                }
                i10++;
            }
            vVar.n(cVar.b(), 14);
            vVar.p(c0.this.i2(i10 + 1));
            vVar.p(c0.this.i2(i10));
            return bArr;
        }

        /* synthetic */ l(c0 c0Var, b bVar) {
            this();
        }
    }

    private class n extends o {

        /* JADX INFO: renamed from: d */
        private final String f29796d;

        /* JADX INFO: renamed from: e */
        private final r[] f29797e;

        /* JADX INFO: renamed from: f */
        private int f29798f;

        /* JADX INFO: renamed from: g */
        private final int f29799g;

        public n(d5.e eVar, r[] rVarArr, int i10) {
            super(c0.this, null);
            this.f29796d = eVar.n(Main.f5555g);
            this.f29797e = rVarArr;
            this.f29799g = i10;
        }

        @Override // v4.c0.o
        protected p b() {
            if (this.f29798f == c0.this.Q.G()) {
                this.f29798f++;
                byte[] bArr = new byte[11];
                bArr[0] = (byte) this.f29799g;
                a6.w.a(this.f29796d, bArr, 1, 10, "gb2312");
                c0.this.a(v.WRITE_REGION_NAME, bArr);
                s3.b.b("DeviceLink", String.format(Locale.getDefault(), "WRITE_REGION_NAME r(%s) 开始", this.f29796d));
                if (c0.this.T.length > this.f29799g) {
                    c0.this.T[this.f29799g] = this.f29796d;
                }
                return p.Completed;
            }
            if (this.f29798f > c0.this.Q.G()) {
                s3.b.b("DeviceLink", String.format(Locale.getDefault(), "r(%s) 完成", this.f29796d));
                return p.Completed;
            }
            int i10 = this.f29798f;
            r[] rVarArr = this.f29797e;
            r rVarH = i10 >= rVarArr.length ? r.h(null) : rVarArr[i10];
            c0 c0Var = c0.this;
            if (c0Var.B.f29924m == this.f29799g) {
                c0Var.W2(this.f29798f, rVarH);
                c0 c0Var2 = c0.this;
                c0Var2.R[this.f29798f] = rVarH;
                c0Var2.A0();
            }
            byte[] bArrA = rVarH.a(c0.this.Q.H());
            byte[] bArr2 = new byte[bArrA.length + 2];
            bArr2[0] = (byte) this.f29799g;
            bArr2[1] = (byte) this.f29798f;
            d4.a.a(bArr2, 2, bArrA, 0, bArrA.length);
            if (!c0.this.a(v.WRITE_REGION_CH, bArr2)) {
                return p.Error;
            }
            s3.b.b("DeviceLink", String.format(Locale.getDefault(), "WRITE_REGION_CH r(%d),c(%d) %s 开始", Integer.valueOf(this.f29799g), Integer.valueOf(this.f29798f + 1), rVarH.k(c0.this.k2())));
            return p.Working;
        }

        @Override // v4.c0.o
        protected p d() {
            this.f29798f++;
            return p.Working;
        }

        @Override // v4.c0.o
        public void e(v vVar, g3.d dVar) {
            if (vVar != v.WRITE_REGION_CH) {
                return;
            }
            if (dVar.l() != a.b.SUCCESS || dVar.i().length < 3) {
                a();
                s3.b.b("DeviceLink", "SaveRegionTask WRITE_REGION_CH 失败取消");
            } else {
                s3.b.b("DeviceLink", String.format(Locale.getDefault(), "WRITE_REGION_CH r(%d),c(%d) 成功", Integer.valueOf(dVar.d(1)), Integer.valueOf(dVar.d(2) + 1)));
                if (dVar.d(1) != this.f29799g) {
                    return;
                }
                c();
            }
        }
    }

    enum p {
        Inited,
        Working,
        Error,
        Completed
    }

    public enum q {
        SingleCh,
        DoubleCh,
        ChannelScan,
        FreqMode
    }

    c0(long j10) {
        super(j10);
        r[] rVarArr = new r[256];
        this.R = rVarArr;
        this.T = new String[0];
        this.U = new Object();
        this.V = new ArrayList();
        this.W = new a2();
        this.f29753d0 = new b();
        this.f29754e0 = new c();
        this.f29758i0 = new d(Looper.getMainLooper());
        this.f29761l0 = com.dw.ht.j0.i().k(ChannelBond.class);
        this.f29762m0 = new v4.p(this);
        this.f29765p0 = new BitSet(rVarArr.length);
        this.f29766q0 = new BitSet(rVarArr.length);
        this.f29768s0 = new v4.q();
        this.f29774y0 = -1;
        this.C0 = new Object();
        this.D0 = new l(this, null);
        this.E0 = null;
        this.G0 = new g();
        this.H0 = new h();
        this.I0 = new j();
        this.X = o2();
        this.Q = new v4.n(this.f29944b, new e());
        int i10 = 0;
        while (true) {
            r[] rVarArr2 = this.R;
            if (i10 >= rVarArr2.length) {
                this.f29765p0.set(0, rVarArr2.length);
                this.f29750a0 = this.f29761l0.q().e(com.dw.ht.entitys.a.f5720g, q()).h(com.dw.ht.entitys.a.f5721h).a().p0().f(zb.a.c()).e(new fc.a() { // from class: v4.b0
                    @Override // fc.a
                    public final void Q0(Object obj) {
                        c0.t1(this.f29728a, (List) obj);
                    }
                });
                LinkSettings linkSettingsK = com.dw.ht.j0.k(q());
                this.S = linkSettingsK;
                i1(linkSettingsK.getMonitor());
                return;
            }
            rVarArr2[i10] = new r();
            i10++;
        }
    }

    private void C2() {
        byte[] bArrA = this.D0.a(d().f29640g);
        if (a6.q.d(this.E0, bArrA)) {
            return;
        }
        this.E0 = bArrA;
        a(v.SET_PHONE_STATUS, bArrA);
    }

    private void F1() {
        r rVarO1 = O1();
        int i10 = rVarO1 != null ? rVarO1.f30066b : 0;
        if (i10 == this.B0) {
            return;
        }
        this.B0 = i10;
        if (u.w().x() == this) {
            mi.c.e().m(u.c.CurrentLinkFreqChanged);
        }
    }

    private Object I1(Class cls) {
        for (o oVar : this.V) {
            if (cls.isInstance(oVar)) {
                return oVar;
            }
        }
        return null;
    }

    private void J2(r rVar) {
        if (this.f29773x0 == rVar) {
            return;
        }
        this.f29773x0 = rVar;
        this.f29951r.m(l1.e.RX_CHANEL_CHANGED);
    }

    private void K2(boolean z10) {
        if (this.f29756g0 == z10) {
            return;
        }
        this.f29756g0 = z10;
        A0();
    }

    private n1 L1(int i10) {
        ChannelBond channelBondK1 = K1(i10);
        if (channelBondK1 == null || u4.d0.k(channelBondK1.getNetworkChannelId()) == null) {
            return null;
        }
        return u.w().B(channelBondK1.getNetworkChannelId());
    }

    private void R2() {
        if (this.Q.k() < 83) {
            return;
        }
        byte[] bArr = new byte[4];
        new a6.v(bArr).o(System.currentTimeMillis() / 1000, 32);
        a(v.SET_TIME, bArr);
    }

    public boolean W2(int i10, r rVar) {
        IIChannel iIChannelK;
        g5.d dVarM;
        List list = this.f29752c0;
        if (list == null) {
            return false;
        }
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            ChannelBond channelBond = (ChannelBond) it.next();
            if (channelBond.getDevChannel() == i10) {
                if (channelBond.getSyncRfConfig() && (iIChannelK = u4.d0.k(channelBond.getNetworkChannelId())) != null && (dVarM = iIChannelK.m()) != null && dVarM.e(rVar)) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean i2(int i10) {
        List list = this.f29752c0;
        if (list == null) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((ChannelBond) it.next()).getDevChannel() == i10) {
                return true;
            }
        }
        return false;
    }

    public void p2() {
        if (this.Q.k() < 87) {
            return;
        }
        String[] strArr = this.T;
        for (int i10 = 0; i10 < strArr.length; i10++) {
            if (strArr[i10] == null) {
                a(v.READ_REGION_NAME, (byte) i10);
                return;
            }
        }
    }

    public void r2() {
        int iG = this.Q.G();
        if (iG > Cfg.O().getRegionChannelCount()) {
            Cfg.O().setRegionChannelCount(iG);
        }
        if (this.Q.t(a0.d.BusyChannelLockoutInChannelConfig)) {
            Cfg.O().setShowBCLOInChannelEditor(true);
        }
        this.T = new String[this.Q.i()];
        e1(n0.c.Connected);
        byte b10 = 2;
        if (this.Q.t(a0.d.FreqScanStatusChangedNotification)) {
            J0(x.HT_STATUS_CHANGED, x.FREQ_SCAN_STATUS_CHANGED);
        } else {
            J0(x.HT_STATUS_CHANGED);
        }
        if (!r5.a.q(Main.f5555g)) {
            Y2(true);
        }
        this.f29770u0 = false;
        this.f29765p0.clear();
        this.f29765p0.set(0, this.Q.G());
        if (this.Q.f29640g >= 97) {
            this.f29765p0.set(252);
            this.f29765p0.set(251);
        }
        this.f29766q0.clear(this.Q.G(), this.R.length);
        for (int i10 = 0; i10 < this.Q.G(); i10++) {
            if (this.f29766q0.get(i10)) {
                this.f29765p0.clear(i10);
            }
        }
        Q2();
        if (this.Q.f29640g >= 42) {
            String language = Locale.getDefault().getLanguage();
            if (language.equals(new Locale("en").getLanguage())) {
                b10 = 1;
            } else if (!language.equals(new Locale("zh").getLanguage())) {
                b10 = 0;
            }
            a(v.SET_HL, b10);
        }
        if (this.Q.f29640g >= 43) {
            this.f29775z0 = true;
        }
    }

    public static /* synthetic */ void t1(c0 c0Var, List list) {
        c0Var.getClass();
        ArrayList arrayListA = a6.o.a();
        ArrayList arrayListA2 = a6.o.a();
        HashSet hashSet = new HashSet();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ChannelBond channelBond = (ChannelBond) it.next();
            if (hashSet.add(Integer.valueOf(channelBond.getDevChannel() + (channelBond.getDevRegion() * 10000)))) {
                arrayListA.add(channelBond);
            } else {
                arrayListA2.add(channelBond);
            }
        }
        if (!arrayListA2.isEmpty()) {
            c0Var.f29761l0.u(arrayListA2);
            s3.b.b("DeviceLink", "重复的网络信道绑定");
        }
        c0Var.f29751b0 = arrayListA;
        c0Var.U2();
        c0Var.A0();
    }

    private void w2(g3.d dVar) {
        if (dVar.m() == 2 && n2(dVar)) {
            if (a.f29779d[v.d(dVar.e()).ordinal()] != 1) {
                return;
            }
            byte[] bArrI = dVar.i();
            this.f29953t = w4.c.f31091e.a(bArrI, 1, bArrI.length);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0039 A[Catch: Exception -> 0x002d, TryCatch #0 {Exception -> 0x002d, blocks: (B:29:0x0001, B:31:0x0010, B:33:0x0020, B:40:0x0039, B:38:0x002f, B:41:0x0045, B:44:0x0053, B:45:0x005c), top: B:50:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void y2(byte[] r6, boolean r7) {
        /*
            r5 = this;
            r0 = 1
            v4.q r1 = r5.f29768s0     // Catch: java.lang.Exception -> L2d
            r1.J(r6)     // Catch: java.lang.Exception -> L2d
            r5.f29767r0 = r0     // Catch: java.lang.Exception -> L2d
            com.dw.ht.entitys.LinkSettings r6 = r5.S     // Catch: java.lang.Exception -> L2d
            java.lang.Boolean r6 = r6.getSyncSignalingSettings()     // Catch: java.lang.Exception -> L2d
            if (r6 != 0) goto L45
            v4.q r6 = r5.f29768s0     // Catch: java.lang.Exception -> L2d
            long r1 = r6.E()     // Catch: java.lang.Exception -> L2d
            com.dw.ht.user.b r6 = com.dw.ht.user.b.f6853a     // Catch: java.lang.Exception -> L2d
            long r3 = r6.i()     // Catch: java.lang.Exception -> L2d
            int r6 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r6 != 0) goto L2f
            v4.q r6 = r5.f29768s0     // Catch: java.lang.Exception -> L2d
            long r1 = r6.E()     // Catch: java.lang.Exception -> L2d
            r3 = 0
            int r6 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r6 != 0) goto L39
            goto L2f
        L2d:
            r6 = move-exception
            goto L60
        L2f:
            com.dw.ht.Cfg$Settings r6 = com.dw.ht.Cfg.O()     // Catch: java.lang.Exception -> L2d
            boolean r6 = r6.getSimpleUI()     // Catch: java.lang.Exception -> L2d
            if (r6 == 0) goto L45
        L39:
            com.dw.ht.entitys.LinkSettings r6 = r5.S     // Catch: java.lang.Exception -> L2d
            java.lang.Boolean r1 = java.lang.Boolean.TRUE     // Catch: java.lang.Exception -> L2d
            r6.g(r1)     // Catch: java.lang.Exception -> L2d
            com.dw.ht.entitys.LinkSettings r6 = r5.S     // Catch: java.lang.Exception -> L2d
            com.dw.ht.j0.q(r6)     // Catch: java.lang.Exception -> L2d
        L45:
            com.dw.ht.entitys.LinkSettings r6 = r5.S     // Catch: java.lang.Exception -> L2d
            java.lang.Boolean r6 = r6.getSyncSignalingSettings()     // Catch: java.lang.Exception -> L2d
            boolean r6 = r6.booleanValue()     // Catch: java.lang.Exception -> L2d
            if (r6 != r0) goto L5c
            if (r7 != 0) goto L5c
            com.dw.ht.user.b r6 = com.dw.ht.user.b.f6853a     // Catch: java.lang.Exception -> L2d
            v4.q r6 = r6.b()     // Catch: java.lang.Exception -> L2d
            r5.c1(r6, r0)     // Catch: java.lang.Exception -> L2d
        L5c:
            r5.A0()     // Catch: java.lang.Exception -> L2d
            goto L63
        L60:
            r6.printStackTrace()
        L63:
            r5.f29767r0 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: v4.c0.y2(byte[], boolean):void");
    }

    @Override // v4.l1
    public void A0() {
        super.A0();
        F1();
    }

    public void A2() {
        if (this.W.h()) {
            a(v.WRITE_SETTINGS, this.W.n());
            A0();
        }
    }

    public boolean B2(short[] sArr) {
        if (sArr.length != 5) {
            throw new IllegalArgumentException("消息长度必须是5");
        }
        byte[] bArr = new byte[10];
        t5.b.b(bArr, sArr, 0, 0, 5);
        return s1(bArr, 0, 10, -1L);
    }

    @Override // v4.l1
    protected void C0() {
        int i10 = a.f29778c[this.f29959z.ordinal()];
        if (i10 == 1 || i10 == 2 || i10 == 3 || i10 == 4) {
            this.f29764o0 = false;
            this.W.k(false);
            this.f29765p0.set(0, this.R.length);
            this.Q.B();
            this.f29767r0 = false;
            this.f29769t0 = null;
            this.f29953t = null;
            this.E0 = null;
        }
    }

    public boolean D2() {
        t tVar = this.Z;
        if (tVar != null && tVar.x()) {
            return X0((short) 2, new short[0]);
        }
        return false;
    }

    @Override // v4.l1
    protected void E0(byte[] bArr) {
        super.E0(bArr);
        this.R[254] = X().a();
    }

    protected boolean E1(boolean z10) {
        if (this.X != 2) {
            return true;
        }
        if (!z10) {
            return false;
        }
        M2(null);
        return false;
    }

    protected void E2(int i10) {
        if (this.X == i10) {
            return;
        }
        this.X = i10;
        if (i10 == 2) {
            h(true);
        }
        Cfg.L().c().putInt(this.D + ".rs", this.X).apply();
    }

    public void F2(int i10, r rVar) {
        if (i10 >= this.R.length) {
            return;
        }
        if (rVar == null) {
            rVar = r.h(null);
        }
        if (Cfg.f5490h) {
            rVar.f30076u = true;
        }
        W2(i10, rVar);
        if (this.Q.P()) {
            r.u(rVar);
        }
        if (i10 == 251 || i10 == 252) {
            if (this.Q.t(a0.d.FreqDiffModeInChannelConfig)) {
                rVar.B = true;
            } else {
                rVar.f30065a = rVar.f30066b;
            }
        }
        r rVar2 = this.R[i10];
        if (this.f29765p0.get(i10) || !a6.q.d(rVar, rVar2)) {
            this.R[i10] = rVar;
            s3.b.b("DeviceLink", "NeedWriteChannel setChannel ch" + (i10 + 1));
            this.f29766q0.set(i10);
            A0();
            z2();
        }
    }

    abstract t G1();

    public void G2(d5.a[] aVarArr) {
        S2(aVarArr);
        int i10 = 0;
        while (i10 < this.R.length && i10 < aVarArr.length) {
            d1(i10, aVarArr[i10]);
            i10++;
        }
        while (i10 < this.Q.G()) {
            F2(i10, null);
            i10++;
        }
        U2();
    }

    public ChannelBond H1(long j10, boolean z10) {
        r rVar;
        List<ChannelBond> list = this.f29752c0;
        ChannelBond channelBond = null;
        if (list == null || !n()) {
            return null;
        }
        int iC = this.W.c();
        r rVar2 = this.R[iC];
        if (rVar2 != null && rVar2.w()) {
            for (ChannelBond channelBond2 : list) {
                if (channelBond2.getDevChannel() == iC && channelBond2.getNetworkChannelId() == j10 && (channelBond2.getRouting() || z10)) {
                    return channelBond2;
                }
            }
        }
        for (ChannelBond channelBond3 : list) {
            if (channelBond3.getNetworkChannelId() == j10) {
                if ((channelBond3.getRouting() || z10) && (rVar = this.R[channelBond3.getDevChannel()]) != null && rVar.w()) {
                    return channelBond3;
                }
                if (channelBond == null && this.W.g(channelBond3.getDevChannel(), this.R)) {
                    channelBond = channelBond3;
                }
            }
        }
        return channelBond;
    }

    public void H2(Handler handler) {
        this.f29757h0 = handler;
    }

    public void I2(boolean z10) {
        if (this.Y != z10 && z10) {
            this.f29943a.removeCallbacks(this.f29753d0);
            this.f29943a.postDelayed(this.f29753d0, 2000L);
        }
    }

    public int J1() {
        return this.X;
    }

    public ChannelBond K1(int i10) {
        List<ChannelBond> list;
        if (i10 < 0 || (list = this.f29752c0) == null) {
            return null;
        }
        for (ChannelBond channelBond : list) {
            if (channelBond.getDevChannel() == i10) {
                return channelBond;
            }
        }
        return null;
    }

    @Override // v4.l1
    public void L(boolean z10) {
        K();
        if (i()) {
            return;
        }
        n0.c cVar = this.f29958y;
        n0.c cVar2 = n0.c.Connecting;
        if (cVar == cVar2) {
            return;
        }
        if (!E1(z10)) {
            Z0(n0.c.ConnectionFailed);
            return;
        }
        Z0(cVar2);
        synchronized (this.U) {
            try {
                if (this.Z != null) {
                    this.Z.cancel();
                }
                this.Z = G1();
                if (this.Z != null) {
                    this.Z.start();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void L2(q qVar) {
        if (this.W.h() && qVar != g2()) {
            a2 a2Var = this.W;
            a2Var.f29691f = a2.a.Off;
            a2Var.f29689d = false;
            int iOrdinal = qVar.ordinal();
            if (iOrdinal == 1) {
                this.W.f29691f = a2.a.A;
            } else if (iOrdinal == 2) {
                this.W.f29689d = true;
            }
            a(v.RADIO_SET_MODE, 0);
            A2();
        }
    }

    @Override // v4.l1
    public x4.a M(boolean z10) {
        return new x4.d(z10);
    }

    public r[] M1() {
        return (r[]) Arrays.copyOf(this.R, this.Q.G());
    }

    protected void M2(String str) {
        Main.f5555g.o(this, str);
    }

    public k[] N1() {
        int iG = this.Q.G();
        int i10 = 0;
        k[] kVarArr = new k[(l2() ? 2 : 0) + iG];
        while (i10 < iG) {
            kVarArr[i10] = new k(i10, this.R[i10]);
            i10++;
        }
        if (l2()) {
            kVarArr[i10] = new k(252, this.R[252]);
            kVarArr[i10 + 1] = new k(251, this.R[251]);
        }
        return kVarArr;
    }

    protected void N2() {
        if (n() && this.Q.r()) {
            if (this.f29763n0 == null) {
                this.f29763n0 = new f(Main.f5555g, this);
            }
            this.A0 = null;
            this.f29763n0.p();
        }
    }

    @Override // v4.l1
    public void O(boolean z10) {
        synchronized (this.U) {
            try {
                if (this.Z != null) {
                    this.Z.cancel();
                }
                this.Z = null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        Z0(n0.c.Idle);
    }

    public r O1() {
        return this.R[this.W.c()];
    }

    protected boolean O2() {
        int iNextSetBit;
        if (n() && this.f29770u0) {
            if (!this.W.h()) {
                a(v.READ_SETTINGS, new byte[0]);
                return true;
            }
            if (!this.f29765p0.isEmpty() && (iNextSetBit = this.f29765p0.nextSetBit(0)) >= 0) {
                a(v.READ_RF_CH, (byte) iNextSetBit);
                return true;
            }
            if (!this.f29767r0) {
                a(v.READ_BSS_SETTINGS, 3);
                return true;
            }
            if (this.I == null) {
                a(v.READ_FREQ_RANGE, new byte[0]);
                return true;
            }
            if (this.Q.k() >= 86 && this.f29769t0 == null) {
                a(v.GET_APRS_PATH, new byte[0]);
                return true;
            }
            if (!P2()) {
                return true;
            }
            this.f29770u0 = false;
            R2();
            C2();
            u2();
            if (Cfg.f5490h && !this.Q.P()) {
                for (int i10 = 0; i10 < this.Q.G(); i10++) {
                    r[] rVarArr = this.R;
                    if (i10 >= rVarArr.length) {
                        break;
                    }
                    r rVar = rVarArr[i10];
                    if (rVar != null && rVar.f30065a > 0 && !rVar.f30076u) {
                        rVar.f30076u = true;
                        this.f29766q0.set(i10);
                        s3.b.b("DeviceLink", "NeedWriteChannel by sign changed ch" + (i10 + 1) + " " + rVar);
                    }
                }
            }
            U2();
            z2();
            A0();
            this.f29943a.removeCallbacks(this.I0);
            this.f29943a.postDelayed(this.I0, 1000L);
        }
        return false;
    }

    public String P1() {
        if (!n()) {
            return null;
        }
        y4.b bVarX = X();
        if (bVarX.b() != y4.c.f32399b) {
            return bVarX.a().k(k2());
        }
        int iC = this.W.c();
        if (iC < 0) {
            return null;
        }
        r rVar = this.R[iC];
        ChannelBond channelBondK1 = K1(iC);
        IIChannel iIChannelK = channelBondK1 != null ? u4.d0.k(channelBondK1.getNetworkChannelId()) : null;
        if (rVar == null && iIChannelK == null) {
            return null;
        }
        if (iIChannelK == null) {
            return rVar.k(k2());
        }
        if (rVar == null) {
            return iIChannelK.k();
        }
        return rVar.k(k2()) + " | " + iIChannelK.k();
    }

    protected boolean P2() {
        return true;
    }

    @Override // v4.l1
    public String Q() {
        return TextUtils.isEmpty(this.f29769t0) ? super.Q() : this.f29769t0;
    }

    public r Q1(int i10) {
        r[] rVarArr = this.R;
        if (i10 >= rVarArr.length || i10 < 0) {
            return null;
        }
        return rVarArr[i10];
    }

    public void Q2() {
        if (this.f29770u0) {
            return;
        }
        this.f29770u0 = true;
        v2();
        O2();
    }

    @Override // v4.l1
    public void R0(w5.h hVar, int i10, boolean z10, boolean z11, s sVar) {
        super.R0(hVar, i10, z10, z11, sVar);
        n1 n1VarE2 = e2();
        if (n1VarE2 != null) {
            n1VarE2.R0(hVar, i10, z10, z11, sVar);
        }
    }

    public Dm.DeviceID R1() {
        return this.F0;
    }

    public a.g S1() {
        e5.a aVar = this.f29763n0;
        return aVar != null ? aVar.f() : a.g.IDLE;
    }

    public r[] S2(d5.a[] aVarArr) {
        boolean z10;
        d0 d0Var;
        d0 d0Var2;
        d0();
        ArrayList arrayListA = a6.o.a();
        r[] rVarArr = new r[aVarArr.length];
        int i10 = 0;
        while (true) {
            boolean z11 = true;
            if (i10 >= aVarArr.length) {
                break;
            }
            d5.a aVar = aVarArr[i10];
            if (aVar == null) {
                rVarArr[i10] = r.h(null);
            } else {
                int i11 = aVar.f10574h;
                if (i11 == 0 || (d0Var2 = this.I) == null || d0Var2.m(i11, aVar.f10575r)) {
                    z10 = false;
                } else {
                    aVar.f10574h = 0;
                    z10 = true;
                }
                int i12 = aVar.f10573g;
                if (i12 == 0 || (d0Var = this.J) == null || d0Var.m(i12, aVar.f10576s)) {
                    z11 = z10;
                } else {
                    aVar.f10573g = 0;
                }
                if (z11) {
                    arrayListA.add(Integer.valueOf(i10 + 1));
                }
                r rVarH = r.h(aVar);
                if (this.Q.P()) {
                    r.u(rVarH);
                }
                rVarArr[i10] = rVarH;
            }
            i10++;
        }
        if (!arrayListA.isEmpty()) {
            Main main = Main.f5555g;
            Toast.makeText(main, main.getString(R.string.errChannelFreqRange, TextUtils.join(", ", arrayListA)), 1).show();
        }
        return rVarArr;
    }

    @Override // v4.l1
    public v4.q T() {
        return this.f29767r0 ? this.f29768s0 : super.T();
    }

    public a.g T1() {
        return this.A0;
    }

    public int T2(s sVar) {
        int i10;
        if (sVar == null || !this.Q.v()) {
            return -1;
        }
        int i11 = sVar.f30105a;
        if (i11 < 0) {
            if (s.f30103c.f30105a == i11) {
                i10 = c2().f29706u;
            } else if (s.f30104d.f30105a == i11) {
                if (!k0()) {
                    return -1;
                }
                i10 = c2().f29706u;
            }
            return i10 - 1;
        }
        return i11;
    }

    public g3.c U1() {
        return this.f29944b;
    }

    public void U2() {
        IIChannel iIChannelK;
        g5.d dVarM;
        if (this.f29751b0 == null || this.f29770u0 || !l().d()) {
            return;
        }
        ArrayList arrayListA = a6.o.a();
        for (ChannelBond channelBond : this.f29751b0) {
            if (channelBond.getDevRegion() == -1 || channelBond.getDevRegion() == this.B.f29924m) {
                arrayListA.add(channelBond);
            }
        }
        this.f29752c0 = arrayListA;
        C2();
        if (this.f29765p0.isEmpty()) {
            for (ChannelBond channelBond2 : this.f29752c0) {
                if (channelBond2.getSyncRfConfig() && (iIChannelK = u4.d0.k(channelBond2.getNetworkChannelId())) != null && (dVarM = iIChannelK.m()) != null && dVarM.e(this.R[channelBond2.getDevChannel()])) {
                    this.f29766q0.set(channelBond2.getDevChannel());
                    s3.b.b("DeviceLink", "NeedWriteChannel updateBoundChannelRfCfg for ch" + (channelBond2.getDevChannel() + 1));
                }
            }
            z2();
        }
    }

    @Override // v4.l1
    public d5.a V(int i10) {
        r rVar;
        r[] rVarArr = this.R;
        if (i10 >= rVarArr.length || i10 < 0 || (rVar = rVarArr[i10]) == null) {
            return null;
        }
        return rVar.G();
    }

    public r V1() {
        return this.f29773x0;
    }

    public void V2(long j10, Im.RfChannelFields rfChannelFields) {
        if (this.f29752c0 != null && n()) {
            boolean z10 = false;
            for (ChannelBond channelBond : this.f29752c0) {
                if (channelBond.getNetworkChannelId() == j10 && channelBond.getSyncRfConfig() && this.R[channelBond.getDevChannel()].J(rfChannelFields)) {
                    this.f29766q0.set(channelBond.getDevChannel());
                    s3.b.b("DeviceLink", "NeedWriteChannel updateBoundChannelRfCfg ch" + (channelBond.getDevChannel() + 1));
                    z10 = true;
                }
            }
            z2();
            if (z10) {
                A0();
            }
        }
    }

    public int W1() {
        return this.f29774y0;
    }

    @Override // v4.l1
    public boolean X0(short s10, short... sArr) {
        if (sArr.length > 4) {
            throw new IllegalArgumentException("消息长度必须小于4");
        }
        short[] sArr2 = new short[5];
        int i10 = 0;
        sArr2[0] = s10;
        int length = sArr.length;
        int i11 = 1;
        while (i10 < length) {
            sArr2[i11] = sArr[i10];
            i10++;
            i11++;
        }
        return B2(sArr2);
    }

    public r X1() {
        return this.f29772w0;
    }

    public ArrayList Y1() {
        ArrayList arrayListA = a6.o.a();
        if (this.f29752c0 != null) {
            if (n()) {
                for (ChannelBond channelBond : this.f29752c0) {
                    if (channelBond.getRouting() || this.W.g(channelBond.getDevChannel(), this.R)) {
                        arrayListA.add(Long.valueOf(channelBond.getNetworkChannelId()));
                    }
                }
            } else {
                Iterator it = this.f29752c0.iterator();
                while (it.hasNext()) {
                    arrayListA.add(Long.valueOf(((ChannelBond) it.next()).getNetworkChannelId()));
                }
            }
        }
        return arrayListA;
    }

    public void Y2(boolean z10) {
        if (this.Q.t(a0.d.PositionChangedNotification)) {
            if (z10) {
                J0(x.POSITION_CHANGED);
            } else {
                J(x.POSITION_CHANGED);
            }
        }
    }

    @Override // v4.l1
    public r0 Z() {
        t tVar = this.Z;
        if (tVar != null) {
            return tVar.t();
        }
        return null;
    }

    public String Z1(int i10) {
        String[] strArr = this.T;
        if (i10 >= strArr.length || TextUtils.isEmpty(strArr[i10])) {
            return "" + (i10 + 1) + ". " + Main.f5555g.getString(R.string.region);
        }
        return "" + (i10 + 1) + ". " + this.T[i10];
    }

    @Override // v4.l1, v4.n0, e5.a.f
    public boolean a(v vVar, byte... bArr) {
        if (a.f29779d[vVar.ordinal()] == 10) {
            this.f29769t0 = new String(bArr, 0, bArr.length, w5.a.f31149x);
        }
        return super.a(vVar, bArr);
    }

    public n1 a2() {
        if (n()) {
            return L1(b2());
        }
        v(false);
        return null;
    }

    @Override // v4.l1
    public y1 b0() {
        return this.f29762m0;
    }

    public int b2() {
        if (!n()) {
            return -1;
        }
        k0 k0Var = this.B;
        if (k0Var.f29915d) {
            return k0Var.f29919h;
        }
        if (g2().ordinal() != 0) {
            return -1;
        }
        return this.B.f29919h;
    }

    @Override // v4.l1
    public int c0() {
        r rVar = this.f29773x0;
        if (rVar == null) {
            return 0;
        }
        return rVar.f30066b;
    }

    @Override // v4.l1
    public void c1(v4.q qVar, boolean z10) {
        if (this.f29767r0) {
            v4.q qVarG = qVar.g();
            qVarG.e(this.f29768s0);
            if (z10) {
                qVarG.f(this.f29768s0);
            }
            byte[] bArrN = qVarG.n();
            if (Arrays.equals(this.f29768s0.n(), bArrN)) {
                return;
            }
            this.f29768s0.J(bArrN);
            super.c1(qVarG, z10);
        }
    }

    public a2 c2() {
        return this.W;
    }

    @Override // v4.l1, v4.n0, e5.a.f
    public a0 d() {
        return this.Q;
    }

    @Override // v4.l1
    public void d1(int i10, d5.a aVar) {
        RegionBind regionBindH;
        d5.e eVarP;
        F2(i10, r.h(aVar));
        if (aVar == null || (regionBindH = com.dw.ht.j0.h(q(), this.B.f29924m)) == null || regionBindH.getRegionID() < 0 || (eVarP = d5.e.p(regionBindH.getRegionID())) == null || !eVarP.v(i10, aVar.b())) {
            return;
        }
        eVarP.u();
    }

    public r d2(int i10) {
        if (i10 < 0) {
            i10 = f2(false);
        }
        if (i10 < 0) {
            return null;
        }
        r[] rVarArr = this.R;
        if (i10 >= rVarArr.length) {
            return null;
        }
        return rVarArr[i10];
    }

    @Override // e5.a.f
    public void e(Dm.DeviceID deviceID) {
        this.F0 = deviceID;
    }

    @Override // v4.l1
    protected boolean e1(n0.c cVar) {
        boolean zE1 = super.e1(cVar);
        if (!zE1) {
            return zE1;
        }
        synchronized (this.C0) {
            try {
                if (a.f29778c[cVar.ordinal()] != 5) {
                    mi.c.e().t(this);
                } else {
                    mi.c.e().q(this);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zE1;
    }

    public n1 e2() {
        if (n()) {
            return L1(f2(false));
        }
        v(false);
        return null;
    }

    @Override // v4.l1
    public CharSequence f0() {
        Main main = Main.f5555g;
        if (n() && !this.B.f29912a) {
            return main.getString(R.string.shutdown);
        }
        String strP1 = P1();
        if (strP1 == null) {
            return (n() && i()) ? main.getString(R.string.connected) : i() ? main.getString(R.string.voiceChannelIsConnected) : n() ? main.getString(R.string.dataChannelIsConnected) : main.getString(R.string.disconnected);
        }
        String strD = this.Q.d();
        if (strD == null) {
            return strP1;
        }
        return strP1 + " - " + strD;
    }

    @Override // v4.l1
    public void f1(int i10) {
        if (this.W.h()) {
            if (i10 < 0 || i10 >= this.Q.G()) {
                if (!l2()) {
                    return;
                }
                if (i10 != 251 && i10 != 252) {
                    return;
                }
            }
            if (this.W.j(i10)) {
                A2();
                if (i10 == 251 && this.B.f29918g) {
                    a(v.RADIO_SET_MODE, 0);
                }
            }
        }
    }

    public int f2(boolean z10) {
        if (!n()) {
            return -1;
        }
        k0 k0Var = this.B;
        if (k0Var.f29913b) {
            return k0Var.f29919h;
        }
        if (z10) {
            return -1;
        }
        q qVarG2 = g2();
        int iOrdinal = qVarG2.ordinal();
        if (iOrdinal == 0) {
            return this.W.f29687b;
        }
        if (iOrdinal == 1) {
            a2 a2Var = this.W;
            return a2Var.f29691f == a2.a.A ? a2Var.f29687b : a2Var.f29688c;
        }
        if (iOrdinal == 2) {
            a2 a2Var2 = this.W;
            return a2Var2.f29702q ? this.B.f29919h : a2Var2.f29687b;
        }
        if (iOrdinal == 3) {
            return 254;
        }
        throw new RuntimeException(qVarG2 + ":没有处理");
    }

    @Override // v4.l1
    public Boolean g0() {
        return this.S.getSyncSignalingSettings();
    }

    @Override // v4.l1
    public void g1(a0.e eVar) {
        v4.n nVar = this.Q;
        if (nVar != null) {
            nVar.D(eVar);
        }
    }

    public q g2() {
        if (X().b() != y4.c.f32399b) {
            return q.FreqMode;
        }
        k0 k0Var = this.B;
        return k0Var.f29918g ? q.SingleCh : k0Var.f29916e != a2.a.Off ? q.DoubleCh : k0Var.f29917f ? q.ChannelScan : q.SingleCh;
    }

    @Override // v4.l1, v4.n0
    public void h(boolean z10) {
        this.Y = false;
        this.Q.B();
        super.h(z10);
    }

    @Override // v4.l1
    public boolean h1(a2.a aVar) {
        if (!this.W.h()) {
            return false;
        }
        a2 a2Var = this.W;
        if (a2Var.f29691f == aVar) {
            return false;
        }
        a2Var.f29691f = aVar;
        A2();
        return true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    protected boolean h2(Message message) {
        boolean z10;
        g3.d dVar = (g3.d) message.obj;
        w2(dVar);
        this.Q.K(message);
        t2(dVar);
        int i10 = 0;
        if (dVar.m() != 2) {
            return false;
        }
        if (dVar.f() == v.EVENT_NOTIFICATION.ordinal()) {
            x xVarD = x.d(dVar.d(0));
            switch (a.f29780e[xVarD.ordinal()]) {
                case 1:
                    E0(dVar.i());
                    return true;
                case 2:
                    if (dVar.i().length > 1) {
                        y2(Arrays.copyOfRange(dVar.i(), 1, dVar.i().length), true);
                    }
                    return true;
                case 3:
                    k4.b bVar = this.f29946d.f30096g;
                    if (bVar != null) {
                        AlarmService.l(Main.f5555g, bVar);
                        this.f29946d.f30096g = null;
                    }
                    return true;
                case 4:
                    k0 k0VarA = k0.a(dVar.i(), 1);
                    if (k0VarA != null) {
                        s2(k0VarA);
                    }
                    return true;
                case 5:
                    Location locationA = b2.a(dVar.i(), 1);
                    if (locationA != null) {
                        o5.g.f23195s.d(locationA, null);
                        s3.b.b("DeviceLink", "loc:" + o5.h.p(locationA, -1));
                    }
                    return true;
                case 6:
                    if (this.W.a(dVar.i(), 1, dVar.i().length)) {
                        s3.b.b("DeviceLink", this.W.toString());
                        X2();
                        A0();
                    }
                    return true;
                case 7:
                    byte[] bArrI = dVar.i();
                    if (bArrI == null || bArrI.length < 2) {
                        s3.b.b("DeviceLink", "evnet:" + xVarD + "(无效数据)");
                    } else {
                        int i11 = bArrI[1] & MessagePack.Code.EXT_TIMESTAMP;
                        r rVarJ = r.j(bArrI, 2, bArrI.length, this.Q.H());
                        if (rVarJ != null && this.R.length > i11) {
                            if (i11 == 252) {
                                K2(true);
                            }
                            this.f29765p0.clear(i11);
                            if (a6.q.d(this.R[i11], rVarJ)) {
                                this.f29766q0.clear(i11);
                            } else {
                                this.R[i11] = rVarJ;
                                A0();
                            }
                        }
                    }
                    return true;
                case 8:
                    this.f29946d.g(dVar, c0(), new s(W1()));
                    return true;
                case 9:
                    this.f29762m0.q(dVar);
                    return true;
                default:
                    return true;
            }
        }
        v vVarD = v.d(dVar.e());
        if (a.f29779d[vVarD.ordinal()] == 2) {
            b0().s(dVar);
        }
        String str = "";
        if (dVar.n()) {
            Iterator it = this.V.iterator();
            while (it.hasNext()) {
                ((o) it.next()).e(vVarD, dVar);
            }
            if (dVar.l() == a.b.NOT_SUPPORTED && a.f29779d[vVarD.ordinal()] == 3 && this.f29769t0 == null) {
                this.f29769t0 = "";
            }
            if (dVar.l() == a.b.INVALID_PARAMETER && a.f29779d[vVarD.ordinal()] == 4) {
                this.f29765p0.clear(251);
                this.f29765p0.clear(252);
                K2(false);
                O2();
            }
        }
        if (!n2(dVar)) {
            return true;
        }
        switch (a.f29779d[vVarD.ordinal()]) {
            case 3:
                byte[] bArrI2 = dVar.i();
                int length = bArrI2.length;
                int i12 = length - 1;
                if (i12 >= 1) {
                    if (bArrI2[i12] == 0) {
                        i12 = length - 2;
                    }
                    if (i12 >= 1) {
                        str = new String(bArrI2, 1, i12, w5.a.f31149x);
                    }
                }
                this.f29769t0 = str;
                O2();
                return true;
            case 4:
                byte[] bArrI3 = dVar.i();
                if (bArrI3 != null && bArrI3.length >= 2) {
                    int i13 = bArrI3[1] & MessagePack.Code.EXT_TIMESTAMP;
                    r rVarJ2 = r.j(bArrI3, 2, bArrI3.length, this.Q.H());
                    if (rVarJ2 != null && this.R.length > i13) {
                        if (i13 == 252) {
                            K2(true);
                        }
                        this.f29765p0.clear(i13);
                        if (a6.q.d(this.R[i13], rVarJ2)) {
                            this.f29766q0.clear(i13);
                            s3.b.b("DeviceLink", "load ch" + (i13 + 1) + " eq=1");
                        } else {
                            s3.b.b("DeviceLink", "load ch" + (i13 + 1) + " eq=0");
                            if (!this.f29766q0.get(i13)) {
                                this.R[i13] = rVarJ2;
                            }
                            A0();
                        }
                        O2();
                    }
                } else {
                    s3.b.b("DeviceLink", "com:" + vVarD + "(无效数据)");
                }
                break;
            case 5:
                E0(dVar.i());
                break;
            case 6:
                if (this.W.a(dVar.i(), 1, dVar.i().length)) {
                    s3.b.b("DeviceLink", this.W.toString());
                    X2();
                    A0();
                    int offset = (((TimeZone.getDefault().getOffset(System.currentTimeMillis()) / CloseCodes.NORMAL_CLOSURE) / 60) / 30) + 24;
                    if (offset >= 0 && offset <= 50) {
                        a2 a2Var = this.W;
                        if (a2Var.f29709x != offset) {
                            a2Var.f29709x = offset;
                            i10 = 1;
                        }
                    }
                    Cfg.Settings settingsO = Cfg.O();
                    if (this.W.f29711z != settingsO.getPttLock()) {
                        this.W.f29711z = settingsO.getPttLock();
                        i10 = 1;
                    }
                    if (this.W.F != settingsO.getImperialUnits()) {
                        this.W.F = settingsO.getImperialUnits();
                        i10 = 1;
                    }
                    if (i10 != 0) {
                        A2();
                    }
                }
                O2();
                break;
            case 7:
                byte[] bArrI4 = dVar.i();
                if (bArrI4 != null && bArrI4.length >= 2) {
                    int i14 = bArrI4[1] & MessagePack.Code.EXT_TIMESTAMP;
                    String[] strArr = this.T;
                    if (i14 < strArr.length) {
                        if (bArrI4.length > 2) {
                            Charset charsetDefaultCharset = Charset.defaultCharset();
                            try {
                                charsetDefaultCharset = Charset.forName("gb2312");
                            } catch (Exception e10) {
                                e10.printStackTrace();
                            }
                            this.T[i14] = new String(bArrI4, 2, bArrI4.length - 2, charsetDefaultCharset).trim();
                        } else {
                            strArr[i14] = "";
                        }
                        p2();
                    }
                } else {
                    s3.b.b("DeviceLink", "com:" + vVarD + "(无效数据)");
                }
                break;
            case 8:
                try {
                    z10 = true;
                    try {
                        y2(Arrays.copyOfRange(dVar.i(), 1, dVar.i().length), false);
                        break;
                    } catch (Exception unused) {
                    }
                } catch (Exception unused2) {
                    z10 = true;
                }
                this.f29767r0 = z10;
                O2();
                return z10;
            case 9:
                a.d dVar2 = a.d.FM;
                d0 d0Var = new d0(dVar2);
                d0 d0Var2 = new d0(dVar2);
                a.d dVar3 = a.d.AM;
                d0 d0Var3 = new d0(dVar3);
                d0 d0Var4 = new d0(dVar3);
                a.d dVar4 = a.d.DMR;
                d0 d0Var5 = new d0(dVar4);
                d0 d0Var6 = new d0(dVar4);
                O2();
                try {
                    a6.v vVar = new a6.v(dVar.i(), 8);
                    int length2 = (dVar.i().length - 1) / 4;
                    if (length2 != 0) {
                        while (i10 < length2) {
                            boolean zC = vVar.c();
                            boolean zC2 = vVar.c();
                            boolean zC3 = vVar.c();
                            int i15 = vVar.i(13) & 1023;
                            boolean zC4 = vVar.c();
                            boolean zC5 = vVar.c();
                            boolean zC6 = vVar.c();
                            int i16 = vVar.i(13) & 1023;
                            if (i15 != i16) {
                                if (!zC2) {
                                    d0Var.b(i15 * 1000000, i16 * 1000000);
                                }
                                if (zC) {
                                    d0Var2.b(i15 * 1000000, i16 * 1000000);
                                }
                                if (zC5) {
                                    d0Var3.b(i15 * 1000000, i16 * 1000000);
                                }
                                if (zC4) {
                                    d0Var4.b(i15 * 1000000, i16 * 1000000);
                                }
                                if (zC6) {
                                    d0Var5.b(i15 * 1000000, i16 * 1000000);
                                }
                                if (zC3) {
                                    d0Var6.b(i15 * 1000000, i16 * 1000000);
                                }
                            }
                            i10++;
                        }
                        if (!d0Var3.l() || !d0Var4.l() || !d0Var5.l() || !d0Var6.l()) {
                            Cfg.Q0(true);
                            this.f29755f0 = true;
                        }
                        d0 d0Var7 = new d0();
                        d0 d0Var8 = new d0();
                        d0Var8.e(d0Var2).e(d0Var4).e(d0Var6);
                        d0Var7.e(d0Var).e(d0Var3).e(d0Var5);
                        this.I = d0Var7;
                        this.J = d0Var8;
                    }
                } catch (Exception unused3) {
                }
                break;
            default:
                return false;
        }
        return true;
    }

    @Override // v4.l1, v4.n0
    public boolean i() {
        if (this.Z == null) {
            return false;
        }
        return this.f29958y.d();
    }

    @Override // v4.l1
    public long i0() {
        if (this.W.h()) {
            return this.W.f();
        }
        return 0L;
    }

    @Override // v4.l1
    public void i1(boolean z10) {
        super.i1(z10);
        if (this.S.getMonitor() == z10) {
            return;
        }
        this.S.f(z10);
        com.dw.ht.j0.q(this.S);
    }

    @Override // v4.l1
    public boolean j0() {
        return this.B.f29915d;
    }

    @Override // v4.l1
    public boolean j1(long j10, int i10) {
        if (l() != n0.c.Connected) {
            return false;
        }
        if (this.Q.f29644k < 2) {
            d5.e eVarP = d5.e.p(j10);
            if (eVarP == null) {
                return false;
            }
            com.dw.ht.j0.v(q(), 0, -1L);
            G2(eVarP.m(false));
            z2();
            com.dw.ht.j0.v(q(), 0, j10);
            return true;
        }
        int i11 = this.B.f29924m;
        if (i11 < 0) {
            return false;
        }
        if (i10 < 0) {
            i10 = i11;
        }
        d5.e eVarP2 = d5.e.p(j10);
        if (eVarP2 == null) {
            return false;
        }
        r[] rVarArrS2 = S2(eVarP2.m(false));
        com.dw.ht.j0.v(q(), i10, j10);
        new n(eVarP2, rVarArrS2, i10).h();
        return true;
    }

    public boolean j2() {
        return this.f29765p0.isEmpty();
    }

    public boolean k2() {
        return this.f29755f0 || this.Q.u();
    }

    @Override // v4.l1
    public void l1(Boolean bool) {
        if (a6.q.d(g0(), bool)) {
            return;
        }
        this.S.g(bool);
        com.dw.ht.j0.q(this.S);
        if (bool.booleanValue()) {
            c1(com.dw.ht.user.b.f6853a.b(), true);
        }
    }

    public boolean l2() {
        return this.f29756g0;
    }

    public boolean m2() {
        return this.X == 2;
    }

    @Override // v4.l1
    public boolean n0() {
        return !this.W.K;
    }

    @Override // v4.l1
    public boolean n1(v4.l lVar, boolean z10) {
        n1 n1VarE2;
        boolean zN1 = super.n1(lVar, z10);
        if (zN1 && !z10 && (n1VarE2 = e2()) != null) {
            lVar.z(n1VarE2, -1);
        }
        return zN1;
    }

    protected boolean n2(g3.d dVar) {
        return dVar.n() && dVar.l() == a.b.SUCCESS;
    }

    protected int o2() {
        return Cfg.L().d(q() + ".rs", 0);
    }

    @mi.m(threadMode = ThreadMode.MAIN_ORDERED)
    public void onMessageEvent(IIService.b bVar) {
        if (bVar == IIService.b.f6316a) {
            C2();
        }
    }

    @Override // v4.l1
    public boolean q1(int i10, long j10) {
        t tVar = this.Z;
        if (tVar == null) {
            return false;
        }
        return tVar.z(i10, j10);
    }

    void q2(t tVar) {
        synchronized (this.U) {
            try {
                if (this.Z == tVar) {
                    this.Z = null;
                    v4.l lVar = this.A;
                    if (lVar != null) {
                        n0.c cVar = n0.c.Interrupted;
                        l1.h hVar = l1.h.LinkInterrupted;
                        a1(cVar, hVar);
                        lVar.x(hVar);
                    } else {
                        Z0(n0.c.Interrupted);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // v4.l1
    public boolean s0() {
        return this.B.c();
    }

    @Override // v4.l1
    public boolean s1(byte[] bArr, int i10, int i11, long j10) {
        t tVar = this.Z;
        if (tVar == null) {
            return false;
        }
        return tVar.A(bArr, i10, i11);
    }

    protected void s2(k0 k0Var) {
        k0 k0Var2 = this.B;
        this.B = k0Var;
        a2 a2Var = this.W;
        a2.a aVar = a2Var.f29691f;
        a2.a aVar2 = k0Var.f29916e;
        if (aVar != aVar2 || a2Var.f29689d != k0Var.f29917f) {
            a2Var.f29691f = aVar2;
            a2Var.f29689d = k0Var.f29917f;
            A0();
        }
        if (!k0Var2.c() && k0Var.c()) {
            b0().r();
        }
        if (k0Var2.f29913b && !k0Var.f29913b) {
            this.f29759j0 = SystemClock.elapsedRealtime();
            this.f29760k0 = this.B.f29919h;
        }
        if (k0Var2.f29915d && !k0Var.f29915d) {
            this.f29771v0 = SystemClock.elapsedRealtime();
            this.f29951r.m(l1.e.RX_STOP);
        }
        if (Cfg.f5476a) {
            s3.b.b("DeviceLink", k0Var.toString());
        }
        if (k0Var.f29914c) {
            int i10 = k0Var.f29919h;
            this.f29774y0 = i10;
            J2(Q1(i10));
        }
        if (k0Var.f29913b) {
            this.f29772w0 = Q1(k0Var.f29919h);
        }
        if (this.f29775z0) {
            this.f29775z0 = false;
            if (!k0Var.f29921j || this.Q.k() >= 48) {
                L(false);
            }
        }
        int i11 = k0Var.f29924m;
        int i12 = k0Var2.f29924m;
        if (i11 != i12 && i12 >= 0) {
            this.f29765p0.set(0, this.Q.G());
            this.f29766q0.clear();
            Q2();
        }
        Iterator it = this.f29945c.iterator();
        while (it.hasNext()) {
            ((n0.d) it.next()).j0(this, k0Var2, k0Var);
        }
        if (!k0Var2.f29913b && k0Var.f29913b) {
            this.f29762m0.w();
            if (T().r()) {
                mi.c.e().m(LocationShareService.b.SingleUpdate);
            }
        }
        if (!k0Var2.f29915d && k0Var.f29915d) {
            this.f29951r.m(l1.e.RX_START);
        }
        B0();
    }

    @Override // e5.a.f
    public boolean t(int i10) {
        if (!this.f29944b.F()) {
            return false;
        }
        this.f29944b.K(10, 1825, new byte[]{(byte) (i10 >>> 8), (byte) i10});
        return true;
    }

    protected void t2(g3.d dVar) {
        e5.a aVar = this.f29763n0;
        if (aVar != null) {
            aVar.i(dVar);
        }
        Iterator it = this.f29945c.iterator();
        while (it.hasNext()) {
            ((n0.d) it.next()).M(this, dVar);
        }
    }

    @Override // v4.l1
    public boolean u0(boolean z10, s sVar) {
        Main main = Main.f5555g;
        r rVarD2 = d2(T2(sVar));
        if (rVarD2 == null) {
            return true;
        }
        if (!rVarD2.w()) {
            if (z10) {
                Toast.makeText(main, R.string.channel_not_allowed_tx, 1).show();
            }
            return false;
        }
        if (this.Q.P() && !rVarD2.f30076u) {
            if (z10) {
                Toast.makeText(main, R.string.sing_not_allowed_on_channel, 1).show();
            }
            return false;
        }
        if (!this.Q.P() || SystemClock.elapsedRealtime() - b0().n() >= 30000) {
            return true;
        }
        if (z10) {
            Toast.makeText(main, R.string.send_interval_too_short, 1).show();
        }
        return false;
    }

    protected void u2() {
        this.f29764o0 = true;
        this.f29951r.m(l1.e.SETTINGS_SYNCING_COMPLETE);
        this.f29943a.removeCallbacks(this.G0);
        int i10 = this.X;
        if (i10 == 0) {
            N2();
        } else if (i10 == 2) {
            if (this instanceof g2) {
                this.f29943a.postDelayed(new i(), 60000L);
            } else {
                h(true);
            }
            M2(null);
        }
        this.f29943a.postDelayed(this.f29754e0, 1000L);
        I0(this.O, 3000L);
    }

    @Override // v4.l1
    public boolean v0() {
        return n() && this.f29764o0;
    }

    protected void v2() {
        this.f29943a.removeCallbacks(this.G0);
        this.f29943a.postDelayed(this.G0, 30000L);
    }

    @Override // v4.l1
    public boolean x0() {
        return this.B.f29912a;
    }

    public boolean x2(w wVar) {
        int iOrdinal = wVar.ordinal();
        return a(v.READ_STATUS, (byte) (iOrdinal >> 8), (byte) iOrdinal);
    }

    @Override // e5.a.f
    public void y() {
        E2(0);
        v(false);
        N2();
    }

    public void z2() {
        if (this.f29765p0.isEmpty() && !this.f29766q0.isEmpty()) {
            m mVar = (m) I1(m.class);
            if (mVar != null) {
                mVar.i();
            } else {
                new m(this, null).h();
            }
        }
    }

    private class m extends o {

        /* JADX INFO: renamed from: d */
        private int f29793d;

        /* JADX INFO: renamed from: e */
        private boolean f29794e;

        private m() {
            super(c0.this, null);
            this.f29794e = false;
        }

        @Override // v4.c0.o
        protected p b() {
            while (true) {
                int i10 = this.f29793d;
                c0 c0Var = c0.this;
                if (i10 >= c0Var.R.length || c0Var.f29766q0.isEmpty()) {
                    break;
                }
                c0 c0Var2 = c0.this;
                r rVar = c0Var2.R[this.f29793d];
                byte[] bArrA = rVar.a(c0Var2.Q.H());
                if (c0.this.f29766q0.get(this.f29793d)) {
                    byte[] bArr = new byte[bArrA.length + 1];
                    bArr[0] = (byte) this.f29793d;
                    d4.a.a(bArr, 1, bArrA, 0, bArrA.length);
                    if (!c0.this.a(v.WRITE_RF_CH, bArr)) {
                        return p.Error;
                    }
                    this.f29794e = true;
                    c0.this.f29766q0.clear(this.f29793d);
                    s3.b.b("DeviceLink", "Write CH" + (this.f29793d + 1) + " " + rVar);
                    return p.Working;
                }
                this.f29793d++;
            }
            if (this.f29794e) {
                this.f29794e = false;
                c0.this.a(v.STORE_SETTINGS, new byte[0]);
            }
            return p.Completed;
        }

        @Override // v4.c0.o
        protected p d() {
            this.f29793d++;
            return p.Working;
        }

        @Override // v4.c0.o
        public void e(v vVar, g3.d dVar) {
            if (vVar != v.WRITE_RF_CH) {
                return;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Write CH");
            sb2.append(this.f29793d + 1);
            sb2.append(" SUCCESS=");
            a.b bVarL = dVar.l();
            a.b bVar = a.b.SUCCESS;
            sb2.append(bVarL == bVar);
            s3.b.b("DeviceLink", sb2.toString());
            if (dVar.l() == bVar) {
                c();
            } else {
                g();
            }
        }

        public void i() {
            this.f29793d = 0;
        }

        /* synthetic */ m(c0 c0Var, b bVar) {
            this();
        }
    }

    private abstract class o {

        /* JADX INFO: renamed from: a */
        p f29801a;

        /* JADX INFO: renamed from: b */
        private Runnable f29802b;

        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                o.this.g();
            }
        }

        private o() {
            this.f29801a = p.Inited;
            this.f29802b = new a();
        }

        private void f() {
            c0.this.f29943a.removeCallbacks(this.f29802b);
            c0.this.f29943a.postDelayed(this.f29802b, 1000L);
        }

        public void a() {
            c0.this.V.remove(this);
        }

        protected abstract p b();

        public void c() {
            p pVarD = d();
            this.f29801a = pVarD;
            if (pVarD.ordinal() != 1) {
                c0.this.V.remove(this);
            } else {
                this.f29801a = b();
                f();
            }
        }

        protected abstract p d();

        public abstract void e(v vVar, g3.d dVar);

        public void g() {
            p pVarB = b();
            this.f29801a = pVarB;
            if (pVarB.ordinal() != 1) {
                c0.this.V.remove(this);
            } else {
                f();
            }
        }

        public void h() {
            if (this.f29801a != p.Inited) {
                throw new RuntimeException();
            }
            g();
            if (this.f29801a == p.Working) {
                c0.this.V.add(this);
            }
        }

        /* synthetic */ o(c0 c0Var, b bVar) {
            this();
        }
    }

    @mi.m(threadMode = ThreadMode.MAIN_ORDERED)
    public void onMessageEvent(k0.c cVar) {
        if (cVar == k0.c.NetworkStatusChanged) {
            C2();
        }
    }

    private void X2() {
    }
}
