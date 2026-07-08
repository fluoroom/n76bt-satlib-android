package ke;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xf.k;

/* JADX INFO: loaded from: classes3.dex */
public class x extends m implements he.u0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    static final /* synthetic */ yd.j[] f19815h = {rd.c0.f(new rd.w(x.class, "fragments", "getFragments()Ljava/util/List;", 0)), rd.c0.f(new rd.w(x.class, "empty", "getEmpty()Z", 0))};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final f0 f19816c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final mf.c f19817d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final dg.i f19818e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final dg.i f19819f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final xf.k f19820g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(f0 f0Var, mf.c cVar, dg.n nVar) {
        super(ie.h.f16054l.b(), cVar.g());
        rd.m.e(f0Var, "module");
        rd.m.e(cVar, "fqName");
        rd.m.e(nVar, "storageManager");
        this.f19816c = f0Var;
        this.f19817d = cVar;
        this.f19818e = nVar.d(new u(this));
        this.f19819f = nVar.d(new v(this));
        this.f19820g = new xf.i(nVar, new w(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean L0(x xVar) {
        return he.s0.b(xVar.v0().M0(), xVar.d());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List M0(x xVar) {
        return he.s0.c(xVar.v0().M0(), xVar.d());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final xf.k Q0(x xVar) {
        if (xVar.isEmpty()) {
            return k.b.f32079b;
        }
        List listL = xVar.L();
        ArrayList arrayList = new ArrayList(ed.q.v(listL, 10));
        Iterator it = listL.iterator();
        while (it.hasNext()) {
            arrayList.add(((he.n0) it.next()).p());
        }
        List listT0 = ed.q.t0(arrayList, new p0(xVar.v0(), xVar.d()));
        return xf.b.f32032d.a("package view scope for " + xVar.d() + " in " + xVar.v0().getName(), listT0);
    }

    @Override // he.u0
    public List L() {
        return (List) dg.m.a(this.f19818e, this, f19815h[0]);
    }

    @Override // he.m
    /* JADX INFO: renamed from: N0, reason: merged with bridge method [inline-methods] */
    public he.u0 b() {
        if (d().c()) {
            return null;
        }
        return v0().y(d().d());
    }

    protected final boolean O0() {
        return ((Boolean) dg.m.a(this.f19819f, this, f19815h[1])).booleanValue();
    }

    @Override // he.u0
    /* JADX INFO: renamed from: P0, reason: merged with bridge method [inline-methods] */
    public f0 v0() {
        return this.f19816c;
    }

    @Override // he.u0
    public mf.c d() {
        return this.f19817d;
    }

    public boolean equals(Object obj) {
        he.u0 u0Var = obj instanceof he.u0 ? (he.u0) obj : null;
        return u0Var != null && rd.m.a(d(), u0Var.d()) && rd.m.a(v0(), u0Var.v0());
    }

    public int hashCode() {
        return (v0().hashCode() * 31) + d().hashCode();
    }

    @Override // he.u0
    public boolean isEmpty() {
        return O0();
    }

    @Override // he.u0
    public xf.k p() {
        return this.f19820g;
    }

    @Override // he.m
    public Object t0(he.o oVar, Object obj) {
        rd.m.e(oVar, "visitor");
        return oVar.k(this, obj);
    }
}
