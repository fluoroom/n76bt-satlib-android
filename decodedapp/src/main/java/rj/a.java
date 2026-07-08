package rj;

import aj.j;
import aj.m;
import kj.r0;

/* JADX INFO: loaded from: classes3.dex */
public class a extends c {
    private double A0;
    private double B0;
    private double C0;
    private double D0;
    private double E0;
    private double F0;
    private double G0;
    private double H0;
    private double I0;
    private double J0;
    private double K0;
    private double L0;
    private double M0;
    private double N0;
    private double O0;
    private double P0;
    private double Q0;
    private double R0;
    private double S0;
    private double T0;
    private double U0;
    private double V0;
    private double W0;
    private double X0;
    private double Y0;
    private double Z0;

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    private double f26115a1;

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    private double f26116b1;

    /* JADX INFO: renamed from: c1, reason: collision with root package name */
    private double f26117c1;

    /* JADX INFO: renamed from: d1, reason: collision with root package name */
    private double f26118d1;

    /* JADX INFO: renamed from: e1, reason: collision with root package name */
    private double f26119e1;

    /* JADX INFO: renamed from: f1, reason: collision with root package name */
    private double f26120f1;

    /* JADX INFO: renamed from: g1, reason: collision with root package name */
    private double f26121g1;

    /* JADX INFO: renamed from: h1, reason: collision with root package name */
    private double f26122h1;

    /* JADX INFO: renamed from: i1, reason: collision with root package name */
    private double f26123i1;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    private double f26124j0;

    /* JADX INFO: renamed from: j1, reason: collision with root package name */
    private double f26125j1;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    private double f26126k0;

    /* JADX INFO: renamed from: k1, reason: collision with root package name */
    private double f26127k1;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    private double f26128l0;

    /* JADX INFO: renamed from: l1, reason: collision with root package name */
    private double f26129l1;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    private double f26130m0;

    /* JADX INFO: renamed from: m1, reason: collision with root package name */
    private double f26131m1;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    private double f26132n0;

    /* JADX INFO: renamed from: n1, reason: collision with root package name */
    private double f26133n1;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    private double f26134o0;

    /* JADX INFO: renamed from: o1, reason: collision with root package name */
    private double f26135o1;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private double f26136p0;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    private double f26137p1;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    private double f26138q0;

    /* JADX INFO: renamed from: q1, reason: collision with root package name */
    private double f26139q1;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    private double f26140r0;

    /* JADX INFO: renamed from: r1, reason: collision with root package name */
    private double f26141r1;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    private double f26142s0;

    /* JADX INFO: renamed from: s1, reason: collision with root package name */
    private double f26143s1;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    private double f26144t0;

    /* JADX INFO: renamed from: t1, reason: collision with root package name */
    private double f26145t1;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    private double f26146u0;

    /* JADX INFO: renamed from: u1, reason: collision with root package name */
    private double f26147u1;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    private double f26148v0;

    /* JADX INFO: renamed from: v1, reason: collision with root package name */
    private double[] f26149v1;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    private double f26150w0;

    /* JADX INFO: renamed from: w1, reason: collision with root package name */
    private boolean f26151w1;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    private double f26152x0;

    /* JADX INFO: renamed from: x1, reason: collision with root package name */
    private boolean f26153x1;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    private double f26154y0;

    /* JADX INFO: renamed from: y1, reason: collision with root package name */
    private boolean f26155y1;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    private double f26156z0;

    public a(e eVar, dj.c cVar, double d10, r0 r0Var) {
        super(eVar, cVar, d10, r0Var);
        this.f26155y1 = true;
    }

