package eg;

import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class p extends v {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final dg.i f12155b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f12156c;

    /* JADX INFO: Access modifiers changed from: private */
    final class a implements u1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final fg.g f12157a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final dd.j f12158b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ p f12159c;

        public a(p pVar, fg.g gVar) {
            rd.m.e(gVar, "kotlinTypeRefiner");
            this.f12159c = pVar;
            this.f12157a = gVar;
            this.f12158b = dd.k.a(dd.n.f10910b, new o(this, pVar));
        }

        private final List b() {
            return (List) this.f12158b.getValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final List d(a aVar, p pVar) {
            return fg.h.b(aVar.f12157a, pVar.e());
        }

        @Override // eg.u1
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public List e() {
            return b();
        }

        public boolean equals(Object obj) {
            return this.f12159c.equals(obj);
        }

        @Override // eg.u1
        public List getParameters() {
            List parameters = this.f12159c.getParameters();
            rd.m.d(parameters, "getParameters(...)");
            return parameters;
        }

        public int hashCode() {
            return this.f12159c.hashCode();
        }

        @Override // eg.u1
        public ee.i o() {
            ee.i iVarO = this.f12159c.o();
            rd.m.d(iVarO, "getBuiltIns(...)");
            return iVarO;
        }

        @Override // eg.u1
        public u1 p(fg.g gVar) {
            rd.m.e(gVar, "kotlinTypeRefiner");
            return this.f12159c.p(gVar);
        }

        @Override // eg.u1
        public he.h q() {
            return this.f12159c.q();
        }

        @Override // eg.u1
        public boolean r() {
            return this.f12159c.r();
        }

        public String toString() {
            return this.f12159c.toString();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Collection f12160a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private List f12161b;

        public b(Collection collection) {
            rd.m.e(collection, "allSupertypes");
            this.f12160a = collection;
            this.f12161b = ed.q.e(gg.l.f14501a.l());
        }

        public final Collection a() {
            return this.f12160a;
        }

        public final List b() {
            return this.f12161b;
        }

        public final void c(List list) {
            rd.m.e(list, "<set-?>");
            this.f12161b = list;
        }
    }

    public p(dg.n nVar) {
        rd.m.e(nVar, "storageManager");
        this.f12155b = nVar.g(new h(this), i.f12107a, new j(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final b A(p pVar) {
        return new b(pVar.m());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final b B(boolean z10) {
        return new b(ed.q.e(gg.l.f14501a.l()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final dd.d0 C(p pVar, b bVar) {
        rd.m.e(bVar, "supertypes");
        Collection collectionA = pVar.v().a(pVar, bVar.a(), new k(pVar), new l(pVar));
        if (collectionA.isEmpty()) {
            r0 r0VarN = pVar.n();
            collectionA = r0VarN != null ? ed.q.e(r0VarN) : null;
            if (collectionA == null) {
                collectionA = ed.q.k();
            }
        }
        if (pVar.u()) {
            pVar.v().a(pVar, collectionA, new m(pVar), new n(pVar));
        }
        List listH0 = collectionA instanceof List ? (List) collectionA : null;
        if (listH0 == null) {
            listH0 = ed.q.H0(collectionA);
        }
        bVar.c(pVar.x(listH0));
        return dd.d0.f10897a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Iterable D(p pVar, u1 u1Var) {
        rd.m.e(u1Var, "it");
        return pVar.l(u1Var, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final dd.d0 E(p pVar, r0 r0Var) {
        rd.m.e(r0Var, "it");
        pVar.z(r0Var);
        return dd.d0.f10897a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Iterable F(p pVar, u1 u1Var) {
        rd.m.e(u1Var, "it");
        return pVar.l(u1Var, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final dd.d0 G(p pVar, r0 r0Var) {
        rd.m.e(r0Var, "it");
        pVar.y(r0Var);
        return dd.d0.f10897a;
    }

    private final Collection l(u1 u1Var, boolean z10) {
        List listS0;
        p pVar = u1Var instanceof p ? (p) u1Var : null;
        if (pVar != null && (listS0 = ed.q.s0(((b) pVar.f12155b.a()).a(), pVar.t(z10))) != null) {
            return listS0;
        }
        Collection collectionE = u1Var.e();
        rd.m.d(collectionE, "getSupertypes(...)");
        return collectionE;
    }

    protected abstract Collection m();

    protected abstract r0 n();

    @Override // eg.u1
    public u1 p(fg.g gVar) {
        rd.m.e(gVar, "kotlinTypeRefiner");
        return new a(this, gVar);
    }

    protected Collection t(boolean z10) {
        return ed.q.k();
    }

    protected boolean u() {
        return this.f12156c;
    }

    protected abstract he.j1 v();

    @Override // eg.u1
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public List e() {
        return ((b) this.f12155b.a()).b();
    }

    protected List x(List list) {
        rd.m.e(list, "supertypes");
        return list;
    }

    protected void y(r0 r0Var) {
        rd.m.e(r0Var, "type");
    }

    protected void z(r0 r0Var) {
        rd.m.e(r0Var, "type");
    }
}
