package ke;

import eg.c1;
import eg.i2;
import eg.u1;
import he.g1;
import he.k1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import ke.s0;
import xf.k;

/* JADX INFO: loaded from: classes3.dex */
public abstract class g extends n implements k1 {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    static final /* synthetic */ yd.j[] f19651s = {rd.c0.f(new rd.w(g.class, "constructors", "getConstructors()Ljava/util/Collection;", 0))};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final dg.n f19652e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final he.u f19653f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final dg.i f19654g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private List f19655h;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final a f19656r;

    public static final class a implements u1 {
        a() {
        }

        @Override // eg.u1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public k1 q() {
            return g.this;
        }

        @Override // eg.u1
        public Collection e() {
            Collection collectionE = q().h0().N0().e();
            rd.m.d(collectionE, "getSupertypes(...)");
            return collectionE;
        }

        @Override // eg.u1
        public List getParameters() {
            return g.this.R0();
        }

        @Override // eg.u1
        public ee.i o() {
            return uf.e.m(q());
        }

        @Override // eg.u1
        public u1 p(fg.g gVar) {
            rd.m.e(gVar, "kotlinTypeRefiner");
            return this;
        }

        @Override // eg.u1
        public boolean r() {
            return true;
        }

        public String toString() {
            return "[typealias " + q().getName().d() + ']';
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(dg.n nVar, he.m mVar, ie.h hVar, mf.f fVar, g1 g1Var, he.u uVar) {
        super(mVar, hVar, fVar, g1Var);
        rd.m.e(nVar, "storageManager");
        rd.m.e(mVar, "containingDeclaration");
        rd.m.e(hVar, "annotations");
        rd.m.e(fVar, "name");
        rd.m.e(g1Var, "sourceElement");
        rd.m.e(uVar, "visibilityImpl");
        this.f19652e = nVar;
        this.f19653f = uVar;
        this.f19654g = nVar.d(new d(this));
        this.f19656r = new a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final c1 N0(g gVar, fg.g gVar2) {
        he.h hVarF = gVar2.f(gVar);
        if (hVarF != null) {
            return hVarF.s();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Collection O0(g gVar) {
        return gVar.Q0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Boolean T0(ke.g r1, eg.l2 r2) {
        /*
            rd.m.b(r2)
            boolean r0 = eg.v0.a(r2)
            if (r0 != 0) goto L23
            eg.u1 r2 = r2.N0()
            he.h r2 = r2.q()
            boolean r0 = r2 instanceof he.l1
            if (r0 == 0) goto L23
            he.l1 r2 = (he.l1) r2
            he.m r2 = r2.b()
            boolean r1 = rd.m.a(r2, r1)
            if (r1 != 0) goto L23
            r1 = 1
            goto L24
        L23:
            r1 = 0
        L24:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ke.g.T0(ke.g, eg.l2):java.lang.Boolean");
    }

    @Override // he.d0
    public boolean A() {
        return false;
    }

    @Override // he.d0
    public boolean F0() {
        return false;
    }

    @Override // he.d0
    public boolean M() {
        return false;
    }

    protected final c1 M0() {
        xf.k kVarE0;
        he.e eVarR = r();
        if (eVarR == null || (kVarE0 = eVarR.E0()) == null) {
            kVarE0 = k.b.f32079b;
        }
        c1 c1VarV = i2.v(this, kVarE0, new f(this));
        rd.m.d(c1VarV, "makeUnsubstitutedType(...)");
        return c1VarV;
    }

    @Override // he.i
    public boolean N() {
        return i2.c(h0(), new e(this));
    }

    @Override // ke.n, ke.m, he.m
    /* JADX INFO: renamed from: P0, reason: merged with bridge method [inline-methods] */
    public k1 a() {
        he.p pVarA = super.a();
        rd.m.c(pVarA, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.TypeAliasDescriptor");
        return (k1) pVarA;
    }

    public final Collection Q0() {
        he.e eVarR = r();
        if (eVarR == null) {
            return ed.q.k();
        }
        Collection<he.d> constructors = eVarR.getConstructors();
        rd.m.d(constructors, "getConstructors(...)");
        ArrayList arrayList = new ArrayList();
        for (he.d dVar : constructors) {
            s0.a aVar = s0.R;
            dg.n nVar = this.f19652e;
            rd.m.b(dVar);
            q0 q0VarB = aVar.b(nVar, this, dVar);
            if (q0VarB != null) {
                arrayList.add(q0VarB);
            }
        }
        return arrayList;
    }

    protected abstract List R0();

    public final void S0(List list) {
        rd.m.e(list, "declaredTypeParameters");
        this.f19655h = list;
    }

    @Override // he.d0, he.q
    public he.u getVisibility() {
        return this.f19653f;
    }

    protected final dg.n i0() {
        return this.f19652e;
    }

    @Override // he.h
    public u1 k() {
        return this.f19656r;
    }

    @Override // he.m
    public Object t0(he.o oVar, Object obj) {
        rd.m.e(oVar, "visitor");
        return oVar.f(this, obj);
    }

    @Override // ke.m
    public String toString() {
        return "typealias " + getName().d();
    }

    @Override // he.i
    public List v() {
        List list = this.f19655h;
        if (list != null) {
            return list;
        }
        rd.m.o("declaredTypeParametersImpl");
        return null;
    }
}
