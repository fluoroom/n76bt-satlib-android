package kj;

/* JADX INFO: loaded from: classes3.dex */
public class x1 extends r0 implements zj.z0 {

    /* JADX INFO: renamed from: g */
    private final ej.a f20266g;

    /* JADX INFO: renamed from: h */
    private final ej.f f20267h;

    /* JADX INFO: renamed from: r */
    private final xi.f f20268r;

    public x1(ej.a aVar, ej.f fVar, String str) {
        r0 r0VarA = aVar.a();
        yj.b bVar = yj.b.P;
        y1 y1Var = new y1(bVar, aVar.b(fVar).o());
        xi.b bVar2 = new xi.b(fVar.b(), fVar.e(), xi.f.f32233e, xi.f.f32237r);
        xi.f fVar2 = xi.f.f32232d;
        super(r0VarA, new y1(bVar, y1Var, new y1(bVar, bVar2, fVar2)), str, false);
        this.f20266g = aVar;
        this.f20267h = fVar;
        this.f20268r = v().c(bVar).d().q(fVar2);
    }

    private xi.f C(xi.f fVar, r0 r0Var, yj.b bVar) {
        return r0Var.u(this, bVar).q(fVar);
    }

    private double z(xi.f fVar) {
        double dJ = aj.d.j(fVar.j(), fVar.k());
        return dJ < 0.0d ? dJ + 6.283185307179586d : dJ;
    }

    public double A(zj.y0 y0Var, r0 r0Var, yj.b bVar) {
        zj.y0 y0VarN = r0Var.q(this, bVar).n(y0Var);
        return xi.f.f(y0VarN.t(), y0VarN.s()) / y0VarN.t().I();
    }

    public zj.p1 B(xi.f fVar, r0 r0Var, yj.b bVar) {
        xi.f fVarC = C(fVar, r0Var, bVar);
        return new zj.p1(z(fVarC), fVarC.h(), fVarC.I());
    }
}
