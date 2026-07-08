package xi;

import aj.i;
import aj.m;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public class b implements Serializable {

    /* JADX INFO: renamed from: e */
    public static final b f32203e = new b(1.0d, 0.0d, 0.0d, 0.0d, false);

    /* JADX INFO: renamed from: a */
    private final double f32204a;

    /* JADX INFO: renamed from: b */
    private final double f32205b;

    /* JADX INFO: renamed from: c */
    private final double f32206c;

    /* JADX INFO: renamed from: d */
    private final double f32207d;

    public b(double d10, double d11, double d12, double d13, boolean z10) {
        if (z10) {
            double dU = 1.0d / aj.d.U((((d10 * d10) + (d11 * d11)) + (d12 * d12)) + (d13 * d13));
            d10 *= dU;
            d11 *= dU;
            d12 *= dU;
            d13 *= dU;
        }
        this.f32204a = d10;
        this.f32205b = d11;
        this.f32206c = d12;
        this.f32207d = d13;
    }

    private b d(b bVar) {
        double d10 = bVar.f32204a;
        double d11 = this.f32204a;
        double d12 = d10 * d11;
        double d13 = bVar.f32205b;
        double d14 = this.f32205b;
        double d15 = bVar.f32206c;
        double d16 = this.f32206c;
        double d17 = bVar.f32207d;
        double d18 = this.f32207d;
        return new b(d12 - (((d13 * d14) + (d15 * d16)) + (d17 * d18)), (d13 * d11) + (d10 * d14) + ((d15 * d18) - (d17 * d16)), (d15 * d11) + (d10 * d16) + ((d17 * d14) - (d13 * d18)), (d17 * d11) + (d18 * d10) + ((d13 * d16) - (d15 * d14)), false);
    }

    private static double[] k(double[][] dArr) {
        double[] dArr2 = new double[4];
        double d10 = dArr[0][0];
        double d11 = dArr[1][1];
        double d12 = dArr[2][2];
        double d13 = d10 + d11 + d12;
        if (d13 > -0.19d) {
            double dU = aj.d.U(d13 + 1.0d) * 0.5d;
            dArr2[0] = dU;
            double d14 = 0.25d / dU;
            double[] dArr3 = dArr[1];
            double d15 = dArr3[2];
            double[] dArr4 = dArr[2];
            dArr2[1] = (d15 - dArr4[1]) * d14;
            double d16 = dArr4[0];
            double[] dArr5 = dArr[0];
            dArr2[2] = (d16 - dArr5[2]) * d14;
            dArr2[3] = d14 * (dArr5[1] - dArr3[0]);
            return dArr2;
        }
        double d17 = (d10 - d11) - d12;
        if (d17 > -0.19d) {
            double dU2 = aj.d.U(d17 + 1.0d) * 0.5d;
            dArr2[1] = dU2;
            double d18 = 0.25d / dU2;
            double[] dArr6 = dArr[1];
            double d19 = dArr6[2];
            double[] dArr7 = dArr[2];
            dArr2[0] = (d19 - dArr7[1]) * d18;
            double[] dArr8 = dArr[0];
            dArr2[2] = (dArr8[1] + dArr6[0]) * d18;
            dArr2[3] = d18 * (dArr8[2] + dArr7[0]);
            return dArr2;
        }
        double d20 = (d11 - d10) - d12;
        if (d20 > -0.19d) {
            double dU3 = aj.d.U(d20 + 1.0d) * 0.5d;
            dArr2[2] = dU3;
            double d21 = 0.25d / dU3;
            double[] dArr9 = dArr[2];
            double d22 = dArr9[0];
            double[] dArr10 = dArr[0];
            dArr2[0] = (d22 - dArr10[2]) * d21;
            double d23 = dArr10[1];
            double[] dArr11 = dArr[1];
            dArr2[1] = (d23 + dArr11[0]) * d21;
            dArr2[3] = d21 * (dArr9[1] + dArr11[2]);
            return dArr2;
        }
        double dU4 = aj.d.U(((d12 - d10) - d11) + 1.0d) * 0.5d;
        dArr2[3] = dU4;
        double d24 = 0.25d / dU4;
        double[] dArr12 = dArr[0];
        double d25 = dArr12[1];
        double[] dArr13 = dArr[1];
        dArr2[0] = (d25 - dArr13[0]) * d24;
        double d26 = dArr12[2];
        double[] dArr14 = dArr[2];
        dArr2[1] = (d26 + dArr14[0]) * d24;
        dArr2[2] = d24 * (dArr14[1] + dArr13[2]);
        return dArr2;
    }

    public f a(f fVar) {
        double dJ = fVar.j();
        double dK = fVar.k();
        double dL = fVar.l();
        double d10 = (this.f32205b * dJ) + (this.f32206c * dK) + (this.f32207d * dL);
        double d11 = -this.f32204a;
        double d12 = dJ * d11;
        double d13 = this.f32206c;
        double d14 = this.f32207d;
        double d15 = (d12 - ((d13 * dL) - (d14 * dK))) * d11;
        double d16 = this.f32205b;
        return new f(((d15 + (d10 * d16)) * 2.0d) - dJ, (((((dK * d11) - ((d14 * dJ) - (d16 * dL))) * d11) + (d10 * d13)) * 2.0d) - dK, (((d11 * ((dL * d11) - ((d16 * dK) - (d13 * dJ)))) + (d10 * d14)) * 2.0d) - dL);
    }

    public f b(f fVar) {
        double dJ = fVar.j();
        double dK = fVar.k();
        double dL = fVar.l();
        double d10 = (this.f32205b * dJ) + (this.f32206c * dK) + (this.f32207d * dL);
        double d11 = this.f32204a;
        double d12 = dJ * d11;
        double d13 = this.f32206c;
        double d14 = this.f32207d;
        double d15 = (d12 - ((d13 * dL) - (d14 * dK))) * d11;
        double d16 = this.f32205b;
        return new f(((d15 + (d10 * d16)) * 2.0d) - dJ, (((((dK * d11) - ((d14 * dJ) - (d16 * dL))) * d11) + (d10 * d13)) * 2.0d) - dK, (((d11 * ((dL * d11) - ((d16 * dK) - (d13 * dJ)))) + (d10 * d14)) * 2.0d) - dL);
    }

    public b c(b bVar, c cVar) {
        return cVar == c.VECTOR_OPERATOR ? d(bVar) : bVar.d(this);
    }

    public double e() {
        double dF;
        double d10 = this.f32204a;
        if (d10 < -0.1d || d10 > 0.1d) {
            double d11 = this.f32205b;
            double d12 = this.f32206c;
            double d13 = (d11 * d11) + (d12 * d12);
            double d14 = this.f32207d;
            dF = aj.d.f(aj.d.U(d13 + (d14 * d14)));
        } else {
            dF = d10 < 0.0d ? aj.d.e(-d10) : aj.d.e(d10);
        }
        return dF * 2.0d;
    }

    public f f(c cVar) {
        double d10 = this.f32205b;
        double d11 = this.f32206c;
        double d12 = (d10 * d10) + (d11 * d11);
        double d13 = this.f32207d;
        double d14 = d12 + (d13 * d13);
        if (d14 == 0.0d) {
            return cVar == c.VECTOR_OPERATOR ? f.f32233e : f.f32234f;
        }
        double d15 = cVar == c.VECTOR_OPERATOR ? 1.0d : -1.0d;
        if (this.f32204a < 0.0d) {
            double dU = d15 / aj.d.U(d14);
            return new f(this.f32205b * dU, this.f32206c * dU, this.f32207d * dU);
        }
        double dU2 = (-d15) / aj.d.U(d14);
        return new f(this.f32205b * dU2, this.f32206c * dU2, this.f32207d * dU2);
    }

    public double g() {
        return this.f32204a;
    }

    public double h() {
        return this.f32205b;
    }

    public double i() {
        return this.f32206c;
    }

    public double j() {
        return this.f32207d;
    }

    public b l() {
        return new b(-this.f32204a, this.f32205b, this.f32206c, this.f32207d, false);
    }

    public b(f fVar, double d10, c cVar) {
        double dI = fVar.I();
        if (dI != 0.0d) {
            m mVarR = aj.d.R(d10 * (cVar == c.VECTOR_OPERATOR ? -0.5d : 0.5d));
            double dB = mVarR.b() / dI;
            this.f32204a = mVarR.a();
            this.f32205b = fVar.j() * dB;
            this.f32206c = fVar.k() * dB;
            this.f32207d = dB * fVar.l();
            return;
        }
        throw new ui.e(wi.a.ZERO_NORM_FOR_ROTATION_AXIS, new Object[0]);
    }

    public b(f fVar, f fVar2, f fVar3, f fVar4) {
        f fVar5 = (f) fVar.c(fVar2).p();
        f fVar6 = (f) fVar5.c(fVar).p();
        f fVar7 = (f) fVar.p();
        f fVar8 = (f) fVar3.c(fVar4).p();
        f fVar9 = (f) fVar8.c(fVar3).p();
        f fVar10 = (f) fVar3.p();
        double[] dArrK = k(new double[][]{new double[]{i.e(fVar7.j(), fVar10.j(), fVar6.j(), fVar9.j(), fVar5.j(), fVar8.j()), i.e(fVar7.k(), fVar10.j(), fVar6.k(), fVar9.j(), fVar5.k(), fVar8.j()), i.e(fVar7.l(), fVar10.j(), fVar6.l(), fVar9.j(), fVar5.l(), fVar8.j())}, new double[]{i.e(fVar7.j(), fVar10.k(), fVar6.j(), fVar9.k(), fVar5.j(), fVar8.k()), i.e(fVar7.k(), fVar10.k(), fVar6.k(), fVar9.k(), fVar5.k(), fVar8.k()), i.e(fVar7.l(), fVar10.k(), fVar6.l(), fVar9.k(), fVar5.l(), fVar8.k())}, new double[]{i.e(fVar7.j(), fVar10.l(), fVar6.j(), fVar9.l(), fVar5.j(), fVar8.l()), i.e(fVar7.k(), fVar10.l(), fVar6.k(), fVar9.l(), fVar5.k(), fVar8.l()), i.e(fVar7.l(), fVar10.l(), fVar6.l(), fVar9.l(), fVar5.l(), fVar8.l())}});
        this.f32204a = dArrK[0];
        this.f32205b = dArrK[1];
        this.f32206c = dArrK[2];
        this.f32207d = dArrK[3];
    }

    public b(d dVar, c cVar, double d10, double d11, double d12) {
        b bVarC = new b(dVar.a(), d10, cVar).c(new b(dVar.d(), d11, cVar).c(new b(dVar.e(), d12, cVar), cVar), cVar);
        this.f32204a = bVarC.f32204a;
        this.f32205b = bVarC.f32205b;
        this.f32206c = bVarC.f32206c;
        this.f32207d = bVarC.f32207d;
    }
}
