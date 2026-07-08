package io.grpc.internal;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public interface t extends qb.i0 {

    public interface a {
        void a(qb.u1 u1Var);

        void b(long j10);
    }

    r g(qb.a1 a1Var, qb.z0 z0Var, qb.c cVar, qb.k[] kVarArr);

    void h(a aVar, Executor executor);
}