    private void X() {
        m mVarR = aj.d.R(this.f26133n1);
        double dB = mVarR.b();
        double dA = mVarR.a();
        double d10 = dB * 2.0d * dA;
        double d11 = ((dA * 2.0d) * dA) - 1.0d;
        if (this.f26153x1) {
            double d12 = (d10 * dA) + (d11 * dB);
            double d13 = (d11 * dA) - (d10 * dB);
            double d14 = this.f26125j1;
            double d15 = this.f26127k1;
            double d16 = this.f26129l1;
            double d17 = ((d12 * 0.43258117585763334d) - (d13 * 0.9015949901666642d)) * d16;
            double[] dArr = this.f26149v1;
            dArr[0] = (((dB * 0.9913913426848859d) - (dA * 0.130932065016401d)) * d14) + (((d10 * 0.8705163875297294d) - (d11 * (-0.49213943048915526d))) * d15) + d17;
            dArr[1] = (d14 * ((dA * 0.9913913426848859d) + (dB * 0.130932065016401d))) + (d15 * 2.0d * ((d11 * 0.8705163875297294d) + (d10 * (-0.49213943048915526d)))) + (d16 * 3.0d * ((d13 * 0.43258117585763334d) + (d12 * 0.9015949901666642d)));
            return;
        }
        m mVarR2 = aj.d.R(this.f26128l0 + (this.K * this.f26137p1));
        double dB2 = mVarR2.b();
        double dA2 = mVarR2.a();
        double d18 = dB * dA2;
        double d19 = dB2 * dA;
        double d20 = d18 - d19;
        double d21 = d18 + d19;
        double d22 = dA * dA2;
        double d23 = dB2 * dB;
        double d24 = d22 + d23;
        double d25 = d22 - d23;
        double d26 = dB2 * 2.0d * dA2;
        double d27 = ((dA2 * 2.0d) * dA2) - 1.0d;
        double d28 = d10 * dA2;
        double d29 = dB2 * d11;
        double d30 = d28 - d29;
        double d31 = d28 + d29;
        double d32 = dA2 * d11;
        double d33 = dB2 * d10;
        double d34 = d32 + d33;
        double d35 = d32 - d33;
        double d36 = (d10 * d27) + (d26 * d11);
        double d37 = (d11 * d27) - (d26 * d10);
        double d38 = (dB * d27) + (d26 * dA);
        double d39 = (d27 * dA) - (d26 * dB);
        double d40 = this.H0;
        double d41 = this.I0;
        double d42 = (((d38 * 0.8705163875297294d) - (d39 * (-0.49213943048915526d))) * d40) + (((dB * 0.8705163875297294d) - (dA * (-0.49213943048915526d))) * d41);
        double d43 = this.J0;
        double d44 = d42 + (((d21 * 0.5797219018700115d) - (d25 * 0.8148144061638924d)) * d43);
        double d45 = this.K0;
        double d46 = d44 + (((d20 * 0.5797219018700115d) - (d24 * 0.8148144061638924d)) * d45);
        double d47 = this.N0;
        double d48 = d46 + (((d21 * 0.496848311798842d) - (d25 * 0.8678374012812773d)) * d47);
        double d49 = this.O0;
        double d50 = d48 + (((d20 * 0.496848311798842d) - (d24 * 0.8678374012812773d)) * d49);
        double d51 = this.L0;
        double d52 = ((d36 * (-0.22866241528815548d)) - (d37 * 0.9735057780180799d)) * d51;
        double d53 = this.M0;
        double d54 = d52 + (((d10 * (-0.22866241528815548d)) - (d11 * 0.9735057780180799d)) * d53);
        double d55 = this.P0;
        double d56 = d54 + (((d31 * (-0.29695209575316894d)) - (d35 * (-0.9548923776153d))) * d55);
        double d57 = this.Q0;
        double d58 = d56 + (((d30 * (-0.29695209575316894d)) - (d34 * (-0.9548923776153d))) * d57);
        double d59 = (d40 * ((d39 * 0.8705163875297294d) + (d38 * (-0.49213943048915526d)))) + (d41 * ((0.8705163875297294d * dA) + ((-0.49213943048915526d) * dB))) + (((d25 * 0.5797219018700115d) + (d21 * 0.8148144061638924d)) * d43) + (d45 * ((0.5797219018700115d * d24) + (0.8148144061638924d * d20))) + (d47 * ((d25 * 0.496848311798842d) + (d21 * 0.8678374012812773d))) + (d49 * ((d24 * 0.496848311798842d) + (d20 * 0.8678374012812773d)));
        double d60 = ((d51 * ((d37 * (-0.22866241528815548d)) + (d36 * 0.9735057780180799d))) + (d53 * ((d11 * (-0.22866241528815548d)) + (d10 * 0.9735057780180799d))) + (((d35 * (-0.29695209575316894d)) + (d31 * (-0.9548923776153d))) * d55) + (d57 * ((d34 * (-0.29695209575316894d)) + (d30 * (-0.9548923776153d))))) * 2.0d;
        double[] dArr2 = this.f26149v1;
        dArr2[0] = d50 + d58;
        dArr2[1] = d59 + d60;
    }

