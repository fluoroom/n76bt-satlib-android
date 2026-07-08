package io.grpc.internal;

import qb.q0;

/* JADX INFO: loaded from: classes3.dex */
public final class f2 extends q0.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final qb.c f16578a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final qb.z0 f16579b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final qb.a1 f16580c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final q0.f f16581d;

    public f2(qb.a1 a1Var, qb.z0 z0Var, qb.c cVar, q0.f fVar) {
        this.f16580c = (qb.a1) r9.l.o(a1Var, "method");
        this.f16579b = (qb.z0) r9.l.o(z0Var, "headers");
        this.f16578a = (qb.c) r9.l.o(cVar, "callOptions");
        this.f16581d = (q0.f) r9.l.o(fVar, "pickDetailsConsumer");
    }

    @Override // qb.q0.h
    public qb.c a() {
        return this.f16578a;
    }

    @Override // qb.q0.h
    public qb.z0 b() {
        return this.f16579b;
    }

    @Override // qb.q0.h
    public qb.a1 c() {
        return this.f16580c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && f2.class == obj.getClass()) {
            f2 f2Var = (f2) obj;
            if (r9.h.a(this.f16578a, f2Var.f16578a) && r9.h.a(this.f16579b, f2Var.f16579b) && r9.h.a(this.f16580c, f2Var.f16580c) && r9.h.a(this.f16581d, f2Var.f16581d)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return r9.h.b(this.f16578a, this.f16579b, this.f16580c, this.f16581d);
    }

    public final String toString() {
        return "[method=" + this.f16580c + " headers=" + this.f16579b + " callOptions=" + this.f16578a + "]";
    }
}
