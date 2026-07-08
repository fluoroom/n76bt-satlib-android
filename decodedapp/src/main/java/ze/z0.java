package ze;

import he.f1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import og.b;

/* JADX INFO: loaded from: classes3.dex */
public final class z0 extends a1 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final cf.g f33249n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final xe.c f33250o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(ye.k kVar, cf.g gVar, xe.c cVar) {
        super(kVar);
        rd.m.e(kVar, "c");
        rd.m.e(gVar, "jClass");
        rd.m.e(cVar, "ownerDescriptor");
        this.f33249n = gVar;
        this.f33250o = cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean m0(cf.q qVar) {
        rd.m.e(qVar, "it");
        return qVar.O();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Collection n0(mf.f fVar, xf.k kVar) {
        rd.m.e(kVar, "it");
        return kVar.c(fVar, pe.d.f24127x);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Collection o0(xf.k kVar) {
        rd.m.e(kVar, "it");
        return kVar.d();
    }

    private final Set p0(he.e eVar, Set set, qd.l lVar) {
        og.b.b(ed.q.e(eVar), x0.f33238a, new a(eVar, set, lVar));
        return set;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Iterable q0(he.e eVar) {
        Collection collectionE = eVar.k().e();
        rd.m.d(collectionE, "getSupertypes(...)");
        return qg.k.u(qg.k.I(ed.q.S(collectionE), y0.f33240a));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final he.e r0(eg.r0 r0Var) {
        he.h hVarQ = r0Var.N0().q();
        if (hVarQ instanceof he.e) {
            return (he.e) hVarQ;
        }
        return null;
    }

    private final he.y0 t0(he.y0 y0Var) {
        if (y0Var.j().a()) {
            return y0Var;
        }
        Collection<he.y0> collectionE = y0Var.e();
        rd.m.d(collectionE, "getOverriddenDescriptors(...)");
        ArrayList arrayList = new ArrayList(ed.q.v(collectionE, 10));
        for (he.y0 y0Var2 : collectionE) {
            rd.m.b(y0Var2);
            arrayList.add(t0(y0Var2));
        }
        return (he.y0) ed.q.w0(ed.q.U(arrayList));
    }

    private final Set u0(mf.f fVar, he.e eVar) {
        z0 z0VarB = xe.h.b(eVar);
        return z0VarB == null ? ed.r0.d() : ed.q.M0(z0VarB.a(fVar, pe.d.f24127x));
    }

    @Override // ze.t0
    protected void B(Collection collection, mf.f fVar) {
        rd.m.e(collection, "result");
        rd.m.e(fVar, "name");
        Collection collectionE = we.a.e(fVar, u0(fVar, R()), collection, R(), L().a().c(), L().a().k().b());
        rd.m.d(collectionE, "resolveOverridesForStaticMembers(...)");
        collection.addAll(collectionE);
        if (this.f33249n.B()) {
            if (rd.m.a(fVar, ee.o.f11840f)) {
                f1 f1VarG = qf.h.g(R());
                rd.m.d(f1VarG, "createEnumValueOfMethod(...)");
                collection.add(f1VarG);
            } else if (rd.m.a(fVar, ee.o.f11838d)) {
                f1 f1VarH = qf.h.h(R());
                rd.m.d(f1VarH, "createEnumValuesMethod(...)");
                collection.add(f1VarH);
            }
        }
    }

    @Override // ze.a1, ze.t0
    protected void C(mf.f fVar, Collection collection) {
        mf.f fVar2;
        Collection collection2;
        rd.m.e(fVar, "name");
        rd.m.e(collection, "result");
        Set setP0 = p0(R(), new LinkedHashSet(), new w0(fVar));
        if (collection.isEmpty()) {
            fVar2 = fVar;
            collection2 = collection;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object obj : setP0) {
                he.y0 y0VarT0 = t0((he.y0) obj);
                Object arrayList = linkedHashMap.get(y0VarT0);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    linkedHashMap.put(y0VarT0, arrayList);
                }
                ((List) arrayList).add(obj);
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it = linkedHashMap.entrySet().iterator();
            while (it.hasNext()) {
                Collection collectionE = we.a.e(fVar2, (Collection) ((Map.Entry) it.next()).getValue(), collection2, R(), L().a().c(), L().a().k().b());
                rd.m.d(collectionE, "resolveOverridesForStaticMembers(...)");
                ed.q.A(arrayList2, collectionE);
            }
            collection2.addAll(arrayList2);
        } else {
            Collection collectionE2 = we.a.e(fVar, setP0, collection, R(), L().a().c(), L().a().k().b());
            fVar2 = fVar;
            collection2 = collection;
            rd.m.d(collectionE2, "resolveOverridesForStaticMembers(...)");
            collection2.addAll(collectionE2);
        }
        if (this.f33249n.B() && rd.m.a(fVar2, ee.o.f11839e)) {
            og.a.a(collection2, qf.h.f(R()));
        }
    }

    @Override // ze.t0
    protected Set D(xf.d dVar, qd.l lVar) {
        rd.m.e(dVar, "kindFilter");
        Set setL0 = ed.q.L0(((c) N().a()).e());
        p0(R(), setL0, v0.f33234a);
        if (this.f33249n.B()) {
            setL0.add(ee.o.f11839e);
        }
        return setL0;
    }

    @Override // xf.l, xf.n
    public he.h g(mf.f fVar, pe.b bVar) {
        rd.m.e(fVar, "name");
        rd.m.e(bVar, "location");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ze.t0
    /* JADX INFO: renamed from: l0, reason: merged with bridge method [inline-methods] */
    public b z() {
        return new b(this.f33249n, u0.f33231a);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ze.t0
    /* JADX INFO: renamed from: s0, reason: merged with bridge method [inline-methods] */
    public xe.c R() {
        return this.f33250o;
    }

    @Override // ze.t0
    protected Set v(xf.d dVar, qd.l lVar) {
        rd.m.e(dVar, "kindFilter");
        return ed.r0.d();
    }

    @Override // ze.t0
    protected Set x(xf.d dVar, qd.l lVar) {
        rd.m.e(dVar, "kindFilter");
        Set setL0 = ed.q.L0(((c) N().a()).a());
        z0 z0VarB = xe.h.b(R());
        Set setB = z0VarB != null ? z0VarB.b() : null;
        if (setB == null) {
            setB = ed.r0.d();
        }
        setL0.addAll(setB);
        if (this.f33249n.B()) {
            setL0.addAll(ed.q.n(ee.o.f11840f, ee.o.f11838d));
        }
        setL0.addAll(L().a().w().a(R(), L()));
        return setL0;
    }

    @Override // ze.t0
    protected void y(Collection collection, mf.f fVar) {
        rd.m.e(collection, "result");
        rd.m.e(fVar, "name");
        L().a().w().g(R(), fVar, collection, L());
    }

    public static final class a extends b.AbstractC0321b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ he.e f33251a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Set f33252b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ qd.l f33253c;

        a(he.e eVar, Set set, qd.l lVar) {
            this.f33251a = eVar;
            this.f33252b = set;
            this.f33253c = lVar;
        }

        @Override // og.b.d
        public /* bridge */ /* synthetic */ Object a() {
            e();
            return dd.d0.f10897a;
        }

        @Override // og.b.d
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public boolean c(he.e eVar) {
            rd.m.e(eVar, "current");
            if (eVar == this.f33251a) {
                return true;
            }
            xf.k kVarU = eVar.U();
            rd.m.d(kVarU, "getStaticScope(...)");
            if (!(kVarU instanceof a1)) {
                return true;
            }
            this.f33252b.addAll((Collection) this.f33253c.l(kVarU));
            return false;
        }

        public void e() {
        }
    }
}
