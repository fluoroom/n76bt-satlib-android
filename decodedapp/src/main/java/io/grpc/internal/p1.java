package io.grpc.internal;

import io.grpc.internal.m2;
import j$.util.DesugarCollections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import qb.c;
import qb.f0;
import qb.q0;

/* JADX INFO: loaded from: classes3.dex */
final class p1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f17004a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f17005b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map f17006c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final m2.d0 f17007d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Object f17008e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Map f17009f;

    static final class b {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        static final c.C0338c f17010g = c.C0338c.b("io.grpc.internal.ManagedChannelServiceConfig.MethodInfo");

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Long f17011a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Boolean f17012b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final Integer f17013c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final Integer f17014d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final n2 f17015e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final y0 f17016f;

        b(Map map, boolean z10, int i10, int i11) {
            this.f17011a = t2.w(map);
            this.f17012b = t2.x(map);
            Integer numL = t2.l(map);
            this.f17013c = numL;
            if (numL != null) {
                r9.l.j(numL.intValue() >= 0, "maxInboundMessageSize %s exceeds bounds", numL);
            }
            Integer numK = t2.k(map);
            this.f17014d = numK;
            if (numK != null) {
                r9.l.j(numK.intValue() >= 0, "maxOutboundMessageSize %s exceeds bounds", numK);
            }
            Map mapR = z10 ? t2.r(map) : null;
            this.f17015e = mapR == null ? null : b(mapR, i10);
            Map mapD = z10 ? t2.d(map) : null;
            this.f17016f = mapD != null ? a(mapD, i11) : null;
        }

        private static y0 a(Map map, int i10) {
            int iIntValue = ((Integer) r9.l.o(t2.h(map), "maxAttempts cannot be empty")).intValue();
            r9.l.h(iIntValue >= 2, "maxAttempts must be greater than 1: %s", iIntValue);
            int iMin = Math.min(iIntValue, i10);
            long jLongValue = ((Long) r9.l.o(t2.c(map), "hedgingDelay cannot be empty")).longValue();
            r9.l.i(jLongValue >= 0, "hedgingDelay must not be negative: %s", jLongValue);
            return new y0(iMin, jLongValue, t2.p(map));
        }

        private static n2 b(Map map, int i10) {
            int iIntValue = ((Integer) r9.l.o(t2.i(map), "maxAttempts cannot be empty")).intValue();
            r9.l.h(iIntValue >= 2, "maxAttempts must be greater than 1: %s", iIntValue);
            int iMin = Math.min(iIntValue, i10);
            long jLongValue = ((Long) r9.l.o(t2.e(map), "initialBackoff cannot be empty")).longValue();
            r9.l.i(jLongValue > 0, "initialBackoffNanos must be greater than 0: %s", jLongValue);
            long jLongValue2 = ((Long) r9.l.o(t2.j(map), "maxBackoff cannot be empty")).longValue();
            r9.l.i(jLongValue2 > 0, "maxBackoff must be greater than 0: %s", jLongValue2);
            Double d10 = (Double) r9.l.o(t2.a(map), "backoffMultiplier cannot be empty");
            double dDoubleValue = d10.doubleValue();
            r9.l.j(dDoubleValue > 0.0d, "backoffMultiplier must be greater than 0: %s", d10);
            Long lQ = t2.q(map);
            r9.l.j(lQ == null || lQ.longValue() >= 0, "perAttemptRecvTimeout cannot be negative: %s", lQ);
            Set setS = t2.s(map);
            r9.l.e((lQ == null && setS.isEmpty()) ? false : true, "retryableStatusCodes cannot be empty without perAttemptRecvTimeout");
            return new n2(iMin, jLongValue, jLongValue2, dDoubleValue, lQ, setS);
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return r9.h.a(this.f17011a, bVar.f17011a) && r9.h.a(this.f17012b, bVar.f17012b) && r9.h.a(this.f17013c, bVar.f17013c) && r9.h.a(this.f17014d, bVar.f17014d) && r9.h.a(this.f17015e, bVar.f17015e) && r9.h.a(this.f17016f, bVar.f17016f);
        }

        public int hashCode() {
            return r9.h.b(this.f17011a, this.f17012b, this.f17013c, this.f17014d, this.f17015e, this.f17016f);
        }

        public String toString() {
            return r9.g.b(this).d("timeoutNanos", this.f17011a).d("waitForReady", this.f17012b).d("maxInboundMessageSize", this.f17013c).d("maxOutboundMessageSize", this.f17014d).d("retryPolicy", this.f17015e).d("hedgingPolicy", this.f17016f).toString();
        }
    }

    static final class c extends qb.f0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final p1 f17017b;

        @Override // qb.f0
        public f0.b a(q0.h hVar) {
            return f0.b.d().b(this.f17017b).a();
        }

        private c(p1 p1Var) {
            this.f17017b = p1Var;
        }
    }

    p1(b bVar, Map map, Map map2, m2.d0 d0Var, Object obj, Map map3) {
        this.f17004a = bVar;
        this.f17005b = DesugarCollections.unmodifiableMap(new HashMap(map));
        this.f17006c = DesugarCollections.unmodifiableMap(new HashMap(map2));
        this.f17007d = d0Var;
        this.f17008e = obj;
        this.f17009f = map3 != null ? DesugarCollections.unmodifiableMap(new HashMap(map3)) : null;
    }

    static p1 a() {
        return new p1(null, new HashMap(), new HashMap(), null, null, null);
    }

    static p1 b(Map map, boolean z10, int i10, int i11, Object obj) {
        m2.d0 d0VarV = z10 ? t2.v(map) : null;
        HashMap map2 = new HashMap();
        HashMap map3 = new HashMap();
        Map mapB = t2.b(map);
        List<Map> listM = t2.m(map);
        if (listM == null) {
            return new p1(null, map2, map3, d0VarV, obj, mapB);
        }
        b bVar = null;
        for (Map map4 : listM) {
            b bVar2 = new b(map4, z10, i10, i11);
            List<Map> listO = t2.o(map4);
            if (listO != null && !listO.isEmpty()) {
                for (Map map5 : listO) {
                    String strT = t2.t(map5);
                    String strN = t2.n(map5);
                    if (r9.p.b(strT)) {
                        r9.l.j(r9.p.b(strN), "missing service name for method %s", strN);
                        r9.l.j(bVar == null, "Duplicate default method config in service config %s", map);
                        bVar = bVar2;
                    } else if (r9.p.b(strN)) {
                        r9.l.j(!map3.containsKey(strT), "Duplicate service %s", strT);
                        map3.put(strT, bVar2);
                    } else {
                        String strB = qb.a1.b(strT, strN);
                        r9.l.j(!map2.containsKey(strB), "Duplicate method name %s", strB);
                        map2.put(strB, bVar2);
                    }
                }
            }
        }
        return new p1(bVar, map2, map3, d0VarV, obj, mapB);
    }

    qb.f0 c() {
        if (this.f17006c.isEmpty() && this.f17005b.isEmpty() && this.f17004a == null) {
            return null;
        }
        return new c();
    }

    Map d() {
        return this.f17009f;
    }

    Object e() {
        return this.f17008e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && p1.class == obj.getClass()) {
            p1 p1Var = (p1) obj;
            if (r9.h.a(this.f17004a, p1Var.f17004a) && r9.h.a(this.f17005b, p1Var.f17005b) && r9.h.a(this.f17006c, p1Var.f17006c) && r9.h.a(this.f17007d, p1Var.f17007d) && r9.h.a(this.f17008e, p1Var.f17008e)) {
                return true;
            }
        }
        return false;
    }

    b f(qb.a1 a1Var) {
        b bVar = (b) this.f17005b.get(a1Var.c());
        if (bVar == null) {
            bVar = (b) this.f17006c.get(a1Var.d());
        }
        return bVar == null ? this.f17004a : bVar;
    }

    m2.d0 g() {
        return this.f17007d;
    }

    public int hashCode() {
        return r9.h.b(this.f17004a, this.f17005b, this.f17006c, this.f17007d, this.f17008e);
    }

    public String toString() {
        return r9.g.b(this).d("defaultMethodConfig", this.f17004a).d("serviceMethodMap", this.f17005b).d("serviceMap", this.f17006c).d("retryThrottling", this.f17007d).d("loadBalancingConfig", this.f17008e).toString();
    }
}
