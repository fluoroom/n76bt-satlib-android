package xf;

import he.f1;
import he.y0;
import java.util.Collection;
import java.util.List;
import rd.c0;

/* JADX INFO: loaded from: classes3.dex */
public final class q extends l {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final /* synthetic */ yd.j[] f32082f = {c0.f(new rd.w(q.class, "functions", "getFunctions()Ljava/util/List;", 0)), c0.f(new rd.w(q.class, "properties", "getProperties()Ljava/util/List;", 0))};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final he.e f32083b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f32084c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final dg.i f32085d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final dg.i f32086e;

    public q(dg.n nVar, he.e eVar, boolean z10) {
        rd.m.e(nVar, "storageManager");
        rd.m.e(eVar, "containingClass");
        this.f32083b = eVar;
        this.f32084c = z10;
        eVar.j();
        he.f fVar = he.f.f15271b;
        this.f32085d = nVar.d(new o(this));
        this.f32086e = nVar.d(new p(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List j(q qVar) {
        return ed.q.n(qf.h.g(qVar.f32083b), qf.h.h(qVar.f32083b));
    }

    private final List n() {
        return (List) dg.m.a(this.f32085d, this, f32082f[0]);
    }

    private final List o() {
        return (List) dg.m.a(this.f32086e, this, f32082f[1]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List p(q qVar) {
        return qVar.f32084c ? ed.q.o(qf.h.f(qVar.f32083b)) : ed.q.k();
    }

    @Override // xf.l, xf.k
    public Collection c(mf.f fVar, pe.b bVar) {
        rd.m.e(fVar, "name");
        rd.m.e(bVar, "location");
        List listO = o();
        og.j jVar = new og.j();
        for (Object obj : listO) {
            if (rd.m.a(((y0) obj).getName(), fVar)) {
                jVar.add(obj);
            }
        }
        return jVar;
    }

    @Override // xf.l, xf.n
    public /* bridge */ /* synthetic */ he.h g(mf.f fVar, pe.b bVar) {
        return (he.h) k(fVar, bVar);
    }

    public Void k(mf.f fVar, pe.b bVar) {
        rd.m.e(fVar, "name");
        rd.m.e(bVar, "location");
        return null;
    }

    @Override // xf.l, xf.n
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public List e(d dVar, qd.l lVar) {
        rd.m.e(dVar, "kindFilter");
        rd.m.e(lVar, "nameFilter");
        return ed.q.s0(n(), o());
    }

    @Override // xf.l, xf.k
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public og.j a(mf.f fVar, pe.b bVar) {
        rd.m.e(fVar, "name");
        rd.m.e(bVar, "location");
        List listN = n();
        og.j jVar = new og.j();
        for (Object obj : listN) {
            if (rd.m.a(((f1) obj).getName(), fVar)) {
                jVar.add(obj);
            }
        }
        return jVar;
    }
}
