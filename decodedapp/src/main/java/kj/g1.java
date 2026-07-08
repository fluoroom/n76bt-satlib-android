package kj;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
class g1 implements b2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final zj.s f20108a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final transient yj.h0 f20109b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final xi.b f20110c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final transient Map f20111d = new HashMap();

    g1(zj.s sVar, yj.c0 c0Var) {
        this.f20108a = sVar;
        this.f20109b = sVar.s(c0Var);
        this.f20110c = new xi.b(xi.f.f32233e, sVar.j(c0Var).a(sVar.r(c0Var)), xi.c.FRAME_TRANSFORM);
    }

    @Override // kj.b2
    public /* synthetic */ b1 a(yj.b bVar) {
        return a2.a(this, bVar);
    }

    @Override // kj.b2
    public y1 b(yj.b bVar) {
        double[] dArrA = this.f20109b.a(bVar);
        xi.b bVar2 = this.f20110c;
        xi.d dVar = xi.d.f32221z;
        xi.c cVar = xi.c.FRAME_TRANSFORM;
        return new y1(bVar, bVar2.c(new xi.b(dVar, cVar, -dArrA[0], -dArrA[1], dArrA[2]), cVar));
    }

    @Override // kj.b2
    public /* synthetic */ t1 c(yj.b bVar) {
        return a2.b(this, bVar);
    }
}
