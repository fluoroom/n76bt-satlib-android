package io.grpc.internal;

import java.io.InputStream;

/* JADX INFO: loaded from: classes3.dex */
public interface u0 {
    u0 c(qb.n nVar);

    void close();

    void d(InputStream inputStream);

    void flush();

    boolean isClosed();

    void l(int i10);
}
