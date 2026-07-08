package we;

import dd.w;
import ed.k0;
import ee.o;
import eg.r0;
import he.h0;
import he.s1;
import ie.q;
import ie.r;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class f {

    /* JADX INFO: renamed from: a */
    public static final f f31409a = new f();

    /* JADX INFO: renamed from: b */
    private static final Map f31410b = k0.l(w.a("PACKAGE", EnumSet.noneOf(r.class)), w.a("TYPE", EnumSet.of(r.C, r.P)), w.a("ANNOTATION_TYPE", EnumSet.of(r.D)), w.a("TYPE_PARAMETER", EnumSet.of(r.E)), w.a("FIELD", EnumSet.of(r.G)), w.a("LOCAL_VARIABLE", EnumSet.of(r.H)), w.a("PARAMETER", EnumSet.of(r.I)), w.a("CONSTRUCTOR", EnumSet.of(r.J)), w.a("METHOD", EnumSet.of(r.K, r.L, r.M)), w.a("TYPE_USE", EnumSet.of(r.N)));

    /* JADX INFO: renamed from: c */
    private static final Map f31411c = k0.l(w.a("RUNTIME", q.f16070a), w.a("CLASS", q.f16071b), w.a("SOURCE", q.f16072c));

    private f() {
    }

    public static final r0 e(h0 h0Var) {
        r0 type;
        rd.m.e(h0Var, "module");
        s1 s1VarB = a.b(d.f31403a.d(), h0Var.o().p(o.a.H));
        return (s1VarB == null || (type = s1VarB.getType()) == null) ? gg.l.d(gg.k.L0, new String[0]) : type;
    }

    public final sf.g b(cf.b bVar) {
        cf.m mVar = bVar instanceof cf.m ? (cf.m) bVar : null;
        if (mVar != null) {
            Map map = f31411c;
            mf.f fVarC = mVar.c();
            q qVar = (q) map.get(fVarC != null ? fVarC.d() : null);
            if (qVar != null) {
                mf.b bVarC = mf.b.f21989d.c(o.a.K);
                mf.f fVarH = mf.f.h(qVar.name());
                rd.m.d(fVarH, "identifier(...)");
                return new sf.k(bVarC, fVarH);
            }
        }
        return null;
    }

    public final Set c(String str) {
        EnumSet enumSet = (EnumSet) f31410b.get(str);
        return enumSet != null ? enumSet : ed.r0.d();
    }

    public final sf.g d(List list) {
        rd.m.e(list, "arguments");
        ArrayList<cf.m> arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof cf.m) {
                arrayList.add(obj);
            }
        }
        ArrayList<r> arrayList2 = new ArrayList();
        for (cf.m mVar : arrayList) {
            f fVar = f31409a;
            mf.f fVarC = mVar.c();
            ed.q.A(arrayList2, fVar.c(fVarC != null ? fVarC.d() : null));
        }
        ArrayList arrayList3 = new ArrayList(ed.q.v(arrayList2, 10));
        for (r rVar : arrayList2) {
            mf.b bVarC = mf.b.f21989d.c(o.a.J);
            mf.f fVarH = mf.f.h(rVar.name());
            rd.m.d(fVarH, "identifier(...)");
            arrayList3.add(new sf.k(bVarC, fVarH));
        }
        return new sf.b(arrayList3, e.f31408a);
    }
}
