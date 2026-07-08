package z4;

import android.content.Context;
import android.location.Location;
import com.dw.ht.Main;
import com.dw.ht.map.ui.GMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import s4.s0;
import s4.v0;

/* JADX INFO: loaded from: classes.dex */
public class m {

    /* JADX INFO: renamed from: a */
    private static volatile m f32951a;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f32952a;

        static {
            int[] iArr = new int[j.values().length];
            f32952a = iArr;
            try {
                iArr[j.f32942f.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f32952a[j.f32941e.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    private m(Context context) {
        context.getApplicationContext();
    }

    public static m b() {
        return c(Main.f5555g);
    }

    public static m c(Context context) {
        if (f32951a == null) {
            if (context == null) {
                return null;
            }
            synchronized (m.class) {
                try {
                    if (f32951a == null) {
                        f32951a = new m(context);
                    }
                } finally {
                }
            }
        }
        return f32951a;
    }

    public static androidx.fragment.app.o d() {
        return new GMapFragment();
    }

    public static Class e() {
        return s0.class;
    }

    public static Class f() {
        return com.dw.ht.map.ui.b.class;
    }

    public static androidx.fragment.app.o g() {
        return new v0();
    }

    public static boolean l(j jVar) {
        int i10 = a.f32952a[jVar.ordinal()];
        return i10 == 1 || i10 == 2;
    }

    public static LatLng o(Location location) {
        return new LatLng(location.getLatitude(), location.getLongitude());
    }

    public LatLng h(LatLng latLng) {
        LatLng latLngA = a(new LatLng(latLng.f7320a, latLng.f7321b));
        return new LatLng((latLng.f7320a * 2.0d) - latLngA.f7320a, (latLng.f7321b * 2.0d) - latLngA.f7321b);
    }

    public LatLng i(Location location) {
        return new LatLng(location.getLatitude(), location.getLongitude());
    }

    public Location m(LatLng latLng) {
        LatLng latLngA = a(latLng);
        Location location = new Location("amap");
        location.setLatitude((latLng.f7320a * 2.0d) - latLngA.f7320a);
        location.setLongitude((latLng.f7321b * 2.0d) - latLngA.f7321b);
        return location;
    }

    public LatLngBounds n(LatLngBounds latLngBounds) {
        Location locationM = m(latLngBounds.f7322a);
        Location locationM2 = m(latLngBounds.f7323b);
        return new LatLngBounds(new LatLng(locationM.getLatitude(), locationM.getLongitude()), new LatLng(locationM2.getLatitude(), locationM2.getLongitude()));
    }

    public LatLngBounds p(LatLngBounds latLngBounds) {
        return n(latLngBounds);
    }

    public static void k(Context context) {
    }

    public LatLng a(LatLng latLng) {
        return latLng;
    }

    public LatLng j(LatLng latLng) {
        return latLng;
    }
}
