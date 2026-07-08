package sg;

import rd.m;

/* JADX INFO: loaded from: classes3.dex */
public abstract class c {
    /* JADX INFO: Access modifiers changed from: private */
    public static final long b(long j10) {
        return a.a((j10 << 1) + 1);
    }

    private static final long c(long j10) {
        return a.a(j10 << 1);
    }

    public static final long d(int i10, d dVar) {
        m.e(dVar, "unit");
        return dVar.compareTo(d.f27367e) <= 0 ? c(e.b(i10, dVar, d.f27364b)) : e(i10, dVar);
    }

    public static final long e(long j10, d dVar) {
        m.e(dVar, "unit");
        d dVar2 = d.f27364b;
        long jB = e.b(4611686018426999999L, dVar2, dVar);
        return ((-jB) > j10 || j10 > jB) ? b(xd.d.f(e.a(j10, dVar, d.f27366d), -4611686018427387903L, 4611686018427387903L)) : c(e.b(j10, dVar, dVar2));
    }
}
