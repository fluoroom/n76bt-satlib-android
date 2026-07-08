package rj;

import aj.k;
import aj.m;
import kj.r0;
import oj.l;
import yj.b0;
import zj.e1;
import zj.y0;

/* JADX INFO: loaded from: classes3.dex */
public abstract class f extends qj.e {
    protected double A;
    protected double B;
    protected double C;
    protected double D;
    protected double E;
    protected double F;
    protected double G;
    protected double H;
    protected double I;
    protected double J;
    protected double K;
    protected double L;
    protected double M;
    protected double N;
    protected double O;
    protected double P;
    protected double Q;
    protected double R;
    protected double S;
    protected double T;
    protected double U;
    protected double V;
    protected double W;
    protected double X;
    protected double Y;
    protected double Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    protected double f26193a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    protected double f26194b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private final r0 f26195c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private e1 f26196d0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    protected e f26197w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    protected final b0 f26198x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    protected double f26199y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    protected double f26200z;

    protected f(e eVar, dj.c cVar, double d10, r0 r0Var) {
        super(cVar);
        t(eVar.getDate());
        this.f26198x = eVar.K();
        L(eVar);
        this.f26195c0 = r0Var;
        this.f26196d0 = new e1(new k(this.f26197w, Double.valueOf(d10)));
        l lVarE = E(eVar.getDate());
        super.r(new pj.d(lVarE, cVar.h(lVarE, lVarE.getDate(), lVarE.I())).w(d10));
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00d9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private zj.y0 G() {
        /*
            Method dump skipped, instruction units count: 561
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: rj.f.G():zj.y0");
    }

    public static sj.b H(b0 b0Var, r0 r0Var) {
        return new sj.a(1.0E-10d, 100, 1.0d, b0Var, r0Var);
    }

    public static double I() {
        return 3.9860079999999994E14d;
    }

    private void K() {
        double d10;
        m mVarR = aj.d.R(this.f26197w.v());
        double dI = aj.d.I(0.07436691613317341d / (this.f26197w.C() * 60.0d), 0.6666666666666666d);
        double dA = mVarR.a();
        this.G = dA;
        double d11 = dA * dA;
        this.H = d11;
        double d12 = (d11 * 3.0d) - 1.0d;
        double dP = this.f26197w.p() * this.f26197w.p();
        this.M = dP;
        double d13 = 1.0d - dP;
        this.N = d13;
        double dU = aj.d.U(d13);
        this.O = dU;
        double d14 = (8.119620000000001E-4d * d12) / (dU * this.N);
        double d15 = d14 / (dI * dI);
        double d16 = dI * (1.0d - (d15 * ((((1.654320987654321d * d15) + 1.0d) * d15) + 0.3333333333333333d)));
        double d17 = d14 / (d16 * d16);
        this.F = (this.f26197w.C() * 60.0d) / (d17 + 1.0d);
        double d18 = d16 / (1.0d - d17);
        this.E = d18;
        this.S = 1.0122292801892716d;
        double dP2 = ((d18 * (1.0d - this.f26197w.p())) - 1.0d) * 6378.135d;
        this.P = dP2;
        if (dP2 < 156.0d) {
            if (dP2 <= 98.0d) {
                this.S = 20.0d;
            } else {
                this.S = dP2 - 78.0d;
            }
            double d19 = this.S;
            double d20 = ((120.0d - d19) * 1.0d) / 6378.135d;
            double d21 = d20 * d20;
            d10 = d21 * d21;
            this.S = (d19 / 6378.135d) + 1.0d;
        } else {
            d10 = 1.8802791590152705E-9d;
        }
        double d22 = this.E;
        double d23 = 1.0d / (this.N * d22);
        double d24 = d23 * d23;
        this.T = 1.0d / (d22 - this.S);
        double dP3 = d22 * this.f26197w.p() * this.T;
        this.U = dP3;
        this.Q = dP3 * dP3;
        this.R = this.f26197w.p() * this.U;
        double dB = aj.d.b(1.0d - this.Q);
        double d25 = this.T;
        double d26 = d25 * d25;
        double d27 = d10 * d26 * d26;
        this.V = d27;
        double dI2 = d27 / aj.d.I(dB, 3.5d);
        this.W = dI2;
        double d28 = dI2 * this.F;
        double d29 = this.E;
        double d30 = this.Q;
        this.Y = d28 * ((d29 * ((d30 * 1.5d) + 1.0d + (this.R * (d30 + 4.0d)))) + (((this.T * 4.0598100000000003E-4d) / dB) * d12 * ((d30 * 3.0d * (d30 + 8.0d)) + 8.0d)));
        this.X = this.f26197w.l() * this.Y;
        this.I = mVarR.b();
        double d31 = 1.0d - this.H;
        double d32 = this.F * 2.0d * this.W * this.E * this.N;
        double d33 = this.U * ((this.Q * 0.5d) + 2.0d);
        double dP4 = this.f26197w.p();
        double d34 = this.Q;
        double d35 = d33 + (dP4 * ((d34 * 2.0d) + 0.5d));
        double d36 = (this.T * 0.001082616d) / (this.E * dB);
        double d37 = this.R;
        this.Z = d32 * (d35 - (d36 * ((((-3.0d) * d12) * ((1.0d - (d37 * 2.0d)) + ((1.5d - (d37 * 0.5d)) * d34))) + (((d31 * 0.75d) * ((d34 * 2.0d) - (d37 * (d34 + 1.0d)))) * aj.d.n(this.f26197w.G() * 2.0d)))));
        double d38 = this.H;
        double d39 = d38 * d38;
        double d40 = this.F;
        double d41 = 0.0016239240000000001d * d24 * d40;
        double d42 = 5.41308E-4d * d41 * d24;
        double d43 = 7.762359374999998E-7d * d24 * d24 * d40;
        double d44 = this.O;
        double d45 = 0.0625d * d42;
        this.J = d40 + (d41 * 0.5d * d44 * d12) + (d44 * d45 * ((13.0d - (78.0d * d38)) + (137.0d * d39)));
        this.K = ((-0.5d) * d41 * (1.0d - (5.0d * d38))) + (d45 * ((7.0d - (114.0d * d38)) + (395.0d * d39))) + (((3.0d - (36.0d * d38)) + (d39 * 49.0d)) * d43);
        double d46 = this.G;
        double d47 = (-d41) * d46;
        this.L = (((d42 * 0.5d * (4.0d - (19.0d * d38))) + (d43 * 2.0d * (3.0d - (d38 * 7.0d)))) * d46) + d47;
        double d48 = this.N * 3.5d * d47;
        double d49 = this.X;
        this.f26193a0 = d48 * d49;
        this.f26194b0 = d49 * 1.5d;
    }

    private void L(e eVar) {
        this.f26197w = eVar;
        K();
        R();
    }

    private void M(pj.d dVar) {
        L(H(this.f26198x, this.f26195c0).a(dVar, this.f26197w));
    }

    public static f N(e eVar) {
        return P(eVar, gj.c.a().c().i());
    }

    public static f O(e eVar, dj.c cVar, double d10, r0 r0Var) {
        double dI = aj.d.I(0.07436691613317341d / (eVar.C() * 60.0d), 0.6666666666666666d);
        double dN = aj.d.n(eVar.v());
        double dI2 = (((3.0d * dN) * dN) - 1.0d) * 8.119620000000001E-4d * aj.d.I(1.0d - (eVar.p() * eVar.p()), -1.5d);
        double d11 = dI2 / (dI * dI);
        double d12 = dI * (1.0d - (d11 * (((((134.0d * d11) / 81.0d) + 1.0d) * d11) + 0.3333333333333333d)));
        return 6.283185307179586d / (((eVar.C() * 60.0d) / ((dI2 / (d12 * d12)) + 1.0d)) * 1440.0d) >= 0.15625d ? new a(eVar, cVar, d10, r0Var) : new d(eVar, cVar, d10, r0Var);
    }

    public static f P(e eVar, r0 r0Var) {
        return Q(eVar, r0Var, dj.d.d(r0Var));
    }

    public static f Q(e eVar, r0 r0Var, dj.c cVar) {
        return O(eVar, cVar, 1000.0d, r0Var);
    }

    @Override // qj.e
    protected double D(yj.b bVar) {
        return ((Double) ((k) this.f26196d0.e(bVar)).b()).doubleValue();
    }

    @Override // qj.e
    public l E(yj.b bVar) {
        e eVar = (e) ((k) this.f26196d0.e(bVar)).a();
        if (!this.f26197w.equals(eVar)) {
            L(eVar);
        }
        return new oj.a(J(bVar), this.f26195c0, bVar, 3.9860079999999994E14d);
    }

    @Override // qj.e
    protected void F(pj.d dVar, boolean z10) {
        M(dVar);
        k kVar = new k(this.f26197w, Double.valueOf(dVar.k()));
        if (z10) {
            this.f26196d0.a(kVar, dVar.getDate(), false);
        } else {
            this.f26196d0.b(kVar, dVar.getDate(), false);
        }
        u(dVar);
    }

    public y0 J(yj.b bVar) {
        S(bVar.X(this.f26197w.getDate()) / 60.0d);
        return G();
    }

    protected abstract void R();

    protected abstract void S(double d10);
}
