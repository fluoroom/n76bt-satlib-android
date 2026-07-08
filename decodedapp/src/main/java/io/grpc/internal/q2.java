package io.grpc.internal;

import java.util.Map;
import qb.g1;

/* JADX INFO: loaded from: classes3.dex */
public final class q2 extends g1.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f17070a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f17071b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f17072c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final i f17073d;

    public q2(boolean z10, int i10, int i11, i iVar) {
        this.f17070a = z10;
        this.f17071b = i10;
        this.f17072c = i11;
        this.f17073d = (i) r9.l.o(iVar, "autoLoadBalancerFactory");
    }

    @Override // qb.g1.f
    public g1.b a(Map map) {
        Object objC;
        try {
            g1.b bVarF = this.f17073d.f(map);
            if (bVarF == null) {
                objC = null;
            } else {
                if (bVarF.d() != null) {
                    return g1.b.b(bVarF.d());
                }
                objC = bVarF.c();
            }
            return g1.b.a(p1.b(map, this.f17070a, this.f17071b, this.f17072c, objC));
        } catch (RuntimeException e10) {
            return g1.b.b(qb.u1.f24771g.s("failed to parse service config").r(e10));
        }
    }
}
