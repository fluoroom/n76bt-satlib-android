package r5;

import android.location.Location;
import android.location.LocationListener;

/* JADX INFO: loaded from: classes.dex */
public interface c extends LocationListener {
    void a(Location location, Location location2);

    @Override // android.location.LocationListener
    void onLocationChanged(Location location);
}
