package v4;

import android.text.TextUtils;
import com.benshikj.ht.R;
import com.benshikj.ht.rpc.Im;
import com.dw.ht.Cfg;
import d5.a;
import java.math.BigDecimal;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public class r implements q0, Cloneable {
    static int[] L = {462562500, 462587500, 462612500, 462637500, 462662500, 462687500, 462712500, 467562500, 467587500, 467612500, 467637500, 467662500, 467687500, 467712500, 462550000, 462575000, 462600000, 462625000, 462650000, 462675000, 462700000, 462725000, 467550000, 467575000, 467600000, 467625000, 467650000, 467675000, 467700000, 467725000};
    public boolean A;
    public boolean B;
    public boolean C;
    public boolean D;
    public boolean E;
    private byte[] F;
    public String G;
    public int H;
    public int I;
    public int J;
    public int K;

    /* JADX INFO: renamed from: a */
    public int f30065a;

    /* JADX INFO: renamed from: b */
    public int f30066b;

    /* JADX INFO: renamed from: c */
    public a.d f30067c;

    /* JADX INFO: renamed from: d */
    public a.d f30068d;

    /* JADX INFO: renamed from: e */
    public int f30069e;

    /* JADX INFO: renamed from: f */
    public int f30070f;

    /* JADX INFO: renamed from: g */
    public boolean f30071g;

    /* JADX INFO: renamed from: h */
    public boolean f30072h;

    /* JADX INFO: renamed from: r */
    public boolean f30073r;

    /* JADX INFO: renamed from: s */
    public boolean f30074s;

    /* JADX INFO: renamed from: t */
    public boolean f30075t;

    /* JADX INFO: renamed from: u */
    public boolean f30076u;

    /* JADX INFO: renamed from: v */
    public boolean f30077v;

    /* JADX INFO: renamed from: w */
    public boolean f30078w;

    /* JADX INFO: renamed from: x */
    public boolean f30079x;

    /* JADX INFO: renamed from: y */
    public boolean f30080y;

    /* JADX INFO: renamed from: z */
    public boolean f30081z;

    enum a {
        FD_NONE_FREQ,
        FD_NONE_DIFF,
        FD_AUTO_ADD,
        FD_AUTO_SUB,
        FD_CUSTOMIZE,
        FD_UNKNOWN;

        public static int d(int i10, int i11) {
            if (i11 >= 1000 || i11 < 0) {
                return i10 + i11;
            }
            int iOrdinal = f(i11).ordinal();
            if (iOrdinal == 0) {
                return 0;
            }
            if (iOrdinal == 2) {
                return i10 + (e(i10) ? 5000000 : 600000);
            }
            if (iOrdinal != 3) {
                return i10;
            }
            return i10 - (e(i10) ? 5000000 : 600000);
        }

        static boolean e(int i10) {
            return i10 > 300000000;
        }

        public static a f(int i10) {
            return (i10 < 0 || i10 >= values().length) ? FD_UNKNOWN : values()[i10];
        }
    }

    public r() {
        a.d dVar = a.d.FM;
        this.f30067c = dVar;
        this.f30068d = dVar;
        this.K = 1;
    }

    public static d5.a H(r rVar) {
        d5.a aVar = new d5.a();
        aVar.f10573g = rVar.f30065a;
        aVar.f10583z = rVar.f30070f;
        aVar.f10574h = rVar.f30066b;
        aVar.f10582y = rVar.f30069e;
        aVar.f10578u = rVar.f30071g;
        aVar.f10577t = rVar.f30073r;
        aVar.A = rVar.r();
        aVar.B = rVar.f30074s ? 25000 : 12500;
        aVar.f10580w = rVar.f30075t;
        aVar.f10581x = rVar.f30076u;
        aVar.C = rVar.f30078w;
        aVar.H = rVar.C;
        aVar.I = rVar.D;
        aVar.G = rVar.A;
        aVar.f10571e = rVar.m();
        aVar.f10576s = rVar.f30068d;
        aVar.f10575r = rVar.f30067c;
        aVar.E = rVar.f30080y;
        aVar.D = rVar.f30079x;
        aVar.F = rVar.f30081z;
        aVar.K = rVar.I;
        aVar.J = rVar.H;
        aVar.L = rVar.J;
        aVar.M = rVar.K;
        return aVar;
    }

    public static int I(a.d dVar, int i10) {
        return (dVar.ordinal() << 30) | i10;
    }

    public static String d(int i10) {
        return i10 < 22 ? String.format(Locale.ENGLISH, "GMRS%02d", Integer.valueOf(i10 + 1)) : i10 < 30 ? String.format(Locale.ENGLISH, "REPT%02d", Integer.valueOf(i10 - 7)) : "";
    }

    public static String[] f() {
        String[] strArr = new String[30];
        for (int i10 = 0; i10 < 30; i10++) {
            strArr[i10] = d(i10);
        }
        return strArr;
    }

    private String g(a.d dVar, int i10) {
        String string = new BigDecimal(i10).divide(new BigDecimal(1000000)).toString();
        if (dVar == a.d.FM) {
            dVar = null;
        }
        if (dVar != null) {
            string = dVar + " " + string;
        }
        int iIndexOf = string.indexOf(46);
        if (iIndexOf < 0) {
            return string + ".000";
        }
        int length = (string.length() - iIndexOf) - 1;
        if (length == 1) {
            return string + "00";
        }
        if (length != 2) {
            return string;
        }
        return string + "0";
    }

    public static r h(d5.a aVar) {
        if (aVar == null) {
            aVar = d5.a.n();
        }
        r rVar = new r();
        rVar.f30065a = aVar.f10573g;
        rVar.f30070f = aVar.f10583z;
        rVar.f30066b = aVar.f10574h;
        rVar.f30069e = aVar.f10582y;
        rVar.I = aVar.K;
        rVar.H = aVar.J;
        rVar.J = aVar.L;
        rVar.K = aVar.M;
        rVar.f30071g = aVar.f10578u;
        rVar.f30073r = aVar.f10577t;
        int i10 = aVar.A;
        rVar.f30072h = i10 == 0;
        rVar.f30077v = i10 == -2;
        rVar.f30074s = aVar.B == 25000;
        rVar.f30075t = aVar.f10580w;
        rVar.f30076u = aVar.f10581x;
        rVar.f30078w = aVar.C;
        rVar.C = aVar.H;
        rVar.D = aVar.I;
        rVar.A = aVar.G;
        rVar.f30068d = aVar.f10576s;
        rVar.f30067c = aVar.f10575r;
        rVar.f30080y = aVar.E;
        rVar.f30079x = aVar.D;
        rVar.f30081z = aVar.F;
        rVar.C(aVar.f10571e);
        if (Cfg.f5490h) {
            rVar.f30076u = true;
        }
        return rVar;
    }

    public static r i(byte[] bArr, int i10, int i11) {
        return j(bArr, i10, i11, 0);
    }

    public static r j(byte[] bArr, int i10, int i11, int i12) {
        r rVar = new r();
        if (i10 + 24 > i11) {
            return null;
        }
        a6.v vVar = new a6.v(bArr, i10 * 8);
        rVar.f30068d = a.d.d(vVar.i(2));
        rVar.f30065a = vVar.i(30);
        rVar.f30067c = a.d.d(vVar.i(2));
        rVar.f30066b = vVar.i(30);
        rVar.f30069e = vVar.i(16);
        rVar.f30070f = vVar.i(16);
        rVar.f30071g = vVar.c();
        rVar.f30072h = vVar.c();
        rVar.f30073r = vVar.c();
        rVar.f30074s = vVar.c();
        rVar.f30075t = vVar.c();
        rVar.f30076u = vVar.c();
        rVar.f30077v = vVar.c();
        rVar.f30078w = vVar.c();
        rVar.f30079x = vVar.c();
        rVar.f30080y = vVar.c();
        rVar.f30081z = vVar.c();
        rVar.A = vVar.c();
        rVar.B = vVar.c();
        rVar.C = vVar.c();
        rVar.D = vVar.c();
        rVar.E = vVar.c();
        if (rVar.B) {
            rVar.f30065a = a.d(rVar.f30066b, rVar.f30065a);
        }
        int iB = vVar.b() / 8;
        rVar.F = Arrays.copyOfRange(bArr, iB, iB + 10);
        if (i12 > 0) {
            int iB2 = vVar.b();
            try {
                rVar.H = vVar.i(4);
                rVar.I = vVar.i(4);
                rVar.J = vVar.i(1);
                vVar.i(7);
                rVar.K = vVar.h();
            } catch (Exception unused) {
            }
            vVar.l(iB2 + (i12 * 8));
        }
        return rVar;
    }

    public static r t(int i10) {
        r rVar = new r();
        rVar.C(d(i10));
        int i11 = L[i10];
        rVar.f30065a = i11;
        rVar.f30066b = i11;
        if (i10 < 7) {
            rVar.f30072h = true;
            rVar.f30071g = true;
            rVar.f30073r = false;
            rVar.f30074s = true;
            rVar.f30076u = true;
            rVar.f30079x = true;
            return rVar;
        }
        if (i10 < 14) {
            rVar.f30072h = false;
            rVar.f30071g = true;
            rVar.f30073r = false;
            rVar.f30074s = false;
            rVar.f30076u = true;
            rVar.f30079x = true;
            rVar.f30080y = true;
            rVar.f30081z = true;
            return rVar;
        }
        if (i10 < 22) {
            rVar.f30072h = true;
            rVar.f30071g = false;
            rVar.f30073r = false;
            rVar.f30074s = true;
            rVar.f30076u = true;
            rVar.f30079x = true;
            return rVar;
        }
        if (i10 < 30) {
            rVar.f30066b = i11 - 5000000;
            rVar.f30072h = true;
            rVar.f30071g = false;
            rVar.f30073r = false;
            rVar.f30074s = true;
            rVar.f30076u = false;
            rVar.f30079x = true;
        }
        return rVar;
    }

    public static boolean u(r rVar) {
        int i10 = rVar.f30065a;
        if (i10 == 0) {
            return false;
        }
        int iV = v(i10);
        if (iV < 0) {
            rVar.f30065a = 0;
            return true;
        }
        int i11 = rVar.f30065a;
        rVar.f30066b = i11;
        rVar.f30079x = true;
        if (iV >= 7) {
            if (iV < 14) {
                rVar.f30072h = false;
                rVar.f30077v = false;
                rVar.f30074s = false;
                rVar.f30080y = true;
                rVar.f30081z = true;
            } else if (iV >= 22) {
                rVar.f30066b = i11 - 5000000;
                rVar.f30076u = false;
            }
        }
        return true;
    }

    public static int v(int i10) {
        int i11 = 0;
        while (true) {
            int[] iArr = L;
            if (i11 >= iArr.length) {
                return -1;
            }
            if (i10 == iArr[i11]) {
                return i11;
            }
            i11++;
        }
    }

    public int A() {
        if (this.f30078w) {
            return 0;
        }
        return this.f30073r ? x() : this.D ? this.f30066b : this.f30065a;
    }

    public a.d B() {
        return this.f30073r ? y() : this.D ? this.f30067c : this.f30068d;
    }

    public void C(String str) {
        byte[] bytes;
        String strTrim = str.trim();
        this.G = strTrim;
        if (TextUtils.isEmpty(strTrim)) {
            this.F = new byte[10];
            return;
        }
        if (strTrim.length() > 10) {
            strTrim = strTrim.substring(0, 10);
        }
        Charset charsetDefaultCharset = Charset.defaultCharset();
        try {
            charsetDefaultCharset = Charset.forName("gb2312");
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        do {
            bytes = strTrim.getBytes(charsetDefaultCharset);
            if (bytes.length <= 10) {
                break;
            } else {
                strTrim = strTrim.substring(0, strTrim.length() - 1);
            }
        } while (!strTrim.isEmpty());
        byte[] bArr = new byte[10];
        System.arraycopy(bytes, 0, bArr, 0, Math.min(bytes.length, 10));
        this.F = bArr;
    }

    public void D(int i10) {
        this.f30067c = a.d.d((i10 >> 30) & 3);
        this.f30066b = i10 & 1073741823;
    }

    public void E(int i10) {
        this.f30068d = a.d.d((i10 >> 30) & 3);
        this.f30065a = i10 & 1073741823;
    }

    public boolean F(int i10) {
        if (r() == i10) {
            return false;
        }
        if (i10 == -2) {
            this.f30077v = true;
            this.f30072h = false;
        } else if (i10 != 0) {
            this.f30077v = false;
            this.f30072h = false;
        } else {
            this.f30072h = true;
            this.f30077v = false;
        }
        return true;
    }

    public d5.a G() {
        return H(this);
    }

    public boolean J(Im.RfChannelFields rfChannelFields) {
        if (rfChannelFields.getTxFreq() == this.f30065a && rfChannelFields.getRxFreq() == this.f30066b && rfChannelFields.getTxSubAudio() == this.f30069e && rfChannelFields.getRxSubAudio() == this.f30070f) {
            if (rfChannelFields.getBandwidth() == (this.f30074s ? 25000 : 12500)) {
                return false;
            }
        }
        this.f30065a = rfChannelFields.getTxFreq();
        this.f30066b = rfChannelFields.getRxFreq();
        this.f30069e = rfChannelFields.getTxSubAudio();
        this.f30070f = rfChannelFields.getRxSubAudio();
        this.f30074s = rfChannelFields.getBandwidth() == 25000;
        return true;
    }

    @Override // v4.q0
    public byte[] a(int i10) {
        int i11 = i10 + 24;
        byte[] bArr = new byte[i11];
        boolean z10 = this.B;
        a6.v vVar = new a6.v(bArr);
        vVar.n(this.f30068d.ordinal(), 2);
        if (!z10 || Math.abs(this.f30065a - this.f30066b) < 1000) {
            vVar.n(this.f30065a, 30);
            z10 = false;
        } else {
            vVar.n(this.f30065a - this.f30066b, 30);
        }
        vVar.n(this.f30067c.ordinal(), 2);
        vVar.n(this.f30066b, 30);
        vVar.n(this.f30069e, 16);
        vVar.n(this.f30070f, 16);
        vVar.p(this.f30071g);
        vVar.p(this.f30072h);
        vVar.p(this.f30073r);
        vVar.p(this.f30074s);
        vVar.p(this.f30075t);
        vVar.p(this.f30076u);
        vVar.p(this.f30077v);
        vVar.p(this.f30078w);
        vVar.p(this.f30079x);
        vVar.p(this.f30080y);
        vVar.p(this.f30081z);
        vVar.p(this.A);
        vVar.p(z10);
        vVar.p(this.C);
        vVar.p(this.D);
        vVar.p(this.E);
        if (this.F != null) {
            int i12 = 14;
            int i13 = 0;
            while (i12 < i11) {
                byte[] bArr2 = this.F;
                if (i13 >= bArr2.length) {
                    break;
                }
                bArr[i12] = bArr2[i13];
                i12++;
                i13++;
            }
        }
        vVar.l(192);
        if (i10 > 0) {
            int iB = vVar.b();
            vVar.n(this.H, 4);
            vVar.n(this.I, 4);
            vVar.n(this.J, 1);
            vVar.n(0, 7);
            if (i10 >= 6) {
                int i14 = this.K & 16777215;
                vVar.n(i14 != 0 ? i14 : 1, 32);
            }
            vVar.l(iB + (i10 * 8));
        }
        return bArr;
    }

    @Override // v4.q0
    public byte[] b() {
        return a(0);
    }

    public Object clone() {
        return super.clone();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            r rVar = (r) obj;
            if (this.f30065a == rVar.f30065a && this.f30066b == rVar.f30066b && this.f30068d == rVar.f30068d && this.f30067c == rVar.f30067c && this.f30069e == rVar.f30069e && this.f30070f == rVar.f30070f && this.f30071g == rVar.f30071g && this.f30072h == rVar.f30072h && this.f30073r == rVar.f30073r && this.f30074s == rVar.f30074s && this.f30075t == rVar.f30075t && this.f30076u == rVar.f30076u && this.f30077v == rVar.f30077v && this.f30078w == rVar.f30078w && this.C == rVar.C && this.A == rVar.A && this.D == rVar.D && this.E == rVar.E && Arrays.equals(this.F, rVar.F)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (a6.q.g(this.f30068d, Integer.valueOf(this.f30065a), this.f30067c, Integer.valueOf(this.f30066b), Integer.valueOf(this.f30069e), Integer.valueOf(this.f30070f), Boolean.valueOf(this.f30071g), Boolean.valueOf(this.f30072h), Boolean.valueOf(this.f30073r), Boolean.valueOf(this.f30074s), Boolean.valueOf(this.f30075t), Boolean.valueOf(this.f30076u), Boolean.valueOf(this.f30077v), Boolean.valueOf(this.f30078w), Boolean.valueOf(this.C), Boolean.valueOf(this.D), Boolean.valueOf(this.E), Boolean.valueOf(this.A)) * 31) + Arrays.hashCode(this.F);
    }

    public String k(boolean z10) {
        String strM = m();
        return TextUtils.isEmpty(strM) ? o(z10) : strM;
    }

    public String m() {
        String str = this.G;
        if (str != null) {
            return str;
        }
        if (this.F == null) {
            return "";
        }
        Charset charsetDefaultCharset = Charset.defaultCharset();
        try {
            charsetDefaultCharset = Charset.forName("gb2312");
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        return new String(this.F, charsetDefaultCharset).trim();
    }

    public String n() {
        int iX = x();
        if (iX == 0) {
            return com.dw.ht.o.d().i().getResources().getString(R.string.empty);
        }
        return g(y() != a.d.FM ? y() : null, iX);
    }

    public String o(boolean z10) {
        int iX = x();
        if (iX == 0) {
            return com.dw.ht.o.d().i().getResources().getString(R.string.empty);
        }
        return g(z10 ? y() : null, iX);
    }

    public String p(boolean z10) {
        int iA = A();
        if (iA == 0) {
            return com.dw.ht.o.d().i().getResources().getString(R.string.empty);
        }
        return g(z10 ? B() : null, iA);
    }

    public int r() {
        if (this.f30072h) {
            return 0;
        }
        return this.f30077v ? -2 : -1;
    }

    public String toString() {
        return "Channel{txFreq=" + this.f30065a + ", rxFreq=" + this.f30066b + ", rxModulation=" + this.f30067c + ", txModulation=" + this.f30068d + ", txSubAudio=" + this.f30069e + ", rxSubAudio=" + this.f30070f + ", scan=" + this.f30071g + ", txPower=" + r() + ", offline=" + this.f30073r + ", bandwidth=" + this.f30074s + ", pre_de_emph_bypass=" + this.f30075t + ", sign=" + this.f30076u + ", txDisable=" + this.f30078w + ", bclo=" + this.C + ", rev=" + this.D + ", fixed_freq=" + this.f30079x + ", fixed_bandwidth=" + this.f30080y + ", fixed_tx_power=" + this.f30081z + ", mute=" + this.A + ", name=" + Arrays.toString(this.F) + ", tx_color=" + this.H + ", rx_color=" + this.I + ", slot=" + this.J + '}';
    }

    public boolean w() {
        return A() > 0;
    }

    public int x() {
        return this.D ? this.f30065a : this.f30066b;
    }

    public a.d y() {
        return this.D ? this.f30068d : this.f30067c;
    }

    public int z() {
        return this.D ? this.f30069e : this.f30070f;
    }
}
