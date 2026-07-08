package q8;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;

/* JADX INFO: loaded from: classes.dex */
public final class j0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iZ = w7.b.z(parcel);
        IBinder iBinderR = null;
        LatLng latLng = null;
        LatLngBounds latLngBounds = null;
        float fO = 0.0f;
        float fO2 = 0.0f;
        float fO3 = 0.0f;
        float fO4 = 0.0f;
        boolean zL = false;
        float fO5 = 0.0f;
        float fO6 = 0.0f;
        float fO7 = 0.0f;
        boolean zL2 = false;
        while (parcel.dataPosition() < iZ) {
            int iQ = w7.b.q(parcel);
            switch (w7.b.k(iQ)) {
                case 2:
                    iBinderR = w7.b.r(parcel, iQ);
                    break;
                case 3:
                    latLng = (LatLng) w7.b.d(parcel, iQ, LatLng.CREATOR);
                    break;
                case 4:
                    fO = w7.b.o(parcel, iQ);
                    break;
                case 5:
                    fO2 = w7.b.o(parcel, iQ);
                    break;
                case 6:
                    latLngBounds = (LatLngBounds) w7.b.d(parcel, iQ, LatLngBounds.CREATOR);
                    break;
                case 7:
                    fO3 = w7.b.o(parcel, iQ);
                    break;
                case 8:
                    fO4 = w7.b.o(parcel, iQ);
                    break;
                case 9:
                    zL = w7.b.l(parcel, iQ);
                    break;
                case 10:
                    fO5 = w7.b.o(parcel, iQ);
                    break;
                case 11:
                    fO6 = w7.b.o(parcel, iQ);
                    break;
                case 12:
                    fO7 = w7.b.o(parcel, iQ);
                    break;
                case 13:
                    zL2 = w7.b.l(parcel, iQ);
                    break;
                default:
                    w7.b.y(parcel, iQ);
                    break;
            }
        }
        w7.b.j(parcel, iZ);
        return new h(iBinderR, latLng, fO, fO2, latLngBounds, fO3, fO4, zL, fO5, fO6, fO7, zL2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new h[i10];
    }
}
