package yj;

import java.io.IOException;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public class y implements Comparable, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f32771a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f32772b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final y f32756c = new y(0, 0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final y f32757d = new y(0, 1);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final y f32758e = new y(0, 1000);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final y f32759f = new y(0, 1000000);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final y f32760g = new y(0, 1000000000);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final y f32761h = new y(0, 1000000000000L);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final y f32762r = new y(0, 1000000000000000L);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final y f32763s = new y(1, 0);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final y f32764t = new y(60, 0);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final y f32765u = new y(3600, 0);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final y f32766v = new y(86400, 0);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final y f32767w = new y(86401, 0);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final y f32768x = new y(Double.NaN);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final y f32769y = new y(Double.NEGATIVE_INFINITY);

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final y f32770z = new y(Double.POSITIVE_INFINITY);
    private static final long[] A = {1, 10, 100, 1000, 10000, 100000, 1000000, 10000000, 100000000, 1000000000, 10000000000L, 100000000000L, 1000000000000L, 10000000000000L, 100000000000000L, 1000000000000000L, 10000000000000000L, 100000000000000000L, 1000000000000000000L};
    private static final ak.a B = new ak.a(1, false);
    private static final ak.a C = new ak.a(18, true);

    private static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private long f32773a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f32774b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f32775c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f32776d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f32777e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f32778f = 9;

        a() {
        }

        public void a(y yVar) {
            if (yVar.A()) {
                this.f32773a += yVar.f32771a;
                this.f32774b += yVar.f32772b;
                int i10 = this.f32778f - 1;
                this.f32778f = i10;
                if (i10 == 0) {
                    b();
                    return;
                }
                return;
            }
            if (yVar.G()) {
                this.f32777e = true;
            } else if (yVar.H()) {
                this.f32776d = true;
            } else {
                this.f32775c = true;
            }
        }

        public y b() {
            boolean z10;
            this.f32778f = 8;
            if (this.f32775c || ((z10 = this.f32777e) && this.f32776d)) {
                y yVar = y.f32768x;
                this.f32773a = yVar.f32771a;
                this.f32774b = yVar.f32772b;
                return yVar;
            }
            if (z10) {
                y yVar2 = y.f32769y;
                this.f32773a = yVar2.f32771a;
                this.f32774b = yVar2.f32772b;
                return yVar2;
            }
            if (this.f32776d) {
                y yVar3 = y.f32770z;
                this.f32773a = yVar3.f32771a;
                this.f32774b = yVar3.f32772b;
                return yVar3;
            }
            y yVar4 = new y(this.f32773a, this.f32774b);
            this.f32773a = yVar4.f32771a;
            this.f32774b = yVar4.f32772b;
            return yVar4;
        }
    }

    public y(y... yVarArr) {
        a aVar = new a();
        for (y yVar : yVarArr) {
            aVar.a(yVar);
        }
        y yVarB = aVar.b();
        this.f32771a = yVarB.x();
        this.f32772b = yVarB.v();
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0044, code lost:
    
        r7 = r27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static yj.y N(java.lang.String r28) {
        /*
            Method dump skipped, instruction units count: 355
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: yj.y.N(java.lang.String):yj.y");
    }

    public boolean A() {
        return this.f32772b >= 0;
    }

    public boolean C() {
        return H() || G();
    }

    public boolean D() {
        return this.f32772b == -255;
    }

    public boolean G() {
        return this.f32772b == -16711680;
    }

    public boolean H() {
        return this.f32772b == -65280;
    }

    public y K(long j10) {
        if (j10 < 0) {
            throw new hj.a(hj.f.NOT_POSITIVE, Long.valueOf(j10));
        }
        if (!A()) {
            return j10 == 0 ? f32768x : this;
        }
        y yVarL = this.f32771a < 0 ? L() : this;
        long j11 = j10 / 1000000000;
        long j12 = j10 - (j11 * 1000000000);
        long j13 = yVarL.f32771a;
        long j14 = j13 / 1000000000;
        long j15 = j13 - (j14 * 1000000000);
        long j16 = yVarL.f32772b;
        long j17 = j16 / 1000000000;
        long j18 = j16 - (j17 * 1000000000);
        long j19 = (j11 * j15) + (j12 * j14);
        long j20 = j15 * j12;
        long j21 = j11 * j17;
        long j22 = (j11 * j18) + (j17 * j12);
        long j23 = j22 / 1000000000;
        long j24 = j22 - (j23 * 1000000000);
        long j25 = j12 * j18;
        if (j11 * j14 != 0 || j19 / 1000000000 != 0) {
            throw new hj.a(ui.d.OVERFLOW_IN_MULTIPLICATION, Long.valueOf(yVarL.f32771a), Long.valueOf(j10));
        }
        y yVar = new y((j19 * 1000000000) + j20 + j21 + j23, (j24 * 1000000000) + j25);
        return this.f32771a < 0 ? yVar.L() : yVar;
    }

    public y L() {
        long j10 = this.f32772b;
        return j10 < 0 ? D() ? this : this.f32771a < 0 ? f32770z : f32769y : new y(-this.f32771a, -j10);
    }

    public y O(y yVar) {
        long j10 = this.f32772b;
        if (j10 >= 0) {
            long j11 = yVar.f32772b;
            if (j11 >= 0) {
                return new y(this.f32771a - yVar.f32771a, j10 - j11);
            }
        }
        return (D() || yVar.D() || (H() && yVar.H()) || (G() && yVar.G())) ? f32768x : C() ? this : yVar.H() ? f32769y : f32770z;
    }

    public double Q() {
        if (!A()) {
            if (D()) {
                return Double.NaN;
            }
            return aj.d.m(Double.POSITIVE_INFINITY, this.f32771a);
        }
        long j10 = this.f32771a;
        long j11 = this.f32772b;
        if (j11 > 500000000000000000L) {
            j10++;
            j11 -= 1000000000000000000L;
        }
        return j10 + (j11 / 1.0E18d);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass() == getClass()) {
            y yVar = (y) obj;
            if (this.f32771a == yVar.f32771a && this.f32772b == yVar.f32772b) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return o4.a.a(this.f32771a) ^ o4.a.a(this.f32772b);
    }

    public y j(y yVar) {
        a aVar = new a();
        aVar.a(this);
        aVar.a(yVar);
        return aVar.b();
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public int compareTo(y yVar) {
        if (A()) {
            if (!yVar.A()) {
                return yVar.G() ? 1 : -1;
            }
            long j10 = this.f32771a;
            long j11 = yVar.f32771a;
            return j10 == j11 ? Long.compare(this.f32772b, yVar.f32772b) : Long.compare(j10, j11);
        }
        if (D()) {
            return !yVar.D() ? 1 : 0;
        }
        if (yVar.D()) {
            return -1;
        }
        return Long.compare(this.f32771a, yVar.f32771a);
    }

    public y l(int i10) {
        if (i10 <= 0) {
            throw new hj.a(hj.f.NOT_STRICTLY_POSITIVE, Integer.valueOf(i10));
        }
        if (!A()) {
            return this;
        }
        long j10 = this.f32771a;
        long j11 = i10;
        long j12 = j10 / j11;
        long j13 = j10 - (j12 * j11);
        long j14 = 1000000000000000000L / j11;
        long j15 = 1000000000000000000L - (j14 * j11);
        y yVar = new y(0L, j12);
        return new y(yVar.K(j14).K(j11), yVar.K(j15), new y(0L, j13).K(j14), new y(0L, (this.f32772b + (j13 * j15)) / j11));
    }

    public String toString() {
        y yVarL;
        try {
            if (this.f32772b < 0) {
                return D() ? "NaN" : H() ? "+∞" : "-∞";
            }
            StringBuilder sb2 = new StringBuilder();
            if (this.f32771a < 0) {
                sb2.append('-');
                yVarL = L();
            } else {
                yVarL = this;
            }
            B.a(sb2, yVarL.f32771a);
            sb2.append('.');
            C.a(sb2, yVarL.f32772b);
            return sb2.toString();
        } catch (IOException e10) {
            throw new hj.e(e10);
        }
    }

    public long v() {
        return this.f32772b;
    }

    public y w(int i10) {
        if (this.f32772b < 0) {
            return f32756c;
        }
        long j10 = A[aj.d.E(18, aj.d.C(0, 18 - i10))];
        return new y(this.f32771a, ((this.f32772b + (j10 / 2)) / j10) * j10);
    }

    public long x() {
        return this.f32771a;
    }

    public y(long j10, long j11) {
        long j12 = j11 / 1000000000000000000L;
        long j13 = j11 - (j12 * 1000000000000000000L);
        if (j13 < 0) {
            this.f32771a = (j10 + j12) - 1;
            this.f32772b = j13 + 1000000000000000000L;
        } else {
            this.f32771a = j10 + j12;
            this.f32772b = j13;
        }
    }

    public y(double d10) {
        if (Double.isNaN(d10)) {
            this.f32771a = 0L;
            this.f32772b = -255L;
            return;
        }
        if (d10 < -9.223372036854776E18d || d10 > 9.223372036854776E18d) {
            if (d10 < 0.0d) {
                this.f32771a = Long.MIN_VALUE;
                this.f32772b = -16711680L;
                return;
            } else {
                this.f32771a = Long.MAX_VALUE;
                this.f32772b = -65280L;
                return;
            }
        }
        double dM = aj.d.M(d10);
        double d11 = d10 - dM;
        if (d11 < 0.0d) {
            this.f32771a = ((long) dM) - 1;
            this.f32772b = aj.d.N(d11 * 1.0E18d) + 1000000000000000000L;
        } else {
            this.f32771a = (long) dM;
            this.f32772b = aj.d.N(d11 * 1.0E18d);
        }
    }

    public y(long j10, y yVar) {
        this(j10 < 0 ? yVar.K(-j10).L() : yVar.K(j10));
    }

    public y(long j10, y yVar, long j11, y yVar2) {
        this(new y(j10, yVar).j(new y(j11, yVar2)));
    }

    private y(y yVar) {
        this.f32771a = yVar.f32771a;
        this.f32772b = yVar.f32772b;
    }
}
