package yf;

import eg.r0;
import rd.m;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends a implements f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final he.a f32600c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final mf.f f32601d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(he.a aVar, r0 r0Var, mf.f fVar, g gVar) {
        super(r0Var, gVar);
        m.e(aVar, "declarationDescriptor");
        m.e(r0Var, "receiverType");
        this.f32600c = aVar;
        this.f32601d = fVar;
    }

    @Override // yf.f
    public mf.f a() {
        return this.f32601d;
    }

    public he.a c() {
        return this.f32600c;
    }

    public String toString() {
        return "Cxt { " + c() + " }";
    }
}
