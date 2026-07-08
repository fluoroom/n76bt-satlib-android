package we;

import ed.k0;
import ed.q;
import eg.c1;
import he.g1;
import java.util.Collection;
import java.util.Map;
import rd.c0;
import rd.w;

/* JADX INFO: loaded from: classes3.dex */
public class c implements xe.g {

    /* JADX INFO: renamed from: f */
    static final /* synthetic */ yd.j[] f31397f = {c0.f(new w(c.class, "type", "getType()Lorg/jetbrains/kotlin/types/SimpleType;", 0))};

    /* JADX INFO: renamed from: a */
    private final mf.c f31398a;

    /* JADX INFO: renamed from: b */
    private final g1 f31399b;

    /* JADX INFO: renamed from: c */
    private final dg.i f31400c;

    /* JADX INFO: renamed from: d */
    private final cf.b f31401d;

    /* JADX INFO: renamed from: e */
    private final boolean f31402e;

    public c(ye.k kVar, cf.a aVar, mf.c cVar) {
        g1 g1VarA;
        Collection collectionC;
        rd.m.e(kVar, "c");
        rd.m.e(cVar, "fqName");
        this.f31398a = cVar;
        if (aVar == null || (g1VarA = kVar.a().t().a(aVar)) == null) {
            g1VarA = g1.f15281a;
            rd.m.d(g1VarA, "NO_SOURCE");
        }
        this.f31399b = g1VarA;
        this.f31400c = kVar.e().d(new b(kVar, this));
        this.f31401d = (aVar == null || (collectionC = aVar.c()) == null) ? null : (cf.b) q.a0(collectionC);
        boolean z10 = false;
        if (aVar != null && aVar.j()) {
            z10 = true;
        }
        this.f31402e = z10;
    }

    public static final c1 f(ye.k kVar, c cVar) {
        c1 c1VarS = kVar.d().o().p(cVar.d()).s();
        rd.m.d(c1VarS, "getDefaultType(...)");
        return c1VarS;
    }

    @Override // ie.c
    public Map a() {
        return k0.i();
    }

    protected final cf.b c() {
        return this.f31401d;
    }

    @Override // ie.c
    public mf.c d() {
        return this.f31398a;
    }

    @Override // ie.c
    /* JADX INFO: renamed from: e */
    public c1 getType() {
        return (c1) dg.m.a(this.f31400c, this, f31397f[0]);
    }

    @Override // ie.c
    public g1 getSource() {
        return this.f31399b;
    }

    @Override // xe.g
    public boolean j() {
        return this.f31402e;
    }
}
