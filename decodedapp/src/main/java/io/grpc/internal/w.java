package io.grpc.internal;

import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
final class w implements b3 {
    w() {
    }

    @Override // io.grpc.internal.b3
    public long a() {
        return TimeUnit.MILLISECONDS.toNanos(System.currentTimeMillis());
    }
}
