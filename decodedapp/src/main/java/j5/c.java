package j5;

import android.location.Location;
import kj.g0;
import kj.r0;
import kj.t0;
import kj.x1;
import zj.s;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a */
    public static final c f18427a = new c();

    /* JADX INFO: renamed from: b */
    private static final dd.j f18428b = dd.k.b(new qd.a() { // from class: j5.a
        @Override // qd.a
        public final Object a() {
            return c.d();
        }
    });

    /* JADX INFO: renamed from: c */
    private static final dd.j f18429c = dd.k.b(new qd.a() { // from class: j5.b
        @Override // qd.a
        public final Object a() {
            return c.c();
        }
    });

    private c() {
    }

    public static final nj.b c() {
        return nj.b.f(f18427a.f());
    }

    public static final g0 d() {
        return t0.b(s.f33454c, true);
    }

    public final nj.b e() {
        Object value = f18429c.getValue();
        rd.m.d(value, "getValue(...)");
        return (nj.b) value;
    }

    public final r0 f() {
        Object value = f18428b.getValue();
        rd.m.d(value, "getValue(...)");
        return (r0) value;
    }

    public final boolean g(String str, String str2) {
        rd.m.e(str, "line1");
        rd.m.e(str2, "line2");
        try {
            return rj.e.L(str, str2);
        } catch (hj.a unused) {
            return false;
        }
    }

    public final x1 h(Location location) {
        rd.m.e(location, "loc");
        return new x1(e(), new ej.f(d.e(location.getLatitude()), d.e(location.getLongitude()), location.getAltitude()), "HT");
    }
}
