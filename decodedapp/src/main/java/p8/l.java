package p8;

import android.location.Location;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class l extends l8.a implements m {
    l(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.internal.IOnLocationChangeListener");
    }

    @Override // p8.m
    public final void E(Location location) {
        Parcel parcelQ = q();
        l8.r.c(parcelQ, location);
        x(2, parcelQ);
    }
}
