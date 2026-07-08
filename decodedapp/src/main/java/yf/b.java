package yf;

import eg.r0;
import rd.m;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends a implements f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final he.e f32598c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final mf.f f32599d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(he.e eVar, r0 r0Var, mf.f fVar, g gVar) {
        super(r0Var, gVar);
        m.e(eVar, "classDescriptor");
        m.e(r0Var, "receiverType");
        this.f32598c = eVar;
        this.f32599d = fVar;
    }

    @Override // yf.f
    public mf.f a() {
        return this.f32599d;
    }

    public String toString() {
        return getType() + ": Ctx { " + this.f32598c + " }";
    }
}
