package ke;

import eg.f2;
import he.g1;
import he.s1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class u0 extends w0 implements s1 {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final a f19803u = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f19804f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f19805g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f19806h;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final boolean f19807r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final eg.r0 f19808s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final s1 f19809t;

    public static final class a {
        public /* synthetic */ a(rd.h hVar) {
            this();
        }

        public final u0 a(he.a aVar, s1 s1Var, int i10, ie.h hVar, mf.f fVar, eg.r0 r0Var, boolean z10, boolean z11, boolean z12, eg.r0 r0Var2, g1 g1Var, qd.a aVar2) {
            rd.m.e(aVar, "containingDeclaration");
            rd.m.e(hVar, "annotations");
            rd.m.e(fVar, "name");
            rd.m.e(r0Var, "outType");
            rd.m.e(g1Var, "source");
            return aVar2 == null ? new u0(aVar, s1Var, i10, hVar, fVar, r0Var, z10, z11, z12, r0Var2, g1Var) : new b(aVar, s1Var, i10, hVar, fVar, r0Var, z10, z11, z12, r0Var2, g1Var, aVar2);
        }

        private a() {
        }
    }

    public static final class b extends u0 {

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        private final dd.j f19810v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(he.a aVar, s1 s1Var, int i10, ie.h hVar, mf.f fVar, eg.r0 r0Var, boolean z10, boolean z11, boolean z12, eg.r0 r0Var2, g1 g1Var, qd.a aVar2) {
            super(aVar, s1Var, i10, hVar, fVar, r0Var, z10, z11, z12, r0Var2, g1Var);
            rd.m.e(aVar, "containingDeclaration");
            rd.m.e(hVar, "annotations");
            rd.m.e(fVar, "name");
            rd.m.e(r0Var, "outType");
            rd.m.e(g1Var, "source");
            rd.m.e(aVar2, "destructuringVariables");
            this.f19810v = dd.k.b(aVar2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final List O0(b bVar) {
            return bVar.P0();
        }

        public final List P0() {
            return (List) this.f19810v.getValue();
        }

        @Override // ke.u0, he.s1
        public s1 x(he.a aVar, mf.f fVar, int i10) {
            rd.m.e(aVar, "newOwner");
            rd.m.e(fVar, "newName");
            ie.h annotations = getAnnotations();
            rd.m.d(annotations, "<get-annotations>(...)");
            eg.r0 type = getType();
            rd.m.d(type, "getType(...)");
            boolean zU0 = u0();
            boolean zB0 = b0();
            boolean Z = Z();
            eg.r0 r0VarK0 = k0();
            g1 g1Var = g1.f15281a;
            rd.m.d(g1Var, "NO_SOURCE");
            return new b(aVar, null, i10, annotations, fVar, type, zU0, zB0, Z, r0VarK0, g1Var, new v0(this));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(he.a aVar, s1 s1Var, int i10, ie.h hVar, mf.f fVar, eg.r0 r0Var, boolean z10, boolean z11, boolean z12, eg.r0 r0Var2, g1 g1Var) {
        super(aVar, hVar, fVar, r0Var, g1Var);
        rd.m.e(aVar, "containingDeclaration");
        rd.m.e(hVar, "annotations");
        rd.m.e(fVar, "name");
        rd.m.e(r0Var, "outType");
        rd.m.e(g1Var, "source");
        this.f19804f = i10;
        this.f19805g = z10;
        this.f19806h = z11;
        this.f19807r = z12;
        this.f19808s = r0Var2;
        this.f19809t = s1Var == null ? this : s1Var;
    }

    public static final u0 K0(he.a aVar, s1 s1Var, int i10, ie.h hVar, mf.f fVar, eg.r0 r0Var, boolean z10, boolean z11, boolean z12, eg.r0 r0Var2, g1 g1Var, qd.a aVar2) {
        return f19803u.a(aVar, s1Var, i10, hVar, fVar, r0Var, z10, z11, z12, r0Var2, g1Var, aVar2);
    }

    public Void L0() {
        return null;
    }

    @Override // he.i1
    /* JADX INFO: renamed from: M0, reason: merged with bridge method [inline-methods] */
    public s1 c(f2 f2Var) {
        rd.m.e(f2Var, "substitutor");
        if (f2Var.k()) {
            return this;
        }
        throw new UnsupportedOperationException();
    }

    @Override // he.t1
    public /* bridge */ /* synthetic */ sf.g Y() {
        return (sf.g) L0();
    }

    @Override // he.s1
    public boolean Z() {
        return this.f19807r;
    }

    @Override // he.s1
    public boolean b0() {
        return this.f19806h;
    }

    @Override // he.a
    public Collection e() {
        Collection collectionE = b().e();
        rd.m.d(collectionE, "getOverriddenDescriptors(...)");
        ArrayList arrayList = new ArrayList(ed.q.v(collectionE, 10));
        Iterator it = collectionE.iterator();
        while (it.hasNext()) {
            arrayList.add((s1) ((he.a) it.next()).i().get(getIndex()));
        }
        return arrayList;
    }

    @Override // he.s1
    public int getIndex() {
        return this.f19804f;
    }

    @Override // he.q
    public he.u getVisibility() {
        he.u uVar = he.t.f15310f;
        rd.m.d(uVar, "LOCAL");
        return uVar;
    }

    @Override // he.t1
    public boolean j0() {
        return false;
    }

    @Override // he.s1
    public eg.r0 k0() {
        return this.f19808s;
    }

    @Override // he.m
    public Object t0(he.o oVar, Object obj) {
        rd.m.e(oVar, "visitor");
        return oVar.j(this, obj);
    }

    @Override // he.s1
    public boolean u0() {
        if (!this.f19805g) {
            return false;
        }
        he.a aVarB = b();
        rd.m.c(aVarB, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.CallableMemberDescriptor");
        return ((he.b) aVarB).j().a();
    }

    @Override // he.s1
    public s1 x(he.a aVar, mf.f fVar, int i10) {
        rd.m.e(aVar, "newOwner");
        rd.m.e(fVar, "newName");
        ie.h annotations = getAnnotations();
        rd.m.d(annotations, "<get-annotations>(...)");
        eg.r0 type = getType();
        rd.m.d(type, "getType(...)");
        boolean zU0 = u0();
        boolean zB0 = b0();
        boolean Z = Z();
        eg.r0 r0VarK0 = k0();
        g1 g1Var = g1.f15281a;
        rd.m.d(g1Var, "NO_SOURCE");
        return new u0(aVar, null, i10, annotations, fVar, type, zU0, zB0, Z, r0VarK0, g1Var);
    }

    @Override // ke.n, he.m
    public he.a b() {
        he.m mVarB = super.b();
        rd.m.c(mVarB, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.CallableDescriptor");
        return (he.a) mVarB;
    }

    @Override // ke.n, ke.m, he.m
    public s1 a() {
        s1 s1Var = this.f19809t;
        return s1Var == this ? this : s1Var.a();
    }
}
