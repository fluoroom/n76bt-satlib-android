package zj;

/* JADX INFO: loaded from: classes3.dex */
public class f1 extends b implements yj.g0 {

    /* JADX INFO: renamed from: e */
    private final yj.b f33387e;

    public f1(yj.b bVar, xi.b bVar2, xi.f fVar, xi.f fVar2) {
        super(bVar2, fVar, fVar2);
        this.f33387e = bVar;
    }

    public f1 A(b bVar) {
        return b(bVar.l());
    }

    @Override // yj.g0
    public /* synthetic */ double e(yj.g0 g0Var) {
        return yj.f0.a(this, g0Var);
    }

    @Override // yj.g0
    public yj.b getDate() {
        return this.f33387e;
    }

    @Override // zj.b
    /* JADX INFO: renamed from: v */
    public f1 b(b bVar) {
        xi.f fVarB = r().b(bVar.g());
        return new f1(this.f33387e, r().c(bVar.r(), xi.c.VECTOR_OPERATOR), g().a(fVarB), new xi.f(1.0d, k(), 1.0d, r().b(bVar.k()), -1.0d, xi.f.d(g(), fVarB)));
    }

    @Override // zj.b
    /* JADX INFO: renamed from: w */
    public f1 l() {
        return new f1(this.f33387e, r().l(), r().a(g().o()), r().a(k().o()));
    }

    @Override // zj.b
    /* JADX INFO: renamed from: x */
    public f1 a(double d10) {
        b bVarA = super.a(d10);
        return new f1(this.f33387e.a(d10), bVarA.r(), bVarA.g(), bVarA.k());
    }

    @Override // zj.b
    /* JADX INFO: renamed from: z */
    public f1 p(yj.y yVar) {
        b bVar = (b) super.p(yVar);
        return new f1(this.f33387e.f0(yVar), bVar.r(), bVar.g(), bVar.k());
    }
}
