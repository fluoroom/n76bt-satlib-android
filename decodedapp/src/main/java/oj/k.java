package oj;

import java.lang.reflect.Array;
import kj.r0;
import yj.y;
import zj.k1;
import zj.y0;

/* JADX INFO: loaded from: classes3.dex */
public class k extends l {
    private final double A;
    private final double B;
    private final double C;
    private final double D;
    private final double E;
    private final double F;
    private final n G;
    private y0 H;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final double f23618u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final double f23619v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final double f23620w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final double f23621x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final double f23622y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final double f23623z;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f23624a;

        static {
            int[] iArr = new int[n.values().length];
            f23624a = iArr;
            try {
                iArr[n.MEAN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f23624a[n.TRUE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f23624a[n.ECCENTRIC.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public k(double d10, double d11, double d12, double d13, double d14, double d15, n nVar, n nVar2, r0 r0Var, yj.b bVar, double d16) {
        this(d10, d11, d12, d13, d14, d15, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, l0(nVar, d10, d11, d16, d15, nVar), nVar, nVar2, r0Var, bVar, d16);
    }

    private ri.h C0(double d10, double d11, n nVar) {
        if (this.G == nVar) {
            return new ri.h(d10, d11);
        }
        ri.h hVar = new ri.h(this.f23619v, this.B);
        ri.h hVar2 = new ri.h(d10, d11);
        if (this.f23618u < 0.0d) {
            int i10 = a.f23624a[this.G.ordinal()];
            if (i10 == 1) {
                return nVar == n.ECCENTRIC ? (ri.h) h.h(hVar, hVar2) : (ri.h) h.m(hVar, hVar2);
            }
            if (i10 == 2) {
                return nVar == n.MEAN ? (ri.h) h.k(hVar, hVar2) : (ri.h) h.i(hVar, hVar2);
            }
            if (i10 == 3) {
                return nVar == n.MEAN ? (ri.h) h.j(hVar, hVar2) : (ri.h) h.l(hVar, hVar2);
            }
        } else {
            int i11 = a.f23624a[this.G.ordinal()];
            if (i11 == 1) {
                return nVar == n.ECCENTRIC ? (ri.h) h.b(hVar, hVar2) : (ri.h) h.g(hVar, hVar2);
            }
            if (i11 == 2) {
                return nVar == n.MEAN ? (ri.h) h.e(hVar, hVar2) : (ri.h) h.c(hVar, hVar2);
            }
            if (i11 == 3) {
                return nVar == n.MEAN ? (ri.h) h.d(hVar, hVar2) : (ri.h) h.f(hVar, hVar2);
            }
        }
        throw new hj.e(null);
    }

    private xi.f[] D0() {
        aj.m mVarR = aj.d.R(this.f23622y);
        aj.m mVarR2 = aj.d.R(this.f23621x);
        aj.m mVarR3 = aj.d.R(this.f23620w);
        double dA = mVarR.a();
        double dB = mVarR.b();
        double dA2 = mVarR2.a();
        double dB2 = mVarR2.b();
        double dA3 = mVarR3.a();
        double dB3 = mVarR3.b();
        double d10 = dA * dA2;
        double d11 = dA * dB2;
        double d12 = dB * dA2;
        double d13 = dB * dB2;
        return new xi.f[]{new xi.f(d10 - (dA3 * d13), d12 + (dA3 * d11), dB3 * dB2), new xi.f((-d11) - (d12 * dA3), (-d13) + (dA3 * d10), dB3 * dA2)};
    }

    private void e0(String str, double d10, double d11, double d12) {
        if (d10 < d11 || d10 > d12) {
            throw new hj.a(hj.f.INVALID_PARAMETER_RANGE, str, Double.valueOf(d10), Double.valueOf(d11), Double.valueOf(d12));
        }
    }

    private double[][] f0() {
        double[][] dArrH0 = h0();
        aj.m mVarR = aj.d.R(r0());
        double dA = 1.0d / (1.0d - (this.f23619v * mVarR.a()));
        double[] dArr = dArrH0[1];
        double[] dArr2 = dArrH0[5];
        for (int i10 = 0; i10 < dArr2.length; i10++) {
            dArr2[i10] = (dArr2[i10] + (mVarR.b() * dArr[i10])) * dA;
        }
        return dArrH0;
    }

    private double[][] g0() {
        double[][] dArrI0 = i0();
        double dR0 = r0();
        double dP = aj.d.p(dR0);
        double dT = aj.d.T(dR0);
        double d10 = 1.0d / ((this.f23619v * dP) - 1.0d);
        double[] dArr = dArrI0[1];
        double[] dArr2 = dArrI0[5];
        for (int i10 = 0; i10 < dArr2.length; i10++) {
            dArr2[i10] = (dArr2[i10] - (dArr[i10] * dT)) * d10;
        }
        return dArrI0;
    }

    private double[][] h0() {
        double[][] dArr = (double[][]) Array.newInstance((Class<?>) Double.TYPE, 6, 6);
        m0();
        xi.f fVarT = this.H.t();
        xi.f fVarS = this.H.s();
        xi.f fVarP = this.H.p();
        double dI = fVarS.i();
        double dI2 = fVarT.i();
        double dU = aj.d.U(dI2);
        double d10 = dU * dI2;
        double dJ = fVarT.j();
        double dK = fVarT.k();
        double dL = fVarT.l();
        double dJ2 = fVarS.j();
        double dK2 = fVarS.k();
        double dL2 = fVarS.l();
        double dJ3 = fVarP.j();
        double dK3 = fVarP.k();
        double dL3 = fVarP.l();
        double dS = S();
        double dU2 = aj.d.U(this.f23618u * dS);
        double dU3 = aj.d.U(this.f23618u / dS);
        double d11 = this.f23618u;
        double d12 = d11 * d11;
        double d13 = d11 * 2.0d;
        double d14 = dU / d11;
        double d15 = this.f23619v;
        double d16 = 1.0d - (d15 * d15);
        double dU4 = 1.0d / aj.d.U(d16);
        aj.m mVarR = aj.d.R(this.f23620w);
        aj.m mVarR2 = aj.d.R(this.f23621x);
        double dA = mVarR.a();
        double dB = mVarR.b();
        double dA2 = mVarR2.a();
        double dB2 = mVarR2.b();
        double dF = xi.f.f(fVarT, fVarS);
        double d17 = this.f23618u;
        double d18 = this.f23619v;
        double d19 = (d17 - dU) / (d17 * d18);
        double d20 = dF / (d18 * dU2);
        double d21 = d12 * 2.0d;
        xi.f fVar = new xi.f(d21 / d10, fVarT);
        xi.f fVarU = fVarS.U(d21 / dS);
        l.A(1.0d, fVar, dArr[0], 0);
        l.A(1.0d, fVarU, dArr[0], 3);
        double d22 = d20 / dU2;
        double d23 = -(dF / d13);
        double d24 = (d23 * d20) / dU2;
        xi.f fVar2 = new xi.f((d19 * dI) / (dU * dS), fVarT, d22, fVarS, d24, fVar);
        xi.f fVar3 = new xi.f(d22, fVarT, ((d19 * 2.0d) * dU) / dS, fVarS, d24, fVarU);
        l.A(1.0d, fVar2, dArr[1], 0);
        l.A(1.0d, fVar3, dArr[1], 3);
        double d25 = d19 / (this.f23619v * dU2);
        double d26 = -d20;
        double d27 = d23 * d25;
        xi.f fVar4 = new xi.f((dI * d26) / ((this.f23619v * dU) * dS), fVarT, d25, fVarS, d27, fVar);
        xi.f fVar5 = new xi.f(((d26 * 2.0d) * dU) / (this.f23619v * dS), fVarS, d25, fVarT, d27, fVarU);
        double d28 = d26 * dL;
        double d29 = (d28 / dU) - ((d19 * dL2) * dU3);
        double d30 = 2.0d * dU2;
        double d31 = (d26 * dL2) / d30;
        double d32 = dU4 * (((d19 * dL) / dU) - ((d20 * dL2) * dU3));
        double d33 = this.f23619v;
        double d34 = (((d19 - d33) * dU4) * dL2) / d30;
        double d35 = dU4 * ((((d33 * dB) * dA2) * dU4) - (dL2 * dU3));
        xi.f fVar6 = xi.f.f32237r;
        xi.f fVar7 = new xi.f(d19 / dU, fVar6, d29, fVar4, ((-d19) * dL) / d10, fVarT, d31, fVar);
        xi.f fVar8 = new xi.f(d26 * dU3, fVar6, d29, fVar5, d31, fVarU);
        xi.f fVarA = new xi.f((d20 * dU4) / dU, fVar6).a(new xi.f(d32, fVar4, dU4 * (d28 / d10), fVarT, d34, fVar, d35, fVar2));
        xi.f fVar9 = new xi.f(dU4 * (d19 - this.f23619v) * dU3, fVar6, d32, fVar5, d34, fVarU, d35, fVar3);
        double d36 = ((-dB) * dU4) / dU2;
        double d37 = ((-d36) * dL3) / d13;
        double d38 = ((dL3 * d36) * this.f23619v) / d16;
        double d39 = dA * dB2;
        double d40 = dA * dA2;
        l.w(d36, new xi.f(dK2, -dJ2, 0.0d), d37, fVar, d38, fVar2, d39, fVar7, d40, fVarA, dArr[2], 0);
        l.w(d36, new xi.f(-dK, dJ, 0.0d), d37, fVarU, d38, fVar3, d39, fVar8, d40, fVar9, dArr[2], 3);
        double d41 = dA2 / dB;
        double d42 = (-dB2) / dB;
        l.z(d41, fVar7, d42, fVarA, dArr[3], 0);
        l.z(d41, fVar8, d42, fVar9, dArr[3], 3);
        double d43 = 1.0d / ((((dS * this.f23618u) * d16) * dB) * dB);
        double d44 = (-d43) * dK3;
        double d45 = d43 * dJ3;
        l.z(d44, new xi.f(0.0d, dL2, -dK2), d45, new xi.f(-dL2, 0.0d, dJ2), dArr[4], 0);
        l.z(d44, new xi.f(0.0d, -dL, dK), d45, new xi.f(dL, 0.0d, -dJ), dArr[4], 3);
        l.z(d14, fVar4, d26, fVar2, dArr[5], 0);
        l.z(d14, fVar5, d26, fVar3, dArr[5], 3);
        return dArr;
    }

    private double[][] i0() {
        double[][] dArr = (double[][]) Array.newInstance((Class<?>) Double.TYPE, 6, 6);
        m0();
        xi.f fVarT = this.H.t();
        xi.f fVarS = this.H.s();
        xi.f fVarP = this.H.p();
        double dI = fVarT.i();
        double dU = aj.d.U(dI);
        double dJ = fVarT.j();
        double dK = fVarT.k();
        double dL = fVarT.l();
        double dJ2 = fVarS.j();
        double dK2 = fVarS.k();
        double dL2 = fVarS.l();
        double dJ3 = fVarP.j();
        double dK3 = fVarP.k();
        double dL3 = fVarP.l();
        double dS = S();
        double d10 = -this.f23618u;
        double d11 = d10 * dS;
        double dU2 = aj.d.U(d11);
        double d12 = this.f23618u;
        double d13 = dU / d10;
        aj.m mVarR = aj.d.R(this.f23620w);
        double dA = mVarR.a();
        double dB = mVarR.b();
        double dF = xi.f.f(fVarT, fVarS);
        double d14 = d12 * d12 * (-2.0d);
        xi.f fVar = new xi.f(d14 / (dU * dI), fVarT);
        xi.f fVarU = fVarS.U(d14 / dS);
        l.A(-1.0d, fVar, dArr[0], 0);
        l.A(-1.0d, fVarU, dArr[0], 3);
        double dI2 = fVarP.I();
        double d15 = 1.0d / dI2;
        xi.f fVar2 = new xi.f(0.0d, dL2, -dK2);
        xi.f fVar3 = new xi.f(-dL2, 0.0d, dJ2);
        xi.f fVar4 = new xi.f(dK2, -dJ2, 0.0d);
        xi.f fVar5 = new xi.f(0.0d, -dL, dK);
        double d16 = -dJ;
        xi.f fVar6 = new xi.f(dL, 0.0d, d16);
        xi.f fVar7 = new xi.f(-dK, dJ, 0.0d);
        double d17 = dJ3 * d15;
        double d18 = dK3 * d15;
        double d19 = dL3 * d15;
        xi.f fVar8 = new xi.f(d17, fVar2, d18, fVar3, d19, fVar4);
        xi.f fVar9 = new xi.f(d17, fVar5, d18, fVar6, d19, fVar7);
        double d20 = dI2 / dS;
        double d21 = d20 * 2.0d;
        xi.f fVar10 = new xi.f(d21, fVar8);
        xi.f fVar11 = new xi.f(d21, fVar9);
        double d22 = dI2 * d20;
        double d23 = d10 * 2.0d;
        double d24 = 1.0d / (this.f23619v * d23);
        double d25 = ((-d22) / d10) * d24;
        l.z(d24, fVar10, d25, fVar, dArr[1], 0);
        l.z(d24, fVar11, d25, fVarU, dArr[1], 3);
        double d26 = 1.0d / (dI2 * dB);
        double d27 = dA * d26;
        double d28 = -d26;
        l.z(d27, fVar8, d28, fVar4, dArr[2], 0);
        l.z(d27, fVar9, d28, fVar7, dArr[2], 3);
        double d29 = dK * d15;
        double d30 = d16 * d15;
        double d31 = -((dJ3 * d29) + (dK3 * d30));
        double d32 = d31 * d15;
        double d33 = (-1.0d) / ((dI * dB) * dB);
        double d34 = dL * d33;
        double d35 = d31 * d33;
        double d36 = -dK3;
        xi.f fVar12 = new xi.f(d29, fVar2, d30, fVar3, d32, fVar8, d15, new xi.f(d36, dJ3, 0.0d));
        xi.f fVar13 = new xi.f(d29, fVar5, d30, fVar6, d32, fVar9);
        xi.f fVar14 = new xi.f(d34, fVar12, d35, xi.f.f32237r);
        xi.f fVar15 = new xi.f(d34, fVar13);
        double d37 = this.f23619v;
        double d38 = dI * d37 * d37;
        double d39 = (d22 - dU) / d38;
        double d40 = (dF * d20) / d38;
        double d41 = dF / dS;
        xi.f fVar16 = new xi.f(d20, fVarS, d41, fVar8);
        xi.f fVar17 = new xi.f(d20, fVarT, d41, fVar9);
        double d42 = -d40;
        xi.f fVar18 = new xi.f(d42, fVar10, d39, fVar16, d40 / dU, fVarT);
        xi.f fVar19 = new xi.f(d42, fVar11, d39, fVar17);
        l.z(1.0d, fVar14, -1.0d, fVar18, dArr[3], 0);
        l.z(1.0d, fVar15, -1.0d, fVar19, dArr[3], 3);
        double d43 = d26 * d26;
        double d44 = dJ3 * d43;
        double d45 = d36 * d43;
        l.z(d44, fVar3, d45, fVar2, dArr[4], 0);
        l.z(d44, fVar6, d45, fVar5, dArr[4], 3);
        double dU3 = 1.0d / aj.d.U((dI2 * dI2) + d11);
        double d46 = 1.0d / dU2;
        double d47 = (-(dF / d23)) / dU2;
        xi.f fVar20 = new xi.f(d46, fVarS, d47, fVar);
        xi.f fVar21 = new xi.f(d46, fVarT, d47, fVarU);
        double d48 = (dS * dU3) / 2.0d;
        double d49 = dI2 * dU3;
        xi.f fVar22 = new xi.f(d48, fVar, d49, fVar8);
        xi.f fVar23 = new xi.f(d48, fVarU, d49, fVar9);
        double d50 = (-(dF * dU3)) * dU3;
        xi.f fVar24 = new xi.f(dU3, fVarS, d50, fVar22);
        xi.f fVar25 = new xi.f(dU3, fVarT, d50, fVar23);
        double d51 = d13 + 1.0d;
        l.z(1.0d, fVar20, (-this.f23619v) / d51, fVar24, dArr[5], 0);
        l.z(1.0d, fVar21, (-this.f23619v) / d51, fVar25, dArr[5], 3);
        return dArr;
    }

    private double[][] j0() {
        double[][] dArrF0 = f0();
        double d10 = this.f23619v;
        double dU = aj.d.U(1.0d - (d10 * d10));
        aj.m mVarR = aj.d.R(r0());
        double dA = 1.0d / (1.0d - (this.f23619v * mVarR.a()));
        double d11 = dU * dA;
        double dB = (mVarR.b() * dA) / dU;
        double[] dArr = dArrF0[1];
        double[] dArr2 = dArrF0[5];
        for (int i10 = 0; i10 < dArr2.length; i10++) {
            dArr2[i10] = (dArr2[i10] * d11) + (dArr[i10] * dB);
        }
        return dArrF0;
    }

    private double[][] k0() {
        double[][] dArrG0 = g0();
        double d10 = this.f23619v;
        double dU = aj.d.U((d10 * d10) - 1.0d);
        double dR0 = r0();
        double dP = aj.d.p(dR0);
        double dT = aj.d.T(dR0);
        double d11 = 1.0d / ((this.f23619v * dP) - 1.0d);
        double d12 = dU * d11;
        double d13 = (dT * d11) / dU;
        double[] dArr = dArrG0[1];
        double[] dArr2 = dArrG0[5];
        for (int i10 = 0; i10 < dArr2.length; i10++) {
            dArr2[i10] = (dArr2[i10] * d12) - (dArr[i10] * d13);
        }
        return dArrG0;
    }

    private static double l0(n nVar, double d10, double d11, double d12, double d13, n nVar2) {
        double d14;
        double dB = aj.d.b(d10);
        double dU = aj.d.U(d12 / dB) / dB;
        if (nVar == n.MEAN) {
            return dU;
        }
        double dB2 = aj.d.b(1.0d - (d11 * d11));
        double dN = (aj.d.n(i.a(nVar2, d13, d11, n.TRUE)) * d11) + 1.0d;
        if (nVar == n.ECCENTRIC) {
            d14 = dU * dN;
        } else {
            d14 = dU * dN * dN;
            dB2 *= aj.d.U(dB2);
        }
        return d14 / dB2;
    }

    private void m0() {
        if (this.H != null) {
            return;
        }
        xi.f[] fVarArrD0 = D0();
        if (b0()) {
            double d10 = this.f23619v;
            double dU = aj.d.U((1.0d - d10) * (d10 + 1.0d));
            aj.m mVarR = aj.d.R(r0());
            double dA = mVarR.a();
            double dB = mVarR.b();
            double d11 = this.f23618u;
            double dU2 = aj.d.U(S() / this.f23618u) / (1.0d - (this.f23619v * dA));
            this.H = new y0(new xi.f(d11 * (dA - this.f23619v), fVarArrD0[0], d11 * dB * dU, fVarArrD0[1]), new xi.f((-dB) * dU2, fVarArrD0[0], dA * dU * dU2, fVarArrD0[1]));
            return;
        }
        aj.m mVarR2 = aj.d.R(A0());
        double dB2 = mVarR2.b();
        double dA2 = mVarR2.a();
        double d12 = this.f23618u;
        double d13 = this.f23619v;
        double d14 = d12 * (1.0d - (d13 * d13));
        double d15 = d14 / ((d13 * dA2) + 1.0d);
        double dU3 = aj.d.U(S() / d14);
        this.H = new y0(new xi.f(d15 * dA2, fVarArrD0[0], d15 * dB2, fVarArrD0[1]), new xi.f((-dU3) * dB2, fVarArrD0[0], dU3 * (this.f23619v + dA2), fVarArrD0[1]));
    }

    public double A0() {
        int i10 = a.f23624a[this.G.ordinal()];
        if (i10 == 1) {
            return this.f23618u < 0.0d ? i.l(this.f23619v, this.f23623z) : i.f(this.f23619v, this.f23623z);
        }
        if (i10 == 2) {
            return this.f23623z;
        }
        if (i10 == 3) {
            return this.f23618u < 0.0d ? i.j(this.f23619v, this.f23623z) : i.d(this.f23619v, this.f23623z);
        }
        throw new hj.e(null);
    }

    @Override // oj.l
    public double B() {
        return this.f23618u;
    }

    public double B0() {
        int i10 = a.f23624a[this.G.ordinal()];
        if (i10 == 1) {
            ri.h hVar = new ri.h(this.f23619v, this.B);
            ri.h hVar2 = new ri.h(this.f23623z, this.F);
            return (this.f23618u < 0.0d ? (ri.h) h.k(hVar, hVar2) : (ri.h) h.e(hVar, hVar2)).d0();
        }
        if (i10 == 2) {
            return this.F;
        }
        if (i10 != 3) {
            throw new hj.e(null);
        }
        ri.h hVar3 = new ri.h(this.f23619v, this.B);
        ri.h hVar4 = new ri.h(this.f23623z, this.F);
        return (this.f23618u < 0.0d ? (ri.h) h.i(hVar3, hVar4) : (ri.h) h.c(hVar3, hVar4)).d0();
    }

    @Override // oj.l
    public double C() {
        return this.A;
    }

    @Override // oj.l
    public double E() {
        return this.f23619v * aj.d.n(this.f23621x + this.f23622y);
    }

    @Override // oj.l
    /* JADX INFO: renamed from: E0, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public k d0(double d10) {
        return F0(new y(d10));
    }

    @Override // oj.l
    public double F() {
        if (!X()) {
            return 0.0d;
        }
        aj.m mVarR = aj.d.R(this.f23621x + this.f23622y);
        return (this.B * mVarR.a()) - ((this.f23619v * mVarR.b()) * (this.D + this.E));
    }

    public k F0(y yVar) {
        double dQ = yVar.Q();
        k kVar = new k(this.f23618u, this.f23619v, this.f23620w, this.f23621x, this.f23622y, u0() + (P() * dQ), n.MEAN, this.G, I(), getDate().f0(yVar), S());
        if (dQ == 0.0d || !X()) {
            return kVar;
        }
        xi.f fVarC0 = c0();
        kVar.m0();
        xi.f fVar = new xi.f(1.0d, kVar.H.t(), 0.5d * dQ * dQ, fVarC0);
        double dI = fVar.i();
        double dU = aj.d.U(dI);
        return new k(new k1(kVar.getDate(), fVar, new xi.f(1.0d, kVar.H.s(), dQ, fVarC0), new xi.f((-S()) / (dI * dU), kVar.H.t(), 1.0d, fVarC0)), kVar.I(), kVar.S());
    }

    @Override // oj.l
    public double G() {
        return this.f23619v * aj.d.P(this.f23621x + this.f23622y);
    }

    @Override // oj.l
    public double H() {
        if (!X()) {
            return 0.0d;
        }
        aj.m mVarR = aj.d.R(this.f23621x + this.f23622y);
        return (this.B * mVarR.b()) + (this.f23619v * mVarR.a() * (this.D + this.E));
    }

    @Override // oj.l
    public double J() {
        if (aj.d.b(this.f23620w - 3.141592653589793d) < 1.0E-10d) {
            return Double.NaN;
        }
        return aj.d.n(this.f23622y) * aj.d.V(this.f23620w * 0.5d);
    }

    @Override // oj.l
    public double K() {
        if (aj.d.b(this.f23620w - 3.141592653589793d) < 1.0E-10d) {
            return Double.NaN;
        }
        if (!X()) {
            return 0.0d;
        }
        aj.m mVarR = aj.d.R(this.f23622y);
        double dV = aj.d.V(this.f23620w * 0.5d);
        return (((((dV * dV) + 1.0d) * 0.5d) * mVarR.a()) * this.C) - ((dV * mVarR.b()) * this.E);
    }

    @Override // oj.l
    public double L() {
        if (aj.d.b(this.f23620w - 3.141592653589793d) < 1.0E-10d) {
            return Double.NaN;
        }
        return aj.d.P(this.f23622y) * aj.d.V(this.f23620w * 0.5d);
    }

    @Override // oj.l
    public double M() {
        if (aj.d.b(this.f23620w - 3.141592653589793d) < 1.0E-10d) {
            return Double.NaN;
        }
        if (!X()) {
            return 0.0d;
        }
        aj.m mVarR = aj.d.R(this.f23622y);
        double dV = aj.d.V(this.f23620w * 0.5d);
        return (((dV * dV) + 1.0d) * 0.5d * mVarR.b() * this.C) + (dV * mVarR.a() * this.E);
    }

    @Override // oj.l
    public double N() {
        return this.f23620w;
    }

    @Override // oj.l
    public double Q() {
        return this.f23621x + this.f23622y + A0();
    }

    @Override // oj.l
    public double R() {
        return this.D + this.E + B0();
    }

    @Override // oj.l
    public m W() {
        return m.f23640d;
    }

    @Override // oj.l
    public boolean X() {
        return (this.A == 0.0d && this.B == 0.0d && this.D == 0.0d && this.C == 0.0d && this.E == 0.0d && aj.d.b(this.F - l0(this.G, this.f23618u, this.f23619v, S(), this.f23623z, this.G)) <= 1.0E-15d) ? false : true;
    }

    @Override // oj.l
    protected k1 Z() {
        m0();
        double dI = this.H.t().i();
        xi.f fVar = new xi.f((-S()) / (dI * aj.d.U(dI)), this.H.t());
        if (X()) {
            fVar = fVar.a(c0());
        }
        return new k1(getDate(), this.H.t(), this.H.s(), fVar);
    }

    @Override // oj.l
    protected xi.f a0() {
        xi.f[] fVarArrD0 = D0();
        if (b0()) {
            double d10 = this.f23619v;
            double dU = aj.d.U((1.0d - d10) * (d10 + 1.0d));
            aj.m mVarR = aj.d.R(r0());
            double dA = mVarR.a();
            double dB = mVarR.b();
            double d11 = this.f23618u;
            return new xi.f((dA - this.f23619v) * d11, fVarArrD0[0], d11 * dB * dU, fVarArrD0[1]);
        }
        aj.m mVarR2 = aj.d.R(A0());
        double dB2 = mVarR2.b();
        double dA2 = mVarR2.a();
        double d12 = this.f23618u;
        double d13 = this.f23619v;
        double d14 = (d12 * (1.0d - (d13 * d13))) / ((d13 * dA2) + 1.0d);
        return new xi.f(d14 * dA2, fVarArrD0[0], d14 * dB2, fVarArrD0[1]);
    }

    public double n0(n nVar) {
        return nVar == n.MEAN ? u0() : nVar == n.ECCENTRIC ? r0() : A0();
    }

    @Override // oj.l
    protected double[][] o() {
        return b0() ? f0() : g0();
    }

    public double o0(n nVar) {
        return nVar == n.MEAN ? v0() : nVar == n.ECCENTRIC ? s0() : B0();
    }

    @Override // oj.l
    protected double[][] p() {
        return b0() ? h0() : i0();
    }

    public double p0() {
        return this.f23619v;
    }

    public double q0() {
        return this.B;
    }

    public double r0() {
        int i10 = a.f23624a[this.G.ordinal()];
        if (i10 == 1) {
            return this.f23618u < 0.0d ? i.k(this.f23619v, this.f23623z) : i.e(this.f23619v, this.f23623z);
        }
        if (i10 == 2) {
            return this.f23618u < 0.0d ? i.m(this.f23619v, this.f23623z) : i.g(this.f23619v, this.f23623z);
        }
        if (i10 == 3) {
            return this.f23623z;
        }
        throw new hj.e(null);
    }

    public double s0() {
        int i10 = a.f23624a[this.G.ordinal()];
        if (i10 == 1) {
            ri.h hVar = new ri.h(this.f23619v, this.B);
            ri.h hVar2 = new ri.h(this.f23623z, this.F);
            return (this.f23618u < 0.0d ? (ri.h) h.j(hVar, hVar2) : (ri.h) h.d(hVar, hVar2)).d0();
        }
        if (i10 != 2) {
            if (i10 == 3) {
                return this.F;
            }
            throw new hj.e(null);
        }
        ri.h hVar3 = new ri.h(this.f23619v, this.B);
        ri.h hVar4 = new ri.h(this.f23623z, this.F);
        return (this.f23618u < 0.0d ? (ri.h) h.l(hVar3, hVar4) : (ri.h) h.f(hVar3, hVar4)).d0();
    }

    @Override // oj.l
    protected double[][] t() {
        return b0() ? j0() : k0();
    }

    public double t0() {
        return this.C;
    }

    public String toString() {
        return "Keplerian parameters: {a: " + this.f23618u + "; e: " + this.f23619v + "; i: " + aj.d.Y(this.f23620w) + "; pa: " + aj.d.Y(this.f23621x) + "; raan: " + aj.d.Y(this.f23622y) + "; v: " + aj.d.Y(A0()) + ";}";
    }

    public double u0() {
        int i10 = a.f23624a[this.G.ordinal()];
        if (i10 == 1) {
            return this.f23623z;
        }
        if (i10 == 2) {
            return this.f23618u < 0.0d ? i.n(this.f23619v, this.f23623z) : i.h(this.f23619v, this.f23623z);
        }
        if (i10 == 3) {
            return this.f23618u < 0.0d ? i.i(this.f23619v, this.f23623z) : i.c(this.f23619v, this.f23623z);
        }
        throw new hj.e(null);
    }

    public double v0() {
        int i10 = a.f23624a[this.G.ordinal()];
        if (i10 == 1) {
            return this.F;
        }
        if (i10 == 2) {
            ri.h hVar = new ri.h(this.f23619v, this.B);
            ri.h hVar2 = new ri.h(this.f23623z, this.F);
            return (this.f23618u < 0.0d ? (ri.h) h.m(hVar, hVar2) : (ri.h) h.g(hVar, hVar2)).d0();
        }
        if (i10 != 3) {
            throw new hj.e(null);
        }
        ri.h hVar3 = new ri.h(this.f23619v, this.B);
        ri.h hVar4 = new ri.h(this.f23623z, this.F);
        return (this.f23618u < 0.0d ? (ri.h) h.h(hVar3, hVar4) : (ri.h) h.b(hVar3, hVar4)).d0();
    }

    public double w0() {
        return this.f23621x;
    }

    public double x0() {
        return this.D;
    }

    public double y0() {
        return this.f23622y;
    }

    public double z0() {
        return this.E;
    }

    public k(double d10, double d11, double d12, double d13, double d14, double d15, double d16, double d17, double d18, double d19, double d20, double d21, n nVar, n nVar2, r0 r0Var, yj.b bVar, double d22) {
        super(r0Var, bVar, d22);
        this.G = nVar2;
        if ((1.0d - d11) * d10 >= 0.0d) {
            e0("eccentricity", d11, 0.0d, Double.POSITIVE_INFINITY);
            this.f23618u = d10;
            this.A = d16;
            this.f23619v = d11;
            this.B = d17;
            this.f23620w = d12;
            this.C = d18;
            this.f23621x = d13;
            this.D = d19;
            this.f23622y = d14;
            this.E = d20;
            ri.h hVarC0 = C0(d15, d21, nVar);
            this.f23623z = hVarC0.getValue();
            this.F = hVarC0.d0();
            if (!b0()) {
                double dA0 = A0();
                if ((aj.d.n(dA0) * d11) + 1.0d <= 0.0d) {
                    double dE = aj.d.e((-1.0d) / d11);
                    throw new hj.c(hj.f.ORBIT_ANOMALY_OUT_OF_HYPERBOLIC_RANGE, Double.valueOf(dA0), Double.valueOf(d11), Double.valueOf(-dE), Double.valueOf(dE));
                }
            }
            this.H = null;
            return;
        }
        throw new hj.c(hj.f.ORBIT_A_E_MISMATCH_WITH_CONIC_TYPE, Double.valueOf(d10), Double.valueOf(d11));
    }

    public k(k1 k1Var, r0 r0Var, double d10) {
        this(k1Var, r0Var, d10, l.Y(k1Var, d10));
    }

    private k(k1 k1Var, r0 r0Var, double d10, boolean z10) {
        xi.f fVar;
        double d11;
        ri.h hVar;
        ri.h hVar2;
        super(k1Var, r0Var, d10);
        xi.f fVarP = k1Var.p();
        double dI = fVarP.i();
        xi.f fVar2 = xi.f.f32237r;
        this.f23620w = xi.f.b(fVarP, fVar2);
        double dG = xi.f.d(fVar2, fVarP).g();
        this.f23622y = dG;
        xi.f fVarT = k1Var.t();
        xi.f fVarS = k1Var.s();
        xi.f fVarO = k1Var.o();
        double dI2 = fVarT.i();
        double dU = aj.d.U(dI2);
        double dI3 = (fVarS.i() * dU) / d10;
        double d12 = dU / (2.0d - dI3);
        this.f23618u = d12;
        double d13 = d10 * d12;
        if (b0()) {
            double dF = xi.f.f(fVarT, fVarS) / aj.d.U(d13);
            fVar = fVarO;
            double d14 = dI3 - 1.0d;
            d11 = d12;
            this.f23619v = aj.d.U((dF * dF) + (d14 * d14));
            this.G = n.ECCENTRIC;
            this.f23623z = aj.d.j(dF, d14);
        } else {
            fVar = fVarO;
            d11 = d12;
            double dF2 = xi.f.f(fVarT, fVarS) / aj.d.U(-d13);
            double d15 = dI3 - 1.0d;
            double dU2 = aj.d.U(1.0d - (dI / d13));
            this.f23619v = dU2;
            this.G = n.TRUE;
            this.f23623z = i.j(dU2, aj.d.y((d15 + dF2) / (d15 - dF2)) / 2.0d);
        }
        xi.f fVar3 = fVar;
        e0("eccentricity", this.f23619v, 0.0d, Double.POSITIVE_INFINITY);
        xi.f fVar4 = new xi.f(dG, 0.0d);
        this.f23621x = aj.d.j(xi.f.f(fVarT, xi.f.d(fVarP, fVar4)) / aj.d.U(dI), xi.f.f(fVarT, fVar4)) - A0();
        this.H = k1Var;
        if (z10) {
            double[][] dArr = (double[][]) Array.newInstance((Class<?>) Double.TYPE, 6, 6);
            O(n.MEAN, dArr);
            xi.f fVarR = fVar3.r(new xi.f((-d10) / (dU * dI2), fVarT));
            double dJ = fVarR.j();
            double dK = fVarR.k();
            double dL = fVarR.l();
            double[] dArr2 = dArr[0];
            this.A = (dArr2[3] * dJ) + (dArr2[4] * dK) + (dArr2[5] * dL);
            double[] dArr3 = dArr[1];
            double d16 = (dArr3[3] * dJ) + (dArr3[4] * dK) + (dArr3[5] * dL);
            this.B = d16;
            double[] dArr4 = dArr[2];
            this.C = (dArr4[3] * dJ) + (dArr4[4] * dK) + (dArr4[5] * dL);
            double[] dArr5 = dArr[3];
            this.D = (dArr5[3] * dJ) + (dArr5[4] * dK) + (dArr5[5] * dL);
            double[] dArr6 = dArr[4];
            this.E = (dArr6[3] * dJ) + (dArr6[4] * dK) + (dArr6[5] * dL);
            double dP = P();
            double[] dArr7 = dArr[5];
            double d17 = dP + (dArr7[3] * dJ) + (dArr7[4] * dK) + (dArr7[5] * dL);
            ri.h hVar3 = new ri.h(this.f23619v, d16);
            ri.h hVar4 = new ri.h(u0(), d17);
            if (this.G == n.ECCENTRIC) {
                if (d11 < 0.0d) {
                    hVar2 = (ri.h) h.j(hVar3, hVar4);
                } else {
                    hVar2 = (ri.h) h.d(hVar3, hVar4);
                }
                this.F = hVar2.d0();
                return;
            }
            if (d11 < 0.0d) {
                hVar = (ri.h) h.k(hVar3, hVar4);
            } else {
                hVar = (ri.h) h.e(hVar3, hVar4);
            }
            this.F = hVar.d0();
            return;
        }
        this.A = 0.0d;
        this.B = 0.0d;
        this.C = 0.0d;
        this.D = 0.0d;
        this.E = 0.0d;
        n nVar = this.G;
        this.F = l0(nVar, d11, this.f23619v, d10, this.f23623z, nVar);
    }

    public k(l lVar) {
        this(lVar.T(), lVar.I(), lVar.S(), lVar.X());
    }
}
