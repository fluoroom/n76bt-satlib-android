package v4;

import android.os.Message;
import com.dw.ht.Cfg;
import g3.a;
import v4.a0;

/* JADX INFO: loaded from: classes.dex */
public class n extends a0 {
    private boolean A;
    private boolean B;
    private boolean C;
    private boolean D;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final y1.k f30013p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int[] f30014q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f30015r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f30016s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f30017t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f30018u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f30019v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f30020w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private int f30021x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private boolean f30022y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private boolean f30023z;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f30024a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f30025b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final /* synthetic */ int[] f30026c;

        static {
            int[] iArr = new int[a.EnumC0194a.values().length];
            f30026c = iArr;
            try {
                iArr[a.EnumC0194a.CHARGER_CONNECTION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            int[] iArr2 = new int[v.values().length];
            f30025b = iArr2;
            try {
                iArr2[v.GET_DEV_INFO.ordinal()] = 1;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f30025b[v.READ_STATUS.ordinal()] = 2;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr3 = new int[w.values().length];
            f30024a = iArr3;
            try {
                iArr3[w.BATTERY_LEVEL.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f30024a[w.BATTERY_LEVEL_AS_PERCENTAGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f30024a[w.BATTERY_VOLTAGE.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public n(y1.k kVar, a0.c cVar) {
        super(cVar);
        this.f30015r = true;
        this.f30013p = kVar;
    }

    private boolean F(g3.d dVar) {
        return dVar.n() && dVar.l() == a.b.SUCCESS;
    }

    private void I(g3.d dVar) {
        v vVarD = v.d(dVar.e());
        if (!F(dVar)) {
            if (vVarD == v.GET_DEV_INFO) {
                z();
                return;
            }
            return;
        }
        int i10 = a.f30025b[vVarD.ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                return;
            }
            int i11 = a.f30024a[w.d(dVar.j()).ordinal()];
            if (i11 == 1) {
                int iD = dVar.d(3);
                if (this.f29635b != iD) {
                    this.f29635b = iD;
                    y(dVar);
                    return;
                }
                return;
            }
            if (i11 != 2) {
                if (i11 != 3) {
                    return;
                }
                C(dVar.k(3));
                return;
            } else {
                int iD2 = dVar.d(3);
                if (this.f29636c != iD2) {
                    this.f29636c = iD2;
                    y(dVar);
                    return;
                }
                return;
            }
        }
        if (dVar.i().length == 5) {
            a6.v vVar = new a6.v(dVar.i(), 8);
            this.f29642i = vVar.i(8);
            this.f29639f = vVar.i(8);
            this.f29640g = vVar.i(16);
        } else if (dVar.i().length >= 9) {
            a6.v vVar2 = new a6.v(dVar.i(), 8);
            try {
                this.f29643j = vVar2.i(8);
                this.f29642i = vVar2.i(16);
                this.f29639f = vVar2.i(8);
                this.f29640g = vVar2.i(16);
                this.f30015r = vVar2.c();
                this.f30016s = vVar2.c();
                this.f30018u = vVar2.c();
                this.f30017t = vVar2.c();
                this.f30019v = vVar2.c();
                this.f30020w = vVar2.c();
                this.f29644k = vVar2.i(6);
                this.f30022y = vVar2.c();
                this.f30023z = vVar2.c();
                this.A = vVar2.c();
                this.B = vVar2.c();
                this.f30021x = vVar2.i(8);
                this.f29645l = vVar2.i(4);
                this.C = vVar2.c();
                this.D = vVar2.c();
                if (this.B) {
                    Cfg.Q0(true);
                }
            } catch (Exception unused) {
            }
        }
        s3.b.b("DevInformation", toString());
        A();
        y(dVar);
    }

    private void J(g3.d dVar) {
        if (a.f30026c[dVar.g().ordinal()] != 1) {
            return;
        }
        this.f29637d = dVar.i()[1] == 1;
    }

    private void U(g3.d dVar) {
        this.f30014q = new int[]{dVar.d(1), dVar.d(2), dVar.d(3)};
    }

    private void V(g3.d dVar) {
        int iD = dVar.d(1);
        if (this.f29634a == iD) {
            return;
        }
        this.f29634a = iD;
        y(dVar);
    }

    private void W(int i10, byte... bArr) {
        y1.k kVar = this.f30013p;
        if (kVar == null) {
            return;
        }
        kVar.c(10, i10, bArr);
    }

    private void X(v vVar, byte... bArr) {
        y1.k kVar = this.f30013p;
        if (kVar == null) {
            return;
        }
        kVar.c(2, vVar.ordinal(), bArr);
    }

    public int G() {
        int i10 = this.f30021x;
        if (i10 == 0) {
            return 16;
        }
        return i10;
    }

    public int H() {
        if (this.B) {
            return k() >= 113 ? 6 : 2;
        }
        return 0;
    }

    public void K(Message message) {
        g3.d dVar = (g3.d) message.obj;
        if (dVar.m() == 2) {
            I(dVar);
            return;
        }
        int iE = dVar.e();
        if (iE == 768) {
            if (F(dVar)) {
                U(dVar);
            }
        } else if (iE != 769) {
            if (iE != 16387) {
                return;
            }
            J(dVar);
        } else if (F(dVar)) {
            V(dVar);
        }
    }

    public boolean L() {
        return this.f30020w;
    }

    public boolean M() {
        return this.f30019v;
    }

    public void N() {
        X(v.GET_DEV_INFO, 3);
    }

    public boolean O() {
        return this.f30018u;
    }

    public boolean P() {
        return this.f30023z || g() == a0.f.AP3H2;
    }

    public boolean Q() {
        return this.f30016s;
    }

    public boolean R() {
        return this.f30022y;
    }

    public boolean S() {
        if (Cfg.f5482d) {
            return false;
        }
        return this.f30015r;
    }

    public boolean T() {
        return !this.f30017t;
    }

    @Override // v4.a0
    public void b() {
        W(769, new byte[0]);
    }

    public String toString() {
        return "BTDevInformation{SupportRadio=" + this.f30015r + ", SupportMediumPower=" + this.f30016s + ", NotSupportSoftPowerCtrl=" + this.f30017t + ", fixed_loc_spk_vol=" + this.f30018u + ", have_no_speaker=" + this.f30019v + ", have_hm_speaker=" + this.f30020w + ", channel_count=" + this.f30021x + ", support_noaa=" + this.f30022y + ", gmrs=" + this.f30023z + ", support_vfo=" + this.A + ", support_dmr=" + this.B + ", hw_ver=" + this.f29639f + ", soft_ver=" + this.f29640g + ", ProductId=" + this.f29642i + ", VendorId=" + this.f29643j + ", RegionCount=" + this.f29644k + ", freqRangeCount=" + this.f29645l + '}';
    }

    @Override // v4.a0
    public boolean u() {
        return this.B;
    }

    @Override // v4.a0
    public boolean w() {
        return this.D;
    }

    public n(g3.c cVar, a0.c cVar2) {
        this(new y1.f(cVar), cVar2);
    }
}
