package aj;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public abstract class j {

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final double f677a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final double f678b;

        public double a() {
            return this.f678b;
        }

        public double b() {
            return this.f677a;
        }

        private b(double d10, double d11) {
            this.f677a = d10;
            this.f678b = d11;
        }
    }

    public static void a(int i10, int i11) {
        if (i10 != i11) {
            throw new ui.e(ui.d.DIMENSIONS_MISMATCH, Integer.valueOf(i10), Integer.valueOf(i11));
        }
    }

    public static void b(Object obj) {
        if (obj == null) {
            throw new ui.h(ui.d.NULL_NOT_ALLOWED, new Object[0]);
        }
    }

    public static void c(Object obj, ui.c cVar, Object... objArr) {
        if (obj == null) {
            throw new ui.h(cVar, objArr);
        }
    }

    public static int d(double d10) {
        return o4.c.a(d10);
    }

    public static int e(double[] dArr) {
        return Arrays.hashCode(dArr);
    }

    public static double f(double d10, double d11) {
        return d10 - (d.u(((3.141592653589793d + d10) - d11) / 6.283185307179586d) * 6.283185307179586d);
    }

    public static pi.b g(pi.b bVar, pi.b bVar2) {
        return (pi.b) bVar.O((pi.b) d.v((pi.b) ((pi.b) ((pi.b) bVar.add(3.141592653589793d)).O(bVar2)).x(6.283185307179586d)).K(6.283185307179586d));
    }

    public static b h(double d10, double d11) {
        double d12 = d10 + d11;
        double d13 = d12 - d11;
        return new b(d12, (d10 - d13) + (d11 - (d12 - d13)));
    }
}
