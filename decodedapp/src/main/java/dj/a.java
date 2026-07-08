package dj;

import kj.r0;
import xi.f;
import yj.e0;
import yj.f0;
import yj.g0;
import zj.f1;

/* JADX INFO: loaded from: classes3.dex */
public class a implements g0, e0 {

    /* JADX INFO: renamed from: a */
    private final r0 f11107a;

    /* JADX INFO: renamed from: b */
    private final f1 f11108b;

    public a(r0 r0Var, f1 f1Var) {
        this.f11107a = r0Var;
        this.f11108b = f1Var;
    }

    public r0 b() {
        return this.f11107a;
    }

    @Override // yj.e0
    /* JADX INFO: renamed from: c */
    public a a(double d10) {
        return new a(this.f11107a, this.f11108b.a(d10));
    }

    @Override // yj.g0
    public /* synthetic */ double e(g0 g0Var) {
        return f0.a(this, g0Var);
    }

    @Override // yj.g0
    public yj.b getDate() {
        return this.f11108b.getDate();
    }

    public a(yj.b bVar, r0 r0Var, xi.b bVar2, f fVar, f fVar2) {
        this(r0Var, new f1(bVar, bVar2, fVar, fVar2));
    }
}
