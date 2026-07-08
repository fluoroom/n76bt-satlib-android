package io.grpc.internal;

import io.grpc.internal.a2;
import io.grpc.internal.c2;
import java.util.Map;
import qb.g1;
import qb.q0;

/* JADX INFO: loaded from: classes3.dex */
public final class e2 extends qb.r0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static boolean f16564b = w0.g("GRPC_EXPERIMENTAL_ENABLE_NEW_PICK_FIRST", false);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f16565c = 0;

    private static Object f(Map map) {
        Boolean boolD = h1.d(map, "shuffleAddressList");
        return f16564b ? new a2.f(boolD) : new c2.c(boolD);
    }

    public static boolean g() {
        return w0.g("GRPC_PF_USE_HAPPY_EYEBALLS", false);
    }

    @Override // qb.q0.c
    public qb.q0 a(q0.e eVar) {
        return f16564b ? new a2(eVar) : new c2(eVar);
    }

    @Override // qb.r0
    public String b() {
        return "pick_first";
    }

    @Override // qb.r0
    public int c() {
        return 5;
    }

    @Override // qb.r0
    public boolean d() {
        return true;
    }

    @Override // qb.r0
    public g1.b e(Map map) {
        try {
            return g1.b.a(f(map));
        } catch (RuntimeException e10) {
            return g1.b.b(qb.u1.f24784t.r(e10).s("Failed parsing configuration for " + b()));
        }
    }
}
