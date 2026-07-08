package pj;

import kj.r0;
import oj.l;
import yj.e0;
import yj.f0;
import yj.g0;
import zj.e;
import zj.f;
import zj.k1;

/* JADX INFO: loaded from: classes3.dex */
public class d implements g0, e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final l f24252a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final dj.a f24253b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final double f24254c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final e f24255d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final f f24256e;

    public d(l lVar, dj.a aVar) {
        this(lVar, aVar, 1000.0d, null, null);
        c(lVar, aVar);
    }

    private static void c(l lVar, dj.a aVar) {
        h(aVar, lVar.getDate(), lVar.I());
    }

    private static void h(dj.a aVar, yj.b bVar, r0 r0Var) {
        if (aj.d.b(bVar.X(aVar.getDate())) > 1.0E-7d) {
            throw new hj.c(hj.f.ORBIT_AND_ATTITUDE_DATES_MISMATCH, bVar, aVar.getDate());
        }
        if (r0Var != aVar.b()) {
            throw new hj.c(hj.f.FRAMES_MISMATCH, r0Var.r(), aVar.b().r());
        }
    }

    private e t(double d10) {
        if (this.f24256e.b() == 0) {
            return this.f24255d;
        }
        e eVar = new e(this.f24255d);
        for (f.a aVar : this.f24256e.a()) {
            e.a aVarB = eVar.b(aVar.a());
            if (aVarB != null) {
                aVarB.c(d10, aVar);
            }
        }
        return eVar;
    }

    public d b(String str, Object obj) {
        e eVar = new e(this.f24255d);
        if (obj instanceof double[]) {
            eVar.c(str, ((double[]) obj).clone());
        } else if (obj instanceof Double) {
            eVar.c(str, new double[]{((Double) obj).doubleValue()});
        } else {
            eVar.c(str, obj);
        }
        return v(eVar);
    }

    @Override // yj.g0
    public /* synthetic */ double e(g0 g0Var) {
        return f0.a(this, g0Var);
    }

    @Override // yj.g0
    public yj.b getDate() {
        return this.f24252a.getDate();
    }

    public e i() {
        return this.f24255d;
    }

    public r0 j() {
        if (p()) {
            return this.f24252a.I();
        }
        throw null;
    }

    public double k() {
        return this.f24254c;
    }

    public l l() {
        l lVar = this.f24252a;
        if (lVar != null) {
            return lVar;
        }
        throw new hj.d(hj.f.UNDEFINED_ORBIT, new Object[0]);
    }

    public k1 m(r0 r0Var) {
        if (p()) {
            return this.f24252a.U(r0Var);
        }
        throw null;
    }

    public xi.f o() {
        if (p()) {
            return this.f24252a.V();
        }
        throw null;
    }

    public boolean p() {
        return this.f24252a != null;
    }

    public String toString() {
        return "SpacecraftState{orbit=" + this.f24252a + ", attitude=" + this.f24253b + ", mass=" + this.f24254c + ", additional=" + this.f24255d + ", additionalDot=" + this.f24256e + '}';
    }

    @Override // yj.e0
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public d a(double d10) {
        if (p()) {
            return new d(this.f24252a.d0(d10), null, this.f24253b.a(d10), this.f24254c, t(d10), new f(this.f24256e), false);
        }
        throw null;
    }

    public d v(e eVar) {
        return new d(this.f24252a, null, this.f24253b, this.f24254c, eVar, this.f24256e, false);
    }

    public d w(double d10) {
        return new d(this.f24252a, null, this.f24253b, d10, this.f24255d, this.f24256e, false);
    }

    public d(l lVar, dj.a aVar, double d10, e eVar, f fVar) {
        this(lVar, null, aVar, d10, eVar, fVar, true);
        c(lVar, aVar);
    }

    private d(l lVar, zj.a aVar, dj.a aVar2, double d10, e eVar, f fVar, boolean z10) {
        this.f24252a = lVar;
        this.f24253b = aVar2;
        this.f24254c = d10;
        if (z10) {
            this.f24255d = eVar == null ? new e() : new e(eVar);
            this.f24256e = fVar == null ? new f() : new f(fVar);
        } else {
            this.f24255d = eVar == null ? new e() : eVar;
            this.f24256e = fVar == null ? new f() : fVar;
        }
    }
}
