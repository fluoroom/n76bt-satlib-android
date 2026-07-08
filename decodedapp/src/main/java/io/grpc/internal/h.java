package io.grpc.internal;

import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes3.dex */
final class h implements k1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AtomicLong f16609a = new AtomicLong();

    h() {
    }

    @Override // io.grpc.internal.k1
    public void add(long j10) {
        this.f16609a.getAndAdd(j10);
    }
}
