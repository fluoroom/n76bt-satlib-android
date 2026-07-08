package ve;

import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class n0 implements l0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f30654b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final dg.f f30655c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final dg.h f30656d;

    public n0(Map map) {
        rd.m.e(map, "states");
        this.f30654b = map;
        dg.f fVar = new dg.f("Java nullability annotation states");
        this.f30655c = fVar;
        dg.h hVarH = fVar.h(new m0(this));
        rd.m.d(hVarH, "createMemoizedFunctionWithNullableValues(...)");
        this.f30656d = hVarH;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object c(n0 n0Var, mf.c cVar) {
        rd.m.b(cVar);
        return mf.e.a(cVar, n0Var.f30654b);
    }

    @Override // ve.l0
    public Object a(mf.c cVar) {
        rd.m.e(cVar, "fqName");
        return this.f30656d.l(cVar);
    }
}
