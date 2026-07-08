package v4;

import android.content.Context;
import android.util.Log;
import com.benshikj.ht.rpc.Dm;
import com.dw.ht.Main;
import java.util.HashMap;
import java.util.Locale;
import v4.a0;

/* JADX INFO: loaded from: classes.dex */
public class a0 {

    /* JADX INFO: renamed from: n */
    public static final HashMap f29632n = new HashMap();

    /* JADX INFO: renamed from: o */
    public static final HashMap f29633o = new HashMap();

    /* JADX INFO: renamed from: d */
    protected boolean f29637d;

    /* JADX INFO: renamed from: e */
    private e f29638e;

    /* JADX INFO: renamed from: m */
    private final c f29646m;

    /* JADX INFO: renamed from: a */
    protected int f29634a = -1;

    /* JADX INFO: renamed from: b */
    protected int f29635b = -1;

    /* JADX INFO: renamed from: c */
    protected int f29636c = -1;

    /* JADX INFO: renamed from: f */
    protected int f29639f = -1;

    /* JADX INFO: renamed from: g */
    protected int f29640g = -1;

    /* JADX INFO: renamed from: h */
    public int f29641h = -1;

    /* JADX INFO: renamed from: i */
    protected int f29642i = -1;

    /* JADX INFO: renamed from: j */
    protected int f29643j = -1;

    /* JADX INFO: renamed from: k */
    protected int f29644k = -1;

    /* JADX INFO: renamed from: l */
    protected int f29645l = 3;

    class a implements io.grpc.stub.j {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ boolean f29647a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ io.grpc.stub.j f29648b;

        a(boolean z10, io.grpc.stub.j jVar) {
            this.f29647a = z10;
            this.f29648b = jVar;
        }

        public static /* synthetic */ void a(a aVar, Dm.CheckFirmwareUpdateResult checkFirmwareUpdateResult, boolean z10, io.grpc.stub.j jVar, Boolean bool) {
            m2 m2VarM;
            aVar.getClass();
            Log.d("DevInformation", "update info: " + checkFirmwareUpdateResult);
            if (!checkFirmwareUpdateResult.hasFirmware() || checkFirmwareUpdateResult.getFirmware().getUrl().isEmpty()) {
                if (!z10) {
                    a0.f29632n.remove(Integer.valueOf(a0.this.f29642i));
                    Log.d("DevInformation", "remove cache update info for " + a0.this.g());
                }
                m2VarM = a0.this.m();
            } else {
                m2VarM = new m2(a0.this.f29642i, checkFirmwareUpdateResult, z10);
            }
            if (!z10) {
                a0.f29632n.put(Integer.valueOf(a0.this.f29642i), m2VarM);
                Log.d("DevInformation", "cache update info for " + a0.this.g());
            }
            HashMap map = a0.f29633o;
            Integer num = (Integer) map.get(Integer.valueOf(a0.this.f29642i));
            if (num == null || num.intValue() > a0.this.f29640g) {
                map.put(Integer.valueOf(a0.this.f29642i), Integer.valueOf(a0.this.f29640g));
            }
            jVar.onNext(m2VarM);
        }

        @Override // io.grpc.stub.j
        /* JADX INFO: renamed from: b */
        public void onNext(final Dm.CheckFirmwareUpdateResult checkFirmwareUpdateResult) {
            hc.g gVarE = hc.g.c(Boolean.TRUE).e(jc.a.a());
            final boolean z10 = this.f29647a;
            final io.grpc.stub.j jVar = this.f29648b;
            gVarE.h(new mc.c() { // from class: v4.z
                @Override // mc.c
                public final void accept(Object obj) {
                    a0.a.a(this.f30289a, checkFirmwareUpdateResult, z10, jVar, (Boolean) obj);
                }
            });
        }

        @Override // io.grpc.stub.j
        public void onCompleted() {
            this.f29648b.onCompleted();
        }

        @Override // io.grpc.stub.j
        public void onError(Throwable th2) {
            this.f29648b.onError(th2);
        }
    }

    public interface c {
        void a();

        void b();

        void c();

        void d();
    }

    public enum d {
        GroupID(113, true),
        DO_PROG_FUNC(73),
        FreqDiffModeInChannelConfig(98),
        PositionChangedNotification(131),
        BusyChannelLockoutInChannelConfig(130),
        MicEConfig(135),
        MicEMessageTypeConfig(136),
        SatelliteMode(137),
        SendIDByAprs(138),
        CustomLocation(139),
        SatelliteInfo(141),
        GPWPLUpload(142),
        FreqScanStatusChangedNotification(143),
        BatchNotificationRegistration(143),
        ReverseFrequency(145),
        SmartBeaconMaxInterval(146),
        Last(0);


        /* JADX INFO: renamed from: a */
        public final int f29666a;

        /* JADX INFO: renamed from: b */
        public final boolean f29667b;

        d(int i10) {
            this(i10, false);
        }

        public boolean d(a0 a0Var) {
            return (!this.f29667b || a0Var.u()) && this.f29666a <= a0Var.k();
        }

        d(int i10, boolean z10) {
            this.f29666a = i10;
            this.f29667b = z10;
        }
    }

    public interface e {
        void w(a0 a0Var, int i10, int i11);
    }

    public enum f {
        UNKNOWN(0),
        AP1(1),
        AP2(2),
        AP3(3),
        AP6(6),
        AP8(8),
        VR_N7600(263),
        VR_N7100(264),
        UV_50PRO(265),
        AP2H2(4098),
        AP3H2(4099),
        BE1(513),
        BE2(514),
        BE3(515),
        BE79(516);


