package uj;

import kj.x1;

/* JADX INFO: loaded from: classes3.dex */
public class e extends b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final double f29265e;

    public e(double d10, double d11, x1 x1Var) {
        this(wj.b.b(d10), d11, x1Var);
    }

    @Override // uj.h
    public double i(pj.d dVar) {
        return x().B(dVar.o(), dVar.j(), dVar.getDate()).a() - this.f29265e;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // uj.a
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public e p(f fVar, vj.b bVar) {
        return new e(fVar, bVar, this.f29265e, null, null, x());
    }

    public e z(double d10) {
        return new e(h(), getHandler(), d10, null, null, x());
    }

    public e(wj.c cVar, double d10, x1 x1Var) {
        this(new f(cVar, d10, 100), new vj.d(), 0.0d, null, null, x1Var);
    }

    protected e(f fVar, vj.b bVar, double d10, zj.g gVar, mj.a aVar, x1 x1Var) {
        super(fVar, bVar, x1Var);
        this.f29265e = d10;
    }
}
