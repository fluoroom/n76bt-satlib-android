package zj;

/* JADX INFO: loaded from: classes3.dex */
public class k1 extends y0 implements yj.g0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final yj.b f33424e;

    public k1(yj.b bVar, xi.f fVar, xi.f fVar2, xi.f fVar3) {
        super(fVar, fVar2, fVar3);
        this.f33424e = bVar;
    }

    public String A(yj.b0 b0Var) {
        return '{' + this.f33424e.h0(b0Var) + ", P(" + t().j() + ", " + t().k() + ", " + t().l() + "), V(" + s().j() + ", " + s().k() + ", " + s().l() + "), A(" + o().j() + ", " + o().k() + ", " + o().l() + ")}";
    }

    @Override // yj.g0
    public /* synthetic */ double e(yj.g0 g0Var) {
        return yj.f0.a(this, g0Var);
    }

    @Override // yj.g0
    public yj.b getDate() {
        return this.f33424e;
    }

    @Override // zj.y0
    public String toString() {
        return A(gj.c.a().d().e());
    }

    @Override // zj.y0
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public k1 a(double d10) {
        y0 y0VarA = super.a(d10);
        return new k1(this.f33424e.a(d10), y0VarA.t(), y0VarA.s(), y0VarA.o());
    }

    @Override // zj.y0
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public k1 w(yj.y yVar) {
        y0 y0Var = (y0) super.w(yVar);
        return new k1(this.f33424e.f0(yVar), y0Var.t(), y0Var.s(), y0Var.o());
    }

    public k1(yj.b bVar, y0 y0Var) {
        this(bVar, y0Var.t(), y0Var.s(), y0Var.o());
    }

    public k1(yj.b bVar, double d10, y0 y0Var) {
        super(new xi.f(d10, y0Var.t()), new xi.f(d10, y0Var.s()), new xi.f(d10, y0Var.o()));
        this.f33424e = bVar;
    }

    public k1(yj.b bVar, double d10, y0 y0Var, double d11, y0 y0Var2) {
        super(new xi.f(d10, y0Var.t(), d11, y0Var2.t()), new xi.f(d10, y0Var.s(), d11, y0Var2.s()), new xi.f(d10, y0Var.o(), d11, y0Var2.o()));
        this.f33424e = bVar;
    }
}