        /* JADX INFO: renamed from: a */
        private int f29684a;

        f(int i10) {
            this.f29684a = i10;
        }

        public static f e(int i10) {
            for (f fVar : values()) {
                if (fVar.f29684a == i10) {
                    return fVar;
                }
            }
            return UNKNOWN;
        }

        public boolean d() {
            int iOrdinal = ordinal();
            return iOrdinal == 6 || iOrdinal == 7 || iOrdinal == 8;
        }
    }

    public a0(c cVar) {
        this.f29646m = cVar;
        B();
    }

    public static String E(int i10) {
        if (i10 < 0) {
            return "Unknown";
        }
        return ((i10 >>> 8) & 255) + "." + ((i10 >>> 4) & 15) + "." + (i10 & 15);
    }

    private void p() {
        m2 m2Var = (m2) f29632n.get(Integer.valueOf(this.f29642i));
        if (m2Var != null) {
            c cVar = this.f29646m;
            if (cVar != null && !m2Var.i(k())) {
                cVar.a();
                return;
            }
            Integer num = (Integer) f29633o.get(Integer.valueOf(this.f29642i));
            if (num != null && num.intValue() <= this.f29640g) {
                return;
            }
        }
        x(Main.f5555g, false, 0, com.dw.ht.user.b.f6853a.i(), new b());
    }

    protected void A() {
        p();
        c cVar = this.f29646m;
        if (cVar != null) {
            cVar.c();
        }
    }

    public void B() {
        this.f29634a = -1;
        this.f29635b = -1;
        this.f29641h = -1;
        this.f29639f = -1;
        this.f29640g = -1;
        this.f29642i = -1;
        this.f29644k = -1;
    }

    public void C(int i10) {
        if (i10 == this.f29641h) {
            return;
        }
        this.f29641h = i10;
        c cVar = this.f29646m;
        if (cVar != null) {
            cVar.d();
        }
    }

    public void D(e eVar) {
        this.f29638e = eVar;
    }

    public int c() {
        int i10 = this.f29636c;
        if (i10 >= 0) {
            return i10;
        }
        int i11 = this.f29635b;
        return i11 < 0 ? i11 : (i11 * 100) / 5;
    }

    public String d() {
        int i10 = this.f29641h;
        if (i10 > 0) {
            return String.format(Locale.ENGLISH, "%.1fV", Float.valueOf(i10 / 1000.0f));
        }
        return null;
    }

    public String e() {
        int i10 = this.f29643j;
        if (i10 == 255) {
            return null;
        }
        if (i10 <= 0) {
            return "http://go.benshikj.com/contact_us";
        }
        return "http://go.benshikj.com/contact_us:vid:" + this.f29643j;
    }

    public int f() {
        int i10 = this.f29645l;
        if (i10 > 0) {
            return i10;
        }
        return 3;
    }

    public f g() {
        return f.e(this.f29642i);
    }

    public int h() {
        return this.f29642i;
    }

    public int i() {
        int i10 = this.f29644k;
        if (i10 > 0) {
            return i10;
        }
        return 1;
    }

    public int j() {
        return this.f29634a;
    }

    public int k() {
        return this.f29640g;
    }

    public String l() {
        return E(this.f29640g);
    }

    public m2 m() {
        m2 m2Var = (m2) f29632n.get(Integer.valueOf(this.f29642i));
        return m2Var != null ? m2Var : new m2(this.f29642i);
    }

    public String n() {
        int i10 = this.f29643j;
        if (i10 == 255) {
            return null;
        }
        if (i10 <= 0) {
            return "http://go.benshikj.com/user_manual";
        }
        return "http://go.benshikj.com/user_manual:vid:" + this.f29643j;
    }

    public int o() {
        return this.f29643j;
    }

    public boolean q() {
        return this.f29637d;
    }

    public boolean r() {
        return s();
    }

    public boolean s() {
        return k() >= 0;
    }

    public boolean t(d dVar) {
        return dVar.d(this);
    }

    public boolean u() {
        return false;
    }

    public boolean v() {
        return k() >= 86;
    }

    public boolean w() {
        return false;
    }

    public void x(Context context, boolean z10, int i10, long j10, io.grpc.stub.j jVar) {
        if (k() <= 0) {
            jVar.onError(new Exception());
            return;
        }
        Log.d("DevInformation", "start load update info for " + g());
        f5.d.f12792a.a().checkFirmwareUpdate(Dm.CheckFirmwareUpdateRequest.newBuilder().setBeta(z10).setProductId(this.f29642i).setUserId(j10).setInviteCode(i10).setFirmwareVersion(k()).build(), new a(z10, jVar));
    }

    protected void y(g3.d dVar) {
        e eVar = this.f29638e;
        if (eVar != null) {
            eVar.w(this, dVar.m(), dVar.e());
        }
    }

    protected void z() {
        c cVar = this.f29646m;
        if (cVar == null) {
            return;
        }
        cVar.b();
    }

    class b implements io.grpc.stub.j {
        b() {
        }

        @Override // io.grpc.stub.j
        /* JADX INFO: renamed from: a */
        public void onNext(m2 m2Var) {
            c cVar;
            if (m2Var == null || (cVar = a0.this.f29646m) == null || m2Var.i(a0.this.k())) {
                return;
            }
            cVar.a();
        }

        @Override // io.grpc.stub.j
        public void onCompleted() {
        }

        @Override // io.grpc.stub.j
        public void onError(Throwable th2) {
        }
    }

    public void b() {
    }
}
