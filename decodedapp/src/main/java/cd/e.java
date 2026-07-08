package cd;

import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import java.net.InetSocketAddress;

/* JADX INFO: loaded from: classes3.dex */
public class e {
    protected long A;
    protected long B;
    protected long C;
    protected long D;
    protected long E;
    protected h F;
    protected long G;
    protected long H;
    protected long I;
    protected long J;
    protected long K;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected boolean f4562a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected InetSocketAddress f4563b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected InetSocketAddress f4564c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected InetSocketAddress f4565d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected InetSocketAddress f4566e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected long f4567f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected String f4568g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected String f4569h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected String f4570i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    protected String f4571j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    protected String f4572k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    protected String f4573l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    protected String f4574m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    protected String f4575n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    protected int f4576o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    protected int f4577p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    protected long f4578q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    protected long f4579r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    protected long f4580s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    protected int f4581t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    protected int f4582u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    protected double f4583v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    protected long f4584w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    protected long f4585x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    protected long f4586y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    protected double f4587z;

    public e(String str, int i10, int i11) {
        this.f4562a = false;
        this.f4563b = null;
        this.f4564c = null;
        this.f4565d = null;
        this.f4566e = null;
        this.f4567f = -1L;
        this.f4568g = null;
        this.f4569h = null;
        this.f4570i = null;
        this.f4571j = null;
        this.f4572k = null;
        this.f4573l = null;
        this.f4574m = null;
        this.f4575n = null;
        this.f4576o = -1;
        this.f4577p = 0;
        this.f4578q = 0L;
        this.f4579r = 0L;
        this.f4580s = 0L;
        this.f4581t = 0;
        this.f4582u = 0;
        this.f4583v = -1.0d;
        this.f4584w = 0L;
        this.f4585x = 0L;
        this.f4586y = 0L;
        this.f4587z = -1.0d;
        this.A = -1L;
        this.B = 0L;
        this.C = 0L;
        this.D = 0L;
        this.E = -1L;
        this.F = null;
        this.G = -1L;
        this.H = -1L;
        this.I = -1L;
        this.J = -1L;
        this.K = -1L;
        if (i10 > 0) {
            try {
                this.f4563b = new InetSocketAddress(str, i10);
            } catch (Exception unused) {
                System.out.println("Couldn't resolve " + str);
            }
        }
        if (i11 > 0) {
            try {
                this.f4564c = new InetSocketAddress(str, i11);
            } catch (Exception unused2) {
                System.out.println("Couldn't resolve " + str);
            }
        }
    }

    protected long a() {
        if (this.f4586y < 1) {
            return 0L;
        }
        return (long) ((System.currentTimeMillis() - this.f4586y) * 65.536d);
    }

    protected long b() {
        return (this.f4578q * 65536) + ((long) this.f4577p);
    }

    protected int c() {
        int i10 = this.f4577p;
        int i11 = i10 - this.f4582u;
        if (i11 < 0) {
            i11 += WXMediaMessage.THUMB_LENGTH_LIMIT;
        }
        int i12 = i11 > 0 ? ((i11 - this.f4581t) * 256) / i11 : 0;
        this.f4581t = 0;
        this.f4582u = i10;
        return i12;
    }

    protected long d() {
        long jB = (b() - ((long) this.f4576o)) - this.f4579r;
        if (jB < 0) {
            return 0L;
        }
        return jB;
    }

    protected void e(long j10, long j11) {
        byte[] bArrE = y.e(j10);
        byte[] bArrE2 = y.e(j11);
        bArrE2[3] = bArrE2[1];
        bArrE2[2] = bArrE2[0];
        bArrE2[1] = bArrE[3];
        bArrE2[0] = bArrE[2];
        this.f4585x = y.b(bArrE2, 0);
    }

    protected void f(int i10, x xVar) {
        int iJ = xVar.j();
        if (this.f4576o < 0) {
            this.f4576o = iJ;
        }
        this.f4580s += (long) i10;
        this.f4581t++;
        this.f4579r++;
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (this.f4577p < iJ) {
            this.f4577p = iJ;
        }
        if (this.G > 0) {
            long jL = (xVar.l() - jCurrentTimeMillis) - (this.f4584w - this.G);
            if (jL < 0) {
                jL *= -1;
            }
            double d10 = this.f4583v;
            this.f4583v = d10 + ((jL - d10) / 16.0d);
        }
        this.G = jCurrentTimeMillis;
        this.f4584w = xVar.l();
    }

    protected e(InetSocketAddress inetSocketAddress, InetSocketAddress inetSocketAddress2, long j10) {
        this.f4563b = null;
        this.f4564c = null;
        this.f4568g = null;
        this.f4569h = null;
        this.f4570i = null;
        this.f4571j = null;
        this.f4572k = null;
        this.f4573l = null;
        this.f4574m = null;
        this.f4575n = null;
        this.f4576o = -1;
        this.f4577p = 0;
        this.f4578q = 0L;
        this.f4579r = 0L;
        this.f4580s = 0L;
        this.f4581t = 0;
        this.f4582u = 0;
        this.f4583v = -1.0d;
        this.f4584w = 0L;
        this.f4585x = 0L;
        this.f4586y = 0L;
        this.f4587z = -1.0d;
        this.A = -1L;
        this.B = 0L;
        this.C = 0L;
        this.D = 0L;
        this.E = -1L;
        this.F = null;
        this.G = -1L;
        this.H = -1L;
        this.I = -1L;
        this.J = -1L;
        this.K = -1L;
        this.f4565d = inetSocketAddress;
        this.f4566e = inetSocketAddress2;
        this.f4567f = j10;
        this.f4562a = true;
    }
}
