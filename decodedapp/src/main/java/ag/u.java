package ag;

import he.g1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public abstract class u extends r {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final jf.a f588h;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final cg.s f589r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final jf.e f590s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final m0 f591t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private gf.n f592u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private xf.k f593v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(mf.c cVar, dg.n nVar, he.h0 h0Var, gf.n nVar2, jf.a aVar, cg.s sVar) {
        super(cVar, nVar, h0Var);
        rd.m.e(cVar, "fqName");
        rd.m.e(nVar, "storageManager");
        rd.m.e(h0Var, "module");
        rd.m.e(nVar2, "proto");
        rd.m.e(aVar, "metadataVersion");
        this.f588h = aVar;
        this.f589r = sVar;
        gf.q qVarT = nVar2.T();
        rd.m.d(qVarT, "getStrings(...)");
        gf.p pVarR = nVar2.R();
        rd.m.d(pVarR, "getQualifiedNames(...)");
        jf.e eVar = new jf.e(qVarT, pVarR);
        this.f590s = eVar;
        this.f591t = new m0(nVar2, eVar, aVar, new s(this));
        this.f592u = nVar2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g1 O0(u uVar, mf.b bVar) {
        rd.m.e(bVar, "it");
        cg.s sVar = uVar.f589r;
        if (sVar != null) {
            return sVar;
        }
        g1 g1Var = g1.f15281a;
        rd.m.d(g1Var, "NO_SOURCE");
        return g1Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Collection Q0(u uVar) {
        Collection collectionB = uVar.G0().b();
        ArrayList arrayList = new ArrayList();
        for (Object obj : collectionB) {
            mf.b bVar = (mf.b) obj;
            if (!bVar.j() && !l.f512c.a().contains(bVar)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(ed.q.v(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((mf.b) it.next()).h());
        }
        return arrayList2;
    }

    @Override // ag.r
    public void L0(n nVar) {
        rd.m.e(nVar, "components");
        gf.n nVar2 = this.f592u;
        if (nVar2 == null) {
            throw new IllegalStateException("Repeated call to DeserializedPackageFragmentImpl::initialize");
        }
        this.f592u = null;
        gf.m mVarQ = nVar2.Q();
        rd.m.d(mVarQ, "getPackage(...)");
        this.f593v = new cg.m0(this, mVarQ, this.f590s, this.f588h, this.f589r, nVar, "scope of " + this, new t(this));
    }

    @Override // ag.r
    /* JADX INFO: renamed from: P0, reason: merged with bridge method [inline-methods] */
    public m0 G0() {
        return this.f591t;
    }

    @Override // he.n0
    public xf.k p() {
        xf.k kVar = this.f593v;
        if (kVar != null) {
            return kVar;
        }
        rd.m.o("_memberScope");
        return null;
    }
}
