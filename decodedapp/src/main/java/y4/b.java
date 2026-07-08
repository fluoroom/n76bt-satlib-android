package y4;

import a6.v;
import com.benshikj.ht.R;
import com.dw.ht.Main;
import d5.a;
import rd.m;
import v4.r;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a */
    private a.d f32386a;

    /* JADX INFO: renamed from: b */
    private int f32387b;

    /* JADX INFO: renamed from: c */
    private a.d f32388c;

    /* JADX INFO: renamed from: d */
    private int f32389d;

    /* JADX INFO: renamed from: e */
    private int f32390e;

    /* JADX INFO: renamed from: f */
    private int f32391f;

    /* JADX INFO: renamed from: g */
    private e f32392g;

    /* JADX INFO: renamed from: h */
    private c f32393h;

    /* JADX INFO: renamed from: i */
    private boolean f32394i;

    /* JADX INFO: renamed from: j */
    private boolean f32395j;

    /* JADX INFO: renamed from: k */
    private boolean f32396k;

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f32397a;

        static {
            int[] iArr = new int[e.values().length];
            try {
                iArr[e.f32419b.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[e.f32420c.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[e.f32421d.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[e.f32422e.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[e.f32423f.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f32397a = iArr;
        }
    }

    public b() {
        a.d dVar = a.d.FM;
        this.f32386a = dVar;
        this.f32388c = dVar;
        this.f32392g = e.f32424g;
        this.f32393h = c.f32399b;
    }

    public final r a() {
        r rVar = new r();
        rVar.D(f());
        rVar.E(n());
        rVar.f30070f = this.f32390e;
        rVar.f30069e = this.f32391f;
        rVar.f30072h = this.f32394i;
        rVar.C(Main.f5555g.getString(R.string.frequency_mode));
        if (com.dw.ht.satellite.b.x() != 0) {
            rVar.C(com.dw.ht.satellite.b.z(com.dw.ht.satellite.b.x()));
        }
        return rVar;
    }

    public final c b() {
        return this.f32393h;
    }

    public final a.d c() {
        return this.f32386a;
    }

    public final int d() {
        return this.f32390e;
    }

    public final int e() {
        return this.f32387b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!m.a(b.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        m.c(obj, "null cannot be cast to non-null type com.dw.ht.link.freqMode.FreqModeStatus");
        b bVar = (b) obj;
        return this.f32387b == bVar.f32387b && this.f32389d == bVar.f32389d && this.f32390e == bVar.f32390e && this.f32391f == bVar.f32391f && this.f32394i == bVar.f32394i && this.f32395j == bVar.f32395j && this.f32396k == bVar.f32396k && this.f32386a == bVar.f32386a && this.f32388c == bVar.f32388c && this.f32392g == bVar.f32392g && this.f32393h == bVar.f32393h;
    }

    public final int f() {
        return (this.f32386a.ordinal() << 30) | this.f32387b;
    }

    public final boolean g() {
        return this.f32396k;
    }

    public final int h() {
        int i10 = a.f32397a[this.f32392g.ordinal()];
        if (i10 == 1) {
            return 5000;
        }
        if (i10 == 2) {
            return 62500;
        }
        if (i10 == 3) {
            return 10000;
        }
        if (i10 != 4) {
            return i10 != 5 ? 250000 : 15000;
        }
        return 12500;
    }

    public int hashCode() {
        return (((((((((((((((((((this.f32387b * 31) + this.f32389d) * 31) + this.f32390e) * 31) + this.f32391f) * 31) + o4.b.a(this.f32394i)) * 31) + o4.b.a(this.f32395j)) * 31) + o4.b.a(this.f32396k)) * 31) + this.f32386a.hashCode()) * 31) + this.f32388c.hashCode()) * 31) + this.f32392g.hashCode()) * 31) + this.f32393h.hashCode();
    }

    public final e i() {
        return this.f32392g;
    }

    public final boolean j() {
        return this.f32395j;
    }

    public final a.d k() {
        return this.f32388c;
    }

    public final int l() {
        return this.f32391f;
    }

    public final int m() {
        return this.f32389d;
    }

    public final int n() {
        return (this.f32388c.ordinal() << 30) | this.f32389d;
    }

    public final boolean o() {
        return this.f32394i;
    }

    public final void p(c cVar) {
        m.e(cVar, "<set-?>");
        this.f32393h = cVar;
    }

    public final void q(a.d dVar) {
        m.e(dVar, "<set-?>");
        this.f32386a = dVar;
    }

    public final void r(int i10) {
        this.f32390e = i10;
    }

    public final void s(int i10) {
        this.f32387b = i10;
    }

    public final void t(e eVar) {
        m.e(eVar, "<set-?>");
        this.f32392g = eVar;
    }

    public String toString() {
        return "FreqModeStatus(rxModulation=" + this.f32386a + ", rx_freq=" + this.f32387b + ", txModulation=" + this.f32388c + ", tx_freq=" + this.f32389d + ", rx_ctcss_dcs=" + this.f32390e + ", tx_ctcss_dcs=" + this.f32391f + ", step=" + this.f32392g + ", mode=" + this.f32393h + ", tx_power=" + this.f32394i + ", tuned=" + this.f32395j + ", seek=" + this.f32396k + ')';
    }

    public final void u(int i10) {
        this.f32391f = i10;
    }

    public b(byte[] bArr) {
        m.e(bArr, "data");
        a.d dVar = a.d.FM;
        this.f32386a = dVar;
        this.f32388c = dVar;
        this.f32392g = e.f32424g;
        this.f32393h = c.f32399b;
        v vVar = new v(bArr, 8);
        try {
            a.d dVarD = a.d.d(vVar.i(2));
            m.d(dVarD, "valueOf(...)");
            this.f32386a = dVarD;
            this.f32387b = vVar.i(30);
            a.d dVarD2 = a.d.d(vVar.i(2));
            m.d(dVarD2, "valueOf(...)");
            this.f32388c = dVarD2;
            this.f32389d = vVar.i(30);
            this.f32390e = vVar.i(16);
            this.f32391f = vVar.i(16);
            this.f32394i = vVar.c();
            this.f32392g = e.f32418a.a(vVar.i(3));
            this.f32393h = c.f32398a.a(vVar.i(4));
            this.f32395j = vVar.c();
            this.f32396k = vVar.c();
        } catch (IllegalArgumentException e10) {
            e10.printStackTrace();
        }
    }
}
