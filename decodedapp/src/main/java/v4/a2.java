package v4;

import android.location.Location;
import java.security.InvalidParameterException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class a2 {
    public boolean A;
    public boolean B;
    int C;
    public boolean D;
    public boolean E;
    public boolean F;
    public int G;
    public int H;
    public int I;
    public int J;
    public boolean K;
    public boolean L;
    public boolean M;
    public int N;
    public int O;
    public boolean P;
    public int Q;
    public boolean R;
    public int S;
    public boolean T;
    public int U;
    public boolean V;
    public boolean W;
    int X;
    public Location Y;
    private byte[] Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f29686a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f29687b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f29688c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f29689d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f29690e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public a f29691f = a.Off;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f29692g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f29693h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f29694i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f29695j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f29696k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f29697l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f29698m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f29699n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f29700o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f29701p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f29702q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f29703r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f29704s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f29705t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f29706u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f29707v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f29708w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f29709x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f29710y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f29711z;

    public enum a {
        Off,
        A,
        B;

        public static a d(int i10) {
            return (i10 < 0 || i10 >= values().length) ? Off : values()[i10];
        }
    }

    public boolean a(byte[] bArr, int i10, int i11) {
        if (i10 + 8 > i11) {
            return false;
        }
        this.Z = Arrays.copyOfRange(bArr, i10, i11);
        a6.v vVar = new a6.v(bArr, i10 * 8);
        try {
            this.f29687b = vVar.e(4);
            this.f29688c = vVar.e(4);
            this.f29689d = vVar.c();
            this.f29700o = vVar.i(1);
            this.f29691f = a.d(vVar.i(2));
            this.f29692g = vVar.i(4);
            this.f29693h = vVar.c();
            this.f29694i = vVar.c();
            this.f29695j = vVar.c();
            this.f29696k = vVar.c();
            this.f29699n = vVar.i(3);
            this.f29698m = vVar.i(4);
            this.f29697l = vVar.i(5);
            this.f29690e = vVar.i(2);
            this.f29701p = vVar.i(3);
            this.f29702q = vVar.c();
            this.f29703r = vVar.c();
            this.f29704s = vVar.c();
            this.f29705t = vVar.i(3);
            this.f29706u = vVar.i(5);
            this.f29707v = vVar.i(2);
            this.f29708w = vVar.i(4);
            this.f29709x = vVar.i(6);
            this.f29710y = vVar.c();
            this.f29711z = vVar.c();
            this.A = vVar.c();
            this.B = vVar.c();
            this.C = vVar.i(5);
            this.D = vVar.c();
            this.E = vVar.c();
            this.F = vVar.c();
            this.f29687b += vVar.i(4) * 16;
            this.f29688c += vVar.i(4) * 16;
            this.G = vVar.i(2);
            this.H = vVar.i(4);
            this.I = vVar.i(2);
            this.J = vVar.i(2);
            this.K = vVar.c();
            this.L = vVar.c();
            this.M = vVar.c();
            this.f29706u += vVar.i(3) << 5;
            this.N = vVar.i(8);
            this.O = vVar.i(8);
            this.P = vVar.c();
            this.Q = vVar.i(3);
            this.R = vVar.c();
            this.S = vVar.i(3);
            this.T = vVar.c();
            this.U = vVar.i(4);
            this.V = vVar.c();
            this.W = vVar.c();
            this.X = vVar.i(1);
            this.Y = b2.d(vVar, null, true);
        } catch (InvalidParameterException unused) {
        }
        Location location = this.Y;
        if (location != null && location.getLatitude() == 0.0d && this.Y.getLongitude() == 0.0d) {
            this.Y = null;
        }
        this.f29686a = true;
        return true;
    }

    public int b() {
        int i10 = this.f29701p;
        if (i10 > 4) {
            return 2;
        }
        return i10 == 4 ? 1 : 0;
    }

    public int c() {
        return this.f29691f == a.B ? this.f29688c : this.f29687b;
    }

    public int d() {
        int i10 = this.f29699n;
        if (i10 < 3) {
            return 0;
        }
        return i10 == 3 ? 1 : 2;
    }

    public boolean e() {
        return !this.f29703r;
    }

    public long f() {
        return ((long) this.f29697l) * 10000;
    }

    public boolean g(int i10, r[] rVarArr) {
        r rVar;
        if (!this.f29689d || rVarArr.length <= i10 || (rVar = rVarArr[i10]) == null || !rVar.f30071g) {
            return this.f29691f != a.Off ? i10 == this.f29687b || i10 == this.f29688c : i10 == this.f29687b;
        }
        return true;
    }

    public boolean h() {
        return this.f29686a;
    }

    public void i(int i10) {
        if (i10 == 1) {
            this.f29701p = 4;
        } else if (i10 != 2) {
            this.f29701p = 3;
        } else {
            this.f29701p = 5;
        }
    }

    boolean j(int i10) {
        a aVar;
        if (i10 == 251) {
            if (this.f29688c == i10 && this.f29691f == a.B) {
                return false;
            }
            this.f29688c = i10;
            this.f29691f = a.B;
            return true;
        }
        if (i10 != 252) {
            if (i10 == c()) {
                return false;
            }
            if (this.f29691f == a.B) {
                this.f29688c = i10;
            } else {
                this.f29687b = i10;
            }
            return true;
        }
        if (this.f29687b == i10 && ((aVar = this.f29691f) == a.A || aVar == a.Off)) {
            return false;
        }
        this.f29687b = i10;
        if (this.f29691f == a.B) {
            this.f29691f = a.A;
        }
        return true;
    }

    public void k(boolean z10) {
        this.f29686a = z10;
    }

    public void l(int i10) {
        if (i10 == 0) {
            this.f29699n = 2;
        } else if (i10 != 1) {
            this.f29699n = 4;
        } else {
            this.f29699n = 3;
        }
    }

    public void m(boolean z10) {
        this.f29703r = !z10;
    }

    byte[] n() {
        byte[] bArr = this.Z;
        if (bArr == null || bArr.length < 22) {
            bArr = new byte[22];
        }
        a6.v vVar = new a6.v(bArr, 0);
        vVar.n(this.f29687b, 4).n(this.f29688c, 4).p(this.f29689d).n(this.f29700o, 1).n(this.f29691f.ordinal(), 2).n(this.f29692g, 4).p(this.f29693h).p(this.f29694i).p(this.f29695j).p(this.f29696k).n(this.f29699n, 3).n(this.f29698m, 4).n(this.f29697l, 5).n(this.f29690e, 2).n(this.f29701p, 3).p(this.f29702q).p(this.f29703r).p(this.f29704s).n(this.f29705t, 3).n(this.f29706u, 5).n(this.f29707v, 2).n(this.f29708w, 4).n(this.f29709x, 6).p(this.f29710y).p(this.f29711z).p(this.A).p(this.B).n(this.C, 5).p(this.D).p(this.E).p(this.F).n(this.f29687b / 16, 4).n(this.f29688c / 16, 4).n(this.G, 2).n(this.H, 4).n(this.I, 2).n(this.J, 2).p(this.K).p(this.L).p(this.M).n(this.f29706u >> 5, 3).n(this.N, 8).n(this.O, 8).p(this.P).n(this.Q, 3).p(this.R).n(this.S, 3).p(this.T).n(this.U, 4).p(this.V).p(this.W).n(this.X, 1);
        b2.h(vVar, this.Y);
        byte[] bArr2 = this.Z;
        return bArr2 != null ? Arrays.copyOfRange(bArr, 0, bArr2.length) : bArr;
    }

    public String toString() {
        return "Settings{initialized=" + this.f29686a + ", channelA=" + this.f29687b + ", channelB=" + this.f29688c + ", scan=" + this.f29689d + ", local_speaker=" + this.f29690e + ", doubleChannel=" + this.f29691f + ", squelchLevel=" + this.f29692g + ", tailElim=" + this.f29693h + ", audio_relay_en=" + this.f29694i + ", auto_power_on=" + this.f29695j + ", keep_aghfp_link=" + this.f29696k + ", tx_time_limit=" + this.f29697l + ", tx_hold_time=" + this.f29698m + ", mic_gain=" + this.f29699n + ", aghfp_call_mode=" + this.f29700o + ", bt_mic_gain=" + this.f29701p + ", adaptive_response=" + this.f29702q + ", dis_tone=" + this.f29703r + ", power_saving_mode=" + this.f29704s + ", auto_power_off=" + this.f29705t + ", auto_share_loc_ch=" + this.f29706u + ", hm_speaker=" + this.f29707v + ", positioning_system=" + this.f29708w + ", time_offset=" + this.f29709x + ", use_freq_range_2=" + this.f29710y + ", ptt_lock=" + this.f29711z + ", leading_sync_bit_en=" + this.A + ", pairing_at_power_on=" + this.B + ", screen_timeout=" + this.C + ", kiss_upload_tx_msg=" + this.D + ", kiss_en=" + this.E + ", imperial_unit=" + this.F + ", wx_mode=" + this.G + ", noaa_ch=" + this.H + ", vfo1_tx_powerX=" + this.I + ", vfo2_tx_powerX=" + this.J + ", dis_digital_mute=" + this.K + ", signaling_ecc_en=" + this.L + ", ch_data_lock=" + this.M + ", kiss_tx_delay=" + this.N + ", kiss_tx_tail=" + this.O + ", vox_en=" + this.P + ", vox_level=" + this.Q + ", dis_bt_mic=" + this.R + ", vox_delay=" + this.S + ", ns_en=" + this.T + ", alarm_volume=" + this.U + ", use_custom_location=" + this.V + ", gpwpl_upload_en=" + this.W + ", vfo1_mod_freqX=" + this.X + ", custom_location=" + this.Y + ", data=" + Arrays.toString(this.Z) + '}';
    }
}
