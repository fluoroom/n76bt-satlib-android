package ie;

import eg.c1;
import eg.r0;
import he.g1;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class l implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ee.i f16059a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final mf.c f16060b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map f16061c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f16062d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final dd.j f16063e;

    public l(ee.i iVar, mf.c cVar, Map map, boolean z10) {
        rd.m.e(iVar, "builtIns");
        rd.m.e(cVar, "fqName");
        rd.m.e(map, "allValueArguments");
        this.f16059a = iVar;
        this.f16060b = cVar;
        this.f16061c = map;
        this.f16062d = z10;
        this.f16063e = dd.k.a(dd.n.f10910b, new k(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final c1 c(l lVar) {
        return lVar.f16059a.p(lVar.d()).s();
    }

    @Override // ie.c
    public Map a() {
        return this.f16061c;
    }

    @Override // ie.c
    public mf.c d() {
        return this.f16060b;
    }

    @Override // ie.c
    public g1 getSource() {
        g1 g1Var = g1.f15281a;
        rd.m.d(g1Var, "NO_SOURCE");
        return g1Var;
    }

    @Override // ie.c
    public r0 getType() {
        Object value = this.f16063e.getValue();
        rd.m.d(value, "getValue(...)");
        return (r0) value;
    }

    public /* synthetic */ l(ee.i iVar, mf.c cVar, Map map, boolean z10, int i10, rd.h hVar) {
        this(iVar, cVar, map, (i10 & 8) != 0 ? false : z10);
    }
}
