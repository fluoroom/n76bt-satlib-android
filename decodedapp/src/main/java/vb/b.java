package vb;

import pa.a;
import qb.u1;
import qb.v1;
import qb.x1;
import qb.z0;
import r9.l;

/* JADX INFO: loaded from: classes3.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final z0.h f30520a = z0.h.f("grpc-status-details-bin", wb.b.c(pa.a.v()));

    public static pa.a a(u1 u1Var, z0 z0Var) {
        pa.a aVar;
        l.o(u1Var, "status");
        if (z0Var != null && (aVar = (pa.a) z0Var.g(f30520a)) != null) {
            l.e(u1Var.o().e() == aVar.t(), "com.google.rpc.Status code must match gRPC status code");
            return aVar;
        }
        a.b bVarX = pa.a.A().x(u1Var.o().e());
        if (u1Var.p() != null) {
            bVarX.z(u1Var.p());
        }
        return bVarX.build();
    }

    public static pa.a b(Throwable th2) {
        for (Throwable cause = (Throwable) l.o(th2, "t"); cause != null; cause = cause.getCause()) {
            if (cause instanceof v1) {
                v1 v1Var = (v1) cause;
                return a(v1Var.a(), v1Var.b());
            }
            if (cause instanceof x1) {
                x1 x1Var = (x1) cause;
                return a(x1Var.a(), x1Var.b());
            }
        }
        return null;
    }
}
