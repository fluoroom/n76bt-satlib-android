package ef;

import ag.n0;
import ef.a0;
import ef.x;
import eg.r0;
import he.g1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import sf.s;

/* JADX INFO: loaded from: classes3.dex */
public abstract class d extends e implements ag.e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final dg.g f11943c;

    public static final class a implements x.d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ HashMap f11945b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ x f11946c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ HashMap f11947d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ HashMap f11948e;

        /* JADX INFO: renamed from: ef.d$a$a, reason: collision with other inner class name */
        public final class C0159a extends b implements x.e {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ a f11949d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0159a(a aVar, a0 a0Var) {
                super(aVar, a0Var);
                rd.m.e(a0Var, "signature");
                this.f11949d = aVar;
            }

            @Override // ef.x.e
            public x.a b(int i10, mf.b bVar, g1 g1Var) {
                rd.m.e(bVar, "classId");
                rd.m.e(g1Var, "source");
                a0 a0VarE = a0.f11939b.e(d(), i10);
                List arrayList = (List) this.f11949d.f11945b.get(a0VarE);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    this.f11949d.f11945b.put(a0VarE, arrayList);
                }
                return d.this.y(bVar, g1Var, arrayList);
            }
        }

        public class b implements x.c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final a0 f11950a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final ArrayList f11951b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ a f11952c;

            public b(a aVar, a0 a0Var) {
                rd.m.e(a0Var, "signature");
                this.f11952c = aVar;
                this.f11950a = a0Var;
                this.f11951b = new ArrayList();
            }

            @Override // ef.x.c
            public void a() {
                if (this.f11951b.isEmpty()) {
                    return;
                }
                this.f11952c.f11945b.put(this.f11950a, this.f11951b);
            }

            @Override // ef.x.c
            public x.a c(mf.b bVar, g1 g1Var) {
                rd.m.e(bVar, "classId");
                rd.m.e(g1Var, "source");
                return d.this.y(bVar, g1Var, this.f11951b);
            }

            protected final a0 d() {
                return this.f11950a;
            }
        }

        a(HashMap map, x xVar, HashMap map2, HashMap map3) {
            this.f11945b = map;
            this.f11946c = xVar;
            this.f11947d = map2;
            this.f11948e = map3;
        }

        @Override // ef.x.d
        public x.e a(mf.f fVar, String str) {
            rd.m.e(fVar, "name");
            rd.m.e(str, "desc");
            a0.a aVar = a0.f11939b;
            String strD = fVar.d();
            rd.m.d(strD, "asString(...)");
            return new C0159a(this, aVar.d(strD, str));
        }

        @Override // ef.x.d
        public x.c b(mf.f fVar, String str, Object obj) {
            Object objI;
            rd.m.e(fVar, "name");
            rd.m.e(str, "desc");
            a0.a aVar = a0.f11939b;
            String strD = fVar.d();
            rd.m.d(strD, "asString(...)");
            a0 a0VarA = aVar.a(strD, str);
            if (obj != null && (objI = d.this.I(str, obj)) != null) {
                this.f11948e.put(a0VarA, objI);
            }
            return new b(this, a0VarA);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(dg.n nVar, v vVar) {
        super(vVar);
        rd.m.e(nVar, "storageManager");
        rd.m.e(vVar, "kotlinClassFinder");
        this.f11943c = nVar.f(new ef.a(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object G(g gVar, a0 a0Var) {
        rd.m.e(gVar, "$this$loadConstantFromProperty");
        rd.m.e(a0Var, "it");
        return gVar.b().get(a0Var);
    }

    private final g H(x xVar) {
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        HashMap map3 = new HashMap();
        xVar.c(new a(map, xVar, map3, map2), r(xVar));
        return new g(map, map2, map3);
    }

    private final Object J(n0 n0Var, gf.o oVar, ag.d dVar, r0 r0Var, qd.p pVar) {
        Object objS;
        x xVarP = p(n0Var, e.f11954b.a(n0Var, true, true, jf.b.B.d(oVar.N0()), lf.h.f(oVar), u(), v()));
        if (xVarP == null) {
            return null;
        }
        a0 a0VarS = s(oVar, n0Var.b(), n0Var.d(), dVar, xVarP.a().d().d(n.f12020b.a()));
        if (a0VarS == null || (objS = pVar.s(this.f11943c.l(xVarP), a0VarS)) == null) {
            return null;
        }
        return ee.s.d(r0Var) ? M(objS) : objS;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object K(g gVar, a0 a0Var) {
        rd.m.e(gVar, "$this$loadConstantFromProperty");
        rd.m.e(a0Var, "it");
        return gVar.c().get(a0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g L(d dVar, x xVar) {
        rd.m.e(xVar, "kotlinClass");
        return dVar.H(xVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ef.e
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public g q(x xVar) {
        rd.m.e(xVar, "binaryClass");
        return (g) this.f11943c.l(xVar);
    }

    protected final boolean F(mf.b bVar, Map map) {
        rd.m.e(bVar, "annotationClassId");
        rd.m.e(map, "arguments");
        if (!rd.m.a(bVar, de.a.f10935a.a())) {
            return false;
        }
        Object obj = map.get(mf.f.h("value"));
        sf.s sVar = obj instanceof sf.s ? (sf.s) obj : null;
        if (sVar == null) {
            return false;
        }
        Object objB = sVar.b();
        s.b.C0378b c0378b = objB instanceof s.b.C0378b ? (s.b.C0378b) objB : null;
        if (c0378b == null) {
            return false;
        }
        return w(c0378b.b());
    }

    protected abstract Object I(String str, Object obj);

    protected abstract Object M(Object obj);

    @Override // ag.e
    public Object a(n0 n0Var, gf.o oVar, r0 r0Var) {
        rd.m.e(n0Var, "container");
        rd.m.e(oVar, "proto");
        rd.m.e(r0Var, "expectedType");
        return J(n0Var, oVar, ag.d.PROPERTY_GETTER, r0Var, b.f11941a);
    }

    @Override // ag.e
    public Object k(n0 n0Var, gf.o oVar, r0 r0Var) {
        rd.m.e(n0Var, "container");
        rd.m.e(oVar, "proto");
        rd.m.e(r0Var, "expectedType");
        return J(n0Var, oVar, ag.d.PROPERTY, r0Var, c.f11942a);
    }
}
