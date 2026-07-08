package io.grpc.internal;

import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
final class y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final int f17262a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final long f17263b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final Set f17264c;

    y0(int i10, long j10, Set set) {
        this.f17262a = i10;
        this.f17263b = j10;
        this.f17264c = s9.m.j(set);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && y0.class == obj.getClass()) {
            y0 y0Var = (y0) obj;
            if (this.f17262a == y0Var.f17262a && this.f17263b == y0Var.f17263b && r9.h.a(this.f17264c, y0Var.f17264c)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return r9.h.b(Integer.valueOf(this.f17262a), Long.valueOf(this.f17263b), this.f17264c);
    }

    public String toString() {
        return r9.g.b(this).b("maxAttempts", this.f17262a).c("hedgingDelayNanos", this.f17263b).d("nonFatalStatusCodes", this.f17264c).toString();
    }
}
