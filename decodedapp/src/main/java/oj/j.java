package oj;

import zj.y0;

/* JADX INFO: loaded from: classes3.dex */
public abstract class j {
    private static y0 a(double d10, xi.f fVar, xi.f fVar2, double d11, double d12, double d13) {
        xi.f fVarC = fVar.c(fVar2);
        double dE = fVar.e(fVar2) / aj.d.U(d11 * d12);
        double d14 = 1.0d - (d13 / d12);
        double dJ = aj.d.j(dE, d14);
        double d15 = dJ - dE;
        double dU = aj.d.U((d14 * d14) + (dE * dE));
        double d16 = dU + 1.0d;
        double d17 = 1.0d - dU;
        xi.f fVar3 = (xi.f) new xi.b(fVarC, aj.d.h(aj.d.U(d16 / d17) * aj.d.V(dJ / 2.0d)) * 2.0d, xi.c.FRAME_TRANSFORM).b(fVar).p();
        xi.f fVar4 = (xi.f) fVarC.c(fVar3).p();
        double dU2 = aj.d.U(d11 / d12);
        aj.m mVarR = aj.d.R(i.e(dU, d15 + ((dU2 / d12) * d10)));
        double dA = mVarR.a();
        double dB = mVarR.b();
        double dU3 = aj.d.U(d17 * d16);
        double d18 = dU2 / (1.0d - (dU * dA));
        return new y0(new xi.f((dA - dU) * d12, fVar3, d12 * dU3 * dB, fVar4), new xi.f((-d18) * dB, fVar3, d18 * dU3 * dA, fVar4));
    }

    private static y0 b(double d10, xi.f fVar, xi.f fVar2, double d11, double d12, double d13) {
        xi.f fVarC = fVar.c(fVar2);
        double d14 = d11 * d12;
        double dU = aj.d.U(1.0d - (fVarC.i() / d14));
        double d15 = dU + 1.0d;
        double d16 = dU - 1.0d;
        double dU2 = aj.d.U(d15 / d16);
        double dE = fVar.e(fVar2) / aj.d.U(-d14);
        double d17 = 1.0d - (d13 / d12);
        double dY = aj.d.y((d17 + dE) / (d17 - dE)) / 2.0d;
        double dT = (aj.d.T(dY) * dU) - dY;
        xi.f fVar3 = (xi.f) new xi.b(fVarC, aj.d.h(dU2 * aj.d.X(dY / 2.0d)) * 2.0d, xi.c.FRAME_TRANSFORM).b(fVar).p();
        xi.f fVar4 = (xi.f) fVarC.c(fVar3).p();
        double dB = aj.d.b(d12);
        double dU3 = aj.d.U(d11 / dB);
        double dK = i.k(dU, dT + ((dU3 / dB) * d10));
        double dP = aj.d.p(dK);
        double dT2 = aj.d.T(dK);
        double dU4 = aj.d.U(d16 * d15);
        double d18 = dU3 / ((dU * dP) - 1.0d);
        return new y0(new xi.f((dP - dU) * d12, fVar3, (-d12) * dU4 * dT2, fVar4), new xi.f((-d18) * dT2, fVar3, d18 * dU4 * dP, fVar4));
    }

    public static y0 c(double d10, xi.f fVar, xi.f fVar2, double d11) {
        double dI = fVar.I();
        double dI2 = dI / (2.0d - ((fVar2.i() * dI) / d11));
        return dI2 >= 0.0d ? a(d10, fVar, fVar2, d11, dI2, dI) : b(d10, fVar, fVar2, d11, dI2, dI);
    }
}
