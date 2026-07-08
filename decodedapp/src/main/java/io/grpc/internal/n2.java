package io.grpc.internal;

import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
final class n2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final int f16975a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final long f16976b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final long f16977c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final double f16978d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final Long f16979e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final Set f16980f;

    n2(int i10, long j10, long j11, double d10, Long l10, Set set) {
        this.f16975a = i10;
        this.f16976b = j10;
        this.f16977c = j11;
        this.f16978d = d10;
        this.f16979e = l10;
        this.f16980f = s9.m.j(set);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof n2)) {
            return false;
        }
        n2 n2Var = (n2) obj;
        return this.f16975a == n2Var.f16975a && this.f16976b == n2Var.f16976b && this.f16977c == n2Var.f16977c && Double.compare(this.f16978d, n2Var.f16978d) == 0 && r9.h.a(this.f16979e, n2Var.f16979e) && r9.h.a(this.f16980f, n2Var.f16980f);
    }

    public int hashCode() {
        return r9.h.b(Integer.valueOf(this.f16975a), Long.valueOf(this.f16976b), Long.valueOf(this.f16977c), Double.valueOf(this.f16978d), this.f16979e, this.f16980f);
    }

    public String toString() {
        return r9.g.b(this).b("maxAttempts", this.f16975a).c("initialBackoffNanos", this.f16976b).c("maxBackoffNanos", this.f16977c).a("backoffMultiplier", this.f16978d).d("perAttemptRecvTimeoutNanos", this.f16979e).d("retryableStatusCodes", this.f16980f).toString();
    }
}
