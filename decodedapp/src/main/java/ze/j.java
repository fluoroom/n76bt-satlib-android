package ze;

import eg.c1;
import eg.h2;
import eg.m2;
import he.s1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class j implements xe.g {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    static final /* synthetic */ yd.j[] f33166i = {rd.c0.f(new rd.w(j.class, "fqName", "getFqName()Lorg/jetbrains/kotlin/name/FqName;", 0)), rd.c0.f(new rd.w(j.class, "type", "getType()Lorg/jetbrains/kotlin/types/SimpleType;", 0)), rd.c0.f(new rd.w(j.class, "allValueArguments", "getAllValueArguments()Ljava/util/Map;", 0))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ye.k f33167a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final cf.a f33168b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final dg.j f33169c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final dg.i f33170d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final bf.a f33171e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final dg.i f33172f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f33173g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f33174h;

    public j(ye.k kVar, cf.a aVar, boolean z10) {
        rd.m.e(kVar, "c");
        rd.m.e(aVar, "javaAnnotation");
        this.f33167a = kVar;
        this.f33168b = aVar;
        this.f33169c = kVar.e().a(new g(this));
        this.f33170d = kVar.e().d(new h(this));
        this.f33171e = kVar.a().t().a(aVar);
        this.f33172f = kVar.e().d(new i(this));
        this.f33173g = aVar.j();
        this.f33174h = aVar.v() || z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map f(j jVar) {
        Collection<cf.b> collectionC = jVar.f33168b.c();
        ArrayList arrayList = new ArrayList();
        for (cf.b bVar : collectionC) {
            mf.f name = bVar.getName();
            if (name == null) {
                name = ve.j0.f30601c;
            }
            sf.g gVarM = jVar.m(bVar);
            dd.q qVarA = gVarM != null ? dd.w.a(name, gVarM) : null;
            if (qVarA != null) {
                arrayList.add(qVarA);
            }
        }
        return ed.k0.r(arrayList);
    }

    private final he.e g(mf.c cVar) {
        return he.y.d(this.f33167a.d(), mf.b.f21989d.c(cVar), this.f33167a.a().b().f().r());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final mf.c h(j jVar) {
        mf.b bVarH = jVar.f33168b.h();
        if (bVarH != null) {
            return bVarH.a();
        }
        return null;
    }

    private final sf.g m(cf.b bVar) {
        if (bVar instanceof cf.o) {
            return sf.i.f(sf.i.f27335a, ((cf.o) bVar).getValue(), null, 2, null);
        }
        if (bVar instanceof cf.m) {
            cf.m mVar = (cf.m) bVar;
            return p(mVar.a(), mVar.c());
        }
        if (!(bVar instanceof cf.e)) {
            if (bVar instanceof cf.c) {
                return n(((cf.c) bVar).getAnnotation());
            }
            if (bVar instanceof cf.h) {
                return q(((cf.h) bVar).b());
            }
            return null;
        }
        cf.e eVar = (cf.e) bVar;
        mf.f name = eVar.getName();
        if (name == null) {
            name = ve.j0.f30601c;
        }
        rd.m.b(name);
        return o(name, eVar.getElements());
    }

    private final sf.g n(cf.a aVar) {
        return new sf.a(new j(this.f33167a, aVar, false, 4, null));
    }

    private final sf.g o(mf.f fVar, List list) {
        eg.r0 r0VarM;
        if (eg.v0.a(getType())) {
            return null;
        }
        he.e eVarL = uf.e.l(this);
        rd.m.b(eVarL);
        s1 s1VarB = we.a.b(fVar, eVarL);
        if (s1VarB == null || (r0VarM = s1VarB.getType()) == null) {
            r0VarM = this.f33167a.a().m().o().m(m2.f12140e, gg.l.d(gg.k.M0, new String[0]));
            rd.m.d(r0VarM, "getArrayType(...)");
        }
        ArrayList arrayList = new ArrayList(ed.q.v(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            sf.g gVarM = m((cf.b) it.next());
            if (gVarM == null) {
                gVarM = new sf.u();
            }
            arrayList.add(gVarM);
        }
        return sf.i.f27335a.b(arrayList, r0VarM);
    }

    private final sf.g p(mf.b bVar, mf.f fVar) {
        if (bVar == null || fVar == null) {
            return null;
        }
        return new sf.k(bVar, fVar);
    }

    private final sf.g q(cf.x xVar) {
        return sf.s.f27353b.a(this.f33167a.g().p(xVar, af.b.b(h2.f12104b, false, false, null, 7, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final c1 r(j jVar) {
        mf.c cVarD = jVar.d();
        if (cVarD == null) {
            return gg.l.d(gg.k.N0, jVar.f33168b.toString());
        }
        he.e eVarF = ge.d.f(ge.d.f13816a, cVarD, jVar.f33167a.d().o(), null, 4, null);
        if (eVarF == null) {
            cf.g gVarZ = jVar.f33168b.z();
            eVarF = gVarZ != null ? jVar.f33167a.a().n().a(gVarZ) : null;
            if (eVarF == null) {
                eVarF = jVar.g(cVarD);
            }
        }
        return eVarF.s();
    }

    @Override // ie.c
    public Map a() {
        return (Map) dg.m.a(this.f33172f, this, f33166i[2]);
    }

    @Override // ie.c
    public mf.c d() {
        return (mf.c) dg.m.b(this.f33169c, this, f33166i[0]);
    }

    @Override // ie.c
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public bf.a getSource() {
        return this.f33171e;
    }

    @Override // xe.g
    public boolean j() {
        return this.f33173g;
    }

    @Override // ie.c
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public c1 getType() {
        return (c1) dg.m.a(this.f33170d, this, f33166i[1]);
    }

    public final boolean l() {
        return this.f33174h;
    }

    public String toString() {
        return pf.n.O(pf.n.f24180h, this, null, 2, null);
    }

    public /* synthetic */ j(ye.k kVar, cf.a aVar, boolean z10, int i10, rd.h hVar) {
        this(kVar, aVar, (i10 & 4) != 0 ? false : z10);
    }
}
