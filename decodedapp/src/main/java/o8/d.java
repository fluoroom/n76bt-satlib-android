package o8;

import android.location.Location;

/* JADX INFO: loaded from: classes.dex */
public interface d {

    public interface a {
        void onLocationChanged(Location location);
    }

    void a(a aVar);

    void deactivate();
}
