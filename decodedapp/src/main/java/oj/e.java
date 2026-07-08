package oj;

import java.lang.reflect.Array;
import kj.r0;
import yj.y;
import zj.k1;
import zj.y0;

/* JADX INFO: loaded from: classes3.dex */
public class e extends l {
    private final n A;
    private final double B;
    private final double C;
    private final double D;
    private final double E;
    private final double F;
    private final double G;
    private y0 H;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final double f23606u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final double f23607v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final double f23608w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final double f23609x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final double f23610y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final double f23611z;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f23612a;

        static {
            int[] iArr = new int[n.values().length];
            f23612a = iArr;
            try {
                iArr[n.TRUE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f23612a[n.ECCENTRIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f23612a[n.MEAN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public e(double d10, double d11, double d12, double d13, double d14, double d15, n nVar, n nVar2, r0 r0Var, yj.b bVar, double d16) {
        this(d10, d11, d12, d13, d14, d15, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, e0(nVar, d10, d11, d12, d16, d15, nVar), nVar, nVar2, r0Var, bVar, d16);
    }

    private static double e0(n nVar, double d10, double d11, double d12, double d13, double d14, n nVar2) {
        double dU = aj.d.U(d13 / d10) / d10;
        if (nVar == n.MEAN) {
            return dU;
        }
        if (nVar == n.ECCENTRIC) {
            aj.m mVarR = aj.d.R(d.a(nVar2, d14, d11, d12, nVar));
            return dU * (1.0d / ((1.0d - (mVarR.a() * d11)) - (mVarR.b() * d12)));
        }
        aj.m mVarR2 = aj.d.R(d.a(nVar2, d14, d11, d12, nVar));
        double d15 = (1.0d - (d11 * d11)) - (d12 * d12);
        double dA = (mVarR2.a() * d11) + 1.0d + (mVarR2.b() * d12);
        return ((dU * dA) * dA) / (d15 * aj.d.U(d15));
    }

    private void f0() {
        if (this.H != null) {
            return;
        }
        double dI0 = i0();
        double d10 = this.f23609x;
        double d11 = d10 * d10;
        double d12 = this.f23610y;
        double d13 = d12 * d12;
        double d14 = d11 + 1.0d;
        double d15 = 1.0d / (d14 + d13);
        double d16 = (d14 - d13) * d15;
        double d17 = d10 * 2.0d * d12 * d15;
        double d18 = d12 * (-2.0d) * d15;
        double d19 = ((1.0d - d11) + d13) * d15;
        double d20 = d10 * 2.0d * d15;
        double d21 = this.f23607v;
        double d22 = this.f23608w;
        double d23 = d21 * d22;
        double d24 = d21 * d21;
        double d25 = d22 * d22;
        double dU = 1.0d / (aj.d.U(1.0d - (d24 + d25)) + 1.0d);
        aj.m mVarR = aj.d.R(dI0);
        double dA = mVarR.a();
        double dB = mVarR.b();
        double d26 = this.f23607v;
        double d27 = d26 * dA;
        double d28 = this.f23608w;
        double d29 = d27 + (d28 * dB);
        double d30 = this.f23606u;
        double d31 = d23 * dU;
        double d32 = ((((1.0d - (d25 * dU)) * dA) + (d31 * dB)) - d26) * d30;
        double d33 = d30 * ((((1.0d - (d24 * dU)) * dB) + (d31 * dA)) - d28);
        double dU2 = aj.d.U(S() / this.f23606u) / (1.0d - d29);
        double d34 = ((-dB) + (this.f23608w * dU * d29)) * dU2;
        double d35 = dU2 * (dA - ((dU * this.f23607v) * d29));
        this.H = new y0(new xi.f((d32 * d16) + (d33 * d17), (d32 * d17) + (d33 * d19), (d32 * d18) + (d33 * d20)), new xi.f((d16 * d34) + (d35 * d17), (d17 * d34) + (d19 * d35), (d34 * d18) + (d35 * d20)));
    }

    private ri.h n0(double d10, double d11, n nVar) {
        if (this.A == nVar) {
            return new ri.h(d10, d11);
        }
        ri.h hVar = new ri.h(this.f23607v, this.C);
        ri.h hVar2 = new ri.h(this.f23608w, this.D);
        ri.h hVar3 = new ri.h(d10, d11);
        int i10 = a.f23612a[this.A.ordinal()];
        if (i10 == 1) {
            return nVar == n.MEAN ? (ri.h) g.f(hVar, hVar2, hVar3) : (ri.h) g.d(hVar, hVar2, hVar3);
        }
        if (i10 == 2) {
            return nVar == n.MEAN ? (ri.h) g.e(hVar, hVar2, hVar3) : (ri.h) g.g(hVar, hVar2, hVar3);
        }
        if (i10 == 3) {
            return nVar == n.TRUE ? (ri.h) g.h(hVar, hVar2, hVar3) : (ri.h) g.c(hVar, hVar2, hVar3);
        }
        throw new hj.e(null);
    }

    @Override // oj.l
    public double B() {
        return this.f23606u;
    }

    @Override // oj.l
    public double C() {
        return this.B;
    }

    @Override // oj.l
    public double E() {
        return this.f23607v;
    }

    @Override // oj.l
    public double F() {
        return this.C;
    }

    @Override // oj.l
    public double G() {
        return this.f23608w;
    }

    @Override // oj.l
    public double H() {
        return this.D;
    }

    @Override // oj.l
    public double J() {
        return this.f23609x;
    }

    @Override // oj.l
    public double K() {
        return this.E;
    }

    @Override // oj.l
    public double L() {
        return this.f23610y;
    }

    @Override // oj.l
    public double M() {
        return this.F;
    }

    @Override // oj.l
    public double N() {
        double d10 = this.f23609x;
        double d11 = this.f23610y;
        return aj.d.h(aj.d.U((d10 * d10) + (d11 * d11))) * 2.0d;
    }

    @Override // oj.l
    public double Q() {
        int i10 = a.f23612a[this.A.ordinal()];
        if (i10 == 1) {
            return this.f23611z;
        }
        if (i10 == 2) {
            return d.e(this.f23607v, this.f23608w, this.f23611z);
        }
        if (i10 == 3) {
            return d.g(this.f23607v, this.f23608w, this.f23611z);
        }
        throw new hj.e(null);
    }

    @Override // oj.l
    public double R() {
        int i10 = a.f23612a[this.A.ordinal()];
        if (i10 == 1) {
            return this.G;
        }
        if (i10 == 2) {
            return ((ri.h) g.d(new ri.h(this.f23607v, this.C), new ri.h(this.f23608w, this.D), new ri.h(this.f23611z, this.G))).d0();
        }
        if (i10 != 3) {
            throw new hj.e(null);
        }
        return ((ri.h) g.f(new ri.h(this.f23607v, this.C), new ri.h(this.f23608w, this.D), new ri.h(this.f23611z, this.G))).d0();
    }

    @Override // oj.l
    public m W() {
        return m.f23639c;
    }

    @Override // oj.l
    public boolean X() {
        return (this.B == 0.0d && this.C == 0.0d && this.D == 0.0d && this.E == 0.0d && this.F == 0.0d && aj.d.b(this.G - e0(this.A, this.f23606u, this.f23607v, this.f23608w, S(), this.f23611z, this.A)) <= 1.0E-15d) ? false : true;
    }

    @Override // oj.l
    protected k1 Z() {
        f0();
        double dI = this.H.t().i();
        xi.f fVar = new xi.f((-S()) / (dI * aj.d.U(dI)), this.H.t());
        if (m0()) {
            fVar = fVar.a(c0());
        }
        return new k1(getDate(), this.H.t(), this.H.s(), fVar);
    }

    @Override // oj.l
    protected xi.f a0() {
        double dI0 = i0();
        double d10 = this.f23609x;
        double d11 = d10 * d10;
        double d12 = this.f23610y;
        double d13 = d12 * d12;
        double d14 = d11 + 1.0d;
        double d15 = 1.0d / (d14 + d13);
        double d16 = (d14 - d13) * d15;
        double d17 = d10 * 2.0d * d12 * d15;
        double d18 = ((1.0d - d11) + d13) * d15;
        double d19 = this.f23607v;
        double d20 = this.f23608w;
        double d21 = d19 * d20;
        double d22 = d19 * d19;
        double d23 = d20 * d20;
        double dU = 1.0d / (aj.d.U(1.0d - (d22 + d23)) + 1.0d);
        aj.m mVarR = aj.d.R(dI0);
        double dA = mVarR.a();
        double dB = mVarR.b();
        double d24 = this.f23606u;
        double d25 = d21 * dU;
        double d26 = d24 * ((((1.0d - (d23 * dU)) * dA) + (d25 * dB)) - this.f23607v);
        double d27 = d24 * ((((1.0d - (dU * d22)) * dB) + (d25 * dA)) - this.f23608w);
        return new xi.f((d16 * d26) + (d27 * d17), (d17 * d26) + (d18 * d27), (d26 * d12 * (-2.0d) * d15) + (d27 * d10 * 2.0d * d15));
    }

    public double g0(n nVar) {
        return nVar == n.MEAN ? k0() : nVar == n.ECCENTRIC ? i0() : Q();
    }

    public double h0(n nVar) {
        return nVar == n.MEAN ? l0() : nVar == n.ECCENTRIC ? j0() : R();
    }

    public double i0() {
        int i10 = a.f23612a[this.A.ordinal()];
        if (i10 == 1) {
            return d.h(this.f23607v, this.f23608w, this.f23611z);
        }
        if (i10 == 2) {
            return this.f23611z;
        }
        if (i10 == 3) {
            return d.f(this.f23607v, this.f23608w, this.f23611z);
        }
        throw new hj.e(null);
    }

    public double j0() {
        int i10 = a.f23612a[this.A.ordinal()];
        if (i10 == 1) {
            return ((ri.h) g.g(new ri.h(this.f23607v, this.C), new ri.h(this.f23608w, this.D), new ri.h(this.f23611z, this.G))).d0();
        }
        if (i10 == 2) {
            return this.G;
        }
        if (i10 != 3) {
            throw new hj.e(null);
        }
        return ((ri.h) g.e(new ri.h(this.f23607v, this.C), new ri.h(this.f23608w, this.D), new ri.h(this.f23611z, this.G))).d0();
    }

    public double k0() {
        int i10 = a.f23612a[this.A.ordinal()];
        if (i10 == 1) {
            return d.i(this.f23607v, this.f23608w, this.f23611z);
        }
        if (i10 == 2) {
            return d.d(this.f23607v, this.f23608w, this.f23611z);
        }
        if (i10 == 3) {
            return this.f23611z;
        }
        throw new hj.e(null);
    }

    public double l0() {
        int i10 = a.f23612a[this.A.ordinal()];
        if (i10 == 1) {
            return ((ri.h) g.h(new ri.h(this.f23607v, this.C), new ri.h(this.f23608w, this.D), new ri.h(this.f23611z, this.G))).d0();
        }
        if (i10 == 2) {
            return ((ri.h) g.c(new ri.h(this.f23607v, this.C), new ri.h(this.f23608w, this.D), new ri.h(this.f23611z, this.G))).d0();
        }
        if (i10 == 3) {
            return this.G;
        }
        throw new hj.e(null);
    }

    public boolean m0() {
        return X();
    }

    @Override // oj.l
    protected double[][] o() {
        double[][] dArrP = p();
        aj.m mVarR = aj.d.R(i0());
        double dA = mVarR.a();
        double dB = mVarR.b();
        double d10 = 1.0d / ((1.0d - (this.f23607v * dA)) - (this.f23608w * dB));
        double[] dArr = dArrP[1];
        double[] dArr2 = dArrP[2];
        double[] dArr3 = dArrP[5];
        for (int i10 = 0; i10 < 6; i10++) {
            dArr3[i10] = ((dArr3[i10] + (dArr[i10] * dB)) - (dArr2[i10] * dA)) * d10;
        }
        return dArrP;
    }

    @Override // oj.l
    /* JADX INFO: renamed from: o0, reason: merged with bridge method [inline-methods] */
    public e d0(double d10) {
        return p0(new y(d10));
    }

    @Override // oj.l
    protected double[][] p() {
        double[][] dArr = (double[][]) Array.newInstance((Class<?>) Double.TYPE, 6, 6);
        f0();
        xi.f fVarT = this.H.t();
        xi.f fVarS = this.H.s();
        double dI = fVarT.i();
        double dU = aj.d.U(dI) * dI;
        double dS = S();
        double dU2 = aj.d.U(this.f23606u * dS);
        double d10 = this.f23606u;
        double d11 = d10 * d10;
        double d12 = this.f23607v;
        double d13 = this.f23608w;
        double dU3 = aj.d.U(1.0d - ((d12 * d12) + (d13 * d13)));
        double d14 = 1.0d / (dU3 + 1.0d);
        double d15 = dU3 * d14;
        double d16 = this.f23609x;
        double d17 = d16 * d16;
        double d18 = this.f23610y;
        double d19 = d18 * d18;
        double d20 = d16 * d18 * 2.0d;
        xi.f fVar = (xi.f) new xi.f((1.0d - d19) + d17, d20, this.f23610y * (-2.0d)).p();
        xi.f fVar2 = (xi.f) new xi.f(d20, (d19 + 1.0d) - d17, this.f23609x * 2.0d).p();
        xi.f fVar3 = (xi.f) xi.f.d(fVarT, fVarS).p();
        double dF = xi.f.f(fVarT, fVar);
        double dF2 = xi.f.f(fVarT, fVar2);
        double dF3 = xi.f.f(fVarS, fVar);
        double dF4 = xi.f.f(fVarS, fVar2);
        double d21 = this.f23606u;
        double d22 = dU2 * dU3;
        double d23 = d21 / d22;
        double d24 = ((d21 * dU2) * d14) / dU;
        double d25 = dU2 / (dU * dU3);
        double d26 = this.f23608w;
        double d27 = ((d23 * dF3) * dF4) - ((d24 * d26) * dF);
        double d28 = d25 * dF;
        double d29 = d28 * dF2;
        double d30 = (-d23) * dF3;
        xi.f fVar4 = new xi.f(d27 - d29, fVar, ((d30 * dF3) - ((d26 * d24) * dF2)) + (d28 * dF), fVar2);
        double d31 = d23 * dF4 * dF4;
        double d32 = this.f23607v;
        xi.f fVar5 = new xi.f((d31 + ((d24 * d32) * dF)) - ((d25 * dF2) * dF2), fVar, (d30 * dF4) + (d24 * d32 * dF2) + d29, fVar2);
        double d33 = d11 * 2.0d;
        xi.f fVar6 = new xi.f(d33 / dU, fVarT);
        xi.f fVar7 = new xi.f(d33 / dS, fVarS);
        l.A(1.0d, fVar6, dArr[0], 0);
        l.A(1.0d, fVar7, dArr[0], 3);
        double d34 = ((-this.f23606u) * d15) / dU;
        double d35 = this.f23610y;
        double d36 = this.f23609x;
        double d37 = ((d35 * dF3) - (d36 * dF4)) / d22;
        double d38 = ((d36 * dF2) - (d35 * dF)) / dU2;
        xi.f fVar8 = new xi.f((((dF * 2.0d) * dF4) - (dF3 * dF2)) / dS, fVar2, ((-dF2) * dF4) / dS, fVar, ((-this.f23608w) * d38) / dU3, fVar3);
        l.y(this.f23607v * d34, fVarT, (-this.f23608w) * d37, fVar3, dU3 / dU2, fVar5, dArr[1], 0);
        l.A(1.0d, fVar8, dArr[1], 3);
        xi.f fVar9 = new xi.f((((dF3 * 2.0d) * dF2) - (dF * dF4)) / dS, fVar, ((-dF) * dF3) / dS, fVar2, (this.f23607v * d38) / dU3, fVar3);
        l.y(this.f23608w * d34, fVarT, this.f23607v * d37, fVar3, (-dU3) / dU2, fVar4, dArr[2], 0);
        l.A(1.0d, fVar9, dArr[2], 3);
        double d39 = ((d17 + 1.0d) + d19) / ((2.0d * dU2) * dU3);
        double d40 = -d39;
        l.A(d40 * dF3, fVar3, dArr[3], 0);
        l.A(d39 * dF, fVar3, dArr[3], 3);
        l.A(d40 * dF4, fVar3, dArr[4], 0);
        l.A(d39 * dF2, fVar3, dArr[4], 3);
        double d41 = (-d15) / dU2;
        l.x((-1.0d) / dU2, fVarS, d37, fVar3, d41 * this.f23607v, fVar4, d41 * this.f23608w, fVar5, dArr[5], 0);
        l.x((-2.0d) / dU2, fVarT, this.f23607v * d14, fVar9, (-this.f23608w) * d14, fVar8, d38, fVar3, dArr[5], 3);
        return dArr;
    }

    public e p0(y yVar) {
        double dQ = yVar.Q();
        e eVar = new e(this.f23606u, this.f23607v, this.f23608w, this.f23609x, this.f23610y, k0() + (P() * dQ), n.MEAN, this.A, I(), getDate().f0(yVar), S());
        if (dQ == 0.0d || !m0()) {
            return eVar;
        }
        xi.f fVarC0 = c0();
        eVar.f0();
        xi.f fVar = new xi.f(1.0d, eVar.H.t(), 0.5d * dQ * dQ, fVarC0);
        double dI = fVar.i();
        double dU = aj.d.U(dI);
        return new e(new k1(eVar.getDate(), fVar, new xi.f(1.0d, eVar.H.s(), dQ, fVarC0), new xi.f((-S()) / (dI * dU), eVar.H.t(), 1.0d, fVarC0)), eVar.I(), eVar.S());
    }

    @Override // oj.l
    protected double[][] t() {
        double[][] dArrO = o();
        aj.m mVarR = aj.d.R(i0());
        double dA = mVarR.a();
        double dB = mVarR.b();
        double d10 = this.f23607v;
        double d11 = this.f23608w;
        double d12 = (d10 * dB) - (d11 * dA);
        double d13 = (d10 * dA) + (d11 * dB);
        double d14 = (d10 * d10) + (d11 * d11);
        double dU = aj.d.U(1.0d - d14);
        double d15 = 1.0d + dU;
        double d16 = d15 - d13;
        double d17 = ((d16 * d16) + (d12 * d12)) / 2.0d;
        double d18 = (d13 * d15) - d14;
        double d19 = this.f23607v;
        double d20 = this.f23608w;
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

    public String toString() {
        return "equinoctial parameters: {a: " + this.f23606u + "; ex: " + this.f23607v + "; ey: " + this.f23608w + "; hx: " + this.f23609x + "; hy: " + this.f23610y + "; lv: " + aj.d.Y(Q()) + ";}";
    }

    public e(double d10, double d11, double d12, double d13, double d14, double d15, n nVar, r0 r0Var, yj.b bVar, double d16) {
        this(d10, d11, d12, d13, d14, d15, nVar, nVar, r0Var, bVar, d16);
    }

    public e(double d10, double d11, double d12, double d13, double d14, double d15, double d16, double d17, double d18, double d19, double d20, double d21, n nVar, n nVar2, r0 r0Var, yj.b bVar, double d22) {
        super(r0Var, bVar, d22);
        if ((d11 * d11) + (d12 * d12) < 1.0d) {
            this.A = nVar2;
            this.f23606u = d10;
            this.B = d16;
            this.f23607v = d11;
            this.C = d17;
            this.f23608w = d12;
            this.D = d18;
            this.f23609x = d13;
            this.E = d19;
            this.f23610y = d14;
            this.F = d20;
            ri.h hVarN0 = n0(d15, d21, nVar);
            this.f23611z = hVarN0.getValue();
            this.G = hVarN0.d0();
            this.H = null;
            return;
        }
        throw new hj.c(hj.f.HYPERBOLIC_ORBIT_NOT_HANDLED_AS, getClass().getName());
    }

    public e(k1 k1Var, r0 r0Var, double d10) {
        super(k1Var, r0Var, d10);
        xi.f fVarT = k1Var.t();
        xi.f fVarS = k1Var.s();
        xi.f fVarO = k1Var.o();
        double dI = fVarT.i();
        double dU = aj.d.U(dI);
        double dI2 = (fVarS.i() * dU) / d10;
        double d11 = dU / (2.0d - dI2);
        this.f23606u = d11;
        if (b0()) {
            xi.f fVar = (xi.f) k1Var.p().p();
            double dL = 1.0d / (fVar.l() + 1.0d);
            this.f23609x = (-dL) * fVar.k();
            this.f23610y = fVar.j() * dL;
            n nVar = n.TRUE;
            this.A = nVar;
            double dJ = (fVarT.j() - ((fVarT.l() * dL) * fVar.j())) / dU;
            double dK = (fVarT.k() - ((dL * fVarT.l()) * fVar.k())) / dU;
            double dJ2 = aj.d.j(dK, dJ);
            this.f23611z = dJ2;
            double dF = xi.f.f(fVarT, fVarS) / aj.d.U(d10 * d11);
            double d12 = dI2 - 1.0d;
            double d13 = (d12 * d12) + (dF * dF);
            double d14 = d12 - d13;
            double dU2 = aj.d.U(1.0d - d13) * dF;
            double d15 = (((d14 * dJ) + (dU2 * dK)) * d11) / dU;
            this.f23607v = d15;
            double d16 = (((d14 * dK) - (dU2 * dJ)) * d11) / dU;
            this.f23608w = d16;
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
                double d17 = (dArr3[3] * dJ3) + (dArr3[4] * dK2) + (dArr3[5] * dL2);
                this.C = d17;
                double[] dArr4 = dArr[2];
                double d18 = (dArr4[3] * dJ3) + (dArr4[4] * dK2) + (dArr4[5] * dL2);
                this.D = d18;
                double[] dArr5 = dArr[3];
                this.E = (dArr5[3] * dJ3) + (dArr5[4] * dK2) + (dArr5[5] * dL2);
                double[] dArr6 = dArr[4];
                this.F = (dArr6[3] * dJ3) + (dArr6[4] * dK2) + (dArr6[5] * dL2);
                double dP = P();
                double[] dArr7 = dArr[5];
                this.G = ((ri.h) g.f(new ri.h(d15, d17), new ri.h(d16, d18), new ri.h(k0(), dP + (dArr7[3] * dJ3) + (dArr7[4] * dK2) + (dArr7[5] * dL2)))).d0();
                return;
            }
            this.B = 0.0d;
            this.C = 0.0d;
            this.D = 0.0d;
            this.E = 0.0d;
            this.F = 0.0d;
            this.G = e0(nVar, d11, d15, d16, d10, dJ2, nVar);
            return;
        }
        throw new hj.c(hj.f.HYPERBOLIC_ORBIT_NOT_HANDLED_AS, getClass().getName());
    }

    public e(y0 y0Var, r0 r0Var, yj.b bVar, double d10) {
        this(new k1(bVar, y0Var), r0Var, d10);
    }

    public e(l lVar) {
        super(lVar.I(), lVar.getDate(), lVar.S());
        double dB = lVar.B();
        this.f23606u = dB;
        this.B = lVar.C();
        double dE = lVar.E();
        this.f23607v = dE;
        this.C = lVar.F();
        double dG = lVar.G();
        this.f23608w = dG;
        this.D = lVar.H();
        this.f23609x = lVar.J();
        this.E = lVar.K();
        this.f23610y = lVar.L();
        this.F = lVar.M();
        n nVar = n.TRUE;
        this.A = nVar;
        double dQ = lVar.Q();
        this.f23611z = dQ;
        this.G = lVar.X() ? lVar.R() : e0(nVar, dB, dE, dG, lVar.S(), dQ, nVar);
        this.H = null;
    }
}
