package g7;

/* JADX INFO: loaded from: classes.dex */
public abstract class n0 extends i0 {
    public n0(Class cls) {
        super(cls, false);
    }

    @Override // p6.p
    public boolean d(p6.d0 d0Var, Object obj) {
        return x(obj).isEmpty();
    }

    @Override // g7.i0, p6.p
    public void f(Object obj, e6.g gVar, p6.d0 d0Var) {
        gVar.d1(x(obj));
    }

    @Override // p6.p
    public void g(Object obj, e6.g gVar, p6.d0 d0Var, a7.h hVar) {
        n6.c cVarG = hVar.g(gVar, hVar.d(obj, e6.m.VALUE_STRING));
        f(obj, gVar, d0Var);
        hVar.h(gVar, cVarG);
    }

    public abstract String x(Object obj);
}
