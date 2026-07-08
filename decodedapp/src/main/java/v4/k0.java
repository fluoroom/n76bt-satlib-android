package v4;

import v4.a2;

/* JADX INFO: loaded from: classes.dex */
public class k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f29912a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f29913b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f29914c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f29915d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f29917f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f29918g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f29919h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f29920i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f29921j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f29922k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f29923l = -1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f29924m = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public a2.a f29916e = a2.a.Off;

    public static k0 a(byte[] bArr, int i10) {
        k0 k0Var = new k0();
        a6.v vVar = new a6.v(bArr, i10 * 8);
        try {
            k0Var.f29912a = vVar.c();
            k0Var.f29913b = vVar.c();
            k0Var.f29914c = vVar.c();
            k0Var.f29915d = vVar.c();
            k0Var.f29916e = a2.a.values()[vVar.i(2)];
            k0Var.f29917f = vVar.c();
            k0Var.f29918g = vVar.c();
            k0Var.f29919h = vVar.i(4);
            k0Var.f29920i = vVar.c();
            k0Var.f29921j = vVar.c();
            k0Var.f29922k = vVar.c();
            vVar.i(1);
            if (vVar.a() == 0) {
                return k0Var;
            }
            k0Var.f29923l = vVar.i(4);
            k0Var.f29924m = vVar.i(6);
            k0Var.f29919h += vVar.i(4) * 16;
            return k0Var;
        } catch (Exception e10) {
            e10.printStackTrace();
            return null;
        }
    }

    public int b() {
        return (this.f29923l * 100) / 15;
    }

    public boolean c() {
        return (!this.f29912a || this.f29914c || this.f29913b) ? false : true;
    }

    public String toString() {
        return "HTStatus{powerOn=" + this.f29912a + ", inTx=" + this.f29913b + ", sq=" + this.f29914c + ", inRx=" + this.f29915d + ", doubleChannel=" + this.f29916e + ", scan=" + this.f29917f + ", radio=" + this.f29918g + ", current_ch=" + this.f29919h + ", gps_locked=" + this.f29920i + ", hfp_connected=" + this.f29921j + ", aoc_connected=" + this.f29922k + ", rssi=" + this.f29923l + ", region=" + this.f29924m + '}';
    }
}
