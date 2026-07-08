package com.dw.ht.satellite;

import android.content.Context;
import android.location.Location;
import android.text.format.DateUtils;
import android.util.Log;
import com.benshikj.ht.R;
import com.facebook.stetho.websocket.CloseCodes;
import com.google.android.gms.maps.model.LatLng;
import j5.c;
import java.util.ArrayList;
import java.util.Date;
import kj.g0;
import kj.x1;
import o5.g;
import pj.d;
import rd.m;
import rj.e;
import rj.f;
import uj.h;
import zj.k1;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a */
    private final int f6679a;

    /* JADX INFO: renamed from: b */
    private final String f6680b;

    /* JADX INFO: renamed from: c */
    private e f6681c;

    /* JADX INFO: renamed from: d */
    private f f6682d;

    /* JADX INFO: renamed from: e */
    private Location f6683e;

    /* JADX INFO: renamed from: f */
    private b f6684f;

    /* JADX INFO: renamed from: g */
    private final int f6685g;

    /* JADX INFO: renamed from: com.dw.ht.satellite.a$a */
    public static final class C0097a {

        /* JADX INFO: renamed from: a */
        private final String f6686a;

        /* JADX INFO: renamed from: b */
        private final k1 f6687b;

        public C0097a(String str, k1 k1Var) {
            m.e(str, "name");
            m.e(k1Var, "coordinates");
            this.f6686a = str;
            this.f6687b = k1Var;
        }

        public final double a() {
            return this.f6687b.t().I() - ((double) 6371000);
        }

        public final int b() {
            double dL = this.f6687b.s().l();
            if (dL > 0.0d) {
                return 1;
            }
            return dL < 0.0d ? -1 : 0;
        }

        public final k1 c() {
            return this.f6687b;
        }

        public final LatLng d() {
            return new LatLng(e(), f());
        }

        public final double e() {
            return Math.toDegrees(this.f6687b.t().h());
        }

        public final double f() {
            return Math.toDegrees(this.f6687b.t().g());
        }

        public final String g() {
            return this.f6686a;
        }

        public final double h(Location location) {
            m.e(location, "loc");
            c cVar = c.f18427a;
            return cVar.h(location).A(this.f6687b, cVar.f(), this.f6687b.getDate());
        }

        public final double i() {
            return this.f6687b.s().I();
        }

        public final xi.f j(Location location) {
            m.e(location, "loc");
            c cVar = c.f18427a;
            xi.f fVarQ = cVar.f().u(cVar.h(location), this.f6687b.getDate()).q(this.f6687b.t());
            m.d(fVarQ, "transformPosition(...)");
            return fVarQ;
        }
    }

    public a(int i10, e eVar, String str) {
        m.e(str, "name");
        this.f6679a = i10;
        this.f6680b = str;
        this.f6685g = i10 == j5.f.f18431b.d() ? -65536 : i10 == j5.f.f18432c.d() ? -16776961 : -16711936;
        q(eVar);
    }

    public static /* synthetic */ b c(a aVar, Location location, long j10, double d10, double d11, int i10, Object obj) {
        return aVar.b(location, (i10 & 2) != 0 ? System.currentTimeMillis() : j10, (i10 & 4) != 0 ? 432000.0d : d10, (i10 & 8) != 0 ? 5.0d : d11);
    }

    public static final zi.a d(b bVar, d dVar, h hVar, boolean z10) {
        if (z10) {
            bVar.i(dVar.getDate().g0(gj.c.a().d().e()).getTime());
            return bVar.a() != 0 ? zi.a.STOP : zi.a.CONTINUE;
        }
        bVar.g(dVar.getDate().g0(gj.c.a().d().e()).getTime());
        return zi.a.STOP;
    }

    public static /* synthetic */ C0097a j(a aVar, long j10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = System.currentTimeMillis();
        }
        return aVar.h(j10);
    }

    public static /* synthetic */ b s(a aVar, Location location, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            location = g.a.c(g.f23195s, null, 1, null);
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return aVar.r(location, z10);
    }

    public final synchronized b b(Location location, long j10, double d10, double d11) {
        try {
            m.e(location, "loc");
            f fVarM = m();
            if (fVarM == null) {
                return null;
            }
            final b bVar = new b(0L, 0L, 0L, 7, null);
            bVar.h(((long) (((double) CloseCodes.NORMAL_CLOSURE) * d10)) + j10);
            yj.b bVar2 = new yj.b(new Date(j10), gj.c.a().d().e());
            c cVar = c.f18427a;
            x1 x1VarH = cVar.h(location);
            fVarM.z((uj.e) new uj.e(60.0d, 0.01d, x1VarH).z(j5.d.e(d11)).u(new vj.b() { // from class: j5.e
                @Override // vj.b
                public final zi.a a(pj.d dVar, uj.h hVar, boolean z10) {
                    return com.dw.ht.satellite.a.d(bVar, dVar, hVar, z10);
                }

                @Override // vj.b
                public /* synthetic */ void b(pj.d dVar, yj.b bVar3, uj.h hVar) {
                    vj.a.b(this, dVar, bVar3, hVar);
                }

                @Override // vj.b
                public /* synthetic */ void c(pj.d dVar, uj.h hVar) {
                    vj.a.a(this, dVar, hVar);
                }

                @Override // vj.b
                public /* synthetic */ pj.d d(uj.h hVar, pj.d dVar) {
                    return vj.a.c(this, hVar, dVar);
                }
            }));
            fVarM.k(bVar2, new yj.b(bVar2, d10));
            fVarM.C();
            if (bVar.e() == 0) {
                k1 k1VarG = fVarM.g(bVar2, cVar.f());
                xi.f fVarQ = cVar.f().u(x1VarH, k1VarG.getDate()).q(k1VarG.t());
                m.b(fVarQ);
                if (j5.d.b(j5.d.d(fVarQ)) >= d11) {
                    bVar.i(j10);
                }
            }
            if (bVar.e() == bVar.a() && bVar.e() != 0) {
                Log.w("Satellite", this.f6680b + " 可视和消失时间相同30秒后再次尝试");
                bVar.h(j10 + ((long) 30000));
            }
            return bVar;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final int e() {
        return this.f6685g;
    }

    public final int f() {
        return this.f6679a;
    }

    public final C0097a g() {
        return j(this, 0L, 1, null);
    }

    public final C0097a h(long j10) {
        if (n() == null) {
            return null;
        }
        return i(new yj.b(new Date(j10), gj.c.a().d().e()));
    }

    public final synchronized C0097a i(yj.b bVar) {
        m.e(bVar, "date");
        f fVarM = m();
        C0097a c0097a = null;
        if (fVarM == null) {
            return null;
        }
        try {
            String str = this.f6680b;
            k1 k1VarG = fVarM.g(bVar, c.f18427a.f());
            m.d(k1VarG, "getPVCoordinates(...)");
            c0097a = new C0097a(str, k1VarG);
        } catch (hj.a e10) {
            Log.w("Satellite", "getInfo for: " + this.f6680b, e10);
        }
        return c0097a;
    }

    public final String k() {
        return this.f6680b;
    }

    public final synchronized ArrayList l(long j10, double d10) {
        try {
            e eVarN = n();
            if (eVarN == null) {
                return null;
            }
            f fVarM = m();
            if (fVarM == null) {
                return null;
            }
            double dC = (((double) 1) / eVarN.C()) * 6.283185307179586d * Math.abs(d10);
            yj.b bVar = d10 < 0.0d ? new yj.b(new Date(j10 - ((long) (((double) CloseCodes.NORMAL_CLOSURE) * dC))), gj.c.a().d().e()) : new yj.b(new Date(j10), gj.c.a().d().e());
            g0 g0VarF = gj.c.a().c().f(false);
            ArrayList arrayList = new ArrayList();
            double dAbs = dC / (((double) 180) * Math.abs(d10));
            for (double d11 = 0.0d; d11 < dC; d11 += dAbs) {
                xi.f fVarT = fVarM.g(bVar.a(d11), g0VarF).t();
                arrayList.add(new LatLng(Math.toDegrees(fVarT.h()), Math.toDegrees(fVarT.g())));
            }
            return arrayList;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final f m() {
        if (this.f6682d == null && n() != null) {
            this.f6682d = f.N(n());
        }
        return this.f6682d;
    }

    public final e n() {
        if (this.f6681c == null) {
            this.f6681c = com.dw.ht.satellite.b.H(this.f6679a);
            p(null);
        }
        return this.f6681c;
    }

    public final b o() {
        return this.f6684f;
    }

    public final void p(f fVar) {
        this.f6682d = fVar;
        this.f6684f = null;
    }

    public final void q(e eVar) {
        this.f6681c = eVar;
        p(null);
    }

    public final synchronized b r(Location location, boolean z10) throws Throwable {
        Throwable th2;
        a aVar;
        Location location2;
        try {
            try {
                b bVarC = this.f6684f;
                if (location == null) {
                    return bVarC;
                }
                if (z10) {
                    bVarC = null;
                } else if (bVarC != null) {
                    try {
                        if (bVarC.f()) {
                            bVarC = null;
                        }
                    } catch (Throwable th3) {
                        th2 = th3;
                    }
                }
                if (bVarC != null && (location2 = this.f6683e) != null) {
                    bVarC = location.distanceTo(location2) <= 100000.0f ? bVarC : null;
                }
                if (bVarC == null) {
                    aVar = this;
                    bVarC = c(aVar, location, 0L, 0.0d, com.dw.ht.satellite.b.y(), 6, null);
                    aVar.f6683e = location;
                } else {
                    aVar = this;
                }
                aVar.f6684f = bVarC;
                return bVarC;
            } catch (Throwable th4) {
                th = th4;
            }
        } catch (Throwable th5) {
            th = th5;
        }
        th2 = th;
        throw th2;
    }

    public String toString() {
        return this.f6680b;
    }

    public static final class b {

        /* JADX INFO: renamed from: a */
        private long f6688a;

        /* JADX INFO: renamed from: b */
        private long f6689b;

        /* JADX INFO: renamed from: c */
        private long f6690c;

        public b(long j10, long j11, long j12) {
            this.f6688a = j10;
            this.f6689b = j11;
            this.f6690c = j12;
        }

        public final long a() {
            return this.f6689b;
        }

        public final long b() {
            long j10 = this.f6688a;
            long j11 = this.f6689b;
            return j10 < j11 ? j11 : j10 != 0 ? this.f6690c : this.f6690c;
        }

        public final Long c() {
            long j10 = this.f6688a;
            if (j10 == 0) {
                return this.f6689b != 0 ? 1L : null;
            }
            long j11 = this.f6689b;
            if (j11 == 0 || j11 >= j10) {
                return Long.valueOf(j10);
            }
            return 1L;
        }

        public final String d(Context context) {
            Context context2;
            Object relativeDateTimeString;
            m.e(context, "context");
            Long lC = c();
            if (lC == null) {
                return null;
            }
            if (lC.longValue() < System.currentTimeMillis()) {
                relativeDateTimeString = context.getString(R.string.now);
                context2 = context;
            } else {
                context2 = context;
                relativeDateTimeString = DateUtils.getRelativeDateTimeString(context2, lC.longValue(), 1000L, 172800000L, 524289);
            }
            long j10 = this.f6689b;
            return j10 == 0 ? relativeDateTimeString.toString() : context2.getString(R.string.transit_time_s, relativeDateTimeString, DateUtils.formatDateTime(context2, j10, 1));
        }

        public final long e() {
            return this.f6688a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f6688a == bVar.f6688a && this.f6689b == bVar.f6689b && this.f6690c == bVar.f6690c;
        }

        public final boolean f() {
            return System.currentTimeMillis() > b();
        }

        public final void g(long j10) {
            this.f6689b = j10;
        }

        public final void h(long j10) {
            this.f6690c = j10;
        }

        public int hashCode() {
            return (((o4.a.a(this.f6688a) * 31) + o4.a.a(this.f6689b)) * 31) + o4.a.a(this.f6690c);
        }

        public final void i(long j10) {
            this.f6688a = j10;
        }

        public String toString() {
            return "Visibility(visibleTime=" + this.f6688a + ", invisibleTime=" + this.f6689b + ", orbitCalculationEndTime=" + this.f6690c + ')';
        }

        public /* synthetic */ b(long j10, long j11, long j12, int i10, rd.h hVar) {
            this((i10 & 1) != 0 ? 0L : j10, (i10 & 2) != 0 ? 0L : j11, (i10 & 4) != 0 ? 0L : j12);
        }
    }

    public /* synthetic */ a(int i10, e eVar, String str, int i11, rd.h hVar) {
        this(i10, (i11 & 2) != 0 ? null : eVar, (i11 & 4) != 0 ? com.dw.ht.satellite.b.z(i10) : str);
    }
}
