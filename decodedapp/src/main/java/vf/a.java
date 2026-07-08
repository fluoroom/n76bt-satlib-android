package vf;

import ed.q;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import ke.k0;
import rd.m;
import ye.k;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f30722b;

    public a(List list) {
        m.e(list, "inner");
        this.f30722b = list;
    }

    @Override // vf.f
    public List a(he.e eVar, k kVar) {
        m.e(eVar, "thisDescriptor");
        m.e(kVar, "c");
        List list = this.f30722b;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            q.A(arrayList, ((f) it.next()).a(eVar, kVar));
        }
        return arrayList;
    }

    @Override // vf.f
    public void b(he.e eVar, mf.f fVar, List list, k kVar) {
        m.e(eVar, "thisDescriptor");
        m.e(fVar, "name");
        m.e(list, "result");
        m.e(kVar, "c");
        Iterator it = this.f30722b.iterator();
        while (it.hasNext()) {
            ((f) it.next()).b(eVar, fVar, list, kVar);
        }
    }

    @Override // vf.f
    public void c(he.e eVar, mf.f fVar, Collection collection, k kVar) {
        m.e(eVar, "thisDescriptor");
        m.e(fVar, "name");
        m.e(collection, "result");
        m.e(kVar, "c");
        Iterator it = this.f30722b.iterator();
        while (it.hasNext()) {
            ((f) it.next()).c(eVar, fVar, collection, kVar);
        }
    }

    @Override // vf.f
    public void d(he.e eVar, List list, k kVar) {
        m.e(eVar, "thisDescriptor");
        m.e(list, "result");
        m.e(kVar, "c");
        Iterator it = this.f30722b.iterator();
        while (it.hasNext()) {
            ((f) it.next()).d(eVar, list, kVar);
        }
    }

    @Override // vf.f
    public k0 e(he.e eVar, k0 k0Var, k kVar) {
        m.e(eVar, "thisDescriptor");
        m.e(k0Var, "propertyDescriptor");
        m.e(kVar, "c");
        Iterator it = this.f30722b.iterator();
        while (it.hasNext()) {
            k0Var = ((f) it.next()).e(eVar, k0Var, kVar);
        }
        return k0Var;
    }

    @Override // vf.f
    public List f(he.e eVar, k kVar) {
        m.e(eVar, "thisDescriptor");
        m.e(kVar, "c");
        List list = this.f30722b;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            q.A(arrayList, ((f) it.next()).f(eVar, kVar));
        }
        return arrayList;
    }

    @Override // vf.f
    public void g(he.e eVar, mf.f fVar, Collection collection, k kVar) {
        m.e(eVar, "thisDescriptor");
        m.e(fVar, "name");
        m.e(collection, "result");
        m.e(kVar, "c");
        Iterator it = this.f30722b.iterator();
        while (it.hasNext()) {
            ((f) it.next()).g(eVar, fVar, collection, kVar);
        }
    }

    @Override // vf.f
    public List h(he.e eVar, k kVar) {
        m.e(eVar, "thisDescriptor");
        m.e(kVar, "c");
        List list = this.f30722b;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            q.A(arrayList, ((f) it.next()).h(eVar, kVar));
        }
        return arrayList;
    }
}
