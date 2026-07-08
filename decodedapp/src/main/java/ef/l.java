package ef;

import ag.o;
import df.l1;
import he.j1;
import he.m0;
import java.util.List;
import pe.c;
import ve.v;
import we.i;
import ye.e;

/* JADX INFO: loaded from: classes3.dex */
public abstract class l {

    public static final class a implements ve.a0 {
        a() {
        }

        @Override // ve.a0
        public List a(mf.b bVar) {
            rd.m.e(bVar, "classId");
            return null;
        }
    }

    public static final k a(he.h0 h0Var, dg.n nVar, m0 m0Var, ye.j jVar, v vVar, n nVar2, ag.w wVar, jf.c cVar) {
        rd.m.e(h0Var, "module");
        rd.m.e(nVar, "storageManager");
        rd.m.e(m0Var, "notFoundClasses");
        rd.m.e(jVar, "lazyJavaPackageFragmentProvider");
        rd.m.e(vVar, "reflectKotlinClassFinder");
        rd.m.e(nVar2, "deserializedDescriptorResolver");
        rd.m.e(wVar, "errorReporter");
        rd.m.e(cVar, "metadataVersion");
        return new k(nVar, h0Var, o.a.f556a, new o(vVar, nVar2), i.a(h0Var, m0Var, nVar, vVar, cVar), jVar, m0Var, wVar, c.a.f24112a, ag.m.f518a.a(), fg.p.f13077b.a(), new hg.a(ed.q.e(eg.x.f12218a)));
    }

    public static final ye.j b(ve.u uVar, he.h0 h0Var, dg.n nVar, m0 m0Var, v vVar, n nVar2, ag.w wVar, bf.b bVar, ye.n nVar3, d0 d0Var) {
        rd.m.e(uVar, "javaClassFinder");
        rd.m.e(h0Var, "module");
        rd.m.e(nVar, "storageManager");
        rd.m.e(m0Var, "notFoundClasses");
        rd.m.e(vVar, "reflectKotlinClassFinder");
        rd.m.e(nVar2, "deserializedDescriptorResolver");
        rd.m.e(wVar, "errorReporter");
        rd.m.e(bVar, "javaSourceElementFactory");
        rd.m.e(nVar3, "singleModuleClassResolver");
        rd.m.e(d0Var, "packagePartProvider");
        ve.e0 e0VarB = ve.e0.f30573d.b(new dd.h(1, 9));
        we.o oVar = we.o.f31423a;
        rd.m.d(oVar, "DO_NOTHING");
        we.j jVar = we.j.f31416a;
        rd.m.d(jVar, "EMPTY");
        i.a aVar = i.a.f31415a;
        wf.b bVar2 = new wf.b(nVar, ed.q.k());
        j1.a aVar2 = j1.a.f15286a;
        c.a aVar3 = c.a.f24112a;
        ee.n nVar4 = new ee.n(h0Var, m0Var);
        ve.d dVar = new ve.d(e0VarB);
        e.a aVar4 = e.a.f32574a;
        return new ye.j(new ye.d(nVar, uVar, vVar, nVar2, oVar, wVar, jVar, aVar, bVar2, bVar, nVar3, d0Var, aVar2, aVar3, h0Var, nVar4, dVar, new l1(new df.g(aVar4)), v.a.f30708a, aVar4, fg.p.f13077b.a(), e0VarB, new a(), null, 8388608, null));
    }
}
