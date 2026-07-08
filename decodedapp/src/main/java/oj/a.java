package oj;

import kj.r0;
import zj.k1;
import zj.y0;

/* JADX INFO: loaded from: classes3.dex */
public class a extends l {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final double[][] f23594w = yi.h.d(6).getData();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final transient boolean f23595u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private transient e f23596v;

    public a(k1 k1Var, r0 r0Var, double d10) {
        super(k1Var, r0Var, d10);
        this.f23595u = l.Y(k1Var, d10);
        this.f23596v = null;
    }

    private zj.i e0() {
        k1 k1VarT = T();
        xi.f fVarT = k1VarT.t();
        xi.f fVarS = k1VarT.s();
        xi.f fVarO = k1VarT.o();
        return new zj.i(new xi.a(new ri.j(fVarT.j(), fVarS.j(), fVarO.j()), new ri.j(fVarT.k(), fVarS.k(), fVarO.k()), new ri.j(fVarT.l(), fVarS.l(), fVarO.l())), new xi.a(new ri.j(fVarS.j(), fVarO.j(), 0.0d), new ri.j(fVarS.k(), fVarO.k(), 0.0d), new ri.j(fVarS.l(), fVarO.l(), 0.0d)));
    }

    private void f0() {
        if (this.f23596v == null) {
            if (X()) {
                this.f23596v = new e(T(), I(), getDate(), S());
            } else {
                this.f23596v = new e(new y0(V(), T().s()), I(), getDate(), S());
            }
        }
    }

    private y0 g0(double d10) {
        xi.f fVarV = V();
        y0 y0VarC = j.c(d10, fVarV, T().s(), S());
        if (d10 == 0.0d || !this.f23595u) {
            return y0VarC;
        }
        double dI = fVarV.i();
        xi.f fVar = new xi.f(1.0d, T().o(), S() / (dI * aj.d.U(dI)), fVarV);
        xi.f fVarT = y0VarC.t();
        xi.f fVarS = y0VarC.s();
        xi.f fVar2 = new xi.f(1.0d, fVarT, 0.5d * d10 * d10, fVar);
        double dI2 = fVar2.i();
        return new y0(fVar2, new xi.f(1.0d, fVarS, d10, fVar), new xi.f((-S()) / (dI2 * aj.d.U(dI2)), fVarT, 1.0d, fVar));
    }

    @Override // oj.l
    public double B() {
        double dI = V().I();
        return dI / (2.0d - ((T().s().i() * dI) / S()));
    }

    @Override // oj.l
    public double C() {
        if (!this.f23595u) {
            return 0.0d;
        }
        zj.i iVarE0 = e0();
        ri.j jVar = (ri.j) iVarE0.b().c();
        return jVar.T(((ri.j) jVar.N((ri.j) iVarE0.c().d()).x(S()).j(2.0d)).negate()).f0(1);
    }

    @Override // oj.l
    public double E() {
        f0();
        return this.f23596v.E();
    }

    @Override // oj.l
    public double F() {
        f0();
        return this.f23596v.F();
    }

    @Override // oj.l
    public double G() {
        f0();
        return this.f23596v.G();
    }

    @Override // oj.l
    public double H() {
        f0();
        return this.f23596v.H();
    }

    @Override // oj.l
    public double J() {
        xi.f fVar = (xi.f) T().p().p();
        if ((fVar.j() * fVar.j()) + (fVar.k() * fVar.k()) != 0.0d || fVar.l() >= 0.0d) {
            return (-fVar.k()) / (fVar.l() + 1.0d);
        }
        return Double.NaN;
    }

    @Override // oj.l
    public double K() {
        if (!this.f23595u) {
            return 0.0d;
        }
        zj.i iVarE0 = e0();
        xi.a aVarI = xi.a.b(iVarE0.b(), iVarE0.c()).i();
        double value = ((ri.j) aVarI.e()).getValue();
        double value2 = ((ri.j) aVarI.f()).getValue();
        double value3 = ((ri.j) aVarI.g()).getValue();
        if ((value * value) + (value2 * value2) != 0.0d || value3 >= 0.0d) {
            return ((ri.j) aVarI.f()).negate().T((ri.j) ((ri.j) aVarI.g()).add(1.0d)).f0(1);
        }
        return Double.NaN;
    }

    @Override // oj.l
    public double L() {
        xi.f fVar = (xi.f) T().p().p();
        if ((fVar.j() * fVar.j()) + (fVar.k() * fVar.k()) != 0.0d || fVar.l() >= 0.0d) {
            return fVar.j() / (fVar.l() + 1.0d);
        }
        return Double.NaN;
    }

    @Override // oj.l
    public double M() {
        if (!this.f23595u) {
            return 0.0d;
        }
        zj.i iVarE0 = e0();
        xi.a aVarI = xi.a.b(iVarE0.b(), iVarE0.c()).i();
        double value = ((ri.j) aVarI.e()).getValue();
        double value2 = ((ri.j) aVarI.f()).getValue();
        double value3 = ((ri.j) aVarI.g()).getValue();
        if ((value * value) + (value2 * value2) != 0.0d || value3 >= 0.0d) {
            return ((ri.j) aVarI.e()).T((ri.j) ((ri.j) aVarI.g()).add(1.0d)).f0(1);
        }
        return Double.NaN;
    }

    @Override // oj.l
    public double N() {
        return xi.f.b(xi.f.f32237r, T().p());
    }

    @Override // oj.l
    public double Q() {
        f0();
        return this.f23596v.Q();
    }

    @Override // oj.l
    public double R() {
        f0();
        return this.f23596v.R();
    }

    @Override // oj.l
    public m W() {
        return m.f23637a;
    }

    @Override // oj.l
    public boolean X() {
        return this.f23595u;
    }

    @Override // oj.l
    protected k1 Z() {
        return T();
    }

    @Override // oj.l
    protected xi.f a0() {
        return T().t();
    }

    @Override // oj.l
    /* JADX INFO: renamed from: h0, reason: merged with bridge method [inline-methods] */
    public a d0(double d10) {
        return new a(g0(d10), I(), getDate().a(d10), S());
    }

    @Override // oj.l
    protected double[][] o() {
        return f23594w;
    }

    @Override // oj.l
    protected double[][] p() {
        return f23594w;
    }

    @Override // oj.l
    protected double[][] t() {
        return f23594w;
    }

    public String toString() {
        k1 k1VarT = T();
        xi.f fVarT = k1VarT.t();
        xi.f fVarS = k1VarT.s();
        return "Cartesian parameters: {P(" + fVarT.j() + ", " + fVarT.k() + ", " + fVarT.l() + "), V(" + fVarS.j() + ", " + fVarS.k() + ", " + fVarS.l() + ")}";
    }

    public a(y0 y0Var, r0 r0Var, yj.b bVar, double d10) {
        this(new k1(bVar, y0Var), r0Var, d10);
    }

    public a(l lVar) {
        super(lVar.T(), lVar.I(), lVar.S());
        this.f23595u = lVar.X();
        if (lVar instanceof e) {
            this.f23596v = (e) lVar;
        } else if (lVar instanceof a) {
            this.f23596v = ((a) lVar).f23596v;
        } else {
            this.f23596v = null;
        }
    }
}
