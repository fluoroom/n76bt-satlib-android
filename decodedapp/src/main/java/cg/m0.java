package cg;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import jf.j;

/* JADX INFO: loaded from: classes3.dex */
public class m0 extends w {

    /* JADX INFO: renamed from: g */
    private final he.n0 f4824g;

    /* JADX INFO: renamed from: h */
    private final String f4825h;

    /* JADX INFO: renamed from: i */
    private final mf.c f4826i;

    public m0(he.n0 n0Var, gf.m mVar, jf.d dVar, jf.a aVar, s sVar, ag.n nVar, String str, qd.a aVar2) {
        rd.m.e(n0Var, "packageDescriptor");
        rd.m.e(mVar, "proto");
        rd.m.e(dVar, "nameResolver");
        rd.m.e(aVar, "metadataVersion");
        rd.m.e(nVar, "components");
        rd.m.e(str, "debugName");
        rd.m.e(aVar2, "classNames");
        gf.u uVarC0 = mVar.c0();
        rd.m.d(uVarC0, "getTypeTable(...)");
        jf.h hVar = new jf.h(uVarC0);
        j.a aVar3 = jf.j.f18710b;
        gf.x xVarD0 = mVar.d0();
        rd.m.d(xVarD0, "getVersionRequirementTable(...)");
        ag.p pVarA = nVar.a(n0Var, dVar, hVar, aVar3.a(xVarD0), aVar, sVar);
        List listT = mVar.T();
        rd.m.d(listT, "getFunctionList(...)");
        List listY = mVar.Y();
        rd.m.d(listY, "getPropertyList(...)");
        List listB0 = mVar.b0();
        rd.m.d(listB0, "getTypeAliasList(...)");
        super(pVarA, listT, listY, listB0, aVar2);
        this.f4824g = n0Var;
        this.f4825h = str;
        this.f4826i = n0Var.d();
    }

    @Override // xf.l, xf.n
    /* JADX INFO: renamed from: B */
    public List e(xf.d dVar, qd.l lVar) {
        rd.m.e(dVar, "kindFilter");
        rd.m.e(lVar, "nameFilter");
        Collection collectionM = m(dVar, lVar, pe.d.f24125v);
        Iterable iterableL = s().c().l();
        ArrayList arrayList = new ArrayList();
        Iterator it = iterableL.iterator();
        while (it.hasNext()) {
            ed.q.A(arrayList, ((je.b) it.next()).b(this.f4826i));
        }
        return ed.q.s0(collectionM, arrayList);
    }

    public void C(mf.f fVar, pe.b bVar) {
        rd.m.e(fVar, "name");
        rd.m.e(bVar, "location");
        oe.a.b(s().c().p(), bVar, this.f4824g, fVar);
    }

    @Override // cg.w, xf.l, xf.n
    public he.h g(mf.f fVar, pe.b bVar) {
        rd.m.e(fVar, "name");
        rd.m.e(bVar, "location");
        C(fVar, bVar);
        return super.g(fVar, bVar);
    }

    @Override // cg.w
    protected void j(Collection collection, qd.l lVar) {
        rd.m.e(collection, "result");
        rd.m.e(lVar, "nameFilter");
    }

    @Override // cg.w
    protected mf.b p(mf.f fVar) {
        rd.m.e(fVar, "name");
        return new mf.b(this.f4826i, fVar);
    }

    public String toString() {
        return this.f4825h;
    }

    @Override // cg.w
    protected Set v() {
        return ed.r0.d();
    }

    @Override // cg.w
    protected Set w() {
        return ed.r0.d();
    }

    @Override // cg.w
    protected Set x() {
        return ed.r0.d();
    }

    @Override // cg.w
    protected boolean z(mf.f fVar) {
        rd.m.e(fVar, "name");
        if (super.z(fVar)) {
            return true;
        }
        Iterable iterableL = s().c().l();
        if ((iterableL instanceof Collection) && ((Collection) iterableL).isEmpty()) {
            return false;
        }
        Iterator it = iterableL.iterator();
        while (it.hasNext()) {
            if (((je.b) it.next()).c(this.f4826i, fVar)) {
                return true;
            }
        }
        return false;
    }
}
