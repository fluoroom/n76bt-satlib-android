package p8;

import android.os.IBinder;
import android.os.Parcel;
import c8.b;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;

/* JADX INFO: loaded from: classes.dex */
public final class t extends l8.a implements a {
    t(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
    }

    @Override // p8.a
    public final c8.b B(LatLngBounds latLngBounds, int i10) {
        Parcel parcelQ = q();
        l8.r.c(parcelQ, latLngBounds);
        parcelQ.writeInt(i10);
        Parcel parcelJ = j(10, parcelQ);
        c8.b bVarQ = b.a.q(parcelJ.readStrongBinder());
        parcelJ.recycle();
        return bVarQ;
    }

    @Override // p8.a
    public final c8.b T0(CameraPosition cameraPosition) {
        Parcel parcelQ = q();
        l8.r.c(parcelQ, cameraPosition);
        Parcel parcelJ = j(7, parcelQ);
        c8.b bVarQ = b.a.q(parcelJ.readStrongBinder());
        parcelJ.recycle();
        return bVarQ;
    }

    @Override // p8.a
    public final c8.b Z(LatLng latLng) {
        Parcel parcelQ = q();
        l8.r.c(parcelQ, latLng);
        Parcel parcelJ = j(8, parcelQ);
        c8.b bVarQ = b.a.q(parcelJ.readStrongBinder());
        parcelJ.recycle();
        return bVarQ;
    }

    @Override // p8.a
    public final c8.b j1(LatLng latLng, float f10) {
        Parcel parcelQ = q();
        l8.r.c(parcelQ, latLng);
        parcelQ.writeFloat(f10);
        Parcel parcelJ = j(9, parcelQ);
        c8.b bVarQ = b.a.q(parcelJ.readStrongBinder());
        parcelJ.recycle();
        return bVarQ;
    }
}
