package io.grpc.internal;

import j$.time.Instant;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
final class d1 implements b3 {
    d1() {
    }

    @Override // io.grpc.internal.b3
    public long a() {
        return u9.b.b(TimeUnit.SECONDS.toNanos(Instant.now().getEpochSecond()), r0.getNano());
    }
}
