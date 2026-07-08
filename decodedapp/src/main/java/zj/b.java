package zj;

import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public class b implements yj.e0, Serializable {

    /* JADX INFO: renamed from: d */
    public static final b f33345d;

    /* JADX INFO: renamed from: a */
    private final xi.b f33346a;

    /* JADX INFO: renamed from: b */
    private final xi.f f33347b;

    /* JADX INFO: renamed from: c */
    private final xi.f f33348c;

    static {
        xi.b bVar = xi.b.f32203e;
        xi.f fVar = xi.f.f32232d;
        f33345d = new b(bVar, fVar, fVar);
    }

    public b(xi.b bVar, xi.f fVar) {
        this(bVar, fVar, xi.f.f32232d);
    }

    public static b h(double[][] dArr) {
        double[] dArr2 = dArr[0];
        double d10 = dArr2[0];
        double d11 = dArr2[1];
        double d12 = dArr2[2];
        double d13 = 2.0d / ((((d10 * d10) + (d11 * d11)) + (d12 * d12)) + 1.0d);
        double d14 = d13 - 1.0d;
        double d15 = d13 * d10;
        double d16 = d13 * d11;
        double d17 = d13 * d12;
        double d18 = d13 * d13;
        double[] dArr3 = dArr[1];
        double dE = (-d18) * aj.i.e(d10, dArr3[0], d11, dArr3[1], d12, dArr3[2]);
        double[] dArr4 = dArr[1];
        double d19 = dArr4[0] * d13;
        double[] dArr5 = dArr[0];
        double d20 = d19 + (dArr5[0] * dE);
        double d21 = (dArr4[1] * d13) + (dArr5[1] * dE);
        double d22 = (dArr4[2] * d13) + (dArr5[2] * dE);
        double d23 = -d15;
        double d24 = -d16;
        double dF = aj.i.f(d23, dE, d14, d20, d17, d21, d24, d22) * 2.0d;
        double d25 = -d17;
        double dF2 = aj.i.f(d24, dE, d25, d20, d14, d21, d15, d22) * 2.0d;
        double dF3 = aj.i.f(d25, dE, d16, d20, d23, d21, d14, d22) * 2.0d;
        double[] dArr6 = dArr[0];
        double d26 = dArr6[0];
        double[] dArr7 = dArr[2];
        double dE2 = (((((1.0d - d14) / d13) * dE) * dE) - (aj.i.e(d26, dArr7[0], dArr6[1], dArr7[1], dArr6[2], dArr7[2]) * d18)) - (((d20 * d20) + (d21 * d21)) + (d22 * d22));
        double dE3 = aj.i.e(d13, dArr[2][0], dArr[1][0] * 2.0d, dE, dArr[0][0], dE2);
        double dE4 = aj.i.e(d13, dArr[2][1], dArr[1][1] * 2.0d, dE, dArr[0][1], dE2);
        double dE5 = aj.i.e(d13, dArr[2][2], dArr[1][2] * 2.0d, dE, dArr[0][2], dE2);
        return new b(new xi.b(d14, d15, d16, d17, false), new xi.f(dF, dF2, dF3), new xi.f(aj.i.f(d23, dE2, d14, dE3, d17, dE4, d24, dE5) * 2.0d, aj.i.f(d24, dE2, d25, dE3, d14, dE4, d15, dE5) * 2.0d, aj.i.f(d25, dE2, d16, dE3, d23, dE4, d14, dE5) * 2.0d));
    }

    public static xi.f i(xi.b bVar, xi.b bVar2, double d10) {
        xi.b bVarL = bVar2.l();
        xi.c cVar = xi.c.VECTOR_OPERATOR;
        xi.b bVarC = bVar.c(bVarL, cVar);
        return new xi.f(bVarC.e() / d10, bVarC.f(cVar));
    }

    public b b(b bVar) {
        xi.f fVarB = this.f33346a.b(bVar.f33347b);
        return new b(this.f33346a.c(bVar.f33346a, xi.c.VECTOR_OPERATOR), this.f33347b.a(fVarB), new xi.f(1.0d, this.f33348c, 1.0d, this.f33346a.b(bVar.f33348c), -1.0d, xi.f.d(this.f33347b, fVarB)));
    }

    public k1 c(k1 k1Var) {
        xi.f fVarB = r().b(k1Var.t());
        xi.f fVarD = xi.f.d(g(), fVarB);
        xi.f fVarR = r().b(k1Var.s()).r(fVarD);
        return new k1(k1Var.getDate(), fVarB, fVarR, new xi.f(1.0d, r().b(k1Var.o()), -2.0d, xi.f.d(g(), fVarR), -1.0d, xi.f.d(g(), fVarD), -1.0d, xi.f.d(k(), fVarB)));
    }

    public xi.f g() {
        return this.f33347b;
    }

    public double[][] j(double d10) {
        double dG = d10 * r().g();
        double dH = r().h() * d10;
        double dI = d10 * r().i();
        double dJ = d10 * r().j();
        double dJ2 = g().j();
        double dK = g().k();
        double dL = g().l();
        double dJ3 = k().j();
        double dK2 = k().k();
        double dL2 = k().l();
        double d11 = -dH;
        double d12 = -dI;
        double d13 = -dJ;
        double dE = aj.i.e(d11, dJ2, d12, dK, d13, dL) * 0.5d;
        double dE2 = aj.i.e(dG, dJ2, d13, dK, dI, dL) * 0.5d;
        double dE3 = aj.i.e(dJ, dJ2, dG, dK, d11, dL) * 0.5d;
        double dE4 = aj.i.e(d12, dJ2, dH, dK, dG, dL) * 0.5d;
        double dG2 = aj.i.g(new double[]{dH, dI, dJ, dE2, dE3, dE4}, new double[]{dJ3, dK2, dL2, dJ2, dK, dL}) * (-0.5d);
        double dG3 = aj.i.g(new double[]{dG, dI, d13, dE, dE3, -dE4}, new double[]{dJ3, dL2, dK2, dJ2, dL, dK}) * 0.5d;
        double dG4 = aj.i.g(new double[]{dG, dJ, d11, dE, dE4, -dE2}, new double[]{dK2, dJ3, dL2, dK, dJ2, dL}) * 0.5d;
        double dG5 = aj.i.g(new double[]{dG, dH, d12, dE, dE2, -dE3}, new double[]{dL2, dK2, dJ3, dL, dK, dJ2}) * 0.5d;
        double d14 = 1.0d / (dG + 1.0d);
        double d15 = (-2.0d) * d14 * dE;
        double d16 = d14 * dH;
        double d17 = d14 * dI;
        double d18 = dJ * d14;
        double d19 = -d14;
        double d20 = d19 * d16;
        double d21 = d19 * d17;
        double d22 = d19 * d18;
        double d23 = aj.i.d(d14, dE2, d20, dE);
        double d24 = aj.i.d(d14, dE3, d21, dE);
        double d25 = aj.i.d(d14, dE4, d22, dE);
        return new double[][]{new double[]{d16, d17, d18}, new double[]{d23, d24, d25}, new double[]{aj.i.e(d14, dG3, d15, d23, d20, dG2), aj.i.e(d14, dG4, d15, d24, d21, dG2), aj.i.e(d14, dG5, d15, d25, d22, dG2)}};
    }

    public xi.f k() {
        return this.f33348c;
    }

    public b l() {
        return new b(this.f33346a.l(), this.f33346a.a(this.f33347b).o(), this.f33346a.a(this.f33348c).o());
    }

    public xi.b o(double d10) {
        double dI = this.f33347b.I();
        xi.b bVar = dI == 0.0d ? xi.b.f32203e : new xi.b(this.f33347b, dI * d10, xi.c.FRAME_TRANSFORM);
        xi.b bVar2 = this.f33346a;
        xi.c cVar = xi.c.VECTOR_OPERATOR;
        xi.b bVarC = bVar.c(bVar2, cVar);
        double dI2 = this.f33348c.I();
        return dI2 == 0.0d ? bVarC : new xi.b(this.f33348c, dI2 * 0.5d * d10 * d10, xi.c.FRAME_TRANSFORM).c(bVarC, cVar);
    }

    public /* synthetic */ yj.e0 p(yj.y yVar) {
        return yj.d0.a(this, yVar);
    }

    public xi.b r() {
        return this.f33346a;
    }

    @Override // yj.e0
    /* JADX INFO: renamed from: t */
    public b a(double d10) {
        double dI = this.f33347b.I();
        b bVar = new b((dI == 0.0d ? xi.b.f32203e : new xi.b(this.f33347b, dI * d10, xi.c.FRAME_TRANSFORM)).c(this.f33346a, xi.c.VECTOR_OPERATOR), this.f33347b);
        double dI2 = this.f33348c.I();
        return dI2 == 0.0d ? bVar : new b(new xi.b(this.f33348c, dI2 * 0.5d * d10 * d10, xi.c.FRAME_TRANSFORM), new xi.f(d10, this.f33348c), this.f33348c).b(bVar);
    }

    public b(xi.b bVar, xi.f fVar, xi.f fVar2) {
        this.f33346a = bVar;
        this.f33347b = fVar;
        this.f33348c = fVar2;
    }

    public b(xi.b bVar) {
        this(bVar, xi.f.f32232d);
    }
}
