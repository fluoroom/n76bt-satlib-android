package tj;

import aj.j;
import hj.f;
import oj.e;
import oj.l;
import oj.n;

/* JADX INFO: loaded from: classes3.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private c f27908a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private double f27909b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f27910c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private double f27911d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f27912e;

    public a(c cVar, double d10, int i10, double d11) {
        d(cVar);
        e(d10);
        c(i10);
        b(d11);
    }

    public l a(l lVar) {
        if (lVar.B() < this.f27908a.a()) {
            throw new hj.a(f.TRAJECTORY_INSIDE_BRILLOUIN_SPHERE, Double.valueOf(lVar.B()));
        }
        l lVarD = this.f27908a.d(lVar);
        double dB = lVarD.B();
        double dE = lVarD.E();
        double dG = lVarD.G();
        double dJ = lVarD.J();
        double dL = lVarD.L();
        double dQ = lVarD.Q();
        double dB2 = this.f27909b * aj.d.b(dB);
        double dX = this.f27909b * (aj.d.x(dE, dG) + 1.0d);
        double d10 = dB;
        double dX2 = this.f27909b * (aj.d.x(dJ, dL) + 1.0d);
        double d11 = this.f27909b * 3.141592653589793d;
        l lVarC = this.f27908a.c(lVarD);
        int i10 = 0;
        while (true) {
            double d12 = d11;
            int i11 = i10 + 1;
            if (i10 >= this.f27910c) {
                throw new hj.a(f.UNABLE_TO_COMPUTE_MEAN_PARAMETERS, this.f27908a.b(), Integer.valueOf(i11));
            }
            l lVarE = this.f27908a.e(lVarC);
            double dB3 = lVarD.B() - lVarE.B();
            double dE2 = lVarD.E() - lVarE.E();
            double dG2 = lVarD.G() - lVarE.G();
            double dJ2 = lVarD.J() - lVarE.J();
            double dL2 = lVarD.L() - lVarE.L();
            double d13 = dX;
            double d14 = dE;
            double dF = j.f(lVarD.Q() - lVarE.Q(), 0.0d);
            if (aj.d.b(dB3) < dB2 && aj.d.b(dE2) < d13 && aj.d.b(dG2) < d13 && aj.d.b(dJ2) < dX2 && aj.d.b(dL2) < dX2 && aj.d.b(dF) < d12) {
                this.f27912e = i11;
                return this.f27908a.f(lVar, lVarC);
            }
            double d15 = this.f27911d;
            double d16 = d10 + (dB3 * d15);
            double d17 = d14 + (dE2 * d15);
            double d18 = dG + (dG2 * d15);
            double d19 = dJ + (dJ2 * d15);
            double d20 = dL + (dL2 * d15);
            double d21 = dQ + (d15 * dF);
            e eVar = new e(d16, d17, d18, d19, d20, d21, n.TRUE, lVarD.I(), lVarD.getDate(), lVarD.S());
            i10 = i11;
            d11 = d12;
            dX = d13;
            lVarC = eVar;
            d10 = d16;
            dE = d17;
            dG = d18;
            dJ = d19;
            dL = d20;
            dQ = d21;
        }
    }

    public void b(double d10) {
        this.f27911d = d10;
    }

    public void c(int i10) {
        this.f27910c = i10;
    }

    public void d(c cVar) {
        this.f27908a = cVar;
    }

    public void e(double d10) {
        this.f27909b = d10;
    }
}
