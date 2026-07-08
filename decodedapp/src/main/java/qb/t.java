package qb;

import java.util.concurrent.TimeoutException;
import qb.u1;

/* JADX INFO: loaded from: classes3.dex */
public abstract class t {
    public static u1 a(s sVar) {
        r9.l.o(sVar, "context must not be null");
        if (!sVar.h()) {
            return null;
        }
        Throwable thC = sVar.c();
        if (thC == null) {
            return u1.f24770f.s("io.grpc.Context was cancelled without error");
        }
        if (thC instanceof TimeoutException) {
            return u1.f24773i.s(thC.getMessage()).r(thC);
        }
        u1 u1VarM = u1.m(thC);
        return (u1.b.UNKNOWN.equals(u1VarM.o()) && u1VarM.n() == thC) ? u1.f24770f.s("Context cancelled").r(thC) : u1VarM.r(thC);
    }
}
