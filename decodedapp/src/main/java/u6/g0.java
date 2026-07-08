package u6;

/* JADX INFO: loaded from: classes.dex */
public abstract class g0 extends c0 {
    protected g0(Class cls) {
        super(cls);
    }

    @Override // p6.l
    public Object f(e6.j jVar, p6.h hVar, Object obj) throws v6.b {
        hVar.k0(this);
        return e(jVar, hVar);
    }

    @Override // u6.c0, p6.l
    public Object g(e6.j jVar, p6.h hVar, a7.e eVar) {
        return eVar.f(jVar, hVar);
    }

    @Override // p6.l
    public i7.a j() {
        return i7.a.CONSTANT;
    }

    @Override // p6.l
    public h7.c r() {
        return h7.c.OtherScalar;
    }

    @Override // p6.l
    public Boolean s(p6.g gVar) {
        return Boolean.FALSE;
    }

    protected g0(g0 g0Var) {
        super(g0Var);
    }
}
