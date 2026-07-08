package androidx.appcompat.app;

import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.util.Log;
import java.util.Calendar;

/* JADX INFO: loaded from: classes.dex */
class x {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static x f982d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f983a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final LocationManager f984b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a f985c = new a();

    private static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        boolean f986a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        long f987b;

        a() {
        }
    }

    x(Context context, LocationManager locationManager) {
        this.f983a = context;
        this.f984b = locationManager;
    }

    static x a(Context context) {
        if (f982d == null) {
            Context applicationContext = context.getApplicationContext();
            f982d = new x(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
        }
        return f982d;
    }

    private Location b() {
        Location locationC = b0.g.b(this.f983a, "android.permission.ACCESS_COARSE_LOCATION") == 0 ? c("network") : null;
        Location locationC2 = b0.g.b(this.f983a, "android.permission.ACCESS_FINE_LOCATION") == 0 ? c("gps") : null;
        return (locationC2 == null || locationC == null) ? locationC2 != null ? locationC2 : locationC : locationC2.getTime() > locationC.getTime() ? locationC2 : locationC;
    }

    private Location c(String str) {
        try {
            if (this.f984b.isProviderEnabled(str)) {
                return this.f984b.getLastKnownLocation(str);
            }
            return null;
        } catch (Exception e10) {
            Log.d("TwilightManager", "Failed to get last known location", e10);
            return null;
        }
    }

    private boolean e() {
        return this.f985c.f987b > System.currentTimeMillis();
    }

    private void f(Location location) {
        long j10;
        a aVar = this.f985c;
        long jCurrentTimeMillis = System.currentTimeMillis();
        w wVarB = w.b();
        wVarB.a(jCurrentTimeMillis - 86400000, location.getLatitude(), location.getLongitude());
        wVarB.a(jCurrentTimeMillis, location.getLatitude(), location.getLongitude());
        boolean z10 = wVarB.f981c == 1;
        long j11 = wVarB.f980b;
        long j12 = wVarB.f979a;
        wVarB.a(jCurrentTimeMillis + 86400000, location.getLatitude(), location.getLongitude());
        long j13 = wVarB.f980b;
        if (j11 == -1 || j12 == -1) {
            j10 = jCurrentTimeMillis + 43200000;
        } else {
            if (jCurrentTimeMillis > j12) {
                j11 = j13;
            } else if (jCurrentTimeMillis > j11) {
                j11 = j12;
            }
            j10 = j11 + 60000;
        }
        aVar.f986a = z10;
        aVar.f987b = j10;
    }

    boolean d() {
        a aVar = this.f985c;
        if (e()) {
            return aVar.f986a;
        }
        Location locationB = b();
        if (locationB != null) {
            f(locationB);
            return aVar.f986a;
        }
        Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
        int i10 = Calendar.getInstance().get(11);
        return i10 < 6 || i10 >= 22;
    }
}
