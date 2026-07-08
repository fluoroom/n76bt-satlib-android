package androidx.lifecycle;

import androidx.lifecycle.v0;

/* JADX INFO: loaded from: classes.dex */
public final class u0 implements dd.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final yd.c f2680a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final qd.a f2681b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final qd.a f2682c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final qd.a f2683d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private s0 f2684e;

    public u0(yd.c cVar, qd.a aVar, qd.a aVar2, qd.a aVar3) {
        rd.m.e(cVar, "viewModelClass");
        rd.m.e(aVar, "storeProducer");
        rd.m.e(aVar2, "factoryProducer");
        rd.m.e(aVar3, "extrasProducer");
        this.f2680a = cVar;
        this.f2681b = aVar;
        this.f2682c = aVar2;
        this.f2683d = aVar3;
    }

    @Override // dd.j
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public s0 getValue() {
        s0 s0Var = this.f2684e;
        if (s0Var != null) {
            return s0Var;
        }
        s0 s0VarC = v0.f2697b.a((x0) this.f2681b.a(), (v0.c) this.f2682c.a(), (e1.a) this.f2683d.a()).c(this.f2680a);
        this.f2684e = s0VarC;
        return s0VarC;
    }
}
