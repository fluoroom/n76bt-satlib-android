package ef;

import ag.n0;
import ef.a0;
import ef.x;
import gf.c;
import he.g1;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kf.a;
import lf.d;
import mf.b;
import of.i;

/* JADX INFO: loaded from: classes3.dex */
public abstract class e implements ag.h {

    /* JADX INFO: renamed from: b */
    public static final b f11954b = new b(null);

    /* JADX INFO: renamed from: a */
    private final v f11955a;

    public static abstract class a {
        public abstract Map a();
    }

    public static final class b {
        public /* synthetic */ b(rd.h hVar) {
            this();
        }

        public final x a(n0 n0Var, boolean z10, boolean z11, Boolean bool, boolean z12, v vVar, jf.c cVar) {
            n0.a aVarH;
            rd.m.e(n0Var, "container");
            rd.m.e(vVar, "kotlinClassFinder");
            rd.m.e(cVar, "metadataVersion");
            if (z10) {
                if (bool == null) {
                    throw new IllegalStateException(("isConst should not be null for property (container=" + n0Var + ')').toString());
                }
                if (n0Var instanceof n0.a) {
                    n0.a aVar = (n0.a) n0Var;
                    if (aVar.g() == c.EnumC0201c.INTERFACE) {
                        mf.b bVarE = aVar.e();
                        mf.f fVarH = mf.f.h("DefaultImpls");
                        rd.m.d(fVarH, "identifier(...)");
                        return w.b(vVar, bVarE.d(fVarH), cVar);
                    }
                }
                if (bool.booleanValue() && (n0Var instanceof n0.b)) {
                    g1 g1VarC = n0Var.c();
                    r rVar = g1VarC instanceof r ? (r) g1VarC : null;
                    vf.d dVarF = rVar != null ? rVar.f() : null;
                    if (dVarF != null) {
                        b.a aVar2 = mf.b.f21989d;
                        String strF = dVarF.f();
                        rd.m.d(strF, "getInternalName(...)");
                        return w.b(vVar, aVar2.c(new mf.c(rg.q.E(strF, '/', '.', false, 4, null))), cVar);
                    }
                }
            }
            if (z11 && (n0Var instanceof n0.a)) {
                n0.a aVar3 = (n0.a) n0Var;
                if (aVar3.g() == c.EnumC0201c.COMPANION_OBJECT && (aVarH = aVar3.h()) != null && (aVarH.g() == c.EnumC0201c.CLASS || aVarH.g() == c.EnumC0201c.ENUM_CLASS || (z12 && (aVarH.g() == c.EnumC0201c.INTERFACE || aVarH.g() == c.EnumC0201c.ANNOTATION_CLASS)))) {
                    g1 g1VarC2 = aVarH.c();
                    z zVar = g1VarC2 instanceof z ? (z) g1VarC2 : null;
                    if (zVar != null) {
                        return zVar.d();
                    }
                    return null;
                }
            }
            if (!(n0Var instanceof n0.b) || !(n0Var.c() instanceof r)) {
                return null;
            }
            g1 g1VarC3 = n0Var.c();
            rd.m.c(g1VarC3, "null cannot be cast to non-null type org.jetbrains.kotlin.load.kotlin.JvmPackagePartSource");
            r rVar2 = (r) g1VarC3;
            x xVarG = rVar2.g();
            return xVarG == null ? w.b(vVar, rVar2.d(), cVar) : xVarG;
        }

        private b() {
        }
    }

    private static final class c extends Enum {

        /* JADX INFO: renamed from: a */
        public static final c f11956a = new c("PROPERTY", 0);

        /* JADX INFO: renamed from: b */
        public static final c f11957b = new c("BACKING_FIELD", 1);

        /* JADX INFO: renamed from: c */
        public static final c f11958c = new c("DELEGATE_FIELD", 2);

        /* JADX INFO: renamed from: d */
        private static final /* synthetic */ c[] f11959d;

        /* JADX INFO: renamed from: e */
        private static final /* synthetic */ kd.a f11960e;

