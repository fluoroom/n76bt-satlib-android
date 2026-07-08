package io.grpc.internal;

/* JADX INFO: loaded from: classes3.dex */
public interface s extends z2 {

    public enum a {
        PROCESSED,
        REFUSED,
        DROPPED,
        MISCARRIED
    }

    void b(qb.z0 z0Var);

    void d(qb.u1 u1Var, a aVar, qb.z0 z0Var);
}
