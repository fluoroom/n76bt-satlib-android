package ma;

import com.google.android.gms.maps.model.LatLng;

/* JADX INFO: loaded from: classes3.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final double f21956a;

    public b(double d10) {
        this.f21956a = d10;
    }

    public LatLng a(la.b bVar) {
        double d10 = bVar.f20529a;
        double d11 = this.f21956a;
        return new LatLng(90.0d - Math.toDegrees(Math.atan(Math.exp(((-(0.5d - (bVar.f20530b / d11))) * 2.0d) * 3.141592653589793d)) * 2.0d), ((d10 / d11) - 0.5d) * 360.0d);
    }

    public a b(LatLng latLng) {
        double d10 = (latLng.f7321b / 360.0d) + 0.5d;
        double dSin = Math.sin(Math.toRadians(latLng.f7320a));
        double dLog = ((Math.log((dSin + 1.0d) / (1.0d - dSin)) * 0.5d) / (-6.283185307179586d)) + 0.5d;
        double d11 = this.f21956a;
        return new a(d10 * d11, dLog * d11);
    }
}