    @Override // rj.c
    protected void T(double d10) {
        if (aj.d.b(this.f26146u0 - d10) >= 30.0d || this.f26155y1) {
            this.f26146u0 = d10;
            double d11 = this.f26144t0 + (1.19459E-5d * d10);
            m mVarR = aj.d.R(d11 + (aj.d.P(d11) * 0.0335d));
            double dB = mVarR.b();
            double d12 = ((dB * 0.5d) * dB) - 0.25d;
            double dA = dB * (-0.5d) * mVarR.a();
            double d13 = (this.X0 * d12) + (this.f26117c1 * dA);
            double d14 = (this.Y0 * d12) + (this.f26118d1 * dA);
            double d15 = (this.Z0 * d12) + (this.f26119e1 * dA) + (this.f26122h1 * dB);
            double d16 = (this.f26115a1 * d12) + (this.f26120f1 * dA) + (this.f26123i1 * dB);
            double d17 = (this.f26116b1 * d12) + (this.f26121g1 * dA);
            double d18 = this.f26138q0 + (1.5835218E-4d * d10);
            m mVarR2 = aj.d.R(d18 + (aj.d.P(d18) * 0.1098d));
            double dB2 = mVarR2.b();
            double d19 = ((dB2 * 0.5d) * dB2) - 0.25d;
            double dA2 = dB2 * (-0.5d) * mVarR2.a();
            double d20 = (this.f26148v0 * d19) + (this.f26150w0 * dA2);
            double d21 = (this.f26152x0 * d19) + (this.f26154y0 * dA2);
            double d22 = (this.f26156z0 * d19) + (this.A0 * dA2) + (this.B0 * dB2);
            double d23 = (this.C0 * d19) + (this.D0 * dA2) + (this.E0 * dB2);
            double d24 = (this.F0 * d19) + (this.G0 * dA2);
            this.f26139q1 = d13 + d20;
            this.f26141r1 = d14 + d21;
            this.f26143s1 = d15 + d22;
            this.f26145t1 = d16 + d23;
            this.f26147u1 = d17 + d24;
        }
        double d25 = this.f26163i0 + this.f26141r1;
        this.f26163i0 = d25;
        m mVarR3 = aj.d.R(d25);
        double dB3 = mVarR3.b();
        double dA3 = mVarR3.a();
        this.f26162h0 += this.f26139q1;
        this.f26161g0 += this.f26143s1;
        this.f26159e0 += this.f26145t1;
        double dF = j.f(this.f26163i0, 0.0d);
        this.f26163i0 = dF;
        if (aj.d.b(dF) >= 0.2d) {
            double d26 = this.f26147u1 / dB3;
            this.f26159e0 -= dA3 * d26;
            this.f26199y += d26;
            return;
        }
        m mVarR4 = aj.d.R(this.f26199y);
        double dB4 = mVarR4.b();
        double dA4 = mVarR4.a();
        double d27 = this.f26147u1;
        double d28 = this.f26141r1;
        double dF2 = j.f(aj.d.j((d27 * dA4) + (((d28 * dA3) + dB3) * dB4), ((-d27) * dB4) + (((d28 * dA3) + dB3) * dA4)) - this.f26199y, 0.0d);
        double d29 = this.f26199y;
        this.f26159e0 += (((-d29) * dB3) * this.f26141r1) - (dA3 * dF2);
        this.f26199y = d29 + dF2;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x006d A[PHI: r6
      0x006d: PHI (r6v5 double) = (r6v0 double), (r6v1 double) binds: [B:12:0x006b, B:15:0x0076] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // rj.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void U(double r18) {
        /*
            Method dump skipped, instruction units count: 210
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: rj.a.U(double):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x07b6  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0838  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0a25  */
    @Override // rj.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void V() {
        /*
            Method dump skipped, instruction units count: 2618
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: rj.a.V():void");
    }
}
