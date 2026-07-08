package q8;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;

/* JADX INFO: loaded from: classes.dex */
public final class h0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iZ = w7.b.z(parcel);
        LatLng latLng = null;
        LatLng latLng2 = null;
        LatLng latLng3 = null;
        LatLng latLng4 = null;
        LatLngBounds latLngBounds = null;
        while (parcel.dataPosition() < iZ) {
            int iQ = w7.b.q(parcel);
            int iK = w7.b.k(iQ);
            if (iK == 2) {
                latLng = (LatLng) w7.b.d(parcel, iQ, LatLng.CREATOR);
            } else if (iK == 3) {
                latLng2 = (LatLng) w7.b.d(parcel, iQ, LatLng.CREATOR);
            } else if (iK == 4) {
                latLng3 = (LatLng) w7.b.d(parcel, iQ, LatLng.CREATOR);
            } else if (iK == 5) {
                latLng4 = (LatLng) w7.b.d(parcel, iQ, LatLng.CREATOR);
            } else if (iK != 6) {
                w7.b.y(parcel, iQ);
            } else {
                latLngBounds = (LatLngBounds) w7.b.d(parcel, iQ, LatLngBounds.CREATOR);
            }
        }
        w7.b.j(parcel, iZ);
        return new z(latLng, latLng2, latLng3, latLng4, latLngBounds);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new z[i10];
    }
}
