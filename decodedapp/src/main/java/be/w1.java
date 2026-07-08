package be;

import be.c3;
import be.d1;
import java.util.Collection;
import of.i;
import xf.k;

/* JADX INFO: loaded from: classes3.dex */
public final class w1 extends d1 {

    /* JADX INFO: renamed from: d */
    private final Class f4004d;

    /* JADX INFO: renamed from: e */
    private final dd.j f4005e;

    final class a extends d1.b {

        /* JADX INFO: renamed from: j */
        static final /* synthetic */ yd.j[] f4006j = {rd.c0.f(new rd.w(a.class, "kotlinClass", "getKotlinClass()Lorg/jetbrains/kotlin/descriptors/runtime/components/ReflectKotlinClass;", 0)), rd.c0.f(new rd.w(a.class, "scope", "getScope()Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;", 0)), rd.c0.f(new rd.w(a.class, "members", "getMembers()Ljava/util/Collection;", 0))};

        /* JADX INFO: renamed from: d */
        private final c3.a f4007d;

        /* JADX INFO: renamed from: e */
        private final c3.a f4008e;

        /* JADX INFO: renamed from: f */
        private final dd.j f4009f;

        /* JADX INFO: renamed from: g */
        private final dd.j f4010g;

        /* JADX INFO: renamed from: h */
        private final c3.a f4011h;

        public a() {
            super();
            this.f4007d = c3.c(new r1(w1.this));
            this.f4008e = c3.c(new s1(this));
            dd.n nVar = dd.n.f10910b;
            this.f4009f = dd.k.a(nVar, new t1(this, w1.this));
            this.f4010g = dd.k.a(nVar, new u1(this));
            this.f4011h = c3.c(new v1(w1.this, this));
        }

        private final me.f i() {
            return (me.f) this.f4007d.d(this, f4006j[0]);
        }

        public static final me.f m(w1 w1Var) {
            return me.f.f21968c.a(w1Var.d());
        }

        public static final Collection n(w1 w1Var, a aVar) {
            return w1Var.A(aVar.l(), d1.d.f3847a);
        }

        public static final dd.v o(a aVar) {
            ff.a aVarA;
            me.f fVarI = aVar.i();
            if (fVarI != null && (aVarA = fVarI.a()) != null) {
                String[] strArrA = aVarA.a();
                String[] strArrG = aVarA.g();
                if (strArrA != null && strArrG != null) {
                    dd.q qVarM = lf.h.m(strArrA, strArrG);
                    return new dd.v((lf.e) qVarM.a(), (gf.m) qVarM.b(), aVarA.d());
                }
            }
            return null;
        }

        public static final Class p(a aVar, w1 w1Var) {
            ff.a aVarA;
            me.f fVarI = aVar.i();
            String strE = (fVarI == null || (aVarA = fVarI.a()) == null) ? null : aVarA.e();
            if (strE == null || strE.length() <= 0) {
                return null;
            }
            return w1Var.d().getClassLoader().loadClass(rg.q.E(strE, '/', '.', false, 4, null));
        }

        public static final xf.k q(a aVar) {
            me.f fVarI = aVar.i();
            return fVarI != null ? aVar.b().c().a(fVarI) : k.b.f32079b;
        }

        public final dd.v j() {
            return (dd.v) this.f4010g.getValue();
        }

        public final Class k() {
            return (Class) this.f4009f.getValue();
        }

        public final xf.k l() {
            Object objD = this.f4008e.d(this, f4006j[1]);
            rd.m.d(objD, "getValue(...)");
            return (xf.k) objD;
        }
    }

    public w1(Class cls) {
        rd.m.e(cls, "jClass");
        this.f4004d = cls;
        this.f4005e = dd.k.a(dd.n.f10910b, new p1(this));
    }

    public static final a K(w1 w1Var) {
        return w1Var.new a();
    }

    public static final he.y0 L(ag.k0 k0Var, gf.o oVar) {
        rd.m.e(k0Var, "$this$deserializeToDescriptor");
        rd.m.e(oVar, "proto");
        return k0Var.u(oVar, true);
    }

    private final xf.k M() {
        return ((a) this.f4005e.getValue()).l();
    }

    @Override // be.d1
    protected Class B() {
        Class clsK = ((a) this.f4005e.getValue()).k();
        return clsK == null ? d() : clsK;
    }

    @Override // be.d1
    public Collection C(mf.f fVar) {
        rd.m.e(fVar, "name");
        return M().c(fVar, pe.d.f24120h);
    }

    @Override // rd.e
    public Class d() {
        return this.f4004d;
    }

    public boolean equals(Object obj) {
        return (obj instanceof w1) && rd.m.a(d(), ((w1) obj).d());
    }

    public int hashCode() {
        return d().hashCode();
    }

    public String toString() {
        return "file class " + ne.f.e(d()).a();
    }

    @Override // be.d1
    public Collection x() {
        return ed.q.k();
    }

    @Override // be.d1
    public Collection y(mf.f fVar) {
        rd.m.e(fVar, "name");
        return M().a(fVar, pe.d.f24120h);
    }

    @Override // be.d1
    public he.y0 z(int i10) {
        dd.v vVarJ = ((a) this.f4005e.getValue()).j();
        if (vVarJ != null) {
            lf.e eVar = (lf.e) vVarJ.a();
            gf.m mVar = (gf.m) vVarJ.b();
            jf.c cVar = (jf.c) vVarJ.c();
            i.f fVar = kf.a.f19846n;
            rd.m.d(fVar, "packageLocalVariable");
            gf.o oVar = (gf.o) jf.f.b(mVar, fVar, i10);
            if (oVar != null) {
                Class clsD = d();
                gf.u uVarC0 = mVar.c0();
                rd.m.d(uVarC0, "getTypeTable(...)");
                return (he.y0) l3.h(clsD, oVar, eVar, new jf.h(uVarC0), cVar, q1.f3967a);
            }
        }
        return null;
    }
}