        static {
            c[] cVarArrA = a();
            f11959d = cVarArrA;
            f11960e = kd.b.a(cVarArrA);
        }

        private c(String str, int i10) {
            super(str, i10);
        }

        private static final /* synthetic */ c[] a() {
            return new c[]{f11956a, f11957b, f11958c};
        }

        public static c valueOf(String str) {
            return (c) Enum.valueOf(c.class, str);
        }

        public static c[] values() {
            return (c[]) f11959d.clone();
        }
    }

    public static final /* synthetic */ class d {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f11961a;

        static {
            int[] iArr = new int[ag.d.values().length];
            try {
                iArr[ag.d.PROPERTY_GETTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ag.d.PROPERTY_SETTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ag.d.PROPERTY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f11961a = iArr;
        }
    }

    public e(v vVar) {
        rd.m.e(vVar, "kotlinClassFinder");
        this.f11955a = vVar;
    }

    private final x A(n0.a aVar) {
        g1 g1VarC = aVar.c();
        z zVar = g1VarC instanceof z ? (z) g1VarC : null;
        if (zVar != null) {
            return zVar.d();
        }
        return null;
    }

    private final int m(n0 n0Var, of.p pVar) {
        if (pVar instanceof gf.j) {
            return jf.g.g((gf.j) pVar) ? 1 : 0;
        }
        if (pVar instanceof gf.o) {
            return jf.g.h((gf.o) pVar) ? 1 : 0;
        }
        if (!(pVar instanceof gf.e)) {
            throw new UnsupportedOperationException("Unsupported message: " + pVar.getClass());
        }
        rd.m.c(n0Var, "null cannot be cast to non-null type org.jetbrains.kotlin.serialization.deserialization.ProtoContainer.Class");
        n0.a aVar = (n0.a) n0Var;
        if (aVar.g() == c.EnumC0201c.ENUM_CLASS) {
            return 2;
        }
        return aVar.i() ? 1 : 0;
    }

    private final List n(n0 n0Var, a0 a0Var, boolean z10, boolean z11, Boolean bool, boolean z12) {
        x xVarP = p(n0Var, f11954b.a(n0Var, z10, z11, bool, z12, this.f11955a, v()));
        if (xVarP == null) {
            return ed.q.k();
        }
        List list = (List) q(xVarP).a().get(a0Var);
        return list == null ? ed.q.k() : list;
    }

    static /* synthetic */ List o(e eVar, n0 n0Var, a0 a0Var, boolean z10, boolean z11, Boolean bool, boolean z12, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: findClassAndLoadMemberAnnotations");
        }
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        if ((i10 & 8) != 0) {
            z11 = false;
        }
        if ((i10 & 16) != 0) {
            bool = null;
        }
        if ((i10 & 32) != 0) {
            z12 = false;
        }
        return eVar.n(n0Var, a0Var, z10, z11, bool, z12);
    }

    public static /* synthetic */ a0 t(e eVar, of.p pVar, jf.d dVar, jf.h hVar, ag.d dVar2, boolean z10, int i10, Object obj) {
        if (obj == null) {
            return eVar.s(pVar, dVar, hVar, dVar2, (i10 & 16) != 0 ? false : z10);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getCallableSignature");
    }

    private final List z(n0 n0Var, gf.o oVar, c cVar) {
        Boolean boolD = jf.b.B.d(oVar.N0());
        rd.m.d(boolD, "get(...)");
        boolD.booleanValue();
        boolean zF = lf.h.f(oVar);
        if (cVar == c.f11956a) {
            a0 a0VarB = f.b(oVar, n0Var.b(), n0Var.d(), false, true, false, 40, null);
            return a0VarB == null ? ed.q.k() : o(this, n0Var, a0VarB, true, false, boolD, zF, 8, null);
        }
        a0 a0VarB2 = f.b(oVar, n0Var.b(), n0Var.d(), true, false, false, 48, null);
        if (a0VarB2 == null) {
            return ed.q.k();
        }
        return rg.q.P(a0VarB2.a(), "$delegate", false, 2, null) != (cVar == c.f11958c) ? ed.q.k() : n(n0Var, a0VarB2, true, true, boolD, zF);
    }

    @Override // ag.h
    public List b(gf.r rVar, jf.d dVar) {
        rd.m.e(rVar, "proto");
        rd.m.e(dVar, "nameResolver");
        Object objP = rVar.p(kf.a.f19838f);
        rd.m.d(objP, "getExtension(...)");
        Iterable<gf.b> iterable = (Iterable) objP;
        ArrayList arrayList = new ArrayList(ed.q.v(iterable, 10));
        for (gf.b bVar : iterable) {
            rd.m.b(bVar);
            arrayList.add(d(bVar, dVar));
        }
        return arrayList;
    }

    @Override // ag.h
    public List c(n0 n0Var, gf.o oVar) {
        rd.m.e(n0Var, "container");
        rd.m.e(oVar, "proto");
        return z(n0Var, oVar, c.f11957b);
    }

    @Override // ag.h
    public abstract Object d(gf.b bVar, jf.d dVar);

    @Override // ag.h
    public List e(n0.a aVar) {
        rd.m.e(aVar, "container");
        x xVarA = A(aVar);
        if (xVarA != null) {
            ArrayList arrayList = new ArrayList(1);
            xVarA.b(new C0160e(arrayList), r(xVarA));
            return arrayList;
        }
        throw new IllegalStateException(("Class for loading annotations is not found: " + aVar.a()).toString());
    }

    @Override // ag.h
    public List f(n0 n0Var, gf.o oVar) {
        rd.m.e(n0Var, "container");
        rd.m.e(oVar, "proto");
        return z(n0Var, oVar, c.f11958c);
    }

    @Override // ag.h
    public List g(n0 n0Var, of.p pVar, ag.d dVar) {
        rd.m.e(n0Var, "container");
        rd.m.e(pVar, "proto");
        rd.m.e(dVar, "kind");
        a0 a0VarT = t(this, pVar, n0Var.b(), n0Var.d(), dVar, false, 16, null);
        return a0VarT != null ? o(this, n0Var, a0.f11939b.e(a0VarT, 0), false, false, null, false, 60, null) : ed.q.k();
    }

    @Override // ag.h
    public List h(gf.t tVar, jf.d dVar) {
        rd.m.e(tVar, "proto");
        rd.m.e(dVar, "nameResolver");
        Object objP = tVar.p(kf.a.f19840h);
        rd.m.d(objP, "getExtension(...)");
        Iterable<gf.b> iterable = (Iterable) objP;
        ArrayList arrayList = new ArrayList(ed.q.v(iterable, 10));
        for (gf.b bVar : iterable) {
            rd.m.b(bVar);
            arrayList.add(d(bVar, dVar));
        }
        return arrayList;
    }

    @Override // ag.h
    public List i(n0 n0Var, gf.h hVar) {
        rd.m.e(n0Var, "container");
        rd.m.e(hVar, "proto");
        return o(this, n0Var, a0.f11939b.a(n0Var.b().getString(hVar.N()), lf.b.b(((n0.a) n0Var).e().b())), false, false, null, false, 60, null);
    }

    @Override // ag.h
    public List j(n0 n0Var, of.p pVar, ag.d dVar) {
        rd.m.e(n0Var, "container");
        rd.m.e(pVar, "proto");
        rd.m.e(dVar, "kind");
        if (dVar == ag.d.PROPERTY) {
            return z(n0Var, (gf.o) pVar, c.f11956a);
        }
        a0 a0VarT = t(this, pVar, n0Var.b(), n0Var.d(), dVar, false, 16, null);
        return a0VarT == null ? ed.q.k() : o(this, n0Var, a0VarT, false, false, null, false, 60, null);
    }

    @Override // ag.h
    public List l(n0 n0Var, of.p pVar, ag.d dVar, int i10, gf.v vVar) {
        rd.m.e(n0Var, "container");
        rd.m.e(pVar, "callableProto");
        rd.m.e(dVar, "kind");
        rd.m.e(vVar, "proto");
        a0 a0VarT = t(this, pVar, n0Var.b(), n0Var.d(), dVar, false, 16, null);
        if (a0VarT == null) {
            return ed.q.k();
        }
        return o(this, n0Var, a0.f11939b.e(a0VarT, i10 + m(n0Var, pVar)), false, false, null, false, 60, null);
    }

    protected final x p(n0 n0Var, x xVar) {
        rd.m.e(n0Var, "container");
        if (xVar != null) {
            return xVar;
        }
        if (n0Var instanceof n0.a) {
            return A((n0.a) n0Var);
        }
        return null;
    }

    protected abstract a q(x xVar);

    protected byte[] r(x xVar) {
        rd.m.e(xVar, "kotlinClass");
        return null;
    }

    protected final a0 s(of.p pVar, jf.d dVar, jf.h hVar, ag.d dVar2, boolean z10) {
        rd.m.e(pVar, "proto");
        rd.m.e(dVar, "nameResolver");
        rd.m.e(hVar, "typeTable");
        rd.m.e(dVar2, "kind");
        if (pVar instanceof gf.e) {
            a0.a aVar = a0.f11939b;
            d.b bVarB = lf.h.f20571a.b((gf.e) pVar, dVar, hVar);
            if (bVarB == null) {
                return null;
            }
            return aVar.b(bVarB);
        }
        if (pVar instanceof gf.j) {
            a0.a aVar2 = a0.f11939b;
            d.b bVarE = lf.h.f20571a.e((gf.j) pVar, dVar, hVar);
            if (bVarE == null) {
                return null;
            }
            return aVar2.b(bVarE);
        }
        if (pVar instanceof gf.o) {
            i.f fVar = kf.a.f19836d;
            rd.m.d(fVar, "propertySignature");
            a.d dVar3 = (a.d) jf.f.a((i.d) pVar, fVar);
            if (dVar3 == null) {
                return null;
            }
            int i10 = d.f11961a[dVar2.ordinal()];
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        return null;
                    }
                    return f.a((gf.o) pVar, dVar, hVar, true, true, z10);
                }
                if (!dVar3.H()) {
                    return null;
                }
                a0.a aVar3 = a0.f11939b;
                a.c cVarZ = dVar3.z();
                rd.m.d(cVarZ, "getSetter(...)");
                return aVar3.c(dVar, cVarZ);
            }
            if (dVar3.G()) {
                a0.a aVar4 = a0.f11939b;
                a.c cVarX = dVar3.x();
                rd.m.d(cVarX, "getGetter(...)");
                return aVar4.c(dVar, cVarX);
            }
        }
        return null;
    }

    protected final v u() {
        return this.f11955a;
    }

    public abstract jf.c v();

    protected final boolean w(mf.b bVar) {
        x xVarB;
        rd.m.e(bVar, "classId");
        return bVar.e() != null && rd.m.a(bVar.h().d(), "Container") && (xVarB = w.b(this.f11955a, bVar, v())) != null && de.a.f10935a.c(xVarB);
    }

    protected abstract x.a x(mf.b bVar, g1 g1Var, List list);

    protected final x.a y(mf.b bVar, g1 g1Var, List list) {
        rd.m.e(bVar, "annotationClassId");
        rd.m.e(g1Var, "source");
        rd.m.e(list, "result");
        if (de.a.f10935a.b().contains(bVar)) {
            return null;
        }
        return x(bVar, g1Var, list);
    }

    /* JADX INFO: renamed from: ef.e$e */
    public static final class C0160e implements x.c {

        /* JADX INFO: renamed from: b */
        final /* synthetic */ ArrayList f11963b;

        C0160e(ArrayList arrayList) {
            this.f11963b = arrayList;
        }

        @Override // ef.x.c
        public x.a c(mf.b bVar, g1 g1Var) {
            rd.m.e(bVar, "classId");
            rd.m.e(g1Var, "source");
            return e.this.y(bVar, g1Var, this.f11963b);
        }

        @Override // ef.x.c
        public void a() {
        }
    }
}
