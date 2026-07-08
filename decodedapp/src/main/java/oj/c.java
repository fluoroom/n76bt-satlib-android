package oj;

import java.lang.reflect.Array;
import kj.r0;
import yj.y;
import zj.k1;
import zj.y0;

/* JADX INFO: loaded from: classes3.dex */
public class c extends l {
    private final n A;
    private final double B;
    private final double C;
    private final double D;
    private final double E;
    private final double F;
    private final double G;
    private y0 H;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final double f23598u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final double f23599v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final double f23600w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final double f23601x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final double f23602y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final double f23603z;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f23604a;

        static {
            int[] iArr = new int[n.values().length];
            f23604a = iArr;
            try {
                iArr[n.TRUE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f23604a[n.ECCENTRIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f23604a[n.MEAN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public c(double d10, double d11, double d12, double d13, double d14, double d15, n nVar, n nVar2, r0 r0Var, yj.b bVar, double d16) {
        this(d10, d11, d12, d13, d14, d15, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, e0(nVar, d10, d11, d12, d16, d15, nVar), nVar, nVar2, r0Var, bVar, d16);
    }

    private static double e0(n nVar, double d10, double d11, double d12, double d13, double d14, n nVar2) {
        double dU = aj.d.U(d13 / d10) / d10;
        if (nVar == n.MEAN) {
            return dU;
        }
        if (nVar == n.ECCENTRIC) {
            aj.m mVarR = aj.d.R(b.a(nVar2, d14, d11, d12, nVar));
            return dU * (1.0d / ((1.0d - (mVarR.a() * d11)) - (mVarR.b() * d12)));
        }
        aj.m mVarR2 = aj.d.R(b.a(nVar2, d14, d11, d12, nVar));
        double d15 = (1.0d - (d11 * d11)) - (d12 * d12);
        double dA = (mVarR2.a() * d11) + 1.0d + (mVarR2.b() * d12);
        return ((dU * dA) * dA) / (d15 * aj.d.U(d15));
    }

    private void f0() {
        if (this.H != null) {
            return;
        }
        double dE = E();
        double dG = G();
        double dJ = J();
        double dL = L();
        double dT0 = t0();
        double d10 = dJ * dJ;
        double d11 = dL * dL;
        double d12 = d10 + 1.0d;
        double d13 = 1.0d / (d12 + d11);
        double d14 = (d12 - d11) * d13;
        double d15 = dJ * 2.0d;
        double d16 = d15 * dL * d13;
        double d17 = dL * (-2.0d) * d13;
        double d18 = ((1.0d - d10) + d11) * d13;
        double d19 = d15 * d13;
        double d20 = dE * dG;
        double d21 = dE * dE;
        double d22 = dG * dG;
        double dU = 1.0d / (aj.d.U(1.0d - (d21 + d22)) + 1.0d);
        aj.m mVarR = aj.d.R(dT0);
        double dA = mVarR.a();
        double dB = mVarR.b();
        double d23 = (dE * dA) + (dG * dB);
        double d24 = this.f23598u;
        double d25 = d20 * dU;
        double d26 = ((((1.0d - (d22 * dU)) * dA) + (d25 * dB)) - dE) * d24;
        double d27 = d24 * ((((1.0d - (d21 * dU)) * dB) + (d25 * dA)) - dG);
        double dU2 = aj.d.U(S() / this.f23598u) / (1.0d - d23);
        double d28 = ((-dB) + (dG * dU * d23)) * dU2;
        double d29 = dU2 * (dA - ((dU * dE) * d23));
        this.H = new y0(new xi.f((d26 * d14) + (d27 * d16), (d26 * d16) + (d27 * d18), (d26 * d17) + (d27 * d19)), new xi.f((d14 * d28) + (d29 * d16), (d16 * d28) + (d18 * d29), (d28 * d17) + (d29 * d19)));
    }

    private ri.h x0(double d10, double d11, n nVar) {
        if (this.A == nVar) {
            return new ri.h(d10, d11);
        }
        ri.h hVar = new ri.h(this.f23599v, this.C);
        ri.h hVar2 = new ri.h(this.f23600w, this.D);
        ri.h hVar3 = new ri.h(d10, d11);
        int i10 = a.f23604a[this.A.ordinal()];
        if (i10 == 1) {
            return nVar == n.MEAN ? (ri.h) f.f(hVar, hVar2, hVar3) : (ri.h) f.d(hVar, hVar2, hVar3);
        }
        if (i10 == 2) {
            return nVar == n.MEAN ? (ri.h) f.e(hVar, hVar2, hVar3) : (ri.h) f.g(hVar, hVar2, hVar3);
        }
        if (i10 == 3) {
            return nVar == n.TRUE ? (ri.h) f.h(hVar, hVar2, hVar3) : (ri.h) f.c(hVar, hVar2, hVar3);
        }
        throw new hj.e(null);
    }

    @Override // oj.l
    public double B() {
        return this.f23598u;
    }

    @Override // oj.l
    public double C() {
        return this.B;
    }

    @Override // oj.l
    public double E() {
        aj.m mVarR = aj.d.R(this.f23602y);
        return (this.f23599v * mVarR.a()) - (this.f23600w * mVarR.b());
    }

    @Override // oj.l
    public double F() {
        if (!X()) {
            return 0.0d;
        }
        aj.m mVarR = aj.d.R(this.f23602y);
        return ((this.C - (this.f23600w * this.F)) * mVarR.a()) - ((this.D + (this.f23599v * this.F)) * mVarR.b());
    }

    @Override // oj.l
    public double G() {
        aj.m mVarR = aj.d.R(this.f23602y);
        return (this.f23600w * mVarR.a()) + (this.f23599v * mVarR.b());
    }

    @Override // oj.l
    public double H() {
        if (!X()) {
            return 0.0d;
        }
        aj.m mVarR = aj.d.R(this.f23602y);
        return ((this.D + (this.f23599v * this.F)) * mVarR.a()) + ((this.C - (this.f23600w * this.F)) * mVarR.b());
    }

    @Override // oj.l
    public double J() {
        if (aj.d.b(this.f23601x - 3.141592653589793d) < 1.0E-10d) {
            return Double.NaN;
        }
        return aj.d.n(this.f23602y) * aj.d.V(this.f23601x / 2.0d);
    }

    @Override // oj.l
    public double K() {
        if (aj.d.b(this.f23601x - 3.141592653589793d) < 1.0E-10d) {
            return Double.NaN;
        }
        if (!X()) {
            return 0.0d;
        }
        aj.m mVarR = aj.d.R(this.f23602y);
        double dV = aj.d.V(this.f23601x * 0.5d);
        return (((mVarR.a() * 0.5d) * ((dV * dV) + 1.0d)) * this.E) - ((mVarR.b() * dV) * this.F);
    }

    @Override // oj.l
    public double L() {
        if (aj.d.b(this.f23601x - 3.141592653589793d) < 1.0E-10d) {
            return Double.NaN;
        }
        return aj.d.P(this.f23602y) * aj.d.V(this.f23601x / 2.0d);
    }

    @Override // oj.l
    public double M() {
        if (aj.d.b(this.f23601x - 3.141592653589793d) < 1.0E-10d) {
            return Double.NaN;
        }
        if (!X()) {
            return 0.0d;
        }
        aj.m mVarR = aj.d.R(this.f23602y);
        double dV = aj.d.V(this.f23601x * 0.5d);
        return (mVarR.b() * 0.5d * ((dV * dV) + 1.0d) * this.E) + (mVarR.a() * dV * this.F);
    }

    @Override // oj.l
    public double N() {
        return this.f23601x;
    }

    @Override // oj.l
    public double Q() {
        return m0() + this.f23602y;
    }

    @Override // oj.l
    public double R() {
        return n0() + this.F;
    }

    @Override // oj.l
    public m W() {
        return m.f23638b;
    }

    @Override // oj.l
    public boolean X() {
        return (this.B == 0.0d && this.C == 0.0d && this.D == 0.0d && this.E == 0.0d && this.F == 0.0d && aj.d.b(this.G - e0(this.A, this.f23598u, this.f23599v, this.f23600w, S(), this.f23603z, this.A)) <= 1.0E-15d) ? false : true;
    }

    @Override // oj.l
    protected k1 Z() {
        f0();
        double dI = this.H.t().i();
        xi.f fVar = new xi.f((-S()) / (dI * aj.d.U(dI)), this.H.t());
        if (w0()) {
            fVar = fVar.a(c0());
        }
        return new k1(getDate(), this.H.t(), this.H.s(), fVar);
    }

    @Override // oj.l
    protected xi.f a0() {
        double dE = E();
        double dG = G();
        double dJ = J();
        double dL = L();
        double dT0 = t0();
        double d10 = dJ * dJ;
        double d11 = dL * dL;
        double d12 = d10 + 1.0d;
        double d13 = 1.0d / (d12 + d11);
        double d14 = (d12 - d11) * d13;
        double d15 = dJ * 2.0d;
        double d16 = d15 * dL * d13;
        double d17 = dL * (-2.0d) * d13;
        double d18 = ((1.0d - d10) + d11) * d13;
        double d19 = d15 * d13;
        double d20 = dE * dG;
        double d21 = dE * dE;
        double d22 = dG * dG;
        double dU = 1.0d / (aj.d.U(1.0d - (d21 + d22)) + 1.0d);
        aj.m mVarR = aj.d.R(dT0);
        double dA = mVarR.a();
        double dB = mVarR.b();
        double d23 = this.f23598u;
        double d24 = d20 * dU;
        double d25 = ((((1.0d - (d22 * dU)) * dA) + (d24 * dB)) - dE) * d23;
        double d26 = d23 * ((((1.0d - (dU * d21)) * dB) + (d24 * dA)) - dG);
        return new xi.f((d14 * d25) + (d26 * d16), (d16 * d25) + (d18 * d26), (d25 * d17) + (d26 * d19));
    }

    public double g0(n nVar) {
        return nVar == n.MEAN ? k0() : nVar == n.ECCENTRIC ? i0() : m0();
    }

    public double h0(n nVar) {
        return nVar == n.MEAN ? l0() : nVar == n.ECCENTRIC ? j0() : n0();
    }

    public double i0() {
        int i10 = a.f23604a[this.A.ordinal()];
        if (i10 == 1) {
            return b.h(this.f23599v, this.f23600w, this.f23603z);
        }
        if (i10 == 2) {
            return this.f23603z;
        }
        if (i10 == 3) {
            return b.f(this.f23599v, this.f23600w, this.f23603z);
        }
        throw new hj.e(null);
    }

    public double j0() {
        int i10 = a.f23604a[this.A.ordinal()];
        if (i10 == 1) {
            return ((ri.h) f.g(new ri.h(this.f23599v, this.C), new ri.h(this.f23600w, this.D), new ri.h(this.f23603z, this.G))).d0();
        }
        if (i10 == 2) {
            return this.G;
        }
        if (i10 != 3) {
            throw new hj.e(null);
        }
        return ((ri.h) f.e(new ri.h(this.f23599v, this.C), new ri.h(this.f23600w, this.D), new ri.h(this.f23603z, this.G))).d0();
    }

    public double k0() {
        int i10 = a.f23604a[this.A.ordinal()];
        if (i10 == 1) {
            return b.i(this.f23599v, this.f23600w, this.f23603z);
        }
        if (i10 == 2) {
            return b.d(this.f23599v, this.f23600w, this.f23603z);
        }
        if (i10 == 3) {
            return this.f23603z;
        }
        throw new hj.e(null);
    }

    public double l0() {
        int i10 = a.f23604a[this.A.ordinal()];
        if (i10 == 1) {
            return ((ri.h) f.h(new ri.h(this.f23599v, this.C), new ri.h(this.f23600w, this.D), new ri.h(this.f23603z, this.G))).d0();
        }
        if (i10 == 2) {
            return ((ri.h) f.c(new ri.h(this.f23599v, this.C), new ri.h(this.f23600w, this.D), new ri.h(this.f23603z, this.G))).d0();
        }
        if (i10 == 3) {
            return this.G;
        }
        throw new hj.e(null);
    }

    public double m0() {
        int i10 = a.f23604a[this.A.ordinal()];
        if (i10 == 1) {
            return this.f23603z;
        }
        if (i10 == 2) {
            return b.e(this.f23599v, this.f23600w, this.f23603z);
        }
        if (i10 == 3) {
            return b.g(this.f23599v, this.f23600w, this.f23603z);
        }
        throw new hj.e(null);
    }

    public double n0() {
        int i10 = a.f23604a[this.A.ordinal()];
        if (i10 == 1) {
            return this.G;
        }
        if (i10 == 2) {
            return ((ri.h) f.d(new ri.h(this.f23599v, this.C), new ri.h(this.f23600w, this.D), new ri.h(this.f23603z, this.G))).d0();
        }
        if (i10 != 3) {
            throw new hj.e(null);
        }
        return ((ri.h) f.f(new ri.h(this.f23599v, this.C), new ri.h(this.f23600w, this.D), new ri.h(this.f23603z, this.G))).d0();
    }

    @Override // oj.l
    protected double[][] o() {
        double[][] dArrP = p();
        aj.m mVarR = aj.d.R(i0());
        double dA = mVarR.a();
        double dB = mVarR.b();
        double d10 = 1.0d / ((1.0d - (this.f23599v * dA)) - (this.f23600w * dB));
        double[] dArr = dArrP[1];
        double[] dArr2 = dArrP[2];
        double[] dArr3 = dArrP[5];
        for (int i10 = 0; i10 < 6; i10++) {
            dArr3[i10] = ((dArr3[i10] + (dArr[i10] * dB)) - (dArr2[i10] * dA)) * d10;
        }
        return dArrP;
    }

    public double o0() {
        return this.f23599v;
    }

    @Override // oj.l
    protected double[][] p() {
        double[][] dArr = (double[][]) Array.newInstance((Class<?>) Double.TYPE, 6, 6);
        f0();
        xi.f fVarT = this.H.t();
        xi.f fVarS = this.H.s();
        double dJ = fVarT.j();
        double dK = fVarT.k();
        double dL = fVarT.l();
        double dJ2 = fVarS.j();
        double dK2 = fVarS.k();
        double dL2 = fVarS.l();
        double dF = xi.f.f(fVarT, fVarS);
        double dI = fVarT.i();
        double dU = aj.d.U(dI);
        double dI2 = fVarS.i();
        double dS = S();
        double dU2 = 1.0d / aj.d.U(this.f23598u * dS);
        double d10 = this.f23598u;
        double d11 = d10 / dU;
        double d12 = d10 / dI;
        double d13 = this.f23599v;
        double d14 = this.f23600w;
        double d15 = (d13 * d13) + (d14 * d14);
        double d16 = 1.0d - d15;
        double dU3 = aj.d.U(d16);
        double d17 = 1.0d / (dU3 + 1.0d);
        double d18 = 1.0d - (dU / d10);
        double d19 = dF * dU2;
        aj.m mVarR = aj.d.R(this.f23601x);
        aj.m mVarR2 = aj.d.R(this.f23602y);
        double dA = mVarR.a();
        double dB = mVarR.b();
        double dA2 = mVarR2.a();
        double dB2 = mVarR2.b();
        l.A(d11 * 2.0d * d12, fVarT, dArr[0], 0);
        l.A(((d10 * d10) * 2.0d) / dS, fVarS, dArr[0], 3);
        double d20 = -dF;
        xi.f fVar = new xi.f(dI2, fVarT, d20, fVarS);
        xi.f fVar2 = new xi.f(dI, fVarS, d20, fVarT);
        double dI3 = 1.0d / this.H.p().I();
        double d21 = dI3 * dI3;
        double d22 = -d21;
        double d23 = d22 * dB2 * dB;
        xi.f fVar3 = new xi.f(dI3, new xi.f(0.0d, dL2, -dK2), d23, fVar);
        double d24 = d21 * dA2 * dB;
        xi.f fVar4 = new xi.f(dI3, new xi.f(-dL2, 0.0d, dJ2), d24, fVar);
        double d25 = d22 * dA;
        xi.f fVar5 = new xi.f(dI3, new xi.f(dK2, -dJ2, 0.0d), d25, fVar);
        xi.f fVar6 = new xi.f(dI3, new xi.f(0.0d, -dL, dK), d23, fVar2);
        double d26 = -dJ;
        xi.f fVar7 = new xi.f(dI3, new xi.f(dL, 0.0d, d26), d24, fVar2);
        xi.f fVar8 = new xi.f(dI3, new xi.f(-dK, dJ, 0.0d), d25, fVar2);
        double d27 = dB2 * dA;
        double d28 = (-dA2) * dA;
        double d29 = -dB;
        l.y(d27, fVar3, d28, fVar4, d29, fVar5, dArr[3], 0);
        l.y(d27, fVar6, d28, fVar7, d29, fVar8, dArr[3], 3);
        double d30 = dB2 / dB;
        double d31 = dA2 / dB;
        l.z(d30, fVar4, d31, fVar3, dArr[4], 0);
        l.z(d30, fVar7, d31, fVar6, dArr[4], 3);
        double d32 = (dJ * dA2) + (dK * dB2);
        double d33 = (d26 * dB2) + (dK * dA2);
        double d34 = (d33 * dA) + (dL * dB);
        double d35 = (d33 * dA2) / dB;
        double d36 = (d33 * dB2) / dB;
        xi.f fVar9 = new xi.f(d35, fVar3, d36, fVar4, 1.0d, new xi.f(dA2, dB2, 0.0d));
        xi.f fVar10 = new xi.f(d35, fVar6, d36, fVar7);
        double d37 = -d32;
        double d38 = (((d37 * dA2) * dA) / dB) + (dB2 * dL);
        double d39 = (((d37 * dB2) * dA) / dB) - (dL * dA2);
        xi.f fVar11 = new xi.f(d38, fVar3, d39, fVar4, d33, fVar5, 1.0d, new xi.f((-dB2) * dA, dA2 * dA, dB));
        xi.f fVar12 = new xi.f(d38, fVar6, d39, fVar7, d33, fVar8);
        double d40 = (-2.0d) * d12 * d19 * dU2;
        xi.f fVar13 = new xi.f((((((d19 * 2.0d) * d19) + 1.0d) - d18) * d12) / dI, fVarT, d40, fVarS);
        xi.f fVar14 = new xi.f(d40, fVarT, 2.0d / dS, fVarS);
        double d41 = d19 * d19;
        double d42 = (((d16 - d41) * d12) * dU2) / dU3;
        xi.f fVar15 = new xi.f(((d12 * d19) * (d41 - d16)) / (dI * dU3), fVarT, d42, fVarS);
        xi.f fVar16 = new xi.f(d42, fVarT, d19 / (dS * dU3), fVarS);
        double d43 = d12 * (d18 - d15);
        double d44 = d12 * dU3 * d19;
        xi.f fVar17 = new xi.f(d32, fVar13, d34, fVar15, d43, fVar9, d44, fVar11);
        xi.f fVar18 = new xi.f(d32, fVar14, d34, fVar16, d43, fVar10, d44, fVar12);
        double d45 = -d44;
        xi.f fVar19 = new xi.f(d34, fVar13, d37, fVar15, d43, fVar11, d45, fVar9);
        xi.f fVar20 = new xi.f(d34, fVar14, d37, fVar16, d43, fVar12, d45, fVar10);
        l.A(1.0d, fVar17, dArr[1], 0);
        l.A(1.0d, fVar18, dArr[1], 3);
        l.A(1.0d, fVar19, dArr[2], 0);
        l.A(1.0d, fVar20, dArr[2], 3);
        double d46 = this.f23598u;
        double d47 = this.f23599v;
        double d48 = (d32 / d46) + d47;
        double d49 = d19 * d17;
        double d50 = this.f23600w;
        double d51 = d48 - (d49 * d50);
        double d52 = (d34 / d46) + d50 + (d49 * d47);
        double d53 = d17 * d18;
        double d54 = 1.0d - (d18 * d53);
        double d55 = ((d32 * d50) - (d34 * d47)) + (d49 * ((d32 * d47) + (d34 * d50)));
        double d56 = -d52;
        double d57 = d56 + (d51 * d19 * d17);
        double d58 = d51 + (d52 * d19 * d17);
        double d59 = d55 * 2.0d;
        double d60 = d53 * d19;
        double d61 = (((d53 * d54) / dU3) - 1.0d) * dU2;
        l.v((((d59 / dU) + (d11 * d19)) + ((((d53 + 1.0d) - ((d11 + 1.0d) * d54)) * d60) / dU3)) / dI, fVarT, d61, fVarS, d57, fVar17, d58, fVar19, d56 / d46, fVar9, d51 / d46, fVar11, dArr[5], 0);
        double d62 = this.f23598u;
        l.v(d61, fVarT, ((d59 + (d19 * d62)) + (((d60 * dU) * ((d53 * 2.0d) - (d11 * d54))) / dU3)) / dS, fVarS, d57, fVar18, d58, fVar20, d56 / d62, fVar10, d51 / d62, fVar12, dArr[5], 3);
        return dArr;
    }

    public double p0() {
        return this.C;
    }

    public double q0() {
        return this.f23600w;
    }

    public double r0() {
        return this.D;
    }

    public double s0() {
        return this.E;
    }

    @Override // oj.l
    protected double[][] t() {
        double[][] dArrO = o();
        aj.m mVarR = aj.d.R(i0());
        double dA = mVarR.a();
        double dB = mVarR.b();
        double d10 = this.f23599v;
        double d11 = this.f23600w;
        double d12 = (d10 * dB) - (d11 * dA);
        double d13 = (d10 * dA) + (d11 * dB);
        double d14 = (d10 * d10) + (d11 * d11);
        double dU = aj.d.U(1.0d - d14);
        double d15 = 1.0d + dU;
        double d16 = d15 - d13;
        double d17 = ((d16 * d16) + (d12 * d12)) / 2.0d;
        double d18 = (d13 * d15) - d14;
        double d19 = this.f23599v;
        double d20 = this.f23600w;
        double d21 = (d17 + d18) / d17;
        double d22 = ((((d19 * d12) / dU) - d20) + (dB * d15)) / d17;
        double d23 = ((((d20 * d12) / dU) + d19) - (dA * d15)) / d17;
        double[] dArr = dArrO[1];
        double[] dArr2 = dArrO[2];
        double[] dArr3 = dArrO[5];
        for (int i10 = 0; i10 < 6; i10++) {
            dArr3[i10] = (dArr3[i10] * d21) + (dArr[i10] * d22) + (dArr2[i10] * d23);
        }
        return dArrO;
    }

    public double t0() {
        return i0() + this.f23602y;
    }

    public String toString() {
        return "circular parameters: {a: " + this.f23598u + ", ex: " + this.f23599v + ", ey: " + this.f23600w + ", i: " + aj.d.Y(this.f23601x) + ", raan: " + aj.d.Y(this.f23602y) + ", alphaV: " + aj.d.Y(m0()) + ";}";
    }

    public double u0() {
        return this.f23602y;
    }

    public double v0() {
        return this.F;
    }

    public boolean w0() {
        return X();
    }

    @Override // oj.l
    /* JADX INFO: renamed from: y0, reason: merged with bridge method [inline-methods] */
    public c d0(double d10) {
        return z0(new y(d10));
    }

    public c z0(y yVar) {
        double dQ = yVar.Q();
        c cVar = new c(this.f23598u, this.f23599v, this.f23600w, this.f23601x, this.f23602y, k0() + (P() * dQ), n.MEAN, this.A, I(), getDate().f0(yVar), S());
        if (dQ == 0.0d || !w0()) {
            return cVar;
        }
        xi.f fVarC0 = c0();
        cVar.f0();
        xi.f fVar = new xi.f(1.0d, cVar.H.t(), 0.5d * dQ * dQ, fVarC0);
        double dI = fVar.i();
        double dU = aj.d.U(dI);
        return new c(new k1(cVar.getDate(), fVar, new xi.f(1.0d, cVar.H.s(), dQ, fVarC0), new xi.f((-S()) / (dI * dU), cVar.H.t(), 1.0d, fVarC0)), cVar.I(), cVar.S());
    }

    public c(double d10, double d11, double d12, double d13, double d14, double d15, double d16, double d17, double d18, double d19, double d20, double d21, n nVar, n nVar2, r0 r0Var, yj.b bVar, double d22) {
        super(r0Var, bVar, d22);
        if ((d11 * d11) + (d12 * d12) < 1.0d) {
            this.f23598u = d10;
            this.B = d16;
            this.f23599v = d11;
            this.C = d17;
            this.f23600w = d12;
            this.D = d18;
            this.f23601x = d13;
            this.E = d19;
            this.f23602y = d14;
            this.F = d20;
            this.A = nVar2;
            ri.h hVarX0 = x0(d15, d21, nVar);
            this.f23603z = hVarX0.getValue();
            this.G = hVarX0.d0();
            this.H = null;
            return;
        }
        throw new hj.c(hj.f.HYPERBOLIC_ORBIT_NOT_HANDLED_AS, getClass().getName());
    }

    public c(k1 k1Var, r0 r0Var, double d10) {
        super(k1Var, r0Var, d10);
        n nVar = n.TRUE;
        this.A = nVar;
        xi.f fVarT = k1Var.t();
        xi.f fVarS = k1Var.s();
        xi.f fVarO = k1Var.o();
        double dI = fVarT.i();
        double dU = aj.d.U(dI);
        double dI2 = (fVarS.i() * dU) / d10;
        double d11 = dU / (2.0d - dI2);
        this.f23598u = d11;
        if (b0()) {
            xi.f fVarP = k1Var.p();
            xi.f fVar = xi.f.f32237r;
            double dB = xi.f.b(fVarP, fVar);
            this.f23601x = dB;
            xi.f fVarD = xi.f.d(fVar, fVarP);
            double dJ = aj.d.j(fVarD.k(), fVarD.j());
            this.f23602y = dJ;
            aj.m mVarR = aj.d.R(dJ);
            aj.m mVarR2 = aj.d.R(dB);
            double dJ2 = fVarT.j();
            double dK = fVarT.k();
            double dL = fVarT.l();
            double dA = ((mVarR.a() * dJ2) + (mVarR.b() * dK)) / d11;
            double dA2 = ((((dK * mVarR.a()) - (dJ2 * mVarR.b())) * mVarR2.a()) + (dL * mVarR2.b())) / d11;
            double dF = xi.f.f(fVarT, fVarS) / aj.d.U(d10 * d11);
            double d12 = dI2 - 1.0d;
            double d13 = (d12 * d12) + (dF * dF);
            double d14 = d12 - d13;
            double dU2 = aj.d.U(1.0d - d13) * dF;
            double d15 = d11 / dU;
            double d16 = d15 * d15;
            double d17 = d16 * ((d14 * dA) + (dU2 * dA2));
            this.f23599v = d17;
            double d18 = ((d14 * dA2) - (dU2 * dA)) * d16;
            this.f23600w = d18;
            double dU3 = dF * (1.0d / (aj.d.U((1.0d - (d17 * d17)) - (d18 * d18)) + 1.0d));
            double dE = b.e(d17, d18, aj.d.j(dA2 + d18 + (dU3 * d17), (dA + d17) - (dU3 * d18)));
            this.f23603z = dE;
            this.H = k1Var;
            if (l.Y(k1Var, d10)) {
                double[][] dArr = (double[][]) Array.newInstance((Class<?>) Double.TYPE, 6, 6);
                O(n.MEAN, dArr);
                xi.f fVarR = fVarO.r(new xi.f((-d10) / (dU * dI), fVarT));
                double dJ3 = fVarR.j();
                double dK2 = fVarR.k();
                double dL2 = fVarR.l();
                double[] dArr2 = dArr[0];
                this.B = (dArr2[3] * dJ3) + (dArr2[4] * dK2) + (dArr2[5] * dL2);
                double[] dArr3 = dArr[1];
                double d19 = (dArr3[3] * dJ3) + (dArr3[4] * dK2) + (dArr3[5] * dL2);
                this.C = d19;
                double[] dArr4 = dArr[2];
                double d20 = (dArr4[3] * dJ3) + (dArr4[4] * dK2) + (dArr4[5] * dL2);
                this.D = d20;
                double[] dArr5 = dArr[3];
                this.E = (dArr5[3] * dJ3) + (dArr5[4] * dK2) + (dArr5[5] * dL2);
                double[] dArr6 = dArr[4];
                this.F = (dArr6[3] * dJ3) + (dArr6[4] * dK2) + (dArr6[5] * dL2);
                double dP = P();
                double[] dArr7 = dArr[5];
                this.G = ((ri.h) f.f(new ri.h(d17, d19), new ri.h(d18, d20), new ri.h(k0(), dP + (dArr7[3] * dJ3) + (dArr7[4] * dK2) + (dArr7[5] * dL2)))).d0();
                return;
            }
            this.B = 0.0d;
            this.C = 0.0d;
            this.D = 0.0d;
            this.E = 0.0d;
            this.F = 0.0d;
            this.G = e0(nVar, d11, d17, d18, d10, dE, nVar);
            return;
        }
        throw new hj.c(hj.f.HYPERBOLIC_ORBIT_NOT_HANDLED_AS, getClass().getName());
    }

    public c(l lVar) {
        super(lVar.I(), lVar.getDate(), lVar.S());
        double dB = lVar.B();
        this.f23598u = dB;
        this.f23601x = lVar.N();
        double dJ = lVar.J();
        double dL = lVar.L();
        double d10 = (dJ * dJ) + (dL * dL);
        double dU = aj.d.U(d10);
        double dJ2 = aj.d.j(dL, dJ);
        this.f23602y = dJ2;
        aj.m mVarR = aj.d.R(dJ2);
        double dA = dU == 0.0d ? mVarR.a() : dJ / dU;
        double dB2 = dU == 0.0d ? mVarR.b() : dL / dU;
        double dE = lVar.E();
        double dG = lVar.G();
        double d11 = (dE * dA) + (dG * dB2);
        this.f23599v = d11;
        double d12 = (dG * dA) - (dE * dB2);
        this.f23600w = d12;
        n nVar = n.TRUE;
        this.A = nVar;
        double dQ = lVar.Q() - dJ2;
        this.f23603z = dQ;
        if (lVar.X()) {
            this.B = lVar.C();
            double dK = lVar.K();
            double dM = lVar.M();
            this.E = (((dA * dK) + (dB2 * dM)) * 2.0d) / (1.0d + d10);
            double d13 = ((dM * dJ) - (dL * dK)) / d10;
            this.F = d13;
            double dF = lVar.F();
            double dH = lVar.H();
            this.C = (((dG * d13) + dF) * dA) + ((dH - (dE * d13)) * dB2);
            this.D = ((dH - (dE * d13)) * dA) - ((dF + (dG * d13)) * dB2);
            this.G = lVar.R() - d13;
        } else {
            this.B = 0.0d;
            this.C = 0.0d;
            this.D = 0.0d;
            this.E = 0.0d;
            this.F = 0.0d;
            this.G = e0(nVar, dB, d11, d12, S(), dQ, nVar);
        }
        this.H = null;
    }
}
