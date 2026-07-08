package be;

/* JADX INFO: loaded from: classes3.dex */
public class d3 extends rd.d0 {
    private static d1 i(rd.d dVar) {
        yd.e eVarG = dVar.g();
        return eVarG instanceof d1 ? (d1) eVarG : k.f3901d;
    }

    @Override // rd.d0
    public yd.f a(rd.k kVar) {
        return new i1(i(kVar), kVar.getName(), kVar.o(), kVar.e());
    }

    @Override // rd.d0
    public yd.c b(Class cls) {
        return h.k(cls);
    }

    @Override // rd.d0
    public yd.e c(Class cls, String str) {
        return h.l(cls);
    }

    @Override // rd.d0
    public yd.h d(rd.p pVar) {
        return new m1(i(pVar), pVar.getName(), pVar.o(), pVar.e());
    }

    @Override // rd.d0
    public yd.k e(rd.t tVar) {
        return new c2(i(tVar), tVar.getName(), tVar.o(), tVar.e());
    }

    @Override // rd.d0
    public yd.l f(rd.v vVar) {
        return new f2(i(vVar), vVar.getName(), vVar.o(), vVar.e());
    }

    @Override // rd.d0
    public String g(rd.j jVar) {
        i1 i1VarC;
        yd.f fVarA = ae.d.a(jVar);
        return (fVarA == null || (i1VarC = l3.c(fVarA)) == null) ? super.g(jVar) : g3.f3870a.h(i1VarC.Q());
    }

    @Override // rd.d0
    public String h(rd.o oVar) {
        return g(oVar);
    }
}
