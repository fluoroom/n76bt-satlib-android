package q8;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;

/* JADX INFO: loaded from: classes.dex */
public final class a0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iZ = w7.b.z(parcel);
        float fO = 0.0f;
        LatLng latLng = null;
        float fO2 = 0.0f;
        float fO3 = 0.0f;
        while (parcel.dataPosition() < iZ) {
            int iQ = w7.b.q(parcel);
            int iK = w7.b.k(iQ);
            if (iK == 2) {
                latLng = (LatLng) w7.b.d(parcel, iQ, LatLng.CREATOR);
            } else if (iK == 3) {
                fO = w7.b.o(parcel, iQ);
            } else if (iK == 4) {
                fO2 = w7.b.o(parcel, iQ);
            } else if (iK != 5) {
                w7.b.y(parcel, iQ);
            } else {
                fO3 = w7.b.o(parcel, iQ);
            }
        }
        w7.b.j(parcel, iZ);
        return new CameraPosition(latLng, fO, fO2, fO3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new CameraPosition[i10];
    }
}
