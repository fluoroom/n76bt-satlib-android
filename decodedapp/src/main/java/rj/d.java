package rj;

import aj.m;
import kj.r0;

/* JADX INFO: loaded from: classes3.dex */
public class d extends f {

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private boolean f26164e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    private double f26165f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    private double f26166g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    private double f26167h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    private double f26168i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    private double f26169j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    private double f26170k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    private double f26171l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    private double f26172m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    private double f26173n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    private double f26174o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private double f26175p0;

    public d(e eVar, dj.c cVar, double d10, r0 r0Var) {
        super(eVar, cVar, d10, r0Var);
    }

    @Override // rj.f
    protected void R() {
        double d10;
        double d11;
        boolean z10 = this.P < 220.0d;
        this.f26164e0 = z10;
        if (z10) {
            d10 = 1.0d;
            d11 = 2.0d;
        } else {
            m mVarR = aj.d.R(this.f26197w.B());
            double d12 = this.X;
            double d13 = d12 * d12;
            double dA = (this.U * mVarR.a()) + 1.0d;
            this.f26165f0 = dA * dA * dA;
            double d14 = this.E;
            double d15 = this.T;
            double d16 = 4.0d * d14 * d15 * d13;
            this.f26166g0 = d16;
            d11 = 2.0d;
            double d17 = this.X;
            double d18 = ((d16 * d15) * d17) / 3.0d;
            d10 = 1.0d;
            double d19 = this.S;
            double d20 = ((17.0d * d14) + d19) * d18;
            this.f26167h0 = d20;
            double d21 = d18 * 0.5d * d14 * d15 * ((d14 * 221.0d) + (d19 * 31.0d)) * d17;
            this.f26168i0 = d21;
            this.f26169j0 = (d13 * 2.0d) + d16;
            this.f26170k0 = ((d20 * 3.0d) + (((d16 * 12.0d) + (10.0d * d13)) * d17)) * 0.25d;
            this.f26171l0 = ((d21 * 3.0d) + (d17 * 12.0d * d20) + (6.0d * d16 * d16) + (15.0d * d13 * ((d16 * 2.0d) + d13))) * 0.2d;
            this.f26172m0 = mVarR.b();
            if (this.f26197w.p() < 1.0E-4d) {
                this.f26173n0 = 0.0d;
                this.f26174o0 = 0.0d;
            } else {
                double dP = (((((this.V * this.T) * 0.004690139440023056d) * this.F) * 1.0d) * this.I) / this.f26197w.p();
                this.f26174o0 = (((this.V * (-0.6666666666666666d)) * this.f26197w.l()) * 1.0d) / this.R;
                this.f26173n0 = this.f26197w.l() * dP * aj.d.n(this.f26197w.G());
            }
        }
        double d22 = this.W * d11 * this.E * this.N;
        double d23 = this.Q;
        double d24 = this.R;
        this.f26175p0 = d22 * (((d23 + d24) * 2.75d) + d10 + (d24 * d23));
    }

    @Override // rj.f
    protected void S(double d10) {
        double dB = this.f26197w.B() + (this.J * d10);
        double dG = this.f26197w.G() + (this.K * d10);
        double dH = this.f26197w.H() + (this.L * d10);
        this.C = dG;
        double d11 = d10 * d10;
        this.f26199y = dH + (this.f26193a0 * d11);
        double d12 = 1.0d - (this.X * d10);
        e eVar = this.f26197w;
        double dM = eVar.m(eVar.getDate().a(d10)) * this.Z * d10;
        double d13 = this.f26194b0 * d11;
        if (!this.f26164e0) {
            double d14 = this.f26173n0 * d10;
            double dN = (this.U * aj.d.n(dB)) + 1.0d;
            double d15 = d14 + (this.f26174o0 * (((dN * dN) * dN) - this.f26165f0));
            double d16 = dB + d15;
            this.C = dG - d15;
            double d17 = d11 * d10;
            double d18 = d10 * d17;
            d12 = ((d12 - (this.f26166g0 * d11)) - (this.f26167h0 * d17)) - (this.f26168i0 * d18);
            e eVar2 = this.f26197w;
            dM += eVar2.m(eVar2.getDate().a(d10)) * this.f26175p0 * (aj.d.P(d16) - this.f26172m0);
            d13 = d13 + (this.f26169j0 * d17) + (d18 * (this.f26170k0 + (this.f26171l0 * d10)));
            dB = d16;
        }
        this.f26200z = this.E * d12 * d12;
        double dP = this.f26197w.p() - dM;
        this.A = dP;
        if (dP < 1.0E-6d) {
            this.A = 1.0E-6d;
        }
        this.D = dB + this.C + this.f26199y + (this.F * d13);
        this.B = this.f26197w.v();
    }
}
