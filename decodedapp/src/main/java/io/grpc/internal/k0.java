package io.grpc.internal;

import io.grpc.internal.s;

/* JADX INFO: loaded from: classes3.dex */
public final class k0 extends v1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f16660b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final qb.u1 f16661c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final s.a f16662d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final qb.k[] f16663e;

    public k0(qb.u1 u1Var, qb.k[] kVarArr) {
        this(u1Var, s.a.PROCESSED, kVarArr);
    }

    @Override // io.grpc.internal.v1, io.grpc.internal.r
    public void o(c1 c1Var) {
        c1Var.b("error", this.f16661c).b("progress", this.f16662d);
    }

    @Override // io.grpc.internal.v1, io.grpc.internal.r
    public void r(s sVar) {
        r9.l.u(!this.f16660b, "already started");
        this.f16660b = true;
        for (qb.k kVar : this.f16663e) {
            kVar.i(this.f16661c);
        }
        sVar.d(this.f16661c, this.f16662d, new qb.z0());
    }

    public k0(qb.u1 u1Var, s.a aVar, qb.k[] kVarArr) {
        r9.l.e(!u1Var.q(), "error must not be OK");
        this.f16661c = u1Var;
        this.f16662d = aVar;
        this.f16663e = kVarArr;
    }
}
