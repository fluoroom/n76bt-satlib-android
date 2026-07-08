package z4;

import android.location.Location;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static final LatLng a(Location location) {
        rd.m.e(location, "<this>");
        return new LatLng(location.getLatitude(), location.getLongitude());
    }

    public static final LatLng b(LatLngBounds latLngBounds) {
        rd.m.e(latLngBounds, "<this>");
        return new LatLng(latLngBounds.f7323b.f7320a, latLngBounds.f7322a.f7321b);
    }

    public static final LatLng c(LatLngBounds latLngBounds) {
        rd.m.e(latLngBounds, "<this>");
        return new LatLng(latLngBounds.f7322a.f7320a, latLngBounds.f7323b.f7321b);
    }

    public static final LatLngBounds d(LatLngBounds latLngBounds) {
        rd.m.e(latLngBounds, "<this>");
        LatLng latLng = latLngBounds.f7323b;
        double d10 = latLng.f7321b;
        LatLng latLng2 = latLngBounds.f7322a;
        double d11 = d10 - latLng2.f7321b;
        if (d11 < 0.0d) {
            d11 += (double) 360;
        }
        double d12 = latLng.f7320a - latLng2.f7320a;
        if (d11 > d12) {
            LatLng latLng3 = latLngBounds.f7322a;
            double d13 = (d11 - d12) / ((double) 2);
            LatLng latLng4 = new LatLng(latLng3.f7320a, latLng3.f7321b + d13);
            LatLng latLng5 = latLngBounds.f7323b;
            return new LatLngBounds(latLng4, new LatLng(latLng5.f7320a, latLng5.f7321b - d13));
        }
        LatLng latLng6 = latLngBounds.f7322a;
        double d14 = (d12 - d11) / ((double) 2);
        LatLng latLng7 = new LatLng(latLng6.f7320a + d14, latLng6.f7321b);
        LatLng latLng8 = latLngBounds.f7323b;
        return new LatLngBounds(latLng7, new LatLng(latLng8.f7320a - d14, latLng8.f7321b));
    }
}
