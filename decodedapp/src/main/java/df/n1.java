package df;

import eg.i2;
import eg.k2;

/* JADX INFO: loaded from: classes3.dex */
final class n1 extends d {

    /* JADX INFO: renamed from: a */
    private final ie.a f11022a;

    /* JADX INFO: renamed from: b */
    private final boolean f11023b;

    /* JADX INFO: renamed from: c */
    private final ye.k f11024c;

    /* JADX INFO: renamed from: d */
    private final ve.c f11025d;

    /* JADX INFO: renamed from: e */
    private final boolean f11026e;

    public /* synthetic */ n1(ie.a aVar, boolean z10, ye.k kVar, ve.c cVar, boolean z11, int i10, rd.h hVar) {
        this(aVar, z10, kVar, cVar, (i10 & 16) != 0 ? false : z11);
    }

    @Override // df.d
    public boolean B(ig.i iVar) {
        rd.m.e(iVar, "<this>");
        return ee.i.e0((eg.r0) iVar);
    }

    @Override // df.d
    public boolean C() {
        return this.f11023b;
    }

    @Override // df.d
    public boolean D(ig.i iVar, ig.i iVar2) {
        rd.m.e(iVar, "<this>");
        rd.m.e(iVar2, "other");
        return this.f11024c.a().k().c((eg.r0) iVar, (eg.r0) iVar2);
    }

    @Override // df.d
    public boolean E(ig.q qVar) {
        rd.m.e(qVar, "<this>");
        return qVar instanceof ze.b1;
    }

    @Override // df.d
    public boolean F(ig.i iVar) {
        rd.m.e(iVar, "<this>");
        return ((eg.r0) iVar).Q0() instanceof j;
    }

    @Override // df.d
    /* JADX INFO: renamed from: J */
    public boolean l(ie.c cVar, ig.i iVar) {
        rd.m.e(cVar, "<this>");
        if ((cVar instanceof xe.g) && ((xe.g) cVar).j()) {
            return true;
        }
        if ((cVar instanceof ze.j) && !u() && (((ze.j) cVar).l() || q() == ve.c.f30561f)) {
            return true;
        }
        return iVar != null && ee.i.r0((eg.r0) iVar) && m().p(cVar) && !this.f11024c.a().q().c();
    }

    @Override // df.d
    /* JADX INFO: renamed from: K */
    public ve.d m() {
        return this.f11024c.a().a();
    }

    @Override // df.d
    /* JADX INFO: renamed from: L */
    public eg.r0 v(ig.i iVar) {
        rd.m.e(iVar, "<this>");
        return k2.a((eg.r0) iVar);
    }

    @Override // df.d
    /* JADX INFO: renamed from: M */
    public ig.t A() {
        return fg.s.f13084a;
    }

    @Override // df.d
    public Iterable n(ig.i iVar) {
        rd.m.e(iVar, "<this>");
        return ((eg.r0) iVar).getAnnotations();
    }

    @Override // df.d
    public Iterable p() {
        ie.h annotations;
        ie.a aVar = this.f11022a;
        return (aVar == null || (annotations = aVar.getAnnotations()) == null) ? ed.q.k() : annotations;
    }

    @Override // df.d
    public ve.c q() {
        return this.f11025d;
    }

    @Override // df.d
    public ve.f0 r() {
        return this.f11024c.b();
    }

    @Override // df.d
    public boolean s() {
        ie.a aVar = this.f11022a;
        return (aVar instanceof he.s1) && ((he.s1) aVar).k0() != null;
    }

    @Override // df.d
    protected l t(l lVar, ve.w wVar) {
        l lVarB;
        if (lVar != null && (lVarB = l.b(lVar, k.f10999c, false, 2, null)) != null) {
            return lVarB;
        }
        if (wVar != null) {
            return wVar.d();
        }
        return null;
    }

    @Override // df.d
    public boolean u() {
        return this.f11024c.a().q().d();
    }

    @Override // df.d
    public mf.d x(ig.i iVar) {
        rd.m.e(iVar, "<this>");
        he.e eVarF = i2.f((eg.r0) iVar);
        if (eVarF != null) {
            return qf.i.m(eVarF);
        }
        return null;
    }

    @Override // df.d
    public boolean z() {
        return this.f11026e;
    }

    public n1(ie.a aVar, boolean z10, ye.k kVar, ve.c cVar, boolean z11) {
        rd.m.e(kVar, "containerContext");
        rd.m.e(cVar, "containerApplicabilityType");
        this.f11022a = aVar;
        this.f11023b = z10;
        this.f11024c = kVar;
        this.f11025d = cVar;
        this.f11026e = z11;
    }
}
