package xb;

import io.grpc.internal.h1;
import io.grpc.internal.w0;
import java.util.Map;
import qb.g1;
import qb.q0;
import qb.r0;
import qb.u1;
import r9.s;
import xb.h;

/* JADX INFO: loaded from: classes3.dex */
public final class j extends r0 {
    private g1.b f(Map map) {
        Long l10 = h1.l(map, "interval");
        Long l11 = h1.l(map, "baseEjectionTime");
        Long l12 = h1.l(map, "maxEjectionTime");
        Integer numI = h1.i(map, "maxEjectionPercentage");
        h.g.a aVar = new h.g.a();
        if (l10 != null) {
            aVar.e(l10.longValue());
        }
        if (l11 != null) {
            aVar.b(l11.longValue());
        }
        if (l12 != null) {
            aVar.g(l12.longValue());
        }
        if (numI != null) {
            aVar.f(numI.intValue());
        }
        Map mapJ = h1.j(map, "successRateEjection");
        if (mapJ != null) {
            h.g.c.a aVar2 = new h.g.c.a();
            Integer numI2 = h1.i(mapJ, "stdevFactor");
            Integer numI3 = h1.i(mapJ, "enforcementPercentage");
            Integer numI4 = h1.i(mapJ, "minimumHosts");
            Integer numI5 = h1.i(mapJ, "requestVolume");
            if (numI2 != null) {
                aVar2.e(numI2.intValue());
            }
            if (numI3 != null) {
                aVar2.b(numI3.intValue());
            }
            if (numI4 != null) {
                aVar2.c(numI4.intValue());
            }
            if (numI5 != null) {
                aVar2.d(numI5.intValue());
            }
            aVar.h(aVar2.a());
        }
        Map mapJ2 = h1.j(map, "failurePercentageEjection");
        if (mapJ2 != null) {
            h.g.b.a aVar3 = new h.g.b.a();
            Integer numI6 = h1.i(mapJ2, "threshold");
            Integer numI7 = h1.i(mapJ2, "enforcementPercentage");
            Integer numI8 = h1.i(mapJ2, "minimumHosts");
            Integer numI9 = h1.i(mapJ2, "requestVolume");
            if (numI6 != null) {
                aVar3.e(numI6.intValue());
            }
            if (numI7 != null) {
                aVar3.b(numI7.intValue());
            }
            if (numI8 != null) {
                aVar3.c(numI8.intValue());
            }
            if (numI9 != null) {
                aVar3.d(numI9.intValue());
            }
            aVar.d(aVar3.a());
        }
        g1.b bVarP = e.p(h1.f(map, "childPolicy"));
        if (bVarP.d() != null) {
            return g1.b.b(w0.q(u1.b.UNAVAILABLE, "Failed to parse child in outlier_detection_experimental", bVarP.d()));
        }
        aVar.c(bVarP.c());
        return g1.b.a(aVar.a());
    }

    @Override // qb.q0.c
    public q0 a(q0.e eVar) {
        return new h(eVar, s.b());
    }

    @Override // qb.r0
    public String b() {
        return "outlier_detection_experimental";
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
            return f(map);
        } catch (RuntimeException e10) {
            return g1.b.b(u1.f24784t.r(e10).s("Failed parsing configuration for " + b()));
        }
    }
}
