package u6;

/* JADX INFO: loaded from: classes.dex */
public class v extends c0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final v f28341e = new v();

    public v() {
        super(Object.class);
    }

    @Override // p6.l
    public Object e(e6.j jVar, p6.h hVar) {
        if (!jVar.N0(e6.m.FIELD_NAME)) {
            jVar.f1();
            return null;
        }
        while (true) {
            e6.m mVarX0 = jVar.X0();
            if (mVarX0 == null || mVarX0 == e6.m.END_OBJECT) {
                return null;
            }
            jVar.f1();
        }
    }

    @Override // u6.c0, p6.l
    public Object g(e6.j jVar, p6.h hVar, a7.e eVar) {
        int iQ = jVar.q();
        if (iQ == 1 || iQ == 3 || iQ == 5) {
            return eVar.c(jVar, hVar);
        }
        return null;
    }

    @Override // p6.l
    public Boolean s(p6.g gVar) {
        return Boolean.FALSE;
    }
}
