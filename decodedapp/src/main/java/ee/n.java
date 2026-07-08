package ee;

import ee.o;
import eg.j1;
import eg.q1;
import eg.r0;
import eg.u0;
import he.h0;
import he.l1;
import he.m0;
import he.y;
import java.util.List;
import rd.c0;
import rd.w;

/* JADX INFO: loaded from: classes3.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final m0 f11824a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final dd.j f11825b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a f11826c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final a f11827d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final a f11828e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final a f11829f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final a f11830g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final a f11831h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final a f11832i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final a f11833j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    static final /* synthetic */ yd.j[] f11823l = {c0.f(new w(n.class, "kClass", "getKClass()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;", 0)), c0.f(new w(n.class, "kProperty", "getKProperty()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;", 0)), c0.f(new w(n.class, "kProperty0", "getKProperty0()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;", 0)), c0.f(new w(n.class, "kProperty1", "getKProperty1()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;", 0)), c0.f(new w(n.class, "kProperty2", "getKProperty2()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;", 0)), c0.f(new w(n.class, "kMutableProperty0", "getKMutableProperty0()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;", 0)), c0.f(new w(n.class, "kMutableProperty1", "getKMutableProperty1()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;", 0)), c0.f(new w(n.class, "kMutableProperty2", "getKMutableProperty2()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;", 0))};

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final b f11822k = new b(null);

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f11834a;

        public a(int i10) {
            this.f11834a = i10;
        }

        public final he.e a(n nVar, yd.j jVar) {
            rd.m.e(nVar, "types");
            rd.m.e(jVar, "property");
            return nVar.c(mg.a.a(jVar.getName()), this.f11834a);
        }
    }

    public static final class b {
        public /* synthetic */ b(rd.h hVar) {
            this();
        }

        public final r0 a(h0 h0Var) {
            rd.m.e(h0Var, "module");
            he.e eVarB = y.b(h0Var, o.a.f11906w0);
            if (eVarB == null) {
                return null;
            }
            q1 q1VarK = q1.f12167b.k();
            List parameters = eVarB.k().getParameters();
            rd.m.d(parameters, "getParameters(...)");
            Object objW0 = ed.q.w0(parameters);
            rd.m.d(objW0, "single(...)");
            return u0.h(q1VarK, eVarB, ed.q.e(new j1((l1) objW0)));
        }

        private b() {
        }
    }

    public n(h0 h0Var, m0 m0Var) {
        rd.m.e(h0Var, "module");
        rd.m.e(m0Var, "notFoundClasses");
        this.f11824a = m0Var;
        this.f11825b = dd.k.a(dd.n.f10910b, new m(h0Var));
        this.f11826c = new a(1);
        this.f11827d = new a(1);
        this.f11828e = new a(1);
        this.f11829f = new a(2);
        this.f11830g = new a(3);
        this.f11831h = new a(1);
        this.f11832i = new a(2);
        this.f11833j = new a(3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final he.e c(String str, int i10) {
        mf.f fVarH = mf.f.h(str);
        rd.m.d(fVarH, "identifier(...)");
        he.h hVarG = e().g(fVarH, pe.d.f24120h);
        he.e eVar = hVarG instanceof he.e ? (he.e) hVarG : null;
        return eVar == null ? this.f11824a.d(new mf.b(o.f11859y, fVarH), ed.q.e(Integer.valueOf(i10))) : eVar;
    }

    private final xf.k e() {
        return (xf.k) this.f11825b.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final xf.k f(h0 h0Var) {
        return h0Var.y(o.f11859y).p();
    }

    public final he.e d() {
        return this.f11826c.a(this, f11823l[0]);
    }
}
