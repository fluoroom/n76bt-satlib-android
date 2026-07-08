package gg;

import ed.q;
import eg.f2;
import eg.r0;
import he.a;
import he.a1;
import he.b;
import he.b1;
import he.e0;
import he.g1;
import he.o;
import he.t;
import he.u;
import he.w;
import he.y0;
import he.z0;
import java.util.Collection;
import java.util.List;
import ke.k0;

/* JADX INFO: loaded from: classes3.dex */
public final class f implements y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ k0 f14432a;

    public f() {
        l lVar = l.f14501a;
        k0 k0VarO0 = k0.O0(lVar.h(), ie.h.f16054l.b(), e0.f15261d, t.f15309e, true, mf.f.k(b.f14418f.d()), b.a.DECLARATION, g1.f15281a, false, false, false, false, false, false);
        k0VarO0.b1(lVar.k(), q.k(), null, null, q.k());
        this.f14432a = k0VarO0;
    }

    @Override // he.d0
    public boolean A() {
        return this.f14432a.A();
    }

    @Override // he.t1
    public boolean C() {
        return this.f14432a.C();
    }

    @Override // he.d0
    public boolean F0() {
        return this.f14432a.F0();
    }

    @Override // he.a
    public boolean J() {
        return this.f14432a.J();
    }

    @Override // he.d0
    public boolean M() {
        return this.f14432a.M();
    }

    @Override // he.u1
    public boolean P() {
        return this.f14432a.P();
    }

    @Override // he.b
    public he.b Q(he.m mVar, e0 e0Var, u uVar, b.a aVar, boolean z10) {
        y0 y0VarN0 = this.f14432a.Q(mVar, e0Var, uVar, aVar, z10);
        rd.m.d(y0VarN0, "copy(...)");
        return y0VarN0;
    }

    @Override // he.t1
    public sf.g Y() {
        return this.f14432a.Y();
    }

    @Override // he.m
    public y0 a() {
        y0 y0VarA = this.f14432a.a();
        rd.m.d(y0VarA, "getOriginal(...)");
        return y0VarA;
    }

    @Override // he.n, he.m
    public he.m b() {
        he.m mVarB = this.f14432a.b();
        rd.m.d(mVarB, "getContainingDeclaration(...)");
        return mVarB;
    }

    @Override // he.i1
    public y0 c(f2 f2Var) {
        rd.m.e(f2Var, "substitutor");
        return this.f14432a.c(f2Var);
    }

    @Override // he.a
    public Object d0(a.InterfaceC0214a interfaceC0214a) {
        return this.f14432a.d0(interfaceC0214a);
    }

    @Override // he.y0, he.b, he.a
    public Collection e() {
        Collection collectionE = this.f14432a.e();
        rd.m.d(collectionE, "getOverriddenDescriptors(...)");
        return collectionE;
    }

    @Override // he.y0
    public z0 f() {
        return this.f14432a.f();
    }

    @Override // he.a
    public r0 g() {
        return this.f14432a.g();
    }

    @Override // he.a
    public b1 g0() {
        return this.f14432a.g0();
    }

    @Override // ie.a
    public ie.h getAnnotations() {
        ie.h annotations = this.f14432a.getAnnotations();
        rd.m.d(annotations, "<get-annotations>(...)");
        return annotations;
    }

    @Override // he.j0
    public mf.f getName() {
        mf.f name = this.f14432a.getName();
        rd.m.d(name, "getName(...)");
        return name;
    }

    @Override // he.p
    public g1 getSource() {
        g1 source = this.f14432a.getSource();
        rd.m.d(source, "getSource(...)");
        return source;
    }

    @Override // he.r1
    public r0 getType() {
        r0 type = this.f14432a.getType();
        rd.m.d(type, "getType(...)");
        return type;
    }

    @Override // he.a
    public List getTypeParameters() {
        List typeParameters = this.f14432a.getTypeParameters();
        rd.m.d(typeParameters, "getTypeParameters(...)");
        return typeParameters;
    }

    @Override // he.q
    public u getVisibility() {
        u visibility = this.f14432a.getVisibility();
        rd.m.d(visibility, "getVisibility(...)");
        return visibility;
    }

    @Override // he.y0
    public a1 h() {
        return this.f14432a.h();
    }

    @Override // he.a
    public List i() {
        List listI = this.f14432a.i();
        rd.m.d(listI, "getValueParameters(...)");
        return listI;
    }

    @Override // he.b
    public b.a j() {
        b.a aVarJ = this.f14432a.j();
        rd.m.d(aVarJ, "getKind(...)");
        return aVarJ;
    }

    @Override // he.t1
    public boolean j0() {
        return this.f14432a.j0();
    }

    @Override // he.d0
    public e0 l() {
        e0 e0VarL = this.f14432a.l();
        rd.m.d(e0VarL, "getModality(...)");
        return e0VarL;
    }

    @Override // he.a
    public b1 l0() {
        return this.f14432a.l0();
    }

    @Override // he.y0
    public w m0() {
        return this.f14432a.m0();
    }

    @Override // he.y0
    public w p0() {
        return this.f14432a.p0();
    }

    @Override // he.a
    public List q0() {
        List listQ0 = this.f14432a.q0();
        rd.m.d(listQ0, "getContextReceiverParameters(...)");
        return listQ0;
    }

    @Override // he.t1
    public boolean r0() {
        return this.f14432a.r0();
    }

    @Override // he.m
    public Object t0(o oVar, Object obj) {
        return this.f14432a.t0(oVar, obj);
    }

    @Override // he.y0
    public List w() {
        List listW = this.f14432a.w();
        rd.m.d(listW, "getAccessors(...)");
        return listW;
    }

    @Override // he.b
    public void x0(Collection collection) {
        rd.m.e(collection, "overriddenDescriptors");
        this.f14432a.x0(collection);
    }
}
