package ag;

import ag.n0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import of.i;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final zf.a f460a;

    /* JADX INFO: renamed from: ag.a$a, reason: collision with other inner class name */
    public static final /* synthetic */ class C0010a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f461a;

        static {
            int[] iArr = new int[d.values().length];
            try {
                iArr[d.PROPERTY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[d.PROPERTY_GETTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[d.PROPERTY_SETTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f461a = iArr;
        }
    }

    public a(zf.a aVar) {
        rd.m.e(aVar, "protocol");
        this.f460a = aVar;
    }

    @Override // ag.h
    public List b(gf.r rVar, jf.d dVar) {
        rd.m.e(rVar, "proto");
        rd.m.e(dVar, "nameResolver");
        List listK = (List) rVar.p(this.f460a.o());
        if (listK == null) {
            listK = ed.q.k();
        }
        ArrayList arrayList = new ArrayList(ed.q.v(listK, 10));
        Iterator it = listK.iterator();
        while (it.hasNext()) {
            arrayList.add(d((gf.b) it.next(), dVar));
        }
        return arrayList;
    }

    @Override // ag.h
    public List c(n0 n0Var, gf.o oVar) {
        rd.m.e(n0Var, "container");
        rd.m.e(oVar, "proto");
        i.f fVarJ = this.f460a.j();
        List listK = fVarJ != null ? (List) oVar.p(fVarJ) : null;
        if (listK == null) {
            listK = ed.q.k();
        }
        ArrayList arrayList = new ArrayList(ed.q.v(listK, 10));
        Iterator it = listK.iterator();
        while (it.hasNext()) {
            arrayList.add(d((gf.b) it.next(), n0Var.b()));
        }
        return arrayList;
    }

    @Override // ag.h
    public List e(n0.a aVar) {
        rd.m.e(aVar, "container");
        List listK = (List) aVar.f().p(this.f460a.a());
        if (listK == null) {
            listK = ed.q.k();
        }
        ArrayList arrayList = new ArrayList(ed.q.v(listK, 10));
        Iterator it = listK.iterator();
        while (it.hasNext()) {
            arrayList.add(d((gf.b) it.next(), aVar.b()));
        }
        return arrayList;
    }

    @Override // ag.h
    public List f(n0 n0Var, gf.o oVar) {
        rd.m.e(n0Var, "container");
        rd.m.e(oVar, "proto");
        i.f fVarK = this.f460a.k();
        List listK = fVarK != null ? (List) oVar.p(fVarK) : null;
        if (listK == null) {
            listK = ed.q.k();
        }
        ArrayList arrayList = new ArrayList(ed.q.v(listK, 10));
        Iterator it = listK.iterator();
        while (it.hasNext()) {
            arrayList.add(d((gf.b) it.next(), n0Var.b()));
        }
        return arrayList;
    }

    @Override // ag.h
    public List g(n0 n0Var, of.p pVar, d dVar) {
        rd.m.e(n0Var, "container");
        rd.m.e(pVar, "proto");
        rd.m.e(dVar, "kind");
        List listK = null;
        if (pVar instanceof gf.j) {
            i.f fVarG = this.f460a.g();
            if (fVarG != null) {
                listK = (List) ((gf.j) pVar).p(fVarG);
            }
        } else {
            if (!(pVar instanceof gf.o)) {
                throw new IllegalStateException(("Unknown message: " + pVar).toString());
            }
            int i10 = C0010a.f461a[dVar.ordinal()];
            if (i10 != 1 && i10 != 2 && i10 != 3) {
                throw new IllegalStateException(("Unsupported callable kind with property proto for receiver annotations: " + dVar).toString());
            }
            i.f fVarL = this.f460a.l();
            if (fVarL != null) {
                listK = (List) ((gf.o) pVar).p(fVarL);
            }
        }
        if (listK == null) {
            listK = ed.q.k();
        }
        ArrayList arrayList = new ArrayList(ed.q.v(listK, 10));
        Iterator it = listK.iterator();
        while (it.hasNext()) {
            arrayList.add(d((gf.b) it.next(), n0Var.b()));
        }
        return arrayList;
    }

    @Override // ag.h
    public List h(gf.t tVar, jf.d dVar) {
        rd.m.e(tVar, "proto");
        rd.m.e(dVar, "nameResolver");
        List listK = (List) tVar.p(this.f460a.p());
        if (listK == null) {
            listK = ed.q.k();
        }
        ArrayList arrayList = new ArrayList(ed.q.v(listK, 10));
        Iterator it = listK.iterator();
        while (it.hasNext()) {
            arrayList.add(d((gf.b) it.next(), dVar));
        }
        return arrayList;
    }

    @Override // ag.h
    public List i(n0 n0Var, gf.h hVar) {
        rd.m.e(n0Var, "container");
        rd.m.e(hVar, "proto");
        List listK = (List) hVar.p(this.f460a.d());
        if (listK == null) {
            listK = ed.q.k();
        }
        ArrayList arrayList = new ArrayList(ed.q.v(listK, 10));
        Iterator it = listK.iterator();
        while (it.hasNext()) {
            arrayList.add(d((gf.b) it.next(), n0Var.b()));
        }
        return arrayList;
    }

    @Override // ag.h
    public List j(n0 n0Var, of.p pVar, d dVar) {
        List listK;
        rd.m.e(n0Var, "container");
        rd.m.e(pVar, "proto");
        rd.m.e(dVar, "kind");
        if (pVar instanceof gf.e) {
            listK = (List) ((gf.e) pVar).p(this.f460a.c());
        } else if (pVar instanceof gf.j) {
            listK = (List) ((gf.j) pVar).p(this.f460a.f());
        } else {
            if (!(pVar instanceof gf.o)) {
                throw new IllegalStateException(("Unknown message: " + pVar).toString());
            }
            int i10 = C0010a.f461a[dVar.ordinal()];
            if (i10 == 1) {
                listK = (List) ((gf.o) pVar).p(this.f460a.i());
            } else if (i10 == 2) {
                listK = (List) ((gf.o) pVar).p(this.f460a.m());
            } else {
                if (i10 != 3) {
                    throw new IllegalStateException("Unsupported callable kind with property proto");
                }
                listK = (List) ((gf.o) pVar).p(this.f460a.n());
            }
        }
        if (listK == null) {
            listK = ed.q.k();
        }
        ArrayList arrayList = new ArrayList(ed.q.v(listK, 10));
        Iterator it = listK.iterator();
        while (it.hasNext()) {
            arrayList.add(d((gf.b) it.next(), n0Var.b()));
        }
        return arrayList;
    }

    @Override // ag.h
    public List l(n0 n0Var, of.p pVar, d dVar, int i10, gf.v vVar) {
        rd.m.e(n0Var, "container");
        rd.m.e(pVar, "callableProto");
        rd.m.e(dVar, "kind");
        rd.m.e(vVar, "proto");
        List listK = (List) vVar.p(this.f460a.h());
        if (listK == null) {
            listK = ed.q.k();
        }
        ArrayList arrayList = new ArrayList(ed.q.v(listK, 10));
        Iterator it = listK.iterator();
        while (it.hasNext()) {
            arrayList.add(d((gf.b) it.next(), n0Var.b()));
        }
        return arrayList;
    }

    protected final zf.a m() {
        return this.f460a;
    }
}
