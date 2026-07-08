package p8;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.maps.model.LatLng;

/* JADX INFO: loaded from: classes.dex */
public final class y extends l8.a implements e {
    y(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.internal.IProjectionDelegate");
    }

    @Override // p8.e
    public final LatLng T(c8.b bVar) {
        Parcel parcelQ = q();
        l8.r.e(parcelQ, bVar);
        Parcel parcelJ = j(1, parcelQ);
        LatLng latLng = (LatLng) l8.r.a(parcelJ, LatLng.CREATOR);
        parcelJ.recycle();
        return latLng;
    }

    @Override // p8.e
    public final q8.z l() {
        Parcel parcelJ = j(3, q());
        q8.z zVar = (q8.z) l8.r.a(parcelJ, q8.z.CREATOR);
        parcelJ.recycle();
        return zVar;
    }
}
